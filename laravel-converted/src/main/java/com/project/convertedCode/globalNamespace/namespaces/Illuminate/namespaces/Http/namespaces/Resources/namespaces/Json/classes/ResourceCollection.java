package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Resources.namespaces.Json.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Resources.classes.MissingValue;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Pagination.classes.AbstractPaginator;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.functions.class_basename;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Resources.namespaces.Json.classes.JsonResource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Resources.namespaces.Json.classes.PaginatedResourceResponse;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Http/Resources/Json/ResourceCollection.php

*/

public class ResourceCollection extends JsonResource implements IteratorAggregate {

    public Object collects = null;

    public Object collection = null;

    public ResourceCollection(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ResourceCollection.class) {
            this.__construct(env, args);
        }
    }

    public ResourceCollection(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        super.__construct(env, resource);
        toObjectR(this)
                .accessProp(this, env)
                .name("resource")
                .set(this.collectResource(env, resource));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    public Object toArray(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                toObjectR(this.collection)
                                        .accessProp(this, env)
                                        .name("map")
                                        .value(),
                                "toArray",
                                ResourceCollection.class,
                                request),
                        "all",
                        ResourceCollection.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    public Object toResponse(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("resource")
                                                .value(),
                                        AbstractPaginator.class,
                                        "Illuminate\\Pagination\\AbstractPaginator"))
                        ? env.callMethod(
                                new PaginatedResourceResponse(env, this),
                                "toResponse",
                                ResourceCollection.class,
                                request)
                        : super.toResponse(env, request));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    protected Object collectResource(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object collects = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        resource,
                        MissingValue.class,
                        "Illuminate\\Http\\Resources\\MissingValue"))) {
            return ZVal.assign(resource);
        }

        collects = this.collects(env);
        this.collection =
                ZVal.toBool(collects)
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                ZVal.checkInstanceTypeMatch(
                                                        env.callMethod(
                                                                resource,
                                                                "first",
                                                                ResourceCollection.class),
                                                        collects)))
                        ? env.callMethod(resource, "mapInto", ResourceCollection.class, collects)
                        : env.callMethod(resource, "toBase", ResourceCollection.class);
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        resource,
                                        AbstractPaginator.class,
                                        "Illuminate\\Pagination\\AbstractPaginator"))
                        ? env.callMethod(
                                resource,
                                "setCollection",
                                ResourceCollection.class,
                                this.collection)
                        : this.collection);
    }

    @ConvertedMethod
    protected Object collects(RuntimeEnv env, Object... args) {
        Object _pClass = null;
        if (ZVal.isTrue(this.collects)) {
            return ZVal.assign(this.collects);
        }

        if (ZVal.toBool(
                        Str.runtimeStaticObject.endsWith(
                                env, class_basename.f.env(env).call(this).value(), "Collection"))
                && ZVal.toBool(
                        function_class_exists
                                .f
                                .env(env)
                                .call(
                                        _pClass =
                                                Str.runtimeStaticObject.replaceLast(
                                                        env,
                                                        "Collection",
                                                        "",
                                                        function_get_class
                                                                .f
                                                                .env(env)
                                                                .call(this)
                                                                .value()))
                                .value())) {
            return ZVal.assign(_pClass);
        }

        return null;
    }

    @ConvertedMethod
    public Object getIterator(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this.collection, "getIterator", ResourceCollection.class));
    }

    public static final Object CONST_class =
            "Illuminate\\Http\\Resources\\Json\\ResourceCollection";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends JsonResource.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Http\\Resources\\Json\\ResourceCollection")
                    .setLookup(
                            ResourceCollection.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("additional", "collection", "collects", "resource", "with")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Http/Resources/Json/ResourceCollection.php")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
                    .addInterface("ArrayAccess")
                    .addInterface("JsonSerializable")
                    .addInterface("Illuminate\\Contracts\\Support\\Responsable")
                    .addInterface("Illuminate\\Contracts\\Routing\\UrlRoutable")
                    .addTrait("Illuminate\\Http\\Resources\\CollectsResources")
                    .addExtendsClass("Illuminate\\Http\\Resources\\Json\\JsonResource")
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
