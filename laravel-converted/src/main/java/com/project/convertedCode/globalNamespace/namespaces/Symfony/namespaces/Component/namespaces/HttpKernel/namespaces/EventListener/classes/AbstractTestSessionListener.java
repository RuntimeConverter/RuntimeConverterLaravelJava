package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.EventListener.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Cookie;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
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
import com.runtimeconverter.runtime.nativeFunctions.http.function_session_get_cookie_params;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.classes.Session;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/EventListener/AbstractTestSessionListener.php

*/

public abstract class AbstractTestSessionListener extends RuntimeClassBase
        implements EventSubscriberInterface {

    public Object sessionId = null;

    public AbstractTestSessionListener(RuntimeEnv env, Object... args) {
        super(env);
    }

    public AbstractTestSessionListener(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Symfony\\Component\\HttpKernel\\Event\\GetResponseEvent"
    )
    public Object onKernelRequest(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object session = null;
        Object cookies = null;
        if (!ZVal.isTrue(
                env.callMethod(event, "isMasterRequest", AbstractTestSessionListener.class))) {
            return null;
        }

        session = env.callMethod(this, "getSession", AbstractTestSessionListener.class);
        if (!ZVal.isTrue(session)) {
            return null;
        }

        cookies =
                ZVal.assign(
                        toObjectR(
                                        env.callMethod(
                                                event,
                                                "getRequest",
                                                AbstractTestSessionListener.class))
                                .accessProp(this, env)
                                .name("cookies")
                                .value());
        if (ZVal.isTrue(
                env.callMethod(
                        cookies,
                        "has",
                        AbstractTestSessionListener.class,
                        env.callMethod(session, "getName", AbstractTestSessionListener.class)))) {
            this.sessionId =
                    env.callMethod(
                            cookies,
                            "get",
                            AbstractTestSessionListener.class,
                            env.callMethod(session, "getName", AbstractTestSessionListener.class));
            env.callMethod(session, "setId", AbstractTestSessionListener.class, this.sessionId);
        }

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
        Object request = null;
        Object wasStarted = null;
        Object session = null;
        ReferenceContainer params = new BasicReferenceContainer(null);
        if (!ZVal.isTrue(
                env.callMethod(event, "isMasterRequest", AbstractTestSessionListener.class))) {
            return null;
        }

        request = env.callMethod(event, "getRequest", AbstractTestSessionListener.class);
        if (!ZVal.isTrue(
                env.callMethod(request, "hasSession", AbstractTestSessionListener.class))) {
            return null;
        }

        session = env.callMethod(request, "getSession", AbstractTestSessionListener.class);
        if (ZVal.isTrue(
                wasStarted =
                        env.callMethod(session, "isStarted", AbstractTestSessionListener.class))) {
            env.callMethod(session, "save", AbstractTestSessionListener.class);
        }

        if (ZVal.isTrue(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        session,
                                        Session.class,
                                        "Symfony\\Component\\HttpFoundation\\Session\\Session"))
                        ? ZVal.toBool(
                                        !ZVal.isTrue(
                                                env.callMethod(
                                                        session,
                                                        "isEmpty",
                                                        AbstractTestSessionListener.class)))
                                || ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.strictNotEqualityCheck(
                                                                ZVal.getNull(),
                                                                "!==",
                                                                this.sessionId))
                                                && ZVal.toBool(
                                                        ZVal.strictNotEqualityCheck(
                                                                env.callMethod(
                                                                        session,
                                                                        "getId",
                                                                        AbstractTestSessionListener
                                                                                .class),
                                                                "!==",
                                                                this.sessionId)))
                        : wasStarted)) {
            params.setObject(function_session_get_cookie_params.f.env(env).call().value());
            env.callMethod(
                    toObjectR(
                                    env.callMethod(
                                            event,
                                            "getResponse",
                                            AbstractTestSessionListener.class))
                            .accessProp(this, env)
                            .name("headers")
                            .value(),
                    "setCookie",
                    AbstractTestSessionListener.class,
                    new Cookie(
                            env,
                            env.callMethod(session, "getName", AbstractTestSessionListener.class),
                            env.callMethod(session, "getId", AbstractTestSessionListener.class),
                            ZVal.strictEqualityCheck(0, "===", params.arrayGet(env, "lifetime"))
                                    ? 0
                                    : ZVal.add(
                                            NamespaceGlobal.time.env(env).call().value(),
                                            params.arrayGet(env, "lifetime")),
                            params.arrayGet(env, "path"),
                            params.arrayGet(env, "domain"),
                            params.arrayGet(env, "secure"),
                            params.arrayGet(env, "httponly")));
            this.sessionId = env.callMethod(session, "getId", AbstractTestSessionListener.class);
        }

        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\EventListener\\AbstractTestSessionListener";

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
                                    ZVal.arrayFromList("onKernelRequest", 192)),
                            new ZPair(
                                    KernelEvents.CONST_RESPONSE,
                                    ZVal.arrayFromList("onKernelResponse", -128))));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\HttpKernel\\EventListener\\AbstractTestSessionListener")
                    .setLookup(
                            AbstractTestSessionListener.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("sessionId")
                    .setFilename(
                            "vendor/symfony/http-kernel/EventListener/AbstractTestSessionListener.php")
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
