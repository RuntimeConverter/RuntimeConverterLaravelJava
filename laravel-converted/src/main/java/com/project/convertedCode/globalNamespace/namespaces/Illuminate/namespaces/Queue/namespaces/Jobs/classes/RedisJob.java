package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Jobs.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/Jobs/RedisJob.php

*/

public class RedisJob
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Queue
                .namespaces
                .Jobs
                .classes
                .Job
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Contracts
                .namespaces
                .Queue
                .classes
                .Job {

    public Object redis = null;

    public Object job = null;

    public Object decoded = null;

    public Object reserved = null;

    public RedisJob(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RedisJob.class) {
            this.__construct(env, args);
        }
    }

    public RedisJob(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Container\\Container"
    )
    @ConvertedParameter(index = 1, name = "redis", typeHint = "Illuminate\\Queue\\RedisQueue")
    @ConvertedParameter(index = 2, name = "job")
    @ConvertedParameter(index = 3, name = "reserved")
    @ConvertedParameter(index = 4, name = "connectionName")
    @ConvertedParameter(index = 5, name = "queue")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        Object redis = assignParameter(args, 1, false);
        Object job = assignParameter(args, 2, false);
        Object reserved = assignParameter(args, 3, false);
        Object connectionName = assignParameter(args, 4, false);
        Object queue = assignParameter(args, 5, false);
        this.job = job;
        this.redis = redis;
        toObjectR(this).accessProp(this, env).name("queue").set(queue);
        this.reserved = reserved;
        toObjectR(this).accessProp(this, env).name("container").set(container);
        toObjectR(this).accessProp(this, env).name("connectionName").set(connectionName);
        this.decoded = env.callMethod(this, "payload", RedisJob.class);
        return null;
    }

    @ConvertedMethod
    public Object getRawBody(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.job);
    }

    @ConvertedMethod
    public Object delete(RuntimeEnv env, Object... args) {
        super.delete(env);
        env.callMethod(
                this.redis,
                "deleteReserved",
                RedisJob.class,
                toObjectR(this).accessProp(this, env).name("queue").value(),
                this);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay", defaultValue = "0", defaultValueType = "number")
    public Object release(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, true);
        if (null == delay) {
            delay = 0;
        }
        super.release(env, delay);
        env.callMethod(
                this.redis,
                "deleteAndRelease",
                RedisJob.class,
                toObjectR(this).accessProp(this, env).name("queue").value(),
                this,
                delay);
        return null;
    }

    @ConvertedMethod
    public Object attempts(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.add(
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                new ReferenceClassProperty(this, "decoded", env)
                                                        .arrayGet(env, "attempts"))
                                ? ternaryExpressionTemp
                                : ZVal.getNull(),
                        1));
    }

    @ConvertedMethod
    public Object getJobId(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "decoded", env)
                                                .arrayGet(env, "id"))
                        ? ternaryExpressionTemp
                        : ZVal.getNull());
    }

    @ConvertedMethod
    public Object getRedisQueue(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.redis);
    }

    @ConvertedMethod
    public Object getReservedJob(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.reserved);
    }

    public static final Object CONST_class = "Illuminate\\Queue\\Jobs\\RedisJob";

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
                    .Queue
                    .namespaces
                    .Jobs
                    .classes
                    .Job
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Queue\\Jobs\\RedisJob")
                    .setLookup(
                            RedisJob.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "connectionName",
                            "container",
                            "decoded",
                            "deleted",
                            "failed",
                            "instance",
                            "job",
                            "queue",
                            "redis",
                            "released",
                            "reserved")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Queue/Jobs/RedisJob.php")
                    .addInterface("Illuminate\\Contracts\\Queue\\Job")
                    .addExtendsClass("Illuminate\\Queue\\Jobs\\Job")
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
