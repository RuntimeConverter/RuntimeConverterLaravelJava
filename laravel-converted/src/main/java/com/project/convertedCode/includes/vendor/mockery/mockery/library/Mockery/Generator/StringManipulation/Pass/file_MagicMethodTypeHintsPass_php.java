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

 vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/MagicMethodTypeHintsPass.php

*/

public class file_MagicMethodTypeHintsPass_php implements RuntimeIncludable {

    public static final file_MagicMethodTypeHintsPass_php instance =
            new file_MagicMethodTypeHintsPass_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1781 scope = new Scope1781();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1781 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named MagicMethodTypeHintsPass was here in the source code
        env.addManualClassLoad(
                "Mockery\\Generator\\StringManipulation\\Pass\\MagicMethodTypeHintsPass");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir(
                            "/vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass")
                    .setFile(
                            "/vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/MagicMethodTypeHintsPass.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1781 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
