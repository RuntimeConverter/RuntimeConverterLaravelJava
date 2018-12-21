package com.project.convertedCode.globalNamespace.namespaces.App.namespaces.Http.namespaces.Middleware.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 app/Http/Middleware/TrimStrings.php

*/

public class TrimStrings
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Foundation
                .namespaces
                .Http
                .namespaces
                .Middleware
                .classes
                .TrimStrings {

    public TrimStrings(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.except = ZVal.arrayFromList("password", "password_confirmation");
    }

    public TrimStrings(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "App\\Http\\Middleware\\TrimStrings";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Illuminate
                    .namespaces
                    .Foundation
                    .namespaces
                    .Http
                    .namespaces
                    .Middleware
                    .classes
                    .TrimStrings
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("App\\Http\\Middleware\\TrimStrings")
                    .setLookup(
                            TrimStrings.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "except", "except")
                    .setFilename("app/Http/Middleware/TrimStrings.php")
                    .addExtendsClass("Illuminate\\Foundation\\Http\\Middleware\\TrimStrings")
                    .addExtendsClass("Illuminate\\Foundation\\Http\\Middleware\\TransformsRequest")
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
