package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_Headers_OpenDKIMHeader;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.classes.Swift_SwiftException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.classes.Swift_Signers_DKIMSigner;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_extension_loaded;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Signers/OpenDKIMSigner.php

*/

public class Swift_Signers_OpenDKIMSigner extends Swift_Signers_DKIMSigner {

    public Object peclLoaded = false;

    public Object dkimHandler = ZVal.getNull();

    public Object dropFirstLF = true;

    public Swift_Signers_OpenDKIMSigner(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Signers_OpenDKIMSigner.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Signers_OpenDKIMSigner(NoConstructor n) {
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
        if (!function_extension_loaded.f.env(env).call("opendkim").getBool()) {
            throw ZVal.getException(
                    env, new Swift_SwiftException(env, "php-opendkim extension not found"));
        }

        this.peclLoaded = true;
        super.__construct(env, privateKey, domainName, selector);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headers", typeHint = "Swift_Mime_SimpleHeaderSet")
    public Object addSignature(RuntimeEnv env, Object... args) {
        Object headers = assignParameter(args, 0, false);
        Object header = null;
        Object headerVal = null;
        header = new Swift_Mime_Headers_OpenDKIMHeader(env, "DKIM-Signature");
        headerVal =
                env.callMethod(
                        this.dkimHandler, "getSignatureHeader", Swift_Signers_OpenDKIMSigner.class);
        if (ZVal.toBool(ZVal.strictEqualityCheck(false, "===", headerVal))
                || ZVal.toBool(function_is_int.f.env(env).call(headerVal).value())) {
            throw ZVal.getException(
                    env,
                    new Swift_SwiftException(
                            env,
                            "OpenDKIM Error: "
                                    + toStringR(
                                            env.callMethod(
                                                    this.dkimHandler,
                                                    "getError",
                                                    Swift_Signers_OpenDKIMSigner.class),
                                            env)));
        }

        env.callMethod(header, "setValue", Swift_Signers_OpenDKIMSigner.class, headerVal);
        env.callMethod(headers, "set", Swift_Signers_OpenDKIMSigner.class, header);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headers", typeHint = "Swift_Mime_SimpleHeaderSet")
    public Object setHeaders(RuntimeEnv env, Object... args) {
        Object headers = assignParameter(args, 0, false);
        Object bodyCanon = null;
        Object headerCanon = null;
        Object tmp = null;
        Object listHeaders = null;
        Object header = null;
        Object htosign = null;
        Object hName = null;
        Object hash = null;
        hash =
                ZVal.assign(
                        ZVal.equalityCheck(
                                        "rsa-sha1",
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("hashAlgorithm")
                                                .value())
                                ? ClassConstantUtils.getConstantValueByClass(
                                        env,
                                        ZVal.resolveClassAlias(env, "OpenDKIMSign"),
                                        "ALG_RSASHA1")
                                : ClassConstantUtils.getConstantValueByClass(
                                        env,
                                        ZVal.resolveClassAlias(env, "OpenDKIMSign"),
                                        "ALG_RSASHA256"));
        bodyCanon =
                ZVal.assign(
                        ZVal.equalityCheck(
                                        "simple",
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("bodyCanon")
                                                .value())
                                ? ClassConstantUtils.getConstantValueByClass(
                                        env,
                                        ZVal.resolveClassAlias(env, "OpenDKIMSign"),
                                        "CANON_SIMPLE")
                                : ClassConstantUtils.getConstantValueByClass(
                                        env,
                                        ZVal.resolveClassAlias(env, "OpenDKIMSign"),
                                        "CANON_RELAXED"));
        headerCanon =
                ZVal.assign(
                        ZVal.equalityCheck(
                                        "simple",
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("headerCanon")
                                                .value())
                                ? ClassConstantUtils.getConstantValueByClass(
                                        env,
                                        ZVal.resolveClassAlias(env, "OpenDKIMSign"),
                                        "CANON_SIMPLE")
                                : ClassConstantUtils.getConstantValueByClass(
                                        env,
                                        ZVal.resolveClassAlias(env, "OpenDKIMSign"),
                                        "CANON_RELAXED"));
        this.dkimHandler =
                env.createNew(
                        ZVal.resolveClassAlias(env, "OpenDKIMSign"),
                        toObjectR(this).accessProp(this, env).name("privateKey").value(),
                        toObjectR(this).accessProp(this, env).name("selector").value(),
                        toObjectR(this).accessProp(this, env).name("domainName").value(),
                        headerCanon,
                        bodyCanon,
                        hash,
                        -1);
        env.callMethod(this.dkimHandler, "setMargin", Swift_Signers_OpenDKIMSigner.class, 78);
        if (!function_is_numeric
                .f
                .env(env)
                .call(toObjectR(this).accessProp(this, env).name("signatureTimestamp").value())
                .getBool()) {
            StaticMethodUtils.getStaticBaseClass(ZVal.resolveClassAlias(env, "OpenDKIM"), env)
                    .callUnknownStaticMethod(
                            env,
                            "setOption",
                            new RuntimeArgsWithReferences(),
                            ClassConstantUtils.getConstantValueByClass(
                                    env, ZVal.resolveClassAlias(env, "OpenDKIM"), "OPTS_FIXEDTIME"),
                            NamespaceGlobal.time.env(env).call().value());

        } else {
            if (!ZVal.isTrue(
                    StaticMethodUtils.getStaticBaseClass(
                                    ZVal.resolveClassAlias(env, "OpenDKIM"), env)
                            .callUnknownStaticMethod(
                                    env,
                                    "setOption",
                                    new RuntimeArgsWithReferences(),
                                    ClassConstantUtils.getConstantValueByClass(
                                            env,
                                            ZVal.resolveClassAlias(env, "OpenDKIM"),
                                            "OPTS_FIXEDTIME"),
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("signatureTimestamp")
                                            .value()))) {
                throw ZVal.getException(
                        env,
                        new Swift_SwiftException(
                                env,
                                "Unable to force signature timestamp ["
                                        + toStringR(
                                                NamespaceGlobal.openssl_error_string
                                                        .env(env)
                                                        .call()
                                                        .value(),
                                                env)
                                        + "]"));
            }
        }

        if (ZVal.isset(toObjectR(this).accessProp(this, env).name("signerIdentity").value())) {
            env.callMethod(
                    this.dkimHandler,
                    "setSigner",
                    Swift_Signers_OpenDKIMSigner.class,
                    toObjectR(this).accessProp(this, env).name("signerIdentity").value());
        }

        listHeaders = env.callMethod(headers, "listAll", Swift_Signers_OpenDKIMSigner.class);
        for (ZPair zpairResult1588 : ZVal.getIterable(listHeaders, env, true)) {
            hName = ZVal.assign(zpairResult1588.getValue());
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "ignoredHeaders", env),
                    env,
                    NamespaceGlobal.strtolower.env(env).call(hName).value())) {
                tmp = env.callMethod(headers, "getAll", Swift_Signers_OpenDKIMSigner.class, hName);
                if (ZVal.isTrue(
                        env.callMethod(
                                headers, "has", Swift_Signers_OpenDKIMSigner.class, hName))) {
                    for (ZPair zpairResult1589 : ZVal.getIterable(tmp, env, true)) {
                        header = ZVal.assign(zpairResult1589.getValue());
                        if (ZVal.notEqualityCheck(
                                "",
                                env.callMethod(
                                        header,
                                        "getFieldBody",
                                        Swift_Signers_OpenDKIMSigner.class))) {
                            htosign =
                                    env.callMethod(
                                            header, "toString", Swift_Signers_OpenDKIMSigner.class);
                            env.callMethod(
                                    this.dkimHandler,
                                    "header",
                                    Swift_Signers_OpenDKIMSigner.class,
                                    htosign);
                            new ReferenceClassProperty(this, "signedHeaders", env)
                                    .arrayAppend(env)
                                    .set(
                                            env.callMethod(
                                                    header,
                                                    "getFieldName",
                                                    Swift_Signers_OpenDKIMSigner.class));
                        }
                    }
                }
            }
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object startBody(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.peclLoaded)) {
            return ZVal.assign(super.startBody(env));
        }

        this.dropFirstLF = true;
        env.callMethod(this.dkimHandler, "eoh", Swift_Signers_OpenDKIMSigner.class);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object endBody(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.peclLoaded)) {
            return ZVal.assign(super.endBody(env));
        }

        env.callMethod(this.dkimHandler, "eom", Swift_Signers_OpenDKIMSigner.class);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        this.dkimHandler = ZVal.getNull();
        super.reset(env);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "time")
    public Object setSignatureTimestamp(RuntimeEnv env, Object... args) {
        Object time = assignParameter(args, 0, false);
        toObjectR(this).accessProp(this, env).name("signatureTimestamp").set(time);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "time")
    public Object setSignatureExpiration(RuntimeEnv env, Object... args) {
        Object time = assignParameter(args, 0, false);
        toObjectR(this).accessProp(this, env).name("signatureExpiration").set(time);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "debug")
    public Object setDebugHeaders(RuntimeEnv env, Object... args) {
        Object debug = assignParameter(args, 0, false);
        toObjectR(this).accessProp(this, env).name("debugHeaders").set(ZVal.toBool(debug));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    protected Object canonicalizeBody(RuntimeEnv env, Object... args) {
        ReferenceContainer string = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (!ZVal.isTrue(this.peclLoaded)) {
            return ZVal.assign(super.canonicalizeBody(env, string.getObject()));
        }

        if (ZVal.strictEqualityCheck(true, "===", this.dropFirstLF)) {
            if (ZVal.toBool(ZVal.equalityCheck("\r", string.arrayGet(env, 0)))
                    && ZVal.toBool(ZVal.equalityCheck("\n", string.arrayGet(env, 1)))) {
                string.setObject(function_substr.f.env(env).call(string.getObject(), 2).value());
            }
        }

        this.dropFirstLF = false;
        if (function_strlen.f.env(env).call(string.getObject()).getBool()) {
            env.callMethod(
                    this.dkimHandler,
                    "body",
                    Swift_Signers_OpenDKIMSigner.class,
                    string.getObject());
        }

        return null;
    }

    public static final Object CONST_CANON_RELAXED = 1;

    public static final Object CONST_CANON_SIMPLE = 2;

    public static final Object CONST_SIG_RSA_SHA1 = 3;

    public static final Object CONST_SIG_RSA_SHA256 = 4;

    public static final Object CONST_class = "Swift_Signers_OpenDKIMSigner";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends Swift_Signers_DKIMSigner.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Signers_OpenDKIMSigner")
                    .setLookup(
                            Swift_Signers_OpenDKIMSigner.class,
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
                            "dkimHandler",
                            "dkimHeader",
                            "domainName",
                            "dropFirstLF",
                            "hashAlgorithm",
                            "headerCanon",
                            "headerCanonData",
                            "headerHash",
                            "ignoredHeaders",
                            "maxLen",
                            "passphrase",
                            "peclLoaded",
                            "privateKey",
                            "selector",
                            "showLen",
                            "signatureExpiration",
                            "signatureTimestamp",
                            "signedHeaders",
                            "signerIdentity")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Signers/OpenDKIMSigner.php")
                    .addInterface("Swift_Signers_HeaderSigner")
                    .addInterface("Swift_Signer")
                    .addInterface("Swift_InputByteStream")
                    .addExtendsClass("Swift_Signers_DKIMSigner")
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
