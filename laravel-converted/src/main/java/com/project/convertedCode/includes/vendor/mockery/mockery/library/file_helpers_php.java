package com.project.convertedCode.includes.vendor.mockery.mockery.library;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/helpers.php

*/

public class file_helpers_php implements RuntimeIncludable {

    public static final file_helpers_php instance = new file_helpers_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1823 scope = new Scope1823();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1823 scope)
            throws IncludeEventException {
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        if (function_function_exists.functionHasBeenDefined(env, "mock")) {
            env.addManualFunctionLoad("mock");
        }
        if (function_function_exists.functionHasBeenDefined(env, "spy")) {
            env.addManualFunctionLoad("spy");
        }
        if (function_function_exists.functionHasBeenDefined(env, "namedMock")) {
            env.addManualFunctionLoad("namedMock");
        }
        if (function_function_exists.functionHasBeenDefined(env, "anyArgs")) {
            env.addManualFunctionLoad("anyArgs");
        }
        if (function_function_exists.functionHasBeenDefined(env, "andAnyOtherArgs")) {
            env.addManualFunctionLoad("andAnyOtherArgs");
        }
        if (function_function_exists.functionHasBeenDefined(env, "andAnyOthers")) {
            env.addManualFunctionLoad("andAnyOthers");
        }
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/mockery/mockery/library")
                    .setFile("/vendor/mockery/mockery/library/helpers.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1823 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
