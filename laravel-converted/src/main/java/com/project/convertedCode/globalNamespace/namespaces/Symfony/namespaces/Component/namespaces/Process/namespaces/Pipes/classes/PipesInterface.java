package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Pipes.classes;

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

 vendor/symfony/process/Pipes/PipesInterface.php

*/

public interface PipesInterface {

    public static final Object CONST_CHUNK_SIZE = 16384;

    public static final Object CONST_class = "Symfony\\Component\\Process\\Pipes\\PipesInterface";

    @ConvertedMethod
    public Object getDescriptors(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getFiles(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "blocking")
    @ConvertedParameter(
        index = 1,
        name = "close",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object readAndWrite(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object areOpen(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object haveReadSupport(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Process\\Pipes\\PipesInterface")
                    .setLookup(PipesInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/process/Pipes/PipesInterface.php")
                    .get();
}
