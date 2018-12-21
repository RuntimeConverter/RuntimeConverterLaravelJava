package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.classes;

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

 vendor/ramsey/uuid/src/UuidFactoryInterface.php

*/

public interface UuidFactoryInterface {

    public static final Object CONST_class = "Ramsey\\Uuid\\UuidFactoryInterface";

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
    public Object uuid1(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ns")
    @ConvertedParameter(index = 1, name = "name")
    public Object uuid3(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object uuid4(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ns")
    @ConvertedParameter(index = 1, name = "name")
    public Object uuid5(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bytes")
    public Object fromBytes(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uuid")
    public Object fromString(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "integer")
    public Object fromInteger(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Ramsey\\Uuid\\UuidFactoryInterface")
                    .setLookup(UuidFactoryInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/ramsey/uuid/src/UuidFactoryInterface.php")
                    .get();
}
