package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Queue.Events;

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

 vendor/laravel/framework/src/Illuminate/Queue/Events/JobExceptionOccurred.php

*/

public class file_JobExceptionOccurred_php implements RuntimeIncludable {

    public static final file_JobExceptionOccurred_php instance =
            new file_JobExceptionOccurred_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1462 scope = new Scope1462();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1462 scope)
            throws IncludeEventException {

        // Conversion Note: class named JobExceptionOccurred was here in the source code
        env.addManualClassLoad("Illuminate\\Queue\\Events\\JobExceptionOccurred");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Queue/Events")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Queue/Events/JobExceptionOccurred.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1462 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
