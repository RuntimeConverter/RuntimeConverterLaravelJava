package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Cache.classes;

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

 vendor/laravel/framework/src/Illuminate/Contracts/Cache/Factory.php

*/

public interface Factory {

    public static final Object CONST_class = "Illuminate\\Contracts\\Cache\\Factory";

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object store(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Cache\\Factory")
                    .setLookup(Factory.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Cache/Factory.php")
                    .get();
}
