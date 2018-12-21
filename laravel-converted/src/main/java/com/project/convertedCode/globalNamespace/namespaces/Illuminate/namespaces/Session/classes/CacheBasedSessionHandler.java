package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeInterfaces.SessionHandlerInterface;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Session/CacheBasedSessionHandler.php

*/

public class CacheBasedSessionHandler extends RuntimeClassBase implements SessionHandlerInterface {

    public Object cache = null;

    public Object minutes = null;

    public CacheBasedSessionHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CacheBasedSessionHandler.class) {
            this.__construct(env, args);
        }
    }

    public CacheBasedSessionHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cache",
        typeHint = "Illuminate\\Contracts\\Cache\\Repository"
    )
    @ConvertedParameter(index = 1, name = "minutes")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object cache = assignParameter(args, 0, false);
        Object minutes = assignParameter(args, 1, false);
        this.cache = cache;
        this.minutes = minutes;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "savePath")
    @ConvertedParameter(index = 1, name = "sessionName")
    public Object open(RuntimeEnv env, Object... args) {
        Object savePath = assignParameter(args, 0, false);
        Object sessionName = assignParameter(args, 1, false);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    public Object read(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(this.cache, "get", CacheBasedSessionHandler.class, sessionId, ""));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    @ConvertedParameter(index = 1, name = "data")
    public Object write(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this.cache,
                        "put",
                        CacheBasedSessionHandler.class,
                        sessionId,
                        data,
                        this.minutes));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    public Object destroy(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(this.cache, "forget", CacheBasedSessionHandler.class, sessionId));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lifetime")
    public Object gc(RuntimeEnv env, Object... args) {
        Object lifetime = assignParameter(args, 0, false);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object getCache(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.cache);
    }

    public static final Object CONST_class = "Illuminate\\Session\\CacheBasedSessionHandler";

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
                    .setName("Illuminate\\Session\\CacheBasedSessionHandler")
                    .setLookup(
                            CacheBasedSessionHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cache", "minutes")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Session/CacheBasedSessionHandler.php")
                    .addInterface("SessionHandlerInterface")
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
