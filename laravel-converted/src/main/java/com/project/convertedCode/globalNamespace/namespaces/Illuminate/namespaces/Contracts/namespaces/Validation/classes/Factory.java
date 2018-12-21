package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Validation.classes;

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

 vendor/laravel/framework/src/Illuminate/Contracts/Validation/Factory.php

*/

public interface Factory {

    public static final Object CONST_class = "Illuminate\\Contracts\\Validation\\Factory";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    @ConvertedParameter(index = 1, name = "rules", typeHint = "array")
    @ConvertedParameter(
        index = 2,
        name = "messages",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "customAttributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object make(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rule")
    @ConvertedParameter(index = 1, name = "extension")
    @ConvertedParameter(
        index = 2,
        name = "message",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object extend(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rule")
    @ConvertedParameter(index = 1, name = "extension")
    @ConvertedParameter(
        index = 2,
        name = "message",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object extendImplicit(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rule")
    @ConvertedParameter(index = 1, name = "replacer")
    public Object replacer(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Validation\\Factory")
                    .setLookup(Factory.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Validation/Factory.php")
                    .get();
}
