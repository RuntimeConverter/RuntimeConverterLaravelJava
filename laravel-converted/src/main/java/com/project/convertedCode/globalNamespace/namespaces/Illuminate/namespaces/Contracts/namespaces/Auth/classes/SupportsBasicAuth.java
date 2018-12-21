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

 vendor/laravel/framework/src/Illuminate/Contracts/Auth/SupportsBasicAuth.php

*/

public interface SupportsBasicAuth {

    public static final Object CONST_class = "Illuminate\\Contracts\\Auth\\SupportsBasicAuth";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "field")
    @ConvertedParameter(
        index = 1,
        name = "extraConditions",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object basic(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "field")
    @ConvertedParameter(
        index = 1,
        name = "extraConditions",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object onceBasic(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Auth\\SupportsBasicAuth")
                    .setLookup(SupportsBasicAuth.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Auth/SupportsBasicAuth.php")
                    .get();
}
