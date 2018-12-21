package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Redis.namespaces.Limiters.classes;

import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.array.function_range;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Redis.classes.LimiterTimeoutException;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Redis/Limiters/ConcurrencyLimiter.php

*/

public class ConcurrencyLimiter extends RuntimeClassBase {

    public Object redis = null;

    public Object name = null;

    public Object maxLocks = null;

    public Object releaseAfter = null;

    public ConcurrencyLimiter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ConcurrencyLimiter.class) {
            this.__construct(env, args);
        }
    }

    public ConcurrencyLimiter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "redis")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(index = 2, name = "maxLocks")
    @ConvertedParameter(index = 3, name = "releaseAfter")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object redis = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object maxLocks = assignParameter(args, 2, false);
        Object releaseAfter = assignParameter(args, 3, false);
        this.name = name;
        this.redis = redis;
        this.maxLocks = maxLocks;
        this.releaseAfter = releaseAfter;
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
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Redis/Limiters")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Redis/Limiters/ConcurrencyLimiter.php");
        Object timeout = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object slot = null;
        Object starting = null;
        starting = NamespaceGlobal.time.env(env).call().value();
        while (!ZVal.isTrue(slot = this.acquire(env))) {
            if (ZVal.isGreaterThanOrEqualTo(
                    ZVal.subtract(NamespaceGlobal.time.env(env).call().value(), timeout),
                    ">=",
                    starting)) {
                throw ZVal.getException(env, new LimiterTimeoutException(env));
            }

            NamespaceGlobal.usleep.env(env).call(ZVal.multiply(250, 1000));
        }

        if (function_is_callable.f.env(env).call(callback).getBool()) {
            return ZVal.assign(
                    tap.f
                            .env(env)
                            .call(
                                    env.callFunctionDynamic(
                                                    callback, new RuntimeArgsWithReferences())
                                            .value(),
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Illuminate\\Redis\\Limiters",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object _closureThisVar = this.getClosureThisVar();
                                            Object slot = null;
                                            slot = this.contextReferences.getCapturedValue("slot");
                                            ConcurrencyLimiter.this.release(env, slot);
                                            return null;
                                        }
                                    }.use("slot", slot))
                            .value());
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    protected Object acquire(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Redis/Limiters")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Redis/Limiters/ConcurrencyLimiter.php");
        Object slots = null;
        slots =
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Redis\\Limiters",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "i")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object i = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                toStringR(ConcurrencyLimiter.this.name, env)
                                                        + toStringR(i, env));
                                    }
                                },
                                function_range.f.env(env).call(1, this.maxLocks).value())
                        .value();
        return ZVal.assign(
                env.callMethod(
                        this.redis,
                        "eval",
                        ConcurrencyLimiter.class,
                        PackedVaradicArgs.unpack(
                                this.luaScript(env),
                                function_count.f.env(env).call(slots).value(),
                                new PackedVaradicArgs(
                                        function_array_merge
                                                .f
                                                .env(env)
                                                .call(
                                                        slots,
                                                        ZVal.newArray(
                                                                new ZPair(0, this.name),
                                                                new ZPair(1, this.releaseAfter)))
                                                .value()))));
    }

    @ConvertedMethod
    protected Object luaScript(RuntimeEnv env, Object... args) {
        return "for index, value in pairs(redis.call('mget', unpack(KEYS))) do\n    if not value then\n        redis.call('set', ARGV[1]..index, \"1\", \"EX\", ARGV[2])\n        return ARGV[1]..index\n    end\nend";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    protected Object release(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        env.callMethod(this.redis, "del", ConcurrencyLimiter.class, key);
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Redis\\Limiters\\ConcurrencyLimiter";

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
                    .setName("Illuminate\\Redis\\Limiters\\ConcurrencyLimiter")
                    .setLookup(
                            ConcurrencyLimiter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("maxLocks", "name", "redis", "releaseAfter")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Redis/Limiters/ConcurrencyLimiter.php")
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
