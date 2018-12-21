package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.EventListener.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.classes.ExceptionHandler;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.KernelEvents;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes.EventSubscriberInterface;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_exception_handler;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_exception_handler;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.classes.ErrorHandler;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Event.classes.KernelEvent;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.classes.ConsoleEvents;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Event.classes.ConsoleEvent;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.ConsoleOutputInterface;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/EventListener/DebugHandlersListener.php

*/

public class DebugHandlersListener extends RuntimeClassBase implements EventSubscriberInterface {

    public Object exceptionHandler = null;

    public Object logger = null;

    public Object levels = null;

    public Object throwAt = null;

    public Object scream = null;

    public Object fileLinkFormat = null;

    public Object scope = null;

    public Object firstCall = true;

    public Object hasTerminatedWithException = null;

    public DebugHandlersListener(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DebugHandlersListener.class) {
            this.__construct(env, args);
        }
    }

    public DebugHandlersListener(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "exceptionHandler",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "logger",
        typeHint = "Psr\\Log\\LoggerInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "levels")
    @ConvertedParameter(index = 3, name = "throwAt")
    @ConvertedParameter(
        index = 4,
        name = "scream",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "fileLinkFormat",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "scope",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object exceptionHandler = assignParameter(args, 0, true);
        if (null == exceptionHandler) {
            exceptionHandler = ZVal.getNull();
        }
        Object logger = assignParameter(args, 1, true);
        if (null == logger) {
            logger = ZVal.getNull();
        }
        Object levels = assignParameter(args, 2, true);
        if (null == levels) {
            levels = 32767;
        }
        Object throwAt = assignParameter(args, 3, true);
        if (null == throwAt) {
            throwAt = 32767;
        }
        Object scream = assignParameter(args, 4, true);
        if (null == scream) {
            scream = true;
        }
        Object fileLinkFormat = assignParameter(args, 5, true);
        if (null == fileLinkFormat) {
            fileLinkFormat = ZVal.getNull();
        }
        Object scope = assignParameter(args, 6, true);
        if (null == scope) {
            scope = true;
        }
        this.exceptionHandler = exceptionHandler;
        this.logger = logger;
        this.levels = ZVal.strictEqualityCheck(ZVal.getNull(), "===", levels) ? 32767 : levels;
        this.throwAt =
                function_is_int.f.env(env).call(throwAt).getBool()
                        ? throwAt
                        : ZVal.strictEqualityCheck(ZVal.getNull(), "===", throwAt)
                                ? ZVal.getNull()
                                : ZVal.isTrue(throwAt) ? 32767 : ZVal.getNull();
        this.scream = scream;
        this.fileLinkFormat = fileLinkFormat;
        this.scope = scope;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Symfony\\Component\\EventDispatcher\\Event",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object configure(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/http-kernel/EventListener")
                        .setFile(
                                "/vendor/symfony/http-kernel/EventListener/DebugHandlersListener.php");
        Object event = assignParameter(args, 0, true);
        if (null == event) {
            event = ZVal.getNull();
        }
        Object output = null;
        Object app = null;
        ReferenceContainer handler = new BasicReferenceContainer(null);
        Object request = null;
        Object log = null;
        ReferenceContainer hasRun = new BasicReferenceContainer(null);
        Object kernel = null;
        ReferenceContainer h = new BasicReferenceContainer(null);
        Object type = null;
        Object levels = null;
        if (ZVal.isTrue(
                !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        event,
                                        KernelEvent.class,
                                        "Symfony\\Component\\HttpKernel\\Event\\KernelEvent"))
                        ? !ZVal.isTrue(this.firstCall)
                        : !ZVal.isTrue(
                                env.callMethod(
                                        event, "isMasterRequest", DebugHandlersListener.class)))) {
            return null;
        }

        this.firstCall = this.hasTerminatedWithException = false;
        handler.setObject(function_set_exception_handler.f.env(env).call("var_dump").value());
        handler.setObject(
                ZVal.assign(
                        function_is_array.f.env(env).call(handler.getObject()).getBool()
                                ? handler.arrayGet(env, 0)
                                : ZVal.getNull()));
        function_restore_exception_handler.f.env(env).call();
        if (ZVal.toBool(this.logger)
                || ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.throwAt))) {
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            handler.getObject(),
                            ErrorHandler.class,
                            "Symfony\\Component\\Debug\\ErrorHandler"))) {
                if (ZVal.isTrue(this.logger)) {
                    env.callMethod(
                            handler.getObject(),
                            "setDefaultLogger",
                            DebugHandlersListener.class,
                            this.logger,
                            this.levels);
                    if (function_is_array.f.env(env).call(this.levels).getBool()) {
                        levels = 0;
                        for (ZPair zpairResult1947 : ZVal.getIterable(this.levels, env, false)) {
                            type = ZVal.assign(zpairResult1947.getKey());
                            log = ZVal.assign(zpairResult1947.getValue());
                            levels = ZAssignment.or("|=", levels, type);
                        }

                    } else {
                        levels = ZVal.assign(this.levels);
                    }

                    if (ZVal.isTrue(this.scream)) {
                        env.callMethod(
                                handler.getObject(),
                                "screamAt",
                                DebugHandlersListener.class,
                                levels);
                    }

                    if (ZVal.isTrue(this.scope)) {
                        env.callMethod(
                                handler.getObject(),
                                "scopeAt",
                                DebugHandlersListener.class,
                                ZVal.toLong(ZVal.toLong(levels) & ZVal.toLong(~ZVal.toLong(16384)))
                                        & ZVal.toLong(~ZVal.toLong(8192)));

                    } else {
                        env.callMethod(
                                handler.getObject(),
                                "scopeAt",
                                DebugHandlersListener.class,
                                0,
                                true);
                    }

                    this.logger = this.levels = ZVal.getNull();
                }

                if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.throwAt)) {
                    env.callMethod(
                            handler.getObject(),
                            "throwAt",
                            DebugHandlersListener.class,
                            this.throwAt,
                            true);
                }
            }
        }

        if (!ZVal.isTrue(this.exceptionHandler)) {
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            event,
                            KernelEvent.class,
                            "Symfony\\Component\\HttpKernel\\Event\\KernelEvent"))) {
                if (function_method_exists
                        .f
                        .env(env)
                        .call(
                                kernel =
                                        env.callMethod(
                                                event, "getKernel", DebugHandlersListener.class),
                                "terminateWithException")
                        .getBool()) {
                    request = env.callMethod(event, "getRequest", DebugHandlersListener.class);
                    hasRun = new ReferenceClassProperty(this, "hasTerminatedWithException", env);
                    this.exceptionHandler =
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "Symfony\\Component\\HttpKernel\\EventListener",
                                    this) {
                                @Override
                                @ConvertedMethod
                                @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    Object e = assignParameter(args, 0, false);
                                    Object request = null;
                                    ReferenceContainer hasRun = new BasicReferenceContainer(null);
                                    Object kernel = null;
                                    request = this.contextReferences.getCapturedValue("request");
                                    hasRun = this.contextReferences.getReferenceContainer("hasRun");
                                    kernel = this.contextReferences.getCapturedValue("kernel");
                                    if (ZVal.isTrue(hasRun.getObject())) {
                                        throw ZVal.getException(env, e);
                                    }

                                    hasRun.setObject(true);
                                    env.callMethod(
                                            kernel,
                                            "terminateWithException",
                                            DebugHandlersListener.class,
                                            e,
                                            request);
                                    return null;
                                }
                            }.useRef("hasRun", hasRun)
                                    .use("request", request)
                                    .use("kernel", kernel);
                }

            } else if (ZVal.toBool(
                            ZVal.checkInstanceType(
                                    event,
                                    ConsoleEvent.class,
                                    "Symfony\\Component\\Console\\Event\\ConsoleEvent"))
                    && ZVal.toBool(
                            app =
                                    env.callMethod(
                                            env.callMethod(
                                                    event,
                                                    "getCommand",
                                                    DebugHandlersListener.class),
                                            "getApplication",
                                            DebugHandlersListener.class))) {
                output = env.callMethod(event, "getOutput", DebugHandlersListener.class);
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                output,
                                ConsoleOutputInterface.class,
                                "Symfony\\Component\\Console\\Output\\ConsoleOutputInterface"))) {
                    output = env.callMethod(output, "getErrorOutput", DebugHandlersListener.class);
                }

                this.exceptionHandler =
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Symfony\\Component\\HttpKernel\\EventListener",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "e")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object e = assignParameter(args, 0, false);
                                Object app = null;
                                Object output = null;
                                app = this.contextReferences.getCapturedValue("app");
                                output = this.contextReferences.getCapturedValue("output");
                                env.callMethod(
                                        app,
                                        "renderException",
                                        DebugHandlersListener.class,
                                        e,
                                        output);
                                return null;
                            }
                        }.use("app", app).use("output", output);
            }
        }

        if (ZVal.isTrue(this.exceptionHandler)) {
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            handler.getObject(),
                            ErrorHandler.class,
                            "Symfony\\Component\\Debug\\ErrorHandler"))) {
                h.setObject(
                        env.callMethod(
                                handler.getObject(),
                                "setExceptionHandler",
                                DebugHandlersListener.class,
                                "var_dump"));
                if (ZVal.toBool(function_is_array.f.env(env).call(h.getObject()).value())
                        && ZVal.toBool(
                                ZVal.checkInstanceType(
                                        h.arrayGet(env, 0),
                                        ExceptionHandler.class,
                                        "Symfony\\Component\\Debug\\ExceptionHandler"))) {
                    env.callMethod(
                            handler.getObject(),
                            "setExceptionHandler",
                            DebugHandlersListener.class,
                            h.getObject());
                    handler.setObject(ZVal.assign(h.arrayGet(env, 0)));

                } else {
                    env.callMethod(
                            handler.getObject(),
                            "setExceptionHandler",
                            DebugHandlersListener.class,
                            this.exceptionHandler);
                }
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            handler.getObject(),
                            ExceptionHandler.class,
                            "Symfony\\Component\\Debug\\ExceptionHandler"))) {
                env.callMethod(
                        handler.getObject(),
                        "setHandler",
                        DebugHandlersListener.class,
                        this.exceptionHandler);
                if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.fileLinkFormat)) {
                    env.callMethod(
                            handler.getObject(),
                            "setFileLinkFormat",
                            DebugHandlersListener.class,
                            this.fileLinkFormat);
                }
            }

            this.exceptionHandler = ZVal.getNull();
        }

        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\EventListener\\DebugHandlersListener";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getSubscribedEvents(RuntimeEnv env, Object... args) {
            ReferenceContainer events = new BasicReferenceContainer(null);
            events.setObject(
                    ZVal.newArray(
                            new ZPair(
                                    KernelEvents.CONST_REQUEST,
                                    ZVal.arrayFromList("configure", 2048))));
            if (ZVal.toBool(ZVal.strictEqualityCheck("cli", "===", "cli"))
                    && ZVal.toBool(
                            function_defined
                                    .f
                                    .env(env)
                                    .call("Symfony\\Component\\Console\\ConsoleEvents::COMMAND")
                                    .value())) {
                events.arrayAccess(env, ConsoleEvents.CONST_COMMAND)
                        .set(ZVal.arrayFromList("configure", 2048));
            }

            return ZVal.assign(events.getObject());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\EventListener\\DebugHandlersListener")
                    .setLookup(
                            DebugHandlersListener.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "exceptionHandler",
                            "fileLinkFormat",
                            "firstCall",
                            "hasTerminatedWithException",
                            "levels",
                            "logger",
                            "scope",
                            "scream",
                            "throwAt")
                    .setFilename(
                            "vendor/symfony/http-kernel/EventListener/DebugHandlersListener.php")
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
