package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Testing.namespaces.Fakes.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Mail.classes.Mailer;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Mail.classes.Mailable;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Assert;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.collect;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Testing.namespaces.Fakes.classes.PendingMailFake;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes.ShouldQueue;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/MailFake.php

*/

public class MailFake extends RuntimeClassBase implements Mailer {

    public Object mailables = ZVal.newArray();

    public Object queuedMailables = ZVal.newArray();

    public MailFake(RuntimeEnv env, Object... args) {
        super(env);
    }

    public MailFake(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailable")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertSent(RuntimeEnv env, Object... args) {
        Object mailable = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        if (function_is_numeric.f.env(env).call(callback).getBool()) {
            return ZVal.assign(this.assertSentTimes(env, mailable, callback));
        }

        Assert.runtimeStaticObject.assertTrue(
                env,
                ZVal.isGreaterThan(
                        env.callMethod(this.sent(env, mailable, callback), "count", MailFake.class),
                        '>',
                        0),
                "The expected [" + toStringR(mailable, env) + "] mailable was not sent.");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailable")
    @ConvertedParameter(index = 1, name = "times", defaultValue = "1", defaultValueType = "number")
    protected Object assertSentTimes(RuntimeEnv env, Object... args) {
        Object mailable = assignParameter(args, 0, false);
        Object times = assignParameter(args, 1, true);
        if (null == times) {
            times = 1;
        }
        Object count = null;
        Assert.runtimeStaticObject.assertTrue(
                env,
                ZVal.strictEqualityCheck(
                        count = env.callMethod(this.sent(env, mailable), "count", MailFake.class),
                        "===",
                        times),
                "The expected ["
                        + toStringR(mailable, env)
                        + "] mailable was sent "
                        + toStringR(count, env)
                        + " times instead of "
                        + toStringR(times, env)
                        + " times.");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailable")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertNotSent(RuntimeEnv env, Object... args) {
        Object mailable = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Assert.runtimeStaticObject.assertTrue(
                env,
                ZVal.strictEqualityCheck(
                        env.callMethod(this.sent(env, mailable, callback), "count", MailFake.class),
                        "===",
                        0),
                "The unexpected [" + toStringR(mailable, env) + "] mailable was sent.");
        return null;
    }

    @ConvertedMethod
    public Object assertNothingSent(RuntimeEnv env, Object... args) {
        Assert.runtimeStaticObject.assertEmpty(
                env, this.mailables, "Mailables were sent unexpectedly.");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailable")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertQueued(RuntimeEnv env, Object... args) {
        Object mailable = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        if (function_is_numeric.f.env(env).call(callback).getBool()) {
            return ZVal.assign(this.assertQueuedTimes(env, mailable, callback));
        }

        Assert.runtimeStaticObject.assertTrue(
                env,
                ZVal.isGreaterThan(
                        env.callMethod(
                                this.queued(env, mailable, callback), "count", MailFake.class),
                        '>',
                        0),
                "The expected [" + toStringR(mailable, env) + "] mailable was not queued.");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailable")
    @ConvertedParameter(index = 1, name = "times", defaultValue = "1", defaultValueType = "number")
    protected Object assertQueuedTimes(RuntimeEnv env, Object... args) {
        Object mailable = assignParameter(args, 0, false);
        Object times = assignParameter(args, 1, true);
        if (null == times) {
            times = 1;
        }
        Object count = null;
        Assert.runtimeStaticObject.assertTrue(
                env,
                ZVal.strictEqualityCheck(
                        count = env.callMethod(this.queued(env, mailable), "count", MailFake.class),
                        "===",
                        times),
                "The expected ["
                        + toStringR(mailable, env)
                        + "] mailable was queued "
                        + toStringR(count, env)
                        + " times instead of "
                        + toStringR(times, env)
                        + " times.");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailable")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertNotQueued(RuntimeEnv env, Object... args) {
        Object mailable = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Assert.runtimeStaticObject.assertTrue(
                env,
                ZVal.strictEqualityCheck(
                        env.callMethod(
                                this.queued(env, mailable, callback), "count", MailFake.class),
                        "===",
                        0),
                "The unexpected [" + toStringR(mailable, env) + "] mailable was queued.");
        return null;
    }

    @ConvertedMethod
    public Object assertNothingQueued(RuntimeEnv env, Object... args) {
        Assert.runtimeStaticObject.assertEmpty(
                env, this.queuedMailables, "Mailables were queued unexpectedly.");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailable")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object sent(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/MailFake.php");
        Object mailable = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        if (!ZVal.isTrue(this.hasSent(env, mailable))) {
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
        return ZVal.assign(
                env.callMethod(
                        this.mailablesOf(env, mailable),
                        "filter",
                        MailFake.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Support\\Testing\\Fakes",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "mailable")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                ReferenceContainer mailable =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 0, false));
                                Object callback = null;
                                callback = this.contextReferences.getCapturedValue("callback");
                                return ZVal.assign(
                                        env.callFunctionDynamic(
                                                        callback,
                                                        new RuntimeArgsWithReferences()
                                                                .add(0, mailable),
                                                        mailable.getObject())
                                                .value());
                            }
                        }.use("callback", callback)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailable")
    public Object hasSent(RuntimeEnv env, Object... args) {
        Object mailable = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isGreaterThan(
                        env.callMethod(this.mailablesOf(env, mailable), "count", MailFake.class),
                        '>',
                        0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailable")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object queued(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/MailFake.php");
        Object mailable = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        if (!ZVal.isTrue(this.hasQueued(env, mailable))) {
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
        return ZVal.assign(
                env.callMethod(
                        this.queuedMailablesOf(env, mailable),
                        "filter",
                        MailFake.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Support\\Testing\\Fakes",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "mailable")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                ReferenceContainer mailable =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 0, false));
                                Object callback = null;
                                callback = this.contextReferences.getCapturedValue("callback");
                                return ZVal.assign(
                                        env.callFunctionDynamic(
                                                        callback,
                                                        new RuntimeArgsWithReferences()
                                                                .add(0, mailable),
                                                        mailable.getObject())
                                                .value());
                            }
                        }.use("callback", callback)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailable")
    public Object hasQueued(RuntimeEnv env, Object... args) {
        Object mailable = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isGreaterThan(
                        env.callMethod(
                                this.queuedMailablesOf(env, mailable), "count", MailFake.class),
                        '>',
                        0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    protected Object mailablesOf(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/MailFake.php");
        Object type = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        collect.f.env(env).call(this.mailables).value(),
                        "filter",
                        MailFake.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Support\\Testing\\Fakes",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "mailable")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object mailable = assignParameter(args, 0, false);
                                Object type = null;
                                type = this.contextReferences.getCapturedValue("type");
                                return ZVal.assign(ZVal.checkInstanceTypeMatch(mailable, type));
                            }
                        }.use("type", type)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    protected Object queuedMailablesOf(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/MailFake.php");
        Object type = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        collect.f.env(env).call(this.queuedMailables).value(),
                        "filter",
                        MailFake.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Support\\Testing\\Fakes",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "mailable")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object mailable = assignParameter(args, 0, false);
                                Object type = null;
                                type = this.contextReferences.getCapturedValue("type");
                                return ZVal.assign(ZVal.checkInstanceTypeMatch(mailable, type));
                            }
                        }.use("type", type)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "users")
    public Object to(RuntimeEnv env, Object... args) {
        Object users = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(new PendingMailFake(env, this), "to", MailFake.class, users));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "users")
    public Object bcc(RuntimeEnv env, Object... args) {
        Object users = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(new PendingMailFake(env, this), "bcc", MailFake.class, users));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "text")
    @ConvertedParameter(index = 1, name = "callback")
    public Object raw(RuntimeEnv env, Object... args) {
        Object text = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view")
    @ConvertedParameter(
        index = 1,
        name = "data",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object send(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        Object callback = assignParameter(args, 2, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        view, Mailable.class, "Illuminate\\Contracts\\Mail\\Mailable"))) {
            return null;
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        view, ShouldQueue.class, "Illuminate\\Contracts\\Queue\\ShouldQueue"))) {
            return ZVal.assign(this.queue(env, view, data));
        }

        new ReferenceClassProperty(this, "mailables", env).arrayAppend(env).set(view);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view")
    @ConvertedParameter(
        index = 1,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object queue(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, false);
        Object queue = assignParameter(args, 1, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        view, Mailable.class, "Illuminate\\Contracts\\Mail\\Mailable"))) {
            return null;
        }

        new ReferenceClassProperty(this, "queuedMailables", env).arrayAppend(env).set(view);
        return null;
    }

    @ConvertedMethod
    public Object failures(RuntimeEnv env, Object... args) {
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Support\\Testing\\Fakes\\MailFake";

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
                    .setName("Illuminate\\Support\\Testing\\Fakes\\MailFake")
                    .setLookup(
                            MailFake.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("mailables", "queuedMailables")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/MailFake.php")
                    .addInterface("Illuminate\\Contracts\\Mail\\Mailer")
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
