package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

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

 vendor/monolog/monolog/src/Monolog/Handler/HandlerInterface.php

*/

public interface HandlerInterface {

    public static final Object CONST_class = "Monolog\\Handler\\HandlerInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object isHandling(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object handle(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    public Object handleBatch(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object pushProcessor(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object popProcessor(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "formatter",
        typeHint = "Monolog\\Formatter\\FormatterInterface"
    )
    public Object setFormatter(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getFormatter(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\HandlerInterface")
                    .setLookup(HandlerInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/HandlerInterface.php")
                    .get();
}
