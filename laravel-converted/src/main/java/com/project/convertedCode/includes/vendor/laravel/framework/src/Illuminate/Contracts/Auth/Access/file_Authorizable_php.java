package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Contracts.Auth.Access;

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

 vendor/laravel/framework/src/Illuminate/Contracts/Auth/Access/Authorizable.php

*/

public class file_Authorizable_php implements RuntimeIncludable {

    public static final file_Authorizable_php instance = new file_Authorizable_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope983 scope = new Scope983();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope983 scope)
            throws IncludeEventException {

        // Conversion Note: class named Authorizable was here in the source code
        env.addManualClassLoad("Illuminate\\Contracts\\Auth\\Access\\Authorizable");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Contracts/Auth/Access")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Contracts/Auth/Access/Authorizable.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope983 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
