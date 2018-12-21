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

 vendor/egulias/email-validator/EmailValidator/Warning/ObsoleteDTEXT.php

*/

public class file_ObsoleteDTEXT_php implements RuntimeIncludable {

    public static final file_ObsoleteDTEXT_php instance = new file_ObsoleteDTEXT_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope313 scope = new Scope313();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope313 scope)
            throws IncludeEventException {

        // Conversion Note: class named ObsoleteDTEXT was here in the source code
        env.addManualClassLoad("Egulias\\EmailValidator\\Warning\\ObsoleteDTEXT");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/egulias/email-validator/EmailValidator/Warning")
                    .setFile(
                            "/vendor/egulias/email-validator/EmailValidator/Warning/ObsoleteDTEXT.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope313 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
