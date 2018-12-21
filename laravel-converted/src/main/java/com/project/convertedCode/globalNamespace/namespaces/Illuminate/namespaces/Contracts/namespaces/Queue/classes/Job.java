package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes;

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

 vendor/laravel/framework/src/Illuminate/Contracts/Queue/Job.php

*/

public interface Job {

    public static final Object CONST_class = "Illuminate\\Contracts\\Queue\\Job";

    @ConvertedMethod
    public Object getJobId(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object payload(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object fire(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay", defaultValue = "0", defaultValueType = "number")
    public Object release(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object delete(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object isDeleted(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object isDeletedOrReleased(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object attempts(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e")
    public Object failed(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object maxTries(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object timeout(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object timeoutAt(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object resolveName(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getConnectionName(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getQueue(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getRawBody(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Queue\\Job")
                    .setLookup(Job.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/laravel/framework/src/Illuminate/Contracts/Queue/Job.php")
                    .get();
}
