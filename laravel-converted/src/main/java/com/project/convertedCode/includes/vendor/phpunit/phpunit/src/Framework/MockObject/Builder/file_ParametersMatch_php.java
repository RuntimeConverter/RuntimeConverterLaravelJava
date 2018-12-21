package com.project.convertedCode.includes.vendor.phpunit.phpunit.src.Framework.MockObject.Builder;

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

 vendor/phpunit/phpunit/src/Framework/MockObject/Builder/ParametersMatch.php

*/

public class file_ParametersMatch_php implements RuntimeIncludable {

    public static final file_ParametersMatch_php instance = new file_ParametersMatch_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2602 scope = new Scope2602();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2602 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named ParametersMatch was here in the source code
        env.addManualClassLoad("PHPUnit\\Framework\\MockObject\\Builder\\ParametersMatch");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit/src/Framework/MockObject/Builder")
                    .setFile(
                            "/vendor/phpunit/phpunit/src/Framework/MockObject/Builder/ParametersMatch.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2602 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
