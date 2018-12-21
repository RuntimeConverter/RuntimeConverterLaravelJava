package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Foundation.Bus;

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

 vendor/laravel/framework/src/Illuminate/Foundation/Bus/PendingDispatch.php

*/

public class file_PendingDispatch_php implements RuntimeIncludable {

    public static final file_PendingDispatch_php instance = new file_PendingDispatch_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1219 scope = new Scope1219();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1219 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named PendingDispatch was here in the source code
        env.addManualClassLoad("Illuminate\\Foundation\\Bus\\PendingDispatch");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Bus")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Foundation/Bus/PendingDispatch.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1219 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
