package com.project.convertedCode.includes.vendor.symfony.process.Exception;

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

 vendor/symfony/process/Exception/ProcessSignaledException.php

*/

public class file_ProcessSignaledException_php implements RuntimeIncludable {

    public static final file_ProcessSignaledException_php instance =
            new file_ProcessSignaledException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3530 scope = new Scope3530();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3530 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named ProcessSignaledException was here in the source code
        env.addManualClassLoad("Symfony\\Component\\Process\\Exception\\ProcessSignaledException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/process/Exception")
                    .setFile("/vendor/symfony/process/Exception/ProcessSignaledException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3530 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
