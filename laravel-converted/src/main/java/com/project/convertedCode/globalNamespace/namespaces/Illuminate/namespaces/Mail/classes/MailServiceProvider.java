package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.project.convertedCode.globalNamespace.classes.Swift_DependencyContainer;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.classes.Markdown;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.project.convertedCode.globalNamespace.classes.Swift_Mailer;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.classes.Mailer;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ServiceProvider;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.classes.TransportManager;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Mail/MailServiceProvider.php

*/

public class MailServiceProvider extends ServiceProvider {

    public MailServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.defer = true;
        if (this.getClass() == MailServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public MailServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        this.registerSwiftMailer(env);
        this.registerIlluminateMailer(env);
        this.registerMarkdownRenderer(env);
        return null;
    }

    @ConvertedMethod
    protected Object registerIlluminateMailer(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Mail")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Mail/MailServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                MailServiceProvider.class,
                "mailer",
                new Closure(env, runtimeConverterFunctionClassConstants, "Illuminate\\Mail", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        ReferenceContainer app =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        Object mailer = null;
                        Object type = null;
                        Object config = null;
                        config =
                                env.callMethod(
                                        env.callMethod(
                                                app.getObject(),
                                                "make",
                                                MailServiceProvider.class,
                                                "config"),
                                        "get",
                                        MailServiceProvider.class,
                                        "mail");
                        mailer =
                                new Mailer(
                                        env,
                                        app.arrayGet(env, "view"),
                                        app.arrayGet(env, "swift.mailer"),
                                        app.arrayGet(env, "events"));
                        if (ZVal.isTrue(
                                env.callMethod(
                                        app.getObject(),
                                        "bound",
                                        MailServiceProvider.class,
                                        "queue"))) {
                            env.callMethod(
                                    mailer,
                                    "setQueue",
                                    MailServiceProvider.class,
                                    app.arrayGet(env, "queue"));
                        }

                        for (ZPair zpairResult481 :
                                ZVal.getIterable(
                                        ZVal.arrayFromList("from", "reply_to", "to"), env, true)) {
                            type = ZVal.assign(zpairResult481.getValue());
                            MailServiceProvider.this.setGlobalAddress(env, mailer, config, type);
                        }

                        return ZVal.assign(mailer);
                    }
                });
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailer")
    @ConvertedParameter(index = 1, name = "config", typeHint = "array")
    @ConvertedParameter(index = 2, name = "type")
    protected Object setGlobalAddress(RuntimeEnv env, Object... args) {
        Object mailer = assignParameter(args, 0, false);
        Object config = assignParameter(args, 1, false);
        Object type = assignParameter(args, 2, false);
        ReferenceContainer address = new BasicReferenceContainer(null);
        address.setObject(Arr.runtimeStaticObject.get(env, config, type));
        if (ZVal.toBool(function_is_array.f.env(env).call(address.getObject()).value())
                && ZVal.toBool(arrayActionR(ArrayAction.ISSET, address, env, "address"))) {
            env.callMethod(
                    mailer,
                    new RuntimeArgsWithReferences()
                            .add(0, new ArrayDimensionReference(address.getObject(), "address"))
                            .add(1, new ArrayDimensionReference(address.getObject(), "name")),
                    "always" + toStringR(Str.runtimeStaticObject.studly(env, type), env),
                    MailServiceProvider.class,
                    address.arrayGet(env, "address"),
                    address.arrayGet(env, "name"));
        }

        return null;
    }

    @ConvertedMethod
    public Object registerSwiftMailer(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Mail")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Mail/MailServiceProvider.php");
        this.registerSwiftTransport(env);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                MailServiceProvider.class,
                "swift.mailer",
                new Closure(env, runtimeConverterFunctionClassConstants, "Illuminate\\Mail", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ReferenceContainer app =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        Object domain = null;
                        if (ZVal.isTrue(
                                domain =
                                        env.callMethod(
                                                env.callMethod(
                                                        app.getObject(),
                                                        "make",
                                                        MailServiceProvider.class,
                                                        "config"),
                                                "get",
                                                MailServiceProvider.class,
                                                "mail.domain"))) {
                            env.callMethod(
                                    env.callMethod(
                                            Swift_DependencyContainer.runtimeStaticObject
                                                    .getInstance(env),
                                            "register",
                                            MailServiceProvider.class,
                                            "mime.idgenerator.idright"),
                                    "asValue",
                                    MailServiceProvider.class,
                                    domain);
                        }

                        return ZVal.assign(
                                new Swift_Mailer(
                                        env,
                                        env.callMethod(
                                                app.arrayGet(env, "swift.transport"),
                                                "driver",
                                                MailServiceProvider.class)));
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object registerSwiftTransport(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Mail")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Mail/MailServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                MailServiceProvider.class,
                "swift.transport",
                new Closure(env, runtimeConverterFunctionClassConstants, "Illuminate\\Mail", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object app = assignParameter(args, 0, false);
                        return ZVal.assign(new TransportManager(env, app));
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object registerMarkdownRenderer(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Mail")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Mail/MailServiceProvider.php");
        if (ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("app").value(),
                        "runningInConsole",
                        MailServiceProvider.class))) {
            env.callMethod(
                    this,
                    "publishes",
                    MailServiceProvider.class,
                    ZVal.newArray(
                            new ZPair(
                                    toStringR(
                                                    env.addRootFilesystemPrefix(
                                                            "/vendor/laravel/framework/src/Illuminate/Mail"),
                                                    env)
                                            + "/resources/views",
                                    env.callMethod(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("app")
                                                    .value(),
                                            "resourcePath",
                                            MailServiceProvider.class,
                                            "views/vendor/mail"))),
                    "laravel-mail");
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                MailServiceProvider.class,
                Markdown.CONST_class,
                new Closure(env, runtimeConverterFunctionClassConstants, "Illuminate\\Mail", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object app = assignParameter(args, 0, false);
                        Object config = null;
                        config = env.callMethod(app, "make", MailServiceProvider.class, "config");
                        return ZVal.assign(
                                new Markdown(
                                        env,
                                        env.callMethod(
                                                app, "make", MailServiceProvider.class, "view"),
                                        ZVal.newArray(
                                                new ZPair(
                                                        "theme",
                                                        env.callMethod(
                                                                config,
                                                                "get",
                                                                MailServiceProvider.class,
                                                                "mail.markdown.theme",
                                                                "default")),
                                                new ZPair(
                                                        "paths",
                                                        env.callMethod(
                                                                config,
                                                                "get",
                                                                MailServiceProvider.class,
                                                                "mail.markdown.paths",
                                                                ZVal.newArray())))));
                    }
                });
        return null;
    }

    @ConvertedMethod
    public Object provides(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(0, "mailer"),
                        new ZPair(1, "swift.mailer"),
                        new ZPair(2, "swift.transport"),
                        new ZPair(3, Markdown.CONST_class)));
    }

    public static final Object CONST_class = "Illuminate\\Mail\\MailServiceProvider";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ServiceProvider.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Mail\\MailServiceProvider")
                    .setLookup(
                            MailServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer", "defer")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Mail/MailServiceProvider.php")
                    .addExtendsClass("Illuminate\\Support\\ServiceProvider")
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
