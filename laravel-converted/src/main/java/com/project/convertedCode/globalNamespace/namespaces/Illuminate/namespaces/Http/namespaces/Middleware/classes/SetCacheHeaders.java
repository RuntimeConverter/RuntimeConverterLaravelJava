package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Middleware.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Http/Middleware/SetCacheHeaders.php

*/

public class SetCacheHeaders extends RuntimeClassBase {

    public SetCacheHeaders(RuntimeEnv env, Object... args) {
        super(env);
    }

    public SetCacheHeaders(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "next", typeHint = "Closure")
    @ConvertedParameter(index = 2, name = "options", defaultValue = "", defaultValueType = "array")
    public Object handle(RuntimeEnv env, Object... args) {
        ReferenceContainer request = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object next = assignParameter(args, 1, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object response = null;
        response =
                env.callFunctionDynamic(
                                next,
                                new RuntimeArgsWithReferences().add(0, request),
                                request.getObject())
                        .value();
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        request.getObject(),
                                        "isMethodCacheable",
                                        SetCacheHeaders.class)))
                || ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(response, "getContent", SetCacheHeaders.class)))) {
            return ZVal.assign(response);
        }

        if (function_is_string.f.env(env).call(options.getObject()).getBool()) {
            options.setObject(this.parseOptions(env, options.getObject()));
        }

        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, options, env, "etag"))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(options.arrayGet(env, "etag"), "===", true))) {
            options.arrayAccess(env, "etag")
                    .set(
                            NamespaceGlobal.md5
                                    .env(env)
                                    .call(
                                            env.callMethod(
                                                    response, "getContent", SetCacheHeaders.class))
                                    .value());
        }

        env.callMethod(response, "setCache", SetCacheHeaders.class, options.getObject());
        env.callMethod(response, "isNotModified", SetCacheHeaders.class, request.getObject());
        return ZVal.assign(response);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options")
    protected Object parseOptions(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Http/Middleware")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Http/Middleware/SetCacheHeaders.php");
        Object options = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                collect.f
                                        .env(env)
                                        .call(
                                                function_explode
                                                        .f
                                                        .env(env)
                                                        .call(";", options)
                                                        .value())
                                        .value(),
                                "mapWithKeys",
                                SetCacheHeaders.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Http\\Middleware",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "option")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object option = assignParameter(args, 0, false);
                                        ReferenceContainer data = new BasicReferenceContainer(null);
                                        Object ternaryExpressionTemp = null;
                                        data.setObject(
                                                function_explode
                                                        .f
                                                        .env(env)
                                                        .call("=", option, 2)
                                                        .value());
                                        return ZVal.assign(
                                                ZVal.newArray(
                                                        new ZPair(
                                                                data.arrayGet(env, 0),
                                                                ZVal.isDefined(
                                                                                ternaryExpressionTemp =
                                                                                        data
                                                                                                .arrayGet(
                                                                                                        env,
                                                                                                        1))
                                                                        ? ternaryExpressionTemp
                                                                        : true)));
                                    }
                                }),
                        "all",
                        SetCacheHeaders.class));
    }

    public static final Object CONST_class = "Illuminate\\Http\\Middleware\\SetCacheHeaders";

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
                    .setName("Illuminate\\Http\\Middleware\\SetCacheHeaders")
                    .setLookup(
                            SetCacheHeaders.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Http/Middleware/SetCacheHeaders.php")
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
