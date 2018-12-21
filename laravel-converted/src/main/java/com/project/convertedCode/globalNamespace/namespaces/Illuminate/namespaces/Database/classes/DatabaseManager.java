package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeClasses.pdo.PDO;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes.ConnectionResolverInterface;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_intersect;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/DatabaseManager.php

*/

public class DatabaseManager extends RuntimeClassBase implements ConnectionResolverInterface {

    public Object app = null;

    public Object factory = null;

    public Object connections = ZVal.newArray();

    public Object extensions = ZVal.newArray();

    public DatabaseManager(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DatabaseManager.class) {
            this.__construct(env, args);
        }
    }

    public DatabaseManager(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "app")
    @ConvertedParameter(
        index = 1,
        name = "factory",
        typeHint = "Illuminate\\Database\\Connectors\\ConnectionFactory"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object app = assignParameter(args, 0, false);
        Object factory = assignParameter(args, 1, false);
        this.app = app;
        this.factory = factory;
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
        Object database = null;
        Object runtimeTempArrayResult19 = null;
        Object ternaryExpressionTemp = null;
        Object type = null;
        ZVal.list(
                runtimeTempArrayResult19 = this.parseConnectionName(env, name),
                (database = listGet(runtimeTempArrayResult19, 0, env)),
                (type = listGet(runtimeTempArrayResult19, 1, env)));
        name =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = name)
                                ? ternaryExpressionTemp
                                : database);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "connections", env),
                env,
                name)) {
            new ReferenceClassProperty(this, "connections", env)
                    .arrayAccess(env, name)
                    .set(this.configure(env, this.makeConnection(env, database), type));
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "connections", env).arrayGet(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object parseConnectionName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        name =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = name)
                                ? ternaryExpressionTemp
                                : this.getDefaultConnection(env));
        return ZVal.assign(
                ZVal.isTrue(
                                Str.runtimeStaticObject.endsWith(
                                        env, name, ZVal.arrayFromList("::read", "::write")))
                        ? function_explode.f.env(env).call("::", name, 2).value()
                        : ZVal.newArray(new ZPair(0, name), new ZPair(1, ZVal.getNull())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object makeConnection(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object driver = null;
        ReferenceContainer config = new BasicReferenceContainer(null);
        config.setObject(this.configuration(env, name));
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "extensions", env),
                env,
                name)) {
            return ZVal.assign(
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    new ReferenceClassProperty(this, "extensions", env)
                                            .arrayGet(env, name),
                                    config.getObject(),
                                    name)
                            .value());
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "extensions", env),
                env,
                driver = ZVal.assign(config.arrayGet(env, "driver")))) {
            return ZVal.assign(
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    new ReferenceClassProperty(this, "extensions", env)
                                            .arrayGet(env, driver),
                                    config.getObject(),
                                    name)
                            .value());
        }

        return ZVal.assign(
                env.callMethod(
                        this.factory, "make", DatabaseManager.class, config.getObject(), name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object configuration(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        Object config = null;
        Object connections = null;
        name =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = name)
                                ? ternaryExpressionTemp
                                : this.getDefaultConnection(env));
        connections =
                ZVal.assign(
                        new ReferenceClassProperty(this, "app", env)
                                .arrayGet(env, "config", "database.connections"));
        if (function_is_null
                .f
                .env(env)
                .call(config = Arr.runtimeStaticObject.get(env, connections, name))
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Database [" + toStringR(name, env) + "] not configured."));
        }

        return ZVal.assign(config);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "connection",
        typeHint = "Illuminate\\Database\\Connection"
    )
    @ConvertedParameter(index = 1, name = "type")
    protected Object configure(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/DatabaseManager.php");
        Object connection = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, false);
        connection = this.setPdoForType(env, connection, type);
        if (ZVal.isTrue(env.callMethod(this.app, "bound", DatabaseManager.class, "events"))) {
            env.callMethod(
                    connection,
                    "setEventDispatcher",
                    DatabaseManager.class,
                    new ReferenceClassProperty(this, "app", env).arrayGet(env, "events"));
        }

        env.callMethod(
                connection,
                "setReconnector",
                DatabaseManager.class,
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Database", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "connection")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object connection = assignParameter(args, 0, false);
                        DatabaseManager.this.reconnect(
                                env, env.callMethod(connection, "getName", DatabaseManager.class));
                        return null;
                    }
                });
        return ZVal.assign(connection);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "connection",
        typeHint = "Illuminate\\Database\\Connection"
    )
    @ConvertedParameter(
        index = 1,
        name = "type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object setPdoForType(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        if (ZVal.equalityCheck(type, "read")) {
            env.callMethod(
                    connection,
                    "setPdo",
                    DatabaseManager.class,
                    env.callMethod(connection, "getReadPdo", DatabaseManager.class));

        } else if (ZVal.equalityCheck(type, "write")) {
            env.callMethod(
                    connection,
                    "setReadPdo",
                    DatabaseManager.class,
                    env.callMethod(connection, "getPdo", DatabaseManager.class));
        }

        return ZVal.assign(connection);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object purge(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        name =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = name)
                                ? ternaryExpressionTemp
                                : this.getDefaultConnection(env));
        this.disconnect(env, name);
        arrayActionR(
                ArrayAction.UNSET, new ReferenceClassProperty(this, "connections", env), env, name);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object disconnect(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "connections", env),
                env,
                name =
                        ZVal.assign(
                                ZVal.isTrue(ternaryExpressionTemp = name)
                                        ? ternaryExpressionTemp
                                        : this.getDefaultConnection(env)))) {
            env.callMethod(
                    new ReferenceClassProperty(this, "connections", env).arrayGet(env, name),
                    "disconnect",
                    DatabaseManager.class);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object reconnect(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.disconnect(
                env,
                name =
                        ZVal.assign(
                                ZVal.isTrue(ternaryExpressionTemp = name)
                                        ? ternaryExpressionTemp
                                        : this.getDefaultConnection(env)));
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "connections", env),
                env,
                name)) {
            return ZVal.assign(this.connection(env, name));
        }

        return ZVal.assign(this.refreshPdoConnections(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object refreshPdoConnections(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object fresh = null;
        fresh = this.makeConnection(env, name);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                new ReferenceClassProperty(this, "connections", env)
                                        .arrayGet(env, name),
                                "setPdo",
                                DatabaseManager.class,
                                env.callMethod(fresh, "getPdo", DatabaseManager.class)),
                        "setReadPdo",
                        DatabaseManager.class,
                        env.callMethod(fresh, "getReadPdo", DatabaseManager.class)));
    }

    @ConvertedMethod
    public Object getDefaultConnection(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(env, "config", "database.default"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setDefaultConnection(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "app", env)
                .arrayAccess(env, "config", "database.default")
                .set(name);
        return null;
    }

    @ConvertedMethod
    public Object supportedDrivers(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("mysql", "pgsql", "sqlite", "sqlsrv"));
    }

    @ConvertedMethod
    public Object availableDrivers(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_array_intersect
                        .f
                        .env(env)
                        .call(
                                this.supportedDrivers(env),
                                function_str_replace
                                        .f
                                        .env(env)
                                        .call(
                                                "dblib",
                                                "sqlsrv",
                                                PDO.runtimeStaticObject.getAvailableDrivers(env))
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "resolver", typeHint = "callable")
    public Object extend(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object resolver = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "extensions", env).arrayAccess(env, name).set(resolver);
        return null;
    }

    @ConvertedMethod
    public Object getConnections(RuntimeEnv env, Object... args) {
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
                        DatabaseManager.class,
                        PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters))));
    }

    public static final Object CONST_class = "Illuminate\\Database\\DatabaseManager";

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
                    .setName("Illuminate\\Database\\DatabaseManager")
                    .setLookup(
                            DatabaseManager.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "connections", "extensions", "factory")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/DatabaseManager.php")
                    .addInterface("Illuminate\\Database\\ConnectionResolverInterface")
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
