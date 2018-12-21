package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Testing.namespaces.Fakes.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Bus.classes.Dispatcher;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Assert;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/BusFake.php

*/

public class BusFake extends RuntimeClassBase implements Dispatcher {

    public Object commands = ZVal.newArray();

    public BusFake(RuntimeEnv env, Object... args) {
        super(env);
    }

    public BusFake(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertDispatched(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        if (function_is_numeric.f.env(env).call(callback).getBool()) {
            return ZVal.assign(this.assertDispatchedTimes(env, command, callback));
        }

        Assert.runtimeStaticObject.assertTrue(
                env,
                ZVal.isGreaterThan(
                        env.callMethod(
                                this.dispatched(env, command, callback), "count", BusFake.class),
                        '>',
                        0),
                "The expected [" + toStringR(command, env) + "] job was not dispatched.");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    @ConvertedParameter(index = 1, name = "times", defaultValue = "1", defaultValueType = "number")
    protected Object assertDispatchedTimes(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
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
                                        this.dispatched(env, command), "count", BusFake.class),
                        "===",
                        times),
                "The expected ["
                        + toStringR(command, env)
                        + "] job was pushed "
                        + toStringR(count, env)
                        + " times instead of "
                        + toStringR(times, env)
                        + " times.");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertNotDispatched(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Assert.runtimeStaticObject.assertTrue(
                env,
                ZVal.strictEqualityCheck(
                        env.callMethod(
                                this.dispatched(env, command, callback), "count", BusFake.class),
                        "===",
                        0),
                "The unexpected [" + toStringR(command, env) + "] job was dispatched.");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
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
                                "/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/BusFake.php");
        Object command = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        if (!ZVal.isTrue(this.hasDispatched(env, command))) {
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
                                        new ReferenceClassProperty(this, "commands", env)
                                                .arrayGet(env, command))
                                .value(),
                        "filter",
                        BusFake.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Support\\Testing\\Fakes",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "command")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                ReferenceContainer command =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 0, false));
                                Object callback = null;
                                callback = this.contextReferences.getCapturedValue("callback");
                                return ZVal.assign(
                                        env.callFunctionDynamic(
                                                        callback,
                                                        new RuntimeArgsWithReferences()
                                                                .add(0, command),
                                                        command.getObject())
                                                .value());
                            }
                        }.use("callback", callback)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    public Object hasDispatched(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        new ReferenceClassProperty(this, "commands", env),
                                        env,
                                        command))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.EMPTY,
                                        new ReferenceClassProperty(this, "commands", env),
                                        env,
                                        command)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    public Object dispatch(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
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
        Object command = assignParameter(args, 0, false);
        Object handler = assignParameter(args, 1, true);
        if (null == handler) {
            handler = ZVal.getNull();
        }
        new ReferenceClassProperty(this, "commands", env)
                .arrayAppend(env, function_get_class.f.env(env).call(command).value())
                .set(command);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pipes", typeHint = "array")
    public Object pipeThrough(RuntimeEnv env, Object... args) {
        Object pipes = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    public Object hasCommandHandler(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    public Object getCommandHandler(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "map", typeHint = "array")
    public Object map(RuntimeEnv env, Object... args) {
        Object map = assignParameter(args, 0, false);
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Illuminate\\Support\\Testing\\Fakes\\BusFake";

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
                    .setName("Illuminate\\Support\\Testing\\Fakes\\BusFake")
                    .setLookup(
                            BusFake.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("commands")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/BusFake.php")
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
