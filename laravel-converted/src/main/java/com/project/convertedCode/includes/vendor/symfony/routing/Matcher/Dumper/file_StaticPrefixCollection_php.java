package com.project.convertedCode.includes.vendor.symfony.routing.Matcher.Dumper;

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

 vendor/symfony/routing/Matcher/Dumper/StaticPrefixCollection.php

*/

public class file_StaticPrefixCollection_php implements RuntimeIncludable {

    public static final file_StaticPrefixCollection_php instance =
            new file_StaticPrefixCollection_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3579 scope = new Scope3579();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3579 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named StaticPrefixCollection was here in the source code
        env.addManualClassLoad(
                "Symfony\\Component\\Routing\\Matcher\\Dumper\\StaticPrefixCollection");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/routing/Matcher/Dumper")
                    .setFile("/vendor/symfony/routing/Matcher/Dumper/StaticPrefixCollection.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3579 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
