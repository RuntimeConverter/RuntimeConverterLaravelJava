package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Redis.namespaces.Connections.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Redis/Connections/PredisConnection.php

*/

public class PredisConnection
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Redis
                .namespaces
                .Connections
                .classes
                .Connection
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Contracts
                .namespaces
                .Redis
                .classes
                .Connection {

    public PredisConnection(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PredisConnection.class) {
            this.__construct(env, args);
        }
    }

    public PredisConnection(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "client")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object client = assignParameter(args, 0, false);
        toObjectR(this).accessProp(this, env).name("client").set(client);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "channels")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    @ConvertedParameter(index = 2, name = "method")
    public Object createSubscription(RuntimeEnv env, Object... args) {
        Object channels = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        Object method = assignParameter(args, 2, true);
        if (null == method) {
            method = "subscribe";
        }
        Object loop = null;
        Object message = null;
        loop = env.callMethod(this, "pubSubLoop", PredisConnection.class);
        function_call_user_func_array
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                .call(
                        ZVal.newArray(new ZPair(0, loop), new ZPair(1, method)),
                        rToArrayCast(channels));
        for (ZPair zpairResult514 : ZVal.getIterable(loop, env, true)) {
            message = ZVal.assign(zpairResult514.getValue());
            if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    toObjectR(message).accessProp(this, env).name("kind").value(),
                                    "===",
                                    "message"))
                    || ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    toObjectR(message).accessProp(this, env).name("kind").value(),
                                    "===",
                                    "pmessage"))) {
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                callback,
                                toObjectR(message).accessProp(this, env).name("payload").value(),
                                toObjectR(message).accessProp(this, env).name("channel").value());
            }
        }

        loop = null;
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Redis\\Connections\\PredisConnection";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Illuminate
                    .namespaces
                    .Redis
                    .namespaces
                    .Connections
                    .classes
                    .Connection
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Redis\\Connections\\PredisConnection")
                    .setLookup(
                            PredisConnection.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("client")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Redis/Connections/PredisConnection.php")
                    .addInterface("Illuminate\\Contracts\\Redis\\Connection")
                    .addExtendsClass("Illuminate\\Redis\\Connections\\Connection")
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
