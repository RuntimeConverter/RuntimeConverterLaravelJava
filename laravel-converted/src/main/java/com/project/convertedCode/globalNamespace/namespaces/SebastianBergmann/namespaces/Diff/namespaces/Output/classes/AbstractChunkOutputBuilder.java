package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.namespaces.Output.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.namespaces.Output.classes.DiffOutputBuilderInterface;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/diff/src/Output/AbstractChunkOutputBuilder.php

*/

public abstract class AbstractChunkOutputBuilder extends RuntimeClassBase
        implements DiffOutputBuilderInterface {

    public AbstractChunkOutputBuilder(RuntimeEnv env, Object... args) {
        super(env);
    }

    public AbstractChunkOutputBuilder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "diff", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "lineThreshold",
        typeHint = "int",
        defaultValue = "5",
        defaultValueType = "number"
    )
    protected Object getCommonChunks(RuntimeEnv env, Object... args) {
        ReferenceContainer diff = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object lineThreshold = assignParameter(args, 1, true);
        if (null == lineThreshold) {
            lineThreshold = 5;
        }
        Object diffSize = null;
        ReferenceContainer chunkSize = new BasicReferenceContainer(null);
        Object capturing = null;
        ReferenceContainer commonChunks = new BasicReferenceContainer(null);
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object chunkStart = null;
        diffSize = function_count.f.env(env).call(diff.getObject()).value();
        capturing = false;
        chunkStart = 0;
        chunkSize.setObject(0);
        commonChunks.setObject(ZVal.newArray());
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', diffSize);
                i.setObject(ZVal.increment(i.getObject()))) {
            if (ZVal.strictEqualityCheck(diff.arrayGet(env, i.getObject(), 1), "===", 0)) {
                if (ZVal.strictEqualityCheck(capturing, "===", false)) {
                    capturing = true;
                    chunkStart = ZVal.assign(i.getObject());
                    chunkSize.setObject(0);

                } else {
                    chunkSize.setObject(ZVal.increment(chunkSize.getObject()));
                }

            } else if (ZVal.strictNotEqualityCheck(capturing, "!==", false)) {
                if (ZVal.isGreaterThanOrEqualTo(chunkSize.getObject(), ">=", lineThreshold)) {
                    commonChunks
                            .arrayAccess(env, chunkStart)
                            .set(ZVal.add(chunkStart, chunkSize.getObject()));
                }

                capturing = false;
            }
        }

        if (ZVal.toBool(ZVal.strictNotEqualityCheck(capturing, "!==", false))
                && ZVal.toBool(
                        ZVal.isGreaterThanOrEqualTo(chunkSize.getObject(), ">=", lineThreshold))) {
            commonChunks
                    .arrayAccess(env, chunkStart)
                    .set(ZVal.add(chunkStart, chunkSize.getObject()));
        }

        return ZVal.assign(commonChunks.getObject());
    }

    public static final Object CONST_class =
            "SebastianBergmann\\Diff\\Output\\AbstractChunkOutputBuilder";

    @ConvertedMethod()
    public abstract Object getDiff(RuntimeEnv env, Object... args);

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
                    .setName("SebastianBergmann\\Diff\\Output\\AbstractChunkOutputBuilder")
                    .setLookup(
                            AbstractChunkOutputBuilder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/sebastian/diff/src/Output/AbstractChunkOutputBuilder.php")
                    .addInterface("SebastianBergmann\\Diff\\Output\\DiffOutputBuilderInterface")
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
