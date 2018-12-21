package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Exception.classes.SyntaxErrorException;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Exception.classes.InternalErrorException;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/Parser/TokenStream.php

*/

public class TokenStream extends RuntimeClassBase {

    public Object tokens = ZVal.newArray();

    public Object used = ZVal.newArray();

    public Object cursor = 0;

    public Object peeked = null;

    public Object peeking = false;

    public TokenStream(RuntimeEnv env, Object... args) {
        super(env);
    }

    public TokenStream(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "token",
        typeHint = "Symfony\\Component\\CssSelector\\Parser\\Token"
    )
    public Object push(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "tokens", env).arrayAppend(env).set(token);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object freeze(RuntimeEnv env, Object... args) {
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getNext(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.peeking)) {
            this.peeking = false;
            new ReferenceClassProperty(this, "used", env).arrayAppend(env).set(this.peeked);
            return ZVal.assign(this.peeked);
        }

        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "tokens", env),
                env,
                this.cursor)) {
            throw ZVal.getException(
                    env, new InternalErrorException(env, "Unexpected token stream end."));
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "tokens", env)
                        .arrayGet(env, this.cursor = ZVal.increment(this.cursor)));
    }

    @ConvertedMethod
    public Object getPeek(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.peeking)) {
            this.peeked = this.getNext(env);
            this.peeking = true;
        }

        return ZVal.assign(this.peeked);
    }

    @ConvertedMethod
    public Object getUsed(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.used);
    }

    @ConvertedMethod
    public Object getNextIdentifier(RuntimeEnv env, Object... args) {
        Object next = null;
        next = this.getNext(env);
        if (!ZVal.isTrue(env.callMethod(next, "isIdentifier", TokenStream.class))) {
            throw ZVal.getException(
                    env,
                    SyntaxErrorException.runtimeStaticObject.unexpectedToken(
                            env, "identifier", next));
        }

        return ZVal.assign(env.callMethod(next, "getValue", TokenStream.class));
    }

    @ConvertedMethod
    public Object getNextIdentifierOrStar(RuntimeEnv env, Object... args) {
        Object next = null;
        next = this.getNext(env);
        if (ZVal.isTrue(env.callMethod(next, "isIdentifier", TokenStream.class))) {
            return ZVal.assign(env.callMethod(next, "getValue", TokenStream.class));
        }

        if (ZVal.isTrue(
                env.callMethod(next, "isDelimiter", TokenStream.class, ZVal.arrayFromList("*")))) {
            return null;
        }

        throw ZVal.getException(
                env,
                SyntaxErrorException.runtimeStaticObject.unexpectedToken(
                        env, "identifier or \"*\"", next));
    }

    @ConvertedMethod
    public Object skipWhitespace(RuntimeEnv env, Object... args) {
        Object peek = null;
        peek = this.getPeek(env);
        if (ZVal.isTrue(env.callMethod(peek, "isWhitespace", TokenStream.class))) {
            this.getNext(env);
        }

        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\CssSelector\\Parser\\TokenStream";

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
                    .setName("Symfony\\Component\\CssSelector\\Parser\\TokenStream")
                    .setLookup(
                            TokenStream.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cursor", "peeked", "peeking", "tokens", "used")
                    .setFilename("vendor/symfony/css-selector/Parser/TokenStream.php")
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
