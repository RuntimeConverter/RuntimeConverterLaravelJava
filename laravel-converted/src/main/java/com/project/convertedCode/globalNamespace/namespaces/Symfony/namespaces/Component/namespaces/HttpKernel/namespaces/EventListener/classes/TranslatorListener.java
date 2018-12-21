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
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/EventListener/TranslatorListener.php

*/

public class TranslatorListener extends RuntimeClassBase implements EventSubscriberInterface {

    public Object translator = null;

    public Object requestStack = null;

    public TranslatorListener(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TranslatorListener.class) {
            this.__construct(env, args);
        }
    }

    public TranslatorListener(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "translator",
        typeHint = "Symfony\\Component\\Translation\\TranslatorInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "requestStack",
        typeHint = "Symfony\\Component\\HttpFoundation\\RequestStack"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object translator = assignParameter(args, 0, false);
        Object requestStack = assignParameter(args, 1, false);
        this.translator = translator;
        this.requestStack = requestStack;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Symfony\\Component\\HttpKernel\\Event\\GetResponseEvent"
    )
    public Object onKernelRequest(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        this.setLocale(env, env.callMethod(event, "getRequest", TranslatorListener.class));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Symfony\\Component\\HttpKernel\\Event\\FinishRequestEvent"
    )
    public Object onKernelFinishRequest(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object parentRequest = null;
        if (ZVal.strictEqualityCheck(
                ZVal.getNull(),
                "===",
                parentRequest =
                        env.callMethod(
                                this.requestStack, "getParentRequest", TranslatorListener.class))) {
            return null;
        }

        this.setLocale(env, parentRequest);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    private Object setLocale(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object e = null;
        try {
            env.callMethod(
                    this.translator,
                    "setLocale",
                    TranslatorListener.class,
                    env.callMethod(request, "getLocale", TranslatorListener.class));
        } catch (ConvertedException convertedException284) {
            if (convertedException284.instanceOf(
                    InvalidArgumentException.class, "InvalidArgumentException")) {
                e = convertedException284.getObject();
                env.callMethod(
                        this.translator,
                        "setLocale",
                        TranslatorListener.class,
                        env.callMethod(request, "getDefaultLocale", TranslatorListener.class));
            } else {
                throw convertedException284;
            }
        }

        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\EventListener\\TranslatorListener";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getSubscribedEvents(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    KernelEvents.CONST_REQUEST,
                                    ZVal.newArray(
                                            new ZPair(
                                                    0, ZVal.arrayFromList("onKernelRequest", 10)))),
                            new ZPair(
                                    KernelEvents.CONST_FINISH_REQUEST,
                                    ZVal.newArray(
                                            new ZPair(
                                                    0,
                                                    ZVal.arrayFromList(
                                                            "onKernelFinishRequest", 0))))));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\EventListener\\TranslatorListener")
                    .setLookup(
                            TranslatorListener.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("requestStack", "translator")
                    .setFilename("vendor/symfony/http-kernel/EventListener/TranslatorListener.php")
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
