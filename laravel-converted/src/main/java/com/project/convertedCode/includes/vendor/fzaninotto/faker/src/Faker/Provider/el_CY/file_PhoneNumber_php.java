package com.project.convertedCode.includes.vendor.fzaninotto.faker.src.Faker.Provider.el_CY;

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

 vendor/fzaninotto/faker/src/Faker/Provider/el_CY/PhoneNumber.php

*/

public class file_PhoneNumber_php implements RuntimeIncludable {

    public static final file_PhoneNumber_php instance = new file_PhoneNumber_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope459 scope = new Scope459();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope459 scope)
            throws IncludeEventException {

        // Conversion Note: class named PhoneNumber was here in the source code
        env.addManualClassLoad("Faker\\Provider\\el_CY\\PhoneNumber");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/fzaninotto/faker/src/Faker/Provider/el_CY")
                    .setFile("/vendor/fzaninotto/faker/src/Faker/Provider/el_CY/PhoneNumber.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope459 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
