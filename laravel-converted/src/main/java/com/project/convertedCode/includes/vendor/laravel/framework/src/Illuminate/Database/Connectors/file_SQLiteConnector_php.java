package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Database.Connectors;

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

 vendor/laravel/framework/src/Illuminate/Database/Connectors/SQLiteConnector.php

*/

public class file_SQLiteConnector_php implements RuntimeIncludable {

    public static final file_SQLiteConnector_php instance = new file_SQLiteConnector_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1087 scope = new Scope1087();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1087 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named SQLiteConnector was here in the source code
        env.addManualClassLoad("Illuminate\\Database\\Connectors\\SQLiteConnector");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Database/Connectors")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Database/Connectors/SQLiteConnector.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1087 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
