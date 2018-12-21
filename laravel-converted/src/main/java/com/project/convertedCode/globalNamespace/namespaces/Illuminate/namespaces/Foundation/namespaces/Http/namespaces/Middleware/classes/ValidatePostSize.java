package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Http.namespaces.Middleware.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Exceptions.classes.PostTooLargeException;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Http/Middleware/ValidatePostSize.php

*/

public class ValidatePostSize extends RuntimeClassBase {

    public ValidatePostSize(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ValidatePostSize(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "next", typeHint = "Closure")
    public Object handle(RuntimeEnv env, Object... args) {
        ReferenceContainer request = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object next = assignParameter(args, 1, false);
        Object max = null;
        max = this.getPostMaxSize(env);
        if (ZVal.toBool(ZVal.isGreaterThan(max, '>', 0))
                && ZVal.toBool(
                        ZVal.isGreaterThan(
                                env.callMethod(
                                        request.getObject(),
                                        "server",
                                        ValidatePostSize.class,
                                        "CONTENT_LENGTH"),
                                '>',
                                max))) {
            throw ZVal.getException(env, new PostTooLargeException(env));
        }

        return ZVal.assign(
                env.callFunctionDynamic(
                                next,
                                new RuntimeArgsWithReferences().add(0, request),
                                request.getObject())
                        .value());
    }

    @ConvertedMethod
    protected Object getPostMaxSize(RuntimeEnv env, Object... args) {
        Object postMaxSize = null;
        Object metric = null;
        if (function_is_numeric
                .f
                .env(env)
                .call(postMaxSize = function_ini_get.f.env(env).call("post_max_size").value())
                .getBool()) {
            return ZVal.assign(ZVal.toLong(postMaxSize));
        }

        metric =
                NamespaceGlobal.strtoupper
                        .env(env)
                        .call(function_substr.f.env(env).call(postMaxSize, -1).value())
                        .value();
        postMaxSize = ZVal.assign(ZVal.toLong(postMaxSize));
        SwitchEnumType27 switchVariable27 =
                ZVal.getEnum(
                        metric,
                        SwitchEnumType27.DEFAULT_CASE,
                        SwitchEnumType27.STRING_K,
                        "K",
                        SwitchEnumType27.STRING_M,
                        "M",
                        SwitchEnumType27.STRING_G,
                        "G");
        switch (switchVariable27) {
            case STRING_K:
                return ZVal.assign(ZVal.multiply(postMaxSize, 1024));
            case STRING_M:
                return ZVal.assign(ZVal.multiply(postMaxSize, 1048576));
            case STRING_G:
                return ZVal.assign(ZVal.multiply(postMaxSize, 1073741824));
            case DEFAULT_CASE:
                return ZVal.assign(postMaxSize);
        }
        ;
        return null;
    }

    public static final Object CONST_class =
            "Illuminate\\Foundation\\Http\\Middleware\\ValidatePostSize";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Http\\Middleware\\ValidatePostSize")
                    .setLookup(
                            ValidatePostSize.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Http/Middleware/ValidatePostSize.php")
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

    private enum SwitchEnumType27 {
        STRING_K,
        STRING_M,
        STRING_G,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
