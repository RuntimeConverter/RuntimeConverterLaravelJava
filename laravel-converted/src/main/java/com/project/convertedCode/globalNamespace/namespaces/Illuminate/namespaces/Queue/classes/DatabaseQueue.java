package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Jobs.classes.DatabaseJobRecord;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Jobs.classes.DatabaseJob;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/DatabaseQueue.php

*/

public class DatabaseQueue
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

    public Object database = null;

    public Object table = null;

    public Object _pDefault = null;

    public Object retryAfter = 60;

    public DatabaseQueue(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DatabaseQueue.class) {
            this.__construct(env, args);
        }
    }

    public DatabaseQueue(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "database", typeHint = "Illuminate\\Database\\Connection")
    @ConvertedParameter(index = 1, name = "table")
    @ConvertedParameter(index = 2, name = "default")
    @ConvertedParameter(
        index = 3,
        name = "retryAfter",
        defaultValue = "60",
        defaultValueType = "number"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object database = assignParameter(args, 0, false);
        Object table = assignParameter(args, 1, false);
        Object _pDefault = assignParameter(args, 2, true);
        if (null == _pDefault) {
            _pDefault = "default";
        }
        Object retryAfter = assignParameter(args, 3, true);
        if (null == retryAfter) {
            retryAfter = 60;
        }
        this.table = table;
        this._pDefault = _pDefault;
        this.database = database;
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
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        this.database, "table", DatabaseQueue.class, this.table),
                                "where",
                                DatabaseQueue.class,
                                "queue",
                                this.getQueue(env, queue)),
                        "count",
                        DatabaseQueue.class));
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
                this.pushToDatabase(
                        env,
                        queue,
                        env.callMethod(this, "createPayload", DatabaseQueue.class, job, data)));
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
        return ZVal.assign(this.pushToDatabase(env, queue, payload));
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
                this.pushToDatabase(
                        env,
                        queue,
                        env.callMethod(this, "createPayload", DatabaseQueue.class, job, data),
                        delay));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "jobs")
    @ConvertedParameter(index = 1, name = "data")
    @ConvertedParameter(
        index = 2,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object bulk(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Queue/DatabaseQueue.php");
        Object jobs = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = "";
        }
        Object queue = assignParameter(args, 2, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        Object availableAt = null;
        queue = this.getQueue(env, queue);
        availableAt = env.callMethod(this, "availableAt", DatabaseQueue.class);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.database, "table", DatabaseQueue.class, this.table),
                        "insert",
                        DatabaseQueue.class,
                        env.callMethod(
                                env.callMethod(
                                        collect.f.env(env).call(rToArrayCast(jobs)).value(),
                                        "map",
                                        DatabaseQueue.class,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Queue",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "job")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object _closureThisVar = this.getClosureThisVar();
                                                Object job = assignParameter(args, 0, false);
                                                Object data = null;
                                                Object availableAt = null;
                                                Object queue = null;
                                                data =
                                                        this.contextReferences.getCapturedValue(
                                                                "data");
                                                availableAt =
                                                        this.contextReferences.getCapturedValue(
                                                                "availableAt");
                                                queue =
                                                        this.contextReferences.getCapturedValue(
                                                                "queue");
                                                return ZVal.assign(
                                                        DatabaseQueue.this.buildDatabaseRecord(
                                                                env,
                                                                queue,
                                                                env.callMethod(
                                                                        _closureThisVar,
                                                                        "createPayload",
                                                                        DatabaseQueue.class,
                                                                        job,
                                                                        data),
                                                                availableAt));
                                            }
                                        }.use("data", data)
                                                .use("availableAt", availableAt)
                                                .use("queue", queue)),
                                "all",
                                DatabaseQueue.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    @ConvertedParameter(index = 1, name = "job")
    @ConvertedParameter(index = 2, name = "delay")
    public Object release(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        Object job = assignParameter(args, 1, false);
        Object delay = assignParameter(args, 2, false);
        return ZVal.assign(
                this.pushToDatabase(
                        env,
                        queue,
                        toObjectR(job).accessProp(this, env).name("payload").value(),
                        delay,
                        toObjectR(job).accessProp(this, env).name("attempts").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    @ConvertedParameter(index = 1, name = "payload")
    @ConvertedParameter(index = 2, name = "delay", defaultValue = "0", defaultValueType = "number")
    @ConvertedParameter(
        index = 3,
        name = "attempts",
        defaultValue = "0",
        defaultValueType = "number"
    )
    protected Object pushToDatabase(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        Object payload = assignParameter(args, 1, false);
        Object delay = assignParameter(args, 2, true);
        if (null == delay) {
            delay = 0;
        }
        Object attempts = assignParameter(args, 3, true);
        if (null == attempts) {
            attempts = 0;
        }
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.database, "table", DatabaseQueue.class, this.table),
                        "insertGetId",
                        DatabaseQueue.class,
                        this.buildDatabaseRecord(
                                env,
                                this.getQueue(env, queue),
                                payload,
                                env.callMethod(this, "availableAt", DatabaseQueue.class, delay),
                                attempts)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    @ConvertedParameter(index = 1, name = "payload")
    @ConvertedParameter(index = 2, name = "availableAt")
    @ConvertedParameter(
        index = 3,
        name = "attempts",
        defaultValue = "0",
        defaultValueType = "number"
    )
    protected Object buildDatabaseRecord(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        Object payload = assignParameter(args, 1, false);
        Object availableAt = assignParameter(args, 2, false);
        Object attempts = assignParameter(args, 3, true);
        if (null == attempts) {
            attempts = 0;
        }
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("queue", queue),
                        new ZPair("attempts", attempts),
                        new ZPair("reserved_at", ZVal.getNull()),
                        new ZPair("available_at", availableAt),
                        new ZPair(
                                "created_at",
                                env.callMethod(this, "currentTime", DatabaseQueue.class)),
                        new ZPair("payload", payload)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object pop(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Queue/DatabaseQueue.php");
        Object queue = assignParameter(args, 0, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        queue = this.getQueue(env, queue);
        return ZVal.assign(
                env.callMethod(
                        this.database,
                        "transaction",
                        DatabaseQueue.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Queue",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object job = null;
                                Object queue = null;
                                queue = this.contextReferences.getCapturedValue("queue");
                                if (ZVal.isTrue(
                                        job = DatabaseQueue.this.getNextAvailableJob(env, queue))) {
                                    return ZVal.assign(
                                            DatabaseQueue.this.marshalJob(env, queue, job));
                                }

                                return ZVal.assign(ZVal.getNull());
                            }
                        }.use("queue", queue)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    protected Object getNextAvailableJob(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Queue/DatabaseQueue.php");
        Object queue = assignParameter(args, 0, false);
        Object job = null;
        job =
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                env.callMethod(
                                                        env.callMethod(
                                                                this.database,
                                                                "table",
                                                                DatabaseQueue.class,
                                                                this.table),
                                                        "lockForUpdate",
                                                        DatabaseQueue.class),
                                                "where",
                                                DatabaseQueue.class,
                                                "queue",
                                                this.getQueue(env, queue)),
                                        "where",
                                        DatabaseQueue.class,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Queue",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "query")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object _closureThisVar = this.getClosureThisVar();
                                                Object query = assignParameter(args, 0, false);
                                                DatabaseQueue.this.isAvailable(env, query);
                                                DatabaseQueue.this.isReservedButExpired(env, query);
                                                return null;
                                            }
                                        }),
                                "orderBy",
                                DatabaseQueue.class,
                                "id",
                                "asc"),
                        "first",
                        DatabaseQueue.class);
        return ZVal.assign(
                ZVal.isTrue(job) ? new DatabaseJobRecord(env, toObjectR(job)) : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    protected Object isAvailable(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Queue/DatabaseQueue.php");
        Object query = assignParameter(args, 0, false);
        env.callMethod(
                query,
                "where",
                DatabaseQueue.class,
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Queue", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "query")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object query = assignParameter(args, 0, false);
                        env.callMethod(
                                env.callMethod(
                                        query, "whereNull", DatabaseQueue.class, "reserved_at"),
                                "where",
                                DatabaseQueue.class,
                                "available_at",
                                "<=",
                                env.callMethod(
                                        _closureThisVar, "currentTime", DatabaseQueue.class));
                        return null;
                    }
                });
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    protected Object isReservedButExpired(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Queue/DatabaseQueue.php");
        Object query = assignParameter(args, 0, false);
        Object expiration = null;
        expiration =
                env.callMethod(
                        env.callMethod(
                                Carbon.runtimeStaticObject.now(env),
                                "subSeconds",
                                DatabaseQueue.class,
                                this.retryAfter),
                        "getTimestamp",
                        DatabaseQueue.class);
        env.callMethod(
                query,
                "orWhere",
                DatabaseQueue.class,
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Queue", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "query")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object query = assignParameter(args, 0, false);
                        Object expiration = null;
                        expiration = this.contextReferences.getCapturedValue("expiration");
                        env.callMethod(
                                query,
                                "where",
                                DatabaseQueue.class,
                                "reserved_at",
                                "<=",
                                expiration);
                        return null;
                    }
                }.use("expiration", expiration));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    @ConvertedParameter(index = 1, name = "job")
    protected Object marshalJob(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        Object job = assignParameter(args, 1, false);
        job = this.markJobAsReserved(env, job);
        return ZVal.assign(
                new DatabaseJob(
                        env,
                        toObjectR(this).accessProp(this, env).name("container").value(),
                        this,
                        job,
                        toObjectR(this).accessProp(this, env).name("connectionName").value(),
                        queue));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    protected Object markJobAsReserved(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(
                        env.callMethod(this.database, "table", DatabaseQueue.class, this.table),
                        "where",
                        DatabaseQueue.class,
                        "id",
                        toObjectR(job).accessProp(this, env).name("id").value()),
                "update",
                DatabaseQueue.class,
                ZVal.newArray(
                        new ZPair("reserved_at", env.callMethod(job, "touch", DatabaseQueue.class)),
                        new ZPair(
                                "attempts",
                                env.callMethod(job, "increment", DatabaseQueue.class))));
        return ZVal.assign(job);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    @ConvertedParameter(index = 1, name = "id")
    public Object deleteReserved(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Queue/DatabaseQueue.php");
        Object queue = assignParameter(args, 0, false);
        Object id = assignParameter(args, 1, false);
        env.callMethod(
                this.database,
                "transaction",
                DatabaseQueue.class,
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Queue", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object id = null;
                        id = this.contextReferences.getCapturedValue("id");
                        if (ZVal.isTrue(
                                env.callMethod(
                                        env.callMethod(
                                                env.callMethod(
                                                        DatabaseQueue.this.database,
                                                        "table",
                                                        DatabaseQueue.class,
                                                        DatabaseQueue.this.table),
                                                "lockForUpdate",
                                                DatabaseQueue.class),
                                        "find",
                                        DatabaseQueue.class,
                                        id))) {
                            env.callMethod(
                                    env.callMethod(
                                            env.callMethod(
                                                    DatabaseQueue.this.database,
                                                    "table",
                                                    DatabaseQueue.class,
                                                    DatabaseQueue.this.table),
                                            "where",
                                            DatabaseQueue.class,
                                            "id",
                                            id),
                                    "delete",
                                    DatabaseQueue.class);
                        }

                        return null;
                    }
                }.use("id", id));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    public Object getQueue(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = queue)
                        ? ternaryExpressionTemp
                        : this._pDefault);
    }

    @ConvertedMethod
    public Object getDatabase(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.database);
    }

    public static final Object CONST_class = "Illuminate\\Queue\\DatabaseQueue";

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
                    .setName("Illuminate\\Queue\\DatabaseQueue")
                    .setLookup(
                            DatabaseQueue.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "connectionName",
                            "container",
                            "database",
                            "default",
                            "retryAfter",
                            "table")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Queue/DatabaseQueue.php")
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
