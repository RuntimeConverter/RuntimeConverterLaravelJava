package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Support;

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

 vendor/laravel/framework/src/Illuminate/Support/helpers.php

*/

public class file_helpers_php implements RuntimeIncludable {

    public static final file_helpers_php instance = new file_helpers_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1631 scope = new Scope1631();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1631 scope)
            throws IncludeEventException {
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        if (function_function_exists.functionHasBeenDefined(env, "append_config")) {
            env.addManualFunctionLoad("append_config");
        }
        if (function_function_exists.functionHasBeenDefined(env, "array_add")) {
            env.addManualFunctionLoad("array_add");
        }
        if (function_function_exists.functionHasBeenDefined(env, "array_collapse")) {
            env.addManualFunctionLoad("array_collapse");
        }
        if (function_function_exists.functionHasBeenDefined(env, "array_divide")) {
            env.addManualFunctionLoad("array_divide");
        }
        if (function_function_exists.functionHasBeenDefined(env, "array_dot")) {
            env.addManualFunctionLoad("array_dot");
        }
        if (function_function_exists.functionHasBeenDefined(env, "array_except")) {
            env.addManualFunctionLoad("array_except");
        }
        if (function_function_exists.functionHasBeenDefined(env, "array_first")) {
            env.addManualFunctionLoad("array_first");
        }
        if (function_function_exists.functionHasBeenDefined(env, "array_flatten")) {
            env.addManualFunctionLoad("array_flatten");
        }
        if (function_function_exists.functionHasBeenDefined(env, "array_forget")) {
            env.addManualFunctionLoad("array_forget");
        }
        if (function_function_exists.functionHasBeenDefined(env, "array_get")) {
            env.addManualFunctionLoad("array_get");
        }
        if (function_function_exists.functionHasBeenDefined(env, "array_has")) {
            env.addManualFunctionLoad("array_has");
        }
        if (function_function_exists.functionHasBeenDefined(env, "array_last")) {
            env.addManualFunctionLoad("array_last");
        }
        if (function_function_exists.functionHasBeenDefined(env, "array_only")) {
            env.addManualFunctionLoad("array_only");
        }
        if (function_function_exists.functionHasBeenDefined(env, "array_pluck")) {
            env.addManualFunctionLoad("array_pluck");
        }
        if (function_function_exists.functionHasBeenDefined(env, "array_prepend")) {
            env.addManualFunctionLoad("array_prepend");
        }
        if (function_function_exists.functionHasBeenDefined(env, "array_pull")) {
            env.addManualFunctionLoad("array_pull");
        }
        if (function_function_exists.functionHasBeenDefined(env, "array_random")) {
            env.addManualFunctionLoad("array_random");
        }
        if (function_function_exists.functionHasBeenDefined(env, "array_set")) {
            env.addManualFunctionLoad("array_set");
        }
        if (function_function_exists.functionHasBeenDefined(env, "array_sort")) {
            env.addManualFunctionLoad("array_sort");
        }
        if (function_function_exists.functionHasBeenDefined(env, "array_sort_recursive")) {
            env.addManualFunctionLoad("array_sort_recursive");
        }
        if (function_function_exists.functionHasBeenDefined(env, "array_where")) {
            env.addManualFunctionLoad("array_where");
        }
        if (function_function_exists.functionHasBeenDefined(env, "array_wrap")) {
            env.addManualFunctionLoad("array_wrap");
        }
        if (function_function_exists.functionHasBeenDefined(env, "blank")) {
            env.addManualFunctionLoad("blank");
        }
        if (function_function_exists.functionHasBeenDefined(env, "camel_case")) {
            env.addManualFunctionLoad("camel_case");
        }
        if (function_function_exists.functionHasBeenDefined(env, "class_basename")) {
            env.addManualFunctionLoad("class_basename");
        }
        if (function_function_exists.functionHasBeenDefined(env, "class_uses_recursive")) {
            env.addManualFunctionLoad("class_uses_recursive");
        }
        if (function_function_exists.functionHasBeenDefined(env, "collect")) {
            env.addManualFunctionLoad("collect");
        }
        if (function_function_exists.functionHasBeenDefined(env, "data_fill")) {
            env.addManualFunctionLoad("data_fill");
        }
        if (function_function_exists.functionHasBeenDefined(env, "data_get")) {
            env.addManualFunctionLoad("data_get");
        }
        if (function_function_exists.functionHasBeenDefined(env, "data_set")) {
            env.addManualFunctionLoad("data_set");
        }
        if (function_function_exists.functionHasBeenDefined(env, "dd")) {
            env.addManualFunctionLoad("dd");
        }
        if (function_function_exists.functionHasBeenDefined(env, "e")) {
            env.addManualFunctionLoad("e");
        }
        if (function_function_exists.functionHasBeenDefined(env, "ends_with")) {
            env.addManualFunctionLoad("ends_with");
        }
        if (function_function_exists.functionHasBeenDefined(env, "env")) {
            env.addManualFunctionLoad("env");
        }
        if (function_function_exists.functionHasBeenDefined(env, "filled")) {
            env.addManualFunctionLoad("filled");
        }
        if (function_function_exists.functionHasBeenDefined(env, "head")) {
            env.addManualFunctionLoad("head");
        }
        if (function_function_exists.functionHasBeenDefined(env, "kebab_case")) {
            env.addManualFunctionLoad("kebab_case");
        }
        if (function_function_exists.functionHasBeenDefined(env, "last")) {
            env.addManualFunctionLoad("last");
        }
        if (function_function_exists.functionHasBeenDefined(env, "object_get")) {
            env.addManualFunctionLoad("object_get");
        }
        if (function_function_exists.functionHasBeenDefined(env, "optional")) {
            env.addManualFunctionLoad("optional");
        }
        if (function_function_exists.functionHasBeenDefined(env, "preg_replace_array")) {
            env.addManualFunctionLoad("preg_replace_array");
        }
        if (function_function_exists.functionHasBeenDefined(env, "retry")) {
            env.addManualFunctionLoad("retry");
        }
        if (function_function_exists.functionHasBeenDefined(env, "snake_case")) {
            env.addManualFunctionLoad("snake_case");
        }
        if (function_function_exists.functionHasBeenDefined(env, "starts_with")) {
            env.addManualFunctionLoad("starts_with");
        }
        if (function_function_exists.functionHasBeenDefined(env, "str_after")) {
            env.addManualFunctionLoad("str_after");
        }
        if (function_function_exists.functionHasBeenDefined(env, "str_before")) {
            env.addManualFunctionLoad("str_before");
        }
        if (function_function_exists.functionHasBeenDefined(env, "str_contains")) {
            env.addManualFunctionLoad("str_contains");
        }
        if (function_function_exists.functionHasBeenDefined(env, "str_finish")) {
            env.addManualFunctionLoad("str_finish");
        }
        if (function_function_exists.functionHasBeenDefined(env, "str_is")) {
            env.addManualFunctionLoad("str_is");
        }
        if (function_function_exists.functionHasBeenDefined(env, "str_limit")) {
            env.addManualFunctionLoad("str_limit");
        }
        if (function_function_exists.functionHasBeenDefined(env, "str_plural")) {
            env.addManualFunctionLoad("str_plural");
        }
        if (function_function_exists.functionHasBeenDefined(env, "str_random")) {
            env.addManualFunctionLoad("str_random");
        }
        if (function_function_exists.functionHasBeenDefined(env, "str_replace_array")) {
            env.addManualFunctionLoad("str_replace_array");
        }
        if (function_function_exists.functionHasBeenDefined(env, "str_replace_first")) {
            env.addManualFunctionLoad("str_replace_first");
        }
        if (function_function_exists.functionHasBeenDefined(env, "str_replace_last")) {
            env.addManualFunctionLoad("str_replace_last");
        }
        if (function_function_exists.functionHasBeenDefined(env, "str_singular")) {
            env.addManualFunctionLoad("str_singular");
        }
        if (function_function_exists.functionHasBeenDefined(env, "str_slug")) {
            env.addManualFunctionLoad("str_slug");
        }
        if (function_function_exists.functionHasBeenDefined(env, "str_start")) {
            env.addManualFunctionLoad("str_start");
        }
        if (function_function_exists.functionHasBeenDefined(env, "studly_case")) {
            env.addManualFunctionLoad("studly_case");
        }
        if (function_function_exists.functionHasBeenDefined(env, "tap")) {
            env.addManualFunctionLoad("tap");
        }
        if (function_function_exists.functionHasBeenDefined(env, "throw_if")) {
            env.addManualFunctionLoad("throw_if");
        }
        if (function_function_exists.functionHasBeenDefined(env, "throw_unless")) {
            env.addManualFunctionLoad("throw_unless");
        }
        if (function_function_exists.functionHasBeenDefined(env, "title_case")) {
            env.addManualFunctionLoad("title_case");
        }
        if (function_function_exists.functionHasBeenDefined(env, "trait_uses_recursive")) {
            env.addManualFunctionLoad("trait_uses_recursive");
        }
        if (function_function_exists.functionHasBeenDefined(env, "transform")) {
            env.addManualFunctionLoad("transform");
        }
        if (function_function_exists.functionHasBeenDefined(env, "value")) {
            env.addManualFunctionLoad("value");
        }
        if (function_function_exists.functionHasBeenDefined(env, "windows_os")) {
            env.addManualFunctionLoad("windows_os");
        }
        if (function_function_exists.functionHasBeenDefined(env, "with")) {
            env.addManualFunctionLoad("with");
        }
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                    .setFile("/vendor/laravel/framework/src/Illuminate/Support/helpers.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1631 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
