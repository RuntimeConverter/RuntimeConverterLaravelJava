package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Bus.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Bus.classes.Dispatcher;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Contracts/Bus/QueueingDispatcher.php

*/

public interface QueueingDispatcher extends Dispatcher {

    public static final Object CONST_class = "Illuminate\\Contracts\\Bus\\QueueingDispatcher";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    public Object dispatchToQueue(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Bus\\QueueingDispatcher")
                    .setLookup(QueueingDispatcher.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Bus/QueueingDispatcher.php")
                    .addInterface("Illuminate\\Contracts\\Bus\\Dispatcher")
                    .get();
}
