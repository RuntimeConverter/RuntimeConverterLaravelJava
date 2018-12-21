package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Messages.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeClasses.date.DateInterval;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Messages.classes.SlackAttachmentField;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Notifications/Messages/SlackAttachment.php

*/

public class SlackAttachment extends RuntimeClassBase {

    public Object title = null;

    public Object url = null;

    public Object pretext = null;

    public Object content = null;

    public Object fallback = null;

    public Object color = null;

    public Object fields = null;

    public Object markdown = null;

    public Object imageUrl = null;

    public Object thumbUrl = null;

    public Object authorName = null;

    public Object authorLink = null;

    public Object authorIcon = null;

    public Object footer = null;

    public Object footerIcon = null;

    public Object timestamp = null;

    public SlackAttachment(RuntimeEnv env, Object... args) {
        super(env);
    }

    public SlackAttachment(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "title")
    @ConvertedParameter(
        index = 1,
        name = "url",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object title(RuntimeEnv env, Object... args) {
        Object title = assignParameter(args, 0, false);
        Object url = assignParameter(args, 1, true);
        if (null == url) {
            url = ZVal.getNull();
        }
        this.title = title;
        this.url = url;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pretext")
    public Object pretext(RuntimeEnv env, Object... args) {
        Object pretext = assignParameter(args, 0, false);
        this.pretext = pretext;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    public Object content(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        this.content = content;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fallback")
    public Object fallback(RuntimeEnv env, Object... args) {
        Object fallback = assignParameter(args, 0, false);
        this.fallback = fallback;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "color")
    public Object color(RuntimeEnv env, Object... args) {
        Object color = assignParameter(args, 0, false);
        this.color = color;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "title")
    @ConvertedParameter(index = 1, name = "content")
    public Object field(RuntimeEnv env, Object... args) {
        Object title = assignParameter(args, 0, false);
        Object content = assignParameter(args, 1, true);
        if (null == content) {
            content = "";
        }
        Object callback = null;
        Object attachmentField = null;
        if (function_is_callable.f.env(env).call(title).getBool()) {
            callback = ZVal.assign(title);
            env.callFunctionDynamic(
                    callback,
                    new RuntimeArgsWithReferences(),
                    attachmentField = new SlackAttachmentField(env));
            new ReferenceClassProperty(this, "fields", env).arrayAppend(env).set(attachmentField);
            return ZVal.assign(this);
        }

        new ReferenceClassProperty(this, "fields", env).arrayAccess(env, title).set(content);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fields", typeHint = "array")
    public Object fields(RuntimeEnv env, Object... args) {
        Object fields = assignParameter(args, 0, false);
        this.fields = fields;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fields", typeHint = "array")
    public Object markdown(RuntimeEnv env, Object... args) {
        Object fields = assignParameter(args, 0, false);
        this.markdown = fields;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "url")
    public Object image(RuntimeEnv env, Object... args) {
        Object url = assignParameter(args, 0, false);
        this.imageUrl = url;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "url")
    public Object thumb(RuntimeEnv env, Object... args) {
        Object url = assignParameter(args, 0, false);
        this.thumbUrl = url;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "link",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "icon",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object author(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object link = assignParameter(args, 1, true);
        if (null == link) {
            link = ZVal.getNull();
        }
        Object icon = assignParameter(args, 2, true);
        if (null == icon) {
            icon = ZVal.getNull();
        }
        this.authorName = name;
        this.authorLink = link;
        this.authorIcon = icon;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "footer")
    public Object footer(RuntimeEnv env, Object... args) {
        Object footer = assignParameter(args, 0, false);
        this.footer = footer;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "icon")
    public Object footerIcon(RuntimeEnv env, Object... args) {
        Object icon = assignParameter(args, 0, false);
        this.footerIcon = icon;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "timestamp")
    public Object timestamp(RuntimeEnv env, Object... args) {
        Object timestamp = assignParameter(args, 0, false);
        this.timestamp = this.availableAt(env, timestamp);
        return ZVal.assign(this);
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
                                                env.callMethod(
                                                        delay,
                                                        "getTimestamp",
                                                        SlackAttachment.class),
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
                        ? env.callMethod(delay, "getTimestamp", SlackAttachment.class)
                        : env.callMethod(
                                env.callMethod(
                                        Carbon.runtimeStaticObject.now(env),
                                        "addSeconds",
                                        SlackAttachment.class,
                                        delay),
                                "getTimestamp",
                                SlackAttachment.class));
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
                            SlackAttachment.class,
                            delay.getObject()));
        }

        return ZVal.assign(delay.getObject());
    }

    @ConvertedMethod
    protected Object currentTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        Carbon.runtimeStaticObject.now(env),
                        "getTimestamp",
                        SlackAttachment.class));
    }

    public static final Object CONST_class = "Illuminate\\Notifications\\Messages\\SlackAttachment";

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
                    .setName("Illuminate\\Notifications\\Messages\\SlackAttachment")
                    .setLookup(
                            SlackAttachment.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "authorIcon",
                            "authorLink",
                            "authorName",
                            "color",
                            "content",
                            "fallback",
                            "fields",
                            "footer",
                            "footerIcon",
                            "imageUrl",
                            "markdown",
                            "pretext",
                            "thumbUrl",
                            "timestamp",
                            "title",
                            "url")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Notifications/Messages/SlackAttachment.php")
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
