package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Connectors.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Connectors.classes.Connector;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.RuntimeStack;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_extract;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Connectors.classes.ConnectorInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeClasses.pdo.PDO;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Connectors/MySqlConnector.php

*/

public class MySqlConnector extends Connector implements ConnectorInterface {

    public MySqlConnector(RuntimeEnv env, Object... args) {
        super(env);
    }

    public MySqlConnector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    public Object connect(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object options = null;
        Object connection = null;
        Object dsn = null;
        dsn = this.getDsn(env, config.getObject());
        options = env.callMethod(this, "getOptions", MySqlConnector.class, config.getObject());
        connection =
                env.callMethod(
                        this,
                        "createConnection",
                        MySqlConnector.class,
                        dsn,
                        config.getObject(),
                        options);
        if (!arrayActionR(ArrayAction.EMPTY, config, env, "database")) {
            env.callMethod(
                    connection,
                    "exec",
                    MySqlConnector.class,
                    "use `" + toStringR(config.arrayGet(env, "database"), env) + "`;");
        }

        this.configureEncoding(env, connection, config.getObject());
        this.configureTimezone(env, connection, config.getObject());
        this.setModes(env, connection, config.getObject());
        return ZVal.assign(connection);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    @ConvertedParameter(index = 1, name = "config", typeHint = "array")
    protected Object configureEncoding(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 1, false));
        if (!arrayActionR(ArrayAction.ISSET, config, env, "charset")) {
            return ZVal.assign(connection);
        }

        env.callMethod(
                env.callMethod(
                        connection,
                        "prepare",
                        MySqlConnector.class,
                        toStringR(
                                        "set names '"
                                                + toStringR(config.arrayGet(env, "charset"), env)
                                                + "'",
                                        env)
                                + toStringR(this.getCollation(env, config.getObject()), env)),
                "execute",
                MySqlConnector.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object getCollation(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                arrayActionR(ArrayAction.ISSET, config, env, "collation")
                        ? " collate '" + toStringR(config.arrayGet(env, "collation"), env) + "'"
                        : "");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    @ConvertedParameter(index = 1, name = "config", typeHint = "array")
    protected Object configureTimezone(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 1, false));
        if (arrayActionR(ArrayAction.ISSET, config, env, "timezone")) {
            env.callMethod(
                    env.callMethod(
                            connection,
                            "prepare",
                            MySqlConnector.class,
                            "set time_zone=\""
                                    + toStringR(config.arrayGet(env, "timezone"), env)
                                    + "\""),
                    "execute",
                    MySqlConnector.class);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object getDsn(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isTrue(this.hasSocket(env, config))
                        ? this.getSocketDsn(env, config)
                        : this.getHostDsn(env, config));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object hasSocket(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                ZVal.toBool(arrayActionR(ArrayAction.ISSET, config, env, "unix_socket"))
                        && ZVal.toBool(
                                !arrayActionR(ArrayAction.EMPTY, config, env, "unix_socket")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object getSocketDsn(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                "mysql:unix_socket="
                        + toStringR(config.arrayGet(env, "unix_socket"), env)
                        + ";dbname="
                        + toStringR(config.arrayGet(env, "database"), env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object getHostDsn(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope88 scope = new Scope88();
        stack.pushScope(scope);
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Connectors")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Connectors/MySqlConnector.php");
            scope.config = assignParameter(args, 0, false);
            scope.database = null;
            scope.port = null;
            scope.host = null;
            function_extract.f.env(env).call(stack, scope.config, 1);
            throw new IncludeEventException(
                    ZVal.assign(
                            ZVal.isset(scope.port)
                                    ? "mysql:host="
                                            + toStringR(scope.host, env)
                                            + ";port="
                                            + toStringR(scope.port, env)
                                            + ";dbname="
                                            + toStringR(scope.database, env)
                                    : "mysql:host="
                                            + toStringR(scope.host, env)
                                            + ";dbname="
                                            + toStringR(scope.database, env)));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection", typeHint = "PDO")
    @ConvertedParameter(index = 1, name = "config", typeHint = "array")
    protected Object setModes(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 1, false));
        if (arrayActionR(ArrayAction.ISSET, config, env, "modes")) {
            this.setCustomModes(env, connection, config.getObject());

        } else if (arrayActionR(ArrayAction.ISSET, config, env, "strict")) {
            if (ZVal.isTrue(config.arrayGet(env, "strict"))) {
                env.callMethod(
                        env.callMethod(
                                connection,
                                "prepare",
                                MySqlConnector.class,
                                this.strictMode(env, connection)),
                        "execute",
                        MySqlConnector.class);

            } else {
                env.callMethod(
                        env.callMethod(
                                connection,
                                "prepare",
                                MySqlConnector.class,
                                "set session sql_mode='NO_ENGINE_SUBSTITUTION'"),
                        "execute",
                        MySqlConnector.class);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection", typeHint = "PDO")
    @ConvertedParameter(index = 1, name = "config", typeHint = "array")
    protected Object setCustomModes(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object modes = null;
        modes = NamespaceGlobal.implode.env(env).call(",", config.arrayGet(env, "modes")).value();
        env.callMethod(
                env.callMethod(
                        connection,
                        "prepare",
                        MySqlConnector.class,
                        "set session sql_mode='" + toStringR(modes, env) + "'"),
                "execute",
                MySqlConnector.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection", typeHint = "PDO")
    protected Object strictMode(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        if (ZVal.isGreaterThanOrEqualTo(
                NamespaceGlobal.version_compare
                        .env(env)
                        .call(
                                env.callMethod(connection, "getAttribute", MySqlConnector.class, 4),
                                "8.0.11")
                        .value(),
                ">=",
                0)) {
            return "set session sql_mode='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION'";
        }

        return "set session sql_mode='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION'";
    }

    public static final Object CONST_class = "Illuminate\\Database\\Connectors\\MySqlConnector";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Connector.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Connectors\\MySqlConnector")
                    .setLookup(
                            MySqlConnector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("options")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Connectors/MySqlConnector.php")
                    .addInterface("Illuminate\\Database\\Connectors\\ConnectorInterface")
                    .addExtendsClass("Illuminate\\Database\\Connectors\\Connector")
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

    private static class Scope88 implements UpdateRuntimeScopeInterface {

        Object database;
        Object port;
        Object host;
        Object config;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("database", this.database);
            stack.setVariable("port", this.port);
            stack.setVariable("host", this.host);
            stack.setVariable("config", this.config);
        }

        public void updateScope(RuntimeStack stack) {

            this.database = stack.getVariable("database");
            this.port = stack.getVariable("port");
            this.host = stack.getVariable("host");
            this.config = stack.getVariable("config");
        }
    }
}
