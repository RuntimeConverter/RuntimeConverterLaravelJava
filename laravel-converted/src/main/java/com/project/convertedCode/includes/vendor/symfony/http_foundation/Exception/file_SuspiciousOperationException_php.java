package com.project.convertedCode.includes.vendor.symfony.http_foundation.Exception;

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

 vendor/symfony/http-foundation/Exception/SuspiciousOperationException.php

*/

public class file_SuspiciousOperationException_php implements RuntimeIncludable {

    public static final file_SuspiciousOperationException_php instance =
            new file_SuspiciousOperationException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3319 scope = new Scope3319();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3319 scope)
            throws IncludeEventException {

        // Conversion Note: class named SuspiciousOperationException was here in the source code
        env.addManualClassLoad(
                "Symfony\\Component\\HttpFoundation\\Exception\\SuspiciousOperationException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/http-foundation/Exception")
                    .setFile(
                            "/vendor/symfony/http-foundation/Exception/SuspiciousOperationException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3319 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
