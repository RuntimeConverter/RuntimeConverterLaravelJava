package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Connectors.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Debug.classes.ExceptionHandler;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Connectors.classes.SQLiteConnector;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes.SqlServerConnection;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.pdo.PDOException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Connectors.classes.MySqlConnector;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Connectors.classes.PostgresConnector;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes.Connection;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes.MySqlConnection;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes.SQLiteConnection;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Connectors.classes.SqlServerConnector;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes.PostgresConnection;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Connectors/ConnectionFactory.php

*/

public class ConnectionFactory extends RuntimeClassBase {

    public Object container = null;

    public ConnectionFactory(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ConnectionFactory.class) {
            this.__construct(env, args);
        }
    }

    public ConnectionFactory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Contracts\\Container\\Container"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        this.container = container;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object make(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        config.setObject(this.parseConfig(env, config.getObject(), name));
        if (arrayActionR(ArrayAction.ISSET, config, env, "read")) {
            return ZVal.assign(this.createReadWriteConnection(env, config.getObject()));
        }

        return ZVal.assign(this.createSingleConnection(env, config.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    @ConvertedParameter(index = 1, name = "name")
    protected Object parseConfig(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        return ZVal.assign(
                Arr.runtimeStaticObject.add(
                        env, Arr.runtimeStaticObject.add(env, config, "prefix", ""), "name", name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object createSingleConnection(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object pdo = null;
        pdo = this.createPdoResolver(env, config.getObject());
        return ZVal.assign(
                this.createConnection(
                        env,
                        config.arrayGet(env, "driver"),
                        pdo,
                        config.arrayGet(env, "database"),
                        config.arrayGet(env, "prefix"),
                        config.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object createReadWriteConnection(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        Object connection = null;
        connection = this.createSingleConnection(env, this.getWriteConfig(env, config));
        return ZVal.assign(
                env.callMethod(
                        connection,
                        "setReadPdo",
                        ConnectionFactory.class,
                        this.createReadPdo(env, config)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object createReadPdo(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        return ZVal.assign(this.createPdoResolver(env, this.getReadConfig(env, config)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object getReadConfig(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        return ZVal.assign(
                this.mergeReadWriteConfig(
                        env, config, this.getReadWriteConfig(env, config, "read")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object getWriteConfig(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        return ZVal.assign(
                this.mergeReadWriteConfig(
                        env, config, this.getReadWriteConfig(env, config, "write")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    @ConvertedParameter(index = 1, name = "type")
    protected Object getReadWriteConfig(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object type = assignParameter(args, 1, false);
        return ZVal.assign(
                arrayActionR(ArrayAction.ISSET, config, env, type, 0)
                        ? Arr.runtimeStaticObject.random(env, config.arrayGet(env, type))
                        : config.arrayGet(env, type));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    @ConvertedParameter(index = 1, name = "merge", typeHint = "array")
    protected Object mergeReadWriteConfig(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        Object merge = assignParameter(args, 1, false);
        return ZVal.assign(
                Arr.runtimeStaticObject.except(
                        env,
                        function_array_merge.f.env(env).call(config, merge).value(),
                        ZVal.arrayFromList("read", "write")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object createPdoResolver(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_key_exists.f.env(env).call("host", config).getBool()
                        ? this.createPdoResolverWithHosts(env, config)
                        : this.createPdoResolverWithoutHosts(env, config));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object createPdoResolverWithHosts(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Connectors")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Connectors/ConnectionFactory.php");
        Object config = assignParameter(args, 0, false);
        return ZVal.assign(
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Database\\Connectors",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object e = null;
                        Object hosts = null;
                        Object host = null;
                        ReferenceContainer config = new BasicReferenceContainer(null);
                        Object key = null;
                        config = this.contextReferences.getReferenceContainer("config");
                        for (ZPair zpairResult252 :
                                ZVal.getIterable(
                                        Arr.runtimeStaticObject.shuffle(
                                                env,
                                                hosts =
                                                        ConnectionFactory.this.parseHosts(
                                                                env, config.getObject())),
                                        env,
                                        false)) {
                            key = ZVal.assign(zpairResult252.getKey());
                            host = ZVal.assign(zpairResult252.getValue());
                            config.arrayAccess(env, "host").set(host);
                            try {
                                return ZVal.assign(
                                        env.callMethod(
                                                ConnectionFactory.this.createConnector(
                                                        env, config.getObject()),
                                                "connect",
                                                ConnectionFactory.class,
                                                config.getObject()));
                            } catch (ConvertedException convertedException23) {
                                if (convertedException23.instanceOf(
                                        PDOException.class, "PDOException")) {
                                    e = convertedException23.getObject();
                                    if (ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            ZVal.subtract(
                                                                    function_count
                                                                            .f
                                                                            .env(env)
                                                                            .call(hosts)
                                                                            .value(),
                                                                    1),
                                                            "===",
                                                            key))
                                            && ZVal.toBool(
                                                    env.callMethod(
                                                            ConnectionFactory.this.container,
                                                            "bound",
                                                            ConnectionFactory.class,
                                                            ExceptionHandler.CONST_class))) {
                                        env.callMethod(
                                                env.callMethod(
                                                        ConnectionFactory.this.container,
                                                        "make",
                                                        ConnectionFactory.class,
                                                        ExceptionHandler.CONST_class),
                                                "report",
                                                ConnectionFactory.class,
                                                e);
                                    }

                                } else {
                                    throw convertedException23;
                                }
                            }
                        }

                        throw ZVal.getException(env, e);
                    }
                }.use("config", config));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object parseHosts(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object hosts = null;
        hosts = Arr.runtimeStaticObject.wrap(env, config.arrayGet(env, "host"));
        if (ZVal.isEmpty(hosts)) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "Database hosts array is empty."));
        }

        return ZVal.assign(hosts);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object createPdoResolverWithoutHosts(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Connectors")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Connectors/ConnectionFactory.php");
        Object config = assignParameter(args, 0, false);
        return ZVal.assign(
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Database\\Connectors",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object config = null;
                        config = this.contextReferences.getCapturedValue("config");
                        return ZVal.assign(
                                env.callMethod(
                                        ConnectionFactory.this.createConnector(env, config),
                                        "connect",
                                        ConnectionFactory.class,
                                        config));
                    }
                }.use("config", config));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    public Object createConnector(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object key = null;
        if (!arrayActionR(ArrayAction.ISSET, config, env, "driver")) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "A driver must be specified."));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        this.container,
                        "bound",
                        ConnectionFactory.class,
                        key =
                                ZVal.assign(
                                        "db.connector."
                                                + toStringR(
                                                        config.arrayGet(env, "driver"), env))))) {
            return ZVal.assign(
                    env.callMethod(this.container, "make", ConnectionFactory.class, key));
        }

        switch (toStringR(config.arrayGet(env, "driver"))) {
            case "mysql":
                return ZVal.assign(new MySqlConnector(env));
            case "pgsql":
                return ZVal.assign(new PostgresConnector(env));
            case "sqlite":
                return ZVal.assign(new SQLiteConnector(env));
            case "sqlsrv":
                return ZVal.assign(new SqlServerConnector(env));
        }
        ;
        throw ZVal.getException(
                env,
                new InvalidArgumentException(
                        env,
                        "Unsupported driver ["
                                + toStringR(config.arrayGet(env, "driver"), env)
                                + "]"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "driver")
    @ConvertedParameter(index = 1, name = "connection")
    @ConvertedParameter(index = 2, name = "database")
    @ConvertedParameter(index = 3, name = "prefix")
    @ConvertedParameter(
        index = 4,
        name = "config",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object createConnection(RuntimeEnv env, Object... args) {
        Object driver = assignParameter(args, 0, false);
        ReferenceContainer connection =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer database = new BasicReferenceContainer(assignParameter(args, 2, false));
        ReferenceContainer prefix = new BasicReferenceContainer(assignParameter(args, 3, true));
        if (null == prefix.getObject()) {
            prefix.setObject("");
        }
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 4, true));
        if (null == config.getObject()) {
            config.setObject(ZVal.newArray());
        }
        Object resolver = null;
        if (ZVal.isTrue(resolver = Connection.runtimeStaticObject.getResolver(env, driver))) {
            return ZVal.assign(
                    env.callFunctionDynamic(
                                    resolver,
                                    new RuntimeArgsWithReferences()
                                            .add(0, connection)
                                            .add(1, database)
                                            .add(2, prefix)
                                            .add(3, config),
                                    connection.getObject(),
                                    database.getObject(),
                                    prefix.getObject(),
                                    config.getObject())
                            .value());
        }

        switch (toStringR(driver)) {
            case "mysql":
                return ZVal.assign(
                        new MySqlConnection(
                                env,
                                connection.getObject(),
                                database.getObject(),
                                prefix.getObject(),
                                config.getObject()));
            case "pgsql":
                return ZVal.assign(
                        new PostgresConnection(
                                env,
                                connection.getObject(),
                                database.getObject(),
                                prefix.getObject(),
                                config.getObject()));
            case "sqlite":
                return ZVal.assign(
                        new SQLiteConnection(
                                env,
                                connection.getObject(),
                                database.getObject(),
                                prefix.getObject(),
                                config.getObject()));
            case "sqlsrv":
                return ZVal.assign(
                        new SqlServerConnection(
                                env,
                                connection.getObject(),
                                database.getObject(),
                                prefix.getObject(),
                                config.getObject()));
        }
        ;
        throw ZVal.getException(
                env,
                new InvalidArgumentException(
                        env, "Unsupported driver [" + toStringR(driver, env) + "]"));
    }

    public static final Object CONST_class = "Illuminate\\Database\\Connectors\\ConnectionFactory";

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
                    .setName("Illuminate\\Database\\Connectors\\ConnectionFactory")
                    .setLookup(
                            ConnectionFactory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("container")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Connectors/ConnectionFactory.php")
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
