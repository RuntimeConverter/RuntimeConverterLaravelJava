package com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Parser.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.CharNotAllowed;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.CRLFAtTheEnd;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.AddressLiteral;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.ConsecutiveAt;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.ExpectingATEXT;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.ObsoleteDTEXT;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.DeprecatedComment;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.DotAtEnd;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.classes.EmailLexer;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.CFWSWithFWS;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Parser.classes.Parser;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.ExpectingDTEXT;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.IPV6Deprecated;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.IPV6MaxGroups;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.IPV6ColonEnd;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.IPV6DoubleColon;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.LabelTooLong;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.TLD;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.UnopenedComment;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.DomainLiteral;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.IPV6BadChar;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.DotAtStart;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.IPV6GroupCount;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.ExpectingDomainLiteralClose;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.NoDomainPart;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.DomainHyphened;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.CRNoLF;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.IPV6ColonStart;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.DomainTooLong;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.CommaInDomain;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/egulias/email-validator/EmailValidator/Parser/DomainPart.php

*/

public class DomainPart extends Parser {

    public Object domainPart = "";

    public DomainPart(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DomainPart.class) {
            this.__construct(env, args);
        }
    }

    public DomainPart(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "domainPart")
    public Object parse(RuntimeEnv env, Object... args) {
        Object domainPart = assignParameter(args, 0, false);
        Object domain = null;
        ReferenceContainer prev = new BasicReferenceContainer(null);
        Object length = null;
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("lexer").value(),
                "moveNext",
                DomainPart.class);
        if (ZVal.strictEqualityCheck(
                new ReferenceClassProperty(
                                toObjectR(this).accessProp(this, env).name("lexer").value(),
                                "token",
                                env)
                        .arrayGet(env, "type"),
                "===",
                EmailLexer.CONST_S_DOT)) {
            throw ZVal.getException(env, new DotAtStart(env));
        }

        if (ZVal.strictEqualityCheck(
                new ReferenceClassProperty(
                                toObjectR(this).accessProp(this, env).name("lexer").value(),
                                "token",
                                env)
                        .arrayGet(env, "type"),
                "===",
                EmailLexer.CONST_S_EMPTY)) {
            throw ZVal.getException(env, new NoDomainPart(env));
        }

        if (ZVal.strictEqualityCheck(
                new ReferenceClassProperty(
                                toObjectR(this).accessProp(this, env).name("lexer").value(),
                                "token",
                                env)
                        .arrayGet(env, "type"),
                "===",
                EmailLexer.CONST_S_HYPHEN)) {
            throw ZVal.getException(env, new DomainHyphened(env));
        }

        if (ZVal.strictEqualityCheck(
                new ReferenceClassProperty(
                                toObjectR(this).accessProp(this, env).name("lexer").value(),
                                "token",
                                env)
                        .arrayGet(env, "type"),
                "===",
                EmailLexer.CONST_S_OPENPARENTHESIS)) {
            new ReferenceClassProperty(this, "warnings", env)
                    .arrayAccess(env, DeprecatedComment.CONST_CODE)
                    .set(new DeprecatedComment(env));
            this.parseDomainComments(env);
        }

        domain = this.doParseDomainPart(env);
        prev.setObject(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("lexer").value(),
                        "getPrevious",
                        DomainPart.class));
        length = function_strlen.f.env(env).call(domain).value();
        if (ZVal.strictEqualityCheck(prev.arrayGet(env, "type"), "===", EmailLexer.CONST_S_DOT)) {
            throw ZVal.getException(env, new DotAtEnd(env));
        }

        if (ZVal.strictEqualityCheck(
                prev.arrayGet(env, "type"), "===", EmailLexer.CONST_S_HYPHEN)) {
            throw ZVal.getException(env, new DomainHyphened(env));
        }

        if (ZVal.isGreaterThan(length, '>', CONST_DOMAIN_MAX_LENGTH)) {
            new ReferenceClassProperty(this, "warnings", env)
                    .arrayAccess(env, DomainTooLong.CONST_CODE)
                    .set(new DomainTooLong(env));
        }

        if (ZVal.strictEqualityCheck(prev.arrayGet(env, "type"), "===", EmailLexer.CONST_S_CR)) {
            throw ZVal.getException(env, new CRLFAtTheEnd(env));
        }

        this.domainPart = domain;
        return null;
    }

    @ConvertedMethod
    public Object getDomainPart(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.domainPart);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "addressLiteral")
    @ConvertedParameter(
        index = 1,
        name = "maxGroups",
        defaultValue = "8",
        defaultValueType = "number"
    )
    public Object checkIPV6Tag(RuntimeEnv env, Object... args) {
        Object addressLiteral = assignParameter(args, 0, false);
        ReferenceContainer maxGroups = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == maxGroups.getObject()) {
            maxGroups.setObject(8);
        }
        Object groupCount = null;
        Object IPv6 = null;
        ReferenceContainer prev = new BasicReferenceContainer(null);
        Object colons = null;
        Object matchesIP = null;
        prev.setObject(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("lexer").value(),
                        "getPrevious",
                        DomainPart.class));
        if (ZVal.strictEqualityCheck(prev.arrayGet(env, "type"), "===", EmailLexer.CONST_S_COLON)) {
            new ReferenceClassProperty(this, "warnings", env)
                    .arrayAccess(env, IPV6ColonEnd.CONST_CODE)
                    .set(new IPV6ColonEnd(env));
        }

        IPv6 = function_substr.f.env(env).call(addressLiteral, 5).value();
        matchesIP = function_explode.f.env(env).call(":", IPv6).value();
        groupCount = function_count.f.env(env).call(matchesIP).value();
        colons = function_strpos.f.env(env).call(IPv6, "::").value();
        if (ZVal.strictNotEqualityCheck(
                function_count
                        .f
                        .env(env)
                        .call(
                                NamespaceGlobal.preg_grep
                                        .env(env)
                                        .call("/^[0-9A-Fa-f]{0,4}$/", matchesIP, 1)
                                        .value())
                        .value(),
                "!==",
                0)) {
            new ReferenceClassProperty(this, "warnings", env)
                    .arrayAccess(env, IPV6BadChar.CONST_CODE)
                    .set(new IPV6BadChar(env));
        }

        if (ZVal.strictEqualityCheck(colons, "===", false)) {
            if (ZVal.strictNotEqualityCheck(groupCount, "!==", maxGroups.getObject())) {
                new ReferenceClassProperty(this, "warnings", env)
                        .arrayAccess(env, IPV6GroupCount.CONST_CODE)
                        .set(new IPV6GroupCount(env));
            }

            return null;
        }

        if (ZVal.strictNotEqualityCheck(
                colons, "!==", NamespaceGlobal.strrpos.env(env).call(IPv6, "::").value())) {
            new ReferenceClassProperty(this, "warnings", env)
                    .arrayAccess(env, IPV6DoubleColon.CONST_CODE)
                    .set(new IPV6DoubleColon(env));
            return null;
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck(colons, "===", 0))
                || ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                colons,
                                "===",
                                ZVal.subtract(function_strlen.f.env(env).call(IPv6).value(), 2)))) {
            maxGroups.setObject(ZVal.increment(maxGroups.getObject()));
        }

        if (ZVal.isGreaterThan(groupCount, '>', maxGroups.getObject())) {
            new ReferenceClassProperty(this, "warnings", env)
                    .arrayAccess(env, IPV6MaxGroups.CONST_CODE)
                    .set(new IPV6MaxGroups(env));

        } else if (ZVal.strictEqualityCheck(groupCount, "===", maxGroups.getObject())) {
            new ReferenceClassProperty(this, "warnings", env)
                    .arrayAccess(env, IPV6Deprecated.CONST_CODE)
                    .set(new IPV6Deprecated(env));
        }

        return null;
    }

    @ConvertedMethod
    protected Object doParseDomainPart(RuntimeEnv env, Object... args) {
        Object domain = null;
        Object prev = null;
        ReferenceContainer tmpPrev = new BasicReferenceContainer(null);
        ReferenceContainer openedParenthesis = new BasicReferenceContainer(null);
        domain = "";
        openedParenthesis.setObject(0);
        do {
            prev =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("lexer").value(),
                            "getPrevious",
                            DomainPart.class);
            this.checkNotAllowedChars(
                    env,
                    toObjectR(this)
                            .accessProp(this, env)
                            .name("lexer")
                            .getObject()
                            .accessProp(this, env)
                            .name("token")
                            .value());
            if (ZVal.strictEqualityCheck(
                    new ReferenceClassProperty(
                                    toObjectR(this).accessProp(this, env).name("lexer").value(),
                                    "token",
                                    env)
                            .arrayGet(env, "type"),
                    "===",
                    EmailLexer.CONST_S_OPENPARENTHESIS)) {
                env.callMethod(this, "parseComments", DomainPart.class);
                openedParenthesis.setObject(
                        ZAssignment.add(
                                "+=",
                                openedParenthesis.getObject(),
                                env.callMethod(this, "getOpenedParenthesis", DomainPart.class)));
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("lexer").value(),
                        "moveNext",
                        DomainPart.class);
                tmpPrev.setObject(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("lexer").value(),
                                "getPrevious",
                                DomainPart.class));
                if (ZVal.strictEqualityCheck(
                        tmpPrev.arrayGet(env, "type"),
                        "===",
                        EmailLexer.CONST_S_CLOSEPARENTHESIS)) {
                    openedParenthesis.setObject(ZVal.decrement(openedParenthesis.getObject()));
                }
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

            env.callMethod(this, "checkConsecutiveDots", DomainPart.class);
            this.checkDomainPartExceptions(env, prev);
            if (ZVal.isTrue(this.hasBrackets(env))) {
                this.parseDomainLiteral(env);
            }

            this.checkLabelLength(env, prev);
            if (ZVal.isTrue(env.callMethod(this, "isFWS", DomainPart.class))) {
                env.callMethod(this, "parseFWS", DomainPart.class);
            }

            domain =
                    toStringR(domain, env)
                            + toStringR(
                                    new ReferenceClassProperty(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("lexer")
                                                            .value(),
                                                    "token",
                                                    env)
                                            .arrayGet(env, "value"),
                                    env);
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("lexer").value(),
                    "moveNext",
                    DomainPart.class);

        } while (toObjectR(this)
                .accessProp(this, env)
                .name("lexer")
                .getObject()
                .accessProp(this, env)
                .name("token")
                .getBool());

        return ZVal.assign(domain);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    private Object checkNotAllowedChars(RuntimeEnv env, Object... args) {
        ReferenceContainer token = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer notAllowed = new BasicReferenceContainer(null);
        notAllowed.setObject(
                ZVal.newArray(
                        new ZPair(EmailLexer.CONST_S_BACKSLASH, true),
                        new ZPair(EmailLexer.CONST_S_SLASH, true)));
        if (arrayActionR(ArrayAction.ISSET, notAllowed, env, token.arrayGet(env, "type"))) {
            throw ZVal.getException(env, new CharNotAllowed(env));
        }

        return null;
    }

    @ConvertedMethod
    protected Object parseDomainLiteral(RuntimeEnv env, Object... args) {
        Object lexer = null;
        if (ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("lexer").value(),
                        "isNextToken",
                        DomainPart.class,
                        EmailLexer.CONST_S_COLON))) {
            new ReferenceClassProperty(this, "warnings", env)
                    .arrayAccess(env, IPV6ColonStart.CONST_CODE)
                    .set(new IPV6ColonStart(env));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("lexer").value(),
                        "isNextToken",
                        DomainPart.class,
                        EmailLexer.CONST_S_IPV6TAG))) {
            lexer =
                    ZVal.assign(
                            ((RuntimeClassInterface)
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("lexer")
                                                    .value())
                                    .phpClone(env));
            env.callMethod(lexer, "moveNext", DomainPart.class);
            if (ZVal.isTrue(
                    env.callMethod(
                            lexer,
                            "isNextToken",
                            DomainPart.class,
                            EmailLexer.CONST_S_DOUBLECOLON))) {
                new ReferenceClassProperty(this, "warnings", env)
                        .arrayAccess(env, IPV6ColonStart.CONST_CODE)
                        .set(new IPV6ColonStart(env));
            }
        }

        return ZVal.assign(this.doParseDomainLiteral(env));
    }

    @ConvertedMethod
    protected Object doParseDomainLiteral(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object IPv6TAG = null;
        Object addressLiteral = null;
        IPv6TAG = false;
        addressLiteral = "";
        runtimeConverterBreakCount = 0;
        do {
            if (ZVal.strictEqualityCheck(
                    new ReferenceClassProperty(
                                    toObjectR(this).accessProp(this, env).name("lexer").value(),
                                    "token",
                                    env)
                            .arrayGet(env, "type"),
                    "===",
                    EmailLexer.CONST_C_NUL)) {
                throw ZVal.getException(env, new ExpectingDTEXT(env));
            }

            if (ZVal.toBool(
                            ZVal.toBool(
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
                                                    EmailLexer.CONST_INVALID))
                                    || ZVal.toBool(
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
                                                    EmailLexer.CONST_C_DEL)))
                    || ZVal.toBool(
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
                                    EmailLexer.CONST_S_LF))) {
                new ReferenceClassProperty(this, "warnings", env)
                        .arrayAccess(env, ObsoleteDTEXT.CONST_CODE)
                        .set(new ObsoleteDTEXT(env));
            }

            if (ZVal.isTrue(
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("lexer").value(),
                            "isNextTokenAny",
                            DomainPart.class,
                            ZVal.newArray(
                                    new ZPair(0, EmailLexer.CONST_S_OPENQBRACKET),
                                    new ZPair(1, EmailLexer.CONST_S_OPENBRACKET))))) {
                throw ZVal.getException(env, new ExpectingDTEXT(env));
            }

            if (ZVal.isTrue(
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("lexer").value(),
                            "isNextTokenAny",
                            DomainPart.class,
                            ZVal.newArray(
                                    new ZPair(0, EmailLexer.CONST_S_HTAB),
                                    new ZPair(1, EmailLexer.CONST_S_SP),
                                    new ZPair(
                                            2,
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
                                                    EmailLexer.CONST_CRLF)))))) {
                new ReferenceClassProperty(this, "warnings", env)
                        .arrayAccess(env, CFWSWithFWS.CONST_CODE)
                        .set(new CFWSWithFWS(env));
                env.callMethod(this, "parseFWS", DomainPart.class);
            }

            if (ZVal.isTrue(
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("lexer").value(),
                            "isNextToken",
                            DomainPart.class,
                            EmailLexer.CONST_S_CR))) {
                throw ZVal.getException(env, new CRNoLF(env));
            }

            if (ZVal.strictEqualityCheck(
                    new ReferenceClassProperty(
                                    toObjectR(this).accessProp(this, env).name("lexer").value(),
                                    "token",
                                    env)
                            .arrayGet(env, "type"),
                    "===",
                    EmailLexer.CONST_S_BACKSLASH)) {
                new ReferenceClassProperty(this, "warnings", env)
                        .arrayAccess(env, ObsoleteDTEXT.CONST_CODE)
                        .set(new ObsoleteDTEXT(env));
                addressLiteral =
                        toStringR(addressLiteral, env)
                                + toStringR(
                                        new ReferenceClassProperty(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("lexer")
                                                                .value(),
                                                        "token",
                                                        env)
                                                .arrayGet(env, "value"),
                                        env);
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("lexer").value(),
                        "moveNext",
                        DomainPart.class);
                env.callMethod(this, "validateQuotedPair", DomainPart.class);
            }

            if (ZVal.strictEqualityCheck(
                    new ReferenceClassProperty(
                                    toObjectR(this).accessProp(this, env).name("lexer").value(),
                                    "token",
                                    env)
                            .arrayGet(env, "type"),
                    "===",
                    EmailLexer.CONST_S_IPV6TAG)) {
                IPv6TAG = true;
            }

            if (ZVal.strictEqualityCheck(
                    new ReferenceClassProperty(
                                    toObjectR(this).accessProp(this, env).name("lexer").value(),
                                    "token",
                                    env)
                            .arrayGet(env, "type"),
                    "===",
                    EmailLexer.CONST_S_CLOSEQBRACKET)) {
                break;
            }

            addressLiteral =
                    toStringR(addressLiteral, env)
                            + toStringR(
                                    new ReferenceClassProperty(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("lexer")
                                                            .value(),
                                                    "token",
                                                    env)
                                            .arrayGet(env, "value"),
                                    env);

        } while (ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("lexer").value(),
                        "moveNext",
                        DomainPart.class)));

        addressLiteral = function_str_replace.f.env(env).call("[", "", addressLiteral).value();
        addressLiteral = this.checkIPV4Tag(env, addressLiteral);
        if (ZVal.strictEqualityCheck(false, "===", addressLiteral)) {
            return ZVal.assign(addressLiteral);
        }

        if (!ZVal.isTrue(IPv6TAG)) {
            new ReferenceClassProperty(this, "warnings", env)
                    .arrayAccess(env, DomainLiteral.CONST_CODE)
                    .set(new DomainLiteral(env));
            return ZVal.assign(addressLiteral);
        }

        new ReferenceClassProperty(this, "warnings", env)
                .arrayAccess(env, AddressLiteral.CONST_CODE)
                .set(new AddressLiteral(env));
        this.checkIPV6Tag(env, addressLiteral);
        return ZVal.assign(addressLiteral);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "addressLiteral")
    protected Object checkIPV4Tag(RuntimeEnv env, Object... args) {
        Object addressLiteral = assignParameter(args, 0, false);
        Object index = null;
        ReferenceContainer matchesIP = new BasicReferenceContainer(null);
        matchesIP.setObject(ZVal.newArray());
        if (ZVal.isGreaterThan(
                function_preg_match
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matchesIP))
                        .call(
                                "/\\b(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$/",
                                addressLiteral, matchesIP.getObject())
                        .value(),
                '>',
                0)) {
            index =
                    NamespaceGlobal.strrpos
                            .env(env)
                            .call(addressLiteral, matchesIP.arrayGet(env, 0))
                            .value();
            if (ZVal.strictEqualityCheck(index, "===", 0)) {
                new ReferenceClassProperty(this, "warnings", env)
                        .arrayAccess(env, AddressLiteral.CONST_CODE)
                        .set(new AddressLiteral(env));
                return ZVal.assign(false);
            }

            addressLiteral =
                    toStringR(
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(addressLiteral, 0, index)
                                            .value(),
                                    env)
                            + "0:0";
        }

        return ZVal.assign(addressLiteral);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prev")
    protected Object checkDomainPartExceptions(RuntimeEnv env, Object... args) {
        ReferenceContainer prev = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer invalidDomainTokens = new BasicReferenceContainer(null);
        invalidDomainTokens.setObject(
                ZVal.newArray(
                        new ZPair(EmailLexer.CONST_S_DQUOTE, true),
                        new ZPair(EmailLexer.CONST_S_SEMICOLON, true),
                        new ZPair(EmailLexer.CONST_S_GREATERTHAN, true),
                        new ZPair(EmailLexer.CONST_S_LOWERTHAN, true)));
        if (arrayActionR(
                ArrayAction.ISSET,
                invalidDomainTokens,
                env,
                new ReferenceClassProperty(
                                toObjectR(this).accessProp(this, env).name("lexer").value(),
                                "token",
                                env)
                        .arrayGet(env, "type"))) {
            throw ZVal.getException(env, new ExpectingATEXT(env));
        }

        if (ZVal.strictEqualityCheck(
                new ReferenceClassProperty(
                                toObjectR(this).accessProp(this, env).name("lexer").value(),
                                "token",
                                env)
                        .arrayGet(env, "type"),
                "===",
                EmailLexer.CONST_S_COMMA)) {
            throw ZVal.getException(env, new CommaInDomain(env));
        }

        if (ZVal.strictEqualityCheck(
                new ReferenceClassProperty(
                                toObjectR(this).accessProp(this, env).name("lexer").value(),
                                "token",
                                env)
                        .arrayGet(env, "type"),
                "===",
                EmailLexer.CONST_S_AT)) {
            throw ZVal.getException(env, new ConsecutiveAt(env));
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
                                EmailLexer.CONST_S_OPENQBRACKET))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                prev.arrayGet(env, "type"), "!==", EmailLexer.CONST_S_AT))) {
            throw ZVal.getException(env, new ExpectingATEXT(env));
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
                                EmailLexer.CONST_S_HYPHEN))
                && ZVal.toBool(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("lexer").value(),
                                "isNextToken",
                                DomainPart.class,
                                EmailLexer.CONST_S_DOT))) {
            throw ZVal.getException(env, new DomainHyphened(env));
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
                                DomainPart.class,
                                EmailLexer.CONST_GENERIC))) {
            throw ZVal.getException(env, new ExpectingATEXT(env));
        }

        return null;
    }

    @ConvertedMethod
    protected Object hasBrackets(RuntimeEnv env, Object... args) {
        Object e = null;
        if (ZVal.strictNotEqualityCheck(
                new ReferenceClassProperty(
                                toObjectR(this).accessProp(this, env).name("lexer").value(),
                                "token",
                                env)
                        .arrayGet(env, "type"),
                "!==",
                EmailLexer.CONST_S_OPENBRACKET)) {
            return ZVal.assign(false);
        }

        try {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("lexer").value(),
                    "find",
                    DomainPart.class,
                    EmailLexer.CONST_S_CLOSEBRACKET);
        } catch (ConvertedException convertedException6) {
            if (convertedException6.instanceOf(RuntimeException.class, "RuntimeException")) {
                e = convertedException6.getObject();
                throw ZVal.getException(env, new ExpectingDomainLiteralClose(env));
            } else {
                throw convertedException6;
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prev")
    protected Object checkLabelLength(RuntimeEnv env, Object... args) {
        ReferenceContainer prev = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.toBool(
                        ZVal.toBool(
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
                                        ZVal.strictEqualityCheck(
                                                prev.arrayGet(env, "type"),
                                                "===",
                                                EmailLexer.CONST_GENERIC)))
                && ZVal.toBool(
                        ZVal.isGreaterThan(
                                function_strlen
                                        .f
                                        .env(env)
                                        .call(prev.arrayGet(env, "value"))
                                        .value(),
                                '>',
                                63))) {
            new ReferenceClassProperty(this, "warnings", env)
                    .arrayAccess(env, LabelTooLong.CONST_CODE)
                    .set(new LabelTooLong(env));
        }

        return null;
    }

    @ConvertedMethod
    protected Object parseDomainComments(RuntimeEnv env, Object... args) {
        env.callMethod(this, "isUnclosedComment", DomainPart.class);
        while (!ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("lexer").value(),
                        "isNextToken",
                        DomainPart.class,
                        EmailLexer.CONST_S_CLOSEPARENTHESIS))) {
            env.callMethod(this, "warnEscaping", DomainPart.class);
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("lexer").value(),
                    "moveNext",
                    DomainPart.class);
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("lexer").value(),
                "moveNext",
                DomainPart.class);
        if (ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("lexer").value(),
                        "isNextToken",
                        DomainPart.class,
                        EmailLexer.CONST_S_DOT))) {
            throw ZVal.getException(env, new ExpectingATEXT(env));
        }

        return null;
    }

    @ConvertedMethod
    protected Object addTLDWarnings(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(
                new ReferenceClassProperty(this, "warnings", env)
                        .arrayGet(env, DomainLiteral.CONST_CODE))) {
            new ReferenceClassProperty(this, "warnings", env)
                    .arrayAccess(env, TLD.CONST_CODE)
                    .set(new TLD(env));
        }

        return null;
    }

    public static final Object CONST_DOMAIN_MAX_LENGTH = 254;

    public static final Object CONST_class = "Egulias\\EmailValidator\\Parser\\DomainPart";

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
                    .setName("Egulias\\EmailValidator\\Parser\\DomainPart")
                    .setLookup(
                            DomainPart.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("domainPart", "lexer", "openedParenthesis", "warnings")
                    .setFilename(
                            "vendor/egulias/email-validator/EmailValidator/Parser/DomainPart.php")
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
