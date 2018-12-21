package com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Parser.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.UnclosedQuotedString;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.ExpectingATEXT;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.UnopenedComment;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.LocalTooLong;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.DotAtEnd;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.DotAtStart;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.classes.EmailLexer;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.CFWSWithFWS;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Parser.classes.Parser;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.ExpectingAT;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/egulias/email-validator/EmailValidator/Parser/LocalPart.php

*/

public class LocalPart extends Parser {

    public LocalPart(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == LocalPart.class) {
            this.__construct(env, args);
        }
    }

    public LocalPart(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "localPart")
    public Object parse(RuntimeEnv env, Object... args) {
        Object localPart = assignParameter(args, 0, false);
        Object parseDQuote = null;
        ReferenceContainer prev = new BasicReferenceContainer(null);
        Object closingQuote = null;
        ReferenceContainer openedParenthesis = new BasicReferenceContainer(null);
        parseDQuote = true;
        closingQuote = false;
        openedParenthesis.setObject(0);
        while (ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                new ReferenceClassProperty(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("lexer")
                                                        .value(),
                                                "token",
                                                env)
                                        .arrayGet(env, "type"),
                                "!==",
                                EmailLexer.CONST_S_AT))
                && ZVal.toBool(
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("lexer")
                                .getObject()
                                .accessProp(this, env)
                                .name("token")
                                .value())) {
            if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    new ReferenceClassProperty(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("lexer")
                                                            .value(),
                                                    "token",
                                                    env)
                                            .arrayGet(env, "type"),
                                    "===",
                                    EmailLexer.CONST_S_DOT))
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    env.callMethod(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("lexer")
                                                    .value(),
                                            "getPrevious",
                                            LocalPart.class)))) {
                throw ZVal.getException(env, new DotAtStart(env));
            }

            closingQuote = env.callMethod(this, "checkDQUOTE", LocalPart.class, closingQuote);
            if (ZVal.toBool(closingQuote) && ZVal.toBool(parseDQuote)) {
                parseDQuote = this.parseDoubleQuote(env);
            }

            if (ZVal.strictEqualityCheck(
                    new ReferenceClassProperty(
                                    toObjectR(this).accessProp(this, env).name("lexer").value(),
                                    "token",
                                    env)
                            .arrayGet(env, "type"),
                    "===",
                    EmailLexer.CONST_S_OPENPARENTHESIS)) {
                env.callMethod(this, "parseComments", LocalPart.class);
                openedParenthesis.setObject(
                        ZAssignment.add(
                                "+=",
                                openedParenthesis.getObject(),
                                env.callMethod(this, "getOpenedParenthesis", LocalPart.class)));
            }

            if (ZVal.strictEqualityCheck(
                    new ReferenceClassProperty(
                                    toObjectR(this).accessProp(this, env).name("lexer").value(),
                                    "token",
                                    env)
                            .arrayGet(env, "type"),
                    "===",
                    EmailLexer.CONST_S_CLOSEPARENTHESIS)) {
                if (ZVal.strictEqualityCheck(openedParenthesis.getObject(), "===", 0)) {
                    throw ZVal.getException(env, new UnopenedComment(env));

                } else {
                    openedParenthesis.setObject(ZVal.decrement(openedParenthesis.getObject()));
                }
            }

            env.callMethod(this, "checkConsecutiveDots", LocalPart.class);
            if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    new ReferenceClassProperty(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("lexer")
                                                            .value(),
                                                    "token",
                                                    env)
                                            .arrayGet(env, "type"),
                                    "===",
                                    EmailLexer.CONST_S_DOT))
                    && ZVal.toBool(
                            env.callMethod(
                                    toObjectR(this).accessProp(this, env).name("lexer").value(),
                                    "isNextToken",
                                    LocalPart.class,
                                    EmailLexer.CONST_S_AT))) {
                throw ZVal.getException(env, new DotAtEnd(env));
            }

            env.callMethod(this, "warnEscaping", LocalPart.class);
            this.isInvalidToken(
                    env,
                    toObjectR(this)
                            .accessProp(this, env)
                            .name("lexer")
                            .getObject()
                            .accessProp(this, env)
                            .name("token")
                            .value(),
                    closingQuote);
            if (ZVal.isTrue(env.callMethod(this, "isFWS", LocalPart.class))) {
                env.callMethod(this, "parseFWS", LocalPart.class);
            }

            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("lexer").value(),
                    "moveNext",
                    LocalPart.class);
        }

        prev.setObject(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("lexer").value(),
                        "getPrevious",
                        LocalPart.class));
        if (ZVal.isGreaterThan(
                function_strlen.f.env(env).call(prev.arrayGet(env, "value")).value(),
                '>',
                LocalTooLong.CONST_LOCAL_PART_LENGTH)) {
            new ReferenceClassProperty(this, "warnings", env)
                    .arrayAccess(env, LocalTooLong.CONST_CODE)
                    .set(new LocalTooLong(env));
        }

        return null;
    }

    @ConvertedMethod
    protected Object parseDoubleQuote(RuntimeEnv env, Object... args) {
        ReferenceContainer special = new BasicReferenceContainer(null);
        Object parseAgain = null;
        ReferenceContainer prev = new BasicReferenceContainer(null);
        ReferenceContainer invalid = new BasicReferenceContainer(null);
        Object setSpecialsWarning = null;
        parseAgain = true;
        special.setObject(
                ZVal.newArray(
                        new ZPair(EmailLexer.CONST_S_CR, true),
                        new ZPair(EmailLexer.CONST_S_HTAB, true),
                        new ZPair(EmailLexer.CONST_S_LF, true)));
        invalid.setObject(
                ZVal.newArray(
                        new ZPair(EmailLexer.CONST_C_NUL, true),
                        new ZPair(EmailLexer.CONST_S_HTAB, true),
                        new ZPair(EmailLexer.CONST_S_CR, true),
                        new ZPair(EmailLexer.CONST_S_LF, true)));
        setSpecialsWarning = true;
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("lexer").value(),
                "moveNext",
                LocalPart.class);
        while (ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                new ReferenceClassProperty(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("lexer")
                                                        .value(),
                                                "token",
                                                env)
                                        .arrayGet(env, "type"),
                                "!==",
                                EmailLexer.CONST_S_DQUOTE))
                && ZVal.toBool(
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("lexer")
                                .getObject()
                                .accessProp(this, env)
                                .name("token")
                                .value())) {
            parseAgain = false;
            if (ZVal.toBool(
                            arrayActionR(
                                    ArrayAction.ISSET,
                                    special,
                                    env,
                                    new ReferenceClassProperty(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("lexer")
                                                            .value(),
                                                    "token",
                                                    env)
                                            .arrayGet(env, "type")))
                    && ZVal.toBool(setSpecialsWarning)) {
                new ReferenceClassProperty(this, "warnings", env)
                        .arrayAccess(env, CFWSWithFWS.CONST_CODE)
                        .set(new CFWSWithFWS(env));
                setSpecialsWarning = false;
            }

            if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    new ReferenceClassProperty(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("lexer")
                                                            .value(),
                                                    "token",
                                                    env)
                                            .arrayGet(env, "type"),
                                    "===",
                                    EmailLexer.CONST_S_BACKSLASH))
                    && ZVal.toBool(
                            env.callMethod(
                                    toObjectR(this).accessProp(this, env).name("lexer").value(),
                                    "isNextToken",
                                    LocalPart.class,
                                    EmailLexer.CONST_S_DQUOTE))) {
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("lexer").value(),
                        "moveNext",
                        LocalPart.class);
            }

            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("lexer").value(),
                    "moveNext",
                    LocalPart.class);
            if (ZVal.toBool(!ZVal.isTrue(env.callMethod(this, "escaped", LocalPart.class)))
                    && ZVal.toBool(
                            arrayActionR(
                                    ArrayAction.ISSET,
                                    invalid,
                                    env,
                                    new ReferenceClassProperty(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("lexer")
                                                            .value(),
                                                    "token",
                                                    env)
                                            .arrayGet(env, "type")))) {
                throw ZVal.getException(env, new ExpectingATEXT(env));
            }
        }

        prev.setObject(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("lexer").value(),
                        "getPrevious",
                        LocalPart.class));
        if (ZVal.strictEqualityCheck(
                prev.arrayGet(env, "type"), "===", EmailLexer.CONST_S_BACKSLASH)) {
            if (!ZVal.isTrue(env.callMethod(this, "checkDQUOTE", LocalPart.class, false))) {
                throw ZVal.getException(env, new UnclosedQuotedString(env));
            }
        }

        if (ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("lexer").value(),
                                        "isNextToken",
                                        LocalPart.class,
                                        EmailLexer.CONST_S_AT)))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                prev.arrayGet(env, "type"), "!==", EmailLexer.CONST_S_BACKSLASH))) {
            throw ZVal.getException(env, new ExpectingAT(env));
        }

        return ZVal.assign(parseAgain);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    @ConvertedParameter(index = 1, name = "closingQuote")
    protected Object isInvalidToken(RuntimeEnv env, Object... args) {
        ReferenceContainer token = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object closingQuote = assignParameter(args, 1, false);
        Object forbidden = null;
        forbidden =
                ZVal.newArray(
                        new ZPair(0, EmailLexer.CONST_S_COMMA),
                        new ZPair(1, EmailLexer.CONST_S_CLOSEBRACKET),
                        new ZPair(2, EmailLexer.CONST_S_OPENBRACKET),
                        new ZPair(3, EmailLexer.CONST_S_GREATERTHAN),
                        new ZPair(4, EmailLexer.CONST_S_LOWERTHAN),
                        new ZPair(5, EmailLexer.CONST_S_COLON),
                        new ZPair(6, EmailLexer.CONST_S_SEMICOLON),
                        new ZPair(7, EmailLexer.CONST_INVALID));
        if (ZVal.toBool(
                        function_in_array
                                .f
                                .env(env)
                                .call(token.arrayGet(env, "type"), forbidden)
                                .value())
                && ZVal.toBool(!ZVal.isTrue(closingQuote))) {
            throw ZVal.getException(env, new ExpectingATEXT(env));
        }

        return null;
    }

    public static final Object CONST_class = "Egulias\\EmailValidator\\Parser\\LocalPart";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Parser.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Egulias\\EmailValidator\\Parser\\LocalPart")
                    .setLookup(
                            LocalPart.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("lexer", "openedParenthesis", "warnings")
                    .setFilename(
                            "vendor/egulias/email-validator/EmailValidator/Parser/LocalPart.php")
                    .addExtendsClass("Egulias\\EmailValidator\\Parser\\Parser")
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
