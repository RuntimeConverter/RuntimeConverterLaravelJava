package com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes;

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

 vendor/nikic/php-parser/lib/PhpParser/ErrorHandler.php

*/

public interface ErrorHandler {

    public static final Object CONST_class = "PhpParser\\ErrorHandler";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "error", typeHint = "PhpParser\\Error")
    public Object handleError(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\ErrorHandler")
                    .setLookup(ErrorHandler.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/ErrorHandler.php")
                    .get();
}
