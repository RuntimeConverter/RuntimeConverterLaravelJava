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

 vendor/symfony/finder/Iterator/SizeRangeFilterIterator.php

*/

public class SizeRangeFilterIterator extends FilterIterator {

    public Object comparators = ZVal.newArray();

    public SizeRangeFilterIterator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SizeRangeFilterIterator.class) {
            this.__construct(env, args);
        }
    }

    public SizeRangeFilterIterator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "iterator", typeHint = "Iterator")
    @ConvertedParameter(index = 1, name = "comparators", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object iterator = assignParameter(args, 0, false);
        Object comparators = assignParameter(args, 1, false);
        this.comparators = comparators;
        super.__construct(env, iterator);
        return null;
    }

    @ConvertedMethod
    public Object accept(RuntimeEnv env, Object... args) {
        Object compare = null;
        Object fileinfo = null;
        Object filesize = null;
        fileinfo = env.callMethod(this, "current", SizeRangeFilterIterator.class);
        if (!ZVal.isTrue(env.callMethod(fileinfo, "isFile", SizeRangeFilterIterator.class))) {
            return ZVal.assign(true);
        }

        filesize = env.callMethod(fileinfo, "getSize", SizeRangeFilterIterator.class);
        for (ZPair zpairResult1841 : ZVal.getIterable(this.comparators, env, true)) {
            compare = ZVal.assign(zpairResult1841.getValue());
            if (!ZVal.isTrue(
                    env.callMethod(compare, "test", SizeRangeFilterIterator.class, filesize))) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Finder\\Iterator\\SizeRangeFilterIterator";

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
                    .setName("Symfony\\Component\\Finder\\Iterator\\SizeRangeFilterIterator")
                    .setLookup(
                            SizeRangeFilterIterator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("comparators")
                    .setFilename("vendor/symfony/finder/Iterator/SizeRangeFilterIterator.php")
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
