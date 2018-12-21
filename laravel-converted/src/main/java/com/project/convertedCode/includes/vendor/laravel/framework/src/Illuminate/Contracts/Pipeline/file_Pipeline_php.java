package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Contracts.Pipeline;

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

 vendor/laravel/framework/src/Illuminate/Contracts/Pipeline/Pipeline.php

*/

public class file_Pipeline_php implements RuntimeIncludable {

    public static final file_Pipeline_php instance = new file_Pipeline_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1035 scope = new Scope1035();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1035 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named Pipeline was here in the source code
        env.addManualClassLoad("Illuminate\\Contracts\\Pipeline\\Pipeline");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Contracts/Pipeline")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Contracts/Pipeline/Pipeline.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1035 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
