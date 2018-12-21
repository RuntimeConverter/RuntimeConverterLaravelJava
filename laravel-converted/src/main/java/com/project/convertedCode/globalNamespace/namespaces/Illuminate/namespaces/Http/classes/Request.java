package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.ParameterBag;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeClasses.stdClass;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Arrayable;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_replace_recursive;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.nativeClasses.spl.files.SplFileInfo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.project.convertedCode.globalNamespace.functions.data_get;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.classes.UploadedFile;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Http/Request.php

*/

public class Request
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Symfony
                .namespaces
                .Component
                .namespaces
                .HttpFoundation
                .classes
                .Request
        implements Arrayable, ArrayAccess {

    public Object json = null;

    public Object convertedFiles = null;

    public Object userResolver = null;

    public Object routeResolver = null;

    public Request(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Request.class) {
            this.__construct(env, args);
        }
    }

    public Request(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object instance(RuntimeEnv env, Object... args) {
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object method(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "getMethod", Request.class));
    }

    @ConvertedMethod
    public Object root(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_rtrim
                        .f
                        .env(env)
                        .call(
                                toStringR(
                                                env.callMethod(
                                                        this,
                                                        "getSchemeAndHttpHost",
                                                        Request.class),
                                                env)
                                        + toStringR(
                                                env.callMethod(this, "getBaseUrl", Request.class),
                                                env),
                                "/")
                        .value());
    }

    @ConvertedMethod
    public Object url(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_rtrim
                        .f
                        .env(env)
                        .call(
                                function_preg_replace
                                        .f
                                        .env(env)
                                        .call(
                                                "/\\?.*/",
                                                "",
                                                env.callMethod(this, "getUri", Request.class))
                                        .value(),
                                "/")
                        .value());
    }

    @ConvertedMethod
    public Object fullUrl(RuntimeEnv env, Object... args) {
        Object question = null;
        Object query = null;
        query = env.callMethod(this, "getQueryString", Request.class);
        question =
                ZVal.assign(
                        ZVal.equalityCheck(
                                        toStringR(
                                                        env.callMethod(
                                                                this, "getBaseUrl", Request.class),
                                                        env)
                                                + toStringR(
                                                        env.callMethod(
                                                                this, "getPathInfo", Request.class),
                                                        env),
                                        "/")
                                ? "/?"
                                : "?");
        return ZVal.assign(
                ZVal.isTrue(query)
                        ? toStringR(this.url(env), env)
                                + toStringR(question, env)
                                + toStringR(query, env)
                        : this.url(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query", typeHint = "array")
    public Object fullUrlWithQuery(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object question = null;
        question =
                ZVal.assign(
                        ZVal.equalityCheck(
                                        toStringR(
                                                        env.callMethod(
                                                                this, "getBaseUrl", Request.class),
                                                        env)
                                                + toStringR(
                                                        env.callMethod(
                                                                this, "getPathInfo", Request.class),
                                                        env),
                                        "/")
                                ? "/?"
                                : "?");
        return ZVal.assign(
                ZVal.isGreaterThan(function_count.f.env(env).call(this.query(env)).value(), '>', 0)
                        ? toStringR(this.url(env), env)
                                + toStringR(question, env)
                                + toStringR(
                                        NamespaceGlobal.http_build_query
                                                .env(env)
                                                .call(
                                                        function_array_merge
                                                                .f
                                                                .env(env)
                                                                .call(this.query(env), query)
                                                                .value())
                                                .value(),
                                        env)
                        : toStringR(this.fullUrl(env), env)
                                + toStringR(question, env)
                                + toStringR(
                                        NamespaceGlobal.http_build_query
                                                .env(env)
                                                .call(query)
                                                .value(),
                                        env));
    }

    @ConvertedMethod
    public Object path(RuntimeEnv env, Object... args) {
        Object pattern = null;
        pattern =
                function_trim
                        .f
                        .env(env)
                        .call(env.callMethod(this, "getPathInfo", Request.class), "/")
                        .value();
        return ZVal.assign(ZVal.equalityCheck(pattern, "") ? "/" : pattern);
    }

    @ConvertedMethod
    public Object decodedPath(RuntimeEnv env, Object... args) {
        return ZVal.assign(NamespaceGlobal.rawurldecode.env(env).call(this.path(env)).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "index")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object segment(RuntimeEnv env, Object... args) {
        Object index = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(
                Arr.runtimeStaticObject.get(
                        env, this.segments(env), ZVal.subtract(index, 1), _pDefault));
    }

    @ConvertedMethod
    public Object segments(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Http")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Http/Request.php");
        Object segments = null;
        segments = function_explode.f.env(env).call("/", this.decodedPath(env)).value();
        return ZVal.assign(
                function_array_values
                        .f
                        .env(env)
                        .call(
                                function_array_filter
                                        .f
                                        .env(env)
                                        .call(
                                                segments,
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Illuminate\\Http",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "value")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object value =
                                                                assignParameter(args, 0, false);
                                                        return ZVal.assign(
                                                                ZVal.strictNotEqualityCheck(
                                                                        value, "!==", ""));
                                                    }
                                                })
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "patterns")
    public Object is(RuntimeEnv env, Object... args) {
        Object patterns = assignParameterVarArgs(args, 0);
        Object pattern = null;
        for (ZPair zpairResult473 : ZVal.getIterable(patterns, env, true)) {
            pattern = ZVal.assign(zpairResult473.getValue());
            if (ZVal.isTrue(Str.runtimeStaticObject.is(env, pattern, this.decodedPath(env)))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "patterns")
    public Object routeIs(RuntimeEnv env, Object... args) {
        Object patterns = assignParameterVarArgs(args, 0);
        return ZVal.assign(
                ZVal.toBool(this.route(env))
                        && ZVal.toBool(
                                env.callMethod(
                                        this.route(env),
                                        "named",
                                        Request.class,
                                        PackedVaradicArgs.unpack(
                                                new PackedVaradicArgs(patterns)))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "patterns")
    public Object fullUrlIs(RuntimeEnv env, Object... args) {
        Object patterns = assignParameterVarArgs(args, 0);
        Object pattern = null;
        Object url = null;
        url = this.fullUrl(env);
        for (ZPair zpairResult474 : ZVal.getIterable(patterns, env, true)) {
            pattern = ZVal.assign(zpairResult474.getValue());
            if (ZVal.isTrue(Str.runtimeStaticObject.is(env, pattern, url))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object ajax(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "isXmlHttpRequest", Request.class));
    }

    @ConvertedMethod
    public Object pjax(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.equalityCheck(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("headers").value(),
                                "get",
                                Request.class,
                                "X-PJAX"),
                        true));
    }

    @ConvertedMethod
    public Object secure(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "isSecure", Request.class));
    }

    @ConvertedMethod
    public Object ip(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "getClientIp", Request.class));
    }

    @ConvertedMethod
    public Object ips(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "getClientIps", Request.class));
    }

    @ConvertedMethod
    public Object userAgent(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("headers").value(),
                        "get",
                        Request.class,
                        "User-Agent"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input", typeHint = "array")
    public Object merge(RuntimeEnv env, Object... args) {
        ReferenceContainer input = new BasicReferenceContainer(assignParameter(args, 0, false));
        env.callMethod(
                this.getInputSource(env),
                new RuntimeArgsWithReferences().add(0, input),
                "add",
                Request.class,
                input.getObject());
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input", typeHint = "array")
    public Object replace(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        env.callMethod(this.getInputSource(env), "replace", Request.class, input);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object get(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(super.get(env, key, _pDefault));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object json(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        if (!ZVal.isset(this.json)) {
            this.json =
                    new ParameterBag(
                            env,
                            rToArrayCast(
                                    NamespaceGlobal.json_decode
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            this, "getContent", Request.class),
                                                    true)
                                            .value()));
        }

        if (function_is_null.f.env(env).call(key).getBool()) {
            return ZVal.assign(this.json);
        }

        return ZVal.assign(
                data_get.f
                        .env(env)
                        .call(env.callMethod(this.json, "all", Request.class), key, _pDefault)
                        .value());
    }

    @ConvertedMethod
    protected Object getInputSource(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.isJson(env))) {
            return ZVal.assign(this.json(env));
        }

        return ZVal.assign(
                function_in_array
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(this, "getRealMethod", Request.class),
                                        ZVal.arrayFromList("GET", "HEAD"))
                                .getBool()
                        ? toObjectR(this).accessProp(this, env).name("query").value()
                        : toObjectR(this).accessProp(this, env).name("request").value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "request",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "attributes",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "cookies",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "files",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "server",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object duplicate(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, true);
        if (null == query) {
            query = ZVal.getNull();
        }
        Object request = assignParameter(args, 1, true);
        if (null == request) {
            request = ZVal.getNull();
        }
        Object attributes = assignParameter(args, 2, true);
        if (null == attributes) {
            attributes = ZVal.getNull();
        }
        Object cookies = assignParameter(args, 3, true);
        if (null == cookies) {
            cookies = ZVal.getNull();
        }
        Object files = assignParameter(args, 4, true);
        if (null == files) {
            files = ZVal.getNull();
        }
        Object server = assignParameter(args, 5, true);
        if (null == server) {
            server = ZVal.getNull();
        }
        return ZVal.assign(
                super.duplicate(
                        env,
                        query,
                        request,
                        attributes,
                        cookies,
                        this.filterFiles(env, files),
                        server));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files")
    protected Object filterFiles(RuntimeEnv env, Object... args) {
        ReferenceContainer files = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object file = null;
        Object key = null;
        if (!ZVal.isTrue(files.getObject())) {
            return null;
        }

        for (ZPair zpairResult475 : ZVal.getIterable(files.getObject(), env, false)) {
            key = ZVal.assign(zpairResult475.getKey());
            file = ZVal.assign(zpairResult475.getValue());
            if (function_is_array.f.env(env).call(file).getBool()) {
                files.arrayAccess(env, key).set(this.filterFiles(env, files.arrayGet(env, key)));
            }

            if (arrayActionR(ArrayAction.EMPTY, files, env, key)) {
                arrayActionR(ArrayAction.UNSET, files, env, key);
            }
        }

        return ZVal.assign(files.getObject());
    }

    @ConvertedMethod
    public Object session(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(env.callMethod(this, "hasSession", Request.class))) {
            throw ZVal.getException(
                    env, new RuntimeException(env, "Session store not set on request."));
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("session").value());
    }

    @ConvertedMethod
    public Object getSession(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("session").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "session")
    public Object setLaravelSession(RuntimeEnv env, Object... args) {
        Object session = assignParameter(args, 0, false);
        toObjectR(this).accessProp(this, env).name("session").set(session);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "guard",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object user(RuntimeEnv env, Object... args) {
        Object guard = assignParameter(args, 0, true);
        if (null == guard) {
            guard = ZVal.getNull();
        }
        return ZVal.assign(
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(this.getUserResolver(env), guard)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "param",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object route(RuntimeEnv env, Object... args) {
        Object param = assignParameter(args, 0, true);
        if (null == param) {
            param = ZVal.getNull();
        }
        Object route = null;
        route =
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(this.getRouteResolver(env))
                        .value();
        if (ZVal.toBool(function_is_null.f.env(env).call(route).value())
                || ZVal.toBool(function_is_null.f.env(env).call(param).value())) {
            return ZVal.assign(route);
        }

        return ZVal.assign(env.callMethod(route, "parameter", Request.class, param));
    }

    @ConvertedMethod
    public Object fingerprint(RuntimeEnv env, Object... args) {
        Object route = null;
        if (!ZVal.isTrue(route = this.route(env))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env, "Unable to generate fingerprint. Route unavailable."));
        }

        return ZVal.assign(
                NamespaceGlobal.sha1
                        .env(env)
                        .call(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                "|",
                                                function_array_merge
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                env.callMethod(
                                                                        route,
                                                                        "methods",
                                                                        Request.class),
                                                                ZVal.newArray(
                                                                        new ZPair(
                                                                                0,
                                                                                env.callMethod(
                                                                                        route,
                                                                                        "getDomain",
                                                                                        Request
                                                                                                .class)),
                                                                        new ZPair(
                                                                                1,
                                                                                env.callMethod(
                                                                                        route,
                                                                                        "uri",
                                                                                        Request
                                                                                                .class)),
                                                                        new ZPair(2, this.ip(env))))
                                                        .value())
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "json")
    public Object setJson(RuntimeEnv env, Object... args) {
        Object json = assignParameter(args, 0, false);
        this.json = json;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getUserResolver(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Http")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Http/Request.php");
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = this.userResolver)
                        ? ternaryExpressionTemp
                        : new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Http",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                return null;
                            }
                        });
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    public Object setUserResolver(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        this.userResolver = callback;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getRouteResolver(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Http")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Http/Request.php");
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = this.routeResolver)
                        ? ternaryExpressionTemp
                        : new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Http",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                return null;
                            }
                        });
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    public Object setRouteResolver(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        this.routeResolver = callback;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object toArray(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.all(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetExists(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_key_exists
                        .f
                        .env(env)
                        .call(
                                offset,
                                ZVal.add(
                                        this.all(env),
                                        env.callMethod(
                                                this.route(env), "parameters", Request.class)))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetGet(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        return ZVal.assign(this.__get(env, offset));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    @ConvertedParameter(index = 1, name = "value")
    public Object offsetSet(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        env.callMethod(this.getInputSource(env), "set", Request.class, offset, value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetUnset(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        env.callMethod(this.getInputSource(env), "remove", Request.class, offset);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __isset(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(!function_is_null.f.env(env).call(this.__get(env, key)).getBool());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __get(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        if (function_array_key_exists.f.env(env).call(key, this.all(env)).getBool()) {
            return ZVal.assign(data_get.f.env(env).call(this.all(env), key).value());
        }

        return ZVal.assign(this.route(env, key));
    }

    @ConvertedMethod
    public Object isJson(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                Str.runtimeStaticObject.contains(
                        env,
                        this.header(env, "CONTENT_TYPE"),
                        ZVal.arrayFromList("/json", "+json")));
    }

    @ConvertedMethod
    public Object expectsJson(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(this.ajax(env))
                                                        && ZVal.toBool(
                                                                !ZVal.isTrue(this.pjax(env))))
                                        && ZVal.toBool(this.acceptsAnyContentType(env)))
                        || ZVal.toBool(this.wantsJson(env)));
    }

    @ConvertedMethod
    public Object wantsJson(RuntimeEnv env, Object... args) {
        ReferenceContainer acceptable = new BasicReferenceContainer(null);
        acceptable.setObject(env.callMethod(this, "getAcceptableContentTypes", Request.class));
        return ZVal.assign(
                ZVal.toBool(arrayActionR(ArrayAction.ISSET, acceptable, env, 0))
                        && ZVal.toBool(
                                Str.runtimeStaticObject.contains(
                                        env,
                                        acceptable.arrayGet(env, 0),
                                        ZVal.arrayFromList("/json", "+json"))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "contentTypes")
    public Object accepts(RuntimeEnv env, Object... args) {
        Object contentTypes = assignParameter(args, 0, false);
        Object types = null;
        Object accepts = null;
        Object type = null;
        Object accept = null;
        accepts = env.callMethod(this, "getAcceptableContentTypes", Request.class);
        if (ZVal.strictEqualityCheck(function_count.f.env(env).call(accepts).value(), "===", 0)) {
            return ZVal.assign(true);
        }

        types = ZVal.assign(rToArrayCast(contentTypes));
        for (ZPair zpairResult2321 : ZVal.getIterable(accepts, env, true)) {
            accept = ZVal.assign(zpairResult2321.getValue());
            if (ZVal.toBool(ZVal.strictEqualityCheck(accept, "===", "*/*"))
                    || ZVal.toBool(ZVal.strictEqualityCheck(accept, "===", "*"))) {
                return ZVal.assign(true);
            }

            for (ZPair zpairResult2322 : ZVal.getIterable(types, env, true)) {
                type = ZVal.assign(zpairResult2322.getValue());
                if (ZVal.toBool(env.callMethod(this, "matchesType", Request.class, accept, type))
                        || ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        accept,
                                        "===",
                                        toStringR(
                                                        NamespaceGlobal.strtok
                                                                .env(env)
                                                                .call(type, "/")
                                                                .value(),
                                                        env)
                                                + "/*"))) {
                    return ZVal.assign(true);
                }
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "contentTypes")
    public Object prefers(RuntimeEnv env, Object... args) {
        ReferenceContainer contentTypes =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object accepts = null;
        Object mimeType = null;
        Object type = null;
        Object contentType = null;
        Object accept = null;
        accepts = env.callMethod(this, "getAcceptableContentTypes", Request.class);
        contentTypes.setObject(ZVal.assign(rToArrayCast(contentTypes.getObject())));
        for (ZPair zpairResult2323 : ZVal.getIterable(accepts, env, true)) {
            accept = ZVal.assign(zpairResult2323.getValue());
            if (function_in_array
                    .f
                    .env(env)
                    .call(accept, ZVal.arrayFromList("*/*", "*"))
                    .getBool()) {
                return ZVal.assign(contentTypes.arrayGet(env, 0));
            }

            for (ZPair zpairResult2324 : ZVal.getIterable(contentTypes.getObject(), env, true)) {
                contentType = ZVal.assign(zpairResult2324.getValue());
                type = ZVal.assign(contentType);
                if (!function_is_null
                        .f
                        .env(env)
                        .call(
                                mimeType =
                                        env.callMethod(
                                                this, "getMimeType", Request.class, contentType))
                        .getBool()) {
                    type = ZVal.assign(mimeType);
                }

                if (ZVal.toBool(env.callMethod(this, "matchesType", Request.class, type, accept))
                        || ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        accept,
                                        "===",
                                        toStringR(
                                                        NamespaceGlobal.strtok
                                                                .env(env)
                                                                .call(type, "/")
                                                                .value(),
                                                        env)
                                                + "/*"))) {
                    return ZVal.assign(contentType);
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object acceptsAnyContentType(RuntimeEnv env, Object... args) {
        ReferenceContainer acceptable = new BasicReferenceContainer(null);
        acceptable.setObject(env.callMethod(this, "getAcceptableContentTypes", Request.class));
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        function_count
                                                .f
                                                .env(env)
                                                .call(acceptable.getObject())
                                                .value(),
                                        "===",
                                        0))
                        || ZVal.toBool(
                                ZVal.toBool(arrayActionR(ArrayAction.ISSET, acceptable, env, 0))
                                        && ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        acceptable.arrayGet(env, 0),
                                                                        "===",
                                                                        "*/*"))
                                                        || ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        acceptable.arrayGet(env, 0),
                                                                        "===",
                                                                        "*")))));
    }

    @ConvertedMethod
    public Object acceptsJson(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.accepts(env, "application/json"));
    }

    @ConvertedMethod
    public Object acceptsHtml(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.accepts(env, "text/html"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "default")
    public Object format(RuntimeEnv env, Object... args) {
        Object _pDefault = assignParameter(args, 0, true);
        if (null == _pDefault) {
            _pDefault = "html";
        }
        Object format = null;
        Object type = null;
        for (ZPair zpairResult2325 :
                ZVal.getIterable(
                        env.callMethod(this, "getAcceptableContentTypes", Request.class),
                        env,
                        true)) {
            type = ZVal.assign(zpairResult2325.getValue());
            if (ZVal.isTrue(format = env.callMethod(this, "getFormat", Request.class, type))) {
                return ZVal.assign(format);
            }
        }

        return ZVal.assign(_pDefault);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object old(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(
                ZVal.isTrue(env.callMethod(this, "hasSession", Request.class))
                        ? env.callMethod(
                                this.session(env), "getOldInput", Request.class, key, _pDefault)
                        : _pDefault);
    }

    @ConvertedMethod
    public Object flash(RuntimeEnv env, Object... args) {
        env.callMethod(this.session(env), "flashInput", Request.class, this.input(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys")
    public Object flashOnly(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, false);
        env.callMethod(
                this.session(env),
                "flashInput",
                Request.class,
                this.only(
                        env,
                        function_is_array.f.env(env).call(keys).getBool()
                                ? keys
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value()));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys")
    public Object flashExcept(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, false);
        env.callMethod(
                this.session(env),
                "flashInput",
                Request.class,
                this.except(
                        env,
                        function_is_array.f.env(env).call(keys).getBool()
                                ? keys
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value()));
        return null;
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        env.callMethod(this.session(env), "flashInput", Request.class, ZVal.newArray());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object server(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(this.retrieveItem(env, "server", key, _pDefault));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object hasHeader(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(!function_is_null.f.env(env).call(this.header(env, key)).getBool());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object header(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(this.retrieveItem(env, "headers", key, _pDefault));
    }

    @ConvertedMethod
    public Object bearerToken(RuntimeEnv env, Object... args) {
        Object header = null;
        header = this.header(env, "Authorization", "");
        if (ZVal.isTrue(Str.runtimeStaticObject.startsWith(env, header, "Bearer "))) {
            return ZVal.assign(Str.runtimeStaticObject.substr(env, header, 7));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object exists(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(this.has(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object has(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object input = null;
        Object keys = null;
        Object value = null;
        keys =
                ZVal.assign(
                        function_is_array.f.env(env).call(key).getBool()
                                ? key
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value());
        input = this.all(env);
        for (ZPair zpairResult2326 : ZVal.getIterable(keys, env, true)) {
            value = ZVal.assign(zpairResult2326.getValue());
            if (!ZVal.isTrue(Arr.runtimeStaticObject.has(env, input, value))) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys")
    public Object hasAny(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, false);
        Object input = null;
        Object key = null;
        keys =
                ZVal.assign(
                        function_is_array.f.env(env).call(keys).getBool()
                                ? keys
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value());
        input = this.all(env);
        for (ZPair zpairResult2327 : ZVal.getIterable(keys, env, true)) {
            key = ZVal.assign(zpairResult2327.getValue());
            if (ZVal.isTrue(Arr.runtimeStaticObject.has(env, input, key))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object filled(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object keys = null;
        Object value = null;
        keys =
                ZVal.assign(
                        function_is_array.f.env(env).call(key).getBool()
                                ? key
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value());
        for (ZPair zpairResult2328 : ZVal.getIterable(keys, env, true)) {
            value = ZVal.assign(zpairResult2328.getValue());
            if (ZVal.isTrue(this.isEmptyString(env, value))) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys")
    public Object anyFilled(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, false);
        Object key = null;
        keys =
                ZVal.assign(
                        function_is_array.f.env(env).call(keys).getBool()
                                ? keys
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value());
        for (ZPair zpairResult2329 : ZVal.getIterable(keys, env, true)) {
            key = ZVal.assign(zpairResult2329.getValue());
            if (ZVal.isTrue(this.filled(env, key))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    protected Object isEmptyString(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = null;
        value = this.input(env, key);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(!function_is_bool.f.env(env).call(value).getBool())
                                        && ZVal.toBool(
                                                !function_is_array
                                                        .f
                                                        .env(env)
                                                        .call(value)
                                                        .getBool()))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        function_trim
                                                .f
                                                .env(env)
                                                .call(toStringR(value, env))
                                                .value(),
                                        "===",
                                        "")));
    }

    @ConvertedMethod
    public Object keys(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                function_array_keys.f.env(env).call(this.input(env)).value(),
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("files").value(),
                                        "keys",
                                        Request.class))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "keys",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object all(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, true);
        if (null == keys) {
            keys = ZVal.getNull();
        }
        Object input = null;
        ReferenceContainer results = new BasicReferenceContainer(null);
        Object key = null;
        input =
                function_array_replace_recursive
                        .f
                        .env(env)
                        .call(this.input(env), this.allFiles(env))
                        .value();
        if (!ZVal.isTrue(keys)) {
            return ZVal.assign(input);
        }

        results.setObject(ZVal.newArray());
        for (ZPair zpairResult2330 :
                ZVal.getIterable(
                        function_is_array.f.env(env).call(keys).getBool()
                                ? keys
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value(),
                        env,
                        true)) {
            key = ZVal.assign(zpairResult2330.getValue());
            Arr.runtimeStaticObject.set(
                    env,
                    new RuntimeArgsWithReferences().add(0, results),
                    results.getObject(),
                    key,
                    Arr.runtimeStaticObject.get(env, input, key));
        }

        return ZVal.assign(results.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object input(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(
                data_get.f
                        .env(env)
                        .call(
                                ZVal.add(
                                        env.callMethod(
                                                this.getInputSource(env), "all", Request.class),
                                        env.callMethod(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("query")
                                                        .value(),
                                                "all",
                                                Request.class)),
                                key,
                                _pDefault)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys")
    public Object only(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, false);
        Object input = null;
        Object placeholder = null;
        ReferenceContainer results = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        results.setObject(ZVal.newArray());
        input = this.all(env);
        placeholder = new stdClass(env);
        for (ZPair zpairResult2331 :
                ZVal.getIterable(
                        function_is_array.f.env(env).call(keys).getBool()
                                ? keys
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value(),
                        env,
                        true)) {
            key = ZVal.assign(zpairResult2331.getValue());
            value = data_get.f.env(env).call(input, key, placeholder).value();
            if (ZVal.strictNotEqualityCheck(value, "!==", placeholder)) {
                Arr.runtimeStaticObject.set(
                        env,
                        new RuntimeArgsWithReferences().add(0, results),
                        results.getObject(),
                        key,
                        value);
            }
        }

        return ZVal.assign(results.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys")
    public Object except(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, false);
        ReferenceContainer results = new BasicReferenceContainer(null);
        keys =
                ZVal.assign(
                        function_is_array.f.env(env).call(keys).getBool()
                                ? keys
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value());
        results.setObject(this.all(env));
        Arr.runtimeStaticObject.forget(
                env, new RuntimeArgsWithReferences().add(0, results), results.getObject(), keys);
        return ZVal.assign(results.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object query(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(this.retrieveItem(env, "query", key, _pDefault));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object post(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(this.retrieveItem(env, "request", key, _pDefault));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object hasCookie(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(!function_is_null.f.env(env).call(this.cookie(env, key)).getBool());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object cookie(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(this.retrieveItem(env, "cookies", key, _pDefault));
    }

    @ConvertedMethod
    public Object allFiles(RuntimeEnv env, Object... args) {
        Object files = null;
        files =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("files").value(),
                        "all",
                        Request.class);
        return ZVal.assign(
                ZVal.isTrue(this.convertedFiles)
                        ? this.convertedFiles
                        : (this.convertedFiles = this.convertUploadedFiles(env, files)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files", typeHint = "array")
    protected Object convertUploadedFiles(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Http/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Http/Concerns/InteractsWithInput.php");
        Object files = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Http\\Concerns",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "file")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object file = assignParameter(args, 0, false);
                                        if (ZVal.toBool(
                                                        function_is_null
                                                                .f
                                                                .env(env)
                                                                .call(file)
                                                                .value())
                                                || ZVal.toBool(
                                                        ZVal.toBool(
                                                                        function_is_array
                                                                                .f
                                                                                .env(env)
                                                                                .call(file)
                                                                                .value())
                                                                && ZVal.toBool(
                                                                        ZVal.isEmpty(
                                                                                function_array_filter
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(file)
                                                                                        .value())))) {
                                            return ZVal.assign(file);
                                        }

                                        return ZVal.assign(
                                                function_is_array.f.env(env).call(file).getBool()
                                                        ? Request.this.convertUploadedFiles(
                                                                env, file)
                                                        : UploadedFile.runtimeStaticObject
                                                                .createFromBase(env, file));
                                    }
                                },
                                files)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object hasFile(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object file = null;
        Object files = null;
        if (!function_is_array.f.env(env).call(files = this.file(env, key)).getBool()) {
            files = ZVal.newArray(new ZPair(0, files));
        }

        for (ZPair zpairResult2332 : ZVal.getIterable(files, env, true)) {
            file = ZVal.assign(zpairResult2332.getValue());
            if (ZVal.isTrue(this.isValidFile(env, file))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    protected Object isValidFile(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(ZVal.checkInstanceType(file, SplFileInfo.class, "SplFileInfo"))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        env.callMethod(file, "getPath", Request.class),
                                        "!==",
                                        "")));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object file(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(data_get.f.env(env).call(this.allFiles(env), key, _pDefault).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source")
    @ConvertedParameter(index = 1, name = "key")
    @ConvertedParameter(index = 2, name = "default")
    protected Object retrieveItem(RuntimeEnv env, Object... args) {
        Object source = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, false);
        Object _pDefault = assignParameter(args, 2, false);
        if (function_is_null.f.env(env).call(key).getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name(source).value(),
                            "all",
                            Request.class));
        }

        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name(source).value(),
                        "get",
                        Request.class,
                        key,
                        _pDefault));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object parameters = assignParameter(args, 1, false);
        Object macro = null;
        if (!ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Request.class)
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
                                                .Http
                                                .classes
                                                .Request
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
                                            Request.class,
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

    public static final Object CONST_class = "Illuminate\\Http\\Request";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Symfony
                    .namespaces
                    .Component
                    .namespaces
                    .HttpFoundation
                    .classes
                    .Request
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object capture(RuntimeEnv env, Object... args) {
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Request.class)
                    .method("enableHttpMethodParameterOverride")
                    .call()
                    .value();
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Request.class)
                            .method("createFromBase")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    com.project.convertedCode.globalNamespace.namespaces.Symfony
                                            .namespaces.Component.namespaces.HttpFoundation.classes
                                            .Request.runtimeStaticObject.createFromGlobals(env))
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "from", typeHint = "self")
        @ConvertedParameter(
            index = 1,
            name = "to",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object createFrom(RuntimeEnv env, Object... args) {
            PassByReferenceArgs rLastRefArgs;
            Object from = assignParameter(args, 0, false);
            Object to = assignParameter(args, 1, true);
            if (null == to) {
                to = ZVal.getNull();
            }
            Object request = null;
            Object session = null;
            Object files = null;
            Object ternaryExpressionTemp = null;
            request =
                    ZVal.assign(
                            ZVal.isTrue(ternaryExpressionTemp = to)
                                    ? ternaryExpressionTemp
                                    : env.createNewWithLateStaticBindings(this));
            files =
                    env.callMethod(
                            toObjectR(from).accessProp(this, env).name("files").value(),
                            "all",
                            Request.class);
            files =
                    ZVal.assign(
                            function_is_array.f.env(env).call(files).getBool()
                                    ? function_array_filter.f.env(env).call(files).value()
                                    : files);
            env.callMethod(
                    request,
                    rLastRefArgs =
                            new RuntimeArgsWithReferences()
                                    .add(
                                            0,
                                            handleReturnReference(
                                                    env.callMethod(
                                                            toObjectR(from)
                                                                    .accessProp(this, env)
                                                                    .name("query")
                                                                    .value(),
                                                            "all",
                                                            Request.class))),
                    "initialize",
                    Request.class,
                    rLastRefArgs.get(0),
                    env.callMethod(
                            toObjectR(from).accessProp(this, env).name("request").value(),
                            "all",
                            Request.class),
                    env.callMethod(
                            toObjectR(from).accessProp(this, env).name("attributes").value(),
                            "all",
                            Request.class),
                    env.callMethod(
                            toObjectR(from).accessProp(this, env).name("cookies").value(),
                            "all",
                            Request.class),
                    files,
                    env.callMethod(
                            toObjectR(from).accessProp(this, env).name("server").value(),
                            "all",
                            Request.class),
                    env.callMethod(from, "getContent", Request.class));
            env.callMethod(
                    request, "setJson", Request.class, env.callMethod(from, "json", Request.class));
            if (ZVal.isTrue(session = env.callMethod(from, "getSession", Request.class))) {
                env.callMethod(request, "setLaravelSession", Request.class, session);
            }

            env.callMethod(
                    request,
                    "setUserResolver",
                    Request.class,
                    env.callMethod(from, "getUserResolver", Request.class));
            env.callMethod(
                    request,
                    "setRouteResolver",
                    Request.class,
                    env.callMethod(from, "getRouteResolver", Request.class));
            return ZVal.assign(request);
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "request",
            typeHint = "Symfony\\Component\\HttpFoundation\\Request"
        )
        public Object createFromBase(RuntimeEnv env, Object... args) {
            Object request = assignParameter(args, 0, false);
            Object content = null;
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            request,
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Http
                                    .classes
                                    .Request
                                    .class,
                            "Illuminate\\Http\\Request"))) {
                return ZVal.assign(request);
            }

            content = ZVal.assign(toObjectR(request).accessProp(this, env).name("content").value());
            request =
                    env.callMethod(
                            env.createNewWithLateStaticBindings(this),
                            "duplicate",
                            Request.class,
                            env.callMethod(
                                    toObjectR(request).accessProp(this, env).name("query").value(),
                                    "all",
                                    Request.class),
                            env.callMethod(
                                    toObjectR(request)
                                            .accessProp(this, env)
                                            .name("request")
                                            .value(),
                                    "all",
                                    Request.class),
                            env.callMethod(
                                    toObjectR(request)
                                            .accessProp(this, env)
                                            .name("attributes")
                                            .value(),
                                    "all",
                                    Request.class),
                            env.callMethod(
                                    toObjectR(request)
                                            .accessProp(this, env)
                                            .name("cookies")
                                            .value(),
                                    "all",
                                    Request.class),
                            env.callMethod(
                                    toObjectR(request).accessProp(this, env).name("files").value(),
                                    "all",
                                    Request.class),
                            env.callMethod(
                                    toObjectR(request).accessProp(this, env).name("server").value(),
                                    "all",
                                    Request.class));
            toObjectR(request).accessProp(this, env).name("content").set(content);
            toObjectR(request)
                    .accessProp(this, env)
                    .name("request")
                    .set(env.callMethod(request, "getInputSource", Request.class));
            return ZVal.assign(request);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "actual")
        @ConvertedParameter(index = 1, name = "type")
        public Object matchesType(RuntimeEnv env, Object... args) {
            Object actual = assignParameter(args, 0, false);
            Object type = assignParameter(args, 1, false);
            ReferenceContainer split = new BasicReferenceContainer(null);
            if (ZVal.strictEqualityCheck(actual, "===", type)) {
                return ZVal.assign(true);
            }

            split.setObject(function_explode.f.env(env).call("/", actual).value());
            return ZVal.assign(
                    ZVal.toBool(arrayActionR(ArrayAction.ISSET, split, env, 1))
                            && ZVal.toBool(
                                    function_preg_match
                                            .f
                                            .env(env)
                                            .call(
                                                    "#"
                                                            + toStringR(
                                                                    NamespaceGlobal.preg_quote
                                                                            .env(env)
                                                                            .call(
                                                                                    split.arrayGet(
                                                                                            env, 0),
                                                                                    "#")
                                                                            .value(),
                                                                    env)
                                                            + "/.+\\+"
                                                            + toStringR(
                                                                    NamespaceGlobal.preg_quote
                                                                            .env(env)
                                                                            .call(
                                                                                    split.arrayGet(
                                                                                            env, 1),
                                                                                    "#")
                                                                            .value(),
                                                                    env)
                                                            + "#",
                                                    type)
                                            .value()));
        }

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
                                    .Http
                                    .classes
                                    .Request
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
                            Request.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2333 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2333.getValue());
                env.callMethod(method, "setAccessible", Request.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Request.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", Request.class, mixin))
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
                                            .Http
                                            .classes
                                            .Request
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
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Request.class)
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
                                                    .Http
                                                    .classes
                                                    .Request
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
                                                                        .Http
                                                                        .classes
                                                                        .Request
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
                                                            .Http
                                                            .classes
                                                            .Request
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
                    .setName("Illuminate\\Http\\Request")
                    .setLookup(
                            Request.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "acceptableContentTypes",
                            "attributes",
                            "basePath",
                            "baseUrl",
                            "charsets",
                            "content",
                            "convertedFiles",
                            "cookies",
                            "defaultLocale",
                            "encodings",
                            "files",
                            "format",
                            "headers",
                            "isForwardedValid",
                            "isHostValid",
                            "json",
                            "languages",
                            "locale",
                            "method",
                            "pathInfo",
                            "query",
                            "request",
                            "requestUri",
                            "routeResolver",
                            "server",
                            "session",
                            "userResolver")
                    .setStaticPropertyNames("macros")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Http/Request.php")
                    .addInterface("Illuminate\\Contracts\\Support\\Arrayable")
                    .addInterface("ArrayAccess")
                    .addTrait("Illuminate\\Http\\Concerns\\InteractsWithContentTypes")
                    .addTrait("Illuminate\\Http\\Concerns\\InteractsWithFlashData")
                    .addTrait("Illuminate\\Http\\Concerns\\InteractsWithInput")
                    .addTrait("Illuminate\\Support\\Traits\\Macroable")
                    .addExtendsClass("Symfony\\Component\\HttpFoundation\\Request")
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
