package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Contracts.Bus;

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

 vendor/laravel/framework/src/Illuminate/Contracts/Bus/QueueingDispatcher.php

*/

public class file_QueueingDispatcher_php implements RuntimeIncludable {

    public static final file_QueueingDispatcher_php instance = new file_QueueingDispatcher_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope999 scope = new Scope999();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope999 scope)
            throws IncludeEventException {

        // Conversion Note: class named QueueingDispatcher was here in the source code
        env.addManualClassLoad("Illuminate\\Contracts\\Bus\\QueueingDispatcher");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Contracts/Bus")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Contracts/Bus/QueueingDispatcher.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope999 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
