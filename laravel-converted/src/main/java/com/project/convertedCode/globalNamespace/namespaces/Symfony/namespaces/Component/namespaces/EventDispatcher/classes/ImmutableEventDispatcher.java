package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes.EventDispatcherInterface;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/event-dispatcher/ImmutableEventDispatcher.php

*/

public class ImmutableEventDispatcher extends RuntimeClassBase implements EventDispatcherInterface {

    public Object dispatcher = null;

    public ImmutableEventDispatcher(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ImmutableEventDispatcher.class) {
            this.__construct(env, args);
        }
    }

    public ImmutableEventDispatcher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "dispatcher",
        typeHint = "Symfony\\Component\\EventDispatcher\\EventDispatcherInterface"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object dispatcher = assignParameter(args, 0, false);
        this.dispatcher = dispatcher;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    @ConvertedParameter(
        index = 1,
        name = "event",
        typeHint = "Symfony\\Component\\EventDispatcher\\Event",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object dispatch(RuntimeEnv env, Object... args) {
        Object eventName = assignParameter(args, 0, false);
        Object event = assignParameter(args, 1, true);
        if (null == event) {
            event = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        this.dispatcher,
                        "dispatch",
                        ImmutableEventDispatcher.class,
                        eventName,
                        event));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    @ConvertedParameter(index = 1, name = "listener")
    @ConvertedParameter(
        index = 2,
        name = "priority",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object addListener(RuntimeEnv env, Object... args) {
        Object eventName = assignParameter(args, 0, false);
        Object listener = assignParameter(args, 1, false);
        Object priority = assignParameter(args, 2, true);
        if (null == priority) {
            priority = 0;
        }
        throw ZVal.getException(
                env,
                new BadMethodCallException(
                        env, "Unmodifiable event dispatchers must not be modified."));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "subscriber",
        typeHint = "Symfony\\Component\\EventDispatcher\\EventSubscriberInterface"
    )
    public Object addSubscriber(RuntimeEnv env, Object... args) {
        Object subscriber = assignParameter(args, 0, false);
        throw ZVal.getException(
                env,
                new BadMethodCallException(
                        env, "Unmodifiable event dispatchers must not be modified."));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    @ConvertedParameter(index = 1, name = "listener")
    public Object removeListener(RuntimeEnv env, Object... args) {
        Object eventName = assignParameter(args, 0, false);
        Object listener = assignParameter(args, 1, false);
        throw ZVal.getException(
                env,
                new BadMethodCallException(
                        env, "Unmodifiable event dispatchers must not be modified."));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "subscriber",
        typeHint = "Symfony\\Component\\EventDispatcher\\EventSubscriberInterface"
    )
    public Object removeSubscriber(RuntimeEnv env, Object... args) {
        Object subscriber = assignParameter(args, 0, false);
        throw ZVal.getException(
                env,
                new BadMethodCallException(
                        env, "Unmodifiable event dispatchers must not be modified."));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "eventName",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getListeners(RuntimeEnv env, Object... args) {
        Object eventName = assignParameter(args, 0, true);
        if (null == eventName) {
            eventName = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        this.dispatcher,
                        "getListeners",
                        ImmutableEventDispatcher.class,
                        eventName));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    @ConvertedParameter(index = 1, name = "listener")
    public Object getListenerPriority(RuntimeEnv env, Object... args) {
        Object eventName = assignParameter(args, 0, false);
        Object listener = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this.dispatcher,
                        "getListenerPriority",
                        ImmutableEventDispatcher.class,
                        eventName,
                        listener));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "eventName",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object hasListeners(RuntimeEnv env, Object... args) {
        Object eventName = assignParameter(args, 0, true);
        if (null == eventName) {
            eventName = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        this.dispatcher,
                        "hasListeners",
                        ImmutableEventDispatcher.class,
                        eventName));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\EventDispatcher\\ImmutableEventDispatcher";

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
                    .setName("Symfony\\Component\\EventDispatcher\\ImmutableEventDispatcher")
                    .setLookup(
                            ImmutableEventDispatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("dispatcher")
                    .setFilename("vendor/symfony/event-dispatcher/ImmutableEventDispatcher.php")
                    .addInterface("Symfony\\Component\\EventDispatcher\\EventDispatcherInterface")
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
