package com.project.convertedCode.includes.vendor.mockery.mockery.library.Mockery.Matcher;

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

 vendor/mockery/mockery/library/Mockery/Matcher/PHPUnitConstraint.php

*/

public class file_PHPUnitConstraint_php implements RuntimeIncludable {

    public static final file_PHPUnitConstraint_php instance = new file_PHPUnitConstraint_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1812 scope = new Scope1812();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1812 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named PHPUnitConstraint was here in the source code
        env.addManualClassLoad("Mockery\\Matcher\\PHPUnitConstraint");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/mockery/mockery/library/Mockery/Matcher")
                    .setFile(
                            "/vendor/mockery/mockery/library/Mockery/Matcher/PHPUnitConstraint.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1812 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
