package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Broadcasting.namespaces.Broadcasters.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes.AccessDeniedHttpException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Broadcasting.namespaces.Broadcasters.classes.Broadcaster;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Broadcasting/Broadcasters/RedisBroadcaster.php

*/

public class RedisBroadcaster extends Broadcaster {

    public Object redis = null;

    public Object connection = null;

    public RedisBroadcaster(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RedisBroadcaster.class) {
            this.__construct(env, args);
        }
    }

    public RedisBroadcaster(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "redis",
        typeHint = "Illuminate\\Contracts\\Redis\\Factory"
    )
    @ConvertedParameter(
        index = 1,
        name = "connection",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object redis = assignParameter(args, 0, false);
        Object connection = assignParameter(args, 1, true);
        if (null == connection) {
            connection = ZVal.getNull();
        }
        this.redis = redis;
        this.connection = connection;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    public Object auth(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object channelName = null;
        if (ZVal.toBool(
                        Str.runtimeStaticObject.startsWith(
                                env,
                                toObjectR(request)
                                        .accessProp(this, env)
                                        .name("channel_name")
                                        .value(),
                                ZVal.arrayFromList("private-", "presence-")))
                && ZVal.toBool(
                        !ZVal.isTrue(env.callMethod(request, "user", RedisBroadcaster.class)))) {
            throw ZVal.getException(env, new AccessDeniedHttpException(env));
        }

        channelName =
                ZVal.assign(
                        ZVal.isTrue(
                                        Str.runtimeStaticObject.startsWith(
                                                env,
                                                toObjectR(request)
                                                        .accessProp(this, env)
                                                        .name("channel_name")
                                                        .value(),
                                                "private-"))
                                ? Str.runtimeStaticObject.replaceFirst(
                                        env,
                                        "private-",
                                        "",
                                        toObjectR(request)
                                                .accessProp(this, env)
                                                .name("channel_name")
                                                .value())
                                : Str.runtimeStaticObject.replaceFirst(
                                        env,
                                        "presence-",
                                        "",
                                        toObjectR(request)
                                                .accessProp(this, env)
                                                .name("channel_name")
                                                .value()));
        return ZVal.assign(super.verifyUserCanAccessChannel(env, request, channelName));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "result")
    public Object validAuthenticationResponse(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object result = assignParameter(args, 1, false);
        if (function_is_bool.f.env(env).call(result).getBool()) {
            return ZVal.assign(NamespaceGlobal.json_encode.env(env).call(result).value());
        }

        return ZVal.assign(
                NamespaceGlobal.json_encode
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(
                                                "channel_data",
                                                ZVal.newArray(
                                                        new ZPair(
                                                                "user_id",
                                                                env.callMethod(
                                                                        env.callMethod(
                                                                                request,
                                                                                "user",
                                                                                RedisBroadcaster
                                                                                        .class),
                                                                        "getAuthIdentifier",
                                                                        RedisBroadcaster.class)),
                                                        new ZPair("user_info", result)))))
                        .value());
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
        ReferenceContainer payload = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == payload.getObject()) {
            payload.setObject(ZVal.newArray());
        }
        Object channel = null;
        Object connection = null;
        connection =
                env.callMethod(this.redis, "connection", RedisBroadcaster.class, this.connection);
        payload.setObject(
                NamespaceGlobal.json_encode
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair("event", event),
                                        new ZPair("data", payload.getObject()),
                                        new ZPair(
                                                "socket",
                                                Arr.runtimeStaticObject.pull(
                                                        env,
                                                        new RuntimeArgsWithReferences()
                                                                .add(0, payload),
                                                        payload.getObject(),
                                                        "socket"))))
                        .value());
        for (ZPair zpairResult202 :
                ZVal.getIterable(
                        env.callMethod(this, "formatChannels", RedisBroadcaster.class, channels),
                        env,
                        true)) {
            channel = ZVal.assign(zpairResult202.getValue());
            env.callMethod(
                    connection, "publish", RedisBroadcaster.class, channel, payload.getObject());
        }

        return null;
    }

    public static final Object CONST_class =
            "Illuminate\\Broadcasting\\Broadcasters\\RedisBroadcaster";

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
                    .setName("Illuminate\\Broadcasting\\Broadcasters\\RedisBroadcaster")
                    .setLookup(
                            RedisBroadcaster.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bindingRegistrar", "channels", "connection", "redis")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Broadcasting/Broadcasters/RedisBroadcaster.php")
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
