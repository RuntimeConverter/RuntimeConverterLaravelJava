package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.otherProxyClasses.Locale;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.IpUtils;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.ParameterBag;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.ServerBag;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.FileBag;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.HeaderBag;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_parse_str;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_arg;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_intersect;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.classes.SessionInterface;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.AcceptHeader;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Exception.classes.ConflictingHeadersException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_ksort;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.nativeFunctions.filter.function_filter_var;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_replace;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Exception.classes.SuspiciousOperationException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.HeaderUtils;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_num_args;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/Request.php

*/

public class Request extends RuntimeClassBase {

    public Object attributes = null;

    public Object request = null;

    public Object query = null;

    public Object server = null;

    public Object files = null;

    public Object cookies = null;

    public Object headers = null;

    public Object content = null;

    public Object languages = null;

    public Object charsets = null;

    public Object encodings = null;

    public Object acceptableContentTypes = null;

    public Object pathInfo = null;

    public Object requestUri = null;

    public Object baseUrl = null;

    public Object basePath = null;

    public Object method = null;

    public Object format = null;

    public Object session = null;

    public Object locale = null;

    public Object defaultLocale = "en";

    public Object isHostValid = true;

    public Object isForwardedValid = true;

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
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 1,
        name = "request",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "cookies",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 4,
        name = "files",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 5,
        name = "server",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 6,
        name = "content",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, true);
        if (null == query) {
            query = ZVal.newArray();
        }
        Object request = assignParameter(args, 1, true);
        if (null == request) {
            request = ZVal.newArray();
        }
        Object attributes = assignParameter(args, 2, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        Object cookies = assignParameter(args, 3, true);
        if (null == cookies) {
            cookies = ZVal.newArray();
        }
        Object files = assignParameter(args, 4, true);
        if (null == files) {
            files = ZVal.newArray();
        }
        Object server = assignParameter(args, 5, true);
        if (null == server) {
            server = ZVal.newArray();
        }
        Object content = assignParameter(args, 6, true);
        if (null == content) {
            content = ZVal.getNull();
        }
        this.initialize(env, query, request, attributes, cookies, files, server, content);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 1,
        name = "request",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "cookies",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 4,
        name = "files",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 5,
        name = "server",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 6,
        name = "content",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object initialize(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, true);
        if (null == query) {
            query = ZVal.newArray();
        }
        Object request = assignParameter(args, 1, true);
        if (null == request) {
            request = ZVal.newArray();
        }
        Object attributes = assignParameter(args, 2, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        Object cookies = assignParameter(args, 3, true);
        if (null == cookies) {
            cookies = ZVal.newArray();
        }
        Object files = assignParameter(args, 4, true);
        if (null == files) {
            files = ZVal.newArray();
        }
        Object server = assignParameter(args, 5, true);
        if (null == server) {
            server = ZVal.newArray();
        }
        Object content = assignParameter(args, 6, true);
        if (null == content) {
            content = ZVal.getNull();
        }
        this.request = new ParameterBag(env, request);
        this.query = new ParameterBag(env, query);
        this.attributes = new ParameterBag(env, attributes);
        this.cookies = new ParameterBag(env, cookies);
        this.files = new FileBag(env, files);
        this.server = new ServerBag(env, server);
        this.headers = new HeaderBag(env, env.callMethod(this.server, "getHeaders", Request.class));
        this.content = content;
        this.languages = ZVal.getNull();
        this.charsets = ZVal.getNull();
        this.encodings = ZVal.getNull();
        this.acceptableContentTypes = ZVal.getNull();
        this.pathInfo = ZVal.getNull();
        this.requestUri = ZVal.getNull();
        this.baseUrl = ZVal.getNull();
        this.basePath = ZVal.getNull();
        this.method = ZVal.getNull();
        this.format = ZVal.getNull();
        return null;
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
        Object dup = null;
        dup = ZVal.assign(((RuntimeClassInterface) this).phpClone(env));
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", query)) {
            toObjectR(dup).accessProp(this, env).name("query").set(new ParameterBag(env, query));
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", request)) {
            toObjectR(dup)
                    .accessProp(this, env)
                    .name("request")
                    .set(new ParameterBag(env, request));
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", attributes)) {
            toObjectR(dup)
                    .accessProp(this, env)
                    .name("attributes")
                    .set(new ParameterBag(env, attributes));
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", cookies)) {
            toObjectR(dup)
                    .accessProp(this, env)
                    .name("cookies")
                    .set(new ParameterBag(env, cookies));
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", files)) {
            toObjectR(dup).accessProp(this, env).name("files").set(new FileBag(env, files));
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", server)) {
            toObjectR(dup).accessProp(this, env).name("server").set(new ServerBag(env, server));
            toObjectR(dup)
                    .accessProp(this, env)
                    .name("headers")
                    .set(
                            new HeaderBag(
                                    env,
                                    env.callMethod(
                                            toObjectR(dup)
                                                    .accessProp(this, env)
                                                    .name("server")
                                                    .value(),
                                            "getHeaders",
                                            Request.class)));
        }

        toObjectR(dup).accessProp(this, env).name("languages").set(ZVal.getNull());
        toObjectR(dup).accessProp(this, env).name("charsets").set(ZVal.getNull());
        toObjectR(dup).accessProp(this, env).name("encodings").set(ZVal.getNull());
        toObjectR(dup).accessProp(this, env).name("acceptableContentTypes").set(ZVal.getNull());
        toObjectR(dup).accessProp(this, env).name("pathInfo").set(ZVal.getNull());
        toObjectR(dup).accessProp(this, env).name("requestUri").set(ZVal.getNull());
        toObjectR(dup).accessProp(this, env).name("baseUrl").set(ZVal.getNull());
        toObjectR(dup).accessProp(this, env).name("basePath").set(ZVal.getNull());
        toObjectR(dup).accessProp(this, env).name("method").set(ZVal.getNull());
        toObjectR(dup).accessProp(this, env).name("format").set(ZVal.getNull());
        if (ZVal.toBool(!ZVal.isTrue(env.callMethod(dup, "get", Request.class, "_format")))
                && ZVal.toBool(this.get(env, "_format"))) {
            env.callMethod(
                    toObjectR(dup).accessProp(this, env).name("attributes").value(),
                    "set",
                    Request.class,
                    "_format",
                    this.get(env, "_format"));
        }

        if (!ZVal.isTrue(env.callMethod(dup, "getRequestFormat", Request.class, ZVal.getNull()))) {
            env.callMethod(
                    dup,
                    "setRequestFormat",
                    Request.class,
                    this.getRequestFormat(env, ZVal.getNull()));
        }

        return ZVal.assign(dup);
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        this.query = ((RuntimeClassInterface) this.query).phpClone(env);
        this.request = ((RuntimeClassInterface) this.request).phpClone(env);
        this.attributes = ((RuntimeClassInterface) this.attributes).phpClone(env);
        this.cookies = ((RuntimeClassInterface) this.cookies).phpClone(env);
        this.files = ((RuntimeClassInterface) this.files).phpClone(env);
        this.server = ((RuntimeClassInterface) this.server).phpClone(env);
        this.headers = ((RuntimeClassInterface) this.headers).phpClone(env);
        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        Object e = null;
        Object v = null;
        Object cookieHeader = null;
        Object k = null;
        Object content = null;
        ReferenceContainer cookies = new BasicReferenceContainer(null);
        try {
            content = this.getContent(env);
        } catch (ConvertedException convertedException257) {
            if (convertedException257.instanceOf(LogicException.class, "LogicException")) {
                e = convertedException257.getObject();
                return ZVal.assign(NamespaceGlobal.trigger_error.env(env).call(e, 256).value());
            } else {
                throw convertedException257;
            }
        }

        cookieHeader = "";
        cookies.setObject(ZVal.newArray());
        for (ZPair zpairResult1861 : ZVal.getIterable(this.cookies, env, false)) {
            k = ZVal.assign(zpairResult1861.getKey());
            v = ZVal.assign(zpairResult1861.getValue());
            cookies.arrayAppend(env).set(toStringR(k, env) + "=" + toStringR(v, env));
        }

        if (!ZVal.isEmpty(cookies.getObject())) {
            cookieHeader =
                    "Cookie: "
                            + toStringR(
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call("; ", cookies.getObject())
                                            .value(),
                                    env)
                            + "\r\n";
        }

        return ZVal.assign(
                toStringR(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "%s %s %s",
                                                this.getMethod(env),
                                                this.getRequestUri(env),
                                                env.callMethod(
                                                        this.server,
                                                        "get",
                                                        Request.class,
                                                        "SERVER_PROTOCOL"))
                                        .value(),
                                env)
                        + "\r\n"
                        + toStringR(this.headers, env)
                        + toStringR(cookieHeader, env)
                        + "\r\n"
                        + toStringR(content, env));
    }

    @ConvertedMethod
    public Object overrideGlobals(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        ReferenceContainer _COOKIE = new GlobalVariableReference(env, "_COOKIE");
        ReferenceContainer request = new BasicReferenceContainer(null);
        Object requestOrder = null;
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        Object ternaryExpressionTemp = null;
        ReferenceContainer _REQUEST = new GlobalVariableReference(env, "_REQUEST");
        ReferenceContainer _GET = new GlobalVariableReference(env, "_GET");
        Object value = null;
        Object key = null;
        ReferenceContainer _POST = new GlobalVariableReference(env, "_POST");
        Object order = null;
        env.callMethod(
                this.server,
                "set",
                Request.class,
                "QUERY_STRING",
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Request.class)
                        .method("normalizeQueryString")
                        .addReferenceArgs(
                                rLastRefArgs =
                                        new RuntimeArgsWithReferences()
                                                .add(
                                                        0,
                                                        handleReturnReference(
                                                                NamespaceGlobal.http_build_query
                                                                        .env(env)
                                                                        .call(
                                                                                env.callMethod(
                                                                                        this.query,
                                                                                        "all",
                                                                                        Request
                                                                                                .class),
                                                                                "",
                                                                                "&")
                                                                        .value())))
                        .call(rLastRefArgs.get(0))
                        .value());
        _GET.setObject(env.callMethod(this.query, "all", Request.class));
        _POST.setObject(env.callMethod(this.request, "all", Request.class));
        _SERVER.setObject(env.callMethod(this.server, "all", Request.class));
        _COOKIE.setObject(env.callMethod(this.cookies, "all", Request.class));
        for (ZPair zpairResult1862 :
                ZVal.getIterable(env.callMethod(this.headers, "all", Request.class), env, false)) {
            key = ZVal.assign(zpairResult1862.getKey());
            value = ZVal.assign(zpairResult1862.getValue());
            key =
                    NamespaceGlobal.strtoupper
                            .env(env)
                            .call(function_str_replace.f.env(env).call("-", "_", key).value())
                            .value();
            if (function_in_array
                    .f
                    .env(env)
                    .call(key, ZVal.arrayFromList("CONTENT_TYPE", "CONTENT_LENGTH"))
                    .getBool()) {
                _SERVER.arrayAccess(env, key)
                        .set(NamespaceGlobal.implode.env(env).call(", ", value).value());

            } else {
                _SERVER.arrayAccess(env, "HTTP_" + toStringR(key, env))
                        .set(NamespaceGlobal.implode.env(env).call(", ", value).value());
            }
        }

        request.setObject(
                ZVal.newArray(
                        new ZPair("g", _GET.getObject()),
                        new ZPair("p", _POST.getObject()),
                        new ZPair("c", _COOKIE.getObject())));
        requestOrder =
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                function_ini_get
                                                        .f
                                                        .env(env)
                                                        .call("request_order")
                                                        .value())
                                ? ternaryExpressionTemp
                                : function_ini_get.f.env(env).call("variables_order").value());
        requestOrder =
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                function_preg_replace
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "#[^cgp]#",
                                                                "",
                                                                NamespaceGlobal.strtolower
                                                                        .env(env)
                                                                        .call(requestOrder)
                                                                        .value())
                                                        .value())
                                ? ternaryExpressionTemp
                                : "gp");
        _REQUEST.setObject(ZVal.newArray());
        for (ZPair zpairResult1863 :
                ZVal.getIterable(
                        NamespaceGlobal.str_split.env(env).call(requestOrder).value(), env, true)) {
            order = ZVal.assign(zpairResult1863.getValue());
            _REQUEST.setObject(
                    function_array_merge
                            .f
                            .env(env)
                            .call(_REQUEST.getObject(), request.arrayGet(env, order))
                            .value());
        }

        return null;
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
        Object result = null;
        if (ZVal.strictNotEqualityCheck(
                this,
                "!==",
                result = env.callMethod(this.attributes, "get", Request.class, key, this))) {
            return ZVal.assign(result);
        }

        if (ZVal.strictNotEqualityCheck(
                this,
                "!==",
                result = env.callMethod(this.query, "get", Request.class, key, this))) {
            return ZVal.assign(result);
        }

        if (ZVal.strictNotEqualityCheck(
                this,
                "!==",
                result = env.callMethod(this.request, "get", Request.class, key, this))) {
            return ZVal.assign(result);
        }

        return ZVal.assign(_pDefault);
    }

    @ConvertedMethod
    public Object getSession(RuntimeEnv env, Object... args) {
        Object session = null;
        session = ZVal.assign(this.session);
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        session,
                                        SessionInterface.class,
                                        "Symfony\\Component\\HttpFoundation\\Session\\SessionInterface")))
                && ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", session))) {
            this.setSession(
                    env,
                    session =
                            env.callFunctionDynamic(session, new RuntimeArgsWithReferences())
                                    .value());
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", session)) {
            NamespaceGlobal.trigger_error
                    .env(env)
                    .call(
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Calling \"%s()\" when no session has been set is deprecated since Symfony 4.1 and will throw an exception in 5.0. Use \"hasSession()\" instead.",
                                            "Request::getSession")
                                    .value(),
                            16384)
                    .value();
        }

        return ZVal.assign(session);
    }

    @ConvertedMethod
    public Object hasPreviousSession(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(this.hasSession(env))
                        && ZVal.toBool(
                                env.callMethod(
                                        this.cookies,
                                        "has",
                                        Request.class,
                                        env.callMethod(
                                                this.getSession(env), "getName", Request.class))));
    }

    @ConvertedMethod
    public Object hasSession(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.session));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "session",
        typeHint = "Symfony\\Component\\HttpFoundation\\Session\\SessionInterface"
    )
    public Object setSession(RuntimeEnv env, Object... args) {
        Object session = assignParameter(args, 0, false);
        this.session = session;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "factory", typeHint = "callable")
    public Object setSessionFactory(RuntimeEnv env, Object... args) {
        Object factory = assignParameter(args, 0, false);
        this.session = factory;
        return null;
    }

    @ConvertedMethod
    public Object getClientIps(RuntimeEnv env, Object... args) {
        Object ip = null;
        Object ternaryExpressionTemp = null;
        ip = env.callMethod(this.server, "get", Request.class, "REMOTE_ADDR");
        if (!ZVal.isTrue(this.isFromTrustedProxy(env))) {
            return ZVal.assign(ZVal.newArray(new ZPair(0, ip)));
        }

        return ZVal.assign(
                ZVal.isTrue(
                                ternaryExpressionTemp =
                                        this.getTrustedValues(
                                                env, CONST_HEADER_X_FORWARDED_FOR, ip))
                        ? ternaryExpressionTemp
                        : ZVal.newArray(new ZPair(0, ip)));
    }

    @ConvertedMethod
    public Object getClientIp(RuntimeEnv env, Object... args) {
        ReferenceContainer ipAddresses = new BasicReferenceContainer(null);
        ipAddresses.setObject(this.getClientIps(env));
        return ZVal.assign(ipAddresses.arrayGet(env, 0));
    }

    @ConvertedMethod
    public Object getScriptName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.server,
                        "get",
                        Request.class,
                        "SCRIPT_NAME",
                        env.callMethod(this.server, "get", Request.class, "ORIG_SCRIPT_NAME", "")));
    }

    @ConvertedMethod
    public Object getPathInfo(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.pathInfo)) {
            this.pathInfo = this.preparePathInfo(env);
        }

        return ZVal.assign(this.pathInfo);
    }

    @ConvertedMethod
    public Object getBasePath(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.basePath)) {
            this.basePath = this.prepareBasePath(env);
        }

        return ZVal.assign(this.basePath);
    }

    @ConvertedMethod
    public Object getBaseUrl(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.baseUrl)) {
            this.baseUrl = this.prepareBaseUrl(env);
        }

        return ZVal.assign(this.baseUrl);
    }

    @ConvertedMethod
    public Object getScheme(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.isTrue(this.isSecure(env)) ? "https" : "http");
    }

    @ConvertedMethod
    public Object getPort(RuntimeEnv env, Object... args) {
        Object pos = null;
        ReferenceContainer host = new BasicReferenceContainer(null);
        if (ZVal.toBool(this.isFromTrustedProxy(env))
                && ZVal.toBool(
                        host.setObject(
                                this.getTrustedValues(env, CONST_HEADER_X_FORWARDED_PORT)))) {
            host.setObject(ZVal.assign(host.arrayGet(env, 0)));

        } else if (ZVal.toBool(this.isFromTrustedProxy(env))
                && ZVal.toBool(
                        host.setObject(
                                this.getTrustedValues(env, CONST_HEADER_X_FORWARDED_HOST)))) {
            host.setObject(ZVal.assign(host.arrayGet(env, 0)));

        } else if (!ZVal.isTrue(
                host.setObject(env.callMethod(this.headers, "get", Request.class, "HOST")))) {
            return ZVal.assign(env.callMethod(this.server, "get", Request.class, "SERVER_PORT"));
        }

        if (ZVal.strictEqualityCheck("[", "===", host.arrayGet(env, 0))) {
            pos =
                    function_strpos
                            .f
                            .env(env)
                            .call(
                                    host.getObject(),
                                    ":",
                                    NamespaceGlobal.strrpos
                                            .env(env)
                                            .call(host.getObject(), "]")
                                            .value())
                            .value();

        } else {
            pos = NamespaceGlobal.strrpos.env(env).call(host.getObject(), ":").value();
        }

        if (ZVal.strictNotEqualityCheck(false, "!==", pos)) {
            return ZVal.assign(
                    ZVal.toLong(
                            function_substr
                                    .f
                                    .env(env)
                                    .call(host.getObject(), ZVal.add(pos, 1))
                                    .value()));
        }

        return ZVal.assign(
                ZVal.strictEqualityCheck("https", "===", this.getScheme(env)) ? 443 : 80);
    }

    @ConvertedMethod
    public Object getUser(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.headers, "get", Request.class, "PHP_AUTH_USER"));
    }

    @ConvertedMethod
    public Object getPassword(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.headers, "get", Request.class, "PHP_AUTH_PW"));
    }

    @ConvertedMethod
    public Object getUserInfo(RuntimeEnv env, Object... args) {
        Object pass = null;
        Object userinfo = null;
        userinfo = this.getUser(env);
        pass = this.getPassword(env);
        if (ZVal.notEqualityCheck("", pass)) {
            userinfo = toStringR(userinfo, env) + toStringR(":" + toStringR(pass, env), env);
        }

        return ZVal.assign(userinfo);
    }

    @ConvertedMethod
    public Object getHttpHost(RuntimeEnv env, Object... args) {
        Object scheme = null;
        Object port = null;
        scheme = this.getScheme(env);
        port = this.getPort(env);
        if (ZVal.toBool(
                        ZVal.toBool(ZVal.equalityCheck("http", scheme))
                                && ZVal.toBool(ZVal.equalityCheck(80, port)))
                || ZVal.toBool(
                        ZVal.toBool(ZVal.equalityCheck("https", scheme))
                                && ZVal.toBool(ZVal.equalityCheck(443, port)))) {
            return ZVal.assign(this.getHost(env));
        }

        return ZVal.assign(toStringR(this.getHost(env), env) + ":" + toStringR(port, env));
    }

    @ConvertedMethod
    public Object getRequestUri(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.requestUri)) {
            this.requestUri = this.prepareRequestUri(env);
        }

        return ZVal.assign(this.requestUri);
    }

    @ConvertedMethod
    public Object getSchemeAndHttpHost(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(this.getScheme(env), env)
                        + "://"
                        + toStringR(this.getHttpHost(env), env));
    }

    @ConvertedMethod
    public Object getUri(RuntimeEnv env, Object... args) {
        Object qs = null;
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", qs = this.getQueryString(env))) {
            qs = "?" + toStringR(qs, env);
        }

        return ZVal.assign(
                toStringR(this.getSchemeAndHttpHost(env), env)
                        + toStringR(this.getBaseUrl(env), env)
                        + toStringR(this.getPathInfo(env), env)
                        + toStringR(qs, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getUriForPath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(this.getSchemeAndHttpHost(env), env)
                        + toStringR(this.getBaseUrl(env), env)
                        + toStringR(path, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getRelativeUriForPath(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer path = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer basePath = new BasicReferenceContainer(null);
        Object slashPos = null;
        Object targetFile = null;
        Object colonPos = null;
        ReferenceContainer sourceDirs = new BasicReferenceContainer(null);
        Object i = null;
        Object dir = null;
        ReferenceContainer targetDirs = new BasicReferenceContainer(null);
        if (ZVal.toBool(!arrayActionR(ArrayAction.ISSET, path, env, 0))
                || ZVal.toBool(ZVal.strictNotEqualityCheck("/", "!==", path.arrayGet(env, 0)))) {
            return ZVal.assign(path.getObject());
        }

        if (ZVal.strictEqualityCheck(
                path.getObject(), "===", basePath.setObject(this.getPathInfo(env)))) {
            return "";
        }

        sourceDirs.setObject(
                function_explode
                        .f
                        .env(env)
                        .call(
                                "/",
                                ZVal.toBool(arrayActionR(ArrayAction.ISSET, basePath, env, 0))
                                                && ZVal.toBool(
                                                        ZVal.strictEqualityCheck(
                                                                "/",
                                                                "===",
                                                                basePath.arrayGet(env, 0)))
                                        ? function_substr
                                                .f
                                                .env(env)
                                                .call(basePath.getObject(), 1)
                                                .value()
                                        : basePath.getObject())
                        .value());
        targetDirs.setObject(
                function_explode
                        .f
                        .env(env)
                        .call(
                                "/",
                                ZVal.toBool(arrayActionR(ArrayAction.ISSET, path, env, 0))
                                                && ZVal.toBool(
                                                        ZVal.strictEqualityCheck(
                                                                "/", "===", path.arrayGet(env, 0)))
                                        ? function_substr
                                                .f
                                                .env(env)
                                                .call(path.getObject(), 1)
                                                .value()
                                        : path.getObject())
                        .value());
        function_array_pop.f.env(env).call(sourceDirs.getObject());
        targetFile = function_array_pop.f.env(env).call(targetDirs.getObject()).value();
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1864 : ZVal.getIterable(sourceDirs.getObject(), env, false)) {
            i = ZVal.assign(zpairResult1864.getKey());
            dir = ZVal.assign(zpairResult1864.getValue());
            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, targetDirs, env, i))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(dir, "===", targetDirs.arrayGet(env, i)))) {
                arrayActionR(ArrayAction.UNSET, sourceDirs, env, i);
                arrayActionR(ArrayAction.UNSET, targetDirs, env, i);

            } else {
                break;
            }
        }

        targetDirs.arrayAppend(env).set(targetFile);
        path.setObject(
                toStringR(
                                function_str_repeat
                                        .f
                                        .env(env)
                                        .call(
                                                "../",
                                                function_count
                                                        .f
                                                        .env(env)
                                                        .call(sourceDirs.getObject())
                                                        .value())
                                        .value(),
                                env)
                        + toStringR(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call("/", targetDirs.getObject())
                                        .value(),
                                env));
        return ZVal.assign(
                ZVal.toBool(
                                        ZVal.toBool(!arrayActionR(ArrayAction.ISSET, path, env, 0))
                                                || ZVal.toBool(
                                                        ZVal.strictEqualityCheck(
                                                                "/", "===", path.arrayGet(env, 0))))
                                || ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.strictNotEqualityCheck(
                                                                false,
                                                                "!==",
                                                                colonPos =
                                                                        function_strpos
                                                                                .f
                                                                                .env(env)
                                                                                .call(
                                                                                        path
                                                                                                .getObject(),
                                                                                        ":")
                                                                                .value()))
                                                && ZVal.toBool(
                                                        ZVal.toBool(
                                                                        ZVal.isLessThan(
                                                                                colonPos,
                                                                                '<',
                                                                                slashPos =
                                                                                        function_strpos
                                                                                                .f
                                                                                                .env(
                                                                                                        env)
                                                                                                .call(
                                                                                                        path
                                                                                                                .getObject(),
                                                                                                        "/")
                                                                                                .value()))
                                                                || ZVal.toBool(
                                                                        ZVal.strictEqualityCheck(
                                                                                false, "===",
                                                                                slashPos))))
                        ? "./" + toStringR(path.getObject(), env)
                        : path.getObject());
    }

    @ConvertedMethod
    public Object getQueryString(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object qs = null;
        qs =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Request.class)
                        .method("normalizeQueryString")
                        .addReferenceArgs(
                                rLastRefArgs =
                                        new RuntimeArgsWithReferences()
                                                .add(
                                                        0,
                                                        handleReturnReference(
                                                                env.callMethod(
                                                                        this.server,
                                                                        "get",
                                                                        Request.class,
                                                                        "QUERY_STRING"))))
                        .call(rLastRefArgs.get(0))
                        .value();
        return ZVal.assign(ZVal.strictEqualityCheck("", "===", qs) ? ZVal.getNull() : qs);
    }

    @ConvertedMethod
    public Object isSecure(RuntimeEnv env, Object... args) {
        ReferenceContainer proto = new BasicReferenceContainer(null);
        Object https = null;
        if (ZVal.toBool(this.isFromTrustedProxy(env))
                && ZVal.toBool(
                        proto.setObject(
                                this.getTrustedValues(env, CONST_HEADER_X_FORWARDED_PROTO)))) {
            return ZVal.assign(
                    function_in_array
                            .f
                            .env(env)
                            .call(
                                    NamespaceGlobal.strtolower
                                            .env(env)
                                            .call(proto.arrayGet(env, 0))
                                            .value(),
                                    ZVal.arrayFromList("https", "on", "ssl", "1"),
                                    true)
                            .value());
        }

        https = env.callMethod(this.server, "get", Request.class, "HTTPS");
        return ZVal.assign(
                ZVal.toBool(!ZVal.isEmpty(https))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        "off",
                                        "!==",
                                        NamespaceGlobal.strtolower.env(env).call(https).value())));
    }

    @ConvertedMethod
    public Object getHost(RuntimeEnv env, Object... args) {
        ReferenceContainer host = new BasicReferenceContainer(null);
        Object pattern = null;
        if (ZVal.toBool(this.isFromTrustedProxy(env))
                && ZVal.toBool(
                        host.setObject(
                                this.getTrustedValues(env, CONST_HEADER_X_FORWARDED_HOST)))) {
            host.setObject(ZVal.assign(host.arrayGet(env, 0)));

        } else if (!ZVal.isTrue(
                host.setObject(env.callMethod(this.headers, "get", Request.class, "HOST")))) {
            if (!ZVal.isTrue(
                    host.setObject(
                            env.callMethod(this.server, "get", Request.class, "SERVER_NAME")))) {
                host.setObject(
                        env.callMethod(this.server, "get", Request.class, "SERVER_ADDR", ""));
            }
        }

        host.setObject(
                NamespaceGlobal.strtolower
                        .env(env)
                        .call(
                                function_preg_replace
                                        .f
                                        .env(env)
                                        .call(
                                                "/:\\d+$/",
                                                "",
                                                function_trim
                                                        .f
                                                        .env(env)
                                                        .call(host.getObject())
                                                        .value())
                                        .value())
                        .value());
        if (ZVal.toBool(host.getObject())
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                "",
                                "!==",
                                function_preg_replace
                                        .f
                                        .env(env)
                                        .call(
                                                "/(?:^\\[)?[a-zA-Z0-9-:\\]_]+\\.?/",
                                                "",
                                                host.getObject())
                                        .value()))) {
            if (!ZVal.isTrue(this.isHostValid)) {
                return "";
            }

            this.isHostValid = false;
            throw ZVal.getException(
                    env,
                    new SuspiciousOperationException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Invalid Host \"%s\".", host.getObject())
                                    .value()));
        }

        if (ZVal.isGreaterThan(
                function_count
                        .f
                        .env(env)
                        .call(
                                env.getRequestStaticProperties(
                                                com.project
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
                                                        .RequestStaticProperties
                                                        .class)
                                        .trustedHostPatterns)
                        .value(),
                '>',
                0)) {
            if (function_in_array
                    .f
                    .env(env)
                    .call(
                            host.getObject(),
                            env.getRequestStaticProperties(
                                            com.project
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
                                                    .RequestStaticProperties
                                                    .class)
                                    .trustedHosts)
                    .getBool()) {
                return ZVal.assign(host.getObject());
            }

            for (ZPair zpairResult1865 :
                    ZVal.getIterable(
                            env.getRequestStaticProperties(
                                            com.project
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
                                                    .RequestStaticProperties
                                                    .class)
                                    .trustedHostPatterns,
                            env,
                            true)) {
                pattern = ZVal.assign(zpairResult1865.getValue());
                if (function_preg_match.f.env(env).call(pattern, host.getObject()).getBool()) {
                    env.getRequestStaticPropertiesReference(
                                    com.project
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
                                            .RequestStaticProperties
                                            .class,
                                    "trustedHosts")
                            .arrayAppend(env)
                            .set(host.getObject());
                    return ZVal.assign(host.getObject());
                }
            }

            if (!ZVal.isTrue(this.isHostValid)) {
                return "";
            }

            this.isHostValid = false;
            throw ZVal.getException(
                    env,
                    new SuspiciousOperationException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Untrusted Host \"%s\".", host.getObject())
                                    .value()));
        }

        return ZVal.assign(host.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    public Object setMethod(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        this.method = ZVal.getNull();
        env.callMethod(this.server, "set", Request.class, "REQUEST_METHOD", method);
        return null;
    }

    @ConvertedMethod
    public Object getMethod(RuntimeEnv env, Object... args) {
        Object method = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.method)) {
            this.method =
                    NamespaceGlobal.strtoupper
                            .env(env)
                            .call(
                                    env.callMethod(
                                            this.server,
                                            "get",
                                            Request.class,
                                            "REQUEST_METHOD",
                                            "GET"))
                            .value();
            if (ZVal.strictEqualityCheck("POST", "===", this.method)) {
                if (ZVal.isTrue(
                        method =
                                env.callMethod(
                                        this.headers,
                                        "get",
                                        Request.class,
                                        "X-HTTP-METHOD-OVERRIDE"))) {
                    this.method = NamespaceGlobal.strtoupper.env(env).call(method).value();

                } else if (ZVal.isTrue(
                        env.getRequestStaticProperties(
                                        com.project
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
                                                .RequestStaticProperties
                                                .class)
                                .httpMethodParameterOverride)) {
                    this.method =
                            NamespaceGlobal.strtoupper
                                    .env(env)
                                    .call(
                                            env.callMethod(
                                                    this.request,
                                                    "get",
                                                    Request.class,
                                                    "_method",
                                                    env.callMethod(
                                                            this.query,
                                                            "get",
                                                            Request.class,
                                                            "_method",
                                                            "POST")))
                                    .value();
                }
            }
        }

        return ZVal.assign(this.method);
    }

    @ConvertedMethod
    public Object getRealMethod(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.strtoupper
                        .env(env)
                        .call(
                                env.callMethod(
                                        this.server, "get", Request.class, "REQUEST_METHOD", "GET"))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "format")
    public Object getMimeType(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(
                ZVal.getNull(),
                "===",
                env.getRequestStaticProperties(
                                com.project
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
                                        .RequestStaticProperties
                                        .class)
                        .formats)) {
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Request.class)
                    .method("initializeFormats")
                    .call()
                    .value();
        }

        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                env.getRequestStaticPropertiesReference(
                                        com.project
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
                                                .RequestStaticProperties
                                                .class,
                                        "formats"),
                                env,
                                format)
                        ? env.getRequestStaticPropertiesReference(
                                        com.project
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
                                                .RequestStaticProperties
                                                .class,
                                        "formats")
                                .arrayGet(env, format, 0)
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mimeType")
    public Object getFormat(RuntimeEnv env, Object... args) {
        Object mimeType = assignParameter(args, 0, false);
        Object mimeTypes = null;
        Object pos = null;
        Object canonicalMimeType = null;
        Object format = null;
        canonicalMimeType = ZVal.getNull();
        if (ZVal.strictNotEqualityCheck(
                false, "!==", pos = function_strpos.f.env(env).call(mimeType, ";").value())) {
            canonicalMimeType = function_substr.f.env(env).call(mimeType, 0, pos).value();
        }

        if (ZVal.strictEqualityCheck(
                ZVal.getNull(),
                "===",
                env.getRequestStaticProperties(
                                com.project
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
                                        .RequestStaticProperties
                                        .class)
                        .formats)) {
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Request.class)
                    .method("initializeFormats")
                    .call()
                    .value();
        }

        for (ZPair zpairResult1866 :
                ZVal.getIterable(
                        env.getRequestStaticProperties(
                                        com.project
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
                                                .RequestStaticProperties
                                                .class)
                                .formats,
                        env,
                        false)) {
            format = ZVal.assign(zpairResult1866.getKey());
            mimeTypes = ZVal.assign(zpairResult1866.getValue());
            if (function_in_array.f.env(env).call(mimeType, rToArrayCast(mimeTypes)).getBool()) {
                return ZVal.assign(format);
            }

            if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", canonicalMimeType))
                    && ZVal.toBool(
                            function_in_array
                                    .f
                                    .env(env)
                                    .call(canonicalMimeType, rToArrayCast(mimeTypes))
                                    .value())) {
                return ZVal.assign(format);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "format")
    @ConvertedParameter(index = 1, name = "mimeTypes")
    public Object setFormat(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, false);
        Object mimeTypes = assignParameter(args, 1, false);
        if (ZVal.strictEqualityCheck(
                ZVal.getNull(),
                "===",
                env.getRequestStaticProperties(
                                com.project
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
                                        .RequestStaticProperties
                                        .class)
                        .formats)) {
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Request.class)
                    .method("initializeFormats")
                    .call()
                    .value();
        }

        env.getRequestStaticPropertiesReference(
                        com.project
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
                                .RequestStaticProperties
                                .class,
                        "formats")
                .arrayAccess(env, format)
                .set(
                        function_is_array.f.env(env).call(mimeTypes).getBool()
                                ? mimeTypes
                                : ZVal.newArray(new ZPair(0, mimeTypes)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "default")
    public Object getRequestFormat(RuntimeEnv env, Object... args) {
        Object _pDefault = assignParameter(args, 0, true);
        if (null == _pDefault) {
            _pDefault = "html";
        }
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.format)) {
            this.format = env.callMethod(this.attributes, "get", Request.class, "_format");
        }

        return ZVal.assign(
                ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.format)
                        ? _pDefault
                        : this.format);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "format")
    public Object setRequestFormat(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, false);
        this.format = format;
        return null;
    }

    @ConvertedMethod
    public Object getContentType(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                this.getFormat(
                        env, env.callMethod(this.headers, "get", Request.class, "CONTENT_TYPE")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    public Object setDefaultLocale(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        this.defaultLocale = locale;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.locale)) {
            this.setPhpDefaultLocale(env, locale);
        }

        return null;
    }

    @ConvertedMethod
    public Object getDefaultLocale(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.defaultLocale);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    public Object setLocale(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        this.setPhpDefaultLocale(env, this.locale = locale);
        return null;
    }

    @ConvertedMethod
    public Object getLocale(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.locale)
                        ? this.defaultLocale
                        : this.locale);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    public Object isMethod(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        this.getMethod(env),
                        "===",
                        NamespaceGlobal.strtoupper.env(env).call(method).value()));
    }

    @ConvertedMethod
    public Object isMethodSafe(RuntimeEnv env, Object... args) {
        if (ZVal.toBool(
                        !function_func_num_args
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call()
                                .getBool())
                || ZVal.toBool(
                        function_func_get_arg
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(0)
                                .value())) {
            throw ZVal.getException(
                    env,
                    new BadMethodCallException(
                            env,
                            "Checking only for cacheable HTTP methods with Symfony\\Component\\HttpFoundation\\Request::isMethodSafe() is not supported."));
        }

        return ZVal.assign(
                function_in_array
                        .f
                        .env(env)
                        .call(
                                this.getMethod(env),
                                ZVal.arrayFromList("GET", "HEAD", "OPTIONS", "TRACE"))
                        .value());
    }

    @ConvertedMethod
    public Object isMethodIdempotent(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_in_array
                        .f
                        .env(env)
                        .call(
                                this.getMethod(env),
                                ZVal.arrayFromList(
                                        "HEAD", "GET", "PUT", "DELETE", "TRACE", "OPTIONS",
                                        "PURGE"))
                        .value());
    }

    @ConvertedMethod
    public Object isMethodCacheable(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_in_array
                        .f
                        .env(env)
                        .call(this.getMethod(env), ZVal.arrayFromList("GET", "HEAD"))
                        .value());
    }

    @ConvertedMethod
    public Object getProtocolVersion(RuntimeEnv env, Object... args) {
        ReferenceContainer matches = new BasicReferenceContainer(null);
        if (ZVal.isTrue(this.isFromTrustedProxy(env))) {
            function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(
                            "~^(HTTP/)?([1-9]\\.[0-9]) ~",
                            env.callMethod(this.headers, "get", Request.class, "Via"),
                            matches.getObject());
            if (ZVal.isTrue(matches.getObject())) {
                return ZVal.assign("HTTP/" + toStringR(matches.arrayGet(env, 2), env));
            }
        }

        return ZVal.assign(env.callMethod(this.server, "get", Request.class, "SERVER_PROTOCOL"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "asResource",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object getContent(RuntimeEnv env, Object... args) {
        Object asResource = assignParameter(args, 0, true);
        if (null == asResource) {
            asResource = false;
        }
        Object resource = null;
        Object currentContentIsResource = null;
        currentContentIsResource = function_is_resource.f.env(env).call(this.content).value();
        if (ZVal.strictEqualityCheck(true, "===", asResource)) {
            if (ZVal.isTrue(currentContentIsResource)) {
                NamespaceGlobal.rewind.env(env).call(this.content);
                return ZVal.assign(this.content);
            }

            if (function_is_string.f.env(env).call(this.content).getBool()) {
                resource = function_fopen.f.env(env).call("php://temp", "r+").value();
                function_fwrite.f.env(env).call(resource, this.content);
                NamespaceGlobal.rewind.env(env).call(resource);
                return ZVal.assign(resource);
            }

            this.content = false;
            return ZVal.assign(function_fopen.f.env(env).call("php://input", "rb").value());
        }

        if (ZVal.isTrue(currentContentIsResource)) {
            NamespaceGlobal.rewind.env(env).call(this.content);
            return ZVal.assign(
                    NamespaceGlobal.stream_get_contents.env(env).call(this.content).value());
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.content))
                || ZVal.toBool(ZVal.strictEqualityCheck(false, "===", this.content))) {
            this.content = function_file_get_contents.f.env(env).call("php://input").value();
        }

        return ZVal.assign(this.content);
    }

    @ConvertedMethod
    public Object getETags(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.preg_split
                        .env(env)
                        .call(
                                "/\\s*,\\s*/",
                                env.callMethod(this.headers, "get", Request.class, "if_none_match"),
                                ZVal.getNull(),
                                1)
                        .value());
    }

    @ConvertedMethod
    public Object isNoCache(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                env.callMethod(
                                        this.headers,
                                        "hasCacheControlDirective",
                                        Request.class,
                                        "no-cache"))
                        || ZVal.toBool(
                                ZVal.equalityCheck(
                                        "no-cache",
                                        env.callMethod(
                                                this.headers, "get", Request.class, "Pragma"))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "locales",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getPreferredLanguage(RuntimeEnv env, Object... args) {
        ReferenceContainer locales = new BasicReferenceContainer(assignParameter(args, 0, true));
        if (null == locales.getObject()) {
            locales.setObject(ZVal.getNull());
        }
        ReferenceContainer preferredLanguages = new BasicReferenceContainer(null);
        Object superLanguage = null;
        Object language = null;
        Object position = null;
        ReferenceContainer extendedPreferredLanguages = new BasicReferenceContainer(null);
        preferredLanguages.setObject(this.getLanguages(env));
        if (ZVal.isEmpty(locales.getObject())) {
            return ZVal.assign(
                    arrayActionR(ArrayAction.ISSET, preferredLanguages, env, 0)
                            ? preferredLanguages.arrayGet(env, 0)
                            : ZVal.getNull());
        }

        if (!ZVal.isTrue(preferredLanguages.getObject())) {
            return ZVal.assign(locales.arrayGet(env, 0));
        }

        extendedPreferredLanguages.setObject(ZVal.newArray());
        for (ZPair zpairResult1867 : ZVal.getIterable(preferredLanguages.getObject(), env, true)) {
            language = ZVal.assign(zpairResult1867.getValue());
            extendedPreferredLanguages.arrayAppend(env).set(language);
            if (ZVal.strictNotEqualityCheck(
                    false,
                    "!==",
                    position = function_strpos.f.env(env).call(language, "_").value())) {
                superLanguage = function_substr.f.env(env).call(language, 0, position).value();
                if (!function_in_array
                        .f
                        .env(env)
                        .call(superLanguage, preferredLanguages.getObject())
                        .getBool()) {
                    extendedPreferredLanguages.arrayAppend(env).set(superLanguage);
                }
            }
        }

        preferredLanguages.setObject(
                function_array_values
                        .f
                        .env(env)
                        .call(
                                function_array_intersect
                                        .f
                                        .env(env)
                                        .call(
                                                extendedPreferredLanguages.getObject(),
                                                locales.getObject())
                                        .value())
                        .value());
        return ZVal.assign(
                arrayActionR(ArrayAction.ISSET, preferredLanguages, env, 0)
                        ? preferredLanguages.arrayGet(env, 0)
                        : locales.arrayGet(env, 0));
    }

    @ConvertedMethod
    public Object getLanguages(RuntimeEnv env, Object... args) {
        ReferenceContainer codes = new BasicReferenceContainer(null);
        Object acceptHeaderItem = null;
        Object languages = null;
        Object max = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object lang = null;
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.languages)) {
            return ZVal.assign(this.languages);
        }

        languages =
                env.callMethod(
                        AcceptHeader.runtimeStaticObject.fromString(
                                env,
                                env.callMethod(
                                        this.headers, "get", Request.class, "Accept-Language")),
                        "all",
                        Request.class);
        this.languages = ZVal.newArray();
        for (ZPair zpairResult1868 : ZVal.getIterable(languages, env, false)) {
            lang = ZVal.assign(zpairResult1868.getKey());
            acceptHeaderItem = ZVal.assign(zpairResult1868.getValue());
            if (ZVal.strictNotEqualityCheck(
                    false, "!==", function_strpos.f.env(env).call(lang, "-").value())) {
                codes.setObject(function_explode.f.env(env).call("-", lang).value());
                if (ZVal.strictEqualityCheck("i", "===", codes.arrayGet(env, 0))) {
                    if (ZVal.isGreaterThan(
                            function_count.f.env(env).call(codes.getObject()).value(), '>', 1)) {
                        lang = ZVal.assign(codes.arrayGet(env, 1));
                    }

                } else {
                    for (i.setObject(0),
                                    max = function_count.f.env(env).call(codes.getObject()).value();
                            ZVal.isLessThan(i.getObject(), '<', max);
                            i.setObject(ZVal.increment(i.getObject()))) {
                        if (ZVal.strictEqualityCheck(0, "===", i.getObject())) {
                            lang =
                                    NamespaceGlobal.strtolower
                                            .env(env)
                                            .call(codes.arrayGet(env, 0))
                                            .value();

                        } else {
                            lang =
                                    toStringR(lang, env)
                                            + "_"
                                            + toStringR(
                                                    NamespaceGlobal.strtoupper
                                                            .env(env)
                                                            .call(
                                                                    codes.arrayGet(
                                                                            env, i.getObject()))
                                                            .value(),
                                                    env);
                        }
                    }
                }
            }

            new ReferenceClassProperty(this, "languages", env).arrayAppend(env).set(lang);
        }

        return ZVal.assign(this.languages);
    }

    @ConvertedMethod
    public Object getCharsets(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.charsets)) {
            return ZVal.assign(this.charsets);
        }

        return ZVal.assign(
                this.charsets =
                        function_array_keys
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(
                                                AcceptHeader.runtimeStaticObject.fromString(
                                                        env,
                                                        env.callMethod(
                                                                this.headers,
                                                                "get",
                                                                Request.class,
                                                                "Accept-Charset")),
                                                "all",
                                                Request.class))
                                .value());
    }

    @ConvertedMethod
    public Object getEncodings(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.encodings)) {
            return ZVal.assign(this.encodings);
        }

        return ZVal.assign(
                this.encodings =
                        function_array_keys
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(
                                                AcceptHeader.runtimeStaticObject.fromString(
                                                        env,
                                                        env.callMethod(
                                                                this.headers,
                                                                "get",
                                                                Request.class,
                                                                "Accept-Encoding")),
                                                "all",
                                                Request.class))
                                .value());
    }

    @ConvertedMethod
    public Object getAcceptableContentTypes(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.acceptableContentTypes)) {
            return ZVal.assign(this.acceptableContentTypes);
        }

        return ZVal.assign(
                this.acceptableContentTypes =
                        function_array_keys
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(
                                                AcceptHeader.runtimeStaticObject.fromString(
                                                        env,
                                                        env.callMethod(
                                                                this.headers,
                                                                "get",
                                                                Request.class,
                                                                "Accept")),
                                                "all",
                                                Request.class))
                                .value());
    }

    @ConvertedMethod
    public Object isXmlHttpRequest(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.equalityCheck(
                        "XMLHttpRequest",
                        env.callMethod(this.headers, "get", Request.class, "X-Requested-With")));
    }

    @ConvertedMethod
    protected Object prepareRequestUri(RuntimeEnv env, Object... args) {
        Object requestUri = null;
        Object schemeAndHttpHost = null;
        requestUri = "";
        if (ZVal.isTrue(env.callMethod(this.headers, "has", Request.class, "X_ORIGINAL_URL"))) {
            requestUri = env.callMethod(this.headers, "get", Request.class, "X_ORIGINAL_URL");
            env.callMethod(this.headers, "remove", Request.class, "X_ORIGINAL_URL");
            env.callMethod(this.server, "remove", Request.class, "HTTP_X_ORIGINAL_URL");
            env.callMethod(this.server, "remove", Request.class, "UNENCODED_URL");
            env.callMethod(this.server, "remove", Request.class, "IIS_WasUrlRewritten");

        } else if (ZVal.isTrue(
                env.callMethod(this.headers, "has", Request.class, "X_REWRITE_URL"))) {
            requestUri = env.callMethod(this.headers, "get", Request.class, "X_REWRITE_URL");
            env.callMethod(this.headers, "remove", Request.class, "X_REWRITE_URL");

        } else if (ZVal.toBool(
                        ZVal.equalityCheck(
                                "1",
                                env.callMethod(
                                        this.server, "get", Request.class, "IIS_WasUrlRewritten")))
                && ZVal.toBool(
                        ZVal.notEqualityCheck(
                                "",
                                env.callMethod(
                                        this.server, "get", Request.class, "UNENCODED_URL")))) {
            requestUri = env.callMethod(this.server, "get", Request.class, "UNENCODED_URL");
            env.callMethod(this.server, "remove", Request.class, "UNENCODED_URL");
            env.callMethod(this.server, "remove", Request.class, "IIS_WasUrlRewritten");

        } else if (ZVal.isTrue(env.callMethod(this.server, "has", Request.class, "REQUEST_URI"))) {
            requestUri = env.callMethod(this.server, "get", Request.class, "REQUEST_URI");
            schemeAndHttpHost = this.getSchemeAndHttpHost(env);
            if (ZVal.strictEqualityCheck(
                    0,
                    "===",
                    function_strpos.f.env(env).call(requestUri, schemeAndHttpHost).value())) {
                requestUri =
                        function_substr
                                .f
                                .env(env)
                                .call(
                                        requestUri,
                                        function_strlen.f.env(env).call(schemeAndHttpHost).value())
                                .value();
            }

        } else if (ZVal.isTrue(
                env.callMethod(this.server, "has", Request.class, "ORIG_PATH_INFO"))) {
            requestUri = env.callMethod(this.server, "get", Request.class, "ORIG_PATH_INFO");
            if (ZVal.notEqualityCheck(
                    "", env.callMethod(this.server, "get", Request.class, "QUERY_STRING"))) {
                requestUri =
                        toStringR(requestUri, env)
                                + "?"
                                + toStringR(
                                        env.callMethod(
                                                this.server, "get", Request.class, "QUERY_STRING"),
                                        env);
            }

            env.callMethod(this.server, "remove", Request.class, "ORIG_PATH_INFO");
        }

        env.callMethod(this.server, "set", Request.class, "REQUEST_URI", requestUri);
        return ZVal.assign(requestUri);
    }

    @ConvertedMethod
    protected Object prepareBaseUrl(RuntimeEnv env, Object... args) {
        Object last = null;
        Object prefix = null;
        ReferenceContainer index = new BasicReferenceContainer(null);
        Object truncatedRequestUri = null;
        ReferenceContainer segs = new BasicReferenceContainer(null);
        ReferenceContainer requestUri = new BasicReferenceContainer(null);
        Object path = null;
        Object baseUrl = null;
        Object filename = null;
        Object file = null;
        Object basename = null;
        Object seg = null;
        Object pos = null;
        filename =
                NamespaceGlobal.basename
                        .env(env)
                        .call(env.callMethod(this.server, "get", Request.class, "SCRIPT_FILENAME"))
                        .value();
        if (ZVal.strictEqualityCheck(
                NamespaceGlobal.basename
                        .env(env)
                        .call(env.callMethod(this.server, "get", Request.class, "SCRIPT_NAME"))
                        .value(),
                "===",
                filename)) {
            baseUrl = env.callMethod(this.server, "get", Request.class, "SCRIPT_NAME");

        } else if (ZVal.strictEqualityCheck(
                NamespaceGlobal.basename
                        .env(env)
                        .call(env.callMethod(this.server, "get", Request.class, "PHP_SELF"))
                        .value(),
                "===",
                filename)) {
            baseUrl = env.callMethod(this.server, "get", Request.class, "PHP_SELF");

        } else if (ZVal.strictEqualityCheck(
                NamespaceGlobal.basename
                        .env(env)
                        .call(env.callMethod(this.server, "get", Request.class, "ORIG_SCRIPT_NAME"))
                        .value(),
                "===",
                filename)) {
            baseUrl = env.callMethod(this.server, "get", Request.class, "ORIG_SCRIPT_NAME");

        } else {
            path = env.callMethod(this.server, "get", Request.class, "PHP_SELF", "");
            file = env.callMethod(this.server, "get", Request.class, "SCRIPT_FILENAME", "");
            segs.setObject(
                    function_explode
                            .f
                            .env(env)
                            .call("/", function_trim.f.env(env).call(file, "/").value())
                            .value());
            segs.setObject(function_array_reverse.f.env(env).call(segs.getObject()).value());
            index.setObject(0);
            last = function_count.f.env(env).call(segs.getObject()).value();
            baseUrl = "";
            do {
                seg = ZVal.assign(segs.arrayGet(env, index.getObject()));
                baseUrl = "/" + toStringR(seg, env) + toStringR(baseUrl, env);
                index.setObject(ZVal.increment(index.getObject()));

            } while (ZVal.toBool(
                            ZVal.toBool(ZVal.isGreaterThan(last, '>', index.getObject()))
                                    && ZVal.toBool(
                                            ZVal.strictNotEqualityCheck(
                                                    false,
                                                    "!==",
                                                    pos =
                                                            function_strpos
                                                                    .f
                                                                    .env(env)
                                                                    .call(path, baseUrl)
                                                                    .value())))
                    && ZVal.toBool(ZVal.notEqualityCheck(0, pos)));
        }

        requestUri.setObject(this.getRequestUri(env));
        if (ZVal.toBool(ZVal.strictNotEqualityCheck("", "!==", requestUri.getObject()))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck("/", "!==", requestUri.arrayGet(env, 0)))) {
            requestUri.setObject("/" + toStringR(requestUri.getObject(), env));
        }

        if (ZVal.toBool(baseUrl)
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                false,
                                "!==",
                                prefix =
                                        this.getUrlencodedPrefix(
                                                env, requestUri.getObject(), baseUrl)))) {
            return ZVal.assign(prefix);
        }

        if (ZVal.toBool(baseUrl)
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                false,
                                "!==",
                                prefix =
                                        this.getUrlencodedPrefix(
                                                env,
                                                requestUri.getObject(),
                                                toStringR(
                                                                function_rtrim
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                function_dirname
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                baseUrl)
                                                                                        .value(),
                                                                                "/"
                                                                                        + toStringR(
                                                                                                "/",
                                                                                                env))
                                                                        .value(),
                                                                env)
                                                        + "/")))) {
            return ZVal.assign(
                    function_rtrim.f.env(env).call(prefix, "/" + toStringR("/", env)).value());
        }

        truncatedRequestUri = ZVal.assign(requestUri.getObject());
        if (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                pos = function_strpos.f.env(env).call(requestUri.getObject(), "?").value())) {
            truncatedRequestUri =
                    function_substr.f.env(env).call(requestUri.getObject(), 0, pos).value();
        }

        basename = NamespaceGlobal.basename.env(env).call(baseUrl).value();
        if (ZVal.toBool(ZVal.isEmpty(basename))
                || ZVal.toBool(
                        !function_strpos
                                .f
                                .env(env)
                                .call(
                                        NamespaceGlobal.rawurldecode
                                                .env(env)
                                                .call(truncatedRequestUri)
                                                .value(),
                                        basename)
                                .getBool())) {
            return "";
        }

        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.isGreaterThanOrEqualTo(
                                                function_strlen
                                                        .f
                                                        .env(env)
                                                        .call(requestUri.getObject())
                                                        .value(),
                                                ">=",
                                                function_strlen.f.env(env).call(baseUrl).value()))
                                && ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                false,
                                                "!==",
                                                pos =
                                                        function_strpos
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        requestUri.getObject(),
                                                                        baseUrl)
                                                                .value())))
                && ZVal.toBool(ZVal.strictNotEqualityCheck(0, "!==", pos))) {
            baseUrl =
                    function_substr
                            .f
                            .env(env)
                            .call(
                                    requestUri.getObject(),
                                    0,
                                    ZVal.add(pos, function_strlen.f.env(env).call(baseUrl).value()))
                            .value();
        }

        return ZVal.assign(
                function_rtrim.f.env(env).call(baseUrl, "/" + toStringR("/", env)).value());
    }

    @ConvertedMethod
    protected Object prepareBasePath(RuntimeEnv env, Object... args) {
        Object baseUrl = null;
        Object filename = null;
        Object basePath = null;
        baseUrl = this.getBaseUrl(env);
        if (ZVal.isEmpty(baseUrl)) {
            return "";
        }

        filename =
                NamespaceGlobal.basename
                        .env(env)
                        .call(env.callMethod(this.server, "get", Request.class, "SCRIPT_FILENAME"))
                        .value();
        if (ZVal.strictEqualityCheck(
                NamespaceGlobal.basename.env(env).call(baseUrl).value(), "===", filename)) {
            basePath = function_dirname.f.env(env).call(baseUrl).value();

        } else {
            basePath = ZVal.assign(baseUrl);
        }

        if (ZVal.strictEqualityCheck("\\", "===", "/")) {
            basePath = function_str_replace.f.env(env).call("\\", "/", basePath).value();
        }

        return ZVal.assign(function_rtrim.f.env(env).call(basePath, "/").value());
    }

    @ConvertedMethod
    protected Object preparePathInfo(RuntimeEnv env, Object... args) {
        Object baseUrl = null;
        Object pos = null;
        ReferenceContainer requestUri = new BasicReferenceContainer(null);
        Object pathInfo = null;
        if (ZVal.strictEqualityCheck(
                ZVal.getNull(), "===", requestUri.setObject(this.getRequestUri(env)))) {
            return "/";
        }

        if (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                pos = function_strpos.f.env(env).call(requestUri.getObject(), "?").value())) {
            requestUri.setObject(
                    function_substr.f.env(env).call(requestUri.getObject(), 0, pos).value());
        }

        if (ZVal.toBool(ZVal.strictNotEqualityCheck("", "!==", requestUri.getObject()))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck("/", "!==", requestUri.arrayGet(env, 0)))) {
            requestUri.setObject("/" + toStringR(requestUri.getObject(), env));
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", baseUrl = this.getBaseUrl(env))) {
            return ZVal.assign(requestUri.getObject());
        }

        pathInfo =
                function_substr
                        .f
                        .env(env)
                        .call(
                                requestUri.getObject(),
                                function_strlen.f.env(env).call(baseUrl).value())
                        .value();
        if (ZVal.toBool(ZVal.strictEqualityCheck(false, "===", pathInfo))
                || ZVal.toBool(ZVal.strictEqualityCheck("", "===", pathInfo))) {
            return "/";
        }

        return ZVal.assign(toStringR(pathInfo, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale", typeHint = "string")
    private Object setPhpDefaultLocale(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        Object e = null;
        try {
            if (function_class_exists.f.env(env).call("Locale", false).getBool()) {
                Locale.runtimeStaticObject.setDefault(env, locale);
            }

        } catch (ConvertedException convertedException258) {
            if (convertedException258.instanceOf(PHPException.class, "Exception")) {
                e = convertedException258.getObject();
            } else {
                throw convertedException258;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string", typeHint = "string")
    @ConvertedParameter(index = 1, name = "prefix", typeHint = "string")
    private Object getUrlencodedPrefix(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        Object prefix = assignParameter(args, 1, false);
        Object len = null;
        ReferenceContainer match = new BasicReferenceContainer(null);
        if (ZVal.strictNotEqualityCheck(
                0,
                "!==",
                function_strpos
                        .f
                        .env(env)
                        .call(NamespaceGlobal.rawurldecode.env(env).call(string).value(), prefix)
                        .value())) {
            return ZVal.assign(false);
        }

        len = function_strlen.f.env(env).call(prefix).value();
        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, match))
                .call(
                        function_sprintf
                                .f
                                .env(env)
                                .call("#^(%%[[:xdigit:]]{2}|.){%d}#", len)
                                .value(),
                        string,
                        match.getObject())
                .getBool()) {
            return ZVal.assign(match.arrayGet(env, 0));
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object isFromTrustedProxy(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                env.getRequestStaticProperties(
                                                com.project
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
                                                        .RequestStaticProperties
                                                        .class)
                                        .trustedProxies)
                        && ZVal.toBool(
                                IpUtils.runtimeStaticObject.checkIp(
                                        env,
                                        env.callMethod(
                                                this.server, "get", Request.class, "REMOTE_ADDR"),
                                        env.getRequestStaticProperties(
                                                        com.project
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
                                                                .RequestStaticProperties
                                                                .class)
                                                .trustedProxies)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(
        index = 1,
        name = "ip",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    private Object getTrustedValues(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object ip = assignParameter(args, 1, true);
        if (null == ip) {
            ip = ZVal.getNull();
        }
        Object subParts = null;
        ReferenceContainer clientValues = new BasicReferenceContainer(null);
        Object param = null;
        Object v = null;
        Object parts = null;
        ReferenceContainer assoc = new BasicReferenceContainer(null);
        ReferenceContainer forwardedValues = new BasicReferenceContainer(null);
        Object forwarded = null;
        clientValues.setObject(ZVal.newArray());
        forwardedValues.setObject(ZVal.newArray());
        if (ZVal.toBool(
                        ZVal.toLong(
                                        env.getRequestStaticProperties(
                                                        com.project
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
                                                                .RequestStaticProperties
                                                                .class)
                                                .trustedHeaderSet)
                                & ZVal.toLong(type))
                && ZVal.toBool(
                        env.callMethod(
                                this.headers,
                                "has",
                                Request.class,
                                env.getRequestStaticPropertiesReference(
                                                com.project
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
                                                        .RequestStaticProperties
                                                        .class,
                                                "trustedHeaders")
                                        .arrayGet(env, type)))) {
            for (ZPair zpairResult1869 :
                    ZVal.getIterable(
                            function_explode
                                    .f
                                    .env(env)
                                    .call(
                                            ",",
                                            env.callMethod(
                                                    this.headers,
                                                    "get",
                                                    Request.class,
                                                    env.getRequestStaticPropertiesReference(
                                                                    com.project
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
                                                                            .RequestStaticProperties
                                                                            .class,
                                                                    "trustedHeaders")
                                                            .arrayGet(env, type)))
                                    .value(),
                            env,
                            true)) {
                v = ZVal.assign(zpairResult1869.getValue());
                clientValues
                        .arrayAppend(env)
                        .set(
                                toStringR(
                                                ZVal.strictEqualityCheck(
                                                                CONST_HEADER_X_FORWARDED_PORT,
                                                                "===",
                                                                type)
                                                        ? "0.0.0.0:"
                                                        : "",
                                                env)
                                        + toStringR(function_trim.f.env(env).call(v).value(), env));
            }
        }

        if (ZVal.toBool(
                        ZVal.toLong(
                                        env.getRequestStaticProperties(
                                                        com.project
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
                                                                .RequestStaticProperties
                                                                .class)
                                                .trustedHeaderSet)
                                & ZVal.toLong(CONST_HEADER_FORWARDED))
                && ZVal.toBool(
                        env.callMethod(
                                this.headers,
                                "has",
                                Request.class,
                                env.getRequestStaticPropertiesReference(
                                                com.project
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
                                                        .RequestStaticProperties
                                                        .class,
                                                "trustedHeaders")
                                        .arrayGet(env, CONST_HEADER_FORWARDED)))) {
            forwarded =
                    env.callMethod(
                            this.headers,
                            "get",
                            Request.class,
                            env.getRequestStaticPropertiesReference(
                                            com.project
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
                                                    .RequestStaticProperties
                                                    .class,
                                            "trustedHeaders")
                                    .arrayGet(env, CONST_HEADER_FORWARDED));
            parts = HeaderUtils.runtimeStaticObject.split(env, forwarded, ",;=");
            forwardedValues.setObject(ZVal.newArray());
            param =
                    ZVal.assign(
                            env.getRequestStaticPropertiesReference(
                                            com.project
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
                                                    .RequestStaticProperties
                                                    .class,
                                            "forwardedParams")
                                    .arrayGet(env, type));
            for (ZPair zpairResult1870 : ZVal.getIterable(parts, env, true)) {
                subParts = ZVal.assign(zpairResult1870.getValue());
                assoc.setObject(HeaderUtils.runtimeStaticObject.combine(env, subParts));
                if (arrayActionR(ArrayAction.ISSET, assoc, env, param)) {
                    forwardedValues.arrayAppend(env).set(assoc.arrayGet(env, param));
                }
            }
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", ip)) {
            clientValues.setObject(
                    this.normalizeAndFilterClientIps(env, clientValues.getObject(), ip));
            forwardedValues.setObject(
                    this.normalizeAndFilterClientIps(env, forwardedValues.getObject(), ip));
        }

        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                forwardedValues.getObject(), "===", clientValues.getObject()))
                || ZVal.toBool(!ZVal.isTrue(clientValues.getObject()))) {
            return ZVal.assign(forwardedValues.getObject());
        }

        if (!ZVal.isTrue(forwardedValues.getObject())) {
            return ZVal.assign(clientValues.getObject());
        }

        if (!ZVal.isTrue(this.isForwardedValid)) {
            return ZVal.assign(
                    ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", ip)
                            ? ZVal.newArray(new ZPair(0, "0.0.0.0"), new ZPair(1, ip))
                            : ZVal.newArray());
        }

        this.isForwardedValid = false;
        throw ZVal.getException(
                env,
                new ConflictingHeadersException(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "The request has both a trusted \"%s\" header and a trusted \"%s\" header, conflicting with each other. You should either configure your proxy to remove one of them, or configure your project to distrust the offending one.",
                                        env.getRequestStaticPropertiesReference(
                                                        com.project
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
                                                                .RequestStaticProperties
                                                                .class,
                                                        "trustedHeaders")
                                                .arrayGet(env, CONST_HEADER_FORWARDED),
                                        env.getRequestStaticPropertiesReference(
                                                        com.project
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
                                                                .RequestStaticProperties
                                                                .class,
                                                        "trustedHeaders")
                                                .arrayGet(env, type))
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "clientIps", typeHint = "array")
    @ConvertedParameter(index = 1, name = "ip")
    private Object normalizeAndFilterClientIps(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer clientIps = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ip = assignParameter(args, 1, false);
        Object firstTrustedIp = null;
        ReferenceContainer clientIp = new BasicReferenceContainer(null);
        Object i = null;
        Object key = null;
        if (!ZVal.isTrue(clientIps.getObject())) {
            return ZVal.assign(ZVal.newArray());
        }

        clientIps.arrayAppend(env).set(ip);
        firstTrustedIp = ZVal.getNull();
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1871 : ZVal.getIterable(clientIps.getObject(), env, false)) {
            key = ZVal.assign(zpairResult1871.getKey());
            clientIp.setObject(ZVal.assign(zpairResult1871.getValue()));
            if (function_strpos.f.env(env).call(clientIp.getObject(), ".").getBool()) {
                i = function_strpos.f.env(env).call(clientIp.getObject(), ":").value();
                if (ZVal.isTrue(i)) {
                    clientIps
                            .arrayAccess(env, key)
                            .set(
                                    clientIp.setObject(
                                            function_substr
                                                    .f
                                                    .env(env)
                                                    .call(clientIp.getObject(), 0, i)
                                                    .value()));
                }

            } else if (ZVal.equalityCheck("[", clientIp.arrayGet(env, 0))) {
                i = function_strpos.f.env(env).call(clientIp.getObject(), "]", 1).value();
                clientIps
                        .arrayAccess(env, key)
                        .set(
                                clientIp.setObject(
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(clientIp.getObject(), 1, ZVal.subtract(i, 1))
                                                .value()));
            }

            if (!function_filter_var.f.env(env).call(clientIp.getObject(), 275).getBool()) {
                arrayActionR(ArrayAction.UNSET, clientIps, env, key);
                continue;
            }

            if (ZVal.isTrue(
                    IpUtils.runtimeStaticObject.checkIp(
                            env,
                            clientIp.getObject(),
                            env.getRequestStaticProperties(
                                            com.project
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
                                                    .RequestStaticProperties
                                                    .class)
                                    .trustedProxies))) {
                arrayActionR(ArrayAction.UNSET, clientIps, env, key);
                if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", firstTrustedIp)) {
                    firstTrustedIp = ZVal.assign(clientIp.getObject());
                }
            }
        }

        return ZVal.assign(
                ZVal.isTrue(clientIps.getObject())
                        ? function_array_reverse.f.env(env).call(clientIps.getObject()).value()
                        : ZVal.newArray(new ZPair(0, firstTrustedIp)));
    }

    public static final Object CONST_HEADER_FORWARDED = 1;

    public static final Object CONST_HEADER_X_FORWARDED_FOR = 2;

    public static final Object CONST_HEADER_X_FORWARDED_HOST = 4;

    public static final Object CONST_HEADER_X_FORWARDED_PROTO = 8;

    public static final Object CONST_HEADER_X_FORWARDED_PORT = 16;

    public static final Object CONST_HEADER_X_FORWARDED_ALL = 30;

    public static final Object CONST_HEADER_X_FORWARDED_AWS_ELB = 26;

    public static final Object CONST_METHOD_HEAD = "HEAD";

    public static final Object CONST_METHOD_GET = "GET";

    public static final Object CONST_METHOD_POST = "POST";

    public static final Object CONST_METHOD_PUT = "PUT";

    public static final Object CONST_METHOD_PATCH = "PATCH";

    public static final Object CONST_METHOD_DELETE = "DELETE";

    public static final Object CONST_METHOD_PURGE = "PURGE";

    public static final Object CONST_METHOD_OPTIONS = "OPTIONS";

    public static final Object CONST_METHOD_TRACE = "TRACE";

    public static final Object CONST_METHOD_CONNECT = "CONNECT";

    public static final Object CONST_class = "Symfony\\Component\\HttpFoundation\\Request";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object createFromGlobals(RuntimeEnv env, Object... args) {
            Object request = null;
            ReferenceContainer _COOKIE = new GlobalVariableReference(env, "_COOKIE");
            ReferenceContainer _FILES = new GlobalVariableReference(env, "_FILES");
            ReferenceContainer data = new BasicReferenceContainer(null);
            ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
            ReferenceContainer _GET = new GlobalVariableReference(env, "_GET");
            ReferenceContainer _POST = new GlobalVariableReference(env, "_POST");
            request =
                    runtimeStaticObject.createRequestFromFactory(
                            env,
                            _GET.getObject(),
                            _POST.getObject(),
                            ZVal.newArray(),
                            _COOKIE.getObject(),
                            _FILES.getObject(),
                            _SERVER.getObject());
            if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    0,
                                    "===",
                                    function_strpos
                                            .f
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            toObjectR(request)
                                                                    .accessProp(this, env)
                                                                    .name("headers")
                                                                    .value(),
                                                            "get",
                                                            Request.class,
                                                            "CONTENT_TYPE"),
                                                    "application/x-www-form-urlencoded")
                                            .value()))
                    && ZVal.toBool(
                            function_in_array
                                    .f
                                    .env(env)
                                    .call(
                                            NamespaceGlobal.strtoupper
                                                    .env(env)
                                                    .call(
                                                            env.callMethod(
                                                                    toObjectR(request)
                                                                            .accessProp(this, env)
                                                                            .name("server")
                                                                            .value(),
                                                                    "get",
                                                                    Request.class,
                                                                    "REQUEST_METHOD",
                                                                    "GET"))
                                                    .value(),
                                            ZVal.arrayFromList("PUT", "DELETE", "PATCH"))
                                    .value())) {
                function_parse_str
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(1, data))
                        .call(
                                env.callMethod(request, "getContent", Request.class),
                                data.getObject());
                toObjectR(request)
                        .accessProp(this, env)
                        .name("request")
                        .set(new ParameterBag(env, data.getObject()));
            }

            return ZVal.assign(request);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "uri")
        @ConvertedParameter(index = 1, name = "method")
        @ConvertedParameter(
            index = 2,
            name = "parameters",
            defaultValue = "",
            defaultValueType = "array"
        )
        @ConvertedParameter(
            index = 3,
            name = "cookies",
            defaultValue = "",
            defaultValueType = "array"
        )
        @ConvertedParameter(
            index = 4,
            name = "files",
            defaultValue = "",
            defaultValueType = "array"
        )
        @ConvertedParameter(
            index = 5,
            name = "server",
            defaultValue = "",
            defaultValueType = "array"
        )
        @ConvertedParameter(
            index = 6,
            name = "content",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object create(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            Object uri = assignParameter(args, 0, false);
            Object method = assignParameter(args, 1, true);
            if (null == method) {
                method = "GET";
            }
            Object parameters = assignParameter(args, 2, true);
            if (null == parameters) {
                parameters = ZVal.newArray();
            }
            Object cookies = assignParameter(args, 3, true);
            if (null == cookies) {
                cookies = ZVal.newArray();
            }
            Object files = assignParameter(args, 4, true);
            if (null == files) {
                files = ZVal.newArray();
            }
            ReferenceContainer server = new BasicReferenceContainer(assignParameter(args, 5, true));
            if (null == server.getObject()) {
                server.setObject(ZVal.newArray());
            }
            Object content = assignParameter(args, 6, true);
            if (null == content) {
                content = ZVal.getNull();
            }
            Object request = null;
            ReferenceContainer components = new BasicReferenceContainer(null);
            ReferenceContainer qs = new BasicReferenceContainer(null);
            Object query = null;
            Object queryString = null;
            server.setObject(
                    function_array_replace
                            .f
                            .env(env)
                            .call(
                                    ZVal.newArray(
                                            new ZPair("SERVER_NAME", "localhost"),
                                            new ZPair("SERVER_PORT", 80),
                                            new ZPair("HTTP_HOST", "localhost"),
                                            new ZPair("HTTP_USER_AGENT", "Symfony"),
                                            new ZPair(
                                                    "HTTP_ACCEPT",
                                                    "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8"),
                                            new ZPair("HTTP_ACCEPT_LANGUAGE", "en-us,en;q=0.5"),
                                            new ZPair(
                                                    "HTTP_ACCEPT_CHARSET",
                                                    "ISO-8859-1,utf-8;q=0.7,*;q=0.7"),
                                            new ZPair("REMOTE_ADDR", "127.0.0.1"),
                                            new ZPair("SCRIPT_NAME", ""),
                                            new ZPair("SCRIPT_FILENAME", ""),
                                            new ZPair("SERVER_PROTOCOL", "HTTP/1.1"),
                                            new ZPair(
                                                    "REQUEST_TIME",
                                                    NamespaceGlobal.time.env(env).call().value())),
                                    server.getObject())
                            .value());
            server.arrayAccess(env, "PATH_INFO").set("");
            server.arrayAccess(env, "REQUEST_METHOD")
                    .set(NamespaceGlobal.strtoupper.env(env).call(method).value());
            components.setObject(NamespaceGlobal.parse_url.env(env).call(uri).value());
            if (arrayActionR(ArrayAction.ISSET, components, env, "host")) {
                server.arrayAccess(env, "SERVER_NAME").set(components.arrayGet(env, "host"));
                server.arrayAccess(env, "HTTP_HOST").set(components.arrayGet(env, "host"));
            }

            if (arrayActionR(ArrayAction.ISSET, components, env, "scheme")) {
                if (ZVal.strictEqualityCheck("https", "===", components.arrayGet(env, "scheme"))) {
                    server.arrayAccess(env, "HTTPS").set("on");
                    server.arrayAccess(env, "SERVER_PORT").set(443);

                } else {
                    arrayActionR(ArrayAction.UNSET, server, env, "HTTPS");
                    server.arrayAccess(env, "SERVER_PORT").set(80);
                }
            }

            if (arrayActionR(ArrayAction.ISSET, components, env, "port")) {
                server.arrayAccess(env, "SERVER_PORT").set(components.arrayGet(env, "port"));
                server.arrayAccess(env, "HTTP_HOST")
                        .set(
                                toStringR(server.arrayGet(env, "HTTP_HOST"), env)
                                        + ":"
                                        + toStringR(components.arrayGet(env, "port"), env));
            }

            if (arrayActionR(ArrayAction.ISSET, components, env, "user")) {
                server.arrayAccess(env, "PHP_AUTH_USER").set(components.arrayGet(env, "user"));
            }

            if (arrayActionR(ArrayAction.ISSET, components, env, "pass")) {
                server.arrayAccess(env, "PHP_AUTH_PW").set(components.arrayGet(env, "pass"));
            }

            if (!arrayActionR(ArrayAction.ISSET, components, env, "path")) {
                components.arrayAccess(env, "path").set("/");
            }

            SwitchEnumType119 switchVariable119 =
                    ZVal.getEnum(
                            NamespaceGlobal.strtoupper.env(env).call(method).value(),
                            SwitchEnumType119.DEFAULT_CASE,
                            SwitchEnumType119.STRING_POST,
                            "POST",
                            SwitchEnumType119.STRING_PUT,
                            "PUT",
                            SwitchEnumType119.STRING_DELETE,
                            "DELETE",
                            SwitchEnumType119.STRING_PATCH,
                            "PATCH");
            switch (switchVariable119) {
                case STRING_POST:
                case STRING_PUT:
                case STRING_DELETE:
                    if (!arrayActionR(ArrayAction.ISSET, server, env, "CONTENT_TYPE")) {
                        server.arrayAccess(env, "CONTENT_TYPE")
                                .set("application/x-www-form-urlencoded");
                    }

                case STRING_PATCH:
                    request = ZVal.assign(parameters);
                    query = ZVal.newArray();
                    break;
                case DEFAULT_CASE:
                    request = ZVal.newArray();
                    query = ZVal.assign(parameters);
                    break;
            }
            ;
            queryString = "";
            if (arrayActionR(ArrayAction.ISSET, components, env, "query")) {
                function_parse_str
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(1, qs))
                        .call(
                                NamespaceGlobal.html_entity_decode
                                        .env(env)
                                        .call(components.arrayGet(env, "query"))
                                        .value(),
                                qs.getObject());
                if (ZVal.isTrue(query)) {
                    query = function_array_replace.f.env(env).call(qs.getObject(), query).value();
                    queryString =
                            NamespaceGlobal.http_build_query.env(env).call(query, "", "&").value();

                } else {
                    query = ZVal.assign(qs.getObject());
                    queryString = ZVal.assign(components.arrayGet(env, "query"));
                }

            } else if (ZVal.isTrue(query)) {
                queryString =
                        NamespaceGlobal.http_build_query.env(env).call(query, "", "&").value();
            }

            server.arrayAccess(env, "REQUEST_URI")
                    .set(
                            toStringR(components.arrayGet(env, "path"), env)
                                    + toStringR(
                                            ZVal.strictNotEqualityCheck("", "!==", queryString)
                                                    ? "?" + toStringR(queryString, env)
                                                    : "",
                                            env));
            server.arrayAccess(env, "QUERY_STRING").set(queryString);
            return ZVal.assign(
                    runtimeStaticObject.createRequestFromFactory(
                            env,
                            query,
                            request,
                            ZVal.newArray(),
                            cookies,
                            files,
                            server.getObject(),
                            content));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callable")
        public Object setFactory(RuntimeEnv env, Object... args) {
            Object callable = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
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
                                            .RequestStaticProperties
                                            .class)
                            .requestFactory =
                    callable;
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "proxies", typeHint = "array")
        @ConvertedParameter(index = 1, name = "trustedHeaderSet", typeHint = "int")
        public Object setTrustedProxies(RuntimeEnv env, Object... args) {
            Object proxies = assignParameter(args, 0, false);
            Object trustedHeaderSet = assignParameter(args, 1, false);
            env.getRequestStaticProperties(
                                    com.project
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
                                            .RequestStaticProperties
                                            .class)
                            .trustedProxies =
                    proxies;
            env.getRequestStaticProperties(
                                    com.project
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
                                            .RequestStaticProperties
                                            .class)
                            .trustedHeaderSet =
                    trustedHeaderSet;
            return null;
        }

        @ConvertedMethod
        public Object getTrustedProxies(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
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
                                            .RequestStaticProperties
                                            .class)
                            .trustedProxies);
        }

        @ConvertedMethod
        public Object getTrustedHeaderSet(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
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
                                            .RequestStaticProperties
                                            .class)
                            .trustedHeaderSet);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "hostPatterns", typeHint = "array")
        public Object setTrustedHosts(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/symfony/http-foundation")
                            .setFile("/vendor/symfony/http-foundation/Request.php");
            Object hostPatterns = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
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
                                            .RequestStaticProperties
                                            .class)
                            .trustedHostPatterns =
                    function_array_map
                            .f
                            .env(env)
                            .call(
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Symfony\\Component\\HttpFoundation",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "hostPattern")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object hostPattern = assignParameter(args, 0, false);
                                            return ZVal.assign(
                                                    function_sprintf
                                                            .f
                                                            .env(env)
                                                            .call("{%s}i", hostPattern)
                                                            .value());
                                        }
                                    },
                                    hostPatterns)
                            .value();
            env.getRequestStaticProperties(
                                    com.project
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
                                            .RequestStaticProperties
                                            .class)
                            .trustedHosts =
                    ZVal.newArray();
            return null;
        }

        @ConvertedMethod
        public Object getTrustedHosts(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
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
                                            .RequestStaticProperties
                                            .class)
                            .trustedHostPatterns);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "qs")
        public Object normalizeQueryString(RuntimeEnv env, Object... args) {
            ReferenceContainer qs = new BasicReferenceContainer(assignParameter(args, 0, false));
            if (ZVal.equalityCheck("", qs.getObject())) {
                return "";
            }

            function_parse_str
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(1, qs))
                    .call(qs.getObject(), qs.getObject());
            function_ksort.f.env(env).call(qs.getObject());
            return ZVal.assign(
                    NamespaceGlobal.http_build_query
                            .env(env)
                            .call(qs.getObject(), "", "&", 2)
                            .value());
        }

        @ConvertedMethod
        public Object enableHttpMethodParameterOverride(RuntimeEnv env, Object... args) {
            env.getRequestStaticProperties(
                                    com.project
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
                                            .RequestStaticProperties
                                            .class)
                            .httpMethodParameterOverride =
                    true;
            return null;
        }

        @ConvertedMethod
        public Object getHttpMethodParameterOverride(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
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
                                            .RequestStaticProperties
                                            .class)
                            .httpMethodParameterOverride);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "format")
        public Object getMimeTypes(RuntimeEnv env, Object... args) {
            Object format = assignParameter(args, 0, false);
            if (ZVal.strictEqualityCheck(
                    ZVal.getNull(),
                    "===",
                    env.getRequestStaticProperties(
                                    com.project
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
                                            .RequestStaticProperties
                                            .class)
                            .formats)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Request.class)
                        .method("initializeFormats")
                        .call()
                        .value();
            }

            return ZVal.assign(
                    arrayActionR(
                                    ArrayAction.ISSET,
                                    env.getRequestStaticPropertiesReference(
                                            com.project
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
                                                    .RequestStaticProperties
                                                    .class,
                                            "formats"),
                                    env,
                                    format)
                            ? env.getRequestStaticPropertiesReference(
                                            com.project
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
                                                    .RequestStaticProperties
                                                    .class,
                                            "formats")
                                    .arrayGet(env, format)
                            : ZVal.newArray());
        }

        @ConvertedMethod
        protected Object initializeFormats(RuntimeEnv env, Object... args) {
            env.getRequestStaticProperties(
                                    com.project
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
                                            .RequestStaticProperties
                                            .class)
                            .formats =
                    ZVal.newArray(
                            new ZPair(
                                    "html",
                                    ZVal.arrayFromList("text/html", "application/xhtml+xml")),
                            new ZPair("txt", ZVal.arrayFromList("text/plain")),
                            new ZPair(
                                    "js",
                                    ZVal.arrayFromList(
                                            "application/javascript",
                                            "application/x-javascript",
                                            "text/javascript")),
                            new ZPair("css", ZVal.arrayFromList("text/css")),
                            new ZPair(
                                    "json",
                                    ZVal.arrayFromList("application/json", "application/x-json")),
                            new ZPair("jsonld", ZVal.arrayFromList("application/ld+json")),
                            new ZPair(
                                    "xml",
                                    ZVal.arrayFromList(
                                            "text/xml", "application/xml", "application/x-xml")),
                            new ZPair("rdf", ZVal.arrayFromList("application/rdf+xml")),
                            new ZPair("atom", ZVal.arrayFromList("application/atom+xml")),
                            new ZPair("rss", ZVal.arrayFromList("application/rss+xml")),
                            new ZPair(
                                    "form",
                                    ZVal.arrayFromList("application/x-www-form-urlencoded")));
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "query",
            typeHint = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        @ConvertedParameter(
            index = 1,
            name = "request",
            typeHint = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        @ConvertedParameter(
            index = 2,
            name = "attributes",
            typeHint = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        @ConvertedParameter(
            index = 3,
            name = "cookies",
            typeHint = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        @ConvertedParameter(
            index = 4,
            name = "files",
            typeHint = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        @ConvertedParameter(
            index = 5,
            name = "server",
            typeHint = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        @ConvertedParameter(
            index = 6,
            name = "content",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        private Object createRequestFromFactory(RuntimeEnv env, Object... args) {
            Object query = assignParameter(args, 0, true);
            if (null == query) {
                query = ZVal.newArray();
            }
            Object request = assignParameter(args, 1, true);
            if (null == request) {
                request = ZVal.newArray();
            }
            Object attributes = assignParameter(args, 2, true);
            if (null == attributes) {
                attributes = ZVal.newArray();
            }
            Object cookies = assignParameter(args, 3, true);
            if (null == cookies) {
                cookies = ZVal.newArray();
            }
            Object files = assignParameter(args, 4, true);
            if (null == files) {
                files = ZVal.newArray();
            }
            Object server = assignParameter(args, 5, true);
            if (null == server) {
                server = ZVal.newArray();
            }
            Object content = assignParameter(args, 6, true);
            if (null == content) {
                content = ZVal.getNull();
            }
            if (ZVal.isTrue(
                    env.getRequestStaticProperties(
                                    com.project
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
                                            .RequestStaticProperties
                                            .class)
                            .requestFactory)) {
                request =
                        function_call_user_func
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(
                                        env.getRequestStaticProperties(
                                                        com.project
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
                                                                .RequestStaticProperties
                                                                .class)
                                                .requestFactory,
                                        query,
                                        request,
                                        attributes,
                                        cookies,
                                        files,
                                        server,
                                        content)
                                .value();
                if (!ZVal.isTrue(
                        ZVal.checkInstanceType(
                                request,
                                com.project
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
                                        .class,
                                "Symfony\\Component\\HttpFoundation\\Request"))) {
                    throw ZVal.getException(
                            env,
                            new LogicException(
                                    env,
                                    "The Request factory must return an instance of Symfony\\Component\\HttpFoundation\\Request."));
                }

                return ZVal.assign(request);
            }

            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this, query, request, attributes, cookies, files, server, content));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object trustedProxies = ZVal.newArray();

        public Object trustedHostPatterns = ZVal.newArray();

        public Object trustedHosts = ZVal.newArray();

        public Object httpMethodParameterOverride = false;

        public Object formats = null;

        public Object requestFactory = null;

        public Object trustedHeaderSet = -1;

        public Object forwardedParams =
                ZVal.newArray(
                        new ZPair(CONST_HEADER_X_FORWARDED_FOR, "for"),
                        new ZPair(CONST_HEADER_X_FORWARDED_HOST, "host"),
                        new ZPair(CONST_HEADER_X_FORWARDED_PROTO, "proto"),
                        new ZPair(CONST_HEADER_X_FORWARDED_PORT, "host"));

        public Object trustedHeaders =
                ZVal.newArray(
                        new ZPair(CONST_HEADER_FORWARDED, "FORWARDED"),
                        new ZPair(CONST_HEADER_X_FORWARDED_FOR, "X_FORWARDED_FOR"),
                        new ZPair(CONST_HEADER_X_FORWARDED_HOST, "X_FORWARDED_HOST"),
                        new ZPair(CONST_HEADER_X_FORWARDED_PROTO, "X_FORWARDED_PROTO"),
                        new ZPair(CONST_HEADER_X_FORWARDED_PORT, "X_FORWARDED_PORT"));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpFoundation\\Request")
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
                            "cookies",
                            "defaultLocale",
                            "encodings",
                            "files",
                            "format",
                            "headers",
                            "isForwardedValid",
                            "isHostValid",
                            "languages",
                            "locale",
                            "method",
                            "pathInfo",
                            "query",
                            "request",
                            "requestUri",
                            "server",
                            "session")
                    .setStaticPropertyNames(
                            "formats",
                            "forwardedParams",
                            "httpMethodParameterOverride",
                            "requestFactory",
                            "trustedHeaderSet",
                            "trustedHeaders",
                            "trustedHostPatterns",
                            "trustedHosts",
                            "trustedProxies")
                    .setFilename("vendor/symfony/http-foundation/Request.php")
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

    private enum SwitchEnumType119 {
        STRING_POST,
        STRING_PUT,
        STRING_DELETE,
        STRING_PATCH,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
