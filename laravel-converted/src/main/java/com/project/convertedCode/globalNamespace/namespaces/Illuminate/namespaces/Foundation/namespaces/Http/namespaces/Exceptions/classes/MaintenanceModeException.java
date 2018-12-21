package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Http.namespaces.Exceptions.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes.ServiceUnavailableHttpException;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Http/Exceptions/MaintenanceModeException.php

*/

public class MaintenanceModeException extends ServiceUnavailableHttpException {

    public Object wentDownAt = null;

    public Object retryAfter = null;

    public Object willBeAvailableAt = null;

    public MaintenanceModeException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MaintenanceModeException.class) {
            this.__construct(env, args);
        }
    }

    public MaintenanceModeException(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "time")
    @ConvertedParameter(
        index = 1,
        name = "retryAfter",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "message",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "previous",
        typeHint = "Exception",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 4, name = "code", defaultValue = "0", defaultValueType = "number")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object time = assignParameter(args, 0, false);
        Object retryAfter = assignParameter(args, 1, true);
        if (null == retryAfter) {
            retryAfter = ZVal.getNull();
        }
        Object message = assignParameter(args, 2, true);
        if (null == message) {
            message = ZVal.getNull();
        }
        Object previous = assignParameter(args, 3, true);
        if (null == previous) {
            previous = ZVal.getNull();
        }
        Object code = assignParameter(args, 4, true);
        if (null == code) {
            code = 0;
        }
        super.__construct(env, retryAfter, message, previous, code);
        this.wentDownAt = Carbon.runtimeStaticObject.createFromTimestamp(env, time);
        if (ZVal.isTrue(retryAfter)) {
            this.retryAfter = retryAfter;
            this.willBeAvailableAt =
                    env.callMethod(
                            Carbon.runtimeStaticObject.createFromTimestamp(env, time),
                            "addSeconds",
                            MaintenanceModeException.class,
                            this.retryAfter);
        }

        return null;
    }

    public static final Object CONST_class =
            "Illuminate\\Foundation\\Http\\Exceptions\\MaintenanceModeException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends ServiceUnavailableHttpException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Http\\Exceptions\\MaintenanceModeException")
                    .setLookup(
                            MaintenanceModeException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "headers",
                            "retryAfter",
                            "statusCode",
                            "wentDownAt",
                            "willBeAvailableAt")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Http/Exceptions/MaintenanceModeException.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\Exception\\HttpExceptionInterface")
                    .addInterface("Throwable")
                    .addExtendsClass(
                            "Symfony\\Component\\HttpKernel\\Exception\\ServiceUnavailableHttpException")
                    .addExtendsClass("Symfony\\Component\\HttpKernel\\Exception\\HttpException")
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
