package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Broadcasting;

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

 vendor/laravel/framework/src/Illuminate/Broadcasting/BroadcastException.php

*/

public class file_BroadcastException_php implements RuntimeIncludable {

    public static final file_BroadcastException_php instance = new file_BroadcastException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope912 scope = new Scope912();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope912 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named BroadcastException was here in the source code
        env.addManualClassLoad("Illuminate\\Broadcasting\\BroadcastException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Broadcasting")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Broadcasting/BroadcastException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope912 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
