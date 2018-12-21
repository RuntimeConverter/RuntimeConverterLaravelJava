package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Broadcasting.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Broadcasting.namespaces.Broadcasters.classes.NullBroadcaster;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Broadcasting.classes.ShouldBroadcastNow;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Broadcasting.classes.Factory;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Broadcasting.classes.PendingBroadcast;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Broadcasting.namespaces.Broadcasters.classes.PusherBroadcaster;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Broadcasting.namespaces.Broadcasters.classes.RedisBroadcaster;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Broadcasting.namespaces.Broadcasters.classes.LogBroadcaster;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Broadcasting.classes.BroadcastEvent;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Broadcasting.classes.BroadcastController;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Log.classes.LoggerInterface;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Broadcasting/BroadcastManager.php

*/

public class BroadcastManager extends RuntimeClassBase implements Factory {

    public Object app = null;

    public Object drivers = ZVal.newArray();

    public Object customCreators = ZVal.newArray();

    public BroadcastManager(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == BroadcastManager.class) {
            this.__construct(env, args);
        }
    }

    public BroadcastManager(NoConstructor n) {
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
        name = "attributes",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object routes(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Broadcasting")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Broadcasting/BroadcastManager.php");
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        if (ZVal.isTrue(env.callMethod(this.app, "routesAreCached", BroadcastManager.class))) {
            return null;
        }

        attributes =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = attributes)
                                ? ternaryExpressionTemp
                                : ZVal.newArray(
                                        new ZPair("middleware", ZVal.arrayFromList("web"))));
        env.callMethod(
                new ReferenceClassProperty(this, "app", env).arrayGet(env, "router"),
                "group",
                BroadcastManager.class,
                attributes,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Broadcasting",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "router")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object router = assignParameter(args, 0, false);
                        env.callMethod(
                                router,
                                new RuntimeArgsWithReferences(),
                                "match",
                                BroadcastManager.class,
                                ZVal.arrayFromList("get", "post"),
                                "/broadcasting/auth",
                                "\\"
                                        + toStringR(BroadcastController.CONST_class, env)
                                        + "@authenticate");
                        return null;
                    }
                });
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object socket(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, true);
        if (null == request) {
            request = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        if (ZVal.toBool(!ZVal.isTrue(request))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        this.app, "bound", BroadcastManager.class, "request")))) {
            return null;
        }

        request =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = request)
                                ? ternaryExpressionTemp
                                : new ReferenceClassProperty(this, "app", env)
                                        .arrayGet(env, "request"));
        return ZVal.assign(
                env.callMethod(request, "header", BroadcastManager.class, "X-Socket-ID"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object event(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, true);
        if (null == event) {
            event = ZVal.getNull();
        }
        return ZVal.assign(
                new PendingBroadcast(
                        env,
                        env.callMethod(this.app, "make", BroadcastManager.class, "events"),
                        event));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    public Object queue(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object connection = null;
        Object queue = null;
        connection =
                ZVal.assign(
                        ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                event,
                                                ShouldBroadcastNow.class,
                                                "Illuminate\\Contracts\\Broadcasting\\ShouldBroadcastNow"))
                                ? "sync"
                                : ZVal.getNull());
        if (ZVal.toBool(function_is_null.f.env(env).call(connection).value())
                && ZVal.toBool(
                        ZVal.isset(
                                toObjectR(event)
                                        .accessProp(this, env)
                                        .name("connection")
                                        .value()))) {
            connection =
                    ZVal.assign(toObjectR(event).accessProp(this, env).name("connection").value());
        }

        queue = ZVal.getNull();
        if (function_method_exists.f.env(env).call(event, "broadcastQueue").getBool()) {
            queue = env.callMethod(event, "broadcastQueue", BroadcastManager.class);

        } else if (ZVal.isset(
                toObjectR(event).accessProp(this, env).name("broadcastQueue").value())) {
            queue =
                    ZVal.assign(
                            toObjectR(event).accessProp(this, env).name("broadcastQueue").value());

        } else if (ZVal.isset(toObjectR(event).accessProp(this, env).name("queue").value())) {
            queue = ZVal.assign(toObjectR(event).accessProp(this, env).name("queue").value());
        }

        env.callMethod(
                env.callMethod(
                        env.callMethod(this.app, "make", BroadcastManager.class, "queue"),
                        "connection",
                        BroadcastManager.class,
                        connection),
                "pushOn",
                BroadcastManager.class,
                queue,
                new BroadcastEvent(env, ((RuntimeClassInterface) event).phpClone(env)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "driver",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object connection(RuntimeEnv env, Object... args) {
        Object driver = assignParameter(args, 0, true);
        if (null == driver) {
            driver = ZVal.getNull();
        }
        return ZVal.assign(this.driver(env, driver));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object driver(RuntimeEnv env, Object... args) {
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
                new ReferenceClassProperty(this, "drivers", env)
                        .arrayAccess(env, name)
                        .set(this.get(env, name)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object get(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "drivers", env)
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
                            env, "Broadcaster [" + toStringR(name, env) + "] is not defined."));
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
        if (!function_method_exists.f.env(env).call(this, driverMethod).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Driver ["
                                    + toStringR(config.arrayGet(env, "driver"), env)
                                    + "] is not supported."));
        }

        return ZVal.assign(
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, config),
                        toStringR(driverMethod, env),
                        BroadcastManager.class,
                        config.getObject()));
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
    protected Object createPusherDriver(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                new PusherBroadcaster(
                        env,
                        env.createNew(
                                ZVal.resolveClassAlias(env, "Pusher"),
                                config.arrayGet(env, "key"),
                                config.arrayGet(env, "secret"),
                                config.arrayGet(env, "app_id"),
                                ZVal.isDefined(
                                                ternaryExpressionTemp =
                                                        config.arrayGet(env, "options"))
                                        ? ternaryExpressionTemp
                                        : ZVal.newArray())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object createRedisDriver(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                new RedisBroadcaster(
                        env,
                        env.callMethod(this.app, "make", BroadcastManager.class, "redis"),
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "connection"))
                                ? ternaryExpressionTemp
                                : ZVal.getNull()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object createLogDriver(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        return ZVal.assign(
                new LogBroadcaster(
                        env,
                        env.callMethod(
                                this.app,
                                "make",
                                BroadcastManager.class,
                                LoggerInterface.CONST_class)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object createNullDriver(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        return ZVal.assign(new NullBroadcaster(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object getConfig(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(
                                env, "config", "broadcasting.connections." + toStringR(name, env)));
    }

    @ConvertedMethod
    public Object getDefaultDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(env, "config", "broadcasting.default"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setDefaultDriver(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "app", env)
                .arrayAccess(env, "config", "broadcasting.default")
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
                .set(callback);
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
                        this.driver(env),
                        new RuntimeArgsWithReferences(),
                        toStringR(method, env),
                        BroadcastManager.class,
                        PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters))));
    }

    public static final Object CONST_class = "Illuminate\\Broadcasting\\BroadcastManager";

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
                    .setName("Illuminate\\Broadcasting\\BroadcastManager")
                    .setLookup(
                            BroadcastManager.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "customCreators", "drivers")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Broadcasting/BroadcastManager.php")
                    .addInterface("Illuminate\\Contracts\\Broadcasting\\Factory")
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
