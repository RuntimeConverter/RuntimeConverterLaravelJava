package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.CacheWarmer.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.CacheWarmer.classes.WarmableInterface;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/CacheWarmer/CacheWarmerInterface.php

*/

public interface CacheWarmerInterface extends WarmableInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\CacheWarmer\\CacheWarmerInterface";

    @ConvertedMethod
    public Object isOptional(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\CacheWarmer\\CacheWarmerInterface")
                    .setLookup(CacheWarmerInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/http-kernel/CacheWarmer/CacheWarmerInterface.php")
                    .addInterface("Symfony\\Component\\HttpKernel\\CacheWarmer\\WarmableInterface")
                    .get();
}
