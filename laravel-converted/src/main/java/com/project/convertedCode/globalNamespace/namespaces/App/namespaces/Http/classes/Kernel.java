package com.project.convertedCode.globalNamespace.namespaces.App.namespaces.Http.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.namespaces.Middleware.classes.ValidateSignature;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.App.namespaces.Http.namespaces.Middleware.classes.EncryptCookies;
import com.project.convertedCode.globalNamespace.namespaces.App.namespaces.Http.namespaces.Middleware.classes.RedirectIfAuthenticated;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Middleware.classes.AuthenticateWithBasicAuth;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Middleware.classes.Authenticate;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Middleware.classes.SetCacheHeaders;
import com.project.convertedCode.globalNamespace.namespaces.App.namespaces.Http.namespaces.Middleware.classes.TrimStrings;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Http.namespaces.Middleware.classes.CheckForMaintenanceMode;
import com.project.convertedCode.globalNamespace.namespaces.App.namespaces.Http.namespaces.Middleware.classes.VerifyCsrfToken;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Http.namespaces.Middleware.classes.ValidatePostSize;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.namespaces.Middleware.classes.SubstituteBindings;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.namespaces.Middleware.classes.StartSession;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Middleware.classes.Authorize;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.namespaces.Middleware.classes.ThrottleRequests;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.namespaces.Middleware.classes.ShareErrorsFromSession;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cookie.namespaces.Middleware.classes.AddQueuedCookiesToResponse;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Http.namespaces.Middleware.classes.ConvertEmptyStringsToNull;
import com.project.convertedCode.globalNamespace.namespaces.App.namespaces.Http.namespaces.Middleware.classes.TrustProxies;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 app/Http/Kernel.php

*/

public class Kernel
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Foundation
                .namespaces
                .Http
                .classes
                .Kernel {

    public Kernel(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.middleware =
                ZVal.newArray(
                        new ZPair(0, CheckForMaintenanceMode.CONST_class),
                        new ZPair(1, ValidatePostSize.CONST_class),
                        new ZPair(2, TrimStrings.CONST_class),
                        new ZPair(3, ConvertEmptyStringsToNull.CONST_class),
                        new ZPair(4, TrustProxies.CONST_class));
        this.middlewareGroups =
                ZVal.newArray(
                        new ZPair(
                                "web",
                                ZVal.newArray(
                                        new ZPair(0, EncryptCookies.CONST_class),
                                        new ZPair(1, AddQueuedCookiesToResponse.CONST_class),
                                        new ZPair(2, StartSession.CONST_class),
                                        new ZPair(3, ShareErrorsFromSession.CONST_class),
                                        new ZPair(4, VerifyCsrfToken.CONST_class),
                                        new ZPair(5, SubstituteBindings.CONST_class))),
                        new ZPair("api", ZVal.arrayFromList("throttle:60,1", "bindings")));
        this.routeMiddleware =
                ZVal.newArray(
                        new ZPair("auth", Authenticate.CONST_class),
                        new ZPair("auth.basic", AuthenticateWithBasicAuth.CONST_class),
                        new ZPair("bindings", SubstituteBindings.CONST_class),
                        new ZPair("cache.headers", SetCacheHeaders.CONST_class),
                        new ZPair("can", Authorize.CONST_class),
                        new ZPair("guest", RedirectIfAuthenticated.CONST_class),
                        new ZPair("signed", ValidateSignature.CONST_class),
                        new ZPair("throttle", ThrottleRequests.CONST_class));
        if (this.getClass() == Kernel.class) {
            this.__construct(env, args);
        }
    }

    public Kernel(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "App\\Http\\Kernel";

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
                    .Http
                    .classes
                    .Kernel
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("App\\Http\\Kernel")
                    .setLookup(
                            Kernel.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "app",
                            "bootstrappers",
                            "middleware",
                            "middleware",
                            "middlewareGroups",
                            "middlewareGroups",
                            "middlewarePriority",
                            "routeMiddleware",
                            "routeMiddleware",
                            "router")
                    .setFilename("app/Http/Kernel.php")
                    .addInterface("Illuminate\\Contracts\\Http\\Kernel")
                    .addExtendsClass("Illuminate\\Foundation\\Http\\Kernel")
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
