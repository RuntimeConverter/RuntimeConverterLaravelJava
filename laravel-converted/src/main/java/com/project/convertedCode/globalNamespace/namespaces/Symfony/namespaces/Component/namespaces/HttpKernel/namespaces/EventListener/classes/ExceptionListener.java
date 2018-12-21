package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.EventListener.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionProperty;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.HttpKernelInterface;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.KernelEvents;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes.EventSubscriberInterface;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes.EventDispatcherInterface;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Log.classes.DebugLoggerInterface;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes.HttpExceptionInterface;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_arg;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.FlattenException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeClasses.errors.PHPError;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_num_args;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/EventListener/ExceptionListener.php

*/

public class ExceptionListener extends RuntimeClassBase implements EventSubscriberInterface {

    public Object controller = null;

    public Object logger = null;

    public Object debug = null;

    public ExceptionListener(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ExceptionListener.class) {
            this.__construct(env, args);
        }
    }

    public ExceptionListener(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "controller")
    @ConvertedParameter(
        index = 1,
        name = "logger",
        typeHint = "Psr\\Log\\LoggerInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "debug",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object controller = assignParameter(args, 0, false);
        Object logger = assignParameter(args, 1, true);
        if (null == logger) {
            logger = ZVal.getNull();
        }
        Object debug = assignParameter(args, 2, true);
        if (null == debug) {
            debug = false;
        }
        this.controller = controller;
        this.logger = logger;
        this.debug = debug;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Symfony\\Component\\HttpKernel\\Event\\GetResponseForExceptionEvent"
    )
    public Object logKernelException(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object exception = null;
        exception = env.callMethod(event, "getException", ExceptionListener.class);
        this.logException(
                env,
                exception,
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "Uncaught PHP Exception %s: \"%s\" at %s line %s",
                                function_get_class.f.env(env).call(exception).value(),
                                env.callMethod(exception, "getMessage", ExceptionListener.class),
                                env.callMethod(exception, "getFile", ExceptionListener.class),
                                env.callMethod(exception, "getLine", ExceptionListener.class))
                        .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Symfony\\Component\\HttpKernel\\Event\\GetResponseForExceptionEvent"
    )
    public Object onKernelException(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/http-kernel/EventListener")
                        .setFile("/vendor/symfony/http-kernel/EventListener/ExceptionListener.php");
        Object event = assignParameter(args, 0, false);
        Object exception = null;
        Object request = null;
        Object e = null;
        Object response = null;
        Object prev = null;
        ReferenceContainer cspRemovalListener = new BasicReferenceContainer(null);
        Object wrapper = null;
        Object eventDispatcher = null;
        exception = env.callMethod(event, "getException", ExceptionListener.class);
        request =
                this.duplicateRequest(
                        env,
                        exception,
                        env.callMethod(event, "getRequest", ExceptionListener.class));
        eventDispatcher =
                ZVal.assign(
                        ZVal.isGreaterThan(
                                        function_func_num_args
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithInfo(args, this))
                                                .call()
                                                .value(),
                                        '>',
                                        2)
                                ? function_func_get_arg
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call(2)
                                        .value()
                                : ZVal.getNull());
        try {
            response =
                    env.callMethod(
                            env.callMethod(event, "getKernel", ExceptionListener.class),
                            "handle",
                            ExceptionListener.class,
                            request,
                            HttpKernelInterface.CONST_SUB_REQUEST,
                            false);
        } catch (ConvertedException convertedException281) {
            if (convertedException281.instanceOf(PHPException.class, "Exception")) {
                e = convertedException281.getObject();
                this.logException(
                        env,
                        e,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Exception thrown when handling an exception (%s: %s at %s line %s)",
                                        function_get_class.f.env(env).call(e).value(),
                                        env.callMethod(e, "getMessage", ExceptionListener.class),
                                        env.callMethod(e, "getFile", ExceptionListener.class),
                                        env.callMethod(e, "getLine", ExceptionListener.class))
                                .value());
                wrapper = ZVal.assign(e);
                while (ZVal.isTrue(
                        prev = env.callMethod(wrapper, "getPrevious", ExceptionListener.class))) {
                    if (ZVal.strictEqualityCheck(exception, "===", wrapper = ZVal.assign(prev))) {
                        throw ZVal.getException(env, e);
                    }
                }

                prev =
                        new ReflectionProperty(
                                env,
                                ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        wrapper, PHPException.class, "Exception"))
                                        ? "Exception"
                                        : "Error",
                                "previous");
                env.callMethod(prev, "setAccessible", ExceptionListener.class, true);
                env.callMethod(prev, "setValue", ExceptionListener.class, wrapper, exception);
                throw ZVal.getException(env, e);
            } else {
                throw convertedException281;
            }
        }

        env.callMethod(event, "setResponse", ExceptionListener.class, response);
        if (ZVal.toBool(this.debug)
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                eventDispatcher,
                                EventDispatcherInterface.class,
                                "Symfony\\Component\\EventDispatcher\\EventDispatcherInterface"))) {
            cspRemovalListener.setObject(
                    new Closure(
                            env,
                            runtimeConverterFunctionClassConstants,
                            "Symfony\\Component\\HttpKernel\\EventListener",
                            this) {
                        @Override
                        @ConvertedMethod
                        @ConvertedParameter(
                            index = 0,
                            name = "event",
                            typeHint = "Symfony\\Component\\HttpKernel\\Event\\FilterResponseEvent"
                        )
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            Object event = assignParameter(args, 0, false);
                            ReferenceContainer cspRemovalListener =
                                    new BasicReferenceContainer(null);
                            Object eventDispatcher = null;
                            cspRemovalListener =
                                    this.contextReferences.getReferenceContainer(
                                            "cspRemovalListener");
                            eventDispatcher =
                                    this.contextReferences.getCapturedValue("eventDispatcher");
                            env.callMethod(
                                    toObjectR(
                                                    env.callMethod(
                                                            event,
                                                            "getResponse",
                                                            ExceptionListener.class))
                                            .accessProp(this, env)
                                            .name("headers")
                                            .value(),
                                    "remove",
                                    ExceptionListener.class,
                                    "Content-Security-Policy");
                            env.callMethod(
                                    eventDispatcher,
                                    "removeListener",
                                    ExceptionListener.class,
                                    KernelEvents.CONST_RESPONSE,
                                    cspRemovalListener.getObject());
                            return null;
                        }
                    }.useRef("cspRemovalListener", cspRemovalListener)
                            .use("eventDispatcher", eventDispatcher));
            env.callMethod(
                    eventDispatcher,
                    "addListener",
                    ExceptionListener.class,
                    KernelEvents.CONST_RESPONSE,
                    cspRemovalListener.getObject(),
                    -128);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception", typeHint = "Exception")
    @ConvertedParameter(index = 1, name = "message")
    protected Object logException(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.logger)) {
            if (ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            exception,
                                            HttpExceptionInterface.class,
                                            "Symfony\\Component\\HttpKernel\\Exception\\HttpExceptionInterface")))
                    || ZVal.toBool(
                            ZVal.isGreaterThanOrEqualTo(
                                    env.callMethod(
                                            exception, "getStatusCode", ExceptionListener.class),
                                    ">=",
                                    500))) {
                env.callMethod(
                        this.logger,
                        "critical",
                        ExceptionListener.class,
                        message,
                        ZVal.newArray(new ZPair("exception", exception)));

            } else {
                env.callMethod(
                        this.logger,
                        "error",
                        ExceptionListener.class,
                        message,
                        ZVal.newArray(new ZPair("exception", exception)));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception", typeHint = "Exception")
    @ConvertedParameter(
        index = 1,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    protected Object duplicateRequest(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, false);
        Object request = assignParameter(args, 1, false);
        Object attributes = null;
        attributes =
                ZVal.newArray(
                        new ZPair("_controller", this.controller),
                        new ZPair(
                                "exception",
                                FlattenException.runtimeStaticObject.create(env, exception)),
                        new ZPair(
                                "logger",
                                ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        this.logger,
                                                        DebugLoggerInterface.class,
                                                        "Symfony\\Component\\HttpKernel\\Log\\DebugLoggerInterface"))
                                        ? this.logger
                                        : ZVal.getNull()));
        request =
                env.callMethod(
                        request,
                        "duplicate",
                        ExceptionListener.class,
                        ZVal.getNull(),
                        ZVal.getNull(),
                        attributes);
        env.callMethod(request, "setMethod", ExceptionListener.class, "GET");
        return ZVal.assign(request);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\EventListener\\ExceptionListener";

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
                                    KernelEvents.CONST_EXCEPTION,
                                    ZVal.newArray(
                                            new ZPair(
                                                    0, ZVal.arrayFromList("logKernelException", 0)),
                                            new ZPair(
                                                    1,
                                                    ZVal.arrayFromList(
                                                            "onKernelException", -128))))));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\EventListener\\ExceptionListener")
                    .setLookup(
                            ExceptionListener.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("controller", "debug", "logger")
                    .setFilename("vendor/symfony/http-kernel/EventListener/ExceptionListener.php")
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
