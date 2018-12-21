package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Broadcasting.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.functions.dispatch;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionProperty;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Arrayable;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.project.convertedCode.globalNamespace.functions.data_get;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes.ShouldQueue;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Broadcasting/BroadcastEvent.php

*/

public class BroadcastEvent extends RuntimeClassBase implements ShouldQueue {

    public Object event = null;

    public Object connection = null;

    public Object queue = null;

    public Object chainConnection = null;

    public Object chainQueue = null;

    public Object delay = null;

    public Object chained = ZVal.newArray();

    public BroadcastEvent(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == BroadcastEvent.class) {
            this.__construct(env, args);
        }
    }

    public BroadcastEvent(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        this.event = event;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "broadcaster",
        typeHint = "Illuminate\\Contracts\\Broadcasting\\Broadcaster"
    )
    public Object handle(RuntimeEnv env, Object... args) {
        Object broadcaster = assignParameter(args, 0, false);
        Object name = null;
        name =
                ZVal.assign(
                        function_method_exists.f.env(env).call(this.event, "broadcastAs").getBool()
                                ? env.callMethod(this.event, "broadcastAs", BroadcastEvent.class)
                                : function_get_class.f.env(env).call(this.event).value());
        env.callMethod(
                broadcaster,
                "broadcast",
                BroadcastEvent.class,
                Arr.runtimeStaticObject.wrap(
                        env, env.callMethod(this.event, "broadcastOn", BroadcastEvent.class)),
                name,
                this.getPayloadFromEvent(env, this.event));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    protected Object getPayloadFromEvent(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        ReferenceContainer payload = new BasicReferenceContainer(null);
        Object property = null;
        if (function_method_exists.f.env(env).call(event, "broadcastWith").getBool()) {
            return ZVal.assign(
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    env.callMethod(event, "broadcastWith", BroadcastEvent.class),
                                    ZVal.newArray(
                                            new ZPair(
                                                    "socket",
                                                    data_get.f
                                                            .env(env)
                                                            .call(event, "socket")
                                                            .value())))
                            .value());
        }

        payload.setObject(ZVal.newArray());
        for (ZPair zpairResult199 :
                ZVal.getIterable(
                        env.callMethod(
                                new ReflectionClass(env, event),
                                "getProperties",
                                BroadcastEvent.class,
                                256),
                        env,
                        true)) {
            property = ZVal.assign(zpairResult199.getValue());
            payload.arrayAccess(env, env.callMethod(property, "getName", BroadcastEvent.class))
                    .set(
                            this.formatProperty(
                                    env,
                                    env.callMethod(
                                            property, "getValue", BroadcastEvent.class, event)));
        }

        arrayActionR(ArrayAction.UNSET, payload, env, "broadcastQueue");
        return ZVal.assign(payload.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object formatProperty(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        value, Arrayable.class, "Illuminate\\Contracts\\Support\\Arrayable"))) {
            return ZVal.assign(env.callMethod(value, "toArray", BroadcastEvent.class));
        }

        return ZVal.assign(value);
    }

    @ConvertedMethod
    public Object displayName(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_get_class.f.env(env).call(this.event).value());
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        this.event = ((RuntimeClassInterface) this.event).phpClone(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    public Object onConnection(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        this.connection = connection;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    public Object onQueue(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        this.queue = queue;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    public Object allOnConnection(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        this.chainConnection = connection;
        this.connection = connection;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    public Object allOnQueue(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        this.chainQueue = queue;
        this.queue = queue;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay")
    public Object delay(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, false);
        this.delay = delay;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "chain")
    public Object chain(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Bus")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Bus/Queueable.php");
        Object chain = assignParameter(args, 0, false);
        this.chained =
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(chain).value(),
                                "map",
                                BroadcastEvent.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Bus",
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
                                        return ZVal.assign(
                                                function_serialize.f.env(env).call(job).value());
                                    }
                                }),
                        "all",
                        BroadcastEvent.class);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object dispatchNextJobInChain(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Bus")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Bus/Queueable.php");
        if (!ZVal.isEmpty(this.chained)) {
            dispatch.f
                    .env(env)
                    .call(
                            tap.f
                                    .env(env)
                                    .call(
                                            function_unserialize
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            function_array_shift
                                                                    .f
                                                                    .env(env)
                                                                    .call(this.chained)
                                                                    .value())
                                                    .value(),
                                            new Closure(
                                                    env,
                                                    runtimeConverterFunctionClassConstants,
                                                    "Illuminate\\Bus",
                                                    this) {
                                                @Override
                                                @ConvertedMethod
                                                @ConvertedParameter(index = 0, name = "next")
                                                public Object run(
                                                        RuntimeEnv env,
                                                        Object thisvar,
                                                        PassByReferenceArgs
                                                                runtimePassByReferenceArgs,
                                                        Object... args) {
                                                    Object _closureThisVar =
                                                            this.getClosureThisVar();
                                                    Object next = assignParameter(args, 0, false);
                                                    Object ternaryExpressionTemp = null;
                                                    toObjectR(next)
                                                            .accessProp(this, env)
                                                            .name("chained")
                                                            .set(BroadcastEvent.this.chained);
                                                    env.callMethod(
                                                            next,
                                                            "onConnection",
                                                            BroadcastEvent.class,
                                                            ZVal.isTrue(
                                                                            ternaryExpressionTemp =
                                                                                    toObjectR(next)
                                                                                            .accessProp(
                                                                                                    this,
                                                                                                    env)
                                                                                            .name(
                                                                                                    "connection")
                                                                                            .value())
                                                                    ? ternaryExpressionTemp
                                                                    : BroadcastEvent.this
                                                                            .chainConnection);
                                                    env.callMethod(
                                                            next,
                                                            "onQueue",
                                                            BroadcastEvent.class,
                                                            ZVal.isTrue(
                                                                            ternaryExpressionTemp =
                                                                                    toObjectR(next)
                                                                                            .accessProp(
                                                                                                    this,
                                                                                                    env)
                                                                                            .name(
                                                                                                    "queue")
                                                                                            .value())
                                                                    ? ternaryExpressionTemp
                                                                    : BroadcastEvent.this
                                                                            .chainQueue);
                                                    toObjectR(next)
                                                            .accessProp(this, env)
                                                            .name("chainConnection")
                                                            .set(
                                                                    BroadcastEvent.this
                                                                            .chainConnection);
                                                    toObjectR(next)
                                                            .accessProp(this, env)
                                                            .name("chainQueue")
                                                            .set(BroadcastEvent.this.chainQueue);
                                                    return null;
                                                }
                                            })
                                    .value());
        }

        return null;
    }

    public static final Object CONST_class = "Illuminate\\Broadcasting\\BroadcastEvent";

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
                    .setName("Illuminate\\Broadcasting\\BroadcastEvent")
                    .setLookup(
                            BroadcastEvent.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "chainConnection",
                            "chainQueue",
                            "chained",
                            "connection",
                            "delay",
                            "event",
                            "queue")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Broadcasting/BroadcastEvent.php")
                    .addInterface("Illuminate\\Contracts\\Queue\\ShouldQueue")
                    .addTrait("Illuminate\\Bus\\Queueable")
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
