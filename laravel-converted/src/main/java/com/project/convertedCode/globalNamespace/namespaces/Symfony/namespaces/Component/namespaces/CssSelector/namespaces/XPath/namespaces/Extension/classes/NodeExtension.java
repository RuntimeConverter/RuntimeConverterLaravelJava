package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.namespaces.Extension.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZAssignment;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.namespaces.Extension.classes.AbstractExtension;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.classes.Translator;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.classes.XPathExpr;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/XPath/Extension/NodeExtension.php

*/

public class NodeExtension extends AbstractExtension {

    public Object flags = null;

    public NodeExtension(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NodeExtension.class) {
            this.__construct(env, args);
        }
    }

    public NodeExtension(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "flags",
        typeHint = "int",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object flags = assignParameter(args, 0, true);
        if (null == flags) {
            flags = 0;
        }
        this.flags = flags;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "int")
    @ConvertedParameter(index = 1, name = "on", typeHint = "bool")
    public Object setFlag(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        Object on = assignParameter(args, 1, false);
        if (ZVal.toBool(on) && ZVal.toBool(!ZVal.isTrue(this.hasFlag(env, flag)))) {
            this.flags = ZAssignment.add("+=", this.flags, flag);
        }

        if (ZVal.toBool(!ZVal.isTrue(on)) && ZVal.toBool(this.hasFlag(env, flag))) {
            this.flags = ZAssignment.subtract("-=", this.flags, flag);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "int")
    public Object hasFlag(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        return ZVal.assign(ZVal.toBool(ZVal.toLong(this.flags) & ZVal.toLong(flag)));
    }

    @ConvertedMethod
    public Object getNodeTranslators(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "Selector",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateSelector"))),
                        new ZPair(
                                "CombinedSelector",
                                ZVal.newArray(
                                        new ZPair(0, this),
                                        new ZPair(1, "translateCombinedSelector"))),
                        new ZPair(
                                "Negation",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateNegation"))),
                        new ZPair(
                                "Function",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateFunction"))),
                        new ZPair(
                                "Pseudo",
                                ZVal.newArray(new ZPair(0, this), new ZPair(1, "translatePseudo"))),
                        new ZPair(
                                "Attribute",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateAttribute"))),
                        new ZPair(
                                "Class",
                                ZVal.newArray(new ZPair(0, this), new ZPair(1, "translateClass"))),
                        new ZPair(
                                "Hash",
                                ZVal.newArray(new ZPair(0, this), new ZPair(1, "translateHash"))),
                        new ZPair(
                                "Element",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateElement")))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\SelectorNode"
    )
    @ConvertedParameter(
        index = 1,
        name = "translator",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\Translator"
    )
    public Object translateSelector(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object translator = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        translator,
                        "nodeToXPath",
                        NodeExtension.class,
                        env.callMethod(node, "getTree", NodeExtension.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\CombinedSelectorNode"
    )
    @ConvertedParameter(
        index = 1,
        name = "translator",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\Translator"
    )
    public Object translateCombinedSelector(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object translator = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        translator,
                        "addCombination",
                        NodeExtension.class,
                        env.callMethod(node, "getCombinator", NodeExtension.class),
                        env.callMethod(node, "getSelector", NodeExtension.class),
                        env.callMethod(node, "getSubSelector", NodeExtension.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\NegationNode"
    )
    @ConvertedParameter(
        index = 1,
        name = "translator",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\Translator"
    )
    public Object translateNegation(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object translator = assignParameter(args, 1, false);
        Object xpath = null;
        Object subXpath = null;
        xpath =
                env.callMethod(
                        translator,
                        "nodeToXPath",
                        NodeExtension.class,
                        env.callMethod(node, "getSelector", NodeExtension.class));
        subXpath =
                env.callMethod(
                        translator,
                        "nodeToXPath",
                        NodeExtension.class,
                        env.callMethod(node, "getSubSelector", NodeExtension.class));
        env.callMethod(subXpath, "addNameTest", NodeExtension.class);
        if (ZVal.isTrue(env.callMethod(subXpath, "getCondition", NodeExtension.class))) {
            return ZVal.assign(
                    env.callMethod(
                            xpath,
                            "addCondition",
                            NodeExtension.class,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "not(%s)",
                                            env.callMethod(
                                                    subXpath, "getCondition", NodeExtension.class))
                                    .value()));
        }

        return ZVal.assign(env.callMethod(xpath, "addCondition", NodeExtension.class, "0"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\FunctionNode"
    )
    @ConvertedParameter(
        index = 1,
        name = "translator",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\Translator"
    )
    public Object translateFunction(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object translator = assignParameter(args, 1, false);
        Object xpath = null;
        xpath =
                env.callMethod(
                        translator,
                        "nodeToXPath",
                        NodeExtension.class,
                        env.callMethod(node, "getSelector", NodeExtension.class));
        return ZVal.assign(
                env.callMethod(translator, "addFunction", NodeExtension.class, xpath, node));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\PseudoNode"
    )
    @ConvertedParameter(
        index = 1,
        name = "translator",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\Translator"
    )
    public Object translatePseudo(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object translator = assignParameter(args, 1, false);
        Object xpath = null;
        xpath =
                env.callMethod(
                        translator,
                        "nodeToXPath",
                        NodeExtension.class,
                        env.callMethod(node, "getSelector", NodeExtension.class));
        return ZVal.assign(
                env.callMethod(
                        translator,
                        "addPseudoClass",
                        NodeExtension.class,
                        xpath,
                        env.callMethod(node, "getIdentifier", NodeExtension.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\AttributeNode"
    )
    @ConvertedParameter(
        index = 1,
        name = "translator",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\Translator"
    )
    public Object translateAttribute(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object translator = assignParameter(args, 1, false);
        Object xpath = null;
        Object name = null;
        Object safe = null;
        Object attribute = null;
        Object value = null;
        name = env.callMethod(node, "getAttribute", NodeExtension.class);
        safe = this.isSafeName(env, name);
        if (ZVal.isTrue(this.hasFlag(env, CONST_ATTRIBUTE_NAME_IN_LOWER_CASE))) {
            name = NamespaceGlobal.strtolower.env(env).call(name).value();
        }

        if (ZVal.isTrue(env.callMethod(node, "getNamespace", NodeExtension.class))) {
            name =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "%s:%s",
                                    env.callMethod(node, "getNamespace", NodeExtension.class), name)
                            .value();
            safe =
                    ZVal.toBool(safe)
                            && ZVal.toBool(
                                    this.isSafeName(
                                            env,
                                            env.callMethod(
                                                    node, "getNamespace", NodeExtension.class)));
        }

        attribute =
                ZVal.assign(
                        ZVal.isTrue(safe)
                                ? "@" + toStringR(name, env)
                                : function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "attribute::*[name() = %s]",
                                                Translator.runtimeStaticObject.getXpathLiteral(
                                                        env, name))
                                        .value());
        value = env.callMethod(node, "getValue", NodeExtension.class);
        xpath =
                env.callMethod(
                        translator,
                        "nodeToXPath",
                        NodeExtension.class,
                        env.callMethod(node, "getSelector", NodeExtension.class));
        if (ZVal.isTrue(this.hasFlag(env, CONST_ATTRIBUTE_VALUE_IN_LOWER_CASE))) {
            value = NamespaceGlobal.strtolower.env(env).call(value).value();
        }

        return ZVal.assign(
                env.callMethod(
                        translator,
                        "addAttributeMatching",
                        NodeExtension.class,
                        xpath,
                        env.callMethod(node, "getOperator", NodeExtension.class),
                        attribute,
                        value));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\ClassNode"
    )
    @ConvertedParameter(
        index = 1,
        name = "translator",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\Translator"
    )
    public Object translateClass(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object translator = assignParameter(args, 1, false);
        Object xpath = null;
        xpath =
                env.callMethod(
                        translator,
                        "nodeToXPath",
                        NodeExtension.class,
                        env.callMethod(node, "getSelector", NodeExtension.class));
        return ZVal.assign(
                env.callMethod(
                        translator,
                        "addAttributeMatching",
                        NodeExtension.class,
                        xpath,
                        "~=",
                        "@class",
                        env.callMethod(node, "getName", NodeExtension.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\HashNode"
    )
    @ConvertedParameter(
        index = 1,
        name = "translator",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\Translator"
    )
    public Object translateHash(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object translator = assignParameter(args, 1, false);
        Object xpath = null;
        xpath =
                env.callMethod(
                        translator,
                        "nodeToXPath",
                        NodeExtension.class,
                        env.callMethod(node, "getSelector", NodeExtension.class));
        return ZVal.assign(
                env.callMethod(
                        translator,
                        "addAttributeMatching",
                        NodeExtension.class,
                        xpath,
                        "=",
                        "@id",
                        env.callMethod(node, "getId", NodeExtension.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\ElementNode"
    )
    public Object translateElement(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object xpath = null;
        Object safe = null;
        Object element = null;
        element = env.callMethod(node, "getElement", NodeExtension.class);
        if (ZVal.isTrue(this.hasFlag(env, CONST_ELEMENT_NAME_IN_LOWER_CASE))) {
            element = NamespaceGlobal.strtolower.env(env).call(element).value();
        }

        if (ZVal.isTrue(element)) {
            safe = this.isSafeName(env, element);

        } else {
            element = "*";
            safe = true;
        }

        if (ZVal.isTrue(env.callMethod(node, "getNamespace", NodeExtension.class))) {
            element =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "%s:%s",
                                    env.callMethod(node, "getNamespace", NodeExtension.class),
                                    element)
                            .value();
            safe =
                    ZVal.toBool(safe)
                            && ZVal.toBool(
                                    this.isSafeName(
                                            env,
                                            env.callMethod(
                                                    node, "getNamespace", NodeExtension.class)));
        }

        xpath = new XPathExpr(env, "", element);
        if (!ZVal.isTrue(safe)) {
            env.callMethod(xpath, "addNameTest", NodeExtension.class);
        }

        return ZVal.assign(xpath);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "node";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    private Object isSafeName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isLessThan(
                        0,
                        '<',
                        function_preg_match
                                .f
                                .env(env)
                                .call("~^[a-zA-Z_][a-zA-Z0-9_.-]*$~", name)
                                .value()));
    }

    public static final Object CONST_ELEMENT_NAME_IN_LOWER_CASE = 1;

    public static final Object CONST_ATTRIBUTE_NAME_IN_LOWER_CASE = 2;

    public static final Object CONST_ATTRIBUTE_VALUE_IN_LOWER_CASE = 4;

    public static final Object CONST_class =
            "Symfony\\Component\\CssSelector\\XPath\\Extension\\NodeExtension";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractExtension.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\CssSelector\\XPath\\Extension\\NodeExtension")
                    .setLookup(
                            NodeExtension.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("flags")
                    .setFilename("vendor/symfony/css-selector/XPath/Extension/NodeExtension.php")
                    .addInterface(
                            "Symfony\\Component\\CssSelector\\XPath\\Extension\\ExtensionInterface")
                    .addExtendsClass(
                            "Symfony\\Component\\CssSelector\\XPath\\Extension\\AbstractExtension")
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
