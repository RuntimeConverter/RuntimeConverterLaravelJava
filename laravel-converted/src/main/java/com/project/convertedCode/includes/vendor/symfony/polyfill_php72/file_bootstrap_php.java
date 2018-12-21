package com.project.convertedCode.includes.vendor.symfony.polyfill_php72;

import com.runtimeconverter.runtime.nativeFunctions.constants.function_define;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Polyfill.namespaces.Php72.classes.Php72;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/polyfill-php72/bootstrap.php

*/

public class file_bootstrap_php implements RuntimeIncludable {

    public static final file_bootstrap_php instance = new file_bootstrap_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3525 scope = new Scope3525();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3525 scope)
            throws IncludeEventException {
        // Namespace import was here
        if (ZVal.isLessThan(70211, '<', 70200)) {
            if (ZVal.toBool(ZVal.strictEqualityCheck("\\", "===", "/"))
                    && ZVal.toBool(
                            !function_function_exists
                                    .f
                                    .env(env)
                                    .call("sapi_windows_vt100_support")
                                    .getBool())) {
                // a function named sapi_windows_vt100_support was defined here with PHP code
                env.addManualFunctionLoad("sapi_windows_vt100_support");
            }

            if (function_function_exists.functionHasBeenDefined(env, "stream_isatty")) {
                env.addManualFunctionLoad("stream_isatty");
            }
            if (!function_function_exists.f.env(env).call("utf8_encode").getBool()) {
                // a function named utf8_encode was defined here with PHP code
                env.addManualFunctionLoad("utf8_encode");
                // a function named utf8_decode was defined here with PHP code
                env.addManualFunctionLoad("utf8_decode");
            }

            if (function_function_exists.functionHasBeenDefined(env, "spl_object_id")) {
                env.addManualFunctionLoad("spl_object_id");
            }
            if (!function_defined.f.env(env).call("PHP_OS_FAMILY").getBool()) {
                function_define
                        .f
                        .env(env)
                        .call("PHP_OS_FAMILY", Php72.runtimeStaticObject.php_os_family(env));
            }
        }
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/polyfill-php72")
                    .setFile("/vendor/symfony/polyfill-php72/bootstrap.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3525 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
