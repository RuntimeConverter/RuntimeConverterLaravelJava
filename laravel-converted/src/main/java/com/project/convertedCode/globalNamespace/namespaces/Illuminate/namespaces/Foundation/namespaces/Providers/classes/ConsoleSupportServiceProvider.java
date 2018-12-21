package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Providers.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Providers.classes.ArtisanServiceProvider;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes.MigrationServiceProvider;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.AggregateServiceProvider;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Providers.classes.ComposerServiceProvider;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Providers/ConsoleSupportServiceProvider.php

*/

public class ConsoleSupportServiceProvider extends AggregateServiceProvider {

    public ConsoleSupportServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.defer = true;
        this.providers =
                ZVal.newArray(
                        new ZPair(0, ArtisanServiceProvider.CONST_class),
                        new ZPair(1, MigrationServiceProvider.CONST_class),
                        new ZPair(2, ComposerServiceProvider.CONST_class));
        if (this.getClass() == ConsoleSupportServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public ConsoleSupportServiceProvider(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class =
            "Illuminate\\Foundation\\Providers\\ConsoleSupportServiceProvider";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AggregateServiceProvider.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Providers\\ConsoleSupportServiceProvider")
                    .setLookup(
                            ConsoleSupportServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "app", "defer", "defer", "instances", "providers", "providers")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Providers/ConsoleSupportServiceProvider.php")
                    .addExtendsClass("Illuminate\\Support\\AggregateServiceProvider")
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
