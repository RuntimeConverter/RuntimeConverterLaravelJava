package com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Parser.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.ExpectedQPair;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.UnclosedQuotedString;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.CRLFAtTheEnd;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.UnclosedComment;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.ExpectingATEXT;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.Comment;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.QuotedPart;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.AtextAfterCFWS;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.classes.EmailLexer;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.CFWSNearAt;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.ConsecutiveDot;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.QuotedString;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.CFWSWithFWS;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.ExpectingCTEXT;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.CRNoLF;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.CRLFX2;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/egulias/email-validator/EmailValidator/Parser/Parser.php

*/

public abstract class Parser extends RuntimeClassBase {

    public Object warnings = ZVal.newArray();

    public Object lexer = null;

    public Object openedParenthesis = 0;

    public Parser(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Parser.class) {
            this.__construct(env, args);
        }
    }

    public Parser(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lexer", typeHint = "Egulias\\EmailValidator\\EmailLexer")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object lexer = assignParameter(args, 0, false);
        this.lexer = lexer;
        return null;
    }

    @ConvertedMethod
    public Object getWarnings(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.warnings);
    }

    @ConvertedMethod
    public Object getOpenedParenthesis(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.openedParenthesis);
    }

    @ConvertedMethod
    protected Object validateQuotedPair(RuntimeEnv env, Object... args) {
        if (!ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                new ReferenceClassProperty(this.lexer, "token", env)
                                        .arrayGet(env, "type"),
                                "===",
                                EmailLexer.CONST_INVALID))
                || ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                new ReferenceClassProperty(this.lexer, "token", env)
                                        .arrayGet(env, "type"),
                                "===",
                                EmailLexer.CONST_C_DEL))) {
            throw ZVal.getException(env, new ExpectedQPair(env));
        }

        new ReferenceClassProperty(this, "warnings", env)
                .arrayAccess(env, QuotedPart.CONST_CODE)
                .set(
                        new QuotedPart(
                                env,
                                handleReturnReference(
                                                env.callMethod(
                                                        this.lexer, "getPrevious", Parser.class))
                                        .arrayGet(env, "type"),
                                new ReferenceClassProperty(this.lexer, "token", env)
                                        .arrayGet(env, "type")));
        return null;
    }

    @ConvertedMethod
    protected Object parseComments(RuntimeEnv env, Object... args) {
        this.openedParenthesis = 1;
        this.isUnclosedComment(env);
        new ReferenceClassProperty(this, "warnings", env)
                .arrayAccess(env, Comment.CONST_CODE)
                .set(new Comment(env));
        while (!ZVal.isTrue(
                env.callMethod(
                        this.lexer,
                        "isNextToken",
                        Parser.class,
                        EmailLexer.CONST_S_CLOSEPARENTHESIS))) {
            if (ZVal.isTrue(
                    env.callMethod(
                            this.lexer,
                            "isNextToken",
                            Parser.class,
                            EmailLexer.CONST_S_OPENPARENTHESIS))) {
                this.openedParenthesis = ZVal.increment(this.openedParenthesis);
            }

            this.warnEscaping(env);
            env.callMethod(this.lexer, "moveNext", Parser.class);
        }

        env.callMethod(this.lexer, "moveNext", Parser.class);
        if (ZVal.isTrue(
                env.callMethod(
                        this.lexer,
                        "isNextTokenAny",
                        Parser.class,
                        ZVal.newArray(
                                new ZPair(0, EmailLexer.CONST_GENERIC),
                                new ZPair(1, EmailLexer.CONST_S_EMPTY))))) {
            throw ZVal.getException(env, new ExpectingATEXT(env));
        }

        if (ZVal.isTrue(
                env.callMethod(this.lexer, "isNextToken", Parser.class, EmailLexer.CONST_S_AT))) {
            new ReferenceClassProperty(this, "warnings", env)
                    .arrayAccess(env, CFWSNearAt.CONST_CODE)
                    .set(new CFWSNearAt(env));
        }

        return null;
    }

    @ConvertedMethod
    protected Object isUnclosedComment(RuntimeEnv env, Object... args) {
        Object e = null;
        try {
            env.callMethod(this.lexer, "find", Parser.class, EmailLexer.CONST_S_CLOSEPARENTHESIS);
            return ZVal.assign(true);
        } catch (ConvertedException convertedException7) {
            if (convertedException7.instanceOf(RuntimeException.class, "RuntimeException")) {
                e = convertedException7.getObject();
                throw ZVal.getException(env, new UnclosedComment(env));
            } else {
                throw convertedException7;
            }
        }
    }

    @ConvertedMethod
    protected Object parseFWS(RuntimeEnv env, Object... args) {
        ReferenceContainer previous = new BasicReferenceContainer(null);
        previous.setObject(env.callMethod(this.lexer, "getPrevious", Parser.class));
        this.checkCRLFInFWS(env);
        if (ZVal.strictEqualityCheck(
                new ReferenceClassProperty(this.lexer, "token", env).arrayGet(env, "type"),
                "===",
                EmailLexer.CONST_S_CR)) {
            throw ZVal.getException(env, new CRNoLF(env));
        }

        if (ZVal.toBool(
                        env.callMethod(
                                this.lexer, "isNextToken", Parser.class, EmailLexer.CONST_GENERIC))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                previous.arrayGet(env, "type"), "!==", EmailLexer.CONST_S_AT))) {
            throw ZVal.getException(env, new AtextAfterCFWS(env));
        }

        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                new ReferenceClassProperty(this.lexer, "token", env)
                                        .arrayGet(env, "type"),
                                "===",
                                EmailLexer.CONST_S_LF))
                || ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                new ReferenceClassProperty(this.lexer, "token", env)
                                        .arrayGet(env, "type"),
                                "===",
                                EmailLexer.CONST_C_NUL))) {
            throw ZVal.getException(env, new ExpectingCTEXT(env));
        }

        if (ZVal.toBool(
                        env.callMethod(
                                this.lexer, "isNextToken", Parser.class, EmailLexer.CONST_S_AT))
                || ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                previous.arrayGet(env, "type"), "===", EmailLexer.CONST_S_AT))) {
            new ReferenceClassProperty(this, "warnings", env)
                    .arrayAccess(env, CFWSNearAt.CONST_CODE)
                    .set(new CFWSNearAt(env));

        } else {
            new ReferenceClassProperty(this, "warnings", env)
                    .arrayAccess(env, CFWSWithFWS.CONST_CODE)
                    .set(new CFWSWithFWS(env));
        }

        return null;
    }

    @ConvertedMethod
    protected Object checkConsecutiveDots(RuntimeEnv env, Object... args) {
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                new ReferenceClassProperty(this.lexer, "token", env)
                                        .arrayGet(env, "type"),
                                "===",
                                EmailLexer.CONST_S_DOT))
                && ZVal.toBool(
                        env.callMethod(
                                this.lexer, "isNextToken", Parser.class, EmailLexer.CONST_S_DOT))) {
            throw ZVal.getException(env, new ConsecutiveDot(env));
        }

        return null;
    }

    @ConvertedMethod
    protected Object isFWS(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.escaped(env))) {
            return ZVal.assign(false);
        }

        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.toBool(
                                                                        ZVal.strictEqualityCheck(
                                                                                new ReferenceClassProperty(
                                                                                                this
                                                                                                        .lexer,
                                                                                                "token",
                                                                                                env)
                                                                                        .arrayGet(
                                                                                                env,
                                                                                                "type"),
                                                                                "===",
                                                                                EmailLexer
                                                                                        .CONST_S_SP))
                                                                || ZVal.toBool(
                                                                        ZVal.strictEqualityCheck(
                                                                                new ReferenceClassProperty(
                                                                                                this
                                                                                                        .lexer,
                                                                                                "token",
                                                                                                env)
                                                                                        .arrayGet(
                                                                                                env,
                                                                                                "type"),
                                                                                "===",
                                                                                EmailLexer
                                                                                        .CONST_S_HTAB)))
                                                || ZVal.toBool(
                                                        ZVal.strictEqualityCheck(
                                                                new ReferenceClassProperty(
                                                                                this.lexer,
                                                                                "token",
                                                                                env)
                                                                        .arrayGet(env, "type"),
                                                                "===",
                                                                EmailLexer.CONST_S_CR)))
                                || ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                new ReferenceClassProperty(this.lexer, "token", env)
                                                        .arrayGet(env, "type"),
                                                "===",
                                                EmailLexer.CONST_S_LF)))
                || ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                new ReferenceClassProperty(this.lexer, "token", env)
                                        .arrayGet(env, "type"),
                                "===",
                                EmailLexer.CONST_CRLF))) {
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    protected Object escaped(RuntimeEnv env, Object... args) {
        ReferenceContainer previous = new BasicReferenceContainer(null);
        previous.setObject(env.callMethod(this.lexer, "getPrevious", Parser.class));
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                previous.arrayGet(env, "type"),
                                "===",
                                EmailLexer.CONST_S_BACKSLASH))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                new ReferenceClassProperty(this.lexer, "token", env)
                                        .arrayGet(env, "type"),
                                "!==",
                                EmailLexer.CONST_GENERIC))) {
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    protected Object warnEscaping(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck(
                new ReferenceClassProperty(this.lexer, "token", env).arrayGet(env, "type"),
                "!==",
                EmailLexer.CONST_S_BACKSLASH)) {
            return ZVal.assign(false);
        }

        if (ZVal.isTrue(
                env.callMethod(
                        this.lexer, "isNextToken", Parser.class, EmailLexer.CONST_GENERIC))) {
            throw ZVal.getException(env, new ExpectingATEXT(env));
        }

        if (!ZVal.isTrue(
                env.callMethod(
                        this.lexer,
                        "isNextTokenAny",
                        Parser.class,
                        ZVal.newArray(
                                new ZPair(0, EmailLexer.CONST_S_SP),
                                new ZPair(1, EmailLexer.CONST_S_HTAB),
                                new ZPair(2, EmailLexer.CONST_C_DEL))))) {
            return ZVal.assign(false);
        }

        new ReferenceClassProperty(this, "warnings", env)
                .arrayAccess(env, QuotedPart.CONST_CODE)
                .set(
                        new QuotedPart(
                                env,
                                handleReturnReference(
                                                env.callMethod(
                                                        this.lexer, "getPrevious", Parser.class))
                                        .arrayGet(env, "type"),
                                new ReferenceClassProperty(this.lexer, "token", env)
                                        .arrayGet(env, "type")));
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "hasClosingQuote")
    protected Object checkDQUOTE(RuntimeEnv env, Object... args) {
        Object hasClosingQuote = assignParameter(args, 0, false);
        ReferenceContainer previous = new BasicReferenceContainer(null);
        Object e = null;
        if (ZVal.strictNotEqualityCheck(
                new ReferenceClassProperty(this.lexer, "token", env).arrayGet(env, "type"),
                "!==",
                EmailLexer.CONST_S_DQUOTE)) {
            return ZVal.assign(hasClosingQuote);
        }

        if (ZVal.isTrue(hasClosingQuote)) {
            return ZVal.assign(hasClosingQuote);
        }

        previous.setObject(env.callMethod(this.lexer, "getPrevious", Parser.class));
        if (ZVal.toBool(
                        env.callMethod(
                                this.lexer, "isNextToken", Parser.class, EmailLexer.CONST_GENERIC))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                previous.arrayGet(env, "type"), "===", EmailLexer.CONST_GENERIC))) {
            throw ZVal.getException(env, new ExpectingATEXT(env));
        }

        try {
            env.callMethod(this.lexer, "find", Parser.class, EmailLexer.CONST_S_DQUOTE);
            hasClosingQuote = true;
        } catch (ConvertedException convertedException8) {
            if (convertedException8.instanceOf(PHPException.class, "Exception")) {
                e = convertedException8.getObject();
                throw ZVal.getException(env, new UnclosedQuotedString(env));
            } else {
                throw convertedException8;
            }
        }

        new ReferenceClassProperty(this, "warnings", env)
                .arrayAccess(env, QuotedString.CONST_CODE)
                .set(
                        new QuotedString(
                                env,
                                previous.arrayGet(env, "value"),
                                new ReferenceClassProperty(this.lexer, "token", env)
                                        .arrayGet(env, "value")));
        return ZVal.assign(hasClosingQuote);
    }

    @ConvertedMethod
    protected Object checkCRLFInFWS(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck(
                new ReferenceClassProperty(this.lexer, "token", env).arrayGet(env, "type"),
                "!==",
                EmailLexer.CONST_CRLF)) {
            return null;
        }

        if (!ZVal.isTrue(
                env.callMethod(
                        this.lexer,
                        "isNextTokenAny",
                        Parser.class,
                        ZVal.newArray(
                                new ZPair(0, EmailLexer.CONST_S_SP),
                                new ZPair(1, EmailLexer.CONST_S_HTAB))))) {
            throw ZVal.getException(env, new CRLFX2(env));
        }

        if (!ZVal.isTrue(
                env.callMethod(
                        this.lexer,
                        "isNextTokenAny",
                        Parser.class,
                        ZVal.newArray(
                                new ZPair(0, EmailLexer.CONST_S_SP),
                                new ZPair(1, EmailLexer.CONST_S_HTAB))))) {
            throw ZVal.getException(env, new CRLFAtTheEnd(env));
        }

        return null;
    }

    public static final Object CONST_class = "Egulias\\EmailValidator\\Parser\\Parser";

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
                    .setName("Egulias\\EmailValidator\\Parser\\Parser")
                    .setLookup(
                            Parser.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("lexer", "openedParenthesis", "warnings")
                    .setFilename("vendor/egulias/email-validator/EmailValidator/Parser/Parser.php")
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
