package com.project.convertedCode.includes.vendor.mockery.mockery.library.Mockery;

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

 vendor/mockery/mockery/library/Mockery/ExpectsHigherOrderMessage.php

*/

public class file_ExpectsHigherOrderMessage_php implements RuntimeIncludable {

    public static final file_ExpectsHigherOrderMessage_php instance =
            new file_ExpectsHigherOrderMessage_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1766 scope = new Scope1766();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1766 scope)
            throws IncludeEventException {

        // Conversion Note: class named ExpectsHigherOrderMessage was here in the source code
        env.addManualClassLoad("Mockery\\ExpectsHigherOrderMessage");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/mockery/mockery/library/Mockery")
                    .setFile(
                            "/vendor/mockery/mockery/library/Mockery/ExpectsHigherOrderMessage.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1766 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
