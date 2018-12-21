package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Debug.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.KernelEvents;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Debug/TraceableEventDispatcher.php

*/

public class TraceableEventDispatcher
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Symfony
                .namespaces
                .Component
                .namespaces
                .EventDispatcher
                .namespaces
                .Debug
                .classes
                .TraceableEventDispatcher {

    public TraceableEventDispatcher(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TraceableEventDispatcher.class) {
            this.__construct(env, args);
        }
    }

    public TraceableEventDispatcher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    @ConvertedParameter(
        index = 1,
        name = "event",
        typeHint = "Symfony\\Component\\EventDispatcher\\Event"
    )
    protected Object preDispatch(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object eventName = assignParameter(args, 0, false);
        Object event = assignParameter(args, 1, false);
        Object e = null;
        Object token = null;
        SwitchEnumType127 switchVariable127 =
                ZVal.getEnum(
                        eventName,
                        SwitchEnumType127.DEFAULT_CASE,
                        SwitchEnumType127.DYNAMIC_TYPE_384,
                        KernelEvents.CONST_REQUEST,
                        SwitchEnumType127.DYNAMIC_TYPE_385,
                        KernelEvents.CONST_VIEW,
                        SwitchEnumType127.DYNAMIC_TYPE_386,
                        KernelEvents.CONST_RESPONSE,
                        SwitchEnumType127.DYNAMIC_TYPE_387,
                        KernelEvents.CONST_TERMINATE);
        switch (switchVariable127) {
            case DYNAMIC_TYPE_384:
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("stopwatch").value(),
                        "openSection",
                        TraceableEventDispatcher.class);
                break;
            case DYNAMIC_TYPE_385:
            case DYNAMIC_TYPE_386:
                if (ZVal.isTrue(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("stopwatch").value(),
                                "isStarted",
                                TraceableEventDispatcher.class,
                                "controller"))) {
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("stopwatch").value(),
                            "stop",
                            TraceableEventDispatcher.class,
                            "controller");
                }

                break;
            case DYNAMIC_TYPE_387:
                token =
                        env.callMethod(
                                toObjectR(
                                                env.callMethod(
                                                        event,
                                                        "getResponse",
                                                        TraceableEventDispatcher.class))
                                        .accessProp(this, env)
                                        .name("headers")
                                        .value(),
                                "get",
                                TraceableEventDispatcher.class,
                                "X-Debug-Token");
                try {
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("stopwatch").value(),
                            "openSection",
                            TraceableEventDispatcher.class,
                            token);
                } catch (ConvertedException convertedException279) {
                    if (convertedException279.instanceOf(LogicException.class, "LogicException")) {
                        e = convertedException279.getObject();
                    } else {
                        throw convertedException279;
                    }
                }

                break;
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    @ConvertedParameter(
        index = 1,
        name = "event",
        typeHint = "Symfony\\Component\\EventDispatcher\\Event"
    )
    protected Object postDispatch(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object eventName = assignParameter(args, 0, false);
        Object event = assignParameter(args, 1, false);
        Object e = null;
        Object token = null;
        SwitchEnumType128 switchVariable128 =
                ZVal.getEnum(
                        eventName,
                        SwitchEnumType128.DEFAULT_CASE,
                        SwitchEnumType128.DYNAMIC_TYPE_388,
                        KernelEvents.CONST_CONTROLLER_ARGUMENTS,
                        SwitchEnumType128.DYNAMIC_TYPE_389,
                        KernelEvents.CONST_RESPONSE,
                        SwitchEnumType128.DYNAMIC_TYPE_390,
                        KernelEvents.CONST_TERMINATE);
        switch (switchVariable128) {
            case DYNAMIC_TYPE_388:
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("stopwatch").value(),
                        "start",
                        TraceableEventDispatcher.class,
                        "controller",
                        "section");
                break;
            case DYNAMIC_TYPE_389:
                token =
                        env.callMethod(
                                toObjectR(
                                                env.callMethod(
                                                        event,
                                                        "getResponse",
                                                        TraceableEventDispatcher.class))
                                        .accessProp(this, env)
                                        .name("headers")
                                        .value(),
                                "get",
                                TraceableEventDispatcher.class,
                                "X-Debug-Token");
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("stopwatch").value(),
                        "stopSection",
                        TraceableEventDispatcher.class,
                        token);
                break;
            case DYNAMIC_TYPE_390:
                token =
                        env.callMethod(
                                toObjectR(
                                                env.callMethod(
                                                        event,
                                                        "getResponse",
                                                        TraceableEventDispatcher.class))
                                        .accessProp(this, env)
                                        .name("headers")
                                        .value(),
                                "get",
                                TraceableEventDispatcher.class,
                                "X-Debug-Token");
                try {
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("stopwatch").value(),
                            "stopSection",
                            TraceableEventDispatcher.class,
                            token);
                } catch (ConvertedException convertedException280) {
                    if (convertedException280.instanceOf(LogicException.class, "LogicException")) {
                        e = convertedException280.getObject();
                    } else {
                        throw convertedException280;
                    }
                }

                break;
        }
        ;
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Debug\\TraceableEventDispatcher";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Symfony
                    .namespaces
                    .Component
                    .namespaces
                    .EventDispatcher
                    .namespaces
                    .Debug
                    .classes
                    .TraceableEventDispatcher
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\Debug\\TraceableEventDispatcher")
                    .setLookup(
                            TraceableEventDispatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "called",
                            "dispatcher",
                            "logger",
                            "orphanedEvents",
                            "stopwatch",
                            "wrappedListeners")
                    .setFilename("vendor/symfony/http-kernel/Debug/TraceableEventDispatcher.php")
                    .addInterface(
                            "Symfony\\Component\\EventDispatcher\\Debug\\TraceableEventDispatcherInterface")
                    .addInterface("Symfony\\Component\\EventDispatcher\\EventDispatcherInterface")
                    .addExtendsClass(
                            "Symfony\\Component\\EventDispatcher\\Debug\\TraceableEventDispatcher")
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

    private enum SwitchEnumType127 {
        DYNAMIC_TYPE_384,
        DYNAMIC_TYPE_385,
        DYNAMIC_TYPE_386,
        DYNAMIC_TYPE_387,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType128 {
        DYNAMIC_TYPE_388,
        DYNAMIC_TYPE_389,
        DYNAMIC_TYPE_390,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
