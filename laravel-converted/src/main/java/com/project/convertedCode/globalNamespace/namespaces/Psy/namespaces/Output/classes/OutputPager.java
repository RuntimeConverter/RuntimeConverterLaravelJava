package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Output.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.OutputInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Output/OutputPager.php

*/

public interface OutputPager extends OutputInterface {

    public static final Object CONST_class = "Psy\\Output\\OutputPager";

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Output\\OutputPager")
                    .setLookup(OutputPager.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/psy/psysh/src/Output/OutputPager.php")
                    .addInterface("Symfony\\Component\\Console\\Output\\OutputInterface")
                    .get();
}
