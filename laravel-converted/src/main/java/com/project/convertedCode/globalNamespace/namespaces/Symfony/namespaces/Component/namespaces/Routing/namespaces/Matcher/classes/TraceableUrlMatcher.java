package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Exception.classes.ExceptionInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Matcher.classes.UrlMatcher;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.Route;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Matcher/TraceableUrlMatcher.php

*/

public class TraceableUrlMatcher extends UrlMatcher {

    public Object traces = null;

    public TraceableUrlMatcher(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TraceableUrlMatcher.class) {
            this.__construct(env, args);
        }
    }

    public TraceableUrlMatcher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pathinfo")
    public Object getTraces(RuntimeEnv env, Object... args) {
        ReferenceContainer pathinfo = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object e = null;
        this.traces = ZVal.newArray();
        try {
            env.callMethod(
                    this,
                    new RuntimeArgsWithReferences().add(0, pathinfo),
                    "match",
                    TraceableUrlMatcher.class,
                    pathinfo.getObject());
        } catch (ConvertedException convertedException307) {
            if (convertedException307.instanceOf(
                    ExceptionInterface.class,
                    "Symfony\\Component\\Routing\\Exception\\ExceptionInterface")) {
                e = convertedException307.getObject();
            } else {
                throw convertedException307;
            }
        }

        return ZVal.assign(this.traces);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    public Object getTracesForRequest(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object traces = null;
        toObjectR(this).accessProp(this, env).name("request").set(request);
        traces =
                this.getTraces(
                        env, env.callMethod(request, "getPathInfo", TraceableUrlMatcher.class));
        toObjectR(this).accessProp(this, env).name("request").set(ZVal.getNull());
        return ZVal.assign(traces);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pathinfo")
    @ConvertedParameter(
        index = 1,
        name = "routes",
        typeHint = "Symfony\\Component\\Routing\\RouteCollection"
    )
    protected Object matchCollection(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object pathinfo = assignParameter(args, 0, false);
        Object routes = assignParameter(args, 1, false);
        Object method = null;
        Object scheme = null;
        Object ternaryExpressionTemp = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object compiledRoute = null;
        Object n = null;
        Object cr = null;
        Object r = null;
        Object regex = null;
        Object condition = null;
        Object route = null;
        Object requiredMethods = null;
        ReferenceContainer hostMatches = new BasicReferenceContainer(null);
        Object name = null;
        Object requiredSchemes = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2068 : ZVal.getIterable(routes, env, false)) {
            name = ZVal.assign(zpairResult2068.getKey());
            route = ZVal.assign(zpairResult2068.getValue());
            compiledRoute = env.callMethod(route, "compile", TraceableUrlMatcher.class);
            if (!function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(
                            env.callMethod(compiledRoute, "getRegex", TraceableUrlMatcher.class),
                            pathinfo,
                            matches.getObject())
                    .getBool()) {
                r =
                        new Route(
                                env,
                                env.callMethod(route, "getPath", TraceableUrlMatcher.class),
                                env.callMethod(route, "getDefaults", TraceableUrlMatcher.class),
                                ZVal.newArray(),
                                env.callMethod(route, "getOptions", TraceableUrlMatcher.class));
                cr = env.callMethod(r, "compile", TraceableUrlMatcher.class);
                if (!function_preg_match
                        .f
                        .env(env)
                        .call(env.callMethod(cr, "getRegex", TraceableUrlMatcher.class), pathinfo)
                        .getBool()) {
                    this.addTrace(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Path \"%s\" does not match",
                                            env.callMethod(
                                                    route, "getPath", TraceableUrlMatcher.class))
                                    .value(),
                            CONST_ROUTE_DOES_NOT_MATCH,
                            name,
                            route);
                    continue;
                }

                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult2069 :
                        ZVal.getIterable(
                                env.callMethod(route, "getRequirements", TraceableUrlMatcher.class),
                                env,
                                false)) {
                    n = ZVal.assign(zpairResult2069.getKey());
                    regex = ZVal.assign(zpairResult2069.getValue());
                    r =
                            new Route(
                                    env,
                                    env.callMethod(route, "getPath", TraceableUrlMatcher.class),
                                    env.callMethod(route, "getDefaults", TraceableUrlMatcher.class),
                                    ZVal.newArray(new ZPair(n, regex)),
                                    env.callMethod(route, "getOptions", TraceableUrlMatcher.class));
                    cr = env.callMethod(r, "compile", TraceableUrlMatcher.class);
                    if (ZVal.toBool(
                                    function_in_array
                                            .f
                                            .env(env)
                                            .call(
                                                    n,
                                                    env.callMethod(
                                                            cr,
                                                            "getVariables",
                                                            TraceableUrlMatcher.class))
                                            .value())
                            && ZVal.toBool(
                                    !function_preg_match
                                            .f
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            cr,
                                                            "getRegex",
                                                            TraceableUrlMatcher.class),
                                                    pathinfo)
                                            .getBool())) {
                        this.addTrace(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Requirement for \"%s\" does not match (%s)",
                                                n, regex)
                                        .value(),
                                CONST_ROUTE_ALMOST_MATCHES,
                                name,
                                route);
                        runtimeConverterContinueCount = 2;
                        runtimeConverterContinueCount--;
                        continue;
                    }
                }

                continue;
            }

            hostMatches.setObject(ZVal.newArray());
            if (ZVal.toBool(
                            env.callMethod(
                                    compiledRoute, "getHostRegex", TraceableUrlMatcher.class))
                    && ZVal.toBool(
                            !function_preg_match
                                    .f
                                    .env(env)
                                    .addReferenceArgs(
                                            new RuntimeArgsWithReferences().add(2, hostMatches))
                                    .call(
                                            env.callMethod(
                                                    compiledRoute,
                                                    "getHostRegex",
                                                    TraceableUrlMatcher.class),
                                            env.callMethod(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("context")
                                                            .value(),
                                                    "getHost",
                                                    TraceableUrlMatcher.class),
                                            hostMatches.getObject())
                                    .getBool())) {
                this.addTrace(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Host \"%s\" does not match the requirement (\"%s\")",
                                        env.callMethod(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("context")
                                                        .value(),
                                                "getHost",
                                                TraceableUrlMatcher.class),
                                        env.callMethod(route, "getHost", TraceableUrlMatcher.class))
                                .value(),
                        CONST_ROUTE_ALMOST_MATCHES,
                        name,
                        route);
                continue;
            }

            if (ZVal.isTrue(
                    requiredMethods =
                            env.callMethod(route, "getMethods", TraceableUrlMatcher.class))) {
                if (ZVal.strictEqualityCheck(
                        "HEAD",
                        "===",
                        method =
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("context")
                                                .value(),
                                        "getMethod",
                                        TraceableUrlMatcher.class))) {
                    method = "GET";
                }

                if (!function_in_array.f.env(env).call(method, requiredMethods).getBool()) {
                    toObjectR(this)
                            .accessProp(this, env)
                            .name("allow")
                            .set(
                                    function_array_merge
                                            .f
                                            .env(env)
                                            .call(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("allow")
                                                            .value(),
                                                    requiredMethods)
                                            .value());
                    this.addTrace(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Method \"%s\" does not match any of the required methods (%s)",
                                            env.callMethod(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("context")
                                                            .value(),
                                                    "getMethod",
                                                    TraceableUrlMatcher.class),
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(", ", requiredMethods)
                                                    .value())
                                    .value(),
                            CONST_ROUTE_ALMOST_MATCHES,
                            name,
                            route);
                    continue;
                }
            }

            if (ZVal.isTrue(
                    condition = env.callMethod(route, "getCondition", TraceableUrlMatcher.class))) {
                if (!ZVal.isTrue(
                        env.callMethod(
                                env.callMethod(
                                        this, "getExpressionLanguage", TraceableUrlMatcher.class),
                                "evaluate",
                                TraceableUrlMatcher.class,
                                condition,
                                ZVal.newArray(
                                        new ZPair(
                                                "context",
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("context")
                                                        .value()),
                                        new ZPair(
                                                "request",
                                                ZVal.isTrue(
                                                                ternaryExpressionTemp =
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("request")
                                                                                .value())
                                                        ? ternaryExpressionTemp
                                                        : env.callMethod(
                                                                this,
                                                                "createRequest",
                                                                TraceableUrlMatcher.class,
                                                                pathinfo)))))) {
                    this.addTrace(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Condition \"%s\" does not evaluate to \"true\"",
                                            condition)
                                    .value(),
                            CONST_ROUTE_ALMOST_MATCHES,
                            name,
                            route);
                    continue;
                }
            }

            if (ZVal.isTrue(
                    requiredSchemes =
                            env.callMethod(route, "getSchemes", TraceableUrlMatcher.class))) {
                scheme =
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("context").value(),
                                "getScheme",
                                TraceableUrlMatcher.class);
                if (!ZVal.isTrue(
                        env.callMethod(route, "hasScheme", TraceableUrlMatcher.class, scheme))) {
                    this.addTrace(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Scheme \"%s\" does not match any of the required schemes (%s); the user will be redirected to first required scheme",
                                            scheme,
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(", ", requiredSchemes)
                                                    .value())
                                    .value(),
                            CONST_ROUTE_ALMOST_MATCHES,
                            name,
                            route);
                    return ZVal.assign(true);
                }
            }

            this.addTrace(env, "Route matches!", CONST_ROUTE_MATCHES, name, route);
            return ZVal.assign(true);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "log")
    @ConvertedParameter(index = 1, name = "level")
    @ConvertedParameter(
        index = 2,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "route",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    private Object addTrace(RuntimeEnv env, Object... args) {
        Object log = assignParameter(args, 0, false);
        Object level = assignParameter(args, 1, true);
        if (null == level) {
            level = CONST_ROUTE_DOES_NOT_MATCH;
        }
        Object name = assignParameter(args, 2, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object route = assignParameter(args, 3, true);
        if (null == route) {
            route = ZVal.getNull();
        }
        new ReferenceClassProperty(this, "traces", env)
                .arrayAppend(env)
                .set(
                        ZVal.newArray(
                                new ZPair("log", log),
                                new ZPair("name", name),
                                new ZPair("level", level),
                                new ZPair(
                                        "path",
                                        ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", route)
                                                ? env.callMethod(
                                                        route, "getPath", TraceableUrlMatcher.class)
                                                : ZVal.getNull())));
        return null;
    }

    public static final Object CONST_ROUTE_DOES_NOT_MATCH = 0;

    public static final Object CONST_ROUTE_ALMOST_MATCHES = 1;

    public static final Object CONST_ROUTE_MATCHES = 2;

    public static final Object CONST_class =
            "Symfony\\Component\\Routing\\Matcher\\TraceableUrlMatcher";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends UrlMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Routing\\Matcher\\TraceableUrlMatcher")
                    .setLookup(
                            TraceableUrlMatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "allow",
                            "allowSchemes",
                            "context",
                            "expressionLanguage",
                            "expressionLanguageProviders",
                            "request",
                            "routes",
                            "traces")
                    .setFilename("vendor/symfony/routing/Matcher/TraceableUrlMatcher.php")
                    .addInterface("Symfony\\Component\\Routing\\Matcher\\UrlMatcherInterface")
                    .addInterface("Symfony\\Component\\Routing\\RequestContextAwareInterface")
                    .addInterface("Symfony\\Component\\Routing\\Matcher\\RequestMatcherInterface")
                    .addExtendsClass("Symfony\\Component\\Routing\\Matcher\\UrlMatcher")
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
