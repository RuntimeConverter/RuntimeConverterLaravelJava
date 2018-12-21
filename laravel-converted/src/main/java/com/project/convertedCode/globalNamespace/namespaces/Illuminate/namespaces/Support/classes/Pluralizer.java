package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Common.namespaces.Inflector.classes.Inflector;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/Pluralizer.php

*/

public class Pluralizer extends RuntimeClassBase {

    public Pluralizer(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Pluralizer(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Support\\Pluralizer";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(
            index = 1,
            name = "count",
            defaultValue = "2",
            defaultValueType = "number"
        )
        public Object plural(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object count = assignParameter(args, 1, true);
            if (null == count) {
                count = 2;
            }
            Object plural = null;
            if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.toLong(count), "===", 1))
                    || ZVal.toBool(
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, Pluralizer.class)
                                    .method("uncountable")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(value)
                                    .value())) {
                return ZVal.assign(value);
            }

            plural = Inflector.runtimeStaticObject.pluralize(env, value);
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Pluralizer.class)
                            .method("matchCase")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(plural, value)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object singular(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object singular = null;
            singular = Inflector.runtimeStaticObject.singularize(env, value);
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Pluralizer.class)
                            .method("matchCase")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(singular, value)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        protected Object uncountable(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(
                    function_in_array
                            .f
                            .env(env)
                            .call(
                                    NamespaceGlobal.strtolower.env(env).call(value).value(),
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Illuminate
                                                            .namespaces
                                                            .Support
                                                            .classes
                                                            .Pluralizer
                                                            .RequestStaticProperties
                                                            .class)
                                            .uncountable)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "comparison")
        protected Object matchCase(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object comparison = assignParameter(args, 1, false);
            Object functions = null;
            Object function = null;
            functions = ZVal.arrayFromList("mb_strtolower", "mb_strtoupper", "ucfirst", "ucwords");
            for (ZPair zpairResult580 : ZVal.getIterable(functions, env, true)) {
                function = ZVal.assign(zpairResult580.getValue());
                if (ZVal.strictEqualityCheck(
                        function_call_user_func
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(function, comparison)
                                .value(),
                        "===",
                        comparison)) {
                    return ZVal.assign(
                            function_call_user_func
                                    .f
                                    .env(env)
                                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                    .call(function, value)
                                    .value());
                }
            }

            return ZVal.assign(value);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object uncountable =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "audio",
                                    "bison",
                                    "cattle",
                                    "chassis",
                                    "compensation",
                                    "coreopsis",
                                    "data",
                                    "deer",
                                    "education",
                                    "emoji",
                                    "equipment",
                                    "evidence",
                                    "feedback",
                                    "firmware",
                                    "fish",
                                    "furniture",
                                    "gold",
                                    "hardware",
                                    "information",
                                    "jedi",
                                    "kin",
                                    "knowledge",
                                    "love",
                                    "metadata",
                                    "money",
                                    "moose",
                                    "news",
                                    "nutrition",
                                    "offspring",
                                    "plankton",
                                    "pokemon",
                                    "police",
                                    "rain",
                                    "rice",
                                    "series",
                                    "sheep",
                                    "software",
                                    "species",
                                    "swine",
                                    "traffic",
                                    "wheat");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Support\\Pluralizer")
                    .setLookup(
                            Pluralizer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("uncountable")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Support/Pluralizer.php")
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
