package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.classes.PHP_Token;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_CURLY_OPEN;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_SEMICOLON;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_CLASS;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_WHITESPACE;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_OPEN_CURLY;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_NAMESPACE;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_CLOSE_CURLY;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_TRAIT;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_DOC_COMMENT;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_FUNCTION;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-token-stream/src/Token.php

*/

public abstract class PHP_TokenWithScope extends PHP_Token {

    public Object endTokenId = null;

    public PHP_TokenWithScope(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PHP_TokenWithScope.class) {
            this.__construct(env, args);
        }
    }

    public PHP_TokenWithScope(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getDocblock(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object prevLineNumber = null;
        Object line = null;
        Object currentLineNumber = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        tokens.setObject(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                        "tokens",
                        PHP_TokenWithScope.class));
        currentLineNumber =
                env.callMethod(
                        tokens.arrayGet(
                                env, toObjectR(this).accessProp(this, env).name("id").value()),
                        "getLine",
                        PHP_TokenWithScope.class);
        prevLineNumber = ZVal.subtract(currentLineNumber, 1);
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (i.setObject(
                        ZVal.subtract(toObjectR(this).accessProp(this, env).name("id").value(), 1));
                ZVal.isTrue(i.getObject());
                i.setObject(ZVal.decrement(i.getObject()))) {
            if (!arrayActionR(ArrayAction.ISSET, tokens, env, i.getObject())) {
                return null;
            }

            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    tokens.arrayGet(env, i.getObject()),
                                                    PHP_Token_FUNCTION.class,
                                                    "PHP_Token_FUNCTION"))
                                    || ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    tokens.arrayGet(env, i.getObject()),
                                                    PHP_Token_CLASS.class,
                                                    "PHP_Token_CLASS")))
                    || ZVal.toBool(
                            ZVal.checkInstanceType(
                                    tokens.arrayGet(env, i.getObject()),
                                    PHP_Token_TRAIT.class,
                                    "PHP_Token_TRAIT"))) {
                break;
            }

            line =
                    env.callMethod(
                            tokens.arrayGet(env, i.getObject()),
                            "getLine",
                            PHP_TokenWithScope.class);
            if (ZVal.toBool(ZVal.equalityCheck(line, currentLineNumber))
                    || ZVal.toBool(
                            ZVal.toBool(ZVal.equalityCheck(line, prevLineNumber))
                                    && ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    tokens.arrayGet(env, i.getObject()),
                                                    PHP_Token_WHITESPACE.class,
                                                    "PHP_Token_WHITESPACE")))) {
                continue;
            }

            if (ZVal.toBool(ZVal.isLessThan(line, '<', currentLineNumber))
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            tokens.arrayGet(env, i.getObject()),
                                            PHP_Token_DOC_COMMENT.class,
                                            "PHP_Token_DOC_COMMENT")))) {
                break;
            }

            return ZVal.assign(toStringR(tokens.arrayGet(env, i.getObject()), env));
        }

        return null;
    }

    @ConvertedMethod
    public Object getEndTokenId(RuntimeEnv env, Object... args) {
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer block = new BasicReferenceContainer(null);
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        block.setObject(0);
        i.setObject(ZVal.assign(toObjectR(this).accessProp(this, env).name("id").value()));
        tokens.setObject(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                        "tokens",
                        PHP_TokenWithScope.class));
        while (ZVal.toBool(ZVal.strictEqualityCheck(this.endTokenId, "===", ZVal.getNull()))
                && ZVal.toBool(arrayActionR(ArrayAction.ISSET, tokens, env, i.getObject()))) {
            if (ZVal.toBool(
                            ZVal.checkInstanceType(
                                    tokens.arrayGet(env, i.getObject()),
                                    PHP_Token_OPEN_CURLY.class,
                                    "PHP_Token_OPEN_CURLY"))
                    || ZVal.toBool(
                            ZVal.checkInstanceType(
                                    tokens.arrayGet(env, i.getObject()),
                                    PHP_Token_CURLY_OPEN.class,
                                    "PHP_Token_CURLY_OPEN"))) {
                block.setObject(ZVal.increment(block.getObject()));

            } else if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            tokens.arrayGet(env, i.getObject()),
                            PHP_Token_CLOSE_CURLY.class,
                            "PHP_Token_CLOSE_CURLY"))) {
                block.setObject(ZVal.decrement(block.getObject()));
                if (ZVal.strictEqualityCheck(block.getObject(), "===", 0)) {
                    this.endTokenId = i.getObject();
                }

            } else if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    this,
                                                    PHP_Token_FUNCTION.class,
                                                    "PHP_Token_FUNCTION"))
                                    || ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    this,
                                                    PHP_Token_NAMESPACE.class,
                                                    "PHP_Token_NAMESPACE")))
                    && ZVal.toBool(
                            ZVal.checkInstanceType(
                                    tokens.arrayGet(env, i.getObject()),
                                    PHP_Token_SEMICOLON.class,
                                    "PHP_Token_SEMICOLON"))) {
                if (ZVal.strictEqualityCheck(block.getObject(), "===", 0)) {
                    this.endTokenId = i.getObject();
                }
            }

            i.setObject(ZVal.increment(i.getObject()));
        }

        if (ZVal.strictEqualityCheck(this.endTokenId, "===", ZVal.getNull())) {
            this.endTokenId = toObjectR(this).accessProp(this, env).name("id").value();
        }

        return ZVal.assign(this.endTokenId);
    }

    @ConvertedMethod
    public Object getEndLine(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        new ReferenceClassProperty(this, "tokenStream", env)
                                .arrayGet(env, this.getEndTokenId(env)),
                        "getLine",
                        PHP_TokenWithScope.class));
    }

    public static final Object CONST_class = "PHP_TokenWithScope";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends PHP_Token.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHP_TokenWithScope")
                    .setLookup(
                            PHP_TokenWithScope.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("endTokenId", "id", "line", "text", "tokenStream")
                    .setFilename("vendor/phpunit/php-token-stream/src/Token.php")
                    .addExtendsClass("PHP_Token")
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
