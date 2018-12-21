package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.namespaces.Middleware.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeClasses.date.DateInterval;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Exceptions.classes.ThrottleRequestsException;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/Middleware/ThrottleRequests.php

*/

public class ThrottleRequests extends RuntimeClassBase {

    public Object limiter = null;

    public ThrottleRequests(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ThrottleRequests.class) {
            this.__construct(env, args);
        }
    }

    public ThrottleRequests(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "limiter", typeHint = "Illuminate\\Cache\\RateLimiter")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object limiter = assignParameter(args, 0, false);
        this.limiter = limiter;
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
        key = this.resolveRequestSignature(env, request.getObject());
        maxAttempts = this.resolveMaxAttempts(env, request.getObject(), maxAttempts);
        if (ZVal.isTrue(
                env.callMethod(
                        this.limiter,
                        "tooManyAttempts",
                        ThrottleRequests.class,
                        key,
                        maxAttempts))) {
            throw ZVal.getException(env, this.buildException(env, key, maxAttempts));
        }

        env.callMethod(this.limiter, "hit", ThrottleRequests.class, key, decayMinutes);
        response =
                env.callFunctionDynamic(
                                next,
                                new RuntimeArgsWithReferences().add(0, request),
                                request.getObject())
                        .value();
        return ZVal.assign(
                this.addHeaders(
                        env,
                        response,
                        maxAttempts,
                        this.calculateRemainingAttempts(env, key, maxAttempts)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "maxAttempts")
    protected Object resolveMaxAttempts(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object maxAttempts = assignParameter(args, 1, false);
        if (ZVal.isTrue(Str.runtimeStaticObject.contains(env, maxAttempts, "|"))) {
            maxAttempts =
                    ZVal.assign(
                            handleReturnReference(
                                            function_explode
                                                    .f
                                                    .env(env)
                                                    .call("|", maxAttempts, 2)
                                                    .value())
                                    .arrayGet(
                                            env,
                                            ZVal.isTrue(
                                                            env.callMethod(
                                                                    request,
                                                                    "user",
                                                                    ThrottleRequests.class))
                                                    ? 1
                                                    : 0));
        }

        if (ZVal.toBool(!function_is_numeric.f.env(env).call(maxAttempts).getBool())
                && ZVal.toBool(env.callMethod(request, "user", ThrottleRequests.class))) {
            maxAttempts =
                    ZVal.assign(
                            toObjectR(env.callMethod(request, "user", ThrottleRequests.class))
                                    .accessProp(this, env)
                                    .name(maxAttempts)
                                    .value());
        }

        return ZVal.assign(ZVal.toLong(maxAttempts));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    protected Object resolveRequestSignature(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object route = null;
        Object user = null;
        if (ZVal.isTrue(user = env.callMethod(request, "user", ThrottleRequests.class))) {
            return ZVal.assign(
                    NamespaceGlobal.sha1
                            .env(env)
                            .call(env.callMethod(user, "getAuthIdentifier", ThrottleRequests.class))
                            .value());
        }

        if (ZVal.isTrue(route = env.callMethod(request, "route", ThrottleRequests.class))) {
            return ZVal.assign(
                    NamespaceGlobal.sha1
                            .env(env)
                            .call(
                                    toStringR(
                                                    env.callMethod(
                                                            route,
                                                            "getDomain",
                                                            ThrottleRequests.class),
                                                    env)
                                            + "|"
                                            + toStringR(
                                                    env.callMethod(
                                                            request, "ip", ThrottleRequests.class),
                                                    env))
                            .value());
        }

        throw ZVal.getException(
                env,
                new RuntimeException(
                        env, "Unable to generate the request signature. Route unavailable."));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "maxAttempts")
    protected Object buildException(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object maxAttempts = assignParameter(args, 1, false);
        Object headers = null;
        Object retryAfter = null;
        retryAfter = this.getTimeUntilNextRetry(env, key);
        headers =
                this.getHeaders(
                        env,
                        maxAttempts,
                        this.calculateRemainingAttempts(env, key, maxAttempts, retryAfter),
                        retryAfter);
        return ZVal.assign(
                new ThrottleRequestsException(env, "Too Many Attempts.", ZVal.getNull(), headers));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    protected Object getTimeUntilNextRetry(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(this.limiter, "availableIn", ThrottleRequests.class, key));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    @ConvertedParameter(index = 1, name = "maxAttempts")
    @ConvertedParameter(index = 2, name = "remainingAttempts")
    @ConvertedParameter(
        index = 3,
        name = "retryAfter",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object addHeaders(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object response = assignParameter(args, 0, false);
        Object maxAttempts = assignParameter(args, 1, false);
        Object remainingAttempts = assignParameter(args, 2, false);
        Object retryAfter = assignParameter(args, 3, true);
        if (null == retryAfter) {
            retryAfter = ZVal.getNull();
        }
        env.callMethod(
                toObjectR(response).accessProp(this, env).name("headers").value(),
                rLastRefArgs =
                        new RuntimeArgsWithReferences()
                                .add(
                                        0,
                                        handleReturnReference(
                                                this.getHeaders(
                                                        env,
                                                        maxAttempts,
                                                        remainingAttempts,
                                                        retryAfter))),
                "add",
                ThrottleRequests.class,
                rLastRefArgs.get(0));
        return ZVal.assign(response);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "maxAttempts")
    @ConvertedParameter(index = 1, name = "remainingAttempts")
    @ConvertedParameter(
        index = 2,
        name = "retryAfter",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object getHeaders(RuntimeEnv env, Object... args) {
        Object maxAttempts = assignParameter(args, 0, false);
        Object remainingAttempts = assignParameter(args, 1, false);
        Object retryAfter = assignParameter(args, 2, true);
        if (null == retryAfter) {
            retryAfter = ZVal.getNull();
        }
        ReferenceContainer headers = new BasicReferenceContainer(null);
        headers.setObject(
                ZVal.newArray(
                        new ZPair("X-RateLimit-Limit", maxAttempts),
                        new ZPair("X-RateLimit-Remaining", remainingAttempts)));
        if (!function_is_null.f.env(env).call(retryAfter).getBool()) {
            headers.arrayAccess(env, "Retry-After").set(retryAfter);
            headers.arrayAccess(env, "X-RateLimit-Reset").set(this.availableAt(env, retryAfter));
        }

        return ZVal.assign(headers.getObject());
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
            return ZVal.assign(
                    env.callMethod(
                            this.limiter, "retriesLeft", ThrottleRequests.class, key, maxAttempts));
        }

        return 0;
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
                                                        delay,
                                                        "getTimestamp",
                                                        ThrottleRequests.class),
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
                        ? env.callMethod(delay, "getTimestamp", ThrottleRequests.class)
                        : env.callMethod(
                                env.callMethod(
                                        Carbon.runtimeStaticObject.now(env),
                                        "addSeconds",
                                        ThrottleRequests.class,
                                        delay),
                                "getTimestamp",
                                ThrottleRequests.class));
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
                            ThrottleRequests.class,
                            delay.getObject()));
        }

        return ZVal.assign(delay.getObject());
    }

    @ConvertedMethod
    protected Object currentTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        Carbon.runtimeStaticObject.now(env),
                        "getTimestamp",
                        ThrottleRequests.class));
    }

    public static final Object CONST_class = "Illuminate\\Routing\\Middleware\\ThrottleRequests";

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
                    .setName("Illuminate\\Routing\\Middleware\\ThrottleRequests")
                    .setLookup(
                            ThrottleRequests.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("limiter")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Routing/Middleware/ThrottleRequests.php")
                    .addTrait("Illuminate\\Support\\InteractsWithTime")
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
