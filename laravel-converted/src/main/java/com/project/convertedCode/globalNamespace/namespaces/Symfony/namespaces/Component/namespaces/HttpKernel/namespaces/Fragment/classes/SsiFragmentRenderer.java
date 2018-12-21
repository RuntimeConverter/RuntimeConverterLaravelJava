package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Fragment.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Fragment.classes.AbstractSurrogateFragmentRenderer;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Fragment/SsiFragmentRenderer.php

*/

public class SsiFragmentRenderer extends AbstractSurrogateFragmentRenderer {

    public SsiFragmentRenderer(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SsiFragmentRenderer.class) {
            this.__construct(env, args);
        }
    }

    public SsiFragmentRenderer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "ssi";
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Fragment\\SsiFragmentRenderer";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractSurrogateFragmentRenderer.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\Fragment\\SsiFragmentRenderer")
                    .setLookup(
                            SsiFragmentRenderer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("fragmentPath", "inlineStrategy", "signer", "surrogate")
                    .setFilename("vendor/symfony/http-kernel/Fragment/SsiFragmentRenderer.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\Fragment\\FragmentRendererInterface")
                    .addExtendsClass(
                            "Symfony\\Component\\HttpKernel\\Fragment\\AbstractSurrogateFragmentRenderer")
                    .addExtendsClass(
                            "Symfony\\Component\\HttpKernel\\Fragment\\RoutableFragmentRenderer")
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
