package com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Container.classes;

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

 vendor/psr/container/src/ContainerInterface.php

*/

public interface ContainerInterface {

    public static final Object CONST_class = "Psr\\Container\\ContainerInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object get(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object has(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psr\\Container\\ContainerInterface")
                    .setLookup(ContainerInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/psr/container/src/ContainerInterface.php")
                    .get();
}
