package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.EventListener.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.HttpCache.classes.HttpCache;
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

 vendor/symfony/http-kernel/EventListener/SurrogateListener.php

*/

public class SurrogateListener extends RuntimeClassBase implements EventSubscriberInterface {

    public Object surrogate = null;

    public SurrogateListener(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SurrogateListener.class) {
            this.__construct(env, args);
        }
    }

    public SurrogateListener(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "surrogate",
        typeHint = "Symfony\\Component\\HttpKernel\\HttpCache\\SurrogateInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object surrogate = assignParameter(args, 0, true);
        if (null == surrogate) {
            surrogate = ZVal.getNull();
        }
        this.surrogate = surrogate;
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
        Object kernel = null;
        Object surrogate = null;
        if (!ZVal.isTrue(env.callMethod(event, "isMasterRequest", SurrogateListener.class))) {
            return null;
        }

        kernel = env.callMethod(event, "getKernel", SurrogateListener.class);
        surrogate = ZVal.assign(this.surrogate);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        kernel,
                        HttpCache.class,
                        "Symfony\\Component\\HttpKernel\\HttpCache\\HttpCache"))) {
            surrogate = env.callMethod(kernel, "getSurrogate", SurrogateListener.class);
            if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.surrogate))
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    env.callMethod(
                                            this.surrogate, "getName", SurrogateListener.class),
                                    "!==",
                                    env.callMethod(
                                            surrogate, "getName", SurrogateListener.class)))) {
                surrogate = ZVal.assign(this.surrogate);
            }
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", surrogate)) {
            return null;
        }

        env.callMethod(
                surrogate,
                "addSurrogateControl",
                SurrogateListener.class,
                env.callMethod(event, "getResponse", SurrogateListener.class));
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\EventListener\\SurrogateListener";

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
                    .setName("Symfony\\Component\\HttpKernel\\EventListener\\SurrogateListener")
                    .setLookup(
                            SurrogateListener.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("surrogate")
                    .setFilename("vendor/symfony/http-kernel/EventListener/SurrogateListener.php")
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
