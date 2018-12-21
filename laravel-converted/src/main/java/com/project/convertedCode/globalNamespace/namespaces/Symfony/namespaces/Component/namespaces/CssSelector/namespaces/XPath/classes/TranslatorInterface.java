package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/XPath/TranslatorInterface.php

*/

public interface TranslatorInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\CssSelector\\XPath\\TranslatorInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cssExpr", typeHint = "string")
    @ConvertedParameter(index = 1, name = "prefix", typeHint = "string")
    public Object cssToXPath(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "selector",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\SelectorNode"
    )
    @ConvertedParameter(index = 1, name = "prefix", typeHint = "string")
    public Object selectorToXPath(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\CssSelector\\XPath\\TranslatorInterface")
                    .setLookup(TranslatorInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/css-selector/XPath/TranslatorInterface.php")
                    .get();
}
