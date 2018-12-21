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

 vendor/laravel/framework/src/Illuminate/Mail/resources/views/markdown/layout.blade.php

*/

public class file_layout_blade_php implements RuntimeIncludable {

    public static final file_layout_blade_php instance = new file_layout_blade_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1391 scope = new Scope1391();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1391 scope)
            throws IncludeEventException {
        env.echo(
                "{!! strip_tags($header) !!}\n\n{!! strip_tags($slot) !!}\n@isset($subcopy)\n\n{!! strip_tags($subcopy) !!}\n@endisset\n\n{!! strip_tags($footer) !!}\n");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir(
                            "/vendor/laravel/framework/src/Illuminate/Mail/resources/views/markdown")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Mail/resources/views/markdown/layout.blade.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1391 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
