package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Capsule.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes.DatabaseManager;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Fluent;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Container.classes.Container;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Connectors.classes.ConnectionFactory;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.Model;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeClasses.pdo.PDO;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Capsule/Manager.php

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
        return null;
    }

    @ConvertedMethod
    protected Object setupDefaultConfiguration(RuntimeEnv env, Object... args) {
        new ReferenceClassProperty(this, "container", env)
                .arrayAccess(env, "config", "database.fetch")
                .set(5);
        new ReferenceClassProperty(this, "container", env)
                .arrayAccess(env, "config", "database.default")
                .set("default");
        return null;
    }

    @ConvertedMethod
    protected Object setupManager(RuntimeEnv env, Object... args) {
        Object factory = null;
        factory = new ConnectionFactory(env, this.container);
        this.manager = new DatabaseManager(env, this.container, factory);
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
        ReferenceContainer connections = new BasicReferenceContainer(null);
        connections.setObject(
                ZVal.assign(
                        new ReferenceClassProperty(this, "container", env)
                                .arrayGet(env, "config", "database.connections")));
        connections.arrayAccess(env, name).set(config);
        new ReferenceClassProperty(this, "container", env)
                .arrayAccess(env, "config", "database.connections")
                .set(connections.getObject());
        return null;
    }

    @ConvertedMethod
    public Object bootEloquent(RuntimeEnv env, Object... args) {
        Object dispatcher = null;
        Model.runtimeStaticObject.setConnectionResolver(env, this.manager);
        if (ZVal.isTrue(dispatcher = this.getEventDispatcher(env))) {
            Model.runtimeStaticObject.setEventDispatcher(env, dispatcher);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fetchMode")
    public Object setFetchMode(RuntimeEnv env, Object... args) {
        Object fetchMode = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "container", env)
                .arrayAccess(env, "config", "database.fetch")
                .set(fetchMode);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getDatabaseManager(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.manager);
    }

    @ConvertedMethod
    public Object getEventDispatcher(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(env.callMethod(this.container, "bound", Manager.class, "events"))) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "container", env).arrayGet(env, "events"));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "dispatcher",
        typeHint = "Illuminate\\Contracts\\Events\\Dispatcher"
    )
    public Object setEventDispatcher(RuntimeEnv env, Object... args) {
        Object dispatcher = assignParameter(args, 0, false);
        env.callMethod(this.container, "instance", Manager.class, "events", dispatcher);
        return null;
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
                                        .Database
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

    public static final Object CONST_class = "Illuminate\\Database\\Capsule\\Manager";

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
                                                    .Database
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
        @ConvertedParameter(index = 0, name = "table")
        @ConvertedParameter(
            index = 1,
            name = "connection",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object table(RuntimeEnv env, Object... args) {
            Object table = assignParameter(args, 0, false);
            Object connection = assignParameter(args, 1, true);
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
                                                            .Database
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
                            "table",
                            Manager.class,
                            table));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "connection",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object schema(RuntimeEnv env, Object... args) {
            Object connection = assignParameter(args, 0, true);
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
                                                            .Database
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
                            "getSchemaBuilder",
                            Manager.class));
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
                    .setName("Illuminate\\Database\\Capsule\\Manager")
                    .setLookup(
                            Manager.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("container", "manager")
                    .setStaticPropertyNames("instance")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Capsule/Manager.php")
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
