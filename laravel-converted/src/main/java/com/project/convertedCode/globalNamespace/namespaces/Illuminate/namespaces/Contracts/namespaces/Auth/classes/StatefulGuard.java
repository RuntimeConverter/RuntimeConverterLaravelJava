package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.classes.Guard;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Contracts/Auth/StatefulGuard.php

*/

public interface StatefulGuard extends Guard {

    public static final Object CONST_class = "Illuminate\\Contracts\\Auth\\StatefulGuard";

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "credentials",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 1,
        name = "remember",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object attempt(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "credentials",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object once(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "user",
        typeHint = "Illuminate\\Contracts\\Auth\\Authenticatable"
    )
    @ConvertedParameter(
        index = 1,
        name = "remember",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object login(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(
        index = 1,
        name = "remember",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object loginUsingId(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object onceUsingId(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object viaRemember(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object logout(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Auth\\StatefulGuard")
                    .setLookup(StatefulGuard.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Auth/StatefulGuard.php")
                    .addInterface("Illuminate\\Contracts\\Auth\\Guard")
                    .get();
}
