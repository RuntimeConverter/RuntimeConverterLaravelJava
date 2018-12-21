package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.namespaces.Tokenizer.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/Parser/Tokenizer/TokenizerPatterns.php

*/

public class TokenizerPatterns extends RuntimeClassBase {

    public Object unicodeEscapePattern = null;

    public Object simpleEscapePattern = null;

    public Object newLineEscapePattern = null;

    public Object escapePattern = null;

    public Object stringEscapePattern = null;

    public Object nonAsciiPattern = null;

    public Object nmCharPattern = null;

    public Object nmStartPattern = null;

    public Object identifierPattern = null;

    public Object hashPattern = null;

    public Object numberPattern = null;

    public Object quotedStringPattern = null;

    public TokenizerPatterns(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TokenizerPatterns.class) {
            this.__construct(env, args);
        }
    }

    public TokenizerPatterns(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.unicodeEscapePattern = "\\\\([0-9a-f]{1,6})(?:\\r\\n|[ \\n\\r\\t\\f])?";
        this.simpleEscapePattern = "\\\\(.)";
        this.newLineEscapePattern = "\\\\(?:\\n|\\r\\n|\\r|\\f)";
        this.escapePattern = toStringR(this.unicodeEscapePattern, env) + "|\\\\[^\\n\\r\\f0-9a-f]";
        this.stringEscapePattern =
                toStringR(this.newLineEscapePattern, env)
                        + "|"
                        + toStringR(this.escapePattern, env);
        this.nonAsciiPattern = "[^\\x00-\\x7F]";
        this.nmCharPattern =
                "[_a-z0-9-]|"
                        + toStringR(this.escapePattern, env)
                        + "|"
                        + toStringR(this.nonAsciiPattern, env);
        this.nmStartPattern =
                "[_a-z]|"
                        + toStringR(this.escapePattern, env)
                        + "|"
                        + toStringR(this.nonAsciiPattern, env);
        this.identifierPattern =
                "-?(?:"
                        + toStringR(this.nmStartPattern, env)
                        + ")(?:"
                        + toStringR(this.nmCharPattern, env)
                        + ")*";
        this.hashPattern = "#((?:" + toStringR(this.nmCharPattern, env) + ")+)";
        this.numberPattern = "[+-]?(?:[0-9]*\\.[0-9]+|[0-9]+)";
        this.quotedStringPattern =
                "([^\\n\\r\\f%s]|" + toStringR(this.stringEscapePattern, env) + ")*";
        return null;
    }

    @ConvertedMethod
    public Object getNewLineEscapePattern(RuntimeEnv env, Object... args) {
        return ZVal.assign("~^" + toStringR(this.newLineEscapePattern, env) + "~");
    }

    @ConvertedMethod
    public Object getSimpleEscapePattern(RuntimeEnv env, Object... args) {
        return ZVal.assign("~^" + toStringR(this.simpleEscapePattern, env) + "~");
    }

    @ConvertedMethod
    public Object getUnicodeEscapePattern(RuntimeEnv env, Object... args) {
        return ZVal.assign("~^" + toStringR(this.unicodeEscapePattern, env) + "~i");
    }

    @ConvertedMethod
    public Object getIdentifierPattern(RuntimeEnv env, Object... args) {
        return ZVal.assign("~^" + toStringR(this.identifierPattern, env) + "~i");
    }

    @ConvertedMethod
    public Object getHashPattern(RuntimeEnv env, Object... args) {
        return ZVal.assign("~^" + toStringR(this.hashPattern, env) + "~i");
    }

    @ConvertedMethod
    public Object getNumberPattern(RuntimeEnv env, Object... args) {
        return ZVal.assign("~^" + toStringR(this.numberPattern, env) + "~");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "quote", typeHint = "string")
    public Object getQuotedStringPattern(RuntimeEnv env, Object... args) {
        Object quote = assignParameter(args, 0, false);
        return ZVal.assign(
                "~^"
                        + toStringR(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(this.quotedStringPattern, quote)
                                        .value(),
                                env)
                        + "~i");
    }

    public static final Object CONST_class =
            "Symfony\\Component\\CssSelector\\Parser\\Tokenizer\\TokenizerPatterns";

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
                            "Symfony\\Component\\CssSelector\\Parser\\Tokenizer\\TokenizerPatterns")
                    .setLookup(
                            TokenizerPatterns.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "escapePattern",
                            "hashPattern",
                            "identifierPattern",
                            "newLineEscapePattern",
                            "nmCharPattern",
                            "nmStartPattern",
                            "nonAsciiPattern",
                            "numberPattern",
                            "quotedStringPattern",
                            "simpleEscapePattern",
                            "stringEscapePattern",
                            "unicodeEscapePattern")
                    .setFilename(
                            "vendor/symfony/css-selector/Parser/Tokenizer/TokenizerPatterns.php")
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
