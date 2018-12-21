package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes;

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

 vendor/symfony/routing/RequestContextAwareInterface.php

*/

public interface RequestContextAwareInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\Routing\\RequestContextAwareInterface";

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "context",
        typeHint = "Symfony\\Component\\Routing\\RequestContext"
    )
    public Object setContext(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getContext(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Routing\\RequestContextAwareInterface")
                    .setLookup(RequestContextAwareInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/routing/RequestContextAwareInterface.php")
                    .get();
}
