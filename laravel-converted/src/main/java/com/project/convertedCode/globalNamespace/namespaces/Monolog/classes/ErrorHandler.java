package com.project.convertedCode.globalNamespace.namespaces.Monolog.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Log.classes.LogLevel;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractHandler;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_exception_handler;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_error_reporting;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_replace;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_register_shutdown_function;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_error_get_last;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/ErrorHandler.php

*/

public class ErrorHandler extends RuntimeClassBase {

    public Object logger = null;

    public Object previousExceptionHandler = null;

    public Object uncaughtExceptionLevel = null;

    public Object previousErrorHandler = null;

    public Object errorLevelMap = null;

    public Object handleOnlyReportedErrors = null;

    public Object hasFatalErrorHandler = null;

    public Object fatalLevel = null;

    public Object reservedMemory = null;

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
    @ConvertedParameter(index = 0, name = "logger", typeHint = "Psr\\Log\\LoggerInterface")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object logger = assignParameter(args, 0, false);
        this.logger = logger;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "level",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "callPrevious",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object registerExceptionHandler(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, true);
        if (null == level) {
            level = ZVal.getNull();
        }
        Object callPrevious = assignParameter(args, 1, true);
        if (null == callPrevious) {
            callPrevious = true;
        }
        Object prev = null;
        prev =
                function_set_exception_handler
                        .f
                        .env(env)
                        .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "handleException")))
                        .value();
        this.uncaughtExceptionLevel = level;
        if (ZVal.toBool(callPrevious) && ZVal.toBool(prev)) {
            this.previousExceptionHandler = prev;
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "levelMap",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 1,
        name = "callPrevious",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "errorTypes")
    @ConvertedParameter(
        index = 3,
        name = "handleOnlyReportedErrors",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object registerErrorHandler(RuntimeEnv env, Object... args) {
        Object levelMap = assignParameter(args, 0, true);
        if (null == levelMap) {
            levelMap = ZVal.newArray();
        }
        Object callPrevious = assignParameter(args, 1, true);
        if (null == callPrevious) {
            callPrevious = true;
        }
        Object errorTypes = assignParameter(args, 2, true);
        if (null == errorTypes) {
            errorTypes = -1;
        }
        Object handleOnlyReportedErrors = assignParameter(args, 3, true);
        if (null == handleOnlyReportedErrors) {
            handleOnlyReportedErrors = true;
        }
        Object prev = null;
        Object ternaryExpressionTemp = null;
        prev =
                function_set_error_handler
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(new ZPair(0, this), new ZPair(1, "handleError")),
                                errorTypes)
                        .value();
        this.errorLevelMap =
                function_array_replace
                        .f
                        .env(env)
                        .call(this.defaultErrorLevelMap(env), levelMap)
                        .value();
        if (ZVal.isTrue(callPrevious)) {
            this.previousErrorHandler =
                    ZVal.isTrue(ternaryExpressionTemp = prev) ? ternaryExpressionTemp : true;
        }

        this.handleOnlyReportedErrors = handleOnlyReportedErrors;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "level",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "reservedMemorySize",
        defaultValue = "20",
        defaultValueType = "number"
    )
    public Object registerFatalHandler(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, true);
        if (null == level) {
            level = ZVal.getNull();
        }
        Object reservedMemorySize = assignParameter(args, 1, true);
        if (null == reservedMemorySize) {
            reservedMemorySize = 20;
        }
        function_register_shutdown_function
                .f
                .env(env)
                .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "handleFatalError")));
        this.reservedMemory =
                function_str_repeat
                        .f
                        .env(env)
                        .call(" ", ZVal.multiply(1024, reservedMemorySize))
                        .value();
        this.fatalLevel = level;
        this.hasFatalErrorHandler = true;
        return null;
    }

    @ConvertedMethod
    protected Object defaultErrorLevelMap(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(1, LogLevel.CONST_CRITICAL),
                        new ZPair(2, LogLevel.CONST_WARNING),
                        new ZPair(4, LogLevel.CONST_ALERT),
                        new ZPair(8, LogLevel.CONST_NOTICE),
                        new ZPair(16, LogLevel.CONST_CRITICAL),
                        new ZPair(32, LogLevel.CONST_WARNING),
                        new ZPair(64, LogLevel.CONST_ALERT),
                        new ZPair(128, LogLevel.CONST_WARNING),
                        new ZPair(256, LogLevel.CONST_ERROR),
                        new ZPair(512, LogLevel.CONST_WARNING),
                        new ZPair(1024, LogLevel.CONST_NOTICE),
                        new ZPair(2048, LogLevel.CONST_NOTICE),
                        new ZPair(4096, LogLevel.CONST_ERROR),
                        new ZPair(8192, LogLevel.CONST_NOTICE),
                        new ZPair(16384, LogLevel.CONST_NOTICE)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e")
    public Object handleException(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        env.callMethod(
                this.logger,
                "log",
                ErrorHandler.class,
                ZVal.strictEqualityCheck(this.uncaughtExceptionLevel, "===", ZVal.getNull())
                        ? LogLevel.CONST_ERROR
                        : this.uncaughtExceptionLevel,
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "Uncaught Exception %s: \"%s\" at %s line %s",
                                function_get_class.f.env(env).call(e).value(),
                                env.callMethod(e, "getMessage", ErrorHandler.class),
                                env.callMethod(e, "getFile", ErrorHandler.class),
                                env.callMethod(e, "getLine", ErrorHandler.class))
                        .value(),
                ZVal.newArray(new ZPair("exception", e)));
        if (ZVal.isTrue(this.previousExceptionHandler)) {
            function_call_user_func
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                    .call(this.previousExceptionHandler, e);
        }

        env.exit(255);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    @ConvertedParameter(index = 1, name = "message")
    @ConvertedParameter(index = 2, name = "file")
    @ConvertedParameter(index = 3, name = "line", defaultValue = "0", defaultValueType = "number")
    @ConvertedParameter(index = 4, name = "context", defaultValue = "", defaultValueType = "array")
    public Object handleError(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        Object file = assignParameter(args, 2, true);
        if (null == file) {
            file = "";
        }
        Object line = assignParameter(args, 3, true);
        if (null == line) {
            line = 0;
        }
        Object context = assignParameter(args, 4, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        Object level = null;
        if (ZVal.toBool(this.handleOnlyReportedErrors)
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.toLong(function_error_reporting.f.env(env).call().value())
                                        & ZVal.toLong(code)))) {
            return null;
        }

        if (ZVal.toBool(!ZVal.isTrue(this.hasFatalErrorHandler))
                || ZVal.toBool(
                        !function_in_array
                                .f
                                .env(env)
                                .call(
                                        code,
                                        env.getRequestStaticProperties(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Monolog
                                                                .classes
                                                                .ErrorHandler
                                                                .RequestStaticProperties
                                                                .class)
                                                .fatalErrors,
                                        true)
                                .getBool())) {
            level =
                    ZVal.assign(
                            arrayActionR(
                                            ArrayAction.ISSET,
                                            new ReferenceClassProperty(this, "errorLevelMap", env),
                                            env,
                                            code)
                                    ? new ReferenceClassProperty(this, "errorLevelMap", env)
                                            .arrayGet(env, code)
                                    : LogLevel.CONST_CRITICAL);
            env.callMethod(
                    this.logger,
                    "log",
                    ErrorHandler.class,
                    level,
                    toStringR(runtimeStaticObject.codeToString(env, code), env)
                            + ": "
                            + toStringR(message, env),
                    ZVal.newArray(
                            new ZPair("code", code),
                            new ZPair("message", message),
                            new ZPair("file", file),
                            new ZPair("line", line)));
        }

        if (ZVal.strictEqualityCheck(this.previousErrorHandler, "===", true)) {
            return ZVal.assign(false);

        } else if (ZVal.isTrue(this.previousErrorHandler)) {
            return ZVal.assign(
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(this.previousErrorHandler, code, message, file, line, context)
                            .value());
        }

        return null;
    }

    @ConvertedMethod
    public Object handleFatalError(RuntimeEnv env, Object... args) {
        Object handler = null;
        ReferenceContainer lastError = new BasicReferenceContainer(null);
        this.reservedMemory = ZVal.getNull();
        lastError.setObject(function_error_get_last.f.env(env).call().value());
        if (ZVal.toBool(lastError.getObject())
                && ZVal.toBool(
                        function_in_array
                                .f
                                .env(env)
                                .call(
                                        lastError.arrayGet(env, "type"),
                                        env.getRequestStaticProperties(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Monolog
                                                                .classes
                                                                .ErrorHandler
                                                                .RequestStaticProperties
                                                                .class)
                                                .fatalErrors,
                                        true)
                                .value())) {
            env.callMethod(
                    this.logger,
                    "log",
                    ErrorHandler.class,
                    ZVal.strictEqualityCheck(this.fatalLevel, "===", ZVal.getNull())
                            ? LogLevel.CONST_ALERT
                            : this.fatalLevel,
                    "Fatal Error ("
                            + toStringR(
                                    runtimeStaticObject.codeToString(
                                            env, lastError.arrayGet(env, "type")),
                                    env)
                            + "): "
                            + toStringR(lastError.arrayGet(env, "message"), env),
                    ZVal.newArray(
                            new ZPair("code", lastError.arrayGet(env, "type")),
                            new ZPair("message", lastError.arrayGet(env, "message")),
                            new ZPair("file", lastError.arrayGet(env, "file")),
                            new ZPair("line", lastError.arrayGet(env, "line"))));
            if (ZVal.isTrue(ZVal.checkInstanceType(this.logger, Logger.class, "Monolog\\Logger"))) {
                for (ZPair zpairResult736 :
                        ZVal.getIterable(
                                env.callMethod(this.logger, "getHandlers", ErrorHandler.class),
                                env,
                                true)) {
                    handler = ZVal.assign(zpairResult736.getValue());
                    if (ZVal.isTrue(
                            ZVal.checkInstanceType(
                                    handler,
                                    AbstractHandler.class,
                                    "Monolog\\Handler\\AbstractHandler"))) {
                        env.callMethod(handler, "close", ErrorHandler.class);
                    }
                }
            }
        }

        return null;
    }

    public static final Object CONST_class = "Monolog\\ErrorHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "logger", typeHint = "Psr\\Log\\LoggerInterface")
        @ConvertedParameter(
            index = 1,
            name = "errorLevelMap",
            defaultValue = "",
            defaultValueType = "array"
        )
        @ConvertedParameter(
            index = 2,
            name = "exceptionLevel",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "fatalLevel",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object register(RuntimeEnv env, Object... args) {
            Object logger = assignParameter(args, 0, false);
            Object errorLevelMap = assignParameter(args, 1, true);
            if (null == errorLevelMap) {
                errorLevelMap = ZVal.newArray();
            }
            Object exceptionLevel = assignParameter(args, 2, true);
            if (null == exceptionLevel) {
                exceptionLevel = ZVal.getNull();
            }
            Object fatalLevel = assignParameter(args, 3, true);
            if (null == fatalLevel) {
                fatalLevel = ZVal.getNull();
            }
            Object handler = null;
            function_class_exists.f.env(env).call("\\Psr\\Log\\LogLevel", true);
            handler = env.createNewWithLateStaticBindings(this, logger);
            if (ZVal.strictNotEqualityCheck(errorLevelMap, "!==", false)) {
                env.callMethod(handler, "registerErrorHandler", ErrorHandler.class, errorLevelMap);
            }

            if (ZVal.strictNotEqualityCheck(exceptionLevel, "!==", false)) {
                env.callMethod(
                        handler, "registerExceptionHandler", ErrorHandler.class, exceptionLevel);
            }

            if (ZVal.strictNotEqualityCheck(fatalLevel, "!==", false)) {
                env.callMethod(handler, "registerFatalHandler", ErrorHandler.class, fatalLevel);
            }

            return ZVal.assign(handler);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "code")
        private Object codeToString(RuntimeEnv env, Object... args) {
            Object code = assignParameter(args, 0, false);
            SwitchEnumType36 switchVariable36 =
                    ZVal.getEnum(
                            code,
                            SwitchEnumType36.DEFAULT_CASE,
                            SwitchEnumType36.DYNAMIC_TYPE_94,
                            1,
                            SwitchEnumType36.DYNAMIC_TYPE_95,
                            2,
                            SwitchEnumType36.DYNAMIC_TYPE_96,
                            4,
                            SwitchEnumType36.DYNAMIC_TYPE_97,
                            8,
                            SwitchEnumType36.DYNAMIC_TYPE_98,
                            16,
                            SwitchEnumType36.DYNAMIC_TYPE_99,
                            32,
                            SwitchEnumType36.DYNAMIC_TYPE_100,
                            64,
                            SwitchEnumType36.DYNAMIC_TYPE_101,
                            128,
                            SwitchEnumType36.DYNAMIC_TYPE_102,
                            256,
                            SwitchEnumType36.DYNAMIC_TYPE_103,
                            512,
                            SwitchEnumType36.DYNAMIC_TYPE_104,
                            1024,
                            SwitchEnumType36.DYNAMIC_TYPE_105,
                            2048,
                            SwitchEnumType36.DYNAMIC_TYPE_106,
                            4096,
                            SwitchEnumType36.DYNAMIC_TYPE_107,
                            8192,
                            SwitchEnumType36.DYNAMIC_TYPE_108,
                            16384);
            switch (switchVariable36) {
                case DYNAMIC_TYPE_94:
                    return "E_ERROR";
                case DYNAMIC_TYPE_95:
                    return "E_WARNING";
                case DYNAMIC_TYPE_96:
                    return "E_PARSE";
                case DYNAMIC_TYPE_97:
                    return "E_NOTICE";
                case DYNAMIC_TYPE_98:
                    return "E_CORE_ERROR";
                case DYNAMIC_TYPE_99:
                    return "E_CORE_WARNING";
                case DYNAMIC_TYPE_100:
                    return "E_COMPILE_ERROR";
                case DYNAMIC_TYPE_101:
                    return "E_COMPILE_WARNING";
                case DYNAMIC_TYPE_102:
                    return "E_USER_ERROR";
                case DYNAMIC_TYPE_103:
                    return "E_USER_WARNING";
                case DYNAMIC_TYPE_104:
                    return "E_USER_NOTICE";
                case DYNAMIC_TYPE_105:
                    return "E_STRICT";
                case DYNAMIC_TYPE_106:
                    return "E_RECOVERABLE_ERROR";
                case DYNAMIC_TYPE_107:
                    return "E_DEPRECATED";
                case DYNAMIC_TYPE_108:
                    return "E_USER_DEPRECATED";
            }
            ;
            return "Unknown PHP error";
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object fatalErrors =
                ZVal.newArray(
                        new ZPair(0, 1),
                        new ZPair(1, 4),
                        new ZPair(2, 16),
                        new ZPair(3, 64),
                        new ZPair(4, 256));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\ErrorHandler")
                    .setLookup(
                            ErrorHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "errorLevelMap",
                            "fatalLevel",
                            "handleOnlyReportedErrors",
                            "hasFatalErrorHandler",
                            "logger",
                            "previousErrorHandler",
                            "previousExceptionHandler",
                            "reservedMemory",
                            "uncaughtExceptionLevel")
                    .setStaticPropertyNames("fatalErrors")
                    .setFilename("vendor/monolog/monolog/src/Monolog/ErrorHandler.php")
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

    private enum SwitchEnumType36 {
        DYNAMIC_TYPE_94,
        DYNAMIC_TYPE_95,
        DYNAMIC_TYPE_96,
        DYNAMIC_TYPE_97,
        DYNAMIC_TYPE_98,
        DYNAMIC_TYPE_99,
        DYNAMIC_TYPE_100,
        DYNAMIC_TYPE_101,
        DYNAMIC_TYPE_102,
        DYNAMIC_TYPE_103,
        DYNAMIC_TYPE_104,
        DYNAMIC_TYPE_105,
        DYNAMIC_TYPE_106,
        DYNAMIC_TYPE_107,
        DYNAMIC_TYPE_108,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
