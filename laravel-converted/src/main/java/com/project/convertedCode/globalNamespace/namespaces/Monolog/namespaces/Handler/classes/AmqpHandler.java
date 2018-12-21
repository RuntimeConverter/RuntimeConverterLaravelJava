package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractProcessingHandler;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.JsonFormatter;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import java.lang.Class;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/AmqpHandler.php

*/

public class AmqpHandler extends AbstractProcessingHandler {

    public Object exchange = null;

    public Object exchangeName = null;

    public AmqpHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AmqpHandler.class) {
            this.__construct(env, args);
        }
    }

    public AmqpHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exchange")
    @ConvertedParameter(index = 1, name = "exchangeName")
    @ConvertedParameter(index = 2, name = "level")
    @ConvertedParameter(
        index = 3,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object exchange = assignParameter(args, 0, false);
        Object exchangeName = assignParameter(args, 1, true);
        if (null == exchangeName) {
            exchangeName = "log";
        }
        Object level = assignParameter(args, 2, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        Object bubble = assignParameter(args, 3, true);
        if (null == bubble) {
            bubble = true;
        }
        if (ZVal.isTrue(ZVal.checkInstanceType(exchange, (Class) null, "AMQPExchange", env))) {
            env.callMethod(exchange, "setName", AmqpHandler.class, exchangeName);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(exchange, (Class) null, "AMQPChannel", env))) {
            this.exchangeName = exchangeName;

        } else {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "PhpAmqpLib\\Channel\\AMQPChannel or AMQPExchange instance required"));
        }

        this.exchange = exchange;
        super.__construct(env, level, bubble);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object data = null;
        Object routingKey = null;
        data = ZVal.assign(record.arrayGet(env, "formatted"));
        routingKey = this.getRoutingKey(env, record.getObject());
        if (ZVal.isTrue(ZVal.checkInstanceType(this.exchange, (Class) null, "AMQPExchange", env))) {
            env.callMethod(
                    this.exchange,
                    "publish",
                    AmqpHandler.class,
                    data,
                    routingKey,
                    0,
                    ZVal.newArray(
                            new ZPair("delivery_mode", 2),
                            new ZPair("content_type", "application/json")));

        } else {
            env.callMethod(
                    this.exchange,
                    "basic_publish",
                    AmqpHandler.class,
                    this.createAmqpMessage(env, data),
                    this.exchangeName,
                    routingKey);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    public Object handleBatch(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object records = assignParameter(args, 0, false);
        Object data = null;
        Object record = null;
        if (ZVal.isTrue(ZVal.checkInstanceType(this.exchange, (Class) null, "AMQPExchange", env))) {
            super.handleBatch(env, records);
            return null;
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult764 : ZVal.getIterable(records, env, true)) {
            record = ZVal.assign(zpairResult764.getValue());
            if (!ZVal.isTrue(env.callMethod(this, "isHandling", AmqpHandler.class, record))) {
                continue;
            }

            record = env.callMethod(this, "processRecord", AmqpHandler.class, record);
            data =
                    env.callMethod(
                            env.callMethod(this, "getFormatter", AmqpHandler.class),
                            "format",
                            AmqpHandler.class,
                            record);
            env.callMethod(
                    this.exchange,
                    "batch_basic_publish",
                    AmqpHandler.class,
                    this.createAmqpMessage(env, data),
                    this.exchangeName,
                    this.getRoutingKey(env, record));
        }

        env.callMethod(this.exchange, "publish_batch", AmqpHandler.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object getRoutingKey(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object routingKey = null;
        routingKey =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s.%s",
                                function_substr
                                        .f
                                        .env(env)
                                        .call(record.arrayGet(env, "level_name"), 0, 4)
                                        .value(),
                                record.arrayGet(env, "channel"))
                        .value();
        return ZVal.assign(NamespaceGlobal.strtolower.env(env).call(routingKey).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    private Object createAmqpMessage(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        return ZVal.assign(
                env.createNew(
                        ZVal.resolveClassAlias(env, "AMQPMessage"),
                        toStringR(data, env),
                        ZVal.newArray(
                                new ZPair("delivery_mode", 2),
                                new ZPair("content_type", "application/json"))));
    }

    @ConvertedMethod
    protected Object getDefaultFormatter(RuntimeEnv env, Object... args) {
        return ZVal.assign(new JsonFormatter(env, JsonFormatter.CONST_BATCH_MODE_JSON, false));
    }

    public static final Object CONST_class = "Monolog\\Handler\\AmqpHandler";

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
                    .setName("Monolog\\Handler\\AmqpHandler")
                    .setLookup(
                            AmqpHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble",
                            "exchange",
                            "exchangeName",
                            "formatter",
                            "level",
                            "processors")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/AmqpHandler.php")
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
