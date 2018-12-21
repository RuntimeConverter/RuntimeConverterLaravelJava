package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.functions.dispatch;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import java.lang.Class;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes.ShouldQueue;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Notifications/SendQueuedNotifications.php

*/

public class SendQueuedNotifications extends RuntimeClassBase implements ShouldQueue {

    public Object notifiables = null;

    public Object notification = null;

    public Object channels = null;

    public Object connection = null;

    public Object queue = null;

    public Object chainConnection = null;

    public Object chainQueue = null;

    public Object delay = null;

    public Object chained = ZVal.newArray();

    public SendQueuedNotifications(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SendQueuedNotifications.class) {
            this.__construct(env, args);
        }
    }

    public SendQueuedNotifications(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiables")
    @ConvertedParameter(index = 1, name = "notification")
    @ConvertedParameter(
        index = 2,
        name = "channels",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object notifiables = assignParameter(args, 0, false);
        Object notification = assignParameter(args, 1, false);
        Object channels = assignParameter(args, 2, true);
        if (null == channels) {
            channels = ZVal.getNull();
        }
        this.channels = channels;
        this.notifiables = notifiables;
        this.notification = notification;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "manager",
        typeHint = "Illuminate\\Notifications\\ChannelManager"
    )
    public Object handle(RuntimeEnv env, Object... args) {
        Object manager = assignParameter(args, 0, false);
        env.callMethod(
                manager,
                "sendNow",
                SendQueuedNotifications.class,
                this.notifiables,
                this.notification,
                this.channels);
        return null;
    }

    @ConvertedMethod
    public Object displayName(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_get_class.f.env(env).call(this.notification).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e")
    public Object failed(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        if (function_method_exists.f.env(env).call(this.notification, "failed").getBool()) {
            env.callMethod(this.notification, "failed", SendQueuedNotifications.class, e);
        }

        return null;
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        this.notifiables = ((RuntimeClassInterface) this.notifiables).phpClone(env);
        this.notification = ((RuntimeClassInterface) this.notification).phpClone(env);
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
                                SendQueuedNotifications.class,
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
                        SendQueuedNotifications.class);
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
                                                            .set(
                                                                    SendQueuedNotifications.this
                                                                            .chained);
                                                    env.callMethod(
                                                            next,
                                                            "onConnection",
                                                            SendQueuedNotifications.class,
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
                                                                    : SendQueuedNotifications.this
                                                                            .chainConnection);
                                                    env.callMethod(
                                                            next,
                                                            "onQueue",
                                                            SendQueuedNotifications.class,
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
                                                                    : SendQueuedNotifications.this
                                                                            .chainQueue);
                                                    toObjectR(next)
                                                            .accessProp(this, env)
                                                            .name("chainConnection")
                                                            .set(
                                                                    SendQueuedNotifications.this
                                                                            .chainConnection);
                                                    toObjectR(next)
                                                            .accessProp(this, env)
                                                            .name("chainQueue")
                                                            .set(
                                                                    SendQueuedNotifications.this
                                                                            .chainQueue);
                                                    return null;
                                                }
                                            })
                                    .value());
        }

        return null;
    }

    @ConvertedMethod
    public Object __sleep(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Queue/SerializesModels.php");
        Object property = null;
        Object properties = null;
        properties =
                env.callMethod(
                        new ReflectionClass(env, this),
                        "getProperties",
                        SendQueuedNotifications.class);
        for (ZPair zpairResult2350 : ZVal.getIterable(properties, env, true)) {
            property = ZVal.assign(zpairResult2350.getValue());
            env.callMethod(
                    property,
                    "setValue",
                    SendQueuedNotifications.class,
                    this,
                    this.getSerializedPropertyValue(env, this.getPropertyValue(env, property)));
        }

        return ZVal.assign(
                function_array_values
                        .f
                        .env(env)
                        .call(
                                function_array_filter
                                        .f
                                        .env(env)
                                        .call(
                                                function_array_map
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                new Closure(
                                                                        env,
                                                                        runtimeConverterFunctionClassConstants,
                                                                        "Illuminate\\Queue",
                                                                        this) {
                                                                    @Override
                                                                    @ConvertedMethod
                                                                    @ConvertedParameter(
                                                                        index = 0,
                                                                        name = "p"
                                                                    )
                                                                    public Object run(
                                                                            RuntimeEnv env,
                                                                            Object thisvar,
                                                                            PassByReferenceArgs
                                                                                    runtimePassByReferenceArgs,
                                                                            Object... args) {
                                                                        Object p =
                                                                                assignParameter(
                                                                                        args, 0,
                                                                                        false);
                                                                        return ZVal.assign(
                                                                                ZVal.isTrue(
                                                                                                env
                                                                                                        .callMethod(
                                                                                                                p,
                                                                                                                "isStatic",
                                                                                                                SendQueuedNotifications
                                                                                                                        .class))
                                                                                        ? ZVal
                                                                                                .getNull()
                                                                                        : env
                                                                                                .callMethod(
                                                                                                        p,
                                                                                                        "getName",
                                                                                                        SendQueuedNotifications
                                                                                                                .class));
                                                                    }
                                                                },
                                                                properties)
                                                        .value())
                                        .value())
                        .value());
    }

    @ConvertedMethod
    public Object __wakeup(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object property = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2351 :
                ZVal.getIterable(
                        env.callMethod(
                                new ReflectionClass(env, this),
                                "getProperties",
                                SendQueuedNotifications.class),
                        env,
                        true)) {
            property = ZVal.assign(zpairResult2351.getValue());
            if (ZVal.isTrue(env.callMethod(property, "isStatic", SendQueuedNotifications.class))) {
                continue;
            }

            env.callMethod(
                    property,
                    "setValue",
                    SendQueuedNotifications.class,
                    this,
                    this.getRestoredPropertyValue(env, this.getPropertyValue(env, property)));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "property", typeHint = "ReflectionProperty")
    protected Object getPropertyValue(RuntimeEnv env, Object... args) {
        Object property = assignParameter(args, 0, false);
        env.callMethod(property, "setAccessible", SendQueuedNotifications.class, true);
        return ZVal.assign(
                env.callMethod(property, "getValue", SendQueuedNotifications.class, this));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object getSerializedPropertyValue(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (ZVal.isTrue(ZVal.checkInstanceType(value, (Class) null, "QueueableCollection", env))) {
            return ZVal.assign(
                    env.createNew(
                            ZVal.resolveClassAlias(env, "ModelIdentifier"),
                            env.callMethod(
                                    value, "getQueueableClass", SendQueuedNotifications.class),
                            env.callMethod(value, "getQueueableIds", SendQueuedNotifications.class),
                            env.callMethod(
                                    value, "getQueueableRelations", SendQueuedNotifications.class),
                            env.callMethod(
                                    value,
                                    "getQueueableConnection",
                                    SendQueuedNotifications.class)));
        }

        if (ZVal.isTrue(ZVal.checkInstanceType(value, (Class) null, "QueueableEntity", env))) {
            return ZVal.assign(
                    env.createNew(
                            ZVal.resolveClassAlias(env, "ModelIdentifier"),
                            function_get_class.f.env(env).call(value).value(),
                            env.callMethod(value, "getQueueableId", SendQueuedNotifications.class),
                            env.callMethod(
                                    value, "getQueueableRelations", SendQueuedNotifications.class),
                            env.callMethod(
                                    value,
                                    "getQueueableConnection",
                                    SendQueuedNotifications.class)));
        }

        return ZVal.assign(value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object getRestoredPropertyValue(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (!ZVal.isTrue(ZVal.checkInstanceType(value, (Class) null, "ModelIdentifier", env))) {
            return ZVal.assign(value);
        }

        return ZVal.assign(
                function_is_array
                                .f
                                .env(env)
                                .call(toObjectR(value).accessProp(this, env).name("id").value())
                                .getBool()
                        ? this.restoreCollection(env, value)
                        : this.restoreModel(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object restoreCollection(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (ZVal.toBool(!toObjectR(value).accessProp(this, env).name("class").getBool())
                || ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                function_count
                                        .f
                                        .env(env)
                                        .call(
                                                toObjectR(value)
                                                        .accessProp(this, env)
                                                        .name("id")
                                                        .value())
                                        .value(),
                                "===",
                                0))) {
            return ZVal.assign(env.createNew(ZVal.resolveClassAlias(env, "EloquentCollection")));
        }

        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this.getQueryForModelRestoration(
                                        env,
                                        env.callMethod(
                                                env.createNew(
                                                        toObjectR(value)
                                                                .accessProp(this, env)
                                                                .name("class")
                                                                .value()),
                                                "setConnection",
                                                SendQueuedNotifications.class,
                                                toObjectR(value)
                                                        .accessProp(this, env)
                                                        .name("connection")
                                                        .value()),
                                        toObjectR(value).accessProp(this, env).name("id").value()),
                                "useWritePdo",
                                SendQueuedNotifications.class),
                        "get",
                        SendQueuedNotifications.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object restoreModel(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        this.getQueryForModelRestoration(
                                                env,
                                                env.callMethod(
                                                        env.createNew(
                                                                toObjectR(value)
                                                                        .accessProp(this, env)
                                                                        .name("class")
                                                                        .value()),
                                                        "setConnection",
                                                        SendQueuedNotifications.class,
                                                        toObjectR(value)
                                                                .accessProp(this, env)
                                                                .name("connection")
                                                                .value()),
                                                toObjectR(value)
                                                        .accessProp(this, env)
                                                        .name("id")
                                                        .value()),
                                        "useWritePdo",
                                        SendQueuedNotifications.class),
                                "firstOrFail",
                                SendQueuedNotifications.class),
                        "load",
                        SendQueuedNotifications.class,
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                toObjectR(value)
                                                        .accessProp(this, env)
                                                        .name("relations")
                                                        .value())
                                ? ternaryExpressionTemp
                                : ZVal.newArray()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "model")
    @ConvertedParameter(index = 1, name = "ids")
    protected Object getQueryForModelRestoration(RuntimeEnv env, Object... args) {
        Object model = assignParameter(args, 0, false);
        Object ids = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        model, "newQueryForRestoration", SendQueuedNotifications.class, ids));
    }

    public static final Object CONST_class = "Illuminate\\Notifications\\SendQueuedNotifications";

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
                    .setName("Illuminate\\Notifications\\SendQueuedNotifications")
                    .setLookup(
                            SendQueuedNotifications.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "chainConnection",
                            "chainQueue",
                            "chained",
                            "channels",
                            "connection",
                            "delay",
                            "notifiables",
                            "notification",
                            "queue")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Notifications/SendQueuedNotifications.php")
                    .addInterface("Illuminate\\Contracts\\Queue\\ShouldQueue")
                    .addTrait("Illuminate\\Bus\\Queueable")
                    .addTrait("Illuminate\\Queue\\SerializesModels")
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
