package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Queue.Failed;

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

 vendor/laravel/framework/src/Illuminate/Queue/Failed/NullFailedJobProvider.php

*/

public class file_NullFailedJobProvider_php implements RuntimeIncludable {

    public static final file_NullFailedJobProvider_php instance =
            new file_NullFailedJobProvider_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1470 scope = new Scope1470();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1470 scope)
            throws IncludeEventException {

        // Conversion Note: class named NullFailedJobProvider was here in the source code
        env.addManualClassLoad("Illuminate\\Queue\\Failed\\NullFailedJobProvider");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Queue/Failed")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Queue/Failed/NullFailedJobProvider.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1470 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
