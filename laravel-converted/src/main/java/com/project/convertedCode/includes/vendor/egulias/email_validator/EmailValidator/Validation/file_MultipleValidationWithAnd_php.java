package com.project.convertedCode.includes.vendor.egulias.email_validator.EmailValidator.Validation;

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

 vendor/egulias/email-validator/EmailValidator/Validation/MultipleValidationWithAnd.php

*/

public class file_MultipleValidationWithAnd_php implements RuntimeIncludable {

    public static final file_MultipleValidationWithAnd_php instance =
            new file_MultipleValidationWithAnd_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope291 scope = new Scope291();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope291 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named MultipleValidationWithAnd was here in the source code
        env.addManualClassLoad("Egulias\\EmailValidator\\Validation\\MultipleValidationWithAnd");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/egulias/email-validator/EmailValidator/Validation")
                    .setFile(
                            "/vendor/egulias/email-validator/EmailValidator/Validation/MultipleValidationWithAnd.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope291 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
