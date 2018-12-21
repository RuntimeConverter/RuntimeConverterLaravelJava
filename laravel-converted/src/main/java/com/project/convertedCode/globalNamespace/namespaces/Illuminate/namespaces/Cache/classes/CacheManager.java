package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes.ApcWrapper;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes.MemcachedStore;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Cache.classes.Factory;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes.ArrayStore;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Events.classes.Dispatcher;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes.NullStore;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes.ApcStore;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes.DatabaseStore;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes.RedisStore;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes.FileStore;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes.Repository;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Cache/CacheManager.php

*/

public class CacheManager extends RuntimeClassBase implements Factory {

    public Object app = null;

    public Object stores = ZVal.newArray();

    public Object customCreators = ZVal.newArray();

    public CacheManager(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CacheManager.class) {
            this.__construct(env, args);
        }
    }

    public CacheManager(NoConstructor n) {
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
    @ConvertedParameter(
        index = 0,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object store(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        name =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = name)
                                ? ternaryExpressionTemp
                                : this.getDefaultDriver(env));
        return ZVal.assign(
                new ReferenceClassProperty(this, "stores", env)
                        .arrayAccess(env, name)
                        .set(this.get(env, name)));
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
        return ZVal.assign(this.store(env, driver));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object get(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "stores", env)
                                                .arrayGet(env, name))
                        ? ternaryExpressionTemp
                        : this.resolve(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object resolve(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object driverMethod = null;
        ReferenceContainer config = new BasicReferenceContainer(null);
        config.setObject(this.getConfig(env, name));
        if (function_is_null.f.env(env).call(config.getObject()).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Cache store [" + toStringR(name, env) + "] is not defined."));
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "customCreators", env),
                env,
                config.arrayGet(env, "driver"))) {
            return ZVal.assign(this.callCustomCreator(env, config.getObject()));

        } else {
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
                                CacheManager.class,
                                config.getObject()));

            } else {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                "Driver ["
                                        + toStringR(config.arrayGet(env, "driver"), env)
                                        + "] is not supported."));
            }
        }
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
    protected Object createApcDriver(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        Object prefix = null;
        prefix = this.getPrefix(env, config);
        return ZVal.assign(this.repository(env, new ApcStore(env, new ApcWrapper(env), prefix)));
    }

    @ConvertedMethod
    protected Object createArrayDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.repository(env, new ArrayStore(env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object createFileDriver(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                this.repository(
                        env,
                        new FileStore(
                                env,
                                new ReferenceClassProperty(this, "app", env).arrayGet(env, "files"),
                                config.arrayGet(env, "path"))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object createMemcachedDriver(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object memcached = null;
        Object prefix = null;
        Object ternaryExpressionTemp = null;
        prefix = this.getPrefix(env, config.getObject());
        memcached =
                env.callMethod(
                        new ReferenceClassProperty(this, "app", env)
                                .arrayGet(env, "memcached.connector"),
                        "connect",
                        CacheManager.class,
                        config.arrayGet(env, "servers"),
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                config.arrayGet(env, "persistent_id"))
                                ? ternaryExpressionTemp
                                : ZVal.getNull(),
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "options"))
                                ? ternaryExpressionTemp
                                : ZVal.newArray(),
                        function_array_filter
                                .f
                                .env(env)
                                .call(
                                        ZVal.isDefined(
                                                        ternaryExpressionTemp =
                                                                config.arrayGet(env, "sasl"))
                                                ? ternaryExpressionTemp
                                                : ZVal.newArray())
                                .value());
        return ZVal.assign(this.repository(env, new MemcachedStore(env, memcached, prefix)));
    }

    @ConvertedMethod
    protected Object createNullDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.repository(env, new NullStore(env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object createRedisDriver(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object connection = null;
        Object ternaryExpressionTemp = null;
        Object redis = null;
        redis = ZVal.assign(new ReferenceClassProperty(this, "app", env).arrayGet(env, "redis"));
        connection =
                ZVal.assign(
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "connection"))
                                ? ternaryExpressionTemp
                                : "default");
        return ZVal.assign(
                this.repository(
                        env,
                        new RedisStore(
                                env, redis, this.getPrefix(env, config.getObject()), connection)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object createDatabaseDriver(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object connection = null;
        Object ternaryExpressionTemp = null;
        connection =
                env.callMethod(
                        new ReferenceClassProperty(this, "app", env).arrayGet(env, "db"),
                        "connection",
                        CacheManager.class,
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "connection"))
                                ? ternaryExpressionTemp
                                : ZVal.getNull());
        return ZVal.assign(
                this.repository(
                        env,
                        new DatabaseStore(
                                env,
                                connection,
                                config.arrayGet(env, "table"),
                                this.getPrefix(env, config.getObject()))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "store", typeHint = "Illuminate\\Contracts\\Cache\\Store")
    public Object repository(RuntimeEnv env, Object... args) {
        Object store = assignParameter(args, 0, false);
        Object repository = null;
        repository = new Repository(env, store);
        if (ZVal.isTrue(
                env.callMethod(this.app, "bound", CacheManager.class, Dispatcher.CONST_class))) {
            env.callMethod(
                    repository,
                    "setEventDispatcher",
                    CacheManager.class,
                    new ReferenceClassProperty(this, "app", env)
                            .arrayGet(env, Dispatcher.CONST_class));
        }

        return ZVal.assign(repository);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object getPrefix(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "prefix"))
                        ? ternaryExpressionTemp
                        : new ReferenceClassProperty(this, "app", env)
                                .arrayGet(env, "config", "cache.prefix"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object getConfig(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(env, "config", "cache.stores." + toStringR(name, env)));
    }

    @ConvertedMethod
    public Object getDefaultDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(env, "config", "cache.default"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setDefaultDriver(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "app", env)
                .arrayAccess(env, "config", "cache.default")
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
                .set(env.callMethod(callback, "bindTo", CacheManager.class, this, this));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this.store(env),
                        new RuntimeArgsWithReferences(),
                        toStringR(method, env),
                        CacheManager.class,
                        PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters))));
    }

    public static final Object CONST_class = "Illuminate\\Cache\\CacheManager";

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
                    .setName("Illuminate\\Cache\\CacheManager")
                    .setLookup(
                            CacheManager.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "customCreators", "stores")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Cache/CacheManager.php")
                    .addInterface("Illuminate\\Contracts\\Cache\\Factory")
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
