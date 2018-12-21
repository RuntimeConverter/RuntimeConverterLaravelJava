package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Exception.classes.ResourceNotFoundException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Exception.classes.MethodNotAllowedException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Request;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_replace;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Matcher.classes.UrlMatcherInterface;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Matcher.classes.RequestMatcherInterface;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Exception.classes.NoConfigurationException;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Matcher/UrlMatcher.php

*/

public class UrlMatcher extends RuntimeClassBase
        implements UrlMatcherInterface, RequestMatcherInterface {

    public Object context = null;

    public Object allow = ZVal.newArray();

    public Object allowSchemes = ZVal.newArray();

    public Object routes = null;

    public Object request = null;

    public Object expressionLanguage = null;

    public Object expressionLanguageProviders = ZVal.newArray();

    public UrlMatcher(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == UrlMatcher.class) {
            this.__construct(env, args);
        }
    }

    public UrlMatcher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "routes",
        typeHint = "Symfony\\Component\\Routing\\RouteCollection"
    )
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "Symfony\\Component\\Routing\\RequestContext"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object routes = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, false);
        this.routes = routes;
        this.context = context;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "context",
        typeHint = "Symfony\\Component\\Routing\\RequestContext"
    )
    public Object setContext(RuntimeEnv env, Object... args) {
        Object context = assignParameter(args, 0, false);
        this.context = context;
        return null;
    }

    @ConvertedMethod
    public Object getContext(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.context);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pathinfo")
    public Object match(RuntimeEnv env, Object... args) {
        Object pathinfo = assignParameter(args, 0, false);
        Object ret = null;
        this.allow = this.allowSchemes = ZVal.newArray();
        if (ZVal.isTrue(
                ret =
                        this.matchCollection(
                                env,
                                NamespaceGlobal.rawurldecode.env(env).call(pathinfo).value(),
                                this.routes))) {
            return ZVal.assign(ret);
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck("/", "===", pathinfo))
                && ZVal.toBool(!ZVal.isTrue(this.allow))) {
            throw ZVal.getException(env, new NoConfigurationException(env));
        }

        throw ZVal.getException(
                env,
                ZVal.isLessThan(0, '<', function_count.f.env(env).call(this.allow).value())
                        ? new MethodNotAllowedException(
                                env, function_array_unique.f.env(env).call(this.allow).value())
                        : new ResourceNotFoundException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("No routes found for \"%s\".", pathinfo)
                                        .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    public Object matchRequest(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object ret = null;
        this.request = request;
        ret = this.match(env, env.callMethod(request, "getPathInfo", UrlMatcher.class));
        this.request = ZVal.getNull();
        return ZVal.assign(ret);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "provider",
        typeHint = "Symfony\\Component\\ExpressionLanguage\\ExpressionFunctionProviderInterface"
    )
    public Object addExpressionLanguageProvider(RuntimeEnv env, Object... args) {
        Object provider = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "expressionLanguageProviders", env)
                .arrayAppend(env)
                .set(provider);
        return null;
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
        Object route = null;
        Object requiredMethods = null;
        Object method = null;
        ReferenceContainer hostMatches = new BasicReferenceContainer(null);
        Object hasRequiredScheme = null;
        Object name = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object compiledRoute = null;
        ReferenceContainer status = new BasicReferenceContainer(null);
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2070 : ZVal.getIterable(routes, env, false)) {
            name = ZVal.assign(zpairResult2070.getKey());
            route = ZVal.assign(zpairResult2070.getValue());
            compiledRoute = env.callMethod(route, "compile", UrlMatcher.class);
            if (ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    "",
                                    "!==",
                                    env.callMethod(
                                            compiledRoute, "getStaticPrefix", UrlMatcher.class)))
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    0,
                                    "!==",
                                    function_strpos
                                            .f
                                            .env(env)
                                            .call(
                                                    pathinfo,
                                                    env.callMethod(
                                                            compiledRoute,
                                                            "getStaticPrefix",
                                                            UrlMatcher.class))
                                            .value()))) {
                continue;
            }

            if (!function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(
                            env.callMethod(compiledRoute, "getRegex", UrlMatcher.class),
                            pathinfo,
                            matches.getObject())
                    .getBool()) {
                continue;
            }

            hostMatches.setObject(ZVal.newArray());
            if (ZVal.toBool(env.callMethod(compiledRoute, "getHostRegex", UrlMatcher.class))
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
                                                    UrlMatcher.class),
                                            env.callMethod(
                                                    this.context, "getHost", UrlMatcher.class),
                                            hostMatches.getObject())
                                    .getBool())) {
                continue;
            }

            status.setObject(this.handleRouteRequirements(env, pathinfo, name, route));
            if (ZVal.strictEqualityCheck(
                    CONST_REQUIREMENT_MISMATCH, "===", status.arrayGet(env, 0))) {
                continue;
            }

            hasRequiredScheme =
                    ZVal.toBool(!ZVal.isTrue(env.callMethod(route, "getSchemes", UrlMatcher.class)))
                            || ZVal.toBool(
                                    env.callMethod(
                                            route,
                                            "hasScheme",
                                            UrlMatcher.class,
                                            env.callMethod(
                                                    this.context, "getScheme", UrlMatcher.class)));
            if (ZVal.isTrue(
                    requiredMethods = env.callMethod(route, "getMethods", UrlMatcher.class))) {
                if (ZVal.strictEqualityCheck(
                        "HEAD",
                        "===",
                        method = env.callMethod(this.context, "getMethod", UrlMatcher.class))) {
                    method = "GET";
                }

                if (!function_in_array.f.env(env).call(method, requiredMethods).getBool()) {
                    if (ZVal.isTrue(hasRequiredScheme)) {
                        this.allow =
                                function_array_merge
                                        .f
                                        .env(env)
                                        .call(this.allow, requiredMethods)
                                        .value();
                    }

                    continue;
                }
            }

            if (!ZVal.isTrue(hasRequiredScheme)) {
                this.allowSchemes =
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        this.allowSchemes,
                                        env.callMethod(route, "getSchemes", UrlMatcher.class))
                                .value();
                continue;
            }

            return ZVal.assign(
                    this.getAttributes(
                            env,
                            route,
                            name,
                            function_array_replace
                                    .f
                                    .env(env)
                                    .call(
                                            matches.getObject(),
                                            hostMatches.getObject(),
                                            arrayActionR(ArrayAction.ISSET, status, env, 1)
                                                    ? status.arrayGet(env, 1)
                                                    : ZVal.newArray())
                                    .value()));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route", typeHint = "Symfony\\Component\\Routing\\Route")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(index = 2, name = "attributes", typeHint = "array")
    protected Object getAttributes(RuntimeEnv env, Object... args) {
        Object route = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        ReferenceContainer attributes =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        ReferenceContainer defaults = new BasicReferenceContainer(null);
        defaults.setObject(env.callMethod(route, "getDefaults", UrlMatcher.class));
        if (arrayActionR(ArrayAction.ISSET, defaults, env, "_canonical_route")) {
            name = ZVal.assign(defaults.arrayGet(env, "_canonical_route"));
            arrayActionR(ArrayAction.UNSET, defaults, env, "_canonical_route");
        }

        attributes.arrayAccess(env, "_route").set(name);
        return ZVal.assign(this.mergeDefaults(env, attributes.getObject(), defaults.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pathinfo")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(index = 2, name = "route", typeHint = "Symfony\\Component\\Routing\\Route")
    protected Object handleRouteRequirements(RuntimeEnv env, Object... args) {
        Object pathinfo = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object route = assignParameter(args, 2, false);
        Object ternaryExpressionTemp = null;
        if (ZVal.toBool(env.callMethod(route, "getCondition", UrlMatcher.class))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        this.getExpressionLanguage(env),
                                        "evaluate",
                                        UrlMatcher.class,
                                        env.callMethod(route, "getCondition", UrlMatcher.class),
                                        ZVal.newArray(
                                                new ZPair("context", this.context),
                                                new ZPair(
                                                        "request",
                                                        ZVal.isTrue(
                                                                        ternaryExpressionTemp =
                                                                                this.request)
                                                                ? ternaryExpressionTemp
                                                                : this.createRequest(
                                                                        env, pathinfo))))))) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, CONST_REQUIREMENT_MISMATCH),
                            new ZPair(1, ZVal.getNull())));
        }

        return ZVal.assign(
                ZVal.newArray(new ZPair(0, CONST_REQUIREMENT_MATCH), new ZPair(1, ZVal.getNull())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "params")
    @ConvertedParameter(index = 1, name = "defaults")
    protected Object mergeDefaults(RuntimeEnv env, Object... args) {
        Object params = assignParameter(args, 0, false);
        ReferenceContainer defaults = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object value = null;
        Object key = null;
        for (ZPair zpairResult2071 : ZVal.getIterable(params, env, false)) {
            key = ZVal.assign(zpairResult2071.getKey());
            value = ZVal.assign(zpairResult2071.getValue());
            if (ZVal.toBool(!function_is_int.f.env(env).call(key).getBool())
                    && ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", value))) {
                defaults.arrayAccess(env, key).set(value);
            }
        }

        return ZVal.assign(defaults.getObject());
    }

    @ConvertedMethod
    protected Object getExpressionLanguage(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.expressionLanguage)) {
            if (!function_class_exists
                    .f
                    .env(env)
                    .call("Symfony\\Component\\ExpressionLanguage\\ExpressionLanguage")
                    .getBool()) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                "Unable to use expressions as the Symfony ExpressionLanguage component is not installed."));
            }

            this.expressionLanguage =
                    env.createNew(
                            ZVal.resolveClassAlias(env, "ExpressionLanguage"),
                            ZVal.getNull(),
                            this.expressionLanguageProviders);
        }

        return ZVal.assign(this.expressionLanguage);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pathinfo")
    protected Object createRequest(RuntimeEnv env, Object... args) {
        Object pathinfo = assignParameter(args, 0, false);
        if (!function_class_exists
                .f
                .env(env)
                .call("Symfony\\Component\\HttpFoundation\\Request")
                .getBool()) {
            return ZVal.assign(ZVal.getNull());
        }

        return ZVal.assign(
                Request.runtimeStaticObject.create(
                        env,
                        toStringR(env.callMethod(this.context, "getScheme", UrlMatcher.class), env)
                                + "://"
                                + toStringR(
                                        env.callMethod(this.context, "getHost", UrlMatcher.class),
                                        env)
                                + toStringR(
                                        env.callMethod(
                                                this.context, "getBaseUrl", UrlMatcher.class),
                                        env)
                                + toStringR(pathinfo, env),
                        env.callMethod(this.context, "getMethod", UrlMatcher.class),
                        env.callMethod(this.context, "getParameters", UrlMatcher.class),
                        ZVal.newArray(),
                        ZVal.newArray(),
                        ZVal.newArray(
                                new ZPair(
                                        "SCRIPT_FILENAME",
                                        env.callMethod(
                                                this.context, "getBaseUrl", UrlMatcher.class)),
                                new ZPair(
                                        "SCRIPT_NAME",
                                        env.callMethod(
                                                this.context, "getBaseUrl", UrlMatcher.class)))));
    }

    public static final Object CONST_REQUIREMENT_MATCH = 0;

    public static final Object CONST_REQUIREMENT_MISMATCH = 1;

    public static final Object CONST_ROUTE_MATCH = 2;

    public static final Object CONST_class = "Symfony\\Component\\Routing\\Matcher\\UrlMatcher";

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
                    .setName("Symfony\\Component\\Routing\\Matcher\\UrlMatcher")
                    .setLookup(
                            UrlMatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "allow",
                            "allowSchemes",
                            "context",
                            "expressionLanguage",
                            "expressionLanguageProviders",
                            "request",
                            "routes")
                    .setFilename("vendor/symfony/routing/Matcher/UrlMatcher.php")
                    .addInterface("Symfony\\Component\\Routing\\Matcher\\UrlMatcherInterface")
                    .addInterface("Symfony\\Component\\Routing\\RequestContextAwareInterface")
                    .addInterface("Symfony\\Component\\Routing\\Matcher\\RequestMatcherInterface")
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
