package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes;

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

 vendor/mockery/mockery/library/Mockery/Generator/Generator.php

*/

public interface Generator {

    public static final Object CONST_class = "Mockery\\Generator\\Generator";

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "config",
        typeHint = "Mockery\\Generator\\MockConfiguration"
    )
    public Object generate(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Mockery\\Generator\\Generator")
                    .setLookup(Generator.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/mockery/mockery/library/Mockery/Generator/Generator.php")
                    .get();
}
