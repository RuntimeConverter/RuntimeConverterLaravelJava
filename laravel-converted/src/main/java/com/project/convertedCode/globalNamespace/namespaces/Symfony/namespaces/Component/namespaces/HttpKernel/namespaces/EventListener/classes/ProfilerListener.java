package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.EventListener.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.KernelEvents;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes.EventSubscriberInterface;
import com.runtimeconverter.runtime.nativeClasses.spl.datastructures.SplObjectStorage;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/EventListener/ProfilerListener.php

*/

public class ProfilerListener extends RuntimeClassBase implements EventSubscriberInterface {

    public Object profiler = null;

    public Object matcher = null;

    public Object onlyException = null;

    public Object onlyMasterRequests = null;

    public Object exception = null;

    public Object profiles = null;

    public Object requestStack = null;

    public Object parents = null;

    public ProfilerListener(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ProfilerListener.class) {
            this.__construct(env, args);
        }
    }

    public ProfilerListener(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "profiler",
        typeHint = "Symfony\\Component\\HttpKernel\\Profiler\\Profiler"
    )
    @ConvertedParameter(
        index = 1,
        name = "requestStack",
        typeHint = "Symfony\\Component\\HttpFoundation\\RequestStack"
    )
    @ConvertedParameter(
        index = 2,
        name = "matcher",
        typeHint = "Symfony\\Component\\HttpFoundation\\RequestMatcherInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "onlyException",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "onlyMasterRequests",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object profiler = assignParameter(args, 0, false);
        Object requestStack = assignParameter(args, 1, false);
        Object matcher = assignParameter(args, 2, true);
        if (null == matcher) {
            matcher = ZVal.getNull();
        }
        Object onlyException = assignParameter(args, 3, true);
        if (null == onlyException) {
            onlyException = false;
        }
        Object onlyMasterRequests = assignParameter(args, 4, true);
        if (null == onlyMasterRequests) {
            onlyMasterRequests = false;
        }
        this.profiler = profiler;
        this.matcher = matcher;
        this.onlyException = onlyException;
        this.onlyMasterRequests = onlyMasterRequests;
        this.profiles = new SplObjectStorage(env);
        this.parents = new SplObjectStorage(env);
        this.requestStack = requestStack;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Symfony\\Component\\HttpKernel\\Event\\GetResponseForExceptionEvent"
    )
    public Object onKernelException(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        if (ZVal.toBool(this.onlyMasterRequests)
                && ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        event, "isMasterRequest", ProfilerListener.class)))) {
            return null;
        }

        this.exception = env.callMethod(event, "getException", ProfilerListener.class);
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
        Object exception = null;
        Object request = null;
        Object profile = null;
        Object master = null;
        master = env.callMethod(event, "isMasterRequest", ProfilerListener.class);
        if (ZVal.toBool(this.onlyMasterRequests) && ZVal.toBool(!ZVal.isTrue(master))) {
            return null;
        }

        if (ZVal.toBool(this.onlyException)
                && ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.exception))) {
            return null;
        }

        request = env.callMethod(event, "getRequest", ProfilerListener.class);
        exception = ZVal.assign(this.exception);
        this.exception = ZVal.getNull();
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.matcher))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        this.matcher,
                                        "matches",
                                        ProfilerListener.class,
                                        request)))) {
            return null;
        }

        if (!ZVal.isTrue(
                profile =
                        env.callMethod(
                                this.profiler,
                                "collect",
                                ProfilerListener.class,
                                request,
                                env.callMethod(event, "getResponse", ProfilerListener.class),
                                exception))) {
            return null;
        }

        new ReferenceClassProperty(this, "profiles", env).arrayAccess(env, request).set(profile);
        new ReferenceClassProperty(this, "parents", env)
                .arrayAccess(env, request)
                .set(env.callMethod(this.requestStack, "getParentRequest", ProfilerListener.class));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Symfony\\Component\\HttpKernel\\Event\\PostResponseEvent"
    )
    public Object onKernelTerminate(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object request = null;
        Object parentRequest = null;
        for (ZPair zpairResult1948 : ZVal.getIterable(this.profiles, env, true)) {
            request = ZVal.assign(zpairResult1948.getValue());
            if (ZVal.strictNotEqualityCheck(
                    ZVal.getNull(),
                    "!==",
                    parentRequest =
                            ZVal.assign(
                                    new ReferenceClassProperty(this, "parents", env)
                                            .arrayGet(env, request)))) {
                if (arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "profiles", env),
                        env,
                        parentRequest)) {
                    env.callMethod(
                            new ReferenceClassProperty(this, "profiles", env)
                                    .arrayGet(env, parentRequest),
                            "addChild",
                            ProfilerListener.class,
                            new ReferenceClassProperty(this, "profiles", env)
                                    .arrayGet(env, request));
                }
            }
        }

        for (ZPair zpairResult1949 : ZVal.getIterable(this.profiles, env, true)) {
            request = ZVal.assign(zpairResult1949.getValue());
            env.callMethod(
                    this.profiler,
                    "saveProfile",
                    ProfilerListener.class,
                    new ReferenceClassProperty(this, "profiles", env).arrayGet(env, request));
        }

        this.profiles = new SplObjectStorage(env);
        this.parents = new SplObjectStorage(env);
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\EventListener\\ProfilerListener";

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
                                    KernelEvents.CONST_RESPONSE,
                                    ZVal.arrayFromList("onKernelResponse", -100)),
                            new ZPair(
                                    KernelEvents.CONST_EXCEPTION,
                                    ZVal.arrayFromList("onKernelException", 0)),
                            new ZPair(
                                    KernelEvents.CONST_TERMINATE,
                                    ZVal.arrayFromList("onKernelTerminate", -1024))));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\EventListener\\ProfilerListener")
                    .setLookup(
                            ProfilerListener.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "exception",
                            "matcher",
                            "onlyException",
                            "onlyMasterRequests",
                            "parents",
                            "profiler",
                            "profiles",
                            "requestStack")
                    .setFilename("vendor/symfony/http-kernel/EventListener/ProfilerListener.php")
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
