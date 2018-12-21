package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Http.Resources;

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

 vendor/laravel/framework/src/Illuminate/Http/Resources/DelegatesToResource.php

*/

public class file_DelegatesToResource_php implements RuntimeIncludable {

    public static final file_DelegatesToResource_php instance = new file_DelegatesToResource_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1341 scope = new Scope1341();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1341 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named DelegatesToResource was here in the source code
        env.addManualClassLoad("Illuminate\\Http\\Resources\\DelegatesToResource");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Http/Resources")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Http/Resources/DelegatesToResource.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1341 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
