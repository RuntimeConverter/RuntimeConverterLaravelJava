package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.namespaces.Tokenizer.classes;

import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.namespaces.Handler.classes.WhitespaceHandler;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.namespaces.Handler.classes.NumberHandler;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.classes.TokenStream;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.namespaces.Handler.classes.CommentHandler;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.classes.Token;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.namespaces.Handler.classes.StringHandler;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.namespaces.Handler.classes.IdentifierHandler;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.namespaces.Tokenizer.classes.TokenizerPatterns;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.namespaces.Tokenizer.classes.TokenizerEscaping;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.namespaces.Handler.classes.HashHandler;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/Parser/Tokenizer/Tokenizer.php

*/

public class Tokenizer extends RuntimeClassBase {

    public Object handlers = null;

    public Tokenizer(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Tokenizer.class) {
            this.__construct(env, args);
        }
    }

    public Tokenizer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        Object escaping = null;
        Object patterns = null;
        patterns = new TokenizerPatterns(env);
        escaping = new TokenizerEscaping(env, patterns);
        this.handlers =
                ZVal.newArray(
                        new ZPair(0, new WhitespaceHandler(env)),
                        new ZPair(1, new IdentifierHandler(env, patterns, escaping)),
                        new ZPair(2, new HashHandler(env, patterns, escaping)),
                        new ZPair(3, new StringHandler(env, patterns, escaping)),
                        new ZPair(4, new NumberHandler(env, patterns)),
                        new ZPair(5, new CommentHandler(env)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "reader",
        typeHint = "Symfony\\Component\\CssSelector\\Parser\\Reader"
    )
    public Object tokenize(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object reader = assignParameter(args, 0, false);
        Object handler = null;
        Object stream = null;
        stream = new TokenStream(env);
        runtimeConverterContinueCount = 0;
        while (!ZVal.isTrue(env.callMethod(reader, "isEOF", Tokenizer.class))) {
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1750 : ZVal.getIterable(this.handlers, env, true)) {
                handler = ZVal.assign(zpairResult1750.getValue());
                if (ZVal.isTrue(
                        env.callMethod(handler, "handle", Tokenizer.class, reader, stream))) {
                    runtimeConverterContinueCount = 2;
                    runtimeConverterContinueCount--;
                    continue;
                }
            }

            env.callMethod(
                    stream,
                    "push",
                    Tokenizer.class,
                    new Token(
                            env,
                            Token.CONST_TYPE_DELIMITER,
                            env.callMethod(reader, "getSubstring", Tokenizer.class, 1),
                            env.callMethod(reader, "getPosition", Tokenizer.class)));
            env.callMethod(reader, "moveForward", Tokenizer.class, 1);
        }

        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                stream,
                                "push",
                                Tokenizer.class,
                                new Token(
                                        env,
                                        Token.CONST_TYPE_FILE_END,
                                        ZVal.getNull(),
                                        env.callMethod(reader, "getPosition", Tokenizer.class))),
                        "freeze",
                        Tokenizer.class));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\CssSelector\\Parser\\Tokenizer\\Tokenizer";

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
                    .setName("Symfony\\Component\\CssSelector\\Parser\\Tokenizer\\Tokenizer")
                    .setLookup(
                            Tokenizer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("handlers")
                    .setFilename("vendor/symfony/css-selector/Parser/Tokenizer/Tokenizer.php")
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
