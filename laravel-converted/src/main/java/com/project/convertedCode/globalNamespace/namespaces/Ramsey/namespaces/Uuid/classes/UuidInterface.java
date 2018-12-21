package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.Serializable;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeInterfaces.JsonSerializable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/ramsey/uuid/src/UuidInterface.php

*/

public interface UuidInterface extends JsonSerializable, Serializable {

    public static final Object CONST_class = "Ramsey\\Uuid\\UuidInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other", typeHint = "Ramsey\\Uuid\\UuidInterface")
    public Object compareTo(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    public Object equals(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getBytes(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getNumberConverter(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getHex(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getFieldsHex(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getClockSeqHiAndReservedHex(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getClockSeqLowHex(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getClockSequenceHex(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getDateTime(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getInteger(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getLeastSignificantBitsHex(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getMostSignificantBitsHex(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getNodeHex(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getTimeHiAndVersionHex(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getTimeLowHex(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getTimeMidHex(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getTimestampHex(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getUrn(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getVariant(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getVersion(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Ramsey\\Uuid\\UuidInterface")
                    .setLookup(UuidInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/ramsey/uuid/src/UuidInterface.php")
                    .addInterface("JsonSerializable")
                    .addInterface("Serializable")
                    .get();
}
