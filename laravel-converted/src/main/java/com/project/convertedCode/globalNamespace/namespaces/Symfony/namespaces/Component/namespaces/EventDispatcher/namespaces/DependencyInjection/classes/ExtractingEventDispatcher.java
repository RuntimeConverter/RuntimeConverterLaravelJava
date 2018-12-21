package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.namespaces.DependencyInjection.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes.EventDispatcher;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes.EventSubscriberInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/event-dispatcher/DependencyInjection/RegisterListenersPass.php

*/

public class ExtractingEventDispatcher extends EventDispatcher implements EventSubscriberInterface {

    public ExtractingEventDispatcher(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.listeners = ZVal.newArray();
    }

    public ExtractingEventDispatcher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    @ConvertedParameter(index = 1, name = "listener")
    @ConvertedParameter(
        index = 2,
        name = "priority",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object addListener(RuntimeEnv env, Object... args) {
        Object eventName = assignParameter(args, 0, false);
        ReferenceContainer listener = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object priority = assignParameter(args, 2, true);
        if (null == priority) {
            priority = 0;
        }
        new ReferenceClassProperty(this, "listeners", env)
                .arrayAppend(env)
                .set(
                        ZVal.newArray(
                                new ZPair(0, eventName),
                                new ZPair(1, listener.arrayGet(env, 1)),
                                new ZPair(2, priority)));
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\EventDispatcher\\DependencyInjection\\ExtractingEventDispatcher";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends EventDispatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getSubscribedEvents(RuntimeEnv env, Object... args) {
            Object callback = null;
            callback =
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Symfony
                                                            .namespaces
                                                            .Component
                                                            .namespaces
                                                            .EventDispatcher
                                                            .namespaces
                                                            .DependencyInjection
                                                            .classes
                                                            .ExtractingEventDispatcher
                                                            .RequestStaticProperties
                                                            .class)
                                            .subscriber),
                            new ZPair(1, "getSubscribedEvents"));
            return ZVal.assign(
                    env.callFunctionDynamic(callback, new RuntimeArgsWithReferences()).value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object subscriber = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\EventDispatcher\\DependencyInjection\\ExtractingEventDispatcher")
                    .setLookup(
                            ExtractingEventDispatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("listeners", "listeners", "sorted")
                    .setStaticPropertyNames("subscriber")
                    .setFilename(
                            "vendor/symfony/event-dispatcher/DependencyInjection/RegisterListenersPass.php")
                    .addInterface("Symfony\\Component\\EventDispatcher\\EventSubscriberInterface")
                    .addInterface("Symfony\\Component\\EventDispatcher\\EventDispatcherInterface")
                    .addExtendsClass("Symfony\\Component\\EventDispatcher\\EventDispatcher")
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
