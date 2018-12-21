package com.project.convertedCode.globalNamespace.namespaces.App.namespaces.Exceptions.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
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

 app/Exceptions/Handler.php

*/

public class Handler
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Foundation
                .namespaces
                .Exceptions
                .classes
                .Handler {

    public Handler(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.dontReport = ZVal.newArray();
        this.dontFlash = ZVal.arrayFromList("password", "password_confirmation");
        if (this.getClass() == Handler.class) {
            this.__construct(env, args);
        }
    }

    public Handler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception", typeHint = "Exception")
    public Object report(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, false);
        super.report(env, exception);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "exception", typeHint = "Exception")
    public Object render(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object exception = assignParameter(args, 1, false);
        return ZVal.assign(super.render(env, request, exception));
    }

    public static final Object CONST_class = "App\\Exceptions\\Handler";

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
                    .Exceptions
                    .classes
                    .Handler
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("App\\Exceptions\\Handler")
                    .setLookup(
                            Handler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "container",
                            "dontFlash",
                            "dontFlash",
                            "dontReport",
                            "dontReport",
                            "internalDontReport")
                    .setFilename("app/Exceptions/Handler.php")
                    .addInterface("Illuminate\\Contracts\\Debug\\ExceptionHandler")
                    .addExtendsClass("Illuminate\\Foundation\\Exceptions\\Handler")
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
