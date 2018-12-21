package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Notifications.classes.Factory;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Manager;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Channels.classes.DatabaseChannel;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.classes.NotificationSender;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Channels.classes.NexmoSmsChannel;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Channels.classes.MailChannel;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Channels.classes.BroadcastChannel;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Channels.classes.SlackWebhookChannel;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Notifications/ChannelManager.php

*/

public class ChannelManager extends Manager
        implements com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Contracts
                        .namespaces
                        .Notifications
                        .classes
                        .Dispatcher,
                Factory {

    public Object defaultChannel = "mail";

    public ChannelManager(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ChannelManager.class) {
            this.__construct(env, args);
        }
    }

    public ChannelManager(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiables")
    @ConvertedParameter(index = 1, name = "notification")
    public Object send(RuntimeEnv env, Object... args) {
        Object notifiables = assignParameter(args, 0, false);
        ReferenceContainer notification =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        return ZVal.assign(
                env.callMethod(
                        new NotificationSender(
                                env,
                                this,
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("app").value(),
                                        "make",
                                        ChannelManager.class,
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Contracts
                                                .namespaces
                                                .Bus
                                                .classes
                                                .Dispatcher
                                                .CONST_class),
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("app").value(),
                                        "make",
                                        ChannelManager.class,
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Contracts
                                                .namespaces
                                                .Events
                                                .classes
                                                .Dispatcher
                                                .CONST_class)),
                        new RuntimeArgsWithReferences().add(1, notification),
                        "send",
                        ChannelManager.class,
                        notifiables,
                        notification.getObject()));
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
        Object notifiables = assignParameter(args, 0, false);
        Object notification = assignParameter(args, 1, false);
        Object channels = assignParameter(args, 2, true);
        if (null == channels) {
            channels = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        new NotificationSender(
                                env,
                                this,
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("app").value(),
                                        "make",
                                        ChannelManager.class,
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Contracts
                                                .namespaces
                                                .Bus
                                                .classes
                                                .Dispatcher
                                                .CONST_class),
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("app").value(),
                                        "make",
                                        ChannelManager.class,
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Contracts
                                                .namespaces
                                                .Events
                                                .classes
                                                .Dispatcher
                                                .CONST_class)),
                        "sendNow",
                        ChannelManager.class,
                        notifiables,
                        notification,
                        channels));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object channel(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        return ZVal.assign(env.callMethod(this, "driver", ChannelManager.class, name));
    }

    @ConvertedMethod
    protected Object createDatabaseDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("app").value(),
                        "make",
                        ChannelManager.class,
                        DatabaseChannel.CONST_class));
    }

    @ConvertedMethod
    protected Object createBroadcastDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("app").value(),
                        "make",
                        ChannelManager.class,
                        BroadcastChannel.CONST_class));
    }

    @ConvertedMethod
    protected Object createMailDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("app").value(),
                        "make",
                        ChannelManager.class,
                        MailChannel.CONST_class));
    }

    @ConvertedMethod
    protected Object createNexmoDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new NexmoSmsChannel(
                        env,
                        env.createNew(
                                ZVal.resolveClassAlias(env, "NexmoClient"),
                                env.createNew(
                                        ZVal.resolveClassAlias(env, "NexmoCredentials"),
                                        new ReferenceClassProperty(this, "app", env)
                                                .arrayGet(env, "config", "services.nexmo.key"),
                                        new ReferenceClassProperty(this, "app", env)
                                                .arrayGet(env, "config", "services.nexmo.secret"))),
                        new ReferenceClassProperty(this, "app", env)
                                .arrayGet(env, "config", "services.nexmo.sms_from")));
    }

    @ConvertedMethod
    protected Object createSlackDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new SlackWebhookChannel(
                        env, env.createNew(ZVal.resolveClassAlias(env, "HttpClient"))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "driver")
    protected Object createDriver(RuntimeEnv env, Object... args) {
        Object driver = assignParameter(args, 0, false);
        Object e = null;
        try {
            return ZVal.assign(super.createDriver(env, driver));
        } catch (ConvertedException convertedException48) {
            if (convertedException48.instanceOf(
                    InvalidArgumentException.class, "InvalidArgumentException")) {
                e = convertedException48.getObject();
                if (function_class_exists.f.env(env).call(driver).getBool()) {
                    return ZVal.assign(
                            env.callMethod(
                                    toObjectR(this).accessProp(this, env).name("app").value(),
                                    "make",
                                    ChannelManager.class,
                                    driver));
                }

                throw ZVal.getException(env, e);
            } else {
                throw convertedException48;
            }
        }
    }

    @ConvertedMethod
    public Object getDefaultDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.defaultChannel);
    }

    @ConvertedMethod
    public Object deliversVia(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getDefaultDriver(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "channel")
    public Object deliverVia(RuntimeEnv env, Object... args) {
        Object channel = assignParameter(args, 0, false);
        this.defaultChannel = channel;
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Notifications\\ChannelManager";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Manager.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Notifications\\ChannelManager")
                    .setLookup(
                            ChannelManager.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "customCreators", "defaultChannel", "drivers")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Notifications/ChannelManager.php")
                    .addInterface("Illuminate\\Contracts\\Notifications\\Dispatcher")
                    .addInterface("Illuminate\\Contracts\\Notifications\\Factory")
                    .addExtendsClass("Illuminate\\Support\\Manager")
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
