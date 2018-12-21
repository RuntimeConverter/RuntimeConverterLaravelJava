package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes;

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
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/SafeStorage.php

*/

public final class SafeStorage extends RuntimeClassBase {

    public Object hash = null;

    public SafeStorage(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SafeStorage.class) {
            this.__construct(env, args);
        }
    }

    public SafeStorage(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.hash = NamespaceGlobal.spl_object_hash.env(env).call(this).value();
        env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .League
                                .namespaces
                                .Flysystem
                                .classes
                                .SafeStorage
                                .RequestStaticProperties
                                .class,
                        "safeStorage")
                .arrayAccess(env, this.hash)
                .set(ZVal.newArray());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object storeSafely(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .League
                                .namespaces
                                .Flysystem
                                .classes
                                .SafeStorage
                                .RequestStaticProperties
                                .class,
                        "safeStorage")
                .arrayAccess(env, this.hash, key)
                .set(value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object retrieveSafely(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        if (function_array_key_exists
                .f
                .env(env)
                .call(
                        key,
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .League
                                                .namespaces
                                                .Flysystem
                                                .classes
                                                .SafeStorage
                                                .RequestStaticProperties
                                                .class,
                                        "safeStorage")
                                .arrayGet(env, this.hash))
                .getBool()) {
            return ZVal.assign(
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .League
                                            .namespaces
                                            .Flysystem
                                            .classes
                                            .SafeStorage
                                            .RequestStaticProperties
                                            .class,
                                    "safeStorage")
                            .arrayGet(env, this.hash, key));
        }

        return null;
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        arrayActionR(
                ArrayAction.UNSET,
                env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .League
                                .namespaces
                                .Flysystem
                                .classes
                                .SafeStorage
                                .RequestStaticProperties
                                .class,
                        "safeStorage"),
                env,
                this.hash);
        return null;
    }

    public static final Object CONST_class = "League\\Flysystem\\SafeStorage";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object safeStorage = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("League\\Flysystem\\SafeStorage")
                    .setLookup(
                            SafeStorage.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("hash")
                    .setStaticPropertyNames("safeStorage")
                    .setFilename("vendor/league/flysystem/src/SafeStorage.php")
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
