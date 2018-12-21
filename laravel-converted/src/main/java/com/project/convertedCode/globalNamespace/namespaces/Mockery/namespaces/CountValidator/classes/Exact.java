package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.CountValidator.classes;

import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Exception.classes.InvalidCountException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.CountValidator.classes.CountValidatorAbstract;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/CountValidator/Exact.php

*/

public class Exact extends CountValidatorAbstract {

    public Exact(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Exact.class) {
            this.__construct(env, args);
        }
    }

    public Exact(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "n")
    public Object validate(RuntimeEnv env, Object... args) {
        Object n = assignParameter(args, 0, false);
        Object exception = null;
        Object because = null;
        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("_limit").value(), "!==", n)) {
            because =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("_expectation").value(),
                            "getExceptionMessage",
                            Exact.class);
            exception =
                    new InvalidCountException(
                            env,
                            "Method "
                                    + toStringR(
                                            toStringR(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("_expectation")
                                                            .value(),
                                                    env),
                                            env)
                                    + " from "
                                    + toStringR(
                                            env.callMethod(
                                                    env.callMethod(
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("_expectation")
                                                                    .value(),
                                                            "getMock",
                                                            Exact.class),
                                                    "mockery_getName",
                                                    Exact.class),
                                            env)
                                    + " should be called"
                                    + toStringR("\n", env)
                                    + " exactly "
                                    + toStringR(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("_limit")
                                                    .value(),
                                            env)
                                    + " times but called "
                                    + toStringR(n, env)
                                    + " times."
                                    + toStringR(
                                            ZVal.isTrue(because)
                                                    ? " Because "
                                                            + toStringR(
                                                                    env.callMethod(
                                                                            toObjectR(this)
                                                                                    .accessProp(
                                                                                            this,
                                                                                            env)
                                                                                    .name(
                                                                                            "_expectation")
                                                                                    .value(),
                                                                            "getExceptionMessage",
                                                                            Exact.class),
                                                                    env)
                                                    : "",
                                            env));
            env.callMethod(
                    env.callMethod(
                            env.callMethod(
                                    env.callMethod(
                                            env.callMethod(
                                                    exception,
                                                    "setMock",
                                                    Exact.class,
                                                    env.callMethod(
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("_expectation")
                                                                    .value(),
                                                            "getMock",
                                                            Exact.class)),
                                            "setMethodName",
                                            Exact.class,
                                            toStringR(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("_expectation")
                                                            .value(),
                                                    env)),
                                    "setExpectedCountComparative",
                                    Exact.class,
                                    "="),
                            "setExpectedCount",
                            Exact.class,
                            toObjectR(this).accessProp(this, env).name("_limit").value()),
                    "setActualCount",
                    Exact.class,
                    n);
            throw ZVal.getException(env, exception);
        }

        return null;
    }

    public static final Object CONST_class = "Mockery\\CountValidator\\Exact";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends CountValidatorAbstract.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Mockery\\CountValidator\\Exact")
                    .setLookup(
                            Exact.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_expectation", "_limit")
                    .setFilename("vendor/mockery/mockery/library/Mockery/CountValidator/Exact.php")
                    .addExtendsClass("Mockery\\CountValidator\\CountValidatorAbstract")
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
