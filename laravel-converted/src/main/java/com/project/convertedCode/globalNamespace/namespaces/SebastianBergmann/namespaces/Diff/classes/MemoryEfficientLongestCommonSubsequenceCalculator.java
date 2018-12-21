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
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/diff/src/MemoryEfficientLongestCommonSubsequenceCalculator.php

*/

public final class MemoryEfficientLongestCommonSubsequenceCalculator extends RuntimeClassBase
        implements LongestCommonSubsequenceCalculator {

    public MemoryEfficientLongestCommonSubsequenceCalculator(RuntimeEnv env, Object... args) {
        super(env);
    }

    public MemoryEfficientLongestCommonSubsequenceCalculator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from", typeHint = "array")
    @ConvertedParameter(index = 1, name = "to", typeHint = "array")
    public Object calculate(RuntimeEnv env, Object... args) {
        ReferenceContainer from = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object to = assignParameter(args, 1, false);
        Object fromEnd = null;
        ReferenceContainer llB = new BasicReferenceContainer(null);
        Object toStart = null;
        ReferenceContainer llE = new BasicReferenceContainer(null);
        Object max = null;
        Object i = null;
        ReferenceContainer j = new BasicReferenceContainer(null);
        Object jMax = null;
        Object m = null;
        Object toEnd = null;
        Object cFrom = null;
        Object fromStart = null;
        Object cTo = null;
        cFrom = function_count.f.env(env).call(from.getObject()).value();
        cTo = function_count.f.env(env).call(to).value();
        if (ZVal.strictEqualityCheck(cFrom, "===", 0)) {
            return ZVal.assign(ZVal.newArray());
        }

        if (ZVal.strictEqualityCheck(cFrom, "===", 1)) {
            if (function_in_array.f.env(env).call(from.arrayGet(env, 0), to, true).getBool()) {
                return ZVal.assign(ZVal.newArray(new ZPair(0, from.arrayGet(env, 0))));
            }

            return ZVal.assign(ZVal.newArray());
        }

        i = ZVal.assign(ZVal.toLong(ZVal.divide(cFrom, 2)));
        fromStart = function_array_slice.f.env(env).call(from.getObject(), 0, i).value();
        fromEnd = function_array_slice.f.env(env).call(from.getObject(), i).value();
        llB.setObject(this.length(env, fromStart, to));
        llE.setObject(
                this.length(
                        env,
                        function_array_reverse.f.env(env).call(fromEnd).value(),
                        function_array_reverse.f.env(env).call(to).value()));
        jMax = 0;
        max = 0;
        for (j.setObject(0);
                ZVal.isLessThanOrEqualTo(j.getObject(), "<=", cTo);
                j.setObject(ZVal.increment(j.getObject()))) {
            m =
                    ZVal.add(
                            llB.arrayGet(env, j.getObject()),
                            llE.arrayGet(env, ZVal.subtract(cTo, j.getObject())));
            if (ZVal.isGreaterThanOrEqualTo(m, ">=", max)) {
                max = ZVal.assign(m);
                jMax = ZVal.assign(j.getObject());
            }
        }

        toStart = function_array_slice.f.env(env).call(to, 0, jMax).value();
        toEnd = function_array_slice.f.env(env).call(to, jMax).value();
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                this.calculate(env, fromStart, toStart),
                                this.calculate(env, fromEnd, toEnd))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from", typeHint = "array")
    @ConvertedParameter(index = 1, name = "to", typeHint = "array")
    private Object length(RuntimeEnv env, Object... args) {
        ReferenceContainer from = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer to = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer current = new BasicReferenceContainer(null);
        ReferenceContainer prev = new BasicReferenceContainer(null);
        Object cFrom = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer j = new BasicReferenceContainer(null);
        Object cTo = null;
        current.setObject(
                NamespaceGlobal.array_fill
                        .env(env)
                        .call(
                                0,
                                ZVal.add(function_count.f.env(env).call(to.getObject()).value(), 1),
                                0)
                        .value());
        cFrom = function_count.f.env(env).call(from.getObject()).value();
        cTo = function_count.f.env(env).call(to.getObject()).value();
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', cFrom);
                i.setObject(ZVal.increment(i.getObject()))) {
            prev.setObject(ZVal.assign(current.getObject()));
            for (j.setObject(0);
                    ZVal.isLessThan(j.getObject(), '<', cTo);
                    j.setObject(ZVal.increment(j.getObject()))) {
                if (ZVal.strictEqualityCheck(
                        from.arrayGet(env, i.getObject()),
                        "===",
                        to.arrayGet(env, j.getObject()))) {
                    current.arrayAccess(env, ZVal.add(j.getObject(), 1))
                            .set(ZVal.add(prev.arrayGet(env, j.getObject()), 1));

                } else {
                    current.arrayAccess(env, ZVal.add(j.getObject(), 1))
                            .set(
                                    NamespaceGlobal.max
                                            .env(env)
                                            .call(
                                                    current.arrayGet(env, j.getObject()),
                                                    prev.arrayGet(env, ZVal.add(j.getObject(), 1)))
                                            .value());
                }
            }
        }

        return ZVal.assign(current.getObject());
    }

    public static final Object CONST_class =
            "SebastianBergmann\\Diff\\MemoryEfficientLongestCommonSubsequenceCalculator";

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
                            "SebastianBergmann\\Diff\\MemoryEfficientLongestCommonSubsequenceCalculator")
                    .setLookup(
                            MemoryEfficientLongestCommonSubsequenceCalculator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/sebastian/diff/src/MemoryEfficientLongestCommonSubsequenceCalculator.php")
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
