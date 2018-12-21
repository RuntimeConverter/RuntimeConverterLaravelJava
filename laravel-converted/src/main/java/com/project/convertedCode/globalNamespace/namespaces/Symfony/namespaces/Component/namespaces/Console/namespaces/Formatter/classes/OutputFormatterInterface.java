package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes;

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

 vendor/symfony/console/Formatter/OutputFormatterInterface.php

*/

public interface OutputFormatterInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\Formatter\\OutputFormatterInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "decorated")
    public Object setDecorated(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object isDecorated(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "style",
        typeHint = "Symfony\\Component\\Console\\Formatter\\OutputFormatterStyleInterface"
    )
    public Object setStyle(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasStyle(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getStyle(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object format(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Formatter\\OutputFormatterInterface")
                    .setLookup(OutputFormatterInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/console/Formatter/OutputFormatterInterface.php")
                    .get();
}
