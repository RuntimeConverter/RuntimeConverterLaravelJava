package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.CacheClearer.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.CacheClearer.classes.CacheClearerInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/CacheClearer/ChainCacheClearer.php

*/

public class ChainCacheClearer extends RuntimeClassBase implements CacheClearerInterface {

    public Object clearers = null;

    public ChainCacheClearer(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ChainCacheClearer.class) {
            this.__construct(env, args);
        }
    }

    public ChainCacheClearer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "clearers",
        typeHint = "iterable",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object clearers = assignParameter(args, 0, true);
        if (null == clearers) {
            clearers = ZVal.newArray();
        }
        this.clearers = clearers;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cacheDir")
    public Object clear(RuntimeEnv env, Object... args) {
        Object cacheDir = assignParameter(args, 0, false);
        Object clearer = null;
        for (ZPair zpairResult1898 : ZVal.getIterable(this.clearers, env, true)) {
            clearer = ZVal.assign(zpairResult1898.getValue());
            env.callMethod(clearer, "clear", ChainCacheClearer.class, cacheDir);
        }

        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\CacheClearer\\ChainCacheClearer";

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
                    .setName("Symfony\\Component\\HttpKernel\\CacheClearer\\ChainCacheClearer")
                    .setLookup(
                            ChainCacheClearer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("clearers")
                    .setFilename("vendor/symfony/http-kernel/CacheClearer/ChainCacheClearer.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\CacheClearer\\CacheClearerInterface")
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
