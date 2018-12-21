package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_DependencyContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_SimpleMessage;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.classes.Swift_MimePart;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.classes.Swift_Signers_HeaderSigner;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.classes.Swift_Signers_BodySigner;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Message.php

*/

public class Swift_Message extends Swift_Mime_SimpleMessage {

    public Object headerSigners = ZVal.newArray();

    public Object bodySigners = ZVal.newArray();

    public Object savedMessage = ZVal.newArray();

    public Swift_Message(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Message.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Message(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "subject",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "body",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "contentType",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "charset",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object subject = assignParameter(args, 0, true);
        if (null == subject) {
            subject = ZVal.getNull();
        }
        Object body = assignParameter(args, 1, true);
        if (null == body) {
            body = ZVal.getNull();
        }
        Object contentType = assignParameter(args, 2, true);
        if (null == contentType) {
            contentType = ZVal.getNull();
        }
        Object charset = assignParameter(args, 3, true);
        if (null == charset) {
            charset = ZVal.getNull();
        }
        function_call_user_func_array
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                .call(
                        ZVal.newArray(
                                new ZPair(0, this),
                                new ZPair(1, "Swift_Mime_SimpleMessage::__construct")),
                        env.callMethod(
                                Swift_DependencyContainer.runtimeStaticObject.getInstance(env),
                                "createDependenciesFor",
                                Swift_Message.class,
                                "mime.message"));
        if (!ZVal.isset(charset)) {
            charset =
                    env.callMethod(
                            Swift_DependencyContainer.runtimeStaticObject.getInstance(env),
                            "lookup",
                            Swift_Message.class,
                            "properties.charset");
        }

        env.callMethod(this, "setSubject", Swift_Message.class, subject);
        env.callMethod(this, "setBody", Swift_Message.class, body);
        env.callMethod(this, "setCharset", Swift_Message.class, charset);
        if (ZVal.isTrue(contentType)) {
            env.callMethod(this, "setContentType", Swift_Message.class, contentType);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "body")
    @ConvertedParameter(
        index = 1,
        name = "contentType",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "charset",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object addPart(RuntimeEnv env, Object... args) {
        Object body = assignParameter(args, 0, false);
        Object contentType = assignParameter(args, 1, true);
        if (null == contentType) {
            contentType = ZVal.getNull();
        }
        Object charset = assignParameter(args, 2, true);
        if (null == charset) {
            charset = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        this,
                        "attach",
                        Swift_Message.class,
                        env.callMethod(
                                new Swift_MimePart(env, body, contentType, charset),
                                "setEncoder",
                                Swift_Message.class,
                                env.callMethod(this, "getEncoder", Swift_Message.class))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "signer", typeHint = "Swift_Signer")
    public Object attachSigner(RuntimeEnv env, Object... args) {
        Object signer = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        signer, Swift_Signers_HeaderSigner.class, "Swift_Signers_HeaderSigner"))) {
            new ReferenceClassProperty(this, "headerSigners", env).arrayAppend(env).set(signer);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        signer, Swift_Signers_BodySigner.class, "Swift_Signers_BodySigner"))) {
            new ReferenceClassProperty(this, "bodySigners", env).arrayAppend(env).set(signer);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "signer", typeHint = "Swift_Signer")
    public Object detachSigner(RuntimeEnv env, Object... args) {
        Object signer = assignParameter(args, 0, false);
        Object bodySigner = null;
        Object k = null;
        Object headerSigner = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        signer, Swift_Signers_HeaderSigner.class, "Swift_Signers_HeaderSigner"))) {
            for (ZPair zpairResult1514 : ZVal.getIterable(this.headerSigners, env, false)) {
                k = ZVal.assign(zpairResult1514.getKey());
                headerSigner = ZVal.assign(zpairResult1514.getValue());
                if (ZVal.strictEqualityCheck(headerSigner, "===", signer)) {
                    arrayActionR(
                            ArrayAction.UNSET,
                            new ReferenceClassProperty(this, "headerSigners", env),
                            env,
                            k);
                    return ZVal.assign(this);
                }
            }

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        signer, Swift_Signers_BodySigner.class, "Swift_Signers_BodySigner"))) {
            for (ZPair zpairResult1515 : ZVal.getIterable(this.bodySigners, env, false)) {
                k = ZVal.assign(zpairResult1515.getKey());
                bodySigner = ZVal.assign(zpairResult1515.getValue());
                if (ZVal.strictEqualityCheck(bodySigner, "===", signer)) {
                    arrayActionR(
                            ArrayAction.UNSET,
                            new ReferenceClassProperty(this, "bodySigners", env),
                            env,
                            k);
                    return ZVal.assign(this);
                }
            }
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object clearSigners(RuntimeEnv env, Object... args) {
        this.headerSigners = ZVal.newArray();
        this.bodySigners = ZVal.newArray();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        Object string = null;
        if (ZVal.toBool(ZVal.isEmpty(this.headerSigners))
                && ZVal.toBool(ZVal.isEmpty(this.bodySigners))) {
            return ZVal.assign(super.toString(env));
        }

        this.saveMessage(env);
        this.doSign(env);
        string = super.toString(env);
        this.restoreMessage(env);
        return ZVal.assign(string);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "is", typeHint = "Swift_InputByteStream")
    public Object toByteStream(RuntimeEnv env, Object... args) {
        Object is = assignParameter(args, 0, false);
        if (ZVal.toBool(ZVal.isEmpty(this.headerSigners))
                && ZVal.toBool(ZVal.isEmpty(this.bodySigners))) {
            super.toByteStream(env, is);
            return null;
        }

        this.saveMessage(env);
        this.doSign(env);
        super.toByteStream(env, is);
        this.restoreMessage(env);
        return null;
    }

    @ConvertedMethod
    public Object __wakeup(RuntimeEnv env, Object... args) {
        env.callMethod(
                Swift_DependencyContainer.runtimeStaticObject.getInstance(env),
                "createDependenciesFor",
                Swift_Message.class,
                "mime.message");
        return null;
    }

    @ConvertedMethod
    protected Object doSign(RuntimeEnv env, Object... args) {
        Object altered = null;
        Object signer = null;
        for (ZPair zpairResult1516 : ZVal.getIterable(this.bodySigners, env, true)) {
            signer = ZVal.assign(zpairResult1516.getValue());
            altered = env.callMethod(signer, "getAlteredHeaders", Swift_Message.class);
            this.saveHeaders(env, altered);
            env.callMethod(signer, "signMessage", Swift_Message.class, this);
        }

        for (ZPair zpairResult1517 : ZVal.getIterable(this.headerSigners, env, true)) {
            signer = ZVal.assign(zpairResult1517.getValue());
            altered = env.callMethod(signer, "getAlteredHeaders", Swift_Message.class);
            this.saveHeaders(env, altered);
            env.callMethod(signer, "reset", Swift_Message.class);
            env.callMethod(
                    signer,
                    "setHeaders",
                    Swift_Message.class,
                    env.callMethod(this, "getHeaders", Swift_Message.class));
            env.callMethod(signer, "startBody", Swift_Message.class);
            env.callMethod(this, "bodyToByteStream", Swift_Message.class, signer);
            env.callMethod(signer, "endBody", Swift_Message.class);
            env.callMethod(
                    signer,
                    "addSignature",
                    Swift_Message.class,
                    env.callMethod(this, "getHeaders", Swift_Message.class));
        }

        return null;
    }

    @ConvertedMethod
    protected Object saveMessage(RuntimeEnv env, Object... args) {
        this.savedMessage = ZVal.newArray(new ZPair("headers", ZVal.newArray()));
        new ReferenceClassProperty(this, "savedMessage", env)
                .arrayAccess(env, "body")
                .set(env.callMethod(this, "getBody", Swift_Message.class));
        new ReferenceClassProperty(this, "savedMessage", env)
                .arrayAccess(env, "children")
                .set(env.callMethod(this, "getChildren", Swift_Message.class));
        if (ZVal.toBool(
                        ZVal.isGreaterThan(
                                function_count
                                        .f
                                        .env(env)
                                        .call(
                                                new ReferenceClassProperty(
                                                                this, "savedMessage", env)
                                                        .arrayGet(env, "children"))
                                        .value(),
                                '>',
                                0))
                && ZVal.toBool(
                        ZVal.notEqualityCheck(
                                "", env.callMethod(this, "getBody", Swift_Message.class)))) {
            env.callMethod(
                    this,
                    "setChildren",
                    Swift_Message.class,
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    ZVal.newArray(
                                            new ZPair(
                                                    0,
                                                    env.callMethod(
                                                            this,
                                                            "becomeMimePart",
                                                            Swift_Message.class))),
                                    new ReferenceClassProperty(this, "savedMessage", env)
                                            .arrayGet(env, "children"))
                            .value());
            env.callMethod(this, "setBody", Swift_Message.class, "");
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "altered", typeHint = "array")
    protected Object saveHeaders(RuntimeEnv env, Object... args) {
        Object altered = assignParameter(args, 0, false);
        Object head = null;
        Object lc = null;
        for (ZPair zpairResult1518 : ZVal.getIterable(altered, env, true)) {
            head = ZVal.assign(zpairResult1518.getValue());
            lc = NamespaceGlobal.strtolower.env(env).call(head).value();
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "savedMessage", env),
                    env,
                    "headers",
                    lc)) {
                new ReferenceClassProperty(this, "savedMessage", env)
                        .arrayAccess(env, "headers", lc)
                        .set(
                                env.callMethod(
                                        env.callMethod(this, "getHeaders", Swift_Message.class),
                                        "getAll",
                                        Swift_Message.class,
                                        head));
            }
        }

        return null;
    }

    @ConvertedMethod
    protected Object restoreHeaders(RuntimeEnv env, Object... args) {
        ReferenceContainer savedValue = new BasicReferenceContainer(null);
        Object headers = null;
        Object name = null;
        Object value = null;
        Object key = null;
        for (ZPair zpairResult1519 :
                ZVal.getIterable(
                        new ReferenceClassProperty(this, "savedMessage", env)
                                .arrayGet(env, "headers"),
                        env,
                        false)) {
            name = ZVal.assign(zpairResult1519.getKey());
            savedValue.setObject(ZVal.assign(zpairResult1519.getValue()));
            headers =
                    env.callMethod(
                            env.callMethod(this, "getHeaders", Swift_Message.class),
                            "getAll",
                            Swift_Message.class,
                            name);
            for (ZPair zpairResult1520 : ZVal.getIterable(headers, env, false)) {
                key = ZVal.assign(zpairResult1520.getKey());
                value = ZVal.assign(zpairResult1520.getValue());
                if (!arrayActionR(ArrayAction.ISSET, savedValue, env, key)) {
                    env.callMethod(
                            env.callMethod(this, "getHeaders", Swift_Message.class),
                            "remove",
                            Swift_Message.class,
                            name,
                            key);
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    protected Object restoreMessage(RuntimeEnv env, Object... args) {
        env.callMethod(
                this,
                "setBody",
                Swift_Message.class,
                new ReferenceClassProperty(this, "savedMessage", env).arrayGet(env, "body"));
        env.callMethod(
                this,
                "setChildren",
                Swift_Message.class,
                new ReferenceClassProperty(this, "savedMessage", env).arrayGet(env, "children"));
        this.restoreHeaders(env);
        this.savedMessage = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        Object bodySigner = null;
        Object headerSigner = null;
        Object key = null;
        super.__clone(env);
        for (ZPair zpairResult1521 : ZVal.getIterable(this.bodySigners, env, false)) {
            key = ZVal.assign(zpairResult1521.getKey());
            bodySigner = ZVal.assign(zpairResult1521.getValue());
            new ReferenceClassProperty(this, "bodySigners", env)
                    .arrayAccess(env, key)
                    .set(((RuntimeClassInterface) bodySigner).phpClone(env));
        }

        for (ZPair zpairResult1522 : ZVal.getIterable(this.headerSigners, env, false)) {
            key = ZVal.assign(zpairResult1522.getKey());
            headerSigner = ZVal.assign(zpairResult1522.getValue());
            new ReferenceClassProperty(this, "headerSigners", env)
                    .arrayAccess(env, key)
                    .set(((RuntimeClassInterface) headerSigner).phpClone(env));
        }

        return null;
    }

    public static final Object CONST_class = "Swift_Message";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends Swift_Mime_SimpleMessage.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Message")
                    .setLookup(
                            Swift_Message.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "alternativePartOrder",
                            "body",
                            "bodySigners",
                            "boundary",
                            "cache",
                            "cacheKey",
                            "children",
                            "compositeRanges",
                            "compoundLevelFilters",
                            "encoder",
                            "headerSigners",
                            "headers",
                            "id",
                            "idGenerator",
                            "immediateChildren",
                            "maxLineLength",
                            "nestingLevel",
                            "nestingLevel",
                            "savedMessage",
                            "userCharset",
                            "userContentType",
                            "userDelSp",
                            "userFormat")
                    .setFilename("vendor/swiftmailer/swiftmailer/lib/classes/Swift/Message.php")
                    .addInterface("Swift_Mime_CharsetObserver")
                    .addInterface("Swift_Mime_EncodingObserver")
                    .addExtendsClass("Swift_Mime_SimpleMessage")
                    .addExtendsClass("Swift_Mime_MimePart")
                    .addExtendsClass("Swift_Mime_SimpleMimeEntity")
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
