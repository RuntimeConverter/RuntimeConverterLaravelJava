package com.project.convertedCode.globalNamespace.namespaces.App.namespaces.Http.namespaces.Middleware.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.classes.Request;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 app/Http/Middleware/TrustProxies.php

*/

public class TrustProxies
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Fideloper
                .namespaces
                .Proxy
                .classes
                .TrustProxies {

    public TrustProxies(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.proxies = null;
        this.headers = Request.CONST_HEADER_X_FORWARDED_ALL;
        if (this.getClass() == TrustProxies.class) {
            this.__construct(env, args);
        }
    }

    public TrustProxies(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "App\\Http\\Middleware\\TrustProxies";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Fideloper
                    .namespaces
                    .Proxy
                    .classes
                    .TrustProxies
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("App\\Http\\Middleware\\TrustProxies")
                    .setLookup(
                            TrustProxies.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("config", "headers", "headers", "proxies", "proxies")
                    .setFilename("app/Http/Middleware/TrustProxies.php")
                    .addExtendsClass("Fideloper\\Proxy\\TrustProxies")
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
