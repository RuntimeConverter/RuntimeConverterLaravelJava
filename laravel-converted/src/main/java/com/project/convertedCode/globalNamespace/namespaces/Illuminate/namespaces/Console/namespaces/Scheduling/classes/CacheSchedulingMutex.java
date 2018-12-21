package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.namespaces.Scheduling.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.namespaces.Scheduling.classes.SchedulingMutex;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Console/Scheduling/CacheSchedulingMutex.php

*/

public class CacheSchedulingMutex extends RuntimeClassBase implements SchedulingMutex {

    public Object cache = null;

    public Object store = null;

    public CacheSchedulingMutex(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CacheSchedulingMutex.class) {
            this.__construct(env, args);
        }
    }

    public CacheSchedulingMutex(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cache",
        typeHint = "Illuminate\\Contracts\\Cache\\Factory"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object cache = assignParameter(args, 0, false);
        this.cache = cache;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Illuminate\\Console\\Scheduling\\Event"
    )
    @ConvertedParameter(index = 1, name = "time", typeHint = "DateTimeInterface")
    public Object create(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object time = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.cache, "store", CacheSchedulingMutex.class, this.store),
                        new RuntimeArgsWithReferences(),
                        "add",
                        CacheSchedulingMutex.class,
                        toStringR(
                                        env.callMethod(
                                                event, "mutexName", CacheSchedulingMutex.class),
                                        env)
                                + toStringR(
                                        env.callMethod(
                                                time, "format", CacheSchedulingMutex.class, "Hi"),
                                        env),
                        true,
                        60));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Illuminate\\Console\\Scheduling\\Event"
    )
    @ConvertedParameter(index = 1, name = "time", typeHint = "DateTimeInterface")
    public Object exists(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object time = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.cache, "store", CacheSchedulingMutex.class, this.store),
                        "has",
                        CacheSchedulingMutex.class,
                        toStringR(
                                        env.callMethod(
                                                event, "mutexName", CacheSchedulingMutex.class),
                                        env)
                                + toStringR(
                                        env.callMethod(
                                                time, "format", CacheSchedulingMutex.class, "Hi"),
                                        env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "store")
    public Object useStore(RuntimeEnv env, Object... args) {
        Object store = assignParameter(args, 0, false);
        this.store = store;
        return ZVal.assign(this);
    }

    public static final Object CONST_class =
            "Illuminate\\Console\\Scheduling\\CacheSchedulingMutex";

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
                    .setName("Illuminate\\Console\\Scheduling\\CacheSchedulingMutex")
                    .setLookup(
                            CacheSchedulingMutex.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cache", "store")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Console/Scheduling/CacheSchedulingMutex.php")
                    .addInterface("Illuminate\\Console\\Scheduling\\SchedulingMutex")
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
