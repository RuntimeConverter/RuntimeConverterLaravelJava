package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Error;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Scalar;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Node/Scalar/String_.php

*/

public class String_ extends Scalar {

    public Object value = null;

    public String_(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == String_.class) {
            this.__construct(env, args);
        }
    }

    public String_(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object attributes = assignParameter(args, 1, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        super.__construct(env, attributes);
        this.value = value;
        return null;
    }

    @ConvertedMethod
    public Object getSubNodeNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("value"));
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        return "Scalar_String";
    }

    public static final Object CONST_KIND_SINGLE_QUOTED = 1;

    public static final Object CONST_KIND_DOUBLE_QUOTED = 2;

    public static final Object CONST_KIND_HEREDOC = 3;

    public static final Object CONST_KIND_NOWDOC = 4;

    public static final Object CONST_class = "PhpParser\\Node\\Scalar\\String_";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Scalar.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "str", typeHint = "string")
        @ConvertedParameter(
            index = 1,
            name = "parseUnicodeEscape",
            typeHint = "bool",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object parse(RuntimeEnv env, Object... args) {
            ReferenceContainer str = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object parseUnicodeEscape = assignParameter(args, 1, true);
            if (null == parseUnicodeEscape) {
                parseUnicodeEscape = true;
            }
            Object bLength = null;
            bLength = 0;
            if (ZVal.toBool(ZVal.strictEqualityCheck("b", "===", str.arrayGet(env, 0)))
                    || ZVal.toBool(ZVal.strictEqualityCheck("B", "===", str.arrayGet(env, 0)))) {
                bLength = 1;
            }

            if (ZVal.strictEqualityCheck("'", "===", str.arrayGet(env, bLength))) {
                return ZVal.assign(
                        function_str_replace
                                .f
                                .env(env)
                                .call(
                                        ZVal.arrayFromList("\\\\", "\\'"),
                                        ZVal.arrayFromList("\\", "'"),
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(str.getObject(), ZVal.add(bLength, 1), -1)
                                                .value())
                                .value());

            } else {
                return ZVal.assign(
                        runtimeStaticObject.parseEscapeSequences(
                                env,
                                function_substr
                                        .f
                                        .env(env)
                                        .call(str.getObject(), ZVal.add(bLength, 1), -1)
                                        .value(),
                                "\"",
                                parseUnicodeEscape));
            }
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "str", typeHint = "string")
        @ConvertedParameter(index = 1, name = "quote")
        @ConvertedParameter(
            index = 2,
            name = "parseUnicodeEscape",
            typeHint = "bool",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object parseEscapeSequences(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/nikic/php-parser/lib/PhpParser/Node/Scalar")
                            .setFile(
                                    "/vendor/nikic/php-parser/lib/PhpParser/Node/Scalar/String_.php");
            Object str = assignParameter(args, 0, false);
            Object quote = assignParameter(args, 1, false);
            Object parseUnicodeEscape = assignParameter(args, 2, true);
            if (null == parseUnicodeEscape) {
                parseUnicodeEscape = true;
            }
            Object extra = null;
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", quote)) {
                str =
                        function_str_replace
                                .f
                                .env(env)
                                .call("\\" + toStringR(quote, env), quote, str)
                                .value();
            }

            extra = "";
            if (ZVal.isTrue(parseUnicodeEscape)) {
                extra = "|u\\{([0-9a-fA-F]+)\\}";
            }

            return ZVal.assign(
                    NamespaceGlobal.preg_replace_callback
                            .env(env)
                            .call(
                                    "~\\\\([\\\\$nrtfve]|[xX][0-9a-fA-F]{1,2}|[0-7]{1,3}"
                                            + toStringR(extra, env)
                                            + ")~",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "PhpParser\\Node\\Scalar",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "matches")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            ReferenceContainer matches =
                                                    new BasicReferenceContainer(
                                                            assignParameter(args, 0, false));
                                            ReferenceContainer str =
                                                    new BasicReferenceContainer(null);
                                            str.setObject(ZVal.assign(matches.arrayGet(env, 1)));
                                            if (arrayActionR(
                                                    ArrayAction.ISSET,
                                                    env.getRequestStaticPropertiesReference(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .PhpParser
                                                                    .namespaces
                                                                    .Node
                                                                    .namespaces
                                                                    .Scalar
                                                                    .classes
                                                                    .String_
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "replacements"),
                                                    env,
                                                    str.getObject())) {
                                                return ZVal.assign(
                                                        env.getRequestStaticPropertiesReference(
                                                                        com.project
                                                                                .convertedCode
                                                                                .globalNamespace
                                                                                .namespaces
                                                                                .PhpParser
                                                                                .namespaces
                                                                                .Node
                                                                                .namespaces
                                                                                .Scalar
                                                                                .classes
                                                                                .String_
                                                                                .RequestStaticProperties
                                                                                .class,
                                                                        "replacements")
                                                                .arrayGet(env, str.getObject()));

                                            } else if (ZVal.toBool(
                                                            ZVal.strictEqualityCheck(
                                                                    "x",
                                                                    "===",
                                                                    str.arrayGet(env, 0)))
                                                    || ZVal.toBool(
                                                            ZVal.strictEqualityCheck(
                                                                    "X",
                                                                    "===",
                                                                    str.arrayGet(env, 0)))) {
                                                return ZVal.assign(
                                                        NamespaceGlobal.chr
                                                                .env(env)
                                                                .call(
                                                                        NamespaceGlobal.hexdec
                                                                                .env(env)
                                                                                .call(
                                                                                        str
                                                                                                .getObject())
                                                                                .value())
                                                                .value());

                                            } else if (ZVal.strictEqualityCheck(
                                                    "u", "===", str.arrayGet(env, 0))) {
                                                return ZVal.assign(
                                                        com.project.convertedCode.globalNamespace
                                                                .namespaces.PhpParser.namespaces
                                                                .Node.namespaces.Scalar.classes
                                                                .String_.runtimeStaticObject
                                                                .codePointToUtf8(
                                                                        env,
                                                                        NamespaceGlobal.hexdec
                                                                                .env(env)
                                                                                .call(
                                                                                        matches
                                                                                                .arrayGet(
                                                                                                        env,
                                                                                                        2))
                                                                                .value()));

                                            } else {
                                                return ZVal.assign(
                                                        NamespaceGlobal.chr
                                                                .env(env)
                                                                .call(
                                                                        NamespaceGlobal.octdec
                                                                                .env(env)
                                                                                .call(
                                                                                        str
                                                                                                .getObject())
                                                                                .value())
                                                                .value());
                                            }
                                        }
                                    },
                                    str)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "num", typeHint = "int")
        private Object codePointToUtf8(RuntimeEnv env, Object... args) {
            Object num = assignParameter(args, 0, false);
            if (ZVal.isLessThanOrEqualTo(num, "<=", 127)) {
                return ZVal.assign(NamespaceGlobal.chr.env(env).call(num).value());
            }

            if (ZVal.isLessThanOrEqualTo(num, "<=", 2047)) {
                return ZVal.assign(
                        toStringR(
                                        NamespaceGlobal.chr
                                                .env(env)
                                                .call(
                                                        ZVal.add(
                                                                ZVal.toLong(num) >> ZVal.toLong(6),
                                                                192))
                                                .value(),
                                        env)
                                + toStringR(
                                        NamespaceGlobal.chr
                                                .env(env)
                                                .call(
                                                        ZVal.add(
                                                                ZVal.toLong(num) & ZVal.toLong(63),
                                                                128))
                                                .value(),
                                        env));
            }

            if (ZVal.isLessThanOrEqualTo(num, "<=", 65535)) {
                return ZVal.assign(
                        toStringR(
                                        NamespaceGlobal.chr
                                                .env(env)
                                                .call(
                                                        ZVal.add(
                                                                ZVal.toLong(num) >> ZVal.toLong(12),
                                                                224))
                                                .value(),
                                        env)
                                + toStringR(
                                        NamespaceGlobal.chr
                                                .env(env)
                                                .call(
                                                        ZVal.add(
                                                                ZVal.toLong(
                                                                                ZVal.toLong(num)
                                                                                        >> ZVal
                                                                                                .toLong(
                                                                                                        6))
                                                                        & ZVal.toLong(63),
                                                                128))
                                                .value(),
                                        env)
                                + toStringR(
                                        NamespaceGlobal.chr
                                                .env(env)
                                                .call(
                                                        ZVal.add(
                                                                ZVal.toLong(num) & ZVal.toLong(63),
                                                                128))
                                                .value(),
                                        env));
            }

            if (ZVal.isLessThanOrEqualTo(num, "<=", 2097151)) {
                return ZVal.assign(
                        toStringR(
                                        NamespaceGlobal.chr
                                                .env(env)
                                                .call(
                                                        ZVal.add(
                                                                ZVal.toLong(num) >> ZVal.toLong(18),
                                                                240))
                                                .value(),
                                        env)
                                + toStringR(
                                        NamespaceGlobal.chr
                                                .env(env)
                                                .call(
                                                        ZVal.add(
                                                                ZVal.toLong(
                                                                                ZVal.toLong(num)
                                                                                        >> ZVal
                                                                                                .toLong(
                                                                                                        12))
                                                                        & ZVal.toLong(63),
                                                                128))
                                                .value(),
                                        env)
                                + toStringR(
                                        NamespaceGlobal.chr
                                                .env(env)
                                                .call(
                                                        ZVal.add(
                                                                ZVal.toLong(
                                                                                ZVal.toLong(num)
                                                                                        >> ZVal
                                                                                                .toLong(
                                                                                                        6))
                                                                        & ZVal.toLong(63),
                                                                128))
                                                .value(),
                                        env)
                                + toStringR(
                                        NamespaceGlobal.chr
                                                .env(env)
                                                .call(
                                                        ZVal.add(
                                                                ZVal.toLong(num) & ZVal.toLong(63),
                                                                128))
                                                .value(),
                                        env));
            }

            throw ZVal.getException(
                    env,
                    new Error(env, "Invalid UTF-8 codepoint escape sequence: Codepoint too large"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "startToken", typeHint = "string")
        @ConvertedParameter(index = 1, name = "str", typeHint = "string")
        @ConvertedParameter(
            index = 2,
            name = "parseUnicodeEscape",
            typeHint = "bool",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object parseDocString(RuntimeEnv env, Object... args) {
            Object startToken = assignParameter(args, 0, false);
            Object str = assignParameter(args, 1, false);
            Object parseUnicodeEscape = assignParameter(args, 2, true);
            if (null == parseUnicodeEscape) {
                parseUnicodeEscape = true;
            }
            str = function_preg_replace.f.env(env).call("~(\\r\\n|\\n|\\r)\\z~", "", str).value();
            if (ZVal.strictNotEqualityCheck(
                    false, "!==", function_strpos.f.env(env).call(startToken, "'").value())) {
                return ZVal.assign(str);
            }

            return ZVal.assign(
                    runtimeStaticObject.parseEscapeSequences(
                            env, str, ZVal.getNull(), parseUnicodeEscape));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object replacements =
                ZVal.newArray(
                        new ZPair("\\", "\\"),
                        new ZPair("$", "$"),
                        new ZPair("n", "\n"),
                        new ZPair("r", "\r"),
                        new ZPair("t", "\t"),
                        new ZPair("f", "\f"),
                        new ZPair("v", "\u000B"),
                        new ZPair("e", "\u001B"));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\Node\\Scalar\\String_")
                    .setLookup(
                            String_.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "value")
                    .setStaticPropertyNames("replacements")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Node/Scalar/String_.php")
                    .addInterface("PhpParser\\Node")
                    .addInterface("JsonSerializable")
                    .addExtendsClass("PhpParser\\Node\\Scalar")
                    .addExtendsClass("PhpParser\\Node\\Expr")
                    .addExtendsClass("PhpParser\\NodeAbstract")
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
