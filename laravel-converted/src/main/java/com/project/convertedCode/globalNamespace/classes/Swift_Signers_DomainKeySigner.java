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
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.classes.Swift_SwiftException;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.classes.Swift_Signers_HeaderSigner;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Signers/DomainKeySigner.php

*/

public class Swift_Signers_DomainKeySigner extends RuntimeClassBase
        implements Swift_Signers_HeaderSigner {

    public Object privateKey = null;

    public Object domainName = null;

    public Object selector = null;

    public Object hashAlgorithm = "rsa-sha1";

    public Object canon = "simple";

    public Object ignoredHeaders = ZVal.newArray();

    public Object signerIdentity = null;

    public Object debugHeaders = false;

    public Object signedHeaders = ZVal.newArray();

    public Object domainKeyHeader = null;

    public Object hashHandler = null;

    public Object canonData = "";

    public Object bodyCanonEmptyCounter = 0;

    public Object bodyCanonIgnoreStart = 2;

    public Object bodyCanonSpace = false;

    public Object bodyCanonLastChar = ZVal.getNull();

    public Object bodyCanonLine = "";

    public Object bound = ZVal.newArray();

    public Swift_Signers_DomainKeySigner(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Signers_DomainKeySigner.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Signers_DomainKeySigner(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "privateKey")
    @ConvertedParameter(index = 1, name = "domainName")
    @ConvertedParameter(index = 2, name = "selector")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object privateKey = assignParameter(args, 0, false);
        Object domainName = assignParameter(args, 1, false);
        Object selector = assignParameter(args, 2, false);
        this.privateKey = privateKey;
        this.domainName = domainName;
        this.signerIdentity = "@" + toStringR(domainName, env);
        this.selector = selector;
        return null;
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        this.hashHandler = ZVal.getNull();
        this.bodyCanonIgnoreStart = 2;
        this.bodyCanonEmptyCounter = 0;
        this.bodyCanonLastChar = ZVal.getNull();
        this.bodyCanonSpace = false;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bytes")
    public Object write(RuntimeEnv env, Object... args) {
        Object bytes = assignParameter(args, 0, false);
        Object is = null;
        this.canonicalizeBody(env, bytes);
        for (ZPair zpairResult1583 : ZVal.getIterable(this.bound, env, true)) {
            is = ZVal.assign(zpairResult1583.getValue());
            env.callMethod(is, "write", Swift_Signers_DomainKeySigner.class, bytes);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object commit(RuntimeEnv env, Object... args) {
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "is", typeHint = "Swift_InputByteStream")
    public Object bind(RuntimeEnv env, Object... args) {
        Object is = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "bound", env).arrayAppend(env).set(is);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "is", typeHint = "Swift_InputByteStream")
    public Object unbind(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object is = assignParameter(args, 0, false);
        Object stream = null;
        Object k = null;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1584 : ZVal.getIterable(this.bound, env, false)) {
            k = ZVal.assign(zpairResult1584.getKey());
            stream = ZVal.assign(zpairResult1584.getValue());
            if (ZVal.strictEqualityCheck(stream, "===", is)) {
                arrayActionR(
                        ArrayAction.UNSET, new ReferenceClassProperty(this, "bound", env), env, k);
                break;
            }
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object flushBuffers(RuntimeEnv env, Object... args) {
        this.reset(env);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "hash")
    public Object setHashAlgorithm(RuntimeEnv env, Object... args) {
        Object hash = assignParameter(args, 0, false);
        this.hashAlgorithm = "rsa-sha1";
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "canon")
    public Object setCanon(RuntimeEnv env, Object... args) {
        Object canon = assignParameter(args, 0, false);
        if (ZVal.equalityCheck("nofws", canon)) {
            this.canon = "nofws";

        } else {
            this.canon = "simple";
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
    @ConvertedParameter(index = 0, name = "debug")
    public Object setDebugHeaders(RuntimeEnv env, Object... args) {
        Object debug = assignParameter(args, 0, false);
        this.debugHeaders = ZVal.toBool(debug);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object startBody(RuntimeEnv env, Object... args) {
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
            return ZVal.assign(ZVal.arrayFromList("DomainKey-Signature", "X-DebugHash"));
        }

        return ZVal.assign(ZVal.arrayFromList("DomainKey-Signature"));
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
        this.startHash(env);
        this.canonData = "";
        listHeaders = env.callMethod(headers, "listAll", Swift_Signers_DomainKeySigner.class);
        for (ZPair zpairResult1585 : ZVal.getIterable(listHeaders, env, true)) {
            hName = ZVal.assign(zpairResult1585.getValue());
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "ignoredHeaders", env),
                    env,
                    NamespaceGlobal.strtolower.env(env).call(hName).value())) {
                if (ZVal.isTrue(
                        env.callMethod(
                                headers, "has", Swift_Signers_DomainKeySigner.class, hName))) {
                    tmp =
                            env.callMethod(
                                    headers, "getAll", Swift_Signers_DomainKeySigner.class, hName);
                    for (ZPair zpairResult1586 : ZVal.getIterable(tmp, env, true)) {
                        header = ZVal.assign(zpairResult1586.getValue());
                        if (ZVal.notEqualityCheck(
                                "",
                                env.callMethod(
                                        header,
                                        "getFieldBody",
                                        Swift_Signers_DomainKeySigner.class))) {
                            this.addHeader(
                                    env,
                                    env.callMethod(
                                            header,
                                            "toString",
                                            Swift_Signers_DomainKeySigner.class));
                            new ReferenceClassProperty(this, "signedHeaders", env)
                                    .arrayAppend(env)
                                    .set(
                                            env.callMethod(
                                                    header,
                                                    "getFieldName",
                                                    Swift_Signers_DomainKeySigner.class));
                        }
                    }
                }
            }
        }

        this.endOfHeaders(env);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headers", typeHint = "Swift_Mime_SimpleHeaderSet")
    public Object addSignature(RuntimeEnv env, Object... args) {
        Object headers = assignParameter(args, 0, false);
        Object string = null;
        Object v = null;
        Object k = null;
        Object params = null;
        params =
                ZVal.newArray(
                        new ZPair("a", this.hashAlgorithm),
                        new ZPair(
                                "b",
                                NamespaceGlobal.chunk_split
                                        .env(env)
                                        .call(
                                                NamespaceGlobal.base64_encode
                                                        .env(env)
                                                        .call(this.getEncryptedHash(env))
                                                        .value(),
                                                73,
                                                " ")
                                        .value()),
                        new ZPair("c", this.canon),
                        new ZPair("d", this.domainName),
                        new ZPair(
                                "h",
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(": ", this.signedHeaders)
                                        .value()),
                        new ZPair("q", "dns"),
                        new ZPair("s", this.selector));
        string = "";
        for (ZPair zpairResult1587 : ZVal.getIterable(params, env, false)) {
            k = ZVal.assign(zpairResult1587.getKey());
            v = ZVal.assign(zpairResult1587.getValue());
            string = toStringR(string, env) + toStringR(k, env) + "=" + toStringR(v, env) + "; ";
        }

        string = function_trim.f.env(env).call(string).value();
        env.callMethod(
                headers,
                "addTextHeader",
                Swift_Signers_DomainKeySigner.class,
                "DomainKey-Signature",
                string);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "header")
    protected Object addHeader(RuntimeEnv env, Object... args) {
        Object header = assignParameter(args, 0, false);
        ReferenceContainer exploded = new BasicReferenceContainer(null);
        Object name = null;
        Object value = null;
        switch (toStringR(this.canon)) {
            case "nofws":
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
                                + "\r\n";
            case "simple":
        }
        ;
        this.addToHash(env, header);
        return null;
    }

    @ConvertedMethod
    protected Object endOfHeaders(RuntimeEnv env, Object... args) {
        this.bodyCanonEmptyCounter = 1;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    protected Object canonicalizeBody(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        ReferenceContainer string = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object nofws = null;
        Object len = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object canon = null;
        len = function_strlen.f.env(env).call(string.getObject()).value();
        canon = "";
        nofws = ZVal.equalityCheck("nofws", this.canon);
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', len);
                i.setObject(ZVal.increment(i.getObject()))) {
            if (ZVal.isGreaterThan(this.bodyCanonIgnoreStart, '>', 0)) {
                this.bodyCanonIgnoreStart = ZVal.decrement(this.bodyCanonIgnoreStart);
                continue;
            }

            SwitchEnumType104 switchVariable104 =
                    ZVal.getEnum(
                            string.arrayGet(env, i.getObject()),
                            SwitchEnumType104.DEFAULT_CASE,
                            SwitchEnumType104.RESERVED_CHARS_1436303191_STRING__,
                            "\r",
                            SwitchEnumType104.RESERVED_CHARS_544631143_STRING__,
                            "\n",
                            SwitchEnumType104.RESERVED_CHARS_414723735_STRING__,
                            " ",
                            SwitchEnumType104.RESERVED_CHARS_468701227_STRING__,
                            "\t",
                            SwitchEnumType104.RESERVED_CHARS_1504458230_STRING__,
                            "\t");
            switch (switchVariable104) {
                case RESERVED_CHARS_1436303191_STRING__:
                    this.bodyCanonLastChar = "\r";
                    break;
                case RESERVED_CHARS_544631143_STRING__:
                    if (ZVal.equalityCheck("\r", this.bodyCanonLastChar)) {
                        if (ZVal.isTrue(nofws)) {
                            this.bodyCanonSpace = false;
                        }

                        if (ZVal.equalityCheck("", this.bodyCanonLine)) {
                            this.bodyCanonEmptyCounter = ZVal.increment(this.bodyCanonEmptyCounter);

                        } else {
                            this.bodyCanonLine = "";
                            canon = toStringR(canon, env) + "\r\n";
                        }

                    } else {
                        throw ZVal.getException(
                                env,
                                new Swift_SwiftException(
                                        env,
                                        "Invalid new line sequence in mail found \\n without preceding \\r"));
                    }

                    break;
                case RESERVED_CHARS_414723735_STRING__:
                case RESERVED_CHARS_468701227_STRING__:
                case RESERVED_CHARS_1504458230_STRING__:
                    if (ZVal.isTrue(nofws)) {
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

                    this.bodyCanonLine =
                            toStringR(this.bodyCanonLine, env)
                                    + toStringR(string.arrayGet(env, i.getObject()), env);
                    canon =
                            toStringR(canon, env)
                                    + toStringR(string.arrayGet(env, i.getObject()), env);
            }
            ;
        }

        this.addToHash(env, canon);
        return null;
    }

    @ConvertedMethod
    protected Object endOfBody(RuntimeEnv env, Object... args) {
        if (ZVal.isGreaterThan(
                function_strlen.f.env(env).call(this.bodyCanonLine).value(), '>', 0)) {
            this.addToHash(env, "\r\n");
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    private Object addToHash(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        this.canonData = toStringR(this.canonData, env) + toStringR(string, env);
        NamespaceGlobal.hash_update.env(env).call(this.hashHandler, string);
        return null;
    }

    @ConvertedMethod
    private Object startHash(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        switch (toStringR(this.hashAlgorithm)) {
            case "rsa-sha1":
                this.hashHandler = NamespaceGlobal.hash_init.env(env).call("sha1").value();
                break;
        }
        ;
        this.bodyCanonLine = "";
        return null;
    }

    @ConvertedMethod
    private Object getEncryptedHash(RuntimeEnv env, Object... args) {
        ReferenceContainer signature = new BasicReferenceContainer(null);
        Object pkeyId = null;
        signature.setObject("");
        pkeyId = NamespaceGlobal.openssl_get_privatekey.env(env).call(this.privateKey).value();
        if (!ZVal.isTrue(pkeyId)) {
            throw ZVal.getException(
                    env,
                    new Swift_SwiftException(
                            env,
                            "Unable to load DomainKey Private Key ["
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
                .call(this.canonData, signature.getObject(), pkeyId, 1)
                .getBool()) {
            return ZVal.assign(signature.getObject());
        }

        throw ZVal.getException(
                env,
                new Swift_SwiftException(
                        env,
                        "Unable to sign DomainKey Hash  ["
                                + toStringR(
                                        NamespaceGlobal.openssl_error_string
                                                .env(env)
                                                .call()
                                                .value(),
                                        env)
                                + "]"));
    }

    public static final Object CONST_class = "Swift_Signers_DomainKeySigner";

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
                    .setName("Swift_Signers_DomainKeySigner")
                    .setLookup(
                            Swift_Signers_DomainKeySigner.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bodyCanonEmptyCounter",
                            "bodyCanonIgnoreStart",
                            "bodyCanonLastChar",
                            "bodyCanonLine",
                            "bodyCanonSpace",
                            "bound",
                            "canon",
                            "canonData",
                            "debugHeaders",
                            "domainKeyHeader",
                            "domainName",
                            "hashAlgorithm",
                            "hashHandler",
                            "ignoredHeaders",
                            "privateKey",
                            "selector",
                            "signedHeaders",
                            "signerIdentity")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Signers/DomainKeySigner.php")
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

    private enum SwitchEnumType104 {
        RESERVED_CHARS_1436303191_STRING__,
        RESERVED_CHARS_544631143_STRING__,
        RESERVED_CHARS_414723735_STRING__,
        RESERVED_CHARS_468701227_STRING__,
        RESERVED_CHARS_1504458230_STRING__,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
