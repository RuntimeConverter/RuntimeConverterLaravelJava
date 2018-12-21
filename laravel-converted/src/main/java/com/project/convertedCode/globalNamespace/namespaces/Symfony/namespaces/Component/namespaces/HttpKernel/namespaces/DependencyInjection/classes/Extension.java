package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DependencyInjection.classes;

import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
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

 vendor/symfony/http-kernel/DependencyInjection/Extension.php

*/

public abstract class Extension extends RuntimeClassBase {

    public Object annotatedClasses = ZVal.newArray();

    public Extension(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Extension(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getAnnotatedClassesToCompile(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.annotatedClasses);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "annotatedClasses", typeHint = "array")
    public Object addAnnotatedClassesToCompile(RuntimeEnv env, Object... args) {
        Object annotatedClasses = assignParameter(args, 0, false);
        this.annotatedClasses =
                function_array_merge
                        .f
                        .env(env)
                        .call(this.annotatedClasses, annotatedClasses)
                        .value();
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\DependencyInjection\\Extension";

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
                    .setName("Symfony\\Component\\HttpKernel\\DependencyInjection\\Extension")
                    .setLookup(
                            Extension.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("annotatedClasses")
                    .setFilename("vendor/symfony/http-kernel/DependencyInjection/Extension.php")
                    .addExtendsClass(
                            "Symfony\\Component\\DependencyInjection\\Extension\\Extension")
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
