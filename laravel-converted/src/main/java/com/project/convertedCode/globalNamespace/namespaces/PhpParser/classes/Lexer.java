package com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Comment.classes.Doc;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.ErrorHandler.classes.Throwing;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Parser.classes.Tokens;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Comment;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Error;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_set;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_error_get_last;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Lexer.php

*/

public class Lexer extends RuntimeClassBase {

    public Object code = null;

    public Object tokens = null;

    public Object pos = null;

    public Object line = null;

    public Object filePos = null;

    public Object prevCloseTagHasNewline = null;

    public Object tokenMap = null;

    public Object dropTokens = null;

    public Object usedAttributes = null;

    public Lexer(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Lexer.class) {
            this.__construct(env, args);
        }
    }

    public Lexer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 0, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        this.tokenMap = this.createTokenMap(env);
        this.dropTokens =
                NamespaceGlobal.array_fill_keys
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(0, 382),
                                        new ZPair(1, 379),
                                        new ZPair(2, 377),
                                        new ZPair(3, 378)),
                                1)
                        .value();
        options.setObject(
                ZAssignment.add(
                        "+=",
                        options.getObject(),
                        ZVal.newArray(
                                new ZPair(
                                        "usedAttributes",
                                        ZVal.arrayFromList("comments", "startLine", "endLine")))));
        this.usedAttributes =
                NamespaceGlobal.array_fill_keys
                        .env(env)
                        .call(options.arrayGet(env, "usedAttributes"), true)
                        .value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "errorHandler",
        typeHint = "PhpParser\\ErrorHandler",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object startLexing(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object errorHandler = assignParameter(args, 1, true);
        if (null == errorHandler) {
            errorHandler = ZVal.getNull();
        }
        Object scream = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", errorHandler)) {
            errorHandler = new Throwing(env);
        }

        this.code = code;
        this.pos = -1;
        this.line = 1;
        this.filePos = 0;
        this.prevCloseTagHasNewline = true;
        scream = function_ini_set.f.env(env).call("xdebug.scream", "0").value();
        NamespaceGlobal.error_clear_last.env(env).call();
        this.tokens = NamespaceGlobal.token_get_all.env(env).call(code).value();
        this.handleErrors(env, errorHandler);
        if (ZVal.strictNotEqualityCheck(false, "!==", scream)) {
            function_ini_set.f.env(env).call("xdebug.scream", scream);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "start")
    @ConvertedParameter(index = 1, name = "end")
    @ConvertedParameter(index = 2, name = "line")
    @ConvertedParameter(index = 3, name = "errorHandler", typeHint = "PhpParser\\ErrorHandler")
    private Object handleInvalidCharacterRange(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object start = assignParameter(args, 0, false);
        Object end = assignParameter(args, 1, false);
        Object line = assignParameter(args, 2, false);
        Object errorHandler = assignParameter(args, 3, false);
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object chr = null;
        Object errorMsg = null;
        runtimeConverterContinueCount = 0;
        for (i.setObject(ZVal.assign(start));
                ZVal.isLessThan(i.getObject(), '<', end);
                i.setObject(ZVal.increment(i.getObject()))) {
            chr =
                    ZVal.assign(
                            new ReferenceClassProperty(this, "code", env)
                                    .arrayGet(env, i.getObject()));
            if (ZVal.toBool(ZVal.strictEqualityCheck(chr, "===", "b"))
                    || ZVal.toBool(ZVal.strictEqualityCheck(chr, "===", "B"))) {
                continue;
            }

            if (ZVal.strictEqualityCheck(chr, "===", "\u0000")) {
                errorMsg = "Unexpected null byte";

            } else {
                errorMsg =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Unexpected character \"%s\" (ASCII %d)",
                                        chr, NamespaceGlobal.ord.env(env).call(chr).value())
                                .value();
            }

            env.callMethod(
                    errorHandler,
                    "handleError",
                    Lexer.class,
                    new Error(
                            env,
                            errorMsg,
                            ZVal.newArray(
                                    new ZPair("startLine", line),
                                    new ZPair("endLine", line),
                                    new ZPair("startFilePos", i.getObject()),
                                    new ZPair("endFilePos", i.getObject()))));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    private Object isUnterminatedComment(RuntimeEnv env, Object... args) {
        ReferenceContainer token = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        token.arrayGet(env, 0),
                                                                        "===",
                                                                        377))
                                                        || ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        token.arrayGet(env, 0),
                                                                        "===",
                                                                        378)))
                                        && ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        function_substr
                                                                .f
                                                                .env(env)
                                                                .call(token.arrayGet(env, 1), 0, 2)
                                                                .value(),
                                                        "===",
                                                        "/*")))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(token.arrayGet(env, 1), -2)
                                                .value(),
                                        "!==",
                                        "*/")));
    }

    @ConvertedMethod
    private Object errorMayHaveOccurred(RuntimeEnv env, Object... args) {
        if (function_defined.f.env(env).call("HHVM_VERSION").getBool()) {
            return ZVal.assign(true);
        }

        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        ZVal.getNull(), "!==", function_error_get_last.f.env(env).call().value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "errorHandler", typeHint = "PhpParser\\ErrorHandler")
    protected Object handleErrors(RuntimeEnv env, Object... args) {
        Object errorHandler = assignParameter(args, 0, false);
        ReferenceContainer lastToken = new BasicReferenceContainer(null);
        Object filePos = null;
        Object line = null;
        Object tokenLen = null;
        Object nextFilePos = null;
        ReferenceContainer comment = new BasicReferenceContainer(null);
        Object isDocComment = null;
        Object tokenValue = null;
        ReferenceContainer token = new BasicReferenceContainer(null);
        if (!ZVal.isTrue(this.errorMayHaveOccurred(env))) {
            return null;
        }

        filePos = 0;
        line = 1;
        for (ZPair zpairResult851 : ZVal.getIterable(this.tokens, env, true)) {
            token.setObject(ZVal.assign(zpairResult851.getValue()));
            tokenValue =
                    ZVal.assign(
                            function_is_string.f.env(env).call(token.getObject()).getBool()
                                    ? token.getObject()
                                    : token.arrayGet(env, 1));
            tokenLen = function_strlen.f.env(env).call(tokenValue).value();
            if (ZVal.strictNotEqualityCheck(
                    function_substr.f.env(env).call(this.code, filePos, tokenLen).value(),
                    "!==",
                    tokenValue)) {
                nextFilePos =
                        function_strpos.f.env(env).call(this.code, tokenValue, filePos).value();
                this.handleInvalidCharacterRange(env, filePos, nextFilePos, line, errorHandler);
                filePos = ZVal.assign(ZVal.toLong(nextFilePos));
            }

            filePos = ZAssignment.add("+=", filePos, tokenLen);
            line =
                    ZAssignment.add(
                            "+=",
                            line,
                            NamespaceGlobal.substr_count.env(env).call(tokenValue, "\n").value());
        }

        if (ZVal.strictNotEqualityCheck(
                filePos, "!==", function_strlen.f.env(env).call(this.code).value())) {
            if (ZVal.strictEqualityCheck(
                    function_substr.f.env(env).call(this.code, filePos, 2).value(), "===", "/*")) {
                comment.setObject(function_substr.f.env(env).call(this.code, filePos).value());
                env.callMethod(
                        errorHandler,
                        "handleError",
                        Lexer.class,
                        new Error(
                                env,
                                "Unterminated comment",
                                ZVal.newArray(
                                        new ZPair("startLine", line),
                                        new ZPair(
                                                "endLine",
                                                ZVal.add(
                                                        line,
                                                        NamespaceGlobal.substr_count
                                                                .env(env)
                                                                .call(comment.getObject(), "\n")
                                                                .value())),
                                        new ZPair("startFilePos", filePos),
                                        new ZPair(
                                                "endFilePos",
                                                ZVal.add(
                                                        filePos,
                                                        function_strlen
                                                                .f
                                                                .env(env)
                                                                .call(comment.getObject())
                                                                .value())))));
                isDocComment =
                        ZVal.toBool(arrayActionR(ArrayAction.ISSET, comment, env, 3))
                                && ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                comment.arrayGet(env, 3), "===", "*"));
                new ReferenceClassProperty(this, "tokens", env)
                        .arrayAppend(env)
                        .set(
                                ZVal.newArray(
                                        new ZPair(0, ZVal.isTrue(isDocComment) ? 378 : 377),
                                        new ZPair(1, comment.getObject()),
                                        new ZPair(2, line)));

            } else {
                this.handleInvalidCharacterRange(
                        env,
                        filePos,
                        function_strlen.f.env(env).call(this.code).value(),
                        line,
                        errorHandler);
            }

            return null;
        }

        if (ZVal.isGreaterThan(function_count.f.env(env).call(this.tokens).value(), '>', 0)) {
            lastToken.setObject(
                    ZVal.assign(
                            new ReferenceClassProperty(this, "tokens", env)
                                    .arrayGet(
                                            env,
                                            ZVal.subtract(
                                                    function_count
                                                            .f
                                                            .env(env)
                                                            .call(this.tokens)
                                                            .value(),
                                                    1))));
            if (ZVal.isTrue(this.isUnterminatedComment(env, lastToken.getObject()))) {
                env.callMethod(
                        errorHandler,
                        "handleError",
                        Lexer.class,
                        new Error(
                                env,
                                "Unterminated comment",
                                ZVal.newArray(
                                        new ZPair(
                                                "startLine",
                                                ZVal.subtract(
                                                        line,
                                                        NamespaceGlobal.substr_count
                                                                .env(env)
                                                                .call(
                                                                        lastToken.arrayGet(env, 1),
                                                                        "\n")
                                                                .value())),
                                        new ZPair("endLine", line),
                                        new ZPair(
                                                "startFilePos",
                                                ZVal.subtract(
                                                        filePos,
                                                        function_strlen
                                                                .f
                                                                .env(env)
                                                                .call(lastToken.arrayGet(env, 1))
                                                                .value())),
                                        new ZPair("endFilePos", filePos))));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "startAttributes",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "endAttributes",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getNextToken(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer value = assignParameterRef(runtimePassByReferenceArgs, args, 0, true);
        if (null == value.getObject()) {
            value.setObject(ZVal.getNull());
        }
        ReferenceContainer startAttributes =
                assignParameterRef(runtimePassByReferenceArgs, args, 1, true);
        if (null == startAttributes.getObject()) {
            startAttributes.setObject(ZVal.getNull());
        }
        ReferenceContainer endAttributes =
                assignParameterRef(runtimePassByReferenceArgs, args, 2, true);
        if (null == endAttributes.getObject()) {
            endAttributes.setObject(ZVal.getNull());
        }
        Object comment = null;
        Object id = null;
        ReferenceContainer token = new BasicReferenceContainer(null);
        startAttributes.setObject(ZVal.newArray());
        endAttributes.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        while (ZVal.isTrue(1)) {
            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "tokens", env),
                    env,
                    this.pos = ZVal.increment(this.pos))) {
                token.setObject(
                        ZVal.assign(
                                new ReferenceClassProperty(this, "tokens", env)
                                        .arrayGet(env, this.pos)));

            } else {
                token.setObject("\u0000");
            }

            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "usedAttributes", env),
                    env,
                    "startLine")) {
                startAttributes.arrayAccess(env, "startLine").set(this.line);
            }

            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "usedAttributes", env),
                    env,
                    "startTokenPos")) {
                startAttributes.arrayAccess(env, "startTokenPos").set(this.pos);
            }

            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "usedAttributes", env),
                    env,
                    "startFilePos")) {
                startAttributes.arrayAccess(env, "startFilePos").set(this.filePos);
            }

            if (function_is_string.f.env(env).call(token.getObject()).getBool()) {
                value.setObject(ZVal.assign(token.getObject()));
                if (arrayActionR(ArrayAction.ISSET, token, env, 1)) {
                    this.filePos = ZAssignment.add("+=", this.filePos, 2);
                    id = NamespaceGlobal.ord.env(env).call("\"").value();

                } else {
                    this.filePos = ZAssignment.add("+=", this.filePos, 1);
                    id = NamespaceGlobal.ord.env(env).call(token.getObject()).value();
                }

            } else if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "dropTokens", env),
                    env,
                    token.arrayGet(env, 0))) {
                value.setObject(ZVal.assign(token.arrayGet(env, 1)));
                id =
                        ZVal.assign(
                                new ReferenceClassProperty(this, "tokenMap", env)
                                        .arrayGet(env, token.arrayGet(env, 0)));
                if (ZVal.strictEqualityCheck(381, "===", token.arrayGet(env, 0))) {
                    this.prevCloseTagHasNewline =
                            ZVal.strictNotEqualityCheck(
                                    false,
                                    "!==",
                                    function_strpos
                                            .f
                                            .env(env)
                                            .call(token.arrayGet(env, 1), "\n")
                                            .value());

                } else if (ZVal.strictEqualityCheck(321, "===", token.arrayGet(env, 0))) {
                    startAttributes
                            .arrayAccess(env, "hasLeadingNewline")
                            .set(this.prevCloseTagHasNewline);
                }

                this.line =
                        ZAssignment.add(
                                "+=",
                                this.line,
                                NamespaceGlobal.substr_count
                                        .env(env)
                                        .call(value.getObject(), "\n")
                                        .value());
                this.filePos =
                        ZAssignment.add(
                                "+=",
                                this.filePos,
                                function_strlen.f.env(env).call(value.getObject()).value());

            } else {
                if (ZVal.toBool(ZVal.strictEqualityCheck(377, "===", token.arrayGet(env, 0)))
                        || ZVal.toBool(
                                ZVal.strictEqualityCheck(378, "===", token.arrayGet(env, 0)))) {
                    if (arrayActionR(
                            ArrayAction.ISSET,
                            new ReferenceClassProperty(this, "usedAttributes", env),
                            env,
                            "comments")) {
                        comment =
                                ZVal.assign(
                                        ZVal.strictEqualityCheck(378, "===", token.arrayGet(env, 0))
                                                ? new Doc(
                                                        env,
                                                        token.arrayGet(env, 1),
                                                        this.line,
                                                        this.filePos,
                                                        this.pos)
                                                : new Comment(
                                                        env,
                                                        token.arrayGet(env, 1),
                                                        this.line,
                                                        this.filePos,
                                                        this.pos));
                        startAttributes.arrayAppend(env, "comments").set(comment);
                    }
                }

                this.line =
                        ZAssignment.add(
                                "+=",
                                this.line,
                                NamespaceGlobal.substr_count
                                        .env(env)
                                        .call(token.arrayGet(env, 1), "\n")
                                        .value());
                this.filePos =
                        ZAssignment.add(
                                "+=",
                                this.filePos,
                                function_strlen.f.env(env).call(token.arrayGet(env, 1)).value());
                continue;
            }

            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "usedAttributes", env),
                    env,
                    "endLine")) {
                endAttributes.arrayAccess(env, "endLine").set(this.line);
            }

            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "usedAttributes", env),
                    env,
                    "endTokenPos")) {
                endAttributes.arrayAccess(env, "endTokenPos").set(this.pos);
            }

            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "usedAttributes", env),
                    env,
                    "endFilePos")) {
                endAttributes.arrayAccess(env, "endFilePos").set(ZVal.subtract(this.filePos, 1));
            }

            return ZVal.assign(id);
        }

        throw ZVal.getException(env, new RuntimeException(env, "Reached end of lexer loop"));
    }

    public Object getNextToken(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    public Object getTokens(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.tokens);
    }

    @ConvertedMethod
    public Object handleHaltCompiler(RuntimeEnv env, Object... args) {
        Object textAfter = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        textAfter = function_substr.f.env(env).call(this.code, this.filePos).value();
        if (!function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call("~^\\s*\\(\\s*\\)\\s*(?:;|\\?>\\r?\\n?)~", textAfter, matches.getObject())
                .getBool()) {
            throw ZVal.getException(
                    env, new Error(env, "__HALT_COMPILER must be followed by \"();\""));
        }

        this.pos = function_count.f.env(env).call(this.tokens).value();
        return ZVal.assign(
                function_substr
                        .f
                        .env(env)
                        .call(
                                textAfter,
                                function_strlen.f.env(env).call(matches.arrayGet(env, 0)).value())
                        .value());
    }

    @ConvertedMethod
    protected Object createTokenMap(RuntimeEnv env, Object... args) {
        ReferenceContainer tokenMap = new BasicReferenceContainer(null);
        Object name = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        tokenMap.setObject(ZVal.newArray());
        for (i.setObject(256);
                ZVal.isLessThan(i.getObject(), '<', 1000);
                i.setObject(ZVal.increment(i.getObject()))) {
            if (ZVal.strictEqualityCheck(387, "===", i.getObject())) {
                tokenMap.arrayAccess(env, i.getObject()).set(Tokens.CONST_T_PAAMAYIM_NEKUDOTAYIM);

            } else if (ZVal.strictEqualityCheck(380, "===", i.getObject())) {
                tokenMap.arrayAccess(env, i.getObject()).set(Tokens.CONST_T_ECHO);

            } else if (ZVal.strictEqualityCheck(381, "===", i.getObject())) {
                tokenMap.arrayAccess(env, i.getObject())
                        .set(NamespaceGlobal.ord.env(env).call(";").value());

            } else if (ZVal.strictNotEqualityCheck(
                    "UNKNOWN",
                    "!==",
                    name = NamespaceGlobal.token_name.env(env).call(i.getObject()).value())) {
                if (ZVal.strictEqualityCheck("T_HASHBANG", "===", name)) {
                    tokenMap.arrayAccess(env, i.getObject()).set(Tokens.CONST_T_INLINE_HTML);

                } else if (function_defined
                        .f
                        .env(env)
                        .call(
                                name =
                                        toStringR(Tokens.CONST_class, env)
                                                + "::"
                                                + toStringR(name, env))
                        .getBool()) {
                    tokenMap.arrayAccess(env, i.getObject())
                            .set(function_constant.f.env(env).call(name).value());
                }
            }
        }

        if (function_defined.f.env(env).call("T_ONUMBER").getBool()) {
            tokenMap.arrayAccess(env, function_constant.get(env, "T_ONUMBER"))
                    .set(Tokens.CONST_T_DNUMBER);
        }

        if (function_defined.f.env(env).call("T_COMPILER_HALT_OFFSET").getBool()) {
            tokenMap.arrayAccess(env, function_constant.get(env, "T_COMPILER_HALT_OFFSET"))
                    .set(Tokens.CONST_T_STRING);
        }

        return ZVal.assign(tokenMap.getObject());
    }

    public static final Object CONST_class = "PhpParser\\Lexer";

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
                    .setName("PhpParser\\Lexer")
                    .setLookup(
                            Lexer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "code",
                            "dropTokens",
                            "filePos",
                            "line",
                            "pos",
                            "prevCloseTagHasNewline",
                            "tokenMap",
                            "tokens",
                            "usedAttributes")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Lexer.php")
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
