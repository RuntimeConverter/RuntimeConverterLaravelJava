package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Events.classes.WorkerStopping;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Events.classes.JobExceptionOccurred;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes.Factory;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Events.classes.Looping;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes.Monitor;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Events.classes.JobProcessed;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Events.classes.JobFailed;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Events.classes.JobProcessing;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/QueueManager.php

*/

public class QueueManager extends RuntimeClassBase implements Factory, Monitor {

    public Object app = null;

    public Object connections = ZVal.newArray();

    public Object connectors = ZVal.newArray();

    public QueueManager(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == QueueManager.class) {
            this.__construct(env, args);
        }
    }

    public QueueManager(NoConstructor n) {
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
    @ConvertedParameter(index = 0, name = "callback")
    public Object before(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        env.callMethod(
                new ReferenceClassProperty(this, "app", env).arrayGet(env, "events"),
                "listen",
                QueueManager.class,
                JobProcessing.CONST_class,
                callback);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object after(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        env.callMethod(
                new ReferenceClassProperty(this, "app", env).arrayGet(env, "events"),
                "listen",
                QueueManager.class,
                JobProcessed.CONST_class,
                callback);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object exceptionOccurred(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        env.callMethod(
                new ReferenceClassProperty(this, "app", env).arrayGet(env, "events"),
                "listen",
                QueueManager.class,
                JobExceptionOccurred.CONST_class,
                callback);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object looping(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        env.callMethod(
                new ReferenceClassProperty(this, "app", env).arrayGet(env, "events"),
                "listen",
                QueueManager.class,
                Looping.CONST_class,
                callback);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object failing(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        env.callMethod(
                new ReferenceClassProperty(this, "app", env).arrayGet(env, "events"),
                "listen",
                QueueManager.class,
                JobFailed.CONST_class,
                callback);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object stopping(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        env.callMethod(
                new ReferenceClassProperty(this, "app", env).arrayGet(env, "events"),
                "listen",
                QueueManager.class,
                WorkerStopping.CONST_class,
                callback);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object connected(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "connections", env),
                        env,
                        ZVal.isTrue(ternaryExpressionTemp = name)
                                ? ternaryExpressionTemp
                                : this.getDefaultDriver(env)));
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
                                : this.getDefaultDriver(env));
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "connections", env),
                env,
                name)) {
            new ReferenceClassProperty(this, "connections", env)
                    .arrayAccess(env, name)
                    .set(this.resolve(env, name));
            env.callMethod(
                    new ReferenceClassProperty(this, "connections", env).arrayGet(env, name),
                    "setContainer",
                    QueueManager.class,
                    this.app);
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "connections", env).arrayGet(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object resolve(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        ReferenceContainer config = new BasicReferenceContainer(null);
        config.setObject(this.getConfig(env, name));
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this.getConnector(env, config.arrayGet(env, "driver")),
                                "connect",
                                QueueManager.class,
                                config.getObject()),
                        "setConnectionName",
                        QueueManager.class,
                        name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "driver")
    protected Object getConnector(RuntimeEnv env, Object... args) {
        Object driver = assignParameter(args, 0, false);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "connectors", env),
                env,
                driver)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "No connector for [" + toStringR(driver, env) + "]"));
        }

        return ZVal.assign(
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                new ReferenceClassProperty(this, "connectors", env)
                                        .arrayGet(env, driver))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "driver")
    @ConvertedParameter(index = 1, name = "resolver", typeHint = "Closure")
    public Object extend(RuntimeEnv env, Object... args) {
        Object driver = assignParameter(args, 0, false);
        Object resolver = assignParameter(args, 1, false);
        return ZVal.assign(this.addConnector(env, driver, resolver));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "driver")
    @ConvertedParameter(index = 1, name = "resolver", typeHint = "Closure")
    public Object addConnector(RuntimeEnv env, Object... args) {
        Object driver = assignParameter(args, 0, false);
        Object resolver = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "connectors", env).arrayAccess(env, driver).set(resolver);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object getConfig(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (ZVal.toBool(!function_is_null.f.env(env).call(name).getBool())
                && ZVal.toBool(ZVal.strictNotEqualityCheck(name, "!==", "null"))) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "app", env)
                            .arrayGet(env, "config", "queue.connections." + toStringR(name, env)));
        }

        return ZVal.assign(ZVal.newArray(new ZPair("driver", "null")));
    }

    @ConvertedMethod
    public Object getDefaultDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(env, "config", "queue.default"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setDefaultDriver(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "app", env)
                .arrayAccess(env, "config", "queue.default")
                .set(name);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "connection",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getName(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, true);
        if (null == connection) {
            connection = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = connection)
                        ? ternaryExpressionTemp
                        : this.getDefaultDriver(env));
    }

    @ConvertedMethod
    public Object isDownForMaintenance(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.app, "isDownForMaintenance", QueueManager.class));
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
                        QueueManager.class,
                        PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters))));
    }

    public static final Object CONST_class = "Illuminate\\Queue\\QueueManager";

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
                    .setName("Illuminate\\Queue\\QueueManager")
                    .setLookup(
                            QueueManager.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "connections", "connectors")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Queue/QueueManager.php")
                    .addInterface("Illuminate\\Contracts\\Queue\\Factory")
                    .addInterface("Illuminate\\Contracts\\Queue\\Monitor")
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
