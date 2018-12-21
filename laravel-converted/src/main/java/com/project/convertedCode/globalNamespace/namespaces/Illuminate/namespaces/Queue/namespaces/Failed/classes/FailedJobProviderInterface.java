package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Failed.classes;

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

 vendor/laravel/framework/src/Illuminate/Queue/Failed/FailedJobProviderInterface.php

*/

public interface FailedJobProviderInterface {

    public static final Object CONST_class =
            "Illuminate\\Queue\\Failed\\FailedJobProviderInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    @ConvertedParameter(index = 1, name = "queue")
    @ConvertedParameter(index = 2, name = "payload")
    @ConvertedParameter(index = 3, name = "exception")
    public Object log(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object all(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object find(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object forget(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Queue\\Failed\\FailedJobProviderInterface")
                    .setLookup(FailedJobProviderInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Queue/Failed/FailedJobProviderInterface.php")
                    .get();
}
