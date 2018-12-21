package com.project.convertedCode.includes.vendor.fzaninotto.faker.src.Faker.ORM.CakePHP;

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

 vendor/fzaninotto/faker/src/Faker/ORM/CakePHP/EntityPopulator.php

*/

public class file_EntityPopulator_php implements RuntimeIncludable {

    public static final file_EntityPopulator_php instance = new file_EntityPopulator_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope361 scope = new Scope361();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope361 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named EntityPopulator was here in the source code
        env.addManualClassLoad("Faker\\ORM\\CakePHP\\EntityPopulator");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/fzaninotto/faker/src/Faker/ORM/CakePHP")
                    .setFile("/vendor/fzaninotto/faker/src/Faker/ORM/CakePHP/EntityPopulator.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope361 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
