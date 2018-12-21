package com.project.convertedCode.globalNamespace.namespaces.App.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.functions.app;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.classes.DatabaseNotification;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 app/User.php

*/

public class User
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Foundation
                .namespaces
                .Auth
                .classes
                .User {

    public User(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.fillable = ZVal.arrayFromList("name", "email", "password");
        this.hidden = ZVal.arrayFromList("password", "remember_token");
        if (this.getClass() == User.class) {
            this.__construct(env, args);
        }
    }

    public User(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object notifications(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this,
                                "morphMany",
                                User.class,
                                DatabaseNotification.CONST_class,
                                "notifiable"),
                        "orderBy",
                        User.class,
                        "created_at",
                        "desc"));
    }

    @ConvertedMethod
    public Object readNotifications(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this.notifications(env), "whereNotNull", User.class, "read_at"));
    }

    @ConvertedMethod
    public Object unreadNotifications(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this.notifications(env), "whereNull", User.class, "read_at"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "instance")
    public Object notify(RuntimeEnv env, Object... args) {
        ReferenceContainer instance = new BasicReferenceContainer(assignParameter(args, 0, false));
        env.callMethod(
                app.f.env(env).call("Dispatcher").value(),
                new RuntimeArgsWithReferences().add(1, instance),
                "send",
                User.class,
                this,
                instance.getObject());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "instance")
    @ConvertedParameter(
        index = 1,
        name = "channels",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object notifyNow(RuntimeEnv env, Object... args) {
        Object instance = assignParameter(args, 0, false);
        Object channels = assignParameter(args, 1, true);
        if (null == channels) {
            channels = ZVal.getNull();
        }
        env.callMethod(
                app.f.env(env).call("Dispatcher").value(),
                "sendNow",
                User.class,
                this,
                instance,
                channels);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "driver")
    @ConvertedParameter(
        index = 1,
        name = "notification",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object routeNotificationFor(RuntimeEnv env, Object... args) {
        Object driver = assignParameter(args, 0, false);
        ReferenceContainer notification =
                new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == notification.getObject()) {
            notification.setObject(ZVal.getNull());
        }
        Object method = null;
        if (function_method_exists
                .f
                .env(env)
                .call(
                        this,
                        method =
                                "routeNotificationFor"
                                        + toStringR(
                                                StaticMethodUtils.getStaticBaseClass(
                                                                ZVal.resolveClassAlias(env, "Str"),
                                                                env)
                                                        .callUnknownStaticMethod(
                                                                env,
                                                                "studly",
                                                                new RuntimeArgsWithReferences(),
                                                                driver),
                                                env))
                .getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences().add(0, notification),
                            toStringR(method, env),
                            User.class,
                            notification.getObject()));
        }

        switch (toStringR(driver)) {
            case "database":
                return ZVal.assign(this.notifications(env));
            case "mail":
                return ZVal.assign(toObjectR(this).accessProp(this, env).name("email").value());
            case "nexmo":
                return ZVal.assign(
                        toObjectR(this).accessProp(this, env).name("phone_number").value());
        }
        ;
        return null;
    }

    public static final Object CONST_class = "App\\User";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Illuminate
                    .namespaces
                    .Foundation
                    .namespaces
                    .Auth
                    .classes
                    .User
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("App\\User")
                    .setLookup(
                            User.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "appends",
                            "attributes",
                            "casts",
                            "changes",
                            "connection",
                            "dateFormat",
                            "dates",
                            "dispatchesEvents",
                            "exists",
                            "fillable",
                            "fillable",
                            "guarded",
                            "hidden",
                            "hidden",
                            "incrementing",
                            "keyType",
                            "observables",
                            "original",
                            "perPage",
                            "primaryKey",
                            "relations",
                            "rememberTokenName",
                            "table",
                            "timestamps",
                            "touches",
                            "visible",
                            "wasRecentlyCreated",
                            "with",
                            "withCount")
                    .setFilename("app/User.php")
                    .addInterface("Illuminate\\Contracts\\Auth\\Authenticatable")
                    .addInterface("Illuminate\\Contracts\\Auth\\Access\\Authorizable")
                    .addInterface("Illuminate\\Contracts\\Auth\\CanResetPassword")
                    .addInterface("ArrayAccess")
                    .addInterface("Illuminate\\Contracts\\Support\\Arrayable")
                    .addInterface("Illuminate\\Contracts\\Support\\Jsonable")
                    .addInterface("JsonSerializable")
                    .addInterface("Illuminate\\Contracts\\Queue\\QueueableEntity")
                    .addInterface("Illuminate\\Contracts\\Routing\\UrlRoutable")
                    .addTrait("Illuminate\\Notifications\\Notifiable")
                    .addExtendsClass("Illuminate\\Foundation\\Auth\\User")
                    .addExtendsClass("Illuminate\\Database\\Eloquent\\Model")
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
