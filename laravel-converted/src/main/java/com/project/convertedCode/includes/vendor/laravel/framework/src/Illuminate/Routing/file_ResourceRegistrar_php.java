package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Routing;

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

 vendor/laravel/framework/src/Illuminate/Routing/ResourceRegistrar.php

*/

public class file_ResourceRegistrar_php implements RuntimeIncludable {

    public static final file_ResourceRegistrar_php instance = new file_ResourceRegistrar_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1535 scope = new Scope1535();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1535 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named ResourceRegistrar was here in the source code
        env.addManualClassLoad("Illuminate\\Routing\\ResourceRegistrar");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Routing/ResourceRegistrar.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1535 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
