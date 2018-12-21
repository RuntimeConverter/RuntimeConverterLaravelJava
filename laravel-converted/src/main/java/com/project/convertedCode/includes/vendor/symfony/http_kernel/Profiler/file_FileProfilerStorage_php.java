package com.project.convertedCode.includes.vendor.symfony.http_kernel.Profiler;

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

 vendor/symfony/http-kernel/Profiler/FileProfilerStorage.php

*/

public class file_FileProfilerStorage_php implements RuntimeIncludable {

    public static final file_FileProfilerStorage_php instance = new file_FileProfilerStorage_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3510 scope = new Scope3510();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3510 scope)
            throws IncludeEventException {

        // Conversion Note: class named FileProfilerStorage was here in the source code
        env.addManualClassLoad("Symfony\\Component\\HttpKernel\\Profiler\\FileProfilerStorage");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/http-kernel/Profiler")
                    .setFile("/vendor/symfony/http-kernel/Profiler/FileProfilerStorage.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3510 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
