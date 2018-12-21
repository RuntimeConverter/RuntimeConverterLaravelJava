package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Http.Resources;

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

 vendor/laravel/framework/src/Illuminate/Http/Resources/PotentiallyMissing.php

*/

public class file_PotentiallyMissing_php implements RuntimeIncludable {

    public static final file_PotentiallyMissing_php instance = new file_PotentiallyMissing_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1350 scope = new Scope1350();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1350 scope)
            throws IncludeEventException {

        // Conversion Note: class named PotentiallyMissing was here in the source code
        env.addManualClassLoad("Illuminate\\Http\\Resources\\PotentiallyMissing");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Http/Resources")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Http/Resources/PotentiallyMissing.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1350 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
