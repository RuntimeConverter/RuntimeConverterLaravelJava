package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Auth.Passwords;

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

 vendor/laravel/framework/src/Illuminate/Auth/Passwords/PasswordResetServiceProvider.php

*/

public class file_PasswordResetServiceProvider_php implements RuntimeIncludable {

    public static final file_PasswordResetServiceProvider_php instance =
            new file_PasswordResetServiceProvider_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope904 scope = new Scope904();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope904 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named PasswordResetServiceProvider was here in the source code
        env.addManualClassLoad("Illuminate\\Auth\\Passwords\\PasswordResetServiceProvider");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Auth/Passwords")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Auth/Passwords/PasswordResetServiceProvider.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope904 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
