package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractProcessingHandler;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.LineFormatter;
import java.lang.Class;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/RedisHandler.php

*/

public class RedisHandler extends AbstractProcessingHandler {

    public Object redisClient = null;

    public Object redisKey = null;

    public Object capSize = null;

    public RedisHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RedisHandler.class) {
            this.__construct(env, args);
        }
    }

    public RedisHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "redis")
    @ConvertedParameter(index = 1, name = "key")
    @ConvertedParameter(index = 2, name = "level")
    @ConvertedParameter(
        index = 3,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "capSize",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object redis = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, false);
        Object level = assignParameter(args, 2, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        Object bubble = assignParameter(args, 3, true);
        if (null == bubble) {
            bubble = true;
        }
        Object capSize = assignParameter(args, 4, true);
        if (null == capSize) {
            capSize = false;
        }
        if (!ZVal.toBool(ZVal.checkInstanceType(redis, (Class) null, "Predis\\Client", env))
                || ZVal.toBool(ZVal.checkInstanceType(redis, (Class) null, "Redis", env))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(env, "Predis\\Client or Redis instance required"));
        }

        this.redisClient = redis;
        this.redisKey = key;
        this.capSize = capSize;
        super.__construct(env, level, bubble);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.isTrue(this.capSize)) {
            this.writeCapped(env, record.getObject());

        } else {
            env.callMethod(
                    this.redisClient,
                    "rpush",
                    RedisHandler.class,
                    this.redisKey,
                    record.arrayGet(env, "formatted"));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object writeCapped(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/monolog/monolog/src/Monolog/Handler")
                        .setFile("/vendor/monolog/monolog/src/Monolog/Handler/RedisHandler.php");
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object capSize = null;
        Object redisKey = null;
        if (ZVal.isTrue(ZVal.checkInstanceType(this.redisClient, (Class) null, "Redis", env))) {
            env.callMethod(
                    env.callMethod(
                            env.callMethod(
                                    env.callMethod(this.redisClient, "multi", RedisHandler.class),
                                    "rpush",
                                    RedisHandler.class,
                                    this.redisKey,
                                    record.arrayGet(env, "formatted")),
                            "ltrim",
                            RedisHandler.class,
                            this.redisKey,
                            ZVal.minusSign(this.capSize),
                            -1),
                    "exec",
                    RedisHandler.class);

        } else {
            redisKey = ZVal.assign(this.redisKey);
            capSize = ZVal.assign(this.capSize);
            env.callMethod(
                    this.redisClient,
                    "transaction",
                    RedisHandler.class,
                    new Closure(
                            env, runtimeConverterFunctionClassConstants, "Monolog\\Handler", this) {
                        @Override
                        @ConvertedMethod
                        @ConvertedParameter(index = 0, name = "tx")
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            Object tx = assignParameter(args, 0, false);
                            Object capSize = null;
                            ReferenceContainer record = new BasicReferenceContainer(null);
                            Object redisKey = null;
                            capSize = this.contextReferences.getCapturedValue("capSize");
                            record = this.contextReferences.getReferenceContainer("record");
                            redisKey = this.contextReferences.getCapturedValue("redisKey");
                            env.callMethod(
                                    tx,
                                    "rpush",
                                    RedisHandler.class,
                                    redisKey,
                                    record.arrayGet(env, "formatted"));
                            env.callMethod(
                                    tx,
                                    "ltrim",
                                    RedisHandler.class,
                                    redisKey,
                                    ZVal.minusSign(capSize),
                                    -1);
                            return null;
                        }
                    }.use("capSize", capSize).use("record", record).use("redisKey", redisKey));
        }

        return null;
    }

    @ConvertedMethod
    protected Object getDefaultFormatter(RuntimeEnv env, Object... args) {
        return ZVal.assign(new LineFormatter(env));
    }

    public static final Object CONST_class = "Monolog\\Handler\\RedisHandler";

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
                    .setName("Monolog\\Handler\\RedisHandler")
                    .setLookup(
                            RedisHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble",
                            "capSize",
                            "formatter",
                            "level",
                            "processors",
                            "redisClient",
                            "redisKey")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/RedisHandler.php")
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
