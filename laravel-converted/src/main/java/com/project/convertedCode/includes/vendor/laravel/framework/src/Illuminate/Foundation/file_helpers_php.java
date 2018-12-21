package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Foundation;

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

 vendor/laravel/framework/src/Illuminate/Foundation/helpers.php

*/

public class file_helpers_php implements RuntimeIncludable {

    public static final file_helpers_php instance = new file_helpers_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1319 scope = new Scope1319();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1319 scope)
            throws IncludeEventException {
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        if (function_function_exists.functionHasBeenDefined(env, "abort")) {
            env.addManualFunctionLoad("abort");
        }
        if (function_function_exists.functionHasBeenDefined(env, "abort_if")) {
            env.addManualFunctionLoad("abort_if");
        }
        if (function_function_exists.functionHasBeenDefined(env, "abort_unless")) {
            env.addManualFunctionLoad("abort_unless");
        }
        if (function_function_exists.functionHasBeenDefined(env, "action")) {
            env.addManualFunctionLoad("action");
        }
        if (function_function_exists.functionHasBeenDefined(env, "app")) {
            env.addManualFunctionLoad("app");
        }
        if (function_function_exists.functionHasBeenDefined(env, "app_path")) {
            env.addManualFunctionLoad("app_path");
        }
        if (function_function_exists.functionHasBeenDefined(env, "asset")) {
            env.addManualFunctionLoad("asset");
        }
        if (function_function_exists.functionHasBeenDefined(env, "auth")) {
            env.addManualFunctionLoad("auth");
        }
        if (function_function_exists.functionHasBeenDefined(env, "back")) {
            env.addManualFunctionLoad("back");
        }
        if (function_function_exists.functionHasBeenDefined(env, "base_path")) {
            env.addManualFunctionLoad("base_path");
        }
        if (function_function_exists.functionHasBeenDefined(env, "bcrypt")) {
            env.addManualFunctionLoad("bcrypt");
        }
        if (function_function_exists.functionHasBeenDefined(env, "broadcast")) {
            env.addManualFunctionLoad("broadcast");
        }
        if (function_function_exists.functionHasBeenDefined(env, "cache")) {
            env.addManualFunctionLoad("cache");
        }
        if (function_function_exists.functionHasBeenDefined(env, "config")) {
            env.addManualFunctionLoad("config");
        }
        if (function_function_exists.functionHasBeenDefined(env, "config_path")) {
            env.addManualFunctionLoad("config_path");
        }
        if (function_function_exists.functionHasBeenDefined(env, "cookie")) {
            env.addManualFunctionLoad("cookie");
        }
        if (function_function_exists.functionHasBeenDefined(env, "csrf_field")) {
            env.addManualFunctionLoad("csrf_field");
        }
        if (function_function_exists.functionHasBeenDefined(env, "csrf_token")) {
            env.addManualFunctionLoad("csrf_token");
        }
        if (function_function_exists.functionHasBeenDefined(env, "database_path")) {
            env.addManualFunctionLoad("database_path");
        }
        if (function_function_exists.functionHasBeenDefined(env, "decrypt")) {
            env.addManualFunctionLoad("decrypt");
        }
        if (function_function_exists.functionHasBeenDefined(env, "dispatch")) {
            env.addManualFunctionLoad("dispatch");
        }
        if (function_function_exists.functionHasBeenDefined(env, "dispatch_now")) {
            env.addManualFunctionLoad("dispatch_now");
        }
        if (function_function_exists.functionHasBeenDefined(env, "elixir")) {
            env.addManualFunctionLoad("elixir");
        }
        if (function_function_exists.functionHasBeenDefined(env, "encrypt")) {
            env.addManualFunctionLoad("encrypt");
        }
        if (function_function_exists.functionHasBeenDefined(env, "event")) {
            env.addManualFunctionLoad("event");
        }
        if (function_function_exists.functionHasBeenDefined(env, "factory")) {
            env.addManualFunctionLoad("factory");
        }
        if (function_function_exists.functionHasBeenDefined(env, "info")) {
            env.addManualFunctionLoad("info");
        }
        if (function_function_exists.functionHasBeenDefined(env, "logger")) {
            env.addManualFunctionLoad("logger");
        }
        if (function_function_exists.functionHasBeenDefined(env, "logs")) {
            env.addManualFunctionLoad("logs");
        }
        if (function_function_exists.functionHasBeenDefined(env, "method_field")) {
            env.addManualFunctionLoad("method_field");
        }
        if (function_function_exists.functionHasBeenDefined(env, "mix")) {
            env.addManualFunctionLoad("mix");
        }
        if (function_function_exists.functionHasBeenDefined(env, "now")) {
            env.addManualFunctionLoad("now");
        }
        if (function_function_exists.functionHasBeenDefined(env, "old")) {
            env.addManualFunctionLoad("old");
        }
        if (function_function_exists.functionHasBeenDefined(env, "policy")) {
            env.addManualFunctionLoad("policy");
        }
        if (function_function_exists.functionHasBeenDefined(env, "public_path")) {
            env.addManualFunctionLoad("public_path");
        }
        if (function_function_exists.functionHasBeenDefined(env, "redirect")) {
            env.addManualFunctionLoad("redirect");
        }
        if (function_function_exists.functionHasBeenDefined(env, "report")) {
            env.addManualFunctionLoad("report");
        }
        if (function_function_exists.functionHasBeenDefined(env, "request")) {
            env.addManualFunctionLoad("request");
        }
        if (function_function_exists.functionHasBeenDefined(env, "rescue")) {
            env.addManualFunctionLoad("rescue");
        }
        if (function_function_exists.functionHasBeenDefined(env, "resolve")) {
            env.addManualFunctionLoad("resolve");
        }
        if (function_function_exists.functionHasBeenDefined(env, "resource_path")) {
            env.addManualFunctionLoad("resource_path");
        }
        if (function_function_exists.functionHasBeenDefined(env, "response")) {
            env.addManualFunctionLoad("response");
        }
        if (function_function_exists.functionHasBeenDefined(env, "route")) {
            env.addManualFunctionLoad("route");
        }
        if (function_function_exists.functionHasBeenDefined(env, "secure_asset")) {
            env.addManualFunctionLoad("secure_asset");
        }
        if (function_function_exists.functionHasBeenDefined(env, "secure_url")) {
            env.addManualFunctionLoad("secure_url");
        }
        if (function_function_exists.functionHasBeenDefined(env, "session")) {
            env.addManualFunctionLoad("session");
        }
        if (function_function_exists.functionHasBeenDefined(env, "storage_path")) {
            env.addManualFunctionLoad("storage_path");
        }
        if (function_function_exists.functionHasBeenDefined(env, "today")) {
            env.addManualFunctionLoad("today");
        }
        if (function_function_exists.functionHasBeenDefined(env, "trans")) {
            env.addManualFunctionLoad("trans");
        }
        if (function_function_exists.functionHasBeenDefined(env, "trans_choice")) {
            env.addManualFunctionLoad("trans_choice");
        }
        if (function_function_exists.functionHasBeenDefined(env, "__")) {
            env.addManualFunctionLoad("__");
        }
        if (function_function_exists.functionHasBeenDefined(env, "url")) {
            env.addManualFunctionLoad("url");
        }
        if (function_function_exists.functionHasBeenDefined(env, "validator")) {
            env.addManualFunctionLoad("validator");
        }
        if (function_function_exists.functionHasBeenDefined(env, "view")) {
            env.addManualFunctionLoad("view");
        }
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                    .setFile("/vendor/laravel/framework/src/Illuminate/Foundation/helpers.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1319 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
