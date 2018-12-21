package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Foundation.Console;

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

 vendor/laravel/framework/src/Illuminate/Foundation/Console/RuleMakeCommand.php

*/

public class file_RuleMakeCommand_php implements RuntimeIncludable {

    public static final file_RuleMakeCommand_php instance = new file_RuleMakeCommand_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1256 scope = new Scope1256();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1256 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named RuleMakeCommand was here in the source code
        env.addManualClassLoad("Illuminate\\Foundation\\Console\\RuleMakeCommand");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Console")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Foundation/Console/RuleMakeCommand.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1256 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
