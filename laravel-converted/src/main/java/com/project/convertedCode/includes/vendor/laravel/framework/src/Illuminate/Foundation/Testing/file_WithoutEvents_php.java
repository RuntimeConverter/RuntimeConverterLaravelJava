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

 vendor/laravel/framework/src/Illuminate/Foundation/Testing/WithoutEvents.php

*/

public class file_WithoutEvents_php implements RuntimeIncludable {

    public static final file_WithoutEvents_php instance = new file_WithoutEvents_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1316 scope = new Scope1316();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1316 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named WithoutEvents was here in the source code
        env.addManualClassLoad("Illuminate\\Foundation\\Testing\\WithoutEvents");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Testing")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/WithoutEvents.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1316 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
