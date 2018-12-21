package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Event.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Event.classes.GetResponseEvent;
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

 vendor/symfony/http-kernel/Event/GetResponseForExceptionEvent.php

*/

public class GetResponseForExceptionEvent extends GetResponseEvent {

    public Object exception = null;

    public Object allowCustomResponseCode = false;

    public GetResponseForExceptionEvent(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == GetResponseForExceptionEvent.class) {
            this.__construct(env, args);
        }
    }

    public GetResponseForExceptionEvent(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "kernel",
        typeHint = "Symfony\\Component\\HttpKernel\\HttpKernelInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(index = 2, name = "requestType", typeHint = "int")
    @ConvertedParameter(index = 3, name = "e", typeHint = "Exception")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object kernel = assignParameter(args, 0, false);
        Object request = assignParameter(args, 1, false);
        Object requestType = assignParameter(args, 2, false);
        Object e = assignParameter(args, 3, false);
        super.__construct(env, kernel, request, requestType);
        this.setException(env, e);
        return null;
    }

    @ConvertedMethod
    public Object getException(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.exception);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception", typeHint = "Exception")
    public Object setException(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, false);
        this.exception = exception;
        return null;
    }

    @ConvertedMethod
    public Object allowCustomResponseCode(RuntimeEnv env, Object... args) {
        this.allowCustomResponseCode = true;
        return null;
    }

    @ConvertedMethod
    public Object isAllowingCustomResponseCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.allowCustomResponseCode);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Event\\GetResponseForExceptionEvent";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends GetResponseEvent.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\Event\\GetResponseForExceptionEvent")
                    .setLookup(
                            GetResponseForExceptionEvent.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "allowCustomResponseCode",
                            "exception",
                            "kernel",
                            "propagationStopped",
                            "request",
                            "requestType",
                            "response")
                    .setFilename(
                            "vendor/symfony/http-kernel/Event/GetResponseForExceptionEvent.php")
                    .addExtendsClass("Symfony\\Component\\HttpKernel\\Event\\GetResponseEvent")
                    .addExtendsClass("Symfony\\Component\\HttpKernel\\Event\\KernelEvent")
                    .addExtendsClass("Symfony\\Component\\EventDispatcher\\Event")
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
