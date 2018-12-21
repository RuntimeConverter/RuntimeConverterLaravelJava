package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.namespaces.Extension.classes.AttributeMatchingExtension;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.namespaces.Extension.classes.NodeExtension;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.namespaces.Extension.classes.PseudoClassExtension;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.classes.TranslatorInterface;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.namespaces.Extension.classes.FunctionExtension;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.classes.Parser;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.namespaces.Extension.classes.CombinationExtension;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Exception.classes.ExpressionErrorException;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/XPath/Translator.php

*/

public class Translator extends RuntimeClassBase implements TranslatorInterface {

    public Object mainParser = null;

    public Object shortcutParsers = ZVal.newArray();

    public Object extensions = ZVal.newArray();

    public Object nodeTranslators = ZVal.newArray();

    public Object combinationTranslators = ZVal.newArray();

    public Object functionTranslators = ZVal.newArray();

    public Object pseudoClassTranslators = ZVal.newArray();

    public Object attributeMatchingTranslators = ZVal.newArray();

    public Translator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Translator.class) {
            this.__construct(env, args);
        }
    }

    public Translator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "parser",
        typeHint = "Symfony\\Component\\CssSelector\\Parser\\ParserInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object parser = assignParameter(args, 0, true);
        if (null == parser) {
            parser = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.mainParser =
                ZVal.isTrue(ternaryExpressionTemp = parser)
                        ? ternaryExpressionTemp
                        : new Parser(env);
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        this.registerExtension(env, new NodeExtension(env)),
                                        "registerExtension",
                                        Translator.class,
                                        new CombinationExtension(env)),
                                "registerExtension",
                                Translator.class,
                                new FunctionExtension(env)),
                        "registerExtension",
                        Translator.class,
                        new PseudoClassExtension(env)),
                "registerExtension",
                Translator.class,
                new AttributeMatchingExtension(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cssExpr", typeHint = "string")
    @ConvertedParameter(index = 1, name = "prefix", typeHint = "string")
    public Object cssToXPath(RuntimeEnv env, Object... args) {
        Object cssExpr = assignParameter(args, 0, false);
        Object prefix = assignParameter(args, 1, true);
        if (null == prefix) {
            prefix = "descendant-or-self::";
        }
        Object index = null;
        Object selector = null;
        ReferenceContainer selectors = new BasicReferenceContainer(null);
        selectors.setObject(this.parseSelectors(env, cssExpr));
        for (ZPair zpairResult1754 : ZVal.getIterable(selectors.getObject(), env, false)) {
            index = ZVal.assign(zpairResult1754.getKey());
            selector = ZVal.assign(zpairResult1754.getValue());
            if (ZVal.strictNotEqualityCheck(
                    ZVal.getNull(),
                    "!==",
                    env.callMethod(selector, "getPseudoElement", Translator.class))) {
                throw ZVal.getException(
                        env,
                        new ExpressionErrorException(env, "Pseudo-elements are not supported."));
            }

            selectors.arrayAccess(env, index).set(this.selectorToXPath(env, selector, prefix));
        }

        return ZVal.assign(
                NamespaceGlobal.implode.env(env).call(" | ", selectors.getObject()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "selector",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\SelectorNode"
    )
    @ConvertedParameter(index = 1, name = "prefix", typeHint = "string")
    public Object selectorToXPath(RuntimeEnv env, Object... args) {
        Object selector = assignParameter(args, 0, false);
        Object prefix = assignParameter(args, 1, true);
        if (null == prefix) {
            prefix = "descendant-or-self::";
        }
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                toStringR(
                                ZVal.isTrue(ternaryExpressionTemp = prefix)
                                        ? ternaryExpressionTemp
                                        : "",
                                env)
                        + toStringR(this.nodeToXPath(env, selector), env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "extension",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\Extension\\ExtensionInterface"
    )
    public Object registerExtension(RuntimeEnv env, Object... args) {
        Object extension = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "extensions", env)
                .arrayAccess(env, env.callMethod(extension, "getName", Translator.class))
                .set(extension);
        this.nodeTranslators =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                this.nodeTranslators,
                                env.callMethod(extension, "getNodeTranslators", Translator.class))
                        .value();
        this.combinationTranslators =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                this.combinationTranslators,
                                env.callMethod(
                                        extension, "getCombinationTranslators", Translator.class))
                        .value();
        this.functionTranslators =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                this.functionTranslators,
                                env.callMethod(
                                        extension, "getFunctionTranslators", Translator.class))
                        .value();
        this.pseudoClassTranslators =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                this.pseudoClassTranslators,
                                env.callMethod(
                                        extension, "getPseudoClassTranslators", Translator.class))
                        .value();
        this.attributeMatchingTranslators =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                this.attributeMatchingTranslators,
                                env.callMethod(
                                        extension,
                                        "getAttributeMatchingTranslators",
                                        Translator.class))
                        .value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    public Object getExtension(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "extensions", env),
                env,
                name)) {
            throw ZVal.getException(
                    env,
                    new ExpressionErrorException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Extension \"%s\" not registered.", name)
                                    .value()));
        }

        return ZVal.assign(new ReferenceClassProperty(this, "extensions", env).arrayGet(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "shortcut",
        typeHint = "Symfony\\Component\\CssSelector\\Parser\\ParserInterface"
    )
    public Object registerParserShortcut(RuntimeEnv env, Object... args) {
        Object shortcut = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "shortcutParsers", env).arrayAppend(env).set(shortcut);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\NodeInterface"
    )
    public Object nodeToXPath(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "nodeTranslators", env),
                env,
                env.callMethod(node, "getNodeName", Translator.class))) {
            throw ZVal.getException(
                    env,
                    new ExpressionErrorException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Node \"%s\" not supported.",
                                            env.callMethod(node, "getNodeName", Translator.class))
                                    .value()));
        }

        return ZVal.assign(
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                new ReferenceClassProperty(this, "nodeTranslators", env)
                                        .arrayGet(
                                                env,
                                                env.callMethod(
                                                        node, "getNodeName", Translator.class)),
                                node,
                                this)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "combiner", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\NodeInterface"
    )
    @ConvertedParameter(
        index = 2,
        name = "combinedXpath",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\NodeInterface"
    )
    public Object addCombination(RuntimeEnv env, Object... args) {
        Object combiner = assignParameter(args, 0, false);
        Object xpath = assignParameter(args, 1, false);
        Object combinedXpath = assignParameter(args, 2, false);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "combinationTranslators", env),
                env,
                combiner)) {
            throw ZVal.getException(
                    env,
                    new ExpressionErrorException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Combiner \"%s\" not supported.", combiner)
                                    .value()));
        }

        return ZVal.assign(
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                new ReferenceClassProperty(this, "combinationTranslators", env)
                                        .arrayGet(env, combiner),
                                this.nodeToXPath(env, xpath),
                                this.nodeToXPath(env, combinedXpath))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    @ConvertedParameter(
        index = 1,
        name = "function",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\FunctionNode"
    )
    public Object addFunction(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        Object function = assignParameter(args, 1, false);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "functionTranslators", env),
                env,
                env.callMethod(function, "getName", Translator.class))) {
            throw ZVal.getException(
                    env,
                    new ExpressionErrorException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Function \"%s\" not supported.",
                                            env.callMethod(function, "getName", Translator.class))
                                    .value()));
        }

        return ZVal.assign(
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                new ReferenceClassProperty(this, "functionTranslators", env)
                                        .arrayGet(
                                                env,
                                                env.callMethod(
                                                        function, "getName", Translator.class)),
                                xpath,
                                function)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    @ConvertedParameter(index = 1, name = "pseudoClass", typeHint = "string")
    public Object addPseudoClass(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        Object pseudoClass = assignParameter(args, 1, false);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "pseudoClassTranslators", env),
                env,
                pseudoClass)) {
            throw ZVal.getException(
                    env,
                    new ExpressionErrorException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Pseudo-class \"%s\" not supported.", pseudoClass)
                                    .value()));
        }

        return ZVal.assign(
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                new ReferenceClassProperty(this, "pseudoClassTranslators", env)
                                        .arrayGet(env, pseudoClass),
                                xpath)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    @ConvertedParameter(index = 1, name = "operator", typeHint = "string")
    @ConvertedParameter(index = 2, name = "attribute", typeHint = "string")
    @ConvertedParameter(index = 3, name = "value")
    public Object addAttributeMatching(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, false);
        Object attribute = assignParameter(args, 2, false);
        Object value = assignParameter(args, 3, false);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "attributeMatchingTranslators", env),
                env,
                operator)) {
            throw ZVal.getException(
                    env,
                    new ExpressionErrorException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Attribute matcher operator \"%s\" not supported.",
                                            operator)
                                    .value()));
        }

        return ZVal.assign(
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                new ReferenceClassProperty(
                                                this, "attributeMatchingTranslators", env)
                                        .arrayGet(env, operator),
                                xpath,
                                attribute,
                                value)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "css", typeHint = "string")
    private Object parseSelectors(RuntimeEnv env, Object... args) {
        Object css = assignParameter(args, 0, false);
        Object shortcut = null;
        Object tokens = null;
        for (ZPair zpairResult1755 : ZVal.getIterable(this.shortcutParsers, env, true)) {
            shortcut = ZVal.assign(zpairResult1755.getValue());
            tokens = env.callMethod(shortcut, "parse", Translator.class, css);
            if (!ZVal.isEmpty(tokens)) {
                return ZVal.assign(tokens);
            }
        }

        return ZVal.assign(env.callMethod(this.mainParser, "parse", Translator.class, css));
    }

    public static final Object CONST_class = "Symfony\\Component\\CssSelector\\XPath\\Translator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "element", typeHint = "string")
        public Object getXpathLiteral(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            Object element = assignParameter(args, 0, false);
            Object string = null;
            Object pos = null;
            ReferenceContainer parts = new BasicReferenceContainer(null);
            if (ZVal.strictEqualityCheck(
                    false, "===", function_strpos.f.env(env).call(element, "'").value())) {
                return ZVal.assign("'" + toStringR(element, env) + "'");
            }

            if (ZVal.strictEqualityCheck(
                    false, "===", function_strpos.f.env(env).call(element, "\"").value())) {
                return ZVal.assign("\"" + toStringR(element, env) + "\"");
            }

            string = ZVal.assign(element);
            parts.setObject(ZVal.newArray());
            runtimeConverterBreakCount = 0;
            while (ZVal.isTrue(true)) {
                if (ZVal.strictNotEqualityCheck(
                        false, "!==", pos = function_strpos.f.env(env).call(string, "'").value())) {
                    parts.arrayAppend(env)
                            .set(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "'%s'",
                                                    function_substr
                                                            .f
                                                            .env(env)
                                                            .call(string, 0, pos)
                                                            .value())
                                            .value());
                    parts.arrayAppend(env).set("\"'\"");
                    string = function_substr.f.env(env).call(string, ZVal.add(pos, 1)).value();

                } else {
                    parts.arrayAppend(env).set("'" + toStringR(string, env) + "'");
                    break;
                }
            }

            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "concat(%s)",
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call(parts.getObject(), ", ")
                                            .value())
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\CssSelector\\XPath\\Translator")
                    .setLookup(
                            Translator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "attributeMatchingTranslators",
                            "combinationTranslators",
                            "extensions",
                            "functionTranslators",
                            "mainParser",
                            "nodeTranslators",
                            "pseudoClassTranslators",
                            "shortcutParsers")
                    .setFilename("vendor/symfony/css-selector/XPath/Translator.php")
                    .addInterface("Symfony\\Component\\CssSelector\\XPath\\TranslatorInterface")
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
