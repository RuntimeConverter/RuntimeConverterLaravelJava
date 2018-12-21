package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.MissingExtensionException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.SocketHandler;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fread;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.namespaces.Slack.classes.SlackRecord;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_extension_loaded;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/SlackHandler.php

*/

public class SlackHandler extends SocketHandler {

    public Object token = null;

    public Object slackRecord = null;

    public SlackHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SlackHandler.class) {
            this.__construct(env, args);
        }
    }

    public SlackHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    @ConvertedParameter(index = 1, name = "channel")
    @ConvertedParameter(
        index = 2,
        name = "username",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "useAttachment",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "iconEmoji",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 5, name = "level")
    @ConvertedParameter(
        index = 6,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 7,
        name = "useShortAttachment",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 8,
        name = "includeContextAndExtra",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 9,
        name = "excludeFields",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        Object channel = assignParameter(args, 1, false);
        Object username = assignParameter(args, 2, true);
        if (null == username) {
            username = ZVal.getNull();
        }
        Object useAttachment = assignParameter(args, 3, true);
        if (null == useAttachment) {
            useAttachment = true;
        }
        Object iconEmoji = assignParameter(args, 4, true);
        if (null == iconEmoji) {
            iconEmoji = ZVal.getNull();
        }
        Object level = assignParameter(args, 5, true);
        if (null == level) {
            level = Logger.CONST_CRITICAL;
        }
        Object bubble = assignParameter(args, 6, true);
        if (null == bubble) {
            bubble = true;
        }
        Object useShortAttachment = assignParameter(args, 7, true);
        if (null == useShortAttachment) {
            useShortAttachment = false;
        }
        Object includeContextAndExtra = assignParameter(args, 8, true);
        if (null == includeContextAndExtra) {
            includeContextAndExtra = false;
        }
        Object excludeFields = assignParameter(args, 9, true);
        if (null == excludeFields) {
            excludeFields = ZVal.newArray();
        }
        if (!function_extension_loaded.f.env(env).call("openssl").getBool()) {
            throw ZVal.getException(
                    env,
                    new MissingExtensionException(
                            env, "The OpenSSL PHP extension is required to use the SlackHandler"));
        }

        super.__construct(env, "ssl://slack.com:443", level, bubble);
        this.slackRecord =
                new SlackRecord(
                        env,
                        channel,
                        username,
                        useAttachment,
                        iconEmoji,
                        useShortAttachment,
                        includeContextAndExtra,
                        excludeFields,
                        toObjectR(this).accessProp(this, env).name("formatter").value());
        this.token = token;
        return null;
    }

    @ConvertedMethod
    public Object getSlackRecord(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.slackRecord);
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
        Object record = assignParameter(args, 0, false);
        Object dataArray = null;
        dataArray = this.prepareContentData(env, record);
        return ZVal.assign(NamespaceGlobal.http_build_query.env(env).call(dataArray).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record")
    protected Object prepareContentData(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        ReferenceContainer dataArray = new BasicReferenceContainer(null);
        dataArray.setObject(
                env.callMethod(this.slackRecord, "getSlackData", SlackHandler.class, record));
        dataArray.arrayAccess(env, "token").set(this.token);
        if (!arrayActionR(ArrayAction.EMPTY, dataArray, env, "attachments")) {
            dataArray
                    .arrayAccess(env, "attachments")
                    .set(
                            NamespaceGlobal.json_encode
                                    .env(env)
                                    .call(dataArray.arrayGet(env, "attachments"))
                                    .value());
        }

        return ZVal.assign(dataArray.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    private Object buildHeader(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        Object header = null;
        header = "POST /api/chat.postMessage HTTP/1.1\r\n";
        header = toStringR(header, env) + "Host: slack.com\r\n";
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
        super.write(env, record);
        this.finalizeWrite(env);
        return null;
    }

    @ConvertedMethod
    protected Object finalizeWrite(RuntimeEnv env, Object... args) {
        Object res = null;
        res = env.callMethod(this, "getResource", SlackHandler.class);
        if (function_is_resource.f.env(env).call(res).getBool()) {
            function_fread.f.env(env).call(res, 2048).value();
        }

        env.callMethod(this, "closeSocket", SlackHandler.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    protected Object getAttachmentColor(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        NamespaceGlobal.trigger_error
                .env(env)
                .call(
                        "SlackHandler::getAttachmentColor() is deprecated. Use underlying SlackRecord instead.",
                        16384);
        return ZVal.assign(
                env.callMethod(this.slackRecord, "getAttachmentColor", SlackHandler.class, level));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fields")
    protected Object stringify(RuntimeEnv env, Object... args) {
        Object fields = assignParameter(args, 0, false);
        NamespaceGlobal.trigger_error
                .env(env)
                .call(
                        "SlackHandler::stringify() is deprecated. Use underlying SlackRecord instead.",
                        16384);
        return ZVal.assign(
                env.callMethod(this.slackRecord, "stringify", SlackHandler.class, fields));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "formatter",
        typeHint = "Monolog\\Formatter\\FormatterInterface"
    )
    public Object setFormatter(RuntimeEnv env, Object... args) {
        Object formatter = assignParameter(args, 0, false);
        super.setFormatter(env, formatter);
        env.callMethod(this.slackRecord, "setFormatter", SlackHandler.class, formatter);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getFormatter(RuntimeEnv env, Object... args) {
        Object formatter = null;
        formatter = super.getFormatter(env);
        env.callMethod(this.slackRecord, "setFormatter", SlackHandler.class, formatter);
        return ZVal.assign(formatter);
    }

    public static final Object CONST_class = "Monolog\\Handler\\SlackHandler";

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
                    .setName("Monolog\\Handler\\SlackHandler")
                    .setLookup(
                            SlackHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble",
                            "connectionString",
                            "connectionTimeout",
                            "errno",
                            "errstr",
                            "formatter",
                            "lastSentBytes",
                            "lastWritingAt",
                            "level",
                            "persistent",
                            "processors",
                            "resource",
                            "slackRecord",
                            "timeout",
                            "token",
                            "writingTimeout")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/SlackHandler.php")
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
