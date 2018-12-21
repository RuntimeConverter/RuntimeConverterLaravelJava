package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/Config.php

*/

public class Config extends RuntimeClassBase {

    public Object settings = ZVal.newArray();

    public Object fallback = null;

    public Config(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Config.class) {
            this.__construct(env, args);
        }
    }

    public Config(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "settings",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object settings = assignParameter(args, 0, true);
        if (null == settings) {
            settings = ZVal.newArray();
        }
        this.settings = settings;
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
        if (!function_array_key_exists.f.env(env).call(key, this.settings).getBool()) {
            return ZVal.assign(this.getDefault(env, key, _pDefault));
        }

        return ZVal.assign(new ReferenceClassProperty(this, "settings", env).arrayGet(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object has(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        if (function_array_key_exists.f.env(env).call(key, this.settings).getBool()) {
            return ZVal.assign(true);
        }

        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        this.fallback,
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .League
                                                .namespaces
                                                .Flysystem
                                                .classes
                                                .Config
                                                .class,
                                        "League\\Flysystem\\Config"))
                        ? env.callMethod(this.fallback, "has", Config.class, key)
                        : false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "default")
    protected Object getDefault(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, false);
        if (!ZVal.isTrue(this.fallback)) {
            return ZVal.assign(_pDefault);
        }

        return ZVal.assign(env.callMethod(this.fallback, "get", Config.class, key, _pDefault));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object set(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "settings", env).arrayAccess(env, key).set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fallback", typeHint = "League\\Flysystem\\Config")
    public Object setFallback(RuntimeEnv env, Object... args) {
        Object fallback = assignParameter(args, 0, false);
        this.fallback = fallback;
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "League\\Flysystem\\Config";

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
                    .setName("League\\Flysystem\\Config")
                    .setLookup(
                            Config.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("fallback", "settings")
                    .setFilename("vendor/league/flysystem/src/Config.php")
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
