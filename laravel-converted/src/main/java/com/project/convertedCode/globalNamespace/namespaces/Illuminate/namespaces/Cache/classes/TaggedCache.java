package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes.Repository;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Cache/TaggedCache.php

*/

public class TaggedCache extends Repository {

    public Object tags = null;

    public TaggedCache(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TaggedCache.class) {
            this.__construct(env, args);
        }
    }

    public TaggedCache(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "store", typeHint = "Illuminate\\Contracts\\Cache\\Store")
    @ConvertedParameter(index = 1, name = "tags", typeHint = "Illuminate\\Cache\\TagSet")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object store = assignParameter(args, 0, false);
        Object tags = assignParameter(args, 1, false);
        super.__construct(env, store);
        this.tags = tags;
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
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("store").value(),
                "increment",
                TaggedCache.class,
                this.itemKey(env, key),
                value);
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
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("store").value(),
                "decrement",
                TaggedCache.class,
                this.itemKey(env, key),
                value);
        return null;
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        env.callMethod(this.tags, "reset", TaggedCache.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    protected Object itemKey(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(this.taggedItemKey(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object taggedItemKey(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                NamespaceGlobal.sha1
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        this.tags,
                                                        "getNamespace",
                                                        TaggedCache.class))
                                        .value(),
                                env)
                        + ":"
                        + toStringR(key, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    protected Object event(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        super.event(
                env,
                env.callMethod(
                        event,
                        "setTags",
                        TaggedCache.class,
                        env.callMethod(this.tags, "getNames", TaggedCache.class)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys", typeHint = "array")
    public Object many(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, false);
        ReferenceContainer _pReturn = new BasicReferenceContainer(null);
        Object key = null;
        _pReturn.setObject(ZVal.newArray());
        for (ZPair zpairResult2278 : ZVal.getIterable(keys, env, true)) {
            key = ZVal.assign(zpairResult2278.getValue());
            _pReturn.arrayAccess(env, key).set(env.callMethod(this, "get", TaggedCache.class, key));
        }

        return ZVal.assign(_pReturn.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values", typeHint = "array")
    @ConvertedParameter(index = 1, name = "minutes")
    public Object putMany(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        Object minutes = assignParameter(args, 1, false);
        Object value = null;
        Object key = null;
        for (ZPair zpairResult2279 : ZVal.getIterable(values, env, false)) {
            key = ZVal.assign(zpairResult2279.getKey());
            value = ZVal.assign(zpairResult2279.getValue());
            env.callMethod(this, "put", TaggedCache.class, key, value, minutes);
        }

        return null;
    }

    public static final Object CONST_class = "Illuminate\\Cache\\TaggedCache";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Repository.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Cache\\TaggedCache")
                    .setLookup(
                            TaggedCache.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("default", "events", "store", "tags")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Cache/TaggedCache.php")
                    .addInterface("Illuminate\\Contracts\\Cache\\Repository")
                    .addInterface("Psr\\SimpleCache\\CacheInterface")
                    .addInterface("ArrayAccess")
                    .addTrait("Illuminate\\Cache\\RetrievesMultipleKeys")
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
