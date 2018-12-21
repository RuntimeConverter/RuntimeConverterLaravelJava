package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Swift_TransportException;
import com.project.convertedCode.globalNamespace.classes.Swift_IoException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_key;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sscanf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.classes.Swift_AddressEncoder_IdnAddressEncoder;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.classes.Swift_AddressEncoderException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.project.convertedCode.globalNamespace.classes.Swift_Transport;
import com.runtimeconverter.runtime.nativeFunctions.filter.function_filter_var;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_SendEvent;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/AbstractSmtpTransport.php

*/

public abstract class Swift_Transport_AbstractSmtpTransport extends RuntimeClassBase
        implements Swift_Transport {

    public Object buffer = null;

    public Object started = false;

    public Object domain = "[127.0.0.1]";

    public Object eventDispatcher = null;

    public Object addressEncoder = null;

    public Object pipelining = ZVal.getNull();

    public Object pipeline = ZVal.newArray();

    public Object sourceIp = null;

    public Swift_Transport_AbstractSmtpTransport(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Transport_AbstractSmtpTransport.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Transport_AbstractSmtpTransport(NoConstructor n) {
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
        Object ternaryExpressionTemp = null;
        this.buffer = buf;
        this.eventDispatcher = dispatcher;
        this.addressEncoder =
                ZVal.isDefined(ternaryExpressionTemp = addressEncoder)
                        ? ternaryExpressionTemp
                        : new Swift_AddressEncoder_IdnAddressEncoder(env);
        this.setLocalDomain(env, localDomain);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "domain")
    public Object setLocalDomain(RuntimeEnv env, Object... args) {
        Object domain = assignParameter(args, 0, false);
        if (ZVal.strictNotEqualityCheck(
                "[", "!==", function_substr.f.env(env).call(domain, 0, 1).value())) {
            if (function_filter_var.f.env(env).call(domain, 275, 1048576).getBool()) {
                domain = "[" + toStringR(domain, env) + "]";

            } else if (function_filter_var.f.env(env).call(domain, 275, 2097152).getBool()) {
                domain = "[IPv6:" + toStringR(domain, env) + "]";
            }
        }

        this.domain = domain;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getLocalDomain(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.domain);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source")
    public Object setSourceIp(RuntimeEnv env, Object... args) {
        Object source = assignParameter(args, 0, false);
        this.sourceIp = source;
        return null;
    }

    @ConvertedMethod
    public Object getSourceIp(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.sourceIp);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "addressEncoder", typeHint = "Swift_AddressEncoder")
    public Object setAddressEncoder(RuntimeEnv env, Object... args) {
        Object addressEncoder = assignParameter(args, 0, false);
        this.addressEncoder = addressEncoder;
        return null;
    }

    @ConvertedMethod
    public Object getAddressEncoder(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.addressEncoder);
    }

    @ConvertedMethod
    public Object start(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object evt = null;
        Object e = null;
        if (!ZVal.isTrue(this.started)) {
            if (ZVal.isTrue(
                    evt =
                            env.callMethod(
                                    this.eventDispatcher,
                                    "createTransportChangeEvent",
                                    Swift_Transport_AbstractSmtpTransport.class,
                                    this))) {
                env.callMethod(
                        this.eventDispatcher,
                        "dispatchEvent",
                        Swift_Transport_AbstractSmtpTransport.class,
                        evt,
                        "beforeTransportStarted");
                if (ZVal.isTrue(
                        env.callMethod(
                                evt,
                                "bubbleCancelled",
                                Swift_Transport_AbstractSmtpTransport.class))) {
                    return null;
                }
            }

            try {
                env.callMethod(
                        this.buffer,
                        rLastRefArgs =
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                handleReturnReference(
                                                        env.callMethod(
                                                                this,
                                                                "getBufferParams",
                                                                Swift_Transport_AbstractSmtpTransport
                                                                        .class))),
                        "initialize",
                        Swift_Transport_AbstractSmtpTransport.class,
                        rLastRefArgs.get(0));
            } catch (ConvertedException convertedException216) {
                if (convertedException216.instanceOf(
                        Swift_TransportException.class, "Swift_TransportException")) {
                    e = convertedException216.getObject();
                    this.throwException(env, e);
                } else {
                    throw convertedException216;
                }
            }

            this.readGreeting(env);
            this.doHeloCommand(env);
            if (ZVal.isTrue(evt)) {
                env.callMethod(
                        this.eventDispatcher,
                        "dispatchEvent",
                        Swift_Transport_AbstractSmtpTransport.class,
                        evt,
                        "transportStarted");
            }

            this.started = true;
        }

        return null;
    }

    @ConvertedMethod
    public Object isStarted(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.started);
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
        Object cc = null;
        Object evt = null;
        Object bcc = null;
        Object e = null;
        Object tos = null;
        Object to = null;
        Object reversePath = null;
        Object sent = null;
        sent = 0;
        failedRecipients.setObject(ZVal.assign(rToArrayCast(failedRecipients.getObject())));
        if (ZVal.isTrue(
                evt =
                        env.callMethod(
                                this.eventDispatcher,
                                "createSendEvent",
                                Swift_Transport_AbstractSmtpTransport.class,
                                this,
                                message))) {
            env.callMethod(
                    this.eventDispatcher,
                    "dispatchEvent",
                    Swift_Transport_AbstractSmtpTransport.class,
                    evt,
                    "beforeSendPerformed");
            if (ZVal.isTrue(
                    env.callMethod(
                            evt, "bubbleCancelled", Swift_Transport_AbstractSmtpTransport.class))) {
                return 0;
            }
        }

        if (!ZVal.isTrue(reversePath = this.getReversePath(env, message))) {
            this.throwException(
                    env,
                    new Swift_TransportException(
                            env, "Cannot send message without a sender address"));
        }

        to =
                ZVal.assign(
                        rToArrayCast(
                                env.callMethod(
                                        message,
                                        "getTo",
                                        Swift_Transport_AbstractSmtpTransport.class)));
        cc =
                ZVal.assign(
                        rToArrayCast(
                                env.callMethod(
                                        message,
                                        "getCc",
                                        Swift_Transport_AbstractSmtpTransport.class)));
        tos = function_array_merge.f.env(env).call(to, cc).value();
        bcc =
                ZVal.assign(
                        rToArrayCast(
                                env.callMethod(
                                        message,
                                        "getBcc",
                                        Swift_Transport_AbstractSmtpTransport.class)));
        env.callMethod(
                message, "setBcc", Swift_Transport_AbstractSmtpTransport.class, ZVal.newArray());
        try {
            sent =
                    ZAssignment.add(
                            "+=",
                            sent,
                            env.callMethod(
                                    this,
                                    new RuntimeArgsWithReferences().add(3, failedRecipients),
                                    "sendTo",
                                    Swift_Transport_AbstractSmtpTransport.class,
                                    message,
                                    reversePath,
                                    tos,
                                    failedRecipients.getObject()));
            sent =
                    ZAssignment.add(
                            "+=",
                            sent,
                            env.callMethod(
                                    this,
                                    new RuntimeArgsWithReferences().add(3, failedRecipients),
                                    "sendBcc",
                                    Swift_Transport_AbstractSmtpTransport.class,
                                    message,
                                    reversePath,
                                    bcc,
                                    failedRecipients.getObject()));
        } catch (ConvertedException convertedException217) {
            if (convertedException217.instanceOf(PHPException.class, "Exception")) {
                e = convertedException217.getObject();
                env.callMethod(message, "setBcc", Swift_Transport_AbstractSmtpTransport.class, bcc);
                throw ZVal.getException(env, e);
            } else {
                throw convertedException217;
            }
        }

        env.callMethod(message, "setBcc", Swift_Transport_AbstractSmtpTransport.class, bcc);
        if (ZVal.isTrue(evt)) {
            if (ZVal.equalityCheck(
                    sent,
                    ZVal.add(
                            ZVal.add(
                                    function_count.f.env(env).call(to).value(),
                                    function_count.f.env(env).call(cc).value()),
                            function_count.f.env(env).call(bcc).value()))) {
                env.callMethod(
                        evt,
                        "setResult",
                        Swift_Transport_AbstractSmtpTransport.class,
                        Swift_Events_SendEvent.CONST_RESULT_SUCCESS);

            } else if (ZVal.isGreaterThan(sent, '>', 0)) {
                env.callMethod(
                        evt,
                        "setResult",
                        Swift_Transport_AbstractSmtpTransport.class,
                        Swift_Events_SendEvent.CONST_RESULT_TENTATIVE);

            } else {
                env.callMethod(
                        evt,
                        "setResult",
                        Swift_Transport_AbstractSmtpTransport.class,
                        Swift_Events_SendEvent.CONST_RESULT_FAILED);
            }

            env.callMethod(
                    evt,
                    "setFailedRecipients",
                    Swift_Transport_AbstractSmtpTransport.class,
                    failedRecipients.getObject());
            env.callMethod(
                    this.eventDispatcher,
                    "dispatchEvent",
                    Swift_Transport_AbstractSmtpTransport.class,
                    evt,
                    "sendPerformed");
        }

        env.callMethod(message, "generateId", Swift_Transport_AbstractSmtpTransport.class);
        return ZVal.assign(sent);
    }

    public Object send(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    public Object stop(RuntimeEnv env, Object... args) {
        Object evt = null;
        Object e = null;
        if (ZVal.isTrue(this.started)) {
            if (ZVal.isTrue(
                    evt =
                            env.callMethod(
                                    this.eventDispatcher,
                                    "createTransportChangeEvent",
                                    Swift_Transport_AbstractSmtpTransport.class,
                                    this))) {
                env.callMethod(
                        this.eventDispatcher,
                        "dispatchEvent",
                        Swift_Transport_AbstractSmtpTransport.class,
                        evt,
                        "beforeTransportStopped");
                if (ZVal.isTrue(
                        env.callMethod(
                                evt,
                                "bubbleCancelled",
                                Swift_Transport_AbstractSmtpTransport.class))) {
                    return null;
                }
            }

            try {
                env.callMethod(
                        this,
                        "executeCommand",
                        Swift_Transport_AbstractSmtpTransport.class,
                        "QUIT\r\n",
                        ZVal.arrayFromList(221));
            } catch (ConvertedException convertedException218) {
                if (convertedException218.instanceOf(
                        Swift_TransportException.class, "Swift_TransportException")) {
                    e = convertedException218.getObject();
                } else {
                    throw convertedException218;
                }
            }

            try {
                env.callMethod(
                        this.buffer, "terminate", Swift_Transport_AbstractSmtpTransport.class);
                if (ZVal.isTrue(evt)) {
                    env.callMethod(
                            this.eventDispatcher,
                            "dispatchEvent",
                            Swift_Transport_AbstractSmtpTransport.class,
                            evt,
                            "transportStopped");
                }

            } catch (ConvertedException convertedException219) {
                if (convertedException219.instanceOf(
                        Swift_TransportException.class, "Swift_TransportException")) {
                    e = convertedException219.getObject();
                    this.throwException(env, e);
                } else {
                    throw convertedException219;
                }
            }
        }

        this.started = false;
        return null;
    }

    @ConvertedMethod
    public Object ping(RuntimeEnv env, Object... args) {
        Object e = null;
        try {
            if (!ZVal.isTrue(this.isStarted(env))) {
                this.start(env);
            }

            env.callMethod(
                    this,
                    "executeCommand",
                    Swift_Transport_AbstractSmtpTransport.class,
                    "NOOP\r\n",
                    ZVal.arrayFromList(250));
        } catch (ConvertedException convertedException220) {
            if (convertedException220.instanceOf(
                    Swift_TransportException.class, "Swift_TransportException")) {
                e = convertedException220.getObject();
                try {
                    this.stop(env);
                } catch (ConvertedException convertedException221) {
                    if (convertedException221.instanceOf(
                            Swift_TransportException.class, "Swift_TransportException")) {
                        e = convertedException221.getObject();
                    } else {
                        throw convertedException221;
                    }
                }

                return ZVal.assign(false);
            } else {
                throw convertedException220;
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "plugin", typeHint = "Swift_Events_EventListener")
    public Object registerPlugin(RuntimeEnv env, Object... args) {
        Object plugin = assignParameter(args, 0, false);
        env.callMethod(
                this.eventDispatcher,
                "bindEventListener",
                Swift_Transport_AbstractSmtpTransport.class,
                plugin);
        return null;
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        ReferenceContainer failures = new BasicReferenceContainer(null);
        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(2, failures),
                "executeCommand",
                Swift_Transport_AbstractSmtpTransport.class,
                "RSET\r\n",
                ZVal.arrayFromList(250),
                failures.getObject(),
                true);
        return null;
    }

    @ConvertedMethod
    public Object getBuffer(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.buffer);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    @ConvertedParameter(index = 1, name = "codes", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "failures",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "pipeline",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object executeCommand(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object command = assignParameter(args, 0, false);
        Object codes = assignParameter(args, 1, true);
        if (null == codes) {
            codes = ZVal.newArray();
        }
        ReferenceContainer failures = assignParameterRef(runtimePassByReferenceArgs, args, 2, true);
        if (null == failures.getObject()) {
            failures.setObject(ZVal.getNull());
        }
        Object pipeline = assignParameter(args, 3, true);
        if (null == pipeline) {
            pipeline = false;
        }
        Object evt = null;
        Object response = null;
        Object runtimeTempArrayResult162 = null;
        Object seq = null;
        failures.setObject(ZVal.assign(rToArrayCast(failures.getObject())));
        seq =
                env.callMethod(
                        this.buffer, "write", Swift_Transport_AbstractSmtpTransport.class, command);
        if (ZVal.isTrue(
                evt =
                        env.callMethod(
                                this.eventDispatcher,
                                "createCommandEvent",
                                Swift_Transport_AbstractSmtpTransport.class,
                                this,
                                command,
                                codes))) {
            env.callMethod(
                    this.eventDispatcher,
                    "dispatchEvent",
                    Swift_Transport_AbstractSmtpTransport.class,
                    evt,
                    "commandSent");
        }

        new ReferenceClassProperty(this, "pipeline", env)
                .arrayAppend(env)
                .set(ZVal.newArray(new ZPair(0, command), new ZPair(1, seq), new ZPair(2, codes)));
        if (ZVal.toBool(pipeline) && ZVal.toBool(this.pipelining)) {
            response = ZVal.getNull();

        } else {
            while (ZVal.isTrue(this.pipeline)) {
                ZVal.list(
                        runtimeTempArrayResult162 =
                                function_array_shift.f.env(env).call(this.pipeline).value(),
                        (command = listGet(runtimeTempArrayResult162, 0, env)),
                        (seq = listGet(runtimeTempArrayResult162, 1, env)),
                        (codes = listGet(runtimeTempArrayResult162, 2, env)));
                response = this.getFullResponse(env, seq);
                this.assertResponseCode(env, response, codes);
            }
        }

        return ZVal.assign(response);
    }

    public Object executeCommand(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    protected Object readGreeting(RuntimeEnv env, Object... args) {
        this.assertResponseCode(env, this.getFullResponse(env, 0), ZVal.arrayFromList(220));
        return null;
    }

    @ConvertedMethod
    protected Object doHeloCommand(RuntimeEnv env, Object... args) {
        env.callMethod(
                this,
                "executeCommand",
                Swift_Transport_AbstractSmtpTransport.class,
                function_sprintf.f.env(env).call("HELO %s\r\n", this.domain).value(),
                ZVal.arrayFromList(250));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    protected Object doMailFromCommand(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        ReferenceContainer failures = new BasicReferenceContainer(null);
        address =
                env.callMethod(
                        this.addressEncoder,
                        "encodeString",
                        Swift_Transport_AbstractSmtpTransport.class,
                        address);
        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(2, failures),
                "executeCommand",
                Swift_Transport_AbstractSmtpTransport.class,
                function_sprintf.f.env(env).call("MAIL FROM:<%s>\r\n", address).value(),
                ZVal.arrayFromList(250),
                failures.getObject(),
                true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    protected Object doRcptToCommand(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        ReferenceContainer failures = new BasicReferenceContainer(null);
        address =
                env.callMethod(
                        this.addressEncoder,
                        "encodeString",
                        Swift_Transport_AbstractSmtpTransport.class,
                        address);
        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(2, failures),
                "executeCommand",
                Swift_Transport_AbstractSmtpTransport.class,
                function_sprintf.f.env(env).call("RCPT TO:<%s>\r\n", address).value(),
                ZVal.arrayFromList(250, 251, 252),
                failures.getObject(),
                true);
        return null;
    }

    @ConvertedMethod
    protected Object doDataCommand(RuntimeEnv env, Object... args) {
        env.callMethod(
                this,
                "executeCommand",
                Swift_Transport_AbstractSmtpTransport.class,
                "DATA\r\n",
                ZVal.arrayFromList(354));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    protected Object streamMessage(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object e = null;
        env.callMethod(
                this.buffer,
                "setWriteTranslations",
                Swift_Transport_AbstractSmtpTransport.class,
                ZVal.newArray(new ZPair("\r\n.", "\r\n..")));
        try {
            env.callMethod(
                    message,
                    "toByteStream",
                    Swift_Transport_AbstractSmtpTransport.class,
                    this.buffer);
            env.callMethod(
                    this.buffer, "flushBuffers", Swift_Transport_AbstractSmtpTransport.class);
        } catch (ConvertedException convertedException222) {
            if (convertedException222.instanceOf(
                    Swift_TransportException.class, "Swift_TransportException")) {
                e = convertedException222.getObject();
                this.throwException(env, e);
            } else {
                throw convertedException222;
            }
        }

        env.callMethod(
                this.buffer,
                "setWriteTranslations",
                Swift_Transport_AbstractSmtpTransport.class,
                ZVal.newArray());
        env.callMethod(
                this,
                "executeCommand",
                Swift_Transport_AbstractSmtpTransport.class,
                "\r\n.\r\n",
                ZVal.arrayFromList(250));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    protected Object getReversePath(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object path = null;
        Object sender = null;
        Object from = null;
        Object _pReturn = null;
        _pReturn =
                env.callMethod(
                        message, "getReturnPath", Swift_Transport_AbstractSmtpTransport.class);
        sender = env.callMethod(message, "getSender", Swift_Transport_AbstractSmtpTransport.class);
        from = env.callMethod(message, "getFrom", Swift_Transport_AbstractSmtpTransport.class);
        path = ZVal.getNull();
        if (!ZVal.isEmpty(_pReturn)) {
            path = ZVal.assign(_pReturn);

        } else if (!ZVal.isEmpty(sender)) {
            function_reset.f.env(env).call(sender);
            path = function_key.f.env(env).call(sender).value();

        } else if (!ZVal.isEmpty(from)) {
            function_reset.f.env(env).call(from);
            path = function_key.f.env(env).call(from).value();
        }

        return ZVal.assign(path);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Swift_TransportException")
    protected Object throwException(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object evt = null;
        if (ZVal.isTrue(
                evt =
                        env.callMethod(
                                this.eventDispatcher,
                                "createTransportExceptionEvent",
                                Swift_Transport_AbstractSmtpTransport.class,
                                this,
                                e))) {
            env.callMethod(
                    this.eventDispatcher,
                    "dispatchEvent",
                    Swift_Transport_AbstractSmtpTransport.class,
                    evt,
                    "exceptionThrown");
            if (!ZVal.isTrue(
                    env.callMethod(
                            evt, "bubbleCancelled", Swift_Transport_AbstractSmtpTransport.class))) {
                throw ZVal.getException(env, e);
            }

        } else {
            throw ZVal.getException(env, e);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "response")
    @ConvertedParameter(index = 1, name = "wanted")
    protected Object assertResponseCode(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        Object wanted = assignParameter(args, 1, false);
        Object valid = null;
        Object evt = null;
        Object code = null;
        Object runtimeTempArrayResult163 = null;
        ZVal.list(
                runtimeTempArrayResult163 =
                        function_sscanf.f.env(env).call(response, "%3d").value(),
                (code = listGet(runtimeTempArrayResult163, 0, env)));
        valid =
                ZVal.toBool(ZVal.isEmpty(wanted))
                        || ZVal.toBool(function_in_array.f.env(env).call(code, wanted).value());
        if (ZVal.isTrue(
                evt =
                        env.callMethod(
                                this.eventDispatcher,
                                "createResponseEvent",
                                Swift_Transport_AbstractSmtpTransport.class,
                                this,
                                response,
                                valid))) {
            env.callMethod(
                    this.eventDispatcher,
                    "dispatchEvent",
                    Swift_Transport_AbstractSmtpTransport.class,
                    evt,
                    "responseReceived");
        }

        if (!ZVal.isTrue(valid)) {
            this.throwException(
                    env,
                    new Swift_TransportException(
                            env,
                            "Expected response code "
                                    + toStringR(
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call("/", wanted)
                                                    .value(),
                                            env)
                                    + " but got code "
                                    + "\""
                                    + toStringR(code, env)
                                    + "\", with message \""
                                    + toStringR(response, env)
                                    + "\"",
                            code));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "seq")
    protected Object getFullResponse(RuntimeEnv env, Object... args) {
        Object seq = assignParameter(args, 0, false);
        Object e = null;
        Object response = null;
        ReferenceContainer line = new BasicReferenceContainer(null);
        response = "";
        try {
            do {
                line.setObject(
                        env.callMethod(
                                this.buffer,
                                "readLine",
                                Swift_Transport_AbstractSmtpTransport.class,
                                seq));
                response = toStringR(response, env) + toStringR(line.getObject(), env);

            } while (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.strictNotEqualityCheck(
                                                    ZVal.getNull(), "!==", line.getObject()))
                                    && ZVal.toBool(
                                            ZVal.strictNotEqualityCheck(
                                                    false, "!==", line.getObject())))
                    && ZVal.toBool(ZVal.notEqualityCheck(" ", line.arrayGet(env, 3))));

        } catch (ConvertedException convertedException223) {
            if (convertedException223.instanceOf(
                    Swift_TransportException.class, "Swift_TransportException")) {
                e = convertedException223.getObject();
                this.throwException(env, e);
            } else if (convertedException223.instanceOf(
                    Swift_IoException.class, "Swift_IoException")) {
                e = convertedException223.getObject();
                this.throwException(
                        env,
                        new Swift_TransportException(
                                env,
                                env.callMethod(
                                        e,
                                        "getMessage",
                                        Swift_Transport_AbstractSmtpTransport.class)));
            } else {
                throw convertedException223;
            }
        }

        return ZVal.assign(response);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "reversePath")
    @ConvertedParameter(index = 2, name = "recipients", typeHint = "array")
    @ConvertedParameter(index = 3, name = "failedRecipients", typeHint = "array")
    private Object doMailTransaction(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object reversePath = assignParameter(args, 1, false);
        Object recipients = assignParameter(args, 2, false);
        ReferenceContainer failedRecipients =
                assignParameterRef(runtimePassByReferenceArgs, args, 3, false);
        Object forwardPath = null;
        Object e = null;
        ReferenceContainer sent = new BasicReferenceContainer(null);
        sent.setObject(0);
        this.doMailFromCommand(env, reversePath);
        for (ZPair zpairResult1598 : ZVal.getIterable(recipients, env, true)) {
            forwardPath = ZVal.assign(zpairResult1598.getValue());
            try {
                this.doRcptToCommand(env, forwardPath);
                sent.setObject(ZVal.increment(sent.getObject()));
            } catch (ConvertedException convertedException224) {
                if (convertedException224.instanceOf(
                        Swift_TransportException.class, "Swift_TransportException")) {
                    e = convertedException224.getObject();
                    failedRecipients.arrayAppend(env).set(forwardPath);
                } else if (convertedException224.instanceOf(
                        Swift_AddressEncoderException.class, "Swift_AddressEncoderException")) {
                    e = convertedException224.getObject();
                    failedRecipients.arrayAppend(env).set(forwardPath);
                } else {
                    throw convertedException224;
                }
            }
        }

        if (ZVal.notEqualityCheck(0, sent.getObject())) {
            this.doDataCommand(env);
            this.streamMessage(env, message);

        } else {
            this.reset(env);
        }

        return ZVal.assign(sent.getObject());
    }

    public Object doMailTransaction(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    @ConvertedParameter(index = 1, name = "reversePath")
    @ConvertedParameter(index = 2, name = "to", typeHint = "array")
    @ConvertedParameter(index = 3, name = "failedRecipients", typeHint = "array")
    private Object sendTo(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object reversePath = assignParameter(args, 1, false);
        Object to = assignParameter(args, 2, false);
        ReferenceContainer failedRecipients =
                assignParameterRef(runtimePassByReferenceArgs, args, 3, false);
        if (ZVal.isEmpty(to)) {
            return 0;
        }

        return ZVal.assign(
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(3, failedRecipients),
                        "doMailTransaction",
                        Swift_Transport_AbstractSmtpTransport.class,
                        message,
                        reversePath,
                        function_array_keys.f.env(env).call(to).value(),
                        failedRecipients.getObject()));
    }

    public Object sendTo(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    @ConvertedParameter(index = 1, name = "reversePath")
    @ConvertedParameter(index = 2, name = "bcc", typeHint = "array")
    @ConvertedParameter(index = 3, name = "failedRecipients", typeHint = "array")
    private Object sendBcc(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object reversePath = assignParameter(args, 1, false);
        Object bcc = assignParameter(args, 2, false);
        ReferenceContainer failedRecipients =
                assignParameterRef(runtimePassByReferenceArgs, args, 3, false);
        Object forwardPath = null;
        Object name = null;
        Object sent = null;
        sent = 0;
        for (ZPair zpairResult1599 : ZVal.getIterable(bcc, env, false)) {
            forwardPath = ZVal.assign(zpairResult1599.getKey());
            name = ZVal.assign(zpairResult1599.getValue());
            env.callMethod(
                    message,
                    "setBcc",
                    Swift_Transport_AbstractSmtpTransport.class,
                    ZVal.newArray(new ZPair(forwardPath, name)));
            sent =
                    ZAssignment.add(
                            "+=",
                            sent,
                            env.callMethod(
                                    this,
                                    new RuntimeArgsWithReferences().add(3, failedRecipients),
                                    "doMailTransaction",
                                    Swift_Transport_AbstractSmtpTransport.class,
                                    message,
                                    reversePath,
                                    ZVal.newArray(new ZPair(0, forwardPath)),
                                    failedRecipients.getObject()));
        }

        return ZVal.assign(sent);
    }

    public Object sendBcc(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        Object e = null;
        try {
            this.stop(env);
        } catch (ConvertedException convertedException225) {
            if (convertedException225.instanceOf(PHPException.class, "Exception")) {
                e = convertedException225.getObject();
            } else {
                throw convertedException225;
            }
        }

        return null;
    }

    public static final Object CONST_class = "Swift_Transport_AbstractSmtpTransport";

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
                    .setName("Swift_Transport_AbstractSmtpTransport")
                    .setLookup(
                            Swift_Transport_AbstractSmtpTransport.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "addressEncoder",
                            "buffer",
                            "domain",
                            "eventDispatcher",
                            "pipeline",
                            "pipelining",
                            "sourceIp",
                            "started")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/AbstractSmtpTransport.php")
                    .addInterface("Swift_Transport")
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
