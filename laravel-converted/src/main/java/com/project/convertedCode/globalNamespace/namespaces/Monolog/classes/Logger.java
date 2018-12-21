package com.project.convertedCode.globalNamespace.namespaces.Monolog.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.array.function_key;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.StreamHandler;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeFunctions.date.function_microtime;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.array.function_next;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeZone;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_current;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Log.classes.LoggerInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Logger.php

*/

public class Logger extends RuntimeClassBase implements LoggerInterface {

    public Object name = null;

    public Object handlers = null;

    public Object processors = null;

    public Object microsecondTimestamps = true;

    public Logger(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Logger.class) {
            this.__construct(env, args);
        }
    }

    public Logger(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "handlers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "processors",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object handlers = assignParameter(args, 1, true);
        if (null == handlers) {
            handlers = ZVal.newArray();
        }
        Object processors = assignParameter(args, 2, true);
        if (null == processors) {
            processors = ZVal.newArray();
        }
        this.name = name;
        this.handlers = handlers;
        this.processors = processors;
        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object withName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object _pNew = null;
        _pNew = ZVal.assign(((RuntimeClassInterface) this).phpClone(env));
        toObjectR(_pNew).accessProp(this, env).name("name").set(name);
        return ZVal.assign(_pNew);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "handler",
        typeHint = "Monolog\\Handler\\HandlerInterface"
    )
    public Object pushHandler(RuntimeEnv env, Object... args) {
        Object handler = assignParameter(args, 0, false);
        function_array_unshift.f.env(env).call(this.handlers, handler);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object popHandler(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.handlers)) {
            throw ZVal.getException(
                    env, new LogicException(env, "You tried to pop from an empty handler stack."));
        }

        return ZVal.assign(function_array_shift.f.env(env).call(this.handlers).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "handlers", typeHint = "array")
    public Object setHandlers(RuntimeEnv env, Object... args) {
        Object handlers = assignParameter(args, 0, false);
        Object handler = null;
        this.handlers = ZVal.newArray();
        for (ZPair zpairResult813 :
                ZVal.getIterable(
                        function_array_reverse.f.env(env).call(handlers).value(), env, true)) {
            handler = ZVal.assign(zpairResult813.getValue());
            this.pushHandler(env, handler);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getHandlers(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.handlers);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object pushProcessor(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        if (!function_is_callable.f.env(env).call(callback).getBool()) {
            throw ZVal.getException(
                    env,
                    new com.runtimeconverter
                            .runtime
                            .nativeClasses
                            .spl
                            .exceptions
                            .InvalidArgumentException(
                            env,
                            "Processors must be valid callables (callback or object with an __invoke method), "
                                    + toStringR(
                                            NamespaceGlobal.var_export
                                                    .env(env)
                                                    .call(callback, true)
                                                    .value(),
                                            env)
                                    + " given"));
        }

        function_array_unshift.f.env(env).call(this.processors, callback);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object popProcessor(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.processors)) {
            throw ZVal.getException(
                    env,
                    new LogicException(env, "You tried to pop from an empty processor stack."));
        }

        return ZVal.assign(function_array_shift.f.env(env).call(this.processors).value());
    }

    @ConvertedMethod
    public Object getProcessors(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.processors);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "micro")
    public Object useMicrosecondTimestamps(RuntimeEnv env, Object... args) {
        Object micro = assignParameter(args, 0, false);
        this.microsecondTimestamps = ZVal.toBool(micro);
        return null;
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
    public Object addRecord(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer level = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object message = assignParameter(args, 1, false);
        Object context = assignParameter(args, 2, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        Object handlerKey = null;
        Object handler = null;
        Object record = null;
        Object levelName = null;
        Object ternaryExpressionTemp = null;
        Object processor = null;
        Object ts = null;
        if (!ZVal.isTrue(this.handlers)) {
            this.pushHandler(
                    env,
                    new StreamHandler(
                            env,
                            "php://stderr",
                            ClassConstantUtils.getConstantValueLateStatic(env, this, "DEBUG")));
        }

        levelName =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Logger.class)
                        .method("getLevelName")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, level))
                        .call(level.getObject())
                        .value();
        handlerKey = ZVal.getNull();
        function_reset.f.env(env).call(this.handlers);
        runtimeConverterBreakCount = 0;
        while (ZVal.isTrue(handler = function_current.f.env(env).call(this.handlers).value())) {
            if (ZVal.isTrue(
                    env.callMethod(
                            handler,
                            "isHandling",
                            Logger.class,
                            ZVal.newArray(new ZPair("level", level.getObject()))))) {
                handlerKey = function_key.f.env(env).call(this.handlers).value();
                break;
            }

            function_next.f.env(env).call(this.handlers);
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", handlerKey)) {
            return ZVal.assign(false);
        }

        if (!ZVal.isTrue(
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Monolog
                                        .classes
                                        .Logger
                                        .RequestStaticProperties
                                        .class)
                        .timezone)) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Monolog
                                            .classes
                                            .Logger
                                            .RequestStaticProperties
                                            .class)
                            .timezone =
                    new DateTimeZone(
                            env,
                            ZVal.isTrue(
                                            ternaryExpressionTemp =
                                                    NamespaceGlobal.date_default_timezone_get
                                                            .env(env)
                                                            .call()
                                                            .value())
                                    ? ternaryExpressionTemp
                                    : "UTC");
        }

        if (ZVal.toBool(this.microsecondTimestamps)
                && ZVal.toBool(ZVal.isLessThan(70211, '<', 70100))) {
            ts =
                    DateTime.runtimeStaticObject.createFromFormat(
                            env,
                            "U.u",
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("%.6F", function_microtime.f.env(env).call(true).value())
                                    .value(),
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Monolog
                                                    .classes
                                                    .Logger
                                                    .RequestStaticProperties
                                                    .class)
                                    .timezone);

        } else {
            ts =
                    new DateTime(
                            env,
                            ZVal.getNull(),
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Monolog
                                                    .classes
                                                    .Logger
                                                    .RequestStaticProperties
                                                    .class)
                                    .timezone);
        }

        env.callMethod(
                ts,
                "setTimezone",
                Logger.class,
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Monolog
                                        .classes
                                        .Logger
                                        .RequestStaticProperties
                                        .class)
                        .timezone);
        record =
                ZVal.newArray(
                        new ZPair("message", toStringR(message, env)),
                        new ZPair("context", context),
                        new ZPair("level", level.getObject()),
                        new ZPair("level_name", levelName),
                        new ZPair("channel", this.name),
                        new ZPair("datetime", ts),
                        new ZPair("extra", ZVal.newArray()));
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult814 : ZVal.getIterable(this.processors, env, true)) {
            processor = ZVal.assign(zpairResult814.getValue());
            record =
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(processor, record)
                            .value();
        }

        runtimeConverterBreakCount = 0;
        while (ZVal.isTrue(handler = function_current.f.env(env).call(this.handlers).value())) {
            if (ZVal.strictEqualityCheck(
                    true, "===", env.callMethod(handler, "handle", Logger.class, record))) {
                break;
            }

            function_next.f.env(env).call(this.handlers);
        }

        return ZVal.assign(true);
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
    public Object addDebug(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        return ZVal.assign(
                this.addRecord(
                        env,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "DEBUG"),
                        message,
                        context));
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
    public Object addInfo(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        return ZVal.assign(
                this.addRecord(
                        env,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "INFO"),
                        message,
                        context));
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
    public Object addNotice(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        return ZVal.assign(
                this.addRecord(
                        env,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "NOTICE"),
                        message,
                        context));
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
    public Object addWarning(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        return ZVal.assign(
                this.addRecord(
                        env,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "WARNING"),
                        message,
                        context));
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
    public Object addError(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        return ZVal.assign(
                this.addRecord(
                        env,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "ERROR"),
                        message,
                        context));
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
    public Object addCritical(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        return ZVal.assign(
                this.addRecord(
                        env,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "CRITICAL"),
                        message,
                        context));
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
    public Object addAlert(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        return ZVal.assign(
                this.addRecord(
                        env,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "ALERT"),
                        message,
                        context));
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
    public Object addEmergency(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        return ZVal.assign(
                this.addRecord(
                        env,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "EMERGENCY"),
                        message,
                        context));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    public Object isHandling(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        Object handler = null;
        Object record = null;
        record = ZVal.newArray(new ZPair("level", level));
        for (ZPair zpairResult815 : ZVal.getIterable(this.handlers, env, true)) {
            handler = ZVal.assign(zpairResult815.getValue());
            if (ZVal.isTrue(env.callMethod(handler, "isHandling", Logger.class, record))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
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
        ReferenceContainer level = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object message = assignParameter(args, 1, false);
        Object context = assignParameter(args, 2, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        level.setObject(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Logger.class)
                        .method("toMonologLevel")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, level))
                        .call(level.getObject())
                        .value());
        return ZVal.assign(this.addRecord(env, level.getObject(), message, context));
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
                this.addRecord(
                        env,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "DEBUG"),
                        message,
                        context));
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
                this.addRecord(
                        env,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "INFO"),
                        message,
                        context));
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
                this.addRecord(
                        env,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "NOTICE"),
                        message,
                        context));
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
    public Object warn(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        return ZVal.assign(
                this.addRecord(
                        env,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "WARNING"),
                        message,
                        context));
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
                this.addRecord(
                        env,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "WARNING"),
                        message,
                        context));
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
    public Object err(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        return ZVal.assign(
                this.addRecord(
                        env,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "ERROR"),
                        message,
                        context));
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
                this.addRecord(
                        env,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "ERROR"),
                        message,
                        context));
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
    public Object crit(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        return ZVal.assign(
                this.addRecord(
                        env,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "CRITICAL"),
                        message,
                        context));
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
                this.addRecord(
                        env,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "CRITICAL"),
                        message,
                        context));
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
                this.addRecord(
                        env,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "ALERT"),
                        message,
                        context));
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
    public Object emerg(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.newArray();
        }
        return ZVal.assign(
                this.addRecord(
                        env,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "EMERGENCY"),
                        message,
                        context));
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
                this.addRecord(
                        env,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "EMERGENCY"),
                        message,
                        context));
    }

    public static final Object CONST_DEBUG = 100;

    public static final Object CONST_INFO = 200;

    public static final Object CONST_NOTICE = 250;

    public static final Object CONST_WARNING = 300;

    public static final Object CONST_ERROR = 400;

    public static final Object CONST_CRITICAL = 500;

    public static final Object CONST_ALERT = 550;

    public static final Object CONST_EMERGENCY = 600;

    public static final Object CONST_API = 1;

    public static final Object CONST_class = "Monolog\\Logger";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getLevels(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    function_array_flip
                            .f
                            .env(env)
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Monolog
                                                            .classes
                                                            .Logger
                                                            .RequestStaticProperties
                                                            .class)
                                            .levels)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "level")
        public Object getLevelName(RuntimeEnv env, Object... args) {
            Object level = assignParameter(args, 0, false);
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Monolog
                                    .classes
                                    .Logger
                                    .RequestStaticProperties
                                    .class,
                            "levels"),
                    env,
                    level)) {
                throw ZVal.getException(
                        env,
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Psr
                                .namespaces
                                .Log
                                .classes
                                .InvalidArgumentException(
                                env,
                                "Level \""
                                        + toStringR(level, env)
                                        + "\" is not defined, use one of: "
                                        + toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(
                                                                ", ",
                                                                function_array_keys
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                env
                                                                                        .getRequestStaticProperties(
                                                                                                com.project
                                                                                                        .convertedCode
                                                                                                        .globalNamespace
                                                                                                        .namespaces
                                                                                                        .Monolog
                                                                                                        .classes
                                                                                                        .Logger
                                                                                                        .RequestStaticProperties
                                                                                                        .class)
                                                                                        .levels)
                                                                        .value())
                                                        .value(),
                                                env)));
            }

            return ZVal.assign(
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Monolog
                                            .classes
                                            .Logger
                                            .RequestStaticProperties
                                            .class,
                                    "levels")
                            .arrayGet(env, level));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "level")
        public Object toMonologLevel(RuntimeEnv env, Object... args) {
            Object level = assignParameter(args, 0, false);
            if (ZVal.toBool(function_is_string.f.env(env).call(level).value())
                    && ZVal.toBool(
                            function_defined
                                    .f
                                    .env(env)
                                    .call(
                                            toStringR("Logger", env)
                                                    + "::"
                                                    + toStringR(
                                                            NamespaceGlobal.strtoupper
                                                                    .env(env)
                                                                    .call(level)
                                                                    .value(),
                                                            env))
                                    .value())) {
                return ZVal.assign(
                        function_constant
                                .f
                                .env(env)
                                .call(
                                        toStringR("Logger", env)
                                                + "::"
                                                + toStringR(
                                                        NamespaceGlobal.strtoupper
                                                                .env(env)
                                                                .call(level)
                                                                .value(),
                                                        env))
                                .value());
            }

            return ZVal.assign(level);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "tz", typeHint = "DateTimeZone")
        public Object setTimezone(RuntimeEnv env, Object... args) {
            Object tz = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Monolog
                                            .classes
                                            .Logger
                                            .RequestStaticProperties
                                            .class)
                            .timezone =
                    tz;
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object levels =
                ZVal.newArray(
                        new ZPair(CONST_DEBUG, "DEBUG"),
                        new ZPair(CONST_INFO, "INFO"),
                        new ZPair(CONST_NOTICE, "NOTICE"),
                        new ZPair(CONST_WARNING, "WARNING"),
                        new ZPair(CONST_ERROR, "ERROR"),
                        new ZPair(CONST_CRITICAL, "CRITICAL"),
                        new ZPair(CONST_ALERT, "ALERT"),
                        new ZPair(CONST_EMERGENCY, "EMERGENCY"));

        public Object timezone = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Logger")
                    .setLookup(
                            Logger.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("handlers", "microsecondTimestamps", "name", "processors")
                    .setStaticPropertyNames("levels", "timezone")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Logger.php")
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
}
