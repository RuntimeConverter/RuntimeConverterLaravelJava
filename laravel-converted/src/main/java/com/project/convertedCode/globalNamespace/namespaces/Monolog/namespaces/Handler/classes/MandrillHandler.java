package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.MailHandler;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.namespaces.Curl.classes.Util;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_Message;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/MandrillHandler.php

*/

public class MandrillHandler extends MailHandler {

    public Object message = null;

    public Object apiKey = null;

    public MandrillHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MandrillHandler.class) {
            this.__construct(env, args);
        }
    }

    public MandrillHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "apiKey")
    @ConvertedParameter(index = 1, name = "message")
    @ConvertedParameter(index = 2, name = "level")
    @ConvertedParameter(
        index = 3,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object apiKey = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        Object level = assignParameter(args, 2, true);
        if (null == level) {
            level = Logger.CONST_ERROR;
        }
        Object bubble = assignParameter(args, 3, true);
        if (null == bubble) {
            bubble = true;
        }
        super.__construct(env, level, bubble);
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        message, Swift_Message.class, "Swift_Message")))
                && ZVal.toBool(function_is_callable.f.env(env).call(message).value())) {
            message =
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(message)
                            .value();
        }

        if (!ZVal.isTrue(ZVal.checkInstanceType(message, Swift_Message.class, "Swift_Message"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "You must provide either a Swift_Message instance or a callable returning it"));
        }

        this.message = message;
        this.apiKey = apiKey;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    @ConvertedParameter(index = 1, name = "records", typeHint = "array")
    protected Object send(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        Object records = assignParameter(args, 1, false);
        Object ch = null;
        Object message = null;
        message = ZVal.assign(((RuntimeClassInterface) this.message).phpClone(env));
        env.callMethod(message, "setBody", MandrillHandler.class, content);
        env.callMethod(
                message,
                "setDate",
                MandrillHandler.class,
                NamespaceGlobal.time.env(env).call().value());
        ch = NamespaceGlobal.curl_init.env(env).call().value();
        NamespaceGlobal.curl_setopt
                .env(env)
                .call(ch, 10002, "https://mandrillapp.com/api/1.0/messages/send-raw.json");
        NamespaceGlobal.curl_setopt.env(env).call(ch, 47, 1);
        NamespaceGlobal.curl_setopt.env(env).call(ch, 19913, 1);
        NamespaceGlobal.curl_setopt
                .env(env)
                .call(
                        ch,
                        10015,
                        NamespaceGlobal.http_build_query
                                .env(env)
                                .call(
                                        ZVal.newArray(
                                                new ZPair("key", this.apiKey),
                                                new ZPair("raw_message", toStringR(message, env)),
                                                new ZPair("async", false)))
                                .value());
        Util.runtimeStaticObject.execute(env, ch);
        return null;
    }

    public static final Object CONST_class = "Monolog\\Handler\\MandrillHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends MailHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\MandrillHandler")
                    .setLookup(
                            MandrillHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "apiKey", "bubble", "formatter", "level", "message", "processors")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/MandrillHandler.php")
                    .addInterface("Monolog\\Handler\\HandlerInterface")
                    .addExtendsClass("Monolog\\Handler\\MailHandler")
                    .addExtendsClass("Monolog\\Handler\\AbstractProcessingHandler")
                    .addExtendsClass("Monolog\\Handler\\AbstractHandler")
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
