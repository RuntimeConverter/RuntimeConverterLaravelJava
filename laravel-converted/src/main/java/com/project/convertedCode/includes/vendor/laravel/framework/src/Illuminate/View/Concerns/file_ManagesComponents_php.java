package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.View.Concerns;

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

 vendor/laravel/framework/src/Illuminate/View/Concerns/ManagesComponents.php

*/

public class file_ManagesComponents_php implements RuntimeIncludable {

    public static final file_ManagesComponents_php instance = new file_ManagesComponents_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1675 scope = new Scope1675();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1675 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named ManagesComponents was here in the source code
        env.addManualClassLoad("Illuminate\\View\\Concerns\\ManagesComponents");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/View/Concerns")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/View/Concerns/ManagesComponents.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1675 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
