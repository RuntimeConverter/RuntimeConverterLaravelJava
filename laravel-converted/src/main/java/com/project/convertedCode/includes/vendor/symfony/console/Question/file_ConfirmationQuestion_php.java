package com.project.convertedCode.includes.vendor.symfony.console.Question;

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

 vendor/symfony/console/Question/ConfirmationQuestion.php

*/

public class file_ConfirmationQuestion_php implements RuntimeIncludable {

    public static final file_ConfirmationQuestion_php instance =
            new file_ConfirmationQuestion_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3212 scope = new Scope3212();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3212 scope)
            throws IncludeEventException {

        // Conversion Note: class named ConfirmationQuestion was here in the source code
        env.addManualClassLoad("Symfony\\Component\\Console\\Question\\ConfirmationQuestion");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/console/Question")
                    .setFile("/vendor/symfony/console/Question/ConfirmationQuestion.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3212 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
