package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Cookie.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Cookie.classes.Factory;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Contracts/Cookie/QueueingFactory.php

*/

public interface QueueingFactory extends Factory {

    public static final Object CONST_class = "Illuminate\\Contracts\\Cookie\\QueueingFactory";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters")
    public Object queue(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object unqueue(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getQueuedCookies(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Cookie\\QueueingFactory")
                    .setLookup(QueueingFactory.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Cookie/QueueingFactory.php")
                    .addInterface("Illuminate\\Contracts\\Cookie\\Factory")
                    .get();
}
