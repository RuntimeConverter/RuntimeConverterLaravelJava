package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Resources.namespaces.Json.classes;

import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge_recursive;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.functions.response;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.Model;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Responsable;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Collection;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Http/Resources/Json/ResourceResponse.php

*/

public class ResourceResponse extends RuntimeClassBase implements Responsable {

    public Object resource = null;

    public ResourceResponse(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ResourceResponse.class) {
            this.__construct(env, args);
        }
    }

    public ResourceResponse(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        this.resource = resource;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    public Object toResponse(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Http/Resources/Json")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Http/Resources/Json/ResourceResponse.php");
        Object request = assignParameter(args, 0, false);
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                env.callMethod(
                                        response.f.env(env).call().value(),
                                        "json",
                                        ResourceResponse.class,
                                        this.wrap(
                                                env,
                                                env.callMethod(
                                                        this.resource,
                                                        "resolve",
                                                        ResourceResponse.class,
                                                        request),
                                                env.callMethod(
                                                        this.resource,
                                                        "with",
                                                        ResourceResponse.class,
                                                        request),
                                                toObjectR(this.resource)
                                                        .accessProp(this, env)
                                                        .name("additional")
                                                        .value()),
                                        this.calculateStatus(env)),
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
                                                        toObjectR(ResourceResponse.this.resource)
                                                                .accessProp(this, env)
                                                                .name("resource")
                                                                .value());
                                        env.callMethod(
                                                ResourceResponse.this.resource,
                                                "withResponse",
                                                ResourceResponse.class,
                                                request,
                                                response);
                                        return null;
                                    }
                                }.use("request", request))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    @ConvertedParameter(index = 1, name = "with", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "additional",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object wrap(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object with = assignParameter(args, 1, true);
        if (null == with) {
            with = ZVal.newArray();
        }
        Object additional = assignParameter(args, 2, true);
        if (null == additional) {
            additional = ZVal.newArray();
        }
        Object ternaryExpressionTemp = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        data, Collection.class, "Illuminate\\Support\\Collection"))) {
            data = env.callMethod(data, "all", ResourceResponse.class);
        }

        if (ZVal.isTrue(this.haveDefaultWrapperAndDataIsUnwrapped(env, data))) {
            data = ZVal.newArray(new ZPair(this.wrapper(env), data));

        } else if (ZVal.isTrue(
                this.haveAdditionalInformationAndDataIsUnwrapped(env, data, with, additional))) {
            data =
                    ZVal.newArray(
                            new ZPair(
                                    ZVal.isDefined(ternaryExpressionTemp = this.wrapper(env))
                                            ? ternaryExpressionTemp
                                            : "data",
                                    data));
        }

        return ZVal.assign(
                function_array_merge_recursive.f.env(env).call(data, with, additional).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    protected Object haveDefaultWrapperAndDataIsUnwrapped(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(this.wrapper(env))
                        && ZVal.toBool(
                                !function_array_key_exists
                                        .f
                                        .env(env)
                                        .call(this.wrapper(env), data)
                                        .getBool()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    @ConvertedParameter(index = 1, name = "with")
    @ConvertedParameter(index = 2, name = "additional")
    protected Object haveAdditionalInformationAndDataIsUnwrapped(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object with = assignParameter(args, 1, false);
        Object additional = assignParameter(args, 2, false);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(!ZVal.isEmpty(with))
                                        || ZVal.toBool(!ZVal.isEmpty(additional)))
                        && ZVal.toBool(
                                ZVal.toBool(!ZVal.isTrue(this.wrapper(env)))
                                        || ZVal.toBool(
                                                !function_array_key_exists
                                                        .f
                                                        .env(env)
                                                        .call(this.wrapper(env), data)
                                                        .getBool())));
    }

    @ConvertedMethod
    protected Object wrapper(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.getRequestStaticPropertiesReference(
                                function_get_class.f.env(env).call(this.resource).value(), "wrap")
                        .getObject());
    }

    @ConvertedMethod
    protected Object calculateStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                toObjectR(this.resource)
                                                        .accessProp(this, env)
                                                        .name("resource")
                                                        .value(),
                                                Model.class,
                                                "Illuminate\\Database\\Eloquent\\Model"))
                                && ZVal.toBool(
                                        toObjectR(this.resource)
                                                .accessProp(this, env)
                                                .name("resource")
                                                .getObject()
                                                .accessProp(this, env)
                                                .name("wasRecentlyCreated")
                                                .value())
                        ? 201
                        : 200);
    }

    public static final Object CONST_class = "Illuminate\\Http\\Resources\\Json\\ResourceResponse";

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
                    .setName("Illuminate\\Http\\Resources\\Json\\ResourceResponse")
                    .setLookup(
                            ResourceResponse.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("resource")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Http/Resources/Json/ResourceResponse.php")
                    .addInterface("Illuminate\\Contracts\\Support\\Responsable")
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
