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

 vendor/symfony/translation/MessageCatalogueInterface.php

*/

public interface MessageCatalogueInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\MessageCatalogueInterface";

    @ConvertedMethod
    public Object getLocale(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getDomains(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "domain",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object all(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(index = 1, name = "translation")
    @ConvertedParameter(index = 2, name = "domain")
    public Object set(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(index = 1, name = "domain")
    public Object has(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(index = 1, name = "domain")
    public Object defines(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(index = 1, name = "domain")
    public Object get(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages")
    @ConvertedParameter(index = 1, name = "domain")
    public Object replace(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages")
    @ConvertedParameter(index = 1, name = "domain")
    public Object add(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "catalogue", typeHint = "self")
    public Object addCatalogue(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "catalogue", typeHint = "self")
    public Object addFallbackCatalogue(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getFallbackCatalogue(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getResources(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "resource",
        typeHint = "Symfony\\Component\\Config\\Resource\\ResourceInterface"
    )
    public Object addResource(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Translation\\MessageCatalogueInterface")
                    .setLookup(MessageCatalogueInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/translation/MessageCatalogueInterface.php")
                    .get();
}
