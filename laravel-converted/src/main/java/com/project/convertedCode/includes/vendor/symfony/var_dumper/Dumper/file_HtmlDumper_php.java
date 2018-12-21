package com.project.convertedCode.includes.vendor.symfony.var_dumper.Dumper;

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

 vendor/symfony/var-dumper/Dumper/HtmlDumper.php

*/

public class file_HtmlDumper_php implements RuntimeIncludable {

    public static final file_HtmlDumper_php instance = new file_HtmlDumper_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3705 scope = new Scope3705();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3705 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named HtmlDumper was here in the source code
        env.addManualClassLoad("Symfony\\Component\\VarDumper\\Dumper\\HtmlDumper");
        // a function named esc was defined here with PHP code
        env.addManualFunctionLoad("Symfony\\Component\\VarDumper\\Dumper\\esc");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/var-dumper/Dumper")
                    .setFile("/vendor/symfony/var-dumper/Dumper/HtmlDumper.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3705 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
