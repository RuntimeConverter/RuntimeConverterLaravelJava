package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes;

import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.Hook;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Runner/Hook/TestHook.php

*/

public interface TestHook extends Hook {

    public static final Object CONST_class = "PHPUnit\\Runner\\TestHook";

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Runner\\TestHook")
                    .setLookup(TestHook.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Runner/Hook/TestHook.php")
                    .addInterface("PHPUnit\\Runner\\Hook")
                    .get();
}
