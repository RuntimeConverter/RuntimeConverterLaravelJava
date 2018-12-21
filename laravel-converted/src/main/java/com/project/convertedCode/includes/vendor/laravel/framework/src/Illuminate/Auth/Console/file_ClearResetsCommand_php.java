package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Auth.Console;

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

 vendor/laravel/framework/src/Illuminate/Auth/Console/ClearResetsCommand.php

*/

public class file_ClearResetsCommand_php implements RuntimeIncludable {

    public static final file_ClearResetsCommand_php instance = new file_ClearResetsCommand_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope882 scope = new Scope882();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope882 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named ClearResetsCommand was here in the source code
        env.addManualClassLoad("Illuminate\\Auth\\Console\\ClearResetsCommand");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Auth/Console")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Auth/Console/ClearResetsCommand.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope882 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
