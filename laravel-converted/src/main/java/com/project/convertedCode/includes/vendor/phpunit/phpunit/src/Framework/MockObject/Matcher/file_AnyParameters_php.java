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

 vendor/phpunit/phpunit/src/Framework/MockObject/Matcher/AnyParameters.php

*/

public class file_AnyParameters_php implements RuntimeIncludable {

    public static final file_AnyParameters_php instance = new file_AnyParameters_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2616 scope = new Scope2616();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2616 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named AnyParameters was here in the source code
        env.addManualClassLoad("PHPUnit\\Framework\\MockObject\\Matcher\\AnyParameters");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit/src/Framework/MockObject/Matcher")
                    .setFile(
                            "/vendor/phpunit/phpunit/src/Framework/MockObject/Matcher/AnyParameters.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2616 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
