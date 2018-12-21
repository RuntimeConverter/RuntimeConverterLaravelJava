package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reduce;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.array.function_ksort;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.project.convertedCode.globalNamespace.classes.Swift_RfcComplianceException;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import com.project.convertedCode.globalNamespace.classes.Swift_KeyCache;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_EncodingObserver;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.project.convertedCode.globalNamespace.functions.random_bytes;
import com.project.convertedCode.globalNamespace.classes.Swift_OutputByteStream;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_CharsetObserver;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_current;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/SimpleMimeEntity.php

*/

public class Swift_Mime_SimpleMimeEntity extends RuntimeClassBase
        implements Swift_Mime_CharsetObserver, Swift_Mime_EncodingObserver {

    public Object headers = null;

    public Object body = null;

    public Object encoder = null;

    public Object idGenerator = null;

    public Object boundary = null;

    public Object compositeRanges =
            ZVal.newArray(
                    new ZPair(
                            "multipart/mixed",
                            ZVal.newArray(
                                    new ZPair(0, CONST_LEVEL_TOP),
                                    new ZPair(1, CONST_LEVEL_MIXED))),
                    new ZPair(
                            "multipart/alternative",
                            ZVal.newArray(
                                    new ZPair(0, CONST_LEVEL_MIXED),
                                    new ZPair(1, CONST_LEVEL_ALTERNATIVE))),
                    new ZPair(
                            "multipart/related",
                            ZVal.newArray(
                                    new ZPair(0, CONST_LEVEL_ALTERNATIVE),
                                    new ZPair(1, CONST_LEVEL_RELATED))));

    public Object compoundLevelFilters = ZVal.newArray();

    public Object nestingLevel = CONST_LEVEL_ALTERNATIVE;

    public Object cache = null;

    public Object immediateChildren = ZVal.newArray();

    public Object children = ZVal.newArray();

    public Object maxLineLength = 78;

    public Object alternativePartOrder =
            ZVal.newArray(
                    new ZPair("text/plain", 1),
                    new ZPair("text/html", 2),
                    new ZPair("multipart/related", 3));

    public Object id = null;

    public Object cacheKey = null;

    public Object userContentType = null;

    public Swift_Mime_SimpleMimeEntity(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Mime_SimpleMimeEntity.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Mime_SimpleMimeEntity(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headers", typeHint = "Swift_Mime_SimpleHeaderSet")
    @ConvertedParameter(index = 1, name = "encoder", typeHint = "Swift_Mime_ContentEncoder")
    @ConvertedParameter(index = 2, name = "cache", typeHint = "Swift_KeyCache")
    @ConvertedParameter(index = 3, name = "idGenerator", typeHint = "Swift_IdGenerator")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object headers = assignParameter(args, 0, false);
        Object encoder = assignParameter(args, 1, false);
        Object cache = assignParameter(args, 2, false);
        Object idGenerator = assignParameter(args, 3, false);
        this.cacheKey =
                NamespaceGlobal.bin2hex
                        .env(env)
                        .call(random_bytes.f.env(env).call(16).value())
                        .value();
        this.cache = cache;
        this.headers = headers;
        this.idGenerator = idGenerator;
        this.setEncoder(env, encoder);
        env.callMethod(
                this.headers,
                "defineOrdering",
                Swift_Mime_SimpleMimeEntity.class,
                ZVal.arrayFromList("Content-Type", "Content-Transfer-Encoding"));
        this.compoundLevelFilters =
                ZVal.newArray(
                        new ZPair(
                                ZVal.add(CONST_LEVEL_ALTERNATIVE, CONST_LEVEL_RELATED),
                                ZVal.newArray(
                                        new ZPair(
                                                CONST_LEVEL_ALTERNATIVE,
                                                ZVal.newArray(
                                                        new ZPair(
                                                                "text/plain",
                                                                CONST_LEVEL_ALTERNATIVE),
                                                        new ZPair(
                                                                "text/html",
                                                                CONST_LEVEL_RELATED))))));
        this.id = env.callMethod(this.idGenerator, "generateId", Swift_Mime_SimpleMimeEntity.class);
        return null;
    }

    @ConvertedMethod
    public Object generateId(RuntimeEnv env, Object... args) {
        this.setId(
                env,
                env.callMethod(this.idGenerator, "generateId", Swift_Mime_SimpleMimeEntity.class));
        return ZVal.assign(this.id);
    }

    @ConvertedMethod
    public Object getHeaders(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.headers);
    }

    @ConvertedMethod
    public Object getNestingLevel(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.nestingLevel);
    }

    @ConvertedMethod
    public Object getContentType(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getHeaderFieldModel(env, "Content-Type"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    public Object setContentType(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        this.setContentTypeInHeaders(env, type);
        this.userContentType = type;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getId(RuntimeEnv env, Object... args) {
        Object tmp = null;
        tmp = ZVal.assign(rToArrayCast(this.getHeaderFieldModel(env, this.getIdField(env))));
        return ZVal.assign(
                ZVal.isTrue(
                                env.callMethod(
                                        this.headers,
                                        "has",
                                        Swift_Mime_SimpleMimeEntity.class,
                                        this.getIdField(env)))
                        ? function_current.f.env(env).call(tmp).value()
                        : this.id);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object setId(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.setHeaderFieldModel(env, this.getIdField(env), id))) {
            env.callMethod(
                    this.headers,
                    "addIdHeader",
                    Swift_Mime_SimpleMimeEntity.class,
                    this.getIdField(env),
                    id);
        }

        this.id = id;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getHeaderFieldModel(env, "Content-Description"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description")
    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.setHeaderFieldModel(env, "Content-Description", description))) {
            env.callMethod(
                    this.headers,
                    "addTextHeader",
                    Swift_Mime_SimpleMimeEntity.class,
                    "Content-Description",
                    description);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getMaxLineLength(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.maxLineLength);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "length")
    public Object setMaxLineLength(RuntimeEnv env, Object... args) {
        Object length = assignParameter(args, 0, false);
        this.maxLineLength = length;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getChildren(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.children);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "children", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "compoundLevel",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setChildren(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object children = assignParameter(args, 0, false);
        Object compoundLevel = assignParameter(args, 1, true);
        if (null == compoundLevel) {
            compoundLevel = ZVal.getNull();
        }
        ReferenceContainer immediateChildren = new BasicReferenceContainer(null);
        ReferenceContainer grandchildren = new BasicReferenceContainer(null);
        Object subentity = null;
        Object level = null;
        Object lowestLevel = null;
        ReferenceContainer range = new BasicReferenceContainer(null);
        Object ternaryExpressionTemp = null;
        Object nextLevel = null;
        Object mediaType = null;
        Object newContentType = null;
        Object child = null;
        compoundLevel =
                ZVal.assign(
                        ZVal.isDefined(ternaryExpressionTemp = compoundLevel)
                                ? ternaryExpressionTemp
                                : this.getCompoundLevel(env, children));
        immediateChildren.setObject(ZVal.newArray());
        grandchildren.setObject(ZVal.newArray());
        newContentType = ZVal.assign(this.userContentType);
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1552 : ZVal.getIterable(children, env, true)) {
            child = ZVal.assign(zpairResult1552.getValue());
            level = this.getNeededChildLevel(env, child, compoundLevel);
            if (ZVal.isEmpty(immediateChildren.getObject())) {
                immediateChildren.setObject(ZVal.newArray(new ZPair(0, child)));

            } else {
                nextLevel =
                        this.getNeededChildLevel(
                                env, immediateChildren.arrayGet(env, 0), compoundLevel);
                if (ZVal.equalityCheck(nextLevel, level)) {
                    immediateChildren.arrayAppend(env).set(child);

                } else if (ZVal.isLessThan(level, '<', nextLevel)) {
                    grandchildren.setObject(
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(grandchildren.getObject(), immediateChildren.getObject())
                                    .value());
                    immediateChildren.setObject(ZVal.newArray(new ZPair(0, child)));

                } else {
                    grandchildren.arrayAppend(env).set(child);
                }
            }
        }

        if (ZVal.isTrue(immediateChildren.getObject())) {
            lowestLevel =
                    this.getNeededChildLevel(
                            env, immediateChildren.arrayGet(env, 0), compoundLevel);
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult1553 : ZVal.getIterable(this.compositeRanges, env, false)) {
                mediaType = ZVal.assign(zpairResult1553.getKey());
                range.setObject(ZVal.assign(zpairResult1553.getValue()));
                if (ZVal.toBool(ZVal.isGreaterThan(lowestLevel, '>', range.arrayGet(env, 0)))
                        && ZVal.toBool(
                                ZVal.isLessThanOrEqualTo(
                                        lowestLevel, "<=", range.arrayGet(env, 1)))) {
                    newContentType = ZVal.assign(mediaType);
                    break;
                }
            }

            if (!ZVal.isEmpty(grandchildren.getObject())) {
                subentity = this.createChild(env);
                env.callMethod(
                        subentity,
                        "setNestingLevel",
                        Swift_Mime_SimpleMimeEntity.class,
                        lowestLevel);
                env.callMethod(
                        subentity,
                        "setChildren",
                        Swift_Mime_SimpleMimeEntity.class,
                        grandchildren.getObject(),
                        compoundLevel);
                function_array_unshift.f.env(env).call(immediateChildren.getObject(), subentity);
            }
        }

        this.immediateChildren = immediateChildren.getObject();
        this.children = children;
        this.setContentTypeInHeaders(env, newContentType);
        this.fixHeaders(env);
        this.sortChildren(env);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getBody(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        this.body,
                                        Swift_OutputByteStream.class,
                                        "Swift_OutputByteStream"))
                        ? this.readStream(env, this.body)
                        : this.body);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "body")
    @ConvertedParameter(
        index = 1,
        name = "contentType",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setBody(RuntimeEnv env, Object... args) {
        Object body = assignParameter(args, 0, false);
        Object contentType = assignParameter(args, 1, true);
        if (null == contentType) {
            contentType = ZVal.getNull();
        }
        if (ZVal.strictNotEqualityCheck(body, "!==", this.body)) {
            this.clearCache(env);
        }

        this.body = body;
        if (ZVal.isset(contentType)) {
            this.setContentType(env, contentType);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getEncoder(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.encoder);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "encoder", typeHint = "Swift_Mime_ContentEncoder")
    public Object setEncoder(RuntimeEnv env, Object... args) {
        Object encoder = assignParameter(args, 0, false);
        if (ZVal.strictNotEqualityCheck(encoder, "!==", this.encoder)) {
            this.clearCache(env);
        }

        this.encoder = encoder;
        this.setEncoding(
                env, env.callMethod(encoder, "getName", Swift_Mime_SimpleMimeEntity.class));
        this.notifyEncoderChanged(env, encoder);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getBoundary(RuntimeEnv env, Object... args) {
        if (!ZVal.isset(this.boundary)) {
            this.boundary =
                    "_=_swift_"
                            + toStringR(NamespaceGlobal.time.env(env).call().value(), env)
                            + "_"
                            + toStringR(
                                    NamespaceGlobal.bin2hex
                                            .env(env)
                                            .call(random_bytes.f.env(env).call(16).value())
                                            .value(),
                                    env)
                            + "_=_";
        }

        return ZVal.assign(this.boundary);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "boundary")
    public Object setBoundary(RuntimeEnv env, Object... args) {
        Object boundary = assignParameter(args, 0, false);
        this.assertValidBoundary(env, boundary);
        this.boundary = boundary;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charset")
    public Object charsetChanged(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, false);
        this.notifyCharsetChanged(env, charset);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "encoder", typeHint = "Swift_Mime_ContentEncoder")
    public Object encoderChanged(RuntimeEnv env, Object... args) {
        Object encoder = assignParameter(args, 0, false);
        this.notifyEncoderChanged(env, encoder);
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        Object string = null;
        string = env.callMethod(this.headers, "toString", Swift_Mime_SimpleMimeEntity.class);
        string = toStringR(string, env) + toStringR(this.bodyToString(env), env);
        return ZVal.assign(string);
    }

    @ConvertedMethod
    protected Object bodyToString(RuntimeEnv env, Object... args) {
        Object string = null;
        Object body = null;
        Object child = null;
        string = "";
        if (ZVal.toBool(ZVal.isset(this.body))
                && ZVal.toBool(ZVal.isEmpty(this.immediateChildren))) {
            if (ZVal.isTrue(
                    env.callMethod(
                            this.cache,
                            "hasKey",
                            Swift_Mime_SimpleMimeEntity.class,
                            this.cacheKey,
                            "body"))) {
                body =
                        env.callMethod(
                                this.cache,
                                "getString",
                                Swift_Mime_SimpleMimeEntity.class,
                                this.cacheKey,
                                "body");

            } else {
                body =
                        "\r\n"
                                + toStringR(
                                        env.callMethod(
                                                this.encoder,
                                                "encodeString",
                                                Swift_Mime_SimpleMimeEntity.class,
                                                this.getBody(env),
                                                0,
                                                this.getMaxLineLength(env)),
                                        env);
                env.callMethod(
                        this.cache,
                        "setString",
                        Swift_Mime_SimpleMimeEntity.class,
                        this.cacheKey,
                        "body",
                        body,
                        Swift_KeyCache.CONST_MODE_WRITE);
            }

            string = toStringR(string, env) + toStringR(body, env);
        }

        if (!ZVal.isEmpty(this.immediateChildren)) {
            for (ZPair zpairResult1554 : ZVal.getIterable(this.immediateChildren, env, true)) {
                child = ZVal.assign(zpairResult1554.getValue());
                string =
                        toStringR(string, env)
                                + "\r\n\r\n--"
                                + toStringR(this.getBoundary(env), env)
                                + "\r\n";
                string =
                        toStringR(string, env)
                                + toStringR(
                                        env.callMethod(
                                                child,
                                                "toString",
                                                Swift_Mime_SimpleMimeEntity.class),
                                        env);
            }

            string =
                    toStringR(string, env)
                            + "\r\n\r\n--"
                            + toStringR(this.getBoundary(env), env)
                            + "--\r\n";
        }

        return ZVal.assign(string);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.toString(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "is", typeHint = "Swift_InputByteStream")
    public Object toByteStream(RuntimeEnv env, Object... args) {
        Object is = assignParameter(args, 0, false);
        env.callMethod(
                is,
                "write",
                Swift_Mime_SimpleMimeEntity.class,
                env.callMethod(this.headers, "toString", Swift_Mime_SimpleMimeEntity.class));
        env.callMethod(is, "commit", Swift_Mime_SimpleMimeEntity.class);
        this.bodyToByteStream(env, is);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "is", typeHint = "Swift_InputByteStream")
    protected Object bodyToByteStream(RuntimeEnv env, Object... args) {
        Object is = assignParameter(args, 0, false);
        Object cacheIs = null;
        Object child = null;
        if (ZVal.isEmpty(this.immediateChildren)) {
            if (ZVal.isset(this.body)) {
                if (ZVal.isTrue(
                        env.callMethod(
                                this.cache,
                                "hasKey",
                                Swift_Mime_SimpleMimeEntity.class,
                                this.cacheKey,
                                "body"))) {
                    env.callMethod(
                            this.cache,
                            "exportToByteStream",
                            Swift_Mime_SimpleMimeEntity.class,
                            this.cacheKey,
                            "body",
                            is);

                } else {
                    cacheIs =
                            env.callMethod(
                                    this.cache,
                                    "getInputByteStream",
                                    Swift_Mime_SimpleMimeEntity.class,
                                    this.cacheKey,
                                    "body");
                    if (ZVal.isTrue(cacheIs)) {
                        env.callMethod(is, "bind", Swift_Mime_SimpleMimeEntity.class, cacheIs);
                    }

                    env.callMethod(is, "write", Swift_Mime_SimpleMimeEntity.class, "\r\n");
                    if (ZVal.isTrue(
                            ZVal.checkInstanceType(
                                    this.body,
                                    Swift_OutputByteStream.class,
                                    "Swift_OutputByteStream"))) {
                        env.callMethod(
                                this.body, "setReadPointer", Swift_Mime_SimpleMimeEntity.class, 0);
                        env.callMethod(
                                this.encoder,
                                "encodeByteStream",
                                Swift_Mime_SimpleMimeEntity.class,
                                this.body,
                                is,
                                0,
                                this.getMaxLineLength(env));

                    } else {
                        env.callMethod(
                                is,
                                "write",
                                Swift_Mime_SimpleMimeEntity.class,
                                env.callMethod(
                                        this.encoder,
                                        "encodeString",
                                        Swift_Mime_SimpleMimeEntity.class,
                                        this.getBody(env),
                                        0,
                                        this.getMaxLineLength(env)));
                    }

                    if (ZVal.isTrue(cacheIs)) {
                        env.callMethod(is, "unbind", Swift_Mime_SimpleMimeEntity.class, cacheIs);
                    }
                }
            }
        }

        if (!ZVal.isEmpty(this.immediateChildren)) {
            for (ZPair zpairResult1555 : ZVal.getIterable(this.immediateChildren, env, true)) {
                child = ZVal.assign(zpairResult1555.getValue());
                env.callMethod(
                        is,
                        "write",
                        Swift_Mime_SimpleMimeEntity.class,
                        "\r\n\r\n--" + toStringR(this.getBoundary(env), env) + "\r\n");
                env.callMethod(child, "toByteStream", Swift_Mime_SimpleMimeEntity.class, is);
            }

            env.callMethod(
                    is,
                    "write",
                    Swift_Mime_SimpleMimeEntity.class,
                    "\r\n\r\n--" + toStringR(this.getBoundary(env), env) + "--\r\n");
        }

        return null;
    }

    @ConvertedMethod
    protected Object getIdField(RuntimeEnv env, Object... args) {
        return "Content-ID";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "field")
    protected Object getHeaderFieldModel(RuntimeEnv env, Object... args) {
        Object field = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                env.callMethod(this.headers, "has", Swift_Mime_SimpleMimeEntity.class, field))) {
            return ZVal.assign(
                    env.callMethod(
                            env.callMethod(
                                    this.headers, "get", Swift_Mime_SimpleMimeEntity.class, field),
                            "getFieldBodyModel",
                            Swift_Mime_SimpleMimeEntity.class));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "field")
    @ConvertedParameter(index = 1, name = "model")
    protected Object setHeaderFieldModel(RuntimeEnv env, Object... args) {
        Object field = assignParameter(args, 0, false);
        Object model = assignParameter(args, 1, false);
        if (ZVal.isTrue(
                env.callMethod(this.headers, "has", Swift_Mime_SimpleMimeEntity.class, field))) {
            env.callMethod(
                    env.callMethod(this.headers, "get", Swift_Mime_SimpleMimeEntity.class, field),
                    "setFieldBodyModel",
                    Swift_Mime_SimpleMimeEntity.class,
                    model);
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "field")
    @ConvertedParameter(index = 1, name = "parameter")
    protected Object getHeaderParameter(RuntimeEnv env, Object... args) {
        Object field = assignParameter(args, 0, false);
        Object parameter = assignParameter(args, 1, false);
        if (ZVal.isTrue(
                env.callMethod(this.headers, "has", Swift_Mime_SimpleMimeEntity.class, field))) {
            return ZVal.assign(
                    env.callMethod(
                            env.callMethod(
                                    this.headers, "get", Swift_Mime_SimpleMimeEntity.class, field),
                            "getParameter",
                            Swift_Mime_SimpleMimeEntity.class,
                            parameter));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "field")
    @ConvertedParameter(index = 1, name = "parameter")
    @ConvertedParameter(index = 2, name = "value")
    protected Object setHeaderParameter(RuntimeEnv env, Object... args) {
        Object field = assignParameter(args, 0, false);
        Object parameter = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, false);
        if (ZVal.isTrue(
                env.callMethod(this.headers, "has", Swift_Mime_SimpleMimeEntity.class, field))) {
            env.callMethod(
                    env.callMethod(this.headers, "get", Swift_Mime_SimpleMimeEntity.class, field),
                    "setParameter",
                    Swift_Mime_SimpleMimeEntity.class,
                    parameter,
                    value);
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    protected Object fixHeaders(RuntimeEnv env, Object... args) {
        if (function_count.f.env(env).call(this.immediateChildren).getBool()) {
            this.setHeaderParameter(env, "Content-Type", "boundary", this.getBoundary(env));
            env.callMethod(
                    this.headers,
                    "remove",
                    Swift_Mime_SimpleMimeEntity.class,
                    "Content-Transfer-Encoding");

        } else {
            this.setHeaderParameter(env, "Content-Type", "boundary", ZVal.getNull());
            this.setEncoding(
                    env,
                    env.callMethod(this.encoder, "getName", Swift_Mime_SimpleMimeEntity.class));
        }

        return null;
    }

    @ConvertedMethod
    protected Object getCache(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.cache);
    }

    @ConvertedMethod
    protected Object getIdGenerator(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.idGenerator);
    }

    @ConvertedMethod
    protected Object clearCache(RuntimeEnv env, Object... args) {
        env.callMethod(
                this.cache, "clearKey", Swift_Mime_SimpleMimeEntity.class, this.cacheKey, "body");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "os", typeHint = "Swift_OutputByteStream")
    private Object readStream(RuntimeEnv env, Object... args) {
        Object os = assignParameter(args, 0, false);
        Object string = null;
        Object bytes = null;
        string = "";
        while (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                bytes = env.callMethod(os, "read", Swift_Mime_SimpleMimeEntity.class, 8192))) {
            string = toStringR(string, env) + toStringR(bytes, env);
        }

        env.callMethod(os, "setReadPointer", Swift_Mime_SimpleMimeEntity.class, 0);
        return ZVal.assign(string);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "encoding")
    private Object setEncoding(RuntimeEnv env, Object... args) {
        Object encoding = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.setHeaderFieldModel(env, "Content-Transfer-Encoding", encoding))) {
            env.callMethod(
                    this.headers,
                    "addTextHeader",
                    Swift_Mime_SimpleMimeEntity.class,
                    "Content-Transfer-Encoding",
                    encoding);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "boundary")
    private Object assertValidBoundary(RuntimeEnv env, Object... args) {
        Object boundary = assignParameter(args, 0, false);
        if (!function_preg_match
                .f
                .env(env)
                .call(
                        "/^[a-z0-9'\\(\\)\\+_\\-,\\.\\/:=\\?\\ ]{0,69}[a-z0-9'\\(\\)\\+_\\-,\\.\\/:=\\?]$/Di",
                        boundary)
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new Swift_RfcComplianceException(
                            env, "Mime boundary set is not RFC 2046 compliant."));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    private Object setContentTypeInHeaders(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.setHeaderFieldModel(env, "Content-Type", type))) {
            env.callMethod(
                    this.headers,
                    "addParameterizedHeader",
                    Swift_Mime_SimpleMimeEntity.class,
                    "Content-Type",
                    type);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    private Object setNestingLevel(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        this.nestingLevel = level;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "children")
    private Object getCompoundLevel(RuntimeEnv env, Object... args) {
        Object children = assignParameter(args, 0, false);
        Object level = null;
        Object child = null;
        level = 0;
        for (ZPair zpairResult1556 : ZVal.getIterable(children, env, true)) {
            child = ZVal.assign(zpairResult1556.getValue());
            level =
                    ZAssignment.or(
                            "|=",
                            level,
                            env.callMethod(
                                    child, "getNestingLevel", Swift_Mime_SimpleMimeEntity.class));
        }

        return ZVal.assign(level);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "child")
    @ConvertedParameter(index = 1, name = "compoundLevel")
    private Object getNeededChildLevel(RuntimeEnv env, Object... args) {
        Object child = assignParameter(args, 0, false);
        Object compoundLevel = assignParameter(args, 1, false);
        ReferenceContainer filter = new BasicReferenceContainer(null);
        Object realLevel = null;
        Object rules = null;
        Object bitmask = null;
        Object lowercaseType = null;
        filter.setObject(ZVal.newArray());
        for (ZPair zpairResult1557 : ZVal.getIterable(this.compoundLevelFilters, env, false)) {
            bitmask = ZVal.assign(zpairResult1557.getKey());
            rules = ZVal.assign(zpairResult1557.getValue());
            if (ZVal.strictEqualityCheck(
                    ZVal.toLong(compoundLevel) & ZVal.toLong(bitmask), "===", bitmask)) {
                filter.setObject(ZVal.add(rules, filter.getObject()));
            }
        }

        realLevel = env.callMethod(child, "getNestingLevel", Swift_Mime_SimpleMimeEntity.class);
        lowercaseType =
                NamespaceGlobal.strtolower
                        .env(env)
                        .call(
                                env.callMethod(
                                        child, "getContentType", Swift_Mime_SimpleMimeEntity.class))
                        .value();
        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, filter, env, realLevel))
                && ZVal.toBool(
                        arrayActionR(ArrayAction.ISSET, filter, env, realLevel, lowercaseType))) {
            return ZVal.assign(filter.arrayGet(env, realLevel, lowercaseType));
        }

        return ZVal.assign(realLevel);
    }

    @ConvertedMethod
    private Object createChild(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new com.project.convertedCode.globalNamespace.classes.Swift_Mime_SimpleMimeEntity(
                        env,
                        env.callMethod(
                                this.headers, "newInstance", Swift_Mime_SimpleMimeEntity.class),
                        this.encoder,
                        this.cache,
                        this.idGenerator));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "encoder", typeHint = "Swift_Mime_ContentEncoder")
    private Object notifyEncoderChanged(RuntimeEnv env, Object... args) {
        Object encoder = assignParameter(args, 0, false);
        Object child = null;
        for (ZPair zpairResult1558 : ZVal.getIterable(this.immediateChildren, env, true)) {
            child = ZVal.assign(zpairResult1558.getValue());
            env.callMethod(child, "encoderChanged", Swift_Mime_SimpleMimeEntity.class, encoder);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charset")
    private Object notifyCharsetChanged(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, false);
        Object child = null;
        env.callMethod(this.encoder, "charsetChanged", Swift_Mime_SimpleMimeEntity.class, charset);
        env.callMethod(this.headers, "charsetChanged", Swift_Mime_SimpleMimeEntity.class, charset);
        for (ZPair zpairResult1559 : ZVal.getIterable(this.immediateChildren, env, true)) {
            child = ZVal.assign(zpairResult1559.getValue());
            env.callMethod(child, "charsetChanged", Swift_Mime_SimpleMimeEntity.class, charset);
        }

        return null;
    }

    @ConvertedMethod
    private Object sortChildren(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer sorted = new BasicReferenceContainer(null);
        Object level = null;
        Object shouldSort = null;
        Object type = null;
        Object child = null;
        shouldSort = false;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1560 : ZVal.getIterable(this.immediateChildren, env, true)) {
            child = ZVal.assign(zpairResult1560.getValue());
            if (ZVal.equalityCheck(
                    CONST_LEVEL_ALTERNATIVE,
                    env.callMethod(child, "getNestingLevel", Swift_Mime_SimpleMimeEntity.class))) {
                shouldSort = true;
                break;
            }
        }

        if (ZVal.isTrue(shouldSort)) {
            sorted.setObject(ZVal.newArray());
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult1561 : ZVal.getIterable(this.immediateChildren, env, true)) {
                child = ZVal.assign(zpairResult1561.getValue());
                type = env.callMethod(child, "getContentType", Swift_Mime_SimpleMimeEntity.class);
                level =
                        ZVal.assign(
                                function_array_key_exists
                                                .f
                                                .env(env)
                                                .call(type, this.alternativePartOrder)
                                                .getBool()
                                        ? new ReferenceClassProperty(
                                                        this, "alternativePartOrder", env)
                                                .arrayGet(env, type)
                                        : ZVal.add(
                                                NamespaceGlobal.max
                                                        .env(env)
                                                        .call(this.alternativePartOrder)
                                                        .value(),
                                                1));
                if (arrayActionR(ArrayAction.EMPTY, sorted, env, level)) {
                    sorted.arrayAccess(env, level).set(ZVal.newArray());
                }

                sorted.arrayAppend(env, level).set(child);
            }

            function_ksort.f.env(env).call(sorted.getObject());
            this.immediateChildren =
                    function_array_reduce
                            .f
                            .env(env)
                            .call(sorted.getObject(), "array_merge", ZVal.newArray())
                            .value();
        }

        return null;
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(
                ZVal.checkInstanceType(this.cache, Swift_KeyCache.class, "Swift_KeyCache"))) {
            env.callMethod(
                    this.cache, "clearAll", Swift_Mime_SimpleMimeEntity.class, this.cacheKey);
        }

        return null;
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        ReferenceContainer children = new BasicReferenceContainer(null);
        Object pos = null;
        Object child = null;
        this.headers = ((RuntimeClassInterface) this.headers).phpClone(env);
        this.encoder = ((RuntimeClassInterface) this.encoder).phpClone(env);
        this.cacheKey =
                NamespaceGlobal.bin2hex
                        .env(env)
                        .call(random_bytes.f.env(env).call(16).value())
                        .value();
        children.setObject(ZVal.newArray());
        for (ZPair zpairResult1562 : ZVal.getIterable(this.children, env, false)) {
            pos = ZVal.assign(zpairResult1562.getKey());
            child = ZVal.assign(zpairResult1562.getValue());
            children.arrayAccess(env, pos).set(((RuntimeClassInterface) child).phpClone(env));
        }

        this.setChildren(env, children.getObject());
        return null;
    }

    public static final Object CONST_LEVEL_TOP = 16;

    public static final Object CONST_LEVEL_MIXED = 256;

    public static final Object CONST_LEVEL_ALTERNATIVE = 4096;

    public static final Object CONST_LEVEL_RELATED = 65536;

    public static final Object CONST_class = "Swift_Mime_SimpleMimeEntity";

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
                    .setName("Swift_Mime_SimpleMimeEntity")
                    .setLookup(
                            Swift_Mime_SimpleMimeEntity.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "alternativePartOrder",
                            "body",
                            "boundary",
                            "cache",
                            "cacheKey",
                            "children",
                            "compositeRanges",
                            "compoundLevelFilters",
                            "encoder",
                            "headers",
                            "id",
                            "idGenerator",
                            "immediateChildren",
                            "maxLineLength",
                            "nestingLevel",
                            "userContentType")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/SimpleMimeEntity.php")
                    .addInterface("Swift_Mime_CharsetObserver")
                    .addInterface("Swift_Mime_EncodingObserver")
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
