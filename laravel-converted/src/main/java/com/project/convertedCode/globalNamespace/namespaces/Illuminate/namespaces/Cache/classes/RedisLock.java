package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Cache/RedisLock.php

*/

public class RedisLock
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Cache
                .classes
                .Lock
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Contracts
                .namespaces
                .Cache
                .classes
                .Lock {

    public Object redis = null;

    public RedisLock(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RedisLock.class) {
            this.__construct(env, args);
        }
    }

    public RedisLock(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "redis")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(index = 2, name = "seconds")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object redis = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object seconds = assignParameter(args, 2, false);
        super.__construct(env, name, seconds);
        this.redis = redis;
        return null;
    }

    @ConvertedMethod
    public Object acquire(RuntimeEnv env, Object... args) {
        Object result = null;
        result =
                env.callMethod(
                        this.redis,
                        "setnx",
                        RedisLock.class,
                        toObjectR(this).accessProp(this, env).name("name").value(),
                        1);
        if (ZVal.toBool(ZVal.strictEqualityCheck(result, "===", 1))
                && ZVal.toBool(
                        ZVal.isGreaterThan(
                                toObjectR(this).accessProp(this, env).name("seconds").value(),
                                '>',
                                0))) {
            env.callMethod(
                    this.redis,
                    "expire",
                    RedisLock.class,
                    toObjectR(this).accessProp(this, env).name("name").value(),
                    toObjectR(this).accessProp(this, env).name("seconds").value());
        }

        return ZVal.assign(ZVal.strictEqualityCheck(result, "===", 1));
    }

    @ConvertedMethod
    public Object release(RuntimeEnv env, Object... args) {
        env.callMethod(
                this.redis,
                "del",
                RedisLock.class,
                toObjectR(this).accessProp(this, env).name("name").value());
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Cache\\RedisLock";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Illuminate
                    .namespaces
                    .Cache
                    .classes
                    .Lock
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Cache\\RedisLock")
                    .setLookup(
                            RedisLock.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("name", "redis", "seconds")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Cache/RedisLock.php")
                    .addInterface("Illuminate\\Contracts\\Cache\\Lock")
                    .addExtendsClass("Illuminate\\Cache\\Lock")
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
