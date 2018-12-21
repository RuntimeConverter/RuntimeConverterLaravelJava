package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DependencyInjection.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/DependencyInjection/MergeExtensionConfigurationPass.php

*/

public class MergeExtensionConfigurationPass extends RuntimeClassBase {

    public Object extensions = null;

    public MergeExtensionConfigurationPass(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MergeExtensionConfigurationPass.class) {
            this.__construct(env, args);
        }
    }

    public MergeExtensionConfigurationPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "extensions", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object extensions = assignParameter(args, 0, false);
        this.extensions = extensions;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Symfony\\Component\\DependencyInjection\\ContainerBuilder"
    )
    public Object process(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        Object extension = null;
        for (ZPair zpairResult1934 : ZVal.getIterable(this.extensions, env, true)) {
            extension = ZVal.assign(zpairResult1934.getValue());
            if (!function_count
                    .f
                    .env(env)
                    .call(
                            env.callMethod(
                                    container,
                                    "getExtensionConfig",
                                    MergeExtensionConfigurationPass.class,
                                    extension))
                    .getBool()) {
                env.callMethod(
                        container,
                        "loadFromExtension",
                        MergeExtensionConfigurationPass.class,
                        extension,
                        ZVal.newArray());
            }
        }

        StaticMethodUtils.getStaticBaseClass(ZVal.resolveClassAlias(env, "parent"), env)
                .callUnknownStaticMethod(
                        env, "process", new RuntimeArgsWithReferences(), container);
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\DependencyInjection\\MergeExtensionConfigurationPass";

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
                    .setName(
                            "Symfony\\Component\\HttpKernel\\DependencyInjection\\MergeExtensionConfigurationPass")
                    .setLookup(
                            MergeExtensionConfigurationPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("extensions")
                    .setFilename(
                            "vendor/symfony/http-kernel/DependencyInjection/MergeExtensionConfigurationPass.php")
                    .addExtendsClass(
                            "Symfony\\Component\\DependencyInjection\\Compiler\\MergeExtensionConfigurationPass")
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
