package com.project.convertedCode.includes.vendor.fzaninotto.faker.src.Faker.Provider.pt_PT;

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

 vendor/fzaninotto/faker/src/Faker/Provider/pt_PT/Payment.php

*/

public class file_Payment_php implements RuntimeIncludable {

    public static final file_Payment_php instance = new file_Payment_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope697 scope = new Scope697();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope697 scope)
            throws IncludeEventException {

        // Conversion Note: class named Payment was here in the source code
        env.addManualClassLoad("Faker\\Provider\\pt_PT\\Payment");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/fzaninotto/faker/src/Faker/Provider/pt_PT")
                    .setFile("/vendor/fzaninotto/faker/src/Faker/Provider/pt_PT/Payment.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope697 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
