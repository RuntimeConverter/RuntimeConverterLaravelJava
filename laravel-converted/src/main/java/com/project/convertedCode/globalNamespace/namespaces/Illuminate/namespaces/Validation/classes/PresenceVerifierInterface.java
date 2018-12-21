package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.classes;

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

 vendor/laravel/framework/src/Illuminate/Validation/PresenceVerifierInterface.php

*/

public interface PresenceVerifierInterface {

    public static final Object CONST_class = "Illuminate\\Validation\\PresenceVerifierInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "collection")
    @ConvertedParameter(index = 1, name = "column")
    @ConvertedParameter(index = 2, name = "value")
    @ConvertedParameter(
        index = 3,
        name = "excludeId",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "idColumn",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "extra",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object getCount(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "collection")
    @ConvertedParameter(index = 1, name = "column")
    @ConvertedParameter(index = 2, name = "values", typeHint = "array")
    @ConvertedParameter(
        index = 3,
        name = "extra",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object getMultiCount(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Validation\\PresenceVerifierInterface")
                    .setLookup(PresenceVerifierInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Validation/PresenceVerifierInterface.php")
                    .get();
}
