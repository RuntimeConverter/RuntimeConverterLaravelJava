package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/MockObject/Invocation/Invocation.php

*/

public interface Invocation {

    public static final Object CONST_class = "PHPUnit\\Framework\\MockObject\\Invocation";

    @ConvertedMethod
    public Object generateReturnValue(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getClassName(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getMethodName(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getParameters(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getReturnType(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object isReturnTypeNullable(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Invocation")
                    .setLookup(Invocation.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/MockObject/Invocation/Invocation.php")
                    .get();
}
