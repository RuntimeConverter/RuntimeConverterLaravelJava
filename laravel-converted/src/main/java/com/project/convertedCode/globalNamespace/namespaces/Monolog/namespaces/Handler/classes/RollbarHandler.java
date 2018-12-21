package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractProcessingHandler;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_register_shutdown_function;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/RollbarHandler.php

*/

public class RollbarHandler extends AbstractProcessingHandler {

    public Object rollbarNotifier = null;

    public Object levelMap =
            ZVal.newArray(
                    new ZPair(Logger.CONST_DEBUG, "debug"),
                    new ZPair(Logger.CONST_INFO, "info"),
                    new ZPair(Logger.CONST_NOTICE, "info"),
                    new ZPair(Logger.CONST_WARNING, "warning"),
                    new ZPair(Logger.CONST_ERROR, "error"),
                    new ZPair(Logger.CONST_CRITICAL, "critical"),
                    new ZPair(Logger.CONST_ALERT, "critical"),
                    new ZPair(Logger.CONST_EMERGENCY, "critical"));

    public Object hasRecords = false;

    public Object initialized = false;

    public RollbarHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RollbarHandler.class) {
            this.__construct(env, args);
        }
    }

    public RollbarHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rollbarNotifier", typeHint = "RollbarNotifier")
    @ConvertedParameter(index = 1, name = "level")
    @ConvertedParameter(
        index = 2,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object rollbarNotifier = assignParameter(args, 0, false);
        Object level = assignParameter(args, 1, true);
        if (null == level) {
            level = Logger.CONST_ERROR;
        }
        Object bubble = assignParameter(args, 2, true);
        if (null == bubble) {
            bubble = true;
        }
        this.rollbarNotifier = rollbarNotifier;
        super.__construct(env, level, bubble);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object exception = null;
        ReferenceContainer payload = new BasicReferenceContainer(null);
        ReferenceContainer context = new BasicReferenceContainer(null);
        if (!ZVal.isTrue(this.initialized)) {
            function_register_shutdown_function
                    .f
                    .env(env)
                    .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "close")));
            this.initialized = true;
        }

        context.setObject(ZVal.assign(record.arrayGet(env, "context")));
        payload.setObject(ZVal.newArray());
        if (arrayActionR(ArrayAction.ISSET, context, env, "payload")) {
            payload.setObject(ZVal.assign(context.arrayGet(env, "payload")));
            arrayActionR(ArrayAction.UNSET, context, env, "payload");
        }

        context.setObject(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                context.getObject(),
                                record.arrayGet(env, "extra"),
                                ZVal.newArray(
                                        new ZPair(
                                                "level",
                                                new ReferenceClassProperty(this, "levelMap", env)
                                                        .arrayGet(
                                                                env,
                                                                record.arrayGet(env, "level"))),
                                        new ZPair(
                                                "monolog_level",
                                                record.arrayGet(env, "level_name")),
                                        new ZPair("channel", record.arrayGet(env, "channel")),
                                        new ZPair(
                                                "datetime",
                                                env.callMethod(
                                                        record.arrayGet(env, "datetime"),
                                                        "format",
                                                        RollbarHandler.class,
                                                        "U"))))
                        .value());
        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, context, env, "exception"))
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                context.arrayGet(env, "exception"),
                                PHPException.class,
                                "Exception"))) {
            payload.arrayAccess(env, "level").set(context.arrayGet(env, "level"));
            exception = ZVal.assign(context.arrayGet(env, "exception"));
            arrayActionR(ArrayAction.UNSET, context, env, "exception");
            env.callMethod(
                    this.rollbarNotifier,
                    "report_exception",
                    RollbarHandler.class,
                    exception,
                    context.getObject(),
                    payload.getObject());

        } else {
            env.callMethod(
                    this.rollbarNotifier,
                    "report_message",
                    RollbarHandler.class,
                    record.arrayGet(env, "message"),
                    context.arrayGet(env, "level"),
                    context.getObject(),
                    payload.getObject());
        }

        this.hasRecords = true;
        return null;
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.hasRecords)) {
            env.callMethod(this.rollbarNotifier, "flush", RollbarHandler.class);
            this.hasRecords = false;
        }

        return null;
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        this.flush(env);
        return null;
    }

    public static final Object CONST_class = "Monolog\\Handler\\RollbarHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractProcessingHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\RollbarHandler")
                    .setLookup(
                            RollbarHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble",
                            "formatter",
                            "hasRecords",
                            "initialized",
                            "level",
                            "levelMap",
                            "processors",
                            "rollbarNotifier")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/RollbarHandler.php")
                    .addInterface("Monolog\\Handler\\HandlerInterface")
                    .addExtendsClass("Monolog\\Handler\\AbstractProcessingHandler")
                    .addExtendsClass("Monolog\\Handler\\AbstractHandler")
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
