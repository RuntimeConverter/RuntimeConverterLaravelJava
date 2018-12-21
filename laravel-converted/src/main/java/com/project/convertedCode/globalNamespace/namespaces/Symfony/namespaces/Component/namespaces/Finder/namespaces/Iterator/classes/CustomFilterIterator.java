package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Iterator.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.FilterIterator;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/finder/Iterator/CustomFilterIterator.php

*/

public class CustomFilterIterator extends FilterIterator {

    public Object filters = ZVal.newArray();

    public CustomFilterIterator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CustomFilterIterator.class) {
            this.__construct(env, args);
        }
    }

    public CustomFilterIterator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "iterator", typeHint = "Iterator")
    @ConvertedParameter(index = 1, name = "filters", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object iterator = assignParameter(args, 0, false);
        Object filters = assignParameter(args, 1, false);
        Object filter = null;
        for (ZPair zpairResult1832 : ZVal.getIterable(filters, env, true)) {
            filter = ZVal.assign(zpairResult1832.getValue());
            if (!function_is_callable.f.env(env).call(filter).getBool()) {
                throw ZVal.getException(
                        env, new InvalidArgumentException(env, "Invalid PHP callback."));
            }
        }

        this.filters = filters;
        super.__construct(env, iterator);
        return null;
    }

    @ConvertedMethod
    public Object accept(RuntimeEnv env, Object... args) {
        Object filter = null;
        Object fileinfo = null;
        fileinfo = env.callMethod(this, "current", CustomFilterIterator.class);
        for (ZPair zpairResult1833 : ZVal.getIterable(this.filters, env, true)) {
            filter = ZVal.assign(zpairResult1833.getValue());
            if (ZVal.strictEqualityCheck(
                    false,
                    "===",
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(filter, fileinfo)
                            .value())) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Finder\\Iterator\\CustomFilterIterator";

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
                    .setName("Symfony\\Component\\Finder\\Iterator\\CustomFilterIterator")
                    .setLookup(
                            CustomFilterIterator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filters")
                    .setFilename("vendor/symfony/finder/Iterator/CustomFilterIterator.php")
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
