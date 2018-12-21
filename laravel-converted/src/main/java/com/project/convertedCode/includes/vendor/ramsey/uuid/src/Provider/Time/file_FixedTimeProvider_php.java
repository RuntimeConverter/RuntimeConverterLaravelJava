package com.project.convertedCode.includes.vendor.ramsey.uuid.src.Provider.Time;

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

 vendor/ramsey/uuid/src/Provider/Time/FixedTimeProvider.php

*/

public class file_FixedTimeProvider_php implements RuntimeIncludable {

    public static final file_FixedTimeProvider_php instance = new file_FixedTimeProvider_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2915 scope = new Scope2915();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2915 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named FixedTimeProvider was here in the source code
        env.addManualClassLoad("Ramsey\\Uuid\\Provider\\Time\\FixedTimeProvider");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/ramsey/uuid/src/Provider/Time")
                    .setFile("/vendor/ramsey/uuid/src/Provider/Time/FixedTimeProvider.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2915 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
