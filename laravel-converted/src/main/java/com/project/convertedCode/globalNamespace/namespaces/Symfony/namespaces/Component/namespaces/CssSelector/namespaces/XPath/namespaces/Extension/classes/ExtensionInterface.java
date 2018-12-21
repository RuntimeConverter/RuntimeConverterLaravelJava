package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.namespaces.Extension.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/XPath/Extension/ExtensionInterface.php

*/

public interface ExtensionInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\CssSelector\\XPath\\Extension\\ExtensionInterface";

    @ConvertedMethod
    public Object getNodeTranslators(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getCombinationTranslators(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getFunctionTranslators(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getPseudoClassTranslators(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getAttributeMatchingTranslators(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\CssSelector\\XPath\\Extension\\ExtensionInterface")
                    .setLookup(ExtensionInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/symfony/css-selector/XPath/Extension/ExtensionInterface.php")
                    .get();
}
