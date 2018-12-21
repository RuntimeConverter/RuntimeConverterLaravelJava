package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.SocketHandler;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_intersect_key;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/PushoverHandler.php

*/

public class PushoverHandler extends SocketHandler {

    public Object token = null;

    public Object users = null;

    public Object title = null;

    public Object user = null;

    public Object retry = null;

    public Object expire = null;

    public Object highPriorityLevel = null;

    public Object emergencyLevel = null;

    public Object useFormattedMessage = false;

    public Object parameterNames =
            ZVal.newArray(
                    new ZPair("token", true),
                    new ZPair("user", true),
                    new ZPair("message", true),
                    new ZPair("device", true),
                    new ZPair("title", true),
                    new ZPair("url", true),
                    new ZPair("url_title", true),
                    new ZPair("priority", true),
                    new ZPair("timestamp", true),
                    new ZPair("sound", true),
                    new ZPair("retry", true),
                    new ZPair("expire", true),
                    new ZPair("callback", true));

    public Object sounds =
            ZVal.arrayFromList(
                    "pushover",
                    "bike",
                    "bugle",
                    "cashregister",
                    "classical",
                    "cosmic",
                    "falling",
                    "gamelan",
                    "incoming",
                    "intermission",
                    "magic",
                    "mechanical",
                    "pianobar",
                    "siren",
                    "spacealarm",
                    "tugboat",
                    "alien",
                    "climb",
                    "persistent",
                    "echo",
                    "updown",
                    "none");

    public PushoverHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PushoverHandler.class) {
            this.__construct(env, args);
        }
    }

    public PushoverHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    @ConvertedParameter(index = 1, name = "users")
    @ConvertedParameter(
        index = 2,
        name = "title",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "level")
    @ConvertedParameter(
        index = 4,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "useSSL",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 6, name = "highPriorityLevel")
    @ConvertedParameter(index = 7, name = "emergencyLevel")
    @ConvertedParameter(index = 8, name = "retry", defaultValue = "30", defaultValueType = "number")
    @ConvertedParameter(
        index = 9,
        name = "expire",
        defaultValue = "25200",
        defaultValueType = "number"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        Object users = assignParameter(args, 1, false);
        Object title = assignParameter(args, 2, true);
        if (null == title) {
            title = ZVal.getNull();
        }
        Object level = assignParameter(args, 3, true);
        if (null == level) {
            level = Logger.CONST_CRITICAL;
        }
        Object bubble = assignParameter(args, 4, true);
        if (null == bubble) {
            bubble = true;
        }
        Object useSSL = assignParameter(args, 5, true);
        if (null == useSSL) {
            useSSL = true;
        }
        Object highPriorityLevel = assignParameter(args, 6, true);
        if (null == highPriorityLevel) {
            highPriorityLevel = Logger.CONST_CRITICAL;
        }
        Object emergencyLevel = assignParameter(args, 7, true);
        if (null == emergencyLevel) {
            emergencyLevel = Logger.CONST_EMERGENCY;
        }
        Object retry = assignParameter(args, 8, true);
        if (null == retry) {
            retry = 30;
        }
        Object expire = assignParameter(args, 9, true);
        if (null == expire) {
            expire = 25200;
        }
        Object connectionString = null;
        Object ternaryExpressionTemp = null;
        connectionString =
                ZVal.assign(
                        ZVal.isTrue(useSSL) ? "ssl://api.pushover.net:443" : "api.pushover.net:80");
        super.__construct(env, connectionString, level, bubble);
        this.token = token;
        this.users = rToArrayCast(users);
        this.title =
                ZVal.isTrue(ternaryExpressionTemp = title)
                        ? ternaryExpressionTemp
                        : NamespaceGlobal.gethostname.env(env).call().value();
        this.highPriorityLevel = Logger.runtimeStaticObject.toMonologLevel(env, highPriorityLevel);
        this.emergencyLevel = Logger.runtimeStaticObject.toMonologLevel(env, emergencyLevel);
        this.retry = retry;
        this.expire = expire;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record")
    protected Object generateDataStream(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        Object content = null;
        content = this.buildContent(env, record);
        return ZVal.assign(
                toStringR(this.buildHeader(env, content), env) + toStringR(content, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record")
    private Object buildContent(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer dataArray = new BasicReferenceContainer(null);
        Object maxMessageLength = null;
        Object extra = null;
        Object context = null;
        Object message = null;
        Object timestamp = null;
        maxMessageLength = ZVal.subtract(512, function_strlen.f.env(env).call(this.title).value());
        message =
                ZVal.assign(
                        ZVal.isTrue(this.useFormattedMessage)
                                ? record.arrayGet(env, "formatted")
                                : record.arrayGet(env, "message"));
        message = function_substr.f.env(env).call(message, 0, maxMessageLength).value();
        timestamp =
                env.callMethod(
                        record.arrayGet(env, "datetime"), "getTimestamp", PushoverHandler.class);
        dataArray.setObject(
                ZVal.newArray(
                        new ZPair("token", this.token),
                        new ZPair("user", this.user),
                        new ZPair("message", message),
                        new ZPair("title", this.title),
                        new ZPair("timestamp", timestamp)));
        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, record, env, "level"))
                && ZVal.toBool(
                        ZVal.isGreaterThanOrEqualTo(
                                record.arrayGet(env, "level"), ">=", this.emergencyLevel))) {
            dataArray.arrayAccess(env, "priority").set(2);
            dataArray.arrayAccess(env, "retry").set(this.retry);
            dataArray.arrayAccess(env, "expire").set(this.expire);

        } else if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, record, env, "level"))
                && ZVal.toBool(
                        ZVal.isGreaterThanOrEqualTo(
                                record.arrayGet(env, "level"), ">=", this.highPriorityLevel))) {
            dataArray.arrayAccess(env, "priority").set(1);
        }

        context =
                function_array_intersect_key
                        .f
                        .env(env)
                        .call(record.arrayGet(env, "context"), this.parameterNames)
                        .value();
        extra =
                function_array_intersect_key
                        .f
                        .env(env)
                        .call(record.arrayGet(env, "extra"), this.parameterNames)
                        .value();
        dataArray.setObject(
                function_array_merge
                        .f
                        .env(env)
                        .call(extra, context, dataArray.getObject())
                        .value());
        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, dataArray, env, "sound"))
                && ZVal.toBool(
                        !function_in_array
                                .f
                                .env(env)
                                .call(dataArray.arrayGet(env, "sound"), this.sounds)
                                .getBool())) {
            arrayActionR(ArrayAction.UNSET, dataArray, env, "sound");
        }

        return ZVal.assign(
                NamespaceGlobal.http_build_query.env(env).call(dataArray.getObject()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    private Object buildHeader(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        Object header = null;
        header = "POST /1/messages.json HTTP/1.1\r\n";
        header = toStringR(header, env) + "Host: api.pushover.net\r\n";
        header = toStringR(header, env) + "Content-Type: application/x-www-form-urlencoded\r\n";
        header =
                toStringR(header, env)
                        + "Content-Length: "
                        + toStringR(function_strlen.f.env(env).call(content).value(), env)
                        + "\r\n";
        header = toStringR(header, env) + "\r\n";
        return ZVal.assign(header);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        Object user = null;
        for (ZPair zpairResult798 : ZVal.getIterable(this.users, env, true)) {
            user = ZVal.assign(zpairResult798.getValue());
            this.user = user;
            super.write(env, record);
            env.callMethod(this, "closeSocket", PushoverHandler.class);
        }

        this.user = ZVal.getNull();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object setHighPriorityLevel(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        this.highPriorityLevel = value;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object setEmergencyLevel(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        this.emergencyLevel = value;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object useFormattedMessage(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        this.useFormattedMessage = ZVal.toBool(value);
        return null;
    }

    public static final Object CONST_class = "Monolog\\Handler\\PushoverHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends SocketHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\PushoverHandler")
                    .setLookup(
                            PushoverHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble",
                            "connectionString",
                            "connectionTimeout",
                            "emergencyLevel",
                            "errno",
                            "errstr",
                            "expire",
                            "formatter",
                            "highPriorityLevel",
                            "lastSentBytes",
                            "lastWritingAt",
                            "level",
                            "parameterNames",
                            "persistent",
                            "processors",
                            "resource",
                            "retry",
                            "sounds",
                            "timeout",
                            "title",
                            "token",
                            "useFormattedMessage",
                            "user",
                            "users",
                            "writingTimeout")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/PushoverHandler.php")
                    .addInterface("Monolog\\Handler\\HandlerInterface")
                    .addExtendsClass("Monolog\\Handler\\SocketHandler")
                    .addExtendsClass("Monolog\\Handler\\AbstractProcessingHandler")
                    .addExtendsClass("Monolog\\Handler\\AbstractHandler")
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
