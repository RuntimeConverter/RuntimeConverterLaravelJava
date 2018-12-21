package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Redis.namespaces.Limiters.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Redis.namespaces.Limiters.classes.ConcurrencyLimiter;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
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
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Redis.classes.LimiterTimeoutException;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Redis/Limiters/ConcurrencyLimiterBuilder.php

*/

public class ConcurrencyLimiterBuilder extends RuntimeClassBase {

    public Object connection = null;

    public Object name = null;

    public Object maxLocks = null;

    public Object releaseAfter = 60;

    public Object timeout = 3;

    public ConcurrencyLimiterBuilder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ConcurrencyLimiterBuilder.class) {
            this.__construct(env, args);
        }
    }

    public ConcurrencyLimiterBuilder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    @ConvertedParameter(index = 1, name = "name")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        this.name = name;
        this.connection = connection;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "maxLocks")
    public Object limit(RuntimeEnv env, Object... args) {
        Object maxLocks = assignParameter(args, 0, false);
        this.maxLocks = maxLocks;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "releaseAfter")
    public Object releaseAfter(RuntimeEnv env, Object... args) {
        Object releaseAfter = assignParameter(args, 0, false);
        this.releaseAfter = this.secondsUntil(env, releaseAfter);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "timeout")
    public Object block(RuntimeEnv env, Object... args) {
        Object timeout = assignParameter(args, 0, false);
        this.timeout = timeout;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    @ConvertedParameter(
        index = 1,
        name = "failure",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object then(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object failure = assignParameter(args, 1, true);
        if (null == failure) {
            failure = ZVal.getNull();
        }
        ReferenceContainer e = new BasicReferenceContainer(null);
        try {
            return ZVal.assign(
                    env.callMethod(
                            new ConcurrencyLimiter(
                                    env,
                                    this.connection,
                                    this.name,
                                    this.maxLocks,
                                    this.releaseAfter),
                            "block",
                            ConcurrencyLimiterBuilder.class,
                            this.timeout,
                            callback));
        } catch (ConvertedException convertedException57) {
            if (convertedException57.instanceOf(
                    LimiterTimeoutException.class,
                    "Illuminate\\Contracts\\Redis\\LimiterTimeoutException")) {
                e.setObject(convertedException57.getObject());
                if (ZVal.isTrue(failure)) {
                    return ZVal.assign(
                            env.callFunctionDynamic(
                                            failure,
                                            new RuntimeArgsWithReferences().add(0, e),
                                            e.getObject())
                                    .value());
                }

                throw ZVal.getException(env, e.getObject());
            } else {
                throw convertedException57;
            }
        }
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
                                                env.callMethod(
                                                        delay,
                                                        "getTimestamp",
                                                        ConcurrencyLimiterBuilder.class),
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
                        ? env.callMethod(delay, "getTimestamp", ConcurrencyLimiterBuilder.class)
                        : env.callMethod(
                                env.callMethod(
                                        Carbon.runtimeStaticObject.now(env),
                                        "addSeconds",
                                        ConcurrencyLimiterBuilder.class,
                                        delay),
                                "getTimestamp",
                                ConcurrencyLimiterBuilder.class));
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
                            ConcurrencyLimiterBuilder.class,
                            delay.getObject()));
        }

        return ZVal.assign(delay.getObject());
    }

    @ConvertedMethod
    protected Object currentTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        Carbon.runtimeStaticObject.now(env),
                        "getTimestamp",
                        ConcurrencyLimiterBuilder.class));
    }

    public static final Object CONST_class =
            "Illuminate\\Redis\\Limiters\\ConcurrencyLimiterBuilder";

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
                    .setName("Illuminate\\Redis\\Limiters\\ConcurrencyLimiterBuilder")
                    .setLookup(
                            ConcurrencyLimiterBuilder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("connection", "maxLocks", "name", "releaseAfter", "timeout")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Redis/Limiters/ConcurrencyLimiterBuilder.php")
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
