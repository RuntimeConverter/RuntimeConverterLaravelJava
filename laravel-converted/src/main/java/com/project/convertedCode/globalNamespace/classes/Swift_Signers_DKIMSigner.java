package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.classes.Swift_SwiftException;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.classes.Swift_Signers_HeaderSigner;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Signers/DKIMSigner.php

*/

public class Swift_Signers_DKIMSigner extends RuntimeClassBase
        implements Swift_Signers_HeaderSigner {

    public Object privateKey = null;

    public Object domainName = null;

    public Object selector = null;

    public Object passphrase = "";

    public Object hashAlgorithm = "rsa-sha256";

    public Object bodyCanon = "simple";

    public Object headerCanon = "simple";

    public Object ignoredHeaders = ZVal.newArray(new ZPair("return-path", true));

    public Object signerIdentity = null;

    public Object bodyLen = 0;

    public Object maxLen = 9223372036854775807L;

    public Object showLen = false;

    public Object signatureTimestamp = true;

    public Object signatureExpiration = false;

    public Object debugHeaders = false;

    public Object signedHeaders = ZVal.newArray();

    public Object debugHeadersData = "";

    public Object bodyHash = "";

    public Object dkimHeader = null;

    public Object bodyHashHandler = null;

    public Object headerHash = null;

    public Object headerCanonData = "";

    public Object bodyCanonEmptyCounter = 0;

    public Object bodyCanonIgnoreStart = 2;

    public Object bodyCanonSpace = false;

    public Object bodyCanonLastChar = ZVal.getNull();

    public Object bodyCanonLine = "";

    public Object bound = ZVal.newArray();

    public Swift_Signers_DKIMSigner(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Signers_DKIMSigner.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Signers_DKIMSigner(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "privateKey")
    @ConvertedParameter(index = 1, name = "domainName")
    @ConvertedParameter(index = 2, name = "selector")
    @ConvertedParameter(index = 3, name = "passphrase")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object privateKey = assignParameter(args, 0, false);
        Object domainName = assignParameter(args, 1, false);
        Object selector = assignParameter(args, 2, false);
        Object passphrase = assignParameter(args, 3, true);
        if (null == passphrase) {
            passphrase = "";
        }
        this.privateKey = privateKey;
        this.domainName = domainName;
        this.signerIdentity = "@" + toStringR(domainName, env);
        this.selector = selector;
        this.passphrase = passphrase;
        return null;
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        this.headerHash = ZVal.getNull();
        this.signedHeaders = ZVal.newArray();
        this.bodyHash = ZVal.getNull();
        this.bodyHashHandler = ZVal.getNull();
        this.bodyCanonIgnoreStart = 2;
        this.bodyCanonEmptyCounter = 0;
        this.bodyCanonLastChar = ZVal.getNull();
        this.bodyCanonSpace = false;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bytes")
    public Object write(RuntimeEnv env, Object... args) {
        Object bytes = assignParameter(args, 0, false);
        Object is = null;
        this.canonicalizeBody(env, bytes);
        for (ZPair zpairResult1578 : ZVal.getIterable(this.bound, env, true)) {
            is = ZVal.assign(zpairResult1578.getValue());
            env.callMethod(is, "write", Swift_Signers_DKIMSigner.class, bytes);
        }

        return null;
    }

    @ConvertedMethod
    public Object commit(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "is", typeHint = "Swift_InputByteStream")
    public Object bind(RuntimeEnv env, Object... args) {
        Object is = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "bound", env).arrayAppend(env).set(is);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "is", typeHint = "Swift_InputByteStream")
    public Object unbind(RuntimeEnv env, Object... args) {
        Object is = assignParameter(args, 0, false);
        Object stream = null;
        Object k = null;
        for (ZPair zpairResult1579 : ZVal.getIterable(this.bound, env, false)) {
            k = ZVal.assign(zpairResult1579.getKey());
            stream = ZVal.assign(zpairResult1579.getValue());
            if (ZVal.strictEqualityCheck(stream, "===", is)) {
                arrayActionR(
                        ArrayAction.UNSET, new ReferenceClassProperty(this, "bound", env), env, k);
                return null;
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object flushBuffers(RuntimeEnv env, Object... args) {
        this.reset(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "hash")
    public Object setHashAlgorithm(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object hash = assignParameter(args, 0, false);
        SwitchEnumType102 switchVariable102 =
                ZVal.getEnum(
                        hash,
                        SwitchEnumType102.DEFAULT_CASE,
                        SwitchEnumType102.STRING_rsa_sha1,
                        "rsa-sha1",
                        SwitchEnumType102.STRING_rsa_sha256,
                        "rsa-sha256");
        switch (switchVariable102) {
            case STRING_rsa_sha1:
                this.hashAlgorithm = "rsa-sha1";
                break;
            case STRING_rsa_sha256:
                this.hashAlgorithm = "rsa-sha256";
                if (!function_defined.f.env(env).call("OPENSSL_ALGO_SHA256").getBool()) {
                    throw ZVal.getException(
                            env,
                            new Swift_SwiftException(
                                    env,
                                    "Unable to set sha256 as it is not supported by OpenSSL."));
                }

                break;
            case DEFAULT_CASE:
                throw ZVal.getException(
                        env,
                        new Swift_SwiftException(
                                env,
                                "Unable to set the hash algorithm, must be one of rsa-sha1 or rsa-sha256 (%s given).",
                                hash));
        }
        ;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "canon")
    public Object setBodyCanon(RuntimeEnv env, Object... args) {
        Object canon = assignParameter(args, 0, false);
        if (ZVal.equalityCheck("relaxed", canon)) {
            this.bodyCanon = "relaxed";

        } else {
            this.bodyCanon = "simple";
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "canon")
    public Object setHeaderCanon(RuntimeEnv env, Object... args) {
        Object canon = assignParameter(args, 0, false);
        if (ZVal.equalityCheck("relaxed", canon)) {
            this.headerCanon = "relaxed";

        } else {
            this.headerCanon = "simple";
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "identity")
    public Object setSignerIdentity(RuntimeEnv env, Object... args) {
        Object identity = assignParameter(args, 0, false);
        this.signerIdentity = identity;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "len")
    public Object setBodySignedLen(RuntimeEnv env, Object... args) {
        Object len = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(true, "===", len)) {
            this.showLen = true;
            this.maxLen = 9223372036854775807L;

        } else if (ZVal.strictEqualityCheck(false, "===", len)) {
            this.showLen = false;
            this.maxLen = 9223372036854775807L;

        } else {
            this.showLen = true;
            this.maxLen = ZVal.toLong(len);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "time")
    public Object setSignatureTimestamp(RuntimeEnv env, Object... args) {
        Object time = assignParameter(args, 0, false);
        this.signatureTimestamp = time;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "time")
    public Object setSignatureExpiration(RuntimeEnv env, Object... args) {
        Object time = assignParameter(args, 0, false);
        this.signatureExpiration = time;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "debug")
    public Object setDebugHeaders(RuntimeEnv env, Object... args) {
        Object debug = assignParameter(args, 0, false);
        this.debugHeaders = ZVal.toBool(debug);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object startBody(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        switch (toStringR(this.hashAlgorithm)) {
            case "rsa-sha256":
                this.bodyHashHandler = NamespaceGlobal.hash_init.env(env).call("sha256").value();
                break;
            case "rsa-sha1":
                this.bodyHashHandler = NamespaceGlobal.hash_init.env(env).call("sha1").value();
                break;
        }
        ;
        this.bodyCanonLine = "";
        return null;
    }

    @ConvertedMethod
    public Object endBody(RuntimeEnv env, Object... args) {
        this.endOfBody(env);
        return null;
    }

    @ConvertedMethod
    public Object getAlteredHeaders(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.debugHeaders)) {
            return ZVal.assign(ZVal.arrayFromList("DKIM-Signature", "X-DebugHash"));

        } else {
            return ZVal.assign(ZVal.arrayFromList("DKIM-Signature"));
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "header_name")
    public Object ignoreHeader(RuntimeEnv env, Object... args) {
        Object header_name = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "ignoredHeaders", env)
                .arrayAccess(env, NamespaceGlobal.strtolower.env(env).call(header_name).value())
                .set(true);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headers", typeHint = "Swift_Mime_SimpleHeaderSet")
    public Object setHeaders(RuntimeEnv env, Object... args) {
        Object headers = assignParameter(args, 0, false);
        Object tmp = null;
        Object listHeaders = null;
        Object header = null;
        Object hName = null;
        this.headerCanonData = "";
        listHeaders = env.callMethod(headers, "listAll", Swift_Signers_DKIMSigner.class);
        for (ZPair zpairResult1580 : ZVal.getIterable(listHeaders, env, true)) {
            hName = ZVal.assign(zpairResult1580.getValue());
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "ignoredHeaders", env),
                    env,
                    NamespaceGlobal.strtolower.env(env).call(hName).value())) {
                if (ZVal.isTrue(
                        env.callMethod(headers, "has", Swift_Signers_DKIMSigner.class, hName))) {
                    tmp = env.callMethod(headers, "getAll", Swift_Signers_DKIMSigner.class, hName);
                    for (ZPair zpairResult1581 : ZVal.getIterable(tmp, env, true)) {
                        header = ZVal.assign(zpairResult1581.getValue());
                        if (ZVal.notEqualityCheck(
                                "",
                                env.callMethod(
                                        header, "getFieldBody", Swift_Signers_DKIMSigner.class))) {
                            this.addHeader(
                                    env,
                                    env.callMethod(
                                            header, "toString", Swift_Signers_DKIMSigner.class));
                            new ReferenceClassProperty(this, "signedHeaders", env)
                                    .arrayAppend(env)
                                    .set(
                                            env.callMethod(
                                                    header,
                                                    "getFieldName",
                                                    Swift_Signers_DKIMSigner.class));
                        }
                    }
                }
            }
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headers", typeHint = "Swift_Mime_SimpleHeaderSet")
    public Object addSignature(RuntimeEnv env, Object... args) {
        Object headers = assignParameter(args, 0, false);
        Object string = null;
        Object v = null;
        Object tmp = null;
        Object k = null;
        ReferenceContainer params = new BasicReferenceContainer(null);
        params.setObject(
                ZVal.newArray(
                        new ZPair("v", "1"),
                        new ZPair("a", this.hashAlgorithm),
                        new ZPair(
                                "bh",
                                NamespaceGlobal.base64_encode.env(env).call(this.bodyHash).value()),
                        new ZPair("d", this.domainName),
                        new ZPair(
                                "h",
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(": ", this.signedHeaders)
                                        .value()),
                        new ZPair("i", this.signerIdentity),
                        new ZPair("s", this.selector)));
        if (ZVal.notEqualityCheck("simple", this.bodyCanon)) {
            params.arrayAccess(env, "c")
                    .set(toStringR(this.headerCanon, env) + "/" + toStringR(this.bodyCanon, env));

        } else if (ZVal.notEqualityCheck("simple", this.headerCanon)) {
            params.arrayAccess(env, "c").set(this.headerCanon);
        }

        if (ZVal.isTrue(this.showLen)) {
            params.arrayAccess(env, "l").set(this.bodyLen);
        }

        if (ZVal.strictEqualityCheck(true, "===", this.signatureTimestamp)) {
            params.arrayAccess(env, "t").set(NamespaceGlobal.time.env(env).call().value());
            if (ZVal.strictNotEqualityCheck(false, "!==", this.signatureExpiration)) {
                params.arrayAccess(env, "x")
                        .set(ZVal.add(params.arrayGet(env, "t"), this.signatureExpiration));
            }

        } else {
            if (ZVal.strictNotEqualityCheck(false, "!==", this.signatureTimestamp)) {
                params.arrayAccess(env, "t").set(this.signatureTimestamp);
            }

            if (ZVal.strictNotEqualityCheck(false, "!==", this.signatureExpiration)) {
                params.arrayAccess(env, "x").set(this.signatureExpiration);
            }
        }

        if (ZVal.isTrue(this.debugHeaders)) {
            params.arrayAccess(env, "z")
                    .set(NamespaceGlobal.implode.env(env).call("|", this.debugHeadersData).value());
        }

        string = "";
        for (ZPair zpairResult1582 : ZVal.getIterable(params.getObject(), env, false)) {
            k = ZVal.assign(zpairResult1582.getKey());
            v = ZVal.assign(zpairResult1582.getValue());
            string = toStringR(string, env) + toStringR(k, env) + "=" + toStringR(v, env) + "; ";
        }

        string = function_trim.f.env(env).call(string).value();
        env.callMethod(
                headers, "addTextHeader", Swift_Signers_DKIMSigner.class, "DKIM-Signature", string);
        tmp = env.callMethod(headers, "getAll", Swift_Signers_DKIMSigner.class, "DKIM-Signature");
        this.dkimHeader = function_end.f.env(env).call(tmp).value();
        this.addHeader(
                env,
                toStringR(
                                function_trim
                                        .f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        this.dkimHeader,
                                                        "toString",
                                                        Swift_Signers_DKIMSigner.class))
                                        .value(),
                                env)
                        + "\r\n b=",
                true);
        if (ZVal.isTrue(this.debugHeaders)) {
            env.callMethod(
                    headers,
                    "addTextHeader",
                    Swift_Signers_DKIMSigner.class,
                    "X-DebugHash",
                    NamespaceGlobal.base64_encode.env(env).call(this.headerHash).value());
        }

        env.callMethod(
                this.dkimHeader,
                "setValue",
                Swift_Signers_DKIMSigner.class,
                toStringR(string, env)
                        + " b="
                        + toStringR(
                                function_trim
                                        .f
                                        .env(env)
                                        .call(
                                                NamespaceGlobal.chunk_split
                                                        .env(env)
                                                        .call(
                                                                NamespaceGlobal.base64_encode
                                                                        .env(env)
                                                                        .call(
                                                                                this
                                                                                        .getEncryptedHash(
                                                                                                env))
                                                                        .value(),
                                                                73,
                                                                " ")
                                                        .value())
                                        .value(),
                                env));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "header")
    @ConvertedParameter(
        index = 1,
        name = "is_sig",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object addHeader(RuntimeEnv env, Object... args) {
        Object header = assignParameter(args, 0, false);
        Object is_sig = assignParameter(args, 1, true);
        if (null == is_sig) {
            is_sig = false;
        }
        ReferenceContainer exploded = new BasicReferenceContainer(null);
        Object name = null;
        Object value = null;
        switch (toStringR(this.headerCanon)) {
            case "relaxed":
                exploded.setObject(function_explode.f.env(env).call(":", header, 2).value());
                name =
                        NamespaceGlobal.strtolower
                                .env(env)
                                .call(
                                        function_trim
                                                .f
                                                .env(env)
                                                .call(exploded.arrayGet(env, 0))
                                                .value())
                                .value();
                value =
                        function_str_replace
                                .f
                                .env(env)
                                .call("\r\n", "", exploded.arrayGet(env, 1))
                                .value();
                value = function_preg_replace.f.env(env).call("/[ \t][ \t]+/", " ", value).value();
                header =
                        toStringR(name, env)
                                + ":"
                                + toStringR(function_trim.f.env(env).call(value).value(), env)
                                + toStringR(ZVal.isTrue(is_sig) ? "" : "\r\n", env);
            case "simple":
        }
        ;
        this.addToHeaderHash(env, header);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    protected Object canonicalizeBody(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        ReferenceContainer string = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object len = null;
        Object method = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object canon = null;
        len = function_strlen.f.env(env).call(string.getObject()).value();
        canon = "";
        method = ZVal.equalityCheck("relaxed", this.bodyCanon);
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', len);
                i.setObject(ZVal.increment(i.getObject()))) {
            if (ZVal.isGreaterThan(this.bodyCanonIgnoreStart, '>', 0)) {
                this.bodyCanonIgnoreStart = ZVal.decrement(this.bodyCanonIgnoreStart);
                continue;
            }

            SwitchEnumType103 switchVariable103 =
                    ZVal.getEnum(
                            string.arrayGet(env, i.getObject()),
                            SwitchEnumType103.DEFAULT_CASE,
                            SwitchEnumType103.RESERVED_CHARS_1144188661_STRING__,
                            "\r",
                            SwitchEnumType103.RESERVED_CHARS_404041011_STRING__,
                            "\n",
                            SwitchEnumType103.RESERVED_CHARS_988840958_STRING__,
                            " ",
                            SwitchEnumType103.RESERVED_CHARS_180895846_STRING__,
                            "\t");
            switch (switchVariable103) {
                case RESERVED_CHARS_1144188661_STRING__:
                    this.bodyCanonLastChar = "\r";
                    break;
                case RESERVED_CHARS_404041011_STRING__:
                    if (ZVal.equalityCheck("\r", this.bodyCanonLastChar)) {
                        if (ZVal.isTrue(method)) {
                            this.bodyCanonSpace = false;
                        }

                        if (ZVal.equalityCheck("", this.bodyCanonLine)) {
                            this.bodyCanonEmptyCounter = ZVal.increment(this.bodyCanonEmptyCounter);

                        } else {
                            this.bodyCanonLine = "";
                            canon = toStringR(canon, env) + "\r\n";
                        }

                    } else {

                    }

                    break;
                case RESERVED_CHARS_988840958_STRING__:
                case RESERVED_CHARS_180895846_STRING__:
                    if (ZVal.isTrue(method)) {
                        this.bodyCanonSpace = true;
                        break;
                    }

                case DEFAULT_CASE:
                    if (ZVal.isGreaterThan(this.bodyCanonEmptyCounter, '>', 0)) {
                        canon =
                                toStringR(canon, env)
                                        + toStringR(
                                                function_str_repeat
                                                        .f
                                                        .env(env)
                                                        .call("\r\n", this.bodyCanonEmptyCounter)
                                                        .value(),
                                                env);
                        this.bodyCanonEmptyCounter = 0;
                    }

                    if (ZVal.isTrue(this.bodyCanonSpace)) {
                        this.bodyCanonLine = toStringR(this.bodyCanonLine, env) + " ";
                        canon = toStringR(canon, env) + " ";
                        this.bodyCanonSpace = false;
                    }

                    this.bodyCanonLine =
                            toStringR(this.bodyCanonLine, env)
                                    + toStringR(string.arrayGet(env, i.getObject()), env);
                    canon =
                            toStringR(canon, env)
                                    + toStringR(string.arrayGet(env, i.getObject()), env);
            }
            ;
        }

        this.addToBodyHash(env, canon);
        return null;
    }

    @ConvertedMethod
    protected Object endOfBody(RuntimeEnv env, Object... args) {
        if (ZVal.isGreaterThan(
                function_strlen.f.env(env).call(this.bodyCanonLine).value(), '>', 0)) {
            this.addToBodyHash(env, "\r\n");
        }

        this.bodyHash =
                NamespaceGlobal.hash_final.env(env).call(this.bodyHashHandler, true).value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    private Object addToBodyHash(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        Object len = null;
        Object new_len = null;
        len = function_strlen.f.env(env).call(string).value();
        if (ZVal.isGreaterThan(len, '>', new_len = ZVal.subtract(this.maxLen, this.bodyLen))) {
            string = function_substr.f.env(env).call(string, 0, new_len).value();
            len = ZVal.assign(new_len);
        }

        NamespaceGlobal.hash_update.env(env).call(this.bodyHashHandler, string);
        this.bodyLen = ZAssignment.add("+=", this.bodyLen, len);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "header")
    private Object addToHeaderHash(RuntimeEnv env, Object... args) {
        Object header = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.debugHeaders)) {
            new ReferenceClassProperty(this, "debugHeadersData", env)
                    .arrayAppend(env)
                    .set(function_trim.f.env(env).call(header).value());
        }

        this.headerCanonData = toStringR(this.headerCanonData, env) + toStringR(header, env);
        return null;
    }

    @ConvertedMethod
    private Object getEncryptedHash(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer signature = new BasicReferenceContainer(null);
        Object pkeyId = null;
        Object algorithm = null;
        signature.setObject("");
        switch (toStringR(this.hashAlgorithm)) {
            case "rsa-sha1":
                algorithm = 1;
                break;
            case "rsa-sha256":
                algorithm = 7;
                break;
        }
        ;
        pkeyId =
                NamespaceGlobal.openssl_get_privatekey
                        .env(env)
                        .call(this.privateKey, this.passphrase)
                        .value();
        if (!ZVal.isTrue(pkeyId)) {
            throw ZVal.getException(
                    env,
                    new Swift_SwiftException(
                            env,
                            "Unable to load DKIM Private Key ["
                                    + toStringR(
                                            NamespaceGlobal.openssl_error_string
                                                    .env(env)
                                                    .call()
                                                    .value(),
                                            env)
                                    + "]"));
        }

        if (NamespaceGlobal.openssl_sign
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(1, signature))
                .call(this.headerCanonData, signature.getObject(), pkeyId, algorithm)
                .getBool()) {
            return ZVal.assign(signature.getObject());
        }

        throw ZVal.getException(
                env,
                new Swift_SwiftException(
                        env,
                        "Unable to sign DKIM Hash ["
                                + toStringR(
                                        NamespaceGlobal.openssl_error_string
                                                .env(env)
                                                .call()
                                                .value(),
                                        env)
                                + "]"));
    }

    public static final Object CONST_class = "Swift_Signers_DKIMSigner";

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
                    .setName("Swift_Signers_DKIMSigner")
                    .setLookup(
                            Swift_Signers_DKIMSigner.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bodyCanon",
                            "bodyCanonEmptyCounter",
                            "bodyCanonIgnoreStart",
                            "bodyCanonLastChar",
                            "bodyCanonLine",
                            "bodyCanonSpace",
                            "bodyHash",
                            "bodyHashHandler",
                            "bodyLen",
                            "bound",
                            "debugHeaders",
                            "debugHeadersData",
                            "dkimHeader",
                            "domainName",
                            "hashAlgorithm",
                            "headerCanon",
                            "headerCanonData",
                            "headerHash",
                            "ignoredHeaders",
                            "maxLen",
                            "passphrase",
                            "privateKey",
                            "selector",
                            "showLen",
                            "signatureExpiration",
                            "signatureTimestamp",
                            "signedHeaders",
                            "signerIdentity")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Signers/DKIMSigner.php")
                    .addInterface("Swift_Signers_HeaderSigner")
                    .addInterface("Swift_Signer")
                    .addInterface("Swift_InputByteStream")
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

    private enum SwitchEnumType102 {
        STRING_rsa_sha1,
        STRING_rsa_sha256,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType103 {
        RESERVED_CHARS_1144188661_STRING__,
        RESERVED_CHARS_404041011_STRING__,
        RESERVED_CHARS_988840958_STRING__,
        RESERVED_CHARS_180895846_STRING__,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
