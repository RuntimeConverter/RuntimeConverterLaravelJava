package com.project.convertedCode.includes.vendor.symfony.http_kernel.CacheWarmer;

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

 vendor/symfony/http-kernel/CacheWarmer/CacheWarmerAggregate.php

*/

public class file_CacheWarmerAggregate_php implements RuntimeIncludable {

    public static final file_CacheWarmerAggregate_php instance =
            new file_CacheWarmerAggregate_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3391 scope = new Scope3391();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3391 scope)
            throws IncludeEventException {

        // Conversion Note: class named CacheWarmerAggregate was here in the source code
        env.addManualClassLoad("Symfony\\Component\\HttpKernel\\CacheWarmer\\CacheWarmerAggregate");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/http-kernel/CacheWarmer")
                    .setFile("/vendor/symfony/http-kernel/CacheWarmer/CacheWarmerAggregate.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3391 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
