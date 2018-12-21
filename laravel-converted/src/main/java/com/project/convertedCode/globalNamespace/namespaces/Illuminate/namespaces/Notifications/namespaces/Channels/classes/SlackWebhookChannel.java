package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Channels.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.functions.data_get;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.collect;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Messages.classes.SlackAttachmentField;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Notifications/Channels/SlackWebhookChannel.php

*/

public class SlackWebhookChannel extends RuntimeClassBase {

    public Object http = null;

    public SlackWebhookChannel(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SlackWebhookChannel.class) {
            this.__construct(env, args);
        }
    }

    public SlackWebhookChannel(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "http", typeHint = "GuzzleHttp\\Client")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object http = assignParameter(args, 0, false);
        this.http = http;
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
        Object url = null;
        if (!ZVal.isTrue(
                url =
                        env.callMethod(
                                notifiable,
                                "routeNotificationFor",
                                SlackWebhookChannel.class,
                                "slack",
                                notification))) {
            return null;
        }

        env.callMethod(
                this.http,
                "post",
                SlackWebhookChannel.class,
                url,
                this.buildJsonPayload(
                        env,
                        env.callMethod(
                                notification, "toSlack", SlackWebhookChannel.class, notifiable)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "message",
        typeHint = "Illuminate\\Notifications\\Messages\\SlackMessage"
    )
    protected Object buildJsonPayload(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object optionalFields = null;
        optionalFields =
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(
                                                "channel",
                                                data_get.f
                                                        .env(env)
                                                        .call(message, "channel")
                                                        .value()),
                                        new ZPair(
                                                "icon_emoji",
                                                data_get.f.env(env).call(message, "icon").value()),
                                        new ZPair(
                                                "icon_url",
                                                data_get.f.env(env).call(message, "image").value()),
                                        new ZPair(
                                                "link_names",
                                                data_get.f
                                                        .env(env)
                                                        .call(message, "linkNames")
                                                        .value()),
                                        new ZPair(
                                                "unfurl_links",
                                                data_get.f
                                                        .env(env)
                                                        .call(message, "unfurlLinks")
                                                        .value()),
                                        new ZPair(
                                                "unfurl_media",
                                                data_get.f
                                                        .env(env)
                                                        .call(message, "unfurlMedia")
                                                        .value()),
                                        new ZPair(
                                                "username",
                                                data_get.f
                                                        .env(env)
                                                        .call(message, "username")
                                                        .value())))
                        .value();
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(
                                                "json",
                                                function_array_merge
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                ZVal.newArray(
                                                                        new ZPair(
                                                                                "text",
                                                                                toObjectR(message)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "content")
                                                                                        .value()),
                                                                        new ZPair(
                                                                                "attachments",
                                                                                this.attachments(
                                                                                        env,
                                                                                        message))),
                                                                optionalFields)
                                                        .value())),
                                toObjectR(message).accessProp(this, env).name("http").value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "message",
        typeHint = "Illuminate\\Notifications\\Messages\\SlackMessage"
    )
    protected Object attachments(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Notifications/Channels")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Notifications/Channels/SlackWebhookChannel.php");
        Object message = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                collect.f
                                        .env(env)
                                        .call(
                                                toObjectR(message)
                                                        .accessProp(this, env)
                                                        .name("attachments")
                                                        .value())
                                        .value(),
                                "map",
                                SlackWebhookChannel.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Notifications\\Channels",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "attachment")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object attachment = assignParameter(args, 0, false);
                                        Object ternaryExpressionTemp = null;
                                        Object message = null;
                                        message =
                                                this.contextReferences.getCapturedValue("message");
                                        return ZVal.assign(
                                                function_array_filter
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                ZVal.newArray(
                                                                        new ZPair(
                                                                                "author_icon",
                                                                                toObjectR(
                                                                                                attachment)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "authorIcon")
                                                                                        .value()),
                                                                        new ZPair(
                                                                                "author_link",
                                                                                toObjectR(
                                                                                                attachment)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "authorLink")
                                                                                        .value()),
                                                                        new ZPair(
                                                                                "author_name",
                                                                                toObjectR(
                                                                                                attachment)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "authorName")
                                                                                        .value()),
                                                                        new ZPair(
                                                                                "color",
                                                                                ZVal.isTrue(
                                                                                                ternaryExpressionTemp =
                                                                                                        toObjectR(
                                                                                                                        attachment)
                                                                                                                .accessProp(
                                                                                                                        this,
                                                                                                                        env)
                                                                                                                .name(
                                                                                                                        "color")
                                                                                                                .value())
                                                                                        ? ternaryExpressionTemp
                                                                                        : env
                                                                                                .callMethod(
                                                                                                        message,
                                                                                                        "color",
                                                                                                        SlackWebhookChannel
                                                                                                                .class)),
                                                                        new ZPair(
                                                                                "fallback",
                                                                                toObjectR(
                                                                                                attachment)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "fallback")
                                                                                        .value()),
                                                                        new ZPair(
                                                                                "fields",
                                                                                SlackWebhookChannel
                                                                                        .this
                                                                                        .fields(
                                                                                                env,
                                                                                                attachment)),
                                                                        new ZPair(
                                                                                "footer",
                                                                                toObjectR(
                                                                                                attachment)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "footer")
                                                                                        .value()),
                                                                        new ZPair(
                                                                                "footer_icon",
                                                                                toObjectR(
                                                                                                attachment)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "footerIcon")
                                                                                        .value()),
                                                                        new ZPair(
                                                                                "image_url",
                                                                                toObjectR(
                                                                                                attachment)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "imageUrl")
                                                                                        .value()),
                                                                        new ZPair(
                                                                                "mrkdwn_in",
                                                                                toObjectR(
                                                                                                attachment)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "markdown")
                                                                                        .value()),
                                                                        new ZPair(
                                                                                "pretext",
                                                                                toObjectR(
                                                                                                attachment)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "pretext")
                                                                                        .value()),
                                                                        new ZPair(
                                                                                "text",
                                                                                toObjectR(
                                                                                                attachment)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "content")
                                                                                        .value()),
                                                                        new ZPair(
                                                                                "thumb_url",
                                                                                toObjectR(
                                                                                                attachment)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "thumbUrl")
                                                                                        .value()),
                                                                        new ZPair(
                                                                                "title",
                                                                                toObjectR(
                                                                                                attachment)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "title")
                                                                                        .value()),
                                                                        new ZPair(
                                                                                "title_link",
                                                                                toObjectR(
                                                                                                attachment)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name("url")
                                                                                        .value()),
                                                                        new ZPair(
                                                                                "ts",
                                                                                toObjectR(
                                                                                                attachment)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "timestamp")
                                                                                        .value())))
                                                        .value());
                                    }
                                }.use("message", message)),
                        "all",
                        SlackWebhookChannel.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "attachment",
        typeHint = "Illuminate\\Notifications\\Messages\\SlackAttachment"
    )
    protected Object fields(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Notifications/Channels")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Notifications/Channels/SlackWebhookChannel.php");
        Object attachment = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        collect.f
                                                .env(env)
                                                .call(
                                                        toObjectR(attachment)
                                                                .accessProp(this, env)
                                                                .name("fields")
                                                                .value())
                                                .value(),
                                        "map",
                                        SlackWebhookChannel.class,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Notifications\\Channels",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "value")
                                            @ConvertedParameter(index = 1, name = "key")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object value = assignParameter(args, 0, false);
                                                Object key = assignParameter(args, 1, false);
                                                if (ZVal.isTrue(
                                                        ZVal.checkInstanceType(
                                                                value,
                                                                SlackAttachmentField.class,
                                                                "Illuminate\\Notifications\\Messages\\SlackAttachmentField"))) {
                                                    return ZVal.assign(
                                                            env.callMethod(
                                                                    value,
                                                                    "toArray",
                                                                    SlackWebhookChannel.class));
                                                }

                                                return ZVal.assign(
                                                        ZVal.newArray(
                                                                new ZPair("title", key),
                                                                new ZPair("value", value),
                                                                new ZPair("short", true)));
                                            }
                                        }),
                                "values",
                                SlackWebhookChannel.class),
                        "all",
                        SlackWebhookChannel.class));
    }

    public static final Object CONST_class =
            "Illuminate\\Notifications\\Channels\\SlackWebhookChannel";

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
                    .setName("Illuminate\\Notifications\\Channels\\SlackWebhookChannel")
                    .setLookup(
                            SlackWebhookChannel.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("http")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Notifications/Channels/SlackWebhookChannel.php")
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
