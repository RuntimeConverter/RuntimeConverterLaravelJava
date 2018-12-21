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

 vendor/laravel/framework/src/Illuminate/Auth/Passwords/TokenRepositoryInterface.php

*/

public class file_TokenRepositoryInterface_php implements RuntimeIncludable {

    public static final file_TokenRepositoryInterface_php instance =
            new file_TokenRepositoryInterface_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope905 scope = new Scope905();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope905 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named TokenRepositoryInterface was here in the source code
        env.addManualClassLoad("Illuminate\\Auth\\Passwords\\TokenRepositoryInterface");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Auth/Passwords")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Auth/Passwords/TokenRepositoryInterface.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope905 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
