package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Command.namespaces.Descriptor.classes;

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

 vendor/symfony/var-dumper/Command/Descriptor/DumpDescriptorInterface.php

*/

public interface DumpDescriptorInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\VarDumper\\Command\\Descriptor\\DumpDescriptorInterface";

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "data",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Data"
    )
    @ConvertedParameter(index = 2, name = "context", typeHint = "array")
    @ConvertedParameter(index = 3, name = "clientId", typeHint = "int")
    public Object describe(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\VarDumper\\Command\\Descriptor\\DumpDescriptorInterface")
                    .setLookup(DumpDescriptorInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/symfony/var-dumper/Command/Descriptor/DumpDescriptorInterface.php")
                    .get();
}
