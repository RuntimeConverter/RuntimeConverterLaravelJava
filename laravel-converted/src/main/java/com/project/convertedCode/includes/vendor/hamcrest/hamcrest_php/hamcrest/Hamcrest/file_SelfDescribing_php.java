package com.project.convertedCode.includes.vendor.hamcrest.hamcrest_php.hamcrest.Hamcrest;

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

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/SelfDescribing.php

*/

public class file_SelfDescribing_php implements RuntimeIncludable {

    public static final file_SelfDescribing_php instance = new file_SelfDescribing_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope840 scope = new Scope840();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope840 scope)
            throws IncludeEventException {

        // Conversion Note: class named SelfDescribing was here in the source code
        env.addManualClassLoad("Hamcrest\\SelfDescribing");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest")
                    .setFile("/vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/SelfDescribing.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope840 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
