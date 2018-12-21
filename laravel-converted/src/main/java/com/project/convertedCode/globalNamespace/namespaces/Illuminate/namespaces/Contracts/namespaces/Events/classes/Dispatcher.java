package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Events.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Contracts/Events/Dispatcher.php

*/

public interface Dispatcher {

    public static final Object CONST_class = "Illuminate\\Contracts\\Events\\Dispatcher";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "events")
    @ConvertedParameter(index = 1, name = "listener")
    public Object listen(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    public Object hasListeners(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "subscriber")
    public Object subscribe(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    @ConvertedParameter(index = 1, name = "payload", defaultValue = "", defaultValueType = "array")
    public Object until(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    @ConvertedParameter(index = 1, name = "payload", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "halt",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object dispatch(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    @ConvertedParameter(index = 1, name = "payload", defaultValue = "", defaultValueType = "array")
    public Object push(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    public Object flush(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    public Object forget(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object forgetPushed(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Events\\Dispatcher")
                    .setLookup(Dispatcher.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Events/Dispatcher.php")
                    .get();
}
