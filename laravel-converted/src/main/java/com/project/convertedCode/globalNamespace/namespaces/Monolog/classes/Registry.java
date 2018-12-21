package com.project.convertedCode.globalNamespace.namespaces.Monolog.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_search;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Registry.php

*/

public class Registry extends RuntimeClassBase {

    public Registry(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Registry(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Monolog\\Registry";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "logger", typeHint = "Monolog\\Logger")
        @ConvertedParameter(
            index = 1,
            name = "name",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "overwrite",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object addLogger(RuntimeEnv env, Object... args) {
            Object logger = assignParameter(args, 0, false);
            Object name = assignParameter(args, 1, true);
            if (null == name) {
                name = ZVal.getNull();
            }
            Object overwrite = assignParameter(args, 2, true);
            if (null == overwrite) {
                overwrite = false;
            }
            Object ternaryExpressionTemp = null;
            name =
                    ZVal.assign(
                            ZVal.isTrue(ternaryExpressionTemp = name)
                                    ? ternaryExpressionTemp
                                    : env.callMethod(logger, "getName", Registry.class));
            if (ZVal.toBool(
                            arrayActionR(
                                    ArrayAction.ISSET,
                                    env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Monolog
                                                    .classes
                                                    .Registry
                                                    .RequestStaticProperties
                                                    .class,
                                            "loggers"),
                                    env,
                                    name))
                    && ZVal.toBool(!ZVal.isTrue(overwrite))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env, "Logger with the given name already exists"));
            }

            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Monolog
                                    .classes
                                    .Registry
                                    .RequestStaticProperties
                                    .class,
                            "loggers")
                    .arrayAccess(env, name)
                    .set(logger);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "logger")
        public Object hasLogger(RuntimeEnv env, Object... args) {
            Object logger = assignParameter(args, 0, false);
            Object index = null;
            if (ZVal.isTrue(ZVal.checkInstanceType(logger, Logger.class, "Monolog\\Logger"))) {
                index =
                        function_array_search
                                .f
                                .env(env)
                                .call(
                                        logger,
                                        env.getRequestStaticProperties(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Monolog
                                                                .classes
                                                                .Registry
                                                                .RequestStaticProperties
                                                                .class)
                                                .loggers,
                                        true)
                                .value();
                return ZVal.assign(ZVal.strictNotEqualityCheck(false, "!==", index));

            } else {
                return ZVal.assign(
                        arrayActionR(
                                ArrayAction.ISSET,
                                env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Monolog
                                                .classes
                                                .Registry
                                                .RequestStaticProperties
                                                .class,
                                        "loggers"),
                                env,
                                logger));
            }
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "logger")
        public Object removeLogger(RuntimeEnv env, Object... args) {
            Object logger = assignParameter(args, 0, false);
            Object idx = null;
            if (ZVal.isTrue(ZVal.checkInstanceType(logger, Logger.class, "Monolog\\Logger"))) {
                if (ZVal.strictNotEqualityCheck(
                        false,
                        "!==",
                        idx =
                                function_array_search
                                        .f
                                        .env(env)
                                        .call(
                                                logger,
                                                env.getRequestStaticProperties(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Monolog
                                                                        .classes
                                                                        .Registry
                                                                        .RequestStaticProperties
                                                                        .class)
                                                        .loggers,
                                                true)
                                        .value())) {
                    arrayActionR(
                            ArrayAction.UNSET,
                            env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Monolog
                                            .classes
                                            .Registry
                                            .RequestStaticProperties
                                            .class,
                                    "loggers"),
                            env,
                            idx);
                }

            } else {
                arrayActionR(
                        ArrayAction.UNSET,
                        env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Monolog
                                        .classes
                                        .Registry
                                        .RequestStaticProperties
                                        .class,
                                "loggers"),
                        env,
                        logger);
            }

            return null;
        }

        @ConvertedMethod
        public Object clear(RuntimeEnv env, Object... args) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Monolog
                                            .classes
                                            .Registry
                                            .RequestStaticProperties
                                            .class)
                            .loggers =
                    ZVal.newArray();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object getInstance(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Monolog
                                    .classes
                                    .Registry
                                    .RequestStaticProperties
                                    .class,
                            "loggers"),
                    env,
                    name)) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Requested \"%s\" logger instance is not in the registry",
                                                name)
                                        .value()));
            }

            return ZVal.assign(
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Monolog
                                            .classes
                                            .Registry
                                            .RequestStaticProperties
                                            .class,
                                    "loggers")
                            .arrayGet(env, name));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(index = 1, name = "arguments")
        public Object __callStatic(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            Object arguments = assignParameter(args, 1, false);
            return ZVal.assign(runtimeStaticObject.getInstance(env, name));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object loggers = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Registry")
                    .setLookup(
                            Registry.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("loggers")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Registry.php")
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
