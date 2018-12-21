package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.namespaces.Transport.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.namespaces.Transport.classes.Transport;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Mail/Transport/MandrillTransport.php

*/

public class MandrillTransport extends Transport {

    public Object client = null;

    public Object key = null;

    public MandrillTransport(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MandrillTransport.class) {
            this.__construct(env, args);
        }
    }

    public MandrillTransport(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "client", typeHint = "GuzzleHttp\\ClientInterface")
    @ConvertedParameter(index = 1, name = "key")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object client = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, false);
        this.key = key;
        this.client = client;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    @ConvertedParameter(
        index = 1,
        name = "failedRecipients",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object send(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object message = assignParameter(args, 0, false);
        ReferenceContainer failedRecipients =
                assignParameterRef(runtimePassByReferenceArgs, args, 1, true);
        if (null == failedRecipients.getObject()) {
            failedRecipients.setObject(ZVal.getNull());
        }
        env.callMethod(this, "beforeSendPerformed", MandrillTransport.class, message);
        env.callMethod(
                this.client,
                "post",
                MandrillTransport.class,
                "https://mandrillapp.com/api/1.0/messages/send-raw.json",
                ZVal.newArray(
                        new ZPair(
                                "form_params",
                                ZVal.newArray(
                                        new ZPair("key", this.key),
                                        new ZPair("to", this.getTo(env, message)),
                                        new ZPair(
                                                "raw_message",
                                                env.callMethod(
                                                        message,
                                                        "toString",
                                                        MandrillTransport.class)),
                                        new ZPair("async", true)))));
        env.callMethod(this, "sendPerformed", MandrillTransport.class, message);
        return ZVal.assign(
                env.callMethod(this, "numberOfRecipients", MandrillTransport.class, message));
    }

    public Object send(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    protected Object getTo(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object to = null;
        to = ZVal.newArray();
        if (ZVal.isTrue(env.callMethod(message, "getTo", MandrillTransport.class))) {
            to =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    to,
                                    function_array_keys
                                            .f
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            message,
                                                            "getTo",
                                                            MandrillTransport.class))
                                            .value())
                            .value();
        }

        if (ZVal.isTrue(env.callMethod(message, "getCc", MandrillTransport.class))) {
            to =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    to,
                                    function_array_keys
                                            .f
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            message,
                                                            "getCc",
                                                            MandrillTransport.class))
                                            .value())
                            .value();
        }

        if (ZVal.isTrue(env.callMethod(message, "getBcc", MandrillTransport.class))) {
            to =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    to,
                                    function_array_keys
                                            .f
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            message,
                                                            "getBcc",
                                                            MandrillTransport.class))
                                            .value())
                            .value();
        }

        return ZVal.assign(to);
    }

    @ConvertedMethod
    public Object getKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.key);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object setKey(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(this.key = key);
    }

    public static final Object CONST_class = "Illuminate\\Mail\\Transport\\MandrillTransport";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Transport.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Mail\\Transport\\MandrillTransport")
                    .setLookup(
                            MandrillTransport.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("client", "key", "plugins")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Mail/Transport/MandrillTransport.php")
                    .addInterface("Swift_Transport")
                    .addExtendsClass("Illuminate\\Mail\\Transport\\Transport")
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
