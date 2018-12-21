package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Database.Migrations;

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

 vendor/laravel/framework/src/Illuminate/Database/Migrations/DatabaseMigrationRepository.php

*/

public class file_DatabaseMigrationRepository_php implements RuntimeIncludable {

    public static final file_DatabaseMigrationRepository_php instance =
            new file_DatabaseMigrationRepository_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1150 scope = new Scope1150();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1150 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named DatabaseMigrationRepository was here in the source code
        env.addManualClassLoad("Illuminate\\Database\\Migrations\\DatabaseMigrationRepository");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Database/Migrations")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Database/Migrations/DatabaseMigrationRepository.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1150 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
