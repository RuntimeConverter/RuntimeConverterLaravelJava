package com.project.convertedCode.includes.vendor.symfony.console.CommandLoader;

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

 vendor/symfony/console/CommandLoader/FactoryCommandLoader.php

*/

public class file_FactoryCommandLoader_php implements RuntimeIncludable {

    public static final file_FactoryCommandLoader_php instance =
            new file_FactoryCommandLoader_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3148 scope = new Scope3148();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3148 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named FactoryCommandLoader was here in the source code
        env.addManualClassLoad("Symfony\\Component\\Console\\CommandLoader\\FactoryCommandLoader");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/console/CommandLoader")
                    .setFile("/vendor/symfony/console/CommandLoader/FactoryCommandLoader.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3148 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
