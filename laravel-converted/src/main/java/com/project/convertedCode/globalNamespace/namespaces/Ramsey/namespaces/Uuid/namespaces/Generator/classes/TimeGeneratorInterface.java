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

 vendor/ramsey/uuid/src/Generator/TimeGeneratorInterface.php

*/

public interface TimeGeneratorInterface {

    public static final Object CONST_class = "Ramsey\\Uuid\\Generator\\TimeGeneratorInterface";

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "clockSeq",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object generate(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Ramsey\\Uuid\\Generator\\TimeGeneratorInterface")
                    .setLookup(TimeGeneratorInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/ramsey/uuid/src/Generator/TimeGeneratorInterface.php")
                    .get();
}
