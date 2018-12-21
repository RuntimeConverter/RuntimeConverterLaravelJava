package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.namespaces.Scheduling.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.classes.Process;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.functions.storage_path;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Cron.classes.CronExpression;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.functions.base_path;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.namespaces.Scheduling.classes.CommandBuilder;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Console/Scheduling/Event.php

*/

public class Event extends RuntimeClassBase {

    public Object command = null;

    public Object expression = "* * * * *";

    public Object timezone = null;

    public Object user = null;

    public Object environments = ZVal.newArray();

    public Object evenInMaintenanceMode = false;

    public Object withoutOverlapping = false;

    public Object onOneServer = false;

    public Object expiresAt = 1440;

    public Object runInBackground = false;

    public Object filters = ZVal.newArray();

    public Object rejects = ZVal.newArray();

    public Object output = "/dev/null";

    public Object shouldAppendOutput = false;

    public Object beforeCallbacks = ZVal.newArray();

    public Object afterCallbacks = ZVal.newArray();

    public Object description = null;

    public Object mutex = null;

    public Event(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Event.class) {
            this.__construct(env, args);
        }
    }

    public Event(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "mutex",
        typeHint = "Illuminate\\Console\\Scheduling\\EventMutex"
    )
    @ConvertedParameter(index = 1, name = "command")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object mutex = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        this.mutex = mutex;
        this.command = command;
        this.output = this.getDefaultOutput(env);
        return null;
    }

    @ConvertedMethod
    public Object getDefaultOutput(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.equalityCheck("/", "\\") ? "NUL" : "/dev/null");
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Contracts\\Container\\Container"
    )
    public Object run(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        if (ZVal.toBool(this.withoutOverlapping)
                && ZVal.toBool(
                        !ZVal.isTrue(env.callMethod(this.mutex, "create", Event.class, this)))) {
            return null;
        }

        ZVal.ternaryExpression(
                ZVal.isTrue(this.runInBackground)
                        ? this.runCommandInBackground(env, container)
                        : this.runCommandInForeground(env, container));
        return null;
    }

    @ConvertedMethod
    public Object mutexName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                "framework"
                        + toStringR("/", env)
                        + "schedule-"
                        + toStringR(
                                NamespaceGlobal.sha1
                                        .env(env)
                                        .call(
                                                toStringR(this.expression, env)
                                                        + toStringR(this.command, env))
                                        .value(),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Contracts\\Container\\Container"
    )
    protected Object runCommandInForeground(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        this.callBeforeCallbacks(env, container);
        env.callMethod(
                new Process(
                        env,
                        this.buildCommand(env),
                        base_path.f.env(env).call().value(),
                        ZVal.getNull(),
                        ZVal.getNull(),
                        ZVal.getNull()),
                "run",
                Event.class);
        this.callAfterCallbacks(env, container);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Contracts\\Container\\Container"
    )
    protected Object runCommandInBackground(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        this.callBeforeCallbacks(env, container);
        env.callMethod(
                new Process(
                        env,
                        this.buildCommand(env),
                        base_path.f.env(env).call().value(),
                        ZVal.getNull(),
                        ZVal.getNull(),
                        ZVal.getNull()),
                "run",
                Event.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Contracts\\Container\\Container"
    )
    public Object callBeforeCallbacks(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        Object callback = null;
        for (ZPair zpairResult227 : ZVal.getIterable(this.beforeCallbacks, env, true)) {
            callback = ZVal.assign(zpairResult227.getValue());
            env.callMethod(container, "call", Event.class, callback);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Contracts\\Container\\Container"
    )
    public Object callAfterCallbacks(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        Object callback = null;
        for (ZPair zpairResult228 : ZVal.getIterable(this.afterCallbacks, env, true)) {
            callback = ZVal.assign(zpairResult228.getValue());
            env.callMethod(container, "call", Event.class, callback);
        }

        return null;
    }

    @ConvertedMethod
    public Object buildCommand(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(new CommandBuilder(env), "buildCommand", Event.class, this));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "app")
    public Object isDue(RuntimeEnv env, Object... args) {
        Object app = assignParameter(args, 0, false);
        if (ZVal.toBool(!ZVal.isTrue(this.runsInMaintenanceMode(env)))
                && ZVal.toBool(env.callMethod(app, "isDownForMaintenance", Event.class))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                ZVal.toBool(this.expressionPasses(env))
                        && ZVal.toBool(
                                this.runsInEnvironment(
                                        env, env.callMethod(app, "environment", Event.class))));
    }

    @ConvertedMethod
    public Object runsInMaintenanceMode(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.evenInMaintenanceMode);
    }

    @ConvertedMethod
    protected Object expressionPasses(RuntimeEnv env, Object... args) {
        Object date = null;
        date = Carbon.runtimeStaticObject.now(env);
        if (ZVal.isTrue(this.timezone)) {
            env.callMethod(date, "setTimezone", Event.class, this.timezone);
        }

        return ZVal.assign(
                env.callMethod(
                        CronExpression.runtimeStaticObject.factory(env, this.expression),
                        "isDue",
                        Event.class,
                        env.callMethod(date, "toDateTimeString", Event.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "environment")
    public Object runsInEnvironment(RuntimeEnv env, Object... args) {
        Object environment = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(ZVal.isEmpty(this.environments))
                        || ZVal.toBool(
                                function_in_array
                                        .f
                                        .env(env)
                                        .call(environment, this.environments)
                                        .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "app")
    public Object filtersPass(RuntimeEnv env, Object... args) {
        Object app = assignParameter(args, 0, false);
        Object callback = null;
        for (ZPair zpairResult229 : ZVal.getIterable(this.filters, env, true)) {
            callback = ZVal.assign(zpairResult229.getValue());
            if (!ZVal.isTrue(env.callMethod(app, "call", Event.class, callback))) {
                return ZVal.assign(false);
            }
        }

        for (ZPair zpairResult230 : ZVal.getIterable(this.rejects, env, true)) {
            callback = ZVal.assign(zpairResult230.getValue());
            if (ZVal.isTrue(env.callMethod(app, "call", Event.class, callback))) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "location")
    @ConvertedParameter(
        index = 1,
        name = "append",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object sendOutputTo(RuntimeEnv env, Object... args) {
        Object location = assignParameter(args, 0, false);
        Object append = assignParameter(args, 1, true);
        if (null == append) {
            append = false;
        }
        this.output = location;
        this.shouldAppendOutput = append;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "location")
    public Object appendOutputTo(RuntimeEnv env, Object... args) {
        Object location = assignParameter(args, 0, false);
        return ZVal.assign(this.sendOutputTo(env, location, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "addresses")
    @ConvertedParameter(
        index = 1,
        name = "onlyIfOutputExists",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object emailOutputTo(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Console/Scheduling")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Console/Scheduling/Event.php");
        Object addresses = assignParameter(args, 0, false);
        Object onlyIfOutputExists = assignParameter(args, 1, true);
        if (null == onlyIfOutputExists) {
            onlyIfOutputExists = false;
        }
        this.ensureOutputIsBeingCapturedForEmail(env);
        addresses = Arr.runtimeStaticObject.wrap(env, addresses);
        return ZVal.assign(
                this.then(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Console\\Scheduling",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(
                                index = 0,
                                name = "mailer",
                                typeHint = "Illuminate\\Contracts\\Mail\\Mailer"
                            )
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object mailer = assignParameter(args, 0, false);
                                Object onlyIfOutputExists = null;
                                Object addresses = null;
                                onlyIfOutputExists =
                                        this.contextReferences.getCapturedValue(
                                                "onlyIfOutputExists");
                                addresses = this.contextReferences.getCapturedValue("addresses");
                                Event.this.emailOutput(env, mailer, addresses, onlyIfOutputExists);
                                return null;
                            }
                        }.use("onlyIfOutputExists", onlyIfOutputExists)
                                .use("addresses", addresses)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "addresses")
    public Object emailWrittenOutputTo(RuntimeEnv env, Object... args) {
        Object addresses = assignParameter(args, 0, false);
        return ZVal.assign(this.emailOutputTo(env, addresses, true));
    }

    @ConvertedMethod
    protected Object ensureOutputIsBeingCapturedForEmail(RuntimeEnv env, Object... args) {
        if (ZVal.toBool(function_is_null.f.env(env).call(this.output).value())
                || ZVal.toBool(ZVal.equalityCheck(this.output, this.getDefaultOutput(env)))) {
            this.sendOutputTo(
                    env,
                    storage_path
                            .f
                            .env(env)
                            .call(
                                    "logs/schedule-"
                                            + toStringR(
                                                    NamespaceGlobal.sha1
                                                            .env(env)
                                                            .call(this.mutexName(env))
                                                            .value(),
                                                    env)
                                            + ".log")
                            .value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "mailer",
        typeHint = "Illuminate\\Contracts\\Mail\\Mailer"
    )
    @ConvertedParameter(index = 1, name = "addresses")
    @ConvertedParameter(
        index = 2,
        name = "onlyIfOutputExists",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object emailOutput(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Console/Scheduling")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Console/Scheduling/Event.php");
        Object mailer = assignParameter(args, 0, false);
        Object addresses = assignParameter(args, 1, false);
        Object onlyIfOutputExists = assignParameter(args, 2, true);
        if (null == onlyIfOutputExists) {
            onlyIfOutputExists = false;
        }
        Object text = null;
        text =
                ZVal.assign(
                        function_file_exists.f.env(env).call(this.output).getBool()
                                ? function_file_get_contents.f.env(env).call(this.output).value()
                                : "");
        if (ZVal.toBool(onlyIfOutputExists) && ZVal.toBool(ZVal.isEmpty(text))) {
            return null;
        }

        env.callMethod(
                mailer,
                "raw",
                Event.class,
                text,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Console\\Scheduling",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "m")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object m = assignParameter(args, 0, false);
                        Object addresses = null;
                        addresses = this.contextReferences.getCapturedValue("addresses");
                        env.callMethod(
                                env.callMethod(m, "to", Event.class, addresses),
                                "subject",
                                Event.class,
                                Event.this.getEmailSubject(env));
                        return null;
                    }
                }.use("addresses", addresses));
        return null;
    }

    @ConvertedMethod
    protected Object getEmailSubject(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.description)) {
            return ZVal.assign(this.description);
        }

        return ZVal.assign("Scheduled Job Output For [" + toStringR(this.command, env) + "]");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "url")
    public Object pingBefore(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Console/Scheduling")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Console/Scheduling/Event.php");
        Object url = assignParameter(args, 0, false);
        return ZVal.assign(
                this.before(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Console\\Scheduling",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object url = null;
                                url = this.contextReferences.getCapturedValue("url");
                                env.callMethod(
                                        env.createNew(ZVal.resolveClassAlias(env, "HttpClient")),
                                        "get",
                                        Event.class,
                                        url);
                                return null;
                            }
                        }.use("url", url)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(index = 1, name = "url")
    public Object pingBeforeIf(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object url = assignParameter(args, 1, false);
        return ZVal.assign(ZVal.isTrue(value) ? this.pingBefore(env, url) : this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "url")
    public Object thenPing(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Console/Scheduling")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Console/Scheduling/Event.php");
        Object url = assignParameter(args, 0, false);
        return ZVal.assign(
                this.then(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Console\\Scheduling",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object url = null;
                                url = this.contextReferences.getCapturedValue("url");
                                env.callMethod(
                                        env.createNew(ZVal.resolveClassAlias(env, "HttpClient")),
                                        "get",
                                        Event.class,
                                        url);
                                return null;
                            }
                        }.use("url", url)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(index = 1, name = "url")
    public Object thenPingIf(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object url = assignParameter(args, 1, false);
        return ZVal.assign(ZVal.isTrue(value) ? this.thenPing(env, url) : this);
    }

    @ConvertedMethod
    public Object runInBackground(RuntimeEnv env, Object... args) {
        this.runInBackground = true;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "user")
    public Object user(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        this.user = user;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "environments")
    public Object environments(RuntimeEnv env, Object... args) {
        Object environments = assignParameter(args, 0, false);
        this.environments =
                function_is_array.f.env(env).call(environments).getBool()
                        ? environments
                        : function_func_get_args
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call()
                                .value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object evenInMaintenanceMode(RuntimeEnv env, Object... args) {
        this.evenInMaintenanceMode = true;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "expiresAt",
        defaultValue = "1440",
        defaultValueType = "number"
    )
    public Object withoutOverlapping(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Console/Scheduling")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Console/Scheduling/Event.php");
        Object expiresAt = assignParameter(args, 0, true);
        if (null == expiresAt) {
            expiresAt = 1440;
        }
        this.withoutOverlapping = true;
        this.expiresAt = expiresAt;
        return ZVal.assign(
                env.callMethod(
                        this.then(
                                env,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Console\\Scheduling",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        env.callMethod(
                                                Event.this.mutex,
                                                "forget",
                                                Event.class,
                                                _closureThisVar);
                                        return null;
                                    }
                                }),
                        "skip",
                        Event.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Console\\Scheduling",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                return ZVal.assign(
                                        env.callMethod(
                                                Event.this.mutex,
                                                "exists",
                                                Event.class,
                                                _closureThisVar));
                            }
                        }));
    }

    @ConvertedMethod
    public Object onOneServer(RuntimeEnv env, Object... args) {
        this.onOneServer = true;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object when(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Console/Scheduling")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Console/Scheduling/Event.php");
        Object callback = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "filters", env)
                .arrayAppend(env)
                .set(
                        function_is_callable.f.env(env).call(callback).getBool()
                                ? callback
                                : new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Console\\Scheduling",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object callback = null;
                                        callback =
                                                this.contextReferences.getCapturedValue("callback");
                                        return ZVal.assign(callback);
                                    }
                                }.use("callback", callback));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object skip(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Console/Scheduling")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Console/Scheduling/Event.php");
        Object callback = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "rejects", env)
                .arrayAppend(env)
                .set(
                        function_is_callable.f.env(env).call(callback).getBool()
                                ? callback
                                : new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Console\\Scheduling",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object callback = null;
                                        callback =
                                                this.contextReferences.getCapturedValue("callback");
                                        return ZVal.assign(callback);
                                    }
                                }.use("callback", callback));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    public Object before(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "beforeCallbacks", env).arrayAppend(env).set(callback);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    public Object after(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        return ZVal.assign(this.then(env, callback));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    public Object then(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "afterCallbacks", env).arrayAppend(env).set(callback);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description")
    public Object name(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        return ZVal.assign(this.description(env, description));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description")
    public Object description(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        this.description = description;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getSummaryForDisplay(RuntimeEnv env, Object... args) {
        if (function_is_string.f.env(env).call(this.description).getBool()) {
            return ZVal.assign(this.description);
        }

        return ZVal.assign(this.buildCommand(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "currentTime")
    @ConvertedParameter(index = 1, name = "nth", defaultValue = "0", defaultValueType = "number")
    @ConvertedParameter(
        index = 2,
        name = "allowCurrentDate",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object nextRunDate(RuntimeEnv env, Object... args) {
        Object currentTime = assignParameter(args, 0, true);
        if (null == currentTime) {
            currentTime = "now";
        }
        Object nth = assignParameter(args, 1, true);
        if (null == nth) {
            nth = 0;
        }
        Object allowCurrentDate = assignParameter(args, 2, true);
        if (null == allowCurrentDate) {
            allowCurrentDate = false;
        }
        return ZVal.assign(
                Carbon.runtimeStaticObject.instance(
                        env,
                        env.callMethod(
                                CronExpression.runtimeStaticObject.factory(
                                        env, this.getExpression(env)),
                                "getNextRunDate",
                                Event.class,
                                currentTime,
                                nth,
                                allowCurrentDate)));
    }

    @ConvertedMethod
    public Object getExpression(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.expression);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "mutex",
        typeHint = "Illuminate\\Console\\Scheduling\\EventMutex"
    )
    public Object preventOverlapsUsing(RuntimeEnv env, Object... args) {
        Object mutex = assignParameter(args, 0, false);
        this.mutex = mutex;
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
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Event.class)
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
                                                .Console
                                                .namespaces
                                                .Scheduling
                                                .classes
                                                .Event
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
                                            Event.class,
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

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    public Object cron(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        this.expression = expression;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "startTime")
    @ConvertedParameter(index = 1, name = "endTime")
    public Object between(RuntimeEnv env, Object... args) {
        Object startTime = assignParameter(args, 0, false);
        Object endTime = assignParameter(args, 1, false);
        return ZVal.assign(this.when(env, this.inTimeInterval(env, startTime, endTime)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "startTime")
    @ConvertedParameter(index = 1, name = "endTime")
    public Object unlessBetween(RuntimeEnv env, Object... args) {
        Object startTime = assignParameter(args, 0, false);
        Object endTime = assignParameter(args, 1, false);
        return ZVal.assign(this.skip(env, this.inTimeInterval(env, startTime, endTime)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "startTime")
    @ConvertedParameter(index = 1, name = "endTime")
    private Object inTimeInterval(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Console/Scheduling")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Console/Scheduling/ManagesFrequencies.php");
        Object startTime = assignParameter(args, 0, false);
        Object endTime = assignParameter(args, 1, false);
        return ZVal.assign(
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Console\\Scheduling",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object startTime = null;
                        Object endTime = null;
                        startTime = this.contextReferences.getCapturedValue("startTime");
                        endTime = this.contextReferences.getCapturedValue("endTime");
                        return ZVal.assign(
                                env.callMethod(
                                        Carbon.runtimeStaticObject.now(env, Event.this.timezone),
                                        "between",
                                        Event.class,
                                        Carbon.runtimeStaticObject.parse(
                                                env, startTime, Event.this.timezone),
                                        Carbon.runtimeStaticObject.parse(
                                                env, endTime, Event.this.timezone),
                                        true));
                    }
                }.use("startTime", startTime).use("endTime", endTime));
    }

    @ConvertedMethod
    public Object everyMinute(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.spliceIntoPosition(env, 1, "*"));
    }

    @ConvertedMethod
    public Object everyFiveMinutes(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.spliceIntoPosition(env, 1, "*/5"));
    }

    @ConvertedMethod
    public Object everyTenMinutes(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.spliceIntoPosition(env, 1, "*/10"));
    }

    @ConvertedMethod
    public Object everyFifteenMinutes(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.spliceIntoPosition(env, 1, "*/15"));
    }

    @ConvertedMethod
    public Object everyThirtyMinutes(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.spliceIntoPosition(env, 1, "0,30"));
    }

    @ConvertedMethod
    public Object hourly(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.spliceIntoPosition(env, 1, 0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object hourlyAt(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        return ZVal.assign(this.spliceIntoPosition(env, 1, offset));
    }

    @ConvertedMethod
    public Object daily(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.spliceIntoPosition(env, 1, 0),
                        "spliceIntoPosition",
                        Event.class,
                        2,
                        0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "time")
    public Object at(RuntimeEnv env, Object... args) {
        Object time = assignParameter(args, 0, false);
        return ZVal.assign(this.dailyAt(env, time));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "time")
    public Object dailyAt(RuntimeEnv env, Object... args) {
        Object time = assignParameter(args, 0, false);
        ReferenceContainer segments = new BasicReferenceContainer(null);
        segments.setObject(function_explode.f.env(env).call(":", time).value());
        return ZVal.assign(
                env.callMethod(
                        this.spliceIntoPosition(env, 2, ZVal.toLong(segments.arrayGet(env, 0))),
                        "spliceIntoPosition",
                        Event.class,
                        1,
                        ZVal.equalityCheck(
                                        function_count
                                                .f
                                                .env(env)
                                                .call(segments.getObject())
                                                .value(),
                                        2)
                                ? ZVal.toLong(segments.arrayGet(env, 1))
                                : "0"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "first", defaultValue = "1", defaultValueType = "number")
    @ConvertedParameter(
        index = 1,
        name = "second",
        defaultValue = "13",
        defaultValueType = "number"
    )
    public Object twiceDaily(RuntimeEnv env, Object... args) {
        Object first = assignParameter(args, 0, true);
        if (null == first) {
            first = 1;
        }
        Object second = assignParameter(args, 1, true);
        if (null == second) {
            second = 13;
        }
        Object hours = null;
        hours = toStringR(first, env) + "," + toStringR(second, env);
        return ZVal.assign(
                env.callMethod(
                        this.spliceIntoPosition(env, 1, 0),
                        "spliceIntoPosition",
                        Event.class,
                        2,
                        hours));
    }

    @ConvertedMethod
    public Object weekdays(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.spliceIntoPosition(env, 5, "1-5"));
    }

    @ConvertedMethod
    public Object weekends(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.spliceIntoPosition(env, 5, "0,6"));
    }

    @ConvertedMethod
    public Object mondays(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.days(env, 1));
    }

    @ConvertedMethod
    public Object tuesdays(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.days(env, 2));
    }

    @ConvertedMethod
    public Object wednesdays(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.days(env, 3));
    }

    @ConvertedMethod
    public Object thursdays(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.days(env, 4));
    }

    @ConvertedMethod
    public Object fridays(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.days(env, 5));
    }

    @ConvertedMethod
    public Object saturdays(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.days(env, 6));
    }

    @ConvertedMethod
    public Object sundays(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.days(env, 0));
    }

    @ConvertedMethod
    public Object weekly(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this.spliceIntoPosition(env, 1, 0),
                                "spliceIntoPosition",
                                Event.class,
                                2,
                                0),
                        "spliceIntoPosition",
                        Event.class,
                        5,
                        0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "day")
    @ConvertedParameter(index = 1, name = "time")
    public Object weeklyOn(RuntimeEnv env, Object... args) {
        Object day = assignParameter(args, 0, false);
        Object time = assignParameter(args, 1, true);
        if (null == time) {
            time = "0:0";
        }
        this.dailyAt(env, time);
        return ZVal.assign(this.spliceIntoPosition(env, 5, day));
    }

    @ConvertedMethod
    public Object monthly(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this.spliceIntoPosition(env, 1, 0),
                                "spliceIntoPosition",
                                Event.class,
                                2,
                                0),
                        "spliceIntoPosition",
                        Event.class,
                        3,
                        1));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "day", defaultValue = "1", defaultValueType = "number")
    @ConvertedParameter(index = 1, name = "time")
    public Object monthlyOn(RuntimeEnv env, Object... args) {
        Object day = assignParameter(args, 0, true);
        if (null == day) {
            day = 1;
        }
        Object time = assignParameter(args, 1, true);
        if (null == time) {
            time = "0:0";
        }
        this.dailyAt(env, time);
        return ZVal.assign(this.spliceIntoPosition(env, 3, day));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "first", defaultValue = "1", defaultValueType = "number")
    @ConvertedParameter(
        index = 1,
        name = "second",
        defaultValue = "16",
        defaultValueType = "number"
    )
    public Object twiceMonthly(RuntimeEnv env, Object... args) {
        Object first = assignParameter(args, 0, true);
        if (null == first) {
            first = 1;
        }
        Object second = assignParameter(args, 1, true);
        if (null == second) {
            second = 16;
        }
        Object days = null;
        days = toStringR(first, env) + "," + toStringR(second, env);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this.spliceIntoPosition(env, 1, 0),
                                "spliceIntoPosition",
                                Event.class,
                                2,
                                0),
                        "spliceIntoPosition",
                        Event.class,
                        3,
                        days));
    }

    @ConvertedMethod
    public Object quarterly(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        this.spliceIntoPosition(env, 1, 0),
                                        "spliceIntoPosition",
                                        Event.class,
                                        2,
                                        0),
                                "spliceIntoPosition",
                                Event.class,
                                3,
                                1),
                        "spliceIntoPosition",
                        Event.class,
                        4,
                        "1-12/3"));
    }

    @ConvertedMethod
    public Object yearly(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        this.spliceIntoPosition(env, 1, 0),
                                        "spliceIntoPosition",
                                        Event.class,
                                        2,
                                        0),
                                "spliceIntoPosition",
                                Event.class,
                                3,
                                1),
                        "spliceIntoPosition",
                        Event.class,
                        4,
                        1));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "days")
    public Object days(RuntimeEnv env, Object... args) {
        Object days = assignParameter(args, 0, false);
        days =
                ZVal.assign(
                        function_is_array.f.env(env).call(days).getBool()
                                ? days
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value());
        return ZVal.assign(
                this.spliceIntoPosition(
                        env, 5, NamespaceGlobal.implode.env(env).call(",", days).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "timezone")
    public Object timezone(RuntimeEnv env, Object... args) {
        Object timezone = assignParameter(args, 0, false);
        this.timezone = timezone;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "position")
    @ConvertedParameter(index = 1, name = "value")
    protected Object spliceIntoPosition(RuntimeEnv env, Object... args) {
        Object position = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer segments = new BasicReferenceContainer(null);
        segments.setObject(function_explode.f.env(env).call(" ", this.expression).value());
        segments.arrayAccess(env, ZVal.subtract(position, 1)).set(value);
        return ZVal.assign(
                this.cron(
                        env,
                        NamespaceGlobal.implode.env(env).call(" ", segments.getObject()).value()));
    }

    public static final Object CONST_class = "Illuminate\\Console\\Scheduling\\Event";

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
                                    .Console
                                    .namespaces
                                    .Scheduling
                                    .classes
                                    .Event
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
                            Event.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2281 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2281.getValue());
                env.callMethod(method, "setAccessible", Event.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Event.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", Event.class, mixin))
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
                                            .Console
                                            .namespaces
                                            .Scheduling
                                            .classes
                                            .Event
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
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Event.class)
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
                                                    .Console
                                                    .namespaces
                                                    .Scheduling
                                                    .classes
                                                    .Event
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
                                                                        .Console
                                                                        .namespaces
                                                                        .Scheduling
                                                                        .classes
                                                                        .Event
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
                                                            .Console
                                                            .namespaces
                                                            .Scheduling
                                                            .classes
                                                            .Event
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
                    .setName("Illuminate\\Console\\Scheduling\\Event")
                    .setLookup(
                            Event.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "afterCallbacks",
                            "beforeCallbacks",
                            "command",
                            "description",
                            "environments",
                            "evenInMaintenanceMode",
                            "expiresAt",
                            "expression",
                            "filters",
                            "mutex",
                            "onOneServer",
                            "output",
                            "rejects",
                            "runInBackground",
                            "shouldAppendOutput",
                            "timezone",
                            "user",
                            "withoutOverlapping")
                    .setStaticPropertyNames("macros")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Console/Scheduling/Event.php")
                    .addTrait("Illuminate\\Support\\Traits\\Macroable")
                    .addTrait("Illuminate\\Console\\Scheduling\\ManagesFrequencies")
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
