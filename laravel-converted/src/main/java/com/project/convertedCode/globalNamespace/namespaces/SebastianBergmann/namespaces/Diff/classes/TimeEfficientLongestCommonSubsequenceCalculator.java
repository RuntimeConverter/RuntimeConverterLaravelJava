package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.LongestCommonSubsequenceCalculator;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeClasses.spl.datastructures.SplFixedArray;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/diff/src/TimeEfficientLongestCommonSubsequenceCalculator.php

*/

public final class TimeEfficientLongestCommonSubsequenceCalculator extends RuntimeClassBase
        implements LongestCommonSubsequenceCalculator {

    public TimeEfficientLongestCommonSubsequenceCalculator(RuntimeEnv env, Object... args) {
        super(env);
    }

    public TimeEfficientLongestCommonSubsequenceCalculator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from", typeHint = "array")
    @ConvertedParameter(index = 1, name = "to", typeHint = "array")
    public Object calculate(RuntimeEnv env, Object... args) {
        ReferenceContainer from = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer to = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer common = new BasicReferenceContainer(null);
        Object width = null;
        Object fromLength = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer j = new BasicReferenceContainer(null);
        ReferenceContainer matrix = new BasicReferenceContainer(null);
        Object toLength = null;
        Object o = null;
        common.setObject(ZVal.newArray());
        fromLength = function_count.f.env(env).call(from.getObject()).value();
        toLength = function_count.f.env(env).call(to.getObject()).value();
        width = ZVal.add(fromLength, 1);
        matrix.setObject(new SplFixedArray(env, ZVal.multiply(width, ZVal.add(toLength, 1))));
        for (i.setObject(0);
                ZVal.isLessThanOrEqualTo(i.getObject(), "<=", fromLength);
                i.setObject(ZVal.increment(i.getObject()))) {
            matrix.arrayAccess(env, i.getObject()).set(0);
        }

        for (j.setObject(0);
                ZVal.isLessThanOrEqualTo(j.getObject(), "<=", toLength);
                j.setObject(ZVal.increment(j.getObject()))) {
            matrix.arrayAccess(env, ZVal.multiply(j.getObject(), width)).set(0);
        }

        for (i.setObject(1);
                ZVal.isLessThanOrEqualTo(i.getObject(), "<=", fromLength);
                i.setObject(ZVal.increment(i.getObject()))) {
            for (j.setObject(1);
                    ZVal.isLessThanOrEqualTo(j.getObject(), "<=", toLength);
                    j.setObject(ZVal.increment(j.getObject()))) {
                o = ZVal.add(ZVal.multiply(j.getObject(), width), i.getObject());
                matrix.arrayAccess(env, o)
                        .set(
                                NamespaceGlobal.max
                                        .env(env)
                                        .call(
                                                matrix.arrayGet(env, ZVal.subtract(o, 1)),
                                                matrix.arrayGet(env, ZVal.subtract(o, width)),
                                                ZVal.strictEqualityCheck(
                                                                from.arrayGet(
                                                                        env,
                                                                        ZVal.subtract(
                                                                                i.getObject(), 1)),
                                                                "===",
                                                                to.arrayGet(
                                                                        env,
                                                                        ZVal.subtract(
                                                                                j.getObject(), 1)))
                                                        ? ZVal.add(
                                                                matrix.arrayGet(
                                                                        env,
                                                                        ZVal.subtract(
                                                                                ZVal.subtract(
                                                                                        o, width),
                                                                                1)),
                                                                1)
                                                        : 0)
                                        .value());
            }
        }

        i.setObject(ZVal.assign(fromLength));
        j.setObject(ZVal.assign(toLength));
        while (ZVal.toBool(ZVal.isGreaterThan(i.getObject(), '>', 0))
                && ZVal.toBool(ZVal.isGreaterThan(j.getObject(), '>', 0))) {
            if (ZVal.strictEqualityCheck(
                    from.arrayGet(env, ZVal.subtract(i.getObject(), 1)),
                    "===",
                    to.arrayGet(env, ZVal.subtract(j.getObject(), 1)))) {
                common.arrayAppend(env).set(from.arrayGet(env, ZVal.subtract(i.getObject(), 1)));
                i.setObject(ZVal.decrement(i.getObject()));
                j.setObject(ZVal.decrement(j.getObject()));

            } else {
                o = ZVal.add(ZVal.multiply(j.getObject(), width), i.getObject());
                if (ZVal.isGreaterThan(
                        matrix.arrayGet(env, ZVal.subtract(o, width)),
                        '>',
                        matrix.arrayGet(env, ZVal.subtract(o, 1)))) {
                    j.setObject(ZVal.decrement(j.getObject()));

                } else {
                    i.setObject(ZVal.decrement(i.getObject()));
                }
            }
        }

        return ZVal.assign(function_array_reverse.f.env(env).call(common.getObject()).value());
    }

    public static final Object CONST_class =
            "SebastianBergmann\\Diff\\TimeEfficientLongestCommonSubsequenceCalculator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "SebastianBergmann\\Diff\\TimeEfficientLongestCommonSubsequenceCalculator")
                    .setLookup(
                            TimeEfficientLongestCommonSubsequenceCalculator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/sebastian/diff/src/TimeEfficientLongestCommonSubsequenceCalculator.php")
                    .addInterface("SebastianBergmann\\Diff\\LongestCommonSubsequenceCalculator")
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
