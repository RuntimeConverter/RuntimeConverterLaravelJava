package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Console;

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

 vendor/laravel/framework/src/Illuminate/Console/DetectsApplicationNamespace.php

*/

public class file_DetectsApplicationNamespace_php implements RuntimeIncludable {

    public static final file_DetectsApplicationNamespace_php instance =
            new file_DetectsApplicationNamespace_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope961 scope = new Scope961();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope961 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named DetectsApplicationNamespace was here in the source code
        env.addManualClassLoad("Illuminate\\Console\\DetectsApplicationNamespace");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Console")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Console/DetectsApplicationNamespace.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope961 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
