package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Bus.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Bus.classes.QueueingDispatcher;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes.Queue;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Pipeline.classes.Pipeline;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes.ShouldQueue;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Bus/Dispatcher.php

*/

public class Dispatcher extends RuntimeClassBase implements QueueingDispatcher {

    public Object container = null;

    public Object pipeline = null;

    public Object pipes = ZVal.newArray();

    public Object handlers = ZVal.newArray();

    public Object queueResolver = null;

    public Dispatcher(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Dispatcher.class) {
            this.__construct(env, args);
        }
    }

    public Dispatcher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Contracts\\Container\\Container"
    )
    @ConvertedParameter(
        index = 1,
        name = "queueResolver",
        typeHint = "Closure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        Object queueResolver = assignParameter(args, 1, true);
        if (null == queueResolver) {
            queueResolver = ZVal.getNull();
        }
        this.container = container;
        this.queueResolver = queueResolver;
        this.pipeline = new Pipeline(env, container);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    public Object dispatch(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        if (ZVal.toBool(this.queueResolver)
                && ZVal.toBool(this.commandShouldBeQueued(env, command))) {
            return ZVal.assign(this.dispatchToQueue(env, command));
        }

        return ZVal.assign(this.dispatchNow(env, command));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    @ConvertedParameter(
        index = 1,
        name = "handler",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object dispatchNow(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Bus")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Bus/Dispatcher.php");
        Object command = assignParameter(args, 0, false);
        Object handler = assignParameter(args, 1, true);
        if (null == handler) {
            handler = ZVal.getNull();
        }
        Object callback = null;
        if (ZVal.toBool(handler) || ZVal.toBool(handler = this.getCommandHandler(env, command))) {
            callback =
                    new Closure(
                            env, runtimeConverterFunctionClassConstants, "Illuminate\\Bus", this) {
                        @Override
                        @ConvertedMethod
                        @ConvertedParameter(index = 0, name = "command")
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            Object command = assignParameter(args, 0, false);
                            Object handler = null;
                            handler = this.contextReferences.getCapturedValue("handler");
                            return ZVal.assign(
                                    env.callMethod(handler, "handle", Dispatcher.class, command));
                        }
                    }.use("handler", handler);

        } else {
            callback =
                    new Closure(
                            env, runtimeConverterFunctionClassConstants, "Illuminate\\Bus", this) {
                        @Override
                        @ConvertedMethod
                        @ConvertedParameter(index = 0, name = "command")
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            Object _closureThisVar = this.getClosureThisVar();
                            Object command = assignParameter(args, 0, false);
                            return ZVal.assign(
                                    env.callMethod(
                                            Dispatcher.this.container,
                                            "call",
                                            Dispatcher.class,
                                            ZVal.newArray(
                                                    new ZPair(0, command),
                                                    new ZPair(1, "handle"))));
                        }
                    };
        }

        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(this.pipeline, "send", Dispatcher.class, command),
                                "through",
                                Dispatcher.class,
                                this.pipes),
                        "then",
                        Dispatcher.class,
                        callback));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    public Object hasCommandHandler(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_key_exists
                        .f
                        .env(env)
                        .call(function_get_class.f.env(env).call(command).value(), this.handlers)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    public Object getCommandHandler(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.hasCommandHandler(env, command))) {
            return ZVal.assign(
                    env.callMethod(
                            this.container,
                            "make",
                            Dispatcher.class,
                            new ReferenceClassProperty(this, "handlers", env)
                                    .arrayGet(
                                            env,
                                            function_get_class.f.env(env).call(command).value())));
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    protected Object commandShouldBeQueued(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.checkInstanceType(
                        command, ShouldQueue.class, "Illuminate\\Contracts\\Queue\\ShouldQueue"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    public Object dispatchToQueue(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        Object connection = null;
        Object ternaryExpressionTemp = null;
        Object queue = null;
        connection =
                ZVal.assign(
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                toObjectR(command)
                                                        .accessProp(this, env)
                                                        .name("connection")
                                                        .value())
                                ? ternaryExpressionTemp
                                : ZVal.getNull());
        queue =
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(this.queueResolver, connection)
                        .value();
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        queue, Queue.class, "Illuminate\\Contracts\\Queue\\Queue"))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env, "Queue resolver did not return a Queue implementation."));
        }

        if (function_method_exists.f.env(env).call(command, "queue").getBool()) {
            return ZVal.assign(env.callMethod(command, "queue", Dispatcher.class, queue, command));
        }

        return ZVal.assign(this.pushCommandToQueue(env, queue, command));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    @ConvertedParameter(index = 1, name = "command")
    protected Object pushCommandToQueue(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        if (ZVal.toBool(ZVal.isset(toObjectR(command).accessProp(this, env).name("queue").value()))
                && ZVal.toBool(
                        ZVal.isset(
                                toObjectR(command).accessProp(this, env).name("delay").value()))) {
            return ZVal.assign(
                    env.callMethod(
                            queue,
                            "laterOn",
                            Dispatcher.class,
                            toObjectR(command).accessProp(this, env).name("queue").value(),
                            toObjectR(command).accessProp(this, env).name("delay").value(),
                            command));
        }

        if (ZVal.isset(toObjectR(command).accessProp(this, env).name("queue").value())) {
            return ZVal.assign(
                    env.callMethod(
                            queue,
                            "pushOn",
                            Dispatcher.class,
                            toObjectR(command).accessProp(this, env).name("queue").value(),
                            command));
        }

        if (ZVal.isset(toObjectR(command).accessProp(this, env).name("delay").value())) {
            return ZVal.assign(
                    env.callMethod(
                            queue,
                            "later",
                            Dispatcher.class,
                            toObjectR(command).accessProp(this, env).name("delay").value(),
                            command));
        }

        return ZVal.assign(env.callMethod(queue, "push", Dispatcher.class, command));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pipes", typeHint = "array")
    public Object pipeThrough(RuntimeEnv env, Object... args) {
        Object pipes = assignParameter(args, 0, false);
        this.pipes = pipes;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "map", typeHint = "array")
    public Object map(RuntimeEnv env, Object... args) {
        Object map = assignParameter(args, 0, false);
        this.handlers = function_array_merge.f.env(env).call(this.handlers, map).value();
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Illuminate\\Bus\\Dispatcher";

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
                    .setName("Illuminate\\Bus\\Dispatcher")
                    .setLookup(
                            Dispatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "container", "handlers", "pipeline", "pipes", "queueResolver")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Bus/Dispatcher.php")
                    .addInterface("Illuminate\\Contracts\\Bus\\QueueingDispatcher")
                    .addInterface("Illuminate\\Contracts\\Bus\\Dispatcher")
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
