package com.project.convertedCode.includes.vendor.egulias.email_validator.EmailValidator.Warning;

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

 vendor/egulias/email-validator/EmailValidator/Warning/AddressLiteral.php

*/

public class file_AddressLiteral_php implements RuntimeIncludable {

    public static final file_AddressLiteral_php instance = new file_AddressLiteral_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope295 scope = new Scope295();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope295 scope)
            throws IncludeEventException {

        // Conversion Note: class named AddressLiteral was here in the source code
        env.addManualClassLoad("Egulias\\EmailValidator\\Warning\\AddressLiteral");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/egulias/email-validator/EmailValidator/Warning")
                    .setFile(
                            "/vendor/egulias/email-validator/EmailValidator/Warning/AddressLiteral.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope295 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
