package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.namespaces.Debug.classes.TraceableEventDispatcherInterface;
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
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.namespaces.Debug.classes.TraceableEventDispatcher;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/DataCollector/EventDataCollector.php

*/

public class EventDataCollector extends DataCollector implements LateDataCollectorInterface {

    public Object dispatcher = null;

    public EventDataCollector(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == EventDataCollector.class) {
            this.__construct(env, args);
        }
    }

    public EventDataCollector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "dispatcher",
        typeHint = "Symfony\\Component\\EventDispatcher\\EventDispatcherInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object dispatcher = assignParameter(args, 0, true);
        if (null == dispatcher) {
            dispatcher = ZVal.getNull();
        }
        this.dispatcher = dispatcher;
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
        toObjectR(this)
                .accessProp(this, env)
                .name("data")
                .set(
                        ZVal.newArray(
                                new ZPair("called_listeners", ZVal.newArray()),
                                new ZPair("not_called_listeners", ZVal.newArray()),
                                new ZPair("orphaned_events", ZVal.newArray())));
        return null;
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("data").set(ZVal.newArray());
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.dispatcher,
                        TraceableEventDispatcherInterface.class,
                        "Symfony\\Component\\EventDispatcher\\Debug\\TraceableEventDispatcherInterface"))) {
            env.callMethod(this.dispatcher, "reset", EventDataCollector.class);
        }

        return null;
    }

    @ConvertedMethod
    public Object lateCollect(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.dispatcher,
                        TraceableEventDispatcherInterface.class,
                        "Symfony\\Component\\EventDispatcher\\Debug\\TraceableEventDispatcherInterface"))) {
            this.setCalledListeners(
                    env,
                    env.callMethod(
                            this.dispatcher, "getCalledListeners", EventDataCollector.class));
            this.setNotCalledListeners(
                    env,
                    env.callMethod(
                            this.dispatcher, "getNotCalledListeners", EventDataCollector.class));
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.dispatcher,
                        TraceableEventDispatcher.class,
                        "Symfony\\Component\\EventDispatcher\\Debug\\TraceableEventDispatcher"))) {
            this.setOrphanedEvents(
                    env,
                    env.callMethod(this.dispatcher, "getOrphanedEvents", EventDataCollector.class));
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("data")
                .set(
                        env.callMethod(
                                this,
                                "cloneVar",
                                EventDataCollector.class,
                                toObjectR(this).accessProp(this, env).name("data").value()));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "listeners", typeHint = "array")
    public Object setCalledListeners(RuntimeEnv env, Object... args) {
        Object listeners = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "data", env)
                .arrayAccess(env, "called_listeners")
                .set(listeners);
        return null;
    }

    @ConvertedMethod
    public Object getCalledListeners(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env).arrayGet(env, "called_listeners"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "listeners", typeHint = "array")
    public Object setNotCalledListeners(RuntimeEnv env, Object... args) {
        Object listeners = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "data", env)
                .arrayAccess(env, "not_called_listeners")
                .set(listeners);
        return null;
    }

    @ConvertedMethod
    public Object getNotCalledListeners(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env)
                        .arrayGet(env, "not_called_listeners"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "events", typeHint = "array")
    public Object setOrphanedEvents(RuntimeEnv env, Object... args) {
        Object events = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "data", env)
                .arrayAccess(env, "orphaned_events")
                .set(events);
        return null;
    }

    @ConvertedMethod
    public Object getOrphanedEvents(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env).arrayGet(env, "orphaned_events"));
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "events";
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\DataCollector\\EventDataCollector";

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
                    .setName("Symfony\\Component\\HttpKernel\\DataCollector\\EventDataCollector")
                    .setLookup(
                            EventDataCollector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cloner", "data", "dispatcher")
                    .setFilename("vendor/symfony/http-kernel/DataCollector/EventDataCollector.php")
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
