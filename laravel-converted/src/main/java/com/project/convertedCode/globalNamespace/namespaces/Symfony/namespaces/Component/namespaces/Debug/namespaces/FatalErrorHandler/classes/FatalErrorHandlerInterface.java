package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.FatalErrorHandler.classes;

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

 vendor/symfony/debug/FatalErrorHandler/FatalErrorHandlerInterface.php

*/

public interface FatalErrorHandlerInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\Debug\\FatalErrorHandler\\FatalErrorHandlerInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "error", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "exception",
        typeHint = "Symfony\\Component\\Debug\\Exception\\FatalErrorException"
    )
    public Object handleError(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\Debug\\FatalErrorHandler\\FatalErrorHandlerInterface")
                    .setLookup(FatalErrorHandlerInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/symfony/debug/FatalErrorHandler/FatalErrorHandlerInterface.php")
                    .get();
}
