package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Channels.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.functions.class_basename;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Mail.classes.Mailable;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Notifications/Channels/MailChannel.php

*/

public class MailChannel extends RuntimeClassBase {

    public Object mailer = null;

    public Object markdown = null;

    public MailChannel(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MailChannel.class) {
            this.__construct(env, args);
        }
    }

    public MailChannel(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "mailer",
        typeHint = "Illuminate\\Contracts\\Mail\\Mailer"
    )
    @ConvertedParameter(index = 1, name = "markdown", typeHint = "Illuminate\\Mail\\Markdown")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object mailer = assignParameter(args, 0, false);
        Object markdown = assignParameter(args, 1, false);
        this.mailer = mailer;
        this.markdown = markdown;
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
        PassByReferenceArgs rLastRefArgs;
        Object notifiable = assignParameter(args, 0, false);
        Object notification = assignParameter(args, 1, false);
        Object message = null;
        message = env.callMethod(notification, "toMail", MailChannel.class, notifiable);
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        notifiable,
                                        "routeNotificationFor",
                                        MailChannel.class,
                                        "mail",
                                        notification)))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        message,
                                        Mailable.class,
                                        "Illuminate\\Contracts\\Mail\\Mailable")))) {
            return null;
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        message, Mailable.class, "Illuminate\\Contracts\\Mail\\Mailable"))) {
            return ZVal.assign(env.callMethod(message, "send", MailChannel.class, this.mailer));
        }

        env.callMethod(
                this.mailer,
                rLastRefArgs =
                        new RuntimeArgsWithReferences()
                                .add(
                                        1,
                                        handleReturnReference(
                                                env.callMethod(
                                                        message, "data", MailChannel.class))),
                "send",
                MailChannel.class,
                this.buildView(env, message),
                rLastRefArgs.get(1),
                this.messageBuilder(env, notifiable, notification, message));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiable")
    @ConvertedParameter(index = 1, name = "notification")
    @ConvertedParameter(index = 2, name = "message")
    protected Object messageBuilder(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Notifications/Channels")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Notifications/Channels/MailChannel.php");
        Object notifiable = assignParameter(args, 0, false);
        Object notification = assignParameter(args, 1, false);
        Object message = assignParameter(args, 2, false);
        return ZVal.assign(
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Notifications\\Channels",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "mailMessage")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object mailMessage = assignParameter(args, 0, false);
                        Object notification = null;
                        Object notifiable = null;
                        Object message = null;
                        notification = this.contextReferences.getCapturedValue("notification");
                        notifiable = this.contextReferences.getCapturedValue("notifiable");
                        message = this.contextReferences.getCapturedValue("message");
                        MailChannel.this.buildMessage(
                                env, mailMessage, notifiable, notification, message);
                        return null;
                    }
                }.use("notification", notification)
                        .use("notifiable", notifiable)
                        .use("message", message));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    protected Object buildView(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        if (toObjectR(message).accessProp(this, env).name("view").getBool()) {
            return ZVal.assign(toObjectR(message).accessProp(this, env).name("view").value());
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "html",
                                env.callMethod(
                                        this.markdown,
                                        "render",
                                        MailChannel.class,
                                        toObjectR(message)
                                                .accessProp(this, env)
                                                .name("markdown")
                                                .value(),
                                        env.callMethod(message, "data", MailChannel.class))),
                        new ZPair(
                                "text",
                                env.callMethod(
                                        this.markdown,
                                        "renderText",
                                        MailChannel.class,
                                        toObjectR(message)
                                                .accessProp(this, env)
                                                .name("markdown")
                                                .value(),
                                        env.callMethod(message, "data", MailChannel.class)))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailMessage")
    @ConvertedParameter(index = 1, name = "notifiable")
    @ConvertedParameter(index = 2, name = "notification")
    @ConvertedParameter(index = 3, name = "message")
    protected Object buildMessage(RuntimeEnv env, Object... args) {
        Object mailMessage = assignParameter(args, 0, false);
        Object notifiable = assignParameter(args, 1, false);
        Object notification = assignParameter(args, 2, false);
        Object message = assignParameter(args, 3, false);
        Object ternaryExpressionTemp = null;
        this.addressMessage(env, mailMessage, notifiable, notification, message);
        env.callMethod(
                mailMessage,
                "subject",
                MailChannel.class,
                ZVal.isTrue(
                                ternaryExpressionTemp =
                                        toObjectR(message)
                                                .accessProp(this, env)
                                                .name("subject")
                                                .value())
                        ? ternaryExpressionTemp
                        : Str.runtimeStaticObject.title(
                                env,
                                Str.runtimeStaticObject.snake(
                                        env,
                                        class_basename.f.env(env).call(notification).value(),
                                        " ")));
        this.addAttachments(env, mailMessage, message);
        if (!function_is_null
                .f
                .env(env)
                .call(toObjectR(message).accessProp(this, env).name("priority").value())
                .getBool()) {
            env.callMethod(
                    mailMessage,
                    "setPriority",
                    MailChannel.class,
                    toObjectR(message).accessProp(this, env).name("priority").value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailMessage")
    @ConvertedParameter(index = 1, name = "notifiable")
    @ConvertedParameter(index = 2, name = "notification")
    @ConvertedParameter(index = 3, name = "message")
    protected Object addressMessage(RuntimeEnv env, Object... args) {
        Object mailMessage = assignParameter(args, 0, false);
        Object notifiable = assignParameter(args, 1, false);
        Object notification = assignParameter(args, 2, false);
        Object message = assignParameter(args, 3, false);
        ReferenceContainer cc = new BasicReferenceContainer(null);
        ReferenceContainer bcc = new BasicReferenceContainer(null);
        this.addSender(env, mailMessage, message);
        env.callMethod(
                mailMessage,
                "to",
                MailChannel.class,
                this.getRecipients(env, notifiable, notification, message));
        if (!ZVal.isEmpty(toObjectR(message).accessProp(this, env).name("cc").value())) {
            for (ZPair zpairResult495 :
                    ZVal.getIterable(
                            toObjectR(message).accessProp(this, env).name("cc").value(),
                            env,
                            true)) {
                cc.setObject(ZVal.assign(zpairResult495.getValue()));
                env.callMethod(
                        mailMessage,
                        "cc",
                        MailChannel.class,
                        cc.arrayGet(env, 0),
                        Arr.runtimeStaticObject.get(env, cc.getObject(), 1));
            }
        }

        if (!ZVal.isEmpty(toObjectR(message).accessProp(this, env).name("bcc").value())) {
            for (ZPair zpairResult496 :
                    ZVal.getIterable(
                            toObjectR(message).accessProp(this, env).name("bcc").value(),
                            env,
                            true)) {
                bcc.setObject(ZVal.assign(zpairResult496.getValue()));
                env.callMethod(
                        mailMessage,
                        "bcc",
                        MailChannel.class,
                        bcc.arrayGet(env, 0),
                        Arr.runtimeStaticObject.get(env, bcc.getObject(), 1));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailMessage")
    @ConvertedParameter(index = 1, name = "message")
    protected Object addSender(RuntimeEnv env, Object... args) {
        Object mailMessage = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        ReferenceContainer replyTo = new BasicReferenceContainer(null);
        if (!ZVal.isEmpty(toObjectR(message).accessProp(this, env).name("from").value())) {
            env.callMethod(
                    mailMessage,
                    "from",
                    MailChannel.class,
                    new ReferenceClassProperty(message, "from", env).arrayGet(env, 0),
                    Arr.runtimeStaticObject.get(
                            env, toObjectR(message).accessProp(this, env).name("from").value(), 1));
        }

        if (!ZVal.isEmpty(toObjectR(message).accessProp(this, env).name("replyTo").value())) {
            for (ZPair zpairResult497 :
                    ZVal.getIterable(
                            toObjectR(message).accessProp(this, env).name("replyTo").value(),
                            env,
                            true)) {
                replyTo.setObject(ZVal.assign(zpairResult497.getValue()));
                env.callMethod(
                        mailMessage,
                        "replyTo",
                        MailChannel.class,
                        replyTo.arrayGet(env, 0),
                        Arr.runtimeStaticObject.get(env, replyTo.getObject(), 1));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiable")
    @ConvertedParameter(index = 1, name = "notification")
    @ConvertedParameter(index = 2, name = "message")
    protected Object getRecipients(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Notifications/Channels")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Notifications/Channels/MailChannel.php");
        Object notifiable = assignParameter(args, 0, false);
        Object notification = assignParameter(args, 1, false);
        Object message = assignParameter(args, 2, false);
        Object recipients = null;
        if (function_is_string
                .f
                .env(env)
                .call(
                        recipients =
                                env.callMethod(
                                        notifiable,
                                        "routeNotificationFor",
                                        MailChannel.class,
                                        "mail",
                                        notification))
                .getBool()) {
            recipients = ZVal.newArray(new ZPair(0, recipients));
        }

        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(recipients).value(),
                                "mapWithKeys",
                                MailChannel.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Notifications\\Channels",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "recipient")
                                    @ConvertedParameter(index = 1, name = "email")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object recipient = assignParameter(args, 0, false);
                                        Object email = assignParameter(args, 1, false);
                                        return ZVal.assign(
                                                function_is_numeric.f.env(env).call(email).getBool()
                                                        ? ZVal.newArray(
                                                                new ZPair(
                                                                        0,
                                                                        function_is_string
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                recipient)
                                                                                        .getBool()
                                                                                ? recipient
                                                                                : toObjectR(
                                                                                                recipient)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "email")
                                                                                        .value()))
                                                        : ZVal.newArray(
                                                                new ZPair(email, recipient)));
                                    }
                                }),
                        "all",
                        MailChannel.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailMessage")
    @ConvertedParameter(index = 1, name = "message")
    protected Object addAttachments(RuntimeEnv env, Object... args) {
        Object mailMessage = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        ReferenceContainer attachment = new BasicReferenceContainer(null);
        for (ZPair zpairResult498 :
                ZVal.getIterable(
                        toObjectR(message).accessProp(this, env).name("attachments").value(),
                        env,
                        true)) {
            attachment.setObject(ZVal.assign(zpairResult498.getValue()));
            env.callMethod(
                    mailMessage,
                    "attach",
                    MailChannel.class,
                    attachment.arrayGet(env, "file"),
                    attachment.arrayGet(env, "options"));
        }

        for (ZPair zpairResult499 :
                ZVal.getIterable(
                        toObjectR(message).accessProp(this, env).name("rawAttachments").value(),
                        env,
                        true)) {
            attachment.setObject(ZVal.assign(zpairResult499.getValue()));
            env.callMethod(
                    mailMessage,
                    "attachData",
                    MailChannel.class,
                    attachment.arrayGet(env, "data"),
                    attachment.arrayGet(env, "name"),
                    attachment.arrayGet(env, "options"));
        }

        return null;
    }

    public static final Object CONST_class = "Illuminate\\Notifications\\Channels\\MailChannel";

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
                    .setName("Illuminate\\Notifications\\Channels\\MailChannel")
                    .setLookup(
                            MailChannel.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("mailer", "markdown")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Notifications/Channels/MailChannel.php")
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
