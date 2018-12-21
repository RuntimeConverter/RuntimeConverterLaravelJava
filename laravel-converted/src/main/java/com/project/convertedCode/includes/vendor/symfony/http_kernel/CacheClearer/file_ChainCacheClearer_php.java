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

 vendor/symfony/http-kernel/CacheClearer/ChainCacheClearer.php

*/

public class file_ChainCacheClearer_php implements RuntimeIncludable {

    public static final file_ChainCacheClearer_php instance = new file_ChainCacheClearer_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3388 scope = new Scope3388();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3388 scope)
            throws IncludeEventException {

        // Conversion Note: class named ChainCacheClearer was here in the source code
        env.addManualClassLoad("Symfony\\Component\\HttpKernel\\CacheClearer\\ChainCacheClearer");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/http-kernel/CacheClearer")
                    .setFile("/vendor/symfony/http-kernel/CacheClearer/ChainCacheClearer.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3388 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
