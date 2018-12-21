package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.namespaces.Output.classes.UnifiedDiffOutputBuilder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.Differ;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/comparator/src/ComparisonFailure.php

*/

public class ComparisonFailure extends RuntimeException {

    public Object expected = null;

    public Object actual = null;

    public Object expectedAsString = null;

    public Object actualAsString = null;

    public Object identical = null;

    public Object message = null;

    public ComparisonFailure(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ComparisonFailure.class) {
            this.__construct(env, args);
        }
    }

    public ComparisonFailure(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expected")
    @ConvertedParameter(index = 1, name = "actual")
    @ConvertedParameter(index = 2, name = "expectedAsString")
    @ConvertedParameter(index = 3, name = "actualAsString")
    @ConvertedParameter(
        index = 4,
        name = "identical",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 5, name = "message")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object expected = assignParameter(args, 0, false);
        Object actual = assignParameter(args, 1, false);
        Object expectedAsString = assignParameter(args, 2, false);
        Object actualAsString = assignParameter(args, 3, false);
        Object identical = assignParameter(args, 4, true);
        if (null == identical) {
            identical = false;
        }
        Object message = assignParameter(args, 5, true);
        if (null == message) {
            message = "";
        }
        this.expected = expected;
        this.actual = actual;
        this.expectedAsString = expectedAsString;
        this.actualAsString = actualAsString;
        this.message = message;
        return null;
    }

    @ConvertedMethod
    public Object getActual(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.actual);
    }

    @ConvertedMethod
    public Object getExpected(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.expected);
    }

    @ConvertedMethod
    public Object getActualAsString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.actualAsString);
    }

    @ConvertedMethod
    public Object getExpectedAsString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.expectedAsString);
    }

    @ConvertedMethod
    public Object getDiff(RuntimeEnv env, Object... args) {
        Object differ = null;
        if (ZVal.toBool(!ZVal.isTrue(this.actualAsString))
                && ZVal.toBool(!ZVal.isTrue(this.expectedAsString))) {
            return "";
        }

        differ = new Differ(env, new UnifiedDiffOutputBuilder(env, "\n--- Expected\n+++ Actual\n"));
        return ZVal.assign(
                env.callMethod(
                        differ,
                        "diff",
                        ComparisonFailure.class,
                        this.expectedAsString,
                        this.actualAsString));
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(toStringR(this.message, env) + toStringR(this.getDiff(env), env));
    }

    public static final Object CONST_class = "SebastianBergmann\\Comparator\\ComparisonFailure";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends RuntimeException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Comparator\\ComparisonFailure")
                    .setLookup(
                            ComparisonFailure.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "actual",
                            "actualAsString",
                            "expected",
                            "expectedAsString",
                            "identical",
                            "message")
                    .setFilename("vendor/sebastian/comparator/src/ComparisonFailure.php")
                    .addInterface("Throwable")
                    .addExtendsClass("RuntimeException")
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
