package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Exception.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.CountValidator.classes.Exception;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Exception.classes.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Exception/InvalidCountException.php

*/

public class InvalidCountException extends Exception {

    public Object method = ZVal.getNull();

    public Object expected = 0;

    public Object expectedComparative = "<=";

    public Object actual = ZVal.getNull();

    public Object mockObject = ZVal.getNull();

    public InvalidCountException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == InvalidCountException.class) {
            this.__construct(env, args);
        }
    }

    public InvalidCountException(NoConstructor n) {
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
    public Object setActualCount(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, false);
        this.actual = count;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count")
    public Object setExpectedCount(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, false);
        this.expected = count;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "comp")
    public Object setExpectedCountComparative(RuntimeEnv env, Object... args) {
        Object comp = assignParameter(args, 0, false);
        if (!function_in_array
                .f
                .env(env)
                .call(comp, ZVal.arrayFromList("=", ">", "<", ">=", "<="))
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "Illegal comparative for expected call counts set: "
                                    + toStringR(comp, env)));
        }

        this.expectedComparative = comp;
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
    public Object getActualCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.actual);
    }

    @ConvertedMethod
    public Object getExpectedCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.expected);
    }

    @ConvertedMethod
    public Object getMockName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this.getMock(env), "mockery_getName", InvalidCountException.class));
    }

    @ConvertedMethod
    public Object getExpectedCountComparative(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.expectedComparative);
    }

    public static final Object CONST_class = "Mockery\\Exception\\InvalidCountException";

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
                    .setName("Mockery\\Exception\\InvalidCountException")
                    .setLookup(
                            InvalidCountException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "actual", "expected", "expectedComparative", "method", "mockObject")
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/Exception/InvalidCountException.php")
                    .addInterface("Throwable")
                    .addExtendsClass("Mockery\\CountValidator\\Exception")
                    .addExtendsClass("OutOfBoundsException")
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
