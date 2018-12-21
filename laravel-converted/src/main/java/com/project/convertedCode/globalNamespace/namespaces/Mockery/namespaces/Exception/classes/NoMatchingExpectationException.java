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

 vendor/mockery/mockery/library/Mockery/Exception/NoMatchingExpectationException.php

*/

public class NoMatchingExpectationException extends Exception {

    public Object method = ZVal.getNull();

    public Object actual = ZVal.newArray();

    public Object mockObject = ZVal.getNull();

    public NoMatchingExpectationException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NoMatchingExpectationException.class) {
            this.__construct(env, args);
        }
    }

    public NoMatchingExpectationException(NoConstructor n) {
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
    public Object setActualArguments(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, false);
        this.actual = count;
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
    public Object getActualArguments(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.actual);
    }

    @ConvertedMethod
    public Object getMockName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.getMock(env),
                        "mockery_getName",
                        NoMatchingExpectationException.class));
    }

    public static final Object CONST_class = "Mockery\\Exception\\NoMatchingExpectationException";

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
                    .setName("Mockery\\Exception\\NoMatchingExpectationException")
                    .setLookup(
                            NoMatchingExpectationException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("actual", "method", "mockObject")
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/Exception/NoMatchingExpectationException.php")
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
