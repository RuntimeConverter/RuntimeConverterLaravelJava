package com.project.convertedCode.includes.vendor.symfony.routing.Generator;

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

 vendor/symfony/routing/Generator/ConfigurableRequirementsInterface.php

*/

public class file_ConfigurableRequirementsInterface_php implements RuntimeIncludable {

    public static final file_ConfigurableRequirementsInterface_php instance =
            new file_ConfigurableRequirementsInterface_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3553 scope = new Scope3553();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3553 scope)
            throws IncludeEventException {

        // Conversion Note: class named ConfigurableRequirementsInterface was here in the source
        // code
        env.addManualClassLoad(
                "Symfony\\Component\\Routing\\Generator\\ConfigurableRequirementsInterface");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/routing/Generator")
                    .setFile(
                            "/vendor/symfony/routing/Generator/ConfigurableRequirementsInterface.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3553 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
