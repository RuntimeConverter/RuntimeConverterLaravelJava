package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Profiler.classes;

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

 vendor/symfony/http-kernel/Profiler/ProfilerStorageInterface.php

*/

public interface ProfilerStorageInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Profiler\\ProfilerStorageInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ip")
    @ConvertedParameter(index = 1, name = "url")
    @ConvertedParameter(index = 2, name = "limit")
    @ConvertedParameter(index = 3, name = "method")
    @ConvertedParameter(
        index = 4,
        name = "start",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "end",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object find(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    public Object read(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "profile",
        typeHint = "Symfony\\Component\\HttpKernel\\Profiler\\Profile"
    )
    public Object write(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object purge(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\Profiler\\ProfilerStorageInterface")
                    .setLookup(ProfilerStorageInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/http-kernel/Profiler/ProfilerStorageInterface.php")
                    .get();
}
