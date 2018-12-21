package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Redis.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Redis.namespaces.Connectors.classes.PredisConnector;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Redis.namespaces.Connectors.classes.PhpRedisConnector;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Redis.classes.Factory;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Redis/RedisManager.php

*/

public class RedisManager extends RuntimeClassBase implements Factory {

    public Object driver = null;

    public Object config = null;

    public Object connections = null;

    public RedisManager(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RedisManager.class) {
            this.__construct(env, args);
        }
    }

    public RedisManager(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "driver")
    @ConvertedParameter(index = 1, name = "config", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object driver = assignParameter(args, 0, false);
        Object config = assignParameter(args, 1, false);
        this.driver = driver;
        this.config = config;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object connection(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        name =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = name)
                                ? ternaryExpressionTemp
                                : "default");
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "connections", env),
                env,
                name)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "connections", env).arrayGet(env, name));
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "connections", env)
                        .arrayAccess(env, name)
                        .set(this.resolve(env, name)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object resolve(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object options = null;
        Object ternaryExpressionTemp = null;
        name =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = name)
                                ? ternaryExpressionTemp
                                : "default");
        options =
                ZVal.assign(
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                new ReferenceClassProperty(this, "config", env)
                                                        .arrayGet(env, "options"))
                                ? ternaryExpressionTemp
                                : ZVal.newArray());
        if (arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "config", env), env, name)) {
            return ZVal.assign(
                    env.callMethod(
                            this.connector(env),
                            "connect",
                            RedisManager.class,
                            new ReferenceClassProperty(this, "config", env).arrayGet(env, name),
                            options));
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "config", env),
                env,
                "clusters",
                name)) {
            return ZVal.assign(this.resolveCluster(env, name));
        }

        throw ZVal.getException(
                env,
                new InvalidArgumentException(
                        env, "Redis connection [" + toStringR(name, env) + "] not configured."));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object resolveCluster(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object clusterOptions = null;
        Object ternaryExpressionTemp = null;
        clusterOptions =
                ZVal.assign(
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                new ReferenceClassProperty(this, "config", env)
                                                        .arrayGet(env, "clusters", "options"))
                                ? ternaryExpressionTemp
                                : ZVal.newArray());
        return ZVal.assign(
                env.callMethod(
                        this.connector(env),
                        "connectToCluster",
                        RedisManager.class,
                        new ReferenceClassProperty(this, "config", env)
                                .arrayGet(env, "clusters", name),
                        clusterOptions,
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                new ReferenceClassProperty(this, "config", env)
                                                        .arrayGet(env, "options"))
                                ? ternaryExpressionTemp
                                : ZVal.newArray()));
    }

    @ConvertedMethod
    protected Object connector(RuntimeEnv env, Object... args) {
        switch (toStringR(this.driver)) {
            case "predis":
                return ZVal.assign(new PredisConnector(env));
            case "phpredis":
                return ZVal.assign(new PhpRedisConnector(env));
        }
        ;
        return null;
    }

    @ConvertedMethod
    public Object connections(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.connections);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this.connection(env),
                        new RuntimeArgsWithReferences(),
                        toStringR(method, env),
                        RedisManager.class,
                        PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters))));
    }

    public static final Object CONST_class = "Illuminate\\Redis\\RedisManager";

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
                    .setName("Illuminate\\Redis\\RedisManager")
                    .setLookup(
                            RedisManager.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("config", "connections", "driver")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Redis/RedisManager.php")
                    .addInterface("Illuminate\\Contracts\\Redis\\Factory")
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
