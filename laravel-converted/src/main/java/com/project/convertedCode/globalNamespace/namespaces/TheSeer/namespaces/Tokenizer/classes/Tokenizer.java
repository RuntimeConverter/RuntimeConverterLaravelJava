package com.project.convertedCode.globalNamespace.namespaces.TheSeer.namespaces.Tokenizer.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.TheSeer.namespaces.Tokenizer.classes.Token;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.TheSeer.namespaces.Tokenizer.classes.TokenCollection;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/theseer/tokenizer/src/Tokenizer.php

*/

public class Tokenizer extends RuntimeClassBase {

    public Object map =
            ZVal.newArray(
                    new ZPair("(", "T_OPEN_BRACKET"),
                    new ZPair(")", "T_CLOSE_BRACKET"),
                    new ZPair("[", "T_OPEN_SQUARE"),
                    new ZPair("]", "T_CLOSE_SQUARE"),
                    new ZPair("{", "T_OPEN_CURLY"),
                    new ZPair("}", "T_CLOSE_CURLY"),
                    new ZPair(";", "T_SEMICOLON"),
                    new ZPair(".", "T_DOT"),
                    new ZPair(",", "T_COMMA"),
                    new ZPair("=", "T_EQUAL"),
                    new ZPair("<", "T_LT"),
                    new ZPair(">", "T_GT"),
                    new ZPair("+", "T_PLUS"),
                    new ZPair("-", "T_MINUS"),
                    new ZPair("*", "T_MULT"),
                    new ZPair("/", "T_DIV"),
                    new ZPair("?", "T_QUESTION_MARK"),
                    new ZPair("!", "T_EXCLAMATION_MARK"),
                    new ZPair(":", "T_COLON"),
                    new ZPair("\"", "T_DOUBLE_QUOTES"),
                    new ZPair("@", "T_AT"),
                    new ZPair("&", "T_AMPERSAND"),
                    new ZPair("%", "T_PERCENT"),
                    new ZPair("|", "T_PIPE"),
                    new ZPair("$", "T_DOLLAR"),
                    new ZPair("^", "T_CARET"),
                    new ZPair("~", "T_TILDE"),
                    new ZPair("`", "T_BACKTICK"));

    public Tokenizer(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Tokenizer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source", typeHint = "string")
    public Object parse(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object source = assignParameter(args, 0, false);
        Object result = null;
        Object lastToken = null;
        ReferenceContainer tok = new BasicReferenceContainer(null);
        Object pos = null;
        ReferenceContainer line = new BasicReferenceContainer(null);
        Object v = null;
        Object values = null;
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        Object token = null;
        result = new TokenCollection(env);
        tokens.setObject(NamespaceGlobal.token_get_all.env(env).call(source).value());
        lastToken = new Token(env, tokens.arrayGet(env, 0, 2), "Placeholder", "");
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2233 : ZVal.getIterable(tokens.getObject(), env, false)) {
            pos = ZVal.assign(zpairResult2233.getKey());
            tok.setObject(ZVal.assign(zpairResult2233.getValue()));
            if (function_is_string.f.env(env).call(tok.getObject()).getBool()) {
                token =
                        new Token(
                                env,
                                env.callMethod(lastToken, "getLine", Tokenizer.class),
                                new ReferenceClassProperty(this, "map", env)
                                        .arrayGet(env, tok.getObject()),
                                tok.getObject());
                env.callMethod(result, "addToken", Tokenizer.class, token);
                lastToken = ZVal.assign(token);
                continue;
            }

            line.setObject(ZVal.assign(tok.arrayGet(env, 2)));
            values =
                    NamespaceGlobal.preg_split
                            .env(env)
                            .call("/\\R+/Uu", tok.arrayGet(env, 1))
                            .value();
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult2234 : ZVal.getIterable(values, env, true)) {
                v = ZVal.assign(zpairResult2234.getValue());
                token =
                        new Token(
                                env,
                                line.getObject(),
                                NamespaceGlobal.token_name
                                        .env(env)
                                        .call(tok.arrayGet(env, 0))
                                        .value(),
                                v);
                env.callMethod(result, "addToken", Tokenizer.class, token);
                line.setObject(ZVal.increment(line.getObject()));
                lastToken = ZVal.assign(token);
            }
        }

        return ZVal.assign(result);
    }

    public static final Object CONST_class = "TheSeer\\Tokenizer\\Tokenizer";

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
                    .setName("TheSeer\\Tokenizer\\Tokenizer")
                    .setLookup(
                            Tokenizer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("map")
                    .setFilename("vendor/theseer/tokenizer/src/Tokenizer.php")
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
