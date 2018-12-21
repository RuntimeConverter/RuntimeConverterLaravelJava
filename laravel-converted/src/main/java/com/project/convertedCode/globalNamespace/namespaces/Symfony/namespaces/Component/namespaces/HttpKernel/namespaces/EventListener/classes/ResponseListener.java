package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.EventListener.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.KernelEvents;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes.EventSubscriberInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/EventListener/ResponseListener.php

*/

public class ResponseListener extends RuntimeClassBase implements EventSubscriberInterface {

    public Object charset = null;

    public ResponseListener(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ResponseListener.class) {
            this.__construct(env, args);
        }
    }

    public ResponseListener(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charset", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, false);
        this.charset = charset;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Symfony\\Component\\HttpKernel\\Event\\FilterResponseEvent"
    )
    public Object onKernelResponse(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object response = null;
        if (!ZVal.isTrue(env.callMethod(event, "isMasterRequest", ResponseListener.class))) {
            return null;
        }

        response = env.callMethod(event, "getResponse", ResponseListener.class);
        if (ZVal.strictEqualityCheck(
                ZVal.getNull(),
                "===",
                env.callMethod(response, "getCharset", ResponseListener.class))) {
            env.callMethod(response, "setCharset", ResponseListener.class, this.charset);
        }

        env.callMethod(
                response,
                "prepare",
                ResponseListener.class,
                env.callMethod(event, "getRequest", ResponseListener.class));
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\EventListener\\ResponseListener";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getSubscribedEvents(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    ZVal.newArray(new ZPair(KernelEvents.CONST_RESPONSE, "onKernelResponse")));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\EventListener\\ResponseListener")
                    .setLookup(
                            ResponseListener.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("charset")
                    .setFilename("vendor/symfony/http-kernel/EventListener/ResponseListener.php")
                    .addInterface("Symfony\\Component\\EventDispatcher\\EventSubscriberInterface")
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
