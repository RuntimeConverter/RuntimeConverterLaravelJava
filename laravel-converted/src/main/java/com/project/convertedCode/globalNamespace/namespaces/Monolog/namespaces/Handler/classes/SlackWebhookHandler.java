package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.namespaces.Curl.classes.Util;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.namespaces.Slack.classes.SlackRecord;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractProcessingHandler;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/SlackWebhookHandler.php

*/

public class SlackWebhookHandler extends AbstractProcessingHandler {

    public Object webhookUrl = null;

    public Object slackRecord = null;

    public SlackWebhookHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SlackWebhookHandler.class) {
            this.__construct(env, args);
        }
    }

    public SlackWebhookHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "webhookUrl")
    @ConvertedParameter(
        index = 1,
        name = "channel",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
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
    @ConvertedParameter(
        index = 5,
        name = "useShortAttachment",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "includeContextAndExtra",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 7, name = "level")
    @ConvertedParameter(
        index = 8,
        name = "bubble",
        defaultValue = "true",
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
        Object webhookUrl = assignParameter(args, 0, false);
        Object channel = assignParameter(args, 1, true);
        if (null == channel) {
            channel = ZVal.getNull();
        }
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
        Object useShortAttachment = assignParameter(args, 5, true);
        if (null == useShortAttachment) {
            useShortAttachment = false;
        }
        Object includeContextAndExtra = assignParameter(args, 6, true);
        if (null == includeContextAndExtra) {
            includeContextAndExtra = false;
        }
        Object level = assignParameter(args, 7, true);
        if (null == level) {
            level = Logger.CONST_CRITICAL;
        }
        Object bubble = assignParameter(args, 8, true);
        if (null == bubble) {
            bubble = true;
        }
        Object excludeFields = assignParameter(args, 9, true);
        if (null == excludeFields) {
            excludeFields = ZVal.newArray();
        }
        super.__construct(env, level, bubble);
        this.webhookUrl = webhookUrl;
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
        return null;
    }

    @ConvertedMethod
    public Object getSlackRecord(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.slackRecord);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        Object postString = null;
        Object ch = null;
        ReferenceContainer options = new BasicReferenceContainer(null);
        Object postData = null;
        postData =
                env.callMethod(this.slackRecord, "getSlackData", SlackWebhookHandler.class, record);
        postString = NamespaceGlobal.json_encode.env(env).call(postData).value();
        ch = NamespaceGlobal.curl_init.env(env).call().value();
        options.setObject(
                ZVal.newArray(
                        new ZPair(10002, this.webhookUrl),
                        new ZPair(47, true),
                        new ZPair(19913, true),
                        new ZPair(10023, ZVal.arrayFromList("Content-type: application/json")),
                        new ZPair(10015, postString)));
        if (function_defined.f.env(env).call("CURLOPT_SAFE_UPLOAD").getBool()) {
            options.arrayAccess(env, -1).set(true);
        }

        NamespaceGlobal.curl_setopt_array.env(env).call(ch, options.getObject());
        Util.runtimeStaticObject.execute(env, ch);
        return null;
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
        env.callMethod(this.slackRecord, "setFormatter", SlackWebhookHandler.class, formatter);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getFormatter(RuntimeEnv env, Object... args) {
        Object formatter = null;
        formatter = super.getFormatter(env);
        env.callMethod(this.slackRecord, "setFormatter", SlackWebhookHandler.class, formatter);
        return ZVal.assign(formatter);
    }

    public static final Object CONST_class = "Monolog\\Handler\\SlackWebhookHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractProcessingHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\SlackWebhookHandler")
                    .setLookup(
                            SlackWebhookHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble",
                            "formatter",
                            "level",
                            "processors",
                            "slackRecord",
                            "webhookUrl")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Handler/SlackWebhookHandler.php")
                    .addInterface("Monolog\\Handler\\HandlerInterface")
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
