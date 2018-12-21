package com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Log.classes;

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

 vendor/psr/log/Psr/Log/LoggerAwareInterface.php

*/

public interface LoggerAwareInterface {

    public static final Object CONST_class = "Psr\\Log\\LoggerAwareInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "logger", typeHint = "Psr\\Log\\LoggerInterface")
    public Object setLogger(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psr\\Log\\LoggerAwareInterface")
                    .setLookup(LoggerAwareInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/psr/log/Psr/Log/LoggerAwareInterface.php")
                    .get();
}
