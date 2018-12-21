package com.project.convertedCode.includes.vendor.phpunit.phpunit.src.Framework.MockObject.Matcher;

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

 vendor/phpunit/phpunit/src/Framework/MockObject/Matcher/InvokedAtLeastOnce.php

*/

public class file_InvokedAtLeastOnce_php implements RuntimeIncludable {

    public static final file_InvokedAtLeastOnce_php instance = new file_InvokedAtLeastOnce_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2622 scope = new Scope2622();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2622 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named InvokedAtLeastOnce was here in the source code
        env.addManualClassLoad("PHPUnit\\Framework\\MockObject\\Matcher\\InvokedAtLeastOnce");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit/src/Framework/MockObject/Matcher")
                    .setFile(
                            "/vendor/phpunit/phpunit/src/Framework/MockObject/Matcher/InvokedAtLeastOnce.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2622 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
