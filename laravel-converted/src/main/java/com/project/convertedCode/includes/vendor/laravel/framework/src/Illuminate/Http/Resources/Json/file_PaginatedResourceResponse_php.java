package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Http.Resources.Json;

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

 vendor/laravel/framework/src/Illuminate/Http/Resources/Json/PaginatedResourceResponse.php

*/

public class file_PaginatedResourceResponse_php implements RuntimeIncludable {

    public static final file_PaginatedResourceResponse_php instance =
            new file_PaginatedResourceResponse_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1344 scope = new Scope1344();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1344 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named PaginatedResourceResponse was here in the source code
        env.addManualClassLoad("Illuminate\\Http\\Resources\\Json\\PaginatedResourceResponse");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Http/Resources/Json")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Http/Resources/Json/PaginatedResourceResponse.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1344 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
