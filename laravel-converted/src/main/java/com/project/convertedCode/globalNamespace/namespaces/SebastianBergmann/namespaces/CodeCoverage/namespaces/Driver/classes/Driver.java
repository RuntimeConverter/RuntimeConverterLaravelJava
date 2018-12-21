package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Driver.classes;

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

 vendor/phpunit/php-code-coverage/src/Driver/Driver.php

*/

public interface Driver {

    public static final Object CONST_LINE_EXECUTED = 1;

    public static final Object CONST_LINE_NOT_EXECUTED = -1;

    public static final Object CONST_LINE_NOT_EXECUTABLE = -2;

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Driver\\Driver";

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "determineUnusedAndDead",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object start(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object stop(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Driver\\Driver")
                    .setLookup(Driver.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/php-code-coverage/src/Driver/Driver.php")
                    .get();
}
