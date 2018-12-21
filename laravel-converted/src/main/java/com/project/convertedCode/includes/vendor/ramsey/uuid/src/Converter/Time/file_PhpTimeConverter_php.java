package com.project.convertedCode.includes.vendor.ramsey.uuid.src.Converter.Time;

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

 vendor/ramsey/uuid/src/Converter/Time/PhpTimeConverter.php

*/

public class file_PhpTimeConverter_php implements RuntimeIncludable {

    public static final file_PhpTimeConverter_php instance = new file_PhpTimeConverter_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2891 scope = new Scope2891();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2891 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named PhpTimeConverter was here in the source code
        env.addManualClassLoad("Ramsey\\Uuid\\Converter\\Time\\PhpTimeConverter");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/ramsey/uuid/src/Converter/Time")
                    .setFile("/vendor/ramsey/uuid/src/Converter/Time/PhpTimeConverter.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2891 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
