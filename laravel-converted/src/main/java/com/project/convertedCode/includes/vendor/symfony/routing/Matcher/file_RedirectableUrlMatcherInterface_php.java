package com.project.convertedCode.includes.vendor.symfony.routing.Matcher;

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

 vendor/symfony/routing/Matcher/RedirectableUrlMatcherInterface.php

*/

public class file_RedirectableUrlMatcherInterface_php implements RuntimeIncludable {

    public static final file_RedirectableUrlMatcherInterface_php instance =
            new file_RedirectableUrlMatcherInterface_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3581 scope = new Scope3581();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3581 scope)
            throws IncludeEventException {

        // Conversion Note: class named RedirectableUrlMatcherInterface was here in the source code
        env.addManualClassLoad(
                "Symfony\\Component\\Routing\\Matcher\\RedirectableUrlMatcherInterface");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/routing/Matcher")
                    .setFile("/vendor/symfony/routing/Matcher/RedirectableUrlMatcherInterface.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3581 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
