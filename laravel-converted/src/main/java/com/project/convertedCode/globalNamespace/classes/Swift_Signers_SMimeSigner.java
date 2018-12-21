package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Swift_IoException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_DependencyContainer;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_ContentEncoder_NullContentEncoder;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_ContentEncoder_PlainContentEncoder;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_Header;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.classes.Swift_MimePart;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.classes.Swift_ByteStream_TemporaryFileByteStream;
import com.project.convertedCode.globalNamespace.classes.Swift_Signers_BodySigner;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Signers/SMimeSigner.php

*/

public class Swift_Signers_SMimeSigner extends RuntimeClassBase
        implements Swift_Signers_BodySigner {

    public Object signCertificate = null;

    public Object signPrivateKey = null;

    public Object encryptCert = null;

    public Object signThenEncrypt = true;

    public Object signLevel = null;

    public Object encryptLevel = null;

    public Object signOptions = null;

    public Object encryptOptions = null;

    public Object encryptCipher = null;

    public Object extraCerts = ZVal.getNull();

    public Object wrapFullMessage = false;

    public Object replacementFactory = null;

    public Object headerFactory = null;

    public Swift_Signers_SMimeSigner(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Signers_SMimeSigner.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Signers_SMimeSigner(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "signCertificate",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "signPrivateKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "encryptCertificate",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object signCertificate = assignParameter(args, 0, true);
        if (null == signCertificate) {
            signCertificate = ZVal.getNull();
        }
        Object signPrivateKey = assignParameter(args, 1, true);
        if (null == signPrivateKey) {
            signPrivateKey = ZVal.getNull();
        }
        Object encryptCertificate = assignParameter(args, 2, true);
        if (null == encryptCertificate) {
            encryptCertificate = ZVal.getNull();
        }
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", signPrivateKey)) {
            this.setSignCertificate(env, signCertificate, signPrivateKey);
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", encryptCertificate)) {
            this.setEncryptCertificate(env, encryptCertificate);
        }

        this.replacementFactory =
                env.callMethod(
                        Swift_DependencyContainer.runtimeStaticObject.getInstance(env),
                        "lookup",
                        Swift_Signers_SMimeSigner.class,
                        "transport.replacementfactory");
        this.signOptions = 64;
        this.encryptCipher = 5;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "certificate")
    @ConvertedParameter(
        index = 1,
        name = "privateKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "signOptions")
    @ConvertedParameter(
        index = 3,
        name = "extraCerts",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setSignCertificate(RuntimeEnv env, Object... args) {
        Object certificate = assignParameter(args, 0, false);
        ReferenceContainer privateKey = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == privateKey.getObject()) {
            privateKey.setObject(ZVal.getNull());
        }
        Object signOptions = assignParameter(args, 2, true);
        if (null == signOptions) {
            signOptions = 64;
        }
        Object extraCerts = assignParameter(args, 3, true);
        if (null == extraCerts) {
            extraCerts = ZVal.getNull();
        }
        this.signCertificate =
                "file://"
                        + toStringR(
                                function_str_replace
                                        .f
                                        .env(env)
                                        .call(
                                                "\\",
                                                "/",
                                                function_realpath
                                                        .f
                                                        .env(env)
                                                        .call(certificate)
                                                        .value())
                                        .value(),
                                env);
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", privateKey.getObject())) {
            if (function_is_array.f.env(env).call(privateKey.getObject()).getBool()) {
                this.signPrivateKey = privateKey.getObject();
                new ReferenceClassProperty(this, "signPrivateKey", env)
                        .arrayAccess(env, 0)
                        .set(
                                "file://"
                                        + toStringR(
                                                function_str_replace
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "\\",
                                                                "/",
                                                                function_realpath
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                privateKey.arrayGet(
                                                                                        env, 0))
                                                                        .value())
                                                        .value(),
                                                env));

            } else {
                this.signPrivateKey =
                        "file://"
                                + toStringR(
                                        function_str_replace
                                                .f
                                                .env(env)
                                                .call(
                                                        "\\",
                                                        "/",
                                                        function_realpath
                                                                .f
                                                                .env(env)
                                                                .call(privateKey.getObject())
                                                                .value())
                                                .value(),
                                        env);
            }
        }

        this.signOptions = signOptions;
        this.extraCerts =
                ZVal.isTrue(extraCerts)
                        ? function_realpath.f.env(env).call(extraCerts).value()
                        : ZVal.getNull();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "recipientCerts")
    @ConvertedParameter(
        index = 1,
        name = "cipher",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setEncryptCertificate(RuntimeEnv env, Object... args) {
        Object recipientCerts = assignParameter(args, 0, false);
        Object cipher = assignParameter(args, 1, true);
        if (null == cipher) {
            cipher = ZVal.getNull();
        }
        Object cert = null;
        if (function_is_array.f.env(env).call(recipientCerts).getBool()) {
            this.encryptCert = ZVal.newArray();
            for (ZPair zpairResult1590 : ZVal.getIterable(recipientCerts, env, true)) {
                cert = ZVal.assign(zpairResult1590.getValue());
                new ReferenceClassProperty(this, "encryptCert", env)
                        .arrayAppend(env)
                        .set(
                                "file://"
                                        + toStringR(
                                                function_str_replace
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "\\",
                                                                "/",
                                                                function_realpath
                                                                        .f
                                                                        .env(env)
                                                                        .call(cert)
                                                                        .value())
                                                        .value(),
                                                env));
            }

        } else {
            this.encryptCert =
                    "file://"
                            + toStringR(
                                    function_str_replace
                                            .f
                                            .env(env)
                                            .call(
                                                    "\\",
                                                    "/",
                                                    function_realpath
                                                            .f
                                                            .env(env)
                                                            .call(recipientCerts)
                                                            .value())
                                            .value(),
                                    env);
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", cipher)) {
            this.encryptCipher = cipher;
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getSignCertificate(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.signCertificate);
    }

    @ConvertedMethod
    public Object getSignPrivateKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.signPrivateKey);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "signThenEncrypt",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object setSignThenEncrypt(RuntimeEnv env, Object... args) {
        Object signThenEncrypt = assignParameter(args, 0, true);
        if (null == signThenEncrypt) {
            signThenEncrypt = true;
        }
        this.signThenEncrypt = signThenEncrypt;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object isSignThenEncrypt(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.signThenEncrypt);
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "wrap")
    public Object setWrapFullMessage(RuntimeEnv env, Object... args) {
        Object wrap = assignParameter(args, 0, false);
        this.wrapFullMessage = wrap;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Message")
    public Object signMessage(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.signCertificate))
                && ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.encryptCert))) {
            return ZVal.assign(this);
        }

        if (ZVal.isTrue(this.signThenEncrypt)) {
            this.smimeSignMessage(env, message);
            this.smimeEncryptMessage(env, message);

        } else {
            this.smimeEncryptMessage(env, message);
            this.smimeSignMessage(env, message);
        }

        return null;
    }

    @ConvertedMethod
    public Object getAlteredHeaders(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.arrayFromList(
                        "Content-Type", "Content-Transfer-Encoding", "Content-Disposition"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Message")
    protected Object smimeSignMessage(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object signedMessageStream = null;
        Object signMessage = null;
        Object messageStream = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.signCertificate)) {
            return null;
        }

        signMessage = ZVal.assign(((RuntimeClassInterface) message).phpClone(env));
        env.callMethod(signMessage, "clearSigners", Swift_Signers_SMimeSigner.class);
        if (ZVal.isTrue(this.wrapFullMessage)) {
            signMessage = this.wrapMimeMessage(env, signMessage);

        } else {
            this.clearAllHeaders(env, signMessage);
            this.copyHeaders(
                    env,
                    message,
                    signMessage,
                    ZVal.arrayFromList(
                            "Content-Type", "Content-Transfer-Encoding", "Content-Disposition"));
        }

        messageStream = new Swift_ByteStream_TemporaryFileByteStream(env);
        env.callMethod(signMessage, "toByteStream", Swift_Signers_SMimeSigner.class, messageStream);
        env.callMethod(messageStream, "commit", Swift_Signers_SMimeSigner.class);
        signedMessageStream = new Swift_ByteStream_TemporaryFileByteStream(env);
        if (!NamespaceGlobal.openssl_pkcs7_sign
                .env(env)
                .call(
                        env.callMethod(messageStream, "getPath", Swift_Signers_SMimeSigner.class),
                        env.callMethod(
                                signedMessageStream, "getPath", Swift_Signers_SMimeSigner.class),
                        this.signCertificate,
                        this.signPrivateKey,
                        ZVal.newArray(),
                        this.signOptions,
                        this.extraCerts)
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new Swift_IoException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Failed to sign S/Mime message. Error: \"%s\".",
                                            NamespaceGlobal.openssl_error_string
                                                    .env(env)
                                                    .call()
                                                    .value())
                                    .value()));
        }

        this.parseSSLOutput(env, signedMessageStream, message);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Message")
    protected Object smimeEncryptMessage(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object encryptedMessageStream = null;
        Object messageStream = null;
        Object encryptMessage = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.encryptCert)) {
            return null;
        }

        encryptMessage = ZVal.assign(((RuntimeClassInterface) message).phpClone(env));
        env.callMethod(encryptMessage, "clearSigners", Swift_Signers_SMimeSigner.class);
        if (ZVal.isTrue(this.wrapFullMessage)) {
            encryptMessage = this.wrapMimeMessage(env, encryptMessage);

        } else {
            this.clearAllHeaders(env, encryptMessage);
            this.copyHeaders(
                    env,
                    message,
                    encryptMessage,
                    ZVal.arrayFromList(
                            "Content-Type", "Content-Transfer-Encoding", "Content-Disposition"));
        }

        messageStream = new Swift_ByteStream_TemporaryFileByteStream(env);
        env.callMethod(
                encryptMessage, "toByteStream", Swift_Signers_SMimeSigner.class, messageStream);
        env.callMethod(messageStream, "commit", Swift_Signers_SMimeSigner.class);
        encryptedMessageStream = new Swift_ByteStream_TemporaryFileByteStream(env);
        if (!NamespaceGlobal.openssl_pkcs7_encrypt
                .env(env)
                .call(
                        env.callMethod(messageStream, "getPath", Swift_Signers_SMimeSigner.class),
                        env.callMethod(
                                encryptedMessageStream, "getPath", Swift_Signers_SMimeSigner.class),
                        this.encryptCert,
                        ZVal.newArray(),
                        0,
                        this.encryptCipher)
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new Swift_IoException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Failed to encrypt S/Mime message. Error: \"%s\".",
                                            NamespaceGlobal.openssl_error_string
                                                    .env(env)
                                                    .call()
                                                    .value())
                                    .value()));
        }

        this.parseSSLOutput(env, encryptedMessageStream, message);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fromMessage", typeHint = "Swift_Message")
    @ConvertedParameter(index = 1, name = "toMessage", typeHint = "Swift_Message")
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object copyHeaders(RuntimeEnv env, Object... args) {
        Object fromMessage = assignParameter(args, 0, false);
        Object toMessage = assignParameter(args, 1, false);
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        Object header = null;
        for (ZPair zpairResult1591 : ZVal.getIterable(headers, env, true)) {
            header = ZVal.assign(zpairResult1591.getValue());
            this.copyHeader(env, fromMessage, toMessage, header);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fromMessage", typeHint = "Swift_Message")
    @ConvertedParameter(index = 1, name = "toMessage", typeHint = "Swift_Message")
    @ConvertedParameter(index = 2, name = "headerName")
    protected Object copyHeader(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object fromMessage = assignParameter(args, 0, false);
        Object toMessage = assignParameter(args, 1, false);
        Object headerName = assignParameter(args, 2, false);
        Object headers = null;
        Object header = null;
        header =
                env.callMethod(
                        env.callMethod(fromMessage, "getHeaders", Swift_Signers_SMimeSigner.class),
                        "get",
                        Swift_Signers_SMimeSigner.class,
                        headerName);
        if (!ZVal.isTrue(header)) {
            return null;
        }

        headers = env.callMethod(toMessage, "getHeaders", Swift_Signers_SMimeSigner.class);
        SwitchEnumType105 switchVariable105 =
                ZVal.getEnum(
                        env.callMethod(header, "getFieldType", Swift_Signers_SMimeSigner.class),
                        SwitchEnumType105.DEFAULT_CASE,
                        SwitchEnumType105.DYNAMIC_TYPE_350,
                        Swift_Mime_Header.CONST_TYPE_TEXT,
                        SwitchEnumType105.DYNAMIC_TYPE_351,
                        Swift_Mime_Header.CONST_TYPE_PARAMETERIZED);
        switch (switchVariable105) {
            case DYNAMIC_TYPE_350:
                env.callMethod(
                        headers,
                        "addTextHeader",
                        Swift_Signers_SMimeSigner.class,
                        env.callMethod(header, "getFieldName", Swift_Signers_SMimeSigner.class),
                        env.callMethod(header, "getValue", Swift_Signers_SMimeSigner.class));
                break;
            case DYNAMIC_TYPE_351:
                env.callMethod(
                        headers,
                        "addParameterizedHeader",
                        Swift_Signers_SMimeSigner.class,
                        env.callMethod(header, "getFieldName", Swift_Signers_SMimeSigner.class),
                        env.callMethod(header, "getValue", Swift_Signers_SMimeSigner.class),
                        env.callMethod(header, "getParameters", Swift_Signers_SMimeSigner.class));
                break;
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Message")
    protected Object clearAllHeaders(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object headers = null;
        Object header = null;
        headers = env.callMethod(message, "getHeaders", Swift_Signers_SMimeSigner.class);
        for (ZPair zpairResult1592 :
                ZVal.getIterable(
                        env.callMethod(headers, "listAll", Swift_Signers_SMimeSigner.class),
                        env,
                        true)) {
            header = ZVal.assign(zpairResult1592.getValue());
            env.callMethod(headers, "removeAll", Swift_Signers_SMimeSigner.class, header);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Message")
    protected Object wrapMimeMessage(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object messageStream = null;
        Object wrappedMessage = null;
        messageStream = new Swift_ByteStream_TemporaryFileByteStream(env);
        env.callMethod(message, "toByteStream", Swift_Signers_SMimeSigner.class, messageStream);
        env.callMethod(messageStream, "commit", Swift_Signers_SMimeSigner.class);
        wrappedMessage = new Swift_MimePart(env, messageStream, "message/rfc822");
        env.callMethod(
                wrappedMessage,
                "setEncoder",
                Swift_Signers_SMimeSigner.class,
                new Swift_Mime_ContentEncoder_PlainContentEncoder(env, "7bit"));
        return ZVal.assign(wrappedMessage);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "inputStream", typeHint = "Swift_InputByteStream")
    @ConvertedParameter(index = 1, name = "message", typeHint = "Swift_Message")
    protected Object parseSSLOutput(RuntimeEnv env, Object... args) {
        Object inputStream = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        Object messageStream = null;
        messageStream = new Swift_ByteStream_TemporaryFileByteStream(env);
        this.copyFromOpenSSLOutput(env, inputStream, messageStream);
        this.streamToMime(env, messageStream, message);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fromStream", typeHint = "Swift_OutputByteStream")
    @ConvertedParameter(index = 1, name = "message", typeHint = "Swift_Message")
    protected Object streamToMime(RuntimeEnv env, Object... args) {
        Object fromStream = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        ReferenceContainer headers = new BasicReferenceContainer(null);
        Object messageHeaders = null;
        Object messageStream = null;
        Object runtimeTempArrayResult161 = null;
        Object encoding = null;
        ZVal.list(
                runtimeTempArrayResult161 = this.parseStream(env, fromStream),
                (headers.setObject(listGet(runtimeTempArrayResult161, 0, env))),
                (messageStream = listGet(runtimeTempArrayResult161, 1, env)));
        messageHeaders = env.callMethod(message, "getHeaders", Swift_Signers_SMimeSigner.class);
        encoding = "";
        env.callMethod(
                messageHeaders,
                "removeAll",
                Swift_Signers_SMimeSigner.class,
                "Content-Transfer-Encoding");
        if (arrayActionR(ArrayAction.ISSET, headers, env, "content-transfer-encoding")) {
            encoding = ZVal.assign(headers.arrayGet(env, "content-transfer-encoding"));
        }

        env.callMethod(
                message,
                "setEncoder",
                Swift_Signers_SMimeSigner.class,
                new Swift_Mime_ContentEncoder_NullContentEncoder(env, encoding));
        if (arrayActionR(ArrayAction.ISSET, headers, env, "content-disposition")) {
            env.callMethod(
                    messageHeaders,
                    "addTextHeader",
                    Swift_Signers_SMimeSigner.class,
                    "Content-Disposition",
                    headers.arrayGet(env, "content-disposition"));
        }

        env.callMethod(message, "setChildren", Swift_Signers_SMimeSigner.class, ZVal.newArray());
        env.callMethod(
                message,
                "setBody",
                Swift_Signers_SMimeSigner.class,
                messageStream,
                headers.arrayGet(env, "content-type"));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "emailStream", typeHint = "Swift_OutputByteStream")
    protected Object parseStream(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object emailStream = assignParameter(args, 0, false);
        Object headerData = null;
        ReferenceContainer headers = new BasicReferenceContainer(null);
        Object headerLines = null;
        Object bufferLength = null;
        Object currentHeaderName = null;
        ReferenceContainer header = new BasicReferenceContainer(null);
        Object bodyStream = null;
        Object buffer = null;
        Object headerLine = null;
        Object headersPosEnd = null;
        Object headerBodySeparator = null;
        bufferLength = 78;
        headerData = "";
        headerBodySeparator = "\r\n\r\n";
        env.callMethod(emailStream, "setReadPointer", Swift_Signers_SMimeSigner.class, 0);
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        while (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                buffer =
                        env.callMethod(
                                emailStream,
                                "read",
                                Swift_Signers_SMimeSigner.class,
                                bufferLength))) {
            headerData = toStringR(headerData, env) + toStringR(buffer, env);
            headersPosEnd =
                    function_strpos.f.env(env).call(headerData, headerBodySeparator).value();
            if (ZVal.strictNotEqualityCheck(false, "!==", headersPosEnd)) {
                break;
            }
        }

        headerData =
                function_trim
                        .f
                        .env(env)
                        .call(function_substr.f.env(env).call(headerData, 0, headersPosEnd).value())
                        .value();
        headerLines = function_explode.f.env(env).call("\r\n", headerData).value();
        headerData = null;
        headers.setObject(ZVal.newArray());
        currentHeaderName = "";
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1593 : ZVal.getIterable(headerLines, env, true)) {
            headerLine = ZVal.assign(zpairResult1593.getValue());
            if (ZVal.strictEqualityCheck(
                    false, "===", function_strpos.f.env(env).call(headerLine, ":").value())) {
                headers.arrayAccess(env, currentHeaderName)
                        .set(
                                toStringR(headers.arrayGet(env, currentHeaderName), env)
                                        + " "
                                        + toStringR(
                                                function_trim.f.env(env).call(headerLine).value(),
                                                env));
                continue;
            }

            header.setObject(function_explode.f.env(env).call(":", headerLine, 2).value());
            currentHeaderName =
                    NamespaceGlobal.strtolower.env(env).call(header.arrayGet(env, 0)).value();
            headers.arrayAccess(env, currentHeaderName)
                    .set(function_trim.f.env(env).call(header.arrayGet(env, 1)).value());
        }

        bodyStream = new Swift_ByteStream_TemporaryFileByteStream(env);
        env.callMethod(
                emailStream,
                "setReadPointer",
                Swift_Signers_SMimeSigner.class,
                ZVal.add(
                        headersPosEnd,
                        function_strlen.f.env(env).call(headerBodySeparator).value()));
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        while (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                buffer =
                        env.callMethod(
                                emailStream,
                                "read",
                                Swift_Signers_SMimeSigner.class,
                                bufferLength))) {
            env.callMethod(bodyStream, "write", Swift_Signers_SMimeSigner.class, buffer);
        }

        env.callMethod(bodyStream, "commit", Swift_Signers_SMimeSigner.class);
        return ZVal.assign(
                ZVal.newArray(new ZPair(0, headers.getObject()), new ZPair(1, bodyStream)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fromStream", typeHint = "Swift_OutputByteStream")
    @ConvertedParameter(index = 1, name = "toStream", typeHint = "Swift_InputByteStream")
    protected Object copyFromOpenSSLOutput(RuntimeEnv env, Object... args) {
        Object fromStream = assignParameter(args, 0, false);
        Object toStream = assignParameter(args, 1, false);
        Object filteredStream = null;
        Object bufferLength = null;
        Object buffer = null;
        bufferLength = 4096;
        filteredStream = new Swift_ByteStream_TemporaryFileByteStream(env);
        env.callMethod(
                filteredStream,
                "addFilter",
                Swift_Signers_SMimeSigner.class,
                env.callMethod(
                        this.replacementFactory,
                        "createFilter",
                        Swift_Signers_SMimeSigner.class,
                        "\r\n",
                        "\n"),
                "CRLF to LF");
        env.callMethod(
                filteredStream,
                "addFilter",
                Swift_Signers_SMimeSigner.class,
                env.callMethod(
                        this.replacementFactory,
                        "createFilter",
                        Swift_Signers_SMimeSigner.class,
                        "\n",
                        "\r\n"),
                "LF to CRLF");
        while (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                buffer =
                        env.callMethod(
                                fromStream,
                                "read",
                                Swift_Signers_SMimeSigner.class,
                                bufferLength))) {
            env.callMethod(filteredStream, "write", Swift_Signers_SMimeSigner.class, buffer);
        }

        env.callMethod(filteredStream, "flushBuffers", Swift_Signers_SMimeSigner.class);
        while (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                buffer =
                        env.callMethod(
                                filteredStream,
                                "read",
                                Swift_Signers_SMimeSigner.class,
                                bufferLength))) {
            env.callMethod(toStream, "write", Swift_Signers_SMimeSigner.class, buffer);
        }

        env.callMethod(toStream, "commit", Swift_Signers_SMimeSigner.class);
        return null;
    }

    public static final Object CONST_class = "Swift_Signers_SMimeSigner";

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
                    .setName("Swift_Signers_SMimeSigner")
                    .setLookup(
                            Swift_Signers_SMimeSigner.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "encryptCert",
                            "encryptCipher",
                            "encryptLevel",
                            "encryptOptions",
                            "extraCerts",
                            "headerFactory",
                            "replacementFactory",
                            "signCertificate",
                            "signLevel",
                            "signOptions",
                            "signPrivateKey",
                            "signThenEncrypt",
                            "wrapFullMessage")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Signers/SMimeSigner.php")
                    .addInterface("Swift_Signers_BodySigner")
                    .addInterface("Swift_Signer")
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

    private enum SwitchEnumType105 {
        DYNAMIC_TYPE_350,
        DYNAMIC_TYPE_351,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
