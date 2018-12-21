package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Events.classes.JobProcessed;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Events.classes.JobExceptionOccurred;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes.FailingJob;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Jobs.classes.SyncJob;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.FatalThrowableError;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Events.classes.JobProcessing;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/SyncQueue.php

*/

public class SyncQueue
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Queue
                .classes
                .Queue
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
                .Queue {

    public SyncQueue(RuntimeEnv env, Object... args) {
        super(env);
    }

    public SyncQueue(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object size(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        return 0;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    @ConvertedParameter(index = 1, name = "data")
    @ConvertedParameter(
        index = 2,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object push(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = "";
        }
        Object queue = assignParameter(args, 2, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        Object e = null;
        Object queueJob = null;
        queueJob =
                this.resolveJob(
                        env,
                        env.callMethod(this, "createPayload", SyncQueue.class, job, data),
                        queue);
        try {
            this.raiseBeforeJobEvent(env, queueJob);
            env.callMethod(queueJob, "fire", SyncQueue.class);
            this.raiseAfterJobEvent(env, queueJob);
        } catch (ConvertedException convertedException52) {
            if (convertedException52.instanceOf(PHPException.class, "Exception")) {
                e = convertedException52.getObject();
                this.handleException(env, queueJob, e);
            } else if (convertedException52.instanceOf(Throwable.class, "Throwable")) {
                e = convertedException52.getObject();
                this.handleException(env, queueJob, new FatalThrowableError(env, e));
            } else {
                throw convertedException52;
            }
        }

        return 0;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "payload")
    @ConvertedParameter(index = 1, name = "queue")
    protected Object resolveJob(RuntimeEnv env, Object... args) {
        Object payload = assignParameter(args, 0, false);
        Object queue = assignParameter(args, 1, false);
        return ZVal.assign(
                new SyncJob(
                        env,
                        toObjectR(this).accessProp(this, env).name("container").value(),
                        payload,
                        toObjectR(this).accessProp(this, env).name("connectionName").value(),
                        queue));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job", typeHint = "Illuminate\\Contracts\\Queue\\Job")
    protected Object raiseBeforeJobEvent(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("container").value(),
                        "bound",
                        SyncQueue.class,
                        "events"))) {
            env.callMethod(
                    new ReferenceClassProperty(this, "container", env).arrayGet(env, "events"),
                    "dispatch",
                    SyncQueue.class,
                    new JobProcessing(
                            env,
                            toObjectR(this).accessProp(this, env).name("connectionName").value(),
                            job));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job", typeHint = "Illuminate\\Contracts\\Queue\\Job")
    protected Object raiseAfterJobEvent(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("container").value(),
                        "bound",
                        SyncQueue.class,
                        "events"))) {
            env.callMethod(
                    new ReferenceClassProperty(this, "container", env).arrayGet(env, "events"),
                    "dispatch",
                    SyncQueue.class,
                    new JobProcessed(
                            env,
                            toObjectR(this).accessProp(this, env).name("connectionName").value(),
                            job));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job", typeHint = "Illuminate\\Contracts\\Queue\\Job")
    @ConvertedParameter(index = 1, name = "e")
    protected Object raiseExceptionOccurredJobEvent(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object e = assignParameter(args, 1, false);
        if (ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("container").value(),
                        "bound",
                        SyncQueue.class,
                        "events"))) {
            env.callMethod(
                    new ReferenceClassProperty(this, "container", env).arrayGet(env, "events"),
                    "dispatch",
                    SyncQueue.class,
                    new JobExceptionOccurred(
                            env,
                            toObjectR(this).accessProp(this, env).name("connectionName").value(),
                            job,
                            e));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queueJob")
    @ConvertedParameter(index = 1, name = "e")
    protected Object handleException(RuntimeEnv env, Object... args) {
        Object queueJob = assignParameter(args, 0, false);
        Object e = assignParameter(args, 1, false);
        this.raiseExceptionOccurredJobEvent(env, queueJob, e);
        FailingJob.runtimeStaticObject.handle(
                env,
                toObjectR(this).accessProp(this, env).name("connectionName").value(),
                queueJob,
                e);
        throw ZVal.getException(env, e);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "payload")
    @ConvertedParameter(
        index = 1,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object pushRaw(RuntimeEnv env, Object... args) {
        Object payload = assignParameter(args, 0, false);
        Object queue = assignParameter(args, 1, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay")
    @ConvertedParameter(index = 1, name = "job")
    @ConvertedParameter(index = 2, name = "data")
    @ConvertedParameter(
        index = 3,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object later(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, false);
        Object job = assignParameter(args, 1, false);
        Object data = assignParameter(args, 2, true);
        if (null == data) {
            data = "";
        }
        Object queue = assignParameter(args, 3, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        return ZVal.assign(this.push(env, job, data, queue));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object pop(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Queue\\SyncQueue";

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
                    .classes
                    .Queue
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Queue\\SyncQueue")
                    .setLookup(
                            SyncQueue.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("connectionName", "container")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Queue/SyncQueue.php")
                    .addInterface("Illuminate\\Contracts\\Queue\\Queue")
                    .addExtendsClass("Illuminate\\Queue\\Queue")
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
