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

 vendor/ramsey/uuid/src/Provider/Time/SystemTimeProvider.php

*/

public class file_SystemTimeProvider_php implements RuntimeIncludable {

    public static final file_SystemTimeProvider_php instance = new file_SystemTimeProvider_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2916 scope = new Scope2916();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2916 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named SystemTimeProvider was here in the source code
        env.addManualClassLoad("Ramsey\\Uuid\\Provider\\Time\\SystemTimeProvider");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/ramsey/uuid/src/Provider/Time")
                    .setFile("/vendor/ramsey/uuid/src/Provider/Time/SystemTimeProvider.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2916 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
