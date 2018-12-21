package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Bus.classes;

import com.project.convertedCode.globalNamespace.functions.app;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Bus.classes.Dispatcher;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Bus/PendingDispatch.php

*/

public class PendingDispatch extends RuntimeClassBase {

    public Object job = null;

    public PendingDispatch(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PendingDispatch.class) {
            this.__construct(env, args);
        }
    }

    public PendingDispatch(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        this.job = job;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    public Object onConnection(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        env.callMethod(this.job, "onConnection", PendingDispatch.class, connection);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    public Object onQueue(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        env.callMethod(this.job, "onQueue", PendingDispatch.class, queue);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    public Object allOnConnection(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        env.callMethod(this.job, "allOnConnection", PendingDispatch.class, connection);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    public Object allOnQueue(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        env.callMethod(this.job, "allOnQueue", PendingDispatch.class, queue);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay")
    public Object delay(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, false);
        env.callMethod(this.job, "delay", PendingDispatch.class, delay);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "chain")
    public Object chain(RuntimeEnv env, Object... args) {
        Object chain = assignParameter(args, 0, false);
        env.callMethod(this.job, "chain", PendingDispatch.class, chain);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        env.callMethod(
                app.f.env(env).call(Dispatcher.CONST_class).value(),
                "dispatch",
                PendingDispatch.class,
                this.job);
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Bus\\PendingDispatch";

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
                    .setName("Illuminate\\Foundation\\Bus\\PendingDispatch")
                    .setLookup(
                            PendingDispatch.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("job")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Bus/PendingDispatch.php")
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
