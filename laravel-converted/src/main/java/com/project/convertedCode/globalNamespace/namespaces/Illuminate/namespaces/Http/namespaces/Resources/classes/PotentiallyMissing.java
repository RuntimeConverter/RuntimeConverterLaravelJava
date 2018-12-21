package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Resources.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Http/Resources/PotentiallyMissing.php

*/

public interface PotentiallyMissing {

    public static final Object CONST_class = "Illuminate\\Http\\Resources\\PotentiallyMissing";

    @ConvertedMethod
    public Object isMissing(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Http\\Resources\\PotentiallyMissing")
                    .setLookup(PotentiallyMissing.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Http/Resources/PotentiallyMissing.php")
                    .get();
}
