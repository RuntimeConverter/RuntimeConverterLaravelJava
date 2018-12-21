package com.project.convertedCode.includes.vendor.symfony.routing.Exception;

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

 vendor/symfony/routing/Exception/MissingMandatoryParametersException.php

*/

public class file_MissingMandatoryParametersException_php implements RuntimeIncludable {

    public static final file_MissingMandatoryParametersException_php instance =
            new file_MissingMandatoryParametersException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3549 scope = new Scope3549();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3549 scope)
            throws IncludeEventException {

        // Conversion Note: class named MissingMandatoryParametersException was here in the source
        // code
        env.addManualClassLoad(
                "Symfony\\Component\\Routing\\Exception\\MissingMandatoryParametersException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/routing/Exception")
                    .setFile(
                            "/vendor/symfony/routing/Exception/MissingMandatoryParametersException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3549 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
