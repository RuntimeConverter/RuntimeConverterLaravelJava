package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.namespaces.Debug.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.ClassStub;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/event-dispatcher/Debug/WrappedListener.php

*/

public class WrappedListener extends RuntimeClassBase {

    public Object listener = null;

    public Object name = null;

    public Object called = null;

    public Object stoppedPropagation = null;

    public Object stopwatch = null;

    public Object dispatcher = null;

    public Object pretty = null;

    public Object stub = null;

    public WrappedListener(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == WrappedListener.class) {
            this.__construct(env, args);
        }
    }

    public WrappedListener(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "listener")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(
        index = 2,
        name = "stopwatch",
        typeHint = "Symfony\\Component\\Stopwatch\\Stopwatch"
    )
    @ConvertedParameter(
        index = 3,
        name = "dispatcher",
        typeHint = "Symfony\\Component\\EventDispatcher\\EventDispatcherInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        ReferenceContainer listener = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object name = assignParameter(args, 1, false);
        Object stopwatch = assignParameter(args, 2, false);
        Object dispatcher = assignParameter(args, 3, true);
        if (null == dispatcher) {
            dispatcher = ZVal.getNull();
        }
        this.listener = listener.getObject();
        this.name = name;
        this.stopwatch = stopwatch;
        this.dispatcher = dispatcher;
        this.called = false;
        this.stoppedPropagation = false;
        if (function_is_array.f.env(env).call(listener.getObject()).getBool()) {
            this.name =
                    function_is_object.f.env(env).call(listener.arrayGet(env, 0)).getBool()
                            ? function_get_class.f.env(env).call(listener.arrayGet(env, 0)).value()
                            : listener.arrayGet(env, 0);
            this.pretty =
                    toStringR(this.name, env) + "::" + toStringR(listener.arrayGet(env, 1), env);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(listener.getObject(), Closure.class, "Closure"))) {
            this.pretty = this.name = "closure";

        } else if (function_is_string.f.env(env).call(listener.getObject()).getBool()) {
            this.pretty = this.name = listener.getObject();

        } else {
            this.name = function_get_class.f.env(env).call(listener.getObject()).value();
            this.pretty = toStringR(this.name, env) + "::__invoke";
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", name)) {
            this.name = name;
        }

        if (ZVal.strictEqualityCheck(
                ZVal.getNull(),
                "===",
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
                                        .Debug
                                        .classes
                                        .WrappedListener
                                        .RequestStaticProperties
                                        .class)
                        .hasClassStub)) {
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
                                            .Debug
                                            .classes
                                            .WrappedListener
                                            .RequestStaticProperties
                                            .class)
                            .hasClassStub =
                    function_class_exists.f.env(env).call(ClassStub.CONST_class).value();
        }

        return null;
    }

    @ConvertedMethod
    public Object getWrappedListener(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.listener);
    }

    @ConvertedMethod
    public Object wasCalled(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.called);
    }

    @ConvertedMethod
    public Object stoppedPropagation(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.stoppedPropagation);
    }

    @ConvertedMethod
    public Object getPretty(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.pretty);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    public Object getInfo(RuntimeEnv env, Object... args) {
        Object eventName = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.stub)) {
            this.stub =
                    ZVal.isTrue(
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
                                                            .Debug
                                                            .classes
                                                            .WrappedListener
                                                            .RequestStaticProperties
                                                            .class)
                                            .hasClassStub)
                            ? new ClassStub(env, toStringR(this.pretty, env) + "()", this.listener)
                            : toStringR(this.pretty, env) + "()";
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("event", eventName),
                        new ZPair(
                                "priority",
                                ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.dispatcher)
                                        ? env.callMethod(
                                                this.dispatcher,
                                                "getListenerPriority",
                                                WrappedListener.class,
                                                eventName,
                                                this.listener)
                                        : ZVal.getNull()),
                        new ZPair("pretty", this.pretty),
                        new ZPair("stub", this.stub)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Symfony\\Component\\EventDispatcher\\Event"
    )
    @ConvertedParameter(index = 1, name = "eventName")
    @ConvertedParameter(
        index = 2,
        name = "dispatcher",
        typeHint = "Symfony\\Component\\EventDispatcher\\EventDispatcherInterface"
    )
    public Object __invoke(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object eventName = assignParameter(args, 1, false);
        Object dispatcher = assignParameter(args, 2, false);
        Object e = null;
        Object ternaryExpressionTemp = null;
        this.called = true;
        e =
                env.callMethod(
                        this.stopwatch,
                        "start",
                        WrappedListener.class,
                        this.name,
                        "event_listener");
        function_call_user_func
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                .call(
                        this.listener,
                        event,
                        eventName,
                        ZVal.isTrue(ternaryExpressionTemp = this.dispatcher)
                                ? ternaryExpressionTemp
                                : dispatcher);
        if (ZVal.isTrue(env.callMethod(e, "isStarted", WrappedListener.class))) {
            env.callMethod(e, "stop", WrappedListener.class);
        }

        if (ZVal.isTrue(env.callMethod(event, "isPropagationStopped", WrappedListener.class))) {
            this.stoppedPropagation = true;
        }

        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\EventDispatcher\\Debug\\WrappedListener";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object hasClassStub = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\EventDispatcher\\Debug\\WrappedListener")
                    .setLookup(
                            WrappedListener.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "called",
                            "dispatcher",
                            "listener",
                            "name",
                            "pretty",
                            "stoppedPropagation",
                            "stopwatch",
                            "stub")
                    .setStaticPropertyNames("hasClassStub")
                    .setFilename("vendor/symfony/event-dispatcher/Debug/WrappedListener.php")
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
