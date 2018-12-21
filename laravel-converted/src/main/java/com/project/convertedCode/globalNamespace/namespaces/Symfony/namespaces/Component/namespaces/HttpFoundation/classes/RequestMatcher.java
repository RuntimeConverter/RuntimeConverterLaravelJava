package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.IpUtils;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.RequestMatcherInterface;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/RequestMatcher.php

*/

public class RequestMatcher extends RuntimeClassBase implements RequestMatcherInterface {

    public Object path = null;

    public Object host = null;

    public Object methods = ZVal.newArray();

    public Object ips = ZVal.newArray();

    public Object attributes = ZVal.newArray();

    public Object schemes = ZVal.newArray();

    public RequestMatcher(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RequestMatcher.class) {
            this.__construct(env, args);
        }
    }

    public RequestMatcher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "path",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "host",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "methods",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "ips",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 5,
        name = "schemes",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, true);
        if (null == path) {
            path = ZVal.getNull();
        }
        Object host = assignParameter(args, 1, true);
        if (null == host) {
            host = ZVal.getNull();
        }
        Object methods = assignParameter(args, 2, true);
        if (null == methods) {
            methods = ZVal.getNull();
        }
        Object ips = assignParameter(args, 3, true);
        if (null == ips) {
            ips = ZVal.getNull();
        }
        Object attributes = assignParameter(args, 4, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        Object schemes = assignParameter(args, 5, true);
        if (null == schemes) {
            schemes = ZVal.getNull();
        }
        Object v = null;
        Object k = null;
        this.matchPath(env, path);
        this.matchHost(env, host);
        this.matchMethod(env, methods);
        this.matchIps(env, ips);
        this.matchScheme(env, schemes);
        for (ZPair zpairResult1872 : ZVal.getIterable(attributes, env, false)) {
            k = ZVal.assign(zpairResult1872.getKey());
            v = ZVal.assign(zpairResult1872.getValue());
            this.matchAttribute(env, k, v);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "scheme")
    public Object matchScheme(RuntimeEnv env, Object... args) {
        Object scheme = assignParameter(args, 0, false);
        this.schemes =
                ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", scheme)
                        ? function_array_map
                                .f
                                .env(env)
                                .call("strtolower", rToArrayCast(scheme))
                                .value()
                        : ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "regexp")
    public Object matchHost(RuntimeEnv env, Object... args) {
        Object regexp = assignParameter(args, 0, false);
        this.host = regexp;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "regexp")
    public Object matchPath(RuntimeEnv env, Object... args) {
        Object regexp = assignParameter(args, 0, false);
        this.path = regexp;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ip")
    public Object matchIp(RuntimeEnv env, Object... args) {
        Object ip = assignParameter(args, 0, false);
        this.matchIps(env, ip);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ips")
    public Object matchIps(RuntimeEnv env, Object... args) {
        Object ips = assignParameter(args, 0, false);
        this.ips =
                ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", ips)
                        ? rToArrayCast(ips)
                        : ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    public Object matchMethod(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        this.methods =
                ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", method)
                        ? function_array_map
                                .f
                                .env(env)
                                .call("strtoupper", rToArrayCast(method))
                                .value()
                        : ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "regexp")
    public Object matchAttribute(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object regexp = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "attributes", env).arrayAccess(env, key).set(regexp);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    public Object matches(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object pattern = null;
        Object key = null;
        if (ZVal.toBool(this.schemes)
                && ZVal.toBool(
                        !function_in_array
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(request, "getScheme", RequestMatcher.class),
                                        this.schemes,
                                        true)
                                .getBool())) {
            return ZVal.assign(false);
        }

        if (ZVal.toBool(this.methods)
                && ZVal.toBool(
                        !function_in_array
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(request, "getMethod", RequestMatcher.class),
                                        this.methods,
                                        true)
                                .getBool())) {
            return ZVal.assign(false);
        }

        for (ZPair zpairResult1873 : ZVal.getIterable(this.attributes, env, false)) {
            key = ZVal.assign(zpairResult1873.getKey());
            pattern = ZVal.assign(zpairResult1873.getValue());
            if (!function_preg_match
                    .f
                    .env(env)
                    .call(
                            "{" + toStringR(pattern, env) + "}",
                            env.callMethod(
                                    toObjectR(request)
                                            .accessProp(this, env)
                                            .name("attributes")
                                            .value(),
                                    "get",
                                    RequestMatcher.class,
                                    key))
                    .getBool()) {
                return ZVal.assign(false);
            }
        }

        if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.path))
                && ZVal.toBool(
                        !function_preg_match
                                .f
                                .env(env)
                                .call(
                                        "{" + toStringR(this.path, env) + "}",
                                        NamespaceGlobal.rawurldecode
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                request,
                                                                "getPathInfo",
                                                                RequestMatcher.class))
                                                .value())
                                .getBool())) {
            return ZVal.assign(false);
        }

        if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.host))
                && ZVal.toBool(
                        !function_preg_match
                                .f
                                .env(env)
                                .call(
                                        "{" + toStringR(this.host, env) + "}i",
                                        env.callMethod(request, "getHost", RequestMatcher.class))
                                .getBool())) {
            return ZVal.assign(false);
        }

        if (ZVal.isTrue(
                IpUtils.runtimeStaticObject.checkIp(
                        env,
                        env.callMethod(request, "getClientIp", RequestMatcher.class),
                        this.ips))) {
            return ZVal.assign(true);
        }

        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        0, "===", function_count.f.env(env).call(this.ips).value()));
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpFoundation\\RequestMatcher";

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
                    .setName("Symfony\\Component\\HttpFoundation\\RequestMatcher")
                    .setLookup(
                            RequestMatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "host", "ips", "methods", "path", "schemes")
                    .setFilename("vendor/symfony/http-foundation/RequestMatcher.php")
                    .addInterface("Symfony\\Component\\HttpFoundation\\RequestMatcherInterface")
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
