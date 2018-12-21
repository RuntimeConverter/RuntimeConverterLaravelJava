package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.classes.ChannelManager;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Notifications.classes.Factory;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Notifications.classes.Dispatcher;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ServiceProvider;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Notifications/NotificationServiceProvider.php

*/

public class NotificationServiceProvider extends ServiceProvider {

    public NotificationServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NotificationServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public NotificationServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object boot(RuntimeEnv env, Object... args) {
        env.callMethod(
                this,
                "loadViewsFrom",
                NotificationServiceProvider.class,
                toStringR(
                                env.addRootFilesystemPrefix(
                                        "/vendor/laravel/framework/src/Illuminate/Notifications"),
                                env)
                        + "/resources/views",
                "notifications");
        if (ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("app").value(),
                        "runningInConsole",
                        NotificationServiceProvider.class))) {
            env.callMethod(
                    this,
                    "publishes",
                    NotificationServiceProvider.class,
                    ZVal.newArray(
                            new ZPair(
                                    toStringR(
                                                    env.addRootFilesystemPrefix(
                                                            "/vendor/laravel/framework/src/Illuminate/Notifications"),
                                                    env)
                                            + "/resources/views",
                                    env.callMethod(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("app")
                                                    .value(),
                                            "resourcePath",
                                            NotificationServiceProvider.class,
                                            "views/vendor/notifications"))),
                    "laravel-notifications");
        }

        return null;
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Notifications")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Notifications/NotificationServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                NotificationServiceProvider.class,
                ChannelManager.CONST_class,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Notifications",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object app = assignParameter(args, 0, false);
                        return ZVal.assign(new ChannelManager(env, app));
                    }
                });
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "alias",
                NotificationServiceProvider.class,
                ChannelManager.CONST_class,
                Dispatcher.CONST_class);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "alias",
                NotificationServiceProvider.class,
                ChannelManager.CONST_class,
                Factory.CONST_class);
        return null;
    }

    public static final Object CONST_class =
            "Illuminate\\Notifications\\NotificationServiceProvider";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ServiceProvider.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Notifications\\NotificationServiceProvider")
                    .setLookup(
                            NotificationServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Notifications/NotificationServiceProvider.php")
                    .addExtendsClass("Illuminate\\Support\\ServiceProvider")
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
