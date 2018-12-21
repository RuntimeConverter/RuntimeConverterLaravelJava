package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Iterator.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.FilterIterator;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/finder/Iterator/DepthRangeFilterIterator.php

*/

public class DepthRangeFilterIterator extends FilterIterator {

    public Object minDepth = 0;

    public DepthRangeFilterIterator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DepthRangeFilterIterator.class) {
            this.__construct(env, args);
        }
    }

    public DepthRangeFilterIterator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "iterator", typeHint = "RecursiveIteratorIterator")
    @ConvertedParameter(
        index = 1,
        name = "minDepth",
        typeHint = "int",
        defaultValue = "0",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 2, name = "maxDepth", typeHint = "int")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object iterator = assignParameter(args, 0, false);
        Object minDepth = assignParameter(args, 1, true);
        if (null == minDepth) {
            minDepth = 0;
        }
        Object maxDepth = assignParameter(args, 2, true);
        if (null == maxDepth) {
            maxDepth = 9223372036854775807L;
        }
        this.minDepth = minDepth;
        env.callMethod(
                iterator,
                "setMaxDepth",
                DepthRangeFilterIterator.class,
                ZVal.strictEqualityCheck(9223372036854775807L, "===", maxDepth) ? -1 : maxDepth);
        super.__construct(env, iterator);
        return null;
    }

    @ConvertedMethod
    public Object accept(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isGreaterThanOrEqualTo(
                        env.callMethod(
                                env.callMethod(
                                        this, "getInnerIterator", DepthRangeFilterIterator.class),
                                "getDepth",
                                DepthRangeFilterIterator.class),
                        ">=",
                        this.minDepth));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Finder\\Iterator\\DepthRangeFilterIterator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends FilterIterator.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Finder\\Iterator\\DepthRangeFilterIterator")
                    .setLookup(
                            DepthRangeFilterIterator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("minDepth")
                    .setFilename("vendor/symfony/finder/Iterator/DepthRangeFilterIterator.php")
                    .addInterface("OuterIterator")
                    .addInterface("Traversable")
                    .addInterface("Iterator")
                    .addExtendsClass("FilterIterator")
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
