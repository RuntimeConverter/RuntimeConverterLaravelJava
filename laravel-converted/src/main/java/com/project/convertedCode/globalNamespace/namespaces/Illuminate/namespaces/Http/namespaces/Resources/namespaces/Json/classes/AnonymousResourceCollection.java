package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Resources.namespaces.Json.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Resources.namespaces.Json.classes.ResourceCollection;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Http/Resources/Json/AnonymousResourceCollection.php

*/

public class AnonymousResourceCollection extends ResourceCollection {

    public AnonymousResourceCollection(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.collects = null;
        if (this.getClass() == AnonymousResourceCollection.class) {
            this.__construct(env, args);
        }
    }

    public AnonymousResourceCollection(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    @ConvertedParameter(index = 1, name = "collects")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object collects = assignParameter(args, 1, false);
        this.collects = collects;
        super.__construct(env, resource);
        return null;
    }

    public static final Object CONST_class =
            "Illuminate\\Http\\Resources\\Json\\AnonymousResourceCollection";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ResourceCollection.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Http\\Resources\\Json\\AnonymousResourceCollection")
                    .setLookup(
                            AnonymousResourceCollection.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "additional", "collection", "collects", "collects", "resource", "with")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Http/Resources/Json/AnonymousResourceCollection.php")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
                    .addInterface("ArrayAccess")
                    .addInterface("JsonSerializable")
                    .addInterface("Illuminate\\Contracts\\Support\\Responsable")
                    .addInterface("Illuminate\\Contracts\\Routing\\UrlRoutable")
                    .addExtendsClass("Illuminate\\Http\\Resources\\Json\\ResourceCollection")
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
