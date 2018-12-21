package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.View.Compilers.Concerns;

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

 vendor/laravel/framework/src/Illuminate/View/Compilers/Concerns/CompilesComponents.php

*/

public class file_CompilesComponents_php implements RuntimeIncludable {

    public static final file_CompilesComponents_php instance = new file_CompilesComponents_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1663 scope = new Scope1663();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1663 scope)
            throws IncludeEventException {

        // Conversion Note: class named CompilesComponents was here in the source code
        env.addManualClassLoad("Illuminate\\View\\Compilers\\Concerns\\CompilesComponents");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/View/Compilers/Concerns")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/View/Compilers/Concerns/CompilesComponents.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1663 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
