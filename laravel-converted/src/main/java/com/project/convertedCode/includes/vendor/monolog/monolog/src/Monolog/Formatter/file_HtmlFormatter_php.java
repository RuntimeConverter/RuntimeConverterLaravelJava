package com.project.convertedCode.includes.vendor.monolog.monolog.src.Monolog.Formatter;

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

 vendor/monolog/monolog/src/Monolog/Formatter/HtmlFormatter.php

*/

public class file_HtmlFormatter_php implements RuntimeIncludable {

    public static final file_HtmlFormatter_php instance = new file_HtmlFormatter_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1831 scope = new Scope1831();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1831 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named HtmlFormatter was here in the source code
        env.addManualClassLoad("Monolog\\Formatter\\HtmlFormatter");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/monolog/monolog/src/Monolog/Formatter")
                    .setFile("/vendor/monolog/monolog/src/Monolog/Formatter/HtmlFormatter.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1831 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
