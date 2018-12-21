package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Channels.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Messages.classes.NexmoMessage;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Notifications/Channels/NexmoSmsChannel.php

*/

public class NexmoSmsChannel extends RuntimeClassBase {

    public Object nexmo = null;

    public Object from = null;

    public NexmoSmsChannel(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NexmoSmsChannel.class) {
            this.__construct(env, args);
        }
    }

    public NexmoSmsChannel(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nexmo", typeHint = "Nexmo\\Client")
    @ConvertedParameter(index = 1, name = "from")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object nexmo = assignParameter(args, 0, false);
        Object from = assignParameter(args, 1, false);
        this.from = from;
        this.nexmo = nexmo;
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
        Object ternaryExpressionTemp = null;
        Object to = null;
        Object message = null;
        if (!ZVal.isTrue(
                to =
                        env.callMethod(
                                notifiable,
                                "routeNotificationFor",
                                NexmoSmsChannel.class,
                                "nexmo",
                                notification))) {
            return null;
        }

        message = env.callMethod(notification, "toNexmo", NexmoSmsChannel.class, notifiable);
        if (function_is_string.f.env(env).call(message).getBool()) {
            message = new NexmoMessage(env, message);
        }

        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.nexmo, "message", NexmoSmsChannel.class),
                        "send",
                        NexmoSmsChannel.class,
                        ZVal.newArray(
                                new ZPair(
                                        "type",
                                        toObjectR(message)
                                                .accessProp(this, env)
                                                .name("type")
                                                .value()),
                                new ZPair(
                                        "from",
                                        ZVal.isTrue(
                                                        ternaryExpressionTemp =
                                                                toObjectR(message)
                                                                        .accessProp(this, env)
                                                                        .name("from")
                                                                        .value())
                                                ? ternaryExpressionTemp
                                                : this.from),
                                new ZPair("to", to),
                                new ZPair(
                                        "text",
                                        function_trim
                                                .f
                                                .env(env)
                                                .call(
                                                        toObjectR(message)
                                                                .accessProp(this, env)
                                                                .name("content")
                                                                .value())
                                                .value()))));
    }

    public static final Object CONST_class = "Illuminate\\Notifications\\Channels\\NexmoSmsChannel";

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
                    .setName("Illuminate\\Notifications\\Channels\\NexmoSmsChannel")
                    .setLookup(
                            NexmoSmsChannel.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("from", "nexmo")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Notifications/Channels/NexmoSmsChannel.php")
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
