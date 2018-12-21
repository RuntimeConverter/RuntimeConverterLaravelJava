package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Broadcasting.namespaces.Broadcasters.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Broadcasting.namespaces.Broadcasters.classes.Broadcaster;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Broadcasting/Broadcasters/LogBroadcaster.php

*/

public class LogBroadcaster extends Broadcaster {

    public Object logger = null;

    public LogBroadcaster(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == LogBroadcaster.class) {
            this.__construct(env, args);
        }
    }

    public LogBroadcaster(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "logger", typeHint = "Psr\\Log\\LoggerInterface")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object logger = assignParameter(args, 0, false);
        this.logger = logger;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    public Object auth(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "result")
    public Object validAuthenticationResponse(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object result = assignParameter(args, 1, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "channels", typeHint = "array")
    @ConvertedParameter(index = 1, name = "event")
    @ConvertedParameter(
        index = 2,
        name = "payload",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object broadcast(RuntimeEnv env, Object... args) {
        Object channels = assignParameter(args, 0, false);
        Object event = assignParameter(args, 1, false);
        Object payload = assignParameter(args, 2, true);
        if (null == payload) {
            payload = ZVal.newArray();
        }
        channels =
                NamespaceGlobal.implode
                        .env(env)
                        .call(
                                ", ",
                                env.callMethod(
                                        this, "formatChannels", LogBroadcaster.class, channels))
                        .value();
        payload = NamespaceGlobal.json_encode.env(env).call(payload, 128).value();
        env.callMethod(
                this.logger,
                "info",
                LogBroadcaster.class,
                "Broadcasting ["
                        + toStringR(event, env)
                        + "] on channels ["
                        + toStringR(channels, env)
                        + "] with payload:"
                        + toStringR("\n", env)
                        + toStringR(payload, env));
        return null;
    }

    public static final Object CONST_class =
            "Illuminate\\Broadcasting\\Broadcasters\\LogBroadcaster";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Broadcaster.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Broadcasting\\Broadcasters\\LogBroadcaster")
                    .setLookup(
                            LogBroadcaster.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bindingRegistrar", "channels", "logger")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Broadcasting/Broadcasters/LogBroadcaster.php")
                    .addInterface("Illuminate\\Contracts\\Broadcasting\\Broadcaster")
                    .addExtendsClass("Illuminate\\Broadcasting\\Broadcasters\\Broadcaster")
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
