package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Capsule.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Fluent;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes.QueueManager;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Container.classes.Container;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes.QueueServiceProvider;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/Capsule/Manager.php

*/

public class Manager extends RuntimeClassBase {

    public Object manager = null;

    public Object container = null;

    public Manager(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Manager.class) {
            this.__construct(env, args);
        }
    }

    public Manager(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Container\\Container",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, true);
        if (null == container) {
            container = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.setupContainer(
                env,
                ZVal.isTrue(ternaryExpressionTemp = container)
                        ? ternaryExpressionTemp
                        : new Container(env));
        this.setupDefaultConfiguration(env);
        this.setupManager(env);
        this.registerConnectors(env);
        return null;
    }

    @ConvertedMethod
    protected Object setupDefaultConfiguration(RuntimeEnv env, Object... args) {
        new ReferenceClassProperty(this, "container", env)
                .arrayAccess(env, "config", "queue.default")
                .set("default");
        return null;
    }

    @ConvertedMethod
    protected Object setupManager(RuntimeEnv env, Object... args) {
        this.manager = new QueueManager(env, this.container);
        return null;
    }

    @ConvertedMethod
    protected Object registerConnectors(RuntimeEnv env, Object... args) {
        Object provider = null;
        provider = new QueueServiceProvider(env, this.container);
        env.callMethod(provider, "registerConnectors", Manager.class, this.manager);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getConnection(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        return ZVal.assign(env.callMethod(this.manager, "connection", Manager.class, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    @ConvertedParameter(index = 1, name = "name")
    public Object addConnection(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = "default";
        }
        new ReferenceClassProperty(this, "container", env)
                .arrayAccess(env, "config", "queue.connections." + toStringR(name, env))
                .set(config);
        return null;
    }

    @ConvertedMethod
    public Object getQueueManager(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.manager);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this.manager,
                        new RuntimeArgsWithReferences(),
                        toStringR(method, env),
                        Manager.class,
                        PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Contracts\\Container\\Container"
    )
    protected Object setupContainer(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        this.container = container;
        if (!ZVal.isTrue(env.callMethod(this.container, "bound", Manager.class, "config"))) {
            env.callMethod(this.container, "instance", Manager.class, "config", new Fluent(env));
        }

        return null;
    }

    @ConvertedMethod
    public Object setAsGlobal(RuntimeEnv env, Object... args) {
        env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Illuminate
                                        .namespaces
                                        .Queue
                                        .namespaces
                                        .Capsule
                                        .classes
                                        .Manager
                                        .RequestStaticProperties
                                        .class)
                        .instance =
                this;
        return null;
    }

    @ConvertedMethod
    public Object getContainer(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.container);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Contracts\\Container\\Container"
    )
    public Object setContainer(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        this.container = container;
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Queue\\Capsule\\Manager";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "connection",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object connection(RuntimeEnv env, Object... args) {
            Object connection = assignParameter(args, 0, true);
            if (null == connection) {
                connection = ZVal.getNull();
            }
            return ZVal.assign(
                    env.callMethod(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Queue
                                                    .namespaces
                                                    .Capsule
                                                    .classes
                                                    .Manager
                                                    .RequestStaticProperties
                                                    .class)
                                    .instance,
                            "getConnection",
                            Manager.class,
                            connection));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "job")
        @ConvertedParameter(index = 1, name = "data")
        @ConvertedParameter(
            index = 2,
            name = "queue",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "connection",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object push(RuntimeEnv env, Object... args) {
            Object job = assignParameter(args, 0, false);
            Object data = assignParameter(args, 1, true);
            if (null == data) {
                data = "";
            }
            Object queue = assignParameter(args, 2, true);
            if (null == queue) {
                queue = ZVal.getNull();
            }
            Object connection = assignParameter(args, 3, true);
            if (null == connection) {
                connection = ZVal.getNull();
            }
            return ZVal.assign(
                    env.callMethod(
                            env.callMethod(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Illuminate
                                                            .namespaces
                                                            .Queue
                                                            .namespaces
                                                            .Capsule
                                                            .classes
                                                            .Manager
                                                            .RequestStaticProperties
                                                            .class)
                                            .instance,
                                    "connection",
                                    Manager.class,
                                    connection),
                            "push",
                            Manager.class,
                            job,
                            data,
                            queue));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "jobs")
        @ConvertedParameter(index = 1, name = "data")
        @ConvertedParameter(
            index = 2,
            name = "queue",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "connection",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object bulk(RuntimeEnv env, Object... args) {
            Object jobs = assignParameter(args, 0, false);
            Object data = assignParameter(args, 1, true);
            if (null == data) {
                data = "";
            }
            Object queue = assignParameter(args, 2, true);
            if (null == queue) {
                queue = ZVal.getNull();
            }
            Object connection = assignParameter(args, 3, true);
            if (null == connection) {
                connection = ZVal.getNull();
            }
            return ZVal.assign(
                    env.callMethod(
                            env.callMethod(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Illuminate
                                                            .namespaces
                                                            .Queue
                                                            .namespaces
                                                            .Capsule
                                                            .classes
                                                            .Manager
                                                            .RequestStaticProperties
                                                            .class)
                                            .instance,
                                    "connection",
                                    Manager.class,
                                    connection),
                            "bulk",
                            Manager.class,
                            jobs,
                            data,
                            queue));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "delay")
        @ConvertedParameter(index = 1, name = "job")
        @ConvertedParameter(index = 2, name = "data")
        @ConvertedParameter(
            index = 3,
            name = "queue",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 4,
            name = "connection",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object later(RuntimeEnv env, Object... args) {
            Object delay = assignParameter(args, 0, false);
            Object job = assignParameter(args, 1, false);
            Object data = assignParameter(args, 2, true);
            if (null == data) {
                data = "";
            }
            Object queue = assignParameter(args, 3, true);
            if (null == queue) {
                queue = ZVal.getNull();
            }
            Object connection = assignParameter(args, 4, true);
            if (null == connection) {
                connection = ZVal.getNull();
            }
            return ZVal.assign(
                    env.callMethod(
                            env.callMethod(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Illuminate
                                                            .namespaces
                                                            .Queue
                                                            .namespaces
                                                            .Capsule
                                                            .classes
                                                            .Manager
                                                            .RequestStaticProperties
                                                            .class)
                                            .instance,
                                    "connection",
                                    Manager.class,
                                    connection),
                            "later",
                            Manager.class,
                            delay,
                            job,
                            data,
                            queue));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method")
        @ConvertedParameter(index = 1, name = "parameters")
        public Object __callStatic(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            Object parameters = assignParameter(args, 1, false);
            return ZVal.assign(
                    env.callMethod(
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, Manager.class)
                                    .method("connection")
                                    .call()
                                    .value(),
                            new RuntimeArgsWithReferences(),
                            toStringR(method, env),
                            Manager.class,
                            PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters))));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object instance = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Queue\\Capsule\\Manager")
                    .setLookup(
                            Manager.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("container", "manager")
                    .setStaticPropertyNames("instance")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Queue/Capsule/Manager.php")
                    .addTrait("Illuminate\\Support\\Traits\\CapsuleManagerTrait")
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
