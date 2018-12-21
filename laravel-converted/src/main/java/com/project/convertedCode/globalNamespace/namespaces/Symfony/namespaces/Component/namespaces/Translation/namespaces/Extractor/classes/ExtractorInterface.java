package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Extractor.classes;

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

 vendor/symfony/translation/Extractor/ExtractorInterface.php

*/

public interface ExtractorInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Extractor\\ExtractorInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    @ConvertedParameter(
        index = 1,
        name = "catalogue",
        typeHint = "Symfony\\Component\\Translation\\MessageCatalogue"
    )
    public Object extract(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    public Object setPrefix(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Translation\\Extractor\\ExtractorInterface")
                    .setLookup(ExtractorInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/translation/Extractor/ExtractorInterface.php")
                    .get();
}
