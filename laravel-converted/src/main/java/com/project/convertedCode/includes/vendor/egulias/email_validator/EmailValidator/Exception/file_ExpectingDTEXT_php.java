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

 vendor/egulias/email-validator/EmailValidator/Exception/ExpectingDTEXT.php

*/

public class file_ExpectingDTEXT_php implements RuntimeIncludable {

    public static final file_ExpectingDTEXT_php instance = new file_ExpectingDTEXT_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope272 scope = new Scope272();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope272 scope)
            throws IncludeEventException {

        // Conversion Note: class named ExpectingDTEXT was here in the source code
        env.addManualClassLoad("Egulias\\EmailValidator\\Exception\\ExpectingDTEXT");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/egulias/email-validator/EmailValidator/Exception")
                    .setFile(
                            "/vendor/egulias/email-validator/EmailValidator/Exception/ExpectingDTEXT.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope272 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
