package com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Container.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Container.classes.ContainerExceptionInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psr/container/src/NotFoundExceptionInterface.php

*/

public interface NotFoundExceptionInterface extends ContainerExceptionInterface {

    public static final Object CONST_class = "Psr\\Container\\NotFoundExceptionInterface";

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psr\\Container\\NotFoundExceptionInterface")
                    .setLookup(NotFoundExceptionInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/psr/container/src/NotFoundExceptionInterface.php")
                    .addInterface("Psr\\Container\\ContainerExceptionInterface")
                    .get();
}
