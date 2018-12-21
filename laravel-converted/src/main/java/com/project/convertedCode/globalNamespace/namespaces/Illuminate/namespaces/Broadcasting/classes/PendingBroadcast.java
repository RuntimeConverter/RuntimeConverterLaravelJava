package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Broadcasting.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Broadcasting/PendingBroadcast.php

*/

public class PendingBroadcast extends RuntimeClassBase {

    public Object events = null;

    public Object event = null;

    public PendingBroadcast(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PendingBroadcast.class) {
            this.__construct(env, args);
        }
    }

    public PendingBroadcast(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "events",
        typeHint = "Illuminate\\Contracts\\Events\\Dispatcher"
    )
    @ConvertedParameter(index = 1, name = "event")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object events = assignParameter(args, 0, false);
        Object event = assignParameter(args, 1, false);
        this.event = event;
        this.events = events;
        return null;
    }

    @ConvertedMethod
    public Object toOthers(RuntimeEnv env, Object... args) {
        if (function_method_exists
                .f
                .env(env)
                .call(this.event, "dontBroadcastToCurrentUser")
                .getBool()) {
            env.callMethod(this.event, "dontBroadcastToCurrentUser", PendingBroadcast.class);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        env.callMethod(this.events, "dispatch", PendingBroadcast.class, this.event);
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Broadcasting\\PendingBroadcast";

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
                    .setName("Illuminate\\Broadcasting\\PendingBroadcast")
                    .setLookup(
                            PendingBroadcast.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("event", "events")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Broadcasting/PendingBroadcast.php")
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
