package com.project.convertedCode.includes.vendor.symfony.polyfill_ctype;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/polyfill-ctype/bootstrap.php

*/

public class file_bootstrap_php implements RuntimeIncludable {

    public static final file_bootstrap_php instance = new file_bootstrap_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3519 scope = new Scope3519();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3519 scope)
            throws IncludeEventException {
        // Namespace import was here
        if (!function_function_exists.f.env(env).call("ctype_alnum").getBool()) {
            // a function named ctype_alnum was defined here with PHP code
            env.addManualFunctionLoad("ctype_alnum");
            // a function named ctype_alpha was defined here with PHP code
            env.addManualFunctionLoad("ctype_alpha");
            // a function named ctype_cntrl was defined here with PHP code
            env.addManualFunctionLoad("ctype_cntrl");
            // a function named ctype_digit was defined here with PHP code
            env.addManualFunctionLoad("ctype_digit");
            // a function named ctype_graph was defined here with PHP code
            env.addManualFunctionLoad("ctype_graph");
            // a function named ctype_lower was defined here with PHP code
            env.addManualFunctionLoad("ctype_lower");
            // a function named ctype_print was defined here with PHP code
            env.addManualFunctionLoad("ctype_print");
            // a function named ctype_punct was defined here with PHP code
            env.addManualFunctionLoad("ctype_punct");
            // a function named ctype_space was defined here with PHP code
            env.addManualFunctionLoad("ctype_space");
            // a function named ctype_upper was defined here with PHP code
            env.addManualFunctionLoad("ctype_upper");
            // a function named ctype_xdigit was defined here with PHP code
            env.addManualFunctionLoad("ctype_xdigit");
        }
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/polyfill-ctype")
                    .setFile("/vendor/symfony/polyfill-ctype/bootstrap.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3519 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
