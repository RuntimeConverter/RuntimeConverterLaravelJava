package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Contracts.Cache;

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

 vendor/laravel/framework/src/Illuminate/Contracts/Cache/LockTimeoutException.php

*/

public class file_LockTimeoutException_php implements RuntimeIncludable {

    public static final file_LockTimeoutException_php instance =
            new file_LockTimeoutException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1003 scope = new Scope1003();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1003 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named LockTimeoutException was here in the source code
        env.addManualClassLoad("Illuminate\\Contracts\\Cache\\LockTimeoutException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Contracts/Cache")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Contracts/Cache/LockTimeoutException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1003 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
