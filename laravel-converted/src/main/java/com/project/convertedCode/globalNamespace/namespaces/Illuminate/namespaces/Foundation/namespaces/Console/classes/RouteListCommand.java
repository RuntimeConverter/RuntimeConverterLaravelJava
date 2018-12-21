package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.collect;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Console/RouteListCommand.php

*/

public class RouteListCommand extends Command {

    public Object router = null;

    public Object routes = null;

    public Object headers =
            ZVal.arrayFromList("Domain", "Method", "URI", "Name", "Action", "Middleware");

    public RouteListCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "route:list";
        this.description = "List all registered routes";
        if (this.getClass() == RouteListCommand.class) {
            this.__construct(env, args);
        }
    }

    public RouteListCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "router", typeHint = "Illuminate\\Routing\\Router")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object router = assignParameter(args, 0, false);
        super.__construct(env);
        this.router = router;
        this.routes = env.callMethod(router, "getRoutes", RouteListCommand.class);
        return null;
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(
                function_count.f.env(env).call(this.routes).value(), "===", 0)) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            "error",
                            RouteListCommand.class,
                            "Your application doesn't have any routes."));
        }

        this.displayRoutes(env, this.getRoutes(env));
        return null;
    }

    @ConvertedMethod
    protected Object getRoutes(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Console")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Console/RouteListCommand.php");
        Object routes = null;
        Object sort = null;
        routes =
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(this.routes).value(),
                                "map",
                                RouteListCommand.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Foundation\\Console",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "route")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object route = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                RouteListCommand.this.getRouteInformation(
                                                        env, route));
                                    }
                                }),
                        "all",
                        RouteListCommand.class);
        if (ZVal.isTrue(sort = env.callMethod(this, "option", RouteListCommand.class, "sort"))) {
            routes = this.sortRoutes(env, sort, routes);
        }

        if (ZVal.isTrue(env.callMethod(this, "option", RouteListCommand.class, "reverse"))) {
            routes = function_array_reverse.f.env(env).call(routes).value();
        }

        return ZVal.assign(function_array_filter.f.env(env).call(routes).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route", typeHint = "Illuminate\\Routing\\Route")
    protected Object getRouteInformation(RuntimeEnv env, Object... args) {
        Object route = assignParameter(args, 0, false);
        return ZVal.assign(
                this.filterRoute(
                        env,
                        ZVal.newArray(
                                new ZPair(
                                        "host",
                                        env.callMethod(route, "domain", RouteListCommand.class)),
                                new ZPair(
                                        "method",
                                        NamespaceGlobal.implode
                                                .env(env)
                                                .call(
                                                        "|",
                                                        env.callMethod(
                                                                route,
                                                                "methods",
                                                                RouteListCommand.class))
                                                .value()),
                                new ZPair(
                                        "uri",
                                        env.callMethod(route, "uri", RouteListCommand.class)),
                                new ZPair(
                                        "name",
                                        env.callMethod(route, "getName", RouteListCommand.class)),
                                new ZPair(
                                        "action",
                                        function_ltrim
                                                .f
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                route,
                                                                "getActionName",
                                                                RouteListCommand.class),
                                                        "\\")
                                                .value()),
                                new ZPair("middleware", this.getMiddleware(env, route)))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sort")
    @ConvertedParameter(index = 1, name = "routes")
    protected Object sortRoutes(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Console")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Console/RouteListCommand.php");
        Object sort = assignParameter(args, 0, false);
        Object routes = assignParameter(args, 1, false);
        return ZVal.assign(
                Arr.runtimeStaticObject.sort(
                        env,
                        routes,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Foundation\\Console",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "route")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                ReferenceContainer route =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 0, false));
                                Object sort = null;
                                sort = this.contextReferences.getCapturedValue("sort");
                                return ZVal.assign(route.arrayGet(env, sort));
                            }
                        }.use("sort", sort)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "routes", typeHint = "array")
    protected Object displayRoutes(RuntimeEnv env, Object... args) {
        Object routes = assignParameter(args, 0, false);
        env.callMethod(this, "table", RouteListCommand.class, this.headers, routes);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route")
    protected Object getMiddleware(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Console")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Console/RouteListCommand.php");
        Object route = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                collect.f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        route,
                                                        "gatherMiddleware",
                                                        RouteListCommand.class))
                                        .value(),
                                "map",
                                RouteListCommand.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Foundation\\Console",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "middleware")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object middleware = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                ZVal.isTrue(
                                                                ZVal.checkInstanceType(
                                                                        middleware,
                                                                        Closure.class,
                                                                        "Closure"))
                                                        ? "Closure"
                                                        : middleware);
                                    }
                                }),
                        "implode",
                        RouteListCommand.class,
                        ","));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route", typeHint = "array")
    protected Object filterRoute(RuntimeEnv env, Object... args) {
        ReferenceContainer route = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        env.callMethod(
                                                                this,
                                                                "option",
                                                                RouteListCommand.class,
                                                                "name"))
                                                && ZVal.toBool(
                                                        !ZVal.isTrue(
                                                                Str.runtimeStaticObject.contains(
                                                                        env,
                                                                        route.arrayGet(env, "name"),
                                                                        env.callMethod(
                                                                                this,
                                                                                "option",
                                                                                RouteListCommand
                                                                                        .class,
                                                                                "name")))))
                                || ZVal.toBool(
                                        ZVal.toBool(
                                                        env.callMethod(
                                                                this,
                                                                "option",
                                                                RouteListCommand.class,
                                                                "path"))
                                                && ZVal.toBool(
                                                        !ZVal.isTrue(
                                                                Str.runtimeStaticObject.contains(
                                                                        env,
                                                                        route.arrayGet(env, "uri"),
                                                                        env.callMethod(
                                                                                this,
                                                                                "option",
                                                                                RouteListCommand
                                                                                        .class,
                                                                                "path"))))))
                || ZVal.toBool(
                        ZVal.toBool(
                                        env.callMethod(
                                                this, "option", RouteListCommand.class, "method"))
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                Str.runtimeStaticObject.contains(
                                                        env,
                                                        route.arrayGet(env, "method"),
                                                        NamespaceGlobal.strtoupper
                                                                .env(env)
                                                                .call(
                                                                        env.callMethod(
                                                                                this,
                                                                                "option",
                                                                                RouteListCommand
                                                                                        .class,
                                                                                "method"))
                                                                .value()))))) {
            return null;
        }

        return ZVal.assign(route.getObject());
    }

    @ConvertedMethod
    protected Object getOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.newArray(
                                        new ZPair(0, "method"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_OPTIONAL),
                                        new ZPair(3, "Filter the routes by method."))),
                        new ZPair(
                                1,
                                ZVal.newArray(
                                        new ZPair(0, "name"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_OPTIONAL),
                                        new ZPair(3, "Filter the routes by name."))),
                        new ZPair(
                                2,
                                ZVal.newArray(
                                        new ZPair(0, "path"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_OPTIONAL),
                                        new ZPair(3, "Filter the routes by path."))),
                        new ZPair(
                                3,
                                ZVal.newArray(
                                        new ZPair(0, "reverse"),
                                        new ZPair(1, "r"),
                                        new ZPair(2, InputOption.CONST_VALUE_NONE),
                                        new ZPair(3, "Reverse the ordering of the routes."))),
                        new ZPair(
                                4,
                                ZVal.newArray(
                                        new ZPair(0, "sort"),
                                        new ZPair(1, ZVal.getNull()),
                                        new ZPair(2, InputOption.CONST_VALUE_OPTIONAL),
                                        new ZPair(
                                                3,
                                                "The column (host, method, uri, name, action, middleware) to sort by."),
                                        new ZPair(4, "uri")))));
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Console\\RouteListCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Command.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Console\\RouteListCommand")
                    .setLookup(
                            RouteListCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "code",
                            "definition",
                            "description",
                            "description",
                            "description",
                            "headers",
                            "help",
                            "helperSet",
                            "hidden",
                            "hidden",
                            "ignoreValidationErrors",
                            "input",
                            "laravel",
                            "name",
                            "name",
                            "name",
                            "output",
                            "processTitle",
                            "router",
                            "routes",
                            "signature",
                            "synopsis",
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/RouteListCommand.php")
                    .addExtendsClass("Illuminate\\Console\\Command")
                    .addExtendsClass("Symfony\\Component\\Console\\Command\\Command")
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
