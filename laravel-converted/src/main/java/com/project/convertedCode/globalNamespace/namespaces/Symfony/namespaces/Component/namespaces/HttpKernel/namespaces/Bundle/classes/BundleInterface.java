package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Bundle.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Bundle/BundleInterface.php

*/

public interface BundleInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Bundle\\BundleInterface";

    @ConvertedMethod
    public Object boot(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object shutdown(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Symfony\\Component\\DependencyInjection\\ContainerBuilder"
    )
    public Object build(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getContainerExtension(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getNamespace(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getPath(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\Bundle\\BundleInterface")
                    .setLookup(BundleInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/http-kernel/Bundle/BundleInterface.php")
                    .addInterface("ContainerAwareInterface")
                    .get();
}
