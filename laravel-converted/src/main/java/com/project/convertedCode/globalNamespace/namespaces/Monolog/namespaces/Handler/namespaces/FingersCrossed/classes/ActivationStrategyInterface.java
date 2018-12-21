package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.namespaces.FingersCrossed.classes;

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

 vendor/monolog/monolog/src/Monolog/Handler/FingersCrossed/ActivationStrategyInterface.php

*/

public interface ActivationStrategyInterface {

    public static final Object CONST_class =
            "Monolog\\Handler\\FingersCrossed\\ActivationStrategyInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object isHandlerActivated(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\FingersCrossed\\ActivationStrategyInterface")
                    .setLookup(ActivationStrategyInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Handler/FingersCrossed/ActivationStrategyInterface.php")
                    .get();
}
