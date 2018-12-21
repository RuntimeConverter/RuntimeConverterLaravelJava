package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Database.Query.Processors;

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

 vendor/laravel/framework/src/Illuminate/Database/Query/Processors/SQLiteProcessor.php

*/

public class file_SQLiteProcessor_php implements RuntimeIncludable {

    public static final file_SQLiteProcessor_php instance = new file_SQLiteProcessor_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1169 scope = new Scope1169();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1169 scope)
            throws IncludeEventException {

        // Conversion Note: class named SQLiteProcessor was here in the source code
        env.addManualClassLoad("Illuminate\\Database\\Query\\Processors\\SQLiteProcessor");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query/Processors")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Database/Query/Processors/SQLiteProcessor.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1169 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
