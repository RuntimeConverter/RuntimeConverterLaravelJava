package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Redis.Limiters;

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

 vendor/laravel/framework/src/Illuminate/Redis/Limiters/ConcurrencyLimiter.php

*/

public class file_ConcurrencyLimiter_php implements RuntimeIncludable {

    public static final file_ConcurrencyLimiter_php instance = new file_ConcurrencyLimiter_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1505 scope = new Scope1505();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1505 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named ConcurrencyLimiter was here in the source code
        env.addManualClassLoad("Illuminate\\Redis\\Limiters\\ConcurrencyLimiter");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Redis/Limiters")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Redis/Limiters/ConcurrencyLimiter.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1505 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
