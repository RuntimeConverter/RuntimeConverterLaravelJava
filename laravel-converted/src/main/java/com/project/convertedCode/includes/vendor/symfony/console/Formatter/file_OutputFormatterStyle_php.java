package com.project.convertedCode.includes.vendor.symfony.console.Formatter;

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

 vendor/symfony/console/Formatter/OutputFormatterStyle.php

*/

public class file_OutputFormatterStyle_php implements RuntimeIncludable {

    public static final file_OutputFormatterStyle_php instance =
            new file_OutputFormatterStyle_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3172 scope = new Scope3172();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3172 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named OutputFormatterStyle was here in the source code
        env.addManualClassLoad("Symfony\\Component\\Console\\Formatter\\OutputFormatterStyle");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/console/Formatter")
                    .setFile("/vendor/symfony/console/Formatter/OutputFormatterStyle.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3172 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
