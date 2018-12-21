package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Filesystem.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Filesystem/Cache.php

*/

public class Cache extends RuntimeClassBase {

    public Object repository = null;

    public Object key = null;

    public Object expire = null;

    public Cache(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Cache.class) {
            this.__construct(env, args);
        }
    }

    public Cache(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "repository",
        typeHint = "Illuminate\\Contracts\\Cache\\Repository"
    )
    @ConvertedParameter(index = 1, name = "key")
    @ConvertedParameter(
        index = 2,
        name = "expire",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object repository = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, true);
        if (null == key) {
            key = "flysystem";
        }
        Object expire = assignParameter(args, 2, true);
        if (null == expire) {
            expire = ZVal.getNull();
        }
        this.key = key;
        this.repository = repository;
        if (!function_is_null.f.env(env).call(expire).getBool()) {
            this.expire =
                    ZVal.toLong(
                            NamespaceGlobal.ceil.env(env).call(ZVal.divide(expire, 60)).value());
        }

        return null;
    }

    @ConvertedMethod
    public Object load(RuntimeEnv env, Object... args) {
        Object contents = null;
        contents = env.callMethod(this.repository, "get", Cache.class, this.key);
        if (!function_is_null.f.env(env).call(contents).getBool()) {
            env.callMethod(this, "setFromStorage", Cache.class, contents);
        }

        return null;
    }

    @ConvertedMethod
    public Object save(RuntimeEnv env, Object... args) {
        Object contents = null;
        contents = env.callMethod(this, "getForStorage", Cache.class);
        if (!function_is_null.f.env(env).call(this.expire).getBool()) {
            env.callMethod(this.repository, "put", Cache.class, this.key, contents, this.expire);

        } else {
            env.callMethod(this.repository, "forever", Cache.class, this.key, contents);
        }

        return null;
    }

    public static final Object CONST_class = "Illuminate\\Filesystem\\Cache";

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
                    .setName("Illuminate\\Filesystem\\Cache")
                    .setLookup(
                            Cache.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("expire", "key", "repository")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Filesystem/Cache.php")
                    .addExtendsClass("League\\Flysystem\\Cached\\Storage\\AbstractCache")
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
