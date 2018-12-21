package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Matcher.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.RequestContextAwareInterface;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Matcher/UrlMatcherInterface.php

*/

public interface UrlMatcherInterface extends RequestContextAwareInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\Routing\\Matcher\\UrlMatcherInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pathinfo")
    public Object match(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Routing\\Matcher\\UrlMatcherInterface")
                    .setLookup(UrlMatcherInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/routing/Matcher/UrlMatcherInterface.php")
                    .addInterface("Symfony\\Component\\Routing\\RequestContextAwareInterface")
                    .get();
}
