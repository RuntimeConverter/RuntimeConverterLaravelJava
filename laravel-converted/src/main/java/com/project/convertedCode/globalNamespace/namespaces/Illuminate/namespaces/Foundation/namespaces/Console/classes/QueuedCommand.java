package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.functions.dispatch;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Bus.classes.Dispatcher;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.functions.app;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Bus.classes.PendingDispatch;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes.ShouldQueue;
import com.project.convertedCode.globalNamespace.functions.collect;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Bus.classes.PendingChain;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Console/QueuedCommand.php

*/

public class QueuedCommand extends RuntimeClassBase implements ShouldQueue {

    public Object data = null;

    public Object connection = null;

    public Object queue = null;

    public Object chainConnection = null;

    public Object chainQueue = null;

    public Object delay = null;

    public Object chained = ZVal.newArray();

    public QueuedCommand(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == QueuedCommand.class) {
            this.__construct(env, args);
        }
    }

    public QueuedCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        this.data = data;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "kernel",
        typeHint = "Illuminate\\Contracts\\Console\\Kernel"
    )
    public Object handle(RuntimeEnv env, Object... args) {
        Object kernel = assignParameter(args, 0, false);
        function_call_user_func_array
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                .call(ZVal.newArray(new ZPair(0, kernel), new ZPair(1, "call")), this.data);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    public Object onConnection(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        this.connection = connection;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    public Object onQueue(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        this.queue = queue;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    public Object allOnConnection(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        this.chainConnection = connection;
        this.connection = connection;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    public Object allOnQueue(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        this.chainQueue = queue;
        this.queue = queue;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay")
    public Object delay(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, false);
        this.delay = delay;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "chain")
    public Object chain(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Bus")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Bus/Queueable.php");
        Object chain = assignParameter(args, 0, false);
        this.chained =
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(chain).value(),
                                "map",
                                QueuedCommand.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Bus",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "job")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object job = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                function_serialize.f.env(env).call(job).value());
                                    }
                                }),
                        "all",
                        QueuedCommand.class);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object dispatchNextJobInChain(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Bus")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Bus/Queueable.php");
        if (!ZVal.isEmpty(this.chained)) {
            dispatch.f
                    .env(env)
                    .call(
                            tap.f
                                    .env(env)
                                    .call(
                                            function_unserialize
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            function_array_shift
                                                                    .f
                                                                    .env(env)
                                                                    .call(this.chained)
                                                                    .value())
                                                    .value(),
                                            new Closure(
                                                    env,
                                                    runtimeConverterFunctionClassConstants,
                                                    "Illuminate\\Bus",
                                                    this) {
                                                @Override
                                                @ConvertedMethod
                                                @ConvertedParameter(index = 0, name = "next")
                                                public Object run(
                                                        RuntimeEnv env,
                                                        Object thisvar,
                                                        PassByReferenceArgs
                                                                runtimePassByReferenceArgs,
                                                        Object... args) {
                                                    Object _closureThisVar =
                                                            this.getClosureThisVar();
                                                    Object next = assignParameter(args, 0, false);
                                                    Object ternaryExpressionTemp = null;
                                                    toObjectR(next)
                                                            .accessProp(this, env)
                                                            .name("chained")
                                                            .set(QueuedCommand.this.chained);
                                                    env.callMethod(
                                                            next,
                                                            "onConnection",
                                                            QueuedCommand.class,
                                                            ZVal.isTrue(
                                                                            ternaryExpressionTemp =
                                                                                    toObjectR(next)
                                                                                            .accessProp(
                                                                                                    this,
                                                                                                    env)
                                                                                            .name(
                                                                                                    "connection")
                                                                                            .value())
                                                                    ? ternaryExpressionTemp
                                                                    : QueuedCommand.this
                                                                            .chainConnection);
                                                    env.callMethod(
                                                            next,
                                                            "onQueue",
                                                            QueuedCommand.class,
                                                            ZVal.isTrue(
                                                                            ternaryExpressionTemp =
                                                                                    toObjectR(next)
                                                                                            .accessProp(
                                                                                                    this,
                                                                                                    env)
                                                                                            .name(
                                                                                                    "queue")
                                                                                            .value())
                                                                    ? ternaryExpressionTemp
                                                                    : QueuedCommand.this
                                                                            .chainQueue);
                                                    toObjectR(next)
                                                            .accessProp(this, env)
                                                            .name("chainConnection")
                                                            .set(
                                                                    QueuedCommand.this
                                                                            .chainConnection);
                                                    toObjectR(next)
                                                            .accessProp(this, env)
                                                            .name("chainQueue")
                                                            .set(QueuedCommand.this.chainQueue);
                                                    return null;
                                                }
                                            })
                                    .value());
        }

        return null;
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Console\\QueuedCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object dispatch(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    new PendingDispatch(
                            env,
                            env.createNewWithLateStaticBindings(
                                    this,
                                    PackedVaradicArgs.unpack(
                                            new PackedVaradicArgs(
                                                    function_func_get_args
                                                            .f
                                                            .env(env)
                                                            .addReferenceArgs(
                                                                    new RuntimeArgsWithInfo(
                                                                            args, this))
                                                            .call()
                                                            .value())))));
        }

        @ConvertedMethod
        public Object dispatchNow(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.callMethod(
                            app.f.env(env).call(Dispatcher.CONST_class).value(),
                            "dispatchNow",
                            QueuedCommand.class,
                            env.createNewWithLateStaticBindings(
                                    this,
                                    PackedVaradicArgs.unpack(
                                            new PackedVaradicArgs(
                                                    function_func_get_args
                                                            .f
                                                            .env(env)
                                                            .addReferenceArgs(
                                                                    new RuntimeArgsWithInfo(
                                                                            args, this))
                                                            .call()
                                                            .value())))));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "chain")
        public Object withChain(RuntimeEnv env, Object... args) {
            Object chain = assignParameter(args, 0, false);
            return ZVal.assign(
                    new PendingChain(
                            env, NamespaceGlobal.get_called_class.env(env).call().value(), chain));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Console\\QueuedCommand")
                    .setLookup(
                            QueuedCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "chainConnection",
                            "chainQueue",
                            "chained",
                            "connection",
                            "data",
                            "delay",
                            "queue")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/QueuedCommand.php")
                    .addInterface("Illuminate\\Contracts\\Queue\\ShouldQueue")
                    .addTrait("Illuminate\\Foundation\\Bus\\Dispatchable")
                    .addTrait("Illuminate\\Bus\\Queueable")
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
