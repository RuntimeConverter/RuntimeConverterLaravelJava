package com.project.convertedCode.includes.vendor.doctrine.inflector.lib.Doctrine.Common.Inflector;

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

 vendor/doctrine/inflector/lib/Doctrine/Common/Inflector/Inflector.php

*/

public class file_Inflector_php implements RuntimeIncludable {

    public static final file_Inflector_php instance = new file_Inflector_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope239 scope = new Scope239();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope239 scope)
            throws IncludeEventException {

        // Conversion Note: class named Inflector was here in the source code
        env.addManualClassLoad("Doctrine\\Common\\Inflector\\Inflector");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/doctrine/inflector/lib/Doctrine/Common/Inflector")
                    .setFile(
                            "/vendor/doctrine/inflector/lib/Doctrine/Common/Inflector/Inflector.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope239 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
