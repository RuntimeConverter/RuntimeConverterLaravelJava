package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Auth.Access;

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

 vendor/laravel/framework/src/Illuminate/Auth/Access/HandlesAuthorization.php

*/

public class file_HandlesAuthorization_php implements RuntimeIncludable {

    public static final file_HandlesAuthorization_php instance =
            new file_HandlesAuthorization_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope875 scope = new Scope875();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope875 scope)
            throws IncludeEventException {

        // Conversion Note: class named HandlesAuthorization was here in the source code
        env.addManualClassLoad("Illuminate\\Auth\\Access\\HandlesAuthorization");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Auth/Access")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Auth/Access/HandlesAuthorization.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope875 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
