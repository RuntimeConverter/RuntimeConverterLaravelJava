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

 vendor/symfony/console/Question/ChoiceQuestion.php

*/

public class file_ChoiceQuestion_php implements RuntimeIncludable {

    public static final file_ChoiceQuestion_php instance = new file_ChoiceQuestion_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3211 scope = new Scope3211();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3211 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named ChoiceQuestion was here in the source code
        env.addManualClassLoad("Symfony\\Component\\Console\\Question\\ChoiceQuestion");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/console/Question")
                    .setFile("/vendor/symfony/console/Question/ChoiceQuestion.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3211 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
