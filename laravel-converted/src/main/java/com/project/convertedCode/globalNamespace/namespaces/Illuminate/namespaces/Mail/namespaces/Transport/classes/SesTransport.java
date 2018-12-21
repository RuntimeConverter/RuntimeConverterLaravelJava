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
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_key;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.namespaces.Transport.classes.Transport;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Mail/Transport/SesTransport.php

*/

public class SesTransport extends Transport {

    public Object ses = null;

    public SesTransport(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SesTransport.class) {
            this.__construct(env, args);
        }
    }

    public SesTransport(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ses", typeHint = "Aws\\Ses\\SesClient")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object ses = assignParameter(args, 0, false);
        this.ses = ses;
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
        Object headers = null;
        Object ternaryExpressionTemp = null;
        env.callMethod(this, "beforeSendPerformed", SesTransport.class, message);
        headers = env.callMethod(message, "getHeaders", SesTransport.class);
        env.callMethod(
                headers,
                "addTextHeader",
                SesTransport.class,
                "X-SES-Message-ID",
                env.callMethod(
                        env.callMethod(
                                this.ses,
                                "sendRawEmail",
                                SesTransport.class,
                                ZVal.newArray(
                                        new ZPair(
                                                "Source",
                                                function_key
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                ZVal.isTrue(
                                                                                ternaryExpressionTemp =
                                                                                        env
                                                                                                .callMethod(
                                                                                                        message,
                                                                                                        "getSender",
                                                                                                        SesTransport
                                                                                                                .class))
                                                                        ? ternaryExpressionTemp
                                                                        : env.callMethod(
                                                                                message,
                                                                                "getFrom",
                                                                                SesTransport.class))
                                                        .value()),
                                        new ZPair(
                                                "RawMessage",
                                                ZVal.newArray(
                                                        new ZPair(
                                                                "Data",
                                                                env.callMethod(
                                                                        message,
                                                                        "toString",
                                                                        SesTransport.class)))))),
                        "get",
                        SesTransport.class,
                        "MessageId"));
        env.callMethod(this, "sendPerformed", SesTransport.class, message);
        return ZVal.assign(env.callMethod(this, "numberOfRecipients", SesTransport.class, message));
    }

    public Object send(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    public static final Object CONST_class = "Illuminate\\Mail\\Transport\\SesTransport";

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
                    .setName("Illuminate\\Mail\\Transport\\SesTransport")
                    .setLookup(
                            SesTransport.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("plugins", "ses")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Mail/Transport/SesTransport.php")
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
