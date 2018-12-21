package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Database.Console.Migrations;

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

 vendor/laravel/framework/src/Illuminate/Database/Console/Migrations/BaseCommand.php

*/

public class file_BaseCommand_php implements RuntimeIncludable {

    public static final file_BaseCommand_php instance = new file_BaseCommand_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1090 scope = new Scope1090();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1090 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named BaseCommand was here in the source code
        env.addManualClassLoad("Illuminate\\Database\\Console\\Migrations\\BaseCommand");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Database/Console/Migrations")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Database/Console/Migrations/BaseCommand.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1090 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
