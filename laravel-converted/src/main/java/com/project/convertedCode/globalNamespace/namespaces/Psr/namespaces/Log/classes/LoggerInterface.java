package com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Log.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psr/log/Psr/Log/LoggerInterface.php

*/

public interface LoggerInterface {

    public static final Object CONST_class = "Psr\\Log\\LoggerInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object emergency(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object alert(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object critical(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object error(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object warning(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object notice(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object info(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object debug(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    @ConvertedParameter(index = 1, name = "message")
    @ConvertedParameter(
        index = 2,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object log(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psr\\Log\\LoggerInterface")
                    .setLookup(LoggerInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/psr/log/Psr/Log/LoggerInterface.php")
                    .get();
}
