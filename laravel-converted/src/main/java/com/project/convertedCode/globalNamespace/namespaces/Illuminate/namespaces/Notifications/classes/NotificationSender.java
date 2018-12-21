package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Events.classes.NotificationSending;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Events.classes.NotificationSent;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.Model;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.classes.SendQueuedNotifications;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes.ShouldQueue;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Notifications/NotificationSender.php

*/

public class NotificationSender extends RuntimeClassBase {

    public Object manager = null;

    public Object bus = null;

    public Object events = null;

    public NotificationSender(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NotificationSender.class) {
            this.__construct(env, args);
        }
    }

    public NotificationSender(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "manager")
    @ConvertedParameter(index = 1, name = "bus")
    @ConvertedParameter(index = 2, name = "events")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object manager = assignParameter(args, 0, false);
        Object bus = assignParameter(args, 1, false);
        Object events = assignParameter(args, 2, false);
        this.bus = bus;
        this.events = events;
        this.manager = manager;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiables")
    @ConvertedParameter(index = 1, name = "notification")
    public Object send(RuntimeEnv env, Object... args) {
        Object notifiables = assignParameter(args, 0, false);
        Object notification = assignParameter(args, 1, false);
        notifiables = this.formatNotifiables(env, notifiables);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        notification,
                        ShouldQueue.class,
                        "Illuminate\\Contracts\\Queue\\ShouldQueue"))) {
            return ZVal.assign(this.queueNotification(env, notifiables, notification));
        }

        return ZVal.assign(this.sendNow(env, notifiables, notification));
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
    public Object sendNow(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object notifiables = assignParameter(args, 0, false);
        Object notification = assignParameter(args, 1, false);
        Object channels = assignParameter(args, 2, true);
        if (null == channels) {
            channels = ZVal.getNull();
        }
        Object original = null;
        Object notifiable = null;
        Object viaChannels = null;
        Object channel = null;
        Object ternaryExpressionTemp = null;
        Object notificationId = null;
        notifiables = this.formatNotifiables(env, notifiables);
        original = ZVal.assign(((RuntimeClassInterface) notification).phpClone(env));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult500 : ZVal.getIterable(notifiables, env, true)) {
            notifiable = ZVal.assign(zpairResult500.getValue());
            if (ZVal.isEmpty(
                    viaChannels =
                            ZVal.assign(
                                    ZVal.isTrue(ternaryExpressionTemp = channels)
                                            ? ternaryExpressionTemp
                                            : env.callMethod(
                                                    notification,
                                                    "via",
                                                    NotificationSender.class,
                                                    notifiable)))) {
                continue;
            }

            notificationId =
                    env.callMethod(
                            Str.runtimeStaticObject.uuid(env),
                            "toString",
                            NotificationSender.class);
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult501 : ZVal.getIterable(rToArrayCast(viaChannels), env, true)) {
                channel = ZVal.assign(zpairResult501.getValue());
                this.sendToNotifiable(
                        env,
                        notifiable,
                        notificationId,
                        ((RuntimeClassInterface) original).phpClone(env),
                        channel);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiable")
    @ConvertedParameter(index = 1, name = "id")
    @ConvertedParameter(index = 2, name = "notification")
    @ConvertedParameter(index = 3, name = "channel")
    protected Object sendToNotifiable(RuntimeEnv env, Object... args) {
        Object notifiable = assignParameter(args, 0, false);
        Object id = assignParameter(args, 1, false);
        ReferenceContainer notification =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        Object channel = assignParameter(args, 3, false);
        Object response = null;
        if (!toObjectR(notification.getObject()).accessProp(this, env).name("id").getBool()) {
            toObjectR(notification.getObject()).accessProp(this, env).name("id").set(id);
        }

        if (!ZVal.isTrue(
                this.shouldSendNotification(env, notifiable, notification.getObject(), channel))) {
            return null;
        }

        response =
                env.callMethod(
                        env.callMethod(this.manager, "driver", NotificationSender.class, channel),
                        new RuntimeArgsWithReferences().add(1, notification),
                        "send",
                        NotificationSender.class,
                        notifiable,
                        notification.getObject());
        env.callMethod(
                this.events,
                "dispatch",
                NotificationSender.class,
                new NotificationSent(env, notifiable, notification.getObject(), channel, response));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiable")
    @ConvertedParameter(index = 1, name = "notification")
    @ConvertedParameter(index = 2, name = "channel")
    protected Object shouldSendNotification(RuntimeEnv env, Object... args) {
        Object notifiable = assignParameter(args, 0, false);
        Object notification = assignParameter(args, 1, false);
        Object channel = assignParameter(args, 2, false);
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        env.callMethod(
                                this.events,
                                "until",
                                NotificationSender.class,
                                new NotificationSending(env, notifiable, notification, channel)),
                        "!==",
                        false));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiables")
    @ConvertedParameter(index = 1, name = "notification")
    protected Object queueNotification(RuntimeEnv env, Object... args) {
        Object notifiables = assignParameter(args, 0, false);
        Object notification = assignParameter(args, 1, false);
        Object original = null;
        Object notifiable = null;
        Object channel = null;
        Object notificationId = null;
        notifiables = this.formatNotifiables(env, notifiables);
        original = ZVal.assign(((RuntimeClassInterface) notification).phpClone(env));
        for (ZPair zpairResult502 : ZVal.getIterable(notifiables, env, true)) {
            notifiable = ZVal.assign(zpairResult502.getValue());
            notificationId =
                    env.callMethod(
                            Str.runtimeStaticObject.uuid(env),
                            "toString",
                            NotificationSender.class);
            for (ZPair zpairResult503 :
                    ZVal.getIterable(
                            env.callMethod(original, "via", NotificationSender.class, notifiable),
                            env,
                            true)) {
                channel = ZVal.assign(zpairResult503.getValue());
                notification = ZVal.assign(((RuntimeClassInterface) original).phpClone(env));
                toObjectR(notification).accessProp(this, env).name("id").set(notificationId);
                env.callMethod(
                        this.bus,
                        "dispatch",
                        NotificationSender.class,
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                new SendQueuedNotifications(
                                                        env,
                                                        notifiable,
                                                        notification,
                                                        ZVal.newArray(new ZPair(0, channel))),
                                                "onConnection",
                                                NotificationSender.class,
                                                toObjectR(notification)
                                                        .accessProp(this, env)
                                                        .name("connection")
                                                        .value()),
                                        "onQueue",
                                        NotificationSender.class,
                                        toObjectR(notification)
                                                .accessProp(this, env)
                                                .name("queue")
                                                .value()),
                                "delay",
                                NotificationSender.class,
                                toObjectR(notification)
                                        .accessProp(this, env)
                                        .name("delay")
                                        .value()));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiables")
    protected Object formatNotifiables(RuntimeEnv env, Object... args) {
        Object notifiables = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        notifiables,
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Support
                                                .classes
                                                .Collection
                                                .class,
                                        "Illuminate\\Support\\Collection")))
                && ZVal.toBool(!function_is_array.f.env(env).call(notifiables).getBool())) {
            return ZVal.assign(
                    ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            notifiables,
                                            Model.class,
                                            "Illuminate\\Database\\Eloquent\\Model"))
                            ? new com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Database
                                    .namespaces
                                    .Eloquent
                                    .classes
                                    .Collection(env, ZVal.newArray(new ZPair(0, notifiables)))
                            : ZVal.newArray(new ZPair(0, notifiables)));
        }

        return ZVal.assign(notifiables);
    }

    public static final Object CONST_class = "Illuminate\\Notifications\\NotificationSender";

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
                    .setName("Illuminate\\Notifications\\NotificationSender")
                    .setLookup(
                            NotificationSender.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bus", "events", "manager")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Notifications/NotificationSender.php")
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
