package com.project.convertedCode.includes.vendor.symfony.console.Exception;

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

 vendor/symfony/console/Exception/NamespaceNotFoundException.php

*/

public class file_NamespaceNotFoundException_php implements RuntimeIncludable {

    public static final file_NamespaceNotFoundException_php instance =
            new file_NamespaceNotFoundException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3168 scope = new Scope3168();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3168 scope)
            throws IncludeEventException {

        // Conversion Note: class named NamespaceNotFoundException was here in the source code
        env.addManualClassLoad(
                "Symfony\\Component\\Console\\Exception\\NamespaceNotFoundException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/console/Exception")
                    .setFile("/vendor/symfony/console/Exception/NamespaceNotFoundException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3168 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
