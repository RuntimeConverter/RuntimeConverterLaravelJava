package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.PhpDocumentor.classes;

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

 vendor/phpspec/prophecy/src/Prophecy/PhpDocumentor/MethodTagRetrieverInterface.php

*/

public interface MethodTagRetrieverInterface {

    public static final Object CONST_class = "Prophecy\\PhpDocumentor\\MethodTagRetrieverInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflectionClass", typeHint = "ReflectionClass")
    public Object getTagList(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\PhpDocumentor\\MethodTagRetrieverInterface")
                    .setLookup(MethodTagRetrieverInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/PhpDocumentor/MethodTagRetrieverInterface.php")
                    .get();
}
