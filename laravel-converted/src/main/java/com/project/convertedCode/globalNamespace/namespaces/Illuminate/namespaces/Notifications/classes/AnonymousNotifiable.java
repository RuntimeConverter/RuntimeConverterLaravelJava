package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.functions.app;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Notifications.classes.Dispatcher;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Notifications/AnonymousNotifiable.php

*/

public class AnonymousNotifiable extends RuntimeClassBase {

    public Object routes = ZVal.newArray();

    public AnonymousNotifiable(RuntimeEnv env, Object... args) {
        super(env);
    }

    public AnonymousNotifiable(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "channel")
    @ConvertedParameter(index = 1, name = "route")
    public Object route(RuntimeEnv env, Object... args) {
        Object channel = assignParameter(args, 0, false);
        Object route = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "routes", env).arrayAccess(env, channel).set(route);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notification")
    public Object notify(RuntimeEnv env, Object... args) {
        ReferenceContainer notification =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        env.callMethod(
                app.f.env(env).call(Dispatcher.CONST_class).value(),
                new RuntimeArgsWithReferences().add(1, notification),
                "send",
                AnonymousNotifiable.class,
                this,
                notification.getObject());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notification")
    public Object notifyNow(RuntimeEnv env, Object... args) {
        Object notification = assignParameter(args, 0, false);
        env.callMethod(
                app.f.env(env).call(Dispatcher.CONST_class).value(),
                "sendNow",
                AnonymousNotifiable.class,
                this,
                notification);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "driver")
    public Object routeNotificationFor(RuntimeEnv env, Object... args) {
        Object driver = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "routes", env)
                                                .arrayGet(env, driver))
                        ? ternaryExpressionTemp
                        : ZVal.getNull());
    }

    @ConvertedMethod
    public Object getKey(RuntimeEnv env, Object... args) {
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Notifications\\AnonymousNotifiable";

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
                    .setName("Illuminate\\Notifications\\AnonymousNotifiable")
                    .setLookup(
                            AnonymousNotifiable.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("routes")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Notifications/AnonymousNotifiable.php")
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
