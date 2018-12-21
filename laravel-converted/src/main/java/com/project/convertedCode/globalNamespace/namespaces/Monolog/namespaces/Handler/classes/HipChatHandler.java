package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.SocketHandler;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/HipChatHandler.php

*/

public class HipChatHandler extends SocketHandler {

    public Object token = null;

    public Object room = null;

    public Object name = null;

    public Object notify = null;

    public Object format = null;

    public Object host = null;

    public Object version = null;

    public HipChatHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HipChatHandler.class) {
            this.__construct(env, args);
        }
    }

    public HipChatHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    @ConvertedParameter(index = 1, name = "room")
    @ConvertedParameter(index = 2, name = "name")
    @ConvertedParameter(
        index = 3,
        name = "notify",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 4, name = "level")
    @ConvertedParameter(
        index = 5,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "useSSL",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 7, name = "format")
    @ConvertedParameter(index = 8, name = "host")
    @ConvertedParameter(index = 9, name = "version")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        Object room = assignParameter(args, 1, false);
        Object name = assignParameter(args, 2, true);
        if (null == name) {
            name = "Monolog";
        }
        Object notify = assignParameter(args, 3, true);
        if (null == notify) {
            notify = false;
        }
        Object level = assignParameter(args, 4, true);
        if (null == level) {
            level = Logger.CONST_CRITICAL;
        }
        Object bubble = assignParameter(args, 5, true);
        if (null == bubble) {
            bubble = true;
        }
        Object useSSL = assignParameter(args, 6, true);
        if (null == useSSL) {
            useSSL = true;
        }
        Object format = assignParameter(args, 7, true);
        if (null == format) {
            format = "text";
        }
        Object host = assignParameter(args, 8, true);
        if (null == host) {
            host = "api.hipchat.com";
        }
        Object version = assignParameter(args, 9, true);
        if (null == version) {
            version = CONST_API_V1;
        }
        Object connectionString = null;
        if (ZVal.toBool(ZVal.equalityCheck(version, CONST_API_V1))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                this.validateStringLength(
                                        env,
                                        name,
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "MAXIMUM_NAME_LENGTH"))))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "The supplied name is too long. HipChat's v1 API supports names up to 15 UTF-8 characters."));
        }

        connectionString =
                ZVal.assign(
                        ZVal.isTrue(useSSL)
                                ? "ssl://" + toStringR(host, env) + ":443"
                                : toStringR(host, env) + ":80");
        super.__construct(env, connectionString, level, bubble);
        this.token = token;
        this.name = name;
        this.notify = notify;
        this.room = room;
        this.format = format;
        this.host = host;
        this.version = version;
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
        dataArray.setObject(
                ZVal.newArray(
                        new ZPair(
                                "notify",
                                ZVal.equalityCheck(this.version, CONST_API_V1)
                                        ? ZVal.isTrue(this.notify) ? 1 : 0
                                        : ZVal.isTrue(this.notify) ? "true" : "false"),
                        new ZPair("message", record.arrayGet(env, "formatted")),
                        new ZPair("message_format", this.format),
                        new ZPair(
                                "color", this.getAlertColor(env, record.arrayGet(env, "level")))));
        if (!ZVal.isTrue(
                this.validateStringLength(
                        env,
                        dataArray.arrayGet(env, "message"),
                        ClassConstantUtils.getConstantValueLateStatic(
                                env, this, "MAXIMUM_MESSAGE_LENGTH")))) {
            if (function_function_exists.f.env(env).call("mb_substr").getBool()) {
                dataArray
                        .arrayAccess(env, "message")
                        .set(
                                toStringR(
                                                NamespaceGlobal.mb_substr
                                                        .env(env)
                                                        .call(
                                                                dataArray.arrayGet(env, "message"),
                                                                0,
                                                                ClassConstantUtils
                                                                        .getConstantValueLateStatic(
                                                                                env,
                                                                                this,
                                                                                "MAXIMUM_MESSAGE_LENGTH"))
                                                        .value(),
                                                env)
                                        + " [truncated]");

            } else {
                dataArray
                        .arrayAccess(env, "message")
                        .set(
                                toStringR(
                                                function_substr
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                dataArray.arrayGet(env, "message"),
                                                                0,
                                                                ClassConstantUtils
                                                                        .getConstantValueLateStatic(
                                                                                env,
                                                                                this,
                                                                                "MAXIMUM_MESSAGE_LENGTH"))
                                                        .value(),
                                                env)
                                        + " [truncated]");
            }
        }

        if (ZVal.equalityCheck(this.version, CONST_API_V1)) {
            dataArray.arrayAccess(env, "room_id").set(this.room);
        }

        if (ZVal.toBool(ZVal.equalityCheck(this.version, CONST_API_V1))
                || ZVal.toBool(ZVal.strictNotEqualityCheck(this.name, "!==", ZVal.getNull()))) {
            dataArray.arrayAccess(env, "from").set(toStringR(this.name, env));
        }

        return ZVal.assign(
                NamespaceGlobal.http_build_query.env(env).call(dataArray.getObject()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    private Object buildHeader(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        Object header = null;
        Object room = null;
        if (ZVal.equalityCheck(this.version, CONST_API_V1)) {
            header =
                    ZVal.assign(
                            "POST /v1/rooms/message?format=json&auth_token="
                                    + toStringR(this.token, env)
                                    + " HTTP/1.1\r\n");

        } else {
            room = NamespaceGlobal.rawurlencode.env(env).call(this.room).value();
            header =
                    ZVal.assign(
                            "POST /v2/room/"
                                    + toStringR(room, env)
                                    + "/notification?auth_token="
                                    + toStringR(this.token, env)
                                    + " HTTP/1.1\r\n");
        }

        header =
                toStringR(header, env)
                        + toStringR("Host: " + toStringR(this.host, env) + "\r\n", env);
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
    @ConvertedParameter(index = 0, name = "level")
    protected Object getAlertColor(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        SwitchEnumType39 switchVariable39 =
                ZVal.getEnum(
                        true,
                        SwitchEnumType39.DEFAULT_CASE,
                        SwitchEnumType39.DYNAMIC_TYPE_115,
                        ZVal.isGreaterThanOrEqualTo(level, ">=", Logger.CONST_ERROR),
                        SwitchEnumType39.DYNAMIC_TYPE_116,
                        ZVal.isGreaterThanOrEqualTo(level, ">=", Logger.CONST_WARNING),
                        SwitchEnumType39.DYNAMIC_TYPE_117,
                        ZVal.isGreaterThanOrEqualTo(level, ">=", Logger.CONST_INFO),
                        SwitchEnumType39.DYNAMIC_TYPE_118,
                        ZVal.equalityCheck(level, Logger.CONST_DEBUG));
        switch (switchVariable39) {
            case DYNAMIC_TYPE_115:
                return "red";
            case DYNAMIC_TYPE_116:
                return "yellow";
            case DYNAMIC_TYPE_117:
                return "green";
            case DYNAMIC_TYPE_118:
                return "gray";
            case DEFAULT_CASE:
                return "yellow";
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        super.write(env, record);
        env.callMethod(this, "closeSocket", HipChatHandler.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    public Object handleBatch(RuntimeEnv env, Object... args) {
        Object records = assignParameter(args, 0, false);
        Object batchRecord = null;
        Object handled = null;
        Object batchRecords = null;
        if (ZVal.equalityCheck(function_count.f.env(env).call(records).value(), 0)) {
            return ZVal.assign(true);
        }

        batchRecords = this.combineRecords(env, records);
        handled = false;
        for (ZPair zpairResult786 : ZVal.getIterable(batchRecords, env, true)) {
            batchRecord = ZVal.assign(zpairResult786.getValue());
            if (ZVal.isTrue(
                    env.callMethod(this, "isHandling", HipChatHandler.class, batchRecord))) {
                this.write(env, batchRecord);
                handled = true;
            }
        }

        if (!ZVal.isTrue(handled)) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        false,
                        "===",
                        toObjectR(this).accessProp(this, env).name("bubble").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records")
    private Object combineRecords(RuntimeEnv env, Object... args) {
        Object records = assignParameter(args, 0, false);
        ReferenceContainer batchRecord = new BasicReferenceContainer(null);
        Object level = null;
        Object lastMessage = null;
        ReferenceContainer batchRecords = new BasicReferenceContainer(null);
        Object levelName = null;
        Object datetime = null;
        ReferenceContainer formattedMessages = new BasicReferenceContainer(null);
        Object messageStr = null;
        ReferenceContainer record = new BasicReferenceContainer(null);
        ReferenceContainer messages = new BasicReferenceContainer(null);
        Object formattedMessageStr = null;
        Object lastFormattedMessage = null;
        batchRecord.setObject(ZVal.getNull());
        batchRecords.setObject(ZVal.newArray());
        messages.setObject(ZVal.newArray());
        formattedMessages.setObject(ZVal.newArray());
        level = 0;
        levelName = ZVal.getNull();
        datetime = ZVal.getNull();
        for (ZPair zpairResult787 : ZVal.getIterable(records, env, true)) {
            record.setObject(ZVal.assign(zpairResult787.getValue()));
            record.setObject(
                    env.callMethod(
                            this, "processRecord", HipChatHandler.class, record.getObject()));
            if (ZVal.isGreaterThan(record.arrayGet(env, "level"), '>', level)) {
                level = ZVal.assign(record.arrayGet(env, "level"));
                levelName = ZVal.assign(record.arrayGet(env, "level_name"));
            }

            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", datetime)) {
                datetime = ZVal.assign(record.arrayGet(env, "datetime"));
            }

            messages.arrayAppend(env).set(record.arrayGet(env, "message"));
            messageStr = NamespaceGlobal.implode.env(env).call("\n", messages.getObject()).value();
            formattedMessages
                    .arrayAppend(env)
                    .set(
                            env.callMethod(
                                    env.callMethod(this, "getFormatter", HipChatHandler.class),
                                    "format",
                                    HipChatHandler.class,
                                    record.getObject()));
            formattedMessageStr =
                    NamespaceGlobal.implode
                            .env(env)
                            .call("", formattedMessages.getObject())
                            .value();
            batchRecord.setObject(
                    ZVal.newArray(
                            new ZPair("message", messageStr),
                            new ZPair("formatted", formattedMessageStr),
                            new ZPair("context", ZVal.newArray()),
                            new ZPair("extra", ZVal.newArray())));
            if (!ZVal.isTrue(
                    this.validateStringLength(
                            env,
                            batchRecord.arrayGet(env, "formatted"),
                            ClassConstantUtils.getConstantValueLateStatic(
                                    env, this, "MAXIMUM_MESSAGE_LENGTH")))) {
                lastMessage = function_array_pop.f.env(env).call(messages.getObject()).value();
                lastFormattedMessage =
                        function_array_pop.f.env(env).call(formattedMessages.getObject()).value();
                batchRecord
                        .arrayAccess(env, "message")
                        .set(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call("\n", messages.getObject())
                                        .value());
                batchRecord
                        .arrayAccess(env, "formatted")
                        .set(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call("", formattedMessages.getObject())
                                        .value());
                batchRecords.arrayAppend(env).set(batchRecord.getObject());
                messages.setObject(ZVal.newArray(new ZPair(0, lastMessage)));
                formattedMessages.setObject(ZVal.newArray(new ZPair(0, lastFormattedMessage)));
                batchRecord.setObject(ZVal.getNull());
            }
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", batchRecord.getObject())) {
            batchRecords.arrayAppend(env).set(batchRecord.getObject());
        }

        for (ZPair zpairResult788 : ZVal.getIterable(batchRecords.getObject(), env, true)) {
            batchRecord = zpairResult788;
            batchRecord.setObject(
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    batchRecord.getObject(),
                                    ZVal.newArray(
                                            new ZPair("level", level),
                                            new ZPair("level_name", levelName),
                                            new ZPair("datetime", datetime)))
                            .value());
        }

        return ZVal.assign(batchRecords.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "str")
    @ConvertedParameter(index = 1, name = "length")
    private Object validateStringLength(RuntimeEnv env, Object... args) {
        Object str = assignParameter(args, 0, false);
        Object length = assignParameter(args, 1, false);
        if (function_function_exists.f.env(env).call("mb_strlen").getBool()) {
            return ZVal.assign(
                    ZVal.isLessThanOrEqualTo(
                            NamespaceGlobal.mb_strlen.env(env).call(str).value(), "<=", length));
        }

        return ZVal.assign(
                ZVal.isLessThanOrEqualTo(
                        function_strlen.f.env(env).call(str).value(), "<=", length));
    }

    public static final Object CONST_API_V1 = "v1";

    public static final Object CONST_API_V2 = "v2";

    public static final Object CONST_MAXIMUM_NAME_LENGTH = 15;

    public static final Object CONST_MAXIMUM_MESSAGE_LENGTH = 9500;

    public static final Object CONST_class = "Monolog\\Handler\\HipChatHandler";

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
                    .setName("Monolog\\Handler\\HipChatHandler")
                    .setLookup(
                            HipChatHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble",
                            "connectionString",
                            "connectionTimeout",
                            "errno",
                            "errstr",
                            "format",
                            "formatter",
                            "host",
                            "lastSentBytes",
                            "lastWritingAt",
                            "level",
                            "name",
                            "notify",
                            "persistent",
                            "processors",
                            "resource",
                            "room",
                            "timeout",
                            "token",
                            "version",
                            "writingTimeout")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/HipChatHandler.php")
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

    private enum SwitchEnumType39 {
        DYNAMIC_TYPE_115,
        DYNAMIC_TYPE_116,
        DYNAMIC_TYPE_117,
        DYNAMIC_TYPE_118,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
