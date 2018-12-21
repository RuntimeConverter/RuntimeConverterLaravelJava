package com.project.convertedCode.globalNamespace.namespaces.Mockery.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/MockInterface.php

*/

public interface MockInterface {

    public static final Object CONST_class = "Mockery\\MockInterface";

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "something",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object allows(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "something",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object expects(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Mockery\\Container",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "partialObject",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object mockery_init(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methodNames")
    public Object shouldReceive(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methodNames")
    public Object shouldNotReceive(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    public Object shouldAllowMockingMethod(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "returnValue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object shouldIgnoreMissing(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object shouldAllowMockingProtectedMethods(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object shouldDeferMissing(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object makePartial(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(
        index = 1,
        name = "args",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object shouldHaveReceived(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(
        index = 1,
        name = "args",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object shouldNotHaveReceived(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object byDefault(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object mockery_verify(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object mockery_teardown(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object mockery_allocateOrder(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "group")
    @ConvertedParameter(index = 1, name = "order")
    public Object mockery_setGroup(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object mockery_getGroups(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "order")
    public Object mockery_setCurrentOrder(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object mockery_getCurrentOrder(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "order")
    public Object mockery_validateOrder(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object mockery_getExpectationCount(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "director", typeHint = "Mockery\\ExpectationDirector")
    public Object mockery_setExpectationsFor(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    public Object mockery_getExpectationsFor(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "args", typeHint = "array")
    public Object mockery_findExpectation(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object mockery_getContainer(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object mockery_getName(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object mockery_getMockableProperties(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object mockery_getMockableMethods(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object mockery_isAnonymous(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Mockery\\MockInterface")
                    .setLookup(MockInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/mockery/mockery/library/Mockery/MockInterface.php")
                    .get();
}
