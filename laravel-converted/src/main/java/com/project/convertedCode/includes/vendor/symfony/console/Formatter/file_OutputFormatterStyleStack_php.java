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

 vendor/symfony/console/Formatter/OutputFormatterStyleStack.php

*/

public class file_OutputFormatterStyleStack_php implements RuntimeIncludable {

    public static final file_OutputFormatterStyleStack_php instance =
            new file_OutputFormatterStyleStack_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3174 scope = new Scope3174();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3174 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named OutputFormatterStyleStack was here in the source code
        env.addManualClassLoad("Symfony\\Component\\Console\\Formatter\\OutputFormatterStyleStack");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/console/Formatter")
                    .setFile("/vendor/symfony/console/Formatter/OutputFormatterStyleStack.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3174 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
