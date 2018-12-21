package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes;

import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.HttpKernelInterface;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.Serializable;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/KernelInterface.php

*/

public interface KernelInterface extends HttpKernelInterface, Serializable {

    public static final Object CONST_class = "Symfony\\Component\\HttpKernel\\KernelInterface";

    @ConvertedMethod
    public Object registerBundles(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "loader",
        typeHint = "Symfony\\Component\\Config\\Loader\\LoaderInterface"
    )
    public Object registerContainerConfiguration(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object boot(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object shutdown(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getBundles(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getBundle(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "dir",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "first",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object locateResource(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getEnvironment(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object isDebug(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getRootDir(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getContainer(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getStartTime(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getCacheDir(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getLogDir(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getCharset(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\KernelInterface")
                    .setLookup(KernelInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/http-kernel/KernelInterface.php")
                    .addInterface("Symfony\\Component\\HttpKernel\\HttpKernelInterface")
                    .addInterface("Serializable")
                    .get();
}
