package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes.HttpExceptionInterface;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Exception/HttpException.php

*/

public class HttpException extends RuntimeException implements HttpExceptionInterface {

    public Object statusCode = null;

    public Object headers = null;

    public HttpException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HttpException.class) {
            this.__construct(env, args);
        }
    }

    public HttpException(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "statusCode", typeHint = "int")
    @ConvertedParameter(
        index = 1,
        name = "message",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "previous",
        typeHint = "Exception",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 4, name = "code", defaultValue = "0", defaultValueType = "number")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object statusCode = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, true);
        if (null == message) {
            message = ZVal.getNull();
        }
        Object previous = assignParameter(args, 2, true);
        if (null == previous) {
            previous = ZVal.getNull();
        }
        Object headers = assignParameter(args, 3, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        Object code = assignParameter(args, 4, true);
        if (null == code) {
            code = 0;
        }
        this.statusCode = statusCode;
        this.headers = headers;
        super.__construct(env, message, code, previous);
        return null;
    }

    @ConvertedMethod
    public Object getStatusCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.statusCode);
    }

    @ConvertedMethod
    public Object getHeaders(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.headers);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headers", typeHint = "array")
    public Object setHeaders(RuntimeEnv env, Object... args) {
        Object headers = assignParameter(args, 0, false);
        this.headers = headers;
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Exception\\HttpException";

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
                    .setName("Symfony\\Component\\HttpKernel\\Exception\\HttpException")
                    .setLookup(
                            HttpException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("headers", "statusCode")
                    .setFilename("vendor/symfony/http-kernel/Exception/HttpException.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\Exception\\HttpExceptionInterface")
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
