package com.project.convertedCode.includes.vendor.psr.log.Psr.Log.Test;

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

 vendor/psr/log/Psr/Log/Test/LoggerInterfaceTest.php

*/

public class file_LoggerInterfaceTest_php implements RuntimeIncludable {

    public static final file_LoggerInterfaceTest_php instance = new file_LoggerInterfaceTest_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2732 scope = new Scope2732();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2732 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named LoggerInterfaceTest was here in the source code
        env.addManualClassLoad("Psr\\Log\\Test\\LoggerInterfaceTest");
        // Conversion Note: class named DummyTest was here in the source code
        env.addManualClassLoad("Psr\\Log\\Test\\DummyTest");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/psr/log/Psr/Log/Test")
                    .setFile("/vendor/psr/log/Psr/Log/Test/LoggerInterfaceTest.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2732 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
