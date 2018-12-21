package com.project.convertedCode.includes.vendor.mockery.mockery.library.Mockery.CountValidator;

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

 vendor/mockery/mockery/library/Mockery/CountValidator/CountValidatorAbstract.php

*/

public class file_CountValidatorAbstract_php implements RuntimeIncludable {

    public static final file_CountValidatorAbstract_php instance =
            new file_CountValidatorAbstract_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1753 scope = new Scope1753();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1753 scope)
            throws IncludeEventException {

        // Conversion Note: class named CountValidatorAbstract was here in the source code
        env.addManualClassLoad("Mockery\\CountValidator\\CountValidatorAbstract");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/mockery/mockery/library/Mockery/CountValidator")
                    .setFile(
                            "/vendor/mockery/mockery/library/Mockery/CountValidator/CountValidatorAbstract.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1753 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
