package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes;

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

 vendor/symfony/console/Helper/HelperInterface.php

*/

public interface HelperInterface {

    public static final Object CONST_class = "Symfony\\Component\\Console\\Helper\\HelperInterface";

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "helperSet",
        typeHint = "Symfony\\Component\\Console\\Helper\\HelperSet",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setHelperSet(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getHelperSet(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Helper\\HelperInterface")
                    .setLookup(HelperInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/console/Helper/HelperInterface.php")
                    .get();
}
