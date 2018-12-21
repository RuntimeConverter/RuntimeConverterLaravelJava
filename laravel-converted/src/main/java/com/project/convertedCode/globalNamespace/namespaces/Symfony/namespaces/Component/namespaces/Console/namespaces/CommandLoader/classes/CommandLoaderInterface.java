package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.CommandLoader.classes;

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

 vendor/symfony/console/CommandLoader/CommandLoaderInterface.php

*/

public interface CommandLoaderInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\CommandLoader\\CommandLoaderInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object get(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object has(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getNames(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\CommandLoader\\CommandLoaderInterface")
                    .setLookup(CommandLoaderInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/console/CommandLoader/CommandLoaderInterface.php")
                    .get();
}
