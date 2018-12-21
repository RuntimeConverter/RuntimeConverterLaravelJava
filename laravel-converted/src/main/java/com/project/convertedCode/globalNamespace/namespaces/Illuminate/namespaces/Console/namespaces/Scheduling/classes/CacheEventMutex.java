package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.namespaces.Scheduling.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.namespaces.Scheduling.classes.EventMutex;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Console/Scheduling/CacheEventMutex.php

*/

public class CacheEventMutex extends RuntimeClassBase implements EventMutex {

    public Object cache = null;

    public Object store = null;

    public CacheEventMutex(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CacheEventMutex.class) {
            this.__construct(env, args);
        }
    }

    public CacheEventMutex(NoConstructor n) {
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
    public Object create(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object event = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.cache, "store", CacheEventMutex.class, this.store),
                        rLastRefArgs =
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                handleReturnReference(
                                                        env.callMethod(
                                                                event,
                                                                "mutexName",
                                                                CacheEventMutex.class))),
                        "add",
                        CacheEventMutex.class,
                        rLastRefArgs.get(0),
                        true,
                        toObjectR(event).accessProp(this, env).name("expiresAt").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Illuminate\\Console\\Scheduling\\Event"
    )
    public Object exists(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.cache, "store", CacheEventMutex.class, this.store),
                        "has",
                        CacheEventMutex.class,
                        env.callMethod(event, "mutexName", CacheEventMutex.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Illuminate\\Console\\Scheduling\\Event"
    )
    public Object forget(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(this.cache, "store", CacheEventMutex.class, this.store),
                "forget",
                CacheEventMutex.class,
                env.callMethod(event, "mutexName", CacheEventMutex.class));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "store")
    public Object useStore(RuntimeEnv env, Object... args) {
        Object store = assignParameter(args, 0, false);
        this.store = store;
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Illuminate\\Console\\Scheduling\\CacheEventMutex";

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
                    .setName("Illuminate\\Console\\Scheduling\\CacheEventMutex")
                    .setLookup(
                            CacheEventMutex.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cache", "store")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Console/Scheduling/CacheEventMutex.php")
                    .addInterface("Illuminate\\Console\\Scheduling\\EventMutex")
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
