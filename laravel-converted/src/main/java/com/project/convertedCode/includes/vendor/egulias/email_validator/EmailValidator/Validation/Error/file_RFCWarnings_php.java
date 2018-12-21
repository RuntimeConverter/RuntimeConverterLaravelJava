package com.project.convertedCode.includes.vendor.egulias.email_validator.EmailValidator.Validation.Error;

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

 vendor/egulias/email-validator/EmailValidator/Validation/Error/RFCWarnings.php

*/

public class file_RFCWarnings_php implements RuntimeIncludable {

    public static final file_RFCWarnings_php instance = new file_RFCWarnings_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope287 scope = new Scope287();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope287 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named RFCWarnings was here in the source code
        env.addManualClassLoad("Egulias\\EmailValidator\\Validation\\Error\\RFCWarnings");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/egulias/email-validator/EmailValidator/Validation/Error")
                    .setFile(
                            "/vendor/egulias/email-validator/EmailValidator/Validation/Error/RFCWarnings.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope287 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
