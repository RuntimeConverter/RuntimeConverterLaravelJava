package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.classes;

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

 vendor/laravel/framework/src/Illuminate/Contracts/Auth/Authenticatable.php

*/

public interface Authenticatable {

    public static final Object CONST_class = "Illuminate\\Contracts\\Auth\\Authenticatable";

    @ConvertedMethod
    public Object getAuthIdentifierName(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getAuthIdentifier(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getAuthPassword(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getRememberToken(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object setRememberToken(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getRememberTokenName(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Auth\\Authenticatable")
                    .setLookup(Authenticatable.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Auth/Authenticatable.php")
                    .get();
}
