package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.EventListener.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.KernelEvents;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes.EventSubscriberInterface;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.classes.Session;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/EventListener/AbstractSessionListener.php

*/

public abstract class AbstractSessionListener extends RuntimeClassBase
        implements EventSubscriberInterface {

    public Object container = null;

    public Object sessionUsageStack = ZVal.newArray();

    public AbstractSessionListener(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AbstractSessionListener.class) {
            this.__construct(env, args);
        }
    }

    public AbstractSessionListener(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Psr\\Container\\ContainerInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, true);
        if (null == container) {
            container = ZVal.getNull();
        }
        this.container = container;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Symfony\\Component\\HttpKernel\\Event\\GetResponseEvent"
    )
    public Object onKernelRequest(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/http-kernel/EventListener")
                        .setFile(
                                "/vendor/symfony/http-kernel/EventListener/AbstractSessionListener.php");
        Object event = assignParameter(args, 0, false);
        Object request = null;
        Object session = null;
        Object ternaryExpressionTemp = null;
        if (!ZVal.isTrue(env.callMethod(event, "isMasterRequest", AbstractSessionListener.class))) {
            return null;
        }

        session = ZVal.getNull();
        request = env.callMethod(event, "getRequest", AbstractSessionListener.class);
        if (ZVal.isTrue(env.callMethod(request, "hasSession", AbstractSessionListener.class))) {

        } else if (function_method_exists.f.env(env).call(request, "setSessionFactory").getBool()) {
            env.callMethod(
                    request,
                    "setSessionFactory",
                    AbstractSessionListener.class,
                    new Closure(
                            env,
                            runtimeConverterFunctionClassConstants,
                            "Symfony\\Component\\HttpKernel\\EventListener",
                            this) {
                        @Override
                        @ConvertedMethod
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            Object _closureThisVar = this.getClosureThisVar();
                            return ZVal.assign(
                                    env.callMethod(
                                            _closureThisVar,
                                            "getSession",
                                            AbstractSessionListener.class));
                        }
                    });

        } else if (ZVal.isTrue(
                session = env.callMethod(this, "getSession", AbstractSessionListener.class))) {
            env.callMethod(request, "setSession", AbstractSessionListener.class, session);
        }

        session =
                ZVal.assign(
                        ZVal.isDefined(ternaryExpressionTemp = session)
                                ? ternaryExpressionTemp
                                : ZVal.toBool(this.container)
                                                && ZVal.toBool(
                                                        env.callMethod(
                                                                this.container,
                                                                "has",
                                                                AbstractSessionListener.class,
                                                                "initialized_session"))
                                        ? env.callMethod(
                                                this.container,
                                                "get",
                                                AbstractSessionListener.class,
                                                "initialized_session")
                                        : ZVal.getNull());
        new ReferenceClassProperty(this, "sessionUsageStack", env)
                .arrayAppend(env)
                .set(
                        ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                session,
                                                Session.class,
                                                "Symfony\\Component\\HttpFoundation\\Session\\Session"))
                                ? env.callMethod(
                                        session, "getUsageIndex", AbstractSessionListener.class)
                                : ZVal.getNull());
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
        Object session = null;
        Object response = null;
        if (!ZVal.isTrue(env.callMethod(event, "isMasterRequest", AbstractSessionListener.class))) {
            return null;
        }

        if (!ZVal.isTrue(
                session =
                        ZVal.assign(
                                ZVal.toBool(this.container)
                                                && ZVal.toBool(
                                                        env.callMethod(
                                                                this.container,
                                                                "has",
                                                                AbstractSessionListener.class,
                                                                "initialized_session"))
                                        ? env.callMethod(
                                                this.container,
                                                "get",
                                                AbstractSessionListener.class,
                                                "initialized_session")
                                        : env.callMethod(
                                                env.callMethod(
                                                        event,
                                                        "getRequest",
                                                        AbstractSessionListener.class),
                                                "getSession",
                                                AbstractSessionListener.class)))) {
            return null;
        }

        response = env.callMethod(event, "getResponse", AbstractSessionListener.class);
        if (ZVal.isTrue(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        session,
                                        Session.class,
                                        "Symfony\\Component\\HttpFoundation\\Session\\Session"))
                        ? ZVal.strictNotEqualityCheck(
                                env.callMethod(
                                        session, "getUsageIndex", AbstractSessionListener.class),
                                "!==",
                                function_end.f.env(env).call(this.sessionUsageStack).value())
                        : env.callMethod(session, "isStarted", AbstractSessionListener.class))) {
            if (!ZVal.isTrue(
                    env.callMethod(
                            toObjectR(response).accessProp(this, env).name("headers").value(),
                            "has",
                            AbstractSessionListener.class,
                            CONST_NO_AUTO_CACHE_CONTROL_HEADER))) {
                env.callMethod(
                        toObjectR(
                                        env.callMethod(
                                                env.callMethod(
                                                        response,
                                                        "setPrivate",
                                                        AbstractSessionListener.class),
                                                "setMaxAge",
                                                AbstractSessionListener.class,
                                                0))
                                .accessProp(this, env)
                                .name("headers")
                                .value(),
                        "addCacheControlDirective",
                        AbstractSessionListener.class,
                        "must-revalidate");
            }
        }

        env.callMethod(
                toObjectR(response).accessProp(this, env).name("headers").value(),
                "remove",
                AbstractSessionListener.class,
                CONST_NO_AUTO_CACHE_CONTROL_HEADER);
        if (ZVal.isTrue(env.callMethod(session, "isStarted", AbstractSessionListener.class))) {
            env.callMethod(session, "save", AbstractSessionListener.class);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Symfony\\Component\\HttpKernel\\Event\\FinishRequestEvent"
    )
    public Object onFinishRequest(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        if (ZVal.isTrue(env.callMethod(event, "isMasterRequest", AbstractSessionListener.class))) {
            function_array_pop.f.env(env).call(this.sessionUsageStack);
        }

        return null;
    }

    public static final Object CONST_NO_AUTO_CACHE_CONTROL_HEADER =
            "Symfony-Session-NoAutoCacheControl";

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\EventListener\\AbstractSessionListener";

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
                                    ZVal.arrayFromList("onKernelRequest", 128)),
                            new ZPair(
                                    KernelEvents.CONST_RESPONSE,
                                    ZVal.arrayFromList("onKernelResponse", -1000)),
                            new ZPair(
                                    KernelEvents.CONST_FINISH_REQUEST,
                                    ZVal.arrayFromList("onFinishRequest"))));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\HttpKernel\\EventListener\\AbstractSessionListener")
                    .setLookup(
                            AbstractSessionListener.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("container", "sessionUsageStack")
                    .setFilename(
                            "vendor/symfony/http-kernel/EventListener/AbstractSessionListener.php")
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
