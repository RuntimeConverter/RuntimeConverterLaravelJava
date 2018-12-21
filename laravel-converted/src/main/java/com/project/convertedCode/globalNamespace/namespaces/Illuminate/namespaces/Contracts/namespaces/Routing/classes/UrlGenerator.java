package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Routing.classes;

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

 vendor/laravel/framework/src/Illuminate/Contracts/Routing/UrlGenerator.php

*/

public interface UrlGenerator {

    public static final Object CONST_class = "Illuminate\\Contracts\\Routing\\UrlGenerator";

    @ConvertedMethod
    public Object current(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "extra", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "secure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object to(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object secure(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(
        index = 1,
        name = "secure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object asset(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "absolute",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object route(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "action")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "absolute",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object action(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rootNamespace")
    public Object setRootControllerNamespace(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Routing\\UrlGenerator")
                    .setLookup(UrlGenerator.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Routing/UrlGenerator.php")
                    .get();
}
