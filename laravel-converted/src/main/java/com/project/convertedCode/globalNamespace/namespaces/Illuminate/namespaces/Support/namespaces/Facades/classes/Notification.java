package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Facade;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.classes.ChannelManager;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Testing.namespaces.Fakes.classes.NotificationFake;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.classes.AnonymousNotifiable;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/Facades/Notification.php

*/

public class Notification extends Facade {

    public Notification(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Notification(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Support\\Facades\\Notification";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Facade.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object fake(RuntimeEnv env, Object... args) {
            Object fake = null;
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Notification.class)
                    .method("swap")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(fake = new NotificationFake(env))
                    .value();
            return ZVal.assign(fake);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "channel")
        @ConvertedParameter(index = 1, name = "route")
        public Object route(RuntimeEnv env, Object... args) {
            Object channel = assignParameter(args, 0, false);
            Object route = assignParameter(args, 1, false);
            return ZVal.assign(
                    env.callMethod(
                            new AnonymousNotifiable(env),
                            "route",
                            Notification.class,
                            channel,
                            route));
        }

        @ConvertedMethod
        protected Object getFacadeAccessor(RuntimeEnv env, Object... args) {
            return ZVal.assign(ChannelManager.CONST_class);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Support\\Facades\\Notification")
                    .setLookup(
                            Notification.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Support/Facades/Notification.php")
                    .addExtendsClass("Illuminate\\Support\\Facades\\Facade")
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
