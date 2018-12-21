package com.project.convertedCode.globalNamespace.namespaces.Mockery.classes;

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

 vendor/mockery/mockery/library/Mockery/ExpectationInterface.php

*/

public interface ExpectationInterface {

    public static final Object CONST_class = "Mockery\\ExpectationInterface";

    @ConvertedMethod
    public Object getOrderNumber(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getMock(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args")
    public Object andReturn(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object andReturns(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Mockery\\ExpectationInterface")
                    .setLookup(ExpectationInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/mockery/mockery/library/Mockery/ExpectationInterface.php")
                    .get();
}
