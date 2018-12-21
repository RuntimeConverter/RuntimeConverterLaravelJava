package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Cache.classes.Store;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes.TaggableStore;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Cache/ArrayStore.php

*/

public class ArrayStore extends TaggableStore implements Store {

    public Object storage = ZVal.newArray();

    public ArrayStore(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ArrayStore(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object get(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "storage", env)
                                                .arrayGet(env, key))
                        ? ternaryExpressionTemp
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "minutes")
    public Object put(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object minutes = assignParameter(args, 2, false);
        new ReferenceClassProperty(this, "storage", env).arrayAccess(env, key).set(value);
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
        new ReferenceClassProperty(this, "storage", env)
                .arrayAccess(env, key)
                .set(
                        !arrayActionR(
                                        ArrayAction.ISSET,
                                        new ReferenceClassProperty(this, "storage", env),
                                        env,
                                        key)
                                ? value
                                : ZVal.add(
                                        ZVal.toLong(
                                                new ReferenceClassProperty(this, "storage", env)
                                                        .arrayGet(env, key)),
                                        value));
        return ZVal.assign(new ReferenceClassProperty(this, "storage", env).arrayGet(env, key));
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
        return ZVal.assign(this.increment(env, key, ZVal.multiply(value, -1)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object forever(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        this.put(env, key, value, 0);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object forget(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        arrayActionR(ArrayAction.UNSET, new ReferenceClassProperty(this, "storage", env), env, key);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        this.storage = ZVal.newArray();
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object getPrefix(RuntimeEnv env, Object... args) {
        return "";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys", typeHint = "array")
    public Object many(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, false);
        ReferenceContainer _pReturn = new BasicReferenceContainer(null);
        Object key = null;
        _pReturn.setObject(ZVal.newArray());
        for (ZPair zpairResult2269 : ZVal.getIterable(keys, env, true)) {
            key = ZVal.assign(zpairResult2269.getValue());
            _pReturn.arrayAccess(env, key).set(this.get(env, key));
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
        for (ZPair zpairResult2270 : ZVal.getIterable(values, env, false)) {
            key = ZVal.assign(zpairResult2270.getKey());
            value = ZVal.assign(zpairResult2270.getValue());
            this.put(env, key, value, minutes);
        }

        return null;
    }

    public static final Object CONST_class = "Illuminate\\Cache\\ArrayStore";

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
                    .setName("Illuminate\\Cache\\ArrayStore")
                    .setLookup(
                            ArrayStore.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("storage")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Cache/ArrayStore.php")
                    .addInterface("Illuminate\\Contracts\\Cache\\Store")
                    .addTrait("Illuminate\\Cache\\RetrievesMultipleKeys")
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
