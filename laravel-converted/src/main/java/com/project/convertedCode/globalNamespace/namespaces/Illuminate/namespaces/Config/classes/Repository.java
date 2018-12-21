package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Config.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Config/Repository.php

*/

public class Repository extends RuntimeClassBase
        implements ArrayAccess,
                com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Contracts
                        .namespaces
                        .Config
                        .classes
                        .Repository {

    public Object items = ZVal.newArray();

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
    @ConvertedParameter(
        index = 0,
        name = "items",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, true);
        if (null == items) {
            items = ZVal.newArray();
        }
        this.items = items;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object has(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(Arr.runtimeStaticObject.has(env, this.items, key));
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
        if (function_is_array.f.env(env).call(key).getBool()) {
            return ZVal.assign(this.getMany(env, key));
        }

        return ZVal.assign(Arr.runtimeStaticObject.get(env, this.items, key, _pDefault));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys")
    public Object getMany(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, false);
        Object _pDefault = null;
        ReferenceContainer config = new BasicReferenceContainer(null);
        Object key = null;
        Object runtimeTempArrayResult12 = null;
        config.setObject(ZVal.newArray());
        for (ZPair zpairResult217 : ZVal.getIterable(keys, env, false)) {
            key = ZVal.assign(zpairResult217.getKey());
            _pDefault = ZVal.assign(zpairResult217.getValue());
            if (function_is_numeric.f.env(env).call(key).getBool()) {
                ZVal.list(
                        runtimeTempArrayResult12 =
                                ZVal.newArray(
                                        new ZPair(0, _pDefault), new ZPair(1, ZVal.getNull())),
                        (key = listGet(runtimeTempArrayResult12, 0, env)),
                        (_pDefault = listGet(runtimeTempArrayResult12, 1, env)));
            }

            config.arrayAccess(env, key)
                    .set(Arr.runtimeStaticObject.get(env, this.items, key, _pDefault));
        }

        return ZVal.assign(config.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object set(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object keys = null;
        keys =
                ZVal.assign(
                        function_is_array.f.env(env).call(key).getBool()
                                ? key
                                : ZVal.newArray(new ZPair(key, value)));
        for (ZPair zpairResult218 : ZVal.getIterable(keys, env, false)) {
            key = ZVal.assign(zpairResult218.getKey());
            value = ZVal.assign(zpairResult218.getValue());
            Arr.runtimeStaticObject.set(
                    env,
                    new RuntimeArgsWithReferences()
                            .add(0, new ReferenceClassProperty(this, "items", env)),
                    this.items,
                    key,
                    value);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object prepend(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object array = null;
        array = this.get(env, key);
        function_array_unshift.f.env(env).call(array, value);
        this.set(env, key, array);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object push(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer array = new BasicReferenceContainer(null);
        array.setObject(this.get(env, key));
        array.arrayAppend(env).set(value);
        this.set(env, key, array.getObject());
        return null;
    }

    @ConvertedMethod
    public Object all(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.items);
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
        this.set(env, key, value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object offsetUnset(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        this.set(env, key, ZVal.getNull());
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Config\\Repository";

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
                    .setName("Illuminate\\Config\\Repository")
                    .setLookup(
                            Repository.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("items")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Config/Repository.php")
                    .addInterface("ArrayAccess")
                    .addInterface("Illuminate\\Contracts\\Config\\Repository")
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
