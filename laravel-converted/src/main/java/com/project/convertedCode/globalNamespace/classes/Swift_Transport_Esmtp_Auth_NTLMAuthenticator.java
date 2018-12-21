package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Swift_TransportException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_Transport_Esmtp_Authenticator;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.date.function_microtime;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.functions.random_bytes;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_arg;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_num_args;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.math.function_floor;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/Esmtp/Auth/NTLMAuthenticator.php

*/

public class Swift_Transport_Esmtp_Auth_NTLMAuthenticator extends RuntimeClassBase
        implements Swift_Transport_Esmtp_Authenticator {

    public Swift_Transport_Esmtp_Auth_NTLMAuthenticator(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Swift_Transport_Esmtp_Auth_NTLMAuthenticator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getAuthKeyword(RuntimeEnv env, Object... args) {
        return "NTLM";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "agent", typeHint = "Swift_Transport_SmtpAgent")
    @ConvertedParameter(index = 1, name = "username")
    @ConvertedParameter(index = 2, name = "password")
    public Object authenticate(RuntimeEnv env, Object... args) {
        Object agent = assignParameter(args, 0, false);
        Object username = assignParameter(args, 1, false);
        Object password = assignParameter(args, 2, false);
        Object e = null;
        Object response = null;
        Object client = null;
        Object timestamp = null;
        if (!function_function_exists.f.env(env).call("openssl_encrypt").getBool()) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            "The OpenSSL extension must be enabled to use the NTLM authenticator."));
        }

        if (!function_function_exists.f.env(env).call("bcmul").getBool()) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            "The BCMath functions must be enabled to use the NTLM authenticator."));
        }

        try {
            response =
                    NamespaceGlobal.base64_decode
                            .env(env)
                            .call(
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(
                                                    function_trim
                                                            .f
                                                            .env(env)
                                                            .call(this.sendMessage1(env, agent))
                                                            .value(),
                                                    4)
                                            .value())
                            .value();
            timestamp =
                    ZVal.assign(
                            ZVal.isGreaterThan(
                                            function_func_num_args
                                                    .f
                                                    .env(env)
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithInfo(args, this))
                                                    .call()
                                                    .value(),
                                            '>',
                                            3)
                                    ? function_func_get_arg
                                            .f
                                            .env(env)
                                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                            .call(3)
                                            .value()
                                    : this.getCorrectTimestamp(
                                            env,
                                            NamespaceGlobal.bcmul
                                                    .env(env)
                                                    .call(
                                                            function_microtime
                                                                    .f
                                                                    .env(env)
                                                                    .call(true)
                                                                    .value(),
                                                            "1000")
                                                    .value()));
            client =
                    ZVal.assign(
                            ZVal.isGreaterThan(
                                            function_func_num_args
                                                    .f
                                                    .env(env)
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithInfo(args, this))
                                                    .call()
                                                    .value(),
                                            '>',
                                            4)
                                    ? function_func_get_arg
                                            .f
                                            .env(env)
                                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                            .call(4)
                                            .value()
                                    : random_bytes.f.env(env).call(8).value());
            this.sendMessage3(env, response, username, password, timestamp, client, agent);
            return ZVal.assign(true);
        } catch (ConvertedException convertedException228) {
            if (convertedException228.instanceOf(
                    Swift_TransportException.class, "Swift_TransportException")) {
                e = convertedException228.getObject();
                env.callMethod(
                        agent,
                        "executeCommand",
                        Swift_Transport_Esmtp_Auth_NTLMAuthenticator.class,
                        "RSET\r\n",
                        ZVal.arrayFromList(250));
                throw ZVal.getException(env, e);
            } else {
                throw convertedException228;
            }
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "si")
    @ConvertedParameter(index = 1, name = "bits", defaultValue = "32", defaultValueType = "number")
    protected Object si2bin(RuntimeEnv env, Object... args) {
        Object si = assignParameter(args, 0, false);
        Object bits = assignParameter(args, 1, true);
        if (null == bits) {
            bits = 32;
        }
        Object bin_length = null;
        Object bin = null;
        bin = ZVal.getNull();
        if (ZVal.toBool(
                        ZVal.isGreaterThanOrEqualTo(
                                si,
                                ">=",
                                ZVal.minusSign(
                                        NamespaceGlobal.pow
                                                .env(env)
                                                .call(2, ZVal.subtract(bits, 1))
                                                .value())))
                && ZVal.toBool(
                        ZVal.isLessThanOrEqualTo(
                                si,
                                "<=",
                                NamespaceGlobal.pow
                                        .env(env)
                                        .call(2, ZVal.subtract(bits, 1))
                                        .value()))) {
            if (ZVal.isGreaterThanOrEqualTo(si, ">=", 0)) {
                bin = NamespaceGlobal.base_convert.env(env).call(si, 10, 2).value();
                bin_length = function_strlen.f.env(env).call(bin).value();
                if (ZVal.isLessThan(bin_length, '<', bits)) {
                    bin =
                            toStringR(
                                            function_str_repeat
                                                    .f
                                                    .env(env)
                                                    .call("0", ZVal.subtract(bits, bin_length))
                                                    .value(),
                                            env)
                                    + toStringR(bin, env);
                }

            } else {
                si =
                        ZVal.subtract(
                                ZVal.minusSign(si),
                                NamespaceGlobal.pow.env(env).call(2, bits).value());
                bin = NamespaceGlobal.base_convert.env(env).call(si, 10, 2).value();
                bin_length = function_strlen.f.env(env).call(bin).value();
                if (ZVal.isGreaterThan(bin_length, '>', bits)) {
                    bin =
                            toStringR(
                                            function_str_repeat
                                                    .f
                                                    .env(env)
                                                    .call("1", ZVal.subtract(bits, bin_length))
                                                    .value(),
                                            env)
                                    + toStringR(bin, env);
                }
            }
        }

        return ZVal.assign(bin);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "agent", typeHint = "Swift_Transport_SmtpAgent")
    protected Object sendMessage1(RuntimeEnv env, Object... args) {
        Object agent = assignParameter(args, 0, false);
        Object message = null;
        message = this.createMessage1(env);
        return ZVal.assign(
                env.callMethod(
                        agent,
                        "executeCommand",
                        Swift_Transport_Esmtp_Auth_NTLMAuthenticator.class,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "AUTH %s %s\r\n",
                                        this.getAuthKeyword(env),
                                        NamespaceGlobal.base64_encode
                                                .env(env)
                                                .call(message)
                                                .value())
                                .value(),
                        ZVal.arrayFromList(334)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "response")
    protected Object parseMessage2(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        Object targetName = null;
        Object offset = null;
        Object responseHex = null;
        Object DNSDomainName = null;
        Object targetInfoBlock = null;
        Object terminatorByte = null;
        Object length = null;
        Object serverName = null;
        Object targetInfoH = null;
        Object domainName = null;
        Object context = null;
        Object challenge = null;
        Object DNSServerName = null;
        Object runtimeTempArrayResult164 = null;
        responseHex = NamespaceGlobal.bin2hex.env(env).call(response).value();
        length =
                ZVal.multiply(
                        function_floor
                                .f
                                .env(env)
                                .call(
                                        ZVal.divide(
                                                NamespaceGlobal.hexdec
                                                        .env(env)
                                                        .call(
                                                                function_substr
                                                                        .f
                                                                        .env(env)
                                                                        .call(responseHex, 28, 4)
                                                                        .value())
                                                        .value(),
                                                256))
                                .value(),
                        2);
        offset =
                ZVal.multiply(
                        function_floor
                                .f
                                .env(env)
                                .call(
                                        ZVal.divide(
                                                NamespaceGlobal.hexdec
                                                        .env(env)
                                                        .call(
                                                                function_substr
                                                                        .f
                                                                        .env(env)
                                                                        .call(responseHex, 32, 4)
                                                                        .value())
                                                        .value(),
                                                256))
                                .value(),
                        2);
        challenge =
                NamespaceGlobal.hex2bin
                        .env(env)
                        .call(function_substr.f.env(env).call(responseHex, 48, 16).value())
                        .value();
        context =
                NamespaceGlobal.hex2bin
                        .env(env)
                        .call(function_substr.f.env(env).call(responseHex, 64, 16).value())
                        .value();
        targetInfoH =
                NamespaceGlobal.hex2bin
                        .env(env)
                        .call(function_substr.f.env(env).call(responseHex, 80, 16).value())
                        .value();
        targetName =
                NamespaceGlobal.hex2bin
                        .env(env)
                        .call(function_substr.f.env(env).call(responseHex, offset, length).value())
                        .value();
        offset =
                ZVal.multiply(
                        function_floor
                                .f
                                .env(env)
                                .call(
                                        ZVal.divide(
                                                NamespaceGlobal.hexdec
                                                        .env(env)
                                                        .call(
                                                                function_substr
                                                                        .f
                                                                        .env(env)
                                                                        .call(responseHex, 88, 4)
                                                                        .value())
                                                        .value(),
                                                256))
                                .value(),
                        2);
        targetInfoBlock = function_substr.f.env(env).call(responseHex, offset).value();
        ZVal.list(
                runtimeTempArrayResult164 = this.readSubBlock(env, targetInfoBlock),
                (domainName = listGet(runtimeTempArrayResult164, 0, env)),
                (serverName = listGet(runtimeTempArrayResult164, 1, env)),
                (DNSDomainName = listGet(runtimeTempArrayResult164, 2, env)),
                (DNSServerName = listGet(runtimeTempArrayResult164, 3, env)),
                (terminatorByte = listGet(runtimeTempArrayResult164, 4, env)));
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(0, challenge),
                        new ZPair(1, context),
                        new ZPair(2, targetInfoH),
                        new ZPair(3, targetName),
                        new ZPair(4, domainName),
                        new ZPair(5, serverName),
                        new ZPair(6, DNSDomainName),
                        new ZPair(7, DNSServerName),
                        new ZPair(
                                8, NamespaceGlobal.hex2bin.env(env).call(targetInfoBlock).value()),
                        new ZPair(9, terminatorByte)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "block")
    protected Object readSubBlock(RuntimeEnv env, Object... args) {
        Object block = assignParameter(args, 0, false);
        Object offset = null;
        ReferenceContainer data = new BasicReferenceContainer(null);
        Object blockLength = null;
        Object length = null;
        block = function_substr.f.env(env).call(block, 0, -8).value();
        length = function_strlen.f.env(env).call(block).value();
        offset = 0;
        data.setObject(ZVal.newArray());
        while (ZVal.isLessThan(offset, '<', length)) {
            blockLength =
                    ZVal.divide(
                            NamespaceGlobal.hexdec
                                    .env(env)
                                    .call(
                                            function_substr
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            function_substr
                                                                    .f
                                                                    .env(env)
                                                                    .call(block, offset, 8)
                                                                    .value(),
                                                            -4)
                                                    .value())
                                    .value(),
                            256);
            offset = ZAssignment.add("+=", offset, 8);
            data.arrayAppend(env)
                    .set(
                            NamespaceGlobal.hex2bin
                                    .env(env)
                                    .call(
                                            function_substr
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            block,
                                                            offset,
                                                            ZVal.multiply(blockLength, 2))
                                                    .value())
                                    .value());
            offset = ZAssignment.add("+=", offset, ZVal.multiply(blockLength, 2));
        }

        if (ZVal.equalityCheck(3, function_count.f.env(env).call(data.getObject()).value())) {
            data.arrayAppend(env).set(data.arrayGet(env, 2));
            data.arrayAccess(env, 2).set("");
        }

        data.arrayAppend(env).set(this.createByte(env, "00"));
        return ZVal.assign(data.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "response")
    @ConvertedParameter(index = 1, name = "username")
    @ConvertedParameter(index = 2, name = "password")
    @ConvertedParameter(index = 3, name = "timestamp")
    @ConvertedParameter(index = 4, name = "client")
    @ConvertedParameter(index = 5, name = "agent", typeHint = "Swift_Transport_SmtpAgent")
    @ConvertedParameter(
        index = 6,
        name = "v2",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    protected Object sendMessage3(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        Object username = assignParameter(args, 1, false);
        Object password = assignParameter(args, 2, false);
        Object timestamp = assignParameter(args, 3, false);
        Object client = assignParameter(args, 4, false);
        Object agent = assignParameter(args, 5, false);
        Object v2 = assignParameter(args, 6, true);
        if (null == v2) {
            v2 = true;
        }
        Object workstation = null;
        Object message = null;
        Object ntlmResponse = null;
        Object lmResponse = null;
        Object blob = null;
        Object domain = null;
        Object challenge = null;
        Object runtimeTempArrayResult166 = null;
        Object runtimeTempArrayResult165 = null;
        ZVal.list(
                runtimeTempArrayResult165 = this.getDomainAndUsername(env, username),
                (domain = listGet(runtimeTempArrayResult165, 0, env)),
                (username = listGet(runtimeTempArrayResult165, 1, env)));
        ZVal.list(
                runtimeTempArrayResult166 = this.parseMessage2(env, response),
                (challenge = listGet(runtimeTempArrayResult166, 0, env)),
                (workstation = listGet(runtimeTempArrayResult166, 5, env)),
                (blob = listGet(runtimeTempArrayResult166, 8, env)));
        if (!ZVal.isTrue(v2)) {
            lmResponse = this.createLMPassword(env, password, challenge);
            ntlmResponse = this.createNTLMPassword(env, password, challenge);

        } else {
            lmResponse =
                    this.createLMv2Password(env, password, username, domain, challenge, client);
            ntlmResponse =
                    this.createNTLMv2Hash(
                            env, password, username, domain, challenge, blob, timestamp, client);
        }

        message = this.createMessage3(env, domain, username, workstation, lmResponse, ntlmResponse);
        return ZVal.assign(
                env.callMethod(
                        agent,
                        "executeCommand",
                        Swift_Transport_Esmtp_Auth_NTLMAuthenticator.class,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "%s\r\n",
                                        NamespaceGlobal.base64_encode
                                                .env(env)
                                                .call(message)
                                                .value())
                                .value(),
                        ZVal.arrayFromList(235)));
    }

    @ConvertedMethod
    protected Object createMessage1(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(CONST_NTLMSIG, env)
                        + toStringR(this.createByte(env, "01"), env)
                        + toStringR(this.createByte(env, "0702"), env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "domain")
    @ConvertedParameter(index = 1, name = "username")
    @ConvertedParameter(index = 2, name = "workstation")
    @ConvertedParameter(index = 3, name = "lmResponse")
    @ConvertedParameter(index = 4, name = "ntlmResponse")
    protected Object createMessage3(RuntimeEnv env, Object... args) {
        Object domain = assignParameter(args, 0, false);
        Object username = assignParameter(args, 1, false);
        Object workstation = assignParameter(args, 2, false);
        Object lmResponse = assignParameter(args, 3, false);
        Object ntlmResponse = assignParameter(args, 4, false);
        ReferenceContainer userInfo = new BasicReferenceContainer(null);
        ReferenceContainer lmInfo = new BasicReferenceContainer(null);
        ReferenceContainer domainInfo = new BasicReferenceContainer(null);
        Object workSec = null;
        Object domainSec = null;
        Object ntlmSec = null;
        ReferenceContainer workInfo = new BasicReferenceContainer(null);
        Object lmSec = null;
        Object userSec = null;
        domainSec = this.createSecurityBuffer(env, domain, 64);
        domainInfo.setObject(
                this.readSecurityBuffer(
                        env, NamespaceGlobal.bin2hex.env(env).call(domainSec).value()));
        userSec =
                this.createSecurityBuffer(
                        env,
                        username,
                        ZVal.divide(
                                ZVal.add(domainInfo.arrayGet(env, 0), domainInfo.arrayGet(env, 1)),
                                2));
        userInfo.setObject(
                this.readSecurityBuffer(
                        env, NamespaceGlobal.bin2hex.env(env).call(userSec).value()));
        workSec =
                this.createSecurityBuffer(
                        env,
                        workstation,
                        ZVal.divide(
                                ZVal.add(userInfo.arrayGet(env, 0), userInfo.arrayGet(env, 1)), 2));
        workInfo.setObject(
                this.readSecurityBuffer(
                        env, NamespaceGlobal.bin2hex.env(env).call(workSec).value()));
        lmSec =
                this.createSecurityBuffer(
                        env,
                        lmResponse,
                        ZVal.divide(
                                ZVal.add(workInfo.arrayGet(env, 0), workInfo.arrayGet(env, 1)), 2),
                        true);
        lmInfo.setObject(
                this.readSecurityBuffer(env, NamespaceGlobal.bin2hex.env(env).call(lmSec).value()));
        ntlmSec =
                this.createSecurityBuffer(
                        env,
                        ntlmResponse,
                        ZVal.divide(ZVal.add(lmInfo.arrayGet(env, 0), lmInfo.arrayGet(env, 1)), 2),
                        true);
        return ZVal.assign(
                toStringR(CONST_NTLMSIG, env)
                        + toStringR(this.createByte(env, "03"), env)
                        + toStringR(lmSec, env)
                        + toStringR(ntlmSec, env)
                        + toStringR(domainSec, env)
                        + toStringR(userSec, env)
                        + toStringR(workSec, env)
                        + toStringR(this.createByte(env, "000000009a", 8), env)
                        + toStringR(this.createByte(env, "01020000"), env)
                        + toStringR(this.convertTo16bit(env, domain), env)
                        + toStringR(this.convertTo16bit(env, username), env)
                        + toStringR(this.convertTo16bit(env, workstation), env)
                        + toStringR(lmResponse, env)
                        + toStringR(ntlmResponse, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "timestamp")
    @ConvertedParameter(index = 1, name = "client")
    @ConvertedParameter(index = 2, name = "targetInfo")
    protected Object createBlob(RuntimeEnv env, Object... args) {
        Object timestamp = assignParameter(args, 0, false);
        Object client = assignParameter(args, 1, false);
        Object targetInfo = assignParameter(args, 2, false);
        return ZVal.assign(
                toStringR(this.createByte(env, "0101"), env)
                        + toStringR(this.createByte(env, "00"), env)
                        + toStringR(timestamp, env)
                        + toStringR(client, env)
                        + toStringR(this.createByte(env, "00"), env)
                        + toStringR(targetInfo, env)
                        + toStringR(this.createByte(env, "00"), env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object getDomainAndUsername(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object runtimeTempArrayResult167 = null;
        Object domain = null;
        Object user = null;
        if (ZVal.strictNotEqualityCheck(
                false, "!==", function_strpos.f.env(env).call(name, "\\").value())) {
            return ZVal.assign(function_explode.f.env(env).call("\\", name).value());
        }

        if (ZVal.strictNotEqualityCheck(
                false, "!==", function_strpos.f.env(env).call(name, "@").value())) {
            ZVal.list(
                    runtimeTempArrayResult167 = function_explode.f.env(env).call("@", name).value(),
                    (user = listGet(runtimeTempArrayResult167, 0, env)),
                    (domain = listGet(runtimeTempArrayResult167, 1, env)));
            return ZVal.assign(ZVal.newArray(new ZPair(0, domain), new ZPair(1, user)));
        }

        return ZVal.assign(ZVal.newArray(new ZPair(0, ""), new ZPair(1, name)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "password")
    @ConvertedParameter(index = 1, name = "challenge")
    protected Object createLMPassword(RuntimeEnv env, Object... args) {
        Object password = assignParameter(args, 0, false);
        Object challenge = assignParameter(args, 1, false);
        Object key1 = null;
        Object key2 = null;
        Object runtimeTempArrayResult169 = null;
        Object runtimeTempArrayResult168 = null;
        Object desKey1 = null;
        Object constantDecrypt = null;
        Object desKey2 = null;
        Object key3 = null;
        Object desKey3 = null;
        password =
                this.createByte(
                        env, NamespaceGlobal.strtoupper.env(env).call(password).value(), 14, false);
        ZVal.list(
                runtimeTempArrayResult168 =
                        NamespaceGlobal.str_split.env(env).call(password, 7).value(),
                (key1 = listGet(runtimeTempArrayResult168, 0, env)),
                (key2 = listGet(runtimeTempArrayResult168, 1, env)));
        desKey1 = this.createDesKey(env, key1);
        desKey2 = this.createDesKey(env, key2);
        constantDecrypt =
                this.createByte(
                        env,
                        toStringR(this.desEncrypt(env, CONST_DESCONST, desKey1), env)
                                + toStringR(this.desEncrypt(env, CONST_DESCONST, desKey2), env),
                        21,
                        false);
        ZVal.list(
                runtimeTempArrayResult169 =
                        NamespaceGlobal.str_split.env(env).call(constantDecrypt, 7).value(),
                (key1 = listGet(runtimeTempArrayResult169, 0, env)),
                (key2 = listGet(runtimeTempArrayResult169, 1, env)),
                (key3 = listGet(runtimeTempArrayResult169, 2, env)));
        desKey1 = this.createDesKey(env, key1);
        desKey2 = this.createDesKey(env, key2);
        desKey3 = this.createDesKey(env, key3);
        return ZVal.assign(
                toStringR(this.desEncrypt(env, challenge, desKey1), env)
                        + toStringR(this.desEncrypt(env, challenge, desKey2), env)
                        + toStringR(this.desEncrypt(env, challenge, desKey3), env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "password")
    @ConvertedParameter(index = 1, name = "challenge")
    protected Object createNTLMPassword(RuntimeEnv env, Object... args) {
        Object password = assignParameter(args, 0, false);
        Object challenge = assignParameter(args, 1, false);
        Object key1 = null;
        Object key2 = null;
        Object ntlmHash = null;
        Object desKey1 = null;
        Object desKey2 = null;
        Object key3 = null;
        Object desKey3 = null;
        Object runtimeTempArrayResult170 = null;
        ntlmHash = this.createByte(env, this.md4Encrypt(env, password), 21, false);
        ZVal.list(
                runtimeTempArrayResult170 =
                        NamespaceGlobal.str_split.env(env).call(ntlmHash, 7).value(),
                (key1 = listGet(runtimeTempArrayResult170, 0, env)),
                (key2 = listGet(runtimeTempArrayResult170, 1, env)),
                (key3 = listGet(runtimeTempArrayResult170, 2, env)));
        desKey1 = this.createDesKey(env, key1);
        desKey2 = this.createDesKey(env, key2);
        desKey3 = this.createDesKey(env, key3);
        return ZVal.assign(
                toStringR(this.desEncrypt(env, challenge, desKey1), env)
                        + toStringR(this.desEncrypt(env, challenge, desKey2), env)
                        + toStringR(this.desEncrypt(env, challenge, desKey3), env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "time")
    protected Object getCorrectTimestamp(RuntimeEnv env, Object... args) {
        Object time = assignParameter(args, 0, false);
        Object binary = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object timestamp = null;
        time = NamespaceGlobal.number_format.env(env).call(time, 0, ".", "").value();
        time = NamespaceGlobal.bcadd.env(env).call(time, "11644473600000", 0).value();
        time = NamespaceGlobal.bcmul.env(env).call(time, 10000, 0).value();
        binary = this.si2bin(env, time, 64);
        timestamp = "";
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', 8);
                i.setObject(ZVal.increment(i.getObject()))) {
            timestamp =
                    toStringR(timestamp, env)
                            + toStringR(
                                    NamespaceGlobal.chr
                                            .env(env)
                                            .call(
                                                    NamespaceGlobal.bindec
                                                            .env(env)
                                                            .call(
                                                                    function_substr
                                                                            .f
                                                                            .env(env)
                                                                            .call(
                                                                                    binary,
                                                                                    ZVal.minusSign(
                                                                                            ZVal
                                                                                                    .multiply(
                                                                                                            ZVal
                                                                                                                    .add(
                                                                                                                            i
                                                                                                                                    .getObject(),
                                                                                                                            1),
                                                                                                            8)),
                                                                                    8)
                                                                            .value())
                                                            .value())
                                            .value(),
                                    env);
        }

        return ZVal.assign(timestamp);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "password")
    @ConvertedParameter(index = 1, name = "username")
    @ConvertedParameter(index = 2, name = "domain")
    @ConvertedParameter(index = 3, name = "challenge")
    @ConvertedParameter(index = 4, name = "client")
    protected Object createLMv2Password(RuntimeEnv env, Object... args) {
        Object password = assignParameter(args, 0, false);
        Object username = assignParameter(args, 1, false);
        Object domain = assignParameter(args, 2, false);
        Object challenge = assignParameter(args, 3, false);
        Object client = assignParameter(args, 4, false);
        Object lmPass = null;
        Object ntlmHash = null;
        Object ntml2Hash = null;
        lmPass = "00";
        if (ZVal.isLessThanOrEqualTo(function_strlen.f.env(env).call(password).value(), "<=", 15)) {
            ntlmHash = this.md4Encrypt(env, password);
            ntml2Hash =
                    this.md5Encrypt(
                            env,
                            ntlmHash,
                            this.convertTo16bit(
                                    env,
                                    toStringR(
                                                    NamespaceGlobal.strtoupper
                                                            .env(env)
                                                            .call(username)
                                                            .value(),
                                                    env)
                                            + toStringR(domain, env)));
            lmPass =
                    NamespaceGlobal.bin2hex
                            .env(env)
                            .call(
                                    toStringR(
                                                    this.md5Encrypt(
                                                            env,
                                                            ntml2Hash,
                                                            toStringR(challenge, env)
                                                                    + toStringR(client, env)),
                                                    env)
                                            + toStringR(client, env))
                            .value();
        }

        return ZVal.assign(this.createByte(env, lmPass, 24));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "password")
    @ConvertedParameter(index = 1, name = "username")
    @ConvertedParameter(index = 2, name = "domain")
    @ConvertedParameter(index = 3, name = "challenge")
    @ConvertedParameter(index = 4, name = "targetInfo")
    @ConvertedParameter(index = 5, name = "timestamp")
    @ConvertedParameter(index = 6, name = "client")
    protected Object createNTLMv2Hash(RuntimeEnv env, Object... args) {
        Object password = assignParameter(args, 0, false);
        Object username = assignParameter(args, 1, false);
        Object domain = assignParameter(args, 2, false);
        Object challenge = assignParameter(args, 3, false);
        Object targetInfo = assignParameter(args, 4, false);
        Object timestamp = assignParameter(args, 5, false);
        Object client = assignParameter(args, 6, false);
        Object ntlmv2Response = null;
        Object blob = null;
        Object ntlmHash = null;
        Object ntml2Hash = null;
        ntlmHash = this.md4Encrypt(env, password);
        ntml2Hash =
                this.md5Encrypt(
                        env,
                        ntlmHash,
                        this.convertTo16bit(
                                env,
                                toStringR(
                                                NamespaceGlobal.strtoupper
                                                        .env(env)
                                                        .call(username)
                                                        .value(),
                                                env)
                                        + toStringR(domain, env)));
        blob = this.createBlob(env, timestamp, client, targetInfo);
        ntlmv2Response =
                this.md5Encrypt(env, ntml2Hash, toStringR(challenge, env) + toStringR(blob, env));
        return ZVal.assign(toStringR(ntlmv2Response, env) + toStringR(blob, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    protected Object createDesKey(RuntimeEnv env, Object... args) {
        ReferenceContainer key = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object b = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object k = null;
        Object high = null;
        ReferenceContainer material = new BasicReferenceContainer(null);
        Object len = null;
        Object low = null;
        Object v = null;
        Object runtimeTempArrayResult172 = null;
        Object runtimeTempArrayResult171 = null;
        Object needsParity = null;
        material.setObject(
                ZVal.newArray(
                        new ZPair(
                                0,
                                NamespaceGlobal.bin2hex
                                        .env(env)
                                        .call(key.arrayGet(env, 0))
                                        .value())));
        len = function_strlen.f.env(env).call(key.getObject()).value();
        for (i.setObject(1);
                ZVal.isLessThan(i.getObject(), '<', len);
                i.setObject(ZVal.increment(i.getObject()))) {
            ZVal.list(
                    runtimeTempArrayResult171 =
                            NamespaceGlobal.str_split
                                    .env(env)
                                    .call(
                                            NamespaceGlobal.bin2hex
                                                    .env(env)
                                                    .call(key.arrayGet(env, i.getObject()))
                                                    .value())
                                    .value(),
                    (high = listGet(runtimeTempArrayResult171, 0, env)),
                    (low = listGet(runtimeTempArrayResult171, 1, env)));
            v =
                    this.castToByte(
                            env,
                            ZVal.toLong(
                                            ZVal.toLong(
                                                            NamespaceGlobal.ord
                                                                    .env(env)
                                                                    .call(
                                                                            key.arrayGet(
                                                                                    env,
                                                                                    ZVal.subtract(
                                                                                            i
                                                                                                    .getObject(),
                                                                                            1)))
                                                                    .value())
                                                    << ZVal.toLong(
                                                            ZVal.subtract(
                                                                    ZVal.add(7, 1), i.getObject())))
                                    | ZVal.toLong(
                                            this.uRShift(
                                                    env,
                                                    NamespaceGlobal.hexdec
                                                            .env(env)
                                                            .call(
                                                                    toStringR(
                                                                                    NamespaceGlobal
                                                                                            .dechex
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    ZVal
                                                                                                                    .toLong(
                                                                                                                            NamespaceGlobal
                                                                                                                                    .hexdec
                                                                                                                                    .env(
                                                                                                                                            env)
                                                                                                                                    .call(
                                                                                                                                            high)
                                                                                                                                    .value())
                                                                                                            & ZVal
                                                                                                                    .toLong(
                                                                                                                            15))
                                                                                            .value(),
                                                                                    env)
                                                                            + toStringR(
                                                                                    NamespaceGlobal
                                                                                            .dechex
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    ZVal
                                                                                                                    .toLong(
                                                                                                                            NamespaceGlobal
                                                                                                                                    .hexdec
                                                                                                                                    .env(
                                                                                                                                            env)
                                                                                                                                    .call(
                                                                                                                                            low)
                                                                                                                                    .value())
                                                                                                            & ZVal
                                                                                                                    .toLong(
                                                                                                                            15))
                                                                                            .value(),
                                                                                    env))
                                                            .value(),
                                                    i.getObject())));
            material.arrayAppend(env)
                    .set(
                            NamespaceGlobal.str_pad
                                    .env(env)
                                    .call(
                                            function_substr
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            NamespaceGlobal.dechex
                                                                    .env(env)
                                                                    .call(v)
                                                                    .value(),
                                                            -2)
                                                    .value(),
                                            2,
                                            "0",
                                            0)
                                    .value());
        }

        material.arrayAppend(env)
                .set(
                        NamespaceGlobal.str_pad
                                .env(env)
                                .call(
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(
                                                        NamespaceGlobal.dechex
                                                                .env(env)
                                                                .call(
                                                                        this.castToByte(
                                                                                env,
                                                                                ZVal.toLong(
                                                                                                NamespaceGlobal
                                                                                                        .ord
                                                                                                        .env(
                                                                                                                env)
                                                                                                        .call(
                                                                                                                key
                                                                                                                        .arrayGet(
                                                                                                                                env,
                                                                                                                                6))
                                                                                                        .value())
                                                                                        << ZVal
                                                                                                .toLong(
                                                                                                        1)))
                                                                .value(),
                                                        -2)
                                                .value(),
                                        2,
                                        "0")
                                .value());
        for (ZPair zpairResult1600 : ZVal.getIterable(material.getObject(), env, false)) {
            k = ZVal.assign(zpairResult1600.getKey());
            v = ZVal.assign(zpairResult1600.getValue());
            b = this.castToByte(env, NamespaceGlobal.hexdec.env(env).call(v).value());
            needsParity =
                    ZVal.equalityCheck(
                            0,
                            ZVal.toLong(
                                            ZVal.toLong(
                                                            ZVal.toLong(
                                                                            ZVal.toLong(
                                                                                            ZVal
                                                                                                            .toLong(
                                                                                                                    ZVal
                                                                                                                                    .toLong(
                                                                                                                                            ZVal
                                                                                                                                                            .toLong(
                                                                                                                                                                    this
                                                                                                                                                                            .uRShift(
                                                                                                                                                                                    env,
                                                                                                                                                                                    b,
                                                                                                                                                                                    7))
                                                                                                                                                    ^ ZVal
                                                                                                                                                            .toLong(
                                                                                                                                                                    this
                                                                                                                                                                            .uRShift(
                                                                                                                                                                                    env,
                                                                                                                                                                                    b,
                                                                                                                                                                                    6)))
                                                                                                                            ^ ZVal
                                                                                                                                    .toLong(
                                                                                                                                            this
                                                                                                                                                    .uRShift(
                                                                                                                                                            env,
                                                                                                                                                            b,
                                                                                                                                                            5)))
                                                                                                    ^ ZVal
                                                                                                            .toLong(
                                                                                                                    this
                                                                                                                            .uRShift(
                                                                                                                                    env,
                                                                                                                                    b,
                                                                                                                                    4)))
                                                                                    ^ ZVal.toLong(
                                                                                            this
                                                                                                    .uRShift(
                                                                                                            env,
                                                                                                            b,
                                                                                                            3)))
                                                                    ^ ZVal.toLong(
                                                                            this.uRShift(
                                                                                    env, b, 2)))
                                                    ^ ZVal.toLong(this.uRShift(env, b, 1)))
                                    & ZVal.toLong(1));
            ZVal.list(
                    runtimeTempArrayResult172 = NamespaceGlobal.str_split.env(env).call(v).value(),
                    (high = listGet(runtimeTempArrayResult172, 0, env)),
                    (low = listGet(runtimeTempArrayResult172, 1, env)));
            if (ZVal.isTrue(needsParity)) {
                material.arrayAccess(env, k)
                        .set(
                                toStringR(
                                                NamespaceGlobal.dechex
                                                        .env(env)
                                                        .call(
                                                                ZVal.toLong(
                                                                                NamespaceGlobal
                                                                                        .hexdec
                                                                                        .env(env)
                                                                                        .call(high)
                                                                                        .value())
                                                                        | ZVal.toLong(0))
                                                        .value(),
                                                env)
                                        + toStringR(
                                                NamespaceGlobal.dechex
                                                        .env(env)
                                                        .call(
                                                                ZVal.toLong(
                                                                                NamespaceGlobal
                                                                                        .hexdec
                                                                                        .env(env)
                                                                                        .call(low)
                                                                                        .value())
                                                                        | ZVal.toLong(1))
                                                        .value(),
                                                env));

            } else {
                material.arrayAccess(env, k)
                        .set(
                                toStringR(
                                                NamespaceGlobal.dechex
                                                        .env(env)
                                                        .call(
                                                                ZVal.toLong(
                                                                                NamespaceGlobal
                                                                                        .hexdec
                                                                                        .env(env)
                                                                                        .call(high)
                                                                                        .value())
                                                                        & ZVal.toLong(15))
                                                        .value(),
                                                env)
                                        + toStringR(
                                                NamespaceGlobal.dechex
                                                        .env(env)
                                                        .call(
                                                                ZVal.toLong(
                                                                                NamespaceGlobal
                                                                                        .hexdec
                                                                                        .env(env)
                                                                                        .call(low)
                                                                                        .value())
                                                                        & ZVal.toLong(14))
                                                        .value(),
                                                env));
            }
        }

        return ZVal.assign(
                NamespaceGlobal.hex2bin
                        .env(env)
                        .call(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call("", material.getObject())
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(index = 1, name = "offset")
    @ConvertedParameter(
        index = 2,
        name = "is16",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object createSecurityBuffer(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object offset = assignParameter(args, 1, false);
        Object is16 = assignParameter(args, 2, true);
        if (null == is16) {
            is16 = false;
        }
        Object length = null;
        length =
                function_strlen
                        .f
                        .env(env)
                        .call(NamespaceGlobal.bin2hex.env(env).call(value).value())
                        .value();
        length = ZVal.assign(ZVal.isTrue(is16) ? ZVal.divide(length, 2) : length);
        length =
                this.createByte(
                        env,
                        NamespaceGlobal.str_pad
                                .env(env)
                                .call(
                                        NamespaceGlobal.dechex.env(env).call(length).value(),
                                        2,
                                        "0",
                                        0)
                                .value(),
                        2);
        return ZVal.assign(
                toStringR(length, env)
                        + toStringR(length, env)
                        + toStringR(
                                this.createByte(
                                        env,
                                        NamespaceGlobal.dechex.env(env).call(offset).value(),
                                        4),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object readSecurityBuffer(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object offset = null;
        Object length = null;
        length =
                ZVal.multiply(
                        function_floor
                                .f
                                .env(env)
                                .call(
                                        ZVal.divide(
                                                NamespaceGlobal.hexdec
                                                        .env(env)
                                                        .call(
                                                                function_substr
                                                                        .f
                                                                        .env(env)
                                                                        .call(value, 0, 4)
                                                                        .value())
                                                        .value(),
                                                256))
                                .value(),
                        2);
        offset =
                ZVal.multiply(
                        function_floor
                                .f
                                .env(env)
                                .call(
                                        ZVal.divide(
                                                NamespaceGlobal.hexdec
                                                        .env(env)
                                                        .call(
                                                                function_substr
                                                                        .f
                                                                        .env(env)
                                                                        .call(value, 8, 4)
                                                                        .value())
                                                        .value(),
                                                256))
                                .value(),
                        2);
        return ZVal.assign(ZVal.newArray(new ZPair(0, length), new ZPair(1, offset)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "v")
    protected Object castToByte(RuntimeEnv env, Object... args) {
        Object v = assignParameter(args, 0, false);
        return ZVal.assign(ZVal.subtract(ZVal.modulus(ZVal.add(v, 128), 256), 128));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "a")
    @ConvertedParameter(index = 1, name = "b")
    protected Object uRShift(RuntimeEnv env, Object... args) {
        Object a = assignParameter(args, 0, false);
        Object b = assignParameter(args, 1, false);
        if (ZVal.equalityCheck(0, b)) {
            return ZVal.assign(a);
        }

        return ZVal.assign(
                ZVal.toLong(ZVal.toLong(a) >> ZVal.toLong(b))
                        & ZVal.toLong(
                                ~ZVal.toLong(
                                        ZVal.toLong(
                                                        ZVal.toLong(1)
                                                                << ZVal.toLong(
                                                                        ZVal.subtract(
                                                                                ZVal.multiply(8, 8),
                                                                                1)))
                                                >> ZVal.toLong(ZVal.subtract(b, 1)))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input")
    @ConvertedParameter(index = 1, name = "bytes", defaultValue = "4", defaultValueType = "number")
    @ConvertedParameter(
        index = 2,
        name = "isHex",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    protected Object createByte(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object bytes = assignParameter(args, 1, true);
        if (null == bytes) {
            bytes = 4;
        }
        Object isHex = assignParameter(args, 2, true);
        if (null == isHex) {
            isHex = true;
        }
        Object _pByte = null;
        if (ZVal.isTrue(isHex)) {
            _pByte =
                    NamespaceGlobal.hex2bin
                            .env(env)
                            .call(
                                    NamespaceGlobal.str_pad
                                            .env(env)
                                            .call(input, ZVal.multiply(bytes, 2), "00")
                                            .value())
                            .value();

        } else {
            _pByte = NamespaceGlobal.str_pad.env(env).call(input, bytes, "\u0000").value();
        }

        return ZVal.assign(_pByte);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(index = 1, name = "key")
    protected Object desEncrypt(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, false);
        return ZVal.assign(
                function_substr
                        .f
                        .env(env)
                        .call(
                                NamespaceGlobal.openssl_encrypt
                                        .env(env)
                                        .call(value, "DES-ECB", key, 1)
                                        .value(),
                                0,
                                8)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "msg")
    protected Object md5Encrypt(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object msg = assignParameter(args, 1, false);
        Object blocksize = null;
        Object opadk = null;
        Object ipadk = null;
        blocksize = 64;
        if (ZVal.isGreaterThan(function_strlen.f.env(env).call(key).value(), '>', blocksize)) {
            key =
                    NamespaceGlobal.pack
                            .env(env)
                            .call("H*", NamespaceGlobal.md5.env(env).call(key).value())
                            .value();
        }

        key = NamespaceGlobal.str_pad.env(env).call(key, blocksize, "\u0000").value();
        ipadk =
                ZVal.toLong(key)
                        ^ ZVal.toLong(function_str_repeat.f.env(env).call("6", blocksize).value());
        opadk =
                ZVal.toLong(key)
                        ^ ZVal.toLong(function_str_repeat.f.env(env).call("\\", blocksize).value());
        return ZVal.assign(
                NamespaceGlobal.pack
                        .env(env)
                        .call(
                                "H*",
                                NamespaceGlobal.md5
                                        .env(env)
                                        .call(
                                                toStringR(opadk, env)
                                                        + toStringR(
                                                                NamespaceGlobal.pack
                                                                        .env(env)
                                                                        .call(
                                                                                "H*",
                                                                                NamespaceGlobal.md5
                                                                                        .env(env)
                                                                                        .call(
                                                                                                toStringR(
                                                                                                                ipadk,
                                                                                                                env)
                                                                                                        + toStringR(
                                                                                                                msg,
                                                                                                                env))
                                                                                        .value())
                                                                        .value(),
                                                                env))
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input")
    protected Object md4Encrypt(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        input = this.convertTo16bit(env, input);
        return ZVal.assign(
                function_function_exists.f.env(env).call("hash").getBool()
                        ? NamespaceGlobal.hex2bin
                                .env(env)
                                .call(NamespaceGlobal.hash.env(env).call("md4", input).value())
                                .value()
                        : com.runtimeconverter.runtime.ZVal.functionNotFound("mhash")
                                .env(env)
                                .call(function_constant.get(env, "MHASH_MD4"), input)
                                .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input")
    protected Object convertTo16bit(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        return ZVal.assign(NamespaceGlobal.iconv.env(env).call("UTF-8", "UTF-16LE", input).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    protected Object debug(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        ReferenceContainer data = new BasicReferenceContainer(null);
        Object workOffset = null;
        Object messageId = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object targetOffset = null;
        Object ntmlLength = null;
        Object userLength = null;
        Object workLength = null;
        Object lmOffset = null;
        Object ntmlOffset = null;
        Object targetLength = null;
        Object runtimeTempArrayResult173 = null;
        Object userOffset = null;
        Object runtimeTempArrayResult177 = null;
        Object map = null;
        Object value = null;
        Object runtimeTempArrayResult176 = null;
        Object key = null;
        Object lmLength = null;
        Object runtimeTempArrayResult175 = null;
        Object runtimeTempArrayResult174 = null;
        message = NamespaceGlobal.bin2hex.env(env).call(message).value();
        messageId = function_substr.f.env(env).call(message, 16, 8).value();
        env.echo(
                toStringR(function_substr.f.env(env).call(message, 0, 16).value(), env)
                        + " NTLMSSP Signature<br />\n");
        env.echo(toStringR(messageId, env) + " Type Indicator<br />\n");
        if (ZVal.equalityCheck("02000000", messageId)) {
            map =
                    ZVal.arrayFromList(
                            "Challenge",
                            "Context",
                            "Target Information Security Buffer",
                            "Target Name Data",
                            "NetBIOS Domain Name",
                            "NetBIOS Server Name",
                            "DNS Domain Name",
                            "DNS Server Name",
                            "BLOB",
                            "Target Information Terminator");
            data.setObject(
                    this.parseMessage2(
                            env, NamespaceGlobal.hex2bin.env(env).call(message).value()));
            for (ZPair zpairResult1601 : ZVal.getIterable(map, env, false)) {
                key = ZVal.assign(zpairResult1601.getKey());
                value = ZVal.assign(zpairResult1601.getValue());
                env.echo(
                        toStringR(
                                        NamespaceGlobal.bin2hex
                                                .env(env)
                                                .call(data.arrayGet(env, key))
                                                .value(),
                                        env)
                                + " - "
                                + toStringR(data.arrayGet(env, key), env)
                                + " ||| "
                                + toStringR(value, env)
                                + "<br />\n");
            }

        } else if (ZVal.equalityCheck("03000000", messageId)) {
            i.setObject(0);
            data.arrayAccess(env, ZVal.postIncrement(i))
                    .set(function_substr.f.env(env).call(message, 24, 16).value());
            ZVal.list(
                    runtimeTempArrayResult173 =
                            this.readSecurityBuffer(
                                    env, data.arrayGet(env, ZVal.subtract(i.getObject(), 1))),
                    (lmLength = listGet(runtimeTempArrayResult173, 0, env)),
                    (lmOffset = listGet(runtimeTempArrayResult173, 1, env)));
            data.arrayAccess(env, ZVal.postIncrement(i))
                    .set(function_substr.f.env(env).call(message, 40, 16).value());
            ZVal.list(
                    runtimeTempArrayResult174 =
                            this.readSecurityBuffer(
                                    env, data.arrayGet(env, ZVal.subtract(i.getObject(), 1))),
                    (ntmlLength = listGet(runtimeTempArrayResult174, 0, env)),
                    (ntmlOffset = listGet(runtimeTempArrayResult174, 1, env)));
            data.arrayAccess(env, ZVal.postIncrement(i))
                    .set(function_substr.f.env(env).call(message, 56, 16).value());
            ZVal.list(
                    runtimeTempArrayResult175 =
                            this.readSecurityBuffer(
                                    env, data.arrayGet(env, ZVal.subtract(i.getObject(), 1))),
                    (targetLength = listGet(runtimeTempArrayResult175, 0, env)),
                    (targetOffset = listGet(runtimeTempArrayResult175, 1, env)));
            data.arrayAccess(env, ZVal.postIncrement(i))
                    .set(function_substr.f.env(env).call(message, 72, 16).value());
            ZVal.list(
                    runtimeTempArrayResult176 =
                            this.readSecurityBuffer(
                                    env, data.arrayGet(env, ZVal.subtract(i.getObject(), 1))),
                    (userLength = listGet(runtimeTempArrayResult176, 0, env)),
                    (userOffset = listGet(runtimeTempArrayResult176, 1, env)));
            data.arrayAccess(env, ZVal.postIncrement(i))
                    .set(function_substr.f.env(env).call(message, 88, 16).value());
            ZVal.list(
                    runtimeTempArrayResult177 =
                            this.readSecurityBuffer(
                                    env, data.arrayGet(env, ZVal.subtract(i.getObject(), 1))),
                    (workLength = listGet(runtimeTempArrayResult177, 0, env)),
                    (workOffset = listGet(runtimeTempArrayResult177, 1, env)));
            data.arrayAccess(env, ZVal.postIncrement(i))
                    .set(function_substr.f.env(env).call(message, 104, 16).value());
            data.arrayAccess(env, ZVal.postIncrement(i))
                    .set(function_substr.f.env(env).call(message, 120, 8).value());
            data.arrayAccess(env, ZVal.postIncrement(i))
                    .set(
                            function_substr
                                    .f
                                    .env(env)
                                    .call(message, targetOffset, targetLength)
                                    .value());
            data.arrayAccess(env, ZVal.postIncrement(i))
                    .set(function_substr.f.env(env).call(message, userOffset, userLength).value());
            data.arrayAccess(env, ZVal.postIncrement(i))
                    .set(function_substr.f.env(env).call(message, workOffset, workLength).value());
            data.arrayAccess(env, ZVal.postIncrement(i))
                    .set(function_substr.f.env(env).call(message, lmOffset, lmLength).value());
            data.arrayAccess(env, i.getObject())
                    .set(function_substr.f.env(env).call(message, ntmlOffset, ntmlLength).value());
            map =
                    ZVal.arrayFromList(
                            "LM Response Security Buffer",
                            "NTLM Response Security Buffer",
                            "Target Name Security Buffer",
                            "User Name Security Buffer",
                            "Workstation Name Security Buffer",
                            "Session Key Security Buffer",
                            "Flags",
                            "Target Name Data",
                            "User Name Data",
                            "Workstation Name Data",
                            "LM Response Data",
                            "NTLM Response Data");
            for (ZPair zpairResult1602 : ZVal.getIterable(map, env, false)) {
                key = ZVal.assign(zpairResult1602.getKey());
                value = ZVal.assign(zpairResult1602.getValue());
                env.echo(
                        toStringR(data.arrayGet(env, key), env)
                                + " - "
                                + toStringR(
                                        NamespaceGlobal.hex2bin
                                                .env(env)
                                                .call(data.arrayGet(env, key))
                                                .value(),
                                        env)
                                + " ||| "
                                + toStringR(value, env)
                                + "<br />\n");
            }
        }

        env.echo("<br /><br />");
        return null;
    }

    public static final Object CONST_NTLMSIG = "NTLMSSP\u0000";

    public static final Object CONST_DESCONST = "KGS!@#$%";

    public static final Object CONST_class = "Swift_Transport_Esmtp_Auth_NTLMAuthenticator";

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
                    .setName("Swift_Transport_Esmtp_Auth_NTLMAuthenticator")
                    .setLookup(
                            Swift_Transport_Esmtp_Auth_NTLMAuthenticator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/Esmtp/Auth/NTLMAuthenticator.php")
                    .addInterface("Swift_Transport_Esmtp_Authenticator")
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
