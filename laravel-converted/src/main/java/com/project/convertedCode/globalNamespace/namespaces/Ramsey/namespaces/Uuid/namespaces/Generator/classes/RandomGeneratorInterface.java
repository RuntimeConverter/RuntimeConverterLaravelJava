package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Generator.classes;

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

 vendor/ramsey/uuid/src/Generator/RandomGeneratorInterface.php

*/

public interface RandomGeneratorInterface {

    public static final Object CONST_class = "Ramsey\\Uuid\\Generator\\RandomGeneratorInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "length")
    public Object generate(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Ramsey\\Uuid\\Generator\\RandomGeneratorInterface")
                    .setLookup(RandomGeneratorInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/ramsey/uuid/src/Generator/RandomGeneratorInterface.php")
                    .get();
}
