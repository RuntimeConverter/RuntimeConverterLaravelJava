package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.namespaces.Extension.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.namespaces.Extension.classes.AbstractExtension;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/XPath/Extension/CombinationExtension.php

*/

public class CombinationExtension extends AbstractExtension {

    public CombinationExtension(RuntimeEnv env, Object... args) {
        super(env);
    }

    public CombinationExtension(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getCombinationTranslators(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                " ",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateDescendant"))),
                        new ZPair(
                                ">",
                                ZVal.newArray(new ZPair(0, this), new ZPair(1, "translateChild"))),
                        new ZPair(
                                "+",
                                ZVal.newArray(
                                        new ZPair(0, this),
                                        new ZPair(1, "translateDirectAdjacent"))),
                        new ZPair(
                                "~",
                                ZVal.newArray(
                                        new ZPair(0, this),
                                        new ZPair(1, "translateIndirectAdjacent")))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    @ConvertedParameter(
        index = 1,
        name = "combinedXpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    public Object translateDescendant(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        Object combinedXpath = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        xpath,
                        "join",
                        CombinationExtension.class,
                        "/descendant-or-self::*/",
                        combinedXpath));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    @ConvertedParameter(
        index = 1,
        name = "combinedXpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    public Object translateChild(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        Object combinedXpath = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(xpath, "join", CombinationExtension.class, "/", combinedXpath));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    @ConvertedParameter(
        index = 1,
        name = "combinedXpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    public Object translateDirectAdjacent(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        Object combinedXpath = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        xpath,
                                        "join",
                                        CombinationExtension.class,
                                        "/following-sibling::",
                                        combinedXpath),
                                "addNameTest",
                                CombinationExtension.class),
                        "addCondition",
                        CombinationExtension.class,
                        "position() = 1"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    @ConvertedParameter(
        index = 1,
        name = "combinedXpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    public Object translateIndirectAdjacent(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        Object combinedXpath = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        xpath,
                        "join",
                        CombinationExtension.class,
                        "/following-sibling::",
                        combinedXpath));
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "combination";
    }

    public static final Object CONST_class =
            "Symfony\\Component\\CssSelector\\XPath\\Extension\\CombinationExtension";

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
                            "Symfony\\Component\\CssSelector\\XPath\\Extension\\CombinationExtension")
                    .setLookup(
                            CombinationExtension.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/symfony/css-selector/XPath/Extension/CombinationExtension.php")
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
