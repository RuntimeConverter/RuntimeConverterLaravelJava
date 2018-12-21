package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Exception.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.Exception;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Exception/InvalidOrderException.php

*/

public class InvalidOrderException extends Exception {

    public Object method = ZVal.getNull();

    public Object expected = 0;

    public Object actual = ZVal.getNull();

    public Object mockObject = ZVal.getNull();

    public InvalidOrderException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == InvalidOrderException.class) {
            this.__construct(env, args);
        }
    }

    public InvalidOrderException(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mock", typeHint = "Mockery\\MockInterface")
    public Object setMock(RuntimeEnv env, Object... args) {
        Object mock = assignParameter(args, 0, false);
        this.mockObject = mock;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setMethodName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.method = name;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count")
    public Object setActualOrder(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, false);
        this.actual = count;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count")
    public Object setExpectedOrder(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, false);
        this.expected = count;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getMock(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.mockObject);
    }

    @ConvertedMethod
    public Object getMethodName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.method);
    }

    @ConvertedMethod
    public Object getActualOrder(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.actual);
    }

    @ConvertedMethod
    public Object getExpectedOrder(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.expected);
    }

    @ConvertedMethod
    public Object getMockName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this.getMock(env), "mockery_getName", InvalidOrderException.class));
    }

    public static final Object CONST_class = "Mockery\\Exception\\InvalidOrderException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Exception.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Mockery\\Exception\\InvalidOrderException")
                    .setLookup(
                            InvalidOrderException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("actual", "expected", "method", "mockObject")
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/Exception/InvalidOrderException.php")
                    .addInterface("Throwable")
                    .addExtendsClass("Mockery\\Exception")
                    .addExtendsClass("UnexpectedValueException")
                    .get();

    @Override
    public ReflectionClassData getRuntimeConverterReflectionData() {
        return runtimeConverterReflectionData;
    }

    @Override
    public Object converterRuntimeCallExtended(
            RuntimeEnv env,
            String method,
            Class<?> caller,
            PassByReferenceArgs passByReferenceArgs,
            Object... args) {
        return RuntimeClassBase.converterRuntimeCallExtendedWithDataStatic(
                this,
                runtimeConverterReflectionData,
                env,
                method,
                caller,
                passByReferenceArgs,
                args);
    }
}
