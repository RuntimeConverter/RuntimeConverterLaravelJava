package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Contracts.Validation;

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

 vendor/laravel/framework/src/Illuminate/Contracts/Validation/ValidatesWhenResolved.php

*/

public class file_ValidatesWhenResolved_php implements RuntimeIncludable {

    public static final file_ValidatesWhenResolved_php instance =
            new file_ValidatesWhenResolved_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1066 scope = new Scope1066();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1066 scope)
            throws IncludeEventException {

        // Conversion Note: class named ValidatesWhenResolved was here in the source code
        env.addManualClassLoad("Illuminate\\Contracts\\Validation\\ValidatesWhenResolved");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Contracts/Validation")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Contracts/Validation/ValidatesWhenResolved.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1066 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
