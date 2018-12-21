package com.project.convertedCode.includes.vendor.phpunit.phpunit.src.Framework.MockObject;

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

 vendor/phpunit/phpunit/src/Framework/MockObject/MockObject.php

*/

public class file_MockObject_php implements RuntimeIncludable {

    public static final file_MockObject_php instance = new file_MockObject_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2630 scope = new Scope2630();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2630 scope)
            throws IncludeEventException {
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named PHPUnit_Framework_MockObject_MockObject was here in the
        // source code
        env.addManualClassLoad("PHPUnit_Framework_MockObject_MockObject");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit/src/Framework/MockObject")
                    .setFile("/vendor/phpunit/phpunit/src/Framework/MockObject/MockObject.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2630 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
