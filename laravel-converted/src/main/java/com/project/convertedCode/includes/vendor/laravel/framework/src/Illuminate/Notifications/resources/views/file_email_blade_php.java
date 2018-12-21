package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Notifications.resources.views;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Notifications/resources/views/email.blade.php

*/

public class file_email_blade_php implements RuntimeIncludable {

    public static final file_email_blade_php instance = new file_email_blade_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1428 scope = new Scope1428();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1428 scope)
            throws IncludeEventException {
        int runtimeConverterBreakCount;
        env.echo(
                "@component('mail::message')\n{{-- Greeting --}}\n@if (! empty($greeting))\n# {{ $greeting }}\n@else\n@if ($level == 'error')\n# @lang('Whoops!')\n@else\n# @lang('Hello!')\n@endif\n@endif\n\n{{-- Intro Lines --}}\n@foreach ($introLines as $line)\n{{ $line }}\n\n@endforeach\n\n{{-- Action Button --}}\n@isset($actionText)\n");
        SwitchEnumType28 switchVariable28 =
                ZVal.getEnum(
                        scope.level,
                        SwitchEnumType28.DEFAULT_CASE,
                        SwitchEnumType28.STRING_success,
                        "success",
                        SwitchEnumType28.STRING_error,
                        "error");
        switch (switchVariable28) {
            case STRING_success:
                scope.color = "green";
                break;
            case STRING_error:
                scope.color = "red";
                break;
            case DEFAULT_CASE:
                scope.color = "blue";
        }
        ;

        env.echo(
                "@component('mail::button', ['url' => $actionUrl, 'color' => $color])\n{{ $actionText }}\n@endcomponent\n@endisset\n\n{{-- Outro Lines --}}\n@foreach ($outroLines as $line)\n{{ $line }}\n\n@endforeach\n\n{{-- Salutation --}}\n@if (! empty($salutation))\n{{ $salutation }}\n@else\n@lang('Regards'),<br>{{ config('app.name') }}\n@endif\n\n{{-- Subcopy --}}\n@isset($actionText)\n@component('mail::subcopy')\n@lang(\n    \"If you\u2019re having trouble clicking the \\\":actionText\\\" button, copy and paste the URL below\\n\".\n    'into your web browser: [:actionURL](:actionURL)',\n    [\n        'actionText' => $actionText,\n        'actionURL' => $actionUrl\n    ]\n)\n@endcomponent\n@endisset\n@endcomponent\n");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir(
                            "/vendor/laravel/framework/src/Illuminate/Notifications/resources/views")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Notifications/resources/views/email.blade.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1428 implements UpdateRuntimeScopeInterface {

        Object color;
        Object level;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("color", this.color);
            stack.setVariable("level", this.level);
        }

        public void updateScope(RuntimeStack stack) {

            this.color = stack.getVariable("color");
            this.level = stack.getVariable("level");
        }
    }

    private enum SwitchEnumType28 {
        STRING_success,
        STRING_error,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
