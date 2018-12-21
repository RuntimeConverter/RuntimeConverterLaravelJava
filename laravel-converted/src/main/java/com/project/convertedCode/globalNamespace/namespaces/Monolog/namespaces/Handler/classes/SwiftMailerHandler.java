package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.nativeClasses.date.DateTimeImmutable;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.MailHandler;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
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
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.LineFormatter;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.classes.Swift;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/SwiftMailerHandler.php

*/

public class SwiftMailerHandler extends MailHandler {

    public Object mailer = null;

    public Object messageTemplate = null;

    public SwiftMailerHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SwiftMailerHandler.class) {
            this.__construct(env, args);
        }
    }

    public SwiftMailerHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailer", typeHint = "Swift_Mailer")
    @ConvertedParameter(index = 1, name = "message")
    @ConvertedParameter(index = 2, name = "level")
    @ConvertedParameter(
        index = 3,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object mailer = assignParameter(args, 0, false);
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
        this.mailer = mailer;
        this.messageTemplate = message;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    @ConvertedParameter(index = 1, name = "records", typeHint = "array")
    protected Object send(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        Object records = assignParameter(args, 1, false);
        env.callMethod(
                this.mailer,
                "send",
                SwiftMailerHandler.class,
                this.buildMessage(env, content, records));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    @ConvertedParameter(index = 1, name = "records", typeHint = "array")
    protected Object buildMessage(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        Object records = assignParameter(args, 1, false);
        Object message = null;
        Object subjectFormatter = null;
        message = ZVal.getNull();
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.messageTemplate, Swift_Message.class, "Swift_Message"))) {
            message = ZVal.assign(((RuntimeClassInterface) this.messageTemplate).phpClone(env));
            env.callMethod(message, "generateId", SwiftMailerHandler.class);

        } else if (function_is_callable.f.env(env).call(this.messageTemplate).getBool()) {
            message =
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(this.messageTemplate, content, records)
                            .value();
        }

        if (!ZVal.isTrue(ZVal.checkInstanceType(message, Swift_Message.class, "Swift_Message"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Could not resolve message as instance of Swift_Message or a callable returning it"));
        }

        if (ZVal.isTrue(records)) {
            subjectFormatter =
                    new LineFormatter(
                            env, env.callMethod(message, "getSubject", SwiftMailerHandler.class));
            env.callMethod(
                    message,
                    "setSubject",
                    SwiftMailerHandler.class,
                    env.callMethod(
                            subjectFormatter,
                            "format",
                            SwiftMailerHandler.class,
                            env.callMethod(
                                    this, "getHighestRecord", SwiftMailerHandler.class, records)));
        }

        env.callMethod(message, "setBody", SwiftMailerHandler.class, content);
        if (NamespaceGlobal.version_compare
                .env(env)
                .call(Swift.CONST_VERSION, "6.0.0", ">=")
                .getBool()) {
            env.callMethod(
                    message, "setDate", SwiftMailerHandler.class, new DateTimeImmutable(env));

        } else {
            env.callMethod(
                    message,
                    "setDate",
                    SwiftMailerHandler.class,
                    NamespaceGlobal.time.env(env).call().value());
        }

        return ZVal.assign(message);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object __get(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(name, "===", "message")) {
            NamespaceGlobal.trigger_error
                    .env(env)
                    .call(
                            "SwiftMailerHandler->message is deprecated, use ->buildMessage() instead to retrieve the message",
                            16384);
            return ZVal.assign(this.buildMessage(env, ZVal.getNull(), ZVal.newArray()));
        }

        throw ZVal.getException(
                env, new InvalidArgumentException(env, "Invalid property " + toStringR(name, env)));
    }

    public static final Object CONST_class = "Monolog\\Handler\\SwiftMailerHandler";

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
                    .setName("Monolog\\Handler\\SwiftMailerHandler")
                    .setLookup(
                            SwiftMailerHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble",
                            "formatter",
                            "level",
                            "mailer",
                            "messageTemplate",
                            "processors")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Handler/SwiftMailerHandler.php")
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
