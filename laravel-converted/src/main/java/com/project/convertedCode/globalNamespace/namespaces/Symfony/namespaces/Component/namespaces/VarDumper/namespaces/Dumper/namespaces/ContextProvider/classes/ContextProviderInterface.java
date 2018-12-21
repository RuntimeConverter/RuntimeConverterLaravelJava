package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.namespaces.ContextProvider.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Dumper/ContextProvider/ContextProviderInterface.php

*/

public interface ContextProviderInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\VarDumper\\Dumper\\ContextProvider\\ContextProviderInterface";

    @ConvertedMethod
    public Object getContext(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\VarDumper\\Dumper\\ContextProvider\\ContextProviderInterface")
                    .setLookup(ContextProviderInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/symfony/var-dumper/Dumper/ContextProvider/ContextProviderInterface.php")
                    .get();
}
