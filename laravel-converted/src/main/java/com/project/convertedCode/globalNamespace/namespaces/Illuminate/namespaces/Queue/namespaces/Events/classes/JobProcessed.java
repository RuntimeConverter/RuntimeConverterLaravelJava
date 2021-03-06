package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Events.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/Events/JobProcessed.php

*/

public class JobProcessed extends RuntimeClassBase {

    public Object connectionName = null;

    public Object job = null;

    public JobProcessed(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == JobProcessed.class) {
            this.__construct(env, args);
        }
    }

    public JobProcessed(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connectionName")
    @ConvertedParameter(index = 1, name = "job")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object connectionName = assignParameter(args, 0, false);
        Object job = assignParameter(args, 1, false);
        this.job = job;
        this.connectionName = connectionName;
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Queue\\Events\\JobProcessed";

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
                    .setName("Illuminate\\Queue\\Events\\JobProcessed")
                    .setLookup(
                            JobProcessed.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("connectionName", "job")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Queue/Events/JobProcessed.php")
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
