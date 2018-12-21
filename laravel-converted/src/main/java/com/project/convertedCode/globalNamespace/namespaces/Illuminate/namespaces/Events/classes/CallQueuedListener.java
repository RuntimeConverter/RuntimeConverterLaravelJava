package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Events.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes.InteractsWithQueue;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Container.classes.Container;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes.FailingJob;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.functions.class_uses_recursive;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes.ShouldQueue;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Events/CallQueuedListener.php

*/

public class CallQueuedListener extends RuntimeClassBase implements ShouldQueue {

    public Object _pClass = null;

    public Object method = null;

    public Object data = null;

    public Object tries = null;

    public Object timeoutAt = null;

    public Object timeout = null;

    public Object job = null;

    public CallQueuedListener(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CallQueuedListener.class) {
            this.__construct(env, args);
        }
    }

    public CallQueuedListener(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "method")
    @ConvertedParameter(index = 2, name = "data")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object method = assignParameter(args, 1, false);
        Object data = assignParameter(args, 2, false);
        this.data = data;
        this._pClass = _pClass;
        this.method = method;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Container\\Container"
    )
    public Object handle(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        Object handler = null;
        this.prepareData(env);
        handler =
                this.setJobInstanceIfNecessary(
                        env,
                        this.job,
                        env.callMethod(container, "make", CallQueuedListener.class, this._pClass));
        function_call_user_func_array
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                .call(ZVal.newArray(new ZPair(0, handler), new ZPair(1, this.method)), this.data);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job", typeHint = "Illuminate\\Contracts\\Queue\\Job")
    @ConvertedParameter(index = 1, name = "instance")
    protected Object setJobInstanceIfNecessary(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object instance = assignParameter(args, 1, false);
        if (function_in_array
                .f
                .env(env)
                .call(
                        InteractsWithQueue.CONST_class,
                        class_uses_recursive
                                .f
                                .env(env)
                                .call(function_get_class.f.env(env).call(instance).value())
                                .value())
                .getBool()) {
            env.callMethod(instance, "setJob", CallQueuedListener.class, job);
        }

        return ZVal.assign(instance);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e")
    public Object failed(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object handler = null;
        Object parameters = null;
        this.prepareData(env);
        handler =
                env.callMethod(
                        Container.runtimeStaticObject.getInstance(env),
                        "make",
                        CallQueuedListener.class,
                        this._pClass);
        parameters =
                function_array_merge
                        .f
                        .env(env)
                        .call(this.data, ZVal.newArray(new ZPair(0, e)))
                        .value();
        if (function_method_exists.f.env(env).call(handler, "failed").getBool()) {
            function_call_user_func_array
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                    .call(ZVal.newArray(new ZPair(0, handler), new ZPair(1, "failed")), parameters);
        }

        return null;
    }

    @ConvertedMethod
    protected Object prepareData(RuntimeEnv env, Object... args) {
        if (function_is_string.f.env(env).call(this.data).getBool()) {
            this.data = function_unserialize.f.env(env).call(this.data).value();
        }

        return null;
    }

    @ConvertedMethod
    public Object displayName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._pClass);
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Events")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Events/CallQueuedListener.php");
        this.data =
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Events",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "data")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object data = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                function_is_object.f.env(env).call(data).getBool()
                                                        ? ((RuntimeClassInterface) data)
                                                                .phpClone(env)
                                                        : data);
                                    }
                                },
                                this.data)
                        .value();
        return null;
    }

    @ConvertedMethod
    public Object attempts(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isTrue(this.job)
                        ? env.callMethod(this.job, "attempts", CallQueuedListener.class)
                        : 1);
    }

    @ConvertedMethod
    public Object delete(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.job)) {
            return ZVal.assign(env.callMethod(this.job, "delete", CallQueuedListener.class));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "exception",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object fail(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, true);
        if (null == exception) {
            exception = ZVal.getNull();
        }
        if (ZVal.isTrue(this.job)) {
            FailingJob.runtimeStaticObject.handle(
                    env,
                    env.callMethod(this.job, "getConnectionName", CallQueuedListener.class),
                    this.job,
                    exception);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay", defaultValue = "0", defaultValueType = "number")
    public Object release(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, true);
        if (null == delay) {
            delay = 0;
        }
        if (ZVal.isTrue(this.job)) {
            return ZVal.assign(
                    env.callMethod(this.job, "release", CallQueuedListener.class, delay));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job", typeHint = "Illuminate\\Contracts\\Queue\\Job")
    public Object setJob(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        this.job = job;
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Illuminate\\Events\\CallQueuedListener";

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
                    .setName("Illuminate\\Events\\CallQueuedListener")
                    .setLookup(
                            CallQueuedListener.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "class", "data", "job", "method", "timeout", "timeoutAt", "tries")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Events/CallQueuedListener.php")
                    .addInterface("Illuminate\\Contracts\\Queue\\ShouldQueue")
                    .addTrait("Illuminate\\Queue\\InteractsWithQueue")
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
