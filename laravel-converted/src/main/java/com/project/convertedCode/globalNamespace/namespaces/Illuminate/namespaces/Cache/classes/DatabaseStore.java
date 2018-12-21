package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Cache.classes.Store;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeClasses.date.DateInterval;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Cache/DatabaseStore.php

*/

public class DatabaseStore extends RuntimeClassBase implements Store {

    public Object connection = null;

    public Object table = null;

    public Object prefix = null;

    public DatabaseStore(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DatabaseStore.class) {
            this.__construct(env, args);
        }
    }

    public DatabaseStore(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "connection",
        typeHint = "Illuminate\\Database\\ConnectionInterface"
    )
    @ConvertedParameter(index = 1, name = "table")
    @ConvertedParameter(index = 2, name = "prefix")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        Object table = assignParameter(args, 1, false);
        Object prefix = assignParameter(args, 2, true);
        if (null == prefix) {
            prefix = "";
        }
        this.table = table;
        this.prefix = prefix;
        this.connection = connection;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object get(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object cache = null;
        Object prefixed = null;
        prefixed = toStringR(this.prefix, env) + toStringR(key, env);
        cache =
                env.callMethod(
                        env.callMethod(
                                this.table(env),
                                "where",
                                DatabaseStore.class,
                                "key",
                                "=",
                                prefixed),
                        "first",
                        DatabaseStore.class);
        if (function_is_null.f.env(env).call(cache).getBool()) {
            return null;
        }

        cache =
                ZVal.assign(
                        function_is_array.f.env(env).call(cache).getBool()
                                ? toObjectR(cache)
                                : cache);
        if (ZVal.isGreaterThanOrEqualTo(
                this.currentTime(env),
                ">=",
                toObjectR(cache).accessProp(this, env).name("expiration").value())) {
            this.forget(env, key);
            return null;
        }

        return ZVal.assign(
                function_unserialize
                        .f
                        .env(env)
                        .call(toObjectR(cache).accessProp(this, env).name("value").value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "minutes")
    public Object put(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope78 scope = new Scope78();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Cache")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Cache/DatabaseStore.php");
            scope.key = assignParameter(args, 0, false);
            scope.value = assignParameter(args, 1, false);
            scope.minutes = assignParameter(args, 2, false);
            scope.e = null;
            scope.expiration = null;
            scope.key = toStringR(this.prefix, env) + toStringR(scope.key, env);
            scope.value = function_serialize.f.env(env).call(scope.value).value();
            scope.expiration =
                    ZVal.add(this.getTime(env), ZVal.toLong(ZVal.multiply(scope.minutes, 60)));
            try {
                env.callMethod(
                        this.table(env),
                        "insert",
                        DatabaseStore.class,
                        function_compact
                                .f
                                .env(env)
                                .call(stack, "key", "value", "expiration")
                                .value());
            } catch (ConvertedException convertedException14) {
                if (convertedException14.instanceOf(PHPException.class, "Exception")) {
                    scope.e = convertedException14.getObject();
                    env.callMethod(
                            env.callMethod(
                                    this.table(env),
                                    "where",
                                    DatabaseStore.class,
                                    "key",
                                    scope.key),
                            "update",
                            DatabaseStore.class,
                            function_compact.f.env(env).call(stack, "value", "expiration").value());
                } else {
                    throw convertedException14;
                }
            }

            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object increment(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Cache")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Cache/DatabaseStore.php");
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(
                this.incrementOrDecrement(
                        env,
                        key,
                        value,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Cache",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "current")
                            @ConvertedParameter(index = 1, name = "value")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object current = assignParameter(args, 0, false);
                                Object value = assignParameter(args, 1, false);
                                return ZVal.assign(ZVal.add(current, value));
                            }
                        }));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value", defaultValue = "1", defaultValueType = "number")
    public Object decrement(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Cache")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Cache/DatabaseStore.php");
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = 1;
        }
        return ZVal.assign(
                this.incrementOrDecrement(
                        env,
                        key,
                        value,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Cache",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "current")
                            @ConvertedParameter(index = 1, name = "value")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object current = assignParameter(args, 0, false);
                                Object value = assignParameter(args, 1, false);
                                return ZVal.assign(ZVal.subtract(current, value));
                            }
                        }));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "callback", typeHint = "Closure")
    protected Object incrementOrDecrement(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Cache")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Cache/DatabaseStore.php");
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object callback = assignParameter(args, 2, false);
        return ZVal.assign(
                env.callMethod(
                        this.connection,
                        "transaction",
                        DatabaseStore.class,
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
                                Object _pNew = null;
                                Object cache = null;
                                Object current = null;
                                Object prefixed = null;
                                Object callback = null;
                                ReferenceContainer value = new BasicReferenceContainer(null);
                                Object key = null;
                                callback = this.contextReferences.getCapturedValue("callback");
                                value = this.contextReferences.getReferenceContainer("value");
                                key = this.contextReferences.getCapturedValue("key");
                                prefixed =
                                        toStringR(DatabaseStore.this.prefix, env)
                                                + toStringR(key, env);
                                cache =
                                        env.callMethod(
                                                env.callMethod(
                                                        env.callMethod(
                                                                DatabaseStore.this.table(env),
                                                                "where",
                                                                DatabaseStore.class,
                                                                "key",
                                                                prefixed),
                                                        "lockForUpdate",
                                                        DatabaseStore.class),
                                                "first",
                                                DatabaseStore.class);
                                if (function_is_null.f.env(env).call(cache).getBool()) {
                                    return ZVal.assign(false);
                                }

                                cache =
                                        ZVal.assign(
                                                function_is_array.f.env(env).call(cache).getBool()
                                                        ? toObjectR(cache)
                                                        : cache);
                                current =
                                        function_unserialize
                                                .f
                                                .env(env)
                                                .call(
                                                        toObjectR(cache)
                                                                .accessProp(this, env)
                                                                .name("value")
                                                                .value())
                                                .value();
                                _pNew =
                                        env.callFunctionDynamic(
                                                        callback,
                                                        new RuntimeArgsWithReferences()
                                                                .add(1, value),
                                                        ZVal.toLong(current),
                                                        value.getObject())
                                                .value();
                                if (!function_is_numeric.f.env(env).call(current).getBool()) {
                                    return ZVal.assign(false);
                                }

                                env.callMethod(
                                        env.callMethod(
                                                DatabaseStore.this.table(env),
                                                "where",
                                                DatabaseStore.class,
                                                "key",
                                                prefixed),
                                        "update",
                                        DatabaseStore.class,
                                        ZVal.newArray(
                                                new ZPair(
                                                        "value",
                                                        function_serialize
                                                                .f
                                                                .env(env)
                                                                .call(_pNew)
                                                                .value())));
                                return ZVal.assign(_pNew);
                            }
                        }.use("callback", callback).use("value", value).use("key", key)));
    }

    @ConvertedMethod
    protected Object getTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.currentTime(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object forever(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        this.put(env, key, value, 5256000);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object forget(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(
                        this.table(env),
                        "where",
                        DatabaseStore.class,
                        "key",
                        "=",
                        toStringR(this.prefix, env) + toStringR(key, env)),
                "delete",
                DatabaseStore.class);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(env.callMethod(this.table(env), "delete", DatabaseStore.class)));
    }

    @ConvertedMethod
    protected Object table(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this.connection, "table", DatabaseStore.class, this.table));
    }

    @ConvertedMethod
    public Object getConnection(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.connection);
    }

    @ConvertedMethod
    public Object getPrefix(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.prefix);
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
                                                        delay, "getTimestamp", DatabaseStore.class),
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
                        ? env.callMethod(delay, "getTimestamp", DatabaseStore.class)
                        : env.callMethod(
                                env.callMethod(
                                        Carbon.runtimeStaticObject.now(env),
                                        "addSeconds",
                                        DatabaseStore.class,
                                        delay),
                                "getTimestamp",
                                DatabaseStore.class));
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
                            DatabaseStore.class,
                            delay.getObject()));
        }

        return ZVal.assign(delay.getObject());
    }

    @ConvertedMethod
    protected Object currentTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        Carbon.runtimeStaticObject.now(env), "getTimestamp", DatabaseStore.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys", typeHint = "array")
    public Object many(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, false);
        ReferenceContainer _pReturn = new BasicReferenceContainer(null);
        Object key = null;
        _pReturn.setObject(ZVal.newArray());
        for (ZPair zpairResult2271 : ZVal.getIterable(keys, env, true)) {
            key = ZVal.assign(zpairResult2271.getValue());
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
        for (ZPair zpairResult2272 : ZVal.getIterable(values, env, false)) {
            key = ZVal.assign(zpairResult2272.getKey());
            value = ZVal.assign(zpairResult2272.getValue());
            this.put(env, key, value, minutes);
        }

        return null;
    }

    public static final Object CONST_class = "Illuminate\\Cache\\DatabaseStore";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Cache\\DatabaseStore")
                    .setLookup(
                            DatabaseStore.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("connection", "prefix", "table")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Cache/DatabaseStore.php")
                    .addInterface("Illuminate\\Contracts\\Cache\\Store")
                    .addTrait("Illuminate\\Support\\InteractsWithTime")
                    .addTrait("Illuminate\\Cache\\RetrievesMultipleKeys")
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

    private static class Scope77 implements UpdateRuntimeScopeInterface {

        Object e;
        Object minutes;
        Object _thisVarAlias;
        Object expiration;
        Object value;
        Object key;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("e", this.e);
            stack.setVariable("minutes", this.minutes);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("expiration", this.expiration);
            stack.setVariable("value", this.value);
            stack.setVariable("key", this.key);
        }

        public void updateScope(RuntimeStack stack) {

            this.e = stack.getVariable("e");
            this.minutes = stack.getVariable("minutes");
            this._thisVarAlias = stack.getVariable("this");
            this.expiration = stack.getVariable("expiration");
            this.value = stack.getVariable("value");
            this.key = stack.getVariable("key");
        }
    }

    private static class Scope78 implements UpdateRuntimeScopeInterface {

        Object e;
        Object minutes;
        Object _thisVarAlias;
        Object expiration;
        Object value;
        Object key;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("e", this.e);
            stack.setVariable("minutes", this.minutes);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("expiration", this.expiration);
            stack.setVariable("value", this.value);
            stack.setVariable("key", this.key);
        }

        public void updateScope(RuntimeStack stack) {

            this.e = stack.getVariable("e");
            this.minutes = stack.getVariable("minutes");
            this._thisVarAlias = stack.getVariable("this");
            this.expiration = stack.getVariable("expiration");
            this.value = stack.getVariable("value");
            this.key = stack.getVariable("key");
        }
    }
}
