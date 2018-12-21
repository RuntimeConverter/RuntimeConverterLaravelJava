package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.HttpCache.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.HttpKernelInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_get_clean;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_start;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Request;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.TerminableInterface;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_register_shutdown_function;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/HttpCache/HttpCache.php

*/

public class HttpCache extends RuntimeClassBase
        implements HttpKernelInterface, TerminableInterface {

    public Object kernel = null;

    public Object store = null;

    public Object request = null;

    public Object surrogate = null;

    public Object surrogateCacheStrategy = null;

    public Object options = ZVal.newArray();

    public Object traces = ZVal.newArray();

    public HttpCache(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HttpCache.class) {
            this.__construct(env, args);
        }
    }

    public HttpCache(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "kernel",
        typeHint = "Symfony\\Component\\HttpKernel\\HttpKernelInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "store",
        typeHint = "Symfony\\Component\\HttpKernel\\HttpCache\\StoreInterface"
    )
    @ConvertedParameter(
        index = 2,
        name = "surrogate",
        typeHint = "Symfony\\Component\\HttpKernel\\HttpCache\\SurrogateInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object kernel = assignParameter(args, 0, false);
        Object store = assignParameter(args, 1, false);
        Object surrogate = assignParameter(args, 2, true);
        if (null == surrogate) {
            surrogate = ZVal.getNull();
        }
        Object options = assignParameter(args, 3, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        this.store = store;
        this.kernel = kernel;
        this.surrogate = surrogate;
        function_register_shutdown_function
                .f
                .env(env)
                .call(ZVal.newArray(new ZPair(0, this.store), new ZPair(1, "cleanup")));
        this.options =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair("debug", false),
                                        new ZPair("default_ttl", 0),
                                        new ZPair(
                                                "private_headers",
                                                ZVal.arrayFromList("Authorization", "Cookie")),
                                        new ZPair("allow_reload", false),
                                        new ZPair("allow_revalidate", false),
                                        new ZPair("stale_while_revalidate", 2),
                                        new ZPair("stale_if_error", 60)),
                                options)
                        .value();
        return null;
    }

    @ConvertedMethod
    public Object getStore(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.store);
    }

    @ConvertedMethod
    public Object getTraces(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.traces);
    }

    @ConvertedMethod
    public Object getLog(RuntimeEnv env, Object... args) {
        Object request = null;
        ReferenceContainer log = new BasicReferenceContainer(null);
        Object traces = null;
        log.setObject(ZVal.newArray());
        for (ZPair zpairResult1956 : ZVal.getIterable(this.traces, env, false)) {
            request = ZVal.assign(zpairResult1956.getKey());
            traces = ZVal.assign(zpairResult1956.getValue());
            log.arrayAppend(env)
                    .set(
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "%s: %s",
                                            request,
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(", ", traces)
                                                    .value())
                                    .value());
        }

        return ZVal.assign(NamespaceGlobal.implode.env(env).call("; ", log.getObject()).value());
    }

    @ConvertedMethod
    public Object getRequest(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.request);
    }

    @ConvertedMethod
    public Object getKernel(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.kernel);
    }

    @ConvertedMethod
    public Object getSurrogate(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.surrogate);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(index = 1, name = "type")
    @ConvertedParameter(
        index = 2,
        name = "catch",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object handle(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = HttpKernelInterface.CONST_MASTER_REQUEST;
        }
        Object _pCatch = assignParameter(args, 2, true);
        if (null == _pCatch) {
            _pCatch = true;
        }
        ReferenceContainer response = new BasicReferenceContainer(null);
        if (ZVal.strictEqualityCheck(HttpKernelInterface.CONST_MASTER_REQUEST, "===", type)) {
            this.traces = ZVal.newArray();
            this.request = ((RuntimeClassInterface) request).phpClone(env);
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.surrogate)) {
                this.surrogateCacheStrategy =
                        env.callMethod(this.surrogate, "createCacheStrategy", HttpCache.class);
            }
        }

        new ReferenceClassProperty(this, "traces", env)
                .arrayAccess(env, this.getTraceKey(env, request))
                .set(ZVal.newArray());
        if (!ZVal.isTrue(env.callMethod(request, "isMethodSafe", HttpCache.class, false))) {
            response.setObject(this.invalidate(env, request, _pCatch));

        } else if (ZVal.toBool(
                        env.callMethod(
                                toObjectR(request).accessProp(this, env).name("headers").value(),
                                "has",
                                HttpCache.class,
                                "expect"))
                || ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(request, "isMethodCacheable", HttpCache.class)))) {
            response.setObject(this.pass(env, request, _pCatch));

        } else if (ZVal.toBool(
                        new ReferenceClassProperty(this, "options", env)
                                .arrayGet(env, "allow_reload"))
                && ZVal.toBool(env.callMethod(request, "isNoCache", HttpCache.class))) {
            this.record(env, request, "reload");
            response.setObject(this.fetch(env, request, _pCatch));

        } else {
            response.setObject(this.lookup(env, request, _pCatch));
        }

        this.restoreResponseBody(env, request, response.getObject());
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                HttpKernelInterface.CONST_MASTER_REQUEST, "===", type))
                && ZVal.toBool(
                        new ReferenceClassProperty(this, "options", env).arrayGet(env, "debug"))) {
            env.callMethod(
                    toObjectR(response.getObject()).accessProp(this, env).name("headers").value(),
                    "set",
                    HttpCache.class,
                    "X-Symfony-Cache",
                    this.getLog(env));
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.surrogate)) {
            if (ZVal.strictEqualityCheck(HttpKernelInterface.CONST_MASTER_REQUEST, "===", type)) {
                env.callMethod(
                        this.surrogateCacheStrategy,
                        "update",
                        HttpCache.class,
                        response.getObject());

            } else {
                env.callMethod(
                        this.surrogateCacheStrategy,
                        new RuntimeArgsWithReferences().add(0, response),
                        "add",
                        HttpCache.class,
                        response.getObject());
            }
        }

        env.callMethod(response.getObject(), "prepare", HttpCache.class, request);
        env.callMethod(response.getObject(), "isNotModified", HttpCache.class, request);
        return ZVal.assign(response.getObject());
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
    public Object terminate(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.getKernel(env),
                        TerminableInterface.class,
                        "Symfony\\Component\\HttpKernel\\TerminableInterface"))) {
            env.callMethod(this.getKernel(env), "terminate", HttpCache.class, request, response);
        }

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
        name = "catch",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object pass(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object _pCatch = assignParameter(args, 1, true);
        if (null == _pCatch) {
            _pCatch = false;
        }
        this.record(env, request, "pass");
        return ZVal.assign(this.forward(env, request, _pCatch));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 1,
        name = "catch",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object invalidate(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object _pCatch = assignParameter(args, 1, true);
        if (null == _pCatch) {
            _pCatch = false;
        }
        Object subRequest = null;
        Object e = null;
        Object response = null;
        Object header = null;
        Object uri = null;
        response = this.pass(env, request, _pCatch);
        if (ZVal.toBool(env.callMethod(response, "isSuccessful", HttpCache.class))
                || ZVal.toBool(env.callMethod(response, "isRedirect", HttpCache.class))) {
            try {
                env.callMethod(this.store, "invalidate", HttpCache.class, request);
                for (ZPair zpairResult1957 :
                        ZVal.getIterable(
                                ZVal.arrayFromList("Location", "Content-Location"), env, true)) {
                    header = ZVal.assign(zpairResult1957.getValue());
                    if (ZVal.isTrue(
                            uri =
                                    env.callMethod(
                                            toObjectR(response)
                                                    .accessProp(this, env)
                                                    .name("headers")
                                                    .value(),
                                            "get",
                                            HttpCache.class,
                                            header))) {
                        subRequest =
                                Request.runtimeStaticObject.create(
                                        env,
                                        uri,
                                        "get",
                                        ZVal.newArray(),
                                        ZVal.newArray(),
                                        ZVal.newArray(),
                                        env.callMethod(
                                                toObjectR(request)
                                                        .accessProp(this, env)
                                                        .name("server")
                                                        .value(),
                                                "all",
                                                HttpCache.class));
                        env.callMethod(this.store, "invalidate", HttpCache.class, subRequest);
                    }
                }

                this.record(env, request, "invalidate");
            } catch (ConvertedException convertedException289) {
                if (convertedException289.instanceOf(PHPException.class, "Exception")) {
                    e = convertedException289.getObject();
                    this.record(env, request, "invalidate-failed");
                    if (ZVal.isTrue(
                            new ReferenceClassProperty(this, "options", env)
                                    .arrayGet(env, "debug"))) {
                        throw ZVal.getException(env, e);
                    }

                } else {
                    throw convertedException289;
                }
            }
        }

        return ZVal.assign(response);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 1,
        name = "catch",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object lookup(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object _pCatch = assignParameter(args, 1, true);
        if (null == _pCatch) {
            _pCatch = false;
        }
        Object entry = null;
        Object e = null;
        try {
            entry = env.callMethod(this.store, "lookup", HttpCache.class, request);
        } catch (ConvertedException convertedException290) {
            if (convertedException290.instanceOf(PHPException.class, "Exception")) {
                e = convertedException290.getObject();
                this.record(env, request, "lookup-failed");
                if (ZVal.isTrue(
                        new ReferenceClassProperty(this, "options", env).arrayGet(env, "debug"))) {
                    throw ZVal.getException(env, e);
                }

                return ZVal.assign(this.pass(env, request, _pCatch));
            } else {
                throw convertedException290;
            }
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", entry)) {
            this.record(env, request, "miss");
            return ZVal.assign(this.fetch(env, request, _pCatch));
        }

        if (!ZVal.isTrue(this.isFreshEnough(env, request, entry))) {
            this.record(env, request, "stale");
            return ZVal.assign(this.validate(env, request, entry, _pCatch));
        }

        this.record(env, request, "fresh");
        env.callMethod(
                toObjectR(entry).accessProp(this, env).name("headers").value(),
                "set",
                HttpCache.class,
                "Age",
                env.callMethod(entry, "getAge", HttpCache.class));
        return ZVal.assign(entry);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 1,
        name = "entry",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    @ConvertedParameter(
        index = 2,
        name = "catch",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object validate(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object entry = assignParameter(args, 1, false);
        Object _pCatch = assignParameter(args, 2, true);
        if (null == _pCatch) {
            _pCatch = false;
        }
        Object subRequest = null;
        Object requestEtags = null;
        Object response = null;
        Object name = null;
        Object etag = null;
        Object etags = null;
        Object cachedEtags = null;
        subRequest = ZVal.assign(((RuntimeClassInterface) request).phpClone(env));
        if (ZVal.strictEqualityCheck(
                "HEAD", "===", env.callMethod(request, "getMethod", HttpCache.class))) {
            env.callMethod(subRequest, "setMethod", HttpCache.class, "GET");
        }

        env.callMethod(
                toObjectR(subRequest).accessProp(this, env).name("headers").value(),
                "set",
                HttpCache.class,
                "if_modified_since",
                env.callMethod(
                        toObjectR(entry).accessProp(this, env).name("headers").value(),
                        "get",
                        HttpCache.class,
                        "Last-Modified"));
        cachedEtags =
                ZVal.assign(
                        ZVal.isTrue(env.callMethod(entry, "getEtag", HttpCache.class))
                                ? ZVal.newArray(
                                        new ZPair(
                                                0,
                                                env.callMethod(entry, "getEtag", HttpCache.class)))
                                : ZVal.newArray());
        requestEtags = env.callMethod(request, "getETags", HttpCache.class);
        if (ZVal.isTrue(
                etags =
                        function_array_unique
                                .f
                                .env(env)
                                .call(
                                        function_array_merge
                                                .f
                                                .env(env)
                                                .call(cachedEtags, requestEtags)
                                                .value())
                                .value())) {
            env.callMethod(
                    toObjectR(subRequest).accessProp(this, env).name("headers").value(),
                    "set",
                    HttpCache.class,
                    "if_none_match",
                    NamespaceGlobal.implode.env(env).call(", ", etags).value());
        }

        response = this.forward(env, subRequest, _pCatch, entry);
        if (ZVal.equalityCheck(304, env.callMethod(response, "getStatusCode", HttpCache.class))) {
            this.record(env, request, "valid");
            etag = env.callMethod(response, "getEtag", HttpCache.class);
            if (ZVal.toBool(
                            ZVal.toBool(etag)
                                    && ZVal.toBool(
                                            function_in_array
                                                    .f
                                                    .env(env)
                                                    .call(etag, requestEtags)
                                                    .value()))
                    && ZVal.toBool(
                            !function_in_array.f.env(env).call(etag, cachedEtags).getBool())) {
                return ZVal.assign(response);
            }

            entry = ZVal.assign(((RuntimeClassInterface) entry).phpClone(env));
            env.callMethod(
                    toObjectR(entry).accessProp(this, env).name("headers").value(),
                    "remove",
                    HttpCache.class,
                    "Date");
            for (ZPair zpairResult1958 :
                    ZVal.getIterable(
                            ZVal.arrayFromList(
                                    "Date", "Expires", "Cache-Control", "ETag", "Last-Modified"),
                            env,
                            true)) {
                name = ZVal.assign(zpairResult1958.getValue());
                if (ZVal.isTrue(
                        env.callMethod(
                                toObjectR(response).accessProp(this, env).name("headers").value(),
                                "has",
                                HttpCache.class,
                                name))) {
                    env.callMethod(
                            toObjectR(entry).accessProp(this, env).name("headers").value(),
                            "set",
                            HttpCache.class,
                            name,
                            env.callMethod(
                                    toObjectR(response)
                                            .accessProp(this, env)
                                            .name("headers")
                                            .value(),
                                    "get",
                                    HttpCache.class,
                                    name));
                }
            }

            response = ZVal.assign(entry);

        } else {
            this.record(env, request, "invalid");
        }

        if (ZVal.isTrue(env.callMethod(response, "isCacheable", HttpCache.class))) {
            this.store(env, request, response);
        }

        return ZVal.assign(response);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 1,
        name = "catch",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object fetch(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object _pCatch = assignParameter(args, 1, true);
        if (null == _pCatch) {
            _pCatch = false;
        }
        Object subRequest = null;
        Object response = null;
        subRequest = ZVal.assign(((RuntimeClassInterface) request).phpClone(env));
        if (ZVal.strictEqualityCheck(
                "HEAD", "===", env.callMethod(request, "getMethod", HttpCache.class))) {
            env.callMethod(subRequest, "setMethod", HttpCache.class, "GET");
        }

        env.callMethod(
                toObjectR(subRequest).accessProp(this, env).name("headers").value(),
                "remove",
                HttpCache.class,
                "if_modified_since");
        env.callMethod(
                toObjectR(subRequest).accessProp(this, env).name("headers").value(),
                "remove",
                HttpCache.class,
                "if_none_match");
        response = this.forward(env, subRequest, _pCatch);
        if (ZVal.isTrue(env.callMethod(response, "isCacheable", HttpCache.class))) {
            this.store(env, request, response);
        }

        return ZVal.assign(response);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 1,
        name = "catch",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "entry",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object forward(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object _pCatch = assignParameter(args, 1, true);
        if (null == _pCatch) {
            _pCatch = false;
        }
        Object entry = assignParameter(args, 2, true);
        if (null == entry) {
            entry = ZVal.getNull();
        }
        ReferenceContainer trustedProxies = new BasicReferenceContainer(null);
        Object forwardedFor = null;
        Object response = null;
        Object age = null;
        if (ZVal.isTrue(this.surrogate)) {
            env.callMethod(this.surrogate, "addSurrogateCapability", HttpCache.class, request);
        }

        forwardedFor =
                env.callMethod(
                        toObjectR(request).accessProp(this, env).name("headers").value(),
                        "get",
                        HttpCache.class,
                        "X-Forwarded-For");
        if (ZVal.isTrue(forwardedFor)) {
            env.callMethod(
                    toObjectR(request).accessProp(this, env).name("headers").value(),
                    "set",
                    HttpCache.class,
                    "X-Forwarded-For",
                    toStringR(forwardedFor, env)
                            + ", "
                            + toStringR(
                                    env.callMethod(
                                            toObjectR(request)
                                                    .accessProp(this, env)
                                                    .name("server")
                                                    .value(),
                                            "get",
                                            HttpCache.class,
                                            "REMOTE_ADDR"),
                                    env));

        } else {
            env.callMethod(
                    toObjectR(request).accessProp(this, env).name("headers").value(),
                    "set",
                    HttpCache.class,
                    "X-Forwarded-For",
                    env.callMethod(
                            toObjectR(request).accessProp(this, env).name("server").value(),
                            "get",
                            HttpCache.class,
                            "REMOTE_ADDR"));
        }

        env.callMethod(
                toObjectR(request).accessProp(this, env).name("server").value(),
                "set",
                HttpCache.class,
                "REMOTE_ADDR",
                "127.0.0.1");
        if (!function_in_array
                .f
                .env(env)
                .call(
                        "127.0.0.1",
                        trustedProxies.setObject(
                                Request.runtimeStaticObject.getTrustedProxies(env)))
                .getBool()) {
            trustedProxies.arrayAppend(env).set("127.0.0.1");
            Request.runtimeStaticObject.setTrustedProxies(
                    env, trustedProxies.getObject(), Request.CONST_HEADER_X_FORWARDED_ALL);
        }

        response =
                env.callMethod(
                        this.kernel,
                        "handle",
                        HttpCache.class,
                        request,
                        HttpKernelInterface.CONST_MASTER_REQUEST,
                        _pCatch);
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", entry))
                && ZVal.toBool(
                        function_in_array
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(response, "getStatusCode", HttpCache.class),
                                        ZVal.arrayFromList(500, 502, 503, 504))
                                .value())) {
            if (ZVal.strictEqualityCheck(
                    ZVal.getNull(),
                    "===",
                    age =
                            env.callMethod(
                                    toObjectR(entry).accessProp(this, env).name("headers").value(),
                                    "getCacheControlDirective",
                                    HttpCache.class,
                                    "stale-if-error"))) {
                age =
                        ZVal.assign(
                                new ReferenceClassProperty(this, "options", env)
                                        .arrayGet(env, "stale_if_error"));
            }

            if (ZVal.isLessThan(
                    NamespaceGlobal.abs
                            .env(env)
                            .call(env.callMethod(entry, "getTtl", HttpCache.class))
                            .value(),
                    '<',
                    age)) {
                this.record(env, request, "stale-if-error");
                return ZVal.assign(entry);
            }
        }

        if (!ZVal.isTrue(
                env.callMethod(
                        toObjectR(response).accessProp(this, env).name("headers").value(),
                        "has",
                        HttpCache.class,
                        "Date"))) {
            env.callMethod(
                    response,
                    "setDate",
                    HttpCache.class,
                    DateTime.runtimeStaticObject.createFromFormat(
                            env, "U", NamespaceGlobal.time.env(env).call().value()));
        }

        this.processResponseBody(env, request, response);
        if (ZVal.toBool(this.isPrivateRequest(env, request))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        toObjectR(response)
                                                .accessProp(this, env)
                                                .name("headers")
                                                .value(),
                                        "hasCacheControlDirective",
                                        HttpCache.class,
                                        "public")))) {
            env.callMethod(response, "setPrivate", HttpCache.class);

        } else if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.isGreaterThan(
                                                new ReferenceClassProperty(this, "options", env)
                                                        .arrayGet(env, "default_ttl"),
                                                '>',
                                                0))
                                && ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                ZVal.getNull(),
                                                "===",
                                                env.callMethod(
                                                        response, "getTtl", HttpCache.class))))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        toObjectR(response)
                                                .accessProp(this, env)
                                                .name("headers")
                                                .value(),
                                        "getCacheControlDirective",
                                        HttpCache.class,
                                        "must-revalidate")))) {
            env.callMethod(
                    response,
                    "setTtl",
                    HttpCache.class,
                    new ReferenceClassProperty(this, "options", env).arrayGet(env, "default_ttl"));
        }

        return ZVal.assign(response);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 1,
        name = "entry",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    protected Object isFreshEnough(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object entry = assignParameter(args, 1, false);
        Object maxAge = null;
        if (!ZVal.isTrue(env.callMethod(entry, "isFresh", HttpCache.class))) {
            return ZVal.assign(this.lock(env, request, entry));
        }

        if (ZVal.toBool(
                        new ReferenceClassProperty(this, "options", env)
                                .arrayGet(env, "allow_revalidate"))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                ZVal.getNull(),
                                "!==",
                                maxAge =
                                        env.callMethod(
                                                toObjectR(request)
                                                        .accessProp(this, env)
                                                        .name("headers")
                                                        .value(),
                                                "getCacheControlDirective",
                                                HttpCache.class,
                                                "max-age")))) {
            return ZVal.assign(
                    ZVal.toBool(ZVal.isGreaterThan(maxAge, '>', 0))
                            && ZVal.toBool(
                                    ZVal.isGreaterThanOrEqualTo(
                                            maxAge,
                                            ">=",
                                            env.callMethod(entry, "getAge", HttpCache.class))));
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 1,
        name = "entry",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    protected Object lock(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object entry = assignParameter(args, 1, false);
        Object _pNew = null;
        Object cookie = null;
        Object lock = null;
        lock = env.callMethod(this.store, "lock", HttpCache.class, request);
        if (ZVal.strictEqualityCheck(true, "===", lock)) {
            return ZVal.assign(false);
        }

        if (ZVal.isTrue(this.mayServeStaleWhileRevalidate(env, entry))) {
            this.record(env, request, "stale-while-revalidate");
            return ZVal.assign(true);
        }

        if (ZVal.isTrue(this.waitForLock(env, request))) {
            _pNew = this.lookup(env, request);
            toObjectR(entry)
                    .accessProp(this, env)
                    .name("headers")
                    .set(toObjectR(_pNew).accessProp(this, env).name("headers").value());
            env.callMethod(
                    entry,
                    "setContent",
                    HttpCache.class,
                    env.callMethod(_pNew, "getContent", HttpCache.class));
            env.callMethod(
                    entry,
                    "setStatusCode",
                    HttpCache.class,
                    env.callMethod(_pNew, "getStatusCode", HttpCache.class));
            env.callMethod(
                    entry,
                    "setProtocolVersion",
                    HttpCache.class,
                    env.callMethod(_pNew, "getProtocolVersion", HttpCache.class));
            for (ZPair zpairResult1959 :
                    ZVal.getIterable(
                            env.callMethod(
                                    toObjectR(_pNew).accessProp(this, env).name("headers").value(),
                                    "getCookies",
                                    HttpCache.class),
                            env,
                            true)) {
                cookie = ZVal.assign(zpairResult1959.getValue());
                env.callMethod(
                        toObjectR(entry).accessProp(this, env).name("headers").value(),
                        "setCookie",
                        HttpCache.class,
                        cookie);
            }

        } else {
            env.callMethod(entry, "setStatusCode", HttpCache.class, 503);
            env.callMethod(entry, "setContent", HttpCache.class, "503 Service Unavailable");
            env.callMethod(
                    toObjectR(entry).accessProp(this, env).name("headers").value(),
                    "set",
                    HttpCache.class,
                    "Retry-After",
                    10);
        }

        return ZVal.assign(true);
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
    protected Object store(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        Object e = null;
        try {
            env.callMethod(this.store, "write", HttpCache.class, request, response);
            this.record(env, request, "store");
            env.callMethod(
                    toObjectR(response).accessProp(this, env).name("headers").value(),
                    "set",
                    HttpCache.class,
                    "Age",
                    env.callMethod(response, "getAge", HttpCache.class));
        } catch (ConvertedException convertedException291) {
            if (convertedException291.instanceOf(PHPException.class, "Exception")) {
                e = convertedException291.getObject();
                this.record(env, request, "store-failed");
                if (ZVal.isTrue(
                        new ReferenceClassProperty(this, "options", env).arrayGet(env, "debug"))) {
                    throw ZVal.getException(env, e);
                }

            } else {
                throw convertedException291;
            }
        }

        env.callMethod(this.store, "unlock", HttpCache.class, request);
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
    private Object restoreResponseBody(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope65 scope = new Scope65();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/symfony/http-kernel/HttpCache")
                            .setFile("/vendor/symfony/http-kernel/HttpCache/HttpCache.php");
            scope.request = assignParameter(args, 0, false);
            scope.response = assignParameter(args, 1, false);
            if (ZVal.isTrue(
                    env.callMethod(
                            toObjectR(scope.response).accessProp(this, env).name("headers").value(),
                            "has",
                            HttpCache.class,
                            "X-Body-Eval"))) {
                function_ob_start.f.env(env).call();
                if (ZVal.isTrue(
                        env.callMethod(
                                toObjectR(scope.response)
                                        .accessProp(this, env)
                                        .name("headers")
                                        .value(),
                                "has",
                                HttpCache.class,
                                "X-Body-File"))) {
                    env.include(
                            toStringR(
                                    env.callMethod(
                                            toObjectR(scope.response)
                                                    .accessProp(this, env)
                                                    .name("headers")
                                                    .value(),
                                            "get",
                                            HttpCache.class,
                                            "X-Body-File"),
                                    env),
                            stack,
                            runtimeConverterFunctionClassConstants,
                            false,
                            false);

                } else {
                    com.runtimeconverter.runtime.ZVal.notImplemented(
                            "Eval Statement is not supported");
                }

                env.callMethod(
                        scope.response,
                        "setContent",
                        HttpCache.class,
                        function_ob_get_clean.f.env(env).call().value());
                env.callMethod(
                        toObjectR(scope.response).accessProp(this, env).name("headers").value(),
                        "remove",
                        HttpCache.class,
                        "X-Body-Eval");
                if (!ZVal.isTrue(
                        env.callMethod(
                                toObjectR(scope.response)
                                        .accessProp(this, env)
                                        .name("headers")
                                        .value(),
                                "has",
                                HttpCache.class,
                                "Transfer-Encoding"))) {
                    env.callMethod(
                            toObjectR(scope.response).accessProp(this, env).name("headers").value(),
                            "set",
                            HttpCache.class,
                            "Content-Length",
                            function_strlen
                                    .f
                                    .env(env)
                                    .call(
                                            env.callMethod(
                                                    scope.response, "getContent", HttpCache.class))
                                    .value());
                }

            } else if (ZVal.isTrue(
                    env.callMethod(
                            toObjectR(scope.response).accessProp(this, env).name("headers").value(),
                            "has",
                            HttpCache.class,
                            "X-Body-File"))) {
                if (!ZVal.isTrue(
                        env.callMethod(scope.request, "isMethod", HttpCache.class, "HEAD"))) {
                    env.callMethod(
                            scope.response,
                            "setContent",
                            HttpCache.class,
                            function_file_get_contents
                                    .f
                                    .env(env)
                                    .call(
                                            env.callMethod(
                                                    toObjectR(scope.response)
                                                            .accessProp(this, env)
                                                            .name("headers")
                                                            .value(),
                                                    "get",
                                                    HttpCache.class,
                                                    "X-Body-File"))
                                    .value());
                }

            } else {
                throw new IncludeEventException(null);
            }

            env.callMethod(
                    toObjectR(scope.response).accessProp(this, env).name("headers").value(),
                    "remove",
                    HttpCache.class,
                    "X-Body-File");
            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
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
    protected Object processResponseBody(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.surrogate))
                && ZVal.toBool(
                        env.callMethod(
                                this.surrogate, "needsParsing", HttpCache.class, response))) {
            env.callMethod(this.surrogate, "process", HttpCache.class, request, response);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    private Object isPrivateRequest(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object key = null;
        for (ZPair zpairResult1960 :
                ZVal.getIterable(
                        new ReferenceClassProperty(this, "options", env)
                                .arrayGet(env, "private_headers"),
                        env,
                        true)) {
            key = ZVal.assign(zpairResult1960.getValue());
            key =
                    NamespaceGlobal.strtolower
                            .env(env)
                            .call(function_str_replace.f.env(env).call("HTTP_", "", key).value())
                            .value();
            if (ZVal.strictEqualityCheck("cookie", "===", key)) {
                if (function_count
                        .f
                        .env(env)
                        .call(
                                env.callMethod(
                                        toObjectR(request)
                                                .accessProp(this, env)
                                                .name("cookies")
                                                .value(),
                                        "all",
                                        HttpCache.class))
                        .getBool()) {
                    return ZVal.assign(true);
                }

            } else if (ZVal.isTrue(
                    env.callMethod(
                            toObjectR(request).accessProp(this, env).name("headers").value(),
                            "has",
                            HttpCache.class,
                            key))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(index = 1, name = "event", typeHint = "string")
    private Object record(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object event = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "traces", env)
                .arrayAppend(env, this.getTraceKey(env, request))
                .set(event);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    private Object getTraceKey(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object path = null;
        Object qs = null;
        path = env.callMethod(request, "getPathInfo", HttpCache.class);
        if (ZVal.isTrue(qs = env.callMethod(request, "getQueryString", HttpCache.class))) {
            path = toStringR(path, env) + "?" + toStringR(qs, env);
        }

        return ZVal.assign(
                toStringR(env.callMethod(request, "getMethod", HttpCache.class), env)
                        + " "
                        + toStringR(path, env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "entry",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    private Object mayServeStaleWhileRevalidate(RuntimeEnv env, Object... args) {
        Object entry = assignParameter(args, 0, false);
        Object timeout = null;
        timeout =
                env.callMethod(
                        toObjectR(entry).accessProp(this, env).name("headers").value(),
                        "getCacheControlDirective",
                        HttpCache.class,
                        "stale-while-revalidate");
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", timeout)) {
            timeout =
                    ZVal.assign(
                            new ReferenceClassProperty(this, "options", env)
                                    .arrayGet(env, "stale_while_revalidate"));
        }

        return ZVal.assign(
                ZVal.isLessThan(
                        NamespaceGlobal.abs
                                .env(env)
                                .call(env.callMethod(entry, "getTtl", HttpCache.class))
                                .value(),
                        '<',
                        timeout));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    private Object waitForLock(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        ReferenceContainer wait = new BasicReferenceContainer(null);
        wait.setObject(0);
        while (ZVal.toBool(env.callMethod(this.store, "isLocked", HttpCache.class, request))
                && ZVal.toBool(ZVal.isLessThan(wait.getObject(), '<', 100))) {
            NamespaceGlobal.usleep.env(env).call(50000);
            wait.setObject(ZVal.increment(wait.getObject()));
        }

        return ZVal.assign(ZVal.isLessThan(wait.getObject(), '<', 100));
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpKernel\\HttpCache\\HttpCache";

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
                    .setName("Symfony\\Component\\HttpKernel\\HttpCache\\HttpCache")
                    .setLookup(
                            HttpCache.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "kernel",
                            "options",
                            "request",
                            "store",
                            "surrogate",
                            "surrogateCacheStrategy",
                            "traces")
                    .setFilename("vendor/symfony/http-kernel/HttpCache/HttpCache.php")
                    .addInterface("Symfony\\Component\\HttpKernel\\HttpKernelInterface")
                    .addInterface("Symfony\\Component\\HttpKernel\\TerminableInterface")
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

    private static class Scope65 implements UpdateRuntimeScopeInterface {

        Object request;
        Object response;
        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("request", this.request);
            stack.setVariable("response", this.response);
            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this.request = stack.getVariable("request");
            this.response = stack.getVariable("response");
            this._thisVarAlias = stack.getVariable("this");
        }
    }
}
