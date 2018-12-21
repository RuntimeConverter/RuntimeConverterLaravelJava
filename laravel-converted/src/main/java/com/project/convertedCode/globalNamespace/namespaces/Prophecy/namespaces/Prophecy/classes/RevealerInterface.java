package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prophecy.classes;

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

 vendor/phpspec/prophecy/src/Prophecy/Prophecy/RevealerInterface.php

*/

public interface RevealerInterface {

    public static final Object CONST_class = "Prophecy\\Prophecy\\RevealerInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object reveal(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Prophecy\\RevealerInterface")
                    .setLookup(RevealerInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Prophecy/RevealerInterface.php")
                    .get();
}
