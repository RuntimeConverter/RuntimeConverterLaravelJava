package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Codec.classes;

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

 vendor/ramsey/uuid/src/Codec/CodecInterface.php

*/

public interface CodecInterface {

    public static final Object CONST_class = "Ramsey\\Uuid\\Codec\\CodecInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uuid", typeHint = "Ramsey\\Uuid\\UuidInterface")
    public Object encode(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uuid", typeHint = "Ramsey\\Uuid\\UuidInterface")
    public Object encodeBinary(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "encodedUuid")
    public Object decode(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bytes")
    public Object decodeBytes(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Ramsey\\Uuid\\Codec\\CodecInterface")
                    .setLookup(CodecInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/ramsey/uuid/src/Codec/CodecInterface.php")
                    .get();
}
