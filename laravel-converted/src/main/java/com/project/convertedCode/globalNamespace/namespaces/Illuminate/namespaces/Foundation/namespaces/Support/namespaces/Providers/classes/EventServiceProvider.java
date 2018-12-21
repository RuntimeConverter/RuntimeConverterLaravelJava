package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Support.namespaces.Providers.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ServiceProvider;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Event;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Support/Providers/EventServiceProvider.php

*/

public class EventServiceProvider extends ServiceProvider {

    public Object listen = ZVal.newArray();

    public Object subscribe = ZVal.newArray();

    public EventServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == EventServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public EventServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object boot(RuntimeEnv env, Object... args) {
        Object subscriber = null;
        Object listeners = null;
        Object listener = null;
        Object event = null;
        for (ZPair zpairResult427 : ZVal.getIterable(this.listens(env), env, false)) {
            event = ZVal.assign(zpairResult427.getKey());
            listeners = ZVal.assign(zpairResult427.getValue());
            for (ZPair zpairResult428 : ZVal.getIterable(listeners, env, true)) {
                listener = ZVal.assign(zpairResult428.getValue());
                Event.runtimeStaticObject.callUnknownStaticMethod(
                        env, "listen", new RuntimeArgsWithReferences(), event, listener);
            }
        }

        for (ZPair zpairResult429 : ZVal.getIterable(this.subscribe, env, true)) {
            subscriber = ZVal.assign(zpairResult429.getValue());
            Event.runtimeStaticObject.callUnknownStaticMethod(
                    env, "subscribe", new RuntimeArgsWithReferences(), subscriber);
        }

        return null;
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    public Object listens(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.listen);
    }

    public static final Object CONST_class =
            "Illuminate\\Foundation\\Support\\Providers\\EventServiceProvider";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ServiceProvider.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Support\\Providers\\EventServiceProvider")
                    .setLookup(
                            EventServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer", "listen", "subscribe")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Support/Providers/EventServiceProvider.php")
                    .addExtendsClass("Illuminate\\Support\\ServiceProvider")
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
