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
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/EventListener/LocaleListener.php

*/

public class LocaleListener extends RuntimeClassBase implements EventSubscriberInterface {

    public Object router = null;

    public Object defaultLocale = null;

    public Object requestStack = null;

    public LocaleListener(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == LocaleListener.class) {
            this.__construct(env, args);
        }
    }

    public LocaleListener(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "requestStack",
        typeHint = "Symfony\\Component\\HttpFoundation\\RequestStack"
    )
    @ConvertedParameter(index = 1, name = "defaultLocale", typeHint = "string")
    @ConvertedParameter(
        index = 2,
        name = "router",
        typeHint = "Symfony\\Component\\Routing\\RequestContextAwareInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object requestStack = assignParameter(args, 0, false);
        Object defaultLocale = assignParameter(args, 1, true);
        if (null == defaultLocale) {
            defaultLocale = "en";
        }
        Object router = assignParameter(args, 2, true);
        if (null == router) {
            router = ZVal.getNull();
        }
        this.defaultLocale = defaultLocale;
        this.requestStack = requestStack;
        this.router = router;
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
        Object request = null;
        request = env.callMethod(event, "getRequest", LocaleListener.class);
        env.callMethod(request, "setDefaultLocale", LocaleListener.class, this.defaultLocale);
        this.setLocale(env, request);
        this.setRouterContext(env, request);
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
        if (ZVal.strictNotEqualityCheck(
                ZVal.getNull(),
                "!==",
                parentRequest =
                        env.callMethod(
                                this.requestStack, "getParentRequest", LocaleListener.class))) {
            this.setRouterContext(env, parentRequest);
        }

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
        Object locale = null;
        if (ZVal.isTrue(
                locale =
                        env.callMethod(
                                toObjectR(request).accessProp(this, env).name("attributes").value(),
                                "get",
                                LocaleListener.class,
                                "_locale"))) {
            env.callMethod(request, "setLocale", LocaleListener.class, locale);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    private Object setRouterContext(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.router)) {
            env.callMethod(
                    env.callMethod(this.router, "getContext", LocaleListener.class),
                    "setParameter",
                    LocaleListener.class,
                    "_locale",
                    env.callMethod(request, "getLocale", LocaleListener.class));
        }

        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\EventListener\\LocaleListener";

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
                                                    0, ZVal.arrayFromList("onKernelRequest", 16)))),
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
                    .setName("Symfony\\Component\\HttpKernel\\EventListener\\LocaleListener")
                    .setLookup(
                            LocaleListener.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("defaultLocale", "requestStack", "router")
                    .setFilename("vendor/symfony/http-kernel/EventListener/LocaleListener.php")
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
