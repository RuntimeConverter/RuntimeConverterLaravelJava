package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes.ExistenceAwareInterface;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.stdClass;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes.CookieSessionHandler;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.functions.collect;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Session.classes.Session;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Session/Store.php

*/

public class Store extends RuntimeClassBase implements Session {

    public Object id = null;

    public Object name = null;

    public Object attributes = ZVal.newArray();

    public Object handler = null;

    public Object started = false;

    public Store(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Store.class) {
            this.__construct(env, args);
        }
    }

    public Store(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "handler", typeHint = "SessionHandlerInterface")
    @ConvertedParameter(
        index = 2,
        name = "id",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object handler = assignParameter(args, 1, false);
        Object id = assignParameter(args, 2, true);
        if (null == id) {
            id = ZVal.getNull();
        }
        this.setId(env, id);
        this.name = name;
        this.handler = handler;
        return null;
    }

    @ConvertedMethod
    public Object start(RuntimeEnv env, Object... args) {
        this.loadSession(env);
        if (!ZVal.isTrue(this.has(env, "_token"))) {
            this.regenerateToken(env);
        }

        return ZVal.assign(this.started = true);
    }

    @ConvertedMethod
    protected Object loadSession(RuntimeEnv env, Object... args) {
        this.attributes =
                function_array_merge
                        .f
                        .env(env)
                        .call(this.attributes, this.readFromHandler(env))
                        .value();
        return null;
    }

    @ConvertedMethod
    protected Object readFromHandler(RuntimeEnv env, Object... args) {
        Object data = null;
        if (ZVal.isTrue(
                data = env.callMethod(this.handler, "read", Store.class, this.getId(env)))) {
            data =
                    function_unserialize
                            .f
                            .env(env)
                            .call(this.prepareForUnserialize(env, data))
                            .value();
            if (ZVal.toBool(
                            ZVal.toBool(ZVal.strictNotEqualityCheck(data, "!==", false))
                                    && ZVal.toBool(
                                            !function_is_null.f.env(env).call(data).getBool()))
                    && ZVal.toBool(function_is_array.f.env(env).call(data).value())) {
                return ZVal.assign(data);
            }
        }

        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    protected Object prepareForUnserialize(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        return ZVal.assign(data);
    }

    @ConvertedMethod
    public Object save(RuntimeEnv env, Object... args) {
        this.ageFlashData(env);
        env.callMethod(
                this.handler,
                "write",
                Store.class,
                this.getId(env),
                this.prepareForStorage(
                        env, function_serialize.f.env(env).call(this.attributes).value()));
        this.started = false;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    protected Object prepareForStorage(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        return ZVal.assign(data);
    }

    @ConvertedMethod
    public Object ageFlashData(RuntimeEnv env, Object... args) {
        this.forget(env, this.get(env, "_flash.old", ZVal.newArray()));
        this.put(env, "_flash.old", this.get(env, "_flash.new", ZVal.newArray()));
        this.put(env, "_flash.new", ZVal.newArray());
        return null;
    }

    @ConvertedMethod
    public Object all(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.attributes);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object exists(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Session")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Session/Store.php");
        Object key = assignParameter(args, 0, false);
        Object placeholder = null;
        placeholder = new stdClass(env);
        return ZVal.assign(
                !ZVal.isTrue(
                        env.callMethod(
                                collect.f
                                        .env(env)
                                        .call(
                                                function_is_array.f.env(env).call(key).getBool()
                                                        ? key
                                                        : function_func_get_args
                                                                .f
                                                                .env(env)
                                                                .addReferenceArgs(
                                                                        new RuntimeArgsWithInfo(
                                                                                args, this))
                                                                .call()
                                                                .value())
                                        .value(),
                                new RuntimeArgsWithReferences(),
                                "contains",
                                Store.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Session",
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
                                        Object placeholder = null;
                                        placeholder =
                                                this.contextReferences.getCapturedValue(
                                                        "placeholder");
                                        return ZVal.assign(
                                                ZVal.strictEqualityCheck(
                                                        Store.this.get(env, key, placeholder),
                                                        "===",
                                                        placeholder));
                                    }
                                }.use("placeholder", placeholder))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object has(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Session")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Session/Store.php");
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                !ZVal.isTrue(
                        env.callMethod(
                                collect.f
                                        .env(env)
                                        .call(
                                                function_is_array.f.env(env).call(key).getBool()
                                                        ? key
                                                        : function_func_get_args
                                                                .f
                                                                .env(env)
                                                                .addReferenceArgs(
                                                                        new RuntimeArgsWithInfo(
                                                                                args, this))
                                                                .call()
                                                                .value())
                                        .value(),
                                new RuntimeArgsWithReferences(),
                                "contains",
                                Store.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Session",
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
                                                function_is_null
                                                        .f
                                                        .env(env)
                                                        .call(Store.this.get(env, key))
                                                        .value());
                                    }
                                })));
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
        return ZVal.assign(Arr.runtimeStaticObject.get(env, this.attributes, key, _pDefault));
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
        Object key = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(
                Arr.runtimeStaticObject.pull(
                        env,
                        new RuntimeArgsWithReferences()
                                .add(0, new ReferenceClassProperty(this, "attributes", env)),
                        this.attributes,
                        key,
                        _pDefault));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object hasOldInput(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        Object old = null;
        old = this.getOldInput(env, key);
        return ZVal.assign(
                function_is_null.f.env(env).call(key).getBool()
                        ? ZVal.isGreaterThan(function_count.f.env(env).call(old).value(), '>', 0)
                        : !function_is_null.f.env(env).call(old).getBool());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getOldInput(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(
                Arr.runtimeStaticObject.get(
                        env, this.get(env, "_old_input", ZVal.newArray()), key, _pDefault));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    public Object replace(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        this.put(env, attributes);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object put(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object arrayKey = null;
        Object arrayValue = null;
        if (!function_is_array.f.env(env).call(key).getBool()) {
            key = ZVal.newArray(new ZPair(key, value));
        }

        for (ZPair zpairResult540 : ZVal.getIterable(key, env, false)) {
            arrayKey = ZVal.assign(zpairResult540.getKey());
            arrayValue = ZVal.assign(zpairResult540.getValue());
            Arr.runtimeStaticObject.set(
                    env,
                    new RuntimeArgsWithReferences()
                            .add(0, new ReferenceClassProperty(this, "attributes", env)),
                    this.attributes,
                    arrayKey,
                    arrayValue);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    public Object remember(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Session")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Session/Store.php");
        Object key = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        Object value = null;
        if (!function_is_null.f.env(env).call(value = this.get(env, key)).getBool()) {
            return ZVal.assign(value);
        }

        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                env.callFunctionDynamic(callback, new RuntimeArgsWithReferences())
                                        .value(),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Session",
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
                                        Store.this.put(env, key, value);
                                        return null;
                                    }
                                }.use("key", key))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object push(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer array = new BasicReferenceContainer(null);
        array.setObject(this.get(env, key, ZVal.newArray()));
        array.arrayAppend(env).set(value);
        this.put(env, key, array.getObject());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "amount", defaultValue = "1", defaultValueType = "number")
    public Object increment(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object amount = assignParameter(args, 1, true);
        if (null == amount) {
            amount = 1;
        }
        Object value = null;
        this.put(env, key, value = ZVal.add(this.get(env, key, 0), amount));
        return ZVal.assign(value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "amount", defaultValue = "1", defaultValueType = "number")
    public Object decrement(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object amount = assignParameter(args, 1, true);
        if (null == amount) {
            amount = 1;
        }
        return ZVal.assign(this.increment(env, key, ZVal.multiply(amount, -1)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object flash(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = true;
        }
        this.put(env, key, value);
        this.push(env, "_flash.new", key);
        this.removeFromOldFlashData(env, ZVal.newArray(new ZPair(0, key)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object now(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        this.put(env, key, value);
        this.push(env, "_flash.old", key);
        return null;
    }

    @ConvertedMethod
    public Object reflash(RuntimeEnv env, Object... args) {
        this.mergeNewFlashes(env, this.get(env, "_flash.old", ZVal.newArray()));
        this.put(env, "_flash.old", ZVal.newArray());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "keys",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object keep(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, true);
        if (null == keys) {
            keys = ZVal.getNull();
        }
        this.mergeNewFlashes(
                env,
                keys =
                        ZVal.assign(
                                function_is_array.f.env(env).call(keys).getBool()
                                        ? keys
                                        : function_func_get_args
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithInfo(args, this))
                                                .call()
                                                .value()));
        this.removeFromOldFlashData(env, keys);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys", typeHint = "array")
    protected Object mergeNewFlashes(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, false);
        Object values = null;
        values =
                function_array_unique
                        .f
                        .env(env)
                        .call(
                                function_array_merge
                                        .f
                                        .env(env)
                                        .call(this.get(env, "_flash.new", ZVal.newArray()), keys)
                                        .value())
                        .value();
        this.put(env, "_flash.new", values);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys", typeHint = "array")
    protected Object removeFromOldFlashData(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, false);
        this.put(
                env,
                "_flash.old",
                function_array_diff
                        .f
                        .env(env)
                        .call(this.get(env, "_flash.old", ZVal.newArray()), keys)
                        .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "array")
    public Object flashInput(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        this.flash(env, "_old_input", value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object remove(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                Arr.runtimeStaticObject.pull(
                        env,
                        new RuntimeArgsWithReferences()
                                .add(0, new ReferenceClassProperty(this, "attributes", env)),
                        this.attributes,
                        key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys")
    public Object forget(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, false);
        Arr.runtimeStaticObject.forget(
                env,
                new RuntimeArgsWithReferences()
                        .add(0, new ReferenceClassProperty(this, "attributes", env)),
                this.attributes,
                keys);
        return null;
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        this.attributes = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    public Object invalidate(RuntimeEnv env, Object... args) {
        this.flush(env);
        return ZVal.assign(this.migrate(env, true));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "destroy",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object regenerate(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Session")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Session/Store.php");
        Object destroy = assignParameter(args, 0, true);
        if (null == destroy) {
            destroy = false;
        }
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                this.migrate(env, destroy),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Session",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Store.this.regenerateToken(env);
                                        return null;
                                    }
                                })
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "destroy",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object migrate(RuntimeEnv env, Object... args) {
        Object destroy = assignParameter(args, 0, true);
        if (null == destroy) {
            destroy = false;
        }
        if (ZVal.isTrue(destroy)) {
            env.callMethod(this.handler, "destroy", Store.class, this.getId(env));
        }

        this.setExists(env, false);
        this.setId(env, this.generateSessionId(env));
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object isStarted(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.started);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.name = name;
        return null;
    }

    @ConvertedMethod
    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.id);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object setId(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        this.id = ZVal.isTrue(this.isValidId(env, id)) ? id : this.generateSessionId(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object isValidId(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(function_is_string.f.env(env).call(id).value())
                                        && ZVal.toBool(
                                                NamespaceGlobal.ctype_alnum
                                                        .env(env)
                                                        .call(id)
                                                        .value()))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        function_strlen.f.env(env).call(id).value(), "===", 40)));
    }

    @ConvertedMethod
    protected Object generateSessionId(RuntimeEnv env, Object... args) {
        return ZVal.assign(Str.runtimeStaticObject.random(env, 40));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object setExists(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.handler,
                        ExistenceAwareInterface.class,
                        "Illuminate\\Session\\ExistenceAwareInterface"))) {
            env.callMethod(this.handler, "setExists", Store.class, value);
        }

        return null;
    }

    @ConvertedMethod
    public Object token(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.get(env, "_token"));
    }

    @ConvertedMethod
    public Object regenerateToken(RuntimeEnv env, Object... args) {
        this.put(env, "_token", Str.runtimeStaticObject.random(env, 40));
        return null;
    }

    @ConvertedMethod
    public Object previousUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.get(env, "_previous.url"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "url")
    public Object setPreviousUrl(RuntimeEnv env, Object... args) {
        Object url = assignParameter(args, 0, false);
        this.put(env, "_previous.url", url);
        return null;
    }

    @ConvertedMethod
    public Object getHandler(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.handler);
    }

    @ConvertedMethod
    public Object handlerNeedsRequest(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.checkInstanceType(
                        this.handler,
                        CookieSessionHandler.class,
                        "Illuminate\\Session\\CookieSessionHandler"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    public Object setRequestOnHandler(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.handlerNeedsRequest(env))) {
            env.callMethod(this.handler, "setRequest", Store.class, request);
        }

        return null;
    }

    public static final Object CONST_class = "Illuminate\\Session\\Store";

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
                    .setName("Illuminate\\Session\\Store")
                    .setLookup(
                            Store.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "handler", "id", "name", "started")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Session/Store.php")
                    .addInterface("Illuminate\\Contracts\\Session\\Session")
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
