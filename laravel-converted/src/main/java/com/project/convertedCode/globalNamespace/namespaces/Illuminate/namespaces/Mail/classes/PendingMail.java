package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes.ShouldQueue;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Mail/PendingMail.php

*/

public class PendingMail extends RuntimeClassBase {

    public Object mailer = null;

    public Object locale = null;

    public Object to = ZVal.newArray();

    public Object cc = ZVal.newArray();

    public Object bcc = ZVal.newArray();

    public PendingMail(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PendingMail.class) {
            this.__construct(env, args);
        }
    }

    public PendingMail(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailer", typeHint = "Illuminate\\Mail\\Mailer")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object mailer = assignParameter(args, 0, false);
        this.mailer = mailer;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    public Object locale(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        this.locale = locale;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "users")
    public Object to(RuntimeEnv env, Object... args) {
        Object users = assignParameter(args, 0, false);
        this.to = users;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "users")
    public Object cc(RuntimeEnv env, Object... args) {
        Object users = assignParameter(args, 0, false);
        this.cc = users;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "users")
    public Object bcc(RuntimeEnv env, Object... args) {
        Object users = assignParameter(args, 0, false);
        this.bcc = users;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailable", typeHint = "Illuminate\\Mail\\Mailable")
    public Object send(RuntimeEnv env, Object... args) {
        Object mailable = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        mailable,
                        ShouldQueue.class,
                        "Illuminate\\Contracts\\Queue\\ShouldQueue"))) {
            return ZVal.assign(this.queue(env, mailable));
        }

        return ZVal.assign(
                env.callMethod(this.mailer, "send", PendingMail.class, this.fill(env, mailable)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailable", typeHint = "Illuminate\\Mail\\Mailable")
    public Object sendNow(RuntimeEnv env, Object... args) {
        Object mailable = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(this.mailer, "send", PendingMail.class, this.fill(env, mailable)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailable", typeHint = "Illuminate\\Mail\\Mailable")
    public Object queue(RuntimeEnv env, Object... args) {
        Object mailable = assignParameter(args, 0, false);
        mailable = this.fill(env, mailable);
        if (ZVal.isset(toObjectR(mailable).accessProp(this, env).name("delay").value())) {
            return ZVal.assign(
                    env.callMethod(
                            this.mailer,
                            "later",
                            PendingMail.class,
                            toObjectR(mailable).accessProp(this, env).name("delay").value(),
                            mailable));
        }

        return ZVal.assign(env.callMethod(this.mailer, "queue", PendingMail.class, mailable));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay")
    @ConvertedParameter(index = 1, name = "mailable", typeHint = "Illuminate\\Mail\\Mailable")
    public Object later(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, false);
        Object mailable = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this.mailer, "later", PendingMail.class, delay, this.fill(env, mailable)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailable", typeHint = "Illuminate\\Mail\\Mailable")
    protected Object fill(RuntimeEnv env, Object... args) {
        Object mailable = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(mailable, "to", PendingMail.class, this.to),
                                        "cc",
                                        PendingMail.class,
                                        this.cc),
                                "bcc",
                                PendingMail.class,
                                this.bcc),
                        "locale",
                        PendingMail.class,
                        this.locale));
    }

    public static final Object CONST_class = "Illuminate\\Mail\\PendingMail";

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
                    .setName("Illuminate\\Mail\\PendingMail")
                    .setLookup(
                            PendingMail.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bcc", "cc", "locale", "mailer", "to")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Mail/PendingMail.php")
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
