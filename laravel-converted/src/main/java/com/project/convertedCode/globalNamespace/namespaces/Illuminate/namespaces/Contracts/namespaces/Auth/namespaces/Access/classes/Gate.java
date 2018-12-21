package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.namespaces.Access.classes;

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

 vendor/laravel/framework/src/Illuminate/Contracts/Auth/Access/Gate.php

*/

public interface Gate {

    public static final Object CONST_class = "Illuminate\\Contracts\\Auth\\Access\\Gate";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ability")
    public Object has(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ability")
    @ConvertedParameter(index = 1, name = "callback")
    public Object define(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "policy")
    public Object policy(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    public Object before(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    public Object after(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ability")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object allows(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ability")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object denies(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abilities")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object check(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abilities")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object any(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ability")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object authorize(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object getPolicyFor(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "user")
    public Object forUser(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object abilities(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Auth\\Access\\Gate")
                    .setLookup(Gate.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Auth/Access/Gate.php")
                    .get();
}
