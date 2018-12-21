package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_Headers_UnstructuredHeader;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Headers/ParameterizedHeader.php

*/

public class Swift_Mime_Headers_ParameterizedHeader extends Swift_Mime_Headers_UnstructuredHeader {

    public Object paramEncoder = null;

    public Object params = ZVal.newArray();

    public Swift_Mime_Headers_ParameterizedHeader(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Mime_Headers_ParameterizedHeader.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Mime_Headers_ParameterizedHeader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "encoder", typeHint = "Swift_Mime_HeaderEncoder")
    @ConvertedParameter(
        index = 2,
        name = "paramEncoder",
        typeHint = "Swift_Encoder",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object encoder = assignParameter(args, 1, false);
        Object paramEncoder = assignParameter(args, 2, true);
        if (null == paramEncoder) {
            paramEncoder = ZVal.getNull();
        }
        super.__construct(env, name, encoder);
        this.paramEncoder = paramEncoder;
        return null;
    }

    @ConvertedMethod
    public Object getFieldType(RuntimeEnv env, Object... args) {
        return ZVal.assign(CONST_TYPE_PARAMETERIZED);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charset")
    public Object setCharset(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, false);
        super.setCharset(env, charset);
        if (ZVal.isset(this.paramEncoder)) {
            env.callMethod(
                    this.paramEncoder,
                    "charsetChanged",
                    Swift_Mime_Headers_ParameterizedHeader.class,
                    charset);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameter")
    @ConvertedParameter(index = 1, name = "value")
    public Object setParameter(RuntimeEnv env, Object... args) {
        Object parameter = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        this.setParameters(
                env,
                function_array_merge
                        .f
                        .env(env)
                        .call(this.getParameters(env), ZVal.newArray(new ZPair(parameter, value)))
                        .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameter")
    public Object getParameter(RuntimeEnv env, Object... args) {
        Object parameter = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        ReferenceContainer params = new BasicReferenceContainer(null);
        params.setObject(this.getParameters(env));
        return ZVal.assign(
                ZVal.isDefined(ternaryExpressionTemp = params.arrayGet(env, parameter))
                        ? ternaryExpressionTemp
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters", typeHint = "array")
    public Object setParameters(RuntimeEnv env, Object... args) {
        Object parameters = assignParameter(args, 0, false);
        env.callMethod(
                this,
                "clearCachedValueIf",
                Swift_Mime_Headers_ParameterizedHeader.class,
                ZVal.notEqualityCheck(this.params, parameters));
        this.params = parameters;
        return null;
    }

    @ConvertedMethod
    public Object getParameters(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.params);
    }

    @ConvertedMethod
    public Object getFieldBody(RuntimeEnv env, Object... args) {
        Object name = null;
        Object body = null;
        Object value = null;
        body = super.getFieldBody(env);
        for (ZPair zpairResult1539 : ZVal.getIterable(this.params, env, false)) {
            name = ZVal.assign(zpairResult1539.getKey());
            value = ZVal.assign(zpairResult1539.getValue());
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", value)) {
                body =
                        toStringR(body, env)
                                + "; "
                                + toStringR(this.createParameter(env, name, value), env);
            }
        }

        return ZVal.assign(body);
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
        Object name = null;
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        Object value = null;
        tokens.setObject(super.toTokens(env, super.getFieldBody(env)));
        for (ZPair zpairResult1540 : ZVal.getIterable(this.params, env, false)) {
            name = ZVal.assign(zpairResult1540.getKey());
            value = ZVal.assign(zpairResult1540.getValue());
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", value)) {
                tokens.arrayAccess(
                                env,
                                ZVal.subtract(
                                        function_count.f.env(env).call(tokens.getObject()).value(),
                                        1))
                        .set(
                                toStringR(
                                                tokens.arrayGet(
                                                        env,
                                                        ZVal.subtract(
                                                                function_count
                                                                        .f
                                                                        .env(env)
                                                                        .call(tokens.getObject())
                                                                        .value(),
                                                                1)),
                                                env)
                                        + ";");
                tokens.setObject(
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        tokens.getObject(),
                                        env.callMethod(
                                                this,
                                                "generateTokenLines",
                                                Swift_Mime_Headers_ParameterizedHeader.class,
                                                " "
                                                        + toStringR(
                                                                this.createParameter(
                                                                        env, name, value),
                                                                env)))
                                .value());
            }
        }

        return ZVal.assign(tokens.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    private Object createParameter(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer paramLines = new BasicReferenceContainer(null);
        Object maxValueLength = null;
        ReferenceContainer valueLines = new BasicReferenceContainer(null);
        Object line = null;
        Object i = null;
        Object firstLineOffset = null;
        Object origValue = null;
        Object encoded = null;
        origValue = ZVal.assign(value);
        encoded = false;
        maxValueLength =
                ZVal.subtract(
                        ZVal.subtract(
                                env.callMethod(
                                        this,
                                        "getMaxLineLength",
                                        Swift_Mime_Headers_ParameterizedHeader.class),
                                function_strlen
                                        .f
                                        .env(env)
                                        .call(toStringR(name, env) + "=*N\"\";")
                                        .value()),
                        1);
        firstLineOffset = 0;
        if (!function_preg_match
                .f
                .env(env)
                .call("/^" + toStringR(CONST_TOKEN_REGEX, env) + "$/D", value)
                .getBool()) {
            if (!function_preg_match
                    .f
                    .env(env)
                    .call("/^[\\x00-\\x08\\x0B\\x0C\\x0E-\\x7F]*$/D", value)
                    .getBool()) {
                encoded = true;
                maxValueLength =
                        ZVal.subtract(
                                ZVal.subtract(
                                        env.callMethod(
                                                this,
                                                "getMaxLineLength",
                                                Swift_Mime_Headers_ParameterizedHeader.class),
                                        function_strlen
                                                .f
                                                .env(env)
                                                .call(toStringR(name, env) + "*N*=\"\";")
                                                .value()),
                                1);
                firstLineOffset =
                        function_strlen
                                .f
                                .env(env)
                                .call(
                                        toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "getCharset",
                                                                Swift_Mime_Headers_ParameterizedHeader
                                                                        .class),
                                                        env)
                                                + "'"
                                                + toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "getLanguage",
                                                                Swift_Mime_Headers_ParameterizedHeader
                                                                        .class),
                                                        env)
                                                + "'")
                                .value();
            }
        }

        if (ZVal.toBool(encoded)
                || ZVal.toBool(
                        ZVal.isGreaterThan(
                                function_strlen.f.env(env).call(value).value(),
                                '>',
                                maxValueLength))) {
            if (ZVal.isset(this.paramEncoder)) {
                value =
                        env.callMethod(
                                this.paramEncoder,
                                "encodeString",
                                Swift_Mime_Headers_ParameterizedHeader.class,
                                origValue,
                                firstLineOffset,
                                maxValueLength,
                                env.callMethod(
                                        this,
                                        "getCharset",
                                        Swift_Mime_Headers_ParameterizedHeader.class));

            } else {
                value =
                        env.callMethod(
                                this,
                                "getTokenAsEncodedWord",
                                Swift_Mime_Headers_ParameterizedHeader.class,
                                origValue);
                encoded = false;
            }
        }

        valueLines.setObject(
                ZVal.assign(
                        ZVal.isset(this.paramEncoder)
                                ? function_explode.f.env(env).call("\r\n", value).value()
                                : ZVal.newArray(new ZPair(0, value))));
        if (ZVal.isGreaterThan(
                function_count.f.env(env).call(valueLines.getObject()).value(), '>', 1)) {
            paramLines.setObject(ZVal.newArray());
            for (ZPair zpairResult1541 : ZVal.getIterable(valueLines.getObject(), env, false)) {
                i = ZVal.assign(zpairResult1541.getKey());
                line = ZVal.assign(zpairResult1541.getValue());
                paramLines
                        .arrayAppend(env)
                        .set(
                                toStringR(name, env)
                                        + "*"
                                        + toStringR(i, env)
                                        + toStringR(
                                                this.getEndOfParameterValue(
                                                        env, line, true, ZVal.equalityCheck(0, i)),
                                                env));
            }

            return ZVal.assign(
                    NamespaceGlobal.implode
                            .env(env)
                            .call(";\r\n ", paramLines.getObject())
                            .value());

        } else {
            return ZVal.assign(
                    toStringR(name, env)
                            + toStringR(
                                    this.getEndOfParameterValue(
                                            env, valueLines.arrayGet(env, 0), encoded, true),
                                    env));
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "encoded",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "firstLine",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    private Object getEndOfParameterValue(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object encoded = assignParameter(args, 1, true);
        if (null == encoded) {
            encoded = false;
        }
        Object firstLine = assignParameter(args, 2, true);
        if (null == firstLine) {
            firstLine = false;
        }
        Object prepend = null;
        if (!function_preg_match
                .f
                .env(env)
                .call("/^" + toStringR(CONST_TOKEN_REGEX, env) + "$/D", value)
                .getBool()) {
            value = "\"" + toStringR(value, env) + "\"";
        }

        prepend = "=";
        if (ZVal.isTrue(encoded)) {
            prepend = "*=";
            if (ZVal.isTrue(firstLine)) {
                prepend =
                        "*="
                                + toStringR(
                                        env.callMethod(
                                                this,
                                                "getCharset",
                                                Swift_Mime_Headers_ParameterizedHeader.class),
                                        env)
                                + "'"
                                + toStringR(
                                        env.callMethod(
                                                this,
                                                "getLanguage",
                                                Swift_Mime_Headers_ParameterizedHeader.class),
                                        env)
                                + "'";
            }
        }

        return ZVal.assign(toStringR(prepend, env) + toStringR(value, env));
    }

    public static final Object CONST_TOKEN_REGEX =
            "(?:[\\x21\\x23-\\x27\\x2A\\x2B\\x2D\\x2E\\x30-\\x39\\x41-\\x5A\\x5E-\\x7E]+)";

    public static final Object CONST_class = "Swift_Mime_Headers_ParameterizedHeader";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends Swift_Mime_Headers_UnstructuredHeader.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Mime_Headers_ParameterizedHeader")
                    .setLookup(
                            Swift_Mime_Headers_ParameterizedHeader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "cachedValue",
                            "charset",
                            "encoder",
                            "lang",
                            "lineLength",
                            "name",
                            "paramEncoder",
                            "params",
                            "value")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Headers/ParameterizedHeader.php")
                    .addInterface("Swift_Mime_Header")
                    .addExtendsClass("Swift_Mime_Headers_UnstructuredHeader")
                    .addExtendsClass("Swift_Mime_Headers_AbstractHeader")
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
