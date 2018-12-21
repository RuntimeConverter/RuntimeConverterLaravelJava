package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.classes;

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

 vendor/laravel/framework/src/Illuminate/Contracts/Auth/Guard.php

*/

public interface Guard {

    public static final Object CONST_class = "Illuminate\\Contracts\\Auth\\Guard";

    @ConvertedMethod
    public Object check(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object guest(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object user(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object id(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "credentials",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object validate(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "user",
        typeHint = "Illuminate\\Contracts\\Auth\\Authenticatable"
    )
    public Object setUser(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Auth\\Guard")
                    .setLookup(Guard.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/laravel/framework/src/Illuminate/Contracts/Auth/Guard.php")
                    .get();
}
