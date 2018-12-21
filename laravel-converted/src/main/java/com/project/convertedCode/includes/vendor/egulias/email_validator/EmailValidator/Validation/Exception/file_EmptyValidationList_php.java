package com.project.convertedCode.includes.vendor.egulias.email_validator.EmailValidator.Validation.Exception;

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

 vendor/egulias/email-validator/EmailValidator/Validation/Exception/EmptyValidationList.php

*/

public class file_EmptyValidationList_php implements RuntimeIncludable {

    public static final file_EmptyValidationList_php instance = new file_EmptyValidationList_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope289 scope = new Scope289();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope289 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named EmptyValidationList was here in the source code
        env.addManualClassLoad(
                "Egulias\\EmailValidator\\Validation\\Exception\\EmptyValidationList");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/egulias/email-validator/EmailValidator/Validation/Exception")
                    .setFile(
                            "/vendor/egulias/email-validator/EmailValidator/Validation/Exception/EmptyValidationList.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope289 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
