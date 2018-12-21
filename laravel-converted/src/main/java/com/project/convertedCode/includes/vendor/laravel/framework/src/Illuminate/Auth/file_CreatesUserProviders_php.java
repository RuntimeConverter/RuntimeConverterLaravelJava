package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Auth;

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

 vendor/laravel/framework/src/Illuminate/Auth/CreatesUserProviders.php

*/

public class file_CreatesUserProviders_php implements RuntimeIncludable {

    public static final file_CreatesUserProviders_php instance =
            new file_CreatesUserProviders_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope883 scope = new Scope883();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope883 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named CreatesUserProviders was here in the source code
        env.addManualClassLoad("Illuminate\\Auth\\CreatesUserProviders");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Auth")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Auth/CreatesUserProviders.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope883 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
