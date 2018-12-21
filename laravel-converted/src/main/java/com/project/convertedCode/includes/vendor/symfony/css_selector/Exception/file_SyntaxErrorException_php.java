package com.project.convertedCode.includes.vendor.symfony.css_selector.Exception;

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

 vendor/symfony/css-selector/Exception/SyntaxErrorException.php

*/

public class file_SyntaxErrorException_php implements RuntimeIncludable {

    public static final file_SyntaxErrorException_php instance =
            new file_SyntaxErrorException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3223 scope = new Scope3223();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3223 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named SyntaxErrorException was here in the source code
        env.addManualClassLoad("Symfony\\Component\\CssSelector\\Exception\\SyntaxErrorException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/css-selector/Exception")
                    .setFile("/vendor/symfony/css-selector/Exception/SyntaxErrorException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3223 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
