package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.ParameterBag;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes.LateDataCollectorInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.KernelEvents;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes.EventSubscriberInterface;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionFunction;
import com.runtimeconverter.runtime.nativeFunctions.date.function_date;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Cookie;
import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes.DataCollector;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Response;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeClasses.spl.datastructures.SplObjectStorage;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/DataCollector/RequestDataCollector.php

*/

public class RequestDataCollector extends DataCollector
        implements EventSubscriberInterface, LateDataCollectorInterface {

    public Object controllers = null;

    public RequestDataCollector(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RequestDataCollector.class) {
            this.__construct(env, args);
        }
    }

    public RequestDataCollector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.controllers = new SplObjectStorage(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 1,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    @ConvertedParameter(
        index = 2,
        name = "exception",
        typeHint = "Exception",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object collect(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/http-kernel/DataCollector")
                        .setFile(
                                "/vendor/symfony/http-kernel/DataCollector/RequestDataCollector.php");
        int runtimeConverterContinueCount;
        Object request = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        Object exception = assignParameter(args, 2, true);
        if (null == exception) {
            exception = ZVal.getNull();
        }
        Object cookie = null;
        Object e = null;
        Object session = null;
        ReferenceContainer dotenvVars = new BasicReferenceContainer(null);
        Object redirectCookie = null;
        ReferenceContainer sessionMetadata = new BasicReferenceContainer(null);
        Object ternaryExpressionTemp = null;
        Object flashes = null;
        Object content = null;
        Object route = null;
        Object name = null;
        ReferenceContainer attributes = new BasicReferenceContainer(null);
        Object sessionAttributes = null;
        Object value = null;
        Object key = null;
        ReferenceContainer responseCookies = new BasicReferenceContainer(null);
        Object statusCode = null;
        attributes.setObject(ZVal.newArray());
        route = "";
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1920 :
                ZVal.getIterable(
                        env.callMethod(
                                toObjectR(request).accessProp(this, env).name("attributes").value(),
                                "all",
                                RequestDataCollector.class),
                        env,
                        false)) {
            key = ZVal.assign(zpairResult1920.getKey());
            value = ZVal.assign(zpairResult1920.getValue());
            if (ZVal.strictEqualityCheck("_route", "===", key)) {
                route =
                        ZVal.assign(
                                function_is_object.f.env(env).call(value).getBool()
                                        ? env.callMethod(
                                                value, "getPath", RequestDataCollector.class)
                                        : value);
                attributes.arrayAccess(env, key).set(route);

            } else {
                attributes.arrayAccess(env, key).set(value);
            }
        }

        content = ZVal.getNull();
        try {
            content = env.callMethod(request, "getContent", RequestDataCollector.class);
        } catch (ConvertedException convertedException276) {
            if (convertedException276.instanceOf(LogicException.class, "LogicException")) {
                e = convertedException276.getObject();
                content = false;
            } else {
                throw convertedException276;
            }
        }

        sessionMetadata.setObject(ZVal.newArray());
        sessionAttributes = ZVal.newArray();
        session = ZVal.getNull();
        flashes = ZVal.newArray();
        if (ZVal.isTrue(env.callMethod(request, "hasSession", RequestDataCollector.class))) {
            session = env.callMethod(request, "getSession", RequestDataCollector.class);
            if (ZVal.isTrue(env.callMethod(session, "isStarted", RequestDataCollector.class))) {
                sessionMetadata
                        .arrayAccess(env, "Created")
                        .set(
                                function_date
                                        .f
                                        .env(env)
                                        .call(
                                                "D, d M y H:i:s O",
                                                env.callMethod(
                                                        env.callMethod(
                                                                session,
                                                                "getMetadataBag",
                                                                RequestDataCollector.class),
                                                        "getCreated",
                                                        RequestDataCollector.class))
                                        .value());
                sessionMetadata
                        .arrayAccess(env, "Last used")
                        .set(
                                function_date
                                        .f
                                        .env(env)
                                        .call(
                                                "D, d M y H:i:s O",
                                                env.callMethod(
                                                        env.callMethod(
                                                                session,
                                                                "getMetadataBag",
                                                                RequestDataCollector.class),
                                                        "getLastUsed",
                                                        RequestDataCollector.class))
                                        .value());
                sessionMetadata
                        .arrayAccess(env, "Lifetime")
                        .set(
                                env.callMethod(
                                        env.callMethod(
                                                session,
                                                "getMetadataBag",
                                                RequestDataCollector.class),
                                        "getLifetime",
                                        RequestDataCollector.class));
                sessionAttributes = env.callMethod(session, "all", RequestDataCollector.class);
                flashes =
                        env.callMethod(
                                env.callMethod(session, "getFlashBag", RequestDataCollector.class),
                                "peekAll",
                                RequestDataCollector.class);
            }
        }

        statusCode = env.callMethod(response, "getStatusCode", RequestDataCollector.class);
        responseCookies.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1921 :
                ZVal.getIterable(
                        env.callMethod(
                                toObjectR(response).accessProp(this, env).name("headers").value(),
                                "getCookies",
                                RequestDataCollector.class),
                        env,
                        true)) {
            cookie = ZVal.assign(zpairResult1921.getValue());
            responseCookies
                    .arrayAccess(env, env.callMethod(cookie, "getName", RequestDataCollector.class))
                    .set(cookie);
        }

        dotenvVars.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1922 :
                ZVal.getIterable(
                        function_explode
                                .f
                                .env(env)
                                .call(
                                        ",",
                                        NamespaceGlobal.getenv
                                                .env(env)
                                                .call("SYMFONY_DOTENV_VARS")
                                                .value())
                                .value(),
                        env,
                        true)) {
            name = ZVal.assign(zpairResult1922.getValue());
            if (ZVal.toBool(ZVal.strictNotEqualityCheck("", "!==", name))
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    false,
                                    "!==",
                                    value = NamespaceGlobal.getenv.env(env).call(name).value()))) {
                dotenvVars.arrayAccess(env, name).set(value);
            }
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("data")
                .set(
                        ZVal.newArray(
                                new ZPair(
                                        "method",
                                        env.callMethod(
                                                request, "getMethod", RequestDataCollector.class)),
                                new ZPair(
                                        "format",
                                        env.callMethod(
                                                request,
                                                "getRequestFormat",
                                                RequestDataCollector.class)),
                                new ZPair("content", content),
                                new ZPair(
                                        "content_type",
                                        env.callMethod(
                                                toObjectR(response)
                                                        .accessProp(this, env)
                                                        .name("headers")
                                                        .value(),
                                                "get",
                                                RequestDataCollector.class,
                                                "Content-Type",
                                                "text/html")),
                                new ZPair(
                                        "status_text",
                                        arrayActionR(
                                                        ArrayAction.ISSET,
                                                        env.getRequestStaticPropertiesReference(
                                                                Response.RequestStaticProperties
                                                                        .class,
                                                                "statusTexts"),
                                                        env,
                                                        statusCode)
                                                ? env.getRequestStaticPropertiesReference(
                                                                Response.RequestStaticProperties
                                                                        .class,
                                                                "statusTexts")
                                                        .arrayGet(env, statusCode)
                                                : ""),
                                new ZPair("status_code", statusCode),
                                new ZPair(
                                        "request_query",
                                        env.callMethod(
                                                toObjectR(request)
                                                        .accessProp(this, env)
                                                        .name("query")
                                                        .value(),
                                                "all",
                                                RequestDataCollector.class)),
                                new ZPair(
                                        "request_request",
                                        env.callMethod(
                                                toObjectR(request)
                                                        .accessProp(this, env)
                                                        .name("request")
                                                        .value(),
                                                "all",
                                                RequestDataCollector.class)),
                                new ZPair(
                                        "request_headers",
                                        env.callMethod(
                                                toObjectR(request)
                                                        .accessProp(this, env)
                                                        .name("headers")
                                                        .value(),
                                                "all",
                                                RequestDataCollector.class)),
                                new ZPair(
                                        "request_server",
                                        env.callMethod(
                                                toObjectR(request)
                                                        .accessProp(this, env)
                                                        .name("server")
                                                        .value(),
                                                "all",
                                                RequestDataCollector.class)),
                                new ZPair(
                                        "request_cookies",
                                        env.callMethod(
                                                toObjectR(request)
                                                        .accessProp(this, env)
                                                        .name("cookies")
                                                        .value(),
                                                "all",
                                                RequestDataCollector.class)),
                                new ZPair("request_attributes", attributes.getObject()),
                                new ZPair("route", route),
                                new ZPair(
                                        "response_headers",
                                        env.callMethod(
                                                toObjectR(response)
                                                        .accessProp(this, env)
                                                        .name("headers")
                                                        .value(),
                                                "all",
                                                RequestDataCollector.class)),
                                new ZPair("response_cookies", responseCookies.getObject()),
                                new ZPair("session_metadata", sessionMetadata.getObject()),
                                new ZPair("session_attributes", sessionAttributes),
                                new ZPair("flashes", flashes),
                                new ZPair(
                                        "path_info",
                                        env.callMethod(
                                                request,
                                                "getPathInfo",
                                                RequestDataCollector.class)),
                                new ZPair("controller", "n/a"),
                                new ZPair(
                                        "locale",
                                        env.callMethod(
                                                request, "getLocale", RequestDataCollector.class)),
                                new ZPair("dotenv_vars", dotenvVars.getObject())));
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "data", env),
                env,
                "request_headers",
                "php-auth-pw")) {
            new ReferenceClassProperty(this, "data", env)
                    .arrayAccess(env, "request_headers", "php-auth-pw")
                    .set("******");
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "data", env),
                env,
                "request_server",
                "PHP_AUTH_PW")) {
            new ReferenceClassProperty(this, "data", env)
                    .arrayAccess(env, "request_server", "PHP_AUTH_PW")
                    .set("******");
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "data", env),
                env,
                "request_request",
                "_password")) {
            new ReferenceClassProperty(this, "data", env)
                    .arrayAccess(env, "request_request", "_password")
                    .set("******");
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1923 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("data").value(), env, false)) {
            key = ZVal.assign(zpairResult1923.getKey());
            value = ZVal.assign(zpairResult1923.getValue());
            if (!function_is_array.f.env(env).call(value).getBool()) {
                continue;
            }

            if (ZVal.toBool(ZVal.strictEqualityCheck("request_headers", "===", key))
                    || ZVal.toBool(ZVal.strictEqualityCheck("response_headers", "===", key))) {
                new ReferenceClassProperty(this, "data", env)
                        .arrayAccess(env, key)
                        .set(
                                function_array_map
                                        .f
                                        .env(env)
                                        .call(
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Symfony\\Component\\HttpKernel\\DataCollector",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "v")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        ReferenceContainer v =
                                                                new BasicReferenceContainer(
                                                                        assignParameter(
                                                                                args, 0, false));
                                                        return ZVal.assign(
                                                                ZVal.toBool(
                                                                                        arrayActionR(
                                                                                                ArrayAction
                                                                                                        .ISSET,
                                                                                                v,
                                                                                                env,
                                                                                                0))
                                                                                && ZVal.toBool(
                                                                                        !arrayActionR(
                                                                                                ArrayAction
                                                                                                        .ISSET,
                                                                                                v,
                                                                                                env,
                                                                                                1))
                                                                        ? v.arrayGet(env, 0)
                                                                        : v.getObject());
                                                    }
                                                },
                                                value)
                                        .value());
            }
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "controllers", env),
                env,
                request)) {
            new ReferenceClassProperty(this, "data", env)
                    .arrayAccess(env, "controller")
                    .set(
                            this.parseController(
                                    env,
                                    new ReferenceClassProperty(this, "controllers", env)
                                            .arrayGet(env, request)));
            arrayActionR(
                    ArrayAction.UNSET,
                    new ReferenceClassProperty(this, "controllers", env),
                    env,
                    request);
        }

        if (ZVal.toBool(
                        env.callMethod(
                                toObjectR(request).accessProp(this, env).name("attributes").value(),
                                "has",
                                RequestDataCollector.class,
                                "_redirected"))
                && ZVal.toBool(
                        redirectCookie =
                                env.callMethod(
                                        toObjectR(request)
                                                .accessProp(this, env)
                                                .name("cookies")
                                                .value(),
                                        "get",
                                        RequestDataCollector.class,
                                        "sf_redirect"))) {
            new ReferenceClassProperty(this, "data", env)
                    .arrayAccess(env, "redirect")
                    .set(NamespaceGlobal.json_decode.env(env).call(redirectCookie, true).value());
            env.callMethod(
                    toObjectR(response).accessProp(this, env).name("headers").value(),
                    "clearCookie",
                    RequestDataCollector.class,
                    "sf_redirect");
        }

        if (ZVal.isTrue(env.callMethod(response, "isRedirect", RequestDataCollector.class))) {
            env.callMethod(
                    toObjectR(response).accessProp(this, env).name("headers").value(),
                    "setCookie",
                    RequestDataCollector.class,
                    new Cookie(
                            env,
                            "sf_redirect",
                            NamespaceGlobal.json_encode
                                    .env(env)
                                    .call(
                                            ZVal.newArray(
                                                    new ZPair(
                                                            "token",
                                                            env.callMethod(
                                                                    toObjectR(response)
                                                                            .accessProp(this, env)
                                                                            .name("headers")
                                                                            .value(),
                                                                    "get",
                                                                    RequestDataCollector.class,
                                                                    "x-debug-token")),
                                                    new ZPair(
                                                            "route",
                                                            env.callMethod(
                                                                    toObjectR(request)
                                                                            .accessProp(this, env)
                                                                            .name("attributes")
                                                                            .value(),
                                                                    "get",
                                                                    RequestDataCollector.class,
                                                                    "_route",
                                                                    "n/a")),
                                                    new ZPair(
                                                            "method",
                                                            env.callMethod(
                                                                    request,
                                                                    "getMethod",
                                                                    RequestDataCollector.class)),
                                                    new ZPair(
                                                            "controller",
                                                            this.parseController(
                                                                    env,
                                                                    env.callMethod(
                                                                            toObjectR(request)
                                                                                    .accessProp(
                                                                                            this,
                                                                                            env)
                                                                                    .name(
                                                                                            "attributes")
                                                                                    .value(),
                                                                            "get",
                                                                            RequestDataCollector
                                                                                    .class,
                                                                            "_controller"))),
                                                    new ZPair("status_code", statusCode),
                                                    new ZPair(
                                                            "status_text",
                                                            env.getRequestStaticPropertiesReference(
                                                                            Response
                                                                                    .RequestStaticProperties
                                                                                    .class,
                                                                            "statusTexts")
                                                                    .arrayGet(
                                                                            env,
                                                                            ZVal.toLong(
                                                                                    statusCode)))))
                                    .value()));
        }

        new ReferenceClassProperty(this, "data", env)
                .arrayAccess(env, "identifier")
                .set(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                new ReferenceClassProperty(this, "data", env)
                                                        .arrayGet(env, "route"))
                                ? ternaryExpressionTemp
                                : function_is_array
                                                .f
                                                .env(env)
                                                .call(
                                                        new ReferenceClassProperty(
                                                                        this, "data", env)
                                                                .arrayGet(env, "controller"))
                                                .getBool()
                                        ? toStringR(
                                                        new ReferenceClassProperty(
                                                                        this, "data", env)
                                                                .arrayGet(
                                                                        env, "controller", "class"),
                                                        env)
                                                + "::"
                                                + toStringR(
                                                        new ReferenceClassProperty(
                                                                        this, "data", env)
                                                                .arrayGet(
                                                                        env,
                                                                        "controller",
                                                                        "method"),
                                                        env)
                                                + "()"
                                        : new ReferenceClassProperty(this, "data", env)
                                                .arrayGet(env, "controller"));
        if (ZVal.isTrue(
                env.callMethod(
                        toObjectR(response).accessProp(this, env).name("headers").value(),
                        "has",
                        RequestDataCollector.class,
                        "x-previous-debug-token"))) {
            new ReferenceClassProperty(this, "data", env)
                    .arrayAccess(env, "forward_token")
                    .set(
                            env.callMethod(
                                    toObjectR(response)
                                            .accessProp(this, env)
                                            .name("headers")
                                            .value(),
                                    "get",
                                    RequestDataCollector.class,
                                    "x-previous-debug-token"));
        }

        return null;
    }

    @ConvertedMethod
    public Object lateCollect(RuntimeEnv env, Object... args) {
        toObjectR(this)
                .accessProp(this, env)
                .name("data")
                .set(
                        env.callMethod(
                                this,
                                "cloneVar",
                                RequestDataCollector.class,
                                toObjectR(this).accessProp(this, env).name("data").value()));
        return null;
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("data").set(ZVal.newArray());
        this.controllers = new SplObjectStorage(env);
        return null;
    }

    @ConvertedMethod
    public Object getMethod(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ReferenceClassProperty(this, "data", env).arrayGet(env, "method"));
    }

    @ConvertedMethod
    public Object getPathInfo(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env).arrayGet(env, "path_info"));
    }

    @ConvertedMethod
    public Object getRequestRequest(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ParameterBag(
                        env,
                        env.callMethod(
                                new ReferenceClassProperty(this, "data", env)
                                        .arrayGet(env, "request_request"),
                                "getValue",
                                RequestDataCollector.class)));
    }

    @ConvertedMethod
    public Object getRequestQuery(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ParameterBag(
                        env,
                        env.callMethod(
                                new ReferenceClassProperty(this, "data", env)
                                        .arrayGet(env, "request_query"),
                                "getValue",
                                RequestDataCollector.class)));
    }

    @ConvertedMethod
    public Object getRequestHeaders(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ParameterBag(
                        env,
                        env.callMethod(
                                new ReferenceClassProperty(this, "data", env)
                                        .arrayGet(env, "request_headers"),
                                "getValue",
                                RequestDataCollector.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "raw",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object getRequestServer(RuntimeEnv env, Object... args) {
        Object raw = assignParameter(args, 0, true);
        if (null == raw) {
            raw = false;
        }
        return ZVal.assign(
                new ParameterBag(
                        env,
                        env.callMethod(
                                new ReferenceClassProperty(this, "data", env)
                                        .arrayGet(env, "request_server"),
                                "getValue",
                                RequestDataCollector.class,
                                raw)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "raw",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object getRequestCookies(RuntimeEnv env, Object... args) {
        Object raw = assignParameter(args, 0, true);
        if (null == raw) {
            raw = false;
        }
        return ZVal.assign(
                new ParameterBag(
                        env,
                        env.callMethod(
                                new ReferenceClassProperty(this, "data", env)
                                        .arrayGet(env, "request_cookies"),
                                "getValue",
                                RequestDataCollector.class,
                                raw)));
    }

    @ConvertedMethod
    public Object getRequestAttributes(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ParameterBag(
                        env,
                        env.callMethod(
                                new ReferenceClassProperty(this, "data", env)
                                        .arrayGet(env, "request_attributes"),
                                "getValue",
                                RequestDataCollector.class)));
    }

    @ConvertedMethod
    public Object getResponseHeaders(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ParameterBag(
                        env,
                        env.callMethod(
                                new ReferenceClassProperty(this, "data", env)
                                        .arrayGet(env, "response_headers"),
                                "getValue",
                                RequestDataCollector.class)));
    }

    @ConvertedMethod
    public Object getResponseCookies(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ParameterBag(
                        env,
                        env.callMethod(
                                new ReferenceClassProperty(this, "data", env)
                                        .arrayGet(env, "response_cookies"),
                                "getValue",
                                RequestDataCollector.class)));
    }

    @ConvertedMethod
    public Object getSessionMetadata(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        new ReferenceClassProperty(this, "data", env)
                                .arrayGet(env, "session_metadata"),
                        "getValue",
                        RequestDataCollector.class));
    }

    @ConvertedMethod
    public Object getSessionAttributes(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        new ReferenceClassProperty(this, "data", env)
                                .arrayGet(env, "session_attributes"),
                        "getValue",
                        RequestDataCollector.class));
    }

    @ConvertedMethod
    public Object getFlashes(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        new ReferenceClassProperty(this, "data", env).arrayGet(env, "flashes"),
                        "getValue",
                        RequestDataCollector.class));
    }

    @ConvertedMethod
    public Object getContent(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ReferenceClassProperty(this, "data", env).arrayGet(env, "content"));
    }

    @ConvertedMethod
    public Object getContentType(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env).arrayGet(env, "content_type"));
    }

    @ConvertedMethod
    public Object getStatusText(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env).arrayGet(env, "status_text"));
    }

    @ConvertedMethod
    public Object getStatusCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env).arrayGet(env, "status_code"));
    }

    @ConvertedMethod
    public Object getFormat(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ReferenceClassProperty(this, "data", env).arrayGet(env, "format"));
    }

    @ConvertedMethod
    public Object getLocale(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ReferenceClassProperty(this, "data", env).arrayGet(env, "locale"));
    }

    @ConvertedMethod
    public Object getDotenvVars(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ParameterBag(
                        env,
                        env.callMethod(
                                new ReferenceClassProperty(this, "data", env)
                                        .arrayGet(env, "dotenv_vars"),
                                "getValue",
                                RequestDataCollector.class)));
    }

    @ConvertedMethod
    public Object getRoute(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ReferenceClassProperty(this, "data", env).arrayGet(env, "route"));
    }

    @ConvertedMethod
    public Object getIdentifier(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env).arrayGet(env, "identifier"));
    }

    @ConvertedMethod
    public Object getRouteParams(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "data", env),
                                env,
                                "request_attributes",
                                "_route_params")
                        ? env.callMethod(
                                new ReferenceClassProperty(this, "data", env)
                                        .arrayGet(env, "request_attributes", "_route_params"),
                                "getValue",
                                RequestDataCollector.class)
                        : ZVal.newArray());
    }

    @ConvertedMethod
    public Object getController(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env).arrayGet(env, "controller"));
    }

    @ConvertedMethod
    public Object getRedirect(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "data", env),
                                env,
                                "redirect")
                        ? new ReferenceClassProperty(this, "data", env).arrayGet(env, "redirect")
                        : false);
    }

    @ConvertedMethod
    public Object getForwardToken(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "data", env),
                                env,
                                "forward_token")
                        ? new ReferenceClassProperty(this, "data", env)
                                .arrayGet(env, "forward_token")
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Symfony\\Component\\HttpKernel\\Event\\FilterControllerEvent"
    )
    public Object onKernelController(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "controllers", env)
                .arrayAccess(env, env.callMethod(event, "getRequest", RequestDataCollector.class))
                .set(env.callMethod(event, "getController", RequestDataCollector.class));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Symfony\\Component\\HttpKernel\\Event\\FilterResponseEvent"
    )
    public Object onKernelResponse(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        if (!ZVal.isTrue(env.callMethod(event, "isMasterRequest", RequestDataCollector.class))) {
            return null;
        }

        if (ZVal.isTrue(
                env.callMethod(
                        toObjectR(env.callMethod(event, "getRequest", RequestDataCollector.class))
                                .accessProp(this, env)
                                .name("cookies")
                                .value(),
                        "has",
                        RequestDataCollector.class,
                        "sf_redirect"))) {
            env.callMethod(
                    toObjectR(env.callMethod(event, "getRequest", RequestDataCollector.class))
                            .accessProp(this, env)
                            .name("attributes")
                            .value(),
                    "set",
                    RequestDataCollector.class,
                    "_redirected",
                    true);
        }

        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "request";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "controller")
    protected Object parseController(RuntimeEnv env, Object... args) {
        ReferenceContainer controller =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object r = null;
        Object e = null;
        if (ZVal.toBool(function_is_string.f.env(env).call(controller.getObject()).value())
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                false,
                                "!==",
                                function_strpos
                                        .f
                                        .env(env)
                                        .call(controller.getObject(), "::")
                                        .value()))) {
            controller.setObject(
                    function_explode.f.env(env).call("::", controller.getObject()).value());
        }

        if (function_is_array.f.env(env).call(controller.getObject()).getBool()) {
            try {
                r =
                        new ReflectionMethod(
                                env, controller.arrayGet(env, 0), controller.arrayGet(env, 1));
                return ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "class",
                                        function_is_object
                                                        .f
                                                        .env(env)
                                                        .call(controller.arrayGet(env, 0))
                                                        .getBool()
                                                ? function_get_class
                                                        .f
                                                        .env(env)
                                                        .call(controller.arrayGet(env, 0))
                                                        .value()
                                                : controller.arrayGet(env, 0)),
                                new ZPair("method", controller.arrayGet(env, 1)),
                                new ZPair(
                                        "file",
                                        env.callMethod(
                                                r, "getFileName", RequestDataCollector.class)),
                                new ZPair(
                                        "line",
                                        env.callMethod(
                                                r, "getStartLine", RequestDataCollector.class))));
            } catch (ConvertedException convertedException277) {
                if (convertedException277.instanceOf(
                        ReflectionException.class, "ReflectionException")) {
                    e = convertedException277.getObject();
                    if (function_is_callable.f.env(env).call(controller.getObject()).getBool()) {
                        return ZVal.assign(
                                ZVal.newArray(
                                        new ZPair(
                                                "class",
                                                function_is_object
                                                                .f
                                                                .env(env)
                                                                .call(controller.arrayGet(env, 0))
                                                                .getBool()
                                                        ? function_get_class
                                                                .f
                                                                .env(env)
                                                                .call(controller.arrayGet(env, 0))
                                                                .value()
                                                        : controller.arrayGet(env, 0)),
                                        new ZPair("method", controller.arrayGet(env, 1)),
                                        new ZPair("file", "n/a"),
                                        new ZPair("line", "n/a")));
                    }

                } else {
                    throw convertedException277;
                }
            }
        }

        if (ZVal.isTrue(ZVal.checkInstanceType(controller.getObject(), Closure.class, "Closure"))) {
            r = new ReflectionFunction(env, controller.getObject());
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    "class",
                                    env.callMethod(r, "getName", RequestDataCollector.class)),
                            new ZPair("method", ZVal.getNull()),
                            new ZPair(
                                    "file",
                                    env.callMethod(r, "getFileName", RequestDataCollector.class)),
                            new ZPair(
                                    "line",
                                    env.callMethod(
                                            r, "getStartLine", RequestDataCollector.class))));
        }

        if (function_is_object.f.env(env).call(controller.getObject()).getBool()) {
            r = new ReflectionClass(env, controller.getObject());
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    "class",
                                    env.callMethod(r, "getName", RequestDataCollector.class)),
                            new ZPair("method", ZVal.getNull()),
                            new ZPair(
                                    "file",
                                    env.callMethod(r, "getFileName", RequestDataCollector.class)),
                            new ZPair(
                                    "line",
                                    env.callMethod(
                                            r, "getStartLine", RequestDataCollector.class))));
        }

        return ZVal.assign(
                function_is_string.f.env(env).call(controller.getObject()).getBool()
                        ? controller.getObject()
                        : "n/a");
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\DataCollector\\RequestDataCollector";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends DataCollector.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getSubscribedEvents(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(KernelEvents.CONST_CONTROLLER, "onKernelController"),
                            new ZPair(KernelEvents.CONST_RESPONSE, "onKernelResponse")));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\DataCollector\\RequestDataCollector")
                    .setLookup(
                            RequestDataCollector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cloner", "controllers", "data")
                    .setFilename(
                            "vendor/symfony/http-kernel/DataCollector/RequestDataCollector.php")
                    .addInterface("Symfony\\Component\\EventDispatcher\\EventSubscriberInterface")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\DataCollector\\LateDataCollectorInterface")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\DataCollector\\DataCollectorInterface")
                    .addInterface("Serializable")
                    .addExtendsClass("Symfony\\Component\\HttpKernel\\DataCollector\\DataCollector")
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
