package com.project.convertedCode.includes.vendor.symfony.css_selector.XPath.Extension;

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

 vendor/symfony/css-selector/XPath/Extension/CombinationExtension.php

*/

public class file_CombinationExtension_php implements RuntimeIncludable {

    public static final file_CombinationExtension_php instance =
            new file_CombinationExtension_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3257 scope = new Scope3257();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3257 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named CombinationExtension was here in the source code
        env.addManualClassLoad(
                "Symfony\\Component\\CssSelector\\XPath\\Extension\\CombinationExtension");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/css-selector/XPath/Extension")
                    .setFile(
                            "/vendor/symfony/css-selector/XPath/Extension/CombinationExtension.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3257 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
