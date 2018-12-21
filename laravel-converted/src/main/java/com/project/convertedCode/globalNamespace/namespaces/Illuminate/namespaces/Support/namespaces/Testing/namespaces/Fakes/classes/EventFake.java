package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Testing.namespaces.Fakes.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Events.classes.Dispatcher;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Assert;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/EventFake.php

*/

public class EventFake extends RuntimeClassBase implements Dispatcher {

    public Object dispatcher = null;

    public Object eventsToFake = null;

    public Object events = ZVal.newArray();

    public EventFake(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == EventFake.class) {
            this.__construct(env, args);
        }
    }

    public EventFake(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "dispatcher",
        typeHint = "Illuminate\\Contracts\\Events\\Dispatcher"
    )
    @ConvertedParameter(
        index = 1,
        name = "eventsToFake",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object dispatcher = assignParameter(args, 0, false);
        Object eventsToFake = assignParameter(args, 1, true);
        if (null == eventsToFake) {
            eventsToFake = ZVal.newArray();
        }
        this.dispatcher = dispatcher;
        this.eventsToFake = Arr.runtimeStaticObject.wrap(env, eventsToFake);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertDispatched(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        if (function_is_int.f.env(env).call(callback).getBool()) {
            return ZVal.assign(this.assertDispatchedTimes(env, event, callback));
        }

        Assert.runtimeStaticObject.assertTrue(
                env,
                ZVal.isGreaterThan(
                        env.callMethod(
                                this.dispatched(env, event, callback), "count", EventFake.class),
                        '>',
                        0),
                "The expected [" + toStringR(event, env) + "] event was not dispatched.");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    @ConvertedParameter(index = 1, name = "times", defaultValue = "1", defaultValueType = "number")
    public Object assertDispatchedTimes(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object times = assignParameter(args, 1, true);
        if (null == times) {
            times = 1;
        }
        Object count = null;
        Assert.runtimeStaticObject.assertTrue(
                env,
                ZVal.strictEqualityCheck(
                        count =
                                env.callMethod(
                                        this.dispatched(env, event), "count", EventFake.class),
                        "===",
                        times),
                "The expected ["
                        + toStringR(event, env)
                        + "] event was dispatched "
                        + toStringR(count, env)
                        + " times instead of "
                        + toStringR(times, env)
                        + " times.");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertNotDispatched(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Assert.runtimeStaticObject.assertTrue(
                env,
                ZVal.strictEqualityCheck(
                        env.callMethod(
                                this.dispatched(env, event, callback), "count", EventFake.class),
                        "===",
                        0),
                "The unexpected [" + toStringR(event, env) + "] event was dispatched.");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object dispatched(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/EventFake.php");
        Object event = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        if (!ZVal.isTrue(this.hasDispatched(env, event))) {
            return ZVal.assign(collect.f.env(env).call().value());
        }

        callback =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = callback)
                                ? ternaryExpressionTemp
                                : new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Support\\Testing\\Fakes",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        return ZVal.assign(true);
                                    }
                                });
        return ZVal.assign(
                env.callMethod(
                        collect.f
                                .env(env)
                                .call(
                                        new ReferenceClassProperty(this, "events", env)
                                                .arrayGet(env, event))
                                .value(),
                        "filter",
                        EventFake.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Support\\Testing\\Fakes",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "arguments")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object arguments = assignParameter(args, 0, false);
                                Object callback = null;
                                callback = this.contextReferences.getCapturedValue("callback");
                                return ZVal.assign(
                                        env.callFunctionDynamic(
                                                        callback,
                                                        new RuntimeArgsWithReferences(),
                                                        PackedVaradicArgs.unpack(
                                                                new PackedVaradicArgs(arguments)))
                                                .value());
                            }
                        }.use("callback", callback)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    public Object hasDispatched(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        new ReferenceClassProperty(this, "events", env),
                                        env,
                                        event))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.EMPTY,
                                        new ReferenceClassProperty(this, "events", env),
                                        env,
                                        event)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "events")
    @ConvertedParameter(index = 1, name = "listener")
    public Object listen(RuntimeEnv env, Object... args) {
        Object events = assignParameter(args, 0, false);
        Object listener = assignParameter(args, 1, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    public Object hasListeners(RuntimeEnv env, Object... args) {
        Object eventName = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    @ConvertedParameter(index = 1, name = "payload", defaultValue = "", defaultValueType = "array")
    public Object push(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object payload = assignParameter(args, 1, true);
        if (null == payload) {
            payload = ZVal.newArray();
        }
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "subscriber")
    public Object subscribe(RuntimeEnv env, Object... args) {
        Object subscriber = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    public Object flush(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    @ConvertedParameter(index = 1, name = "payload", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "halt",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object fire(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object payload = assignParameter(args, 1, true);
        if (null == payload) {
            payload = ZVal.newArray();
        }
        Object halt = assignParameter(args, 2, true);
        if (null == halt) {
            halt = false;
        }
        return ZVal.assign(this.dispatch(env, event, payload, halt));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    @ConvertedParameter(index = 1, name = "payload", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "halt",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object dispatch(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object payload = assignParameter(args, 1, true);
        if (null == payload) {
            payload = ZVal.newArray();
        }
        Object halt = assignParameter(args, 2, true);
        if (null == halt) {
            halt = false;
        }
        Object name = null;
        name =
                ZVal.assign(
                        function_is_object.f.env(env).call(event).getBool()
                                ? function_get_class.f.env(env).call(event).value()
                                : toStringR(event, env));
        if (ZVal.isTrue(this.shouldFakeEvent(env, name))) {
            new ReferenceClassProperty(this, "events", env)
                    .arrayAppend(env, name)
                    .set(
                            function_func_get_args
                                    .f
                                    .env(env)
                                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                    .call()
                                    .value());

        } else {
            env.callMethod(this.dispatcher, "dispatch", EventFake.class, event, payload, halt);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eventName")
    protected Object shouldFakeEvent(RuntimeEnv env, Object... args) {
        Object eventName = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(ZVal.isEmpty(this.eventsToFake))
                        || ZVal.toBool(
                                function_in_array
                                        .f
                                        .env(env)
                                        .call(eventName, this.eventsToFake)
                                        .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    public Object forget(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    public Object forgetPushed(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    @ConvertedParameter(index = 1, name = "payload", defaultValue = "", defaultValueType = "array")
    public Object until(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object payload = assignParameter(args, 1, true);
        if (null == payload) {
            payload = ZVal.newArray();
        }
        return ZVal.assign(this.dispatch(env, event, payload, true));
    }

    public static final Object CONST_class = "Illuminate\\Support\\Testing\\Fakes\\EventFake";

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
                    .setName("Illuminate\\Support\\Testing\\Fakes\\EventFake")
                    .setLookup(
                            EventFake.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("dispatcher", "events", "eventsToFake")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/EventFake.php")
                    .addInterface("Illuminate\\Contracts\\Events\\Dispatcher")
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
