package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Support.Debug;

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

 vendor/laravel/framework/src/Illuminate/Support/Debug/HtmlDumper.php

*/

public class file_HtmlDumper_php implements RuntimeIncludable {

    public static final file_HtmlDumper_php instance = new file_HtmlDumper_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1573 scope = new Scope1573();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1573 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named HtmlDumper was here in the source code
        env.addManualClassLoad("Illuminate\\Support\\Debug\\HtmlDumper");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Support/Debug")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Support/Debug/HtmlDumper.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1573 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
