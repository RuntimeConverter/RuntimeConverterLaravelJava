package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeInterfaces.JsonSerializable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Jsonable;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Arrayable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.project.convertedCode.globalNamespace.functions.value;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/Fluent.php

*/

public class Fluent extends RuntimeClassBase
        implements ArrayAccess, Arrayable, Jsonable, JsonSerializable {

    public Object attributes = ZVal.newArray();

    public Fluent(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Fluent.class) {
            this.__construct(env, args);
        }
    }

    public Fluent(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "attributes",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        Object value = null;
        Object key = null;
        for (ZPair zpairResult575 : ZVal.getIterable(attributes, env, false)) {
            key = ZVal.assign(zpairResult575.getKey());
            value = ZVal.assign(zpairResult575.getValue());
            new ReferenceClassProperty(this, "attributes", env).arrayAccess(env, key).set(value);
        }

        return null;
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
        if (function_array_key_exists.f.env(env).call(key, this.attributes).getBool()) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "attributes", env).arrayGet(env, key));
        }

        return ZVal.assign(value.f.env(env).call(_pDefault).value());
    }

    @ConvertedMethod
    public Object getAttributes(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.attributes);
    }

    @ConvertedMethod
    public Object toArray(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.attributes);
    }

    @ConvertedMethod
    public Object jsonSerialize(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.toArray(env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "options",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object toJson(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, true);
        if (null == options) {
            options = 0;
        }
        return ZVal.assign(
                NamespaceGlobal.json_encode
                        .env(env)
                        .call(this.jsonSerialize(env), options)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetExists(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "attributes", env),
                        env,
                        offset));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetGet(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        return ZVal.assign(this.get(env, offset));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    @ConvertedParameter(index = 1, name = "value")
    public Object offsetSet(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "attributes", env).arrayAccess(env, offset).set(value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetUnset(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        arrayActionR(
                ArrayAction.UNSET,
                new ReferenceClassProperty(this, "attributes", env),
                env,
                offset);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        new ReferenceClassProperty(this, "attributes", env)
                .arrayAccess(env, method)
                .set(
                        ZVal.isGreaterThan(
                                        function_count
                                                .f
                                                .env(env)
                                                .call(parameters.getObject())
                                                .value(),
                                        '>',
                                        0)
                                ? parameters.arrayGet(env, 0)
                                : true);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __get(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(this.get(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object __set(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        this.offsetSet(env, key, value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __isset(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(this.offsetExists(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __unset(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        this.offsetUnset(env, key);
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Support\\Fluent";

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
                    .setName("Illuminate\\Support\\Fluent")
                    .setLookup(
                            Fluent.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Support/Fluent.php")
                    .addInterface("ArrayAccess")
                    .addInterface("Illuminate\\Contracts\\Support\\Arrayable")
                    .addInterface("Illuminate\\Contracts\\Support\\Jsonable")
                    .addInterface("JsonSerializable")
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
