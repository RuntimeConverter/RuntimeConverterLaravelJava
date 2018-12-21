package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Arrayable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Contracts/Support/MessageBag.php

*/

public interface MessageBag extends Arrayable {

    public static final Object CONST_class = "Illuminate\\Contracts\\Support\\MessageBag";

    @ConvertedMethod
    public Object keys(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "message")
    public Object add(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages")
    public Object merge(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object has(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "format",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object first(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "format",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object get(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "format",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object all(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getMessages(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getFormat(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "format")
    public Object setFormat(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object isEmpty(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object isNotEmpty(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Support\\MessageBag")
                    .setLookup(MessageBag.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Support/MessageBag.php")
                    .addInterface("Illuminate\\Contracts\\Support\\Arrayable")
                    .get();
}
