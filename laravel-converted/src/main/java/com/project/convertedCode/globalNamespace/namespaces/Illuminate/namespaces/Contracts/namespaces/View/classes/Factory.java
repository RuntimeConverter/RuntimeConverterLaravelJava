package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.View.classes;

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

 vendor/laravel/framework/src/Illuminate/Contracts/View/Factory.php

*/

public interface Factory {

    public static final Object CONST_class = "Illuminate\\Contracts\\View\\Factory";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view")
    public Object exists(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "data", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "mergeData",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object file(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view")
    @ConvertedParameter(index = 1, name = "data", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "mergeData",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object make(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object share(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "views")
    @ConvertedParameter(index = 1, name = "callback")
    public Object composer(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "views")
    @ConvertedParameter(index = 1, name = "callback")
    public Object creator(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(index = 1, name = "hints")
    public Object addNamespace(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(index = 1, name = "hints")
    public Object replaceNamespace(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\View\\Factory")
                    .setLookup(Factory.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/View/Factory.php")
                    .get();
}
