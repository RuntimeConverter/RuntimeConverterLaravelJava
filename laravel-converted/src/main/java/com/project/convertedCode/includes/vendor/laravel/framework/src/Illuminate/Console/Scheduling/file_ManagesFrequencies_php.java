package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Console.Scheduling;

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

 vendor/laravel/framework/src/Illuminate/Console/Scheduling/ManagesFrequencies.php

*/

public class file_ManagesFrequencies_php implements RuntimeIncludable {

    public static final file_ManagesFrequencies_php instance = new file_ManagesFrequencies_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope974 scope = new Scope974();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope974 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named ManagesFrequencies was here in the source code
        env.addManualClassLoad("Illuminate\\Console\\Scheduling\\ManagesFrequencies");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Console/Scheduling")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Console/Scheduling/ManagesFrequencies.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope974 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
