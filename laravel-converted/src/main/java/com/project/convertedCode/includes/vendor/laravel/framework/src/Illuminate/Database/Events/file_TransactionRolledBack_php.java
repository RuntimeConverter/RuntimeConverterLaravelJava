package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Database.Events;

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

 vendor/laravel/framework/src/Illuminate/Database/Events/TransactionRolledBack.php

*/

public class file_TransactionRolledBack_php implements RuntimeIncludable {

    public static final file_TransactionRolledBack_php instance =
            new file_TransactionRolledBack_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1147 scope = new Scope1147();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1147 scope)
            throws IncludeEventException {

        // Conversion Note: class named TransactionRolledBack was here in the source code
        env.addManualClassLoad("Illuminate\\Database\\Events\\TransactionRolledBack");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Database/Events")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Database/Events/TransactionRolledBack.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1147 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
