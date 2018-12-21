package com.project.convertedCode.includes.database.migrations;

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

 database/migrations/2014_10_12_100000_create_password_resets_table.php

*/

public class file_2014_10_12_100000_create_password_resets_table_php implements RuntimeIncludable {

    public static final file_2014_10_12_100000_create_password_resets_table_php instance =
            new file_2014_10_12_100000_create_password_resets_table_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope216 scope = new Scope216();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope216 scope)
            throws IncludeEventException {
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named CreatePasswordResetsTable was here in the source code
        env.addManualClassLoad("CreatePasswordResetsTable");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/database/migrations")
                    .setFile(
                            "/database/migrations/2014_10_12_100000_create_password_resets_table.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope216 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
