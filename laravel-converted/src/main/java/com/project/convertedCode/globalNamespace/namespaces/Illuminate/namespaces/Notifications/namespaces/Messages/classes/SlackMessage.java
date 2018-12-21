package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Messages.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Messages.classes.SlackAttachment;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Notifications/Messages/SlackMessage.php

*/

public class SlackMessage extends RuntimeClassBase {

    public Object level = "info";

    public Object username = null;

    public Object icon = null;

    public Object image = null;

    public Object channel = null;

    public Object content = null;

    public Object linkNames = 0;

    public Object unfurlLinks = null;

    public Object unfurlMedia = null;

    public Object attachments = ZVal.newArray();

    public Object http = ZVal.newArray();

    public SlackMessage(RuntimeEnv env, Object... args) {
        super(env);
    }

    public SlackMessage(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object info(RuntimeEnv env, Object... args) {
        this.level = "info";
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object success(RuntimeEnv env, Object... args) {
        this.level = "success";
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object warning(RuntimeEnv env, Object... args) {
        this.level = "warning";
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object error(RuntimeEnv env, Object... args) {
        this.level = "error";
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "username")
    @ConvertedParameter(
        index = 1,
        name = "icon",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object from(RuntimeEnv env, Object... args) {
        Object username = assignParameter(args, 0, false);
        Object icon = assignParameter(args, 1, true);
        if (null == icon) {
            icon = ZVal.getNull();
        }
        this.username = username;
        if (!function_is_null.f.env(env).call(icon).getBool()) {
            this.icon = icon;
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "image")
    public Object image(RuntimeEnv env, Object... args) {
        Object image = assignParameter(args, 0, false);
        this.image = image;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "channel")
    public Object to(RuntimeEnv env, Object... args) {
        Object channel = assignParameter(args, 0, false);
        this.channel = channel;
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
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    public Object attachment(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        ReferenceContainer attachment = new BasicReferenceContainer(null);
        new ReferenceClassProperty(this, "attachments", env)
                .arrayAppend(env)
                .set(attachment.setObject(new SlackAttachment(env)));
        env.callFunctionDynamic(
                callback,
                new RuntimeArgsWithReferences().add(0, attachment),
                attachment.getObject());
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object color(RuntimeEnv env, Object... args) {
        switch (toStringR(this.level)) {
            case "success":
                return "good";
            case "error":
                return "danger";
            case "warning":
                return "warning";
        }
        ;
        return null;
    }

    @ConvertedMethod
    public Object linkNames(RuntimeEnv env, Object... args) {
        this.linkNames = 1;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "unfurl")
    public Object unfurlLinks(RuntimeEnv env, Object... args) {
        Object unfurl = assignParameter(args, 0, false);
        this.unfurlLinks = unfurl;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "unfurl")
    public Object unfurlMedia(RuntimeEnv env, Object... args) {
        Object unfurl = assignParameter(args, 0, false);
        this.unfurlMedia = unfurl;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", typeHint = "array")
    public Object http(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, false);
        this.http = options;
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Illuminate\\Notifications\\Messages\\SlackMessage";

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
                    .setName("Illuminate\\Notifications\\Messages\\SlackMessage")
                    .setLookup(
                            SlackMessage.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "attachments",
                            "channel",
                            "content",
                            "http",
                            "icon",
                            "image",
                            "level",
                            "linkNames",
                            "unfurlLinks",
                            "unfurlMedia",
                            "username")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Notifications/Messages/SlackMessage.php")
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
