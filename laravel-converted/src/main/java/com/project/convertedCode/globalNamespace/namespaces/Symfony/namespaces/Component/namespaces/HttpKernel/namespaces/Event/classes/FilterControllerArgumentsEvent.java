package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Event.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Event.classes.FilterControllerEvent;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Event/FilterControllerArgumentsEvent.php

*/

public class FilterControllerArgumentsEvent extends FilterControllerEvent {

    public Object arguments = null;

    public FilterControllerArgumentsEvent(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FilterControllerArgumentsEvent.class) {
            this.__construct(env, args);
        }
    }

    public FilterControllerArgumentsEvent(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "kernel",
        typeHint = "Symfony\\Component\\HttpKernel\\HttpKernelInterface"
    )
    @ConvertedParameter(index = 1, name = "controller", typeHint = "callable")
    @ConvertedParameter(index = 2, name = "arguments", typeHint = "array")
    @ConvertedParameter(
        index = 3,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(index = 4, name = "requestType")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object kernel = assignParameter(args, 0, false);
        Object controller = assignParameter(args, 1, false);
        Object arguments = assignParameter(args, 2, false);
        Object request = assignParameter(args, 3, false);
        Object requestType = assignParameter(args, 4, false);
        super.__construct(env, kernel, controller, request, requestType);
        this.arguments = arguments;
        return null;
    }

    @ConvertedMethod
    public Object getArguments(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.arguments);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "arguments", typeHint = "array")
    public Object setArguments(RuntimeEnv env, Object... args) {
        Object arguments = assignParameter(args, 0, false);
        this.arguments = arguments;
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Event\\FilterControllerArgumentsEvent";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends FilterControllerEvent.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\HttpKernel\\Event\\FilterControllerArgumentsEvent")
                    .setLookup(
                            FilterControllerArgumentsEvent.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "arguments",
                            "controller",
                            "kernel",
                            "propagationStopped",
                            "request",
                            "requestType")
                    .setFilename(
                            "vendor/symfony/http-kernel/Event/FilterControllerArgumentsEvent.php")
                    .addExtendsClass("Symfony\\Component\\HttpKernel\\Event\\FilterControllerEvent")
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
