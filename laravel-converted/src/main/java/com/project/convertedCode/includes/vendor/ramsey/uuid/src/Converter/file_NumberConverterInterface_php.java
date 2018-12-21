package com.project.convertedCode.includes.vendor.ramsey.uuid.src.Converter;

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

 vendor/ramsey/uuid/src/Converter/NumberConverterInterface.php

*/

public class file_NumberConverterInterface_php implements RuntimeIncludable {

    public static final file_NumberConverterInterface_php instance =
            new file_NumberConverterInterface_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2888 scope = new Scope2888();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2888 scope)
            throws IncludeEventException {

        // Conversion Note: class named NumberConverterInterface was here in the source code
        env.addManualClassLoad("Ramsey\\Uuid\\Converter\\NumberConverterInterface");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/ramsey/uuid/src/Converter")
                    .setFile("/vendor/ramsey/uuid/src/Converter/NumberConverterInterface.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2888 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
