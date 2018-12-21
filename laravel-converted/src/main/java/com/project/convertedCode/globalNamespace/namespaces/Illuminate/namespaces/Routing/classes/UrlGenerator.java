package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.array.function_ksort;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Routing.classes.UrlRoutable;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeClasses.date.DateInterval;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.RouteUrlGenerator;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.filter.function_filter_var;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/UrlGenerator.php

*/

public class UrlGenerator extends RuntimeClassBase
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Contracts
                .namespaces
                .Routing
                .classes
                .UrlGenerator {

    public Object routes = null;

    public Object request = null;

    public Object forcedRoot = null;

    public Object forceScheme = null;

    public Object cachedRoot = null;

    public Object cachedSchema = null;

    public Object rootNamespace = null;

    public Object sessionResolver = null;

    public Object keyResolver = null;

    public Object formatHostUsing = null;

    public Object formatPathUsing = null;

    public Object routeGenerator = null;

    public UrlGenerator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == UrlGenerator.class) {
            this.__construct(env, args);
        }
    }

    public UrlGenerator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "routes",
        typeHint = "Illuminate\\Routing\\RouteCollection"
    )
    @ConvertedParameter(index = 1, name = "request", typeHint = "Illuminate\\Http\\Request")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object routes = assignParameter(args, 0, false);
        Object request = assignParameter(args, 1, false);
        this.routes = routes;
        this.setRequest(env, request);
        return null;
    }

    @ConvertedMethod
    public Object full(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.request, "fullUrl", UrlGenerator.class));
    }

    @ConvertedMethod
    public Object current(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                this.to(env, env.callMethod(this.request, "getPathInfo", UrlGenerator.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "fallback",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object previous(RuntimeEnv env, Object... args) {
        Object fallback = assignParameter(args, 0, true);
        if (null == fallback) {
            fallback = false;
        }
        Object referrer = null;
        Object url = null;
        referrer =
                env.callMethod(
                        toObjectR(this.request).accessProp(this, env).name("headers").value(),
                        "get",
                        UrlGenerator.class,
                        "referer");
        url =
                ZVal.assign(
                        ZVal.isTrue(referrer)
                                ? this.to(env, referrer)
                                : this.getPreviousUrlFromSession(env));
        if (ZVal.isTrue(url)) {
            return ZVal.assign(url);

        } else if (ZVal.isTrue(fallback)) {
            return ZVal.assign(this.to(env, fallback));
        }

        return ZVal.assign(this.to(env, "/"));
    }

    @ConvertedMethod
    protected Object getPreviousUrlFromSession(RuntimeEnv env, Object... args) {
        Object session = null;
        session = this.getSession(env);
        return ZVal.assign(
                ZVal.isTrue(session)
                        ? env.callMethod(session, "previousUrl", UrlGenerator.class)
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "extra", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "secure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object to(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object extra = assignParameter(args, 1, true);
        if (null == extra) {
            extra = ZVal.newArray();
        }
        Object secure = assignParameter(args, 2, true);
        if (null == secure) {
            secure = ZVal.getNull();
        }
        Object tail = null;
        Object root = null;
        Object query = null;
        Object runtimeTempArrayResult80 = null;
        if (ZVal.isTrue(this.isValidUrl(env, path))) {
            return ZVal.assign(path);
        }

        tail =
                NamespaceGlobal.implode
                        .env(env)
                        .call(
                                "/",
                                function_array_map
                                        .f
                                        .env(env)
                                        .call(
                                                "rawurlencode",
                                                rToArrayCast(this.formatParameters(env, extra)))
                                        .value())
                        .value();
        root = this.formatRoot(env, this.formatScheme(env, secure));
        ZVal.list(
                runtimeTempArrayResult80 = this.extractQueryString(env, path),
                (path = listGet(runtimeTempArrayResult80, 0, env)),
                (query = listGet(runtimeTempArrayResult80, 1, env)));
        return ZVal.assign(
                toStringR(
                                this.format(
                                        env,
                                        root,
                                        "/"
                                                + toStringR(
                                                        function_trim
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        toStringR(path, env)
                                                                                + "/"
                                                                                + toStringR(
                                                                                        tail, env),
                                                                        "/")
                                                                .value(),
                                                        env)),
                                env)
                        + toStringR(query, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object secure(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        return ZVal.assign(this.to(env, path, parameters, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(
        index = 1,
        name = "secure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object asset(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object secure = assignParameter(args, 1, true);
        if (null == secure) {
            secure = ZVal.getNull();
        }
        Object root = null;
        if (ZVal.isTrue(this.isValidUrl(env, path))) {
            return ZVal.assign(path);
        }

        root = this.formatRoot(env, this.formatScheme(env, secure));
        return ZVal.assign(
                toStringR(this.removeIndex(env, root), env)
                        + "/"
                        + toStringR(function_trim.f.env(env).call(path, "/").value(), env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object secureAsset(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(this.asset(env, path, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "root")
    @ConvertedParameter(index = 1, name = "path")
    @ConvertedParameter(
        index = 2,
        name = "secure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assetFrom(RuntimeEnv env, Object... args) {
        Object root = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        Object secure = assignParameter(args, 2, true);
        if (null == secure) {
            secure = ZVal.getNull();
        }
        root = this.formatRoot(env, this.formatScheme(env, secure), root);
        return ZVal.assign(
                toStringR(this.removeIndex(env, root), env)
                        + "/"
                        + toStringR(function_trim.f.env(env).call(path, "/").value(), env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "root")
    protected Object removeIndex(RuntimeEnv env, Object... args) {
        Object root = assignParameter(args, 0, false);
        Object i = null;
        i = "index.php";
        return ZVal.assign(
                ZVal.isTrue(Str.runtimeStaticObject.contains(env, root, i))
                        ? function_str_replace
                                .f
                                .env(env)
                                .call("/" + toStringR(i, env), "", root)
                                .value()
                        : root);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "secure")
    public Object formatScheme(RuntimeEnv env, Object... args) {
        Object secure = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        if (!function_is_null.f.env(env).call(secure).getBool()) {
            return ZVal.assign(ZVal.isTrue(secure) ? "https://" : "http://");
        }

        if (function_is_null.f.env(env).call(this.cachedSchema).getBool()) {
            this.cachedSchema =
                    ZVal.isTrue(ternaryExpressionTemp = this.forceScheme)
                            ? ternaryExpressionTemp
                            : toStringR(
                                            env.callMethod(
                                                    this.request, "getScheme", UrlGenerator.class),
                                            env)
                                    + "://";
        }

        return ZVal.assign(this.cachedSchema);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "expiration",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object signedRoute(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        Object expiration = assignParameter(args, 2, true);
        if (null == expiration) {
            expiration = ZVal.getNull();
        }
        Object key = null;
        parameters = this.formatParameters(env, parameters);
        if (ZVal.isTrue(expiration)) {
            parameters =
                    ZVal.add(
                            parameters,
                            ZVal.newArray(new ZPair("expires", this.availableAt(env, expiration))));
        }

        function_ksort.f.env(env).call(parameters);
        key =
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(this.keyResolver)
                        .value();
        return ZVal.assign(
                this.route(
                        env,
                        name,
                        ZVal.add(
                                parameters,
                                ZVal.newArray(
                                        new ZPair(
                                                "signature",
                                                NamespaceGlobal.hash_hmac
                                                        .env(env)
                                                        .call(
                                                                "sha256",
                                                                this.route(env, name, parameters),
                                                                key)
                                                        .value())))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "expiration")
    @ConvertedParameter(
        index = 2,
        name = "parameters",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object temporarySignedRoute(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object expiration = assignParameter(args, 1, false);
        Object parameters = assignParameter(args, 2, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        return ZVal.assign(this.signedRoute(env, name, parameters, expiration));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    public Object hasValidSignature(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object expires = null;
        Object original = null;
        Object signature = null;
        original =
                function_rtrim
                        .f
                        .env(env)
                        .call(
                                toStringR(env.callMethod(request, "url", UrlGenerator.class), env)
                                        + "?"
                                        + toStringR(
                                                NamespaceGlobal.http_build_query
                                                        .env(env)
                                                        .call(
                                                                Arr.runtimeStaticObject.except(
                                                                        env,
                                                                        env.callMethod(
                                                                                request,
                                                                                "query",
                                                                                UrlGenerator.class),
                                                                        "signature"))
                                                        .value(),
                                                env),
                                "?")
                        .value();
        expires =
                Arr.runtimeStaticObject.get(
                        env, env.callMethod(request, "query", UrlGenerator.class), "expires");
        signature =
                NamespaceGlobal.hash_hmac
                        .env(env)
                        .call(
                                "sha256",
                                original,
                                function_call_user_func
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call(this.keyResolver)
                                        .value())
                        .value();
        return ZVal.assign(
                ZVal.toBool(
                                NamespaceGlobal.hash_equals
                                        .env(env)
                                        .call(
                                                signature,
                                                env.callMethod(
                                                        request,
                                                        "query",
                                                        UrlGenerator.class,
                                                        "signature",
                                                        ""))
                                        .value())
                        && ZVal.toBool(
                                !ZVal.toBool(expires)
                                        && ZVal.toBool(
                                                ZVal.isGreaterThan(
                                                        env.callMethod(
                                                                Carbon.runtimeStaticObject.now(env),
                                                                "getTimestamp",
                                                                UrlGenerator.class),
                                                        '>',
                                                        expires))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "absolute",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object route(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        Object absolute = assignParameter(args, 2, true);
        if (null == absolute) {
            absolute = true;
        }
        Object route = null;
        if (!function_is_null
                .f
                .env(env)
                .call(route = env.callMethod(this.routes, "getByName", UrlGenerator.class, name))
                .getBool()) {
            return ZVal.assign(this.toRoute(env, route, parameters, absolute));
        }

        throw ZVal.getException(
                env,
                new InvalidArgumentException(
                        env, "Route [" + toStringR(name, env) + "] not defined."));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route")
    @ConvertedParameter(index = 1, name = "parameters")
    @ConvertedParameter(index = 2, name = "absolute")
    protected Object toRoute(RuntimeEnv env, Object... args) {
        Object route = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        Object absolute = assignParameter(args, 2, false);
        return ZVal.assign(
                env.callMethod(
                        this.routeUrl(env),
                        "to",
                        UrlGenerator.class,
                        route,
                        this.formatParameters(env, parameters),
                        absolute));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "action")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "absolute",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object action(RuntimeEnv env, Object... args) {
        Object action = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        Object absolute = assignParameter(args, 2, true);
        if (null == absolute) {
            absolute = true;
        }
        Object route = null;
        if (function_is_null
                .f
                .env(env)
                .call(
                        route =
                                env.callMethod(
                                        this.routes,
                                        "getByAction",
                                        UrlGenerator.class,
                                        action = this.formatAction(env, action)))
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Action " + toStringR(action, env) + " not defined."));
        }

        return ZVal.assign(this.toRoute(env, route, parameters, absolute));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "action")
    protected Object formatAction(RuntimeEnv env, Object... args) {
        Object action = assignParameter(args, 0, false);
        if (ZVal.toBool(this.rootNamespace)
                && ZVal.toBool(
                        !ZVal.strictEqualityCheck(
                                function_strpos.f.env(env).call(action, "\\").value(), "===", 0))) {
            return ZVal.assign(toStringR(this.rootNamespace, env) + "\\" + toStringR(action, env));

        } else {
            return ZVal.assign(function_trim.f.env(env).call(action, "\\").value());
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters")
    public Object formatParameters(RuntimeEnv env, Object... args) {
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object parameter = null;
        Object key = null;
        parameters.setObject(Arr.runtimeStaticObject.wrap(env, parameters.getObject()));
        for (ZPair zpairResult538 : ZVal.getIterable(parameters.getObject(), env, false)) {
            key = ZVal.assign(zpairResult538.getKey());
            parameter = ZVal.assign(zpairResult538.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            parameter,
                            UrlRoutable.class,
                            "Illuminate\\Contracts\\Routing\\UrlRoutable"))) {
                parameters
                        .arrayAccess(env, key)
                        .set(env.callMethod(parameter, "getRouteKey", UrlGenerator.class));
            }
        }

        return ZVal.assign(parameters.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    protected Object extractQueryString(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object queryPosition = null;
        if (ZVal.strictNotEqualityCheck(
                queryPosition = function_strpos.f.env(env).call(path, "?").value(), "!==", false)) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(path, 0, queryPosition)
                                            .value()),
                            new ZPair(
                                    1,
                                    function_substr.f.env(env).call(path, queryPosition).value())));
        }

        return ZVal.assign(ZVal.newArray(new ZPair(0, path), new ZPair(1, "")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "scheme")
    @ConvertedParameter(
        index = 1,
        name = "root",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object formatRoot(RuntimeEnv env, Object... args) {
        Object scheme = assignParameter(args, 0, false);
        Object root = assignParameter(args, 1, true);
        if (null == root) {
            root = ZVal.getNull();
        }
        Object start = null;
        Object ternaryExpressionTemp = null;
        if (function_is_null.f.env(env).call(root).getBool()) {
            if (function_is_null.f.env(env).call(this.cachedRoot).getBool()) {
                this.cachedRoot =
                        ZVal.isTrue(ternaryExpressionTemp = this.forcedRoot)
                                ? ternaryExpressionTemp
                                : env.callMethod(this.request, "root", UrlGenerator.class);
            }

            root = ZVal.assign(this.cachedRoot);
        }

        start =
                ZVal.assign(
                        ZVal.isTrue(Str.runtimeStaticObject.startsWith(env, root, "http://"))
                                ? "http://"
                                : "https://");
        return ZVal.assign(
                function_preg_replace
                        .f
                        .env(env)
                        .call("~" + toStringR(start, env) + "~", scheme, root, 1)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "root")
    @ConvertedParameter(index = 1, name = "path")
    public Object format(RuntimeEnv env, Object... args) {
        Object root = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        path = "/" + toStringR(function_trim.f.env(env).call(path, "/").value(), env);
        if (ZVal.isTrue(this.formatHostUsing)) {
            root =
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(this.formatHostUsing, root)
                            .value();
        }

        if (ZVal.isTrue(this.formatPathUsing)) {
            path =
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(this.formatPathUsing, path)
                            .value();
        }

        return ZVal.assign(
                function_trim
                        .f
                        .env(env)
                        .call(toStringR(root, env) + toStringR(path, env), "/")
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object isValidUrl(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        if (!function_preg_match
                .f
                .env(env)
                .call("~^(#|//|https?://|mailto:|tel:)~", path)
                .getBool()) {
            return ZVal.assign(
                    ZVal.strictNotEqualityCheck(
                            function_filter_var.f.env(env).call(path, 273).value(), "!==", false));
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    protected Object routeUrl(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.routeGenerator)) {
            this.routeGenerator = new RouteUrlGenerator(env, this, this.request);
        }

        return ZVal.assign(this.routeGenerator);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "defaults", typeHint = "array")
    public Object defaults(RuntimeEnv env, Object... args) {
        Object defaults = assignParameter(args, 0, false);
        env.callMethod(this.routeUrl(env), "defaults", UrlGenerator.class, defaults);
        return null;
    }

    @ConvertedMethod
    public Object getDefaultParameters(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toObjectR(this.routeUrl(env))
                        .accessProp(this, env)
                        .name("defaultParameters")
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "schema")
    public Object forceScheme(RuntimeEnv env, Object... args) {
        Object schema = assignParameter(args, 0, false);
        this.cachedSchema = ZVal.getNull();
        this.forceScheme = toStringR(schema, env) + "://";
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "root")
    public Object forceRootUrl(RuntimeEnv env, Object... args) {
        Object root = assignParameter(args, 0, false);
        this.forcedRoot = function_rtrim.f.env(env).call(root, "/").value();
        this.cachedRoot = ZVal.getNull();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    public Object formatHostUsing(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        this.formatHostUsing = callback;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    public Object formatPathUsing(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        this.formatPathUsing = callback;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object pathFormatter(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Routing/UrlGenerator.php");
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = this.formatPathUsing)
                        ? ternaryExpressionTemp
                        : new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Routing",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "path")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object path = assignParameter(args, 0, false);
                                return ZVal.assign(path);
                            }
                        });
    }

    @ConvertedMethod
    public Object getRequest(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.request);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    public Object setRequest(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        this.request = request;
        this.cachedRoot = ZVal.getNull();
        this.cachedSchema = ZVal.getNull();
        this.routeGenerator = ZVal.getNull();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "routes",
        typeHint = "Illuminate\\Routing\\RouteCollection"
    )
    public Object setRoutes(RuntimeEnv env, Object... args) {
        Object routes = assignParameter(args, 0, false);
        this.routes = routes;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    protected Object getSession(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.sessionResolver)) {
            return ZVal.assign(
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(this.sessionResolver)
                            .value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionResolver", typeHint = "callable")
    public Object setSessionResolver(RuntimeEnv env, Object... args) {
        Object sessionResolver = assignParameter(args, 0, false);
        this.sessionResolver = sessionResolver;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keyResolver", typeHint = "callable")
    public Object setKeyResolver(RuntimeEnv env, Object... args) {
        Object keyResolver = assignParameter(args, 0, false);
        this.keyResolver = keyResolver;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rootNamespace")
    public Object setRootControllerNamespace(RuntimeEnv env, Object... args) {
        Object rootNamespace = assignParameter(args, 0, false);
        this.rootNamespace = rootNamespace;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay")
    protected Object secondsUntil(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, false);
        delay = this.parseDateInterval(env, delay);
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        delay, DateTimeInterface.class, "DateTimeInterface"))
                        ? NamespaceGlobal.max
                                .env(env)
                                .call(
                                        0,
                                        ZVal.subtract(
                                                env.callMethod(
                                                        delay, "getTimestamp", UrlGenerator.class),
                                                this.currentTime(env)))
                                .value()
                        : ZVal.toLong(delay));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay", defaultValue = "0", defaultValueType = "number")
    protected Object availableAt(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, true);
        if (null == delay) {
            delay = 0;
        }
        delay = this.parseDateInterval(env, delay);
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        delay, DateTimeInterface.class, "DateTimeInterface"))
                        ? env.callMethod(delay, "getTimestamp", UrlGenerator.class)
                        : env.callMethod(
                                env.callMethod(
                                        Carbon.runtimeStaticObject.now(env),
                                        "addSeconds",
                                        UrlGenerator.class,
                                        delay),
                                "getTimestamp",
                                UrlGenerator.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay")
    protected Object parseDateInterval(RuntimeEnv env, Object... args) {
        ReferenceContainer delay = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.isTrue(
                ZVal.checkInstanceType(delay.getObject(), DateInterval.class, "DateInterval"))) {
            delay.setObject(
                    env.callMethod(
                            Carbon.runtimeStaticObject.now(env),
                            new RuntimeArgsWithReferences().add(0, delay),
                            "add",
                            UrlGenerator.class,
                            delay.getObject()));
        }

        return ZVal.assign(delay.getObject());
    }

    @ConvertedMethod
    protected Object currentTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        Carbon.runtimeStaticObject.now(env), "getTimestamp", UrlGenerator.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object parameters = assignParameter(args, 1, false);
        Object macro = null;
        if (!ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, UrlGenerator.class)
                        .method("hasMacro")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, method))
                        .call(method.getObject())
                        .value())) {
            throw ZVal.getException(
                    env,
                    new BadMethodCallException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Method %s::%s does not exist.",
                                            ClassConstantUtils.getConstantValueLateStatic(
                                                    env, this, "class"),
                                            method.getObject())
                                    .value()));
        }

        macro =
                ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Routing
                                                .classes
                                                .UrlGenerator
                                                .RequestStaticProperties
                                                .class,
                                        "macros")
                                .arrayGet(env, method.getObject()));
        if (ZVal.isTrue(ZVal.checkInstanceType(macro, Closure.class, "Closure"))) {
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.callMethod(
                                            macro,
                                            "bindTo",
                                            UrlGenerator.class,
                                            this,
                                            ClassConstantUtils.getConstantValueLateStatic(
                                                    env, this, "class")),
                                    parameters)
                            .value());
        }

        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(macro, parameters)
                        .value());
    }

    public static final Object CONST_class = "Illuminate\\Routing\\UrlGenerator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(index = 1, name = "macro")
        public Object macro(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            Object macro = assignParameter(args, 1, false);
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Routing
                                    .classes
                                    .UrlGenerator
                                    .RequestStaticProperties
                                    .class,
                            "macros")
                    .arrayAccess(env, name)
                    .set(macro);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "mixin")
        public Object mixin(RuntimeEnv env, Object... args) {
            Object mixin = assignParameter(args, 0, false);
            Object method = null;
            Object methods = null;
            methods =
                    env.callMethod(
                            new ReflectionClass(env, mixin),
                            "getMethods",
                            UrlGenerator.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2358 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2358.getValue());
                env.callMethod(method, "setAccessible", UrlGenerator.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, UrlGenerator.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", UrlGenerator.class, mixin))
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object hasMacro(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            return ZVal.assign(
                    arrayActionR(
                            ArrayAction.ISSET,
                            env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Routing
                                            .classes
                                            .UrlGenerator
                                            .RequestStaticProperties
                                            .class,
                                    "macros"),
                            env,
                            name));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method")
        @ConvertedParameter(index = 1, name = "parameters")
        public Object __callStatic(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            Object parameters = assignParameter(args, 1, false);
            if (!ZVal.isTrue(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, UrlGenerator.class)
                            .method("hasMacro")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(method)
                            .value())) {
                throw ZVal.getException(
                        env,
                        new BadMethodCallException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Method %s::%s does not exist.",
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class"),
                                                method)
                                        .value()));
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Routing
                                                    .classes
                                                    .UrlGenerator
                                                    .RequestStaticProperties
                                                    .class,
                                            "macros")
                                    .arrayGet(env, method),
                            Closure.class,
                            "Closure"))) {
                return ZVal.assign(
                        function_call_user_func_array
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(
                                        Closure.runtimeStaticObject.bind(
                                                env,
                                                env.getRequestStaticPropertiesReference(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Illuminate
                                                                        .namespaces
                                                                        .Routing
                                                                        .classes
                                                                        .UrlGenerator
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "macros")
                                                        .arrayGet(env, method),
                                                ZVal.getNull(),
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class")),
                                        parameters)
                                .value());
            }

            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Illuminate
                                                            .namespaces
                                                            .Routing
                                                            .classes
                                                            .UrlGenerator
                                                            .RequestStaticProperties
                                                            .class,
                                                    "macros")
                                            .arrayGet(env, method),
                                    parameters)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object macros = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Routing\\UrlGenerator")
                    .setLookup(
                            UrlGenerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "cachedRoot",
                            "cachedSchema",
                            "forceScheme",
                            "forcedRoot",
                            "formatHostUsing",
                            "formatPathUsing",
                            "keyResolver",
                            "request",
                            "rootNamespace",
                            "routeGenerator",
                            "routes",
                            "sessionResolver")
                    .setStaticPropertyNames("macros")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Routing/UrlGenerator.php")
                    .addInterface("Illuminate\\Contracts\\Routing\\UrlGenerator")
                    .addTrait("Illuminate\\Support\\InteractsWithTime")
                    .addTrait("Illuminate\\Support\\Traits\\Macroable")
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
