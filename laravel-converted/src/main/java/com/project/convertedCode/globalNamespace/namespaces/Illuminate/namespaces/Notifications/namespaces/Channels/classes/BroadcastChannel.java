package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Channels.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Events.classes.BroadcastNotificationCreated;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Messages.classes.BroadcastMessage;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Notifications/Channels/BroadcastChannel.php

*/

public class BroadcastChannel extends RuntimeClassBase {

    public Object events = null;

    public BroadcastChannel(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == BroadcastChannel.class) {
            this.__construct(env, args);
        }
    }

    public BroadcastChannel(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "events",
        typeHint = "Illuminate\\Contracts\\Events\\Dispatcher"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object events = assignParameter(args, 0, false);
        this.events = events;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiable")
    @ConvertedParameter(
        index = 1,
        name = "notification",
        typeHint = "Illuminate\\Notifications\\Notification"
    )
    public Object send(RuntimeEnv env, Object... args) {
        Object notifiable = assignParameter(args, 0, false);
        Object notification = assignParameter(args, 1, false);
        Object message = null;
        Object event = null;
        message = this.getData(env, notifiable, notification);
        event =
                new BroadcastNotificationCreated(
                        env,
                        notifiable,
                        notification,
                        function_is_array.f.env(env).call(message).getBool()
                                ? message
                                : toObjectR(message).accessProp(this, env).name("data").value());
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        message,
                        BroadcastMessage.class,
                        "Illuminate\\Notifications\\Messages\\BroadcastMessage"))) {
            env.callMethod(
                    env.callMethod(
                            event,
                            "onConnection",
                            BroadcastChannel.class,
                            toObjectR(message).accessProp(this, env).name("connection").value()),
                    "onQueue",
                    BroadcastChannel.class,
                    toObjectR(message).accessProp(this, env).name("queue").value());
        }

        return ZVal.assign(env.callMethod(this.events, "dispatch", BroadcastChannel.class, event));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiable")
    @ConvertedParameter(
        index = 1,
        name = "notification",
        typeHint = "Illuminate\\Notifications\\Notification"
    )
    protected Object getData(RuntimeEnv env, Object... args) {
        Object notifiable = assignParameter(args, 0, false);
        Object notification = assignParameter(args, 1, false);
        if (function_method_exists.f.env(env).call(notification, "toBroadcast").getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            notification, "toBroadcast", BroadcastChannel.class, notifiable));
        }

        if (function_method_exists.f.env(env).call(notification, "toArray").getBool()) {
            return ZVal.assign(
                    env.callMethod(notification, "toArray", BroadcastChannel.class, notifiable));
        }

        throw ZVal.getException(
                env, new RuntimeException(env, "Notification is missing toArray method."));
    }

    public static final Object CONST_class =
            "Illuminate\\Notifications\\Channels\\BroadcastChannel";

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
                    .setName("Illuminate\\Notifications\\Channels\\BroadcastChannel")
                    .setLookup(
                            BroadcastChannel.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("events")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Notifications/Channels/BroadcastChannel.php")
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
