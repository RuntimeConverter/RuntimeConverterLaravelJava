package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Jobs.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/Jobs/SyncJob.php

*/

public class SyncJob
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Queue
                .namespaces
                .Jobs
                .classes
                .Job
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Contracts
                .namespaces
                .Queue
                .classes
                .Job {

    public Object job = null;

    public Object payload = null;

    public SyncJob(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SyncJob.class) {
            this.__construct(env, args);
        }
    }

    public SyncJob(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Container\\Container"
    )
    @ConvertedParameter(index = 1, name = "payload")
    @ConvertedParameter(index = 2, name = "connectionName")
    @ConvertedParameter(index = 3, name = "queue")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        Object payload = assignParameter(args, 1, false);
        Object connectionName = assignParameter(args, 2, false);
        Object queue = assignParameter(args, 3, false);
        toObjectR(this).accessProp(this, env).name("queue").set(queue);
        this.payload = payload;
        toObjectR(this).accessProp(this, env).name("container").set(container);
        toObjectR(this).accessProp(this, env).name("connectionName").set(connectionName);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay", defaultValue = "0", defaultValueType = "number")
    public Object release(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, true);
        if (null == delay) {
            delay = 0;
        }
        super.release(env, delay);
        return null;
    }

    @ConvertedMethod
    public Object attempts(RuntimeEnv env, Object... args) {
        return 1;
    }

    @ConvertedMethod
    public Object getJobId(RuntimeEnv env, Object... args) {
        return "";
    }

    @ConvertedMethod
    public Object getRawBody(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.payload);
    }

    @ConvertedMethod
    public Object getQueue(RuntimeEnv env, Object... args) {
        return "sync";
    }

    public static final Object CONST_class = "Illuminate\\Queue\\Jobs\\SyncJob";

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
                    .Queue
                    .namespaces
                    .Jobs
                    .classes
                    .Job
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Queue\\Jobs\\SyncJob")
                    .setLookup(
                            SyncJob.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "connectionName",
                            "container",
                            "deleted",
                            "failed",
                            "instance",
                            "job",
                            "payload",
                            "queue",
                            "released")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Queue/Jobs/SyncJob.php")
                    .addInterface("Illuminate\\Contracts\\Queue\\Job")
                    .addExtendsClass("Illuminate\\Queue\\Jobs\\Job")
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
