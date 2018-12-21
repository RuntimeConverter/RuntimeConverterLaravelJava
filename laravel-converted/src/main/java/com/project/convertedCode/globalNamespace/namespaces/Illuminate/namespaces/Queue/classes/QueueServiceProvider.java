package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Connectors.classes.DatabaseConnector;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes.Listener;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Debug.classes.ExceptionHandler;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Connectors.classes.NullConnector;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes.Worker;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Connectors.classes.SyncConnector;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Connectors.classes.RedisConnector;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Failed.classes.NullFailedJobProvider;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Connectors.classes.SqsConnector;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes.QueueManager;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Connectors.classes.BeanstalkdConnector;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Failed.classes.DatabaseFailedJobProvider;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/QueueServiceProvider.php

*/

public class QueueServiceProvider extends ServiceProvider {

    public QueueServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.defer = true;
        if (this.getClass() == QueueServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public QueueServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        this.registerManager(env);
        this.registerConnection(env);
        this.registerWorker(env);
        this.registerListener(env);
        this.registerFailedJobServices(env);
        return null;
    }

    @ConvertedMethod
    protected Object registerManager(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Queue/QueueServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                QueueServiceProvider.class,
                "queue",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Queue", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ContextConstants runtimeConverterFunctionClassConstants =
                                new ContextConstants()
                                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue")
                                        .setFile(
                                                "/vendor/laravel/framework/src/Illuminate/Queue/QueueServiceProvider.php");
                        Object app = assignParameter(args, 0, false);
                        return ZVal.assign(
                                tap.f
                                        .env(env)
                                        .call(
                                                new QueueManager(env, app),
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Illuminate\\Queue",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "manager")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object _closureThisVar =
                                                                this.getClosureThisVar();
                                                        Object manager =
                                                                assignParameter(args, 0, false);
                                                        QueueServiceProvider.this
                                                                .registerConnectors(env, manager);
                                                        return null;
                                                    }
                                                })
                                        .value());
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object registerConnection(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Queue/QueueServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                QueueServiceProvider.class,
                "queue.connection",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Queue", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ReferenceContainer app =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        return ZVal.assign(
                                env.callMethod(
                                        app.arrayGet(env, "queue"),
                                        "connection",
                                        QueueServiceProvider.class));
                    }
                });
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "manager")
    public Object registerConnectors(RuntimeEnv env, Object... args) {
        ReferenceContainer manager = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object connector = null;
        for (ZPair zpairResult509 :
                ZVal.getIterable(
                        ZVal.arrayFromList(
                                "Null", "Sync", "Database", "Redis", "Beanstalkd", "Sqs"),
                        env,
                        true)) {
            connector = ZVal.assign(zpairResult509.getValue());
            env.callMethod(
                    this,
                    new RuntimeArgsWithReferences().add(0, manager),
                    toStringR("register" + toStringR(connector, env) + "Connector", env),
                    QueueServiceProvider.class,
                    manager.getObject());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "manager")
    protected Object registerNullConnector(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Queue/QueueServiceProvider.php");
        Object manager = assignParameter(args, 0, false);
        env.callMethod(
                manager,
                "addConnector",
                QueueServiceProvider.class,
                "null",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Queue", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        return ZVal.assign(new NullConnector(env));
                    }
                });
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "manager")
    protected Object registerSyncConnector(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Queue/QueueServiceProvider.php");
        Object manager = assignParameter(args, 0, false);
        env.callMethod(
                manager,
                "addConnector",
                QueueServiceProvider.class,
                "sync",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Queue", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        return ZVal.assign(new SyncConnector(env));
                    }
                });
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "manager")
    protected Object registerDatabaseConnector(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Queue/QueueServiceProvider.php");
        Object manager = assignParameter(args, 0, false);
        env.callMethod(
                manager,
                "addConnector",
                QueueServiceProvider.class,
                "database",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Queue", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        return ZVal.assign(
                                new DatabaseConnector(
                                        env,
                                        new ReferenceClassProperty(_closureThisVar, "app", env)
                                                .arrayGet(env, "db")));
                    }
                });
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "manager")
    protected Object registerRedisConnector(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Queue/QueueServiceProvider.php");
        Object manager = assignParameter(args, 0, false);
        env.callMethod(
                manager,
                "addConnector",
                QueueServiceProvider.class,
                "redis",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Queue", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        return ZVal.assign(
                                new RedisConnector(
                                        env,
                                        new ReferenceClassProperty(_closureThisVar, "app", env)
                                                .arrayGet(env, "redis")));
                    }
                });
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "manager")
    protected Object registerBeanstalkdConnector(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Queue/QueueServiceProvider.php");
        Object manager = assignParameter(args, 0, false);
        env.callMethod(
                manager,
                "addConnector",
                QueueServiceProvider.class,
                "beanstalkd",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Queue", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        return ZVal.assign(new BeanstalkdConnector(env));
                    }
                });
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "manager")
    protected Object registerSqsConnector(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Queue/QueueServiceProvider.php");
        Object manager = assignParameter(args, 0, false);
        env.callMethod(
                manager,
                "addConnector",
                QueueServiceProvider.class,
                "sqs",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Queue", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        return ZVal.assign(new SqsConnector(env));
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object registerWorker(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Queue/QueueServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                QueueServiceProvider.class,
                "queue.worker",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Queue", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        return ZVal.assign(
                                new Worker(
                                        env,
                                        new ReferenceClassProperty(_closureThisVar, "app", env)
                                                .arrayGet(env, "queue"),
                                        new ReferenceClassProperty(_closureThisVar, "app", env)
                                                .arrayGet(env, "events"),
                                        new ReferenceClassProperty(_closureThisVar, "app", env)
                                                .arrayGet(env, ExceptionHandler.CONST_class)));
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object registerListener(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Queue/QueueServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                QueueServiceProvider.class,
                "queue.listener",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Queue", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        return ZVal.assign(
                                new Listener(
                                        env,
                                        env.callMethod(
                                                toObjectR(_closureThisVar)
                                                        .accessProp(this, env)
                                                        .name("app")
                                                        .value(),
                                                "basePath",
                                                QueueServiceProvider.class)));
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object registerFailedJobServices(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Queue")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Queue/QueueServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                QueueServiceProvider.class,
                "queue.failer",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Queue", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        ReferenceContainer config = new BasicReferenceContainer(null);
                        config.setObject(
                                ZVal.assign(
                                        new ReferenceClassProperty(_closureThisVar, "app", env)
                                                .arrayGet(env, "config", "queue.failed")));
                        return ZVal.assign(
                                arrayActionR(ArrayAction.ISSET, config, env, "table")
                                        ? QueueServiceProvider.this.databaseFailedJobProvider(
                                                env, config.getObject())
                                        : new NullFailedJobProvider(env));
                    }
                });
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config")
    protected Object databaseFailedJobProvider(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                new DatabaseFailedJobProvider(
                        env,
                        new ReferenceClassProperty(this, "app", env).arrayGet(env, "db"),
                        config.arrayGet(env, "database"),
                        config.arrayGet(env, "table")));
    }

    @ConvertedMethod
    public Object provides(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.arrayFromList(
                        "queue",
                        "queue.worker",
                        "queue.listener",
                        "queue.failer",
                        "queue.connection"));
    }

    public static final Object CONST_class = "Illuminate\\Queue\\QueueServiceProvider";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ServiceProvider.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Queue\\QueueServiceProvider")
                    .setLookup(
                            QueueServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer", "defer")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Queue/QueueServiceProvider.php")
                    .addExtendsClass("Illuminate\\Support\\ServiceProvider")
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
