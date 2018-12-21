package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Redis.namespaces.Connectors.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Redis.namespaces.Connections.classes.PhpRedisConnection;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Redis.namespaces.Connections.classes.PhpRedisClusterConnection;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Redis/Connectors/PhpRedisConnector.php

*/

public class PhpRedisConnector extends RuntimeClassBase {

    public PhpRedisConnector(RuntimeEnv env, Object... args) {
        super(env);
    }

    public PhpRedisConnector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    @ConvertedParameter(index = 1, name = "options", typeHint = "array")
    public Object connect(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object options = assignParameter(args, 1, false);
        return ZVal.assign(
                new PhpRedisConnection(
                        env,
                        this.createClient(
                                env,
                                function_array_merge
                                        .f
                                        .env(env)
                                        .call(
                                                config.getObject(),
                                                options,
                                                Arr.runtimeStaticObject.pull(
                                                        env,
                                                        new RuntimeArgsWithReferences()
                                                                .add(0, config),
                                                        config.getObject(),
                                                        "options",
                                                        ZVal.newArray()))
                                        .value())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    @ConvertedParameter(index = 1, name = "clusterOptions", typeHint = "array")
    @ConvertedParameter(index = 2, name = "options", typeHint = "array")
    public Object connectToCluster(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object clusterOptions = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, false);
        options =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                options,
                                clusterOptions,
                                Arr.runtimeStaticObject.pull(
                                        env,
                                        new RuntimeArgsWithReferences().add(0, config),
                                        config.getObject(),
                                        "options",
                                        ZVal.newArray()))
                        .value();
        return ZVal.assign(
                new PhpRedisClusterConnection(
                        env,
                        this.createRedisClusterInstance(
                                env,
                                function_array_map
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.newArray(
                                                        new ZPair(0, this),
                                                        new ZPair(
                                                                1, "buildClusterConnectionString")),
                                                config.getObject())
                                        .value(),
                                options)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "server", typeHint = "array")
    protected Object buildClusterConnectionString(RuntimeEnv env, Object... args) {
        ReferenceContainer server = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                toStringR(server.arrayGet(env, "host"), env)
                        + ":"
                        + toStringR(server.arrayGet(env, "port"), env)
                        + "?"
                        + toStringR(
                                NamespaceGlobal.http_build_query
                                        .env(env)
                                        .call(
                                                Arr.runtimeStaticObject.only(
                                                        env,
                                                        server.getObject(),
                                                        ZVal.arrayFromList(
                                                                "database",
                                                                "password",
                                                                "prefix",
                                                                "read_timeout")))
                                        .value(),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object createClient(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Redis/Connectors")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Redis/Connectors/PhpRedisConnector.php");
        Object config = assignParameter(args, 0, false);
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                env.createNew(ZVal.resolveClassAlias(env, "Redis")),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Redis\\Connectors",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "client")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object client = assignParameter(args, 0, false);
                                        ReferenceContainer config =
                                                new BasicReferenceContainer(null);
                                        config =
                                                this.contextReferences.getReferenceContainer(
                                                        "config");
                                        PhpRedisConnector.this.establishConnection(
                                                env, client, config.getObject());
                                        if (!arrayActionR(
                                                ArrayAction.EMPTY, config, env, "password")) {
                                            env.callMethod(
                                                    client,
                                                    "auth",
                                                    PhpRedisConnector.class,
                                                    config.arrayGet(env, "password"));
                                        }

                                        if (!arrayActionR(
                                                ArrayAction.EMPTY, config, env, "database")) {
                                            env.callMethod(
                                                    client,
                                                    "select",
                                                    PhpRedisConnector.class,
                                                    config.arrayGet(env, "database"));
                                        }

                                        if (!arrayActionR(
                                                ArrayAction.EMPTY, config, env, "prefix")) {
                                            env.callMethod(
                                                    client,
                                                    "setOption",
                                                    PhpRedisConnector.class,
                                                    ClassConstantUtils.getConstantValueByClass(
                                                            env,
                                                            ZVal.resolveClassAlias(env, "Redis"),
                                                            "OPT_PREFIX"),
                                                    config.arrayGet(env, "prefix"));
                                        }

                                        if (!arrayActionR(
                                                ArrayAction.EMPTY, config, env, "read_timeout")) {
                                            env.callMethod(
                                                    client,
                                                    "setOption",
                                                    PhpRedisConnector.class,
                                                    ClassConstantUtils.getConstantValueByClass(
                                                            env,
                                                            ZVal.resolveClassAlias(env, "Redis"),
                                                            "OPT_READ_TIMEOUT"),
                                                    config.arrayGet(env, "read_timeout"));
                                        }

                                        return null;
                                    }
                                }.use("config", config))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "client")
    @ConvertedParameter(index = 1, name = "config", typeHint = "array")
    protected Object establishConnection(RuntimeEnv env, Object... args) {
        Object client = assignParameter(args, 0, false);
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object ternaryExpressionTemp = null;
        ZVal.ternaryExpression(
                ZVal.isTrue(
                                ZVal.isDefined(
                                                ternaryExpressionTemp =
                                                        config.arrayGet(env, "persistent"))
                                        ? ternaryExpressionTemp
                                        : false)
                        ? this.establishPersistentConnection(env, client, config.getObject())
                        : this.establishRegularConnection(env, client, config.getObject()));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "client")
    @ConvertedParameter(index = 1, name = "config", typeHint = "array")
    protected Object establishPersistentConnection(RuntimeEnv env, Object... args) {
        Object client = assignParameter(args, 0, false);
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 1, false));
        env.callMethod(
                client,
                "pconnect",
                PhpRedisConnector.class,
                config.arrayGet(env, "host"),
                config.arrayGet(env, "port"),
                Arr.runtimeStaticObject.get(env, config.getObject(), "timeout", 0.0),
                Arr.runtimeStaticObject.get(
                        env, config.getObject(), "persistent_id", ZVal.getNull()));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "client")
    @ConvertedParameter(index = 1, name = "config", typeHint = "array")
    protected Object establishRegularConnection(RuntimeEnv env, Object... args) {
        Object client = assignParameter(args, 0, false);
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 1, false));
        env.callMethod(
                client,
                "connect",
                PhpRedisConnector.class,
                config.arrayGet(env, "host"),
                config.arrayGet(env, "port"),
                Arr.runtimeStaticObject.get(env, config.getObject(), "timeout", 0.0),
                Arr.runtimeStaticObject.get(env, config.getObject(), "reserved", ZVal.getNull()),
                Arr.runtimeStaticObject.get(env, config.getObject(), "retry_interval", 0));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "servers", typeHint = "array")
    @ConvertedParameter(index = 1, name = "options", typeHint = "array")
    protected Object createRedisClusterInstance(RuntimeEnv env, Object... args) {
        Object servers = assignParameter(args, 0, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                env.createNew(
                        ZVal.resolveClassAlias(env, "RedisCluster"),
                        ZVal.getNull(),
                        function_array_values.f.env(env).call(servers).value(),
                        ZVal.isDefined(ternaryExpressionTemp = options.arrayGet(env, "timeout"))
                                ? ternaryExpressionTemp
                                : 0,
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                options.arrayGet(env, "read_timeout"))
                                ? ternaryExpressionTemp
                                : 0,
                        ZVal.toBool(arrayActionR(ArrayAction.ISSET, options, env, "persistent"))
                                && ZVal.toBool(options.arrayGet(env, "persistent"))));
    }

    public static final Object CONST_class = "Illuminate\\Redis\\Connectors\\PhpRedisConnector";

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
                    .setName("Illuminate\\Redis\\Connectors\\PhpRedisConnector")
                    .setLookup(
                            PhpRedisConnector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Redis/Connectors/PhpRedisConnector.php")
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
