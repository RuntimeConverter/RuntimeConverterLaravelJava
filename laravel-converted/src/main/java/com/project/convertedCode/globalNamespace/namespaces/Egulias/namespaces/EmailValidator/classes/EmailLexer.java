package com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.classes;

import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.UnexpectedValueException;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Common.namespaces.Lexer.classes.AbstractLexer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/egulias/email-validator/EmailValidator/EmailLexer.php

*/

public class EmailLexer extends AbstractLexer {

    public Object charValue =
            ZVal.newArray(
                    new ZPair("(", CONST_S_OPENPARENTHESIS),
                    new ZPair(")", CONST_S_CLOSEPARENTHESIS),
                    new ZPair("<", CONST_S_LOWERTHAN),
                    new ZPair(">", CONST_S_GREATERTHAN),
                    new ZPair("[", CONST_S_OPENBRACKET),
                    new ZPair("]", CONST_S_CLOSEBRACKET),
                    new ZPair(":", CONST_S_COLON),
                    new ZPair(";", CONST_S_SEMICOLON),
                    new ZPair("@", CONST_S_AT),
                    new ZPair("\\", CONST_S_BACKSLASH),
                    new ZPair("/", CONST_S_SLASH),
                    new ZPair(",", CONST_S_COMMA),
                    new ZPair(".", CONST_S_DOT),
                    new ZPair("\"", CONST_S_DQUOTE),
                    new ZPair("-", CONST_S_HYPHEN),
                    new ZPair("::", CONST_S_DOUBLECOLON),
                    new ZPair(" ", CONST_S_SP),
                    new ZPair("\t", CONST_S_HTAB),
                    new ZPair("\r", CONST_S_CR),
                    new ZPair("\n", CONST_S_LF),
                    new ZPair("\r\n", CONST_CRLF),
                    new ZPair("IPv6", CONST_S_IPV6TAG),
                    new ZPair("{", CONST_S_OPENQBRACKET),
                    new ZPair("}", CONST_S_CLOSEQBRACKET),
                    new ZPair("", CONST_S_EMPTY),
                    new ZPair("\\0", CONST_C_NUL));

    public Object hasInvalidTokens = false;

    public Object previous = null;

    public EmailLexer(RuntimeEnv env, Object... args) {
        super(env);
    }

    public EmailLexer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        this.hasInvalidTokens = false;
        super.reset(env);
        return null;
    }

    @ConvertedMethod
    public Object hasInvalidTokens(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.hasInvalidTokens);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    public Object find(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object search = null;
        search = ZVal.assign(((RuntimeClassInterface) this).phpClone(env));
        env.callMethod(search, "skipUntil", EmailLexer.class, type);
        if (!toObjectR(search).accessProp(this, env).name("lookahead").getBool()) {
            throw ZVal.getException(
                    env, new UnexpectedValueException(env, toStringR(type, env) + " not found"));
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object getPrevious(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.previous);
    }

    @ConvertedMethod
    public Object moveNext(RuntimeEnv env, Object... args) {
        this.previous = toObjectR(this).accessProp(this, env).name("token").value();
        return ZVal.assign(super.moveNext(env));
    }

    @ConvertedMethod
    protected Object getCatchablePatterns(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.arrayFromList(
                        "[a-zA-Z_]+[46]?",
                        "[^\\x00-\\x7F]",
                        "[0-9]+",
                        "\\r\\n",
                        "::",
                        "\\s+?",
                        "."));
    }

    @ConvertedMethod
    protected Object getNonCatchablePatterns(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("[\\xA0-\\xff]+"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object getType(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer value = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        if (ZVal.isTrue(this.isNullType(env, value.getObject()))) {
            return ZVal.assign(CONST_C_NUL);
        }

        if (ZVal.isTrue(this.isValid(env, value.getObject()))) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "charValue", env)
                            .arrayGet(env, value.getObject()));
        }

        if (ZVal.isTrue(this.isUTF8Invalid(env, value.getObject()))) {
            this.hasInvalidTokens = true;
            return ZVal.assign(CONST_INVALID);
        }

        return ZVal.assign(CONST_GENERIC);
    }

    public Object getType(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object isValid(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "charValue", env),
                env,
                value)) {
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object isNullType(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(value, "===", "\u0000")) {
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object isUTF8Invalid(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (function_preg_match.f.env(env).call("/\\p{Cc}+/u", value).getBool()) {
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    protected Object getModifiers(RuntimeEnv env, Object... args) {
        return "iu";
    }

    public static final Object CONST_C_DEL = 127;

    public static final Object CONST_C_NUL = 0;

    public static final Object CONST_S_AT = 64;

    public static final Object CONST_S_BACKSLASH = 92;

    public static final Object CONST_S_DOT = 46;

    public static final Object CONST_S_DQUOTE = 34;

    public static final Object CONST_S_OPENPARENTHESIS = 49;

    public static final Object CONST_S_CLOSEPARENTHESIS = 261;

    public static final Object CONST_S_OPENBRACKET = 262;

    public static final Object CONST_S_CLOSEBRACKET = 263;

    public static final Object CONST_S_HYPHEN = 264;

    public static final Object CONST_S_COLON = 265;

    public static final Object CONST_S_DOUBLECOLON = 266;

    public static final Object CONST_S_SP = 267;

    public static final Object CONST_S_HTAB = 268;

    public static final Object CONST_S_CR = 269;

    public static final Object CONST_S_LF = 270;

    public static final Object CONST_S_IPV6TAG = 271;

    public static final Object CONST_S_LOWERTHAN = 272;

    public static final Object CONST_S_GREATERTHAN = 273;

    public static final Object CONST_S_COMMA = 274;

    public static final Object CONST_S_SEMICOLON = 275;

    public static final Object CONST_S_OPENQBRACKET = 276;

    public static final Object CONST_S_CLOSEQBRACKET = 277;

    public static final Object CONST_S_SLASH = 278;

    public static final Object CONST_S_EMPTY = ZVal.getNull();

    public static final Object CONST_GENERIC = 300;

    public static final Object CONST_CRLF = 301;

    public static final Object CONST_INVALID = 302;

    public static final Object CONST_ASCII_INVALID_FROM = 127;

    public static final Object CONST_ASCII_INVALID_TO = 199;

    public static final Object CONST_class = "Egulias\\EmailValidator\\EmailLexer";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractLexer.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Egulias\\EmailValidator\\EmailLexer")
                    .setLookup(
                            EmailLexer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "charValue",
                            "hasInvalidTokens",
                            "input",
                            "lookahead",
                            "peek",
                            "position",
                            "previous",
                            "token",
                            "tokens")
                    .setFilename("vendor/egulias/email-validator/EmailValidator/EmailLexer.php")
                    .addExtendsClass("Doctrine\\Common\\Lexer\\AbstractLexer")
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
