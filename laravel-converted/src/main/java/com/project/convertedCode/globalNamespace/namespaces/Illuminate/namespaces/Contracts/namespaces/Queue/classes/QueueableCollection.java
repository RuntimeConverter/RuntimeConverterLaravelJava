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

 vendor/laravel/framework/src/Illuminate/Contracts/Queue/QueueableCollection.php

*/

public interface QueueableCollection {

    public static final Object CONST_class = "Illuminate\\Contracts\\Queue\\QueueableCollection";

    @ConvertedMethod
    public Object getQueueableClass(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getQueueableIds(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getQueueableRelations(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getQueueableConnection(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Queue\\QueueableCollection")
                    .setLookup(QueueableCollection.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Queue/QueueableCollection.php")
                    .get();
}
