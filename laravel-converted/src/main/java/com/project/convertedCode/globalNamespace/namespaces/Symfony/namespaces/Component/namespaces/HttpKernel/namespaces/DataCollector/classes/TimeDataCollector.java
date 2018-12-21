package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes.DataCollector;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes.LateDataCollectorInterface;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/DataCollector/TimeDataCollector.php

*/

public class TimeDataCollector extends DataCollector implements LateDataCollectorInterface {

    public Object kernel = null;

    public Object stopwatch = null;

    public TimeDataCollector(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TimeDataCollector.class) {
            this.__construct(env, args);
        }
    }

    public TimeDataCollector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "kernel",
        typeHint = "Symfony\\Component\\HttpKernel\\KernelInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "stopwatch",
        typeHint = "Symfony\\Component\\Stopwatch\\Stopwatch",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object kernel = assignParameter(args, 0, true);
        if (null == kernel) {
            kernel = ZVal.getNull();
        }
        Object stopwatch = assignParameter(args, 1, true);
        if (null == stopwatch) {
            stopwatch = ZVal.getNull();
        }
        this.kernel = kernel;
        this.stopwatch = stopwatch;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 1,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    @ConvertedParameter(
        index = 2,
        name = "exception",
        typeHint = "Exception",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object collect(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        Object exception = assignParameter(args, 2, true);
        if (null == exception) {
            exception = ZVal.getNull();
        }
        Object startTime = null;
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.kernel)) {
            startTime = env.callMethod(this.kernel, "getStartTime", TimeDataCollector.class);

        } else {
            startTime =
                    env.callMethod(
                            toObjectR(request).accessProp(this, env).name("server").value(),
                            "get",
                            TimeDataCollector.class,
                            "REQUEST_TIME_FLOAT");
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("data")
                .set(
                        ZVal.newArray(
                                new ZPair(
                                        "token",
                                        env.callMethod(
                                                toObjectR(response)
                                                        .accessProp(this, env)
                                                        .name("headers")
                                                        .value(),
                                                "get",
                                                TimeDataCollector.class,
                                                "X-Debug-Token")),
                                new ZPair("start_time", ZVal.multiply(startTime, 1000)),
                                new ZPair("events", ZVal.newArray())));
        return null;
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("data").set(ZVal.newArray());
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.stopwatch)) {
            env.callMethod(this.stopwatch, "reset", TimeDataCollector.class);
        }

        return null;
    }

    @ConvertedMethod
    public Object lateCollect(RuntimeEnv env, Object... args) {
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.stopwatch))
                && ZVal.toBool(
                        arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "data", env),
                                env,
                                "token"))) {
            this.setEvents(
                    env,
                    env.callMethod(
                            this.stopwatch,
                            "getSectionEvents",
                            TimeDataCollector.class,
                            new ReferenceClassProperty(this, "data", env).arrayGet(env, "token")));
        }

        arrayActionR(
                ArrayAction.UNSET, new ReferenceClassProperty(this, "data", env), env, "token");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "events", typeHint = "array")
    public Object setEvents(RuntimeEnv env, Object... args) {
        Object events = assignParameter(args, 0, false);
        Object event = null;
        for (ZPair zpairResult1924 : ZVal.getIterable(events, env, true)) {
            event = ZVal.assign(zpairResult1924.getValue());
            env.callMethod(event, "ensureStopped", TimeDataCollector.class);
        }

        new ReferenceClassProperty(this, "data", env).arrayAccess(env, "events").set(events);
        return null;
    }

    @ConvertedMethod
    public Object getEvents(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ReferenceClassProperty(this, "data", env).arrayGet(env, "events"));
    }

    @ConvertedMethod
    public Object getDuration(RuntimeEnv env, Object... args) {
        Object lastEvent = null;
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "data", env),
                env,
                "events",
                "__section__")) {
            return 0;
        }

        lastEvent =
                ZVal.assign(
                        new ReferenceClassProperty(this, "data", env)
                                .arrayGet(env, "events", "__section__"));
        return ZVal.assign(
                ZVal.subtract(
                        ZVal.add(
                                env.callMethod(lastEvent, "getOrigin", TimeDataCollector.class),
                                env.callMethod(lastEvent, "getDuration", TimeDataCollector.class)),
                        this.getStartTime(env)));
    }

    @ConvertedMethod
    public Object getInitTime(RuntimeEnv env, Object... args) {
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "data", env),
                env,
                "events",
                "__section__")) {
            return 0;
        }

        return ZVal.assign(
                ZVal.subtract(
                        env.callMethod(
                                new ReferenceClassProperty(this, "data", env)
                                        .arrayGet(env, "events", "__section__"),
                                "getOrigin",
                                TimeDataCollector.class),
                        this.getStartTime(env)));
    }

    @ConvertedMethod
    public Object getStartTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env).arrayGet(env, "start_time"));
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "time";
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\DataCollector\\TimeDataCollector";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends DataCollector.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\DataCollector\\TimeDataCollector")
                    .setLookup(
                            TimeDataCollector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cloner", "data", "kernel", "stopwatch")
                    .setFilename("vendor/symfony/http-kernel/DataCollector/TimeDataCollector.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\DataCollector\\LateDataCollectorInterface")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\DataCollector\\DataCollectorInterface")
                    .addInterface("Serializable")
                    .addExtendsClass("Symfony\\Component\\HttpKernel\\DataCollector\\DataCollector")
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
