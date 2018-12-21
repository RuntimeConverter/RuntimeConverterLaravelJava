package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Database.Events;

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

 vendor/laravel/framework/src/Illuminate/Database/Events/ConnectionEvent.php

*/

public class file_ConnectionEvent_php implements RuntimeIncludable {

    public static final file_ConnectionEvent_php instance = new file_ConnectionEvent_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1142 scope = new Scope1142();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1142 scope)
            throws IncludeEventException {

        // Conversion Note: class named ConnectionEvent was here in the source code
        env.addManualClassLoad("Illuminate\\Database\\Events\\ConnectionEvent");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Database/Events")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Database/Events/ConnectionEvent.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1142 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
