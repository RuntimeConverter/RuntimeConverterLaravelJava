package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.OutputInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Output/ConsoleOutputInterface.php

*/

public interface ConsoleOutputInterface extends OutputInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\Output\\ConsoleOutputInterface";

    @ConvertedMethod
    public Object getErrorOutput(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "error",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    public Object setErrorOutput(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Output\\ConsoleOutputInterface")
                    .setLookup(ConsoleOutputInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/console/Output/ConsoleOutputInterface.php")
                    .addInterface("Symfony\\Component\\Console\\Output\\OutputInterface")
                    .get();
}
