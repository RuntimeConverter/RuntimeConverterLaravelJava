package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeClasses.date.DateInterval;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Cache.classes.LockTimeoutException;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Cache/Lock.php

*/

public abstract class Lock extends RuntimeClassBase {

    public Object name = null;

    public Object seconds = null;

    public Lock(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Lock.class) {
            this.__construct(env, args);
        }
    }

    public Lock(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "seconds")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object seconds = assignParameter(args, 1, false);
        this.name = name;
        this.seconds = seconds;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object get(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Cache")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Cache/Lock.php");
        Object callback = assignParameter(args, 0, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object result = null;
        result = env.callMethod(this, "acquire", Lock.class);
        if (ZVal.toBool(result)
                && ZVal.toBool(function_is_callable.f.env(env).call(callback).value())) {
            return ZVal.assign(
                    tap.f
                            .env(env)
                            .call(
                                    env.callFunctionDynamic(
                                                    callback, new RuntimeArgsWithReferences())
                                            .value(),
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Illuminate\\Cache",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object _closureThisVar = this.getClosureThisVar();
                                            env.callMethod(_closureThisVar, "release", Lock.class);
                                            return null;
                                        }
                                    })
                            .value());
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "seconds")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object block(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Cache")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Cache/Lock.php");
        Object seconds = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object starting = null;
        starting = this.currentTime(env);
        while (!ZVal.isTrue(env.callMethod(this, "acquire", Lock.class))) {
            NamespaceGlobal.usleep.env(env).call(ZVal.multiply(250, 1000));
            if (ZVal.isGreaterThanOrEqualTo(
                    ZVal.subtract(this.currentTime(env), seconds), ">=", starting)) {
                throw ZVal.getException(env, new LockTimeoutException(env));
            }
        }

        if (function_is_callable.f.env(env).call(callback).getBool()) {
            return ZVal.assign(
                    tap.f
                            .env(env)
                            .call(
                                    env.callFunctionDynamic(
                                                    callback, new RuntimeArgsWithReferences())
                                            .value(),
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Illuminate\\Cache",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object _closureThisVar = this.getClosureThisVar();
                                            env.callMethod(_closureThisVar, "release", Lock.class);
                                            return null;
                                        }
                                    })
                            .value());
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay")
    protected Object secondsUntil(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, false);
        delay = this.parseDateInterval(env, delay);
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        delay, DateTimeInterface.class, "DateTimeInterface"))
                        ? NamespaceGlobal.max
                                .env(env)
                                .call(
                                        0,
                                        ZVal.subtract(
                                                env.callMethod(delay, "getTimestamp", Lock.class),
                                                this.currentTime(env)))
                                .value()
                        : ZVal.toLong(delay));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay", defaultValue = "0", defaultValueType = "number")
    protected Object availableAt(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, true);
        if (null == delay) {
            delay = 0;
        }
        delay = this.parseDateInterval(env, delay);
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        delay, DateTimeInterface.class, "DateTimeInterface"))
                        ? env.callMethod(delay, "getTimestamp", Lock.class)
                        : env.callMethod(
                                env.callMethod(
                                        Carbon.runtimeStaticObject.now(env),
                                        "addSeconds",
                                        Lock.class,
                                        delay),
                                "getTimestamp",
                                Lock.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay")
    protected Object parseDateInterval(RuntimeEnv env, Object... args) {
        ReferenceContainer delay = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.isTrue(
                ZVal.checkInstanceType(delay.getObject(), DateInterval.class, "DateInterval"))) {
            delay.setObject(
                    env.callMethod(
                            Carbon.runtimeStaticObject.now(env),
                            new RuntimeArgsWithReferences().add(0, delay),
                            "add",
                            Lock.class,
                            delay.getObject()));
        }

        return ZVal.assign(delay.getObject());
    }

    @ConvertedMethod
    protected Object currentTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(Carbon.runtimeStaticObject.now(env), "getTimestamp", Lock.class));
    }

    public static final Object CONST_class = "Illuminate\\Cache\\Lock";

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
                    .setName("Illuminate\\Cache\\Lock")
                    .setLookup(
                            Lock.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("name", "seconds")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Cache/Lock.php")
                    .addTrait("Illuminate\\Support\\InteractsWithTime")
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
