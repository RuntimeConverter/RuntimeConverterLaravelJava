package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Redis.Connections;

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

 vendor/laravel/framework/src/Illuminate/Redis/Connections/PhpRedisClusterConnection.php

*/

public class file_PhpRedisClusterConnection_php implements RuntimeIncludable {

    public static final file_PhpRedisClusterConnection_php instance =
            new file_PhpRedisClusterConnection_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1499 scope = new Scope1499();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1499 scope)
            throws IncludeEventException {

        // Conversion Note: class named PhpRedisClusterConnection was here in the source code
        env.addManualClassLoad("Illuminate\\Redis\\Connections\\PhpRedisClusterConnection");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Redis/Connections")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Redis/Connections/PhpRedisClusterConnection.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1499 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
