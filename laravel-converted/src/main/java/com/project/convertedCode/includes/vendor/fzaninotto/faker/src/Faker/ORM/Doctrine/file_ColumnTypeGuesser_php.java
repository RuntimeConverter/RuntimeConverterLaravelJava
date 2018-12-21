package com.project.convertedCode.includes.vendor.fzaninotto.faker.src.Faker.ORM.Doctrine;

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

 vendor/fzaninotto/faker/src/Faker/ORM/Doctrine/ColumnTypeGuesser.php

*/

public class file_ColumnTypeGuesser_php implements RuntimeIncludable {

    public static final file_ColumnTypeGuesser_php instance = new file_ColumnTypeGuesser_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope363 scope = new Scope363();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope363 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named ColumnTypeGuesser was here in the source code
        env.addManualClassLoad("Faker\\ORM\\Doctrine\\ColumnTypeGuesser");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/fzaninotto/faker/src/Faker/ORM/Doctrine")
                    .setFile(
                            "/vendor/fzaninotto/faker/src/Faker/ORM/Doctrine/ColumnTypeGuesser.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope363 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
