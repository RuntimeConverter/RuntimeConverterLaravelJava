package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Extractor.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
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

 vendor/symfony/translation/Extractor/PhpStringTokenParser.php

*/

public class PhpStringTokenParser extends RuntimeClassBase {

    public PhpStringTokenParser(RuntimeEnv env, Object... args) {
        super(env);
    }

    public PhpStringTokenParser(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Extractor\\PhpStringTokenParser";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "str")
        public Object parse(RuntimeEnv env, Object... args) {
            ReferenceContainer str = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object bLength = null;
            bLength = 0;
            if (ZVal.strictEqualityCheck("b", "===", str.arrayGet(env, 0))) {
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
                                "\""));
            }
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "str")
        @ConvertedParameter(index = 1, name = "quote")
        public Object parseEscapeSequences(RuntimeEnv env, Object... args) {
            Object str = assignParameter(args, 0, false);
            Object quote = assignParameter(args, 1, false);
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", quote)) {
                str =
                        function_str_replace
                                .f
                                .env(env)
                                .call("\\" + toStringR(quote, env), quote, str)
                                .value();
            }

            return ZVal.assign(
                    NamespaceGlobal.preg_replace_callback
                            .env(env)
                            .call(
                                    "~\\\\([\\\\$nrtfve]|[xX][0-9a-fA-F]{1,2}|[0-7]{1,3})~",
                                    ZVal.newArray(
                                            new ZPair(0, "PhpStringTokenParser"),
                                            new ZPair(1, "parseCallback")),
                                    str)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "matches")
        private Object parseCallback(RuntimeEnv env, Object... args) {
            ReferenceContainer matches =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            ReferenceContainer str = new BasicReferenceContainer(null);
            str.setObject(ZVal.assign(matches.arrayGet(env, 1)));
            if (arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Symfony
                                    .namespaces
                                    .Component
                                    .namespaces
                                    .Translation
                                    .namespaces
                                    .Extractor
                                    .classes
                                    .PhpStringTokenParser
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
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .Translation
                                                .namespaces
                                                .Extractor
                                                .classes
                                                .PhpStringTokenParser
                                                .RequestStaticProperties
                                                .class,
                                        "replacements")
                                .arrayGet(env, str.getObject()));

            } else if (ZVal.toBool(ZVal.strictEqualityCheck("x", "===", str.arrayGet(env, 0)))
                    || ZVal.toBool(ZVal.strictEqualityCheck("X", "===", str.arrayGet(env, 0)))) {
                return ZVal.assign(
                        NamespaceGlobal.chr
                                .env(env)
                                .call(NamespaceGlobal.hexdec.env(env).call(str.getObject()).value())
                                .value());

            } else {
                return ZVal.assign(
                        NamespaceGlobal.chr
                                .env(env)
                                .call(NamespaceGlobal.octdec.env(env).call(str.getObject()).value())
                                .value());
            }
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "startToken")
        @ConvertedParameter(index = 1, name = "str")
        public Object parseDocString(RuntimeEnv env, Object... args) {
            Object startToken = assignParameter(args, 0, false);
            Object str = assignParameter(args, 1, false);
            str = function_preg_replace.f.env(env).call("~(\\r\\n|\\n|\\r)$~", "", str).value();
            if (ZVal.strictNotEqualityCheck(
                    false, "!==", function_strpos.f.env(env).call(startToken, "'").value())) {
                return ZVal.assign(str);
            }

            return ZVal.assign(runtimeStaticObject.parseEscapeSequences(env, str, ZVal.getNull()));
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
                    .setName("Symfony\\Component\\Translation\\Extractor\\PhpStringTokenParser")
                    .setLookup(
                            PhpStringTokenParser.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("replacements")
                    .setFilename("vendor/symfony/translation/Extractor/PhpStringTokenParser.php")
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
