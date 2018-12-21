package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Exceptions.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
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

 vendor/laravel/framework/src/Illuminate/Http/Exceptions/HttpResponseException.php

*/

public class HttpResponseException extends RuntimeException {

    public Object response = null;

    public HttpResponseException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HttpResponseException.class) {
            this.__construct(env, args);
        }
    }

    public HttpResponseException(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        this.response = response;
        return null;
    }

    @ConvertedMethod
    public Object getResponse(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.response);
    }

    public static final Object CONST_class = "Illuminate\\Http\\Exceptions\\HttpResponseException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends RuntimeException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Http\\Exceptions\\HttpResponseException")
                    .setLookup(
                            HttpResponseException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("response")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Http/Exceptions/HttpResponseException.php")
                    .addInterface("Throwable")
                    .addExtendsClass("RuntimeException")
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
