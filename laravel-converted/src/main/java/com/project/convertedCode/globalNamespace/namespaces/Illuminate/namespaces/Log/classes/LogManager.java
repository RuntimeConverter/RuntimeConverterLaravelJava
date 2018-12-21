package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Log.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.HandlerInterface;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.SlackWebhookHandler;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.RotatingFileHandler;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.StreamHandler;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.ErrorLogHandler;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.SyslogHandler;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_a;
import com.runtimeconverter.runtime.RuntimeStack;
import com.project.convertedCode.globalNamespace.functions.with;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.LineFormatter;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Log.classes.LoggerInterface;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Log/LogManager.php

*/

public class LogManager extends RuntimeClassBase implements LoggerInterface {

    public Object app = null;

    public Object channels = ZVal.newArray();

    public Object customCreators = ZVal.newArray();

    public Object levels =
            ZVal.newArray(
                    new ZPair(
                            "debug",
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Monolog
                                    .classes
                                    .Logger
                                    .CONST_DEBUG),
                    new ZPair(
                            "info",
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Monolog
                                    .classes
                                    .Logger
                                    .CONST_INFO),
                    new ZPair(
                            "notice",
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Monolog
                                    .classes
                                    .Logger
                                    .CONST_NOTICE),
                    new ZPair(
                            "warning",
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Monolog
                                    .classes
                                    .Logger
                                    .CONST_WARNING),
                    new ZPair(
                            "error",
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Monolog
                                    .classes
                                    .Logger
                                    .CONST_ERROR),
                    new ZPair(
                            "critical",
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Monolog
                                    .classes
                                    .Logger
                                    .CONST_CRITICAL),
                    new ZPair(
                            "alert",
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Monolog
                                    .classes
                                    .Logger
                                    .CONST_ALERT),
                    new ZPair(
                            "emergency",
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Monolog
                                    .classes
                                    .Logger
                                    .CONST_EMERGENCY));

    public LogManager(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == LogManager.class) {
            this.__construct(env, args);
        }
    }

    public LogManager(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "app")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object app = assignParameter(args, 0, false);
        this.app = app;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "channels", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "channel",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object stack(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope141 scope = new Scope141();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Log")
                            .setFile("/vendor/laravel/framework/src/Illuminate/Log/LogManager.php");
            scope.channels = assignParameter(args, 0, false);
            scope.channel = assignParameter(args, 1, true);
            if (null == scope.channel) {
                scope.channel = ZVal.getNull();
            }
            throw new IncludeEventException(
                    ZVal.assign(
                            new com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Log
                                    .classes
                                    .Logger(
                                    env,
                                    this.createStackDriver(
                                            env,
                                            function_compact
                                                    .f
                                                    .env(env)
                                                    .call(stack, "channels", "channel")
                                                    .value()),
                                    new ReferenceClassProperty(scope._thisVarAlias, "app", env)
                                            .arrayGet(env, "events"))));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "channel",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object channel(RuntimeEnv env, Object... args) {
        Object channel = assignParameter(args, 0, true);
        if (null == channel) {
            channel = ZVal.getNull();
        }
        return ZVal.assign(this.driver(env, channel));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "driver",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object driver(RuntimeEnv env, Object... args) {
        Object driver = assignParameter(args, 0, true);
        if (null == driver) {
            driver = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                this.get(
                        env,
                        ZVal.isDefined(ternaryExpressionTemp = driver)
                                ? ternaryExpressionTemp
                                : this.getDefaultDriver(env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object get(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Log")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Log/LogManager.php");
        Object name = assignParameter(args, 0, false);
        Object e = null;
        Object ternaryExpressionTemp = null;
        try {
            return ZVal.assign(
                    ZVal.isDefined(
                                    ternaryExpressionTemp =
                                            new ReferenceClassProperty(this, "channels", env)
                                                    .arrayGet(env, name))
                            ? ternaryExpressionTemp
                            : with.f
                                    .env(env)
                                    .call(
                                            this.resolve(env, name),
                                            new Closure(
                                                    env,
                                                    runtimeConverterFunctionClassConstants,
                                                    "Illuminate\\Log",
                                                    this) {
                                                @Override
                                                @ConvertedMethod
                                                @ConvertedParameter(index = 0, name = "logger")
                                                public Object run(
                                                        RuntimeEnv env,
                                                        Object thisvar,
                                                        PassByReferenceArgs
                                                                runtimePassByReferenceArgs,
                                                        Object... args) {
                                                    Object _closureThisVar =
                                                            this.getClosureThisVar();
                                                    Object logger = assignParameter(args, 0, false);
                                                    Object name = null;
                                                    name =
                                                            this.contextReferences.getCapturedValue(
                                                                    "name");
                                                    return ZVal.assign(
                                                            new ReferenceClassProperty(
                                                                            _closureThisVar,
                                                                            "channels",
                                                                            env)
                                                                    .arrayAccess(env, name)
                                                                    .set(
                                                                            LogManager.this.tap(
                                                                                    env,
                                                                                    name,
                                                                                    new com.project
                                                                                            .convertedCode
                                                                                            .globalNamespace
                                                                                            .namespaces
                                                                                            .Illuminate
                                                                                            .namespaces
                                                                                            .Log
                                                                                            .classes
                                                                                            .Logger(
                                                                                            env,
                                                                                            logger,
                                                                                            new ReferenceClassProperty(
                                                                                                            _closureThisVar,
                                                                                                            "app",
                                                                                                            env)
                                                                                                    .arrayGet(
                                                                                                            env,
                                                                                                            "events")))));
                                                }
                                            }.use("name", name))
                                    .value());
        } catch (ConvertedException convertedException45) {
            if (convertedException45.instanceOf(Throwable.class, "Throwable")) {
                e = convertedException45.getObject();
                return ZVal.assign(
                        tap.f
                                .env(env)
                                .call(
                                        this.createEmergencyLogger(env),
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Log",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "logger")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object logger = assignParameter(args, 0, false);
                                                Object e = null;
                                                e = this.contextReferences.getCapturedValue("e");
                                                env.callMethod(
                                                        logger,
                                                        "emergency",
                                                        LogManager.class,
                                                        "Unable to create configured logger. Using emergency logger.",
                                                        ZVal.newArray(new ZPair("exception", e)));
                                                return null;
                                            }
                                        }.use("e", e))
                                .value());
            } else {
                throw convertedException45;
            }
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "logger", typeHint = "Illuminate\\Log\\Logger")
    protected Object tap(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object logger = assignParameter(args, 1, false);
        Object tap = null;
        Object arguments = null;
        Object ternaryExpressionTemp = null;
        Object _pClass = null;
        Object runtimeTempArrayResult64 = null;
        for (ZPair zpairResult479 :
                ZVal.getIterable(
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                handleReturnReference(
                                                                this.configurationFor(env, name))
                                                        .arrayGet(env, "tap"))
                                ? ternaryExpressionTemp
                                : ZVal.newArray(),
                        env,
                        true)) {
            tap = ZVal.assign(zpairResult479.getValue());
            ZVal.list(
                    runtimeTempArrayResult64 = this.parseTap(env, tap),
                    (_pClass = listGet(runtimeTempArrayResult64, 0, env)),
                    (arguments = listGet(runtimeTempArrayResult64, 1, env)));
            env.callMethod(
                    env.callMethod(this.app, "make", LogManager.class, _pClass),
                    "__invoke",
                    LogManager.class,
                    PackedVaradicArgs.unpack(
                            logger,
                            new PackedVaradicArgs(
                                    function_explode.f.env(env).call(",", arguments).value())));
        }

        return ZVal.assign(logger);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tap")
    protected Object parseTap(RuntimeEnv env, Object... args) {
        Object tap = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isTrue(Str.runtimeStaticObject.contains(env, tap, ":"))
                        ? function_explode.f.env(env).call(":", tap, 2).value()
                        : ZVal.newArray(new ZPair(0, tap), new ZPair(1, "")));
    }

    @ConvertedMethod
    protected Object createEmergencyLogger(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Log
                        .classes
                        .Logger(
                        env,
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Monolog
                                .classes
                                .Logger(
                                env,
                                "laravel",
                                this.prepareHandlers(
                                        env,
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        new StreamHandler(
                                                                env,
                                                                toStringR(
                                                                                env.callMethod(
                                                                                        this.app,
                                                                                        "storagePath",
                                                                                        LogManager
                                                                                                .class),
                                                                                env)
                                                                        + "/logs/laravel.log",
                                                                this.level(
                                                                        env,
                                                                        ZVal.newArray(
                                                                                new ZPair(
                                                                                        "level",
                                                                                        "debug")))))))),
                        new ReferenceClassProperty(this, "app", env).arrayGet(env, "events")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object resolve(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object driverMethod = null;
        ReferenceContainer config = new BasicReferenceContainer(null);
        config.setObject(this.configurationFor(env, name));
        if (function_is_null.f.env(env).call(config.getObject()).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Log [" + toStringR(name, env) + "] is not defined."));
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "customCreators", env),
                env,
                config.arrayGet(env, "driver"))) {
            return ZVal.assign(this.callCustomCreator(env, config.getObject()));
        }

        driverMethod =
                "create"
                        + toStringR(
                                NamespaceGlobal.ucfirst
                                        .env(env)
                                        .call(config.arrayGet(env, "driver"))
                                        .value(),
                                env)
                        + "Driver";
        if (function_method_exists.f.env(env).call(this, driverMethod).getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences().add(0, config),
                            toStringR(driverMethod, env),
                            LogManager.class,
                            config.getObject()));
        }

        throw ZVal.getException(
                env,
                new InvalidArgumentException(
                        env,
                        "Driver ["
                                + toStringR(config.arrayGet(env, "driver"), env)
                                + "] is not supported."));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object callCustomCreator(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                env.callFunctionDynamic(
                                new ReferenceClassProperty(this, "customCreators", env)
                                        .arrayGet(env, config.arrayGet(env, "driver")),
                                new RuntimeArgsWithReferences()
                                        .add(0, new ReferenceClassProperty(this, "app", env))
                                        .add(1, config),
                                this.app,
                                config.getObject())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object createCustomDriver(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object factory = null;
        Object via = null;
        factory =
                ZVal.assign(
                        function_is_callable
                                        .f
                                        .env(env)
                                        .call(via = ZVal.assign(config.arrayGet(env, "via")))
                                        .getBool()
                                ? via
                                : env.callMethod(this.app, "make", LogManager.class, via));
        return ZVal.assign(
                env.callFunctionDynamic(
                                factory,
                                new RuntimeArgsWithReferences().add(0, config),
                                config.getObject())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object createStackDriver(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Log")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Log/LogManager.php");
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object handlers = null;
        handlers =
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(config.arrayGet(env, "channels")).value(),
                                "flatMap",
                                LogManager.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Log",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "channel")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object channel = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                env.callMethod(
                                                        LogManager.this.channel(env, channel),
                                                        "getHandlers",
                                                        LogManager.class));
                                    }
                                }),
                        "all",
                        LogManager.class);
        return ZVal.assign(
                new com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger(
                        env, this.parseChannel(env, config.getObject()), handlers));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object createSingleDriver(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                new com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger(
                        env,
                        this.parseChannel(env, config.getObject()),
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        this.prepareHandler(
                                                env,
                                                new StreamHandler(
                                                        env,
                                                        config.arrayGet(env, "path"),
                                                        this.level(env, config.getObject()),
                                                        ZVal.isDefined(
                                                                        ternaryExpressionTemp =
                                                                                config.arrayGet(
                                                                                        env,
                                                                                        "bubble"))
                                                                ? ternaryExpressionTemp
                                                                : true,
                                                        ZVal.isDefined(
                                                                        ternaryExpressionTemp =
                                                                                config.arrayGet(
                                                                                        env,
                                                                                        "permission"))
                                                                ? ternaryExpressionTemp
                                                                : ZVal.getNull(),
                                                        ZVal.isDefined(
                                                                        ternaryExpressionTemp =
                                                                                config.arrayGet(
                                                                                        env,
                                                                                        "locking"))
                                                                ? ternaryExpressionTemp
                                                                : false))))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object createDailyDriver(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                new com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger(
                        env,
                        this.parseChannel(env, config.getObject()),
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        this.prepareHandler(
                                                env,
                                                new RotatingFileHandler(
                                                        env,
                                                        config.arrayGet(env, "path"),
                                                        ZVal.isDefined(
                                                                        ternaryExpressionTemp =
                                                                                config.arrayGet(
                                                                                        env,
                                                                                        "days"))
                                                                ? ternaryExpressionTemp
                                                                : 7,
                                                        this.level(env, config.getObject()),
                                                        ZVal.isDefined(
                                                                        ternaryExpressionTemp =
                                                                                config.arrayGet(
                                                                                        env,
                                                                                        "bubble"))
                                                                ? ternaryExpressionTemp
                                                                : true,
                                                        ZVal.isDefined(
                                                                        ternaryExpressionTemp =
                                                                                config.arrayGet(
                                                                                        env,
                                                                                        "permission"))
                                                                ? ternaryExpressionTemp
                                                                : ZVal.getNull(),
                                                        ZVal.isDefined(
                                                                        ternaryExpressionTemp =
                                                                                config.arrayGet(
                                                                                        env,
                                                                                        "locking"))
                                                                ? ternaryExpressionTemp
                                                                : false))))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object createSlackDriver(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                new com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger(
                        env,
                        this.parseChannel(env, config.getObject()),
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        this.prepareHandler(
                                                env,
                                                new SlackWebhookHandler(
                                                        env,
                                                        config.arrayGet(env, "url"),
                                                        ZVal.isDefined(
                                                                        ternaryExpressionTemp =
                                                                                config.arrayGet(
                                                                                        env,
                                                                                        "channel"))
                                                                ? ternaryExpressionTemp
                                                                : ZVal.getNull(),
                                                        ZVal.isDefined(
                                                                        ternaryExpressionTemp =
                                                                                config.arrayGet(
                                                                                        env,
                                                                                        "username"))
                                                                ? ternaryExpressionTemp
                                                                : "Laravel",
                                                        ZVal.isDefined(
                                                                        ternaryExpressionTemp =
                                                                                config.arrayGet(
                                                                                        env,
                                                                                        "attachment"))
                                                                ? ternaryExpressionTemp
                                                                : true,
                                                        ZVal.isDefined(
                                                                        ternaryExpressionTemp =
                                                                                config.arrayGet(
                                                                                        env,
                                                                                        "emoji"))
                                                                ? ternaryExpressionTemp
                                                                : ":boom:",
                                                        ZVal.isDefined(
                                                                        ternaryExpressionTemp =
                                                                                config.arrayGet(
                                                                                        env,
                                                                                        "short"))
                                                                ? ternaryExpressionTemp
                                                                : false,
                                                        ZVal.isDefined(
                                                                        ternaryExpressionTemp =
                                                                                config.arrayGet(
                                                                                        env,
                                                                                        "context"))
                                                                ? ternaryExpressionTemp
                                                                : true,
                                                        this.level(env, config.getObject())))))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object createSyslogDriver(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                new com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger(
                        env,
                        this.parseChannel(env, config.getObject()),
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        this.prepareHandler(
                                                env,
                                                new SyslogHandler(
                                                        env,
                                                        new ReferenceClassProperty(this, "app", env)
                                                                .arrayGet(
                                                                        env, "config", "app.name"),
                                                        ZVal.isDefined(
                                                                        ternaryExpressionTemp =
                                                                                config.arrayGet(
                                                                                        env,
                                                                                        "facility"))
                                                                ? ternaryExpressionTemp
                                                                : 8,
                                                        this.level(env, config.getObject())))))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object createErrorlogDriver(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                new com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger(
                        env,
                        this.parseChannel(env, config.getObject()),
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        this.prepareHandler(
                                                env,
                                                new ErrorLogHandler(
                                                        env,
                                                        ZVal.isDefined(
                                                                        ternaryExpressionTemp =
                                                                                config.arrayGet(
                                                                                        env,
                                                                                        "type"))
                                                                ? ternaryExpressionTemp
                                                                : ErrorLogHandler
                                                                        .CONST_OPERATING_SYSTEM,
                                                        this.level(env, config.getObject())))))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object createMonologDriver(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object with = null;
        Object ternaryExpressionTemp = null;
        if (!function_is_a
                .f
                .env(env)
                .call(config.arrayGet(env, "handler"), HandlerInterface.CONST_class, true)
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            toStringR(config.arrayGet(env, "handler"), env)
                                    + " must be an instance of "
                                    + toStringR(HandlerInterface.CONST_class, env)));
        }

        with =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "with"))
                                        ? ternaryExpressionTemp
                                        : ZVal.newArray(),
                                ZVal.isDefined(
                                                ternaryExpressionTemp =
                                                        config.arrayGet(env, "handler_with"))
                                        ? ternaryExpressionTemp
                                        : ZVal.newArray())
                        .value();
        return ZVal.assign(
                new com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger(
                        env,
                        this.parseChannel(env, config.getObject()),
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        this.prepareHandler(
                                                env,
                                                env.callMethod(
                                                        this.app,
                                                        "make",
                                                        LogManager.class,
                                                        config.arrayGet(env, "handler"),
                                                        with),
                                                config.getObject())))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "handlers", typeHint = "array")
    protected Object prepareHandlers(RuntimeEnv env, Object... args) {
        ReferenceContainer handlers = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object handler = null;
        Object key = null;
        for (ZPair zpairResult480 : ZVal.getIterable(handlers.getObject(), env, false)) {
            key = ZVal.assign(zpairResult480.getKey());
            handler = ZVal.assign(zpairResult480.getValue());
            handlers.arrayAccess(env, key).set(this.prepareHandler(env, handler));
        }

        return ZVal.assign(handlers.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "handler",
        typeHint = "Monolog\\Handler\\HandlerInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "config",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object prepareHandler(RuntimeEnv env, Object... args) {
        Object handler = assignParameter(args, 0, false);
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == config.getObject()) {
            config.setObject(ZVal.newArray());
        }
        Object ternaryExpressionTemp = null;
        if (!arrayActionR(ArrayAction.ISSET, config, env, "formatter")) {
            env.callMethod(handler, "setFormatter", LogManager.class, this.formatter(env));

        } else if (ZVal.strictNotEqualityCheck(
                config.arrayGet(env, "formatter"), "!==", "default")) {
            env.callMethod(
                    handler,
                    "setFormatter",
                    LogManager.class,
                    env.callMethod(
                            this.app,
                            "make",
                            LogManager.class,
                            config.arrayGet(env, "formatter"),
                            ZVal.isDefined(
                                            ternaryExpressionTemp =
                                                    config.arrayGet(env, "formatter_with"))
                                    ? ternaryExpressionTemp
                                    : ZVal.newArray()));
        }

        return ZVal.assign(handler);
    }

    @ConvertedMethod
    protected Object formatter(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Log")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Log/LogManager.php");
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                new LineFormatter(env, ZVal.getNull(), ZVal.getNull(), true, true),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Log",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "formatter")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object formatter = assignParameter(args, 0, false);
                                        env.callMethod(
                                                formatter, "includeStacktraces", LogManager.class);
                                        return null;
                                    }
                                })
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object parseChannel(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (!arrayActionR(ArrayAction.ISSET, config, env, "name")) {
            return ZVal.assign(
                    ZVal.isTrue(env.callMethod(this.app, "bound", LogManager.class, "env"))
                            ? env.callMethod(this.app, "environment", LogManager.class)
                            : "production");
        }

        return ZVal.assign(config.arrayGet(env, "name"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object level(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object level = null;
        Object ternaryExpressionTemp = null;
        level =
                ZVal.assign(
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "level"))
                                ? ternaryExpressionTemp
                                : "debug");
        if (arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "levels", env), env, level)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "levels", env).arrayGet(env, level));
        }

        throw ZVal.getException(env, new InvalidArgumentException(env, "Invalid log level."));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object configurationFor(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(env, "config", "logging.channels." + toStringR(name, env)));
    }

    @ConvertedMethod
    public Object getDefaultDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(env, "config", "logging.default"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setDefaultDriver(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "app", env)
                .arrayAccess(env, "config", "logging.default")
                .set(name);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "driver")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    public Object extend(RuntimeEnv env, Object... args) {
        Object driver = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "customCreators", env)
                .arrayAccess(env, driver)
                .set(env.callMethod(callback, "bindTo", LogManager.class, this, this));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object emergency(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(this.driver(env), "emergency", LogManager.class, message, context));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object alert(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(this.driver(env), "alert", LogManager.class, message, context));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object critical(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(this.driver(env), "critical", LogManager.class, message, context));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object error(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(this.driver(env), "error", LogManager.class, message, context));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object warning(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(this.driver(env), "warning", LogManager.class, message, context));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object notice(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(this.driver(env), "notice", LogManager.class, message, context));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object info(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(this.driver(env), "info", LogManager.class, message, context));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object debug(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(this.driver(env), "debug", LogManager.class, message, context));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    @ConvertedParameter(index = 1, name = "message")
    @ConvertedParameter(
        index = 2,
        name = "context",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object log(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        Object context = assignParameter(args, 2, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(this.driver(env), "log", LogManager.class, level, message, context));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this.driver(env),
                        new RuntimeArgsWithReferences(),
                        toStringR(method, env),
                        LogManager.class,
                        PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters))));
    }

    public static final Object CONST_class = "Illuminate\\Log\\LogManager";

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
                    .setName("Illuminate\\Log\\LogManager")
                    .setLookup(
                            LogManager.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "channels", "customCreators", "levels")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Log/LogManager.php")
                    .addInterface("Psr\\Log\\LoggerInterface")
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

    private static class Scope141 implements UpdateRuntimeScopeInterface {

        Object channels;
        Object _thisVarAlias;
        Object channel;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("channels", this.channels);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("channel", this.channel);
        }

        public void updateScope(RuntimeStack stack) {

            this.channels = stack.getVariable("channels");
            this._thisVarAlias = stack.getVariable("this");
            this.channel = stack.getVariable("channel");
        }
    }
}
