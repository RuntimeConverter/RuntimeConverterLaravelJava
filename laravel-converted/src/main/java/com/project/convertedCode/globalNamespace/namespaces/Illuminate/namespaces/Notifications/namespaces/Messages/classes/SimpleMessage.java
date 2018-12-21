package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.namespaces.Messages.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Notifications.classes.Action;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Htmlable;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Notifications/Messages/SimpleMessage.php

*/

public class SimpleMessage extends RuntimeClassBase {

    public Object level = "info";

    public Object subject = null;

    public Object greeting = null;

    public Object salutation = null;

    public Object introLines = ZVal.newArray();

    public Object outroLines = ZVal.newArray();

    public Object actionText = null;

    public Object actionUrl = null;

    public SimpleMessage(RuntimeEnv env, Object... args) {
        super(env);
    }

    public SimpleMessage(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object success(RuntimeEnv env, Object... args) {
        this.level = "success";
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object error(RuntimeEnv env, Object... args) {
        this.level = "error";
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    public Object level(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        this.level = level;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "subject")
    public Object subject(RuntimeEnv env, Object... args) {
        Object subject = assignParameter(args, 0, false);
        this.subject = subject;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "greeting")
    public Object greeting(RuntimeEnv env, Object... args) {
        Object greeting = assignParameter(args, 0, false);
        this.greeting = greeting;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "salutation")
    public Object salutation(RuntimeEnv env, Object... args) {
        Object salutation = assignParameter(args, 0, false);
        this.salutation = salutation;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line")
    public Object line(RuntimeEnv env, Object... args) {
        Object line = assignParameter(args, 0, false);
        return ZVal.assign(this.with(env, line));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line")
    public Object with(RuntimeEnv env, Object... args) {
        Object line = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(line, Action.class, "Illuminate\\Notifications\\Action"))) {
            this.action(
                    env,
                    toObjectR(line).accessProp(this, env).name("text").value(),
                    toObjectR(line).accessProp(this, env).name("url").value());

        } else if (!ZVal.isTrue(this.actionText)) {
            new ReferenceClassProperty(this, "introLines", env)
                    .arrayAppend(env)
                    .set(this.formatLine(env, line));

        } else {
            new ReferenceClassProperty(this, "outroLines", env)
                    .arrayAppend(env)
                    .set(this.formatLine(env, line));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line")
    protected Object formatLine(RuntimeEnv env, Object... args) {
        Object line = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        line, Htmlable.class, "Illuminate\\Contracts\\Support\\Htmlable"))) {
            return ZVal.assign(line);
        }

        if (function_is_array.f.env(env).call(line).getBool()) {
            return ZVal.assign(
                    NamespaceGlobal.implode
                            .env(env)
                            .call(" ", function_array_map.f.env(env).call("trim", line).value())
                            .value());
        }

        return ZVal.assign(
                function_trim
                        .f
                        .env(env)
                        .call(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                " ",
                                                function_array_map
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "trim",
                                                                NamespaceGlobal.preg_split
                                                                        .env(env)
                                                                        .call(
                                                                                "/\\r\\n|\\r|\\n/",
                                                                                line)
                                                                        .value())
                                                        .value())
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "text")
    @ConvertedParameter(index = 1, name = "url")
    public Object action(RuntimeEnv env, Object... args) {
        Object text = assignParameter(args, 0, false);
        Object url = assignParameter(args, 1, false);
        this.actionText = text;
        this.actionUrl = url;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object toArray(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("level", this.level),
                        new ZPair("subject", this.subject),
                        new ZPair("greeting", this.greeting),
                        new ZPair("salutation", this.salutation),
                        new ZPair("introLines", this.introLines),
                        new ZPair("outroLines", this.outroLines),
                        new ZPair("actionText", this.actionText),
                        new ZPair("actionUrl", this.actionUrl)));
    }

    public static final Object CONST_class = "Illuminate\\Notifications\\Messages\\SimpleMessage";

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
                    .setName("Illuminate\\Notifications\\Messages\\SimpleMessage")
                    .setLookup(
                            SimpleMessage.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "actionText",
                            "actionUrl",
                            "greeting",
                            "introLines",
                            "level",
                            "outroLines",
                            "salutation",
                            "subject")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Notifications/Messages/SimpleMessage.php")
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
