package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Swift_TransportException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Swift_Transport_AbstractSmtpTransport;
import com.project.convertedCode.globalNamespace.classes.Swift_Transport_IoBuffer;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_SendEvent;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/SendmailTransport.php

*/

public class Swift_Transport_SendmailTransport extends Swift_Transport_AbstractSmtpTransport {

    public Object params =
            ZVal.newArray(
                    new ZPair("timeout", 30),
                    new ZPair("blocking", 1),
                    new ZPair("command", "/usr/sbin/sendmail -bs"),
                    new ZPair("type", Swift_Transport_IoBuffer.CONST_TYPE_PROCESS));

    public Swift_Transport_SendmailTransport(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Transport_SendmailTransport.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Transport_SendmailTransport(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "buf", typeHint = "Swift_Transport_IoBuffer")
    @ConvertedParameter(index = 1, name = "dispatcher", typeHint = "Swift_Events_EventDispatcher")
    @ConvertedParameter(index = 2, name = "localDomain")
    @ConvertedParameter(
        index = 3,
        name = "addressEncoder",
        typeHint = "Swift_AddressEncoder",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object buf = assignParameter(args, 0, false);
        Object dispatcher = assignParameter(args, 1, false);
        Object localDomain = assignParameter(args, 2, true);
        if (null == localDomain) {
            localDomain = "127.0.0.1";
        }
        Object addressEncoder = assignParameter(args, 3, true);
        if (null == addressEncoder) {
            addressEncoder = ZVal.getNull();
        }
        super.__construct(env, buf, dispatcher, localDomain, addressEncoder);
        return null;
    }

    @ConvertedMethod
    public Object start(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                function_strpos.f.env(env).call(this.getCommand(env), " -bs").value())) {
            super.start(env);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    public Object setCommand(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "params", env).arrayAccess(env, "command").set(command);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getCommand(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "params", env).arrayGet(env, "command"));
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
        PassByReferenceArgs rLastRefArgs;
        Object message = assignParameter(args, 0, false);
        ReferenceContainer failedRecipients =
                assignParameterRef(runtimePassByReferenceArgs, args, 1, true);
        if (null == failedRecipients.getObject()) {
            failedRecipients.setObject(ZVal.getNull());
        }
        Object evt = null;
        Object count = null;
        Object buffer = null;
        Object command = null;
        failedRecipients.setObject(ZVal.assign(rToArrayCast(failedRecipients.getObject())));
        command = this.getCommand(env);
        buffer = env.callMethod(this, "getBuffer", Swift_Transport_SendmailTransport.class);
        count = 0;
        if (ZVal.strictNotEqualityCheck(
                false, "!==", function_strpos.f.env(env).call(command, " -t").value())) {
            if (ZVal.isTrue(
                    evt =
                            env.callMethod(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("eventDispatcher")
                                            .value(),
                                    "createSendEvent",
                                    Swift_Transport_SendmailTransport.class,
                                    this,
                                    message))) {
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("eventDispatcher").value(),
                        "dispatchEvent",
                        Swift_Transport_SendmailTransport.class,
                        evt,
                        "beforeSendPerformed");
                if (ZVal.isTrue(
                        env.callMethod(
                                evt, "bubbleCancelled", Swift_Transport_SendmailTransport.class))) {
                    return 0;
                }
            }

            if (ZVal.strictEqualityCheck(
                    false, "===", function_strpos.f.env(env).call(command, " -f").value())) {
                command =
                        toStringR(command, env)
                                + " -f"
                                + toStringR(
                                        NamespaceGlobal.escapeshellarg
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                this,
                                                                "getReversePath",
                                                                Swift_Transport_SendmailTransport
                                                                        .class,
                                                                message))
                                                .value(),
                                        env);
            }

            env.callMethod(
                    buffer,
                    rLastRefArgs =
                            new RuntimeArgsWithReferences()
                                    .add(
                                            0,
                                            handleReturnReference(
                                                    function_array_merge
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    this.params,
                                                                    ZVal.newArray(
                                                                            new ZPair(
                                                                                    "command",
                                                                                    command)))
                                                            .value())),
                    "initialize",
                    Swift_Transport_SendmailTransport.class,
                    rLastRefArgs.get(0));
            if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    false,
                                    "===",
                                    function_strpos.f.env(env).call(command, " -i").value()))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    false,
                                    "===",
                                    function_strpos.f.env(env).call(command, " -oi").value()))) {
                env.callMethod(
                        buffer,
                        "setWriteTranslations",
                        Swift_Transport_SendmailTransport.class,
                        ZVal.newArray(new ZPair("\r\n", "\n"), new ZPair("\n.", "\n..")));

            } else {
                env.callMethod(
                        buffer,
                        "setWriteTranslations",
                        Swift_Transport_SendmailTransport.class,
                        ZVal.newArray(new ZPair("\r\n", "\n")));
            }

            count =
                    ZVal.add(
                            ZVal.add(
                                    function_count
                                            .f
                                            .env(env)
                                            .call(
                                                    rToArrayCast(
                                                            env.callMethod(
                                                                    message,
                                                                    "getTo",
                                                                    Swift_Transport_SendmailTransport
                                                                            .class)))
                                            .value(),
                                    function_count
                                            .f
                                            .env(env)
                                            .call(
                                                    rToArrayCast(
                                                            env.callMethod(
                                                                    message,
                                                                    "getCc",
                                                                    Swift_Transport_SendmailTransport
                                                                            .class)))
                                            .value()),
                            function_count
                                    .f
                                    .env(env)
                                    .call(
                                            rToArrayCast(
                                                    env.callMethod(
                                                            message,
                                                            "getBcc",
                                                            Swift_Transport_SendmailTransport
                                                                    .class)))
                                    .value());
            env.callMethod(
                    message, "toByteStream", Swift_Transport_SendmailTransport.class, buffer);
            env.callMethod(buffer, "flushBuffers", Swift_Transport_SendmailTransport.class);
            env.callMethod(
                    buffer,
                    "setWriteTranslations",
                    Swift_Transport_SendmailTransport.class,
                    ZVal.newArray());
            env.callMethod(buffer, "terminate", Swift_Transport_SendmailTransport.class);
            if (ZVal.isTrue(evt)) {
                env.callMethod(
                        evt,
                        "setResult",
                        Swift_Transport_SendmailTransport.class,
                        Swift_Events_SendEvent.CONST_RESULT_SUCCESS);
                env.callMethod(
                        evt,
                        "setFailedRecipients",
                        Swift_Transport_SendmailTransport.class,
                        failedRecipients.getObject());
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("eventDispatcher").value(),
                        "dispatchEvent",
                        Swift_Transport_SendmailTransport.class,
                        evt,
                        "sendPerformed");
            }

            env.callMethod(message, "generateId", Swift_Transport_SendmailTransport.class);

        } else if (ZVal.strictNotEqualityCheck(
                false, "!==", function_strpos.f.env(env).call(command, " -bs").value())) {
            count =
                    super.send(
                            env,
                            new RuntimeArgsWithReferences().add(1, failedRecipients),
                            message,
                            failedRecipients.getObject());

        } else {
            env.callMethod(
                    this,
                    "throwException",
                    Swift_Transport_SendmailTransport.class,
                    new Swift_TransportException(
                            env,
                            "Unsupported sendmail command flags ["
                                    + toStringR(command, env)
                                    + "]. "
                                    + "Must be one of \"-bs\" or \"-t\" but can include additional flags."));
        }

        return ZVal.assign(count);
    }

    public Object send(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    protected Object getBufferParams(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.params);
    }

    public static final Object CONST_class = "Swift_Transport_SendmailTransport";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends Swift_Transport_AbstractSmtpTransport.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Transport_SendmailTransport")
                    .setLookup(
                            Swift_Transport_SendmailTransport.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "addressEncoder",
                            "buffer",
                            "domain",
                            "eventDispatcher",
                            "params",
                            "pipeline",
                            "pipelining",
                            "sourceIp",
                            "started")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/SendmailTransport.php")
                    .addInterface("Swift_Transport")
                    .addExtendsClass("Swift_Transport_AbstractSmtpTransport")
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
