package com.project.convertedCode.includes.vendor.paragonie.random_compat.lib;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/paragonie/random_compat/lib/byte_safe_strings.php

*/

public class file_byte_safe_strings_php implements RuntimeIncludable {

    public static final file_byte_safe_strings_php instance = new file_byte_safe_strings_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2246 scope = new Scope2246();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2246 scope)
            throws IncludeEventException {
        if (!function_is_callable.f.env(env).call("RandomCompat_strlen").getBool()) {
            if (ZVal.toBool(function_defined.f.env(env).call("MB_OVERLOAD_STRING").value())
                    && ZVal.toBool(
                            ZVal.toLong(
                                            ZVal.toLong(
                                                    function_ini_get
                                                            .f
                                                            .env(env)
                                                            .call("mbstring.func_overload")
                                                            .value()))
                                    & ZVal.toLong(2))) {
                // a function named RandomCompat_strlen was defined here with PHP code
                env.addManualFunctionLoad("RandomCompat_strlen");

            } else {
                // a function named RandomCompat_strlen was defined here with PHP code
                env.addManualFunctionLoad("RandomCompat_strlen");
            }
        }

        if (!function_is_callable.f.env(env).call("RandomCompat_substr").getBool()) {
            if (ZVal.toBool(function_defined.f.env(env).call("MB_OVERLOAD_STRING").value())
                    && ZVal.toBool(
                            ZVal.toLong(
                                            ZVal.toLong(
                                                    function_ini_get
                                                            .f
                                                            .env(env)
                                                            .call("mbstring.func_overload")
                                                            .value()))
                                    & ZVal.toLong(2))) {
                // a function named RandomCompat_substr was defined here with PHP code
                env.addManualFunctionLoad("RandomCompat_substr");

            } else {
                // a function named RandomCompat_substr was defined here with PHP code
                env.addManualFunctionLoad("RandomCompat_substr");
            }
        }
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/paragonie/random_compat/lib")
                    .setFile("/vendor/paragonie/random_compat/lib/byte_safe_strings.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2246 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
