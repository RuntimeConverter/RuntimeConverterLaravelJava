package com.project.convertedCode.includes.vendor.ramsey.uuid.src.Generator;

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

 vendor/ramsey/uuid/src/Generator/RandomBytesGenerator.php

*/

public class file_RandomBytesGenerator_php implements RuntimeIncludable {

    public static final file_RandomBytesGenerator_php instance =
            new file_RandomBytesGenerator_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2904 scope = new Scope2904();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2904 scope)
            throws IncludeEventException {

        // Conversion Note: class named RandomBytesGenerator was here in the source code
        env.addManualClassLoad("Ramsey\\Uuid\\Generator\\RandomBytesGenerator");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/ramsey/uuid/src/Generator")
                    .setFile("/vendor/ramsey/uuid/src/Generator/RandomBytesGenerator.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2904 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
