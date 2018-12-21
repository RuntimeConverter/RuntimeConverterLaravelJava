package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.namespaces.Scheduling.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_register_shutdown_function;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.namespaces.Scheduling.classes.Event;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Console/Scheduling/CallbackEvent.php

*/

public class CallbackEvent extends Event {

    public Object callback = null;

    public Object parameters = null;

    public CallbackEvent(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CallbackEvent.class) {
            this.__construct(env, args);
        }
    }

    public CallbackEvent(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "mutex",
        typeHint = "Illuminate\\Console\\Scheduling\\EventMutex"
    )
    @ConvertedParameter(index = 1, name = "callback")
    @ConvertedParameter(
        index = 2,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object mutex = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        Object parameters = assignParameter(args, 2, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        if (ZVal.toBool(!function_is_string.f.env(env).call(callback).getBool())
                && ZVal.toBool(!function_is_callable.f.env(env).call(callback).getBool())) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Invalid scheduled callback event. Must be a string or callable."));
        }

        toObjectR(this).accessProp(this, env).name("mutex").set(mutex);
        this.callback = callback;
        this.parameters = parameters;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Contracts\\Container\\Container"
    )
    public Object run(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Console/Scheduling")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Console/Scheduling/CallbackEvent.php");
        Object container = assignParameter(args, 0, false);
        Object response = null;
        Object pid = null;
        if (ZVal.toBool(
                        ZVal.toBool(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("description")
                                                .value())
                                && ZVal.toBool(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("withoutOverlapping")
                                                .value()))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("mutex").value(),
                                        "create",
                                        CallbackEvent.class,
                                        this)))) {
            return null;
        }

        pid = NamespaceGlobal.getmypid.env(env).call().value();
        function_register_shutdown_function
                .f
                .env(env)
                .call(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Console\\Scheduling",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object pid = null;
                                pid = this.contextReferences.getCapturedValue("pid");
                                if (ZVal.strictEqualityCheck(
                                        pid,
                                        "===",
                                        NamespaceGlobal.getmypid.env(env).call().value())) {
                                    CallbackEvent.this.removeMutex(env);
                                }

                                return null;
                            }
                        }.use("pid", pid));
        super.callBeforeCallbacks(env, container);
        try {
            response =
                    env.callMethod(
                            container, "call", CallbackEvent.class, this.callback, this.parameters);
        } catch (ConvertedException convertedException16) {

            throw convertedException16;
        } finally {
            this.removeMutex(env);
            super.callAfterCallbacks(env, container);
        }

        return ZVal.assign(response);
    }

    @ConvertedMethod
    protected Object removeMutex(RuntimeEnv env, Object... args) {
        if (toObjectR(this).accessProp(this, env).name("description").getBool()) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("mutex").value(),
                    "forget",
                    CallbackEvent.class,
                    this);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "expiresAt",
        defaultValue = "1440",
        defaultValueType = "number"
    )
    public Object withoutOverlapping(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Console/Scheduling")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Console/Scheduling/CallbackEvent.php");
        Object expiresAt = assignParameter(args, 0, true);
        if (null == expiresAt) {
            expiresAt = 1440;
        }
        if (!ZVal.isset(toObjectR(this).accessProp(this, env).name("description").value())) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            "A scheduled event name is required to prevent overlapping. Use the 'name' method before 'withoutOverlapping'."));
        }

        toObjectR(this).accessProp(this, env).name("withoutOverlapping").set(true);
        toObjectR(this).accessProp(this, env).name("expiresAt").set(expiresAt);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "skip",
                        CallbackEvent.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Console\\Scheduling",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                return ZVal.assign(
                                        env.callMethod(
                                                toObjectR(_closureThisVar)
                                                        .accessProp(this, env)
                                                        .name("mutex")
                                                        .value(),
                                                "exists",
                                                CallbackEvent.class,
                                                _closureThisVar));
                            }
                        }));
    }

    @ConvertedMethod
    public Object onOneServer(RuntimeEnv env, Object... args) {
        if (!ZVal.isset(toObjectR(this).accessProp(this, env).name("description").value())) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            "A scheduled event name is required to only run on one server. Use the 'name' method before 'onOneServer'."));
        }

        toObjectR(this).accessProp(this, env).name("onOneServer").set(true);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object mutexName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                "framework/schedule-"
                        + toStringR(
                                NamespaceGlobal.sha1
                                        .env(env)
                                        .call(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("description")
                                                        .value())
                                        .value(),
                                env));
    }

    @ConvertedMethod
    public Object getSummaryForDisplay(RuntimeEnv env, Object... args) {
        if (function_is_string
                .f
                .env(env)
                .call(toObjectR(this).accessProp(this, env).name("description").value())
                .getBool()) {
            return ZVal.assign(toObjectR(this).accessProp(this, env).name("description").value());
        }

        return ZVal.assign(
                function_is_string.f.env(env).call(this.callback).getBool()
                        ? this.callback
                        : "Closure");
    }

    public static final Object CONST_class = "Illuminate\\Console\\Scheduling\\CallbackEvent";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Event.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Console\\Scheduling\\CallbackEvent")
                    .setLookup(
                            CallbackEvent.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "afterCallbacks",
                            "beforeCallbacks",
                            "callback",
                            "command",
                            "description",
                            "environments",
                            "evenInMaintenanceMode",
                            "expiresAt",
                            "expression",
                            "filters",
                            "mutex",
                            "onOneServer",
                            "output",
                            "parameters",
                            "rejects",
                            "runInBackground",
                            "shouldAppendOutput",
                            "timezone",
                            "user",
                            "withoutOverlapping")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Console/Scheduling/CallbackEvent.php")
                    .addExtendsClass("Illuminate\\Console\\Scheduling\\Event")
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
