package com.project.convertedCode.globalNamespace.namespaces.Fideloper.namespaces.Proxy.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fideloper/proxy/src/TrustProxies.php

*/

public class TrustProxies extends RuntimeClassBase {

    public Object config = null;

    public Object proxies = null;

    public Object headers = null;

    public TrustProxies(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TrustProxies.class) {
            this.__construct(env, args);
        }
    }

    public TrustProxies(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "config",
        typeHint = "Illuminate\\Contracts\\Config\\Repository"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        this.config = config;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    @ConvertedParameter(index = 1, name = "next", typeHint = "Closure")
    public Object handle(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        ReferenceContainer request = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object next = assignParameter(args, 1, false);
        StaticMethodUtils.getStaticBaseClass(request.getObject(), env)
                .callUnknownStaticMethod(
                        env,
                        "setTrustedProxies",
                        rLastRefArgs =
                                new RuntimeArgsWithReferences()
                                        .add(
                                                1,
                                                handleReturnReference(
                                                        this.getTrustedHeaderNames(env))),
                        ZVal.newArray(),
                        rLastRefArgs.get(1));
        this.setTrustedProxyIpAddresses(env, request.getObject());
        return ZVal.assign(
                env.callFunctionDynamic(
                                next,
                                new RuntimeArgsWithReferences().add(0, request),
                                request.getObject())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    protected Object setTrustedProxyIpAddresses(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object trustedIps = null;
        Object ternaryExpressionTemp = null;
        trustedIps =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = this.proxies)
                                ? ternaryExpressionTemp
                                : env.callMethod(
                                        this.config,
                                        "get",
                                        TrustProxies.class,
                                        "trustedproxy.proxies"));
        if (function_is_array.f.env(env).call(trustedIps).getBool()) {
            return ZVal.assign(
                    this.setTrustedProxyIpAddressesToSpecificIps(env, request, trustedIps));
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck(trustedIps, "===", "*"))
                || ZVal.toBool(ZVal.strictEqualityCheck(trustedIps, "===", "**"))) {
            return ZVal.assign(this.setTrustedProxyIpAddressesToTheCallingIp(env, request));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    @ConvertedParameter(index = 1, name = "trustedIps")
    private Object setTrustedProxyIpAddressesToSpecificIps(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object trustedIps = assignParameter(args, 1, false);
        env.callMethod(
                request,
                "setTrustedProxies",
                TrustProxies.class,
                rToArrayCast(trustedIps),
                this.getTrustedHeaderNames(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    private Object setTrustedProxyIpAddressesToTheCallingIp(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        env.callMethod(
                request,
                "setTrustedProxies",
                TrustProxies.class,
                ZVal.newArray(
                        new ZPair(
                                0,
                                env.callMethod(
                                        toObjectR(request)
                                                .accessProp(this, env)
                                                .name("server")
                                                .value(),
                                        "get",
                                        TrustProxies.class,
                                        "REMOTE_ADDR"))),
                this.getTrustedHeaderNames(env));
        return null;
    }

    @ConvertedMethod
    protected Object getTrustedHeaderNames(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = this.headers)
                        ? ternaryExpressionTemp
                        : env.callMethod(
                                this.config, "get", TrustProxies.class, "trustedproxy.headers"));
    }

    public static final Object CONST_class = "Fideloper\\Proxy\\TrustProxies";

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
                    .setName("Fideloper\\Proxy\\TrustProxies")
                    .setLookup(
                            TrustProxies.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("config", "headers", "proxies")
                    .setFilename("vendor/fideloper/proxy/src/TrustProxies.php")
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
