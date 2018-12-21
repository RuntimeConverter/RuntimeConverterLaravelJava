package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Foundation.Testing;

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

 vendor/laravel/framework/src/Illuminate/Foundation/Testing/RefreshDatabaseState.php

*/

public class file_RefreshDatabaseState_php implements RuntimeIncludable {

    public static final file_RefreshDatabaseState_php instance =
            new file_RefreshDatabaseState_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1312 scope = new Scope1312();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1312 scope)
            throws IncludeEventException {

        // Conversion Note: class named RefreshDatabaseState was here in the source code
        env.addManualClassLoad("Illuminate\\Foundation\\Testing\\RefreshDatabaseState");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Testing")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/RefreshDatabaseState.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1312 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
