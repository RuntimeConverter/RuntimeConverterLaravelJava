package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.classes;

import com.runtimeconverter.runtime.nativeFunctions.runtime.function_property_exists;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Mail/SendQueuedMailable.php

*/

public class SendQueuedMailable extends RuntimeClassBase {

    public Object mailable = null;

    public Object tries = null;

    public Object timeout = null;

    public SendQueuedMailable(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SendQueuedMailable.class) {
            this.__construct(env, args);
        }
    }

    public SendQueuedMailable(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "mailable",
        typeHint = "Illuminate\\Contracts\\Mail\\Mailable"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object mailable = assignParameter(args, 0, false);
        this.mailable = mailable;
        this.tries =
                function_property_exists.f.env(env).call(mailable, "tries").getBool()
                        ? toObjectR(mailable).accessProp(this, env).name("tries").value()
                        : ZVal.getNull();
        this.timeout =
                function_property_exists.f.env(env).call(mailable, "timeout").getBool()
                        ? toObjectR(mailable).accessProp(this, env).name("timeout").value()
                        : ZVal.getNull();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "mailer",
        typeHint = "Illuminate\\Contracts\\Mail\\Mailer"
    )
    public Object handle(RuntimeEnv env, Object... args) {
        Object mailer = assignParameter(args, 0, false);
        env.callMethod(this.mailable, "send", SendQueuedMailable.class, mailer);
        return null;
    }

    @ConvertedMethod
    public Object displayName(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_get_class.f.env(env).call(this.mailable).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e")
    public Object failed(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        if (function_method_exists.f.env(env).call(this.mailable, "failed").getBool()) {
            env.callMethod(this.mailable, "failed", SendQueuedMailable.class, e);
        }

        return null;
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        this.mailable = ((RuntimeClassInterface) this.mailable).phpClone(env);
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Mail\\SendQueuedMailable";

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
                    .setName("Illuminate\\Mail\\SendQueuedMailable")
                    .setLookup(
                            SendQueuedMailable.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("mailable", "timeout", "tries")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Mail/SendQueuedMailable.php")
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
