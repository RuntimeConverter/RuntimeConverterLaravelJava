package com.project.convertedCode.globalNamespace.namespaces.App.namespaces.Providers.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.functions.base_path;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Route;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 app/Providers/RouteServiceProvider.php

*/

public class RouteServiceProvider
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Foundation
                .namespaces
                .Support
                .namespaces
                .Providers
                .classes
                .RouteServiceProvider {

    public RouteServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.namespace = "App\\Http\\Controllers";
        if (this.getClass() == RouteServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public RouteServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object boot(RuntimeEnv env, Object... args) {
        super.boot(env);
        return null;
    }

    @ConvertedMethod
    public Object map(RuntimeEnv env, Object... args) {
        this.mapApiRoutes(env);
        this.mapWebRoutes(env);
        return null;
    }

    @ConvertedMethod
    protected Object mapWebRoutes(RuntimeEnv env, Object... args) {
        env.callMethod(
                env.callMethod(
                        Route.runtimeStaticObject.callUnknownStaticMethod(
                                env, "middleware", new RuntimeArgsWithReferences(), "web"),
                        "namespace",
                        RouteServiceProvider.class,
                        this.namespace),
                "group",
                RouteServiceProvider.class,
                base_path.f.env(env).call("routes/web.php").value());
        return null;
    }

    @ConvertedMethod
    protected Object mapApiRoutes(RuntimeEnv env, Object... args) {
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                Route.runtimeStaticObject.callUnknownStaticMethod(
                                        env, "prefix", new RuntimeArgsWithReferences(), "api"),
                                "middleware",
                                RouteServiceProvider.class,
                                "api"),
                        "namespace",
                        RouteServiceProvider.class,
                        this.namespace),
                "group",
                RouteServiceProvider.class,
                base_path.f.env(env).call("routes/api.php").value());
        return null;
    }

    public static final Object CONST_class = "App\\Providers\\RouteServiceProvider";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Illuminate
                    .namespaces
                    .Foundation
                    .namespaces
                    .Support
                    .namespaces
                    .Providers
                    .classes
                    .RouteServiceProvider
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("App\\Providers\\RouteServiceProvider")
                    .setLookup(
                            RouteServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer", "namespace", "namespace")
                    .setFilename("app/Providers/RouteServiceProvider.php")
                    .addExtendsClass(
                            "Illuminate\\Foundation\\Support\\Providers\\RouteServiceProvider")
                    .addExtendsClass("Illuminate\\Support\\ServiceProvider")
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
