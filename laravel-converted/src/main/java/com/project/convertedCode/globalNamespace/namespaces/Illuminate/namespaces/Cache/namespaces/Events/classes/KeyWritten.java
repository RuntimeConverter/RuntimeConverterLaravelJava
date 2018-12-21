package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.namespaces.Events.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.namespaces.Events.classes.CacheEvent;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Cache/Events/KeyWritten.php

*/

public class KeyWritten extends CacheEvent {

    public Object value = null;

    public Object minutes = null;

    public KeyWritten(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == KeyWritten.class) {
            this.__construct(env, args);
        }
    }

    public KeyWritten(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "minutes")
    @ConvertedParameter(index = 3, name = "tags", defaultValue = "", defaultValueType = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object minutes = assignParameter(args, 2, false);
        Object tags = assignParameter(args, 3, true);
        if (null == tags) {
            tags = ZVal.newArray();
        }
        super.__construct(env, key, tags);
        this.value = value;
        this.minutes = minutes;
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Cache\\Events\\KeyWritten";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends CacheEvent.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Cache\\Events\\KeyWritten")
                    .setLookup(
                            KeyWritten.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("key", "minutes", "tags", "value")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Cache/Events/KeyWritten.php")
                    .addExtendsClass("Illuminate\\Cache\\Events\\CacheEvent")
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
