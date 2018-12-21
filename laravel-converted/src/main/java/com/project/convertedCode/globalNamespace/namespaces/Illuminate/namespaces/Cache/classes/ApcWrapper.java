package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Cache/ApcWrapper.php

*/

public class ApcWrapper extends RuntimeClassBase {

    public Object apcu = false;

    public ApcWrapper(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ApcWrapper.class) {
            this.__construct(env, args);
        }
    }

    public ApcWrapper(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.apcu = function_function_exists.f.env(env).call("apcu_fetch").value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object get(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isTrue(this.apcu)
                        ? NamespaceGlobal.apcu_fetch.env(env).call(key).value()
                        : com.runtimeconverter.runtime.ZVal.functionNotFound("apc_fetch")
                                .env(env)
                                .call(key)
                                .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "seconds")
    public Object put(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object seconds = assignParameter(args, 2, false);
        return ZVal.assign(
                ZVal.isTrue(this.apcu)
                        ? NamespaceGlobal.apcu_store.env(env).call(key, value, seconds).value()
                        : com.runtimeconverter.runtime.ZVal.functionNotFound("apc_store")
                                .env(env)
                                .call(key, value, seconds)
                                .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object increment(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.isTrue(this.apcu)
                        ? NamespaceGlobal.apcu_inc.env(env).call(key, value).value()
                        : com.runtimeconverter.runtime.ZVal.functionNotFound("apc_inc")
                                .env(env)
                                .call(key, value)
                                .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object decrement(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.isTrue(this.apcu)
                        ? NamespaceGlobal.apcu_dec.env(env).call(key, value).value()
                        : com.runtimeconverter.runtime.ZVal.functionNotFound("apc_dec")
                                .env(env)
                                .call(key, value)
                                .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object delete(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isTrue(this.apcu)
                        ? NamespaceGlobal.apcu_delete.env(env).call(key).value()
                        : com.runtimeconverter.runtime.ZVal.functionNotFound("apc_delete")
                                .env(env)
                                .call(key)
                                .value());
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isTrue(this.apcu)
                        ? NamespaceGlobal.apcu_clear_cache.env(env).call().value()
                        : com.runtimeconverter.runtime.ZVal.functionNotFound("apc_clear_cache")
                                .env(env)
                                .call("user")
                                .value());
    }

    public static final Object CONST_class = "Illuminate\\Cache\\ApcWrapper";

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
                    .setName("Illuminate\\Cache\\ApcWrapper")
                    .setLookup(
                            ApcWrapper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("apcu")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Cache/ApcWrapper.php")
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
