package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.namespaces.Scheduling.classes;

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

 vendor/laravel/framework/src/Illuminate/Console/Scheduling/SchedulingMutex.php

*/

public interface SchedulingMutex {

    public static final Object CONST_class = "Illuminate\\Console\\Scheduling\\SchedulingMutex";

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Illuminate\\Console\\Scheduling\\Event"
    )
    @ConvertedParameter(index = 1, name = "time", typeHint = "DateTimeInterface")
    public Object create(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Illuminate\\Console\\Scheduling\\Event"
    )
    @ConvertedParameter(index = 1, name = "time", typeHint = "DateTimeInterface")
    public Object exists(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Console\\Scheduling\\SchedulingMutex")
                    .setLookup(SchedulingMutex.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Console/Scheduling/SchedulingMutex.php")
                    .get();
}
