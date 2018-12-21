package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes.MethodNotAllowedHttpException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.Route;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes.NotFoundHttpException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.Router;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.classes.Response;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.functions.collect;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.ArrayIterator;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/RouteCollection.php

*/

public class RouteCollection extends RuntimeClassBase implements Countable, IteratorAggregate {

    public Object routes = ZVal.newArray();

    public Object allRoutes = ZVal.newArray();

    public Object nameList = ZVal.newArray();

    public Object actionList = ZVal.newArray();

    public RouteCollection(RuntimeEnv env, Object... args) {
        super(env);
    }

    public RouteCollection(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route", typeHint = "Illuminate\\Routing\\Route")
    public Object add(RuntimeEnv env, Object... args) {
        Object route = assignParameter(args, 0, false);
        this.addToCollections(env, route);
        this.addLookups(env, route);
        return ZVal.assign(route);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route")
    protected Object addToCollections(RuntimeEnv env, Object... args) {
        Object route = assignParameter(args, 0, false);
        Object method = null;
        Object domainAndUri = null;
        domainAndUri =
                toStringR(env.callMethod(route, "getDomain", RouteCollection.class), env)
                        + toStringR(env.callMethod(route, "uri", RouteCollection.class), env);
        for (ZPair zpairResult523 :
                ZVal.getIterable(
                        env.callMethod(route, "methods", RouteCollection.class), env, true)) {
            method = ZVal.assign(zpairResult523.getValue());
            new ReferenceClassProperty(this, "routes", env)
                    .arrayAccess(env, method, domainAndUri)
                    .set(route);
        }

        new ReferenceClassProperty(this, "allRoutes", env)
                .arrayAccess(env, toStringR(method, env) + toStringR(domainAndUri, env))
                .set(route);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route")
    protected Object addLookups(RuntimeEnv env, Object... args) {
        Object route = assignParameter(args, 0, false);
        ReferenceContainer action = new BasicReferenceContainer(null);
        action.setObject(env.callMethod(route, "getAction", RouteCollection.class));
        if (arrayActionR(ArrayAction.ISSET, action, env, "as")) {
            new ReferenceClassProperty(this, "nameList", env)
                    .arrayAccess(env, action.arrayGet(env, "as"))
                    .set(route);
        }

        if (arrayActionR(ArrayAction.ISSET, action, env, "controller")) {
            this.addToActionList(env, action.getObject(), route);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "action")
    @ConvertedParameter(index = 1, name = "route")
    protected Object addToActionList(RuntimeEnv env, Object... args) {
        ReferenceContainer action = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object route = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "actionList", env)
                .arrayAccess(
                        env,
                        function_trim
                                .f
                                .env(env)
                                .call(action.arrayGet(env, "controller"), "\\")
                                .value())
                .set(route);
        return null;
    }

    @ConvertedMethod
    public Object refreshNameLookups(RuntimeEnv env, Object... args) {
        Object route = null;
        this.nameList = ZVal.newArray();
        for (ZPair zpairResult524 : ZVal.getIterable(this.allRoutes, env, true)) {
            route = ZVal.assign(zpairResult524.getValue());
            if (ZVal.isTrue(env.callMethod(route, "getName", RouteCollection.class))) {
                new ReferenceClassProperty(this, "nameList", env)
                        .arrayAccess(env, env.callMethod(route, "getName", RouteCollection.class))
                        .set(route);
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object refreshActionLookups(RuntimeEnv env, Object... args) {
        Object route = null;
        this.actionList = ZVal.newArray();
        for (ZPair zpairResult525 : ZVal.getIterable(this.allRoutes, env, true)) {
            route = ZVal.assign(zpairResult525.getValue());
            if (arrayActionR(
                    ArrayAction.ISSET,
                    handleReturnReference(
                            env.callMethod(route, "getAction", RouteCollection.class)),
                    env,
                    "controller")) {
                this.addToActionList(
                        env, env.callMethod(route, "getAction", RouteCollection.class), route);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    public Object match(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object routes = null;
        Object route = null;
        Object others = null;
        routes = this.get(env, env.callMethod(request, "getMethod", RouteCollection.class));
        route = this.matchAgainstRoutes(env, routes, request);
        if (!function_is_null.f.env(env).call(route).getBool()) {
            return ZVal.assign(env.callMethod(route, "bind", RouteCollection.class, request));
        }

        others = this.checkForAlternateVerbs(env, request);
        if (ZVal.isGreaterThan(function_count.f.env(env).call(others).value(), '>', 0)) {
            return ZVal.assign(this.getRouteForMethods(env, request, others));
        }

        throw ZVal.getException(env, new NotFoundHttpException(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "routes", typeHint = "array")
    @ConvertedParameter(index = 1, name = "request")
    @ConvertedParameter(
        index = 2,
        name = "includingMethod",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    protected Object matchAgainstRoutes(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Routing/RouteCollection.php");
        Object routes = assignParameter(args, 0, false);
        Object request = assignParameter(args, 1, false);
        Object includingMethod = assignParameter(args, 2, true);
        if (null == includingMethod) {
            includingMethod = true;
        }
        Object fallbacks = null;
        Object runtimeTempArrayResult78 = null;
        ZVal.list(
                runtimeTempArrayResult78 =
                        env.callMethod(
                                collect.f.env(env).call(routes).value(),
                                "partition",
                                RouteCollection.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Routing",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "route")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object route = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                toObjectR(route)
                                                        .accessProp(this, env)
                                                        .name("isFallback")
                                                        .value());
                                    }
                                }),
                (fallbacks = listGet(runtimeTempArrayResult78, 0, env)),
                (routes = listGet(runtimeTempArrayResult78, 1, env)));
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(routes, "merge", RouteCollection.class, fallbacks),
                        "first",
                        RouteCollection.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Routing",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "value")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object value = assignParameter(args, 0, false);
                                Object request = null;
                                Object includingMethod = null;
                                request = this.contextReferences.getCapturedValue("request");
                                includingMethod =
                                        this.contextReferences.getCapturedValue("includingMethod");
                                return ZVal.assign(
                                        env.callMethod(
                                                value,
                                                "matches",
                                                RouteCollection.class,
                                                request,
                                                includingMethod));
                            }
                        }.use("request", request).use("includingMethod", includingMethod)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    protected Object checkForAlternateVerbs(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object method = null;
        Object methods = null;
        ReferenceContainer others = new BasicReferenceContainer(null);
        methods =
                function_array_diff
                        .f
                        .env(env)
                        .call(
                                env.getRequestStaticProperties(Router.RequestStaticProperties.class)
                                        .verbs,
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                env.callMethod(
                                                        request,
                                                        "getMethod",
                                                        RouteCollection.class))))
                        .value();
        others.setObject(ZVal.newArray());
        for (ZPair zpairResult526 : ZVal.getIterable(methods, env, true)) {
            method = ZVal.assign(zpairResult526.getValue());
            if (!function_is_null
                    .f
                    .env(env)
                    .call(this.matchAgainstRoutes(env, this.get(env, method), request, false))
                    .getBool()) {
                others.arrayAppend(env).set(method);
            }
        }

        return ZVal.assign(others.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "methods", typeHint = "array")
    protected Object getRouteForMethods(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Routing/RouteCollection.php");
        Object request = assignParameter(args, 0, false);
        Object methods = assignParameter(args, 1, false);
        if (ZVal.equalityCheck(
                env.callMethod(request, "method", RouteCollection.class), "OPTIONS")) {
            return ZVal.assign(
                    env.callMethod(
                            new Route(
                                    env,
                                    "OPTIONS",
                                    env.callMethod(request, "path", RouteCollection.class),
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
                                            Object methods = null;
                                            methods =
                                                    this.contextReferences.getCapturedValue(
                                                            "methods");
                                            return ZVal.assign(
                                                    new Response(
                                                            env,
                                                            "",
                                                            200,
                                                            ZVal.newArray(
                                                                    new ZPair(
                                                                            "Allow",
                                                                            NamespaceGlobal.implode
                                                                                    .env(env)
                                                                                    .call(
                                                                                            ",",
                                                                                            methods)
                                                                                    .value()))));
                                        }
                                    }.use("methods", methods)),
                            "bind",
                            RouteCollection.class,
                            request));
        }

        this.methodNotAllowed(env, methods);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "others", typeHint = "array")
    protected Object methodNotAllowed(RuntimeEnv env, Object... args) {
        Object others = assignParameter(args, 0, false);
        throw ZVal.getException(env, new MethodNotAllowedHttpException(env, others));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "method",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object get(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, true);
        if (null == method) {
            method = ZVal.getNull();
        }
        return ZVal.assign(
                function_is_null.f.env(env).call(method).getBool()
                        ? this.getRoutes(env)
                        : Arr.runtimeStaticObject.get(env, this.routes, method, ZVal.newArray()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasNamedRoute(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(!function_is_null.f.env(env).call(this.getByName(env, name)).getBool());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getByName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "nameList", env)
                                                .arrayGet(env, name))
                        ? ternaryExpressionTemp
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "action")
    public Object getByAction(RuntimeEnv env, Object... args) {
        Object action = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "actionList", env)
                                                .arrayGet(env, action))
                        ? ternaryExpressionTemp
                        : ZVal.getNull());
    }

    @ConvertedMethod
    public Object getRoutes(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_array_values.f.env(env).call(this.allRoutes).value());
    }

    @ConvertedMethod
    public Object getRoutesByMethod(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.routes);
    }

    @ConvertedMethod
    public Object getRoutesByName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.nameList);
    }

    @ConvertedMethod
    public Object getIterator(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ArrayIterator(env, this.getRoutes(env)));
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_count.f.env(env).call(this.getRoutes(env)).value());
    }

    public static final Object CONST_class = "Illuminate\\Routing\\RouteCollection";

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
                    .setName("Illuminate\\Routing\\RouteCollection")
                    .setLookup(
                            RouteCollection.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("actionList", "allRoutes", "nameList", "routes")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Routing/RouteCollection.php")
                    .addInterface("Countable")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
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
