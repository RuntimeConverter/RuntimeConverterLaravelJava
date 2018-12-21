package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.namespaces.Extension.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.namespaces.Extension.classes.AbstractExtension;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.namespaces.Extension.classes.NodeExtension;
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
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Exception.classes.ExpressionErrorException;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/XPath/Extension/HtmlExtension.php

*/

public class HtmlExtension extends AbstractExtension {

    public HtmlExtension(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HtmlExtension.class) {
            this.__construct(env, args);
        }
    }

    public HtmlExtension(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "translator",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\Translator"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object translator = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(
                        env.callMethod(translator, "getExtension", HtmlExtension.class, "node"),
                        "setFlag",
                        HtmlExtension.class,
                        NodeExtension.CONST_ELEMENT_NAME_IN_LOWER_CASE,
                        true),
                "setFlag",
                HtmlExtension.class,
                NodeExtension.CONST_ATTRIBUTE_NAME_IN_LOWER_CASE,
                true);
        return null;
    }

    @ConvertedMethod
    public Object getPseudoClassTranslators(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "checked",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateChecked"))),
                        new ZPair(
                                "link",
                                ZVal.newArray(new ZPair(0, this), new ZPair(1, "translateLink"))),
                        new ZPair(
                                "disabled",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateDisabled"))),
                        new ZPair(
                                "enabled",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateEnabled"))),
                        new ZPair(
                                "selected",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateSelected"))),
                        new ZPair(
                                "invalid",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateInvalid"))),
                        new ZPair(
                                "hover",
                                ZVal.newArray(new ZPair(0, this), new ZPair(1, "translateHover"))),
                        new ZPair(
                                "visited",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateVisited")))));
    }

    @ConvertedMethod
    public Object getFunctionTranslators(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "lang",
                                ZVal.newArray(new ZPair(0, this), new ZPair(1, "translateLang")))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    public Object translateChecked(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        xpath,
                        "addCondition",
                        HtmlExtension.class,
                        "(@checked "
                                + "and (name(.) = 'input' or name(.) = 'command')"
                                + "and (@type = 'checkbox' or @type = 'radio'))"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    public Object translateLink(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        xpath,
                        "addCondition",
                        HtmlExtension.class,
                        "@href and (name(.) = 'a' or name(.) = 'link' or name(.) = 'area')"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    public Object translateDisabled(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        xpath,
                        "addCondition",
                        HtmlExtension.class,
                        "("
                                + "@disabled and"
                                + "("
                                + "(name(.) = 'input' and @type != 'hidden')"
                                + " or name(.) = 'button'"
                                + " or name(.) = 'select'"
                                + " or name(.) = 'textarea'"
                                + " or name(.) = 'command'"
                                + " or name(.) = 'fieldset'"
                                + " or name(.) = 'optgroup'"
                                + " or name(.) = 'option'"
                                + ")"
                                + ") or ("
                                + "(name(.) = 'input' and @type != 'hidden')"
                                + " or name(.) = 'button'"
                                + " or name(.) = 'select'"
                                + " or name(.) = 'textarea'"
                                + ")"
                                + " and ancestor::fieldset[@disabled]"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    public Object translateEnabled(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        xpath,
                        "addCondition",
                        HtmlExtension.class,
                        "("
                                + "@href and ("
                                + "name(.) = 'a'"
                                + " or name(.) = 'link'"
                                + " or name(.) = 'area'"
                                + ")"
                                + ") or ("
                                + "("
                                + "name(.) = 'command'"
                                + " or name(.) = 'fieldset'"
                                + " or name(.) = 'optgroup'"
                                + ")"
                                + " and not(@disabled)"
                                + ") or ("
                                + "("
                                + "(name(.) = 'input' and @type != 'hidden')"
                                + " or name(.) = 'button'"
                                + " or name(.) = 'select'"
                                + " or name(.) = 'textarea'"
                                + " or name(.) = 'keygen'"
                                + ")"
                                + " and not (@disabled or ancestor::fieldset[@disabled])"
                                + ") or ("
                                + "name(.) = 'option' and not("
                                + "@disabled or ancestor::optgroup[@disabled]"
                                + ")"
                                + ")"));
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
    public Object translateLang(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        Object function = assignParameter(args, 1, false);
        ReferenceContainer arguments = new BasicReferenceContainer(null);
        Object token = null;
        arguments.setObject(env.callMethod(function, "getArguments", HtmlExtension.class));
        for (ZPair zpairResult1753 : ZVal.getIterable(arguments.getObject(), env, true)) {
            token = ZVal.assign(zpairResult1753.getValue());
            if (!ZVal.toBool(env.callMethod(token, "isString", HtmlExtension.class))
                    || ZVal.toBool(env.callMethod(token, "isIdentifier", HtmlExtension.class))) {
                throw ZVal.getException(
                        env,
                        new ExpressionErrorException(
                                env,
                                "Expected a single string or identifier for :lang(), got "
                                        + toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(", ", arguments.getObject())
                                                        .value(),
                                                env)));
            }
        }

        return ZVal.assign(
                env.callMethod(
                        xpath,
                        "addCondition",
                        HtmlExtension.class,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "ancestor-or-self::*[@lang][1][starts-with(concat("
                                                + "translate(@%s, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '-')"
                                                + ", %s)]",
                                        "lang",
                                        Translator.runtimeStaticObject.getXpathLiteral(
                                                env,
                                                toStringR(
                                                                NamespaceGlobal.strtolower
                                                                        .env(env)
                                                                        .call(
                                                                                env.callMethod(
                                                                                        arguments
                                                                                                .arrayGet(
                                                                                                        env,
                                                                                                        0),
                                                                                        "getValue",
                                                                                        HtmlExtension
                                                                                                .class))
                                                                        .value(),
                                                                env)
                                                        + "-"))
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    public Object translateSelected(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        xpath,
                        "addCondition",
                        HtmlExtension.class,
                        "(@selected and name(.) = 'option')"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    public Object translateInvalid(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(xpath, "addCondition", HtmlExtension.class, "0"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    public Object translateHover(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(xpath, "addCondition", HtmlExtension.class, "0"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    public Object translateVisited(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(xpath, "addCondition", HtmlExtension.class, "0"));
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "html";
    }

    public static final Object CONST_class =
            "Symfony\\Component\\CssSelector\\XPath\\Extension\\HtmlExtension";

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
                    .setName("Symfony\\Component\\CssSelector\\XPath\\Extension\\HtmlExtension")
                    .setLookup(
                            HtmlExtension.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/css-selector/XPath/Extension/HtmlExtension.php")
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
