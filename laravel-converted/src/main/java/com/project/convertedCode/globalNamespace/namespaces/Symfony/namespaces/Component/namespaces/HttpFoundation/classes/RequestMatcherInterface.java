package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes;

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

 vendor/symfony/http-foundation/RequestMatcherInterface.php

*/

public interface RequestMatcherInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\RequestMatcherInterface";

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    public Object matches(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpFoundation\\RequestMatcherInterface")
                    .setLookup(RequestMatcherInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/http-foundation/RequestMatcherInterface.php")
                    .get();
}
