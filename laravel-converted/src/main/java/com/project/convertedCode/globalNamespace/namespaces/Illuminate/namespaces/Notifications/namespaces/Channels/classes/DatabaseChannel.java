package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Channels.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Notifications/Channels/DatabaseChannel.php

*/

public class DatabaseChannel extends RuntimeClassBase {

    public DatabaseChannel(RuntimeEnv env, Object... args) {
        super(env);
    }

    public DatabaseChannel(NoConstructor n) {
        super(n);
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
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                notifiable,
                                "routeNotificationFor",
                                DatabaseChannel.class,
                                "database",
                                notification),
                        "create",
                        DatabaseChannel.class,
                        this.buildPayload(env, notifiable, notification)));
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
        Object data = null;
        if (function_method_exists.f.env(env).call(notification, "toDatabase").getBool()) {
            return ZVal.assign(
                    function_is_array
                                    .f
                                    .env(env)
                                    .call(
                                            data =
                                                    env.callMethod(
                                                            notification,
                                                            "toDatabase",
                                                            DatabaseChannel.class,
                                                            notifiable))
                                    .getBool()
                            ? data
                            : toObjectR(data).accessProp(this, env).name("data").value());
        }

        if (function_method_exists.f.env(env).call(notification, "toArray").getBool()) {
            return ZVal.assign(
                    env.callMethod(notification, "toArray", DatabaseChannel.class, notifiable));
        }

        throw ZVal.getException(
                env,
                new RuntimeException(env, "Notification is missing toDatabase / toArray method."));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiable")
    @ConvertedParameter(
        index = 1,
        name = "notification",
        typeHint = "Illuminate\\Notifications\\Notification"
    )
    protected Object buildPayload(RuntimeEnv env, Object... args) {
        Object notifiable = assignParameter(args, 0, false);
        Object notification = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "id",
                                toObjectR(notification).accessProp(this, env).name("id").value()),
                        new ZPair("type", function_get_class.f.env(env).call(notification).value()),
                        new ZPair("data", this.getData(env, notifiable, notification)),
                        new ZPair("read_at", ZVal.getNull())));
    }

    public static final Object CONST_class = "Illuminate\\Notifications\\Channels\\DatabaseChannel";

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
                    .setName("Illuminate\\Notifications\\Channels\\DatabaseChannel")
                    .setLookup(
                            DatabaseChannel.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Notifications/Channels/DatabaseChannel.php")
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
