package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.namespaces.Extension.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.namespaces.Extension.classes.AbstractExtension;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.classes.Translator;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/XPath/Extension/AttributeMatchingExtension.php

*/

public class AttributeMatchingExtension extends AbstractExtension {

    public AttributeMatchingExtension(RuntimeEnv env, Object... args) {
        super(env);
    }

    public AttributeMatchingExtension(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getAttributeMatchingTranslators(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "exists",
                                ZVal.newArray(new ZPair(0, this), new ZPair(1, "translateExists"))),
                        new ZPair(
                                "=",
                                ZVal.newArray(new ZPair(0, this), new ZPair(1, "translateEquals"))),
                        new ZPair(
                                "~=",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateIncludes"))),
                        new ZPair(
                                "|=",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateDashMatch"))),
                        new ZPair(
                                "^=",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translatePrefixMatch"))),
                        new ZPair(
                                "$=",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateSuffixMatch"))),
                        new ZPair(
                                "*=",
                                ZVal.newArray(
                                        new ZPair(0, this),
                                        new ZPair(1, "translateSubstringMatch"))),
                        new ZPair(
                                "!=",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateDifferent")))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    @ConvertedParameter(index = 1, name = "attribute", typeHint = "string")
    @ConvertedParameter(index = 2, name = "value")
    public Object translateExists(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, false);
        return ZVal.assign(
                env.callMethod(xpath, "addCondition", AttributeMatchingExtension.class, attribute));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    @ConvertedParameter(index = 1, name = "attribute", typeHint = "string")
    @ConvertedParameter(index = 2, name = "value")
    public Object translateEquals(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, false);
        return ZVal.assign(
                env.callMethod(
                        xpath,
                        "addCondition",
                        AttributeMatchingExtension.class,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "%s = %s",
                                        attribute,
                                        Translator.runtimeStaticObject.getXpathLiteral(env, value))
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    @ConvertedParameter(index = 1, name = "attribute", typeHint = "string")
    @ConvertedParameter(index = 2, name = "value")
    public Object translateIncludes(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, false);
        return ZVal.assign(
                env.callMethod(
                        xpath,
                        "addCondition",
                        AttributeMatchingExtension.class,
                        ZVal.isTrue(value)
                                ? function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "%1$s and contains(concat(' ', normalize-space(%1$s), ' '), %2$s)",
                                                attribute,
                                                Translator.runtimeStaticObject.getXpathLiteral(
                                                        env, " " + toStringR(value, env) + " "))
                                        .value()
                                : "0"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    @ConvertedParameter(index = 1, name = "attribute", typeHint = "string")
    @ConvertedParameter(index = 2, name = "value")
    public Object translateDashMatch(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, false);
        return ZVal.assign(
                env.callMethod(
                        xpath,
                        "addCondition",
                        AttributeMatchingExtension.class,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "%1$s and (%1$s = %2$s or starts-with(%1$s, %3$s))",
                                        attribute,
                                        Translator.runtimeStaticObject.getXpathLiteral(env, value),
                                        Translator.runtimeStaticObject.getXpathLiteral(
                                                env, toStringR(value, env) + "-"))
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    @ConvertedParameter(index = 1, name = "attribute", typeHint = "string")
    @ConvertedParameter(index = 2, name = "value")
    public Object translatePrefixMatch(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, false);
        return ZVal.assign(
                env.callMethod(
                        xpath,
                        "addCondition",
                        AttributeMatchingExtension.class,
                        ZVal.isTrue(value)
                                ? function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "%1$s and starts-with(%1$s, %2$s)",
                                                attribute,
                                                Translator.runtimeStaticObject.getXpathLiteral(
                                                        env, value))
                                        .value()
                                : "0"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    @ConvertedParameter(index = 1, name = "attribute", typeHint = "string")
    @ConvertedParameter(index = 2, name = "value")
    public Object translateSuffixMatch(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, false);
        return ZVal.assign(
                env.callMethod(
                        xpath,
                        "addCondition",
                        AttributeMatchingExtension.class,
                        ZVal.isTrue(value)
                                ? function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "%1$s and substring(%1$s, string-length(%1$s)-%2$s) = %3$s",
                                                attribute,
                                                ZVal.subtract(
                                                        function_strlen
                                                                .f
                                                                .env(env)
                                                                .call(value)
                                                                .value(),
                                                        1),
                                                Translator.runtimeStaticObject.getXpathLiteral(
                                                        env, value))
                                        .value()
                                : "0"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    @ConvertedParameter(index = 1, name = "attribute", typeHint = "string")
    @ConvertedParameter(index = 2, name = "value")
    public Object translateSubstringMatch(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, false);
        return ZVal.assign(
                env.callMethod(
                        xpath,
                        "addCondition",
                        AttributeMatchingExtension.class,
                        ZVal.isTrue(value)
                                ? function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "%1$s and contains(%1$s, %2$s)",
                                                attribute,
                                                Translator.runtimeStaticObject.getXpathLiteral(
                                                        env, value))
                                        .value()
                                : "0"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    @ConvertedParameter(index = 1, name = "attribute", typeHint = "string")
    @ConvertedParameter(index = 2, name = "value")
    public Object translateDifferent(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        Object attribute = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, false);
        return ZVal.assign(
                env.callMethod(
                        xpath,
                        "addCondition",
                        AttributeMatchingExtension.class,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        ZVal.isTrue(value)
                                                ? "not(%1$s) or %1$s != %2$s"
                                                : "%s != %s",
                                        attribute,
                                        Translator.runtimeStaticObject.getXpathLiteral(env, value))
                                .value()));
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "attribute-matching";
    }

    public static final Object CONST_class =
            "Symfony\\Component\\CssSelector\\XPath\\Extension\\AttributeMatchingExtension";

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
                    .setName(
                            "Symfony\\Component\\CssSelector\\XPath\\Extension\\AttributeMatchingExtension")
                    .setLookup(
                            AttributeMatchingExtension.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/symfony/css-selector/XPath/Extension/AttributeMatchingExtension.php")
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
