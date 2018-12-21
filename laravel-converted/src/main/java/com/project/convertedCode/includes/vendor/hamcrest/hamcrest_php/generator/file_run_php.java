package com.project.convertedCode.includes.vendor.hamcrest.hamcrest_php.generator;

import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_include_path;
import com.project.convertedCode.globalNamespace.classes.FactoryGenerator;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_include_path;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_define;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.StaticMethodFile;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.project.convertedCode.globalNamespace.classes.GlobalFunctionFile;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/generator/run.php

*/

public class file_run_php implements RuntimeIncludable {

    public static final file_run_php instance = new file_run_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope796 scope = new Scope796();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope796 scope)
            throws IncludeEventException {
        env.include(
                toStringR(
                                env.addRootFilesystemPrefix(
                                        "/vendor/hamcrest/hamcrest-php/generator"),
                                env)
                        + "/../vendor/autoload.php",
                stack,
                this,
                true,
                false);
        function_define
                .f
                .env(env)
                .call(
                        "GENERATOR_BASE",
                        env.addRootFilesystemPrefix("/vendor/hamcrest/hamcrest-php/generator"));
        function_define
                .f
                .env(env)
                .call(
                        "HAMCREST_BASE",
                        function_realpath
                                .f
                                .env(env)
                                .call(
                                        toStringR(
                                                        function_dirname
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        function_constant.get(
                                                                                env,
                                                                                "GENERATOR_BASE"))
                                                                .value(),
                                                        env)
                                                + toStringR("/", env)
                                                + "hamcrest")
                                .value());
        function_define
                .f
                .env(env)
                .call(
                        "GLOBAL_FUNCTIONS_FILE",
                        toStringR(function_constant.get(env, "HAMCREST_BASE"), env)
                                + toStringR("/", env)
                                + "Hamcrest.php");
        function_define
                .f
                .env(env)
                .call(
                        "STATIC_MATCHERS_FILE",
                        toStringR(function_constant.get(env, "HAMCREST_BASE"), env)
                                + toStringR("/", env)
                                + "Hamcrest"
                                + toStringR("/", env)
                                + "Matchers.php");
        function_set_include_path
                .f
                .env(env)
                .call(
                        NamespaceGlobal.implode
                                .env(env)
                                .call(
                                        ":",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        function_constant.get(
                                                                env, "GENERATOR_BASE")),
                                                new ZPair(
                                                        1,
                                                        function_constant.get(
                                                                env, "HAMCREST_BASE")),
                                                new ZPair(
                                                        2,
                                                        function_get_include_path
                                                                .f
                                                                .env(env)
                                                                .call()
                                                                .value())))
                                .value());
        NamespaceGlobal.unlink
                .env(env)
                .call(function_constant.get(env, "GLOBAL_FUNCTIONS_FILE"))
                .value();
        NamespaceGlobal.unlink
                .env(env)
                .call(function_constant.get(env, "STATIC_MATCHERS_FILE"))
                .value();
        scope.generator =
                new FactoryGenerator(
                        env,
                        toStringR(function_constant.get(env, "HAMCREST_BASE"), env)
                                + toStringR("/", env)
                                + "Hamcrest");
        env.callMethod(
                scope.generator,
                "addFactoryFile",
                file_run_php.class,
                new StaticMethodFile(env, function_constant.get(env, "STATIC_MATCHERS_FILE")));
        env.callMethod(
                scope.generator,
                "addFactoryFile",
                file_run_php.class,
                new GlobalFunctionFile(env, function_constant.get(env, "GLOBAL_FUNCTIONS_FILE")));
        env.callMethod(scope.generator, "generate", file_run_php.class);
        env.callMethod(scope.generator, "write", file_run_php.class);
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/hamcrest/hamcrest-php/generator")
                    .setFile("/vendor/hamcrest/hamcrest-php/generator/run.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope796 implements UpdateRuntimeScopeInterface {

        Object generator;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("generator", this.generator);
        }

        public void updateScope(RuntimeStack stack) {

            this.generator = stack.getVariable("generator");
        }
    }
}
