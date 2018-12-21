package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.CacheWarmer.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.CacheWarmer.classes.CacheWarmerInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
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

 vendor/symfony/http-kernel/CacheWarmer/CacheWarmerAggregate.php

*/

public class CacheWarmerAggregate extends RuntimeClassBase implements CacheWarmerInterface {

    public Object warmers = null;

    public Object optionalsEnabled = false;

    public Object onlyOptionalsEnabled = false;

    public CacheWarmerAggregate(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CacheWarmerAggregate.class) {
            this.__construct(env, args);
        }
    }

    public CacheWarmerAggregate(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "warmers",
        typeHint = "iterable",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object warmers = assignParameter(args, 0, true);
        if (null == warmers) {
            warmers = ZVal.newArray();
        }
        this.warmers = warmers;
        return null;
    }

    @ConvertedMethod
    public Object enableOptionalWarmers(RuntimeEnv env, Object... args) {
        this.optionalsEnabled = true;
        return null;
    }

    @ConvertedMethod
    public Object enableOnlyOptionalWarmers(RuntimeEnv env, Object... args) {
        this.onlyOptionalsEnabled = this.optionalsEnabled = true;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cacheDir")
    public Object warmUp(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object cacheDir = assignParameter(args, 0, false);
        Object warmer = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1900 : ZVal.getIterable(this.warmers, env, true)) {
            warmer = ZVal.assign(zpairResult1900.getValue());
            if (ZVal.toBool(!ZVal.isTrue(this.optionalsEnabled))
                    && ZVal.toBool(
                            env.callMethod(warmer, "isOptional", CacheWarmerAggregate.class))) {
                continue;
            }

            if (ZVal.toBool(this.onlyOptionalsEnabled)
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    env.callMethod(
                                            warmer, "isOptional", CacheWarmerAggregate.class)))) {
                continue;
            }

            env.callMethod(warmer, "warmUp", CacheWarmerAggregate.class, cacheDir);
        }

        return null;
    }

    @ConvertedMethod
    public Object isOptional(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\CacheWarmer\\CacheWarmerAggregate";

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
                    .setName("Symfony\\Component\\HttpKernel\\CacheWarmer\\CacheWarmerAggregate")
                    .setLookup(
                            CacheWarmerAggregate.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("onlyOptionalsEnabled", "optionalsEnabled", "warmers")
                    .setFilename("vendor/symfony/http-kernel/CacheWarmer/CacheWarmerAggregate.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\CacheWarmer\\CacheWarmerInterface")
                    .addInterface("Symfony\\Component\\HttpKernel\\CacheWarmer\\WarmableInterface")
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
