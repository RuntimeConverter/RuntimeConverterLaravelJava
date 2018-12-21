package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.TestHook;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Runner/Hook/AfterTestFailureHook.php

*/

public interface AfterTestFailureHook extends TestHook {

    public static final Object CONST_class = "PHPUnit\\Runner\\AfterTestFailureHook";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "string")
    @ConvertedParameter(index = 1, name = "message", typeHint = "string")
    @ConvertedParameter(index = 2, name = "time", typeHint = "float")
    public Object executeAfterTestFailure(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Runner\\AfterTestFailureHook")
                    .setLookup(AfterTestFailureHook.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Runner/Hook/AfterTestFailureHook.php")
                    .addInterface("PHPUnit\\Runner\\TestHook")
                    .addInterface("PHPUnit\\Runner\\Hook")
                    .get();
}
