package com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.SimpleCache.classes;

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

 vendor/psr/simple-cache/src/CacheInterface.php

*/

public interface CacheInterface {

    public static final Object CONST_class = "Psr\\SimpleCache\\CacheInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object get(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(
        index = 2,
        name = "ttl",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object set(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object delete(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getMultiple(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values")
    @ConvertedParameter(
        index = 1,
        name = "ttl",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setMultiple(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys")
    public Object deleteMultiple(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object has(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psr\\SimpleCache\\CacheInterface")
                    .setLookup(CacheInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/psr/simple-cache/src/CacheInterface.php")
                    .get();
}
