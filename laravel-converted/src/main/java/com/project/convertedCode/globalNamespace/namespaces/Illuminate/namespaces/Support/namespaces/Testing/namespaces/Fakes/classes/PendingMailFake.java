package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Testing.namespaces.Fakes.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.classes.PendingMail;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/PendingMailFake.php

*/

public class PendingMailFake extends PendingMail {

    public PendingMailFake(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PendingMailFake.class) {
            this.__construct(env, args);
        }
    }

    public PendingMailFake(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailer")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object mailer = assignParameter(args, 0, false);
        toObjectR(this).accessProp(this, env).name("mailer").set(mailer);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailable", typeHint = "Illuminate\\Mail\\Mailable")
    public Object send(RuntimeEnv env, Object... args) {
        Object mailable = assignParameter(args, 0, false);
        return ZVal.assign(this.sendNow(env, mailable));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailable", typeHint = "Illuminate\\Mail\\Mailable")
    public Object sendNow(RuntimeEnv env, Object... args) {
        Object mailable = assignParameter(args, 0, false);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("mailer").value(),
                "send",
                PendingMailFake.class,
                env.callMethod(this, "fill", PendingMailFake.class, mailable));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailable", typeHint = "Illuminate\\Mail\\Mailable")
    public Object queue(RuntimeEnv env, Object... args) {
        Object mailable = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("mailer").value(),
                        "queue",
                        PendingMailFake.class,
                        env.callMethod(this, "fill", PendingMailFake.class, mailable)));
    }

    public static final Object CONST_class = "Illuminate\\Support\\Testing\\Fakes\\PendingMailFake";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends PendingMail.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Support\\Testing\\Fakes\\PendingMailFake")
                    .setLookup(
                            PendingMailFake.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bcc", "cc", "locale", "mailer", "to")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/PendingMailFake.php")
                    .addExtendsClass("Illuminate\\Mail\\PendingMail")
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
