package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Iterator.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
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

 vendor/symfony/finder/Iterator/DateRangeFilterIterator.php

*/

public class DateRangeFilterIterator extends FilterIterator {

    public Object comparators = ZVal.newArray();

    public DateRangeFilterIterator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DateRangeFilterIterator.class) {
            this.__construct(env, args);
        }
    }

    public DateRangeFilterIterator(NoConstructor n) {
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
        Object filedate = null;
        Object fileinfo = null;
        fileinfo = env.callMethod(this, "current", DateRangeFilterIterator.class);
        if (!function_file_exists
                .f
                .env(env)
                .call(env.callMethod(fileinfo, "getPathname", DateRangeFilterIterator.class))
                .getBool()) {
            return ZVal.assign(false);
        }

        filedate = env.callMethod(fileinfo, "getMTime", DateRangeFilterIterator.class);
        for (ZPair zpairResult1834 : ZVal.getIterable(this.comparators, env, true)) {
            compare = ZVal.assign(zpairResult1834.getValue());
            if (!ZVal.isTrue(
                    env.callMethod(compare, "test", DateRangeFilterIterator.class, filedate))) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Finder\\Iterator\\DateRangeFilterIterator";

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
                    .setName("Symfony\\Component\\Finder\\Iterator\\DateRangeFilterIterator")
                    .setLookup(
                            DateRangeFilterIterator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("comparators")
                    .setFilename("vendor/symfony/finder/Iterator/DateRangeFilterIterator.php")
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
