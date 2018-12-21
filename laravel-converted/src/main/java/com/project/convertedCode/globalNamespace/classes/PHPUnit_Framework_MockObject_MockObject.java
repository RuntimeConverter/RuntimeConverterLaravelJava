package com.project.convertedCode.globalNamespace.classes;

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

 vendor/phpunit/phpunit/src/Framework/MockObject/MockObject.php

*/

public interface PHPUnit_Framework_MockObject_MockObject {

    public static final Object CONST_class = "PHPUnit_Framework_MockObject_MockObject";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "originalObject")
    public Object __phpunit_setOriginalObject(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object __phpunit_getInvocationMocker(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object __phpunit_verify(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object __phpunit_hasMatchers(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "returnValueGeneration", typeHint = "bool")
    public Object __phpunit_setReturnValueGeneration(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "matcher",
        typeHint = "PHPUnit\\Framework\\MockObject\\Matcher\\Invocation"
    )
    public Object expects(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit_Framework_MockObject_MockObject")
                    .setLookup(
                            PHPUnit_Framework_MockObject_MockObject.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Framework/MockObject/MockObject.php")
                    .get();
}
