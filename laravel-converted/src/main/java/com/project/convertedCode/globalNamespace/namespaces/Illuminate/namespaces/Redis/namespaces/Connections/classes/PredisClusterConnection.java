package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Redis.namespaces.Connections.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Redis.namespaces.Connections.classes.PredisConnection;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Redis/Connections/PredisClusterConnection.php

*/

public class PredisClusterConnection extends PredisConnection {

    public PredisClusterConnection(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PredisClusterConnection.class) {
            this.__construct(env, args);
        }
    }

    public PredisClusterConnection(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class =
            "Illuminate\\Redis\\Connections\\PredisClusterConnection";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends PredisConnection.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Redis\\Connections\\PredisClusterConnection")
                    .setLookup(
                            PredisClusterConnection.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("client")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Redis/Connections/PredisClusterConnection.php")
                    .addInterface("Illuminate\\Contracts\\Redis\\Connection")
                    .addExtendsClass("Illuminate\\Redis\\Connections\\PredisConnection")
                    .addExtendsClass("Illuminate\\Redis\\Connections\\Connection")
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
