package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Input/StreamableInputInterface.php

*/

public interface StreamableInputInterface extends InputInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\Input\\StreamableInputInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stream")
    public Object setStream(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getStream(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Input\\StreamableInputInterface")
                    .setLookup(StreamableInputInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/console/Input/StreamableInputInterface.php")
                    .addInterface("Symfony\\Component\\Console\\Input\\InputInterface")
                    .get();
}
