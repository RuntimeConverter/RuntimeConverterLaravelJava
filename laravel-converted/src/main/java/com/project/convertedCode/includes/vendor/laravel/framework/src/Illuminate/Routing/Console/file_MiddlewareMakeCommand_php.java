package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Routing.Console;

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

 vendor/laravel/framework/src/Illuminate/Routing/Console/MiddlewareMakeCommand.php

*/

public class file_MiddlewareMakeCommand_php implements RuntimeIncludable {

    public static final file_MiddlewareMakeCommand_php instance =
            new file_MiddlewareMakeCommand_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1512 scope = new Scope1512();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1512 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named MiddlewareMakeCommand was here in the source code
        env.addManualClassLoad("Illuminate\\Routing\\Console\\MiddlewareMakeCommand");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Routing/Console")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Routing/Console/MiddlewareMakeCommand.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1512 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
