package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.namespaces.Debug.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes.EventDispatcherInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/event-dispatcher/Debug/TraceableEventDispatcherInterface.php

*/

public interface TraceableEventDispatcherInterface extends EventDispatcherInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\EventDispatcher\\Debug\\TraceableEventDispatcherInterface";

    @ConvertedMethod
    public Object getCalledListeners(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getNotCalledListeners(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\EventDispatcher\\Debug\\TraceableEventDispatcherInterface")
                    .setLookup(TraceableEventDispatcherInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/symfony/event-dispatcher/Debug/TraceableEventDispatcherInterface.php")
                    .addInterface("Symfony\\Component\\EventDispatcher\\EventDispatcherInterface")
                    .get();
}
