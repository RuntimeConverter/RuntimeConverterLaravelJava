package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Converter.classes;

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

 vendor/ramsey/uuid/src/Converter/NumberConverterInterface.php

*/

public interface NumberConverterInterface {

    public static final Object CONST_class = "Ramsey\\Uuid\\Converter\\NumberConverterInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "hex")
    public Object fromHex(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "integer")
    public Object toHex(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Ramsey\\Uuid\\Converter\\NumberConverterInterface")
                    .setLookup(NumberConverterInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/ramsey/uuid/src/Converter/NumberConverterInterface.php")
                    .get();
}
