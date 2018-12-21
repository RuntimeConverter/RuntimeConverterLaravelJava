package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Generator.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.RequestContextAwareInterface;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Generator/UrlGeneratorInterface.php

*/

public interface UrlGeneratorInterface extends RequestContextAwareInterface {

    public static final Object CONST_ABSOLUTE_URL = 0;

    public static final Object CONST_ABSOLUTE_PATH = 1;

    public static final Object CONST_RELATIVE_PATH = 2;

    public static final Object CONST_NETWORK_PATH = 3;

    public static final Object CONST_class =
            "Symfony\\Component\\Routing\\Generator\\UrlGeneratorInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 2, name = "referenceType")
    public Object generate(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Routing\\Generator\\UrlGeneratorInterface")
                    .setLookup(UrlGeneratorInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/routing/Generator/UrlGeneratorInterface.php")
                    .addInterface("Symfony\\Component\\Routing\\RequestContextAwareInterface")
                    .get();
}
