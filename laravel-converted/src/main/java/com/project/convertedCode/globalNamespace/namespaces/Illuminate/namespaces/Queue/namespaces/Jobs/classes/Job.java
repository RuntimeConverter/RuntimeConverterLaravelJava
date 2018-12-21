package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Jobs.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Jobs.classes.JobName;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeClasses.date.DateInterval;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ReadOnlyReferenceContainer;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/Jobs/Job.php

*/

public abstract class Job extends RuntimeClassBase {

    public Object instance = null;

    public Object container = null;

    public Object deleted = false;

    public Object released = false;

    public Object failed = false;

    public Object connectionName = null;

    public Object queue = null;

    public Job(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Job(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object fire(RuntimeEnv env, Object... args) {
        Object method = null;
        ReferenceContainer payload = new BasicReferenceContainer(null);
        Object runtimeTempArrayResult69 = null;
        Object _pClass = null;
        payload.setObject(this.payload(env));
        ZVal.list(
                runtimeTempArrayResult69 =
                        JobName.runtimeStaticObject.parse(env, payload.arrayGet(env, "job")),
                (_pClass = listGet(runtimeTempArrayResult69, 0, env)),
                (method = listGet(runtimeTempArrayResult69, 1, env)));
        env.callMethod(
                this.instance = this.resolve(env, _pClass),
                new RuntimeArgsWithReferences()
                        .add(0, new ReadOnlyReferenceContainer(this))
                        .add(1, new ArrayDimensionReference(payload.getObject(), "data")),
                toStringR(method, env),
                Job.class,
                this,
                payload.arrayGet(env, "data"));
        return null;
    }

    @ConvertedMethod
    public Object delete(RuntimeEnv env, Object... args) {
        this.deleted = true;
        return null;
    }

    @ConvertedMethod
    public Object isDeleted(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.deleted);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay", defaultValue = "0", defaultValueType = "number")
    public Object release(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, true);
        if (null == delay) {
            delay = 0;
        }
        this.released = true;
        return null;
    }

    @ConvertedMethod
    public Object isReleased(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.released);
    }

    @ConvertedMethod
    public Object isDeletedOrReleased(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.toBool(this.isDeleted(env)) || ZVal.toBool(this.isReleased(env)));
    }

    @ConvertedMethod
    public Object hasFailed(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.failed);
    }

    @ConvertedMethod
    public Object markAsFailed(RuntimeEnv env, Object... args) {
        this.failed = true;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e")
    public Object failed(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object method = null;
        ReferenceContainer payload = new BasicReferenceContainer(null);
        Object runtimeTempArrayResult70 = null;
        Object _pClass = null;
        this.markAsFailed(env);
        payload.setObject(this.payload(env));
        ZVal.list(
                runtimeTempArrayResult70 =
                        JobName.runtimeStaticObject.parse(env, payload.arrayGet(env, "job")),
                (_pClass = listGet(runtimeTempArrayResult70, 0, env)),
                (method = listGet(runtimeTempArrayResult70, 1, env)));
        if (function_method_exists
                .f
                .env(env)
                .call(this.instance = this.resolve(env, _pClass), "failed")
                .getBool()) {
            env.callMethod(this.instance, "failed", Job.class, payload.arrayGet(env, "data"), e);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    protected Object resolve(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.container, "make", Job.class, _pClass));
    }

    @ConvertedMethod
    public Object payload(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.json_decode
                        .env(env)
                        .call(env.callMethod(this, "getRawBody", Job.class), true)
                        .value());
    }

    @ConvertedMethod
    public Object maxTries(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        handleReturnReference(this.payload(env))
                                                .arrayGet(env, "maxTries"))
                        ? ternaryExpressionTemp
                        : ZVal.getNull());
    }

    @ConvertedMethod
    public Object timeout(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        handleReturnReference(this.payload(env))
                                                .arrayGet(env, "timeout"))
                        ? ternaryExpressionTemp
                        : ZVal.getNull());
    }

    @ConvertedMethod
    public Object timeoutAt(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        handleReturnReference(this.payload(env))
                                                .arrayGet(env, "timeoutAt"))
                        ? ternaryExpressionTemp
                        : ZVal.getNull());
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(handleReturnReference(this.payload(env)).arrayGet(env, "job"));
    }

    @ConvertedMethod
    public Object resolveName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                JobName.runtimeStaticObject.resolve(env, this.getName(env), this.payload(env)));
    }

    @ConvertedMethod
    public Object getConnectionName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.connectionName);
    }

    @ConvertedMethod
    public Object getQueue(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.queue);
    }

    @ConvertedMethod
    public Object getContainer(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.container);
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
                                                env.callMethod(delay, "getTimestamp", Job.class),
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
                        ? env.callMethod(delay, "getTimestamp", Job.class)
                        : env.callMethod(
                                env.callMethod(
                                        Carbon.runtimeStaticObject.now(env),
                                        "addSeconds",
                                        Job.class,
                                        delay),
                                "getTimestamp",
                                Job.class));
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
                            Job.class,
                            delay.getObject()));
        }

        return ZVal.assign(delay.getObject());
    }

    @ConvertedMethod
    protected Object currentTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(Carbon.runtimeStaticObject.now(env), "getTimestamp", Job.class));
    }

    public static final Object CONST_class = "Illuminate\\Queue\\Jobs\\Job";

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
                    .setName("Illuminate\\Queue\\Jobs\\Job")
                    .setLookup(
                            Job.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "connectionName",
                            "container",
                            "deleted",
                            "failed",
                            "instance",
                            "queue",
                            "released")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Queue/Jobs/Job.php")
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
