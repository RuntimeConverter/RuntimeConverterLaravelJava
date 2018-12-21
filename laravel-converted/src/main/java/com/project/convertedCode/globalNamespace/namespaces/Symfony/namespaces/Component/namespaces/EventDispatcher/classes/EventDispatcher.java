package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes.EventDispatcherInterface;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_krsort;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes.Event;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/event-dispatcher/EventDispatcher.php

*/

public class EventDispatcher extends RuntimeClassBase implements EventDispatcherInterface {

    public Object listeners = ZVal.newArray();

    public Object sorted = ZVal.newArray();

    public EventDispatcher(RuntimeEnv env, Object... args) {
        super(env);
    }

    public EventDispatcher(NoConstructor n) {
        super(n);
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
        Object listeners = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", event)) {
            event = new Event(env);
        }

        if (ZVal.isTrue(listeners = this.getListeners(env, eventName))) {
            this.doDispatch(env, listeners, eventName, event);
        }

        return ZVal.assign(event);
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
        Object eventListeners = null;
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", eventName)) {
            if (arrayActionR(
                    ArrayAction.EMPTY,
                    new ReferenceClassProperty(this, "listeners", env),
                    env,
                    eventName)) {
                return ZVal.assign(ZVal.newArray());
            }

            if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "sorted", env),
                    env,
                    eventName)) {
                this.sortListeners(env, eventName);
            }

            return ZVal.assign(
                    new ReferenceClassProperty(this, "sorted", env).arrayGet(env, eventName));
        }

        for (ZPair zpairResult1812 : ZVal.getIterable(this.listeners, env, false)) {
            eventName = ZVal.assign(zpairResult1812.getKey());
            eventListeners = ZVal.assign(zpairResult1812.getValue());
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "sorted", env),
                    env,
                    eventName)) {
                this.sortListeners(env, eventName);
            }
        }

        return ZVal.assign(function_array_filter.f.env(env).call(this.sorted).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    @ConvertedParameter(index = 1, name = "listener")
    public Object getListenerPriority(RuntimeEnv env, Object... args) {
        Object eventName = assignParameter(args, 0, false);
        ReferenceContainer listener = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object listeners = null;
        ReferenceContainer v = new BasicReferenceContainer(null);
        Object k = null;
        Object priority = null;
        if (arrayActionR(
                ArrayAction.EMPTY,
                new ReferenceClassProperty(this, "listeners", env),
                env,
                eventName)) {
            return null;
        }

        if (ZVal.toBool(
                        ZVal.toBool(function_is_array.f.env(env).call(listener.getObject()).value())
                                && ZVal.toBool(arrayActionR(ArrayAction.ISSET, listener, env, 0)))
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                listener.arrayGet(env, 0), Closure.class, "Closure"))) {
            listener.arrayAccess(env, 0)
                    .set(
                            env.callFunctionDynamic(
                                            listener.arrayGet(env, 0),
                                            new RuntimeArgsWithReferences())
                                    .value());
        }

        for (ZPair zpairResult1813 :
                ZVal.getIterable(
                        new ReferenceClassProperty(this, "listeners", env).arrayGet(env, eventName),
                        env,
                        false)) {
            priority = ZVal.assign(zpairResult1813.getKey());
            listeners = ZVal.assign(zpairResult1813.getValue());
            for (ZPair zpairResult1814 : ZVal.getIterable(listeners, env, false)) {
                k = ZVal.assign(zpairResult1814.getKey());
                v.setObject(ZVal.assign(zpairResult1814.getValue()));
                if (ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.strictNotEqualityCheck(
                                                                        v.getObject(),
                                                                        "!==",
                                                                        listener.getObject()))
                                                        && ZVal.toBool(
                                                                function_is_array
                                                                        .f
                                                                        .env(env)
                                                                        .call(v.getObject())
                                                                        .value()))
                                        && ZVal.toBool(arrayActionR(ArrayAction.ISSET, v, env, 0)))
                        && ZVal.toBool(
                                ZVal.checkInstanceType(
                                        v.arrayGet(env, 0), Closure.class, "Closure"))) {
                    v.arrayAccess(env, 0)
                            .set(
                                    env.callFunctionDynamic(
                                                    v.arrayGet(env, 0),
                                                    new RuntimeArgsWithReferences())
                                            .value());
                    new ReferenceClassProperty(this, "listeners", env)
                            .arrayAccess(env, eventName, priority, k)
                            .set(v.getObject());
                }

                if (ZVal.strictEqualityCheck(v.getObject(), "===", listener.getObject())) {
                    return ZVal.assign(priority);
                }
            }
        }

        return null;
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
        Object eventListeners = null;
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", eventName)) {
            return ZVal.assign(
                    !arrayActionR(
                            ArrayAction.EMPTY,
                            new ReferenceClassProperty(this, "listeners", env),
                            env,
                            eventName));
        }

        for (ZPair zpairResult1815 : ZVal.getIterable(this.listeners, env, true)) {
            eventListeners = ZVal.assign(zpairResult1815.getValue());
            if (ZVal.isTrue(eventListeners)) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
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
        new ReferenceClassProperty(this, "listeners", env)
                .arrayAppend(env, eventName, priority)
                .set(listener);
        arrayActionR(
                ArrayAction.UNSET, new ReferenceClassProperty(this, "sorted", env), env, eventName);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    @ConvertedParameter(index = 1, name = "listener")
    public Object removeListener(RuntimeEnv env, Object... args) {
        Object eventName = assignParameter(args, 0, false);
        ReferenceContainer listener = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer listeners = new BasicReferenceContainer(null);
        ReferenceContainer v = new BasicReferenceContainer(null);
        Object k = null;
        Object priority = null;
        if (arrayActionR(
                ArrayAction.EMPTY,
                new ReferenceClassProperty(this, "listeners", env),
                env,
                eventName)) {
            return null;
        }

        if (ZVal.toBool(
                        ZVal.toBool(function_is_array.f.env(env).call(listener.getObject()).value())
                                && ZVal.toBool(arrayActionR(ArrayAction.ISSET, listener, env, 0)))
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                listener.arrayGet(env, 0), Closure.class, "Closure"))) {
            listener.arrayAccess(env, 0)
                    .set(
                            env.callFunctionDynamic(
                                            listener.arrayGet(env, 0),
                                            new RuntimeArgsWithReferences())
                                    .value());
        }

        for (ZPair zpairResult1816 :
                ZVal.getIterable(
                        new ReferenceClassProperty(this, "listeners", env).arrayGet(env, eventName),
                        env,
                        false)) {
            priority = ZVal.assign(zpairResult1816.getKey());
            listeners.setObject(ZVal.assign(zpairResult1816.getValue()));
            for (ZPair zpairResult1817 : ZVal.getIterable(listeners.getObject(), env, false)) {
                k = ZVal.assign(zpairResult1817.getKey());
                v.setObject(ZVal.assign(zpairResult1817.getValue()));
                if (ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.strictNotEqualityCheck(
                                                                        v.getObject(),
                                                                        "!==",
                                                                        listener.getObject()))
                                                        && ZVal.toBool(
                                                                function_is_array
                                                                        .f
                                                                        .env(env)
                                                                        .call(v.getObject())
                                                                        .value()))
                                        && ZVal.toBool(arrayActionR(ArrayAction.ISSET, v, env, 0)))
                        && ZVal.toBool(
                                ZVal.checkInstanceType(
                                        v.arrayGet(env, 0), Closure.class, "Closure"))) {
                    v.arrayAccess(env, 0)
                            .set(
                                    env.callFunctionDynamic(
                                                    v.arrayGet(env, 0),
                                                    new RuntimeArgsWithReferences())
                                            .value());
                }

                if (ZVal.strictEqualityCheck(v.getObject(), "===", listener.getObject())) {
                    arrayActionR(ArrayAction.UNSET, listeners, env, k);
                    arrayActionR(
                            ArrayAction.UNSET,
                            new ReferenceClassProperty(this, "sorted", env),
                            env,
                            eventName);

                } else {
                    listeners.arrayAccess(env, k).set(v.getObject());
                }
            }

            if (ZVal.isTrue(listeners.getObject())) {
                new ReferenceClassProperty(this, "listeners", env)
                        .arrayAccess(env, eventName, priority)
                        .set(listeners.getObject());

            } else {
                arrayActionR(
                        ArrayAction.UNSET,
                        new ReferenceClassProperty(this, "listeners", env),
                        env,
                        eventName,
                        priority);
            }
        }

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
        ReferenceContainer listener = new BasicReferenceContainer(null);
        Object eventName = null;
        ReferenceContainer params = new BasicReferenceContainer(null);
        for (ZPair zpairResult1818 :
                ZVal.getIterable(
                        env.callMethod(subscriber, "getSubscribedEvents", EventDispatcher.class),
                        env,
                        false)) {
            eventName = ZVal.assign(zpairResult1818.getKey());
            params.setObject(ZVal.assign(zpairResult1818.getValue()));
            if (function_is_string.f.env(env).call(params.getObject()).getBool()) {
                this.addListener(
                        env,
                        eventName,
                        ZVal.newArray(new ZPair(0, subscriber), new ZPair(1, params.getObject())));

            } else if (function_is_string.f.env(env).call(params.arrayGet(env, 0)).getBool()) {
                this.addListener(
                        env,
                        eventName,
                        ZVal.newArray(
                                new ZPair(0, subscriber), new ZPair(1, params.arrayGet(env, 0))),
                        arrayActionR(ArrayAction.ISSET, params, env, 1)
                                ? params.arrayGet(env, 1)
                                : 0);

            } else {
                for (ZPair zpairResult1819 : ZVal.getIterable(params.getObject(), env, true)) {
                    listener.setObject(ZVal.assign(zpairResult1819.getValue()));
                    this.addListener(
                            env,
                            eventName,
                            ZVal.newArray(
                                    new ZPair(0, subscriber),
                                    new ZPair(1, listener.arrayGet(env, 0))),
                            arrayActionR(ArrayAction.ISSET, listener, env, 1)
                                    ? listener.arrayGet(env, 1)
                                    : 0);
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "subscriber",
        typeHint = "Symfony\\Component\\EventDispatcher\\EventSubscriberInterface"
    )
    public Object removeSubscriber(RuntimeEnv env, Object... args) {
        Object subscriber = assignParameter(args, 0, false);
        ReferenceContainer listener = new BasicReferenceContainer(null);
        Object eventName = null;
        ReferenceContainer params = new BasicReferenceContainer(null);
        for (ZPair zpairResult1820 :
                ZVal.getIterable(
                        env.callMethod(subscriber, "getSubscribedEvents", EventDispatcher.class),
                        env,
                        false)) {
            eventName = ZVal.assign(zpairResult1820.getKey());
            params.setObject(ZVal.assign(zpairResult1820.getValue()));
            if (ZVal.toBool(function_is_array.f.env(env).call(params.getObject()).value())
                    && ZVal.toBool(
                            function_is_array.f.env(env).call(params.arrayGet(env, 0)).value())) {
                for (ZPair zpairResult1821 : ZVal.getIterable(params.getObject(), env, true)) {
                    listener.setObject(ZVal.assign(zpairResult1821.getValue()));
                    this.removeListener(
                            env,
                            eventName,
                            ZVal.newArray(
                                    new ZPair(0, subscriber),
                                    new ZPair(1, listener.arrayGet(env, 0))));
                }

            } else {
                this.removeListener(
                        env,
                        eventName,
                        ZVal.newArray(
                                new ZPair(0, subscriber),
                                new ZPair(
                                        1,
                                        function_is_string
                                                        .f
                                                        .env(env)
                                                        .call(params.getObject())
                                                        .getBool()
                                                ? params.getObject()
                                                : params.arrayGet(env, 0))));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "listeners")
    @ConvertedParameter(index = 1, name = "eventName")
    @ConvertedParameter(
        index = 2,
        name = "event",
        typeHint = "Symfony\\Component\\EventDispatcher\\Event"
    )
    protected Object doDispatch(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object listeners = assignParameter(args, 0, false);
        Object eventName = assignParameter(args, 1, false);
        Object event = assignParameter(args, 2, false);
        Object listener = null;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1822 : ZVal.getIterable(listeners, env, true)) {
            listener = ZVal.assign(zpairResult1822.getValue());
            if (ZVal.isTrue(env.callMethod(event, "isPropagationStopped", EventDispatcher.class))) {
                break;
            }

            function_call_user_func
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                    .call(listener, event, eventName, this);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    private Object sortListeners(RuntimeEnv env, Object... args) {
        Object eventName = assignParameter(args, 0, false);
        Object listeners = null;
        ReferenceContainer listener = new BasicReferenceContainer(null);
        Object k = null;
        Object priority = null;
        function_krsort
                .f
                .env(env)
                .call(new ReferenceClassProperty(this, "listeners", env).arrayGet(env, eventName));
        new ReferenceClassProperty(this, "sorted", env)
                .arrayAccess(env, eventName)
                .set(ZVal.newArray());
        for (ZPair zpairResult1823 :
                ZVal.getIterable(
                        new ReferenceClassProperty(this, "listeners", env).arrayGet(env, eventName),
                        env,
                        false)) {
            priority = ZVal.assign(zpairResult1823.getKey());
            listeners = ZVal.assign(zpairResult1823.getValue());
            for (ZPair zpairResult1824 : ZVal.getIterable(listeners, env, false)) {
                k = ZVal.assign(zpairResult1824.getKey());
                listener.setObject(ZVal.assign(zpairResult1824.getValue()));
                if (ZVal.toBool(
                                ZVal.toBool(
                                                function_is_array
                                                        .f
                                                        .env(env)
                                                        .call(listener.getObject())
                                                        .value())
                                        && ZVal.toBool(
                                                arrayActionR(ArrayAction.ISSET, listener, env, 0)))
                        && ZVal.toBool(
                                ZVal.checkInstanceType(
                                        listener.arrayGet(env, 0), Closure.class, "Closure"))) {
                    listener.arrayAccess(env, 0)
                            .set(
                                    env.callFunctionDynamic(
                                                    listener.arrayGet(env, 0),
                                                    new RuntimeArgsWithReferences())
                                            .value());
                    new ReferenceClassProperty(this, "listeners", env)
                            .arrayAccess(env, eventName, priority, k)
                            .set(listener.getObject());
                }

                new ReferenceClassProperty(this, "sorted", env)
                        .arrayAppend(env, eventName)
                        .set(listener.getObject());
            }
        }

        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\EventDispatcher\\EventDispatcher";

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
                    .setName("Symfony\\Component\\EventDispatcher\\EventDispatcher")
                    .setLookup(
                            EventDispatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("listeners", "sorted")
                    .setFilename("vendor/symfony/event-dispatcher/EventDispatcher.php")
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
