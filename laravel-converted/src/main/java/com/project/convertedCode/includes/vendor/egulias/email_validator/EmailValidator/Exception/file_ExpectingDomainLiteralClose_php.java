package com.project.convertedCode.includes.vendor.egulias.email_validator.EmailValidator.Exception;

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

 vendor/egulias/email-validator/EmailValidator/Exception/ExpectingDomainLiteralClose.php

*/

public class file_ExpectingDomainLiteralClose_php implements RuntimeIncludable {

    public static final file_ExpectingDomainLiteralClose_php instance =
            new file_ExpectingDomainLiteralClose_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope273 scope = new Scope273();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope273 scope)
            throws IncludeEventException {

        // Conversion Note: class named ExpectingDomainLiteralClose was here in the source code
        env.addManualClassLoad("Egulias\\EmailValidator\\Exception\\ExpectingDomainLiteralClose");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/egulias/email-validator/EmailValidator/Exception")
                    .setFile(
                            "/vendor/egulias/email-validator/EmailValidator/Exception/ExpectingDomainLiteralClose.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope273 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
