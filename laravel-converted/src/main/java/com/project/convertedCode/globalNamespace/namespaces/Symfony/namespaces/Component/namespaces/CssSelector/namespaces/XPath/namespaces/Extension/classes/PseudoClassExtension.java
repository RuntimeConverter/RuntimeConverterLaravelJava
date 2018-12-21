package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.namespaces.Extension.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.namespaces.Extension.classes.AbstractExtension;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Exception.classes.ExpressionErrorException;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/XPath/Extension/PseudoClassExtension.php

*/

public class PseudoClassExtension extends AbstractExtension {

    public PseudoClassExtension(RuntimeEnv env, Object... args) {
        super(env);
    }

    public PseudoClassExtension(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getPseudoClassTranslators(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "root",
                                ZVal.newArray(new ZPair(0, this), new ZPair(1, "translateRoot"))),
                        new ZPair(
                                "first-child",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateFirstChild"))),
                        new ZPair(
                                "last-child",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateLastChild"))),
                        new ZPair(
                                "first-of-type",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateFirstOfType"))),
                        new ZPair(
                                "last-of-type",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateLastOfType"))),
                        new ZPair(
                                "only-child",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateOnlyChild"))),
                        new ZPair(
                                "only-of-type",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateOnlyOfType"))),
                        new ZPair(
                                "empty",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateEmpty")))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    public Object translateRoot(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        xpath, "addCondition", PseudoClassExtension.class, "not(parent::*)"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    public Object translateFirstChild(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(xpath, "addStarPrefix", PseudoClassExtension.class),
                                "addNameTest",
                                PseudoClassExtension.class),
                        "addCondition",
                        PseudoClassExtension.class,
                        "position() = 1"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    public Object translateLastChild(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(xpath, "addStarPrefix", PseudoClassExtension.class),
                                "addNameTest",
                                PseudoClassExtension.class),
                        "addCondition",
                        PseudoClassExtension.class,
                        "position() = last()"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    public Object translateFirstOfType(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(
                "*", "===", env.callMethod(xpath, "getElement", PseudoClassExtension.class))) {
            throw ZVal.getException(
                    env,
                    new ExpressionErrorException(env, "\"*:first-of-type\" is not implemented."));
        }

        return ZVal.assign(
                env.callMethod(
                        env.callMethod(xpath, "addStarPrefix", PseudoClassExtension.class),
                        "addCondition",
                        PseudoClassExtension.class,
                        "position() = 1"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    public Object translateLastOfType(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(
                "*", "===", env.callMethod(xpath, "getElement", PseudoClassExtension.class))) {
            throw ZVal.getException(
                    env,
                    new ExpressionErrorException(env, "\"*:last-of-type\" is not implemented."));
        }

        return ZVal.assign(
                env.callMethod(
                        env.callMethod(xpath, "addStarPrefix", PseudoClassExtension.class),
                        "addCondition",
                        PseudoClassExtension.class,
                        "position() = last()"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    public Object translateOnlyChild(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(xpath, "addStarPrefix", PseudoClassExtension.class),
                                "addNameTest",
                                PseudoClassExtension.class),
                        "addCondition",
                        PseudoClassExtension.class,
                        "last() = 1"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    public Object translateOnlyOfType(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(
                "*", "===", env.callMethod(xpath, "getElement", PseudoClassExtension.class))) {
            throw ZVal.getException(
                    env,
                    new ExpressionErrorException(env, "\"*:only-of-type\" is not implemented."));
        }

        return ZVal.assign(
                env.callMethod(xpath, "addCondition", PseudoClassExtension.class, "last() = 1"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    public Object translateEmpty(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        xpath,
                        "addCondition",
                        PseudoClassExtension.class,
                        "not(*) and not(string-length())"));
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "pseudo-class";
    }

    public static final Object CONST_class =
            "Symfony\\Component\\CssSelector\\XPath\\Extension\\PseudoClassExtension";

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
                            "Symfony\\Component\\CssSelector\\XPath\\Extension\\PseudoClassExtension")
                    .setLookup(
                            PseudoClassExtension.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/symfony/css-selector/XPath/Extension/PseudoClassExtension.php")
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
