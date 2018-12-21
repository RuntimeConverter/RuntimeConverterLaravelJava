package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.Router;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.View.classes.Factory;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.Redirector;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ServiceProvider;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.UrlGenerator;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/RoutingServiceProvider.php

*/

public class RoutingServiceProvider extends ServiceProvider {

    public RoutingServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RoutingServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public RoutingServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        this.registerRouter(env);
        this.registerUrlGenerator(env);
        this.registerRedirector(env);
        this.registerPsrRequest(env);
        this.registerPsrResponse(env);
        this.registerResponseFactory(env);
        this.registerControllerDispatcher(env);
        return null;
    }

    @ConvertedMethod
    protected Object registerRouter(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Routing/RoutingServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                RoutingServiceProvider.class,
                "router",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Routing", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ReferenceContainer app =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        return ZVal.assign(
                                new Router(env, app.arrayGet(env, "events"), app.getObject()));
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object registerUrlGenerator(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Routing/RoutingServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                RoutingServiceProvider.class,
                "url",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Routing", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ContextConstants runtimeConverterFunctionClassConstants =
                                new ContextConstants()
                                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                                        .setFile(
                                                "/vendor/laravel/framework/src/Illuminate/Routing/RoutingServiceProvider.php");
                        Object _closureThisVar = this.getClosureThisVar();
                        ReferenceContainer app =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        Object routes = null;
                        Object url = null;
                        routes =
                                env.callMethod(
                                        app.arrayGet(env, "router"),
                                        "getRoutes",
                                        RoutingServiceProvider.class);
                        env.callMethod(
                                app.getObject(),
                                "instance",
                                RoutingServiceProvider.class,
                                "routes",
                                routes);
                        url =
                                new UrlGenerator(
                                        env,
                                        routes,
                                        env.callMethod(
                                                app.getObject(),
                                                "rebinding",
                                                RoutingServiceProvider.class,
                                                "request",
                                                RoutingServiceProvider.this.requestRebinder(env)));
                        env.callMethod(
                                url,
                                "setSessionResolver",
                                RoutingServiceProvider.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Routing",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        return ZVal.assign(
                                                new ReferenceClassProperty(
                                                                _closureThisVar, "app", env)
                                                        .arrayGet(env, "session"));
                                    }
                                });
                        env.callMethod(
                                url,
                                "setKeyResolver",
                                RoutingServiceProvider.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Routing",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        return ZVal.assign(
                                                env.callMethod(
                                                        env.callMethod(
                                                                toObjectR(_closureThisVar)
                                                                        .accessProp(this, env)
                                                                        .name("app")
                                                                        .value(),
                                                                "make",
                                                                RoutingServiceProvider.class,
                                                                "config"),
                                                        "get",
                                                        RoutingServiceProvider.class,
                                                        "app.key"));
                                    }
                                });
                        env.callMethod(
                                app.getObject(),
                                "rebinding",
                                RoutingServiceProvider.class,
                                "routes",
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Routing",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "app")
                                    @ConvertedParameter(index = 1, name = "routes")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        ReferenceContainer app =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        Object routes = assignParameter(args, 1, false);
                                        env.callMethod(
                                                app.arrayGet(env, "url"),
                                                "setRoutes",
                                                RoutingServiceProvider.class,
                                                routes);
                                        return null;
                                    }
                                });
                        return ZVal.assign(url);
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object requestRebinder(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Routing/RoutingServiceProvider.php");
        return ZVal.assign(
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Routing", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    @ConvertedParameter(index = 1, name = "request")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ReferenceContainer app =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        Object request = assignParameter(args, 1, false);
                        env.callMethod(
                                app.arrayGet(env, "url"),
                                "setRequest",
                                RoutingServiceProvider.class,
                                request);
                        return null;
                    }
                });
    }

    @ConvertedMethod
    protected Object registerRedirector(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Routing/RoutingServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                RoutingServiceProvider.class,
                "redirect",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Routing", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ReferenceContainer app =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        Object redirector = null;
                        redirector = new Redirector(env, app.arrayGet(env, "url"));
                        if (arrayActionR(ArrayAction.ISSET, app, env, "session.store")) {
                            env.callMethod(
                                    redirector,
                                    "setSession",
                                    RoutingServiceProvider.class,
                                    app.arrayGet(env, "session.store"));
                        }

                        return ZVal.assign(redirector);
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object registerPsrRequest(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Routing/RoutingServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "bind",
                RoutingServiceProvider.class,
                "Psr\\Http\\Message\\ServerRequestInterface",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Routing", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object app = assignParameter(args, 0, false);
                        return ZVal.assign(
                                env.callMethod(
                                        env.createNew(
                                                ZVal.resolveClassAlias(env, "DiactorosFactory")),
                                        "createRequest",
                                        RoutingServiceProvider.class,
                                        env.callMethod(
                                                app,
                                                "make",
                                                RoutingServiceProvider.class,
                                                "request")));
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object registerPsrResponse(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Routing/RoutingServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "bind",
                RoutingServiceProvider.class,
                "Psr\\Http\\Message\\ResponseInterface",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Routing", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object app = assignParameter(args, 0, false);
                        return ZVal.assign(
                                env.createNew(ZVal.resolveClassAlias(env, "PsrResponse")));
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object registerResponseFactory(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Routing/RoutingServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                RoutingServiceProvider.class,
                com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Contracts
                        .namespaces
                        .Routing
                        .classes
                        .ResponseFactory
                        .CONST_class,
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Routing", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ReferenceContainer app =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        return ZVal.assign(
                                new com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Illuminate
                                        .namespaces
                                        .Routing
                                        .classes
                                        .ResponseFactory(
                                        env,
                                        app.arrayGet(env, Factory.CONST_class),
                                        app.arrayGet(env, "redirect")));
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object registerControllerDispatcher(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Routing/RoutingServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                RoutingServiceProvider.class,
                com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Routing
                        .namespaces
                        .Contracts
                        .classes
                        .ControllerDispatcher
                        .CONST_class,
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Routing", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object app = assignParameter(args, 0, false);
                        return ZVal.assign(
                                new com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Illuminate
                                        .namespaces
                                        .Routing
                                        .classes
                                        .ControllerDispatcher(env, app));
                    }
                });
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Routing\\RoutingServiceProvider";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ServiceProvider.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Routing\\RoutingServiceProvider")
                    .setLookup(
                            RoutingServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Routing/RoutingServiceProvider.php")
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
