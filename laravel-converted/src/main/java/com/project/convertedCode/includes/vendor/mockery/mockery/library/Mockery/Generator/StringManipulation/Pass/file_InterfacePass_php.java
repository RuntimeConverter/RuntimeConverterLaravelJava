package com.project.convertedCode.includes.vendor.mockery.mockery.library.Mockery.Generator.StringManipulation.Pass;

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

 vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/InterfacePass.php

*/

public class file_InterfacePass_php implements RuntimeIncludable {

    public static final file_InterfacePass_php instance = new file_InterfacePass_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1780 scope = new Scope1780();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1780 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named InterfacePass was here in the source code
        env.addManualClassLoad("Mockery\\Generator\\StringManipulation\\Pass\\InterfacePass");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir(
                            "/vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass")
                    .setFile(
                            "/vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/InterfacePass.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1780 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
