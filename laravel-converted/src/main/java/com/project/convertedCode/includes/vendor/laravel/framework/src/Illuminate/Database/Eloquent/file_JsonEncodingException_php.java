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

 vendor/laravel/framework/src/Illuminate/Database/Eloquent/JsonEncodingException.php

*/

public class file_JsonEncodingException_php implements RuntimeIncludable {

    public static final file_JsonEncodingException_php instance =
            new file_JsonEncodingException_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1117 scope = new Scope1117();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1117 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named JsonEncodingException was here in the source code
        env.addManualClassLoad("Illuminate\\Database\\Eloquent\\JsonEncodingException");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/JsonEncodingException.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1117 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
