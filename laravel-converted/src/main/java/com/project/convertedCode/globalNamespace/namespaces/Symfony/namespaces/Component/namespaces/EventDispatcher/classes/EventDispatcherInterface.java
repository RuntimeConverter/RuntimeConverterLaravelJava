package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes;

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

 vendor/symfony/event-dispatcher/EventDispatcherInterface.php

*/

public interface EventDispatcherInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\EventDispatcher\\EventDispatcherInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    @ConvertedParameter(
        index = 1,
        name = "event",
        typeHint = "Symfony\\Component\\EventDispatcher\\Event",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object dispatch(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    @ConvertedParameter(index = 1, name = "listener")
    @ConvertedParameter(
        index = 2,
        name = "priority",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object addListener(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "subscriber",
        typeHint = "Symfony\\Component\\EventDispatcher\\EventSubscriberInterface"
    )
    public Object addSubscriber(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    @ConvertedParameter(index = 1, name = "listener")
    public Object removeListener(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "subscriber",
        typeHint = "Symfony\\Component\\EventDispatcher\\EventSubscriberInterface"
    )
    public Object removeSubscriber(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "eventName",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getListeners(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    @ConvertedParameter(index = 1, name = "listener")
    public Object getListenerPriority(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "eventName",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object hasListeners(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\EventDispatcher\\EventDispatcherInterface")
                    .setLookup(EventDispatcherInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/event-dispatcher/EventDispatcherInterface.php")
                    .get();
}
