package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.classes.Reader;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.classes.Token;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Node.classes.NegationNode;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.namespaces.Tokenizer.classes.Tokenizer;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Node.classes.ClassNode;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Node.classes.AttributeNode;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Node.classes.PseudoNode;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Node.classes.FunctionNode;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Exception.classes.SyntaxErrorException;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Node.classes.SelectorNode;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Node.classes.ElementNode;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.classes.ParserInterface;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Node.classes.CombinedSelectorNode;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Node.classes.HashNode;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/Parser/Parser.php

*/

public class Parser extends RuntimeClassBase implements ParserInterface {

    public Object tokenizer = null;

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
    @ConvertedParameter(
        index = 0,
        name = "tokenizer",
        typeHint = "Symfony\\Component\\CssSelector\\Parser\\Tokenizer\\Tokenizer",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object tokenizer = assignParameter(args, 0, true);
        if (null == tokenizer) {
            tokenizer = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.tokenizer =
                ZVal.isTrue(ternaryExpressionTemp = tokenizer)
                        ? ternaryExpressionTemp
                        : new Tokenizer(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source", typeHint = "string")
    public Object parse(RuntimeEnv env, Object... args) {
        Object source = assignParameter(args, 0, false);
        Object stream = null;
        Object reader = null;
        reader = new Reader(env, source);
        stream = env.callMethod(this.tokenizer, "tokenize", Parser.class, reader);
        return ZVal.assign(this.parseSelectorList(env, stream));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "stream",
        typeHint = "Symfony\\Component\\CssSelector\\Parser\\TokenStream"
    )
    private Object parseSelectorList(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object stream = assignParameter(args, 0, false);
        ReferenceContainer selectors = new BasicReferenceContainer(null);
        env.callMethod(stream, "skipWhitespace", Parser.class);
        selectors.setObject(ZVal.newArray());
        runtimeConverterBreakCount = 0;
        while (ZVal.isTrue(true)) {
            selectors.arrayAppend(env).set(this.parserSelectorNode(env, stream));
            if (ZVal.isTrue(
                    env.callMethod(
                            env.callMethod(stream, "getPeek", Parser.class),
                            "isDelimiter",
                            Parser.class,
                            ZVal.arrayFromList(",")))) {
                env.callMethod(stream, "getNext", Parser.class);
                env.callMethod(stream, "skipWhitespace", Parser.class);

            } else {
                break;
            }
        }

        return ZVal.assign(selectors.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "stream",
        typeHint = "Symfony\\Component\\CssSelector\\Parser\\TokenStream"
    )
    private Object parserSelectorNode(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object stream = assignParameter(args, 0, false);
        Object result = null;
        Object combinator = null;
        Object runtimeTempArrayResult183 = null;
        Object pseudoElement = null;
        Object runtimeTempArrayResult182 = null;
        Object nextSelector = null;
        Object peek = null;
        ZVal.list(
                runtimeTempArrayResult182 = this.parseSimpleSelector(env, stream),
                (result = listGet(runtimeTempArrayResult182, 0, env)),
                (pseudoElement = listGet(runtimeTempArrayResult182, 1, env)));
        runtimeConverterBreakCount = 0;
        while (ZVal.isTrue(true)) {
            env.callMethod(stream, "skipWhitespace", Parser.class);
            peek = env.callMethod(stream, "getPeek", Parser.class);
            if (ZVal.toBool(env.callMethod(peek, "isFileEnd", Parser.class))
                    || ZVal.toBool(
                            env.callMethod(
                                    peek, "isDelimiter", Parser.class, ZVal.arrayFromList(",")))) {
                break;
            }

            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", pseudoElement)) {
                throw ZVal.getException(
                        env,
                        SyntaxErrorException.runtimeStaticObject.pseudoElementFound(
                                env, pseudoElement, "not at the end of a selector"));
            }

            if (ZVal.isTrue(
                    env.callMethod(
                            peek,
                            "isDelimiter",
                            Parser.class,
                            ZVal.arrayFromList("+", ">", "~")))) {
                combinator =
                        env.callMethod(
                                env.callMethod(stream, "getNext", Parser.class),
                                "getValue",
                                Parser.class);
                env.callMethod(stream, "skipWhitespace", Parser.class);

            } else {
                combinator = " ";
            }

            ZVal.list(
                    runtimeTempArrayResult183 = this.parseSimpleSelector(env, stream),
                    (nextSelector = listGet(runtimeTempArrayResult183, 0, env)),
                    (pseudoElement = listGet(runtimeTempArrayResult183, 1, env)));
            result = new CombinedSelectorNode(env, result, combinator, nextSelector);
        }

        return ZVal.assign(new SelectorNode(env, result, pseudoElement));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "stream",
        typeHint = "Symfony\\Component\\CssSelector\\Parser\\TokenStream"
    )
    @ConvertedParameter(
        index = 1,
        name = "insideNegation",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    private Object parseSimpleSelector(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object stream = assignParameter(args, 0, false);
        Object insideNegation = assignParameter(args, 1, true);
        if (null == insideNegation) {
            insideNegation = false;
        }
        Object next = null;
        Object identifier = null;
        Object argument = null;
        Object selectorStart = null;
        Object argumentPseudoElement = null;
        Object peek = null;
        Object result = null;
        Object runtimeTempArrayResult184 = null;
        Object pseudoElement = null;
        ReferenceContainer arguments = new BasicReferenceContainer(null);
        env.callMethod(stream, "skipWhitespace", Parser.class);
        selectorStart =
                function_count
                        .f
                        .env(env)
                        .call(env.callMethod(stream, "getUsed", Parser.class))
                        .value();
        result = this.parseElementNode(env, stream);
        pseudoElement = ZVal.getNull();
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        while (ZVal.isTrue(true)) {
            peek = env.callMethod(stream, "getPeek", Parser.class);
            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(
                                                            env.callMethod(
                                                                    peek,
                                                                    "isWhitespace",
                                                                    Parser.class))
                                                    || ZVal.toBool(
                                                            env.callMethod(
                                                                    peek,
                                                                    "isFileEnd",
                                                                    Parser.class)))
                                    || ZVal.toBool(
                                            env.callMethod(
                                                    peek,
                                                    "isDelimiter",
                                                    Parser.class,
                                                    ZVal.arrayFromList(",", "+", ">", "~"))))
                    || ZVal.toBool(
                            ZVal.toBool(insideNegation)
                                    && ZVal.toBool(
                                            env.callMethod(
                                                    peek,
                                                    "isDelimiter",
                                                    Parser.class,
                                                    ZVal.arrayFromList(")"))))) {
                break;
            }

            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", pseudoElement)) {
                throw ZVal.getException(
                        env,
                        SyntaxErrorException.runtimeStaticObject.pseudoElementFound(
                                env, pseudoElement, "not at the end of a selector"));
            }

            if (ZVal.isTrue(env.callMethod(peek, "isHash", Parser.class))) {
                result =
                        new HashNode(
                                env,
                                result,
                                env.callMethod(
                                        env.callMethod(stream, "getNext", Parser.class),
                                        "getValue",
                                        Parser.class));

            } else if (ZVal.isTrue(
                    env.callMethod(peek, "isDelimiter", Parser.class, ZVal.arrayFromList(".")))) {
                env.callMethod(stream, "getNext", Parser.class);
                result =
                        new ClassNode(
                                env,
                                result,
                                env.callMethod(stream, "getNextIdentifier", Parser.class));

            } else if (ZVal.isTrue(
                    env.callMethod(peek, "isDelimiter", Parser.class, ZVal.arrayFromList("[")))) {
                env.callMethod(stream, "getNext", Parser.class);
                result = this.parseAttributeNode(env, result, stream);

            } else if (ZVal.isTrue(
                    env.callMethod(peek, "isDelimiter", Parser.class, ZVal.arrayFromList(":")))) {
                env.callMethod(stream, "getNext", Parser.class);
                if (ZVal.isTrue(
                        env.callMethod(
                                env.callMethod(stream, "getPeek", Parser.class),
                                "isDelimiter",
                                Parser.class,
                                ZVal.arrayFromList(":")))) {
                    env.callMethod(stream, "getNext", Parser.class);
                    pseudoElement = env.callMethod(stream, "getNextIdentifier", Parser.class);
                    continue;
                }

                identifier = env.callMethod(stream, "getNextIdentifier", Parser.class);
                if (function_in_array
                        .f
                        .env(env)
                        .call(
                                NamespaceGlobal.strtolower.env(env).call(identifier).value(),
                                ZVal.arrayFromList("first-line", "first-letter", "before", "after"))
                        .getBool()) {
                    pseudoElement = ZVal.assign(identifier);
                    continue;
                }

                if (!ZVal.isTrue(
                        env.callMethod(
                                env.callMethod(stream, "getPeek", Parser.class),
                                "isDelimiter",
                                Parser.class,
                                ZVal.arrayFromList("(")))) {
                    result = new PseudoNode(env, result, identifier);
                    continue;
                }

                env.callMethod(stream, "getNext", Parser.class);
                env.callMethod(stream, "skipWhitespace", Parser.class);
                if (ZVal.strictEqualityCheck(
                        "not",
                        "===",
                        NamespaceGlobal.strtolower.env(env).call(identifier).value())) {
                    if (ZVal.isTrue(insideNegation)) {
                        throw ZVal.getException(
                                env, SyntaxErrorException.runtimeStaticObject.nestedNot(env));
                    }

                    ZVal.list(
                            runtimeTempArrayResult184 = this.parseSimpleSelector(env, stream, true),
                            (argument = listGet(runtimeTempArrayResult184, 0, env)),
                            (argumentPseudoElement = listGet(runtimeTempArrayResult184, 1, env)));
                    next = env.callMethod(stream, "getNext", Parser.class);
                    if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", argumentPseudoElement)) {
                        throw ZVal.getException(
                                env,
                                SyntaxErrorException.runtimeStaticObject.pseudoElementFound(
                                        env, argumentPseudoElement, "inside ::not()"));
                    }

                    if (!ZVal.isTrue(
                            env.callMethod(
                                    next, "isDelimiter", Parser.class, ZVal.arrayFromList(")")))) {
                        throw ZVal.getException(
                                env,
                                SyntaxErrorException.runtimeStaticObject.unexpectedToken(
                                        env, "\")\"", next));
                    }

                    result = new NegationNode(env, result, argument);

                } else {
                    arguments.setObject(ZVal.newArray());
                    next = ZVal.getNull();
                    runtimeConverterBreakCount = 0;
                    runtimeConverterContinueCount = 0;
                    while (ZVal.isTrue(true)) {
                        env.callMethod(stream, "skipWhitespace", Parser.class);
                        next = env.callMethod(stream, "getNext", Parser.class);
                        if (ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.toBool(
                                                                        env.callMethod(
                                                                                next,
                                                                                "isIdentifier",
                                                                                Parser.class))
                                                                || ZVal.toBool(
                                                                        env.callMethod(
                                                                                next,
                                                                                "isString",
                                                                                Parser.class)))
                                                || ZVal.toBool(
                                                        env.callMethod(
                                                                next, "isNumber", Parser.class)))
                                || ZVal.toBool(
                                        env.callMethod(
                                                next,
                                                "isDelimiter",
                                                Parser.class,
                                                ZVal.arrayFromList("+", "-")))) {
                            arguments.arrayAppend(env).set(next);

                        } else if (ZVal.isTrue(
                                env.callMethod(
                                        next,
                                        "isDelimiter",
                                        Parser.class,
                                        ZVal.arrayFromList(")")))) {
                            break;

                        } else {
                            throw ZVal.getException(
                                    env,
                                    SyntaxErrorException.runtimeStaticObject.unexpectedToken(
                                            env, "an argument", next));
                        }
                    }

                    if (ZVal.isEmpty(arguments.getObject())) {
                        throw ZVal.getException(
                                env,
                                SyntaxErrorException.runtimeStaticObject.unexpectedToken(
                                        env, "at least one argument", next));
                    }

                    result = new FunctionNode(env, result, identifier, arguments.getObject());
                }

            } else {
                throw ZVal.getException(
                        env,
                        SyntaxErrorException.runtimeStaticObject.unexpectedToken(
                                env, "selector", peek));
            }
        }

        if (ZVal.strictEqualityCheck(
                function_count
                        .f
                        .env(env)
                        .call(env.callMethod(stream, "getUsed", Parser.class))
                        .value(),
                "===",
                selectorStart)) {
            throw ZVal.getException(
                    env,
                    SyntaxErrorException.runtimeStaticObject.unexpectedToken(
                            env, "selector", env.callMethod(stream, "getPeek", Parser.class)));
        }

        return ZVal.assign(ZVal.newArray(new ZPair(0, result), new ZPair(1, pseudoElement)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "stream",
        typeHint = "Symfony\\Component\\CssSelector\\Parser\\TokenStream"
    )
    private Object parseElementNode(RuntimeEnv env, Object... args) {
        Object stream = assignParameter(args, 0, false);
        Object namespace = null;
        Object peek = null;
        Object element = null;
        peek = env.callMethod(stream, "getPeek", Parser.class);
        if (ZVal.toBool(env.callMethod(peek, "isIdentifier", Parser.class))
                || ZVal.toBool(
                        env.callMethod(
                                peek, "isDelimiter", Parser.class, ZVal.arrayFromList("*")))) {
            if (ZVal.isTrue(env.callMethod(peek, "isIdentifier", Parser.class))) {
                namespace =
                        env.callMethod(
                                env.callMethod(stream, "getNext", Parser.class),
                                "getValue",
                                Parser.class);

            } else {
                env.callMethod(stream, "getNext", Parser.class);
                namespace = ZVal.getNull();
            }

            if (ZVal.isTrue(
                    env.callMethod(
                            env.callMethod(stream, "getPeek", Parser.class),
                            "isDelimiter",
                            Parser.class,
                            ZVal.arrayFromList("|")))) {
                env.callMethod(stream, "getNext", Parser.class);
                element = env.callMethod(stream, "getNextIdentifierOrStar", Parser.class);

            } else {
                element = ZVal.assign(namespace);
                namespace = ZVal.getNull();
            }

        } else {
            element = ZVal.assign(namespace = ZVal.getNull());
        }

        return ZVal.assign(new ElementNode(env, namespace, element));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "selector",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\NodeInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "stream",
        typeHint = "Symfony\\Component\\CssSelector\\Parser\\TokenStream"
    )
    private Object parseAttributeNode(RuntimeEnv env, Object... args) {
        Object selector = assignParameter(args, 0, false);
        Object stream = assignParameter(args, 1, false);
        Object next = null;
        Object namespace = null;
        Object attribute = null;
        Object value = null;
        Object operator = null;
        env.callMethod(stream, "skipWhitespace", Parser.class);
        attribute = env.callMethod(stream, "getNextIdentifierOrStar", Parser.class);
        if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", attribute))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        env.callMethod(stream, "getPeek", Parser.class),
                                        "isDelimiter",
                                        Parser.class,
                                        ZVal.arrayFromList("|"))))) {
            throw ZVal.getException(
                    env,
                    SyntaxErrorException.runtimeStaticObject.unexpectedToken(
                            env, "\"|\"", env.callMethod(stream, "getPeek", Parser.class)));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        env.callMethod(stream, "getPeek", Parser.class),
                        "isDelimiter",
                        Parser.class,
                        ZVal.arrayFromList("|")))) {
            env.callMethod(stream, "getNext", Parser.class);
            if (ZVal.isTrue(
                    env.callMethod(
                            env.callMethod(stream, "getPeek", Parser.class),
                            "isDelimiter",
                            Parser.class,
                            ZVal.arrayFromList("=")))) {
                namespace = ZVal.getNull();
                env.callMethod(stream, "getNext", Parser.class);
                operator = "|=";

            } else {
                namespace = ZVal.assign(attribute);
                attribute = env.callMethod(stream, "getNextIdentifier", Parser.class);
                operator = ZVal.getNull();
            }

        } else {
            namespace = ZVal.assign(operator = ZVal.getNull());
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", operator)) {
            env.callMethod(stream, "skipWhitespace", Parser.class);
            next = env.callMethod(stream, "getNext", Parser.class);
            if (ZVal.isTrue(
                    env.callMethod(next, "isDelimiter", Parser.class, ZVal.arrayFromList("]")))) {
                return ZVal.assign(
                        new AttributeNode(
                                env, selector, namespace, attribute, "exists", ZVal.getNull()));

            } else if (ZVal.isTrue(
                    env.callMethod(next, "isDelimiter", Parser.class, ZVal.arrayFromList("=")))) {
                operator = "=";

            } else if (ZVal.toBool(
                            env.callMethod(
                                    next,
                                    "isDelimiter",
                                    Parser.class,
                                    ZVal.arrayFromList("^", "$", "*", "~", "|", "!")))
                    && ZVal.toBool(
                            env.callMethod(
                                    env.callMethod(stream, "getPeek", Parser.class),
                                    "isDelimiter",
                                    Parser.class,
                                    ZVal.arrayFromList("=")))) {
                operator = toStringR(env.callMethod(next, "getValue", Parser.class), env) + "=";
                env.callMethod(stream, "getNext", Parser.class);

            } else {
                throw ZVal.getException(
                        env,
                        SyntaxErrorException.runtimeStaticObject.unexpectedToken(
                                env, "operator", next));
            }
        }

        env.callMethod(stream, "skipWhitespace", Parser.class);
        value = env.callMethod(stream, "getNext", Parser.class);
        if (ZVal.isTrue(env.callMethod(value, "isNumber", Parser.class))) {
            value =
                    new Token(
                            env,
                            Token.CONST_TYPE_STRING,
                            toStringR(env.callMethod(value, "getValue", Parser.class), env),
                            env.callMethod(value, "getPosition", Parser.class));
        }

        if (!ZVal.toBool(env.callMethod(value, "isIdentifier", Parser.class))
                || ZVal.toBool(env.callMethod(value, "isString", Parser.class))) {
            throw ZVal.getException(
                    env,
                    SyntaxErrorException.runtimeStaticObject.unexpectedToken(
                            env, "string or identifier", value));
        }

        env.callMethod(stream, "skipWhitespace", Parser.class);
        next = env.callMethod(stream, "getNext", Parser.class);
        if (!ZVal.isTrue(
                env.callMethod(next, "isDelimiter", Parser.class, ZVal.arrayFromList("]")))) {
            throw ZVal.getException(
                    env,
                    SyntaxErrorException.runtimeStaticObject.unexpectedToken(env, "\"]\"", next));
        }

        return ZVal.assign(
                new AttributeNode(
                        env,
                        selector,
                        namespace,
                        attribute,
                        operator,
                        env.callMethod(value, "getValue", Parser.class)));
    }

    public static final Object CONST_class = "Symfony\\Component\\CssSelector\\Parser\\Parser";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "tokens", typeHint = "array")
        public Object parseSeries(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/symfony/css-selector/Parser")
                            .setFile("/vendor/symfony/css-selector/Parser/Parser.php");
            Object tokens = assignParameter(args, 0, false);
            ReferenceContainer split = new BasicReferenceContainer(null);
            ReferenceContainer joined = new BasicReferenceContainer(null);
            Object _pInt = null;
            ReferenceContainer first = new BasicReferenceContainer(null);
            Object token = null;
            for (ZPair zpairResult1749 : ZVal.getIterable(tokens, env, true)) {
                token = ZVal.assign(zpairResult1749.getValue());
                if (ZVal.isTrue(env.callMethod(token, "isString", Parser.class))) {
                    throw ZVal.getException(
                            env,
                            SyntaxErrorException.runtimeStaticObject.stringAsFunctionArgument(env));
                }
            }

            joined.setObject(
                    function_trim
                            .f
                            .env(env)
                            .call(
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call(
                                                    "",
                                                    function_array_map
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    new Closure(
                                                                            env,
                                                                            runtimeConverterFunctionClassConstants,
                                                                            "Symfony\\Component\\CssSelector\\Parser",
                                                                            this) {
                                                                        @Override
                                                                        @ConvertedMethod
                                                                        @ConvertedParameter(
                                                                            index = 0,
                                                                            name = "token",
                                                                            typeHint =
                                                                                    "Symfony\\Component\\CssSelector\\Parser\\Token"
                                                                        )
                                                                        public Object run(
                                                                                RuntimeEnv env,
                                                                                Object thisvar,
                                                                                PassByReferenceArgs
                                                                                        runtimePassByReferenceArgs,
                                                                                Object... args) {
                                                                            Object token =
                                                                                    assignParameter(
                                                                                            args, 0,
                                                                                            false);
                                                                            return ZVal.assign(
                                                                                    env.callMethod(
                                                                                            token,
                                                                                            "getValue",
                                                                                            Parser
                                                                                                    .class));
                                                                        }
                                                                    },
                                                                    tokens)
                                                            .value())
                                            .value())
                            .value());
            _pInt =
                    new Closure(
                            env,
                            runtimeConverterFunctionClassConstants,
                            "Symfony\\Component\\CssSelector\\Parser",
                            this) {
                        @Override
                        @ConvertedMethod
                        @ConvertedParameter(index = 0, name = "string")
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            Object string = assignParameter(args, 0, false);
                            if (!function_is_numeric.f.env(env).call(string).getBool()) {
                                throw ZVal.getException(
                                        env,
                                        SyntaxErrorException.runtimeStaticObject
                                                .stringAsFunctionArgument(env));
                            }

                            return ZVal.assign(ZVal.toLong(string));
                        }
                    };
            SwitchEnumType115 switchVariable115 =
                    ZVal.getEnum(
                            true,
                            SwitchEnumType115.DEFAULT_CASE,
                            SwitchEnumType115.MINUS_STRING_odd,
                            ZVal.strictEqualityCheck("odd", "===", joined.getObject()),
                            SwitchEnumType115.MINUS_STRING_even,
                            ZVal.strictEqualityCheck("even", "===", joined.getObject()),
                            SwitchEnumType115.MINUS_STRING_n,
                            ZVal.strictEqualityCheck("n", "===", joined.getObject()),
                            SwitchEnumType115.DYNAMIC_TYPE_376,
                            ZVal.strictEqualityCheck(
                                    false,
                                    "===",
                                    function_strpos
                                            .f
                                            .env(env)
                                            .call(joined.getObject(), "n")
                                            .value()));
            switch (switchVariable115) {
                case MINUS_STRING_odd:
                    return ZVal.assign(ZVal.arrayFromList(2, 1));
                case MINUS_STRING_even:
                    return ZVal.assign(ZVal.arrayFromList(2, 0));
                case MINUS_STRING_n:
                    return ZVal.assign(ZVal.arrayFromList(1, 0));
                case DYNAMIC_TYPE_376:
                    return ZVal.assign(
                            ZVal.newArray(
                                    new ZPair(0, 0),
                                    new ZPair(
                                            1,
                                            env.callFunctionDynamic(
                                                            _pInt,
                                                            new RuntimeArgsWithReferences()
                                                                    .add(0, joined),
                                                            joined.getObject())
                                                    .value())));
            }
            ;
            split.setObject(function_explode.f.env(env).call("n", joined.getObject()).value());
            first.setObject(
                    ZVal.assign(
                            arrayActionR(ArrayAction.ISSET, split, env, 0)
                                    ? split.arrayGet(env, 0)
                                    : ZVal.getNull()));
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    ZVal.isTrue(first.getObject())
                                            ? ZVal.toBool(
                                                                    ZVal.strictEqualityCheck(
                                                                            "-",
                                                                            "===",
                                                                            first.getObject()))
                                                            || ZVal.toBool(
                                                                    ZVal.strictEqualityCheck(
                                                                            "+",
                                                                            "===",
                                                                            first.getObject()))
                                                    ? env.callFunctionDynamic(
                                                                    _pInt,
                                                                    new RuntimeArgsWithReferences(),
                                                                    toStringR(
                                                                                    first
                                                                                            .getObject(),
                                                                                    env)
                                                                            + "1")
                                                            .value()
                                                    : env.callFunctionDynamic(
                                                                    _pInt,
                                                                    new RuntimeArgsWithReferences()
                                                                            .add(0, first),
                                                                    first.getObject())
                                                            .value()
                                            : 1),
                            new ZPair(
                                    1,
                                    ZVal.toBool(arrayActionR(ArrayAction.ISSET, split, env, 1))
                                                    && ZVal.toBool(split.arrayGet(env, 1))
                                            ? env.callFunctionDynamic(
                                                            _pInt,
                                                            new RuntimeArgsWithReferences()
                                                                    .add(
                                                                            0,
                                                                            new ArrayDimensionReference(
                                                                                    split
                                                                                            .getObject(),
                                                                                    1)),
                                                            split.arrayGet(env, 1))
                                                    .value()
                                            : 0)));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\CssSelector\\Parser\\Parser")
                    .setLookup(
                            Parser.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("tokenizer")
                    .setFilename("vendor/symfony/css-selector/Parser/Parser.php")
                    .addInterface("Symfony\\Component\\CssSelector\\Parser\\ParserInterface")
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

    private enum SwitchEnumType115 {
        MINUS_STRING_odd,
        MINUS_STRING_even,
        MINUS_STRING_n,
        DYNAMIC_TYPE_376,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
