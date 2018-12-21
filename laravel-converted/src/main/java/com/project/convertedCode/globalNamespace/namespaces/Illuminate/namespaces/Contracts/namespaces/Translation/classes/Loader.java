package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Translation.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Contracts/Translation/Loader.php

*/

public interface Loader {

    public static final Object CONST_class = "Illuminate\\Contracts\\Translation\\Loader";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    @ConvertedParameter(index = 1, name = "group")
    @ConvertedParameter(
        index = 2,
        name = "namespace",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object load(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(index = 1, name = "hint")
    public Object addNamespace(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object addJsonPath(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object namespaces(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Translation\\Loader")
                    .setLookup(Loader.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Translation/Loader.php")
                    .get();
}
