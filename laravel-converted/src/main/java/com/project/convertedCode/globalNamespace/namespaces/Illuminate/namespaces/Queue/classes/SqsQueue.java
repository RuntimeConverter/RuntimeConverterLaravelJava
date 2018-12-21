package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.filter.function_filter_var;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Jobs.classes.SqsJob;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/SqsQueue.php

*/

public class SqsQueue
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

    public Object sqs = null;

    public Object _pDefault = null;

    public Object prefix = null;

    public SqsQueue(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SqsQueue.class) {
            this.__construct(env, args);
        }
    }

    public SqsQueue(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sqs", typeHint = "Aws\\Sqs\\SqsClient")
    @ConvertedParameter(index = 1, name = "default")
    @ConvertedParameter(index = 2, name = "prefix")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object sqs = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, false);
        Object prefix = assignParameter(args, 2, true);
        if (null == prefix) {
            prefix = "";
        }
        this.sqs = sqs;
        this.prefix = prefix;
        this._pDefault = _pDefault;
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
        Object response = null;
        ReferenceContainer attributes = new BasicReferenceContainer(null);
        response =
                env.callMethod(
                        this.sqs,
                        "getQueueAttributes",
                        SqsQueue.class,
                        ZVal.newArray(
                                new ZPair("QueueUrl", this.getQueue(env, queue)),
                                new ZPair(
                                        "AttributeNames",
                                        ZVal.arrayFromList("ApproximateNumberOfMessages"))));
        attributes.setObject(env.callMethod(response, "get", SqsQueue.class, "Attributes"));
        return ZVal.assign(ZVal.toLong(attributes.arrayGet(env, "ApproximateNumberOfMessages")));
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
                        env.callMethod(this, "createPayload", SqsQueue.class, job, data),
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
                                this.sqs,
                                "sendMessage",
                                SqsQueue.class,
                                ZVal.newArray(
                                        new ZPair("QueueUrl", this.getQueue(env, queue)),
                                        new ZPair("MessageBody", payload))),
                        "get",
                        SqsQueue.class,
                        "MessageId"));
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
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this.sqs,
                                "sendMessage",
                                SqsQueue.class,
                                ZVal.newArray(
                                        new ZPair("QueueUrl", this.getQueue(env, queue)),
                                        new ZPair(
                                                "MessageBody",
                                                env.callMethod(
                                                        this,
                                                        "createPayload",
                                                        SqsQueue.class,
                                                        job,
                                                        data)),
                                        new ZPair(
                                                "DelaySeconds",
                                                env.callMethod(
                                                        this,
                                                        "secondsUntil",
                                                        SqsQueue.class,
                                                        delay)))),
                        "get",
                        SqsQueue.class,
                        "MessageId"));
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
        ReferenceContainer response = new BasicReferenceContainer(null);
        response.setObject(
                env.callMethod(
                        this.sqs,
                        "receiveMessage",
                        SqsQueue.class,
                        ZVal.newArray(
                                new ZPair("QueueUrl", queue = this.getQueue(env, queue)),
                                new ZPair(
                                        "AttributeNames",
                                        ZVal.arrayFromList("ApproximateReceiveCount")))));
        if (ZVal.toBool(
                        !function_is_null
                                .f
                                .env(env)
                                .call(response.arrayGet(env, "Messages"))
                                .getBool())
                && ZVal.toBool(
                        ZVal.isGreaterThan(
                                function_count
                                        .f
                                        .env(env)
                                        .call(response.arrayGet(env, "Messages"))
                                        .value(),
                                '>',
                                0))) {
            return ZVal.assign(
                    new SqsJob(
                            env,
                            toObjectR(this).accessProp(this, env).name("container").value(),
                            this.sqs,
                            response.arrayGet(env, "Messages", 0),
                            toObjectR(this).accessProp(this, env).name("connectionName").value(),
                            queue));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    public Object getQueue(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        queue =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = queue)
                                ? ternaryExpressionTemp
                                : this._pDefault);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                                function_filter_var.f.env(env).call(queue, 273).value(),
                                "===",
                                false)
                        ? toStringR(function_rtrim.f.env(env).call(this.prefix, "/").value(), env)
                                + "/"
                                + toStringR(queue, env)
                        : queue);
    }

    @ConvertedMethod
    public Object getSqs(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.sqs);
    }

    public static final Object CONST_class = "Illuminate\\Queue\\SqsQueue";

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
                    .setName("Illuminate\\Queue\\SqsQueue")
                    .setLookup(
                            SqsQueue.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("connectionName", "container", "default", "prefix", "sqs")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Queue/SqsQueue.php")
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
