package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeClasses.date.DateInterval;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes.InvalidPayloadException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/Queue.php

*/

public abstract class Queue extends RuntimeClassBase {

    public Object container = null;

    public Object connectionName = null;

    public Queue(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Queue(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    @ConvertedParameter(index = 1, name = "job")
    @ConvertedParameter(index = 2, name = "data")
    public Object pushOn(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        Object job = assignParameter(args, 1, false);
        Object data = assignParameter(args, 2, true);
        if (null == data) {
            data = "";
        }
        return ZVal.assign(env.callMethod(this, "push", Queue.class, job, data, queue));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    @ConvertedParameter(index = 1, name = "delay")
    @ConvertedParameter(index = 2, name = "job")
    @ConvertedParameter(index = 3, name = "data")
    public Object laterOn(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        Object delay = assignParameter(args, 1, false);
        Object job = assignParameter(args, 2, false);
        Object data = assignParameter(args, 3, true);
        if (null == data) {
            data = "";
        }
        return ZVal.assign(env.callMethod(this, "later", Queue.class, delay, job, data, queue));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "jobs")
    @ConvertedParameter(index = 1, name = "data")
    @ConvertedParameter(
        index = 2,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object bulk(RuntimeEnv env, Object... args) {
        Object jobs = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = "";
        }
        Object queue = assignParameter(args, 2, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        Object job = null;
        for (ZPair zpairResult508 : ZVal.getIterable(rToArrayCast(jobs), env, true)) {
            job = ZVal.assign(zpairResult508.getValue());
            env.callMethod(this, "push", Queue.class, job, data, queue);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    @ConvertedParameter(index = 1, name = "data")
    protected Object createPayload(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = "";
        }
        Object payload = null;
        payload =
                NamespaceGlobal.json_encode
                        .env(env)
                        .call(this.createPayloadArray(env, job, data))
                        .value();
        if (ZVal.strictNotEqualityCheck(
                0, "!==", NamespaceGlobal.json_last_error.env(env).call().value())) {
            throw ZVal.getException(
                    env,
                    new InvalidPayloadException(
                            env,
                            "Unable to JSON encode payload. Error code: "
                                    + toStringR(
                                            NamespaceGlobal.json_last_error.env(env).call().value(),
                                            env)));
        }

        return ZVal.assign(payload);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    @ConvertedParameter(index = 1, name = "data")
    protected Object createPayloadArray(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = "";
        }
        return ZVal.assign(
                function_is_object.f.env(env).call(job).getBool()
                        ? this.createObjectPayload(env, job)
                        : this.createStringPayload(env, job, data));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    protected Object createObjectPayload(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("displayName", this.getDisplayName(env, job)),
                        new ZPair("job", "Illuminate\\Queue\\CallQueuedHandler@call"),
                        new ZPair(
                                "maxTries",
                                ZVal.isDefined(
                                                ternaryExpressionTemp =
                                                        toObjectR(job)
                                                                .accessProp(this, env)
                                                                .name("tries")
                                                                .value())
                                        ? ternaryExpressionTemp
                                        : ZVal.getNull()),
                        new ZPair(
                                "timeout",
                                ZVal.isDefined(
                                                ternaryExpressionTemp =
                                                        toObjectR(job)
                                                                .accessProp(this, env)
                                                                .name("timeout")
                                                                .value())
                                        ? ternaryExpressionTemp
                                        : ZVal.getNull()),
                        new ZPair("timeoutAt", this.getJobExpiration(env, job)),
                        new ZPair(
                                "data",
                                ZVal.newArray(
                                        new ZPair(
                                                "commandName",
                                                function_get_class.f.env(env).call(job).value()),
                                        new ZPair(
                                                "command",
                                                function_serialize
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                ((RuntimeClassInterface) job)
                                                                        .phpClone(env))
                                                        .value())))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    protected Object getDisplayName(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        return ZVal.assign(
                function_method_exists.f.env(env).call(job, "displayName").getBool()
                        ? env.callMethod(job, "displayName", Queue.class)
                        : function_get_class.f.env(env).call(job).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    public Object getJobExpiration(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object expiration = null;
        Object ternaryExpressionTemp = null;
        if (ZVal.toBool(!function_method_exists.f.env(env).call(job, "retryUntil").getBool())
                && ZVal.toBool(
                        !ZVal.isset(
                                toObjectR(job).accessProp(this, env).name("timeoutAt").value()))) {
            return null;
        }

        expiration =
                ZVal.assign(
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                toObjectR(job)
                                                        .accessProp(this, env)
                                                        .name("timeoutAt")
                                                        .value())
                                ? ternaryExpressionTemp
                                : env.callMethod(job, "retryUntil", Queue.class));
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        expiration, DateTimeInterface.class, "DateTimeInterface"))
                        ? env.callMethod(expiration, "getTimestamp", Queue.class)
                        : expiration);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    @ConvertedParameter(index = 1, name = "data")
    protected Object createStringPayload(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "displayName",
                                function_is_string.f.env(env).call(job).getBool()
                                        ? handleReturnReference(
                                                        function_explode
                                                                .f
                                                                .env(env)
                                                                .call("@", job)
                                                                .value())
                                                .arrayGet(env, 0)
                                        : ZVal.getNull()),
                        new ZPair("job", job),
                        new ZPair("maxTries", ZVal.getNull()),
                        new ZPair("timeout", ZVal.getNull()),
                        new ZPair("data", data)));
    }

    @ConvertedMethod
    public Object getConnectionName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.connectionName);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setConnectionName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.connectionName = name;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Container\\Container"
    )
    public Object setContainer(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        this.container = container;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay")
    protected Object secondsUntil(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, false);
        delay = this.parseDateInterval(env, delay);
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        delay, DateTimeInterface.class, "DateTimeInterface"))
                        ? NamespaceGlobal.max
                                .env(env)
                                .call(
                                        0,
                                        ZVal.subtract(
                                                env.callMethod(delay, "getTimestamp", Queue.class),
                                                this.currentTime(env)))
                                .value()
                        : ZVal.toLong(delay));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay", defaultValue = "0", defaultValueType = "number")
    protected Object availableAt(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, true);
        if (null == delay) {
            delay = 0;
        }
        delay = this.parseDateInterval(env, delay);
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        delay, DateTimeInterface.class, "DateTimeInterface"))
                        ? env.callMethod(delay, "getTimestamp", Queue.class)
                        : env.callMethod(
                                env.callMethod(
                                        Carbon.runtimeStaticObject.now(env),
                                        "addSeconds",
                                        Queue.class,
                                        delay),
                                "getTimestamp",
                                Queue.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay")
    protected Object parseDateInterval(RuntimeEnv env, Object... args) {
        ReferenceContainer delay = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.isTrue(
                ZVal.checkInstanceType(delay.getObject(), DateInterval.class, "DateInterval"))) {
            delay.setObject(
                    env.callMethod(
                            Carbon.runtimeStaticObject.now(env),
                            new RuntimeArgsWithReferences().add(0, delay),
                            "add",
                            Queue.class,
                            delay.getObject()));
        }

        return ZVal.assign(delay.getObject());
    }

    @ConvertedMethod
    protected Object currentTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(Carbon.runtimeStaticObject.now(env), "getTimestamp", Queue.class));
    }

    public static final Object CONST_class = "Illuminate\\Queue\\Queue";

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
                    .setName("Illuminate\\Queue\\Queue")
                    .setLookup(
                            Queue.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("connectionName", "container")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Queue/Queue.php")
                    .addTrait("Illuminate\\Support\\InteractsWithTime")
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
