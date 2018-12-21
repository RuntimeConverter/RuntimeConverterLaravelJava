package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Broadcasting.namespaces.Broadcasters.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes.AccessDeniedHttpException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Broadcasting.classes.BroadcastException;
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

 vendor/laravel/framework/src/Illuminate/Broadcasting/Broadcasters/PusherBroadcaster.php

*/

public class PusherBroadcaster extends Broadcaster {

    public Object pusher = null;

    public PusherBroadcaster(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PusherBroadcaster.class) {
            this.__construct(env, args);
        }
    }

    public PusherBroadcaster(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pusher", typeHint = "Pusher\\Pusher")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object pusher = assignParameter(args, 0, false);
        this.pusher = pusher;
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
                        !ZVal.isTrue(env.callMethod(request, "user", PusherBroadcaster.class)))) {
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
        if (ZVal.isTrue(
                Str.runtimeStaticObject.startsWith(
                        env,
                        toObjectR(request).accessProp(this, env).name("channel_name").value(),
                        "private"))) {
            return ZVal.assign(
                    this.decodePusherResponse(
                            env,
                            request,
                            env.callMethod(
                                    this.pusher,
                                    "socket_auth",
                                    PusherBroadcaster.class,
                                    toObjectR(request)
                                            .accessProp(this, env)
                                            .name("channel_name")
                                            .value(),
                                    toObjectR(request)
                                            .accessProp(this, env)
                                            .name("socket_id")
                                            .value())));
        }

        return ZVal.assign(
                this.decodePusherResponse(
                        env,
                        request,
                        env.callMethod(
                                this.pusher,
                                "presence_auth",
                                PusherBroadcaster.class,
                                toObjectR(request)
                                        .accessProp(this, env)
                                        .name("channel_name")
                                        .value(),
                                toObjectR(request).accessProp(this, env).name("socket_id").value(),
                                env.callMethod(
                                        env.callMethod(request, "user", PusherBroadcaster.class),
                                        "getAuthIdentifier",
                                        PusherBroadcaster.class),
                                result)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "response")
    protected Object decodePusherResponse(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        if (!ZVal.isTrue(
                env.callMethod(request, "input", PusherBroadcaster.class, "callback", false))) {
            return ZVal.assign(NamespaceGlobal.json_decode.env(env).call(response, true).value());
        }

        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .functions
                                        .response
                                        .f
                                        .env(env)
                                        .call()
                                        .value(),
                                "json",
                                PusherBroadcaster.class,
                                NamespaceGlobal.json_decode.env(env).call(response, true).value()),
                        "withCallback",
                        PusherBroadcaster.class,
                        toObjectR(request).accessProp(this, env).name("callback").value()));
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
        ReferenceContainer response = new BasicReferenceContainer(null);
        Object socket = null;
        socket =
                Arr.runtimeStaticObject.pull(
                        env,
                        new RuntimeArgsWithReferences().add(0, payload),
                        payload.getObject(),
                        "socket");
        response.setObject(
                env.callMethod(
                        this.pusher,
                        "trigger",
                        PusherBroadcaster.class,
                        env.callMethod(this, "formatChannels", PusherBroadcaster.class, channels),
                        event,
                        payload.getObject(),
                        socket,
                        true));
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        function_is_array
                                                                .f
                                                                .env(env)
                                                                .call(response.getObject())
                                                                .value())
                                                && ZVal.toBool(
                                                        ZVal.isGreaterThanOrEqualTo(
                                                                response.arrayGet(env, "status"),
                                                                ">=",
                                                                200)))
                                && ZVal.toBool(
                                        ZVal.isLessThanOrEqualTo(
                                                response.arrayGet(env, "status"), "<=", 299)))
                || ZVal.toBool(ZVal.strictEqualityCheck(response.getObject(), "===", true))) {
            return null;
        }

        throw ZVal.getException(
                env,
                new BroadcastException(
                        env,
                        function_is_bool.f.env(env).call(response.getObject()).getBool()
                                ? "Failed to connect to Pusher."
                                : response.arrayGet(env, "body")));
    }

    @ConvertedMethod
    public Object getPusher(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.pusher);
    }

    public static final Object CONST_class =
            "Illuminate\\Broadcasting\\Broadcasters\\PusherBroadcaster";

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
                    .setName("Illuminate\\Broadcasting\\Broadcasters\\PusherBroadcaster")
                    .setLookup(
                            PusherBroadcaster.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bindingRegistrar", "channels", "pusher")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Broadcasting/Broadcasters/PusherBroadcaster.php")
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
