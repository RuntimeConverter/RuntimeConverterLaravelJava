package com.project.convertedCode.includes.vendor.symfony.http_kernel.CacheClearer;

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

 vendor/symfony/http-kernel/CacheClearer/Psr6CacheClearer.php

*/

public class file_Psr6CacheClearer_php implements RuntimeIncludable {

    public static final file_Psr6CacheClearer_php instance = new file_Psr6CacheClearer_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3389 scope = new Scope3389();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3389 scope)
            throws IncludeEventException {

        // Conversion Note: class named Psr6CacheClearer was here in the source code
        env.addManualClassLoad("Symfony\\Component\\HttpKernel\\CacheClearer\\Psr6CacheClearer");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/http-kernel/CacheClearer")
                    .setFile("/vendor/symfony/http-kernel/CacheClearer/Psr6CacheClearer.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3389 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
