package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Redis.namespaces.Limiters.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Redis.classes.LimiterTimeoutException;
import com.runtimeconverter.runtime.nativeFunctions.date.function_microtime;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Redis/Limiters/DurationLimiter.php

*/

public class DurationLimiter extends RuntimeClassBase {

    public Object redis = null;

    public Object name = null;

    public Object maxLocks = null;

    public Object decay = null;

    public Object decaysAt = null;

    public Object remaining = null;

    public DurationLimiter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DurationLimiter.class) {
            this.__construct(env, args);
        }
    }

    public DurationLimiter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "redis")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(index = 2, name = "maxLocks")
    @ConvertedParameter(index = 3, name = "decay")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object redis = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object maxLocks = assignParameter(args, 2, false);
        Object decay = assignParameter(args, 3, false);
        this.name = name;
        this.decay = decay;
        this.redis = redis;
        this.maxLocks = maxLocks;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "timeout")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object block(RuntimeEnv env, Object... args) {
        Object timeout = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object starting = null;
        starting = NamespaceGlobal.time.env(env).call().value();
        while (!ZVal.isTrue(this.acquire(env))) {
            if (ZVal.isGreaterThanOrEqualTo(
                    ZVal.subtract(NamespaceGlobal.time.env(env).call().value(), timeout),
                    ">=",
                    starting)) {
                throw ZVal.getException(env, new LimiterTimeoutException(env));
            }

            NamespaceGlobal.usleep.env(env).call(ZVal.multiply(750, 1000));
        }

        if (function_is_callable.f.env(env).call(callback).getBool()) {
            env.callFunctionDynamic(callback, new RuntimeArgsWithReferences());
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object acquire(RuntimeEnv env, Object... args) {
        ReferenceContainer results = new BasicReferenceContainer(null);
        results.setObject(
                env.callMethod(
                        this.redis,
                        "eval",
                        DurationLimiter.class,
                        this.luaScript(env),
                        1,
                        this.name,
                        function_microtime.f.env(env).call(true).value(),
                        NamespaceGlobal.time.env(env).call().value(),
                        this.decay,
                        this.maxLocks));
        this.decaysAt = results.arrayGet(env, 1);
        this.remaining = NamespaceGlobal.max.env(env).call(0, results.arrayGet(env, 2)).value();
        return ZVal.assign(ZVal.toBool(results.arrayGet(env, 0)));
    }

    @ConvertedMethod
    protected Object luaScript(RuntimeEnv env, Object... args) {
        return "local function reset()\n    redis.call('HMSET', KEYS[1], 'start', ARGV[2], 'end', ARGV[2] + ARGV[3], 'count', 1)\n    return redis.call('EXPIRE', KEYS[1], ARGV[3] * 2)\nend\n\nif redis.call('EXISTS', KEYS[1]) == 0 then\n    return {reset(), ARGV[2] + ARGV[3], ARGV[4] - 1}\nend\n\nif ARGV[1] >= redis.call('HGET', KEYS[1], 'start') and ARGV[1] <= redis.call('HGET', KEYS[1], 'end') then\n    return {\n        tonumber(redis.call('HINCRBY', KEYS[1], 'count', 1)) <= tonumber(ARGV[4]),\n        redis.call('HGET', KEYS[1], 'end'),\n        ARGV[4] - redis.call('HGET', KEYS[1], 'count')\n    }\nend\n\nreturn {reset(), ARGV[2] + ARGV[3], ARGV[4] - 1}";
    }

    public static final Object CONST_class = "Illuminate\\Redis\\Limiters\\DurationLimiter";

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
                    .setName("Illuminate\\Redis\\Limiters\\DurationLimiter")
                    .setLookup(
                            DurationLimiter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "decay", "decaysAt", "maxLocks", "name", "redis", "remaining")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Redis/Limiters/DurationLimiter.php")
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
