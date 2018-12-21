package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/KernelEvents.php

*/

public final class KernelEvents extends RuntimeClassBase {

    public KernelEvents(RuntimeEnv env, Object... args) {
        super(env);
    }

    public KernelEvents(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_REQUEST = "kernel.request";

    public static final Object CONST_EXCEPTION = "kernel.exception";

    public static final Object CONST_VIEW = "kernel.view";

    public static final Object CONST_CONTROLLER = "kernel.controller";

    public static final Object CONST_CONTROLLER_ARGUMENTS = "kernel.controller_arguments";

    public static final Object CONST_RESPONSE = "kernel.response";

    public static final Object CONST_TERMINATE = "kernel.terminate";

    public static final Object CONST_FINISH_REQUEST = "kernel.finish_request";

    public static final Object CONST_class = "Symfony\\Component\\HttpKernel\\KernelEvents";

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
                    .setName("Symfony\\Component\\HttpKernel\\KernelEvents")
                    .setLookup(
                            KernelEvents.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/http-kernel/KernelEvents.php")
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
