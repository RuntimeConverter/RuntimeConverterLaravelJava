package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.namespaces.Debug.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.namespaces.Debug.classes.TraceableEventDispatcherInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_uasort;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.nativeClasses.spl.datastructures.SplObjectStorage;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.namespaces.Debug.classes.WrappedListener;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes.Event;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/event-dispatcher/Debug/TraceableEventDispatcher.php

*/

public class TraceableEventDispatcher extends RuntimeClassBase
        implements TraceableEventDispatcherInterface {

    public Object logger = null;

    public Object stopwatch = null;

    public Object called = null;

    public Object dispatcher = null;

    public Object wrappedListeners = null;

    public Object orphanedEvents = null;

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
    @ConvertedParameter(
        index = 0,
        name = "dispatcher",
        typeHint = "Symfony\\Component\\EventDispatcher\\EventDispatcherInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "stopwatch",
        typeHint = "Symfony\\Component\\Stopwatch\\Stopwatch"
    )
    @ConvertedParameter(
        index = 2,
        name = "logger",
        typeHint = "Psr\\Log\\LoggerInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object dispatcher = assignParameter(args, 0, false);
        Object stopwatch = assignParameter(args, 1, false);
        Object logger = assignParameter(args, 2, true);
        if (null == logger) {
            logger = ZVal.getNull();
        }
        this.dispatcher = dispatcher;
        this.stopwatch = stopwatch;
        this.logger = logger;
        this.called = ZVal.newArray();
        this.wrappedListeners = ZVal.newArray();
        this.orphanedEvents = ZVal.newArray();
        return null;
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
        env.callMethod(
                this.dispatcher,
                "addListener",
                TraceableEventDispatcher.class,
                eventName,
                listener,
                priority);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "subscriber",
        typeHint = "Symfony\\Component\\EventDispatcher\\EventSubscriberInterface"
    )
    public Object addSubscriber(RuntimeEnv env, Object... args) {
        Object subscriber = assignParameter(args, 0, false);
        env.callMethod(
                this.dispatcher, "addSubscriber", TraceableEventDispatcher.class, subscriber);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    @ConvertedParameter(index = 1, name = "listener")
    public Object removeListener(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object eventName = assignParameter(args, 0, false);
        Object listener = assignParameter(args, 1, false);
        Object wrappedListener = null;
        Object index = null;
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "wrappedListeners", env),
                env,
                eventName)) {
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult1799 :
                    ZVal.getIterable(
                            new ReferenceClassProperty(this, "wrappedListeners", env)
                                    .arrayGet(env, eventName),
                            env,
                            false)) {
                index = ZVal.assign(zpairResult1799.getKey());
                wrappedListener = ZVal.assign(zpairResult1799.getValue());
                if (ZVal.strictEqualityCheck(
                        env.callMethod(
                                wrappedListener,
                                "getWrappedListener",
                                TraceableEventDispatcher.class),
                        "===",
                        listener)) {
                    listener = ZVal.assign(wrappedListener);
                    arrayActionR(
                            ArrayAction.UNSET,
                            new ReferenceClassProperty(this, "wrappedListeners", env),
                            env,
                            eventName,
                            index);
                    break;
                }
            }
        }

        return ZVal.assign(
                env.callMethod(
                        this.dispatcher,
                        "removeListener",
                        TraceableEventDispatcher.class,
                        eventName,
                        listener));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "subscriber",
        typeHint = "Symfony\\Component\\EventDispatcher\\EventSubscriberInterface"
    )
    public Object removeSubscriber(RuntimeEnv env, Object... args) {
        Object subscriber = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this.dispatcher,
                        "removeSubscriber",
                        TraceableEventDispatcher.class,
                        subscriber));
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
                        TraceableEventDispatcher.class,
                        eventName));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    @ConvertedParameter(index = 1, name = "listener")
    public Object getListenerPriority(RuntimeEnv env, Object... args) {
        Object eventName = assignParameter(args, 0, false);
        Object listener = assignParameter(args, 1, false);
        Object wrappedListener = null;
        Object index = null;
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "wrappedListeners", env),
                env,
                eventName)) {
            for (ZPair zpairResult1800 :
                    ZVal.getIterable(
                            new ReferenceClassProperty(this, "wrappedListeners", env)
                                    .arrayGet(env, eventName),
                            env,
                            false)) {
                index = ZVal.assign(zpairResult1800.getKey());
                wrappedListener = ZVal.assign(zpairResult1800.getValue());
                if (ZVal.strictEqualityCheck(
                        env.callMethod(
                                wrappedListener,
                                "getWrappedListener",
                                TraceableEventDispatcher.class),
                        "===",
                        listener)) {
                    return ZVal.assign(
                            env.callMethod(
                                    this.dispatcher,
                                    "getListenerPriority",
                                    TraceableEventDispatcher.class,
                                    eventName,
                                    wrappedListener));
                }
            }
        }

        return ZVal.assign(
                env.callMethod(
                        this.dispatcher,
                        "getListenerPriority",
                        TraceableEventDispatcher.class,
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
                        TraceableEventDispatcher.class,
                        eventName));
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
        Object e = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", event)) {
            event = new Event(env);
        }

        if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.logger))
                && ZVal.toBool(
                        env.callMethod(
                                event, "isPropagationStopped", TraceableEventDispatcher.class))) {
            env.callMethod(
                    this.logger,
                    "debug",
                    TraceableEventDispatcher.class,
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "The \"%s\" event is already stopped. No listeners have been called.",
                                    eventName)
                            .value());
        }

        this.preProcess(env, eventName);
        this.preDispatch(env, eventName, event);
        e =
                env.callMethod(
                        this.stopwatch,
                        "start",
                        TraceableEventDispatcher.class,
                        eventName,
                        "section");
        env.callMethod(
                this.dispatcher, "dispatch", TraceableEventDispatcher.class, eventName, event);
        if (ZVal.isTrue(env.callMethod(e, "isStarted", TraceableEventDispatcher.class))) {
            env.callMethod(e, "stop", TraceableEventDispatcher.class);
        }

        this.postDispatch(env, eventName, event);
        this.postProcess(env, eventName);
        return ZVal.assign(event);
    }

    @ConvertedMethod
    public Object getCalledListeners(RuntimeEnv env, Object... args) {
        ReferenceContainer called = new BasicReferenceContainer(null);
        Object listeners = null;
        Object listener = null;
        Object eventName = null;
        called.setObject(ZVal.newArray());
        for (ZPair zpairResult1801 : ZVal.getIterable(this.called, env, false)) {
            eventName = ZVal.assign(zpairResult1801.getKey());
            listeners = ZVal.assign(zpairResult1801.getValue());
            for (ZPair zpairResult1802 : ZVal.getIterable(listeners, env, true)) {
                listener = ZVal.assign(zpairResult1802.getValue());
                called.arrayAccess(
                                env,
                                toStringR(eventName, env)
                                        + "."
                                        + toStringR(
                                                env.callMethod(
                                                        listener,
                                                        "getPretty",
                                                        TraceableEventDispatcher.class),
                                                env))
                        .set(
                                env.callMethod(
                                        listener,
                                        "getInfo",
                                        TraceableEventDispatcher.class,
                                        eventName));
            }
        }

        return ZVal.assign(called.getObject());
    }

    @ConvertedMethod
    public Object getNotCalledListeners(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object called = null;
        Object listeners = null;
        Object e = null;
        Object listener = null;
        Object eventName = null;
        Object allListeners = null;
        ReferenceContainer notCalled = new BasicReferenceContainer(null);
        Object l = null;
        try {
            allListeners = this.getListeners(env);
        } catch (ConvertedException convertedException253) {
            if (convertedException253.instanceOf(PHPException.class, "Exception")) {
                e = convertedException253.getObject();
                if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.logger)) {
                    env.callMethod(
                            this.logger,
                            "info",
                            TraceableEventDispatcher.class,
                            "An exception was thrown while getting the uncalled listeners.",
                            ZVal.newArray(new ZPair("exception", e)));
                }

                return ZVal.assign(ZVal.newArray());
            } else {
                throw convertedException253;
            }
        }

        notCalled.setObject(ZVal.newArray());
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1803 : ZVal.getIterable(allListeners, env, false)) {
            eventName = ZVal.assign(zpairResult1803.getKey());
            listeners = ZVal.assign(zpairResult1803.getValue());
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult1804 : ZVal.getIterable(listeners, env, true)) {
                listener = ZVal.assign(zpairResult1804.getValue());
                called = false;
                if (arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "called", env),
                        env,
                        eventName)) {
                    runtimeConverterBreakCount = 0;
                    for (ZPair zpairResult1805 :
                            ZVal.getIterable(
                                    new ReferenceClassProperty(this, "called", env)
                                            .arrayGet(env, eventName),
                                    env,
                                    true)) {
                        l = ZVal.assign(zpairResult1805.getValue());
                        if (ZVal.strictEqualityCheck(
                                env.callMethod(
                                        l, "getWrappedListener", TraceableEventDispatcher.class),
                                "===",
                                listener)) {
                            called = true;
                            break;
                        }
                    }
                }

                if (!ZVal.isTrue(called)) {
                    if (!ZVal.isTrue(
                            ZVal.checkInstanceType(
                                    listener,
                                    WrappedListener.class,
                                    "Symfony\\Component\\EventDispatcher\\Debug\\WrappedListener"))) {
                        listener =
                                new WrappedListener(
                                        env, listener, ZVal.getNull(), this.stopwatch, this);
                    }

                    notCalled
                            .arrayAccess(
                                    env,
                                    toStringR(eventName, env)
                                            + "."
                                            + toStringR(
                                                    env.callMethod(
                                                            listener,
                                                            "getPretty",
                                                            TraceableEventDispatcher.class),
                                                    env))
                            .set(
                                    env.callMethod(
                                            listener,
                                            "getInfo",
                                            TraceableEventDispatcher.class,
                                            eventName));
                }
            }
        }

        function_uasort
                .f
                .env(env)
                .call(
                        notCalled.getObject(),
                        ZVal.newArray(new ZPair(0, this), new ZPair(1, "sortListenersByPriority")));
        return ZVal.assign(notCalled.getObject());
    }

    @ConvertedMethod
    public Object getOrphanedEvents(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.orphanedEvents);
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        this.called = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "arguments")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, false);
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                ZVal.newArray(new ZPair(0, this.dispatcher), new ZPair(1, method)),
                                arguments)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    @ConvertedParameter(
        index = 1,
        name = "event",
        typeHint = "Symfony\\Component\\EventDispatcher\\Event"
    )
    protected Object preDispatch(RuntimeEnv env, Object... args) {
        Object eventName = assignParameter(args, 0, false);
        Object event = assignParameter(args, 1, false);
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
        Object eventName = assignParameter(args, 0, false);
        Object event = assignParameter(args, 1, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    private Object preProcess(RuntimeEnv env, Object... args) {
        Object eventName = assignParameter(args, 0, false);
        Object wrappedListener = null;
        Object listener = null;
        Object priority = null;
        if (!ZVal.isTrue(
                env.callMethod(
                        this.dispatcher,
                        "hasListeners",
                        TraceableEventDispatcher.class,
                        eventName))) {
            new ReferenceClassProperty(this, "orphanedEvents", env).arrayAppend(env).set(eventName);
            return null;
        }

        for (ZPair zpairResult1806 :
                ZVal.getIterable(
                        env.callMethod(
                                this.dispatcher,
                                "getListeners",
                                TraceableEventDispatcher.class,
                                eventName),
                        env,
                        true)) {
            listener = ZVal.assign(zpairResult1806.getValue());
            priority = this.getListenerPriority(env, eventName, listener);
            wrappedListener =
                    new WrappedListener(env, listener, ZVal.getNull(), this.stopwatch, this);
            new ReferenceClassProperty(this, "wrappedListeners", env)
                    .arrayAppend(env, eventName)
                    .set(wrappedListener);
            env.callMethod(
                    this.dispatcher,
                    "removeListener",
                    TraceableEventDispatcher.class,
                    eventName,
                    listener);
            env.callMethod(
                    this.dispatcher,
                    "addListener",
                    TraceableEventDispatcher.class,
                    eventName,
                    wrappedListener,
                    priority);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    private Object postProcess(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object eventName = assignParameter(args, 0, false);
        Object listener = null;
        Object context = null;
        Object priority = null;
        Object skipped = null;
        arrayActionR(
                ArrayAction.UNSET,
                new ReferenceClassProperty(this, "wrappedListeners", env),
                env,
                eventName);
        skipped = false;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1807 :
                ZVal.getIterable(
                        env.callMethod(
                                this.dispatcher,
                                "getListeners",
                                TraceableEventDispatcher.class,
                                eventName),
                        env,
                        true)) {
            listener = ZVal.assign(zpairResult1807.getValue());
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            listener,
                            WrappedListener.class,
                            "Symfony\\Component\\EventDispatcher\\Debug\\WrappedListener"))) {
                continue;
            }

            priority = this.getListenerPriority(env, eventName, listener);
            env.callMethod(
                    this.dispatcher,
                    "removeListener",
                    TraceableEventDispatcher.class,
                    eventName,
                    listener);
            env.callMethod(
                    this.dispatcher,
                    "addListener",
                    TraceableEventDispatcher.class,
                    eventName,
                    env.callMethod(listener, "getWrappedListener", TraceableEventDispatcher.class),
                    priority);
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.logger)) {
                context =
                        ZVal.newArray(
                                new ZPair("event", eventName),
                                new ZPair(
                                        "listener",
                                        env.callMethod(
                                                listener,
                                                "getPretty",
                                                TraceableEventDispatcher.class)));
            }

            if (ZVal.isTrue(
                    env.callMethod(listener, "wasCalled", TraceableEventDispatcher.class))) {
                if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.logger)) {
                    env.callMethod(
                            this.logger,
                            "debug",
                            TraceableEventDispatcher.class,
                            "Notified event \"{event}\" to listener \"{listener}\".",
                            context);
                }

                if (!arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "called", env),
                        env,
                        eventName)) {
                    new ReferenceClassProperty(this, "called", env)
                            .arrayAccess(env, eventName)
                            .set(new SplObjectStorage(env));
                }

                env.callMethod(
                        new ReferenceClassProperty(this, "called", env).arrayGet(env, eventName),
                        "attach",
                        TraceableEventDispatcher.class,
                        listener);
            }

            if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.logger))
                    && ZVal.toBool(skipped)) {
                env.callMethod(
                        this.logger,
                        "debug",
                        TraceableEventDispatcher.class,
                        "Listener \"{listener}\" was not called for event \"{event}\".",
                        context);
            }

            if (ZVal.isTrue(
                    env.callMethod(
                            listener, "stoppedPropagation", TraceableEventDispatcher.class))) {
                if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.logger)) {
                    env.callMethod(
                            this.logger,
                            "debug",
                            TraceableEventDispatcher.class,
                            "Listener \"{listener}\" stopped propagation of the event \"{event}\".",
                            context);
                }

                skipped = true;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "a")
    @ConvertedParameter(index = 1, name = "b")
    private Object sortListenersByPriority(RuntimeEnv env, Object... args) {
        ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer b = new BasicReferenceContainer(assignParameter(args, 1, false));
        if (ZVal.toBool(function_is_int.f.env(env).call(a.arrayGet(env, "priority")).value())
                && ZVal.toBool(
                        !function_is_int.f.env(env).call(b.arrayGet(env, "priority")).getBool())) {
            return 1;
        }

        if (ZVal.toBool(!function_is_int.f.env(env).call(a.arrayGet(env, "priority")).getBool())
                && ZVal.toBool(
                        function_is_int.f.env(env).call(b.arrayGet(env, "priority")).value())) {
            return -1;
        }

        if (ZVal.strictEqualityCheck(
                a.arrayGet(env, "priority"), "===", b.arrayGet(env, "priority"))) {
            return 0;
        }

        if (ZVal.isGreaterThan(a.arrayGet(env, "priority"), '>', b.arrayGet(env, "priority"))) {
            return -1;
        }

        return 1;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\EventDispatcher\\Debug\\TraceableEventDispatcher";

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
                    .setName("Symfony\\Component\\EventDispatcher\\Debug\\TraceableEventDispatcher")
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
                    .setFilename(
                            "vendor/symfony/event-dispatcher/Debug/TraceableEventDispatcher.php")
                    .addInterface(
                            "Symfony\\Component\\EventDispatcher\\Debug\\TraceableEventDispatcherInterface")
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
