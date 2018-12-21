package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.namespaces.Exceptions.classes.UrlGenerationException;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/RouteUrlGenerator.php

*/

public class RouteUrlGenerator extends RuntimeClassBase {

    public Object url = null;

    public Object request = null;

    public Object defaultParameters = ZVal.newArray();

    public Object dontEncode =
            ZVal.newArray(
                    new ZPair("%2F", "/"),
                    new ZPair("%40", "@"),
                    new ZPair("%3A", ":"),
                    new ZPair("%3B", ";"),
                    new ZPair("%2C", ","),
                    new ZPair("%3D", "="),
                    new ZPair("%2B", "+"),
                    new ZPair("%21", "!"),
                    new ZPair("%2A", "*"),
                    new ZPair("%7C", "|"),
                    new ZPair("%3F", "?"),
                    new ZPair("%26", "&"),
                    new ZPair("%23", "#"),
                    new ZPair("%25", "%"));

    public RouteUrlGenerator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RouteUrlGenerator.class) {
            this.__construct(env, args);
        }
    }

    public RouteUrlGenerator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "url")
    @ConvertedParameter(index = 1, name = "request")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object url = assignParameter(args, 0, false);
        Object request = assignParameter(args, 1, false);
        this.url = url;
        this.request = request;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "absolute",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object to(RuntimeEnv env, Object... args) {
        Object route = assignParameter(args, 0, false);
        ReferenceContainer parameters = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == parameters.getObject()) {
            parameters.setObject(ZVal.newArray());
        }
        Object absolute = assignParameter(args, 2, true);
        if (null == absolute) {
            absolute = false;
        }
        Object domain = null;
        Object uri = null;
        Object base = null;
        domain =
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(1, parameters),
                        "getRouteDomain",
                        RouteUrlGenerator.class,
                        route,
                        parameters.getObject());
        uri =
                this.addQueryString(
                        env,
                        env.callMethod(
                                this.url,
                                "format",
                                RouteUrlGenerator.class,
                                env.callMethod(
                                        this,
                                        new RuntimeArgsWithReferences().add(2, parameters),
                                        "replaceRootParameters",
                                        RouteUrlGenerator.class,
                                        route,
                                        domain,
                                        parameters.getObject()),
                                env.callMethod(
                                        this,
                                        new RuntimeArgsWithReferences().add(1, parameters),
                                        "replaceRouteParameters",
                                        RouteUrlGenerator.class,
                                        env.callMethod(route, "uri", RouteUrlGenerator.class),
                                        parameters.getObject())),
                        parameters.getObject());
        if (function_preg_match.f.env(env).call("/\\{.*?\\}/", uri).getBool()) {
            throw ZVal.getException(
                    env,
                    UrlGenerationException.runtimeStaticObject.forMissingParameters(env, route));
        }

        uri =
                NamespaceGlobal.strtr
                        .env(env)
                        .call(
                                NamespaceGlobal.rawurlencode.env(env).call(uri).value(),
                                this.dontEncode)
                        .value();
        if (!ZVal.isTrue(absolute)) {
            uri = function_preg_replace.f.env(env).call("#^(//|[^/?])+#", "", uri).value();
            if (ZVal.isTrue(
                    base = env.callMethod(this.request, "getBaseUrl", RouteUrlGenerator.class))) {
                uri =
                        function_preg_replace
                                .f
                                .env(env)
                                .call("#^" + toStringR(base, env) + "#i", "", uri)
                                .value();
            }

            return ZVal.assign(
                    "/" + toStringR(function_ltrim.f.env(env).call(uri, "/").value(), env));
        }

        return ZVal.assign(uri);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route")
    @ConvertedParameter(index = 1, name = "parameters")
    protected Object getRouteDomain(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object route = assignParameter(args, 0, false);
        ReferenceContainer parameters =
                assignParameterRef(runtimePassByReferenceArgs, args, 1, false);
        return ZVal.assign(
                ZVal.isTrue(env.callMethod(route, "getDomain", RouteUrlGenerator.class))
                        ? env.callMethod(
                                this,
                                new RuntimeArgsWithReferences().add(1, parameters),
                                "formatDomain",
                                RouteUrlGenerator.class,
                                route,
                                parameters.getObject())
                        : ZVal.getNull());
    }

    public Object getRouteDomain(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route")
    @ConvertedParameter(index = 1, name = "parameters")
    protected Object formatDomain(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object route = assignParameter(args, 0, false);
        ReferenceContainer parameters =
                assignParameterRef(runtimePassByReferenceArgs, args, 1, false);
        return ZVal.assign(
                this.addPortToDomain(
                        env,
                        toStringR(this.getRouteScheme(env, route), env)
                                + toStringR(
                                        env.callMethod(route, "getDomain", RouteUrlGenerator.class),
                                        env)));
    }

    public Object formatDomain(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route")
    protected Object getRouteScheme(RuntimeEnv env, Object... args) {
        Object route = assignParameter(args, 0, false);
        if (ZVal.isTrue(env.callMethod(route, "httpOnly", RouteUrlGenerator.class))) {
            return "http://";

        } else if (ZVal.isTrue(env.callMethod(route, "httpsOnly", RouteUrlGenerator.class))) {
            return "https://";
        }

        return ZVal.assign(
                env.callMethod(this.url, "formatScheme", RouteUrlGenerator.class, ZVal.getNull()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "domain")
    protected Object addPortToDomain(RuntimeEnv env, Object... args) {
        Object domain = assignParameter(args, 0, false);
        Object port = null;
        Object secure = null;
        secure = env.callMethod(this.request, "isSecure", RouteUrlGenerator.class);
        port =
                ZVal.assign(
                        ZVal.toLong(
                                env.callMethod(this.request, "getPort", RouteUrlGenerator.class)));
        return ZVal.assign(
                ZVal.toBool(
                                        ZVal.toBool(secure)
                                                && ZVal.toBool(
                                                        ZVal.strictEqualityCheck(port, "===", 443)))
                                || ZVal.toBool(
                                        ZVal.toBool(!ZVal.isTrue(secure))
                                                && ZVal.toBool(
                                                        ZVal.strictEqualityCheck(port, "===", 80)))
                        ? domain
                        : toStringR(domain, env) + ":" + toStringR(port, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route")
    @ConvertedParameter(index = 1, name = "domain")
    @ConvertedParameter(index = 2, name = "parameters")
    protected Object replaceRootParameters(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object route = assignParameter(args, 0, false);
        Object domain = assignParameter(args, 1, false);
        ReferenceContainer parameters =
                assignParameterRef(runtimePassByReferenceArgs, args, 2, false);
        Object scheme = null;
        scheme = this.getRouteScheme(env, route);
        return ZVal.assign(
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(1, parameters),
                        "replaceRouteParameters",
                        RouteUrlGenerator.class,
                        env.callMethod(
                                this.url, "formatRoot", RouteUrlGenerator.class, scheme, domain),
                        parameters.getObject()));
    }

    public Object replaceRootParameters(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "parameters", typeHint = "array")
    protected Object replaceRouteParameters(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Routing/RouteUrlGenerator.php");
        Object path = assignParameter(args, 0, false);
        ReferenceContainer parameters =
                assignParameterRef(runtimePassByReferenceArgs, args, 1, false);
        path =
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(1, parameters),
                        "replaceNamedParameters",
                        RouteUrlGenerator.class,
                        path,
                        parameters.getObject());
        path =
                NamespaceGlobal.preg_replace_callback
                        .env(env)
                        .call(
                                "/\\{.*?\\}/",
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Routing",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "match")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        ReferenceContainer match =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        ReferenceContainer parameters =
                                                new BasicReferenceContainer(null);
                                        parameters =
                                                this.contextReferences.getReferenceContainer(
                                                        "parameters");
                                        return ZVal.assign(
                                                ZVal.toBool(ZVal.isEmpty(parameters.getObject()))
                                                                && ZVal.toBool(
                                                                        !ZVal.isTrue(
                                                                                Str
                                                                                        .runtimeStaticObject
                                                                                        .endsWith(
                                                                                                env,
                                                                                                match
                                                                                                        .arrayGet(
                                                                                                                env,
                                                                                                                0),
                                                                                                "?}")))
                                                        ? match.arrayGet(env, 0)
                                                        : function_array_shift
                                                                .f
                                                                .env(env)
                                                                .call(parameters.getObject())
                                                                .value());
                                    }
                                }.useRef("parameters", parameters),
                                path)
                        .value();
        return ZVal.assign(
                function_trim
                        .f
                        .env(env)
                        .call(
                                function_preg_replace
                                        .f
                                        .env(env)
                                        .call("/\\{.*?\\?\\}/", "", path)
                                        .value(),
                                "/")
                        .value());
    }

    public Object replaceRouteParameters(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "parameters")
    protected Object replaceNamedParameters(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Routing/RouteUrlGenerator.php");
        Object path = assignParameter(args, 0, false);
        ReferenceContainer parameters =
                assignParameterRef(runtimePassByReferenceArgs, args, 1, false);
        return ZVal.assign(
                NamespaceGlobal.preg_replace_callback
                        .env(env)
                        .call(
                                "/\\{(.*?)\\??\\}/",
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Routing",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "m")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        ReferenceContainer m =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        ReferenceContainer parameters =
                                                new BasicReferenceContainer(null);
                                        parameters =
                                                this.contextReferences.getReferenceContainer(
                                                        "parameters");
                                        if (arrayActionR(
                                                ArrayAction.ISSET,
                                                parameters,
                                                env,
                                                m.arrayGet(env, 1))) {
                                            return ZVal.assign(
                                                    Arr.runtimeStaticObject.pull(
                                                            env,
                                                            new RuntimeArgsWithReferences()
                                                                    .add(0, parameters),
                                                            parameters.getObject(),
                                                            m.arrayGet(env, 1)));

                                        } else if (arrayActionR(
                                                ArrayAction.ISSET,
                                                new ReferenceClassProperty(
                                                        _closureThisVar, "defaultParameters", env),
                                                env,
                                                m.arrayGet(env, 1))) {
                                            return ZVal.assign(
                                                    new ReferenceClassProperty(
                                                                    _closureThisVar,
                                                                    "defaultParameters",
                                                                    env)
                                                            .arrayGet(env, m.arrayGet(env, 1)));
                                        }

                                        return ZVal.assign(m.arrayGet(env, 0));
                                    }
                                }.useRef("parameters", parameters),
                                path)
                        .value());
    }

    public Object replaceNamedParameters(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(index = 1, name = "parameters", typeHint = "array")
    protected Object addQueryString(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        Object fragment = null;
        if (!function_is_null
                .f
                .env(env)
                .call(fragment = NamespaceGlobal.parse_url.env(env).call(uri, 7).value())
                .getBool()) {
            uri = function_preg_replace.f.env(env).call("/#.*/", "", uri).value();
        }

        uri = toStringR(uri, env) + toStringR(this.getRouteQueryString(env, parameters), env);
        return ZVal.assign(
                function_is_null.f.env(env).call(fragment).getBool()
                        ? uri
                        : toStringR(uri, env) + toStringR("#" + toStringR(fragment, env), env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters", typeHint = "array")
    protected Object getRouteQueryString(RuntimeEnv env, Object... args) {
        Object parameters = assignParameter(args, 0, false);
        Object query = null;
        Object keyed = null;
        if (ZVal.equalityCheck(function_count.f.env(env).call(parameters).value(), 0)) {
            return "";
        }

        query =
                NamespaceGlobal.http_build_query
                        .env(env)
                        .call(keyed = this.getStringParameters(env, parameters))
                        .value();
        if (ZVal.isLessThan(
                function_count.f.env(env).call(keyed).value(),
                '<',
                function_count.f.env(env).call(parameters).value())) {
            query =
                    toStringR(query, env)
                            + "&"
                            + toStringR(
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call("&", this.getNumericParameters(env, parameters))
                                            .value(),
                                    env);
        }

        return ZVal.assign("?" + toStringR(function_trim.f.env(env).call(query, "&").value(), env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters", typeHint = "array")
    protected Object getStringParameters(RuntimeEnv env, Object... args) {
        Object parameters = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_filter.f.env(env).call(parameters, "is_string", 2).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters", typeHint = "array")
    protected Object getNumericParameters(RuntimeEnv env, Object... args) {
        Object parameters = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_filter.f.env(env).call(parameters, "is_numeric", 2).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "defaults", typeHint = "array")
    public Object defaults(RuntimeEnv env, Object... args) {
        Object defaults = assignParameter(args, 0, false);
        this.defaultParameters =
                function_array_merge.f.env(env).call(this.defaultParameters, defaults).value();
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Routing\\RouteUrlGenerator";

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
                    .setName("Illuminate\\Routing\\RouteUrlGenerator")
                    .setLookup(
                            RouteUrlGenerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("defaultParameters", "dontEncode", "request", "url")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Routing/RouteUrlGenerator.php")
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
