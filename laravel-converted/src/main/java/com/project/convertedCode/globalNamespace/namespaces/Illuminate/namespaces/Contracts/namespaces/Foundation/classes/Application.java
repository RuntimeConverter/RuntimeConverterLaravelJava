package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Foundation.classes;

import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Container.classes.Container;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Contracts/Foundation/Application.php

*/

public interface Application extends Container {

    public static final Object CONST_class = "Illuminate\\Contracts\\Foundation\\Application";

    @ConvertedMethod
    public Object version(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object basePath(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object environment(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object runningInConsole(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object runningUnitTests(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object isDownForMaintenance(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object registerConfiguredProviders(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "provider")
    @ConvertedParameter(index = 1, name = "options", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "force",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object register(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "provider")
    @ConvertedParameter(
        index = 1,
        name = "service",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object registerDeferredProvider(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object boot(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object booting(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object booted(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getCachedServicesPath(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getCachedPackagesPath(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Foundation\\Application")
                    .setLookup(Application.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Foundation/Application.php")
                    .addInterface("Illuminate\\Contracts\\Container\\Container")
                    .addInterface("Psr\\Container\\ContainerInterface")
                    .get();
}
