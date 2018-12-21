package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Cache.classes.Store;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes.RedisTaggedCache;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes.TagSet;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes.TaggableStore;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes.RedisLock;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Cache/RedisStore.php

*/

public class RedisStore extends TaggableStore implements Store {

    public Object redis = null;

    public Object prefix = null;

    public Object connection = null;

    public RedisStore(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RedisStore.class) {
            this.__construct(env, args);
        }
    }

    public RedisStore(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "redis",
        typeHint = "Illuminate\\Contracts\\Redis\\Factory"
    )
    @ConvertedParameter(index = 1, name = "prefix")
    @ConvertedParameter(index = 2, name = "connection")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object redis = assignParameter(args, 0, false);
        Object prefix = assignParameter(args, 1, true);
        if (null == prefix) {
            prefix = "";
        }
        Object connection = assignParameter(args, 2, true);
        if (null == connection) {
            connection = "default";
        }
        this.redis = redis;
        this.setPrefix(env, prefix);
        this.setConnection(env, connection);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object get(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = null;
        value =
                env.callMethod(
                        this.connection(env),
                        "get",
                        RedisStore.class,
                        toStringR(this.prefix, env) + toStringR(key, env));
        return ZVal.assign(
                !function_is_null.f.env(env).call(value).getBool()
                        ? this.unserialize(env, value)
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys", typeHint = "array")
    public Object many(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Cache")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Cache/RedisStore.php");
        ReferenceContainer keys = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object values = null;
        Object index = null;
        ReferenceContainer results = new BasicReferenceContainer(null);
        Object value = null;
        results.setObject(ZVal.newArray());
        values =
                env.callMethod(
                        this.connection(env),
                        "mget",
                        RedisStore.class,
                        function_array_map
                                .f
                                .env(env)
                                .call(
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Cache",
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
                                                        toStringR(RedisStore.this.prefix, env)
                                                                + toStringR(key, env));
                                            }
                                        },
                                        keys.getObject())
                                .value());
        for (ZPair zpairResult207 : ZVal.getIterable(values, env, false)) {
            index = ZVal.assign(zpairResult207.getKey());
            value = ZVal.assign(zpairResult207.getValue());
            results.arrayAccess(env, keys.arrayGet(env, index))
                    .set(
                            !function_is_null.f.env(env).call(value).getBool()
                                    ? this.unserialize(env, value)
                                    : ZVal.getNull());
        }

        return ZVal.assign(results.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "minutes")
    public Object put(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object minutes = assignParameter(args, 2, false);
        env.callMethod(
                this.connection(env),
                "setex",
                RedisStore.class,
                toStringR(this.prefix, env) + toStringR(key, env),
                ZVal.toLong(
                        NamespaceGlobal.max.env(env).call(1, ZVal.multiply(minutes, 60)).value()),
                this.serialize(env, value));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values", typeHint = "array")
    @ConvertedParameter(index = 1, name = "minutes")
    public Object putMany(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        Object minutes = assignParameter(args, 1, false);
        Object value = null;
        Object key = null;
        env.callMethod(this.connection(env), "multi", RedisStore.class);
        for (ZPair zpairResult208 : ZVal.getIterable(values, env, false)) {
            key = ZVal.assign(zpairResult208.getKey());
            value = ZVal.assign(zpairResult208.getValue());
            this.put(env, key, value, minutes);
        }

        env.callMethod(this.connection(env), "exec", RedisStore.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "minutes")
    public Object add(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object minutes = assignParameter(args, 2, false);
        Object lua = null;
        lua =
                "return redis.call('exists',KEYS[1])<1 and redis.call('setex',KEYS[1],ARGV[2],ARGV[1])";
        return ZVal.assign(
                ZVal.toBool(
                        env.callMethod(
                                this.connection(env),
                                "eval",
                                RedisStore.class,
                                lua,
                                1,
                                toStringR(this.prefix, env) + toStringR(key, env),
                                this.serialize(env, value),
                                ZVal.toLong(
                                        NamespaceGlobal.max
                                                .env(env)
                                                .call(1, ZVal.multiply(minutes, 60))
                                                .value()))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object increment(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(
                env.callMethod(
                        this.connection(env),
                        "incrby",
                        RedisStore.class,
                        toStringR(this.prefix, env) + toStringR(key, env),
                        value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object decrement(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(
                env.callMethod(
                        this.connection(env),
                        "decrby",
                        RedisStore.class,
                        toStringR(this.prefix, env) + toStringR(key, env),
                        value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object forever(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        env.callMethod(
                this.connection(env),
                "set",
                RedisStore.class,
                toStringR(this.prefix, env) + toStringR(key, env),
                this.serialize(env, value));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "seconds",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object lock(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object seconds = assignParameter(args, 1, true);
        if (null == seconds) {
            seconds = 0;
        }
        return ZVal.assign(
                new RedisLock(
                        env,
                        this.connection(env),
                        toStringR(this.prefix, env) + toStringR(name, env),
                        seconds));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object forget(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                        env.callMethod(
                                this.connection(env),
                                "del",
                                RedisStore.class,
                                toStringR(this.prefix, env) + toStringR(key, env))));
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        env.callMethod(this.connection(env), "flushdb", RedisStore.class);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "names")
    public Object tags(RuntimeEnv env, Object... args) {
        Object names = assignParameter(args, 0, false);
        return ZVal.assign(
                new RedisTaggedCache(
                        env,
                        this,
                        new TagSet(
                                env,
                                this,
                                function_is_array.f.env(env).call(names).getBool()
                                        ? names
                                        : function_func_get_args
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithInfo(args, this))
                                                .call()
                                                .value())));
    }

    @ConvertedMethod
    public Object connection(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this.redis, "connection", RedisStore.class, this.connection));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    public Object setConnection(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        this.connection = connection;
        return null;
    }

    @ConvertedMethod
    public Object getRedis(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.redis);
    }

    @ConvertedMethod
    public Object getPrefix(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.prefix);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    public Object setPrefix(RuntimeEnv env, Object... args) {
        Object prefix = assignParameter(args, 0, false);
        this.prefix = !ZVal.isEmpty(prefix) ? toStringR(prefix, env) + ":" : "";
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object serialize(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                function_is_numeric.f.env(env).call(value).getBool()
                        ? value
                        : function_serialize.f.env(env).call(value).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object unserialize(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                function_is_numeric.f.env(env).call(value).getBool()
                        ? value
                        : function_unserialize.f.env(env).call(value).value());
    }

    public static final Object CONST_class = "Illuminate\\Cache\\RedisStore";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends TaggableStore.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Cache\\RedisStore")
                    .setLookup(
                            RedisStore.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("connection", "prefix", "redis")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Cache/RedisStore.php")
                    .addInterface("Illuminate\\Contracts\\Cache\\Store")
                    .addExtendsClass("Illuminate\\Cache\\TaggableStore")
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
