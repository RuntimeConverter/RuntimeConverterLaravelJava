package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.namespaces.Middleware.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Redis.namespaces.Limiters.classes.DurationLimiter;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.namespaces.Middleware.classes.ThrottleRequests;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/Middleware/ThrottleRequestsWithRedis.php

*/

public class ThrottleRequestsWithRedis extends ThrottleRequests {

    public Object redis = null;

    public Object decaysAt = null;

    public Object remaining = null;

    public ThrottleRequestsWithRedis(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ThrottleRequestsWithRedis.class) {
            this.__construct(env, args);
        }
    }

    public ThrottleRequestsWithRedis(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "redis",
        typeHint = "Illuminate\\Contracts\\Redis\\Factory"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object redis = assignParameter(args, 0, false);
        this.redis = redis;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "next", typeHint = "Closure")
    @ConvertedParameter(
        index = 2,
        name = "maxAttempts",
        defaultValue = "60",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 3,
        name = "decayMinutes",
        defaultValue = "1",
        defaultValueType = "number"
    )
    public Object handle(RuntimeEnv env, Object... args) {
        ReferenceContainer request = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object next = assignParameter(args, 1, false);
        Object maxAttempts = assignParameter(args, 2, true);
        if (null == maxAttempts) {
            maxAttempts = 60;
        }
        Object decayMinutes = assignParameter(args, 3, true);
        if (null == decayMinutes) {
            decayMinutes = 1;
        }
        Object response = null;
        Object key = null;
        key =
                env.callMethod(
                        this,
                        "resolveRequestSignature",
                        ThrottleRequestsWithRedis.class,
                        request.getObject());
        maxAttempts =
                env.callMethod(
                        this,
                        "resolveMaxAttempts",
                        ThrottleRequestsWithRedis.class,
                        request.getObject(),
                        maxAttempts);
        if (ZVal.isTrue(this.tooManyAttempts(env, key, maxAttempts, decayMinutes))) {
            throw ZVal.getException(
                    env,
                    env.callMethod(
                            this,
                            "buildException",
                            ThrottleRequestsWithRedis.class,
                            key,
                            maxAttempts));
        }

        response =
                env.callFunctionDynamic(
                                next,
                                new RuntimeArgsWithReferences().add(0, request),
                                request.getObject())
                        .value();
        return ZVal.assign(
                env.callMethod(
                        this,
                        "addHeaders",
                        ThrottleRequestsWithRedis.class,
                        response,
                        maxAttempts,
                        this.calculateRemainingAttempts(env, key, maxAttempts)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "maxAttempts")
    @ConvertedParameter(index = 2, name = "decayMinutes")
    protected Object tooManyAttempts(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing/Middleware")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Routing/Middleware/ThrottleRequestsWithRedis.php");
        Object key = assignParameter(args, 0, false);
        Object maxAttempts = assignParameter(args, 1, false);
        Object decayMinutes = assignParameter(args, 2, false);
        Object limiter = null;
        limiter =
                new DurationLimiter(
                        env, this.redis, key, maxAttempts, ZVal.multiply(decayMinutes, 60));
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                !ZVal.isTrue(
                                        env.callMethod(
                                                limiter,
                                                "acquire",
                                                ThrottleRequestsWithRedis.class)),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Routing\\Middleware",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object runtimeTempArrayResult72 = null;
                                        Object limiter = null;
                                        limiter =
                                                this.contextReferences.getCapturedValue("limiter");
                                        ZVal.list(
                                                runtimeTempArrayResult72 =
                                                        ZVal.newArray(
                                                                new ZPair(
                                                                        0,
                                                                        toObjectR(limiter)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("decaysAt")
                                                                                .value()),
                                                                new ZPair(
                                                                        1,
                                                                        toObjectR(limiter)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("remaining")
                                                                                .value())),
                                                (ThrottleRequestsWithRedis.this.decaysAt =
                                                        listGet(runtimeTempArrayResult72, 0, env)),
                                                (ThrottleRequestsWithRedis.this.remaining =
                                                        listGet(runtimeTempArrayResult72, 1, env)));
                                        return null;
                                    }
                                }.use("limiter", limiter))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "maxAttempts")
    @ConvertedParameter(
        index = 2,
        name = "retryAfter",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object calculateRemainingAttempts(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object maxAttempts = assignParameter(args, 1, false);
        Object retryAfter = assignParameter(args, 2, true);
        if (null == retryAfter) {
            retryAfter = ZVal.getNull();
        }
        if (function_is_null.f.env(env).call(retryAfter).getBool()) {
            return ZVal.assign(this.remaining);
        }

        return 0;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    protected Object getTimeUntilNextRetry(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.subtract(
                        this.decaysAt,
                        env.callMethod(this, "currentTime", ThrottleRequestsWithRedis.class)));
    }

    public static final Object CONST_class =
            "Illuminate\\Routing\\Middleware\\ThrottleRequestsWithRedis";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ThrottleRequests.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Routing\\Middleware\\ThrottleRequestsWithRedis")
                    .setLookup(
                            ThrottleRequestsWithRedis.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("decaysAt", "limiter", "redis", "remaining")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Routing/Middleware/ThrottleRequestsWithRedis.php")
                    .addExtendsClass("Illuminate\\Routing\\Middleware\\ThrottleRequests")
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
