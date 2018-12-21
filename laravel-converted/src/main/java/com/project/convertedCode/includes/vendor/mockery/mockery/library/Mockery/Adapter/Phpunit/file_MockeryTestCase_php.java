package com.project.convertedCode.includes.vendor.mockery.mockery.library.Mockery.Adapter.Phpunit;

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

 vendor/mockery/mockery/library/Mockery/Adapter/Phpunit/MockeryTestCase.php

*/

public class file_MockeryTestCase_php implements RuntimeIncludable {

    public static final file_MockeryTestCase_php instance = new file_MockeryTestCase_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1746 scope = new Scope1746();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1746 scope)
            throws IncludeEventException {

        // Conversion Note: class named MockeryTestCase was here in the source code
        env.addManualClassLoad("Mockery\\Adapter\\Phpunit\\MockeryTestCase");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/mockery/mockery/library/Mockery/Adapter/Phpunit")
                    .setFile(
                            "/vendor/mockery/mockery/library/Mockery/Adapter/Phpunit/MockeryTestCase.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1746 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
