package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ComparisonFailure;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ScalarComparator;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_float;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/comparator/src/NumericComparator.php

*/

public class NumericComparator extends ScalarComparator {

    public NumericComparator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NumericComparator.class) {
            this.__construct(env, args);
        }
    }

    public NumericComparator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expected")
    @ConvertedParameter(index = 1, name = "actual")
    public Object accepts(RuntimeEnv env, Object... args) {
        Object expected = assignParameter(args, 0, false);
        Object actual = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                function_is_numeric
                                                                        .f
                                                                        .env(env)
                                                                        .call(expected)
                                                                        .value())
                                                        && ZVal.toBool(
                                                                function_is_numeric
                                                                        .f
                                                                        .env(env)
                                                                        .call(actual)
                                                                        .value()))
                                        && ZVal.toBool(
                                                !ZVal.toBool(
                                                                function_is_float
                                                                        .f
                                                                        .env(env)
                                                                        .call(expected)
                                                                        .value())
                                                        || ZVal.toBool(
                                                                function_is_float
                                                                        .f
                                                                        .env(env)
                                                                        .call(actual)
                                                                        .value())))
                        && ZVal.toBool(
                                !ZVal.toBool(function_is_string.f.env(env).call(expected).value())
                                        && ZVal.toBool(
                                                function_is_string
                                                        .f
                                                        .env(env)
                                                        .call(actual)
                                                        .value())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expected")
    @ConvertedParameter(index = 1, name = "actual")
    @ConvertedParameter(
        index = 2,
        name = "delta",
        defaultValue = "0.0",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 3,
        name = "canonicalize",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "ignoreCase",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object assertEquals(RuntimeEnv env, Object... args) {
        Object expected = assignParameter(args, 0, false);
        Object actual = assignParameter(args, 1, false);
        Object delta = assignParameter(args, 2, true);
        if (null == delta) {
            delta = 0.0;
        }
        Object canonicalize = assignParameter(args, 3, true);
        if (null == canonicalize) {
            canonicalize = false;
        }
        Object ignoreCase = assignParameter(args, 4, true);
        if (null == ignoreCase) {
            ignoreCase = false;
        }
        if (ZVal.toBool(NamespaceGlobal.is_infinite.env(env).call(actual).value())
                && ZVal.toBool(NamespaceGlobal.is_infinite.env(env).call(expected).value())) {
            return null;
        }

        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        NamespaceGlobal.is_infinite
                                                                .env(env)
                                                                .call(actual)
                                                                .value())
                                                ^ ZVal.toBool(
                                                        NamespaceGlobal.is_infinite
                                                                .env(env)
                                                                .call(expected)
                                                                .value()))
                                || ZVal.toBool(
                                        ZVal.toBool(
                                                        NamespaceGlobal.is_nan
                                                                .env(env)
                                                                .call(actual)
                                                                .value())
                                                || ZVal.toBool(
                                                        NamespaceGlobal.is_nan
                                                                .env(env)
                                                                .call(expected)
                                                                .value())))
                || ZVal.toBool(
                        ZVal.isGreaterThan(
                                NamespaceGlobal.abs
                                        .env(env)
                                        .call(ZVal.subtract(actual, expected))
                                        .value(),
                                '>',
                                delta))) {
            throw ZVal.getException(
                    env,
                    new ComparisonFailure(
                            env,
                            expected,
                            actual,
                            "",
                            "",
                            false,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Failed asserting that %s matches expected %s.",
                                            env.callMethod(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("exporter")
                                                            .value(),
                                                    "export",
                                                    NumericComparator.class,
                                                    actual),
                                            env.callMethod(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("exporter")
                                                            .value(),
                                                    "export",
                                                    NumericComparator.class,
                                                    expected))
                                    .value()));
        }

        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\Comparator\\NumericComparator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ScalarComparator.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Comparator\\NumericComparator")
                    .setLookup(
                            NumericComparator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("exporter", "factory")
                    .setFilename("vendor/sebastian/comparator/src/NumericComparator.php")
                    .addExtendsClass("SebastianBergmann\\Comparator\\ScalarComparator")
                    .addExtendsClass("SebastianBergmann\\Comparator\\Comparator")
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
