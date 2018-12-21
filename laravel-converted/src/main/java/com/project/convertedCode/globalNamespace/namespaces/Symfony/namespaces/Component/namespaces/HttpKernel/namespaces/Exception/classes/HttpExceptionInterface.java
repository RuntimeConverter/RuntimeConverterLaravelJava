package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Exception/HttpExceptionInterface.php

*/

public interface HttpExceptionInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Exception\\HttpExceptionInterface";

    @ConvertedMethod
    public Object getStatusCode(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getHeaders(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\Exception\\HttpExceptionInterface")
                    .setLookup(HttpExceptionInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/http-kernel/Exception/HttpExceptionInterface.php")
                    .get();
}
