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

 vendor/phpunit/phpunit/src/Runner/Hook/BeforeTestHook.php

*/

public interface BeforeTestHook extends TestHook {

    public static final Object CONST_class = "PHPUnit\\Runner\\BeforeTestHook";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "string")
    public Object executeBeforeTest(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Runner\\BeforeTestHook")
                    .setLookup(BeforeTestHook.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Runner/Hook/BeforeTestHook.php")
                    .addInterface("PHPUnit\\Runner\\TestHook")
                    .addInterface("PHPUnit\\Runner\\Hook")
                    .get();
}
