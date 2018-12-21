package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Database.Eloquent;

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

 vendor/laravel/framework/src/Illuminate/Database/Eloquent/MassAssignmentException.php

*/

public class file_MassAssignmentException_php implements RuntimeIncludable {

    public static final file_MassAssignmentException_php instance =
            new file_MassAssignmentException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1118 scope = new Scope1118();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1118 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named MassAssignmentException was here in the source code
        env.addManualClassLoad("Illuminate\\Database\\Eloquent\\MassAssignmentException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/MassAssignmentException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1118 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
