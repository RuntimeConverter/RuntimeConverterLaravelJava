package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes.TaggedCache;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Cache/RedisTaggedCache.php

*/

public class RedisTaggedCache extends TaggedCache {

    public RedisTaggedCache(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RedisTaggedCache.class) {
            this.__construct(env, args);
        }
    }

    public RedisTaggedCache(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(
        index = 2,
        name = "minutes",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object put(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object minutes = assignParameter(args, 2, true);
        if (null == minutes) {
            minutes = ZVal.getNull();
        }
        this.pushStandardKeys(
                env,
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tags").value(),
                        "getNamespace",
                        RedisTaggedCache.class),
                key);
        super.put(env, key, value, minutes);
        return null;
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
        this.pushStandardKeys(
                env,
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tags").value(),
                        "getNamespace",
                        RedisTaggedCache.class),
                key);
        super.increment(env, key, value);
        return null;
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
        this.pushStandardKeys(
                env,
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tags").value(),
                        "getNamespace",
                        RedisTaggedCache.class),
                key);
        super.decrement(env, key, value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object forever(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        this.pushForeverKeys(
                env,
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tags").value(),
                        "getNamespace",
                        RedisTaggedCache.class),
                key);
        super.forever(env, key, value);
        return null;
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        this.deleteForeverKeys(env);
        this.deleteStandardKeys(env);
        super.flush(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(index = 1, name = "key")
    protected Object pushStandardKeys(RuntimeEnv env, Object... args) {
        Object namespace = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, false);
        this.pushKeys(env, namespace, key, CONST_REFERENCE_KEY_STANDARD);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(index = 1, name = "key")
    protected Object pushForeverKeys(RuntimeEnv env, Object... args) {
        Object namespace = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, false);
        this.pushKeys(env, namespace, key, CONST_REFERENCE_KEY_FOREVER);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(index = 1, name = "key")
    @ConvertedParameter(index = 2, name = "reference")
    protected Object pushKeys(RuntimeEnv env, Object... args) {
        Object namespace = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, false);
        Object reference = assignParameter(args, 2, false);
        Object fullKey = null;
        Object segment = null;
        fullKey =
                toStringR(
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("store").value(),
                                        "getPrefix",
                                        RedisTaggedCache.class),
                                env)
                        + toStringR(NamespaceGlobal.sha1.env(env).call(namespace).value(), env)
                        + ":"
                        + toStringR(key, env);
        for (ZPair zpairResult209 :
                ZVal.getIterable(
                        function_explode.f.env(env).call("|", namespace).value(), env, true)) {
            segment = ZVal.assign(zpairResult209.getValue());
            env.callMethod(
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("store").value(),
                            "connection",
                            RedisTaggedCache.class),
                    "sadd",
                    RedisTaggedCache.class,
                    this.referenceKey(env, segment, reference),
                    fullKey);
        }

        return null;
    }

    @ConvertedMethod
    protected Object deleteForeverKeys(RuntimeEnv env, Object... args) {
        this.deleteKeysByReference(env, CONST_REFERENCE_KEY_FOREVER);
        return null;
    }

    @ConvertedMethod
    protected Object deleteStandardKeys(RuntimeEnv env, Object... args) {
        this.deleteKeysByReference(env, CONST_REFERENCE_KEY_STANDARD);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reference")
    protected Object deleteKeysByReference(RuntimeEnv env, Object... args) {
        Object reference = assignParameter(args, 0, false);
        Object segment = null;
        for (ZPair zpairResult210 :
                ZVal.getIterable(
                        function_explode
                                .f
                                .env(env)
                                .call(
                                        "|",
                                        env.callMethod(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("tags")
                                                        .value(),
                                                "getNamespace",
                                                RedisTaggedCache.class))
                                .value(),
                        env,
                        true)) {
            segment = ZVal.assign(zpairResult210.getValue());
            this.deleteValues(env, segment = this.referenceKey(env, segment, reference));
            env.callMethod(
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("store").value(),
                            "connection",
                            RedisTaggedCache.class),
                    "del",
                    RedisTaggedCache.class,
                    segment);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "referenceKey")
    protected Object deleteValues(RuntimeEnv env, Object... args) {
        Object referenceKey = assignParameter(args, 0, false);
        Object valuesChunk = null;
        Object values = null;
        values =
                function_array_unique
                        .f
                        .env(env)
                        .call(
                                env.callMethod(
                                        env.callMethod(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("store")
                                                        .value(),
                                                "connection",
                                                RedisTaggedCache.class),
                                        "smembers",
                                        RedisTaggedCache.class,
                                        referenceKey))
                        .value();
        if (ZVal.isGreaterThan(function_count.f.env(env).call(values).value(), '>', 0)) {
            for (ZPair zpairResult211 :
                    ZVal.getIterable(
                            NamespaceGlobal.array_chunk.env(env).call(values, 1000).value(),
                            env,
                            true)) {
                valuesChunk = ZVal.assign(zpairResult211.getValue());
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                env.callMethod(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("store")
                                                                .value(),
                                                        "connection",
                                                        RedisTaggedCache.class)),
                                        new ZPair(1, "del")),
                                valuesChunk);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "segment")
    @ConvertedParameter(index = 1, name = "suffix")
    protected Object referenceKey(RuntimeEnv env, Object... args) {
        Object segment = assignParameter(args, 0, false);
        Object suffix = assignParameter(args, 1, false);
        return ZVal.assign(
                toStringR(
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("store").value(),
                                        "getPrefix",
                                        RedisTaggedCache.class),
                                env)
                        + toStringR(segment, env)
                        + ":"
                        + toStringR(suffix, env));
    }

    public static final Object CONST_REFERENCE_KEY_FOREVER = "forever_ref";

    public static final Object CONST_REFERENCE_KEY_STANDARD = "standard_ref";

    public static final Object CONST_class = "Illuminate\\Cache\\RedisTaggedCache";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends TaggedCache.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Cache\\RedisTaggedCache")
                    .setLookup(
                            RedisTaggedCache.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("default", "events", "store", "tags")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Cache/RedisTaggedCache.php")
                    .addInterface("Illuminate\\Contracts\\Cache\\Repository")
                    .addInterface("Psr\\SimpleCache\\CacheInterface")
                    .addInterface("ArrayAccess")
                    .addExtendsClass("Illuminate\\Cache\\TaggedCache")
                    .addExtendsClass("Illuminate\\Cache\\Repository")
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
