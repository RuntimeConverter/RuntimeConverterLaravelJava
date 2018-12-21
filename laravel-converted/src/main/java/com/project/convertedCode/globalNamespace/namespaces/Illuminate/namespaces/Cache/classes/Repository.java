package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.namespaces.Events.classes.CacheMissed;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeClasses.date.DateInterval;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.namespaces.Events.classes.CacheHit;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.namespaces.Events.classes.KeyForgotten;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.namespaces.Events.classes.KeyWritten;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Cache/Repository.php

*/

public class Repository extends RuntimeClassBase
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
                        .Repository,
                ArrayAccess {

    public Object store = null;

    public Object events = null;

    public Object _pDefault = 60;

    public Repository(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Repository.class) {
            this.__construct(env, args);
        }
    }

    public Repository(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "store", typeHint = "Illuminate\\Contracts\\Cache\\Store")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object store = assignParameter(args, 0, false);
        this.store = store;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object has(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(!function_is_null.f.env(env).call(this.get(env, key)).getBool());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object get(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        Object value = null;
        if (function_is_array.f.env(env).call(key).getBool()) {
            return ZVal.assign(this.many(env, key));
        }

        value = env.callMethod(this.store, "get", Repository.class, this.itemKey(env, key));
        if (function_is_null.f.env(env).call(value).getBool()) {
            this.event(env, new CacheMissed(env, key));
            value =
                    com.project
                            .convertedCode
                            .globalNamespace
                            .functions
                            .value
                            .f
                            .env(env)
                            .call(_pDefault)
                            .value();

        } else {
            this.event(env, new CacheHit(env, key, value));
        }

        return ZVal.assign(value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys", typeHint = "array")
    public Object many(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Cache")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Cache/Repository.php");
        Object keys = assignParameter(args, 0, false);
        Object values = null;
        values =
                env.callMethod(
                        this.store,
                        "many",
                        Repository.class,
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                collect.f.env(env).call(keys).value(),
                                                "map",
                                                Repository.class,
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Illuminate\\Cache",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "value")
                                                    @ConvertedParameter(index = 1, name = "key")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object value =
                                                                assignParameter(args, 0, false);
                                                        Object key =
                                                                assignParameter(args, 1, false);
                                                        return ZVal.assign(
                                                                function_is_string
                                                                                .f
                                                                                .env(env)
                                                                                .call(key)
                                                                                .getBool()
                                                                        ? key
                                                                        : value);
                                                    }
                                                }),
                                        "values",
                                        Repository.class),
                                "all",
                                Repository.class));
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(values).value(),
                                "map",
                                Repository.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Cache",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "value")
                                    @ConvertedParameter(index = 1, name = "key")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object value = assignParameter(args, 0, false);
                                        Object key = assignParameter(args, 1, false);
                                        Object keys = null;
                                        keys = this.contextReferences.getCapturedValue("keys");
                                        return ZVal.assign(
                                                Repository.this.handleManyResult(
                                                        env, keys, key, value));
                                    }
                                }.use("keys", keys)),
                        "all",
                        Repository.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getMultiple(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, false);
        ReferenceContainer _pDefault = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == _pDefault.getObject()) {
            _pDefault.setObject(ZVal.getNull());
        }
        Object key = null;
        if (function_is_null.f.env(env).call(_pDefault.getObject()).getBool()) {
            return ZVal.assign(this.many(env, keys));
        }

        for (ZPair zpairResult212 : ZVal.getIterable(keys, env, true)) {
            key = ZVal.assign(zpairResult212.getValue());
            if (!arrayActionR(ArrayAction.ISSET, _pDefault, env, key)) {
                _pDefault.arrayAccess(env, key).set(ZVal.getNull());
            }
        }

        return ZVal.assign(this.many(env, _pDefault.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys")
    @ConvertedParameter(index = 1, name = "key")
    @ConvertedParameter(index = 2, name = "value")
    protected Object handleManyResult(RuntimeEnv env, Object... args) {
        ReferenceContainer keys = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object key = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, false);
        if (function_is_null.f.env(env).call(value).getBool()) {
            this.event(env, new CacheMissed(env, key));
            return ZVal.assign(
                    arrayActionR(ArrayAction.ISSET, keys, env, key)
                            ? com.project
                                    .convertedCode
                                    .globalNamespace
                                    .functions
                                    .value
                                    .f
                                    .env(env)
                                    .call(keys.arrayGet(env, key))
                                    .value()
                            : ZVal.getNull());
        }

        this.event(env, new CacheHit(env, key, value));
        return ZVal.assign(value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object pull(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Cache")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Cache/Repository.php");
        Object key = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                this.get(env, key, _pDefault),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Cache",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "value")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object value = assignParameter(args, 0, false);
                                        Object key = null;
                                        key = this.contextReferences.getCapturedValue("key");
                                        Repository.this.forget(env, key);
                                        return null;
                                    }
                                }.use("key", key))
                        .value());
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
        if (function_is_array.f.env(env).call(key).getBool()) {
            return ZVal.assign(this.putMany(env, key, value));
        }

        if (!function_is_null.f.env(env).call(minutes = this.getMinutes(env, minutes)).getBool()) {
            env.callMethod(
                    this.store, "put", Repository.class, this.itemKey(env, key), value, minutes);
            this.event(env, new KeyWritten(env, key, value, minutes));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(
        index = 2,
        name = "ttl",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object set(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object ttl = assignParameter(args, 2, true);
        if (null == ttl) {
            ttl = ZVal.getNull();
        }
        this.put(env, key, value, ttl);
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
        if (!function_is_null.f.env(env).call(minutes = this.getMinutes(env, minutes)).getBool()) {
            env.callMethod(this.store, "putMany", Repository.class, values, minutes);
            for (ZPair zpairResult213 : ZVal.getIterable(values, env, false)) {
                key = ZVal.assign(zpairResult213.getKey());
                value = ZVal.assign(zpairResult213.getValue());
                this.event(env, new KeyWritten(env, key, value, minutes));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values")
    @ConvertedParameter(
        index = 1,
        name = "ttl",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setMultiple(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        Object ttl = assignParameter(args, 1, true);
        if (null == ttl) {
            ttl = ZVal.getNull();
        }
        this.putMany(env, values, ttl);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "minutes")
    public Object add(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object minutes = assignParameter(args, 2, false);
        if (function_is_null.f.env(env).call(minutes = this.getMinutes(env, minutes)).getBool()) {
            return ZVal.assign(false);
        }

        if (function_method_exists.f.env(env).call(this.store, "add").getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            this.store,
                            rLastRefArgs =
                                    new RuntimeArgsWithReferences()
                                            .add(0, handleReturnReference(this.itemKey(env, key))),
                            "add",
                            Repository.class,
                            rLastRefArgs.get(0),
                            value,
                            minutes));
        }

        if (function_is_null.f.env(env).call(this.get(env, key)).getBool()) {
            this.put(env, key, value, minutes);
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
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
        return ZVal.assign(env.callMethod(this.store, "increment", Repository.class, key, value));
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
        return ZVal.assign(env.callMethod(this.store, "decrement", Repository.class, key, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object forever(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        env.callMethod(this.store, "forever", Repository.class, this.itemKey(env, key), value);
        this.event(env, new KeyWritten(env, key, value, 0));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "minutes")
    @ConvertedParameter(index = 2, name = "callback", typeHint = "Closure")
    public Object remember(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object minutes = assignParameter(args, 1, false);
        Object callback = assignParameter(args, 2, false);
        Object value = null;
        value = this.get(env, key);
        if (!function_is_null.f.env(env).call(value).getBool()) {
            return ZVal.assign(value);
        }

        this.put(
                env,
                key,
                value = env.callFunctionDynamic(callback, new RuntimeArgsWithReferences()).value(),
                minutes);
        return ZVal.assign(value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    public Object sear(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        return ZVal.assign(this.rememberForever(env, key, callback));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    public Object rememberForever(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        Object value = null;
        value = this.get(env, key);
        if (!function_is_null.f.env(env).call(value).getBool()) {
            return ZVal.assign(value);
        }

        this.forever(
                env,
                key,
                value = env.callFunctionDynamic(callback, new RuntimeArgsWithReferences()).value());
        return ZVal.assign(value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object forget(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Cache")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Cache/Repository.php");
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                env.callMethod(
                                        this.store,
                                        "forget",
                                        Repository.class,
                                        this.itemKey(env, key)),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Cache",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object key = null;
                                        key = this.contextReferences.getCapturedValue("key");
                                        Repository.this.event(env, new KeyForgotten(env, key));
                                        return null;
                                    }
                                }.use("key", key))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object delete(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(this.forget(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys")
    public Object deleteMultiple(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, false);
        Object key = null;
        for (ZPair zpairResult214 : ZVal.getIterable(keys, env, true)) {
            key = ZVal.assign(zpairResult214.getValue());
            this.forget(env, key);
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.store, "flush", Repository.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "names")
    public Object tags(RuntimeEnv env, Object... args) {
        Object names = assignParameter(args, 0, false);
        Object cache = null;
        if (!function_method_exists.f.env(env).call(this.store, "tags").getBool()) {
            throw ZVal.getException(
                    env,
                    new BadMethodCallException(env, "This cache store does not support tagging."));
        }

        cache = env.callMethod(this.store, "tags", Repository.class, names);
        if (!function_is_null.f.env(env).call(this.events).getBool()) {
            env.callMethod(cache, "setEventDispatcher", Repository.class, this.events);
        }

        return ZVal.assign(
                env.callMethod(cache, "setDefaultCacheTime", Repository.class, this._pDefault));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    protected Object itemKey(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(key);
    }

    @ConvertedMethod
    public Object getDefaultCacheTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._pDefault);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "minutes")
    public Object setDefaultCacheTime(RuntimeEnv env, Object... args) {
        Object minutes = assignParameter(args, 0, false);
        this._pDefault = minutes;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getStore(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.store);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    protected Object event(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        if (ZVal.isset(this.events)) {
            env.callMethod(this.events, "dispatch", Repository.class, event);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "events",
        typeHint = "Illuminate\\Contracts\\Events\\Dispatcher"
    )
    public Object setEventDispatcher(RuntimeEnv env, Object... args) {
        Object events = assignParameter(args, 0, false);
        this.events = events;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object offsetExists(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(this.has(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object offsetGet(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(this.get(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object offsetSet(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        this.put(env, key, value, this._pDefault);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object offsetUnset(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        this.forget(env, key);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "duration")
    protected Object getMinutes(RuntimeEnv env, Object... args) {
        Object duration = assignParameter(args, 0, false);
        duration = this.parseDateInterval(env, duration);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(duration, DateTimeInterface.class, "DateTimeInterface"))) {
            duration =
                    ZVal.divide(
                            env.callMethod(
                                    Carbon.runtimeStaticObject.now(env),
                                    "diffInSeconds",
                                    Repository.class,
                                    Carbon.runtimeStaticObject.createFromTimestamp(
                                            env,
                                            env.callMethod(
                                                    duration, "getTimestamp", Repository.class)),
                                    false),
                            60);
        }

        return ZVal.assign(
                ZVal.isGreaterThan(ZVal.toLong(ZVal.multiply(duration, 60)), '>', 0)
                        ? duration
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object parameters = assignParameter(args, 1, false);
        if (ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Repository.class)
                        .method("hasMacro")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, method))
                        .call(method.getObject())
                        .value())) {
            return ZVal.assign(
                    env.callMethod(
                            this, "macroCall", Repository.class, method.getObject(), parameters));
        }

        return ZVal.assign(
                env.callMethod(
                        this.store,
                        new RuntimeArgsWithReferences(),
                        toStringR(method.getObject(), env),
                        Repository.class,
                        PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters))));
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        this.store = ((RuntimeClassInterface) this.store).phpClone(env);
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
                                                        delay, "getTimestamp", Repository.class),
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
                        ? env.callMethod(delay, "getTimestamp", Repository.class)
                        : env.callMethod(
                                env.callMethod(
                                        Carbon.runtimeStaticObject.now(env),
                                        "addSeconds",
                                        Repository.class,
                                        delay),
                                "getTimestamp",
                                Repository.class));
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
                            Repository.class,
                            delay.getObject()));
        }

        return ZVal.assign(delay.getObject());
    }

    @ConvertedMethod
    protected Object currentTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        Carbon.runtimeStaticObject.now(env), "getTimestamp", Repository.class));
    }

    public static final Object CONST_class = "Illuminate\\Cache\\Repository";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(index = 1, name = "macro")
        public Object macro(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            Object macro = assignParameter(args, 1, false);
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Cache
                                    .classes
                                    .Repository
                                    .RequestStaticProperties
                                    .class,
                            "macros")
                    .arrayAccess(env, name)
                    .set(macro);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "mixin")
        public Object mixin(RuntimeEnv env, Object... args) {
            Object mixin = assignParameter(args, 0, false);
            Object method = null;
            Object methods = null;
            methods =
                    env.callMethod(
                            new ReflectionClass(env, mixin),
                            "getMethods",
                            Repository.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2277 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2277.getValue());
                env.callMethod(method, "setAccessible", Repository.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Repository.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", Repository.class, mixin))
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object hasMacro(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            return ZVal.assign(
                    arrayActionR(
                            ArrayAction.ISSET,
                            env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Cache
                                            .classes
                                            .Repository
                                            .RequestStaticProperties
                                            .class,
                                    "macros"),
                            env,
                            name));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method")
        @ConvertedParameter(index = 1, name = "parameters")
        public Object __callStatic(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            Object parameters = assignParameter(args, 1, false);
            if (!ZVal.isTrue(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Repository.class)
                            .method("hasMacro")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(method)
                            .value())) {
                throw ZVal.getException(
                        env,
                        new BadMethodCallException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Method %s::%s does not exist.",
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class"),
                                                method)
                                        .value()));
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Cache
                                                    .classes
                                                    .Repository
                                                    .RequestStaticProperties
                                                    .class,
                                            "macros")
                                    .arrayGet(env, method),
                            Closure.class,
                            "Closure"))) {
                return ZVal.assign(
                        function_call_user_func_array
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(
                                        Closure.runtimeStaticObject.bind(
                                                env,
                                                env.getRequestStaticPropertiesReference(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Illuminate
                                                                        .namespaces
                                                                        .Cache
                                                                        .classes
                                                                        .Repository
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "macros")
                                                        .arrayGet(env, method),
                                                ZVal.getNull(),
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class")),
                                        parameters)
                                .value());
            }

            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Illuminate
                                                            .namespaces
                                                            .Cache
                                                            .classes
                                                            .Repository
                                                            .RequestStaticProperties
                                                            .class,
                                                    "macros")
                                            .arrayGet(env, method),
                                    parameters)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object macros = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Cache\\Repository")
                    .setLookup(
                            Repository.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("default", "events", "store")
                    .setStaticPropertyNames("macros")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Cache/Repository.php")
                    .addInterface("Illuminate\\Contracts\\Cache\\Repository")
                    .addInterface("Psr\\SimpleCache\\CacheInterface")
                    .addInterface("ArrayAccess")
                    .addTrait("Illuminate\\Support\\InteractsWithTime")
                    .addTrait("Illuminate\\Support\\Traits\\Macroable")
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
