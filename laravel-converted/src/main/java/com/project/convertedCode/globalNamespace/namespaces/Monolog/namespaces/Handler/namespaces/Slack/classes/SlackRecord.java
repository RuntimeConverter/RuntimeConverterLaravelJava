package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.namespaces.Slack.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.NormalizerFormatter;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.filter.function_filter_var;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/Slack/SlackRecord.php

*/

public class SlackRecord extends RuntimeClassBase {

    public Object channel = null;

    public Object username = null;

    public Object userIcon = null;

    public Object useAttachment = null;

    public Object useShortAttachment = null;

    public Object includeContextAndExtra = null;

    public Object excludeFields = null;

    public Object formatter = null;

    public Object normalizerFormatter = null;

    public SlackRecord(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SlackRecord.class) {
            this.__construct(env, args);
        }
    }

    public SlackRecord(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "channel",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "username",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "useAttachment",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "userIcon",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "useShortAttachment",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "includeContextAndExtra",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "excludeFields",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 7,
        name = "formatter",
        typeHint = "Monolog\\Formatter\\FormatterInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object channel = assignParameter(args, 0, true);
        if (null == channel) {
            channel = ZVal.getNull();
        }
        Object username = assignParameter(args, 1, true);
        if (null == username) {
            username = ZVal.getNull();
        }
        Object useAttachment = assignParameter(args, 2, true);
        if (null == useAttachment) {
            useAttachment = true;
        }
        Object userIcon = assignParameter(args, 3, true);
        if (null == userIcon) {
            userIcon = ZVal.getNull();
        }
        Object useShortAttachment = assignParameter(args, 4, true);
        if (null == useShortAttachment) {
            useShortAttachment = false;
        }
        Object includeContextAndExtra = assignParameter(args, 5, true);
        if (null == includeContextAndExtra) {
            includeContextAndExtra = false;
        }
        Object excludeFields = assignParameter(args, 6, true);
        if (null == excludeFields) {
            excludeFields = ZVal.newArray();
        }
        Object formatter = assignParameter(args, 7, true);
        if (null == formatter) {
            formatter = ZVal.getNull();
        }
        this.channel = channel;
        this.username = username;
        this.userIcon = function_trim.f.env(env).call(userIcon, ":").value();
        this.useAttachment = useAttachment;
        this.useShortAttachment = useShortAttachment;
        this.includeContextAndExtra = includeContextAndExtra;
        this.excludeFields = excludeFields;
        this.formatter = formatter;
        if (ZVal.isTrue(this.includeContextAndExtra)) {
            this.normalizerFormatter = new NormalizerFormatter(env);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object getSlackData(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer dataArray = new BasicReferenceContainer(null);
        ReferenceContainer attachment = new BasicReferenceContainer(null);
        Object message = null;
        Object key = null;
        dataArray.setObject(ZVal.newArray());
        record.setObject(this.excludeFields(env, record.getObject()));
        if (ZVal.isTrue(this.username)) {
            dataArray.arrayAccess(env, "username").set(this.username);
        }

        if (ZVal.isTrue(this.channel)) {
            dataArray.arrayAccess(env, "channel").set(this.channel);
        }

        if (ZVal.toBool(this.formatter) && ZVal.toBool(!ZVal.isTrue(this.useAttachment))) {
            message =
                    env.callMethod(this.formatter, "format", SlackRecord.class, record.getObject());

        } else {
            message = ZVal.assign(record.arrayGet(env, "message"));
        }

        if (ZVal.isTrue(this.useAttachment)) {
            attachment.setObject(
                    ZVal.newArray(
                            new ZPair("fallback", message),
                            new ZPair("text", message),
                            new ZPair(
                                    "color",
                                    this.getAttachmentColor(env, record.arrayGet(env, "level"))),
                            new ZPair("fields", ZVal.newArray()),
                            new ZPair("mrkdwn_in", ZVal.arrayFromList("fields")),
                            new ZPair(
                                    "ts",
                                    env.callMethod(
                                            record.arrayGet(env, "datetime"),
                                            "getTimestamp",
                                            SlackRecord.class))));
            if (ZVal.isTrue(this.useShortAttachment)) {
                attachment.arrayAccess(env, "title").set(record.arrayGet(env, "level_name"));

            } else {
                attachment.arrayAccess(env, "title").set("Message");
                attachment
                        .arrayAppend(env, "fields")
                        .set(
                                this.generateAttachmentField(
                                        env, "Level", record.arrayGet(env, "level_name")));
            }

            if (ZVal.isTrue(this.includeContextAndExtra)) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult804 :
                        ZVal.getIterable(ZVal.arrayFromList("extra", "context"), env, true)) {
                    key = ZVal.assign(zpairResult804.getValue());
                    if (arrayActionR(ArrayAction.EMPTY, record, env, key)) {
                        continue;
                    }

                    if (ZVal.isTrue(this.useShortAttachment)) {
                        attachment
                                .arrayAppend(env, "fields")
                                .set(
                                        this.generateAttachmentField(
                                                env,
                                                NamespaceGlobal.ucfirst.env(env).call(key).value(),
                                                record.arrayGet(env, key)));

                    } else {
                        attachment
                                .arrayAccess(env, "fields")
                                .set(
                                        function_array_merge
                                                .f
                                                .env(env)
                                                .call(
                                                        attachment.arrayGet(env, "fields"),
                                                        this.generateAttachmentFields(
                                                                env, record.arrayGet(env, key)))
                                                .value());
                    }
                }
            }

            dataArray
                    .arrayAccess(env, "attachments")
                    .set(ZVal.newArray(new ZPair(0, attachment.getObject())));

        } else {
            dataArray.arrayAccess(env, "text").set(message);
        }

        if (ZVal.isTrue(this.userIcon)) {
            if (function_filter_var.f.env(env).call(this.userIcon, 273).getBool()) {
                dataArray.arrayAccess(env, "icon_url").set(this.userIcon);

            } else {
                dataArray
                        .arrayAccess(env, "icon_emoji")
                        .set(":" + toStringR(this.userIcon, env) + ":");
            }
        }

        return ZVal.assign(dataArray.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    public Object getAttachmentColor(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        SwitchEnumType40 switchVariable40 =
                ZVal.getEnum(
                        true,
                        SwitchEnumType40.DEFAULT_CASE,
                        SwitchEnumType40.DYNAMIC_TYPE_119,
                        ZVal.isGreaterThanOrEqualTo(level, ">=", Logger.CONST_ERROR),
                        SwitchEnumType40.DYNAMIC_TYPE_120,
                        ZVal.isGreaterThanOrEqualTo(level, ">=", Logger.CONST_WARNING),
                        SwitchEnumType40.DYNAMIC_TYPE_121,
                        ZVal.isGreaterThanOrEqualTo(level, ">=", Logger.CONST_INFO));
        switch (switchVariable40) {
            case DYNAMIC_TYPE_119:
                return ZVal.assign(CONST_COLOR_DANGER);
            case DYNAMIC_TYPE_120:
                return ZVal.assign(CONST_COLOR_WARNING);
            case DYNAMIC_TYPE_121:
                return ZVal.assign(CONST_COLOR_GOOD);
            case DEFAULT_CASE:
                return ZVal.assign(CONST_COLOR_DEFAULT);
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fields")
    public Object stringify(RuntimeEnv env, Object... args) {
        Object fields = assignParameter(args, 0, false);
        Object normalized = null;
        Object hasSecondDimension = null;
        Object prettyPrintFlag = null;
        Object hasNonNumericKeys = null;
        normalized = env.callMethod(this.normalizerFormatter, "format", SlackRecord.class, fields);
        prettyPrintFlag =
                ZVal.assign(
                        function_defined.f.env(env).call("JSON_PRETTY_PRINT").getBool()
                                ? 128
                                : 128);
        hasSecondDimension =
                function_count
                        .f
                        .env(env)
                        .call(function_array_filter.f.env(env).call(normalized, "is_array").value())
                        .value();
        hasNonNumericKeys =
                !function_count
                        .f
                        .env(env)
                        .call(
                                function_array_filter
                                        .f
                                        .env(env)
                                        .call(
                                                function_array_keys
                                                        .f
                                                        .env(env)
                                                        .call(normalized)
                                                        .value(),
                                                "is_numeric")
                                        .value())
                        .getBool();
        return ZVal.assign(
                ZVal.toBool(hasSecondDimension) || ZVal.toBool(hasNonNumericKeys)
                        ? NamespaceGlobal.json_encode
                                .env(env)
                                .call(normalized, prettyPrintFlag)
                                .value()
                        : NamespaceGlobal.json_encode.env(env).call(normalized).value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "formatter",
        typeHint = "Monolog\\Formatter\\FormatterInterface"
    )
    public Object setFormatter(RuntimeEnv env, Object... args) {
        Object formatter = assignParameter(args, 0, false);
        this.formatter = formatter;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "title")
    @ConvertedParameter(index = 1, name = "value")
    private Object generateAttachmentField(RuntimeEnv env, Object... args) {
        Object title = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        value =
                ZVal.assign(
                        function_is_array.f.env(env).call(value).getBool()
                                ? function_sprintf
                                        .f
                                        .env(env)
                                        .call("```%s```", this.stringify(env, value))
                                        .value()
                                : value);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("title", title),
                        new ZPair("value", value),
                        new ZPair("short", false)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    private Object generateAttachmentFields(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        ReferenceContainer fields = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        fields.setObject(ZVal.newArray());
        for (ZPair zpairResult805 : ZVal.getIterable(data, env, false)) {
            key = ZVal.assign(zpairResult805.getKey());
            value = ZVal.assign(zpairResult805.getValue());
            fields.arrayAppend(env).set(this.generateAttachmentField(env, key, value));
        }

        return ZVal.assign(fields.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    private Object excludeFields(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer node = new BasicReferenceContainer(null);
        Object field = null;
        Object keys = null;
        Object lastKey = null;
        Object key = null;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult806 : ZVal.getIterable(this.excludeFields, env, true)) {
            field = ZVal.assign(zpairResult806.getValue());
            keys = function_explode.f.env(env).call(".", field).value();
            node = record;
            lastKey = function_end.f.env(env).call(keys).value();
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult807 : ZVal.getIterable(keys, env, true)) {
                key = ZVal.assign(zpairResult807.getValue());
                if (!arrayActionR(ArrayAction.ISSET, node, env, key)) {
                    break;
                }

                if (ZVal.strictEqualityCheck(lastKey, "===", key)) {
                    arrayActionR(ArrayAction.UNSET, node, env, key);
                    break;
                }

                node = new ArrayDimensionReference(node.getObject(), key);
            }
        }

        return ZVal.assign(record.getObject());
    }

    public static final Object CONST_COLOR_DANGER = "danger";

    public static final Object CONST_COLOR_WARNING = "warning";

    public static final Object CONST_COLOR_GOOD = "good";

    public static final Object CONST_COLOR_DEFAULT = "#e3e4e6";

    public static final Object CONST_class = "Monolog\\Handler\\Slack\\SlackRecord";

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
                    .setName("Monolog\\Handler\\Slack\\SlackRecord")
                    .setLookup(
                            SlackRecord.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "channel",
                            "excludeFields",
                            "formatter",
                            "includeContextAndExtra",
                            "normalizerFormatter",
                            "useAttachment",
                            "useShortAttachment",
                            "userIcon",
                            "username")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/Slack/SlackRecord.php")
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

    private enum SwitchEnumType40 {
        DYNAMIC_TYPE_119,
        DYNAMIC_TYPE_120,
        DYNAMIC_TYPE_121,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
