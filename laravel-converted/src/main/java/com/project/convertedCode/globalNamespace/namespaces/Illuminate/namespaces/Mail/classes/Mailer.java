package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.namespaces.Events.classes.MessageSent;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.classes.Message;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.classes.PendingMail;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.HtmlString;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Htmlable;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.namespaces.Events.classes.MessageSending;
import com.runtimeconverter.runtime.RuntimeStack;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Mail.classes.Mailable;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Mail.classes.MailQueue;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes.ShouldQueue;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Mail/Mailer.php

*/

public class Mailer extends RuntimeClassBase
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
                        .Mailer,
                MailQueue {

    public Object views = null;

    public Object swift = null;

    public Object events = null;

    public Object from = null;

    public Object replyTo = null;

    public Object to = null;

    public Object queue = null;

    public Object failedRecipients = ZVal.newArray();

    public Mailer(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Mailer.class) {
            this.__construct(env, args);
        }
    }

    public Mailer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "views",
        typeHint = "Illuminate\\Contracts\\View\\Factory"
    )
    @ConvertedParameter(index = 1, name = "swift", typeHint = "Swift_Mailer")
    @ConvertedParameter(
        index = 2,
        name = "events",
        typeHint = "Illuminate\\Contracts\\Events\\Dispatcher",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object views = assignParameter(args, 0, false);
        Object swift = assignParameter(args, 1, false);
        Object events = assignParameter(args, 2, true);
        if (null == events) {
            events = ZVal.getNull();
        }
        this.views = views;
        this.swift = swift;
        this.events = events;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object alwaysFrom(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope144 scope = new Scope144();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Mail")
                            .setFile("/vendor/laravel/framework/src/Illuminate/Mail/Mailer.php");
            scope.address = assignParameter(args, 0, false);
            scope.name = assignParameter(args, 1, true);
            if (null == scope.name) {
                scope.name = ZVal.getNull();
            }
            this.from = function_compact.f.env(env).call(stack, "address", "name").value();
            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object alwaysReplyTo(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope145 scope = new Scope145();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Mail")
                            .setFile("/vendor/laravel/framework/src/Illuminate/Mail/Mailer.php");
            scope.address = assignParameter(args, 0, false);
            scope.name = assignParameter(args, 1, true);
            if (null == scope.name) {
                scope.name = ZVal.getNull();
            }
            this.replyTo = function_compact.f.env(env).call(stack, "address", "name").value();
            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object alwaysTo(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope146 scope = new Scope146();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Mail")
                            .setFile("/vendor/laravel/framework/src/Illuminate/Mail/Mailer.php");
            scope.address = assignParameter(args, 0, false);
            scope.name = assignParameter(args, 1, true);
            if (null == scope.name) {
                scope.name = ZVal.getNull();
            }
            this.to = function_compact.f.env(env).call(stack, "address", "name").value();
            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "users")
    public Object to(RuntimeEnv env, Object... args) {
        Object users = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(new PendingMail(env, this), "to", Mailer.class, users));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "users")
    public Object bcc(RuntimeEnv env, Object... args) {
        Object users = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(new PendingMail(env, this), "bcc", Mailer.class, users));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "html")
    @ConvertedParameter(index = 1, name = "callback")
    public Object html(RuntimeEnv env, Object... args) {
        Object html = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        return ZVal.assign(
                this.send(
                        env,
                        ZVal.newArray(new ZPair("html", new HtmlString(env, html))),
                        ZVal.newArray(),
                        callback));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "text")
    @ConvertedParameter(index = 1, name = "callback")
    public Object raw(RuntimeEnv env, Object... args) {
        Object text = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        return ZVal.assign(
                this.send(env, ZVal.newArray(new ZPair("raw", text)), ZVal.newArray(), callback));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view")
    @ConvertedParameter(index = 1, name = "data", typeHint = "array")
    @ConvertedParameter(index = 2, name = "callback")
    public Object plain(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        Object callback = assignParameter(args, 2, false);
        return ZVal.assign(this.send(env, ZVal.newArray(new ZPair("text", view)), data, callback));
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
    public Object render(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, false);
        ReferenceContainer data = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == data.getObject()) {
            data.setObject(ZVal.newArray());
        }
        Object plain = null;
        Object raw = null;
        Object ternaryExpressionTemp = null;
        Object runtimeTempArrayResult65 = null;
        ZVal.list(
                runtimeTempArrayResult65 = this.parseView(env, view),
                (view = listGet(runtimeTempArrayResult65, 0, env)),
                (plain = listGet(runtimeTempArrayResult65, 1, env)),
                (raw = listGet(runtimeTempArrayResult65, 2, env)));
        data.arrayAccess(env, "message").set(this.createMessage(env));
        return ZVal.assign(
                this.renderView(
                        env,
                        ZVal.isTrue(ternaryExpressionTemp = view) ? ternaryExpressionTemp : plain,
                        data.getObject()));
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
    @ConvertedParameter(
        index = 2,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object send(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, false);
        ReferenceContainer data = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == data.getObject()) {
            data.setObject(ZVal.newArray());
        }
        Object callback = assignParameter(args, 2, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object plain = null;
        Object raw = null;
        Object message = null;
        Object runtimeTempArrayResult66 = null;
        Object swiftMessage = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        view, Mailable.class, "Illuminate\\Contracts\\Mail\\Mailable"))) {
            return ZVal.assign(this.sendMailable(env, view));
        }

        ZVal.list(
                runtimeTempArrayResult66 = this.parseView(env, view),
                (view = listGet(runtimeTempArrayResult66, 0, env)),
                (plain = listGet(runtimeTempArrayResult66, 1, env)),
                (raw = listGet(runtimeTempArrayResult66, 2, env)));
        data.arrayAccess(env, "message").set(message = this.createMessage(env));
        function_call_user_func
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                .call(callback, message);
        this.addContent(env, message, view, plain, raw, data.getObject());
        if (arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "to", env), env, "address")) {
            this.setGlobalTo(env, message);
        }

        swiftMessage = env.callMethod(message, "getSwiftMessage", Mailer.class);
        if (ZVal.isTrue(this.shouldSendMessage(env, swiftMessage, data.getObject()))) {
            this.sendSwiftMessage(env, swiftMessage);
            this.dispatchSentEvent(env, message, data.getObject());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "mailable",
        typeHint = "Illuminate\\Contracts\\Mail\\Mailable"
    )
    protected Object sendMailable(RuntimeEnv env, Object... args) {
        Object mailable = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        mailable,
                                        ShouldQueue.class,
                                        "Illuminate\\Contracts\\Queue\\ShouldQueue"))
                        ? env.callMethod(mailable, "queue", Mailer.class, this.queue)
                        : env.callMethod(mailable, "send", Mailer.class, this));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view")
    protected Object parseView(RuntimeEnv env, Object... args) {
        ReferenceContainer view = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        if (function_is_string.f.env(env).call(view.getObject()).getBool()) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, view.getObject()),
                            new ZPair(1, ZVal.getNull()),
                            new ZPair(2, ZVal.getNull())));
        }

        if (ZVal.toBool(function_is_array.f.env(env).call(view.getObject()).value())
                && ZVal.toBool(arrayActionR(ArrayAction.ISSET, view, env, 0))) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, view.arrayGet(env, 0)),
                            new ZPair(1, view.arrayGet(env, 1)),
                            new ZPair(2, ZVal.getNull())));
        }

        if (function_is_array.f.env(env).call(view.getObject()).getBool()) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    ZVal.isDefined(
                                                    ternaryExpressionTemp =
                                                            view.arrayGet(env, "html"))
                                            ? ternaryExpressionTemp
                                            : ZVal.getNull()),
                            new ZPair(
                                    1,
                                    ZVal.isDefined(
                                                    ternaryExpressionTemp =
                                                            view.arrayGet(env, "text"))
                                            ? ternaryExpressionTemp
                                            : ZVal.getNull()),
                            new ZPair(
                                    2,
                                    ZVal.isDefined(
                                                    ternaryExpressionTemp =
                                                            view.arrayGet(env, "raw"))
                                            ? ternaryExpressionTemp
                                            : ZVal.getNull())));
        }

        throw ZVal.getException(env, new InvalidArgumentException(env, "Invalid view."));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "view")
    @ConvertedParameter(index = 2, name = "plain")
    @ConvertedParameter(index = 3, name = "raw")
    @ConvertedParameter(index = 4, name = "data")
    protected Object addContent(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object message = assignParameter(args, 0, false);
        Object view = assignParameter(args, 1, false);
        Object plain = assignParameter(args, 2, false);
        ReferenceContainer raw = new BasicReferenceContainer(assignParameter(args, 3, false));
        Object data = assignParameter(args, 4, false);
        Object method = null;
        if (ZVal.isset(view)) {
            env.callMethod(
                    message,
                    "setBody",
                    Mailer.class,
                    this.renderView(env, view, data),
                    "text/html");
        }

        if (ZVal.isset(plain)) {
            method = ZVal.assign(ZVal.isset(view) ? "addPart" : "setBody");
            env.callMethod(
                    message,
                    rLastRefArgs =
                            new RuntimeArgsWithReferences()
                                    .add(
                                            0,
                                            handleReturnReference(
                                                    this.renderView(env, plain, data))),
                    toStringR(method, env),
                    Mailer.class,
                    rLastRefArgs.get(0),
                    "text/plain");
        }

        if (ZVal.isset(raw.getObject())) {
            method =
                    ZVal.assign(
                            ZVal.toBool(ZVal.isset(view)) || ZVal.toBool(ZVal.isset(plain))
                                    ? "addPart"
                                    : "setBody");
            env.callMethod(
                    message,
                    new RuntimeArgsWithReferences().add(0, raw),
                    toStringR(method, env),
                    Mailer.class,
                    raw.getObject(),
                    "text/plain");
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view")
    @ConvertedParameter(index = 1, name = "data")
    protected Object renderView(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        view,
                                        Htmlable.class,
                                        "Illuminate\\Contracts\\Support\\Htmlable"))
                        ? env.callMethod(view, "toHtml", Mailer.class)
                        : env.callMethod(
                                env.callMethod(this.views, "make", Mailer.class, view, data),
                                "render",
                                Mailer.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    protected Object setGlobalTo(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        env.callMethod(
                message,
                "to",
                Mailer.class,
                new ReferenceClassProperty(this, "to", env).arrayGet(env, "address"),
                new ReferenceClassProperty(this, "to", env).arrayGet(env, "name"),
                true);
        env.callMethod(message, "cc", Mailer.class, ZVal.getNull(), ZVal.getNull(), true);
        env.callMethod(message, "bcc", Mailer.class, ZVal.getNull(), ZVal.getNull(), true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view")
    @ConvertedParameter(
        index = 1,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object queue(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, false);
        Object queue = assignParameter(args, 1, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        view, Mailable.class, "Illuminate\\Contracts\\Mail\\Mailable"))) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "Only mailables may be queued."));
        }

        return ZVal.assign(
                env.callMethod(
                        view,
                        "queue",
                        Mailer.class,
                        function_is_null.f.env(env).call(queue).getBool() ? this.queue : queue));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    @ConvertedParameter(index = 1, name = "view")
    public Object onQueue(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        Object view = assignParameter(args, 1, false);
        return ZVal.assign(this.queue(env, view, queue));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    @ConvertedParameter(index = 1, name = "view")
    public Object queueOn(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        Object view = assignParameter(args, 1, false);
        return ZVal.assign(this.onQueue(env, queue, view));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay")
    @ConvertedParameter(index = 1, name = "view")
    @ConvertedParameter(
        index = 2,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object later(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, false);
        Object view = assignParameter(args, 1, false);
        Object queue = assignParameter(args, 2, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        view, Mailable.class, "Illuminate\\Contracts\\Mail\\Mailable"))) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "Only mailables may be queued."));
        }

        return ZVal.assign(
                env.callMethod(
                        view,
                        "later",
                        Mailer.class,
                        delay,
                        function_is_null.f.env(env).call(queue).getBool() ? this.queue : queue));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    @ConvertedParameter(index = 1, name = "delay")
    @ConvertedParameter(index = 2, name = "view")
    public Object laterOn(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        Object delay = assignParameter(args, 1, false);
        Object view = assignParameter(args, 2, false);
        return ZVal.assign(this.later(env, delay, view, queue));
    }

    @ConvertedMethod
    protected Object createMessage(RuntimeEnv env, Object... args) {
        Object message = null;
        message =
                new Message(
                        env, env.callMethod(this.swift, "createMessage", Mailer.class, "message"));
        if (!arrayActionR(
                ArrayAction.EMPTY, new ReferenceClassProperty(this, "from", env), env, "address")) {
            env.callMethod(
                    message,
                    "from",
                    Mailer.class,
                    new ReferenceClassProperty(this, "from", env).arrayGet(env, "address"),
                    new ReferenceClassProperty(this, "from", env).arrayGet(env, "name"));
        }

        if (!arrayActionR(
                ArrayAction.EMPTY,
                new ReferenceClassProperty(this, "replyTo", env),
                env,
                "address")) {
            env.callMethod(
                    message,
                    "replyTo",
                    Mailer.class,
                    new ReferenceClassProperty(this, "replyTo", env).arrayGet(env, "address"),
                    new ReferenceClassProperty(this, "replyTo", env).arrayGet(env, "name"));
        }

        return ZVal.assign(message);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    protected Object sendSwiftMessage(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        try {
            return ZVal.assign(
                    env.callMethod(
                            this.swift,
                            new RuntimeArgsWithReferences()
                                    .add(
                                            1,
                                            new ReferenceClassProperty(
                                                    this, "failedRecipients", env)),
                            "send",
                            Mailer.class,
                            message,
                            this.failedRecipients));
        } catch (ConvertedException convertedException47) {

            throw convertedException47;
        } finally {
            this.forceReconnection(env);
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "data", defaultValue = "", defaultValueType = "array")
    protected Object shouldSendMessage(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        if (!ZVal.isTrue(this.events)) {
            return ZVal.assign(true);
        }

        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        env.callMethod(
                                this.events,
                                "until",
                                Mailer.class,
                                new MessageSending(env, message, data)),
                        "!==",
                        false));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "data", defaultValue = "", defaultValueType = "array")
    protected Object dispatchSentEvent(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        if (ZVal.isTrue(this.events)) {
            env.callMethod(
                    this.events,
                    "dispatch",
                    Mailer.class,
                    new MessageSent(
                            env, env.callMethod(message, "getSwiftMessage", Mailer.class), data));
        }

        return null;
    }

    @ConvertedMethod
    protected Object forceReconnection(RuntimeEnv env, Object... args) {
        env.callMethod(
                env.callMethod(this.getSwiftMailer(env), "getTransport", Mailer.class),
                "stop",
                Mailer.class);
        return null;
    }

    @ConvertedMethod
    public Object getViewFactory(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.views);
    }

    @ConvertedMethod
    public Object getSwiftMailer(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.swift);
    }

    @ConvertedMethod
    public Object failures(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.failedRecipients);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "swift")
    public Object setSwiftMailer(RuntimeEnv env, Object... args) {
        Object swift = assignParameter(args, 0, false);
        this.swift = swift;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "queue",
        typeHint = "Illuminate\\Contracts\\Queue\\Factory"
    )
    public Object setQueue(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        this.queue = queue;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object parameters = assignParameter(args, 1, false);
        Object macro = null;
        if (!ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Mailer.class)
                        .method("hasMacro")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, method))
                        .call(method.getObject())
                        .value())) {
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
                                            method.getObject())
                                    .value()));
        }

        macro =
                ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Mail
                                                .classes
                                                .Mailer
                                                .RequestStaticProperties
                                                .class,
                                        "macros")
                                .arrayGet(env, method.getObject()));
        if (ZVal.isTrue(ZVal.checkInstanceType(macro, Closure.class, "Closure"))) {
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.callMethod(
                                            macro,
                                            "bindTo",
                                            Mailer.class,
                                            this,
                                            ClassConstantUtils.getConstantValueLateStatic(
                                                    env, this, "class")),
                                    parameters)
                            .value());
        }

        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(macro, parameters)
                        .value());
    }

    public static final Object CONST_class = "Illuminate\\Mail\\Mailer";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(index = 1, name = "macro")
        public Object macro(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            Object macro = assignParameter(args, 1, false);
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Mail
                                    .classes
                                    .Mailer
                                    .RequestStaticProperties
                                    .class,
                            "macros")
                    .arrayAccess(env, name)
                    .set(macro);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "mixin")
        public Object mixin(RuntimeEnv env, Object... args) {
            Object mixin = assignParameter(args, 0, false);
            Object method = null;
            Object methods = null;
            methods =
                    env.callMethod(
                            new ReflectionClass(env, mixin),
                            "getMethods",
                            Mailer.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2339 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2339.getValue());
                env.callMethod(method, "setAccessible", Mailer.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Mailer.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", Mailer.class, mixin))
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object hasMacro(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            return ZVal.assign(
                    arrayActionR(
                            ArrayAction.ISSET,
                            env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Mail
                                            .classes
                                            .Mailer
                                            .RequestStaticProperties
                                            .class,
                                    "macros"),
                            env,
                            name));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method")
        @ConvertedParameter(index = 1, name = "parameters")
        public Object __callStatic(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            Object parameters = assignParameter(args, 1, false);
            if (!ZVal.isTrue(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Mailer.class)
                            .method("hasMacro")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(method)
                            .value())) {
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

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Mail
                                                    .classes
                                                    .Mailer
                                                    .RequestStaticProperties
                                                    .class,
                                            "macros")
                                    .arrayGet(env, method),
                            Closure.class,
                            "Closure"))) {
                return ZVal.assign(
                        function_call_user_func_array
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(
                                        Closure.runtimeStaticObject.bind(
                                                env,
                                                env.getRequestStaticPropertiesReference(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Illuminate
                                                                        .namespaces
                                                                        .Mail
                                                                        .classes
                                                                        .Mailer
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "macros")
                                                        .arrayGet(env, method),
                                                ZVal.getNull(),
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class")),
                                        parameters)
                                .value());
            }

            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Illuminate
                                                            .namespaces
                                                            .Mail
                                                            .classes
                                                            .Mailer
                                                            .RequestStaticProperties
                                                            .class,
                                                    "macros")
                                            .arrayGet(env, method),
                                    parameters)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object macros = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Mail\\Mailer")
                    .setLookup(
                            Mailer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "events",
                            "failedRecipients",
                            "from",
                            "queue",
                            "replyTo",
                            "swift",
                            "to",
                            "views")
                    .setStaticPropertyNames("macros")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Mail/Mailer.php")
                    .addInterface("Illuminate\\Contracts\\Mail\\Mailer")
                    .addInterface("Illuminate\\Contracts\\Mail\\MailQueue")
                    .addTrait("Illuminate\\Support\\Traits\\Macroable")
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

    private static class Scope144 implements UpdateRuntimeScopeInterface {

        Object address;
        Object _thisVarAlias;
        Object name;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("address", this.address);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("name", this.name);
        }

        public void updateScope(RuntimeStack stack) {

            this.address = stack.getVariable("address");
            this._thisVarAlias = stack.getVariable("this");
            this.name = stack.getVariable("name");
        }
    }

    private static class Scope145 implements UpdateRuntimeScopeInterface {

        Object address;
        Object _thisVarAlias;
        Object name;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("address", this.address);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("name", this.name);
        }

        public void updateScope(RuntimeStack stack) {

            this.address = stack.getVariable("address");
            this._thisVarAlias = stack.getVariable("this");
            this.name = stack.getVariable("name");
        }
    }

    private static class Scope146 implements UpdateRuntimeScopeInterface {

        Object address;
        Object _thisVarAlias;
        Object name;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("address", this.address);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("name", this.name);
        }

        public void updateScope(RuntimeStack stack) {

            this.address = stack.getVariable("address");
            this._thisVarAlias = stack.getVariable("this");
            this.name = stack.getVariable("name");
        }
    }
}
