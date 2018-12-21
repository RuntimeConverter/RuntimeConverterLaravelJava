package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Redis.namespaces.Connections.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Redis.namespaces.Limiters.classes.ConcurrencyLimiterBuilder;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Redis.namespaces.Limiters.classes.DurationLimiterBuilder;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Redis/Connections/Connection.php

*/

public abstract class Connection extends RuntimeClassBase {

    public Object client = null;

    public Connection(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Connection(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object funnel(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(new ConcurrencyLimiterBuilder(env, this, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object throttle(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(new DurationLimiterBuilder(env, this, name));
    }

    @ConvertedMethod
    public Object client(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.client);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "channels")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    public Object subscribe(RuntimeEnv env, Object... args) {
        Object channels = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "createSubscription",
                        Connection.class,
                        channels,
                        callback,
                        "subscribe"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "channels")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    public Object psubscribe(RuntimeEnv env, Object... args) {
        Object channels = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "createSubscription",
                        Connection.class,
                        channels,
                        callback,
                        "psubscribe"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object command(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(
                        this.client,
                        new RuntimeArgsWithReferences(),
                        toStringR(method, env),
                        Connection.class,
                        PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        return ZVal.assign(this.command(env, method, parameters));
    }

    public static final Object CONST_class = "Illuminate\\Redis\\Connections\\Connection";

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
                    .setName("Illuminate\\Redis\\Connections\\Connection")
                    .setLookup(
                            Connection.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("client")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Redis/Connections/Connection.php")
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
