package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Foundation.Testing.Concerns;

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

 vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns/InteractsWithConsole.php

*/

public class file_InteractsWithConsole_php implements RuntimeIncludable {

    public static final file_InteractsWithConsole_php instance =
            new file_InteractsWithConsole_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1297 scope = new Scope1297();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1297 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named InteractsWithConsole was here in the source code
        env.addManualClassLoad("Illuminate\\Foundation\\Testing\\Concerns\\InteractsWithConsole");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Concerns/InteractsWithConsole.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1297 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
