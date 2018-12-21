package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DependencyInjection.classes;

import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DependencyInjection.classes.Extension;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/DependencyInjection/ConfigurableExtension.php

*/

public abstract class ConfigurableExtension extends Extension {

    public ConfigurableExtension(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ConfigurableExtension(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "configs", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "container",
        typeHint = "Symfony\\Component\\DependencyInjection\\ContainerBuilder"
    )
    public final Object load(RuntimeEnv env, Object... args) {
        Object configs = assignParameter(args, 0, false);
        Object container = assignParameter(args, 1, false);
        env.callMethod(
                this,
                "loadInternal",
                ConfigurableExtension.class,
                env.callMethod(
                        this,
                        "processConfiguration",
                        ConfigurableExtension.class,
                        env.callMethod(
                                this,
                                "getConfiguration",
                                ConfigurableExtension.class,
                                configs,
                                container),
                        configs),
                container);
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\DependencyInjection\\ConfigurableExtension";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Extension.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\HttpKernel\\DependencyInjection\\ConfigurableExtension")
                    .setLookup(
                            ConfigurableExtension.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("annotatedClasses")
                    .setFilename(
                            "vendor/symfony/http-kernel/DependencyInjection/ConfigurableExtension.php")
                    .addExtendsClass(
                            "Symfony\\Component\\HttpKernel\\DependencyInjection\\Extension")
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
