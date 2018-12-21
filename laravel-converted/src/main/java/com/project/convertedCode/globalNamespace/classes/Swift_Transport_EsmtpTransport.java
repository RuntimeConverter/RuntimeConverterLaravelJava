package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.classes.Swift_TransportException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.classes.Swift_Transport_SmtpAgent;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Swift_Transport_AbstractSmtpTransport;
import com.runtimeconverter.runtime.nativeFunctions.array.function_uasort;
import com.project.convertedCode.globalNamespace.classes.Swift_Transport_IoBuffer;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/EsmtpTransport.php

*/

public class Swift_Transport_EsmtpTransport extends Swift_Transport_AbstractSmtpTransport
        implements Swift_Transport_SmtpAgent {

    public Object handlers = ZVal.newArray();

    public Object capabilities = ZVal.newArray();

    public Object params =
            ZVal.newArray(
                    new ZPair("protocol", "tcp"),
                    new ZPair("host", "localhost"),
                    new ZPair("port", 25),
                    new ZPair("timeout", 30),
                    new ZPair("blocking", 1),
                    new ZPair("tls", false),
                    new ZPair("type", Swift_Transport_IoBuffer.CONST_TYPE_SOCKET),
                    new ZPair("stream_context_options", ZVal.newArray()));

    public Swift_Transport_EsmtpTransport(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Transport_EsmtpTransport.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Transport_EsmtpTransport(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "buf", typeHint = "Swift_Transport_IoBuffer")
    @ConvertedParameter(index = 1, name = "extensionHandlers", typeHint = "array")
    @ConvertedParameter(index = 2, name = "dispatcher", typeHint = "Swift_Events_EventDispatcher")
    @ConvertedParameter(index = 3, name = "localDomain")
    @ConvertedParameter(
        index = 4,
        name = "addressEncoder",
        typeHint = "Swift_AddressEncoder",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object buf = assignParameter(args, 0, false);
        Object extensionHandlers = assignParameter(args, 1, false);
        Object dispatcher = assignParameter(args, 2, false);
        Object localDomain = assignParameter(args, 3, true);
        if (null == localDomain) {
            localDomain = "127.0.0.1";
        }
        Object addressEncoder = assignParameter(args, 4, true);
        if (null == addressEncoder) {
            addressEncoder = ZVal.getNull();
        }
        super.__construct(env, buf, dispatcher, localDomain, addressEncoder);
        this.setExtensionHandlers(env, extensionHandlers);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "host")
    public Object setHost(RuntimeEnv env, Object... args) {
        Object host = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "params", env).arrayAccess(env, "host").set(host);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getHost(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ReferenceClassProperty(this, "params", env).arrayGet(env, "host"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "port")
    public Object setPort(RuntimeEnv env, Object... args) {
        Object port = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "params", env)
                .arrayAccess(env, "port")
                .set(ZVal.toLong(port));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getPort(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ReferenceClassProperty(this, "params", env).arrayGet(env, "port"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "timeout")
    public Object setTimeout(RuntimeEnv env, Object... args) {
        Object timeout = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "params", env)
                .arrayAccess(env, "timeout")
                .set(ZVal.toLong(timeout));
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("buffer").value(),
                "setParam",
                Swift_Transport_EsmtpTransport.class,
                "timeout",
                ZVal.toLong(timeout));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getTimeout(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "params", env).arrayGet(env, "timeout"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "encryption")
    public Object setEncryption(RuntimeEnv env, Object... args) {
        Object encryption = assignParameter(args, 0, false);
        encryption = NamespaceGlobal.strtolower.env(env).call(encryption).value();
        if (ZVal.equalityCheck("tls", encryption)) {
            new ReferenceClassProperty(this, "params", env).arrayAccess(env, "protocol").set("tcp");
            new ReferenceClassProperty(this, "params", env).arrayAccess(env, "tls").set(true);

        } else {
            new ReferenceClassProperty(this, "params", env)
                    .arrayAccess(env, "protocol")
                    .set(encryption);
            new ReferenceClassProperty(this, "params", env).arrayAccess(env, "tls").set(false);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getEncryption(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isTrue(new ReferenceClassProperty(this, "params", env).arrayGet(env, "tls"))
                        ? "tls"
                        : new ReferenceClassProperty(this, "params", env)
                                .arrayGet(env, "protocol"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options")
    public Object setStreamOptions(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "params", env)
                .arrayAccess(env, "stream_context_options")
                .set(options);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getStreamOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "params", env)
                        .arrayGet(env, "stream_context_options"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source")
    public Object setSourceIp(RuntimeEnv env, Object... args) {
        Object source = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "params", env).arrayAccess(env, "sourceIp").set(source);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getSourceIp(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "params", env)
                                                .arrayGet(env, "sourceIp"))
                        ? ternaryExpressionTemp
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "enabled")
    public Object setPipelining(RuntimeEnv env, Object... args) {
        Object enabled = assignParameter(args, 0, false);
        toObjectR(this).accessProp(this, env).name("pipelining").set(enabled);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getPipelining(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this).accessProp(this, env).name("pipelining").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "handlers", typeHint = "array")
    public Object setExtensionHandlers(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport")
                        .setFile(
                                "/vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/EsmtpTransport.php");
        Object handlers = assignParameter(args, 0, false);
        Object handler = null;
        ReferenceContainer assoc = new BasicReferenceContainer(null);
        assoc.setObject(ZVal.newArray());
        for (ZPair zpairResult1606 : ZVal.getIterable(handlers, env, true)) {
            handler = ZVal.assign(zpairResult1606.getValue());
            assoc.arrayAccess(
                            env,
                            env.callMethod(
                                    handler,
                                    "getHandledKeyword",
                                    Swift_Transport_EsmtpTransport.class))
                    .set(handler);
        }

        function_uasort
                .f
                .env(env)
                .call(
                        assoc.getObject(),
                        new Closure(env, runtimeConverterFunctionClassConstants, "", this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "a")
                            @ConvertedParameter(index = 1, name = "b")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object a = assignParameter(args, 0, false);
                                Object b = assignParameter(args, 1, false);
                                return ZVal.assign(
                                        env.callMethod(
                                                a,
                                                "getPriorityOver",
                                                Swift_Transport_EsmtpTransport.class,
                                                env.callMethod(
                                                        b,
                                                        "getHandledKeyword",
                                                        Swift_Transport_EsmtpTransport.class)));
                            }
                        });
        this.handlers = assoc.getObject();
        this.setHandlerParams(env);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getExtensionHandlers(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_array_values.f.env(env).call(this.handlers).value());
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
        Object handler = null;
        Object response = null;
        ReferenceContainer stopSignal = new BasicReferenceContainer(null);
        failures.setObject(ZVal.assign(rToArrayCast(failures.getObject())));
        stopSignal.setObject(false);
        response = ZVal.getNull();
        for (ZPair zpairResult1607 : ZVal.getIterable(this.getActiveHandlers(env), env, true)) {
            handler = ZVal.assign(zpairResult1607.getValue());
            response =
                    env.callMethod(
                            handler,
                            new RuntimeArgsWithReferences().add(3, failures).add(4, stopSignal),
                            "onCommand",
                            Swift_Transport_EsmtpTransport.class,
                            this,
                            command,
                            codes,
                            failures.getObject(),
                            stopSignal.getObject());
            if (ZVal.isTrue(stopSignal.getObject())) {
                return ZVal.assign(response);
            }
        }

        return ZVal.assign(
                super.executeCommand(
                        env,
                        new RuntimeArgsWithReferences().add(2, failures),
                        command,
                        codes,
                        failures.getObject(),
                        pipeline));
    }

    public Object executeCommand(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "args")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object ___args = assignParameter(args, 1, false);
        Object handler = null;
        Object _pReturn = null;
        for (ZPair zpairResult1608 : ZVal.getIterable(this.handlers, env, true)) {
            handler = ZVal.assign(zpairResult1608.getValue());
            if (function_in_array
                    .f
                    .env(env)
                    .call(
                            NamespaceGlobal.strtolower.env(env).call(method).value(),
                            function_array_map
                                    .f
                                    .env(env)
                                    .call(
                                            "strtolower",
                                            rToArrayCast(
                                                    env.callMethod(
                                                            handler,
                                                            "exposeMixinMethods",
                                                            Swift_Transport_EsmtpTransport.class)))
                                    .value())
                    .getBool()) {
                _pReturn =
                        function_call_user_func_array
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(
                                        ZVal.newArray(new ZPair(0, handler), new ZPair(1, method)),
                                        ___args)
                                .value();
                if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", _pReturn))
                        && ZVal.toBool(
                                ZVal.equalityCheck(
                                        "set",
                                        function_substr.f.env(env).call(method, 0, 3).value()))) {
                    return ZVal.assign(this);

                } else {
                    return ZVal.assign(_pReturn);
                }
            }
        }

        NamespaceGlobal.trigger_error
                .env(env)
                .call("Call to undefined method " + toStringR(method, env), 256);
        return null;
    }

    @ConvertedMethod
    protected Object getBufferParams(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.params);
    }

    @ConvertedMethod
    protected Object doHeloCommand(RuntimeEnv env, Object... args) {
        Object handler = null;
        Object e = null;
        Object response = null;
        try {
            response =
                    env.callMethod(
                            this,
                            "executeCommand",
                            Swift_Transport_EsmtpTransport.class,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "EHLO %s\r\n",
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("domain")
                                                    .value())
                                    .value(),
                            ZVal.arrayFromList(250));
        } catch (ConvertedException convertedException232) {
            if (convertedException232.instanceOf(
                    Swift_TransportException.class, "Swift_TransportException")) {
                e = convertedException232.getObject();
                return ZVal.assign(super.doHeloCommand(env));
            } else {
                throw convertedException232;
            }
        }

        if (ZVal.isTrue(new ReferenceClassProperty(this, "params", env).arrayGet(env, "tls"))) {
            try {
                env.callMethod(
                        this,
                        "executeCommand",
                        Swift_Transport_EsmtpTransport.class,
                        "STARTTLS\r\n",
                        ZVal.arrayFromList(220));
                if (!ZVal.isTrue(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("buffer").value(),
                                "startTLS",
                                Swift_Transport_EsmtpTransport.class))) {
                    throw ZVal.getException(
                            env,
                            new Swift_TransportException(
                                    env, "Unable to connect with TLS encryption"));
                }

                try {
                    response =
                            env.callMethod(
                                    this,
                                    "executeCommand",
                                    Swift_Transport_EsmtpTransport.class,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "EHLO %s\r\n",
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("domain")
                                                            .value())
                                            .value(),
                                    ZVal.arrayFromList(250));
                } catch (ConvertedException convertedException233) {
                    if (convertedException233.instanceOf(
                            Swift_TransportException.class, "Swift_TransportException")) {
                        e = convertedException233.getObject();
                        return ZVal.assign(super.doHeloCommand(env));
                    } else {
                        throw convertedException233;
                    }
                }

            } catch (ConvertedException convertedException234) {
                if (convertedException234.instanceOf(
                        Swift_TransportException.class, "Swift_TransportException")) {
                    e = convertedException234.getObject();
                    env.callMethod(this, "throwException", Swift_Transport_EsmtpTransport.class, e);
                } else {
                    throw convertedException234;
                }
            }
        }

        this.capabilities = this.getCapabilities(env, response);
        if (!ZVal.isset(toObjectR(this).accessProp(this, env).name("pipelining").value())) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("pipelining")
                    .set(
                            arrayActionR(
                                    ArrayAction.ISSET,
                                    new ReferenceClassProperty(this, "capabilities", env),
                                    env,
                                    "PIPELINING"));
        }

        this.setHandlerParams(env);
        for (ZPair zpairResult1609 : ZVal.getIterable(this.getActiveHandlers(env), env, true)) {
            handler = ZVal.assign(zpairResult1609.getValue());
            env.callMethod(handler, "afterEhlo", Swift_Transport_EsmtpTransport.class, this);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    protected Object doMailFromCommand(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object handler = null;
        ReferenceContainer failures = new BasicReferenceContainer(null);
        Object handlers = null;
        Object paramStr = null;
        Object params = null;
        address =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("addressEncoder").value(),
                        "encodeString",
                        Swift_Transport_EsmtpTransport.class,
                        address);
        handlers = this.getActiveHandlers(env);
        params = ZVal.newArray();
        for (ZPair zpairResult1610 : ZVal.getIterable(handlers, env, true)) {
            handler = ZVal.assign(zpairResult1610.getValue());
            params =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    params,
                                    rToArrayCast(
                                            env.callMethod(
                                                    handler,
                                                    "getMailParams",
                                                    Swift_Transport_EsmtpTransport.class)))
                            .value();
        }

        paramStr =
                ZVal.assign(
                        !ZVal.isEmpty(params)
                                ? " "
                                        + toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(" ", params)
                                                        .value(),
                                                env)
                                : "");
        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(2, failures),
                "executeCommand",
                Swift_Transport_EsmtpTransport.class,
                function_sprintf.f.env(env).call("MAIL FROM:<%s>%s\r\n", address, paramStr).value(),
                ZVal.arrayFromList(250),
                failures.getObject(),
                true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    protected Object doRcptToCommand(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object handler = null;
        ReferenceContainer failures = new BasicReferenceContainer(null);
        Object handlers = null;
        Object paramStr = null;
        Object params = null;
        address =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("addressEncoder").value(),
                        "encodeString",
                        Swift_Transport_EsmtpTransport.class,
                        address);
        handlers = this.getActiveHandlers(env);
        params = ZVal.newArray();
        for (ZPair zpairResult1611 : ZVal.getIterable(handlers, env, true)) {
            handler = ZVal.assign(zpairResult1611.getValue());
            params =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    params,
                                    rToArrayCast(
                                            env.callMethod(
                                                    handler,
                                                    "getRcptParams",
                                                    Swift_Transport_EsmtpTransport.class)))
                            .value();
        }

        paramStr =
                ZVal.assign(
                        !ZVal.isEmpty(params)
                                ? " "
                                        + toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(" ", params)
                                                        .value(),
                                                env)
                                : "");
        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(2, failures),
                "executeCommand",
                Swift_Transport_EsmtpTransport.class,
                function_sprintf.f.env(env).call("RCPT TO:<%s>%s\r\n", address, paramStr).value(),
                ZVal.arrayFromList(250, 251, 252),
                failures.getObject(),
                true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ehloResponse")
    private Object getCapabilities(RuntimeEnv env, Object... args) {
        Object ehloResponse = assignParameter(args, 0, false);
        ReferenceContainer capabilities = new BasicReferenceContainer(null);
        Object paramStr = null;
        Object line = null;
        Object lines = null;
        Object keyword = null;
        Object params = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        capabilities.setObject(ZVal.newArray());
        ehloResponse = function_trim.f.env(env).call(ehloResponse).value();
        lines = function_explode.f.env(env).call("\r\n", ehloResponse).value();
        function_array_shift.f.env(env).call(lines);
        for (ZPair zpairResult1612 : ZVal.getIterable(lines, env, true)) {
            line = ZVal.assign(zpairResult1612.getValue());
            if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call("/^[0-9]{3}[ -]([A-Z0-9-]+)((?:[ =].*)?)$/Di", line, matches.getObject())
                    .getBool()) {
                keyword =
                        NamespaceGlobal.strtoupper.env(env).call(matches.arrayGet(env, 1)).value();
                paramStr =
                        NamespaceGlobal.strtoupper
                                .env(env)
                                .call(
                                        function_ltrim
                                                .f
                                                .env(env)
                                                .call(matches.arrayGet(env, 2), " =")
                                                .value())
                                .value();
                params =
                        ZVal.assign(
                                !ZVal.isEmpty(paramStr)
                                        ? function_explode.f.env(env).call(" ", paramStr).value()
                                        : ZVal.newArray());
                capabilities.arrayAccess(env, keyword).set(params);
            }
        }

        return ZVal.assign(capabilities.getObject());
    }

    @ConvertedMethod
    private Object setHandlerParams(RuntimeEnv env, Object... args) {
        Object handler = null;
        Object keyword = null;
        for (ZPair zpairResult1613 : ZVal.getIterable(this.handlers, env, false)) {
            keyword = ZVal.assign(zpairResult1613.getKey());
            handler = ZVal.assign(zpairResult1613.getValue());
            if (function_array_key_exists.f.env(env).call(keyword, this.capabilities).getBool()) {
                env.callMethod(
                        handler,
                        "setKeywordParams",
                        Swift_Transport_EsmtpTransport.class,
                        new ReferenceClassProperty(this, "capabilities", env)
                                .arrayGet(env, keyword));
            }
        }

        return null;
    }

    @ConvertedMethod
    private Object getActiveHandlers(RuntimeEnv env, Object... args) {
        Object handler = null;
        ReferenceContainer handlers = new BasicReferenceContainer(null);
        Object keyword = null;
        handlers.setObject(ZVal.newArray());
        for (ZPair zpairResult1614 : ZVal.getIterable(this.handlers, env, false)) {
            keyword = ZVal.assign(zpairResult1614.getKey());
            handler = ZVal.assign(zpairResult1614.getValue());
            if (function_array_key_exists.f.env(env).call(keyword, this.capabilities).getBool()) {
                handlers.arrayAppend(env).set(handler);
            }
        }

        return ZVal.assign(handlers.getObject());
    }

    public static final Object CONST_class = "Swift_Transport_EsmtpTransport";

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
                    .setName("Swift_Transport_EsmtpTransport")
                    .setLookup(
                            Swift_Transport_EsmtpTransport.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "addressEncoder",
                            "buffer",
                            "capabilities",
                            "domain",
                            "eventDispatcher",
                            "handlers",
                            "params",
                            "pipeline",
                            "pipelining",
                            "sourceIp",
                            "started")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/EsmtpTransport.php")
                    .addInterface("Swift_Transport_SmtpAgent")
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
