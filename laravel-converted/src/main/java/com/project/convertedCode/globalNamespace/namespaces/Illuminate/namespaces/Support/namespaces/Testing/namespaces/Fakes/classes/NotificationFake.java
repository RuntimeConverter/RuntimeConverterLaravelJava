package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Testing.namespaces.Fakes.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Notifications.classes.Factory;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Notifications.classes.Dispatcher;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Assert;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Collection;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/NotificationFake.php

*/

public class NotificationFake extends RuntimeClassBase implements Factory, Dispatcher {

    public Object notifications = ZVal.newArray();

    public NotificationFake(RuntimeEnv env, Object... args) {
        super(env);
    }

    public NotificationFake(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiable")
    @ConvertedParameter(index = 1, name = "notification")
    @ConvertedParameter(
        index = 2,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertSentTo(RuntimeEnv env, Object... args) {
        Object notifiable = assignParameter(args, 0, false);
        Object notification = assignParameter(args, 1, false);
        Object callback = assignParameter(args, 2, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object singleNotifiable = null;
        if (ZVal.toBool(function_is_array.f.env(env).call(notifiable).value())
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                notifiable, Collection.class, "Illuminate\\Support\\Collection"))) {
            for (ZPair zpairResult590 : ZVal.getIterable(notifiable, env, true)) {
                singleNotifiable = ZVal.assign(zpairResult590.getValue());
                this.assertSentTo(env, singleNotifiable, notification, callback);
            }

            return null;
        }

        if (function_is_numeric.f.env(env).call(callback).getBool()) {
            return ZVal.assign(this.assertSentToTimes(env, notifiable, notification, callback));
        }

        Assert.runtimeStaticObject.assertTrue(
                env,
                ZVal.isGreaterThan(
                        env.callMethod(
                                this.sent(env, notifiable, notification, callback),
                                "count",
                                NotificationFake.class),
                        '>',
                        0),
                "The expected [" + toStringR(notification, env) + "] notification was not sent.");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiable")
    @ConvertedParameter(index = 1, name = "notification")
    @ConvertedParameter(index = 2, name = "times", defaultValue = "1", defaultValueType = "number")
    public Object assertSentToTimes(RuntimeEnv env, Object... args) {
        Object notifiable = assignParameter(args, 0, false);
        Object notification = assignParameter(args, 1, false);
        Object times = assignParameter(args, 2, true);
        if (null == times) {
            times = 1;
        }
        Object count = null;
        Assert.runtimeStaticObject.assertTrue(
                env,
                ZVal.strictEqualityCheck(
                        count =
                                env.callMethod(
                                        this.sent(env, notifiable, notification),
                                        "count",
                                        NotificationFake.class),
                        "===",
                        times),
                "Expected ["
                        + toStringR(notification, env)
                        + "] to be sent "
                        + toStringR(count, env)
                        + " times, but was sent "
                        + toStringR(times, env)
                        + " times.");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiable")
    @ConvertedParameter(index = 1, name = "notification")
    @ConvertedParameter(
        index = 2,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertNotSentTo(RuntimeEnv env, Object... args) {
        Object notifiable = assignParameter(args, 0, false);
        Object notification = assignParameter(args, 1, false);
        Object callback = assignParameter(args, 2, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object singleNotifiable = null;
        if (ZVal.toBool(function_is_array.f.env(env).call(notifiable).value())
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                notifiable, Collection.class, "Illuminate\\Support\\Collection"))) {
            for (ZPair zpairResult591 : ZVal.getIterable(notifiable, env, true)) {
                singleNotifiable = ZVal.assign(zpairResult591.getValue());
                this.assertNotSentTo(env, singleNotifiable, notification, callback);
            }

            return null;
        }

        Assert.runtimeStaticObject.assertTrue(
                env,
                ZVal.strictEqualityCheck(
                        env.callMethod(
                                this.sent(env, notifiable, notification, callback),
                                "count",
                                NotificationFake.class),
                        "===",
                        0),
                "The unexpected [" + toStringR(notification, env) + "] notification was sent.");
        return null;
    }

    @ConvertedMethod
    public Object assertNothingSent(RuntimeEnv env, Object... args) {
        Assert.runtimeStaticObject.assertEmpty(
                env, this.notifications, "Notifications were sent unexpectedly.");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expectedCount")
    @ConvertedParameter(index = 1, name = "notification")
    public Object assertTimesSent(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/NotificationFake.php");
        Object expectedCount = assignParameter(args, 0, false);
        Object notification = assignParameter(args, 1, false);
        Object actualCount = null;
        actualCount =
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(this.notifications).value(),
                                new RuntimeArgsWithReferences(),
                                "flatten",
                                NotificationFake.class,
                                1),
                        "reduce",
                        NotificationFake.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Support\\Testing\\Fakes",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "count")
                            @ConvertedParameter(index = 1, name = "sent")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object count = assignParameter(args, 0, false);
                                ReferenceContainer sent =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 1, false));
                                Object notification = null;
                                Object ternaryExpressionTemp = null;
                                notification =
                                        this.contextReferences.getCapturedValue("notification");
                                return ZVal.assign(
                                        ZVal.add(
                                                count,
                                                function_count
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                ZVal.isDefined(
                                                                                ternaryExpressionTemp =
                                                                                        sent
                                                                                                .arrayGet(
                                                                                                        env,
                                                                                                        notification))
                                                                        ? ternaryExpressionTemp
                                                                        : ZVal.newArray())
                                                        .value()));
                            }
                        }.use("notification", notification),
                        0);
        Assert.runtimeStaticObject.assertSame(
                env,
                expectedCount,
                actualCount,
                "Expected ["
                        + toStringR(notification, env)
                        + "] to be sent "
                        + toStringR(expectedCount, env)
                        + " times, but was sent "
                        + toStringR(actualCount, env)
                        + " times.");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiable")
    @ConvertedParameter(index = 1, name = "notification")
    @ConvertedParameter(
        index = 2,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object sent(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/NotificationFake.php");
        Object notifiable = assignParameter(args, 0, false);
        Object notification = assignParameter(args, 1, false);
        Object callback = assignParameter(args, 2, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        Object notifications = null;
        if (!ZVal.isTrue(this.hasSent(env, notifiable, notification))) {
            return ZVal.assign(collect.f.env(env).call().value());
        }

        callback =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = callback)
                                ? ternaryExpressionTemp
                                : new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Support\\Testing\\Fakes",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        return ZVal.assign(true);
                                    }
                                });
        notifications =
                collect.f
                        .env(env)
                        .call(this.notificationsFor(env, notifiable, notification))
                        .value();
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                notifications,
                                "filter",
                                NotificationFake.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Support\\Testing\\Fakes",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "arguments")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object arguments = assignParameter(args, 0, false);
                                        Object callback = null;
                                        callback =
                                                this.contextReferences.getCapturedValue("callback");
                                        return ZVal.assign(
                                                env.callFunctionDynamic(
                                                                callback,
                                                                new RuntimeArgsWithReferences(),
                                                                PackedVaradicArgs.unpack(
                                                                        new PackedVaradicArgs(
                                                                                function_array_values
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                arguments)
                                                                                        .value())))
                                                        .value());
                                    }
                                }.use("callback", callback)),
                        "pluck",
                        NotificationFake.class,
                        "notification"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiable")
    @ConvertedParameter(index = 1, name = "notification")
    public Object hasSent(RuntimeEnv env, Object... args) {
        Object notifiable = assignParameter(args, 0, false);
        Object notification = assignParameter(args, 1, false);
        return ZVal.assign(!ZVal.isEmpty(this.notificationsFor(env, notifiable, notification)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiable")
    @ConvertedParameter(index = 1, name = "notification")
    protected Object notificationsFor(RuntimeEnv env, Object... args) {
        Object notifiable = assignParameter(args, 0, false);
        Object notification = assignParameter(args, 1, false);
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "notifications", env),
                env,
                function_get_class.f.env(env).call(notifiable).value(),
                env.callMethod(notifiable, "getKey", NotificationFake.class),
                notification)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "notifications", env)
                            .arrayGet(
                                    env,
                                    function_get_class.f.env(env).call(notifiable).value(),
                                    env.callMethod(notifiable, "getKey", NotificationFake.class),
                                    notification));
        }

        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiables")
    @ConvertedParameter(index = 1, name = "notification")
    public Object send(RuntimeEnv env, Object... args) {
        Object notifiables = assignParameter(args, 0, false);
        Object notification = assignParameter(args, 1, false);
        return ZVal.assign(this.sendNow(env, notifiables, notification));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiables")
    @ConvertedParameter(index = 1, name = "notification")
    public Object sendNow(RuntimeEnv env, Object... args) {
        Object notifiables = assignParameter(args, 0, false);
        Object notification = assignParameter(args, 1, false);
        Object notifiable = null;
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        notifiables,
                                        Collection.class,
                                        "Illuminate\\Support\\Collection")))
                && ZVal.toBool(!function_is_array.f.env(env).call(notifiables).getBool())) {
            notifiables = ZVal.newArray(new ZPair(0, notifiables));
        }

        for (ZPair zpairResult592 : ZVal.getIterable(notifiables, env, true)) {
            notifiable = ZVal.assign(zpairResult592.getValue());
            if (!toObjectR(notification).accessProp(this, env).name("id").getBool()) {
                toObjectR(notification)
                        .accessProp(this, env)
                        .name("id")
                        .set(
                                env.callMethod(
                                        Str.runtimeStaticObject.uuid(env),
                                        "toString",
                                        NotificationFake.class));
            }

            new ReferenceClassProperty(this, "notifications", env)
                    .arrayAppend(
                            env,
                            function_get_class.f.env(env).call(notifiable).value(),
                            env.callMethod(notifiable, "getKey", NotificationFake.class),
                            function_get_class.f.env(env).call(notification).value())
                    .set(
                            ZVal.newArray(
                                    new ZPair("notification", notification),
                                    new ZPair(
                                            "channels",
                                            env.callMethod(
                                                    notification,
                                                    "via",
                                                    NotificationFake.class,
                                                    notifiable)),
                                    new ZPair("notifiable", notifiable)));
        }

        return null;
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
        return null;
    }

    public static final Object CONST_class =
            "Illuminate\\Support\\Testing\\Fakes\\NotificationFake";

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
                    .setName("Illuminate\\Support\\Testing\\Fakes\\NotificationFake")
                    .setLookup(
                            NotificationFake.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("notifications")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/NotificationFake.php")
                    .addInterface("Illuminate\\Contracts\\Notifications\\Factory")
                    .addInterface("Illuminate\\Contracts\\Notifications\\Dispatcher")
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
