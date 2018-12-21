package com.project.convertedCode.globalNamespace.namespaces.App.namespaces.Providers.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 app/Providers/EventServiceProvider.php

*/

public class EventServiceProvider
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Foundation
                .namespaces
                .Support
                .namespaces
                .Providers
                .classes
                .EventServiceProvider {

    public EventServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.listen =
                ZVal.newArray(
                        new ZPair(
                                "App\\Events\\Event",
                                ZVal.arrayFromList("App\\Listeners\\EventListener")));
        if (this.getClass() == EventServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public EventServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object boot(RuntimeEnv env, Object... args) {
        super.boot(env);
        return null;
    }

    public static final Object CONST_class = "App\\Providers\\EventServiceProvider";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Illuminate
                    .namespaces
                    .Foundation
                    .namespaces
                    .Support
                    .namespaces
                    .Providers
                    .classes
                    .EventServiceProvider
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("App\\Providers\\EventServiceProvider")
                    .setLookup(
                            EventServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer", "listen", "listen", "subscribe")
                    .setFilename("app/Providers/EventServiceProvider.php")
                    .addExtendsClass(
                            "Illuminate\\Foundation\\Support\\Providers\\EventServiceProvider")
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
