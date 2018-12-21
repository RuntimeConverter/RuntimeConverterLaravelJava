package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes.InteractsWithQueue;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.ModelNotFoundException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.functions.class_uses_recursive;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes.FailingJob;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/CallQueuedHandler.php

*/

public class CallQueuedHandler extends RuntimeClassBase {

    public Object dispatcher = null;

    public CallQueuedHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CallQueuedHandler.class) {
            this.__construct(env, args);
        }
    }

    public CallQueuedHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "dispatcher",
        typeHint = "Illuminate\\Contracts\\Bus\\Dispatcher"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object dispatcher = assignParameter(args, 0, false);
        this.dispatcher = dispatcher;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job", typeHint = "Illuminate\\Contracts\\Queue\\Job")
    @ConvertedParameter(index = 1, name = "data", typeHint = "array")
    public Object call(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        ReferenceContainer data = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object e = null;
        Object command = null;
        try {
            command =
                    this.setJobInstanceIfNecessary(
                            env,
                            job,
                            function_unserialize
                                    .f
                                    .env(env)
                                    .call(data.arrayGet(env, "command"))
                                    .value());
        } catch (ConvertedException convertedException49) {
            if (convertedException49.instanceOf(
                    ModelNotFoundException.class,
                    "Illuminate\\Database\\Eloquent\\ModelNotFoundException")) {
                e = convertedException49.getObject();
                return ZVal.assign(this.handleModelNotFound(env, job, e));
            } else {
                throw convertedException49;
            }
        }

        env.callMethod(
                this.dispatcher,
                "dispatchNow",
                CallQueuedHandler.class,
                command,
                this.resolveHandler(env, job, command));
        if (ZVal.toBool(!ZVal.isTrue(env.callMethod(job, "hasFailed", CallQueuedHandler.class)))
                && ZVal.toBool(
                        !ZVal.isTrue(env.callMethod(job, "isReleased", CallQueuedHandler.class)))) {
            this.ensureNextJobInChainIsDispatched(env, command);
        }

        if (!ZVal.isTrue(env.callMethod(job, "isDeletedOrReleased", CallQueuedHandler.class))) {
            env.callMethod(job, "delete", CallQueuedHandler.class);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    @ConvertedParameter(index = 1, name = "command")
    protected Object resolveHandler(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        Object handler = null;
        Object ternaryExpressionTemp = null;
        handler =
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                env.callMethod(
                                                        this.dispatcher,
                                                        "getCommandHandler",
                                                        CallQueuedHandler.class,
                                                        command))
                                ? ternaryExpressionTemp
                                : ZVal.getNull());
        if (ZVal.isTrue(handler)) {
            this.setJobInstanceIfNecessary(env, job, handler);
        }

        return ZVal.assign(handler);
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
            env.callMethod(instance, "setJob", CallQueuedHandler.class, job);
        }

        return ZVal.assign(instance);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    protected Object ensureNextJobInChainIsDispatched(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        if (function_method_exists.f.env(env).call(command, "dispatchNextJobInChain").getBool()) {
            env.callMethod(command, "dispatchNextJobInChain", CallQueuedHandler.class);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job", typeHint = "Illuminate\\Contracts\\Queue\\Job")
    @ConvertedParameter(index = 1, name = "e")
    protected Object handleModelNotFound(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object e = assignParameter(args, 1, false);
        Object shouldDelete = null;
        Object ternaryExpressionTemp = null;
        Object _pClass = null;
        _pClass = env.callMethod(job, "resolveName", CallQueuedHandler.class);
        try {
            shouldDelete =
                    ZVal.assign(
                            ZVal.isDefined(
                                            ternaryExpressionTemp =
                                                    handleReturnReference(
                                                                    env.callMethod(
                                                                            new ReflectionClass(
                                                                                    env, _pClass),
                                                                            "getDefaultProperties",
                                                                            CallQueuedHandler
                                                                                    .class))
                                                            .arrayGet(
                                                                    env, "deleteWhenMissingModels"))
                                    ? ternaryExpressionTemp
                                    : false);
        } catch (ConvertedException convertedException50) {
            if (convertedException50.instanceOf(PHPException.class, "Exception")) {
                e = convertedException50.getObject();
                shouldDelete = false;
            } else {
                throw convertedException50;
            }
        }

        if (ZVal.isTrue(shouldDelete)) {
            return ZVal.assign(env.callMethod(job, "delete", CallQueuedHandler.class));
        }

        return ZVal.assign(
                FailingJob.runtimeStaticObject.handle(
                        env,
                        env.callMethod(job, "getConnectionName", CallQueuedHandler.class),
                        job,
                        e));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    @ConvertedParameter(index = 1, name = "e")
    public Object failed(RuntimeEnv env, Object... args) {
        ReferenceContainer data = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object e = assignParameter(args, 1, false);
        Object command = null;
        command = function_unserialize.f.env(env).call(data.arrayGet(env, "command")).value();
        if (function_method_exists.f.env(env).call(command, "failed").getBool()) {
            env.callMethod(command, "failed", CallQueuedHandler.class, e);
        }

        return null;
    }

    public static final Object CONST_class = "Illuminate\\Queue\\CallQueuedHandler";

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
                    .setName("Illuminate\\Queue\\CallQueuedHandler")
                    .setLookup(
                            CallQueuedHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("dispatcher")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Queue/CallQueuedHandler.php")
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
