package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes;

import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.Hook;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Runner/Hook/BeforeFirstTestHook.php

*/

public interface BeforeFirstTestHook extends Hook {

    public static final Object CONST_class = "PHPUnit\\Runner\\BeforeFirstTestHook";

    @ConvertedMethod
    public Object executeBeforeFirstTest(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Runner\\BeforeFirstTestHook")
                    .setLookup(BeforeFirstTestHook.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Runner/Hook/BeforeFirstTestHook.php")
                    .addInterface("PHPUnit\\Runner\\Hook")
                    .get();
}
