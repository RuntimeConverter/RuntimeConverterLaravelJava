package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.namespaces.DependencyInjection.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes.EventSubscriberInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.namespaces.DependencyInjection.classes.ExtractingEventDispatcher;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/event-dispatcher/DependencyInjection/RegisterListenersPass.php

*/

public class RegisterListenersPass extends RuntimeClassBase {

    public Object dispatcherService = null;

    public Object listenerTag = null;

    public Object subscriberTag = null;

    public Object hotPathEvents = ZVal.newArray();

    public Object hotPathTagName = null;

    public RegisterListenersPass(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RegisterListenersPass.class) {
            this.__construct(env, args);
        }
    }

    public RegisterListenersPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dispatcherService", typeHint = "string")
    @ConvertedParameter(index = 1, name = "listenerTag", typeHint = "string")
    @ConvertedParameter(index = 2, name = "subscriberTag", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object dispatcherService = assignParameter(args, 0, true);
        if (null == dispatcherService) {
            dispatcherService = "event_dispatcher";
        }
        Object listenerTag = assignParameter(args, 1, true);
        if (null == listenerTag) {
            listenerTag = "kernel.event_listener";
        }
        Object subscriberTag = assignParameter(args, 2, true);
        if (null == subscriberTag) {
            subscriberTag = "kernel.event_subscriber";
        }
        this.dispatcherService = dispatcherService;
        this.listenerTag = listenerTag;
        this.subscriberTag = subscriberTag;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "hotPathEvents", typeHint = "array")
    @ConvertedParameter(index = 1, name = "tagName")
    public Object setHotPathEvents(RuntimeEnv env, Object... args) {
        Object hotPathEvents = assignParameter(args, 0, false);
        Object tagName = assignParameter(args, 1, true);
        if (null == tagName) {
            tagName = "container.hot_path";
        }
        this.hotPathEvents = function_array_flip.f.env(env).call(hotPathEvents).value();
        this.hotPathTagName = tagName;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Symfony\\Component\\DependencyInjection\\ContainerBuilder"
    )
    public Object process(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/event-dispatcher/DependencyInjection")
                        .setFile(
                                "/vendor/symfony/event-dispatcher/DependencyInjection/RegisterListenersPass.php");
        Object container = assignParameter(args, 0, false);
        Object def = null;
        Object priority = null;
        ReferenceContainer ___args = new BasicReferenceContainer(null);
        Object r = null;
        Object definition = null;
        Object attributes = null;
        Object id = null;
        ReferenceContainer event = new BasicReferenceContainer(null);
        Object _pClass = null;
        Object events = null;
        Object extractingDispatcher = null;
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        container,
                                        "hasDefinition",
                                        RegisterListenersPass.class,
                                        this.dispatcherService)))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        container,
                                        "hasAlias",
                                        RegisterListenersPass.class,
                                        this.dispatcherService)))) {
            return null;
        }

        definition =
                env.callMethod(
                        container,
                        "findDefinition",
                        RegisterListenersPass.class,
                        this.dispatcherService);
        for (ZPair zpairResult1808 :
                ZVal.getIterable(
                        env.callMethod(
                                container,
                                "findTaggedServiceIds",
                                RegisterListenersPass.class,
                                this.listenerTag,
                                true),
                        env,
                        false)) {
            id = ZVal.assign(zpairResult1808.getKey());
            events = ZVal.assign(zpairResult1808.getValue());
            for (ZPair zpairResult1809 : ZVal.getIterable(events, env, true)) {
                event.setObject(ZVal.assign(zpairResult1809.getValue()));
                priority =
                        ZVal.assign(
                                arrayActionR(ArrayAction.ISSET, event, env, "priority")
                                        ? event.arrayGet(env, "priority")
                                        : 0);
                if (!arrayActionR(ArrayAction.ISSET, event, env, "event")) {
                    throw ZVal.getException(
                            env,
                            env.createNew(
                                    ZVal.resolveClassAlias(env, "InvalidArgumentException"),
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Service \"%s\" must define the \"event\" attribute on \"%s\" tags.",
                                                    id, this.listenerTag)
                                            .value()));
                }

                if (!arrayActionR(ArrayAction.ISSET, event, env, "method")) {
                    event.arrayAccess(env, "method")
                            .set(
                                    "on"
                                            + toStringR(
                                                    NamespaceGlobal.preg_replace_callback
                                                            .env(env)
                                                            .call(
                                                                    ZVal.arrayFromList(
                                                                            "/(?<=\\b)[a-z]/i",
                                                                            "/[^a-z0-9]/i"),
                                                                    new Closure(
                                                                            env,
                                                                            runtimeConverterFunctionClassConstants,
                                                                            "Symfony\\Component\\EventDispatcher\\DependencyInjection",
                                                                            this) {
                                                                        @Override
                                                                        @ConvertedMethod
                                                                        @ConvertedParameter(
                                                                            index = 0,
                                                                            name = "matches"
                                                                        )
                                                                        public Object run(
                                                                                RuntimeEnv env,
                                                                                Object thisvar,
                                                                                PassByReferenceArgs
                                                                                        runtimePassByReferenceArgs,
                                                                                Object... args) {
                                                                            ReferenceContainer
                                                                                    matches =
                                                                                            new BasicReferenceContainer(
                                                                                                    assignParameter(
                                                                                                            args,
                                                                                                            0,
                                                                                                            false));
                                                                            return ZVal.assign(
                                                                                    NamespaceGlobal
                                                                                            .strtoupper
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    matches
                                                                                                            .arrayGet(
                                                                                                                    env,
                                                                                                                    0))
                                                                                            .value());
                                                                        }
                                                                    },
                                                                    event.arrayGet(env, "event"))
                                                            .value(),
                                                    env));
                    event.arrayAccess(env, "method")
                            .set(
                                    function_preg_replace
                                            .f
                                            .env(env)
                                            .call("/[^a-z0-9]/i", "", event.arrayGet(env, "method"))
                                            .value());
                    if (ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.toBool(
                                                                    ZVal.strictNotEqualityCheck(
                                                                            ZVal.getNull(),
                                                                            "!==",
                                                                            _pClass =
                                                                                    env.callMethod(
                                                                                            env
                                                                                                    .callMethod(
                                                                                                            container,
                                                                                                            "getDefinition",
                                                                                                            RegisterListenersPass
                                                                                                                    .class,
                                                                                                            id),
                                                                                            "getClass",
                                                                                            RegisterListenersPass
                                                                                                    .class)))
                                                            && ZVal.toBool(
                                                                    r =
                                                                            env.callMethod(
                                                                                    container,
                                                                                    "getReflectionClass",
                                                                                    RegisterListenersPass
                                                                                            .class,
                                                                                    _pClass,
                                                                                    false)))
                                            && ZVal.toBool(
                                                    !ZVal.isTrue(
                                                            env.callMethod(
                                                                    r,
                                                                    "hasMethod",
                                                                    RegisterListenersPass.class,
                                                                    event.arrayGet(
                                                                            env, "method")))))
                            && ZVal.toBool(
                                    env.callMethod(
                                            r,
                                            "hasMethod",
                                            RegisterListenersPass.class,
                                            "__invoke"))) {
                        event.arrayAccess(env, "method").set("__invoke");
                    }
                }

                env.callMethod(
                        definition,
                        "addMethodCall",
                        RegisterListenersPass.class,
                        "addListener",
                        ZVal.newArray(
                                new ZPair(0, event.arrayGet(env, "event")),
                                new ZPair(
                                        1,
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        env.createNew(
                                                                ZVal.resolveClassAlias(
                                                                        env,
                                                                        "ServiceClosureArgument"),
                                                                env.createNew(
                                                                        ZVal.resolveClassAlias(
                                                                                env, "Reference"),
                                                                        id))),
                                                new ZPair(1, event.arrayGet(env, "method")))),
                                new ZPair(2, priority)));
                if (arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "hotPathEvents", env),
                        env,
                        event.arrayGet(env, "event"))) {
                    env.callMethod(
                            env.callMethod(
                                    container, "getDefinition", RegisterListenersPass.class, id),
                            "addTag",
                            RegisterListenersPass.class,
                            this.hotPathTagName);
                }
            }
        }

        extractingDispatcher = new ExtractingEventDispatcher(env);
        for (ZPair zpairResult1810 :
                ZVal.getIterable(
                        env.callMethod(
                                container,
                                "findTaggedServiceIds",
                                RegisterListenersPass.class,
                                this.subscriberTag,
                                true),
                        env,
                        false)) {
            id = ZVal.assign(zpairResult1810.getKey());
            attributes = ZVal.assign(zpairResult1810.getValue());
            def = env.callMethod(container, "getDefinition", RegisterListenersPass.class, id);
            _pClass = env.callMethod(def, "getClass", RegisterListenersPass.class);
            if (!ZVal.isTrue(
                    r =
                            env.callMethod(
                                    container,
                                    "getReflectionClass",
                                    RegisterListenersPass.class,
                                    _pClass))) {
                throw ZVal.getException(
                        env,
                        env.createNew(
                                ZVal.resolveClassAlias(env, "InvalidArgumentException"),
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Class \"%s\" used for service \"%s\" cannot be found.",
                                                _pClass, id)
                                        .value()));
            }

            if (!ZVal.isTrue(
                    env.callMethod(
                            r,
                            "isSubclassOf",
                            RegisterListenersPass.class,
                            EventSubscriberInterface.CONST_class))) {
                throw ZVal.getException(
                        env,
                        env.createNew(
                                ZVal.resolveClassAlias(env, "InvalidArgumentException"),
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Service \"%s\" must implement interface \"%s\".",
                                                id, EventSubscriberInterface.CONST_class)
                                        .value()));
            }

            _pClass = ZVal.assign(toObjectR(r).accessProp(this, env).name("name").value());
            env.getRequestStaticProperties(ExtractingEventDispatcher.RequestStaticProperties.class)
                            .subscriber =
                    _pClass;
            env.callMethod(
                    extractingDispatcher,
                    "addSubscriber",
                    RegisterListenersPass.class,
                    extractingDispatcher);
            for (ZPair zpairResult1811 :
                    ZVal.getIterable(
                            toObjectR(extractingDispatcher)
                                    .accessProp(this, env)
                                    .name("listeners")
                                    .value(),
                            env,
                            true)) {
                ___args.setObject(ZVal.assign(zpairResult1811.getValue()));
                ___args.arrayAccess(env, 1)
                        .set(
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                env.createNew(
                                                        ZVal.resolveClassAlias(
                                                                env, "ServiceClosureArgument"),
                                                        env.createNew(
                                                                ZVal.resolveClassAlias(
                                                                        env, "Reference"),
                                                                id))),
                                        new ZPair(1, ___args.arrayGet(env, 1))));
                env.callMethod(
                        definition,
                        "addMethodCall",
                        RegisterListenersPass.class,
                        "addListener",
                        ___args.getObject());
                if (arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "hotPathEvents", env),
                        env,
                        ___args.arrayGet(env, 0))) {
                    env.callMethod(
                            env.callMethod(
                                    container, "getDefinition", RegisterListenersPass.class, id),
                            "addTag",
                            RegisterListenersPass.class,
                            "container.hot_path");
                }
            }

            toObjectR(extractingDispatcher)
                    .accessProp(this, env)
                    .name("listeners")
                    .set(ZVal.newArray());
        }

        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\EventDispatcher\\DependencyInjection\\RegisterListenersPass";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\EventDispatcher\\DependencyInjection\\RegisterListenersPass")
                    .setLookup(
                            RegisterListenersPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "dispatcherService",
                            "hotPathEvents",
                            "hotPathTagName",
                            "listenerTag",
                            "subscriberTag")
                    .setFilename(
                            "vendor/symfony/event-dispatcher/DependencyInjection/RegisterListenersPass.php")
                    .addInterface("CompilerPassInterface")
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
