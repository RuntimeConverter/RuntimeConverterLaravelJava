package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Validation.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.MessageProvider;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Contracts/Validation/Validator.php

*/

public interface Validator extends MessageProvider {

    public static final Object CONST_class = "Illuminate\\Contracts\\Validation\\Validator";

    @ConvertedMethod
    public Object fails(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object failed(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "rules")
    @ConvertedParameter(index = 2, name = "callback", typeHint = "callable")
    public Object sometimes(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object after(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object errors(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Validation\\Validator")
                    .setLookup(Validator.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Validation/Validator.php")
                    .addInterface("Illuminate\\Contracts\\Support\\MessageProvider")
                    .get();
}
