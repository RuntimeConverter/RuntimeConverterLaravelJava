package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Event.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Event.classes.KernelEvent;
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

 vendor/symfony/http-kernel/Event/GetResponseEvent.php

*/

public class GetResponseEvent extends KernelEvent {

    public Object response = null;

    public GetResponseEvent(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == GetResponseEvent.class) {
            this.__construct(env, args);
        }
    }

    public GetResponseEvent(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getResponse(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.response);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    public Object setResponse(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        this.response = response;
        env.callMethod(this, "stopPropagation", GetResponseEvent.class);
        return null;
    }

    @ConvertedMethod
    public Object hasResponse(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.response));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Event\\GetResponseEvent";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends KernelEvent.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\Event\\GetResponseEvent")
                    .setLookup(
                            GetResponseEvent.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "kernel", "propagationStopped", "request", "requestType", "response")
                    .setFilename("vendor/symfony/http-kernel/Event/GetResponseEvent.php")
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
