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

 vendor/symfony/finder/Iterator/FileTypeFilterIterator.php

*/

public class FileTypeFilterIterator extends FilterIterator {

    public Object mode = null;

    public FileTypeFilterIterator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FileTypeFilterIterator.class) {
            this.__construct(env, args);
        }
    }

    public FileTypeFilterIterator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "iterator", typeHint = "Iterator")
    @ConvertedParameter(index = 1, name = "mode", typeHint = "int")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object iterator = assignParameter(args, 0, false);
        Object mode = assignParameter(args, 1, false);
        this.mode = mode;
        super.__construct(env, iterator);
        return null;
    }

    @ConvertedMethod
    public Object accept(RuntimeEnv env, Object... args) {
        Object fileinfo = null;
        fileinfo = env.callMethod(this, "current", FileTypeFilterIterator.class);
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                CONST_ONLY_DIRECTORIES,
                                "===",
                                ZVal.toLong(CONST_ONLY_DIRECTORIES) & ZVal.toLong(this.mode)))
                && ZVal.toBool(env.callMethod(fileinfo, "isFile", FileTypeFilterIterator.class))) {
            return ZVal.assign(false);

        } else if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                CONST_ONLY_FILES,
                                "===",
                                ZVal.toLong(CONST_ONLY_FILES) & ZVal.toLong(this.mode)))
                && ZVal.toBool(env.callMethod(fileinfo, "isDir", FileTypeFilterIterator.class))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(true);
    }

    public static final Object CONST_ONLY_FILES = 1;

    public static final Object CONST_ONLY_DIRECTORIES = 2;

    public static final Object CONST_class =
            "Symfony\\Component\\Finder\\Iterator\\FileTypeFilterIterator";

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
                    .setName("Symfony\\Component\\Finder\\Iterator\\FileTypeFilterIterator")
                    .setLookup(
                            FileTypeFilterIterator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("mode")
                    .setFilename("vendor/symfony/finder/Iterator/FileTypeFilterIterator.php")
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
