package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes;

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

 vendor/symfony/http-kernel/HttpKernelInterface.php

*/

public interface HttpKernelInterface {

    public static final Object CONST_MASTER_REQUEST = 1;

    public static final Object CONST_SUB_REQUEST = 2;

    public static final Object CONST_class = "Symfony\\Component\\HttpKernel\\HttpKernelInterface";

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(index = 1, name = "type")
    @ConvertedParameter(
        index = 2,
        name = "catch",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object handle(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\HttpKernelInterface")
                    .setLookup(HttpKernelInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/http-kernel/HttpKernelInterface.php")
                    .get();
}
