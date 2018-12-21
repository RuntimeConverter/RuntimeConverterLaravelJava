package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.namespaces.Scheduling.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.functions.dispatch;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.functions.resolve;
import com.project.convertedCode.globalNamespace.functions.dispatch_now;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.namespaces.Scheduling.classes.CallbackEvent;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.namespaces.Scheduling.classes.CacheEventMutex;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Container.classes.Container;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.namespaces.Scheduling.classes.SchedulingMutex;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.namespaces.Scheduling.classes.EventMutex;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.namespaces.Scheduling.classes.CacheSchedulingMutex;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ProcessUtils;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.namespaces.Scheduling.classes.Event;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Application;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes.ShouldQueue;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Console/Scheduling/Schedule.php

*/

public class Schedule extends RuntimeClassBase {

    public Object events = ZVal.newArray();

    public Object eventMutex = null;

    public Object schedulingMutex = null;

    public Schedule(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Schedule.class) {
            this.__construct(env, args);
        }
    }

    public Schedule(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        Object container = null;
        container = Container.runtimeStaticObject.getInstance(env);
        this.eventMutex =
                ZVal.isTrue(
                                env.callMethod(
                                        container, "bound", Schedule.class, EventMutex.CONST_class))
                        ? env.callMethod(container, "make", Schedule.class, EventMutex.CONST_class)
                        : env.callMethod(
                                container, "make", Schedule.class, CacheEventMutex.CONST_class);
        this.schedulingMutex =
                ZVal.isTrue(
                                env.callMethod(
                                        container,
                                        "bound",
                                        Schedule.class,
                                        SchedulingMutex.CONST_class))
                        ? env.callMethod(
                                container, "make", Schedule.class, SchedulingMutex.CONST_class)
                        : env.callMethod(
                                container,
                                "make",
                                Schedule.class,
                                CacheSchedulingMutex.CONST_class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        Object event = null;
        new ReferenceClassProperty(this, "events", env)
                .arrayAppend(env)
                .set(event = new CallbackEvent(env, this.eventMutex, callback, parameters));
        return ZVal.assign(event);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object command(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        if (function_class_exists.f.env(env).call(command).getBool()) {
            command =
                    env.callMethod(
                            env.callMethod(
                                    Container.runtimeStaticObject.getInstance(env),
                                    "make",
                                    Schedule.class,
                                    command),
                            "getName",
                            Schedule.class);
        }

        return ZVal.assign(
                this.exec(
                        env,
                        Application.runtimeStaticObject.formatCommandString(env, command),
                        parameters));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    @ConvertedParameter(
        index = 1,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object job(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Console/Scheduling")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Console/Scheduling/Schedule.php");
        Object job = assignParameter(args, 0, false);
        Object queue = assignParameter(args, 1, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        this.call(
                                env,
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
                                        Object job = null;
                                        Object queue = null;
                                        job = this.contextReferences.getCapturedValue("job");
                                        queue = this.contextReferences.getCapturedValue("queue");
                                        job =
                                                ZVal.assign(
                                                        function_is_string
                                                                        .f
                                                                        .env(env)
                                                                        .call(job)
                                                                        .getBool()
                                                                ? resolve.f
                                                                        .env(env)
                                                                        .call(job)
                                                                        .value()
                                                                : job);
                                        if (ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        job,
                                                        ShouldQueue.class,
                                                        "Illuminate\\Contracts\\Queue\\ShouldQueue"))) {
                                            env.callMethod(
                                                    dispatch.f.env(env).call(job).value(),
                                                    "onQueue",
                                                    Schedule.class,
                                                    queue);

                                        } else {
                                            dispatch_now.f.env(env).call(job);
                                        }

                                        return null;
                                    }
                                }.use("job", job).use("queue", queue)),
                        "name",
                        Schedule.class,
                        function_is_string.f.env(env).call(job).getBool()
                                ? job
                                : function_get_class.f.env(env).call(job).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object exec(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        Object event = null;
        if (function_count.f.env(env).call(parameters).getBool()) {
            command =
                    toStringR(command, env)
                            + " "
                            + toStringR(this.compileParameters(env, parameters), env);
        }

        new ReferenceClassProperty(this, "events", env)
                .arrayAppend(env)
                .set(event = new Event(env, this.eventMutex, command));
        return ZVal.assign(event);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters", typeHint = "array")
    protected Object compileParameters(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Console/Scheduling")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Console/Scheduling/Schedule.php");
        Object parameters = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(parameters).value(),
                                "map",
                                Schedule.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Console\\Scheduling",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "value")
                                    @ConvertedParameter(index = 1, name = "key")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        ContextConstants runtimeConverterFunctionClassConstants =
                                                new ContextConstants()
                                                        .setDir(
                                                                "/vendor/laravel/framework/src/Illuminate/Console/Scheduling")
                                                        .setFile(
                                                                "/vendor/laravel/framework/src/Illuminate/Console/Scheduling/Schedule.php");
                                        Object value = assignParameter(args, 0, false);
                                        Object key = assignParameter(args, 1, false);
                                        if (function_is_array.f.env(env).call(value).getBool()) {
                                            value =
                                                    env.callMethod(
                                                            env.callMethod(
                                                                    collect.f
                                                                            .env(env)
                                                                            .call(value)
                                                                            .value(),
                                                                    "map",
                                                                    Schedule.class,
                                                                    new Closure(
                                                                            env,
                                                                            runtimeConverterFunctionClassConstants,
                                                                            "Illuminate\\Console\\Scheduling",
                                                                            this) {
                                                                        @Override
                                                                        @ConvertedMethod
                                                                        @ConvertedParameter(
                                                                            index = 0,
                                                                            name = "value"
                                                                        )
                                                                        public Object run(
                                                                                RuntimeEnv env,
                                                                                Object thisvar,
                                                                                PassByReferenceArgs
                                                                                        runtimePassByReferenceArgs,
                                                                                Object... args) {
                                                                            Object value =
                                                                                    assignParameter(
                                                                                            args, 0,
                                                                                            false);
                                                                            return ZVal.assign(
                                                                                    ProcessUtils
                                                                                            .runtimeStaticObject
                                                                                            .escapeArgument(
                                                                                                    env,
                                                                                                    value));
                                                                        }
                                                                    }),
                                                            "implode",
                                                            Schedule.class,
                                                            " ");

                                        } else if (ZVal.toBool(
                                                        !function_is_numeric
                                                                .f
                                                                .env(env)
                                                                .call(value)
                                                                .getBool())
                                                && ZVal.toBool(
                                                        !function_preg_match
                                                                .f
                                                                .env(env)
                                                                .call("/^(-.$|--.*)/i", value)
                                                                .getBool())) {
                                            value =
                                                    ProcessUtils.runtimeStaticObject.escapeArgument(
                                                            env, value);
                                        }

                                        return ZVal.assign(
                                                function_is_numeric.f.env(env).call(key).getBool()
                                                        ? value
                                                        : toStringR(key, env)
                                                                + "="
                                                                + toStringR(value, env));
                                    }
                                }),
                        "implode",
                        Schedule.class,
                        " "));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Illuminate\\Console\\Scheduling\\Event"
    )
    @ConvertedParameter(index = 1, name = "time", typeHint = "DateTimeInterface")
    public Object serverShouldRun(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object time = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(this.schedulingMutex, "create", Schedule.class, event, time));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "app")
    public Object dueEvents(RuntimeEnv env, Object... args) {
        Object app = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        collect.f
                                .env(env)
                                .call(this.events)
                                .getObject()
                                .accessProp(this, env)
                                .name("filter")
                                .value(),
                        "isDue",
                        Schedule.class,
                        app));
    }

    @ConvertedMethod
    public Object events(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.events);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "store")
    public Object useCache(RuntimeEnv env, Object... args) {
        Object store = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.eventMutex,
                        CacheEventMutex.class,
                        "Illuminate\\Console\\Scheduling\\CacheEventMutex"))) {
            env.callMethod(this.eventMutex, "useStore", Schedule.class, store);
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.schedulingMutex,
                        CacheSchedulingMutex.class,
                        "Illuminate\\Console\\Scheduling\\CacheSchedulingMutex"))) {
            env.callMethod(this.schedulingMutex, "useStore", Schedule.class, store);
        }

        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Illuminate\\Console\\Scheduling\\Schedule";

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
                    .setName("Illuminate\\Console\\Scheduling\\Schedule")
                    .setLookup(
                            Schedule.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("eventMutex", "events", "schedulingMutex")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Console/Scheduling/Schedule.php")
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
