package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Log.classes.LogLevel;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionProperty;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_exception_handler;
import com.runtimeconverter.runtime.nativeClasses.errors.ErrorException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.FatalErrorHandler.classes.UndefinedMethodFatalErrorHandler;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.FatalThrowableError;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_arg;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.FatalErrorException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Log.classes.LoggerInterface;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.FatalErrorHandler.classes.UndefinedFunctionFatalErrorHandler;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_exception_handler;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.SilencedErrorContext;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_error_reporting;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_register_shutdown_function;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_num_args;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.FatalErrorHandler.classes.ClassNotFoundFatalErrorHandler;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_error_get_last;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.OutOfMemoryException;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/debug/ErrorHandler.php

*/

public class ErrorHandler extends RuntimeClassBase {

    public Object levels =
            ZVal.newArray(
                    new ZPair(8192, "Deprecated"),
                    new ZPair(16384, "User Deprecated"),
                    new ZPair(8, "Notice"),
                    new ZPair(1024, "User Notice"),
                    new ZPair(2048, "Runtime Notice"),
                    new ZPair(2, "Warning"),
                    new ZPair(512, "User Warning"),
                    new ZPair(128, "Compile Warning"),
                    new ZPair(32, "Core Warning"),
                    new ZPair(256, "User Error"),
                    new ZPair(4096, "Catchable Fatal Error"),
                    new ZPair(64, "Compile Error"),
                    new ZPair(4, "Parse Error"),
                    new ZPair(1, "Error"),
                    new ZPair(16, "Core Error"));

    public Object loggers =
            ZVal.newArray(
                    new ZPair(
                            8192,
                            ZVal.newArray(
                                    new ZPair(0, ZVal.getNull()),
                                    new ZPair(1, LogLevel.CONST_INFO))),
                    new ZPair(
                            16384,
                            ZVal.newArray(
                                    new ZPair(0, ZVal.getNull()),
                                    new ZPair(1, LogLevel.CONST_INFO))),
                    new ZPair(
                            8,
                            ZVal.newArray(
                                    new ZPair(0, ZVal.getNull()),
                                    new ZPair(1, LogLevel.CONST_WARNING))),
                    new ZPair(
                            1024,
                            ZVal.newArray(
                                    new ZPair(0, ZVal.getNull()),
                                    new ZPair(1, LogLevel.CONST_WARNING))),
                    new ZPair(
                            2048,
                            ZVal.newArray(
                                    new ZPair(0, ZVal.getNull()),
                                    new ZPair(1, LogLevel.CONST_WARNING))),
                    new ZPair(
                            2,
                            ZVal.newArray(
                                    new ZPair(0, ZVal.getNull()),
                                    new ZPair(1, LogLevel.CONST_WARNING))),
                    new ZPair(
                            512,
                            ZVal.newArray(
                                    new ZPair(0, ZVal.getNull()),
                                    new ZPair(1, LogLevel.CONST_WARNING))),
                    new ZPair(
                            128,
                            ZVal.newArray(
                                    new ZPair(0, ZVal.getNull()),
                                    new ZPair(1, LogLevel.CONST_WARNING))),
                    new ZPair(
                            32,
                            ZVal.newArray(
                                    new ZPair(0, ZVal.getNull()),
                                    new ZPair(1, LogLevel.CONST_WARNING))),
                    new ZPair(
                            256,
                            ZVal.newArray(
                                    new ZPair(0, ZVal.getNull()),
                                    new ZPair(1, LogLevel.CONST_CRITICAL))),
                    new ZPair(
                            4096,
                            ZVal.newArray(
                                    new ZPair(0, ZVal.getNull()),
                                    new ZPair(1, LogLevel.CONST_CRITICAL))),
                    new ZPair(
                            64,
                            ZVal.newArray(
                                    new ZPair(0, ZVal.getNull()),
                                    new ZPair(1, LogLevel.CONST_CRITICAL))),
                    new ZPair(
                            4,
                            ZVal.newArray(
                                    new ZPair(0, ZVal.getNull()),
                                    new ZPair(1, LogLevel.CONST_CRITICAL))),
                    new ZPair(
                            1,
                            ZVal.newArray(
                                    new ZPair(0, ZVal.getNull()),
                                    new ZPair(1, LogLevel.CONST_CRITICAL))),
                    new ZPair(
                            16,
                            ZVal.newArray(
                                    new ZPair(0, ZVal.getNull()),
                                    new ZPair(1, LogLevel.CONST_CRITICAL))));

    public Object thrownErrors = 8191;

    public Object scopedErrors = 8191;

    public Object tracedErrors = 30715;

    public Object screamedErrors = 85;

    public Object loggedErrors = 0;

    public Object traceReflector = null;

    public Object isRecursive = 0;

    public Object isRoot = false;

    public Object exceptionHandler = null;

    public Object bootstrappingLogger = null;

    public ErrorHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ErrorHandler.class) {
            this.__construct(env, args);
        }
    }

    public ErrorHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "bootstrappingLogger",
        typeHint = "Symfony\\Component\\Debug\\BufferingLogger",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object bootstrappingLogger = assignParameter(args, 0, true);
        if (null == bootstrappingLogger) {
            bootstrappingLogger = ZVal.getNull();
        }
        if (ZVal.isTrue(bootstrappingLogger)) {
            this.bootstrappingLogger = bootstrappingLogger;
            this.setDefaultLogger(env, bootstrappingLogger);
        }

        this.traceReflector = new ReflectionProperty(env, "Exception", "trace");
        env.callMethod(this.traceReflector, "setAccessible", ErrorHandler.class, true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "logger", typeHint = "Psr\\Log\\LoggerInterface")
    @ConvertedParameter(index = 1, name = "levels")
    @ConvertedParameter(
        index = 2,
        name = "replace",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object setDefaultLogger(RuntimeEnv env, Object... args) {
        Object logger = assignParameter(args, 0, false);
        Object levels = assignParameter(args, 1, true);
        if (null == levels) {
            levels = 32767;
        }
        Object replace = assignParameter(args, 2, true);
        if (null == replace) {
            replace = false;
        }
        Object logLevel = null;
        ReferenceContainer loggers = new BasicReferenceContainer(null);
        ReferenceContainer log = new BasicReferenceContainer(null);
        Object type = null;
        loggers.setObject(ZVal.newArray());
        if (function_is_array.f.env(env).call(levels).getBool()) {
            for (ZPair zpairResult1771 : ZVal.getIterable(levels, env, false)) {
                type = ZVal.assign(zpairResult1771.getKey());
                logLevel = ZVal.assign(zpairResult1771.getValue());
                if (ZVal.toBool(
                                ZVal.toBool(
                                                arrayActionR(
                                                        ArrayAction.EMPTY,
                                                        new ReferenceClassProperty(
                                                                this, "loggers", env),
                                                        env,
                                                        type,
                                                        0))
                                        || ZVal.toBool(replace))
                        || ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        new ReferenceClassProperty(this, "loggers", env)
                                                .arrayGet(env, type, 0),
                                        "===",
                                        this.bootstrappingLogger))) {
                    loggers.arrayAccess(env, type)
                            .set(ZVal.newArray(new ZPair(0, logger), new ZPair(1, logLevel)));
                }
            }

        } else {
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", levels)) {
                levels = 32767;
            }

            for (ZPair zpairResult1772 : ZVal.getIterable(this.loggers, env, false)) {
                type = ZVal.assign(zpairResult1772.getKey());
                log.setObject(ZVal.assign(zpairResult1772.getValue()));
                if (ZVal.toBool(ZVal.toLong(type) & ZVal.toLong(levels))
                        && ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                arrayActionR(
                                                                        ArrayAction.EMPTY,
                                                                        log,
                                                                        env,
                                                                        0))
                                                        || ZVal.toBool(replace))
                                        || ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        log.arrayGet(env, 0),
                                                        "===",
                                                        this.bootstrappingLogger)))) {
                    log.arrayAccess(env, 0).set(logger);
                    loggers.arrayAccess(env, type).set(log.getObject());
                }
            }
        }

        this.setLoggers(env, loggers.getObject());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "loggers", typeHint = "array")
    public Object setLoggers(RuntimeEnv env, Object... args) {
        Object loggers = assignParameter(args, 0, false);
        ReferenceContainer flush = new BasicReferenceContainer(null);
        ReferenceContainer log = new BasicReferenceContainer(null);
        ReferenceContainer prev = new BasicReferenceContainer(null);
        Object prevLogged = null;
        Object type = null;
        prevLogged = ZVal.assign(this.loggedErrors);
        prev.setObject(ZVal.assign(this.loggers));
        flush.setObject(ZVal.newArray());
        for (ZPair zpairResult1773 : ZVal.getIterable(loggers, env, false)) {
            type = ZVal.assign(zpairResult1773.getKey());
            log.setObject(ZVal.assign(zpairResult1773.getValue()));
            if (!arrayActionR(ArrayAction.ISSET, prev, env, type)) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env, "Unknown error type: " + toStringR(type, env)));
            }

            if (!function_is_array.f.env(env).call(log.getObject()).getBool()) {
                log.setObject(ZVal.newArray(new ZPair(0, log.getObject())));

            } else if (!function_array_key_exists.f.env(env).call(0, log.getObject()).getBool()) {
                throw ZVal.getException(
                        env, new InvalidArgumentException(env, "No logger provided"));
            }

            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", log.arrayGet(env, 0))) {
                this.loggedErrors = ZAssignment.and("&=", this.loggedErrors, ~ZVal.toLong(type));

            } else if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            log.arrayGet(env, 0),
                            LoggerInterface.class,
                            "Psr\\Log\\LoggerInterface"))) {
                this.loggedErrors = ZAssignment.or("|=", this.loggedErrors, type);

            } else {
                throw ZVal.getException(
                        env, new InvalidArgumentException(env, "Invalid logger provided"));
            }

            new ReferenceClassProperty(this, "loggers", env)
                    .arrayAccess(env, type)
                    .set(ZVal.add(log.getObject(), prev.arrayGet(env, type)));
            if (ZVal.toBool(this.bootstrappingLogger)
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    prev.arrayGet(env, type, 0),
                                    "===",
                                    this.bootstrappingLogger))) {
                flush.arrayAccess(env, type).set(type);
            }
        }

        this.reRegister(env, ZVal.toLong(prevLogged) | ZVal.toLong(this.thrownErrors));
        if (ZVal.isTrue(flush.getObject())) {
            for (ZPair zpairResult1774 :
                    ZVal.getIterable(
                            env.callMethod(
                                    this.bootstrappingLogger, "cleanLogs", ErrorHandler.class),
                            env,
                            true)) {
                log.setObject(ZVal.assign(zpairResult1774.getValue()));
                type =
                        ZVal.assign(
                                ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        log.arrayGet(env, 2, "exception"),
                                                        ErrorException.class,
                                                        "ErrorException"))
                                        ? env.callMethod(
                                                log.arrayGet(env, 2, "exception"),
                                                "getSeverity",
                                                ErrorHandler.class)
                                        : 1);
                if (!arrayActionR(ArrayAction.ISSET, flush, env, type)) {
                    env.callMethod(
                            this.bootstrappingLogger,
                            "log",
                            ErrorHandler.class,
                            log.arrayGet(env, 0),
                            log.arrayGet(env, 1),
                            log.arrayGet(env, 2));

                } else if (ZVal.isTrue(
                        new ReferenceClassProperty(this, "loggers", env).arrayGet(env, type, 0))) {
                    env.callMethod(
                            new ReferenceClassProperty(this, "loggers", env).arrayGet(env, type, 0),
                            "log",
                            ErrorHandler.class,
                            new ReferenceClassProperty(this, "loggers", env).arrayGet(env, type, 1),
                            log.arrayGet(env, 1),
                            log.arrayGet(env, 2));
                }
            }
        }

        return ZVal.assign(prev.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "handler",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setExceptionHandler(RuntimeEnv env, Object... args) {
        Object handler = assignParameter(args, 0, true);
        if (null == handler) {
            handler = ZVal.getNull();
        }
        Object prev = null;
        prev = ZVal.assign(this.exceptionHandler);
        this.exceptionHandler = handler;
        return ZVal.assign(prev);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "levels")
    @ConvertedParameter(
        index = 1,
        name = "replace",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object throwAt(RuntimeEnv env, Object... args) {
        Object levels = assignParameter(args, 0, false);
        Object replace = assignParameter(args, 1, true);
        if (null == replace) {
            replace = false;
        }
        Object prev = null;
        prev = ZVal.assign(this.thrownErrors);
        this.thrownErrors =
                ZVal.toLong(
                                ZVal.toLong(
                                                ZVal.toLong(ZVal.toLong(levels) | ZVal.toLong(4096))
                                                        | ZVal.toLong(256))
                                        & ZVal.toLong(~ZVal.toLong(16384)))
                        & ZVal.toLong(~ZVal.toLong(8192));
        if (!ZVal.isTrue(replace)) {
            this.thrownErrors = ZAssignment.or("|=", this.thrownErrors, prev);
        }

        this.reRegister(env, ZVal.toLong(prev) | ZVal.toLong(this.loggedErrors));
        return ZVal.assign(prev);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "levels")
    @ConvertedParameter(
        index = 1,
        name = "replace",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object scopeAt(RuntimeEnv env, Object... args) {
        Object levels = assignParameter(args, 0, false);
        Object replace = assignParameter(args, 1, true);
        if (null == replace) {
            replace = false;
        }
        Object prev = null;
        prev = ZVal.assign(this.scopedErrors);
        this.scopedErrors = ZVal.toLong(levels);
        if (!ZVal.isTrue(replace)) {
            this.scopedErrors = ZAssignment.or("|=", this.scopedErrors, prev);
        }

        return ZVal.assign(prev);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "levels")
    @ConvertedParameter(
        index = 1,
        name = "replace",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object traceAt(RuntimeEnv env, Object... args) {
        Object levels = assignParameter(args, 0, false);
        Object replace = assignParameter(args, 1, true);
        if (null == replace) {
            replace = false;
        }
        Object prev = null;
        prev = ZVal.assign(this.tracedErrors);
        this.tracedErrors = ZVal.toLong(levels);
        if (!ZVal.isTrue(replace)) {
            this.tracedErrors = ZAssignment.or("|=", this.tracedErrors, prev);
        }

        return ZVal.assign(prev);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "levels")
    @ConvertedParameter(
        index = 1,
        name = "replace",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object screamAt(RuntimeEnv env, Object... args) {
        Object levels = assignParameter(args, 0, false);
        Object replace = assignParameter(args, 1, true);
        if (null == replace) {
            replace = false;
        }
        Object prev = null;
        prev = ZVal.assign(this.screamedErrors);
        this.screamedErrors = ZVal.toLong(levels);
        if (!ZVal.isTrue(replace)) {
            this.screamedErrors = ZAssignment.or("|=", this.screamedErrors, prev);
        }

        return ZVal.assign(prev);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prev")
    private Object reRegister(RuntimeEnv env, Object... args) {
        Object prev = assignParameter(args, 0, false);
        ReferenceContainer handler = new BasicReferenceContainer(null);
        if (ZVal.isTrue(
                ZVal.toLong(ZVal.strictNotEqualityCheck(prev, "!==", this.thrownErrors))
                        | ZVal.toLong(this.loggedErrors))) {
            handler.setObject(function_set_error_handler.f.env(env).call("var_dump").value());
            handler.setObject(
                    ZVal.assign(
                            function_is_array.f.env(env).call(handler.getObject()).getBool()
                                    ? handler.arrayGet(env, 0)
                                    : ZVal.getNull()));
            function_restore_error_handler.f.env(env).call();
            if (ZVal.strictEqualityCheck(handler.getObject(), "===", this)) {
                function_restore_error_handler.f.env(env).call();
                if (ZVal.isTrue(this.isRoot)) {
                    function_set_error_handler
                            .f
                            .env(env)
                            .call(
                                    ZVal.newArray(new ZPair(0, this), new ZPair(1, "handleError")),
                                    ZVal.toLong(this.thrownErrors)
                                            | ZVal.toLong(this.loggedErrors));

                } else {
                    function_set_error_handler
                            .f
                            .env(env)
                            .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "handleError")));
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(index = 1, name = "message")
    @ConvertedParameter(index = 2, name = "file")
    @ConvertedParameter(index = 3, name = "line")
    public Object handleError(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        Object file = assignParameter(args, 2, false);
        Object line = assignParameter(args, 3, false);
        Object silenced = null;
        Object level = null;
        Object log = null;
        ReferenceContainer e = new BasicReferenceContainer(null);
        ReferenceContainer backtrace = new BasicReferenceContainer(null);
        Object logMessage = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object ternaryExpressionTemp = null;
        Object numArgs = null;
        Object _pThrow = null;
        Object scope = null;
        Object errorAsException = null;
        ReferenceContainer context = new BasicReferenceContainer(null);
        Object lightTrace = null;
        Object id = null;
        level = function_error_reporting.f.env(env).call().value();
        silenced = ZVal.strictEqualityCheck(0, "===", ZVal.toLong(level) & ZVal.toLong(type));
        level =
                ZAssignment.or(
                        "|=",
                        level,
                        ZVal.toLong(
                                        ZVal.toLong(ZVal.toLong(4096) | ZVal.toLong(256))
                                                | ZVal.toLong(8192))
                                | ZVal.toLong(16384));
        log = ZVal.toLong(this.loggedErrors) & ZVal.toLong(type);
        _pThrow =
                ZVal.toLong(ZVal.toLong(this.thrownErrors) & ZVal.toLong(type))
                        & ZVal.toLong(level);
        type = ZAssignment.and("&=", type, ZVal.toLong(level) | ZVal.toLong(this.screamedErrors));
        if (ZVal.toBool(!ZVal.isTrue(type))
                || ZVal.toBool(
                        ZVal.toBool(!ZVal.isTrue(log)) && ZVal.toBool(!ZVal.isTrue(_pThrow)))) {
            return ZVal.assign(
                    ZVal.toBool(ZVal.toBool(!ZVal.isTrue(silenced)) && ZVal.toBool(type))
                            && ZVal.toBool(log));
        }

        scope = ZVal.toLong(this.scopedErrors) & ZVal.toLong(type);
        if (ZVal.isLessThan(
                4,
                '<',
                numArgs =
                        function_func_num_args
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call()
                                .value())) {
            context.setObject(
                    ZVal.assign(
                            ZVal.isTrue(scope)
                                    ? ZVal.isTrue(
                                                    ternaryExpressionTemp =
                                                            function_func_get_arg
                                                                    .f
                                                                    .env(env)
                                                                    .addReferenceArgs(
                                                                            new RuntimeArgsWithInfo(
                                                                                    args, this))
                                                                    .call(4)
                                                                    .value())
                                            ? ternaryExpressionTemp
                                            : ZVal.newArray()
                                    : ZVal.newArray()));

        } else {
            context.setObject(ZVal.newArray());
        }

        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, context, env, "GLOBALS"))
                && ZVal.toBool(scope)) {
            e.setObject(ZVal.assign(context.getObject()));
            arrayActionR(ArrayAction.UNSET, e, env, "GLOBALS");
            context.setObject(null);
            context.setObject(ZVal.assign(e.getObject()));
        }

        logMessage =
                toStringR(new ReferenceClassProperty(this, "levels", env).arrayGet(env, type), env)
                        + ": "
                        + toStringR(message, env);
        if (ZVal.strictNotEqualityCheck(
                ZVal.getNull(),
                "!==",
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Symfony
                                        .namespaces
                                        .Component
                                        .namespaces
                                        .Debug
                                        .classes
                                        .ErrorHandler
                                        .RequestStaticProperties
                                        .class)
                        .toStringException)) {
            errorAsException =
                    ZVal.assign(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .Debug
                                                    .classes
                                                    .ErrorHandler
                                                    .RequestStaticProperties
                                                    .class)
                                    .toStringException);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .Debug
                                            .classes
                                            .ErrorHandler
                                            .RequestStaticProperties
                                            .class)
                            .toStringException =
                    ZVal.getNull();

        } else if (ZVal.toBool(!ZVal.isTrue(_pThrow))
                && ZVal.toBool(!ZVal.isTrue(ZVal.toLong(type) & ZVal.toLong(level)))) {
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Symfony
                                    .namespaces
                                    .Component
                                    .namespaces
                                    .Debug
                                    .classes
                                    .ErrorHandler
                                    .RequestStaticProperties
                                    .class,
                            "silencedErrorCache"),
                    env,
                    id = toStringR(file, env) + ":" + toStringR(line, env))) {
                lightTrace =
                        ZVal.assign(
                                ZVal.isTrue(ZVal.toLong(this.tracedErrors) & ZVal.toLong(type))
                                        ? this.cleanTrace(
                                                env,
                                                NamespaceGlobal.debug_backtrace
                                                        .env(env)
                                                        .call(2, 3)
                                                        .value(),
                                                type,
                                                file,
                                                line,
                                                false)
                                        : ZVal.newArray());
                errorAsException = new SilencedErrorContext(env, type, file, line, lightTrace);

            } else if (arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Symfony
                                    .namespaces
                                    .Component
                                    .namespaces
                                    .Debug
                                    .classes
                                    .ErrorHandler
                                    .RequestStaticProperties
                                    .class,
                            "silencedErrorCache"),
                    env,
                    id,
                    message)) {
                lightTrace = ZVal.getNull();
                errorAsException =
                        ZVal.assign(
                                env.getRequestStaticPropertiesReference(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Symfony
                                                        .namespaces
                                                        .Component
                                                        .namespaces
                                                        .Debug
                                                        .classes
                                                        .ErrorHandler
                                                        .RequestStaticProperties
                                                        .class,
                                                "silencedErrorCache")
                                        .arrayGet(env, id, message));
                toObjectR(errorAsException)
                        .accessProp(this, env)
                        .name("count")
                        .set(
                                ZVal.increment(
                                        toObjectR(errorAsException)
                                                .accessProp(this, env)
                                                .name("count")
                                                .value()));

            } else {
                lightTrace = ZVal.newArray();
                errorAsException = ZVal.getNull();
            }

            if (ZVal.isLessThan(
                    100,
                    '<',
                    ZVal.preIncrement(
                            env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .Debug
                                            .classes
                                            .ErrorHandler
                                            .RequestStaticProperties
                                            .class,
                                    "silencedErrorCount")))) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .Debug
                                                .classes
                                                .ErrorHandler
                                                .RequestStaticProperties
                                                .class)
                                .silencedErrorCache =
                        lightTrace = ZVal.newArray();
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .Debug
                                                .classes
                                                .ErrorHandler
                                                .RequestStaticProperties
                                                .class)
                                .silencedErrorCount =
                        1;
            }

            if (ZVal.isTrue(errorAsException)) {
                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Symfony
                                        .namespaces
                                        .Component
                                        .namespaces
                                        .Debug
                                        .classes
                                        .ErrorHandler
                                        .RequestStaticProperties
                                        .class,
                                "silencedErrorCache")
                        .arrayAccess(env, id, message)
                        .set(errorAsException);
            }

            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", lightTrace)) {
                return null;
            }

        } else {
            errorAsException = new ErrorException(env, logMessage, 0, type, file, line);
            if (ZVal.toBool(_pThrow)
                    || ZVal.toBool(ZVal.toLong(this.tracedErrors) & ZVal.toLong(type))) {
                backtrace.setObject(
                        env.callMethod(errorAsException, "getTrace", ErrorHandler.class));
                lightTrace = this.cleanTrace(env, backtrace.getObject(), type, file, line, _pThrow);
                env.callMethod(
                        this.traceReflector,
                        "setValue",
                        ErrorHandler.class,
                        errorAsException,
                        lightTrace);

            } else {
                env.callMethod(
                        this.traceReflector,
                        "setValue",
                        ErrorHandler.class,
                        errorAsException,
                        ZVal.newArray());
                backtrace.setObject(ZVal.newArray());
            }
        }

        if (ZVal.isTrue(_pThrow)) {
            if (ZVal.isTrue(ZVal.toLong(256) & ZVal.toLong(type))) {
                for (i.setObject(1);
                        arrayActionR(ArrayAction.ISSET, backtrace, env, i.getObject());
                        i.setObject(ZVal.increment(i.getObject()))) {
                    if (ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.toBool(
                                                                    ZVal.toBool(
                                                                                    ZVal.toBool(
                                                                                                    ZVal
                                                                                                                    .toBool(
                                                                                                                            arrayActionR(
                                                                                                                                    ArrayAction
                                                                                                                                            .ISSET,
                                                                                                                                    backtrace,
                                                                                                                                    env,
                                                                                                                                    i
                                                                                                                                            .getObject(),
                                                                                                                                    "function"))
                                                                                                            && ZVal
                                                                                                                    .toBool(
                                                                                                                            arrayActionR(
                                                                                                                                    ArrayAction
                                                                                                                                            .ISSET,
                                                                                                                                    backtrace,
                                                                                                                                    env,
                                                                                                                                    i
                                                                                                                                            .getObject(),
                                                                                                                                    "type")))
                                                                                            && ZVal
                                                                                                    .toBool(
                                                                                                            arrayActionR(
                                                                                                                    ArrayAction
                                                                                                                            .ISSET,
                                                                                                                    backtrace,
                                                                                                                    env,
                                                                                                                    ZVal
                                                                                                                            .subtract(
                                                                                                                                    i
                                                                                                                                            .getObject(),
                                                                                                                                    1),
                                                                                                                    "function")))
                                                                            && ZVal.toBool(
                                                                                    ZVal
                                                                                            .strictEqualityCheck(
                                                                                                    "__toString",
                                                                                                    "===",
                                                                                                    backtrace
                                                                                                            .arrayGet(
                                                                                                                    env,
                                                                                                                    i
                                                                                                                            .getObject(),
                                                                                                                    "function"))))
                                                            && ZVal.toBool(
                                                                    ZVal.strictEqualityCheck(
                                                                            "->",
                                                                            "===",
                                                                            backtrace.arrayGet(
                                                                                    env,
                                                                                    i.getObject(),
                                                                                    "type"))))
                                            && ZVal.toBool(
                                                    !arrayActionR(
                                                            ArrayAction.ISSET,
                                                            backtrace,
                                                            env,
                                                            ZVal.subtract(i.getObject(), 1),
                                                            "class")))
                            && ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            "trigger_error",
                                                            "===",
                                                            backtrace.arrayGet(
                                                                    env,
                                                                    ZVal.subtract(i.getObject(), 1),
                                                                    "function")))
                                            || ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            "user_error",
                                                            "===",
                                                            backtrace.arrayGet(
                                                                    env,
                                                                    ZVal.subtract(i.getObject(), 1),
                                                                    "function"))))) {
                        for (ZPair zpairResult1775 :
                                ZVal.getIterable(context.getObject(), env, true)) {
                            e.setObject(ZVal.assign(zpairResult1775.getValue()));
                            if (ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    e.getObject(), Throwable.class, "Throwable"))
                                    && ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    env.callMethod(
                                                            e.getObject(),
                                                            "__toString",
                                                            ErrorHandler.class),
                                                    "===",
                                                    message))) {
                                env.getRequestStaticProperties(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Symfony
                                                                .namespaces
                                                                .Component
                                                                .namespaces
                                                                .Debug
                                                                .classes
                                                                .ErrorHandler
                                                                .RequestStaticProperties
                                                                .class)
                                                .toStringException =
                                        e.getObject();
                                return ZVal.assign(true);
                            }
                        }

                        this.handleException(env, errorAsException);
                        return ZVal.assign(false);
                    }
                }
            }

            throw ZVal.getException(env, errorAsException);
        }

        if (ZVal.isTrue(this.isRecursive)) {
            log = 0;

        } else {
            try {
                this.isRecursive = true;
                level =
                        ZVal.assign(
                                ZVal.isTrue(ZVal.toLong(type) & ZVal.toLong(level))
                                        ? new ReferenceClassProperty(this, "loggers", env)
                                                .arrayGet(env, type, 1)
                                        : LogLevel.CONST_DEBUG);
                env.callMethod(
                        new ReferenceClassProperty(this, "loggers", env).arrayGet(env, type, 0),
                        "log",
                        ErrorHandler.class,
                        level,
                        logMessage,
                        ZVal.isTrue(errorAsException)
                                ? ZVal.newArray(new ZPair("exception", errorAsException))
                                : ZVal.newArray());
            } catch (ConvertedException convertedException247) {

                throw convertedException247;
            } finally {
                this.isRecursive = false;
            }
        }

        return ZVal.assign(
                ZVal.toBool(ZVal.toBool(!ZVal.isTrue(silenced)) && ZVal.toBool(type))
                        && ZVal.toBool(log));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception")
    @ConvertedParameter(
        index = 1,
        name = "error",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object handleException(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object exception = assignParameter(args, 0, false);
        Object error = assignParameter(args, 1, true);
        if (null == error) {
            error = ZVal.getNull();
        }
        Object handler = null;
        Object e = null;
        Object handlerException = null;
        Object ternaryExpressionTemp = null;
        Object type = null;
        Object message = null;
        Object exceptionHandler = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", error)) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .Debug
                                            .classes
                                            .ErrorHandler
                                            .RequestStaticProperties
                                            .class)
                            .exitCode =
                    255;
        }

        if (!ZVal.isTrue(ZVal.checkInstanceType(exception, PHPException.class, "Exception"))) {
            exception = new FatalThrowableError(env, exception);
        }

        type =
                ZVal.assign(
                        ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                exception,
                                                FatalErrorException.class,
                                                "Symfony\\Component\\Debug\\Exception\\FatalErrorException"))
                                ? env.callMethod(exception, "getSeverity", ErrorHandler.class)
                                : 1);
        handlerException = ZVal.getNull();
        if (ZVal.toBool(ZVal.toLong(this.loggedErrors) & ZVal.toLong(type))
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                exception,
                                FatalThrowableError.class,
                                "Symfony\\Component\\Debug\\Exception\\FatalThrowableError"))) {
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            exception,
                            FatalErrorException.class,
                            "Symfony\\Component\\Debug\\Exception\\FatalErrorException"))) {
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                exception,
                                FatalThrowableError.class,
                                "Symfony\\Component\\Debug\\Exception\\FatalThrowableError"))) {
                    error =
                            ZVal.newArray(
                                    new ZPair("type", type),
                                    new ZPair(
                                            "message",
                                            message =
                                                    env.callMethod(
                                                            exception,
                                                            "getMessage",
                                                            ErrorHandler.class)),
                                    new ZPair(
                                            "file",
                                            env.callMethod(
                                                    exception, "getFile", ErrorHandler.class)),
                                    new ZPair(
                                            "line",
                                            env.callMethod(
                                                    exception, "getLine", ErrorHandler.class)));

                } else {
                    message =
                            "Fatal "
                                    + toStringR(
                                            env.callMethod(
                                                    exception, "getMessage", ErrorHandler.class),
                                            env);
                }

            } else if (ZVal.isTrue(
                    ZVal.checkInstanceType(exception, ErrorException.class, "ErrorException"))) {
                message =
                        "Uncaught "
                                + toStringR(
                                        env.callMethod(exception, "getMessage", ErrorHandler.class),
                                        env);

            } else {
                message =
                        "Uncaught Exception: "
                                + toStringR(
                                        env.callMethod(exception, "getMessage", ErrorHandler.class),
                                        env);
            }
        }

        if (ZVal.isTrue(ZVal.toLong(this.loggedErrors) & ZVal.toLong(type))) {
            try {
                env.callMethod(
                        new ReferenceClassProperty(this, "loggers", env).arrayGet(env, type, 0),
                        "log",
                        ErrorHandler.class,
                        new ReferenceClassProperty(this, "loggers", env).arrayGet(env, type, 1),
                        message,
                        ZVal.newArray(new ZPair("exception", exception)));
            } catch (ConvertedException convertedException248) {
                if (convertedException248.instanceOf(Throwable.class, "Throwable")) {
                    handlerException = convertedException248.getObject();
                } else {
                    throw convertedException248;
                }
            }
        }

        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                exception,
                                                FatalErrorException.class,
                                                "Symfony\\Component\\Debug\\Exception\\FatalErrorException"))
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        exception,
                                                        OutOfMemoryException.class,
                                                        "Symfony\\Component\\Debug\\Exception\\OutOfMemoryException"))))
                && ZVal.toBool(error)) {
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult1776 :
                    ZVal.getIterable(this.getFatalErrorHandlers(env), env, true)) {
                handler = ZVal.assign(zpairResult1776.getValue());
                if (ZVal.isTrue(
                        e =
                                env.callMethod(
                                        handler,
                                        "handleError",
                                        ErrorHandler.class,
                                        error,
                                        exception))) {
                    exception = ZVal.assign(e);
                    break;
                }
            }
        }

        exceptionHandler = ZVal.assign(this.exceptionHandler);
        this.exceptionHandler = ZVal.getNull();
        try {
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", exceptionHandler)) {
                return ZVal.assign(
                        function_call_user_func
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(exceptionHandler, exception)
                                .value());
            }

            handlerException =
                    ZVal.assign(
                            ZVal.isTrue(ternaryExpressionTemp = handlerException)
                                    ? ternaryExpressionTemp
                                    : exception);
        } catch (ConvertedException convertedException249) {
            if (convertedException249.instanceOf(Throwable.class, "Throwable")) {
                handlerException = convertedException249.getObject();
            } else {
                throw convertedException249;
            }
        }

        if (ZVal.strictEqualityCheck(exception, "===", handlerException)) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .Debug
                                            .classes
                                            .ErrorHandler
                                            .RequestStaticProperties
                                            .class)
                            .reservedMemory =
                    ZVal.getNull();
            throw ZVal.getException(env, exception);
        }

        this.handleException(env, handlerException);
        return null;
    }

    @ConvertedMethod
    protected Object getFatalErrorHandlers(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(0, new UndefinedFunctionFatalErrorHandler(env)),
                        new ZPair(1, new UndefinedMethodFatalErrorHandler(env)),
                        new ZPair(2, new ClassNotFoundFatalErrorHandler(env))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "backtrace")
    @ConvertedParameter(index = 1, name = "type")
    @ConvertedParameter(index = 2, name = "file")
    @ConvertedParameter(index = 3, name = "line")
    @ConvertedParameter(index = 4, name = "throw")
    private Object cleanTrace(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer backtrace = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object type = assignParameter(args, 1, false);
        Object file = assignParameter(args, 2, false);
        Object line = assignParameter(args, 3, false);
        Object _pThrow = assignParameter(args, 4, false);
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer lightTrace = new BasicReferenceContainer(null);
        lightTrace.setObject(ZVal.assign(backtrace.getObject()));
        runtimeConverterBreakCount = 0;
        for (i.setObject(0);
                arrayActionR(ArrayAction.ISSET, backtrace, env, i.getObject());
                i.setObject(ZVal.increment(i.getObject()))) {
            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(
                                                            arrayActionR(
                                                                    ArrayAction.ISSET,
                                                                    backtrace,
                                                                    env,
                                                                    i.getObject(),
                                                                    "file"))
                                                    && ZVal.toBool(
                                                            arrayActionR(
                                                                    ArrayAction.ISSET,
                                                                    backtrace,
                                                                    env,
                                                                    i.getObject(),
                                                                    "line")))
                                    && ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    backtrace.arrayGet(env, i.getObject(), "line"),
                                                    "===",
                                                    line)))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    backtrace.arrayGet(env, i.getObject(), "file"), "===", file))) {
                lightTrace.setObject(
                        function_array_slice
                                .f
                                .env(env)
                                .call(lightTrace.getObject(), ZVal.add(1, i.getObject()))
                                .value());
                break;
            }
        }

        if (!ZVal.toBool(_pThrow)
                || ZVal.toBool(ZVal.toLong(this.scopedErrors) & ZVal.toLong(type))) {
            runtimeConverterBreakCount = 0;
            for (i.setObject(0);
                    arrayActionR(ArrayAction.ISSET, lightTrace, env, i.getObject());
                    i.setObject(ZVal.increment(i.getObject()))) {
                arrayActionR(ArrayAction.UNSET, lightTrace, env, i.getObject(), "args");
                arrayActionR(ArrayAction.UNSET, lightTrace, env, i.getObject(), "object");
            }
        }

        return ZVal.assign(lightTrace.getObject());
    }

    public static final Object CONST_class = "Symfony\\Component\\Debug\\ErrorHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "handler",
            typeHint = "self",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 1,
            name = "replace",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object register(RuntimeEnv env, Object... args) {
            Object handler = assignParameter(args, 0, true);
            if (null == handler) {
                handler = ZVal.getNull();
            }
            Object replace = assignParameter(args, 1, true);
            if (null == replace) {
                replace = true;
            }
            Object p = null;
            Object handlerIsRegistered = null;
            ReferenceContainer prev = new BasicReferenceContainer(null);
            Object handlerIsNew = null;
            if (ZVal.strictEqualityCheck(
                    ZVal.getNull(),
                    "===",
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .Debug
                                            .classes
                                            .ErrorHandler
                                            .RequestStaticProperties
                                            .class)
                            .reservedMemory)) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .Debug
                                                .classes
                                                .ErrorHandler
                                                .RequestStaticProperties
                                                .class)
                                .reservedMemory =
                        function_str_repeat.f.env(env).call("x", 10240).value();
                function_register_shutdown_function
                        .f
                        .env(env)
                        .call(toStringR("ErrorHandler", env) + "::handleFatalError");
            }

            if (ZVal.isTrue(
                    handlerIsNew = ZVal.strictEqualityCheck(ZVal.getNull(), "===", handler))) {
                handler = env.createNewWithLateStaticBindings(this);
            }

            if (ZVal.strictEqualityCheck(
                    ZVal.getNull(),
                    "===",
                    prev.setObject(
                            function_set_error_handler
                                    .f
                                    .env(env)
                                    .call(
                                            ZVal.newArray(
                                                    new ZPair(0, handler),
                                                    new ZPair(1, "handleError")))
                                    .value()))) {
                function_restore_error_handler.f.env(env).call();
                function_set_error_handler
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(new ZPair(0, handler), new ZPair(1, "handleError")),
                                ZVal.toLong(
                                                toObjectR(handler)
                                                        .accessProp(this, env)
                                                        .name("thrownErrors")
                                                        .value())
                                        | ZVal.toLong(
                                                toObjectR(handler)
                                                        .accessProp(this, env)
                                                        .name("loggedErrors")
                                                        .value()));
                toObjectR(handler).accessProp(this, env).name("isRoot").set(true);
            }

            if (ZVal.toBool(
                            ZVal.toBool(handlerIsNew)
                                    && ZVal.toBool(
                                            function_is_array
                                                    .f
                                                    .env(env)
                                                    .call(prev.getObject())
                                                    .value()))
                    && ZVal.toBool(
                            ZVal.checkInstanceType(
                                    prev.arrayGet(env, 0),
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .Debug
                                            .classes
                                            .ErrorHandler
                                            .class,
                                    "Symfony\\Component\\Debug\\ErrorHandler"))) {
                handler = ZVal.assign(prev.arrayGet(env, 0));
                replace = false;
            }

            if (ZVal.toBool(!ZVal.isTrue(replace)) && ZVal.toBool(prev.getObject())) {
                function_restore_error_handler.f.env(env).call();
                handlerIsRegistered =
                        ZVal.toBool(function_is_array.f.env(env).call(prev.getObject()).value())
                                && ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                handler, "===", prev.arrayGet(env, 0)));

            } else {
                handlerIsRegistered = true;
            }

            if (ZVal.toBool(
                            function_is_array
                                    .f
                                    .env(env)
                                    .call(
                                            prev.setObject(
                                                    function_set_exception_handler
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    ZVal.newArray(
                                                                            new ZPair(0, handler),
                                                                            new ZPair(
                                                                                    1,
                                                                                    "handleException")))
                                                            .value()))
                                    .value())
                    && ZVal.toBool(
                            ZVal.checkInstanceType(
                                    prev.arrayGet(env, 0),
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .Debug
                                            .classes
                                            .ErrorHandler
                                            .class,
                                    "Symfony\\Component\\Debug\\ErrorHandler"))) {
                function_restore_exception_handler.f.env(env).call();
                if (!ZVal.isTrue(handlerIsRegistered)) {
                    handler = ZVal.assign(prev.arrayGet(env, 0));

                } else if (ZVal.toBool(
                                ZVal.strictNotEqualityCheck(handler, "!==", prev.arrayGet(env, 0)))
                        && ZVal.toBool(replace)) {
                    function_set_exception_handler
                            .f
                            .env(env)
                            .call(
                                    ZVal.newArray(
                                            new ZPair(0, handler),
                                            new ZPair(1, "handleException")));
                    p =
                            env.callMethod(
                                    prev.arrayGet(env, 0),
                                    "setExceptionHandler",
                                    ErrorHandler.class,
                                    ZVal.getNull());
                    env.callMethod(handler, "setExceptionHandler", ErrorHandler.class, p);
                    env.callMethod(
                            prev.arrayGet(env, 0), "setExceptionHandler", ErrorHandler.class, p);
                }

            } else {
                env.callMethod(
                        handler, "setExceptionHandler", ErrorHandler.class, prev.getObject());
            }

            env.callMethod(
                    handler,
                    "throwAt",
                    ErrorHandler.class,
                    ZVal.toLong(32767)
                            & ZVal.toLong(
                                    toObjectR(handler)
                                            .accessProp(this, env)
                                            .name("thrownErrors")
                                            .value()),
                    true);
            return ZVal.assign(handler);
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "error",
            typeHint = "array",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object handleFatalError(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/symfony/debug")
                            .setFile("/vendor/symfony/debug/ErrorHandler.php");
            int runtimeConverterBreakCount;
            ReferenceContainer error = new BasicReferenceContainer(assignParameter(args, 0, true));
            if (null == error.getObject()) {
                error.setObject(ZVal.getNull());
            }
            Object exception = null;
            ReferenceContainer handler = new BasicReferenceContainer(null);
            Object exit = null;
            Object trace = null;
            Object e = null;
            Object handlers = null;
            ReferenceContainer sameHandlerLimit = new BasicReferenceContainer(null);
            Object h = null;
            Object exitCode = null;
            Object previousHandler = null;
            if (ZVal.strictEqualityCheck(
                    ZVal.getNull(),
                    "===",
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .Debug
                                            .classes
                                            .ErrorHandler
                                            .RequestStaticProperties
                                            .class)
                            .reservedMemory)) {
                return null;
            }

            handler.setObject(
                    ZVal.assign(
                            env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Symfony
                                                            .namespaces
                                                            .Component
                                                            .namespaces
                                                            .Debug
                                                            .classes
                                                            .ErrorHandler
                                                            .RequestStaticProperties
                                                            .class)
                                            .reservedMemory =
                                    ZVal.getNull()));
            handlers = ZVal.newArray();
            previousHandler = ZVal.getNull();
            sameHandlerLimit.setObject(10);
            runtimeConverterBreakCount = 0;
            while (ZVal.toBool(!function_is_array.f.env(env).call(handler.getObject()).getBool())
                    || ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            handler.arrayGet(env, 0),
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .Debug
                                                    .classes
                                                    .ErrorHandler
                                                    .class,
                                            "Symfony\\Component\\Debug\\ErrorHandler")))) {
                handler.setObject(
                        function_set_exception_handler.f.env(env).call("var_dump").value());
                function_restore_exception_handler.f.env(env).call();
                if (!ZVal.isTrue(handler.getObject())) {
                    break;
                }

                function_restore_exception_handler.f.env(env).call();
                if (ZVal.strictNotEqualityCheck(handler.getObject(), "!==", previousHandler)) {
                    function_array_unshift.f.env(env).call(handlers, handler.getObject());
                    previousHandler = ZVal.assign(handler.getObject());

                } else if (ZVal.strictEqualityCheck(
                        0, "===", ZVal.preDecrement(sameHandlerLimit))) {
                    handler.setObject(ZVal.getNull());
                    break;
                }
            }

            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult1777 : ZVal.getIterable(handlers, env, true)) {
                h = ZVal.assign(zpairResult1777.getValue());
                function_set_exception_handler.f.env(env).call(h);
            }

            if (!ZVal.isTrue(handler.getObject())) {
                return null;
            }

            if (ZVal.strictNotEqualityCheck(handler.getObject(), "!==", h)) {
                env.callMethod(
                        handler.arrayGet(env, 0), "setExceptionHandler", ErrorHandler.class, h);
            }

            handler.setObject(ZVal.assign(handler.arrayGet(env, 0)));
            handlers = ZVal.newArray();
            if (ZVal.isTrue(
                    exit = ZVal.strictEqualityCheck(ZVal.getNull(), "===", error.getObject()))) {
                error.setObject(function_error_get_last.f.env(env).call().value());
            }

            if (ZVal.toBool(error.getObject())
                    && ZVal.toBool(
                            error.arrayAccess(env, "type")
                                    .set(
                                            ZAssignment.and(
                                                    "&=",
                                                    error.arrayGet(env, "type"),
                                                    ZVal.toLong(
                                                                    ZVal.toLong(
                                                                                    ZVal.toLong(4)
                                                                                            | ZVal
                                                                                                    .toLong(
                                                                                                            1))
                                                                            | ZVal.toLong(16))
                                                            | ZVal.toLong(64))))) {
                env.callMethod(handler.getObject(), "throwAt", ErrorHandler.class, 0, true);
                trace =
                        ZVal.assign(
                                arrayActionR(ArrayAction.ISSET, error, env, "backtrace")
                                        ? error.arrayGet(env, "backtrace")
                                        : ZVal.getNull());
                if (ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        0,
                                        "===",
                                        function_strpos
                                                .f
                                                .env(env)
                                                .call(
                                                        error.arrayGet(env, "message"),
                                                        "Allowed memory")
                                                .value()))
                        || ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        0,
                                        "===",
                                        function_strpos
                                                .f
                                                .env(env)
                                                .call(
                                                        error.arrayGet(env, "message"),
                                                        "Out of memory")
                                                .value()))) {
                    exception =
                            new OutOfMemoryException(
                                    env,
                                    toStringR(
                                                    new ReferenceClassProperty(
                                                                    handler.getObject(),
                                                                    "levels",
                                                                    env)
                                                            .arrayGet(
                                                                    env,
                                                                    error.arrayGet(env, "type")),
                                                    env)
                                            + ": "
                                            + toStringR(error.arrayGet(env, "message"), env),
                                    0,
                                    error.arrayGet(env, "type"),
                                    error.arrayGet(env, "file"),
                                    error.arrayGet(env, "line"),
                                    2,
                                    false,
                                    trace);

                } else {
                    exception =
                            new FatalErrorException(
                                    env,
                                    toStringR(
                                                    new ReferenceClassProperty(
                                                                    handler.getObject(),
                                                                    "levels",
                                                                    env)
                                                            .arrayGet(
                                                                    env,
                                                                    error.arrayGet(env, "type")),
                                                    env)
                                            + ": "
                                            + toStringR(error.arrayGet(env, "message"), env),
                                    0,
                                    error.arrayGet(env, "type"),
                                    error.arrayGet(env, "file"),
                                    error.arrayGet(env, "line"),
                                    2,
                                    true,
                                    trace);
                }

            } else {
                exception = ZVal.getNull();
            }

            try {
                if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", exception)) {
                    env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .Debug
                                                    .classes
                                                    .ErrorHandler
                                                    .RequestStaticProperties
                                                    .class)
                                    .exitCode =
                            255;
                    env.callMethod(
                            handler.getObject(),
                            "handleException",
                            ErrorHandler.class,
                            exception,
                            error.getObject());
                }

            } catch (ConvertedException convertedException250) {
                if (convertedException250.instanceOf(
                        FatalErrorException.class,
                        "Symfony\\Component\\Debug\\Exception\\FatalErrorException")) {
                    e = convertedException250.getObject();
                } else {
                    throw convertedException250;
                }
            }

            if (ZVal.toBool(exit)
                    && ZVal.toBool(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .Debug
                                                    .classes
                                                    .ErrorHandler
                                                    .RequestStaticProperties
                                                    .class)
                                    .exitCode)) {
                exitCode =
                        ZVal.assign(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Symfony
                                                        .namespaces
                                                        .Component
                                                        .namespaces
                                                        .Debug
                                                        .classes
                                                        .ErrorHandler
                                                        .RequestStaticProperties
                                                        .class)
                                        .exitCode);
                function_register_shutdown_function
                        .f
                        .env(env)
                        .call(
                                "register_shutdown_function",
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Symfony\\Component\\Debug",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object exitCode = null;
                                        exitCode =
                                                this.contextReferences.getCapturedValue("exitCode");
                                        env.exit(exitCode);
                                        return null;
                                    }
                                }.use("exitCode", exitCode));
            }

            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object reservedMemory = null;

        public Object toStringException = ZVal.getNull();

        public Object silencedErrorCache = ZVal.newArray();

        public Object silencedErrorCount = 0;

        public Object exitCode = 0;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Debug\\ErrorHandler")
                    .setLookup(
                            ErrorHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bootstrappingLogger",
                            "exceptionHandler",
                            "isRecursive",
                            "isRoot",
                            "levels",
                            "loggedErrors",
                            "loggers",
                            "scopedErrors",
                            "screamedErrors",
                            "thrownErrors",
                            "traceReflector",
                            "tracedErrors")
                    .setStaticPropertyNames(
                            "exitCode",
                            "reservedMemory",
                            "silencedErrorCache",
                            "silencedErrorCount",
                            "toStringException")
                    .setFilename("vendor/symfony/debug/ErrorHandler.php")
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
