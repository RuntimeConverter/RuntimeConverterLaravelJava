package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.namespaces.Tokenizer.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/Parser/Tokenizer/TokenizerEscaping.php

*/

public class TokenizerEscaping extends RuntimeClassBase {

    public Object patterns = null;

    public TokenizerEscaping(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TokenizerEscaping.class) {
            this.__construct(env, args);
        }
    }

    public TokenizerEscaping(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "patterns",
        typeHint = "Symfony\\Component\\CssSelector\\Parser\\Tokenizer\\TokenizerPatterns"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object patterns = assignParameter(args, 0, false);
        this.patterns = patterns;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "string")
    public Object escapeUnicode(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        value = this.replaceUnicodeSequences(env, value);
        return ZVal.assign(
                function_preg_replace
                        .f
                        .env(env)
                        .call(
                                env.callMethod(
                                        this.patterns,
                                        "getSimpleEscapePattern",
                                        TokenizerEscaping.class),
                                "$1",
                                value)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "string")
    public Object escapeUnicodeAndNewLine(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        value =
                function_preg_replace
                        .f
                        .env(env)
                        .call(
                                env.callMethod(
                                        this.patterns,
                                        "getNewLineEscapePattern",
                                        TokenizerEscaping.class),
                                "",
                                value)
                        .value();
        return ZVal.assign(this.escapeUnicode(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "string")
    private Object replaceUnicodeSequences(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/css-selector/Parser/Tokenizer")
                        .setFile(
                                "/vendor/symfony/css-selector/Parser/Tokenizer/TokenizerEscaping.php");
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                NamespaceGlobal.preg_replace_callback
                        .env(env)
                        .call(
                                env.callMethod(
                                        this.patterns,
                                        "getUnicodeEscapePattern",
                                        TokenizerEscaping.class),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Symfony\\Component\\CssSelector\\Parser\\Tokenizer",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "match")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        ReferenceContainer match =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        Object c = null;
                                        c =
                                                NamespaceGlobal.hexdec
                                                        .env(env)
                                                        .call(match.arrayGet(env, 1))
                                                        .value();
                                        if (ZVal.isGreaterThan(
                                                128,
                                                '>',
                                                c = ZAssignment.modulus("%=", c, 2097152))) {
                                            return ZVal.assign(
                                                    NamespaceGlobal.chr.env(env).call(c).value());
                                        }

                                        if (ZVal.isGreaterThan(2048, '>', c)) {
                                            return ZVal.assign(
                                                    toStringR(
                                                                    NamespaceGlobal.chr
                                                                            .env(env)
                                                                            .call(
                                                                                    ZVal.toLong(192)
                                                                                            | ZVal
                                                                                                    .toLong(
                                                                                                            ZVal
                                                                                                                            .toLong(
                                                                                                                                    c)
                                                                                                                    >> ZVal
                                                                                                                            .toLong(
                                                                                                                                    6)))
                                                                            .value(),
                                                                    env)
                                                            + toStringR(
                                                                    NamespaceGlobal.chr
                                                                            .env(env)
                                                                            .call(
                                                                                    ZVal.toLong(128)
                                                                                            | ZVal
                                                                                                    .toLong(
                                                                                                            ZVal
                                                                                                                            .toLong(
                                                                                                                                    c)
                                                                                                                    & ZVal
                                                                                                                            .toLong(
                                                                                                                                    63)))
                                                                            .value(),
                                                                    env));
                                        }

                                        if (ZVal.isGreaterThan(65536, '>', c)) {
                                            return ZVal.assign(
                                                    toStringR(
                                                                    NamespaceGlobal.chr
                                                                            .env(env)
                                                                            .call(
                                                                                    ZVal.toLong(224)
                                                                                            | ZVal
                                                                                                    .toLong(
                                                                                                            ZVal
                                                                                                                            .toLong(
                                                                                                                                    c)
                                                                                                                    >> ZVal
                                                                                                                            .toLong(
                                                                                                                                    12)))
                                                                            .value(),
                                                                    env)
                                                            + toStringR(
                                                                    NamespaceGlobal.chr
                                                                            .env(env)
                                                                            .call(
                                                                                    ZVal.toLong(128)
                                                                                            | ZVal
                                                                                                    .toLong(
                                                                                                            ZVal
                                                                                                                            .toLong(
                                                                                                                                    ZVal
                                                                                                                                                    .toLong(
                                                                                                                                                            c)
                                                                                                                                            >> ZVal
                                                                                                                                                    .toLong(
                                                                                                                                                            6))
                                                                                                                    & ZVal
                                                                                                                            .toLong(
                                                                                                                                    63)))
                                                                            .value(),
                                                                    env)
                                                            + toStringR(
                                                                    NamespaceGlobal.chr
                                                                            .env(env)
                                                                            .call(
                                                                                    ZVal.toLong(128)
                                                                                            | ZVal
                                                                                                    .toLong(
                                                                                                            ZVal
                                                                                                                            .toLong(
                                                                                                                                    c)
                                                                                                                    & ZVal
                                                                                                                            .toLong(
                                                                                                                                    63)))
                                                                            .value(),
                                                                    env));
                                        }

                                        return null;
                                    }
                                },
                                value)
                        .value());
    }

    public static final Object CONST_class =
            "Symfony\\Component\\CssSelector\\Parser\\Tokenizer\\TokenizerEscaping";

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
                    .setName(
                            "Symfony\\Component\\CssSelector\\Parser\\Tokenizer\\TokenizerEscaping")
                    .setLookup(
                            TokenizerEscaping.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("patterns")
                    .setFilename(
                            "vendor/symfony/css-selector/Parser/Tokenizer/TokenizerEscaping.php")
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
