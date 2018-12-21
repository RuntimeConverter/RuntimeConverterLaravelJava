package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.namespaces.Matching.classes;

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

 vendor/laravel/framework/src/Illuminate/Routing/Matching/ValidatorInterface.php

*/

public interface ValidatorInterface {

    public static final Object CONST_class = "Illuminate\\Routing\\Matching\\ValidatorInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route", typeHint = "Illuminate\\Routing\\Route")
    @ConvertedParameter(index = 1, name = "request", typeHint = "Illuminate\\Http\\Request")
    public Object matches(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Routing\\Matching\\ValidatorInterface")
                    .setLookup(ValidatorInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Routing/Matching/ValidatorInterface.php")
                    .get();
}
