package com.project.convertedCode.includes.vendor.symfony.polyfill_mbstring;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_define;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/polyfill-mbstring/bootstrap.php

*/

public class file_bootstrap_php implements RuntimeIncludable {

    public static final file_bootstrap_php instance = new file_bootstrap_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3523 scope = new Scope3523();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3523 scope)
            throws IncludeEventException {
        // Namespace import was here
        if (!function_function_exists.f.env(env).call("mb_strlen").getBool()) {
            function_define.f.env(env).call("MB_CASE_UPPER", 0);
            function_define.f.env(env).call("MB_CASE_LOWER", 1);
            function_define.f.env(env).call("MB_CASE_TITLE", 2);
            // a function named mb_convert_encoding was defined here with PHP code
            env.addManualFunctionLoad("mb_convert_encoding");
            // a function named mb_decode_mimeheader was defined here with PHP code
            env.addManualFunctionLoad("mb_decode_mimeheader");
            // a function named mb_encode_mimeheader was defined here with PHP code
            env.addManualFunctionLoad("mb_encode_mimeheader");
            // a function named mb_decode_numericentity was defined here with PHP code
            env.addManualFunctionLoad("mb_decode_numericentity");
            // a function named mb_encode_numericentity was defined here with PHP code
            env.addManualFunctionLoad("mb_encode_numericentity");
            // a function named mb_convert_case was defined here with PHP code
            env.addManualFunctionLoad("mb_convert_case");
            // a function named mb_internal_encoding was defined here with PHP code
            env.addManualFunctionLoad("mb_internal_encoding");
            // a function named mb_language was defined here with PHP code
            env.addManualFunctionLoad("mb_language");
            // a function named mb_list_encodings was defined here with PHP code
            env.addManualFunctionLoad("mb_list_encodings");
            // a function named mb_encoding_aliases was defined here with PHP code
            env.addManualFunctionLoad("mb_encoding_aliases");
            // a function named mb_check_encoding was defined here with PHP code
            env.addManualFunctionLoad("mb_check_encoding");
            // a function named mb_detect_encoding was defined here with PHP code
            env.addManualFunctionLoad("mb_detect_encoding");
            // a function named mb_detect_order was defined here with PHP code
            env.addManualFunctionLoad("mb_detect_order");
            // a function named mb_parse_str was defined here with PHP code
            env.addManualFunctionLoad("mb_parse_str");
            // a function named mb_strlen was defined here with PHP code
            env.addManualFunctionLoad("mb_strlen");
            // a function named mb_strpos was defined here with PHP code
            env.addManualFunctionLoad("mb_strpos");
            // a function named mb_strtolower was defined here with PHP code
            env.addManualFunctionLoad("mb_strtolower");
            // a function named mb_strtoupper was defined here with PHP code
            env.addManualFunctionLoad("mb_strtoupper");
            // a function named mb_substitute_character was defined here with PHP code
            env.addManualFunctionLoad("mb_substitute_character");
            // a function named mb_substr was defined here with PHP code
            env.addManualFunctionLoad("mb_substr");
            // a function named mb_stripos was defined here with PHP code
            env.addManualFunctionLoad("mb_stripos");
            // a function named mb_stristr was defined here with PHP code
            env.addManualFunctionLoad("mb_stristr");
            // a function named mb_strrchr was defined here with PHP code
            env.addManualFunctionLoad("mb_strrchr");
            // a function named mb_strrichr was defined here with PHP code
            env.addManualFunctionLoad("mb_strrichr");
            // a function named mb_strripos was defined here with PHP code
            env.addManualFunctionLoad("mb_strripos");
            // a function named mb_strrpos was defined here with PHP code
            env.addManualFunctionLoad("mb_strrpos");
            // a function named mb_strstr was defined here with PHP code
            env.addManualFunctionLoad("mb_strstr");
            // a function named mb_get_info was defined here with PHP code
            env.addManualFunctionLoad("mb_get_info");
            // a function named mb_http_output was defined here with PHP code
            env.addManualFunctionLoad("mb_http_output");
            // a function named mb_strwidth was defined here with PHP code
            env.addManualFunctionLoad("mb_strwidth");
            // a function named mb_substr_count was defined here with PHP code
            env.addManualFunctionLoad("mb_substr_count");
            // a function named mb_output_handler was defined here with PHP code
            env.addManualFunctionLoad("mb_output_handler");
            // a function named mb_http_input was defined here with PHP code
            env.addManualFunctionLoad("mb_http_input");
            // a function named mb_convert_variables was defined here with PHP code
            env.addManualFunctionLoad("mb_convert_variables");
        }

        if (!function_function_exists.f.env(env).call("mb_chr").getBool()) {
            // a function named mb_ord was defined here with PHP code
            env.addManualFunctionLoad("mb_ord");
            // a function named mb_chr was defined here with PHP code
            env.addManualFunctionLoad("mb_chr");
            // a function named mb_scrub was defined here with PHP code
            env.addManualFunctionLoad("mb_scrub");
        }
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/polyfill-mbstring")
                    .setFile("/vendor/symfony/polyfill-mbstring/bootstrap.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3523 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
