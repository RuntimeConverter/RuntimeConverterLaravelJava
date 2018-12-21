package com.project.convertedCode.includes.vendor.symfony.http_kernel.DependencyInjection;

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

 vendor/symfony/http-kernel/DependencyInjection/MergeExtensionConfigurationPass.php

*/

public class file_MergeExtensionConfigurationPass_php implements RuntimeIncludable {

    public static final file_MergeExtensionConfigurationPass_php instance =
            new file_MergeExtensionConfigurationPass_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3437 scope = new Scope3437();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3437 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named MergeExtensionConfigurationPass was here in the source code
        env.addManualClassLoad(
                "Symfony\\Component\\HttpKernel\\DependencyInjection\\MergeExtensionConfigurationPass");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/http-kernel/DependencyInjection")
                    .setFile(
                            "/vendor/symfony/http-kernel/DependencyInjection/MergeExtensionConfigurationPass.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3437 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
