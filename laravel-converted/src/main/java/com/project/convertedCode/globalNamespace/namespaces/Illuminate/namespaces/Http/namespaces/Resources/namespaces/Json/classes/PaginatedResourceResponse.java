package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Resources.namespaces.Json.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge_recursive;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Resources.namespaces.Json.classes.ResourceResponse;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.functions.response;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Http/Resources/Json/PaginatedResourceResponse.php

*/

public class PaginatedResourceResponse extends ResourceResponse {

    public PaginatedResourceResponse(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PaginatedResourceResponse.class) {
            this.__construct(env, args);
        }
    }

    public PaginatedResourceResponse(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    public Object toResponse(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Http/Resources/Json")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Http/Resources/Json/PaginatedResourceResponse.php");
        Object request = assignParameter(args, 0, false);
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                env.callMethod(
                                        response.f.env(env).call().value(),
                                        "json",
                                        PaginatedResourceResponse.class,
                                        env.callMethod(
                                                this,
                                                "wrap",
                                                PaginatedResourceResponse.class,
                                                env.callMethod(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("resource")
                                                                .value(),
                                                        "resolve",
                                                        PaginatedResourceResponse.class,
                                                        request),
                                                function_array_merge_recursive
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                this.paginationInformation(
                                                                        env, request),
                                                                env.callMethod(
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("resource")
                                                                                .value(),
                                                                        "with",
                                                                        PaginatedResourceResponse
                                                                                .class,
                                                                        request),
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("resource")
                                                                        .getObject()
                                                                        .accessProp(this, env)
                                                                        .name("additional")
                                                                        .value())
                                                        .value()),
                                        env.callMethod(
                                                this,
                                                "calculateStatus",
                                                PaginatedResourceResponse.class)),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Http\\Resources\\Json",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "response")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object response = assignParameter(args, 0, false);
                                        Object request = null;
                                        request =
                                                this.contextReferences.getCapturedValue("request");
                                        toObjectR(response)
                                                .accessProp(this, env)
                                                .name("original")
                                                .set(
                                                        env.callMethod(
                                                                toObjectR(_closureThisVar)
                                                                        .accessProp(this, env)
                                                                        .name("resource")
                                                                        .getObject()
                                                                        .accessProp(this, env)
                                                                        .name("resource")
                                                                        .value(),
                                                                "pluck",
                                                                PaginatedResourceResponse.class,
                                                                "resource"));
                                        env.callMethod(
                                                toObjectR(_closureThisVar)
                                                        .accessProp(this, env)
                                                        .name("resource")
                                                        .value(),
                                                "withResponse",
                                                PaginatedResourceResponse.class,
                                                request,
                                                response);
                                        return null;
                                    }
                                }.use("request", request))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    protected Object paginationInformation(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object paginated = null;
        paginated =
                env.callMethod(
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("resource")
                                .getObject()
                                .accessProp(this, env)
                                .name("resource")
                                .value(),
                        "toArray",
                        PaginatedResourceResponse.class);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("links", this.paginationLinks(env, paginated)),
                        new ZPair("meta", this.meta(env, paginated))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "paginated")
    protected Object paginationLinks(RuntimeEnv env, Object... args) {
        ReferenceContainer paginated = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "first",
                                ZVal.isDefined(
                                                ternaryExpressionTemp =
                                                        paginated.arrayGet(env, "first_page_url"))
                                        ? ternaryExpressionTemp
                                        : ZVal.getNull()),
                        new ZPair(
                                "last",
                                ZVal.isDefined(
                                                ternaryExpressionTemp =
                                                        paginated.arrayGet(env, "last_page_url"))
                                        ? ternaryExpressionTemp
                                        : ZVal.getNull()),
                        new ZPair(
                                "prev",
                                ZVal.isDefined(
                                                ternaryExpressionTemp =
                                                        paginated.arrayGet(env, "prev_page_url"))
                                        ? ternaryExpressionTemp
                                        : ZVal.getNull()),
                        new ZPair(
                                "next",
                                ZVal.isDefined(
                                                ternaryExpressionTemp =
                                                        paginated.arrayGet(env, "next_page_url"))
                                        ? ternaryExpressionTemp
                                        : ZVal.getNull())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "paginated")
    protected Object meta(RuntimeEnv env, Object... args) {
        Object paginated = assignParameter(args, 0, false);
        return ZVal.assign(
                Arr.runtimeStaticObject.except(
                        env,
                        paginated,
                        ZVal.arrayFromList(
                                "data",
                                "first_page_url",
                                "last_page_url",
                                "prev_page_url",
                                "next_page_url")));
    }

    public static final Object CONST_class =
            "Illuminate\\Http\\Resources\\Json\\PaginatedResourceResponse";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ResourceResponse.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Http\\Resources\\Json\\PaginatedResourceResponse")
                    .setLookup(
                            PaginatedResourceResponse.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("resource")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Http/Resources/Json/PaginatedResourceResponse.php")
                    .addInterface("Illuminate\\Contracts\\Support\\Responsable")
                    .addExtendsClass("Illuminate\\Http\\Resources\\Json\\ResourceResponse")
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
