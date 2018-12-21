package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes;

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

 vendor/laravel/framework/src/Illuminate/Contracts/Queue/Queue.php

*/

public interface Queue {

    public static final Object CONST_class = "Illuminate\\Contracts\\Queue\\Queue";

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object size(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    @ConvertedParameter(index = 1, name = "data")
    @ConvertedParameter(
        index = 2,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object push(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    @ConvertedParameter(index = 1, name = "job")
    @ConvertedParameter(index = 2, name = "data")
    public Object pushOn(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "payload")
    @ConvertedParameter(
        index = 1,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object pushRaw(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay")
    @ConvertedParameter(index = 1, name = "job")
    @ConvertedParameter(index = 2, name = "data")
    @ConvertedParameter(
        index = 3,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object later(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    @ConvertedParameter(index = 1, name = "delay")
    @ConvertedParameter(index = 2, name = "job")
    @ConvertedParameter(index = 3, name = "data")
    public Object laterOn(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "jobs")
    @ConvertedParameter(index = 1, name = "data")
    @ConvertedParameter(
        index = 2,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object bulk(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object pop(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getConnectionName(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setConnectionName(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Queue\\Queue")
                    .setLookup(Queue.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Queue/Queue.php")
                    .get();
}
