package com.project.convertedCode.includes.vendor.symfony.translation.Formatter;

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

 vendor/symfony/translation/Formatter/ChoiceMessageFormatterInterface.php

*/

public class file_ChoiceMessageFormatterInterface_php implements RuntimeIncludable {

    public static final file_ChoiceMessageFormatterInterface_php instance =
            new file_ChoiceMessageFormatterInterface_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3628 scope = new Scope3628();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3628 scope)
            throws IncludeEventException {

        // Conversion Note: class named ChoiceMessageFormatterInterface was here in the source code
        env.addManualClassLoad(
                "Symfony\\Component\\Translation\\Formatter\\ChoiceMessageFormatterInterface");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/translation/Formatter")
                    .setFile(
                            "/vendor/symfony/translation/Formatter/ChoiceMessageFormatterInterface.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3628 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
