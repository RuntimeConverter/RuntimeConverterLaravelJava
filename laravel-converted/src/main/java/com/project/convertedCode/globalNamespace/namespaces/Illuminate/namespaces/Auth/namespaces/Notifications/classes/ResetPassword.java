package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Notifications.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Messages.classes.MailMessage;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Lang;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.classes.Notification;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.functions.url;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.functions.route;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.functions.config;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Auth/Notifications/ResetPassword.php

*/

public class ResetPassword extends Notification {

    public Object token = null;

    public ResetPassword(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ResetPassword.class) {
            this.__construct(env, args);
        }
    }

    public ResetPassword(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        this.token = token;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiable")
    public Object via(RuntimeEnv env, Object... args) {
        Object notifiable = assignParameter(args, 0, false);
        return ZVal.assign(ZVal.arrayFromList("mail"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiable")
    public Object toMail(RuntimeEnv env, Object... args) {
        Object notifiable = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Illuminate
                                        .namespaces
                                        .Auth
                                        .namespaces
                                        .Notifications
                                        .classes
                                        .ResetPassword
                                        .RequestStaticProperties
                                        .class)
                        .toMailCallback)) {
            return ZVal.assign(
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Illuminate
                                                            .namespaces
                                                            .Auth
                                                            .namespaces
                                                            .Notifications
                                                            .classes
                                                            .ResetPassword
                                                            .RequestStaticProperties
                                                            .class)
                                            .toMailCallback,
                                    notifiable,
                                    this.token)
                            .value());
        }

        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                new MailMessage(env),
                                                "subject",
                                                ResetPassword.class,
                                                Lang.runtimeStaticObject.callUnknownStaticMethod(
                                                        env,
                                                        "getFromJson",
                                                        new RuntimeArgsWithReferences(),
                                                        "Reset Password Notification")),
                                        "line",
                                        ResetPassword.class,
                                        Lang.runtimeStaticObject.callUnknownStaticMethod(
                                                env,
                                                "getFromJson",
                                                new RuntimeArgsWithReferences(),
                                                "You are receiving this email because we received a password reset request for your account.")),
                                "action",
                                ResetPassword.class,
                                Lang.runtimeStaticObject.callUnknownStaticMethod(
                                        env,
                                        "getFromJson",
                                        new RuntimeArgsWithReferences(),
                                        "Reset Password"),
                                url.f
                                        .env(env)
                                        .call(
                                                toStringR(
                                                                config.f
                                                                        .env(env)
                                                                        .call("app.url")
                                                                        .value(),
                                                                env)
                                                        + toStringR(
                                                                route.f
                                                                        .env(env)
                                                                        .call(
                                                                                "password.reset",
                                                                                this.token,
                                                                                false)
                                                                        .value(),
                                                                env))
                                        .value()),
                        "line",
                        ResetPassword.class,
                        Lang.runtimeStaticObject.callUnknownStaticMethod(
                                env,
                                "getFromJson",
                                new RuntimeArgsWithReferences(),
                                "If you did not request a password reset, no further action is required.")));
    }

    public static final Object CONST_class = "Illuminate\\Auth\\Notifications\\ResetPassword";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Notification.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callback")
        public Object toMailUsing(RuntimeEnv env, Object... args) {
            Object callback = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Auth
                                            .namespaces
                                            .Notifications
                                            .classes
                                            .ResetPassword
                                            .RequestStaticProperties
                                            .class)
                            .toMailCallback =
                    callback;
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object toMailCallback = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Auth\\Notifications\\ResetPassword")
                    .setLookup(
                            ResetPassword.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("id", "token")
                    .setStaticPropertyNames("toMailCallback")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Auth/Notifications/ResetPassword.php")
                    .addExtendsClass("Illuminate\\Notifications\\Notification")
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
