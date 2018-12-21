package com.project.convertedCode.includes.vendor.monolog.monolog.src.Monolog.Processor;

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

 vendor/monolog/monolog/src/Monolog/Processor/MemoryPeakUsageProcessor.php

*/

public class file_MemoryPeakUsageProcessor_php implements RuntimeIncludable {

    public static final file_MemoryPeakUsageProcessor_php instance =
            new file_MemoryPeakUsageProcessor_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1902 scope = new Scope1902();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1902 scope)
            throws IncludeEventException {

        // Conversion Note: class named MemoryPeakUsageProcessor was here in the source code
        env.addManualClassLoad("Monolog\\Processor\\MemoryPeakUsageProcessor");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/monolog/monolog/src/Monolog/Processor")
                    .setFile(
                            "/vendor/monolog/monolog/src/Monolog/Processor/MemoryPeakUsageProcessor.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1902 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
