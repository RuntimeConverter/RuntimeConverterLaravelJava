package com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Exception.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/filp/whoops/src/Whoops/Exception/ErrorException.php

*/

public class ErrorException
        extends com.runtimeconverter.runtime.nativeClasses.errors.ErrorException {

    public ErrorException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ErrorException.class) {
            this.__construct(env, args);
        }
    }

    public ErrorException(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Whoops\\Exception\\ErrorException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.runtimeconverter
                    .runtime
                    .nativeClasses
                    .errors
                    .ErrorException
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Whoops\\Exception\\ErrorException")
                    .setLookup(
                            ErrorException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/filp/whoops/src/Whoops/Exception/ErrorException.php")
                    .addInterface("Throwable")
                    .addExtendsClass("ErrorException")
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
