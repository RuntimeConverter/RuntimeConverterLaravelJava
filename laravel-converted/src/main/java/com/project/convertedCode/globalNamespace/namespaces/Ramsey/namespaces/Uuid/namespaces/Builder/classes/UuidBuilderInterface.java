package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Builder.classes;

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

 vendor/ramsey/uuid/src/Builder/UuidBuilderInterface.php

*/

public interface UuidBuilderInterface {

    public static final Object CONST_class = "Ramsey\\Uuid\\Builder\\UuidBuilderInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "codec", typeHint = "Ramsey\\Uuid\\Codec\\CodecInterface")
    @ConvertedParameter(index = 1, name = "fields", typeHint = "array")
    public Object build(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Ramsey\\Uuid\\Builder\\UuidBuilderInterface")
                    .setLookup(UuidBuilderInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/ramsey/uuid/src/Builder/UuidBuilderInterface.php")
                    .get();
}
