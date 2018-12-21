package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Mail.resources.views.markdown;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Mail/resources/views/markdown/message.blade.php

*/

public class file_message_blade_php implements RuntimeIncludable {

    public static final file_message_blade_php instance = new file_message_blade_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1392 scope = new Scope1392();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1392 scope)
            throws IncludeEventException {
        env.echo(
                "@component('mail::layout')\n    {{-- Header --}}\n    @slot('header')\n        @component('mail::header', ['url' => config('app.url')])\n            {{ config('app.name') }}\n        @endcomponent\n    @endslot\n\n    {{-- Body --}}\n    {{ $slot }}\n\n    {{-- Subcopy --}}\n    @isset($subcopy)\n        @slot('subcopy')\n            @component('mail::subcopy')\n                {{ $subcopy }}\n            @endcomponent\n        @endslot\n    @endisset\n\n    {{-- Footer --}}\n    @slot('footer')\n        @component('mail::footer')\n            \u00A9 {{ date('Y') }} {{ config('app.name') }}. All rights reserved.\n        @endcomponent\n    @endslot\n@endcomponent\n");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir(
                            "/vendor/laravel/framework/src/Illuminate/Mail/resources/views/markdown")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Mail/resources/views/markdown/message.blade.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1392 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
