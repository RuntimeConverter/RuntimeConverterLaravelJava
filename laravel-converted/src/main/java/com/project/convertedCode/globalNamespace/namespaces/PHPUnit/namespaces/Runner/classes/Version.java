package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Runner/Version.php

*/

public class Version extends RuntimeClassBase {

    public Version(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Version(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "PHPUnit\\Runner\\Version";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object id(RuntimeEnv env, Object... args) {
            Object version = null;
            if (ZVal.strictNotEqualityCheck(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .PHPUnit
                                            .namespaces
                                            .Runner
                                            .classes
                                            .Version
                                            .RequestStaticProperties
                                            .class)
                            .pharVersion,
                    "!==",
                    ZVal.getNull())) {
                return ZVal.assign(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .PHPUnit
                                                .namespaces
                                                .Runner
                                                .classes
                                                .Version
                                                .RequestStaticProperties
                                                .class)
                                .pharVersion);
            }

            if (ZVal.strictEqualityCheck(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .PHPUnit
                                            .namespaces
                                            .Runner
                                            .classes
                                            .Version
                                            .RequestStaticProperties
                                            .class)
                            .version,
                    "===",
                    ZVal.getNull())) {
                version =
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .SebastianBergmann
                                .classes
                                .Version(
                                env,
                                "7.2.6",
                                function_dirname
                                        .f
                                        .env(env)
                                        .call(
                                                env.addRootFilesystemPrefix(
                                                        "/vendor/phpunit/phpunit/src/Runner"),
                                                2)
                                        .value());
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .PHPUnit
                                                .namespaces
                                                .Runner
                                                .classes
                                                .Version
                                                .RequestStaticProperties
                                                .class)
                                .version =
                        env.callMethod(version, "getVersion", Version.class);
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .PHPUnit
                                            .namespaces
                                            .Runner
                                            .classes
                                            .Version
                                            .RequestStaticProperties
                                            .class)
                            .version);
        }

        @ConvertedMethod
        public Object series(RuntimeEnv env, Object... args) {
            Object version = null;
            if (function_strpos.f.env(env).call(runtimeStaticObject.id(env), "-").getBool()) {
                version =
                        ZVal.assign(
                                handleReturnReference(
                                                function_explode
                                                        .f
                                                        .env(env)
                                                        .call("-", runtimeStaticObject.id(env))
                                                        .value())
                                        .arrayGet(env, 0));

            } else {
                version = runtimeStaticObject.id(env);
            }

            return ZVal.assign(
                    NamespaceGlobal.implode
                            .env(env)
                            .call(
                                    ".",
                                    function_array_slice
                                            .f
                                            .env(env)
                                            .call(
                                                    function_explode
                                                            .f
                                                            .env(env)
                                                            .call(".", version)
                                                            .value(),
                                                    0,
                                                    2)
                                            .value())
                            .value());
        }

        @ConvertedMethod
        public Object getVersionString(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    "PHPUnit "
                            + toStringR(runtimeStaticObject.id(env), env)
                            + " by Sebastian Bergmann and contributors.");
        }

        @ConvertedMethod
        public Object getReleaseChannel(RuntimeEnv env, Object... args) {
            if (ZVal.strictNotEqualityCheck(
                    function_strpos
                            .f
                            .env(env)
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .PHPUnit
                                                            .namespaces
                                                            .Runner
                                                            .classes
                                                            .Version
                                                            .RequestStaticProperties
                                                            .class)
                                            .pharVersion,
                                    "-")
                            .value(),
                    "!==",
                    false)) {
                return "-nightly";
            }

            return "";
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object pharVersion = null;

        public Object version = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Runner\\Version")
                    .setLookup(
                            Version.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("pharVersion", "version")
                    .setFilename("vendor/phpunit/phpunit/src/Runner/Version.php")
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
