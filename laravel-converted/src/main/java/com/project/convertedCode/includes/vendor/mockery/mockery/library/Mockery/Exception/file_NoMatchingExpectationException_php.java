package com.project.convertedCode.includes.vendor.mockery.mockery.library.Mockery.Exception;

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

 vendor/mockery/mockery/library/Mockery/Exception/NoMatchingExpectationException.php

*/

public class file_NoMatchingExpectationException_php implements RuntimeIncludable {

    public static final file_NoMatchingExpectationException_php instance =
            new file_NoMatchingExpectationException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1761 scope = new Scope1761();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1761 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named NoMatchingExpectationException was here in the source code
        env.addManualClassLoad("Mockery\\Exception\\NoMatchingExpectationException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/mockery/mockery/library/Mockery/Exception")
                    .setFile(
                            "/vendor/mockery/mockery/library/Mockery/Exception/NoMatchingExpectationException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1761 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
