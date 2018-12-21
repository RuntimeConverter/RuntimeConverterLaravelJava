package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Notifications.classes;

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

 vendor/laravel/framework/src/Illuminate/Contracts/Notifications/Factory.php

*/

public interface Factory {

    public static final Object CONST_class = "Illuminate\\Contracts\\Notifications\\Factory";

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object channel(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiables")
    @ConvertedParameter(index = 1, name = "notification")
    public Object send(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "notifiables")
    @ConvertedParameter(index = 1, name = "notification")
    public Object sendNow(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Notifications\\Factory")
                    .setLookup(Factory.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Notifications/Factory.php")
                    .get();
}
