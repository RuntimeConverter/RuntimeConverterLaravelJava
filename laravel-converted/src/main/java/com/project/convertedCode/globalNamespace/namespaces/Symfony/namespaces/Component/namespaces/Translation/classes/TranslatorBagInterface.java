package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes;

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

 vendor/symfony/translation/TranslatorBagInterface.php

*/

public interface TranslatorBagInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\TranslatorBagInterface";

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "locale",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getCatalogue(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Translation\\TranslatorBagInterface")
                    .setLookup(TranslatorBagInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/translation/TranslatorBagInterface.php")
                    .get();
}
