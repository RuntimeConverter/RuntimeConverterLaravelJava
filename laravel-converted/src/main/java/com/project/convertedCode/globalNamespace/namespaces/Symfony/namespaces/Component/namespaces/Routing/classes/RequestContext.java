package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/RequestContext.php

*/

public class RequestContext extends RuntimeClassBase {

    public Object baseUrl = null;

    public Object pathInfo = null;

    public Object method = null;

    public Object host = null;

    public Object scheme = null;

    public Object httpPort = null;

    public Object httpsPort = null;

    public Object queryString = null;

    public Object parameters = ZVal.newArray();

    public RequestContext(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RequestContext.class) {
            this.__construct(env, args);
        }
    }

    public RequestContext(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "baseUrl", typeHint = "string")
    @ConvertedParameter(index = 1, name = "method", typeHint = "string")
    @ConvertedParameter(index = 2, name = "host", typeHint = "string")
    @ConvertedParameter(index = 3, name = "scheme", typeHint = "string")
    @ConvertedParameter(
        index = 4,
        name = "httpPort",
        typeHint = "int",
        defaultValue = "80",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 5,
        name = "httpsPort",
        typeHint = "int",
        defaultValue = "443",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 6, name = "path", typeHint = "string")
    @ConvertedParameter(index = 7, name = "queryString", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object baseUrl = assignParameter(args, 0, true);
        if (null == baseUrl) {
            baseUrl = "";
        }
        Object method = assignParameter(args, 1, true);
        if (null == method) {
            method = "GET";
        }
        Object host = assignParameter(args, 2, true);
        if (null == host) {
            host = "localhost";
        }
        Object scheme = assignParameter(args, 3, true);
        if (null == scheme) {
            scheme = "http";
        }
        Object httpPort = assignParameter(args, 4, true);
        if (null == httpPort) {
            httpPort = 80;
        }
        Object httpsPort = assignParameter(args, 5, true);
        if (null == httpsPort) {
            httpsPort = 443;
        }
        Object path = assignParameter(args, 6, true);
        if (null == path) {
            path = "/";
        }
        Object queryString = assignParameter(args, 7, true);
        if (null == queryString) {
            queryString = "";
        }
        this.setBaseUrl(env, baseUrl);
        this.setMethod(env, method);
        this.setHost(env, host);
        this.setScheme(env, scheme);
        this.setHttpPort(env, httpPort);
        this.setHttpsPort(env, httpsPort);
        this.setPathInfo(env, path);
        this.setQueryString(env, queryString);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    public Object fromRequest(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        this.setBaseUrl(env, env.callMethod(request, "getBaseUrl", RequestContext.class));
        this.setPathInfo(env, env.callMethod(request, "getPathInfo", RequestContext.class));
        this.setMethod(env, env.callMethod(request, "getMethod", RequestContext.class));
        this.setHost(env, env.callMethod(request, "getHost", RequestContext.class));
        this.setScheme(env, env.callMethod(request, "getScheme", RequestContext.class));
        this.setHttpPort(
                env,
                ZVal.isTrue(env.callMethod(request, "isSecure", RequestContext.class))
                        ? this.httpPort
                        : env.callMethod(request, "getPort", RequestContext.class));
        this.setHttpsPort(
                env,
                ZVal.isTrue(env.callMethod(request, "isSecure", RequestContext.class))
                        ? env.callMethod(request, "getPort", RequestContext.class)
                        : this.httpsPort);
        this.setQueryString(
                env,
                env.callMethod(
                        toObjectR(request).accessProp(this, env).name("server").value(),
                        "get",
                        RequestContext.class,
                        "QUERY_STRING",
                        ""));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getBaseUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.baseUrl);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "baseUrl")
    public Object setBaseUrl(RuntimeEnv env, Object... args) {
        Object baseUrl = assignParameter(args, 0, false);
        this.baseUrl = baseUrl;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getPathInfo(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.pathInfo);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pathInfo")
    public Object setPathInfo(RuntimeEnv env, Object... args) {
        Object pathInfo = assignParameter(args, 0, false);
        this.pathInfo = pathInfo;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getMethod(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.method);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    public Object setMethod(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        this.method = NamespaceGlobal.strtoupper.env(env).call(method).value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getHost(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.host);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "host")
    public Object setHost(RuntimeEnv env, Object... args) {
        Object host = assignParameter(args, 0, false);
        this.host = NamespaceGlobal.strtolower.env(env).call(host).value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getScheme(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.scheme);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "scheme")
    public Object setScheme(RuntimeEnv env, Object... args) {
        Object scheme = assignParameter(args, 0, false);
        this.scheme = NamespaceGlobal.strtolower.env(env).call(scheme).value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getHttpPort(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.httpPort);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "httpPort")
    public Object setHttpPort(RuntimeEnv env, Object... args) {
        Object httpPort = assignParameter(args, 0, false);
        this.httpPort = ZVal.toLong(httpPort);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getHttpsPort(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.httpsPort);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "httpsPort")
    public Object setHttpsPort(RuntimeEnv env, Object... args) {
        Object httpsPort = assignParameter(args, 0, false);
        this.httpsPort = ZVal.toLong(httpsPort);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getQueryString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.queryString);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queryString")
    public Object setQueryString(RuntimeEnv env, Object... args) {
        Object queryString = assignParameter(args, 0, false);
        this.queryString = toStringR(queryString, env);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getParameters(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.parameters);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters", typeHint = "array")
    public Object setParameters(RuntimeEnv env, Object... args) {
        Object parameters = assignParameter(args, 0, false);
        this.parameters = parameters;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getParameter(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "parameters", env),
                                env,
                                name)
                        ? new ReferenceClassProperty(this, "parameters", env).arrayGet(env, name)
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasParameter(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_key_exists.f.env(env).call(name, this.parameters).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "parameter")
    public Object setParameter(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object parameter = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "parameters", env).arrayAccess(env, name).set(parameter);
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Symfony\\Component\\Routing\\RequestContext";

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
                    .setName("Symfony\\Component\\Routing\\RequestContext")
                    .setLookup(
                            RequestContext.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "baseUrl",
                            "host",
                            "httpPort",
                            "httpsPort",
                            "method",
                            "parameters",
                            "pathInfo",
                            "queryString",
                            "scheme")
                    .setFilename("vendor/symfony/routing/RequestContext.php")
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
