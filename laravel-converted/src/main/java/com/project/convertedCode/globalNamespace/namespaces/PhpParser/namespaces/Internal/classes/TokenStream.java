package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Internal.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Internal/TokenStream.php

*/

public class TokenStream extends RuntimeClassBase {

    public Object tokens = null;

    public Object indentMap = null;

    public TokenStream(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TokenStream.class) {
            this.__construct(env, args);
        }
    }

    public TokenStream(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, false);
        this.tokens = tokens;
        this.indentMap = this.calcIndentMap(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "startPos", typeHint = "int")
    @ConvertedParameter(index = 1, name = "endPos", typeHint = "int")
    public Object haveParens(RuntimeEnv env, Object... args) {
        Object startPos = assignParameter(args, 0, false);
        Object endPos = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.toBool(this.haveTokenImmediativelyBefore(env, startPos, "("))
                        && ZVal.toBool(this.haveTokenImmediatelyAfter(env, endPos, ")")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "startPos", typeHint = "int")
    @ConvertedParameter(index = 1, name = "endPos", typeHint = "int")
    public Object haveBraces(RuntimeEnv env, Object... args) {
        Object startPos = assignParameter(args, 0, false);
        Object endPos = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.toBool(this.haveTokenImmediativelyBefore(env, startPos, "{"))
                        && ZVal.toBool(this.haveTokenImmediatelyAfter(env, endPos, "}")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pos", typeHint = "int")
    @ConvertedParameter(index = 1, name = "expectedTokenType")
    public Object haveTokenImmediativelyBefore(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer pos = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object expectedTokenType = assignParameter(args, 1, false);
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        Object tokenType = null;
        tokens.setObject(ZVal.assign(this.tokens));
        pos.setObject(ZVal.decrement(pos.getObject()));
        runtimeConverterBreakCount = 0;
        for (;
                ZVal.isGreaterThanOrEqualTo(pos.getObject(), ">=", 0);
                pos.setObject(ZVal.decrement(pos.getObject()))) {
            tokenType = ZVal.assign(tokens.arrayGet(env, pos.getObject(), 0));
            if (ZVal.strictEqualityCheck(tokenType, "===", expectedTokenType)) {
                return ZVal.assign(true);
            }

            if (ZVal.toBool(
                            ZVal.toBool(ZVal.strictNotEqualityCheck(tokenType, "!==", 382))
                                    && ZVal.toBool(
                                            ZVal.strictNotEqualityCheck(tokenType, "!==", 377)))
                    && ZVal.toBool(ZVal.strictNotEqualityCheck(tokenType, "!==", 378))) {
                break;
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pos", typeHint = "int")
    @ConvertedParameter(index = 1, name = "expectedTokenType")
    public Object haveTokenImmediatelyAfter(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer pos = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object expectedTokenType = assignParameter(args, 1, false);
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        Object tokenType = null;
        tokens.setObject(ZVal.assign(this.tokens));
        pos.setObject(ZVal.increment(pos.getObject()));
        runtimeConverterBreakCount = 0;
        for (;
                ZVal.isLessThan(
                        pos.getObject(),
                        '<',
                        function_count.f.env(env).call(tokens.getObject()).value());
                pos.setObject(ZVal.increment(pos.getObject()))) {
            tokenType = ZVal.assign(tokens.arrayGet(env, pos.getObject(), 0));
            if (ZVal.strictEqualityCheck(tokenType, "===", expectedTokenType)) {
                return ZVal.assign(true);
            }

            if (ZVal.toBool(
                            ZVal.toBool(ZVal.strictNotEqualityCheck(tokenType, "!==", 382))
                                    && ZVal.toBool(
                                            ZVal.strictNotEqualityCheck(tokenType, "!==", 377)))
                    && ZVal.toBool(ZVal.strictNotEqualityCheck(tokenType, "!==", 378))) {
                break;
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pos", typeHint = "int")
    @ConvertedParameter(index = 1, name = "skipTokenType")
    public Object skipLeft(RuntimeEnv env, Object... args) {
        ReferenceContainer pos = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object skipTokenType = assignParameter(args, 1, false);
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        tokens.setObject(ZVal.assign(this.tokens));
        pos.setObject(this.skipLeftWhitespace(env, pos.getObject()));
        if (ZVal.strictEqualityCheck(skipTokenType, "===", 382)) {
            return ZVal.assign(pos.getObject());
        }

        if (ZVal.strictNotEqualityCheck(
                tokens.arrayGet(env, pos.getObject(), 0), "!==", skipTokenType)) {
            throw ZVal.getException(env, new PHPException(env, "Encountered unexpected token"));
        }

        pos.setObject(ZVal.decrement(pos.getObject()));
        return ZVal.assign(this.skipLeftWhitespace(env, pos.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pos", typeHint = "int")
    @ConvertedParameter(index = 1, name = "skipTokenType")
    public Object skipRight(RuntimeEnv env, Object... args) {
        ReferenceContainer pos = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object skipTokenType = assignParameter(args, 1, false);
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        tokens.setObject(ZVal.assign(this.tokens));
        pos.setObject(this.skipRightWhitespace(env, pos.getObject()));
        if (ZVal.strictEqualityCheck(skipTokenType, "===", 382)) {
            return ZVal.assign(pos.getObject());
        }

        if (ZVal.strictNotEqualityCheck(
                tokens.arrayGet(env, pos.getObject(), 0), "!==", skipTokenType)) {
            throw ZVal.getException(env, new PHPException(env, "Encountered unexpected token"));
        }

        pos.setObject(ZVal.increment(pos.getObject()));
        return ZVal.assign(this.skipRightWhitespace(env, pos.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pos", typeHint = "int")
    public Object skipLeftWhitespace(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer pos = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        Object type = null;
        tokens.setObject(ZVal.assign(this.tokens));
        runtimeConverterBreakCount = 0;
        for (;
                ZVal.isGreaterThanOrEqualTo(pos.getObject(), ">=", 0);
                pos.setObject(ZVal.decrement(pos.getObject()))) {
            type = ZVal.assign(tokens.arrayGet(env, pos.getObject(), 0));
            if (ZVal.toBool(
                            ZVal.toBool(ZVal.strictNotEqualityCheck(type, "!==", 382))
                                    && ZVal.toBool(ZVal.strictNotEqualityCheck(type, "!==", 377)))
                    && ZVal.toBool(ZVal.strictNotEqualityCheck(type, "!==", 378))) {
                break;
            }
        }

        return ZVal.assign(pos.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pos", typeHint = "int")
    public Object skipRightWhitespace(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer pos = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object count = null;
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        Object type = null;
        tokens.setObject(ZVal.assign(this.tokens));
        runtimeConverterBreakCount = 0;
        for (count = function_count.f.env(env).call(tokens.getObject()).value();
                ZVal.isLessThan(pos.getObject(), '<', count);
                pos.setObject(ZVal.increment(pos.getObject()))) {
            type = ZVal.assign(tokens.arrayGet(env, pos.getObject(), 0));
            if (ZVal.toBool(
                            ZVal.toBool(ZVal.strictNotEqualityCheck(type, "!==", 382))
                                    && ZVal.toBool(ZVal.strictNotEqualityCheck(type, "!==", 377)))
                    && ZVal.toBool(ZVal.strictNotEqualityCheck(type, "!==", 378))) {
                break;
            }
        }

        return ZVal.assign(pos.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pos")
    @ConvertedParameter(index = 1, name = "findTokenType")
    public Object findRight(RuntimeEnv env, Object... args) {
        ReferenceContainer pos = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object findTokenType = assignParameter(args, 1, false);
        Object count = null;
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        Object type = null;
        tokens.setObject(ZVal.assign(this.tokens));
        for (count = function_count.f.env(env).call(tokens.getObject()).value();
                ZVal.isLessThan(pos.getObject(), '<', count);
                pos.setObject(ZVal.increment(pos.getObject()))) {
            type = ZVal.assign(tokens.arrayGet(env, pos.getObject(), 0));
            if (ZVal.strictEqualityCheck(type, "===", findTokenType)) {
                return ZVal.assign(pos.getObject());
            }
        }

        return -1;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pos", typeHint = "int")
    public Object getIndentationBefore(RuntimeEnv env, Object... args) {
        Object pos = assignParameter(args, 0, false);
        return ZVal.assign(new ReferenceClassProperty(this, "indentMap", env).arrayGet(env, pos));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from", typeHint = "int")
    @ConvertedParameter(index = 1, name = "to", typeHint = "int")
    @ConvertedParameter(index = 2, name = "indent", typeHint = "int")
    public Object getTokenCode(RuntimeEnv env, Object... args) {
        Object from = assignParameter(args, 0, false);
        Object to = assignParameter(args, 1, false);
        Object indent = assignParameter(args, 2, false);
        Object result = null;
        ReferenceContainer pos = new BasicReferenceContainer(null);
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        Object type = null;
        Object content = null;
        ReferenceContainer token = new BasicReferenceContainer(null);
        tokens.setObject(ZVal.assign(this.tokens));
        result = "";
        for (pos.setObject(ZVal.assign(from));
                ZVal.isLessThan(pos.getObject(), '<', to);
                pos.setObject(ZVal.increment(pos.getObject()))) {
            token.setObject(ZVal.assign(tokens.arrayGet(env, pos.getObject())));
            if (function_is_array.f.env(env).call(token.getObject()).getBool()) {
                type = ZVal.assign(token.arrayGet(env, 0));
                content = ZVal.assign(token.arrayGet(env, 1));
                if (ZVal.toBool(ZVal.strictEqualityCheck(type, "===", 323))
                        || ZVal.toBool(ZVal.strictEqualityCheck(type, "===", 322))) {
                    result = toStringR(result, env) + toStringR(content, env);

                } else {
                    if (ZVal.isLessThan(indent, '<', 0)) {
                        result =
                                toStringR(result, env)
                                        + toStringR(
                                                function_str_replace
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "\n"
                                                                        + toStringR(
                                                                                function_str_repeat
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                " ",
                                                                                                ZVal
                                                                                                        .minusSign(
                                                                                                                indent))
                                                                                        .value(),
                                                                                env),
                                                                "\n",
                                                                content)
                                                        .value(),
                                                env);

                    } else if (ZVal.isGreaterThan(indent, '>', 0)) {
                        result =
                                toStringR(result, env)
                                        + toStringR(
                                                function_str_replace
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "\n",
                                                                "\n"
                                                                        + toStringR(
                                                                                function_str_repeat
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                " ",
                                                                                                indent)
                                                                                        .value(),
                                                                                env),
                                                                content)
                                                        .value(),
                                                env);

                    } else {
                        result = toStringR(result, env) + toStringR(content, env);
                    }
                }

            } else {
                result = toStringR(result, env) + toStringR(token.getObject(), env);
            }
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    private Object calcIndentMap(RuntimeEnv env, Object... args) {
        Object indent = null;
        Object newlinePos = null;
        Object content = null;
        ReferenceContainer indentMap = new BasicReferenceContainer(null);
        ReferenceContainer token = new BasicReferenceContainer(null);
        indentMap.setObject(ZVal.newArray());
        indent = 0;
        for (ZPair zpairResult848 : ZVal.getIterable(this.tokens, env, true)) {
            token.setObject(ZVal.assign(zpairResult848.getValue()));
            indentMap.arrayAppend(env).set(indent);
            if (ZVal.strictEqualityCheck(token.arrayGet(env, 0), "===", 382)) {
                content = ZVal.assign(token.arrayGet(env, 1));
                newlinePos = NamespaceGlobal.strrpos.env(env).call(content, "\n").value();
                if (ZVal.strictNotEqualityCheck(false, "!==", newlinePos)) {
                    indent =
                            ZVal.subtract(
                                    ZVal.subtract(
                                            function_strlen.f.env(env).call(content).value(),
                                            newlinePos),
                                    1);
                }
            }
        }

        indentMap.arrayAppend(env).set(indent);
        return ZVal.assign(indentMap.getObject());
    }

    public static final Object CONST_class = "PhpParser\\Internal\\TokenStream";

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
                    .setName("PhpParser\\Internal\\TokenStream")
                    .setLookup(
                            TokenStream.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("indentMap", "tokens")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Internal/TokenStream.php")
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
