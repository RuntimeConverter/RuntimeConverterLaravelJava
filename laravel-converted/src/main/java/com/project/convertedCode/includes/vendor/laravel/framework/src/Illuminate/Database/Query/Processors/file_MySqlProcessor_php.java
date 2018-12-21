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

 vendor/laravel/framework/src/Illuminate/Database/Query/Processors/MySqlProcessor.php

*/

public class file_MySqlProcessor_php implements RuntimeIncludable {

    public static final file_MySqlProcessor_php instance = new file_MySqlProcessor_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1166 scope = new Scope1166();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1166 scope)
            throws IncludeEventException {

        // Conversion Note: class named MySqlProcessor was here in the source code
        env.addManualClassLoad("Illuminate\\Database\\Query\\Processors\\MySqlProcessor");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query/Processors")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Database/Query/Processors/MySqlProcessor.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1166 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
