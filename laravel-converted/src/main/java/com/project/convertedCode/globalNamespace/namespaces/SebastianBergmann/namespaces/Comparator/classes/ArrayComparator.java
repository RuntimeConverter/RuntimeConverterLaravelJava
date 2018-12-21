package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_sort;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.Comparator;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ComparisonFailure;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/comparator/src/ArrayComparator.php

*/

public class ArrayComparator extends Comparator {

    public ArrayComparator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ArrayComparator.class) {
            this.__construct(env, args);
        }
    }

    public ArrayComparator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expected")
    @ConvertedParameter(index = 1, name = "actual")
    public Object accepts(RuntimeEnv env, Object... args) {
        Object expected = assignParameter(args, 0, false);
        Object actual = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.toBool(function_is_array.f.env(env).call(expected).value())
                        && ZVal.toBool(function_is_array.f.env(env).call(actual).value()));
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
    @ConvertedParameter(
        index = 5,
        name = "processed",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object assertEquals(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        int runtimeConverterContinueCount;
        Object expected = assignParameter(args, 0, false);
        ReferenceContainer actual = new BasicReferenceContainer(assignParameter(args, 1, false));
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
        ReferenceContainer processed =
                assignParameterRef(runtimePassByReferenceArgs, args, 5, true);
        if (null == processed.getObject()) {
            processed.setObject(ZVal.newArray());
        }
        Object e = null;
        Object expectedAsString = null;
        ReferenceContainer remaining = new BasicReferenceContainer(null);
        Object actualAsString = null;
        Object equal = null;
        Object comparator = null;
        Object value = null;
        Object key = null;
        if (ZVal.isTrue(canonicalize)) {
            function_sort.f.env(env).call(expected);
            function_sort.f.env(env).call(actual.getObject());
        }

        remaining.setObject(ZVal.assign(actual.getObject()));
        actualAsString = "Array (\n";
        expectedAsString = "Array (\n";
        equal = true;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1433 : ZVal.getIterable(expected, env, false)) {
            key = ZVal.assign(zpairResult1433.getKey());
            value = ZVal.assign(zpairResult1433.getValue());
            arrayActionR(ArrayAction.UNSET, remaining, env, key);
            if (!function_array_key_exists.f.env(env).call(key, actual.getObject()).getBool()) {
                expectedAsString =
                        toStringR(expectedAsString, env)
                                + toStringR(
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "    %s => %s\n",
                                                        env.callMethod(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("exporter")
                                                                        .value(),
                                                                "export",
                                                                ArrayComparator.class,
                                                                key),
                                                        env.callMethod(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("exporter")
                                                                        .value(),
                                                                "shortenedExport",
                                                                ArrayComparator.class,
                                                                value))
                                                .value(),
                                        env);
                equal = false;
                continue;
            }

            try {
                comparator =
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("factory").value(),
                                "getComparatorFor",
                                ArrayComparator.class,
                                value,
                                actual.arrayGet(env, key));
                env.callMethod(
                        comparator,
                        new RuntimeArgsWithReferences().add(5, processed),
                        "assertEquals",
                        ArrayComparator.class,
                        value,
                        actual.arrayGet(env, key),
                        delta,
                        canonicalize,
                        ignoreCase,
                        processed.getObject());
                expectedAsString =
                        toStringR(expectedAsString, env)
                                + toStringR(
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "    %s => %s\n",
                                                        env.callMethod(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("exporter")
                                                                        .value(),
                                                                "export",
                                                                ArrayComparator.class,
                                                                key),
                                                        env.callMethod(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("exporter")
                                                                        .value(),
                                                                "shortenedExport",
                                                                ArrayComparator.class,
                                                                value))
                                                .value(),
                                        env);
                actualAsString =
                        toStringR(actualAsString, env)
                                + toStringR(
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "    %s => %s\n",
                                                        env.callMethod(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("exporter")
                                                                        .value(),
                                                                "export",
                                                                ArrayComparator.class,
                                                                key),
                                                        env.callMethod(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("exporter")
                                                                        .value(),
                                                                "shortenedExport",
                                                                ArrayComparator.class,
                                                                actual.arrayGet(env, key)))
                                                .value(),
                                        env);
            } catch (ConvertedException convertedException212) {
                if (convertedException212.instanceOf(
                        ComparisonFailure.class,
                        "SebastianBergmann\\Comparator\\ComparisonFailure")) {
                    e = convertedException212.getObject();
                    expectedAsString =
                            toStringR(expectedAsString, env)
                                    + toStringR(
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "    %s => %s\n",
                                                            env.callMethod(
                                                                    toObjectR(this)
                                                                            .accessProp(this, env)
                                                                            .name("exporter")
                                                                            .value(),
                                                                    "export",
                                                                    ArrayComparator.class,
                                                                    key),
                                                            ZVal.isTrue(
                                                                            env.callMethod(
                                                                                    e,
                                                                                    "getExpectedAsString",
                                                                                    ArrayComparator
                                                                                            .class))
                                                                    ? this.indent(
                                                                            env,
                                                                            env.callMethod(
                                                                                    e,
                                                                                    "getExpectedAsString",
                                                                                    ArrayComparator
                                                                                            .class))
                                                                    : env.callMethod(
                                                                            toObjectR(this)
                                                                                    .accessProp(
                                                                                            this,
                                                                                            env)
                                                                                    .name(
                                                                                            "exporter")
                                                                                    .value(),
                                                                            "shortenedExport",
                                                                            ArrayComparator.class,
                                                                            env.callMethod(
                                                                                    e,
                                                                                    "getExpected",
                                                                                    ArrayComparator
                                                                                            .class)))
                                                    .value(),
                                            env);
                    actualAsString =
                            toStringR(actualAsString, env)
                                    + toStringR(
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "    %s => %s\n",
                                                            env.callMethod(
                                                                    toObjectR(this)
                                                                            .accessProp(this, env)
                                                                            .name("exporter")
                                                                            .value(),
                                                                    "export",
                                                                    ArrayComparator.class,
                                                                    key),
                                                            ZVal.isTrue(
                                                                            env.callMethod(
                                                                                    e,
                                                                                    "getActualAsString",
                                                                                    ArrayComparator
                                                                                            .class))
                                                                    ? this.indent(
                                                                            env,
                                                                            env.callMethod(
                                                                                    e,
                                                                                    "getActualAsString",
                                                                                    ArrayComparator
                                                                                            .class))
                                                                    : env.callMethod(
                                                                            toObjectR(this)
                                                                                    .accessProp(
                                                                                            this,
                                                                                            env)
                                                                                    .name(
                                                                                            "exporter")
                                                                                    .value(),
                                                                            "shortenedExport",
                                                                            ArrayComparator.class,
                                                                            env.callMethod(
                                                                                    e,
                                                                                    "getActual",
                                                                                    ArrayComparator
                                                                                            .class)))
                                                    .value(),
                                            env);
                    equal = false;
                } else {
                    throw convertedException212;
                }
            }
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1434 : ZVal.getIterable(remaining.getObject(), env, false)) {
            key = ZVal.assign(zpairResult1434.getKey());
            value = ZVal.assign(zpairResult1434.getValue());
            actualAsString =
                    toStringR(actualAsString, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "    %s => %s\n",
                                                    env.callMethod(
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("exporter")
                                                                    .value(),
                                                            "export",
                                                            ArrayComparator.class,
                                                            key),
                                                    env.callMethod(
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("exporter")
                                                                    .value(),
                                                            "shortenedExport",
                                                            ArrayComparator.class,
                                                            value))
                                            .value(),
                                    env);
            equal = false;
        }

        expectedAsString = toStringR(expectedAsString, env) + ")";
        actualAsString = toStringR(actualAsString, env) + ")";
        if (!ZVal.isTrue(equal)) {
            throw ZVal.getException(
                    env,
                    new ComparisonFailure(
                            env,
                            expected,
                            actual.getObject(),
                            expectedAsString,
                            actualAsString,
                            false,
                            "Failed asserting that two arrays are equal."));
        }

        return null;
    }

    public Object assertEquals(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lines")
    protected Object indent(RuntimeEnv env, Object... args) {
        Object lines = assignParameter(args, 0, false);
        return ZVal.assign(
                function_trim
                        .f
                        .env(env)
                        .call(function_str_replace.f.env(env).call("\n", "\n    ", lines).value())
                        .value());
    }

    public static final Object CONST_class = "SebastianBergmann\\Comparator\\ArrayComparator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Comparator.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Comparator\\ArrayComparator")
                    .setLookup(
                            ArrayComparator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("exporter", "factory")
                    .setFilename("vendor/sebastian/comparator/src/ArrayComparator.php")
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
