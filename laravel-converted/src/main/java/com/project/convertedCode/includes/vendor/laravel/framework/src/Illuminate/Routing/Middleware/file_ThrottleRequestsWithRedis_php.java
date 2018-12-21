package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Routing.Middleware;

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

 vendor/laravel/framework/src/Illuminate/Routing/Middleware/ThrottleRequestsWithRedis.php

*/

public class file_ThrottleRequestsWithRedis_php implements RuntimeIncludable {

    public static final file_ThrottleRequestsWithRedis_php instance =
            new file_ThrottleRequestsWithRedis_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1528 scope = new Scope1528();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1528 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named ThrottleRequestsWithRedis was here in the source code
        env.addManualClassLoad("Illuminate\\Routing\\Middleware\\ThrottleRequestsWithRedis");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Routing/Middleware")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Routing/Middleware/ThrottleRequestsWithRedis.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1528 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
