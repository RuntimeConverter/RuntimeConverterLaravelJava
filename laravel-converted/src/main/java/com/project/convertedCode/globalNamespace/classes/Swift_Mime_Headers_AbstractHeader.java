package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_Header;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Headers/AbstractHeader.php

*/

public abstract class Swift_Mime_Headers_AbstractHeader extends RuntimeClassBase
        implements Swift_Mime_Header {

    public Object name = null;

    public Object encoder = null;

    public Object lineLength = 78;

    public Object lang = null;

    public Object charset = "utf-8";

    public Object cachedValue = ZVal.getNull();

    public Swift_Mime_Headers_AbstractHeader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Swift_Mime_Headers_AbstractHeader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charset")
    public Object setCharset(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, false);
        this.clearCachedValueIf(env, ZVal.notEqualityCheck(charset, this.charset));
        this.charset = charset;
        if (ZVal.isset(this.encoder)) {
            env.callMethod(
                    this.encoder,
                    "charsetChanged",
                    Swift_Mime_Headers_AbstractHeader.class,
                    charset);
        }

        return null;
    }

    @ConvertedMethod
    public Object getCharset(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.charset);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lang")
    public Object setLanguage(RuntimeEnv env, Object... args) {
        Object lang = assignParameter(args, 0, false);
        this.clearCachedValueIf(env, ZVal.notEqualityCheck(this.lang, lang));
        this.lang = lang;
        return null;
    }

    @ConvertedMethod
    public Object getLanguage(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.lang);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "encoder", typeHint = "Swift_Mime_HeaderEncoder")
    public Object setEncoder(RuntimeEnv env, Object... args) {
        Object encoder = assignParameter(args, 0, false);
        this.encoder = encoder;
        this.setCachedValue(env, ZVal.getNull());
        return null;
    }

    @ConvertedMethod
    public Object getEncoder(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.encoder);
    }

    @ConvertedMethod
    public Object getFieldName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lineLength")
    public Object setMaxLineLength(RuntimeEnv env, Object... args) {
        Object lineLength = assignParameter(args, 0, false);
        this.clearCachedValueIf(env, ZVal.notEqualityCheck(this.lineLength, lineLength));
        this.lineLength = lineLength;
        return null;
    }

    @ConvertedMethod
    public Object getMaxLineLength(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.lineLength);
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.tokensToString(env, this.toTokens(env)));
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.toString(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object setFieldName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.name = name;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "header", typeHint = "Swift_Mime_Header")
    @ConvertedParameter(index = 1, name = "string")
    @ConvertedParameter(index = 2, name = "charset")
    @ConvertedParameter(
        index = 3,
        name = "encoder",
        typeHint = "Swift_Mime_HeaderEncoder",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "shorten",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object createPhrase(RuntimeEnv env, Object... args) {
        Object header = assignParameter(args, 0, false);
        Object string = assignParameter(args, 1, false);
        Object charset = assignParameter(args, 2, false);
        Object encoder = assignParameter(args, 3, true);
        if (null == encoder) {
            encoder = ZVal.getNull();
        }
        Object shorten = assignParameter(args, 4, true);
        if (null == shorten) {
            shorten = false;
        }
        Object phraseStr = null;
        Object usedLength = null;
        phraseStr = ZVal.assign(string);
        if (!function_preg_match
                .f
                .env(env)
                .call("/^" + toStringR(CONST_PHRASE_PATTERN, env) + "$/D", phraseStr)
                .getBool()) {
            if (function_preg_match
                    .f
                    .env(env)
                    .call("/^[\\x00-\\x08\\x0B\\x0C\\x0E-\\x7F]*$/D", phraseStr)
                    .getBool()) {
                phraseStr = this.escapeSpecials(env, phraseStr, ZVal.arrayFromList("\""));
                phraseStr = "\"" + toStringR(phraseStr, env) + "\"";

            } else {
                if (ZVal.isTrue(shorten)) {
                    usedLength =
                            function_strlen
                                    .f
                                    .env(env)
                                    .call(
                                            toStringR(
                                                            env.callMethod(
                                                                    header,
                                                                    "getFieldName",
                                                                    Swift_Mime_Headers_AbstractHeader
                                                                            .class),
                                                            env)
                                                    + ": ")
                                    .value();

                } else {
                    usedLength = 0;
                }

                phraseStr = this.encodeWords(env, header, string, usedLength);
            }
        }

        return ZVal.assign(phraseStr);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    @ConvertedParameter(index = 1, name = "include", defaultValue = "", defaultValueType = "array")
    private Object escapeSpecials(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        Object include = assignParameter(args, 1, true);
        if (null == include) {
            include = ZVal.newArray();
        }
        Object _pChar = null;
        for (ZPair zpairResult1527 :
                ZVal.getIterable(
                        function_array_merge
                                .f
                                .env(env)
                                .call(ZVal.arrayFromList("\\"), include)
                                .value(),
                        env,
                        true)) {
            _pChar = ZVal.assign(zpairResult1527.getValue());
            token =
                    function_str_replace
                            .f
                            .env(env)
                            .call(_pChar, "\\" + toStringR(_pChar, env), token)
                            .value();
        }

        return ZVal.assign(token);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "header", typeHint = "Swift_Mime_Header")
    @ConvertedParameter(index = 1, name = "input")
    @ConvertedParameter(index = 2, name = "usedLength")
    protected Object encodeWords(RuntimeEnv env, Object... args) {
        Object header = assignParameter(args, 0, false);
        Object input = assignParameter(args, 1, false);
        Object usedLength = assignParameter(args, 2, true);
        if (null == usedLength) {
            usedLength = -1;
        }
        Object firstChar = null;
        Object tokens = null;
        Object value = null;
        Object token = null;
        value = "";
        tokens = this.getEncodableWordTokens(env, input);
        for (ZPair zpairResult1528 : ZVal.getIterable(tokens, env, true)) {
            token = ZVal.assign(zpairResult1528.getValue());
            if (ZVal.isTrue(this.tokenNeedsEncoding(env, token))) {
                firstChar = function_substr.f.env(env).call(token, 0, 1).value();
                switch (toStringR(firstChar)) {
                    case " ":
                    case "\t":
                        value = toStringR(value, env) + toStringR(firstChar, env);
                        token = function_substr.f.env(env).call(token, 1).value();
                }
                ;
                if (ZVal.equalityCheck(-1, usedLength)) {
                    usedLength =
                            ZVal.add(
                                    function_strlen
                                            .f
                                            .env(env)
                                            .call(
                                                    toStringR(
                                                                    env.callMethod(
                                                                            header,
                                                                            "getFieldName",
                                                                            Swift_Mime_Headers_AbstractHeader
                                                                                    .class),
                                                                    env)
                                                            + ": ")
                                            .value(),
                                    function_strlen.f.env(env).call(value).value());
                }

                value =
                        toStringR(value, env)
                                + toStringR(
                                        this.getTokenAsEncodedWord(env, token, usedLength), env);
                env.callMethod(
                        header, "setMaxLineLength", Swift_Mime_Headers_AbstractHeader.class, 76);

            } else {
                value = toStringR(value, env) + toStringR(token, env);
            }
        }

        return ZVal.assign(value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    protected Object tokenNeedsEncoding(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        return ZVal.assign(
                function_preg_match
                        .f
                        .env(env)
                        .call("~[\\x00-\\x08\\x10-\\x19\\x7F-\\xFF\\r\\n]~", token)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    protected Object getEncodableWordTokens(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        Object encodedToken = null;
        Object token = null;
        tokens.setObject(ZVal.newArray());
        encodedToken = "";
        for (ZPair zpairResult1529 :
                ZVal.getIterable(
                        NamespaceGlobal.preg_split.env(env).call("~(?=[\\t ])~", string).value(),
                        env,
                        true)) {
            token = ZVal.assign(zpairResult1529.getValue());
            if (ZVal.isTrue(this.tokenNeedsEncoding(env, token))) {
                encodedToken = toStringR(encodedToken, env) + toStringR(token, env);

            } else {
                if (ZVal.isGreaterThan(
                        function_strlen.f.env(env).call(encodedToken).value(), '>', 0)) {
                    tokens.arrayAppend(env).set(encodedToken);
                    encodedToken = "";
                }

                tokens.arrayAppend(env).set(token);
            }
        }

        if (function_strlen.f.env(env).call(encodedToken).getBool()) {
            tokens.arrayAppend(env).set(encodedToken);
        }

        return ZVal.assign(tokens.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    @ConvertedParameter(
        index = 1,
        name = "firstLineOffset",
        defaultValue = "0",
        defaultValueType = "number"
    )
    protected Object getTokenAsEncodedWord(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        Object firstLineOffset = assignParameter(args, 1, true);
        if (null == firstLineOffset) {
            firstLineOffset = 0;
        }
        Object encodingWrapperLength = null;
        Object charsetDecl = null;
        ReferenceContainer encodedTextLines = new BasicReferenceContainer(null);
        Object line = null;
        Object lineNum = null;
        charsetDecl = ZVal.assign(this.charset);
        if (ZVal.isset(this.lang)) {
            charsetDecl = toStringR(charsetDecl, env) + "*" + toStringR(this.lang, env);
        }

        encodingWrapperLength =
                function_strlen
                        .f
                        .env(env)
                        .call(
                                "=?"
                                        + toStringR(charsetDecl, env)
                                        + "?"
                                        + toStringR(
                                                env.callMethod(
                                                        this.encoder,
                                                        "getName",
                                                        Swift_Mime_Headers_AbstractHeader.class),
                                                env)
                                        + "??=")
                        .value();
        if (ZVal.isGreaterThanOrEqualTo(firstLineOffset, ">=", 75)) {
            firstLineOffset = 0;
        }

        encodedTextLines.setObject(
                function_explode
                        .f
                        .env(env)
                        .call(
                                "\r\n",
                                env.callMethod(
                                        this.encoder,
                                        "encodeString",
                                        Swift_Mime_Headers_AbstractHeader.class,
                                        token,
                                        firstLineOffset,
                                        ZVal.subtract(75, encodingWrapperLength),
                                        this.charset))
                        .value());
        if (ZVal.strictNotEqualityCheck(
                "iso-2022-jp",
                "!==",
                NamespaceGlobal.strtolower.env(env).call(this.charset).value())) {
            for (ZPair zpairResult1530 :
                    ZVal.getIterable(encodedTextLines.getObject(), env, false)) {
                lineNum = ZVal.assign(zpairResult1530.getKey());
                line = ZVal.assign(zpairResult1530.getValue());
                encodedTextLines
                        .arrayAccess(env, lineNum)
                        .set(
                                "=?"
                                        + toStringR(charsetDecl, env)
                                        + "?"
                                        + toStringR(
                                                env.callMethod(
                                                        this.encoder,
                                                        "getName",
                                                        Swift_Mime_Headers_AbstractHeader.class),
                                                env)
                                        + "?"
                                        + toStringR(line, env)
                                        + "?=");
            }
        }

        return ZVal.assign(
                NamespaceGlobal.implode
                        .env(env)
                        .call("\r\n ", encodedTextLines.getObject())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    protected Object generateTokenLines(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        return ZVal.assign(
                NamespaceGlobal.preg_split.env(env).call("~(\\r\\n)~", token, -1, 2).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object setCachedValue(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        this.cachedValue = value;
        return null;
    }

    @ConvertedMethod
    protected Object getCachedValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.cachedValue);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "condition")
    protected Object clearCachedValueIf(RuntimeEnv env, Object... args) {
        Object condition = assignParameter(args, 0, false);
        if (ZVal.isTrue(condition)) {
            this.setCachedValue(env, ZVal.getNull());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object toTokens(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, true);
        if (null == string) {
            string = ZVal.getNull();
        }
        Object newToken = null;
        Object newTokens = null;
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        Object token = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", string)) {
            string = env.callMethod(this, "getFieldBody", Swift_Mime_Headers_AbstractHeader.class);
        }

        tokens.setObject(ZVal.newArray());
        for (ZPair zpairResult1531 :
                ZVal.getIterable(
                        NamespaceGlobal.preg_split.env(env).call("~(?=[ \\t])~", string).value(),
                        env,
                        true)) {
            token = ZVal.assign(zpairResult1531.getValue());
            newTokens = this.generateTokenLines(env, token);
            for (ZPair zpairResult1532 : ZVal.getIterable(newTokens, env, true)) {
                newToken = ZVal.assign(zpairResult1532.getValue());
                tokens.arrayAppend(env).set(newToken);
            }
        }

        return ZVal.assign(tokens.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "array")
    private Object tokensToString(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, false);
        ReferenceContainer headerLines = new BasicReferenceContainer(null);
        Object i = null;
        ReferenceContainer lineCount = new BasicReferenceContainer(null);
        ReferenceContainer currentLine = new BasicReferenceContainer(null);
        Object token = null;
        lineCount.setObject(0);
        headerLines.setObject(ZVal.newArray());
        headerLines.arrayAppend(env).set(toStringR(this.name, env) + ": ");
        currentLine =
                new ArrayDimensionReference(headerLines.getObject(), ZVal.postIncrement(lineCount));
        for (ZPair zpairResult1533 : ZVal.getIterable(tokens, env, false)) {
            i = ZVal.assign(zpairResult1533.getKey());
            token = ZVal.assign(zpairResult1533.getValue());
            if (ZVal.toBool(ZVal.equalityCheck("\r\n", token))
                    || ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(ZVal.isGreaterThan(i, '>', 0))
                                                    && ZVal.toBool(
                                                            ZVal.isGreaterThan(
                                                                    function_strlen
                                                                            .f
                                                                            .env(env)
                                                                            .call(
                                                                                    toStringR(
                                                                                                    currentLine
                                                                                                            .getObject(),
                                                                                                    env)
                                                                                            + toStringR(
                                                                                                    token,
                                                                                                    env))
                                                                            .value(),
                                                                    '>',
                                                                    this.lineLength)))
                                    && ZVal.toBool(
                                            ZVal.isLessThan(
                                                    0,
                                                    '<',
                                                    function_strlen
                                                            .f
                                                            .env(env)
                                                            .call(currentLine.getObject())
                                                            .value())))) {
                headerLines.arrayAppend(env).set("");
                currentLine =
                        new ArrayDimensionReference(
                                headerLines.getObject(), ZVal.postIncrement(lineCount));
            }

            if (ZVal.notEqualityCheck("\r\n", token)) {
                currentLine.setObject(
                        toStringR(currentLine.getObject(), env) + toStringR(token, env));
            }
        }

        return ZVal.assign(
                toStringR(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call("\r\n", headerLines.getObject())
                                        .value(),
                                env)
                        + "\r\n");
    }

    public static final Object CONST_PHRASE_PATTERN =
            ZVal.getResourceAsString("stringLiterals/stringLiteral2913.txt");

    public static final Object CONST_class = "Swift_Mime_Headers_AbstractHeader";

    @ConvertedMethod()
    public abstract Object getFieldType(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object setFieldBodyModel(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object getFieldBodyModel(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object getFieldBody(RuntimeEnv env, Object... args);

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
                    .setName("Swift_Mime_Headers_AbstractHeader")
                    .setLookup(
                            Swift_Mime_Headers_AbstractHeader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "cachedValue", "charset", "encoder", "lang", "lineLength", "name")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Headers/AbstractHeader.php")
                    .addInterface("Swift_Mime_Header")
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
