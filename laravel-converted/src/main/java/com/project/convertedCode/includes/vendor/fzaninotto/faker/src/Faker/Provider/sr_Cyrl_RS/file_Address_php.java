package com.project.convertedCode.includes.vendor.fzaninotto.faker.src.Faker.Provider.sr_Cyrl_RS;

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

 vendor/fzaninotto/faker/src/Faker/Provider/sr_Cyrl_RS/Address.php

*/

public class file_Address_php implements RuntimeIncludable {

    public static final file_Address_php instance = new file_Address_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope729 scope = new Scope729();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope729 scope)
            throws IncludeEventException {

        // Conversion Note: class named Address was here in the source code
        env.addManualClassLoad("Faker\\Provider\\sr_Cyrl_RS\\Address");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/fzaninotto/faker/src/Faker/Provider/sr_Cyrl_RS")
                    .setFile("/vendor/fzaninotto/faker/src/Faker/Provider/sr_Cyrl_RS/Address.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope729 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
