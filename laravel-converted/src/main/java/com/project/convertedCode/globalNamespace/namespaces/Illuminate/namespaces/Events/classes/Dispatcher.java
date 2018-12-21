package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Events.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Broadcasting.classes.Factory;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Container.classes.Container;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_implements;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Broadcasting.classes.ShouldBroadcast;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Events.classes.CallQueuedListener;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes.ShouldQueue;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Events/Dispatcher.php

*/

public class Dispatcher extends RuntimeClassBase
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Contracts
                .namespaces
                .Events
                .classes
                .Dispatcher {

    public Object container = null;

    public Object listeners = ZVal.newArray();

    public Object wildcards = ZVal.newArray();

    public Object wildcardsCache = ZVal.newArray();

    public Object queueResolver = null;

    public Dispatcher(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Dispatcher.class) {
            this.__construct(env, args);
        }
    }

    public Dispatcher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Contracts\\Container\\Container",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, true);
        if (null == container) {
            container = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.container =
                ZVal.isTrue(ternaryExpressionTemp = container)
                        ? ternaryExpressionTemp
                        : new Container(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "events")
    @ConvertedParameter(index = 1, name = "listener")
    public Object listen(RuntimeEnv env, Object... args) {
        Object events = assignParameter(args, 0, false);
        Object listener = assignParameter(args, 1, false);
        Object event = null;
        for (ZPair zpairResult375 : ZVal.getIterable(rToArrayCast(events), env, true)) {
            event = ZVal.assign(zpairResult375.getValue());
            if (ZVal.isTrue(Str.runtimeStaticObject.contains(env, event, "*"))) {
                this.setupWildcardListen(env, event, listener);

            } else {
                new ReferenceClassProperty(this, "listeners", env)
                        .arrayAppend(env, event)
                        .set(this.makeListener(env, listener));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    @ConvertedParameter(index = 1, name = "listener")
    protected Object setupWildcardListen(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object listener = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "wildcards", env)
                .arrayAppend(env, event)
                .set(this.makeListener(env, listener, true));
        this.wildcardsCache = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    public Object hasListeners(RuntimeEnv env, Object... args) {
        Object eventName = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        new ReferenceClassProperty(this, "listeners", env),
                                        env,
                                        eventName))
                        || ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        new ReferenceClassProperty(this, "wildcards", env),
                                        env,
                                        eventName)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    @ConvertedParameter(index = 1, name = "payload", defaultValue = "", defaultValueType = "array")
    public Object push(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Events")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Events/Dispatcher.php");
        Object event = assignParameter(args, 0, false);
        Object payload = assignParameter(args, 1, true);
        if (null == payload) {
            payload = ZVal.newArray();
        }
        this.listen(
                env,
                toStringR(event, env) + "_pushed",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Events", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object payload = null;
                        Object event = null;
                        payload = this.contextReferences.getCapturedValue("payload");
                        event = this.contextReferences.getCapturedValue("event");
                        Dispatcher.this.dispatch(env, event, payload);
                        return null;
                    }
                }.use("payload", payload).use("event", event));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    public Object flush(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        this.dispatch(env, toStringR(event, env) + "_pushed");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "subscriber")
    public Object subscribe(RuntimeEnv env, Object... args) {
        Object subscriber = assignParameter(args, 0, false);
        subscriber = this.resolveSubscriber(env, subscriber);
        env.callMethod(subscriber, "subscribe", Dispatcher.class, this);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "subscriber")
    protected Object resolveSubscriber(RuntimeEnv env, Object... args) {
        Object subscriber = assignParameter(args, 0, false);
        if (function_is_string.f.env(env).call(subscriber).getBool()) {
            return ZVal.assign(
                    env.callMethod(this.container, "make", Dispatcher.class, subscriber));
        }

        return ZVal.assign(subscriber);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    @ConvertedParameter(index = 1, name = "payload", defaultValue = "", defaultValueType = "array")
    public Object until(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object payload = assignParameter(args, 1, true);
        if (null == payload) {
            payload = ZVal.newArray();
        }
        return ZVal.assign(this.dispatch(env, event, payload, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    @ConvertedParameter(index = 1, name = "payload", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "halt",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object fire(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object payload = assignParameter(args, 1, true);
        if (null == payload) {
            payload = ZVal.newArray();
        }
        Object halt = assignParameter(args, 2, true);
        if (null == halt) {
            halt = false;
        }
        return ZVal.assign(this.dispatch(env, event, payload, halt));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    @ConvertedParameter(index = 1, name = "payload", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "halt",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object dispatch(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer event = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer payload = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == payload.getObject()) {
            payload.setObject(ZVal.newArray());
        }
        Object halt = assignParameter(args, 2, true);
        if (null == halt) {
            halt = false;
        }
        Object response = null;
        Object listener = null;
        ReferenceContainer responses = new BasicReferenceContainer(null);
        Object runtimeTempArrayResult54 = null;
        ZVal.list(
                runtimeTempArrayResult54 =
                        this.parseEventAndPayload(env, event.getObject(), payload.getObject()),
                (event.setObject(listGet(runtimeTempArrayResult54, 0, env))),
                (payload.setObject(listGet(runtimeTempArrayResult54, 1, env))));
        if (ZVal.isTrue(this.shouldBroadcast(env, payload.getObject()))) {
            this.broadcastEvent(env, payload.arrayGet(env, 0));
        }

        responses.setObject(ZVal.newArray());
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult376 :
                ZVal.getIterable(this.getListeners(env, event.getObject()), env, true)) {
            listener = ZVal.assign(zpairResult376.getValue());
            response =
                    env.callFunctionDynamic(
                                    listener,
                                    new RuntimeArgsWithReferences().add(0, event).add(1, payload),
                                    event.getObject(),
                                    payload.getObject())
                            .value();
            if (ZVal.toBool(halt)
                    && ZVal.toBool(!function_is_null.f.env(env).call(response).getBool())) {
                return ZVal.assign(response);
            }

            if (ZVal.strictEqualityCheck(response, "===", false)) {
                break;
            }

            responses.arrayAppend(env).set(response);
        }

        return ZVal.assign(ZVal.isTrue(halt) ? ZVal.getNull() : responses.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    @ConvertedParameter(index = 1, name = "payload")
    protected Object parseEventAndPayload(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object payload = assignParameter(args, 1, false);
        Object runtimeTempArrayResult55 = null;
        if (function_is_object.f.env(env).call(event).getBool()) {
            ZVal.list(
                    runtimeTempArrayResult55 =
                            ZVal.newArray(
                                    new ZPair(0, ZVal.newArray(new ZPair(0, event))),
                                    new ZPair(
                                            1, function_get_class.f.env(env).call(event).value())),
                    (payload = listGet(runtimeTempArrayResult55, 0, env)),
                    (event = listGet(runtimeTempArrayResult55, 1, env)));
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(0, event),
                        new ZPair(1, Arr.runtimeStaticObject.wrap(env, payload))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "payload", typeHint = "array")
    protected Object shouldBroadcast(RuntimeEnv env, Object... args) {
        ReferenceContainer payload = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(arrayActionR(ArrayAction.ISSET, payload, env, 0))
                                        && ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        payload.arrayGet(env, 0),
                                                        ShouldBroadcast.class,
                                                        "Illuminate\\Contracts\\Broadcasting\\ShouldBroadcast")))
                        && ZVal.toBool(this.broadcastWhen(env, payload.arrayGet(env, 0))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    protected Object broadcastWhen(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        return ZVal.assign(
                function_method_exists.f.env(env).call(event, "broadcastWhen").getBool()
                        ? env.callMethod(event, "broadcastWhen", Dispatcher.class)
                        : true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    protected Object broadcastEvent(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(this.container, "make", Dispatcher.class, Factory.CONST_class),
                "queue",
                Dispatcher.class,
                event);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    public Object getListeners(RuntimeEnv env, Object... args) {
        Object eventName = assignParameter(args, 0, false);
        Object listeners = null;
        Object ternaryExpressionTemp = null;
        listeners =
                ZVal.assign(
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                new ReferenceClassProperty(this, "listeners", env)
                                                        .arrayGet(env, eventName))
                                ? ternaryExpressionTemp
                                : ZVal.newArray());
        listeners =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                listeners,
                                ZVal.isDefined(
                                                ternaryExpressionTemp =
                                                        new ReferenceClassProperty(
                                                                        this, "wildcardsCache", env)
                                                                .arrayGet(env, eventName))
                                        ? ternaryExpressionTemp
                                        : this.getWildcardListeners(env, eventName))
                        .value();
        return ZVal.assign(
                function_class_exists.f.env(env).call(eventName, false).getBool()
                        ? this.addInterfaceListeners(env, eventName, listeners)
                        : listeners);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    protected Object getWildcardListeners(RuntimeEnv env, Object... args) {
        Object eventName = assignParameter(args, 0, false);
        Object listeners = null;
        Object wildcards = null;
        Object key = null;
        wildcards = ZVal.newArray();
        for (ZPair zpairResult377 : ZVal.getIterable(this.wildcards, env, false)) {
            key = ZVal.assign(zpairResult377.getKey());
            listeners = ZVal.assign(zpairResult377.getValue());
            if (ZVal.isTrue(Str.runtimeStaticObject.is(env, key, eventName))) {
                wildcards = function_array_merge.f.env(env).call(wildcards, listeners).value();
            }
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "wildcardsCache", env)
                        .arrayAccess(env, eventName)
                        .set(wildcards));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    @ConvertedParameter(
        index = 1,
        name = "listeners",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object addInterfaceListeners(RuntimeEnv env, Object... args) {
        Object eventName = assignParameter(args, 0, false);
        Object listeners = assignParameter(args, 1, true);
        if (null == listeners) {
            listeners = ZVal.newArray();
        }
        Object names = null;
        Object _pInterface = null;
        for (ZPair zpairResult378 :
                ZVal.getIterable(
                        function_class_implements.f.env(env).call(eventName).value(), env, true)) {
            _pInterface = ZVal.assign(zpairResult378.getValue());
            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "listeners", env),
                    env,
                    _pInterface)) {
                for (ZPair zpairResult379 :
                        ZVal.getIterable(
                                new ReferenceClassProperty(this, "listeners", env)
                                        .arrayGet(env, _pInterface),
                                env,
                                true)) {
                    names = ZVal.assign(zpairResult379.getValue());
                    listeners =
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(listeners, rToArrayCast(names))
                                    .value();
                }
            }
        }

        return ZVal.assign(listeners);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "listener")
    @ConvertedParameter(
        index = 1,
        name = "wildcard",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object makeListener(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Events")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Events/Dispatcher.php");
        Object listener = assignParameter(args, 0, false);
        Object wildcard = assignParameter(args, 1, true);
        if (null == wildcard) {
            wildcard = false;
        }
        if (function_is_string.f.env(env).call(listener).getBool()) {
            return ZVal.assign(this.createClassListener(env, listener, wildcard));
        }

        return ZVal.assign(
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Events", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "event")
                    @ConvertedParameter(index = 1, name = "payload")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ReferenceContainer event =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        ReferenceContainer payload =
                                new BasicReferenceContainer(assignParameter(args, 1, false));
                        Object listener = null;
                        Object wildcard = null;
                        listener = this.contextReferences.getCapturedValue("listener");
                        wildcard = this.contextReferences.getCapturedValue("wildcard");
                        if (ZVal.isTrue(wildcard)) {
                            return ZVal.assign(
                                    env.callFunctionDynamic(
                                                    listener,
                                                    new RuntimeArgsWithReferences()
                                                            .add(0, event)
                                                            .add(1, payload),
                                                    event.getObject(),
                                                    payload.getObject())
                                            .value());
                        }

                        return ZVal.assign(
                                env.callFunctionDynamic(
                                                listener,
                                                new RuntimeArgsWithReferences(),
                                                PackedVaradicArgs.unpack(
                                                        new PackedVaradicArgs(
                                                                function_array_values
                                                                        .f
                                                                        .env(env)
                                                                        .call(payload.getObject())
                                                                        .value())))
                                        .value());
                    }
                }.use("listener", listener).use("wildcard", wildcard));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "listener")
    @ConvertedParameter(
        index = 1,
        name = "wildcard",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object createClassListener(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Events")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Events/Dispatcher.php");
        Object listener = assignParameter(args, 0, false);
        Object wildcard = assignParameter(args, 1, true);
        if (null == wildcard) {
            wildcard = false;
        }
        return ZVal.assign(
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Events", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "event")
                    @ConvertedParameter(index = 1, name = "payload")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object event = assignParameter(args, 0, false);
                        Object payload = assignParameter(args, 1, false);
                        Object listener = null;
                        Object wildcard = null;
                        listener = this.contextReferences.getCapturedValue("listener");
                        wildcard = this.contextReferences.getCapturedValue("wildcard");
                        if (ZVal.isTrue(wildcard)) {
                            return ZVal.assign(
                                    function_call_user_func
                                            .f
                                            .env(env)
                                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                            .call(
                                                    Dispatcher.this.createClassCallable(
                                                            env, listener),
                                                    event,
                                                    payload)
                                            .value());
                        }

                        return ZVal.assign(
                                function_call_user_func_array
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call(
                                                Dispatcher.this.createClassCallable(env, listener),
                                                payload)
                                        .value());
                    }
                }.use("listener", listener).use("wildcard", wildcard));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "listener")
    protected Object createClassCallable(RuntimeEnv env, Object... args) {
        Object listener = assignParameter(args, 0, false);
        Object method = null;
        Object _pClass = null;
        Object runtimeTempArrayResult56 = null;
        ZVal.list(
                runtimeTempArrayResult56 = this.parseClassCallable(env, listener),
                (_pClass = listGet(runtimeTempArrayResult56, 0, env)),
                (method = listGet(runtimeTempArrayResult56, 1, env)));
        if (ZVal.isTrue(this.handlerShouldBeQueued(env, _pClass))) {
            return ZVal.assign(this.createQueuedHandlerCallable(env, _pClass, method));
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                env.callMethod(this.container, "make", Dispatcher.class, _pClass)),
                        new ZPair(1, method)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "listener")
    protected Object parseClassCallable(RuntimeEnv env, Object... args) {
        Object listener = assignParameter(args, 0, false);
        return ZVal.assign(Str.runtimeStaticObject.parseCallback(env, listener, "handle"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    protected Object handlerShouldBeQueued(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object e = null;
        try {
            return ZVal.assign(
                    env.callMethod(
                            new ReflectionClass(env, _pClass),
                            "implementsInterface",
                            Dispatcher.class,
                            ShouldQueue.CONST_class));
        } catch (ConvertedException convertedException31) {
            if (convertedException31.instanceOf(PHPException.class, "Exception")) {
                e = convertedException31.getObject();
                return ZVal.assign(false);
            } else {
                throw convertedException31;
            }
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "method")
    protected Object createQueuedHandlerCallable(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Events")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Events/Dispatcher.php");
        Object _pClass = assignParameter(args, 0, false);
        Object method = assignParameter(args, 1, false);
        return ZVal.assign(
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Events", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ContextConstants runtimeConverterFunctionClassConstants =
                                new ContextConstants()
                                        .setDir("/vendor/laravel/framework/src/Illuminate/Events")
                                        .setFile(
                                                "/vendor/laravel/framework/src/Illuminate/Events/Dispatcher.php");
                        Object _closureThisVar = this.getClosureThisVar();
                        Object method = null;
                        Object arguments = null;
                        Object _pClass = null;
                        method = this.contextReferences.getCapturedValue("method");
                        _pClass = this.contextReferences.getCapturedValue("class");
                        arguments =
                                function_array_map
                                        .f
                                        .env(env)
                                        .call(
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Illuminate\\Events",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "a")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object a = assignParameter(args, 0, false);
                                                        return ZVal.assign(
                                                                function_is_object
                                                                                .f
                                                                                .env(env)
                                                                                .call(a)
                                                                                .getBool()
                                                                        ? ((RuntimeClassInterface)
                                                                                        a)
                                                                                .phpClone(env)
                                                                        : a);
                                                    }
                                                },
                                                function_func_get_args
                                                        .f
                                                        .env(env)
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithInfo(args, this))
                                                        .call()
                                                        .value())
                                        .value();
                        if (ZVal.isTrue(
                                Dispatcher.this.handlerWantsToBeQueued(env, _pClass, arguments))) {
                            Dispatcher.this.queueHandler(env, _pClass, method, arguments);
                        }

                        return null;
                    }
                }.use("method", method).use("class", _pClass));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "arguments")
    protected Object handlerWantsToBeQueued(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        ReferenceContainer arguments = new BasicReferenceContainer(assignParameter(args, 1, false));
        if (function_method_exists.f.env(env).call(_pClass, "shouldQueue").getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            env.callMethod(this.container, "make", Dispatcher.class, _pClass),
                            "shouldQueue",
                            Dispatcher.class,
                            arguments.arrayGet(env, 0)));
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "method")
    @ConvertedParameter(index = 2, name = "arguments")
    protected Object queueHandler(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object method = assignParameter(args, 1, false);
        Object arguments = assignParameter(args, 2, false);
        Object listener = null;
        Object runtimeTempArrayResult57 = null;
        Object connection = null;
        Object ternaryExpressionTemp = null;
        Object job = null;
        Object queue = null;
        ZVal.list(
                runtimeTempArrayResult57 =
                        this.createListenerAndJob(env, _pClass, method, arguments),
                (listener = listGet(runtimeTempArrayResult57, 0, env)),
                (job = listGet(runtimeTempArrayResult57, 1, env)));
        connection =
                env.callMethod(
                        this.resolveQueue(env),
                        "connection",
                        Dispatcher.class,
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                toObjectR(listener)
                                                        .accessProp(this, env)
                                                        .name("connection")
                                                        .value())
                                ? ternaryExpressionTemp
                                : ZVal.getNull());
        queue =
                ZVal.assign(
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                toObjectR(listener)
                                                        .accessProp(this, env)
                                                        .name("queue")
                                                        .value())
                                ? ternaryExpressionTemp
                                : ZVal.getNull());
        ZVal.ternaryExpression(
                ZVal.isset(toObjectR(listener).accessProp(this, env).name("delay").value())
                        ? env.callMethod(
                                connection,
                                "laterOn",
                                Dispatcher.class,
                                queue,
                                toObjectR(listener).accessProp(this, env).name("delay").value(),
                                job)
                        : env.callMethod(connection, "pushOn", Dispatcher.class, queue, job));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "method")
    @ConvertedParameter(index = 2, name = "arguments")
    protected Object createListenerAndJob(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object method = assignParameter(args, 1, false);
        Object arguments = assignParameter(args, 2, false);
        Object listener = null;
        listener =
                env.callMethod(
                        new ReflectionClass(env, _pClass),
                        "newInstanceWithoutConstructor",
                        Dispatcher.class);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(0, listener),
                        new ZPair(
                                1,
                                this.propagateListenerOptions(
                                        env,
                                        listener,
                                        new CallQueuedListener(env, _pClass, method, arguments)))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "listener")
    @ConvertedParameter(index = 1, name = "job")
    protected Object propagateListenerOptions(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Events")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Events/Dispatcher.php");
        Object listener = assignParameter(args, 0, false);
        Object job = assignParameter(args, 1, false);
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                job,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Events",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "job")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object job = assignParameter(args, 0, false);
                                        Object listener = null;
                                        Object ternaryExpressionTemp = null;
                                        listener =
                                                this.contextReferences.getCapturedValue("listener");
                                        toObjectR(job)
                                                .accessProp(this, env)
                                                .name("tries")
                                                .set(
                                                        ZVal.isDefined(
                                                                        ternaryExpressionTemp =
                                                                                toObjectR(listener)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "tries")
                                                                                        .value())
                                                                ? ternaryExpressionTemp
                                                                : ZVal.getNull());
                                        toObjectR(job)
                                                .accessProp(this, env)
                                                .name("timeout")
                                                .set(
                                                        ZVal.isDefined(
                                                                        ternaryExpressionTemp =
                                                                                toObjectR(listener)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "timeout")
                                                                                        .value())
                                                                ? ternaryExpressionTemp
                                                                : ZVal.getNull());
                                        toObjectR(job)
                                                .accessProp(this, env)
                                                .name("timeoutAt")
                                                .set(
                                                        function_method_exists
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                listener,
                                                                                "retryUntil")
                                                                        .getBool()
                                                                ? env.callMethod(
                                                                        listener,
                                                                        "retryUntil",
                                                                        Dispatcher.class)
                                                                : ZVal.getNull());
                                        return null;
                                    }
                                }.use("listener", listener))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    public Object forget(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        if (ZVal.isTrue(Str.runtimeStaticObject.contains(env, event, "*"))) {
            arrayActionR(
                    ArrayAction.UNSET,
                    new ReferenceClassProperty(this, "wildcards", env),
                    env,
                    event);

        } else {
            arrayActionR(
                    ArrayAction.UNSET,
                    new ReferenceClassProperty(this, "listeners", env),
                    env,
                    event);
        }

        return null;
    }

    @ConvertedMethod
    public Object forgetPushed(RuntimeEnv env, Object... args) {
        Object value = null;
        Object key = null;
        for (ZPair zpairResult380 : ZVal.getIterable(this.listeners, env, false)) {
            key = ZVal.assign(zpairResult380.getKey());
            value = ZVal.assign(zpairResult380.getValue());
            if (ZVal.isTrue(Str.runtimeStaticObject.endsWith(env, key, "_pushed"))) {
                this.forget(env, key);
            }
        }

        return null;
    }

    @ConvertedMethod
    protected Object resolveQueue(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(this.queueResolver)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resolver", typeHint = "callable")
    public Object setQueueResolver(RuntimeEnv env, Object... args) {
        Object resolver = assignParameter(args, 0, false);
        this.queueResolver = resolver;
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Illuminate\\Events\\Dispatcher";

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
                    .setName("Illuminate\\Events\\Dispatcher")
                    .setLookup(
                            Dispatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "container",
                            "listeners",
                            "queueResolver",
                            "wildcards",
                            "wildcardsCache")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Events/Dispatcher.php")
                    .addInterface("Illuminate\\Contracts\\Events\\Dispatcher")
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
