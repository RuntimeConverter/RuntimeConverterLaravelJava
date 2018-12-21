package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.namespaces.Transport.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.namespaces.Transport.classes.Transport;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Mail/Transport/MailgunTransport.php

*/

public class MailgunTransport extends Transport {

    public Object client = null;

    public Object key = null;

    public Object domain = null;

    public Object url = null;

    public MailgunTransport(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MailgunTransport.class) {
            this.__construct(env, args);
        }
    }

    public MailgunTransport(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "client", typeHint = "GuzzleHttp\\ClientInterface")
    @ConvertedParameter(index = 1, name = "key")
    @ConvertedParameter(index = 2, name = "domain")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object client = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, false);
        Object domain = assignParameter(args, 2, false);
        this.key = key;
        this.client = client;
        this.setDomain(env, domain);
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
        Object to = null;
        env.callMethod(this, "beforeSendPerformed", MailgunTransport.class, message);
        to = this.getTo(env, message);
        env.callMethod(message, "setBcc", MailgunTransport.class, ZVal.newArray());
        env.callMethod(
                this.client,
                "post",
                MailgunTransport.class,
                this.url,
                this.payload(env, message, to));
        env.callMethod(this, "sendPerformed", MailgunTransport.class, message);
        return ZVal.assign(
                env.callMethod(this, "numberOfRecipients", MailgunTransport.class, message));
    }

    public Object send(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    @ConvertedParameter(index = 1, name = "to")
    protected Object payload(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object to = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "auth", ZVal.newArray(new ZPair(0, "api"), new ZPair(1, this.key))),
                        new ZPair(
                                "multipart",
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                ZVal.newArray(
                                                        new ZPair("name", "to"),
                                                        new ZPair("contents", to))),
                                        new ZPair(
                                                1,
                                                ZVal.newArray(
                                                        new ZPair("name", "message"),
                                                        new ZPair(
                                                                "contents",
                                                                env.callMethod(
                                                                        message,
                                                                        "toString",
                                                                        MailgunTransport.class)),
                                                        new ZPair("filename", "message.mime")))))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    protected Object getTo(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Mail/Transport")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Mail/Transport/MailgunTransport.php");
        Object message = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        collect.f
                                                .env(env)
                                                .call(this.allContacts(env, message))
                                                .value(),
                                        "map",
                                        MailgunTransport.class,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Mail\\Transport",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "display")
                                            @ConvertedParameter(index = 1, name = "address")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object display = assignParameter(args, 0, false);
                                                Object address = assignParameter(args, 1, false);
                                                return ZVal.assign(
                                                        ZVal.isTrue(display)
                                                                ? toStringR(display, env)
                                                                        + toStringR(
                                                                                " <"
                                                                                        + toStringR(
                                                                                                address,
                                                                                                env)
                                                                                        + ">",
                                                                                env)
                                                                : address);
                                            }
                                        }),
                                "values",
                                MailgunTransport.class),
                        "implode",
                        MailgunTransport.class,
                        ","));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    protected Object allContacts(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                rToArrayCast(
                                        env.callMethod(message, "getTo", MailgunTransport.class)),
                                rToArrayCast(
                                        env.callMethod(message, "getCc", MailgunTransport.class)),
                                rToArrayCast(
                                        env.callMethod(message, "getBcc", MailgunTransport.class)))
                        .value());
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

    @ConvertedMethod
    public Object getDomain(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.domain);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "domain")
    public Object setDomain(RuntimeEnv env, Object... args) {
        Object domain = assignParameter(args, 0, false);
        this.url = "https://api.mailgun.net/v3/" + toStringR(domain, env) + "/messages.mime";
        return ZVal.assign(this.domain = domain);
    }

    public static final Object CONST_class = "Illuminate\\Mail\\Transport\\MailgunTransport";

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
                    .setName("Illuminate\\Mail\\Transport\\MailgunTransport")
                    .setLookup(
                            MailgunTransport.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("client", "domain", "key", "plugins", "url")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Mail/Transport/MailgunTransport.php")
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
