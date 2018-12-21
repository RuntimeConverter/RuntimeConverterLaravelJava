package com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.classes.String_;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Variable;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.ArrayDimFetch;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.InlineHTML;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Identifier;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.HaltCompiler;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.ErrorHandler.classes.Throwing;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Namespace_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Declare_;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.classes.LNumber;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Error;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Nop;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Parser;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.StaticPropertyFetch;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.VarLikeIdentifier;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.Class_;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RangeException;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.StaticCall;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/ParserAbstract.php

*/

public abstract class ParserAbstract extends RuntimeClassBase implements Parser {

    public Object tokenToSymbolMapSize = null;

    public Object actionTableSize = null;

    public Object gotoTableSize = null;

    public Object invalidSymbol = null;

    public Object errorSymbol = null;

    public Object defaultAction = null;

    public Object unexpectedTokenRule = null;

    public Object YY2TBLSTATE = null;

    public Object numNonLeafStates = null;

    public Object tokenToSymbol = null;

    public Object symbolToName = null;

    public Object productions = null;

    public Object actionBase = null;

    public Object action = null;

    public Object actionCheck = null;

    public Object actionDefault = null;

    public Object reduceCallbacks = null;

    public Object gotoBase = null;

    public Object _pGoto = null;

    public Object gotoCheck = null;

    public Object gotoDefault = null;

    public Object ruleToNonTerminal = null;

    public Object ruleToLength = null;

    public Object lexer = null;

    public Object semValue = null;

    public Object semStack = null;

    public Object startAttributeStack = null;

    public Object endAttributeStack = null;

    public Object endAttributes = null;

    public Object lookaheadStartAttributes = null;

    public Object errorHandler = null;

    public Object errorState = null;

    public ParserAbstract(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ParserAbstract.class) {
            this.__construct(env, args);
        }
    }

    public ParserAbstract(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lexer", typeHint = "PhpParser\\Lexer")
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object lexer = assignParameter(args, 0, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        this.lexer = lexer;
        if (arrayActionR(ArrayAction.ISSET, options, env, "throwOnError")) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            "\"throwOnError\" is no longer supported, use \"errorHandler\" instead"));
        }

        env.callMethod(this, "initReduceCallbacks", ParserAbstract.class);
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
    public Object parse(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object errorHandler = assignParameter(args, 1, true);
        if (null == errorHandler) {
            errorHandler = ZVal.getNull();
        }
        Object result = null;
        Object ternaryExpressionTemp = null;
        this.errorHandler =
                ZVal.isTrue(ternaryExpressionTemp = errorHandler)
                        ? ternaryExpressionTemp
                        : new Throwing(env);
        env.callMethod(this.lexer, "startLexing", ParserAbstract.class, code, this.errorHandler);
        result = this.doParse(env);
        this.startAttributeStack = ZVal.newArray();
        this.endAttributeStack = ZVal.newArray();
        this.semStack = ZVal.newArray();
        this.semValue = ZVal.getNull();
        return ZVal.assign(result);
    }

    @ConvertedMethod
    protected Object doParse(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object msg = null;
        Object symbol = null;
        Object tokenId = null;
        Object e = null;
        Object lastEndAttributes = null;
        ReferenceContainer startAttributes = new BasicReferenceContainer(null);
        ReferenceContainer endAttributes = new BasicReferenceContainer(null);
        ReferenceContainer stackPos = new BasicReferenceContainer(null);
        Object rule = null;
        ReferenceContainer stateStack = new BasicReferenceContainer(null);
        Object action = null;
        Object state = null;
        Object idx = null;
        ReferenceContainer tokenValue = new BasicReferenceContainer(null);
        Object nonTerminal = null;
        symbol = ZVal.assign(CONST_SYMBOL_NONE);
        startAttributes.setObject(ZVal.newArray());
        endAttributes.setObject(ZVal.newArray());
        this.endAttributes = endAttributes.getObject();
        this.startAttributeStack = ZVal.newArray();
        this.endAttributeStack = ZVal.newArray(new ZPair(0, endAttributes.getObject()));
        state = 0;
        stateStack.setObject(ZVal.newArray(new ZPair(0, state)));
        this.semStack = ZVal.newArray();
        stackPos.setObject(0);
        this.errorState = 0;
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (; ZVal.isTrue(true); ) {
            if (ZVal.strictEqualityCheck(
                    new ReferenceClassProperty(this, "actionBase", env).arrayGet(env, state),
                    "===",
                    0)) {
                rule =
                        ZVal.assign(
                                new ReferenceClassProperty(this, "actionDefault", env)
                                        .arrayGet(env, state));

            } else {
                if (ZVal.strictEqualityCheck(symbol, "===", CONST_SYMBOL_NONE)) {
                    tokenId =
                            env.callMethod(
                                    this.lexer,
                                    new RuntimeArgsWithReferences()
                                            .add(0, tokenValue)
                                            .add(1, startAttributes)
                                            .add(2, endAttributes),
                                    "getNextToken",
                                    ParserAbstract.class,
                                    tokenValue.getObject(),
                                    startAttributes.getObject(),
                                    endAttributes.getObject());
                    symbol =
                            ZVal.assign(
                                    ZVal.toBool(ZVal.isGreaterThanOrEqualTo(tokenId, ">=", 0))
                                                    && ZVal.toBool(
                                                            ZVal.isLessThan(
                                                                    tokenId,
                                                                    '<',
                                                                    this.tokenToSymbolMapSize))
                                            ? new ReferenceClassProperty(this, "tokenToSymbol", env)
                                                    .arrayGet(env, tokenId)
                                            : this.invalidSymbol);
                    if (ZVal.strictEqualityCheck(symbol, "===", this.invalidSymbol)) {
                        throw ZVal.getException(
                                env,
                                new RangeException(
                                        env,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "The lexer returned an invalid token (id=%d, value=%s)",
                                                        tokenId, tokenValue.getObject())
                                                .value()));
                    }

                    new ReferenceClassProperty(this, "startAttributeStack", env)
                            .arrayAccess(env, ZVal.add(stackPos.getObject(), 1))
                            .set(startAttributes.getObject());
                    new ReferenceClassProperty(this, "endAttributeStack", env)
                            .arrayAccess(env, ZVal.add(stackPos.getObject(), 1))
                            .set(endAttributes.getObject());
                    this.lookaheadStartAttributes = startAttributes.getObject();
                }

                idx =
                        ZVal.add(
                                new ReferenceClassProperty(this, "actionBase", env)
                                        .arrayGet(env, state),
                                symbol);
                if (ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.toBool(
                                                                                ZVal
                                                                                        .isGreaterThanOrEqualTo(
                                                                                                idx,
                                                                                                ">=",
                                                                                                0))
                                                                        && ZVal.toBool(
                                                                                ZVal.isLessThan(
                                                                                        idx,
                                                                                        '<',
                                                                                        this
                                                                                                .actionTableSize)))
                                                        && ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        new ReferenceClassProperty(
                                                                                        this,
                                                                                        "actionCheck",
                                                                                        env)
                                                                                .arrayGet(env, idx),
                                                                        "===",
                                                                        symbol)))
                                        || ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.toBool(
                                                                                ZVal.toBool(
                                                                                                ZVal
                                                                                                        .isLessThan(
                                                                                                                state,
                                                                                                                '<',
                                                                                                                this
                                                                                                                        .YY2TBLSTATE))
                                                                                        && ZVal
                                                                                                .toBool(
                                                                                                        ZVal
                                                                                                                .isGreaterThanOrEqualTo(
                                                                                                                        idx =
                                                                                                                                ZVal
                                                                                                                                        .add(
                                                                                                                                                new ReferenceClassProperty(
                                                                                                                                                                this,
                                                                                                                                                                "actionBase",
                                                                                                                                                                env)
                                                                                                                                                        .arrayGet(
                                                                                                                                                                env,
                                                                                                                                                                ZVal
                                                                                                                                                                        .add(
                                                                                                                                                                                state,
                                                                                                                                                                                this
                                                                                                                                                                                        .numNonLeafStates)),
                                                                                                                                                symbol),
                                                                                                                        ">=",
                                                                                                                        0)))
                                                                        && ZVal.toBool(
                                                                                ZVal.isLessThan(
                                                                                        idx,
                                                                                        '<',
                                                                                        this
                                                                                                .actionTableSize)))
                                                        && ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        new ReferenceClassProperty(
                                                                                        this,
                                                                                        "actionCheck",
                                                                                        env)
                                                                                .arrayGet(env, idx),
                                                                        "===",
                                                                        symbol))))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        action =
                                                ZVal.assign(
                                                        new ReferenceClassProperty(
                                                                        this, "action", env)
                                                                .arrayGet(env, idx)),
                                        "!==",
                                        this.defaultAction))) {
                    if (ZVal.isGreaterThan(action, '>', 0)) {
                        stackPos.setObject(ZVal.increment(stackPos.getObject()));
                        stateStack
                                .arrayAccess(env, stackPos.getObject())
                                .set(state = ZVal.assign(action));
                        new ReferenceClassProperty(this, "semStack", env)
                                .arrayAccess(env, stackPos.getObject())
                                .set(tokenValue.getObject());
                        new ReferenceClassProperty(this, "startAttributeStack", env)
                                .arrayAccess(env, stackPos.getObject())
                                .set(startAttributes.getObject());
                        new ReferenceClassProperty(this, "endAttributeStack", env)
                                .arrayAccess(env, stackPos.getObject())
                                .set(endAttributes.getObject());
                        this.endAttributes = endAttributes.getObject();
                        symbol = ZVal.assign(CONST_SYMBOL_NONE);
                        if (ZVal.isTrue(this.errorState)) {
                            this.errorState = ZVal.decrement(this.errorState);
                        }

                        if (ZVal.isLessThan(action, '<', this.numNonLeafStates)) {
                            continue;
                        }

                        rule = ZVal.subtract(action, this.numNonLeafStates);

                    } else {
                        rule = ZVal.minusSign(action);
                    }

                } else {
                    rule =
                            ZVal.assign(
                                    new ReferenceClassProperty(this, "actionDefault", env)
                                            .arrayGet(env, state));
                }
            }

            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            for (; ZVal.isTrue(true); ) {
                if (ZVal.strictEqualityCheck(rule, "===", 0)) {
                    return ZVal.assign(this.semValue);

                } else if (ZVal.strictNotEqualityCheck(rule, "!==", this.unexpectedTokenRule)) {
                    try {
                        env.callFunctionDynamic(
                                new ReferenceClassProperty(this, "reduceCallbacks", env)
                                        .arrayGet(env, rule),
                                new RuntimeArgsWithReferences().add(0, stackPos),
                                stackPos.getObject());
                    } catch (ConvertedException convertedException98) {
                        if (convertedException98.instanceOf(Error.class, "PhpParser\\Error")) {
                            e = convertedException98.getObject();
                            if (ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    -1,
                                                    "===",
                                                    env.callMethod(
                                                            e,
                                                            "getStartLine",
                                                            ParserAbstract.class)))
                                    && ZVal.toBool(
                                            arrayActionR(
                                                    ArrayAction.ISSET,
                                                    startAttributes,
                                                    env,
                                                    "startLine"))) {
                                env.callMethod(
                                        e,
                                        "setStartLine",
                                        ParserAbstract.class,
                                        startAttributes.arrayGet(env, "startLine"));
                            }

                            this.emitError(env, e);
                            return ZVal.assign(ZVal.getNull());
                        } else {
                            throw convertedException98;
                        }
                    }

                    lastEndAttributes =
                            ZVal.assign(
                                    new ReferenceClassProperty(this, "endAttributeStack", env)
                                            .arrayGet(env, stackPos.getObject()));
                    stackPos.setObject(
                            ZAssignment.subtract(
                                    "-=",
                                    stackPos.getObject(),
                                    new ReferenceClassProperty(this, "ruleToLength", env)
                                            .arrayGet(env, rule)));
                    nonTerminal =
                            ZVal.assign(
                                    new ReferenceClassProperty(this, "ruleToNonTerminal", env)
                                            .arrayGet(env, rule));
                    idx =
                            ZVal.add(
                                    new ReferenceClassProperty(this, "gotoBase", env)
                                            .arrayGet(env, nonTerminal),
                                    stateStack.arrayGet(env, stackPos.getObject()));
                    if (ZVal.toBool(
                                    ZVal.toBool(ZVal.isGreaterThanOrEqualTo(idx, ">=", 0))
                                            && ZVal.toBool(
                                                    ZVal.isLessThan(idx, '<', this.gotoTableSize)))
                            && ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            new ReferenceClassProperty(this, "gotoCheck", env)
                                                    .arrayGet(env, idx),
                                            "===",
                                            nonTerminal))) {
                        state =
                                ZVal.assign(
                                        new ReferenceClassProperty(this, "goto", env)
                                                .arrayGet(env, idx));

                    } else {
                        state =
                                ZVal.assign(
                                        new ReferenceClassProperty(this, "gotoDefault", env)
                                                .arrayGet(env, nonTerminal));
                    }

                    stackPos.setObject(ZVal.increment(stackPos.getObject()));
                    stateStack.arrayAccess(env, stackPos.getObject()).set(state);
                    new ReferenceClassProperty(this, "semStack", env)
                            .arrayAccess(env, stackPos.getObject())
                            .set(this.semValue);
                    new ReferenceClassProperty(this, "endAttributeStack", env)
                            .arrayAccess(env, stackPos.getObject())
                            .set(lastEndAttributes);

                } else {
                    switch (ZVal.toInt(this.errorState)) {
                        case 0:
                            msg = this.getErrorMessage(env, symbol, state);
                            this.emitError(
                                    env,
                                    new Error(
                                            env,
                                            msg,
                                            ZVal.add(
                                                    startAttributes.getObject(),
                                                    endAttributes.getObject())));
                        case 1:
                        case 2:
                            this.errorState = 3;
                            runtimeConverterBreakCount = 0;
                            runtimeConverterContinueCount = 0;
                            while (ZVal.toBool(
                                            !ZVal.toBool(
                                                            ZVal.toBool(
                                                                            ZVal.toBool(
                                                                                            ZVal
                                                                                                    .isGreaterThanOrEqualTo(
                                                                                                            idx =
                                                                                                                    ZVal
                                                                                                                            .add(
                                                                                                                                    new ReferenceClassProperty(
                                                                                                                                                    this,
                                                                                                                                                    "actionBase",
                                                                                                                                                    env)
                                                                                                                                            .arrayGet(
                                                                                                                                                    env,
                                                                                                                                                    state),
                                                                                                                                    this
                                                                                                                                            .errorSymbol),
                                                                                                            ">=",
                                                                                                            0))
                                                                                    && ZVal.toBool(
                                                                                            ZVal
                                                                                                    .isLessThan(
                                                                                                            idx,
                                                                                                            '<',
                                                                                                            this
                                                                                                                    .actionTableSize)))
                                                                    && ZVal.toBool(
                                                                            ZVal
                                                                                    .strictEqualityCheck(
                                                                                            new ReferenceClassProperty(
                                                                                                            this,
                                                                                                            "actionCheck",
                                                                                                            env)
                                                                                                    .arrayGet(
                                                                                                            env,
                                                                                                            idx),
                                                                                            "===",
                                                                                            this
                                                                                                    .errorSymbol)))
                                                    || ZVal.toBool(
                                                            ZVal.toBool(
                                                                            ZVal.toBool(
                                                                                            ZVal
                                                                                                            .toBool(
                                                                                                                    ZVal
                                                                                                                            .isLessThan(
                                                                                                                                    state,
                                                                                                                                    '<',
                                                                                                                                    this
                                                                                                                                            .YY2TBLSTATE))
                                                                                                    && ZVal
                                                                                                            .toBool(
                                                                                                                    ZVal
                                                                                                                            .isGreaterThanOrEqualTo(
                                                                                                                                    idx =
                                                                                                                                            ZVal
                                                                                                                                                    .add(
                                                                                                                                                            new ReferenceClassProperty(
                                                                                                                                                                            this,
                                                                                                                                                                            "actionBase",
                                                                                                                                                                            env)
                                                                                                                                                                    .arrayGet(
                                                                                                                                                                            env,
                                                                                                                                                                            ZVal
                                                                                                                                                                                    .add(
                                                                                                                                                                                            state,
                                                                                                                                                                                            this
                                                                                                                                                                                                    .numNonLeafStates)),
                                                                                                                                                            this
                                                                                                                                                                    .errorSymbol),
                                                                                                                                    ">=",
                                                                                                                                    0)))
                                                                                    && ZVal.toBool(
                                                                                            ZVal
                                                                                                    .isLessThan(
                                                                                                            idx,
                                                                                                            '<',
                                                                                                            this
                                                                                                                    .actionTableSize)))
                                                                    && ZVal.toBool(
                                                                            ZVal
                                                                                    .strictEqualityCheck(
                                                                                            new ReferenceClassProperty(
                                                                                                            this,
                                                                                                            "actionCheck",
                                                                                                            env)
                                                                                                    .arrayGet(
                                                                                                            env,
                                                                                                            idx),
                                                                                            "===",
                                                                                            this
                                                                                                    .errorSymbol))))
                                    || ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    action =
                                                            ZVal.assign(
                                                                    new ReferenceClassProperty(
                                                                                    this, "action",
                                                                                    env)
                                                                            .arrayGet(env, idx)),
                                                    "===",
                                                    this.defaultAction))) {
                                if (ZVal.isLessThanOrEqualTo(stackPos.getObject(), "<=", 0)) {
                                    return ZVal.assign(ZVal.getNull());
                                }

                                state =
                                        ZVal.assign(
                                                stateStack.arrayGet(
                                                        env, ZVal.preDecrement(stackPos)));
                            }

                            stackPos.setObject(ZVal.increment(stackPos.getObject()));
                            stateStack
                                    .arrayAccess(env, stackPos.getObject())
                                    .set(state = ZVal.assign(action));
                            new ReferenceClassProperty(this, "endAttributeStack", env)
                                    .arrayAccess(env, stackPos.getObject())
                                    .set(
                                            new ReferenceClassProperty(
                                                            this, "endAttributeStack", env)
                                                    .arrayGet(
                                                            env,
                                                            ZVal.subtract(
                                                                    stackPos.getObject(), 1)));
                            this.endAttributes =
                                    new ReferenceClassProperty(this, "endAttributeStack", env)
                                            .arrayGet(env, ZVal.subtract(stackPos.getObject(), 1));
                            break;
                        case 3:
                            if (ZVal.strictEqualityCheck(symbol, "===", 0)) {
                                return ZVal.assign(ZVal.getNull());
                            }

                            symbol = ZVal.assign(CONST_SYMBOL_NONE);
                            runtimeConverterBreakCount = 2;
                            runtimeConverterBreakCount--;
                            break;
                    }
                    ;
                }

                if (ZVal.isLessThan(state, '<', this.numNonLeafStates)) {
                    break;
                }

                rule = ZVal.subtract(state, this.numNonLeafStates);
            }
        }

        throw ZVal.getException(env, new RuntimeException(env, "Reached end of parser loop"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "error", typeHint = "PhpParser\\Error")
    protected Object emitError(RuntimeEnv env, Object... args) {
        Object error = assignParameter(args, 0, false);
        env.callMethod(this.errorHandler, "handleError", ParserAbstract.class, error);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "symbol", typeHint = "int")
    @ConvertedParameter(index = 1, name = "state", typeHint = "int")
    protected Object getErrorMessage(RuntimeEnv env, Object... args) {
        Object symbol = assignParameter(args, 0, false);
        Object state = assignParameter(args, 1, false);
        Object expected = null;
        Object expectedString = null;
        expectedString = "";
        if (ZVal.isTrue(expected = this.getExpectedTokens(env, state))) {
            expectedString =
                    ", expecting "
                            + toStringR(
                                    NamespaceGlobal.implode.env(env).call(" or ", expected).value(),
                                    env);
        }

        return ZVal.assign(
                "Syntax error, unexpected "
                        + toStringR(
                                new ReferenceClassProperty(this, "symbolToName", env)
                                        .arrayGet(env, symbol),
                                env)
                        + toStringR(expectedString, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "state", typeHint = "int")
    protected Object getExpectedTokens(RuntimeEnv env, Object... args) {
        Object state = assignParameter(args, 0, false);
        Object symbol = null;
        ReferenceContainer expected = new BasicReferenceContainer(null);
        Object name = null;
        Object idx = null;
        Object base = null;
        expected.setObject(ZVal.newArray());
        base =
                ZVal.assign(
                        new ReferenceClassProperty(this, "actionBase", env).arrayGet(env, state));
        for (ZPair zpairResult884 : ZVal.getIterable(this.symbolToName, env, false)) {
            symbol = ZVal.assign(zpairResult884.getKey());
            name = ZVal.assign(zpairResult884.getValue());
            idx = ZVal.add(base, symbol);
            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(ZVal.isGreaterThanOrEqualTo(idx, ">=", 0))
                                                    && ZVal.toBool(
                                                            ZVal.isLessThan(
                                                                    idx,
                                                                    '<',
                                                                    this.actionTableSize)))
                                    && ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    new ReferenceClassProperty(
                                                                    this, "actionCheck", env)
                                                            .arrayGet(env, idx),
                                                    "===",
                                                    symbol)))
                    || ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(
                                                            ZVal.toBool(
                                                                            ZVal.isLessThan(
                                                                                    state,
                                                                                    '<',
                                                                                    this
                                                                                            .YY2TBLSTATE))
                                                                    && ZVal.toBool(
                                                                            ZVal
                                                                                    .isGreaterThanOrEqualTo(
                                                                                            idx =
                                                                                                    ZVal
                                                                                                            .add(
                                                                                                                    new ReferenceClassProperty(
                                                                                                                                    this,
                                                                                                                                    "actionBase",
                                                                                                                                    env)
                                                                                                                            .arrayGet(
                                                                                                                                    env,
                                                                                                                                    ZVal
                                                                                                                                            .add(
                                                                                                                                                    state,
                                                                                                                                                    this
                                                                                                                                                            .numNonLeafStates)),
                                                                                                                    symbol),
                                                                                            ">=",
                                                                                            0)))
                                                    && ZVal.toBool(
                                                            ZVal.isLessThan(
                                                                    idx,
                                                                    '<',
                                                                    this.actionTableSize)))
                                    && ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    new ReferenceClassProperty(
                                                                    this, "actionCheck", env)
                                                            .arrayGet(env, idx),
                                                    "===",
                                                    symbol)))) {
                if (ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.strictNotEqualityCheck(
                                                        new ReferenceClassProperty(
                                                                        this, "action", env)
                                                                .arrayGet(env, idx),
                                                        "!==",
                                                        this.unexpectedTokenRule))
                                        && ZVal.toBool(
                                                ZVal.strictNotEqualityCheck(
                                                        new ReferenceClassProperty(
                                                                        this, "action", env)
                                                                .arrayGet(env, idx),
                                                        "!==",
                                                        this.defaultAction)))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(symbol, "!==", this.errorSymbol))) {
                    if (ZVal.strictEqualityCheck(
                            function_count.f.env(env).call(expected.getObject()).value(),
                            "===",
                            4)) {
                        return ZVal.assign(ZVal.newArray());
                    }

                    expected.arrayAppend(env).set(name);
                }
            }
        }

        return ZVal.assign(expected.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stmts", typeHint = "array")
    protected Object handleNamespaces(RuntimeEnv env, Object... args) {
        Object stmts = assignParameter(args, 0, false);
        Object hasErrored = null;
        Object lastNs = null;
        Object afterFirstNamespace = null;
        Object style = null;
        ReferenceContainer targetStmts = new BasicReferenceContainer(null);
        ReferenceContainer resultStmts = new BasicReferenceContainer(null);
        Object stmt = null;
        hasErrored = false;
        style = this.getNamespacingStyle(env, stmts);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", style)) {
            return ZVal.assign(stmts);

        } else if (ZVal.strictEqualityCheck("brace", "===", style)) {
            afterFirstNamespace = false;
            for (ZPair zpairResult885 : ZVal.getIterable(stmts, env, true)) {
                stmt = ZVal.assign(zpairResult885.getValue());
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                stmt, Namespace_.class, "PhpParser\\Node\\Stmt\\Namespace_"))) {
                    afterFirstNamespace = true;

                } else if (ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                !ZVal.isTrue(
                                                                        ZVal.checkInstanceType(
                                                                                stmt,
                                                                                HaltCompiler.class,
                                                                                "PhpParser\\Node\\Stmt\\HaltCompiler")))
                                                        && ZVal.toBool(
                                                                !ZVal.isTrue(
                                                                        ZVal.checkInstanceType(
                                                                                stmt,
                                                                                Nop.class,
                                                                                "PhpParser\\Node\\Stmt\\Nop"))))
                                        && ZVal.toBool(afterFirstNamespace))
                        && ZVal.toBool(!ZVal.isTrue(hasErrored))) {
                    this.emitError(
                            env,
                            new Error(
                                    env,
                                    "No code may exist outside of namespace {}",
                                    env.callMethod(stmt, "getAttributes", ParserAbstract.class)));
                    hasErrored = true;
                }
            }

            return ZVal.assign(stmts);

        } else {
            resultStmts.setObject(ZVal.newArray());
            targetStmts = resultStmts;
            lastNs = ZVal.getNull();
            for (ZPair zpairResult886 : ZVal.getIterable(stmts, env, true)) {
                stmt = ZVal.assign(zpairResult886.getValue());
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                stmt, Namespace_.class, "PhpParser\\Node\\Stmt\\Namespace_"))) {
                    if (ZVal.strictNotEqualityCheck(lastNs, "!==", ZVal.getNull())) {
                        this.fixupNamespaceAttributes(env, lastNs);
                    }

                    if (ZVal.strictEqualityCheck(
                            toObjectR(stmt).accessProp(this, env).name("stmts").value(),
                            "===",
                            ZVal.getNull())) {
                        toObjectR(stmt).accessProp(this, env).name("stmts").set(ZVal.newArray());
                        targetStmts = new ReferenceClassProperty(stmt, "stmts", env);
                        resultStmts.arrayAppend(env).set(stmt);

                    } else {
                        resultStmts.arrayAppend(env).set(stmt);
                        targetStmts = resultStmts;
                    }

                    lastNs = ZVal.assign(stmt);

                } else if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                stmt, HaltCompiler.class, "PhpParser\\Node\\Stmt\\HaltCompiler"))) {
                    resultStmts.arrayAppend(env).set(stmt);

                } else {
                    targetStmts.arrayAppend(env).set(stmt);
                }
            }

            if (ZVal.strictNotEqualityCheck(lastNs, "!==", ZVal.getNull())) {
                this.fixupNamespaceAttributes(env, lastNs);
            }

            return ZVal.assign(resultStmts.getObject());
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stmt", typeHint = "PhpParser\\Node\\Stmt\\Namespace_")
    private Object fixupNamespaceAttributes(RuntimeEnv env, Object... args) {
        Object stmt = assignParameter(args, 0, false);
        Object endAttribute = null;
        Object endAttributes = null;
        Object lastStmt = null;
        if (ZVal.isEmpty(toObjectR(stmt).accessProp(this, env).name("stmts").value())) {
            return null;
        }

        endAttributes = ZVal.arrayFromList("endLine", "endFilePos", "endTokenPos");
        lastStmt =
                ZVal.assign(
                        new ReferenceClassProperty(stmt, "stmts", env)
                                .arrayGet(
                                        env,
                                        ZVal.subtract(
                                                function_count
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                toObjectR(stmt)
                                                                        .accessProp(this, env)
                                                                        .name("stmts")
                                                                        .value())
                                                        .value(),
                                                1)));
        for (ZPair zpairResult887 : ZVal.getIterable(endAttributes, env, true)) {
            endAttribute = ZVal.assign(zpairResult887.getValue());
            if (ZVal.isTrue(
                    env.callMethod(lastStmt, "hasAttribute", ParserAbstract.class, endAttribute))) {
                env.callMethod(
                        stmt,
                        "setAttribute",
                        ParserAbstract.class,
                        endAttribute,
                        env.callMethod(
                                lastStmt, "getAttribute", ParserAbstract.class, endAttribute));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stmts", typeHint = "array")
    private Object getNamespacingStyle(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object stmts = assignParameter(args, 0, false);
        Object i = null;
        Object style = null;
        Object hasNotAllowedStmts = null;
        Object currentStyle = null;
        Object stmt = null;
        style = ZVal.getNull();
        hasNotAllowedStmts = false;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult888 : ZVal.getIterable(stmts, env, false)) {
            i = ZVal.assign(zpairResult888.getKey());
            stmt = ZVal.assign(zpairResult888.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            stmt, Namespace_.class, "PhpParser\\Node\\Stmt\\Namespace_"))) {
                currentStyle =
                        ZVal.assign(
                                ZVal.strictEqualityCheck(
                                                ZVal.getNull(),
                                                "===",
                                                toObjectR(stmt)
                                                        .accessProp(this, env)
                                                        .name("stmts")
                                                        .value())
                                        ? "semicolon"
                                        : "brace");
                if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", style)) {
                    style = ZVal.assign(currentStyle);
                    if (ZVal.isTrue(hasNotAllowedStmts)) {
                        this.emitError(
                                env,
                                new Error(
                                        env,
                                        "Namespace declaration statement has to be the very first statement in the script",
                                        env.callMethod(stmt, "getLine", ParserAbstract.class)));
                    }

                } else if (ZVal.strictNotEqualityCheck(style, "!==", currentStyle)) {
                    this.emitError(
                            env,
                            new Error(
                                    env,
                                    "Cannot mix bracketed namespace declarations with unbracketed namespace declarations",
                                    env.callMethod(stmt, "getLine", ParserAbstract.class)));
                    return "semicolon";
                }

                continue;
            }

            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    stmt,
                                                    Declare_.class,
                                                    "PhpParser\\Node\\Stmt\\Declare_"))
                                    || ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    stmt,
                                                    HaltCompiler.class,
                                                    "PhpParser\\Node\\Stmt\\HaltCompiler")))
                    || ZVal.toBool(
                            ZVal.checkInstanceType(
                                    stmt, Nop.class, "PhpParser\\Node\\Stmt\\Nop"))) {
                continue;
            }

            if (ZVal.toBool(
                            ZVal.toBool(ZVal.strictEqualityCheck(i, "===", 0))
                                    && ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    stmt,
                                                    InlineHTML.class,
                                                    "PhpParser\\Node\\Stmt\\InlineHTML")))
                    && ZVal.toBool(
                            function_preg_match
                                    .f
                                    .env(env)
                                    .call(
                                            "/\\A#!.*\\r?\\n\\z/",
                                            toObjectR(stmt)
                                                    .accessProp(this, env)
                                                    .name("value")
                                                    .value())
                                    .value())) {
                continue;
            }

            hasNotAllowedStmts = true;
        }

        return ZVal.assign(style);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prop")
    @ConvertedParameter(index = 1, name = "args", typeHint = "array")
    @ConvertedParameter(index = 2, name = "attributes", typeHint = "array")
    protected Object fixupPhp5StaticPropCall(RuntimeEnv env, Object... args) {
        Object prop = assignParameter(args, 0, false);
        Object ___args = assignParameter(args, 1, false);
        Object attributes = assignParameter(args, 2, false);
        Object var = null;
        Object tmp = null;
        Object name = null;
        Object staticProp = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        prop,
                        StaticPropertyFetch.class,
                        "PhpParser\\Node\\Expr\\StaticPropertyFetch"))) {
            name =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    toObjectR(prop)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value(),
                                                    VarLikeIdentifier.class,
                                                    "PhpParser\\Node\\VarLikeIdentifier"))
                                    ? env.callMethod(
                                            toObjectR(prop)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value(),
                                            "toString",
                                            ParserAbstract.class)
                                    : toObjectR(prop).accessProp(this, env).name("name").value());
            var =
                    new Variable(
                            env,
                            name,
                            env.callMethod(
                                    toObjectR(prop).accessProp(this, env).name("name").value(),
                                    "getAttributes",
                                    ParserAbstract.class));
            return ZVal.assign(
                    new StaticCall(
                            env,
                            toObjectR(prop).accessProp(this, env).name("class").value(),
                            var,
                            ___args,
                            attributes));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        prop, ArrayDimFetch.class, "PhpParser\\Node\\Expr\\ArrayDimFetch"))) {
            tmp = ZVal.assign(prop);
            while (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            toObjectR(tmp).accessProp(this, env).name("var").value(),
                            ArrayDimFetch.class,
                            "PhpParser\\Node\\Expr\\ArrayDimFetch"))) {
                tmp = ZVal.assign(toObjectR(tmp).accessProp(this, env).name("var").value());
            }

            staticProp = ZVal.assign(toObjectR(tmp).accessProp(this, env).name("var").value());
            tmp = ZVal.assign(prop);
            this.fixupStartAttributes(
                    env, tmp, toObjectR(staticProp).accessProp(this, env).name("name").value());
            while (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            toObjectR(tmp).accessProp(this, env).name("var").value(),
                            ArrayDimFetch.class,
                            "PhpParser\\Node\\Expr\\ArrayDimFetch"))) {
                tmp = ZVal.assign(toObjectR(tmp).accessProp(this, env).name("var").value());
                this.fixupStartAttributes(
                        env, tmp, toObjectR(staticProp).accessProp(this, env).name("name").value());
            }

            name =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    toObjectR(staticProp)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value(),
                                                    VarLikeIdentifier.class,
                                                    "PhpParser\\Node\\VarLikeIdentifier"))
                                    ? env.callMethod(
                                            toObjectR(staticProp)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value(),
                                            "toString",
                                            ParserAbstract.class)
                                    : toObjectR(staticProp)
                                            .accessProp(this, env)
                                            .name("name")
                                            .value());
            toObjectR(tmp)
                    .accessProp(this, env)
                    .name("var")
                    .set(
                            new Variable(
                                    env,
                                    name,
                                    env.callMethod(
                                            toObjectR(staticProp)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value(),
                                            "getAttributes",
                                            ParserAbstract.class)));
            return ZVal.assign(
                    new StaticCall(
                            env,
                            toObjectR(staticProp).accessProp(this, env).name("class").value(),
                            prop,
                            ___args,
                            attributes));

        } else {
            throw ZVal.getException(env, new PHPException(env));
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "to", typeHint = "PhpParser\\Node")
    @ConvertedParameter(index = 1, name = "from", typeHint = "PhpParser\\Node")
    protected Object fixupStartAttributes(RuntimeEnv env, Object... args) {
        Object to = assignParameter(args, 0, false);
        Object from = assignParameter(args, 1, false);
        Object startAttribute = null;
        Object startAttributes = null;
        startAttributes = ZVal.arrayFromList("startLine", "startFilePos", "startTokenPos");
        for (ZPair zpairResult889 : ZVal.getIterable(startAttributes, env, true)) {
            startAttribute = ZVal.assign(zpairResult889.getValue());
            if (ZVal.isTrue(
                    env.callMethod(from, "hasAttribute", ParserAbstract.class, startAttribute))) {
                env.callMethod(
                        to,
                        "setAttribute",
                        ParserAbstract.class,
                        startAttribute,
                        env.callMethod(from, "getAttribute", ParserAbstract.class, startAttribute));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "PhpParser\\Node\\Name")
    protected Object handleBuiltinTypes(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        ReferenceContainer scalarTypes = new BasicReferenceContainer(null);
        Object lowerName = null;
        scalarTypes.setObject(
                ZVal.newArray(
                        new ZPair("bool", true),
                        new ZPair("int", true),
                        new ZPair("float", true),
                        new ZPair("string", true),
                        new ZPair("iterable", true),
                        new ZPair("void", true),
                        new ZPair("object", true)));
        if (!ZVal.isTrue(env.callMethod(name, "isUnqualified", ParserAbstract.class))) {
            return ZVal.assign(name);
        }

        lowerName = env.callMethod(name, "toLowerString", ParserAbstract.class);
        if (!arrayActionR(ArrayAction.ISSET, scalarTypes, env, lowerName)) {
            return ZVal.assign(name);
        }

        return ZVal.assign(
                new Identifier(
                        env,
                        lowerName,
                        env.callMethod(name, "getAttributes", ParserAbstract.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pos", typeHint = "int")
    protected Object getAttributesAt(RuntimeEnv env, Object... args) {
        Object pos = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.add(
                        new ReferenceClassProperty(this, "startAttributeStack", env)
                                .arrayGet(env, pos),
                        new ReferenceClassProperty(this, "endAttributeStack", env)
                                .arrayGet(env, pos)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "str")
    @ConvertedParameter(index = 1, name = "attributes")
    @ConvertedParameter(
        index = 2,
        name = "allowInvalidOctal",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object parseLNumber(RuntimeEnv env, Object... args) {
        Object str = assignParameter(args, 0, false);
        Object attributes = assignParameter(args, 1, false);
        Object allowInvalidOctal = assignParameter(args, 2, true);
        if (null == allowInvalidOctal) {
            allowInvalidOctal = false;
        }
        Object error = null;
        try {
            return ZVal.assign(
                    LNumber.runtimeStaticObject.fromString(
                            env, str, attributes, allowInvalidOctal));
        } catch (ConvertedException convertedException99) {
            if (convertedException99.instanceOf(Error.class, "PhpParser\\Error")) {
                error = convertedException99.getObject();
                this.emitError(env, error);
                return ZVal.assign(new LNumber(env, 0, attributes));
            } else {
                throw convertedException99;
            }
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "str", typeHint = "string")
    @ConvertedParameter(index = 1, name = "attributes", typeHint = "array")
    protected Object parseNumString(RuntimeEnv env, Object... args) {
        Object str = assignParameter(args, 0, false);
        Object attributes = assignParameter(args, 1, false);
        Object num = null;
        if (!function_preg_match.f.env(env).call("/^(?:0|-?[1-9][0-9]*)$/", str).getBool()) {
            return ZVal.assign(new String_(env, str, attributes));
        }

        num = ZVal.minusSign(str);
        if (!function_is_int.f.env(env).call(num).getBool()) {
            return ZVal.assign(new String_(env, str, attributes));
        }

        return ZVal.assign(new LNumber(env, num, attributes));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "a")
    @ConvertedParameter(index = 1, name = "b")
    @ConvertedParameter(index = 2, name = "modifierPos")
    protected Object checkModifier(RuntimeEnv env, Object... args) {
        Object a = assignParameter(args, 0, false);
        Object b = assignParameter(args, 1, false);
        Object modifierPos = assignParameter(args, 2, false);
        Object error = null;
        try {
            Class_.runtimeStaticObject.verifyModifier(env, a, b);
        } catch (ConvertedException convertedException100) {
            if (convertedException100.instanceOf(Error.class, "PhpParser\\Error")) {
                error = convertedException100.getObject();
                env.callMethod(
                        error,
                        "setAttributes",
                        ParserAbstract.class,
                        this.getAttributesAt(env, modifierPos));
                this.emitError(env, error);
            } else {
                throw convertedException100;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Param")
    protected Object checkParam(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        if (ZVal.toBool(toObjectR(node).accessProp(this, env).name("variadic").value())
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                ZVal.getNull(),
                                "!==",
                                toObjectR(node).accessProp(this, env).name("default").value()))) {
            this.emitError(
                    env,
                    new Error(
                            env,
                            "Variadic parameter cannot have a default value",
                            env.callMethod(
                                    toObjectR(node).accessProp(this, env).name("default").value(),
                                    "getAttributes",
                                    ParserAbstract.class)));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\TryCatch")
    protected Object checkTryCatch(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        if (ZVal.toBool(ZVal.isEmpty(toObjectR(node).accessProp(this, env).name("catches").value()))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                ZVal.getNull(),
                                "===",
                                toObjectR(node).accessProp(this, env).name("finally").value()))) {
            this.emitError(
                    env,
                    new Error(
                            env,
                            "Cannot use try without catch or finally",
                            env.callMethod(node, "getAttributes", ParserAbstract.class)));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Namespace_")
    protected Object checkNamespace(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object stmt = null;
        if (ZVal.toBool(toObjectR(node).accessProp(this, env).name("name").value())
                && ZVal.toBool(
                        env.callMethod(
                                toObjectR(node).accessProp(this, env).name("name").value(),
                                "isSpecialClassName",
                                ParserAbstract.class))) {
            this.emitError(
                    env,
                    new Error(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Cannot use '%s' as namespace name",
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value())
                                    .value(),
                            env.callMethod(
                                    toObjectR(node).accessProp(this, env).name("name").value(),
                                    "getAttributes",
                                    ParserAbstract.class)));
        }

        if (ZVal.strictNotEqualityCheck(
                ZVal.getNull(),
                "!==",
                toObjectR(node).accessProp(this, env).name("stmts").value())) {
            for (ZPair zpairResult890 :
                    ZVal.getIterable(
                            toObjectR(node).accessProp(this, env).name("stmts").value(),
                            env,
                            true)) {
                stmt = ZVal.assign(zpairResult890.getValue());
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                stmt, Namespace_.class, "PhpParser\\Node\\Stmt\\Namespace_"))) {
                    this.emitError(
                            env,
                            new Error(
                                    env,
                                    "Namespace declarations cannot be nested",
                                    env.callMethod(stmt, "getAttributes", ParserAbstract.class)));
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Class_")
    @ConvertedParameter(index = 1, name = "namePos")
    protected Object checkClass(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object namePos = assignParameter(args, 1, false);
        Object _pInterface = null;
        if (ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                ZVal.getNull(),
                                "!==",
                                toObjectR(node).accessProp(this, env).name("name").value()))
                && ZVal.toBool(
                        env.callMethod(
                                toObjectR(node).accessProp(this, env).name("name").value(),
                                "isSpecialClassName",
                                ParserAbstract.class))) {
            this.emitError(
                    env,
                    new Error(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Cannot use '%s' as class name as it is reserved",
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value())
                                    .value(),
                            this.getAttributesAt(env, namePos)));
        }

        if (ZVal.toBool(toObjectR(node).accessProp(this, env).name("extends").value())
                && ZVal.toBool(
                        env.callMethod(
                                toObjectR(node).accessProp(this, env).name("extends").value(),
                                "isSpecialClassName",
                                ParserAbstract.class))) {
            this.emitError(
                    env,
                    new Error(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Cannot use '%s' as class name as it is reserved",
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("extends")
                                                    .value())
                                    .value(),
                            env.callMethod(
                                    toObjectR(node).accessProp(this, env).name("extends").value(),
                                    "getAttributes",
                                    ParserAbstract.class)));
        }

        for (ZPair zpairResult891 :
                ZVal.getIterable(
                        toObjectR(node).accessProp(this, env).name("implements").value(),
                        env,
                        true)) {
            _pInterface = ZVal.assign(zpairResult891.getValue());
            if (ZVal.isTrue(
                    env.callMethod(_pInterface, "isSpecialClassName", ParserAbstract.class))) {
                this.emitError(
                        env,
                        new Error(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Cannot use '%s' as interface name as it is reserved",
                                                _pInterface)
                                        .value(),
                                env.callMethod(
                                        _pInterface, "getAttributes", ParserAbstract.class)));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Interface_")
    @ConvertedParameter(index = 1, name = "namePos")
    protected Object checkInterface(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object namePos = assignParameter(args, 1, false);
        Object _pInterface = null;
        if (ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                ZVal.getNull(),
                                "!==",
                                toObjectR(node).accessProp(this, env).name("name").value()))
                && ZVal.toBool(
                        env.callMethod(
                                toObjectR(node).accessProp(this, env).name("name").value(),
                                "isSpecialClassName",
                                ParserAbstract.class))) {
            this.emitError(
                    env,
                    new Error(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Cannot use '%s' as class name as it is reserved",
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value())
                                    .value(),
                            this.getAttributesAt(env, namePos)));
        }

        for (ZPair zpairResult892 :
                ZVal.getIterable(
                        toObjectR(node).accessProp(this, env).name("extends").value(), env, true)) {
            _pInterface = ZVal.assign(zpairResult892.getValue());
            if (ZVal.isTrue(
                    env.callMethod(_pInterface, "isSpecialClassName", ParserAbstract.class))) {
                this.emitError(
                        env,
                        new Error(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Cannot use '%s' as interface name as it is reserved",
                                                _pInterface)
                                        .value(),
                                env.callMethod(
                                        _pInterface, "getAttributes", ParserAbstract.class)));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\ClassMethod")
    @ConvertedParameter(index = 1, name = "modifierPos")
    protected Object checkClassMethod(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object node = assignParameter(args, 0, false);
        Object modifierPos = assignParameter(args, 1, false);
        if (ZVal.isTrue(
                ZVal.toLong(toObjectR(node).accessProp(this, env).name("flags").value())
                        & ZVal.toLong(Class_.CONST_MODIFIER_STATIC))) {
            switch (toStringR(
                    env.callMethod(
                            toObjectR(node).accessProp(this, env).name("name").value(),
                            "toLowerString",
                            ParserAbstract.class))) {
                case "__construct":
                    this.emitError(
                            env,
                            new Error(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Constructor %s() cannot be static",
                                                    toObjectR(node)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value())
                                            .value(),
                                    this.getAttributesAt(env, modifierPos)));
                    break;
                case "__destruct":
                    this.emitError(
                            env,
                            new Error(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Destructor %s() cannot be static",
                                                    toObjectR(node)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value())
                                            .value(),
                                    this.getAttributesAt(env, modifierPos)));
                    break;
                case "__clone":
                    this.emitError(
                            env,
                            new Error(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Clone method %s() cannot be static",
                                                    toObjectR(node)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value())
                                            .value(),
                                    this.getAttributesAt(env, modifierPos)));
                    break;
            }
            ;
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\ClassConst")
    @ConvertedParameter(index = 1, name = "modifierPos")
    protected Object checkClassConst(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object modifierPos = assignParameter(args, 1, false);
        if (ZVal.isTrue(
                ZVal.toLong(toObjectR(node).accessProp(this, env).name("flags").value())
                        & ZVal.toLong(Class_.CONST_MODIFIER_STATIC))) {
            this.emitError(
                    env,
                    new Error(
                            env,
                            "Cannot use 'static' as constant modifier",
                            this.getAttributesAt(env, modifierPos)));
        }

        if (ZVal.isTrue(
                ZVal.toLong(toObjectR(node).accessProp(this, env).name("flags").value())
                        & ZVal.toLong(Class_.CONST_MODIFIER_ABSTRACT))) {
            this.emitError(
                    env,
                    new Error(
                            env,
                            "Cannot use 'abstract' as constant modifier",
                            this.getAttributesAt(env, modifierPos)));
        }

        if (ZVal.isTrue(
                ZVal.toLong(toObjectR(node).accessProp(this, env).name("flags").value())
                        & ZVal.toLong(Class_.CONST_MODIFIER_FINAL))) {
            this.emitError(
                    env,
                    new Error(
                            env,
                            "Cannot use 'final' as constant modifier",
                            this.getAttributesAt(env, modifierPos)));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\Property")
    @ConvertedParameter(index = 1, name = "modifierPos")
    protected Object checkProperty(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object modifierPos = assignParameter(args, 1, false);
        if (ZVal.isTrue(
                ZVal.toLong(toObjectR(node).accessProp(this, env).name("flags").value())
                        & ZVal.toLong(Class_.CONST_MODIFIER_ABSTRACT))) {
            this.emitError(
                    env,
                    new Error(
                            env,
                            "Properties cannot be declared abstract",
                            this.getAttributesAt(env, modifierPos)));
        }

        if (ZVal.isTrue(
                ZVal.toLong(toObjectR(node).accessProp(this, env).name("flags").value())
                        & ZVal.toLong(Class_.CONST_MODIFIER_FINAL))) {
            this.emitError(
                    env,
                    new Error(
                            env,
                            "Properties cannot be declared final",
                            this.getAttributesAt(env, modifierPos)));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node\\Stmt\\UseUse")
    @ConvertedParameter(index = 1, name = "namePos")
    protected Object checkUseUse(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object namePos = assignParameter(args, 1, false);
        if (ZVal.toBool(toObjectR(node).accessProp(this, env).name("alias").value())
                && ZVal.toBool(
                        env.callMethod(
                                toObjectR(node).accessProp(this, env).name("alias").value(),
                                "isSpecialClassName",
                                ParserAbstract.class))) {
            this.emitError(
                    env,
                    new Error(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Cannot use %s as %s because '%2$s' is a special class name",
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value(),
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("alias")
                                                    .value())
                                    .value(),
                            this.getAttributesAt(env, namePos)));
        }

        return null;
    }

    public static final Object CONST_SYMBOL_NONE = -1;

    public static final Object CONST_class = "PhpParser\\ParserAbstract";

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
                    .setName("PhpParser\\ParserAbstract")
                    .setLookup(
                            ParserAbstract.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "YY2TBLSTATE",
                            "action",
                            "actionBase",
                            "actionCheck",
                            "actionDefault",
                            "actionTableSize",
                            "defaultAction",
                            "endAttributeStack",
                            "endAttributes",
                            "errorHandler",
                            "errorState",
                            "errorSymbol",
                            "goto",
                            "gotoBase",
                            "gotoCheck",
                            "gotoDefault",
                            "gotoTableSize",
                            "invalidSymbol",
                            "lexer",
                            "lookaheadStartAttributes",
                            "numNonLeafStates",
                            "productions",
                            "reduceCallbacks",
                            "ruleToLength",
                            "ruleToNonTerminal",
                            "semStack",
                            "semValue",
                            "startAttributeStack",
                            "symbolToName",
                            "tokenToSymbol",
                            "tokenToSymbolMapSize",
                            "unexpectedTokenRule")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/ParserAbstract.php")
                    .addInterface("PhpParser\\Parser")
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
