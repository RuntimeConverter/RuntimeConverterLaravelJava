package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Foundation.Auth;

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

 vendor/laravel/framework/src/Illuminate/Foundation/Auth/RedirectsUsers.php

*/

public class file_RedirectsUsers_php implements RuntimeIncludable {

    public static final file_RedirectsUsers_php instance = new file_RedirectsUsers_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1203 scope = new Scope1203();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1203 scope)
            throws IncludeEventException {

        // Conversion Note: class named RedirectsUsers was here in the source code
        env.addManualClassLoad("Illuminate\\Foundation\\Auth\\RedirectsUsers");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Auth")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Foundation/Auth/RedirectsUsers.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1203 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
