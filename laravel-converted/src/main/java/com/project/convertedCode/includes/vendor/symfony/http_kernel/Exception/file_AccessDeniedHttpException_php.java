package com.project.convertedCode.includes.vendor.symfony.http_kernel.Exception;

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

 vendor/symfony/http-kernel/Exception/AccessDeniedHttpException.php

*/

public class file_AccessDeniedHttpException_php implements RuntimeIncludable {

    public static final file_AccessDeniedHttpException_php instance =
            new file_AccessDeniedHttpException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3469 scope = new Scope3469();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3469 scope)
            throws IncludeEventException {

        // Conversion Note: class named AccessDeniedHttpException was here in the source code
        env.addManualClassLoad(
                "Symfony\\Component\\HttpKernel\\Exception\\AccessDeniedHttpException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/http-kernel/Exception")
                    .setFile("/vendor/symfony/http-kernel/Exception/AccessDeniedHttpException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3469 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
