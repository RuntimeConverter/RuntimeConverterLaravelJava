package com.project.convertedCode.includes.vendor.phpunit.phpunit.src.Framework.MockObject.Invocation;

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

 vendor/phpunit/phpunit/src/Framework/MockObject/Invocation/ObjectInvocation.php

*/

public class file_ObjectInvocation_php implements RuntimeIncludable {

    public static final file_ObjectInvocation_php instance = new file_ObjectInvocation_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2610 scope = new Scope2610();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2610 scope)
            throws IncludeEventException {

        // Conversion Note: class named ObjectInvocation was here in the source code
        env.addManualClassLoad("PHPUnit\\Framework\\MockObject\\Invocation\\ObjectInvocation");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit/src/Framework/MockObject/Invocation")
                    .setFile(
                            "/vendor/phpunit/phpunit/src/Framework/MockObject/Invocation/ObjectInvocation.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2610 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
