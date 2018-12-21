package com.project.convertedCode.includes.vendor.mockery.mockery.library.Mockery.Matcher;

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

 vendor/mockery/mockery/library/Mockery/Matcher/AndAnyOtherArgs.php

*/

public class file_AndAnyOtherArgs_php implements RuntimeIncludable {

    public static final file_AndAnyOtherArgs_php instance = new file_AndAnyOtherArgs_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1796 scope = new Scope1796();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1796 scope)
            throws IncludeEventException {

        // Conversion Note: class named AndAnyOtherArgs was here in the source code
        env.addManualClassLoad("Mockery\\Matcher\\AndAnyOtherArgs");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/mockery/mockery/library/Mockery/Matcher")
                    .setFile("/vendor/mockery/mockery/library/Mockery/Matcher/AndAnyOtherArgs.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1796 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
