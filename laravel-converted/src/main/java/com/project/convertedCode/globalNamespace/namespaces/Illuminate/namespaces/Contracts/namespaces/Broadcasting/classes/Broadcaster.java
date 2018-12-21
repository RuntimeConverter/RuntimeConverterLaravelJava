package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Broadcasting.classes;

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

 vendor/laravel/framework/src/Illuminate/Contracts/Broadcasting/Broadcaster.php

*/

public interface Broadcaster {

    public static final Object CONST_class = "Illuminate\\Contracts\\Broadcasting\\Broadcaster";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    public Object auth(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "result")
    public Object validAuthenticationResponse(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "channels", typeHint = "array")
    @ConvertedParameter(index = 1, name = "event")
    @ConvertedParameter(
        index = 2,
        name = "payload",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object broadcast(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Broadcasting\\Broadcaster")
                    .setLookup(Broadcaster.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Broadcasting/Broadcaster.php")
                    .get();
}
