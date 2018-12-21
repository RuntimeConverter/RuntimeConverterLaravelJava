package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.classes;

import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.classes.ErrorHandler;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_error_reporting;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.classes.ExceptionHandler;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_set;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.classes.BufferingLogger;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.classes.DebugClassLoader;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/debug/Debug.php

*/

public class Debug extends RuntimeClassBase {

    public Debug(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Debug(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Symfony\\Component\\Debug\\Debug";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "errorReportingLevel")
        @ConvertedParameter(
            index = 1,
            name = "displayErrors",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object enable(RuntimeEnv env, Object... args) {
            Object errorReportingLevel = assignParameter(args, 0, true);
            if (null == errorReportingLevel) {
                errorReportingLevel = 32767;
            }
            Object displayErrors = assignParameter(args, 1, true);
            if (null == displayErrors) {
                displayErrors = true;
            }
            if (ZVal.isTrue(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .Debug
                                            .classes
                                            .Debug
                                            .RequestStaticProperties
                                            .class)
                            .enabled)) {
                return null;
            }

            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .Debug
                                            .classes
                                            .Debug
                                            .RequestStaticProperties
                                            .class)
                            .enabled =
                    true;
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", errorReportingLevel)) {
                function_error_reporting.f.env(env).call(errorReportingLevel);

            } else {
                function_error_reporting.f.env(env).call(32767);
            }

            if (!function_in_array
                    .f
                    .env(env)
                    .call("cli", ZVal.arrayFromList("cli", "phpdbg"), true)
                    .getBool()) {
                function_ini_set.f.env(env).call("display_errors", 0);
                ExceptionHandler.runtimeStaticObject.register(env);

            } else if (ZVal.toBool(displayErrors)
                    && ZVal.toBool(
                            ZVal.toBool(!function_ini_get.f.env(env).call("log_errors").getBool())
                                    || ZVal.toBool(
                                            function_ini_get
                                                    .f
                                                    .env(env)
                                                    .call("error_log")
                                                    .value()))) {
                function_ini_set.f.env(env).call("display_errors", 1);
            }

            if (ZVal.isTrue(displayErrors)) {
                ErrorHandler.runtimeStaticObject.register(
                        env, new ErrorHandler(env, new BufferingLogger(env)));

            } else {
                env.callMethod(
                        ErrorHandler.runtimeStaticObject.register(env),
                        "throwAt",
                        Debug.class,
                        0,
                        true);
            }

            DebugClassLoader.runtimeStaticObject.enable(env);
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object enabled = false;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Debug\\Debug")
                    .setLookup(
                            Debug.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("enabled")
                    .setFilename("vendor/symfony/debug/Debug.php")
                    .get();

    @Override
    public ReflectionClassData getRuntimeConverterReflectionData() {
        return runtimeConverterReflectionData;
    }

    @Override
    public Object converterRuntimeCallExtended(
            RuntimeEnv env,
            String method,
            Class<?> caller,
            PassByReferenceArgs passByReferenceArgs,
            Object... args) {
        return RuntimeClassBase.converterRuntimeCallExtendedWithDataStatic(
                this,
                runtimeConverterReflectionData,
                env,
                method,
                caller,
                passByReferenceArgs,
                args);
    }
}
