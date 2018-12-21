package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import java.lang.Class;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Jobs.classes.BeanstalkdJob;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/BeanstalkdQueue.php

*/

public class BeanstalkdQueue
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

    public Object pheanstalk = null;

    public Object _pDefault = null;

    public Object timeToRun = null;

    public BeanstalkdQueue(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == BeanstalkdQueue.class) {
            this.__construct(env, args);
        }
    }

    public BeanstalkdQueue(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pheanstalk", typeHint = "Pheanstalk\\Pheanstalk")
    @ConvertedParameter(index = 1, name = "default")
    @ConvertedParameter(index = 2, name = "timeToRun")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object pheanstalk = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, false);
        Object timeToRun = assignParameter(args, 2, false);
        this._pDefault = _pDefault;
        this.timeToRun = timeToRun;
        this.pheanstalk = pheanstalk;
        return null;
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
        queue = this.getQueue(env, queue);
        return ZVal.assign(
                ZVal.toLong(
                        toObjectR(
                                        env.callMethod(
                                                this.pheanstalk,
                                                "statsTube",
                                                BeanstalkdQueue.class,
                                                queue))
                                .accessProp(this, env)
                                .name("current_jobs_ready")
                                .value()));
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
        return ZVal.assign(
                this.pushRaw(
                        env,
                        env.callMethod(this, "createPayload", BeanstalkdQueue.class, job, data),
                        queue));
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
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this.pheanstalk,
                                "useTube",
                                BeanstalkdQueue.class,
                                this.getQueue(env, queue)),
                        "put",
                        BeanstalkdQueue.class,
                        payload,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "Pheanstalk"), "DEFAULT_PRIORITY"),
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "Pheanstalk"), "DEFAULT_DELAY"),
                        this.timeToRun));
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
        Object pheanstalk = null;
        pheanstalk =
                env.callMethod(
                        this.pheanstalk,
                        "useTube",
                        BeanstalkdQueue.class,
                        this.getQueue(env, queue));
        return ZVal.assign(
                env.callMethod(
                        pheanstalk,
                        "put",
                        BeanstalkdQueue.class,
                        env.callMethod(this, "createPayload", BeanstalkdQueue.class, job, data),
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "Pheanstalk"), "DEFAULT_PRIORITY"),
                        env.callMethod(this, "secondsUntil", BeanstalkdQueue.class, delay),
                        this.timeToRun));
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
        Object job = null;
        queue = this.getQueue(env, queue);
        job =
                env.callMethod(
                        env.callMethod(this.pheanstalk, "watchOnly", BeanstalkdQueue.class, queue),
                        "reserve",
                        BeanstalkdQueue.class,
                        0);
        if (ZVal.isTrue(ZVal.checkInstanceType(job, (Class) null, "PheanstalkJob", env))) {
            return ZVal.assign(
                    new BeanstalkdJob(
                            env,
                            toObjectR(this).accessProp(this, env).name("container").value(),
                            this.pheanstalk,
                            job,
                            toObjectR(this).accessProp(this, env).name("connectionName").value(),
                            queue));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    @ConvertedParameter(index = 1, name = "id")
    public Object deleteMessage(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        Object id = assignParameter(args, 1, false);
        queue = this.getQueue(env, queue);
        env.callMethod(
                env.callMethod(this.pheanstalk, "useTube", BeanstalkdQueue.class, queue),
                "delete",
                BeanstalkdQueue.class,
                env.createNew(ZVal.resolveClassAlias(env, "PheanstalkJob"), id, ""));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    public Object getQueue(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = queue)
                        ? ternaryExpressionTemp
                        : this._pDefault);
    }

    @ConvertedMethod
    public Object getPheanstalk(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.pheanstalk);
    }

    public static final Object CONST_class = "Illuminate\\Queue\\BeanstalkdQueue";

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
                    .setName("Illuminate\\Queue\\BeanstalkdQueue")
                    .setLookup(
                            BeanstalkdQueue.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "connectionName", "container", "default", "pheanstalk", "timeToRun")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Queue/BeanstalkdQueue.php")
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
