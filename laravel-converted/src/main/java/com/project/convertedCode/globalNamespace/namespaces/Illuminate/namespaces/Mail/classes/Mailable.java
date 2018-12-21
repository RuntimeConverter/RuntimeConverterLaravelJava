package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionProperty;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Container.classes.Container;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Renderable;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Translation.classes.Translator;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.classes.Markdown;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_property_exists;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.functions.class_basename;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Collection;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.classes.SendQueuedMailable;
import com.project.convertedCode.globalNamespace.functions.collect;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Filesystem.classes.Factory;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.HtmlString;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Mail/Mailable.php

*/

public class Mailable extends RuntimeClassBase
        implements com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Contracts
                        .namespaces
                        .Mail
                        .classes
                        .Mailable,
                Renderable {

    public Object locale = null;

    public Object from = ZVal.newArray();

    public Object to = ZVal.newArray();

    public Object cc = ZVal.newArray();

    public Object bcc = ZVal.newArray();

    public Object replyTo = ZVal.newArray();

    public Object subject = null;

    public Object markdown = null;

    public Object html = null;

    public Object view = null;

    public Object textView = null;

    public Object viewData = ZVal.newArray();

    public Object attachments = ZVal.newArray();

    public Object rawAttachments = ZVal.newArray();

    public Object callbacks = ZVal.newArray();

    public Mailable(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Mailable(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "mailer",
        typeHint = "Illuminate\\Contracts\\Mail\\Mailer"
    )
    public Object send(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Mail")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Mail/Mailable.php");
        Object mailer = assignParameter(args, 0, false);
        Object translator = null;
        translator =
                env.callMethod(
                        Container.runtimeStaticObject.getInstance(env),
                        "make",
                        Mailable.class,
                        Translator.CONST_class);
        this.withLocale(
                env,
                this.locale,
                translator,
                new Closure(env, runtimeConverterFunctionClassConstants, "Illuminate\\Mail", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ContextConstants runtimeConverterFunctionClassConstants =
                                new ContextConstants()
                                        .setDir("/vendor/laravel/framework/src/Illuminate/Mail")
                                        .setFile(
                                                "/vendor/laravel/framework/src/Illuminate/Mail/Mailable.php");
                        Object _closureThisVar = this.getClosureThisVar();
                        PassByReferenceArgs rLastRefArgs;
                        Object mailer = null;
                        mailer = this.contextReferences.getCapturedValue("mailer");
                        env.callMethod(
                                Container.runtimeStaticObject.getInstance(env),
                                "call",
                                Mailable.class,
                                ZVal.newArray(
                                        new ZPair(0, _closureThisVar), new ZPair(1, "build")));
                        env.callMethod(
                                mailer,
                                rLastRefArgs =
                                        new RuntimeArgsWithReferences()
                                                .add(
                                                        1,
                                                        handleReturnReference(
                                                                Mailable.this.buildViewData(env))),
                                "send",
                                Mailable.class,
                                Mailable.this.buildView(env),
                                rLastRefArgs.get(1),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Mail",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "message")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object message = assignParameter(args, 0, false);
                                        env.callMethod(
                                                env.callMethod(
                                                        env.callMethod(
                                                                env.callMethod(
                                                                        Mailable.this.buildFrom(
                                                                                env, message),
                                                                        "buildRecipients",
                                                                        Mailable.class,
                                                                        message),
                                                                "buildSubject",
                                                                Mailable.class,
                                                                message),
                                                        "runCallbacks",
                                                        Mailable.class,
                                                        message),
                                                "buildAttachments",
                                                Mailable.class,
                                                message);
                                        return null;
                                    }
                                });
                        return null;
                    }
                }.use("mailer", mailer));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "queue",
        typeHint = "Illuminate\\Contracts\\Queue\\Factory"
    )
    public Object queue(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        Object queueName = null;
        Object connection = null;
        Object ternaryExpressionTemp = null;
        if (function_property_exists.f.env(env).call(this, "delay").getBool()) {
            return ZVal.assign(
                    this.later(
                            env,
                            toObjectR(this).accessProp(this, env).name("delay").value(),
                            queue));
        }

        connection =
                ZVal.assign(
                        function_property_exists.f.env(env).call(this, "connection").getBool()
                                ? toObjectR(this).accessProp(this, env).name("connection").value()
                                : ZVal.getNull());
        queueName =
                ZVal.assign(
                        function_property_exists.f.env(env).call(this, "queue").getBool()
                                ? toObjectR(this).accessProp(this, env).name("queue").value()
                                : ZVal.getNull());
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(queue, "connection", Mailable.class, connection),
                        "pushOn",
                        Mailable.class,
                        ZVal.isTrue(ternaryExpressionTemp = queueName)
                                ? ternaryExpressionTemp
                                : ZVal.getNull(),
                        new SendQueuedMailable(env, this)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay")
    @ConvertedParameter(
        index = 1,
        name = "queue",
        typeHint = "Illuminate\\Contracts\\Queue\\Factory"
    )
    public Object later(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, false);
        Object queue = assignParameter(args, 1, false);
        Object queueName = null;
        Object connection = null;
        Object ternaryExpressionTemp = null;
        connection =
                ZVal.assign(
                        function_property_exists.f.env(env).call(this, "connection").getBool()
                                ? toObjectR(this).accessProp(this, env).name("connection").value()
                                : ZVal.getNull());
        queueName =
                ZVal.assign(
                        function_property_exists.f.env(env).call(this, "queue").getBool()
                                ? toObjectR(this).accessProp(this, env).name("queue").value()
                                : ZVal.getNull());
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(queue, "connection", Mailable.class, connection),
                        "laterOn",
                        Mailable.class,
                        ZVal.isTrue(ternaryExpressionTemp = queueName)
                                ? ternaryExpressionTemp
                                : ZVal.getNull(),
                        delay,
                        new SendQueuedMailable(env, this)));
    }

    @ConvertedMethod
    public Object render(RuntimeEnv env, Object... args) {
        env.callMethod(
                Container.runtimeStaticObject.getInstance(env),
                "call",
                Mailable.class,
                ZVal.newArray(new ZPair(0, this), new ZPair(1, "build")));
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                Container.runtimeStaticObject.getInstance(env),
                                "make",
                                Mailable.class,
                                "mailer"),
                        "render",
                        Mailable.class,
                        this.buildView(env),
                        this.buildViewData(env)));
    }

    @ConvertedMethod
    protected Object buildView(RuntimeEnv env, Object... args) {
        if (ZVal.isset(this.html)) {
            return ZVal.assign(
                    function_array_filter
                            .f
                            .env(env)
                            .call(
                                    ZVal.newArray(
                                            new ZPair("html", new HtmlString(env, this.html)),
                                            new ZPair(
                                                    "text",
                                                    ZVal.isset(this.textView)
                                                            ? this.textView
                                                            : ZVal.getNull())))
                            .value());
        }

        if (ZVal.isset(this.markdown)) {
            return ZVal.assign(this.buildMarkdownView(env));
        }

        if (ZVal.toBool(ZVal.isset(this.view)) && ZVal.toBool(ZVal.isset(this.textView))) {
            return ZVal.assign(ZVal.newArray(new ZPair(0, this.view), new ZPair(1, this.textView)));

        } else if (ZVal.isset(this.textView)) {
            return ZVal.assign(ZVal.newArray(new ZPair("text", this.textView)));
        }

        return ZVal.assign(this.view);
    }

    @ConvertedMethod
    protected Object buildMarkdownView(RuntimeEnv env, Object... args) {
        Object data = null;
        Object markdown = null;
        markdown =
                env.callMethod(
                        Container.runtimeStaticObject.getInstance(env),
                        "make",
                        Mailable.class,
                        Markdown.CONST_class);
        if (ZVal.isset(toObjectR(this).accessProp(this, env).name("theme").value())) {
            env.callMethod(
                    markdown,
                    "theme",
                    Mailable.class,
                    toObjectR(this).accessProp(this, env).name("theme").value());
        }

        data = this.buildViewData(env);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "html",
                                env.callMethod(
                                        markdown, "render", Mailable.class, this.markdown, data)),
                        new ZPair("text", this.buildMarkdownText(env, markdown, data))));
    }

    @ConvertedMethod
    public Object buildViewData(RuntimeEnv env, Object... args) {
        ReferenceContainer data = new BasicReferenceContainer(null);
        Object property = null;
        data.setObject(ZVal.assign(this.viewData));
        for (ZPair zpairResult482 :
                ZVal.getIterable(
                        env.callMethod(
                                new ReflectionClass(env, this),
                                "getProperties",
                                Mailable.class,
                                256),
                        env,
                        true)) {
            property = ZVal.assign(zpairResult482.getValue());
            if (ZVal.strictNotEqualityCheck(
                    env.callMethod(
                            env.callMethod(property, "getDeclaringClass", Mailable.class),
                            "getName",
                            Mailable.class),
                    "!==",
                    CONST_class)) {
                data.arrayAccess(env, env.callMethod(property, "getName", Mailable.class))
                        .set(env.callMethod(property, "getValue", Mailable.class, this));
            }
        }

        return ZVal.assign(data.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "markdown")
    @ConvertedParameter(index = 1, name = "data")
    protected Object buildMarkdownText(RuntimeEnv env, Object... args) {
        Object markdown = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(ternaryExpressionTemp = this.textView)
                        ? ternaryExpressionTemp
                        : env.callMethod(
                                markdown, "renderText", Mailable.class, this.markdown, data));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    protected Object buildFrom(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        if (!ZVal.isEmpty(this.from)) {
            env.callMethod(
                    message,
                    "from",
                    Mailable.class,
                    new ReferenceClassProperty(this, "from", env).arrayGet(env, 0, "address"),
                    new ReferenceClassProperty(this, "from", env).arrayGet(env, 0, "name"));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    protected Object buildRecipients(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        ReferenceContainer recipient = new BasicReferenceContainer(null);
        Object type = null;
        for (ZPair zpairResult483 :
                ZVal.getIterable(ZVal.arrayFromList("to", "cc", "bcc", "replyTo"), env, true)) {
            type = ZVal.assign(zpairResult483.getValue());
            for (ZPair zpairResult484 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name(type).value(), env, true)) {
                recipient.setObject(ZVal.assign(zpairResult484.getValue()));
                env.callMethod(
                        message,
                        new RuntimeArgsWithReferences()
                                .add(
                                        0,
                                        new ArrayDimensionReference(
                                                recipient.getObject(), "address"))
                                .add(1, new ArrayDimensionReference(recipient.getObject(), "name")),
                        toStringR(type, env),
                        Mailable.class,
                        recipient.arrayGet(env, "address"),
                        recipient.arrayGet(env, "name"));
            }
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    protected Object buildSubject(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.subject)) {
            env.callMethod(message, "subject", Mailable.class, this.subject);

        } else {
            env.callMethod(
                    message,
                    "subject",
                    Mailable.class,
                    Str.runtimeStaticObject.title(
                            env,
                            Str.runtimeStaticObject.snake(
                                    env, class_basename.f.env(env).call(this).value(), " ")));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    protected Object buildAttachments(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        ReferenceContainer attachment = new BasicReferenceContainer(null);
        for (ZPair zpairResult485 : ZVal.getIterable(this.attachments, env, true)) {
            attachment.setObject(ZVal.assign(zpairResult485.getValue()));
            env.callMethod(
                    message,
                    "attach",
                    Mailable.class,
                    attachment.arrayGet(env, "file"),
                    attachment.arrayGet(env, "options"));
        }

        for (ZPair zpairResult486 : ZVal.getIterable(this.rawAttachments, env, true)) {
            attachment.setObject(ZVal.assign(zpairResult486.getValue()));
            env.callMethod(
                    message,
                    "attachData",
                    Mailable.class,
                    attachment.arrayGet(env, "data"),
                    attachment.arrayGet(env, "name"),
                    attachment.arrayGet(env, "options"));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    protected Object runCallbacks(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object message = assignParameter(args, 0, false);
        Object callback = null;
        for (ZPair zpairResult487 : ZVal.getIterable(this.callbacks, env, true)) {
            callback = ZVal.assign(zpairResult487.getValue());
            env.callFunctionDynamic(
                    callback,
                    rLastRefArgs =
                            new RuntimeArgsWithReferences()
                                    .add(
                                            0,
                                            handleReturnReference(
                                                    env.callMethod(
                                                            message,
                                                            "getSwiftMessage",
                                                            Mailable.class))),
                    rLastRefArgs.get(0));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    public Object locale(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        this.locale = locale;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level", defaultValue = "3", defaultValueType = "number")
    public Object priority(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Mail")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Mail/Mailable.php");
        Object level = assignParameter(args, 0, true);
        if (null == level) {
            level = 3;
        }
        new ReferenceClassProperty(this, "callbacks", env)
                .arrayAppend(env)
                .set(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Mail",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "message")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object message = assignParameter(args, 0, false);
                                Object level = null;
                                level = this.contextReferences.getCapturedValue("level");
                                env.callMethod(message, "setPriority", Mailable.class, level);
                                return null;
                            }
                        }.use("level", level));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object from(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        return ZVal.assign(this.setAddress(env, address, name, "from"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object hasFrom(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        return ZVal.assign(this.hasRecipient(env, address, name, "from"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object to(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        return ZVal.assign(this.setAddress(env, address, name, "to"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object hasTo(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        return ZVal.assign(this.hasRecipient(env, address, name, "to"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object cc(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        return ZVal.assign(this.setAddress(env, address, name, "cc"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object hasCc(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        return ZVal.assign(this.hasRecipient(env, address, name, "cc"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object bcc(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        return ZVal.assign(this.setAddress(env, address, name, "bcc"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object hasBcc(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        return ZVal.assign(this.hasRecipient(env, address, name, "bcc"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object replyTo(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        return ZVal.assign(this.setAddress(env, address, name, "replyTo"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object hasReplyTo(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        return ZVal.assign(this.hasRecipient(env, address, name, "replyTo"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "property")
    protected Object setAddress(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object property = assignParameter(args, 2, true);
        if (null == property) {
            property = "to";
        }
        Object recipient = null;
        Object ternaryExpressionTemp = null;
        for (ZPair zpairResult488 :
                ZVal.getIterable(this.addressesToArray(env, address, name), env, true)) {
            recipient = ZVal.assign(zpairResult488.getValue());
            recipient = this.normalizeRecipient(env, recipient);
            new ReferenceClassProperty(this, property, env)
                    .arrayAppend(env)
                    .set(
                            ZVal.newArray(
                                    new ZPair(
                                            "name",
                                            ZVal.isDefined(
                                                            ternaryExpressionTemp =
                                                                    toObjectR(recipient)
                                                                            .accessProp(this, env)
                                                                            .name("name")
                                                                            .value())
                                                    ? ternaryExpressionTemp
                                                    : ZVal.getNull()),
                                    new ZPair(
                                            "address",
                                            toObjectR(recipient)
                                                    .accessProp(this, env)
                                                    .name("email")
                                                    .value())));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(index = 1, name = "name")
    protected Object addressesToArray(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        if (ZVal.toBool(!function_is_array.f.env(env).call(address).getBool())
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        address,
                                        Collection.class,
                                        "Illuminate\\Support\\Collection")))) {
            address =
                    ZVal.assign(
                            function_is_string.f.env(env).call(name).getBool()
                                    ? ZVal.newArray(
                                            new ZPair(
                                                    0,
                                                    ZVal.newArray(
                                                            new ZPair("name", name),
                                                            new ZPair("email", address))))
                                    : ZVal.newArray(new ZPair(0, address)));
        }

        return ZVal.assign(address);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "recipient")
    protected Object normalizeRecipient(RuntimeEnv env, Object... args) {
        Object recipient = assignParameter(args, 0, false);
        if (function_is_array.f.env(env).call(recipient).getBool()) {
            return ZVal.assign(toObjectR(recipient));

        } else if (function_is_string.f.env(env).call(recipient).getBool()) {
            return ZVal.assign(toObjectR(ZVal.newArray(new ZPair("email", recipient))));
        }

        return ZVal.assign(recipient);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "property")
    protected Object hasRecipient(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Mail")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Mail/Mailable.php");
        Object address = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object property = assignParameter(args, 2, true);
        if (null == property) {
            property = "to";
        }
        Object expected = null;
        Object ternaryExpressionTemp = null;
        expected =
                this.normalizeRecipient(
                        env,
                        handleReturnReference(this.addressesToArray(env, address, name))
                                .arrayGet(env, 0));
        expected =
                ZVal.newArray(
                        new ZPair(
                                "name",
                                ZVal.isDefined(
                                                ternaryExpressionTemp =
                                                        toObjectR(expected)
                                                                .accessProp(this, env)
                                                                .name("name")
                                                                .value())
                                        ? ternaryExpressionTemp
                                        : ZVal.getNull()),
                        new ZPair(
                                "address",
                                toObjectR(expected).accessProp(this, env).name("email").value()));
        return ZVal.assign(
                env.callMethod(
                        collect.f
                                .env(env)
                                .call(toObjectR(this).accessProp(this, env).name(property).value())
                                .value(),
                        new RuntimeArgsWithReferences(),
                        "contains",
                        Mailable.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Mail",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "actual")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                ReferenceContainer actual =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 0, false));
                                ReferenceContainer expected = new BasicReferenceContainer(null);
                                expected = this.contextReferences.getReferenceContainer("expected");
                                if (!arrayActionR(ArrayAction.ISSET, expected, env, "name")) {
                                    return ZVal.assign(
                                            ZVal.equalityCheck(
                                                    actual.arrayGet(env, "address"),
                                                    expected.arrayGet(env, "address")));
                                }

                                return ZVal.assign(
                                        ZVal.equalityCheck(
                                                actual.getObject(), expected.getObject()));
                            }
                        }.use("expected", expected)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "subject")
    public Object subject(RuntimeEnv env, Object... args) {
        Object subject = assignParameter(args, 0, false);
        this.subject = subject;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view")
    @ConvertedParameter(
        index = 1,
        name = "data",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object markdown(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        this.markdown = view;
        this.viewData = function_array_merge.f.env(env).call(this.viewData, data).value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view")
    @ConvertedParameter(
        index = 1,
        name = "data",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object view(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        this.view = view;
        this.viewData = function_array_merge.f.env(env).call(this.viewData, data).value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "html")
    public Object html(RuntimeEnv env, Object... args) {
        Object html = assignParameter(args, 0, false);
        this.html = html;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "textView")
    @ConvertedParameter(
        index = 1,
        name = "data",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object text(RuntimeEnv env, Object... args) {
        Object textView = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        this.textView = textView;
        this.viewData = function_array_merge.f.env(env).call(this.viewData, data).value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object with(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        if (function_is_array.f.env(env).call(key).getBool()) {
            this.viewData = function_array_merge.f.env(env).call(this.viewData, key).value();

        } else {
            new ReferenceClassProperty(this, "viewData", env).arrayAccess(env, key).set(value);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object attach(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope142 scope = new Scope142();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Mail")
                            .setFile("/vendor/laravel/framework/src/Illuminate/Mail/Mailable.php");
            scope.file = assignParameter(args, 0, false);
            scope.options = assignParameter(args, 1, true);
            if (null == scope.options) {
                scope.options = ZVal.newArray();
            }
            new ReferenceClassProperty(scope._thisVarAlias, "attachments", env)
                    .arrayAppend(env)
                    .set(function_compact.f.env(env).call(stack, "file", "options").value());
            throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object attachFromStorage(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        return ZVal.assign(this.attachFromStorageDisk(env, ZVal.getNull(), path, name, options));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "disk")
    @ConvertedParameter(index = 1, name = "path")
    @ConvertedParameter(
        index = 2,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object attachFromStorageDisk(RuntimeEnv env, Object... args) {
        Object disk = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        Object name = assignParameter(args, 2, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object options = assignParameter(args, 3, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object ternaryExpressionTemp = null;
        Object storage = null;
        storage =
                env.callMethod(
                        env.callMethod(
                                Container.runtimeStaticObject.getInstance(env),
                                "make",
                                Mailable.class,
                                Factory.CONST_class),
                        "disk",
                        Mailable.class,
                        disk);
        return ZVal.assign(
                this.attachData(
                        env,
                        env.callMethod(storage, "get", Mailable.class, path),
                        ZVal.isDefined(ternaryExpressionTemp = name)
                                ? ternaryExpressionTemp
                                : NamespaceGlobal.basename.env(env).call(path).value(),
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        ZVal.newArray(
                                                new ZPair(
                                                        "mime",
                                                        env.callMethod(
                                                                storage,
                                                                "mimeType",
                                                                Mailable.class,
                                                                path))),
                                        options)
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object attachData(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope143 scope = new Scope143();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Mail")
                            .setFile("/vendor/laravel/framework/src/Illuminate/Mail/Mailable.php");
            scope.data = assignParameter(args, 0, false);
            scope.name = assignParameter(args, 1, false);
            scope.options = assignParameter(args, 2, true);
            if (null == scope.options) {
                scope.options = ZVal.newArray();
            }
            new ReferenceClassProperty(scope._thisVarAlias, "rawAttachments", env)
                    .arrayAppend(env)
                    .set(
                            function_compact
                                    .f
                                    .env(env)
                                    .call(stack, "data", "name", "options")
                                    .value());
            throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object withSwiftMessage(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "callbacks", env).arrayAppend(env).set(callback);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        if (ZVal.isTrue(Str.runtimeStaticObject.startsWith(env, method, "with"))) {
            return ZVal.assign(
                    this.with(
                            env,
                            Str.runtimeStaticObject.snake(
                                    env, function_substr.f.env(env).call(method, 4).value()),
                            parameters.arrayGet(env, 0)));
        }

        throw ZVal.getException(
                env,
                new BadMethodCallException(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Method %s::%s does not exist.",
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "class"),
                                        method)
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    @ConvertedParameter(index = 1, name = "translator")
    @ConvertedParameter(index = 2, name = "callback")
    public Object withLocale(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        Object translator = assignParameter(args, 1, false);
        Object callback = assignParameter(args, 2, false);
        Object original = null;
        if (ZVal.toBool(!ZVal.isTrue(locale)) || ZVal.toBool(!ZVal.isTrue(translator))) {
            return ZVal.assign(
                    env.callFunctionDynamic(callback, new RuntimeArgsWithReferences()).value());
        }

        original = env.callMethod(translator, "getLocale", Mailable.class);
        try {
            env.callMethod(translator, "setLocale", Mailable.class, locale);
            return ZVal.assign(
                    env.callFunctionDynamic(callback, new RuntimeArgsWithReferences()).value());
        } catch (ConvertedException convertedException46) {

            throw convertedException46;
        } finally {
            env.callMethod(translator, "setLocale", Mailable.class, original);
        }
    }

    public static final Object CONST_class = "Illuminate\\Mail\\Mailable";

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
                    .setName("Illuminate\\Mail\\Mailable")
                    .setLookup(
                            Mailable.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "attachments",
                            "bcc",
                            "callbacks",
                            "cc",
                            "from",
                            "html",
                            "locale",
                            "markdown",
                            "rawAttachments",
                            "replyTo",
                            "subject",
                            "textView",
                            "to",
                            "view",
                            "viewData")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Mail/Mailable.php")
                    .addInterface("Illuminate\\Contracts\\Mail\\Mailable")
                    .addInterface("Illuminate\\Contracts\\Support\\Renderable")
                    .addTrait("Illuminate\\Support\\Traits\\Localizable")
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

    private static class Scope142 implements UpdateRuntimeScopeInterface {

        Object file;
        Object _thisVarAlias;
        Object options;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("file", this.file);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("options", this.options);
        }

        public void updateScope(RuntimeStack stack) {

            this.file = stack.getVariable("file");
            this._thisVarAlias = stack.getVariable("this");
            this.options = stack.getVariable("options");
        }
    }

    private static class Scope143 implements UpdateRuntimeScopeInterface {

        Object data;
        Object _thisVarAlias;
        Object name;
        Object options;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("data", this.data);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("name", this.name);
            stack.setVariable("options", this.options);
        }

        public void updateScope(RuntimeStack stack) {

            this.data = stack.getVariable("data");
            this._thisVarAlias = stack.getVariable("this");
            this.name = stack.getVariable("name");
            this.options = stack.getVariable("options");
        }
    }
}
