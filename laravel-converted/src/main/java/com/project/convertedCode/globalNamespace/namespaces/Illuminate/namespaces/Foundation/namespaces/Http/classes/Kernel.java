package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Http.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Facade;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.namespaces.Middleware.classes.AuthenticateSession;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Debug.classes.ExceptionHandler;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_search;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Bootstrap.classes.RegisterProviders;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Middleware.classes.Authenticate;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Bootstrap.classes.LoadConfiguration;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Bootstrap.classes.RegisterFacades;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.FatalThrowableError;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Bootstrap.classes.HandleExceptions;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Http.namespaces.Events.classes.RequestHandled;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.namespaces.Middleware.classes.SubstituteBindings;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.namespaces.Middleware.classes.StartSession;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pad;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Middleware.classes.Authorize;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.Pipeline;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Bootstrap.classes.LoadEnvironmentVariables;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.namespaces.Middleware.classes.ShareErrorsFromSession;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Bootstrap.classes.BootProviders;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Http/Kernel.php

*/

public class Kernel extends RuntimeClassBase
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Contracts
                .namespaces
                .Http
                .classes
                .Kernel {

    public Object app = null;

    public Object router = null;

    public Object bootstrappers =
            ZVal.newArray(
                    new ZPair(0, LoadEnvironmentVariables.CONST_class),
                    new ZPair(1, LoadConfiguration.CONST_class),
                    new ZPair(2, HandleExceptions.CONST_class),
                    new ZPair(3, RegisterFacades.CONST_class),
                    new ZPair(4, RegisterProviders.CONST_class),
                    new ZPair(5, BootProviders.CONST_class));

    public Object middleware = ZVal.newArray();

    public Object middlewareGroups = ZVal.newArray();

    public Object routeMiddleware = ZVal.newArray();

    public Object middlewarePriority =
            ZVal.newArray(
                    new ZPair(0, StartSession.CONST_class),
                    new ZPair(1, ShareErrorsFromSession.CONST_class),
                    new ZPair(2, Authenticate.CONST_class),
                    new ZPair(3, AuthenticateSession.CONST_class),
                    new ZPair(4, SubstituteBindings.CONST_class),
                    new ZPair(5, Authorize.CONST_class));

    public Kernel(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Kernel.class) {
            this.__construct(env, args);
        }
    }

    public Kernel(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "app",
        typeHint = "Illuminate\\Contracts\\Foundation\\Application"
    )
    @ConvertedParameter(index = 1, name = "router", typeHint = "Illuminate\\Routing\\Router")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object app = assignParameter(args, 0, false);
        Object router = assignParameter(args, 1, false);
        Object key = null;
        Object middleware = null;
        this.app = app;
        this.router = router;
        toObjectR(router)
                .accessProp(this, env)
                .name("middlewarePriority")
                .set(this.middlewarePriority);
        for (ZPair zpairResult416 : ZVal.getIterable(this.middlewareGroups, env, false)) {
            key = ZVal.assign(zpairResult416.getKey());
            middleware = ZVal.assign(zpairResult416.getValue());
            env.callMethod(router, "middlewareGroup", Kernel.class, key, middleware);
        }

        for (ZPair zpairResult417 : ZVal.getIterable(this.routeMiddleware, env, false)) {
            key = ZVal.assign(zpairResult417.getKey());
            middleware = ZVal.assign(zpairResult417.getValue());
            env.callMethod(router, "aliasMiddleware", Kernel.class, key, middleware);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    public Object handle(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object e = null;
        Object response = null;
        try {
            env.callMethod(request, "enableHttpMethodParameterOverride", Kernel.class);
            response = this.sendRequestThroughRouter(env, request);
        } catch (ConvertedException convertedException43) {
            if (convertedException43.instanceOf(PHPException.class, "Exception")) {
                e = convertedException43.getObject();
                this.reportException(env, e);
                response = this.renderException(env, request, e);
            } else if (convertedException43.instanceOf(Throwable.class, "Throwable")) {
                e = convertedException43.getObject();
                this.reportException(env, e = new FatalThrowableError(env, e));
                response = this.renderException(env, request, e);
            } else {
                throw convertedException43;
            }
        }

        env.callMethod(
                new ReferenceClassProperty(this, "app", env).arrayGet(env, "events"),
                "dispatch",
                Kernel.class,
                new RequestHandled(env, request, response));
        return ZVal.assign(response);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    protected Object sendRequestThroughRouter(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        env.callMethod(this.app, "instance", Kernel.class, "request", request);
        Facade.runtimeStaticObject.clearResolvedInstance(env, "request");
        this.bootstrap(env);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        new Pipeline(env, this.app), "send", Kernel.class, request),
                                "through",
                                Kernel.class,
                                ZVal.isTrue(
                                                env.callMethod(
                                                        this.app,
                                                        "shouldSkipMiddleware",
                                                        Kernel.class))
                                        ? ZVal.newArray()
                                        : this.middleware),
                        "then",
                        Kernel.class,
                        this.dispatchToRouter(env)));
    }

    @ConvertedMethod
    public Object bootstrap(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(env.callMethod(this.app, "hasBeenBootstrapped", Kernel.class))) {
            env.callMethod(this.app, "bootstrapWith", Kernel.class, this.bootstrappers(env));
        }

        return null;
    }

    @ConvertedMethod
    protected Object dispatchToRouter(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Http")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Http/Kernel.php");
        return ZVal.assign(
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Foundation\\Http",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "request")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object request = assignParameter(args, 0, false);
                        env.callMethod(
                                Kernel.this.app, "instance", Kernel.class, "request", request);
                        return ZVal.assign(
                                env.callMethod(
                                        Kernel.this.router, "dispatch", Kernel.class, request));
                    }
                });
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "response")
    public Object terminate(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        this.terminateMiddleware(env, request, response);
        env.callMethod(this.app, "terminate", Kernel.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "response")
    protected Object terminateMiddleware(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object request = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        Object runtimeTempArrayResult62 = null;
        Object instance = null;
        Object middlewares = null;
        Object name = null;
        Object middleware = null;
        middlewares =
                ZVal.assign(
                        ZVal.isTrue(env.callMethod(this.app, "shouldSkipMiddleware", Kernel.class))
                                ? ZVal.newArray()
                                : function_array_merge
                                        .f
                                        .env(env)
                                        .call(
                                                this.gatherRouteMiddleware(env, request),
                                                this.middleware)
                                        .value());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult418 : ZVal.getIterable(middlewares, env, true)) {
            middleware = ZVal.assign(zpairResult418.getValue());
            if (!function_is_string.f.env(env).call(middleware).getBool()) {
                continue;
            }

            ZVal.list(
                    runtimeTempArrayResult62 = this.parseMiddleware(env, middleware),
                    (name = listGet(runtimeTempArrayResult62, 0, env)));
            instance = env.callMethod(this.app, "make", Kernel.class, name);
            if (function_method_exists.f.env(env).call(instance, "terminate").getBool()) {
                env.callMethod(instance, "terminate", Kernel.class, request, response);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    protected Object gatherRouteMiddleware(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object route = null;
        if (ZVal.isTrue(route = env.callMethod(request, "route", Kernel.class))) {
            return ZVal.assign(
                    env.callMethod(this.router, "gatherRouteMiddleware", Kernel.class, route));
        }

        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "middleware")
    protected Object parseMiddleware(RuntimeEnv env, Object... args) {
        Object middleware = assignParameter(args, 0, false);
        Object runtimeTempArrayResult63 = null;
        Object name = null;
        Object parameters = null;
        ZVal.list(
                runtimeTempArrayResult63 =
                        function_array_pad
                                .f
                                .env(env)
                                .call(
                                        function_explode
                                                .f
                                                .env(env)
                                                .call(":", middleware, 2)
                                                .value(),
                                        2,
                                        ZVal.newArray())
                                .value(),
                (name = listGet(runtimeTempArrayResult63, 0, env)),
                (parameters = listGet(runtimeTempArrayResult63, 1, env)));
        if (function_is_string.f.env(env).call(parameters).getBool()) {
            parameters = function_explode.f.env(env).call(",", parameters).value();
        }

        return ZVal.assign(ZVal.newArray(new ZPair(0, name), new ZPair(1, parameters)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "middleware")
    public Object hasMiddleware(RuntimeEnv env, Object... args) {
        Object middleware = assignParameter(args, 0, false);
        return ZVal.assign(function_in_array.f.env(env).call(middleware, this.middleware).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "middleware")
    public Object prependMiddleware(RuntimeEnv env, Object... args) {
        Object middleware = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(
                function_array_search.f.env(env).call(middleware, this.middleware).value(),
                "===",
                false)) {
            function_array_unshift.f.env(env).call(this.middleware, middleware);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "middleware")
    public Object pushMiddleware(RuntimeEnv env, Object... args) {
        Object middleware = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(
                function_array_search.f.env(env).call(middleware, this.middleware).value(),
                "===",
                false)) {
            new ReferenceClassProperty(this, "middleware", env).arrayAppend(env).set(middleware);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    protected Object bootstrappers(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.bootstrappers);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    protected Object reportException(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        env.callMethod(
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(env, ExceptionHandler.CONST_class),
                "report",
                Kernel.class,
                e);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "e", typeHint = "Exception")
    protected Object renderException(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object e = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        new ReferenceClassProperty(this, "app", env)
                                .arrayGet(env, ExceptionHandler.CONST_class),
                        "render",
                        Kernel.class,
                        request,
                        e));
    }

    @ConvertedMethod
    public Object getApplication(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.app);
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Http\\Kernel";

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
                    .setName("Illuminate\\Foundation\\Http\\Kernel")
                    .setLookup(
                            Kernel.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "app",
                            "bootstrappers",
                            "middleware",
                            "middlewareGroups",
                            "middlewarePriority",
                            "routeMiddleware",
                            "router")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Http/Kernel.php")
                    .addInterface("Illuminate\\Contracts\\Http\\Kernel")
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
