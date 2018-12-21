package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.functions.data_set;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Validation/ValidationData.php

*/

public class ValidationData extends RuntimeClassBase {

    public ValidationData(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ValidationData(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Validation\\ValidationData";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "attribute")
        @ConvertedParameter(index = 1, name = "masterData")
        public Object initializeAndGatherData(RuntimeEnv env, Object... args) {
            Object attribute = assignParameter(args, 0, false);
            Object masterData = assignParameter(args, 1, false);
            Object data = null;
            data =
                    Arr.runtimeStaticObject.dot(
                            env,
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, ValidationData.class)
                                    .method("initializeAttributeOnData")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(attribute, masterData)
                                    .value());
            return ZVal.assign(
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    data,
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, ValidationData.class)
                                            .method("extractValuesForWildcards")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(masterData, data, attribute)
                                            .value())
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "attribute")
        @ConvertedParameter(index = 1, name = "masterData")
        protected Object initializeAttributeOnData(RuntimeEnv env, Object... args) {
            Object attribute = assignParameter(args, 0, false);
            Object masterData = assignParameter(args, 1, false);
            ReferenceContainer data = new BasicReferenceContainer(null);
            Object explicitPath = null;
            explicitPath =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, ValidationData.class)
                            .method("getLeadingExplicitAttributePath")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(attribute)
                            .value();
            data.setObject(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, ValidationData.class)
                            .method("extractDataFromPath")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(explicitPath, masterData)
                            .value());
            if (ZVal.toBool(!ZVal.isTrue(Str.runtimeStaticObject.contains(env, attribute, "*")))
                    || ZVal.toBool(Str.runtimeStaticObject.endsWith(env, attribute, "*"))) {
                return ZVal.assign(data.getObject());
            }

            return ZVal.assign(
                    data_set.f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithReferences().add(0, data))
                            .call(data.getObject(), attribute, ZVal.getNull(), true)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "masterData")
        @ConvertedParameter(index = 1, name = "data")
        @ConvertedParameter(index = 2, name = "attribute")
        protected Object extractValuesForWildcards(RuntimeEnv env, Object... args) {
            Object masterData = assignParameter(args, 0, false);
            ReferenceContainer data = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object attribute = assignParameter(args, 2, false);
            ReferenceContainer keys = new BasicReferenceContainer(null);
            Object pattern = null;
            ReferenceContainer matches = new BasicReferenceContainer(null);
            Object value = null;
            Object key = null;
            keys.setObject(ZVal.newArray());
            pattern =
                    function_str_replace
                            .f
                            .env(env)
                            .call(
                                    "\\*",
                                    "[^\\.]+",
                                    NamespaceGlobal.preg_quote.env(env).call(attribute).value())
                            .value();
            for (ZPair zpairResult621 : ZVal.getIterable(data.getObject(), env, false)) {
                key = ZVal.assign(zpairResult621.getKey());
                value = ZVal.assign(zpairResult621.getValue());
                if (ZVal.isTrue(
                        ZVal.toBool(
                                function_preg_match
                                        .f
                                        .env(env)
                                        .addReferenceArgs(
                                                new RuntimeArgsWithReferences().add(2, matches))
                                        .call(
                                                "/^" + toStringR(pattern, env) + "/",
                                                key,
                                                matches.getObject())
                                        .value()))) {
                    keys.arrayAppend(env).set(matches.arrayGet(env, 0));
                }
            }

            keys.setObject(function_array_unique.f.env(env).call(keys.getObject()).value());
            data.setObject(ZVal.newArray());
            for (ZPair zpairResult622 : ZVal.getIterable(keys.getObject(), env, true)) {
                key = ZVal.assign(zpairResult622.getValue());
                data.arrayAccess(env, key).set(Arr.runtimeStaticObject.get(env, masterData, key));
            }

            return ZVal.assign(data.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "attribute")
        @ConvertedParameter(index = 1, name = "masterData")
        public Object extractDataFromPath(RuntimeEnv env, Object... args) {
            Object attribute = assignParameter(args, 0, false);
            Object masterData = assignParameter(args, 1, false);
            ReferenceContainer results = new BasicReferenceContainer(null);
            Object value = null;
            results.setObject(ZVal.newArray());
            value = Arr.runtimeStaticObject.get(env, masterData, attribute, "__missing__");
            if (ZVal.strictNotEqualityCheck(value, "!==", "__missing__")) {
                Arr.runtimeStaticObject.set(
                        env,
                        new RuntimeArgsWithReferences().add(0, results),
                        results.getObject(),
                        attribute,
                        value);
            }

            return ZVal.assign(results.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "attribute")
        public Object getLeadingExplicitAttributePath(RuntimeEnv env, Object... args) {
            Object attribute = assignParameter(args, 0, false);
            Object ternaryExpressionTemp = null;
            return ZVal.assign(
                    ZVal.isTrue(
                                    ternaryExpressionTemp =
                                            function_rtrim
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            handleReturnReference(
                                                                            function_explode
                                                                                    .f
                                                                                    .env(env)
                                                                                    .call(
                                                                                            "*",
                                                                                            attribute)
                                                                                    .value())
                                                                    .arrayGet(env, 0),
                                                            ".")
                                                    .value())
                            ? ternaryExpressionTemp
                            : ZVal.getNull());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Validation\\ValidationData")
                    .setLookup(
                            ValidationData.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Validation/ValidationData.php")
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
