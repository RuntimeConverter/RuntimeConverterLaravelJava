package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Messages.classes;

import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.functions.dispatch;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Notifications/Messages/BroadcastMessage.php

*/

public class BroadcastMessage extends RuntimeClassBase {

    public Object data = null;

    public Object connection = null;

    public Object queue = null;

    public Object chainConnection = null;

    public Object chainQueue = null;

    public Object delay = null;

    public Object chained = ZVal.newArray();

    public BroadcastMessage(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == BroadcastMessage.class) {
            this.__construct(env, args);
        }
    }

    public BroadcastMessage(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        this.data = data;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    public Object data(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        this.data = data;
        return ZVal.assign(this);
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
                                BroadcastMessage.class,
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
                        BroadcastMessage.class);
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
                                                            .set(BroadcastMessage.this.chained);
                                                    env.callMethod(
                                                            next,
                                                            "onConnection",
                                                            BroadcastMessage.class,
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
                                                                    : BroadcastMessage.this
                                                                            .chainConnection);
                                                    env.callMethod(
                                                            next,
                                                            "onQueue",
                                                            BroadcastMessage.class,
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
                                                                    : BroadcastMessage.this
                                                                            .chainQueue);
                                                    toObjectR(next)
                                                            .accessProp(this, env)
                                                            .name("chainConnection")
                                                            .set(
                                                                    BroadcastMessage.this
                                                                            .chainConnection);
                                                    toObjectR(next)
                                                            .accessProp(this, env)
                                                            .name("chainQueue")
                                                            .set(BroadcastMessage.this.chainQueue);
                                                    return null;
                                                }
                                            })
                                    .value());
        }

        return null;
    }

    public static final Object CONST_class =
            "Illuminate\\Notifications\\Messages\\BroadcastMessage";

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
                    .setName("Illuminate\\Notifications\\Messages\\BroadcastMessage")
                    .setLookup(
                            BroadcastMessage.class,
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
                            "vendor/laravel/framework/src/Illuminate/Notifications/Messages/BroadcastMessage.php")
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
