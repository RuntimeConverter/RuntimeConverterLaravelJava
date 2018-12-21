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

 vendor/symfony/http-kernel/Event/GetResponseForControllerResultEvent.php

*/

public class GetResponseForControllerResultEvent extends GetResponseEvent {

    public Object controllerResult = null;

    public GetResponseForControllerResultEvent(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == GetResponseForControllerResultEvent.class) {
            this.__construct(env, args);
        }
    }

    public GetResponseForControllerResultEvent(NoConstructor n) {
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
    @ConvertedParameter(index = 3, name = "controllerResult")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object kernel = assignParameter(args, 0, false);
        Object request = assignParameter(args, 1, false);
        Object requestType = assignParameter(args, 2, false);
        Object controllerResult = assignParameter(args, 3, false);
        super.__construct(env, kernel, request, requestType);
        this.controllerResult = controllerResult;
        return null;
    }

    @ConvertedMethod
    public Object getControllerResult(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.controllerResult);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "controllerResult")
    public Object setControllerResult(RuntimeEnv env, Object... args) {
        Object controllerResult = assignParameter(args, 0, false);
        this.controllerResult = controllerResult;
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Event\\GetResponseForControllerResultEvent";

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
                    .setName(
                            "Symfony\\Component\\HttpKernel\\Event\\GetResponseForControllerResultEvent")
                    .setLookup(
                            GetResponseForControllerResultEvent.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "controllerResult",
                            "kernel",
                            "propagationStopped",
                            "request",
                            "requestType",
                            "response")
                    .setFilename(
                            "vendor/symfony/http-kernel/Event/GetResponseForControllerResultEvent.php")
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
