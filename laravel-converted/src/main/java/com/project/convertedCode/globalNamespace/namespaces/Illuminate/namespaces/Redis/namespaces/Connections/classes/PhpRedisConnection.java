package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Redis.namespaces.Connections.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Redis/Connections/PhpRedisConnection.php

*/

public class PhpRedisConnection
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Redis
                .namespaces
                .Connections
                .classes
                .Connection
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Contracts
                .namespaces
                .Redis
                .classes
                .Connection {

    public PhpRedisConnection(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PhpRedisConnection.class) {
            this.__construct(env, args);
        }
    }

    public PhpRedisConnection(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "client")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object client = assignParameter(args, 0, false);
        toObjectR(this).accessProp(this, env).name("client").set(client);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object get(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object result = null;
        result =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("client").value(),
                        "get",
                        PhpRedisConnection.class,
                        key);
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(result, "!==", false) ? result : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys", typeHint = "array")
    public Object mget(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Redis/Connections")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Redis/Connections/PhpRedisConnection.php");
        Object keys = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Redis\\Connections",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "value")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object value = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                ZVal.strictNotEqualityCheck(value, "!==", false)
                                                        ? value
                                                        : ZVal.getNull());
                                    }
                                },
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("client")
                                                .value(),
                                        "mget",
                                        PhpRedisConnection.class,
                                        keys))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys")
    public Object exists(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Redis/Connections")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Redis/Connections/PhpRedisConnection.php");
        Object keys = assignParameterVarArgs(args, 0);
        keys =
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(keys).value(),
                                "map",
                                PhpRedisConnection.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Redis\\Connections",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "key")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object key = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                PhpRedisConnection.this.applyPrefix(env, key));
                                    }
                                }),
                        "all",
                        PhpRedisConnection.class);
        return ZVal.assign(
                this.executeRaw(
                        env,
                        function_array_merge
                                .f
                                .env(env)
                                .call(ZVal.arrayFromList("exists"), keys)
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(
        index = 2,
        name = "expireResolution",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "expireTTL",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "flag",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object set(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object expireResolution = assignParameter(args, 2, true);
        if (null == expireResolution) {
            expireResolution = ZVal.getNull();
        }
        Object expireTTL = assignParameter(args, 3, true);
        if (null == expireTTL) {
            expireTTL = ZVal.getNull();
        }
        Object flag = assignParameter(args, 4, true);
        if (null == flag) {
            flag = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        this,
                        "command",
                        PhpRedisConnection.class,
                        "set",
                        ZVal.newArray(
                                new ZPair(0, key),
                                new ZPair(1, value),
                                new ZPair(
                                        2,
                                        ZVal.isTrue(expireResolution)
                                                ? ZVal.newArray(
                                                        new ZPair(0, flag),
                                                        new ZPair(expireResolution, expireTTL))
                                                : ZVal.getNull()))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object setnx(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.toLong(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("client").value(),
                                "setnx",
                                PhpRedisConnection.class,
                                key,
                                value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "dictionary")
    public Object hmget(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        ReferenceContainer dictionary =
                new BasicReferenceContainer(assignParameterVarArgs(args, 1));
        if (ZVal.equalityCheck(function_count.f.env(env).call(dictionary.getObject()).value(), 1)) {
            dictionary.setObject(ZVal.assign(dictionary.arrayGet(env, 0)));
        }

        return ZVal.assign(
                function_array_values
                        .f
                        .env(env)
                        .call(
                                env.callMethod(
                                        this,
                                        "command",
                                        PhpRedisConnection.class,
                                        "hmget",
                                        ZVal.newArray(
                                                new ZPair(0, key),
                                                new ZPair(1, dictionary.getObject()))))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "dictionary")
    public Object hmset(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        ReferenceContainer dictionary =
                new BasicReferenceContainer(assignParameterVarArgs(args, 1));
        Object input = null;
        if (ZVal.equalityCheck(function_count.f.env(env).call(dictionary.getObject()).value(), 1)) {
            dictionary.setObject(ZVal.assign(dictionary.arrayGet(env, 0)));

        } else {
            input = collect.f.env(env).call(dictionary.getObject()).value();
            dictionary.setObject(
                    env.callMethod(
                            env.callMethod(
                                    env.callMethod(input, "nth", PhpRedisConnection.class, 2),
                                    "combine",
                                    PhpRedisConnection.class,
                                    env.callMethod(input, "nth", PhpRedisConnection.class, 2, 1)),
                            "toArray",
                            PhpRedisConnection.class));
        }

        return ZVal.assign(
                env.callMethod(
                        this,
                        "command",
                        PhpRedisConnection.class,
                        "hmset",
                        ZVal.newArray(new ZPair(0, key), new ZPair(1, dictionary.getObject()))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "hash")
    @ConvertedParameter(index = 1, name = "key")
    @ConvertedParameter(index = 2, name = "value")
    public Object hsetnx(RuntimeEnv env, Object... args) {
        Object hash = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, false);
        return ZVal.assign(
                ZVal.toLong(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("client").value(),
                                "hSetNx",
                                PhpRedisConnection.class,
                                hash,
                                key,
                                value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "count")
    @ConvertedParameter(index = 2, name = "value")
    public Object lrem(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object count = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "command",
                        PhpRedisConnection.class,
                        "lrem",
                        ZVal.newArray(
                                new ZPair(0, key), new ZPair(1, value), new ZPair(2, count))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "count",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object spop(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object count = assignParameter(args, 1, true);
        if (null == count) {
            count = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        this,
                        "command",
                        PhpRedisConnection.class,
                        "spop",
                        ZVal.newArray(new ZPair(0, key))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "dictionary")
    public Object zadd(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        ReferenceContainer dictionary =
                new BasicReferenceContainer(assignParameterVarArgs(args, 1));
        Object score = null;
        Object member = null;
        if (function_is_array
                .f
                .env(env)
                .call(function_end.f.env(env).call(dictionary.getObject()).value())
                .getBool()) {
            for (ZPair zpairResult513 :
                    ZVal.getIterable(
                            function_array_pop.f.env(env).call(dictionary.getObject()).value(),
                            env,
                            false)) {
                member = ZVal.assign(zpairResult513.getKey());
                score = ZVal.assign(zpairResult513.getValue());
                dictionary.arrayAppend(env).set(score);
                dictionary.arrayAppend(env).set(member);
            }
        }

        key = this.applyPrefix(env, key);
        return ZVal.assign(
                this.executeRaw(
                        env,
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        ZVal.newArray(new ZPair(0, "zadd"), new ZPair(1, key)),
                                        dictionary.getObject())
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "min")
    @ConvertedParameter(index = 2, name = "max")
    @ConvertedParameter(index = 3, name = "options", defaultValue = "", defaultValueType = "array")
    public Object zrangebyscore(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object min = assignParameter(args, 1, false);
        Object max = assignParameter(args, 2, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 3, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        if (arrayActionR(ArrayAction.ISSET, options, env, "limit")) {
            options.arrayAccess(env, "limit")
                    .set(
                            ZVal.newArray(
                                    new ZPair(0, options.arrayGet(env, "limit", "offset")),
                                    new ZPair(1, options.arrayGet(env, "limit", "count"))));
        }

        return ZVal.assign(
                env.callMethod(
                        this,
                        "command",
                        PhpRedisConnection.class,
                        "zRangeByScore",
                        ZVal.newArray(
                                new ZPair(0, key),
                                new ZPair(1, min),
                                new ZPair(2, max),
                                new ZPair(3, options.getObject()))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "min")
    @ConvertedParameter(index = 2, name = "max")
    @ConvertedParameter(index = 3, name = "options", defaultValue = "", defaultValueType = "array")
    public Object zrevrangebyscore(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object min = assignParameter(args, 1, false);
        Object max = assignParameter(args, 2, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 3, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        if (arrayActionR(ArrayAction.ISSET, options, env, "limit")) {
            options.arrayAccess(env, "limit")
                    .set(
                            ZVal.newArray(
                                    new ZPair(0, options.arrayGet(env, "limit", "offset")),
                                    new ZPair(1, options.arrayGet(env, "limit", "count"))));
        }

        return ZVal.assign(
                env.callMethod(
                        this,
                        "command",
                        PhpRedisConnection.class,
                        "zRevRangeByScore",
                        ZVal.newArray(
                                new ZPair(0, key),
                                new ZPair(1, min),
                                new ZPair(2, max),
                                new ZPair(3, options.getObject()))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "output")
    @ConvertedParameter(index = 1, name = "keys")
    @ConvertedParameter(index = 2, name = "options", defaultValue = "", defaultValueType = "array")
    public Object zinterstore(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        Object keys = assignParameter(args, 1, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                env.callMethod(
                        this,
                        "zInter",
                        PhpRedisConnection.class,
                        output,
                        keys,
                        ZVal.isDefined(ternaryExpressionTemp = options.arrayGet(env, "weights"))
                                ? ternaryExpressionTemp
                                : ZVal.getNull(),
                        ZVal.isDefined(ternaryExpressionTemp = options.arrayGet(env, "aggregate"))
                                ? ternaryExpressionTemp
                                : "sum"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "output")
    @ConvertedParameter(index = 1, name = "keys")
    @ConvertedParameter(index = 2, name = "options", defaultValue = "", defaultValueType = "array")
    public Object zunionstore(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        Object keys = assignParameter(args, 1, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                env.callMethod(
                        this,
                        "zUnion",
                        PhpRedisConnection.class,
                        output,
                        keys,
                        ZVal.isDefined(ternaryExpressionTemp = options.arrayGet(env, "weights"))
                                ? ternaryExpressionTemp
                                : ZVal.getNull(),
                        ZVal.isDefined(ternaryExpressionTemp = options.arrayGet(env, "aggregate"))
                                ? ternaryExpressionTemp
                                : "sum"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "callback",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object pipeline(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object pipeline = null;
        pipeline =
                env.callMethod(
                        env.callMethod(this, "client", PhpRedisConnection.class),
                        "pipeline",
                        PhpRedisConnection.class);
        return ZVal.assign(
                function_is_null.f.env(env).call(callback).getBool()
                        ? pipeline
                        : env.callMethod(
                                tap.f.env(env).call(pipeline, callback).value(),
                                "exec",
                                PhpRedisConnection.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "callback",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object transaction(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object transaction = null;
        transaction =
                env.callMethod(
                        env.callMethod(this, "client", PhpRedisConnection.class),
                        "multi",
                        PhpRedisConnection.class);
        return ZVal.assign(
                function_is_null.f.env(env).call(callback).getBool()
                        ? transaction
                        : env.callMethod(
                                tap.f.env(env).call(transaction, callback).value(),
                                "exec",
                                PhpRedisConnection.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "script")
    @ConvertedParameter(index = 1, name = "numkeys")
    @ConvertedParameter(index = 2, name = "arguments")
    public Object evalsha(RuntimeEnv env, Object... args) {
        Object script = assignParameter(args, 0, false);
        Object numkeys = assignParameter(args, 1, false);
        Object arguments = assignParameterVarArgs(args, 2);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "command",
                        PhpRedisConnection.class,
                        "evalsha",
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        env.callMethod(
                                                this,
                                                "script",
                                                PhpRedisConnection.class,
                                                "load",
                                                script)),
                                new ZPair(1, arguments),
                                new ZPair(2, numkeys))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "script")
    @ConvertedParameter(index = 1, name = "numberOfKeys")
    @ConvertedParameter(index = 2, name = "arguments")
    public Object eval(RuntimeEnv env, Object... args) {
        Object script = assignParameter(args, 0, false);
        Object numberOfKeys = assignParameter(args, 1, false);
        Object arguments = assignParameterVarArgs(args, 2);
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("client").value(),
                        "eval",
                        PhpRedisConnection.class,
                        script,
                        arguments,
                        numberOfKeys));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "channels")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    public Object subscribe(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Redis/Connections")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Redis/Connections/PhpRedisConnection.php");
        Object channels = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("client").value(),
                "subscribe",
                PhpRedisConnection.class,
                rToArrayCast(channels),
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Redis\\Connections",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "redis")
                    @ConvertedParameter(index = 1, name = "channel")
                    @ConvertedParameter(index = 2, name = "message")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object redis = assignParameter(args, 0, false);
                        ReferenceContainer channel =
                                new BasicReferenceContainer(assignParameter(args, 1, false));
                        ReferenceContainer message =
                                new BasicReferenceContainer(assignParameter(args, 2, false));
                        Object callback = null;
                        callback = this.contextReferences.getCapturedValue("callback");
                        env.callFunctionDynamic(
                                callback,
                                new RuntimeArgsWithReferences().add(0, message).add(1, channel),
                                message.getObject(),
                                channel.getObject());
                        return null;
                    }
                }.use("callback", callback));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "channels")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    public Object psubscribe(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Redis/Connections")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Redis/Connections/PhpRedisConnection.php");
        Object channels = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("client").value(),
                "psubscribe",
                PhpRedisConnection.class,
                rToArrayCast(channels),
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Redis\\Connections",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "redis")
                    @ConvertedParameter(index = 1, name = "pattern")
                    @ConvertedParameter(index = 2, name = "channel")
                    @ConvertedParameter(index = 3, name = "message")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object redis = assignParameter(args, 0, false);
                        Object pattern = assignParameter(args, 1, false);
                        ReferenceContainer channel =
                                new BasicReferenceContainer(assignParameter(args, 2, false));
                        ReferenceContainer message =
                                new BasicReferenceContainer(assignParameter(args, 3, false));
                        Object callback = null;
                        callback = this.contextReferences.getCapturedValue("callback");
                        env.callFunctionDynamic(
                                callback,
                                new RuntimeArgsWithReferences().add(0, message).add(1, channel),
                                message.getObject(),
                                channel.getObject());
                        return null;
                    }
                }.use("callback", callback));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "channels")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    @ConvertedParameter(index = 2, name = "method")
    public Object createSubscription(RuntimeEnv env, Object... args) {
        Object channels = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        Object method = assignParameter(args, 2, true);
        if (null == method) {
            method = "subscribe";
        }
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters", typeHint = "array")
    public Object executeRaw(RuntimeEnv env, Object... args) {
        Object parameters = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this, "command", PhpRedisConnection.class, "rawCommand", parameters));
    }

    @ConvertedMethod
    public Object disconnect(RuntimeEnv env, Object... args) {
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("client").value(),
                "close",
                PhpRedisConnection.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    private Object applyPrefix(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object prefix = null;
        prefix =
                ZVal.assign(
                        toStringR(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("client")
                                                .value(),
                                        "getOption",
                                        PhpRedisConnection.class,
                                        ClassConstantUtils.getConstantValueByClass(
                                                env,
                                                ZVal.resolveClassAlias(env, "Redis"),
                                                "OPT_PREFIX")),
                                env));
        return ZVal.assign(toStringR(prefix, env) + toStringR(key, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        method = NamespaceGlobal.strtolower.env(env).call(method).value();
        return ZVal.assign(super.__call(env, method, parameters));
    }

    public static final Object CONST_class = "Illuminate\\Redis\\Connections\\PhpRedisConnection";

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
                    .Redis
                    .namespaces
                    .Connections
                    .classes
                    .Connection
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Redis\\Connections\\PhpRedisConnection")
                    .setLookup(
                            PhpRedisConnection.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("client")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Redis/Connections/PhpRedisConnection.php")
                    .addInterface("Illuminate\\Contracts\\Redis\\Connection")
                    .addExtendsClass("Illuminate\\Redis\\Connections\\Connection")
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
