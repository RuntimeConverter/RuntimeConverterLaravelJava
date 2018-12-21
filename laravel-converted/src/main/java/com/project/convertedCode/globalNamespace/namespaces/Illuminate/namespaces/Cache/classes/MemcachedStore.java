package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Cache.classes.Store;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeClasses.date.DateInterval;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes.TaggableStore;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_combine;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes.MemcachedLock;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Cache.classes.LockProvider;
import com.runtimeconverter.runtime.nativeClasses.memcached.Memcached;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Cache/MemcachedStore.php

*/

public class MemcachedStore extends TaggableStore implements LockProvider, Store {

    public Object memcached = null;

    public Object prefix = null;

    public Object onVersionThree = null;

    public MemcachedStore(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MemcachedStore.class) {
            this.__construct(env, args);
        }
    }

    public MemcachedStore(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "memcached")
    @ConvertedParameter(index = 1, name = "prefix")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object memcached = assignParameter(args, 0, false);
        Object prefix = assignParameter(args, 1, true);
        if (null == prefix) {
            prefix = "";
        }
        this.setPrefix(env, prefix);
        this.memcached = memcached;
        this.onVersionThree =
                ZVal.equalityCheck(
                        env.callMethod(
                                new ReflectionMethod(env, "Memcached", "getMulti"),
                                "getNumberOfParameters",
                                MemcachedStore.class),
                        2);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object get(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = null;
        value =
                env.callMethod(
                        this.memcached,
                        "get",
                        MemcachedStore.class,
                        toStringR(this.prefix, env) + toStringR(key, env));
        if (ZVal.equalityCheck(
                env.callMethod(this.memcached, "getResultCode", MemcachedStore.class), 0)) {
            return ZVal.assign(value);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys", typeHint = "array")
    public Object many(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Cache")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Cache/MemcachedStore.php");
        Object keys = assignParameter(args, 0, false);
        Object _null = null;
        Object prefixedKeys = null;
        Object values = null;
        prefixedKeys =
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
                                                toStringR(MemcachedStore.this.prefix, env)
                                                        + toStringR(key, env));
                                    }
                                },
                                keys)
                        .value();
        if (ZVal.isTrue(this.onVersionThree)) {
            values =
                    env.callMethod(
                            this.memcached, "getMulti", MemcachedStore.class, prefixedKeys, 1);

        } else {
            _null = ZVal.getNull();
            values =
                    env.callMethod(
                            this.memcached,
                            "getMulti",
                            MemcachedStore.class,
                            prefixedKeys,
                            _null,
                            1);
        }

        if (ZVal.notEqualityCheck(
                env.callMethod(this.memcached, "getResultCode", MemcachedStore.class), 0)) {
            return ZVal.assign(
                    NamespaceGlobal.array_fill_keys.env(env).call(keys, ZVal.getNull()).value());
        }

        return ZVal.assign(function_array_combine.f.env(env).call(keys, values).value());
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
                this.memcached,
                "set",
                MemcachedStore.class,
                toStringR(this.prefix, env) + toStringR(key, env),
                value,
                this.toTimestamp(env, minutes));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values", typeHint = "array")
    @ConvertedParameter(index = 1, name = "minutes")
    public Object putMany(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        Object minutes = assignParameter(args, 1, false);
        ReferenceContainer prefixedValues = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        prefixedValues.setObject(ZVal.newArray());
        for (ZPair zpairResult206 : ZVal.getIterable(values, env, false)) {
            key = ZVal.assign(zpairResult206.getKey());
            value = ZVal.assign(zpairResult206.getValue());
            prefixedValues
                    .arrayAccess(env, toStringR(this.prefix, env) + toStringR(key, env))
                    .set(value);
        }

        env.callMethod(
                this.memcached,
                "setMulti",
                MemcachedStore.class,
                prefixedValues.getObject(),
                this.toTimestamp(env, minutes));
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
        return ZVal.assign(
                env.callMethod(
                        this.memcached,
                        new RuntimeArgsWithReferences(),
                        "add",
                        MemcachedStore.class,
                        toStringR(this.prefix, env) + toStringR(key, env),
                        value,
                        this.toTimestamp(env, minutes)));
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
                        this.memcached,
                        "increment",
                        MemcachedStore.class,
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
                        this.memcached,
                        "decrement",
                        MemcachedStore.class,
                        toStringR(this.prefix, env) + toStringR(key, env),
                        value));
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
                new MemcachedLock(
                        env,
                        this.memcached,
                        toStringR(this.prefix, env) + toStringR(name, env),
                        seconds));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object forget(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this.memcached,
                        "delete",
                        MemcachedStore.class,
                        toStringR(this.prefix, env) + toStringR(key, env)));
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.memcached, "flush", MemcachedStore.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "minutes")
    protected Object toTimestamp(RuntimeEnv env, Object... args) {
        Object minutes = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isGreaterThan(minutes, '>', 0)
                        ? this.availableAt(env, ZVal.multiply(minutes, 60))
                        : 0);
    }

    @ConvertedMethod
    public Object getMemcached(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.memcached);
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
    @ConvertedParameter(index = 0, name = "delay")
    protected Object secondsUntil(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, false);
        delay = this.parseDateInterval(env, delay);
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        delay, DateTimeInterface.class, "DateTimeInterface"))
                        ? NamespaceGlobal.max
                                .env(env)
                                .call(
                                        0,
                                        ZVal.subtract(
                                                env.callMethod(
                                                        delay,
                                                        "getTimestamp",
                                                        MemcachedStore.class),
                                                this.currentTime(env)))
                                .value()
                        : ZVal.toLong(delay));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay", defaultValue = "0", defaultValueType = "number")
    protected Object availableAt(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, true);
        if (null == delay) {
            delay = 0;
        }
        delay = this.parseDateInterval(env, delay);
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        delay, DateTimeInterface.class, "DateTimeInterface"))
                        ? env.callMethod(delay, "getTimestamp", MemcachedStore.class)
                        : env.callMethod(
                                env.callMethod(
                                        Carbon.runtimeStaticObject.now(env),
                                        "addSeconds",
                                        MemcachedStore.class,
                                        delay),
                                "getTimestamp",
                                MemcachedStore.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay")
    protected Object parseDateInterval(RuntimeEnv env, Object... args) {
        ReferenceContainer delay = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.isTrue(
                ZVal.checkInstanceType(delay.getObject(), DateInterval.class, "DateInterval"))) {
            delay.setObject(
                    env.callMethod(
                            Carbon.runtimeStaticObject.now(env),
                            new RuntimeArgsWithReferences().add(0, delay),
                            "add",
                            MemcachedStore.class,
                            delay.getObject()));
        }

        return ZVal.assign(delay.getObject());
    }

    @ConvertedMethod
    protected Object currentTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        Carbon.runtimeStaticObject.now(env), "getTimestamp", MemcachedStore.class));
    }

    public static final Object CONST_class = "Illuminate\\Cache\\MemcachedStore";

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
                    .setName("Illuminate\\Cache\\MemcachedStore")
                    .setLookup(
                            MemcachedStore.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("memcached", "onVersionThree", "prefix")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Cache/MemcachedStore.php")
                    .addInterface("Illuminate\\Contracts\\Cache\\LockProvider")
                    .addInterface("Illuminate\\Contracts\\Cache\\Store")
                    .addTrait("Illuminate\\Support\\InteractsWithTime")
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
