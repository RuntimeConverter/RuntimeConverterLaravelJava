package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeClasses.date.DateInterval;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Cache/RateLimiter.php

*/

public class RateLimiter extends RuntimeClassBase {

    public Object cache = null;

    public RateLimiter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RateLimiter.class) {
            this.__construct(env, args);
        }
    }

    public RateLimiter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cache",
        typeHint = "Illuminate\\Contracts\\Cache\\Repository"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object cache = assignParameter(args, 0, false);
        this.cache = cache;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "maxAttempts")
    public Object tooManyAttempts(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object maxAttempts = assignParameter(args, 1, false);
        if (ZVal.isGreaterThanOrEqualTo(this.attempts(env, key), ">=", maxAttempts)) {
            if (ZVal.isTrue(
                    env.callMethod(
                            this.cache,
                            "has",
                            RateLimiter.class,
                            toStringR(key, env) + ":timer"))) {
                return ZVal.assign(true);
            }

            this.resetAttempts(env, key);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "decayMinutes",
        defaultValue = "1",
        defaultValueType = "number"
    )
    public Object hit(RuntimeEnv env, Object... args) {
        ReferenceContainer key = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object decayMinutes = assignParameter(args, 1, true);
        if (null == decayMinutes) {
            decayMinutes = 1;
        }
        Object hits = null;
        Object added = null;
        env.callMethod(
                this.cache,
                new RuntimeArgsWithReferences(),
                "add",
                RateLimiter.class,
                toStringR(key.getObject(), env) + ":timer",
                this.availableAt(env, ZVal.multiply(decayMinutes, 60)),
                decayMinutes);
        added =
                env.callMethod(
                        this.cache,
                        new RuntimeArgsWithReferences().add(0, key),
                        "add",
                        RateLimiter.class,
                        key.getObject(),
                        0,
                        decayMinutes);
        hits =
                ZVal.assign(
                        ZVal.toLong(
                                env.callMethod(
                                        this.cache,
                                        "increment",
                                        RateLimiter.class,
                                        key.getObject())));
        if (ZVal.toBool(!ZVal.isTrue(added)) && ZVal.toBool(ZVal.equalityCheck(hits, 1))) {
            env.callMethod(this.cache, "put", RateLimiter.class, key.getObject(), 1, decayMinutes);
        }

        return ZVal.assign(hits);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object attempts(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.cache, "get", RateLimiter.class, key, 0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object resetAttempts(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.cache, "forget", RateLimiter.class, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "maxAttempts")
    public Object retriesLeft(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object maxAttempts = assignParameter(args, 1, false);
        Object attempts = null;
        attempts = this.attempts(env, key);
        return ZVal.assign(ZVal.subtract(maxAttempts, attempts));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object clear(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        this.resetAttempts(env, key);
        env.callMethod(this.cache, "forget", RateLimiter.class, toStringR(key, env) + ":timer");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object availableIn(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.subtract(
                        env.callMethod(
                                this.cache,
                                "get",
                                RateLimiter.class,
                                toStringR(key, env) + ":timer"),
                        this.currentTime(env)));
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
                                                        delay, "getTimestamp", RateLimiter.class),
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
                        ? env.callMethod(delay, "getTimestamp", RateLimiter.class)
                        : env.callMethod(
                                env.callMethod(
                                        Carbon.runtimeStaticObject.now(env),
                                        "addSeconds",
                                        RateLimiter.class,
                                        delay),
                                "getTimestamp",
                                RateLimiter.class));
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
                            RateLimiter.class,
                            delay.getObject()));
        }

        return ZVal.assign(delay.getObject());
    }

    @ConvertedMethod
    protected Object currentTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        Carbon.runtimeStaticObject.now(env), "getTimestamp", RateLimiter.class));
    }

    public static final Object CONST_class = "Illuminate\\Cache\\RateLimiter";

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
                    .setName("Illuminate\\Cache\\RateLimiter")
                    .setLookup(
                            RateLimiter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cache")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Cache/RateLimiter.php")
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
