package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Dumper.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Dumper/DumperInterface.php

*/

public interface DumperInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Dumper\\DumperInterface";

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "messages",
        typeHint = "Symfony\\Component\\Translation\\MessageCatalogue"
    )
    @ConvertedParameter(index = 1, name = "options", defaultValue = "", defaultValueType = "array")
    public Object dump(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Translation\\Dumper\\DumperInterface")
                    .setLookup(DumperInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/translation/Dumper/DumperInterface.php")
                    .get();
}
