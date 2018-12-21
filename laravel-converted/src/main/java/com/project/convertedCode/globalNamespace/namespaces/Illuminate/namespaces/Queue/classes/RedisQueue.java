package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes.LuaScripts;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Jobs.classes.RedisJob;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/RedisQueue.php

*/

public class RedisQueue
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Queue
                .classes
                .Queue
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
                .Queue {

    public Object redis = null;

    public Object connection = null;

    public Object _pDefault = null;

    public Object retryAfter = 60;

    public Object blockFor = ZVal.getNull();

    public RedisQueue(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RedisQueue.class) {
            this.__construct(env, args);
        }
    }

    public RedisQueue(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "redis",
        typeHint = "Illuminate\\Contracts\\Redis\\Factory"
    )
    @ConvertedParameter(index = 1, name = "default")
    @ConvertedParameter(
        index = 2,
        name = "connection",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "retryAfter",
        defaultValue = "60",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 4,
        name = "blockFor",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object redis = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = "default";
        }
        Object connection = assignParameter(args, 2, true);
        if (null == connection) {
            connection = ZVal.getNull();
        }
        Object retryAfter = assignParameter(args, 3, true);
        if (null == retryAfter) {
            retryAfter = 60;
        }
        Object blockFor = assignParameter(args, 4, true);
        if (null == blockFor) {
            blockFor = ZVal.getNull();
        }
        this.redis = redis;
        this._pDefault = _pDefault;
        this.blockFor = blockFor;
        this.connection = connection;
        this.retryAfter = retryAfter;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object size(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        queue = this.getQueue(env, queue);
        return ZVal.assign(
                env.callMethod(
                        this.getConnection(env),
                        "eval",
                        RedisQueue.class,
                        LuaScripts.runtimeStaticObject.size(env),
                        3,
                        queue,
                        toStringR(queue, env) + ":delayed",
                        toStringR(queue, env) + ":reserved"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    @ConvertedParameter(index = 1, name = "data")
    @ConvertedParameter(
        index = 2,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object push(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = "";
        }
        Object queue = assignParameter(args, 2, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        return ZVal.assign(
                this.pushRaw(
                        env,
                        env.callMethod(this, "createPayload", RedisQueue.class, job, data),
                        queue));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "payload")
    @ConvertedParameter(
        index = 1,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object pushRaw(RuntimeEnv env, Object... args) {
        Object payload = assignParameter(args, 0, false);
        Object queue = assignParameter(args, 1, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object ternaryExpressionTemp = null;
        env.callMethod(
                this.getConnection(env),
                "rpush",
                RedisQueue.class,
                this.getQueue(env, queue),
                payload);
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        handleReturnReference(
                                                        NamespaceGlobal.json_decode
                                                                .env(env)
                                                                .call(payload, true)
                                                                .value())
                                                .arrayGet(env, "id"))
                        ? ternaryExpressionTemp
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay")
    @ConvertedParameter(index = 1, name = "job")
    @ConvertedParameter(index = 2, name = "data")
    @ConvertedParameter(
        index = 3,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object later(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, false);
        Object job = assignParameter(args, 1, false);
        Object data = assignParameter(args, 2, true);
        if (null == data) {
            data = "";
        }
        Object queue = assignParameter(args, 3, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        return ZVal.assign(
                this.laterRaw(
                        env,
                        delay,
                        env.callMethod(this, "createPayload", RedisQueue.class, job, data),
                        queue));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay")
    @ConvertedParameter(index = 1, name = "payload")
    @ConvertedParameter(
        index = 2,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object laterRaw(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, false);
        Object payload = assignParameter(args, 1, false);
        Object queue = assignParameter(args, 2, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        env.callMethod(
                this.getConnection(env),
                "zadd",
                RedisQueue.class,
                toStringR(this.getQueue(env, queue), env) + ":delayed",
                env.callMethod(this, "availableAt", RedisQueue.class, delay),
                payload);
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        handleReturnReference(
                                                        NamespaceGlobal.json_decode
                                                                .env(env)
                                                                .call(payload, true)
                                                                .value())
                                                .arrayGet(env, "id"))
                        ? ternaryExpressionTemp
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    @ConvertedParameter(index = 1, name = "data")
    protected Object createPayloadArray(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = "";
        }
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                super.createPayloadArray(env, job, data),
                                ZVal.newArray(
                                        new ZPair("id", this.getRandomId(env)),
                                        new ZPair("attempts", 0)))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object pop(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        Object runtimeTempArrayResult71 = null;
        Object prefixed = null;
        Object reserved = null;
        Object ternaryExpressionTemp = null;
        Object job = null;
        this.migrate(env, prefixed = this.getQueue(env, queue));
        ZVal.list(
                runtimeTempArrayResult71 = this.retrieveNextJob(env, prefixed),
                (job = listGet(runtimeTempArrayResult71, 0, env)),
                (reserved = listGet(runtimeTempArrayResult71, 1, env)));
        if (ZVal.isTrue(reserved)) {
            return ZVal.assign(
                    new RedisJob(
                            env,
                            toObjectR(this).accessProp(this, env).name("container").value(),
                            this,
                            job,
                            reserved,
                            toObjectR(this).accessProp(this, env).name("connectionName").value(),
                            ZVal.isTrue(ternaryExpressionTemp = queue)
                                    ? ternaryExpressionTemp
                                    : this._pDefault));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    protected Object migrate(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        this.migrateExpiredJobs(env, toStringR(queue, env) + ":delayed", queue);
        if (!function_is_null.f.env(env).call(this.retryAfter).getBool()) {
            this.migrateExpiredJobs(env, toStringR(queue, env) + ":reserved", queue);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from")
    @ConvertedParameter(index = 1, name = "to")
    public Object migrateExpiredJobs(RuntimeEnv env, Object... args) {
        Object from = assignParameter(args, 0, false);
        Object to = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this.getConnection(env),
                        "eval",
                        RedisQueue.class,
                        LuaScripts.runtimeStaticObject.migrateExpiredJobs(env),
                        2,
                        from,
                        to,
                        env.callMethod(this, "currentTime", RedisQueue.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    protected Object retrieveNextJob(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        if (!function_is_null.f.env(env).call(this.blockFor).getBool()) {
            return ZVal.assign(this.blockingPop(env, queue));
        }

        return ZVal.assign(
                env.callMethod(
                        this.getConnection(env),
                        "eval",
                        RedisQueue.class,
                        LuaScripts.runtimeStaticObject.pop(env),
                        2,
                        queue,
                        toStringR(queue, env) + ":reserved",
                        env.callMethod(this, "availableAt", RedisQueue.class, this.retryAfter)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    protected Object blockingPop(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        ReferenceContainer rawBody = new BasicReferenceContainer(null);
        ReferenceContainer payload = new BasicReferenceContainer(null);
        Object reserved = null;
        rawBody.setObject(
                env.callMethod(
                        this.getConnection(env), "blpop", RedisQueue.class, queue, this.blockFor));
        if (!ZVal.isEmpty(rawBody.getObject())) {
            payload.setObject(
                    NamespaceGlobal.json_decode
                            .env(env)
                            .call(rawBody.arrayGet(env, 1), true)
                            .value());
            payload.arrayAccess(env, "attempts")
                    .set(ZVal.increment(payload.arrayGet(env, "attempts")));
            reserved = NamespaceGlobal.json_encode.env(env).call(payload.getObject()).value();
            env.callMethod(
                    this.getConnection(env),
                    "zadd",
                    RedisQueue.class,
                    toStringR(queue, env) + ":reserved",
                    ZVal.newArray(
                            new ZPair(
                                    reserved,
                                    env.callMethod(
                                            this,
                                            "availableAt",
                                            RedisQueue.class,
                                            this.retryAfter))));
            return ZVal.assign(
                    ZVal.newArray(new ZPair(0, rawBody.arrayGet(env, 1)), new ZPair(1, reserved)));
        }

        return ZVal.assign(
                ZVal.newArray(new ZPair(0, ZVal.getNull()), new ZPair(1, ZVal.getNull())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    @ConvertedParameter(index = 1, name = "job")
    public Object deleteReserved(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        Object job = assignParameter(args, 1, false);
        env.callMethod(
                this.getConnection(env),
                "zrem",
                RedisQueue.class,
                toStringR(this.getQueue(env, queue), env) + ":reserved",
                env.callMethod(job, "getReservedJob", RedisQueue.class));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    @ConvertedParameter(index = 1, name = "job")
    @ConvertedParameter(index = 2, name = "delay")
    public Object deleteAndRelease(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        Object job = assignParameter(args, 1, false);
        Object delay = assignParameter(args, 2, false);
        queue = this.getQueue(env, queue);
        env.callMethod(
                this.getConnection(env),
                "eval",
                RedisQueue.class,
                LuaScripts.runtimeStaticObject.release(env),
                2,
                toStringR(queue, env) + ":delayed",
                toStringR(queue, env) + ":reserved",
                env.callMethod(job, "getReservedJob", RedisQueue.class),
                env.callMethod(this, "availableAt", RedisQueue.class, delay));
        return null;
    }

    @ConvertedMethod
    protected Object getRandomId(RuntimeEnv env, Object... args) {
        return ZVal.assign(Str.runtimeStaticObject.random(env, 32));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    public Object getQueue(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                "queues:"
                        + toStringR(
                                ZVal.isTrue(ternaryExpressionTemp = queue)
                                        ? ternaryExpressionTemp
                                        : this._pDefault,
                                env));
    }

    @ConvertedMethod
    protected Object getConnection(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this.redis, "connection", RedisQueue.class, this.connection));
    }

    @ConvertedMethod
    public Object getRedis(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.redis);
    }

    public static final Object CONST_class = "Illuminate\\Queue\\RedisQueue";

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
                    .classes
                    .Queue
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Queue\\RedisQueue")
                    .setLookup(
                            RedisQueue.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "blockFor",
                            "connection",
                            "connectionName",
                            "container",
                            "default",
                            "redis",
                            "retryAfter")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Queue/RedisQueue.php")
                    .addInterface("Illuminate\\Contracts\\Queue\\Queue")
                    .addExtendsClass("Illuminate\\Queue\\Queue")
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
