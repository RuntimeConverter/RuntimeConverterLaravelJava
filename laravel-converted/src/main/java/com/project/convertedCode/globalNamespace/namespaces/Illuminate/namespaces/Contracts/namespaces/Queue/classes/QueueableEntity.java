package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Contracts/Queue/QueueableEntity.php

*/

public interface QueueableEntity {

    public static final Object CONST_class = "Illuminate\\Contracts\\Queue\\QueueableEntity";

    @ConvertedMethod
    public Object getQueueableId(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getQueueableRelations(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getQueueableConnection(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Queue\\QueueableEntity")
                    .setLookup(QueueableEntity.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Queue/QueueableEntity.php")
                    .get();
}
