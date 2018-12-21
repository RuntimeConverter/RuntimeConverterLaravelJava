package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes;

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

 vendor/laravel/framework/src/Illuminate/Database/Eloquent/Scope.php

*/

public interface Scope {

    public static final Object CONST_class = "Illuminate\\Database\\Eloquent\\Scope";

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "builder",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    @ConvertedParameter(
        index = 1,
        name = "model",
        typeHint = "Illuminate\\Database\\Eloquent\\Model"
    )
    public Object apply(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Eloquent\\Scope")
                    .setLookup(Scope.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Eloquent/Scope.php")
                    .get();
}
