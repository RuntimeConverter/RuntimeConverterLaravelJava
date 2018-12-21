package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Connectors.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Connectors.classes.Connector;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
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

 vendor/laravel/framework/src/Illuminate/Database/Connectors/PostgresConnector.php

*/

public class PostgresConnector extends Connector implements ConnectorInterface {

    public PostgresConnector(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.options =
                ZVal.newArray(
                        new ZPair(8, 0), new ZPair(3, 2), new ZPair(11, 0), new ZPair(17, false));
    }

    public PostgresConnector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    public Object connect(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        Object connection = null;
        connection =
                env.callMethod(
                        this,
                        "createConnection",
                        PostgresConnector.class,
                        this.getDsn(env, config),
                        config,
                        env.callMethod(this, "getOptions", PostgresConnector.class, config));
        this.configureEncoding(env, connection, config);
        this.configureTimezone(env, connection, config);
        this.configureSchema(env, connection, config);
        this.configureApplicationName(env, connection, config);
        return ZVal.assign(connection);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    @ConvertedParameter(index = 1, name = "config")
    protected Object configureEncoding(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object charset = null;
        charset = ZVal.assign(config.arrayGet(env, "charset"));
        env.callMethod(
                env.callMethod(
                        connection,
                        "prepare",
                        PostgresConnector.class,
                        "set names '" + toStringR(charset, env) + "'"),
                "execute",
                PostgresConnector.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    @ConvertedParameter(index = 1, name = "config", typeHint = "array")
    protected Object configureTimezone(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object timezone = null;
        if (arrayActionR(ArrayAction.ISSET, config, env, "timezone")) {
            timezone = ZVal.assign(config.arrayGet(env, "timezone"));
            env.callMethod(
                    env.callMethod(
                            connection,
                            "prepare",
                            PostgresConnector.class,
                            "set time zone '" + toStringR(timezone, env) + "'"),
                    "execute",
                    PostgresConnector.class);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    @ConvertedParameter(index = 1, name = "config")
    protected Object configureSchema(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object schema = null;
        if (arrayActionR(ArrayAction.ISSET, config, env, "schema")) {
            schema = this.formatSchema(env, config.arrayGet(env, "schema"));
            env.callMethod(
                    env.callMethod(
                            connection,
                            "prepare",
                            PostgresConnector.class,
                            "set search_path to " + toStringR(schema, env)),
                    "execute",
                    PostgresConnector.class);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "schema")
    protected Object formatSchema(RuntimeEnv env, Object... args) {
        Object schema = assignParameter(args, 0, false);
        if (function_is_array.f.env(env).call(schema).getBool()) {
            return ZVal.assign(
                    "\""
                            + toStringR(
                                    NamespaceGlobal.implode.env(env).call("\", \"", schema).value(),
                                    env)
                            + "\"");
        }

        return ZVal.assign("\"" + toStringR(schema, env) + "\"");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    @ConvertedParameter(index = 1, name = "config")
    protected Object configureApplicationName(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object applicationName = null;
        if (arrayActionR(ArrayAction.ISSET, config, env, "application_name")) {
            applicationName = ZVal.assign(config.arrayGet(env, "application_name"));
            env.callMethod(
                    env.callMethod(
                            connection,
                            "prepare",
                            PostgresConnector.class,
                            "set application_name to '" + toStringR(applicationName, env) + "'"),
                    "execute",
                    PostgresConnector.class);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object getDsn(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope89 scope = new Scope89();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Connectors")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Connectors/PostgresConnector.php");
            scope.config = new BasicReferenceContainer(assignParameter(args, 0, false));
            scope.database = null;
            scope.port = null;
            scope.host = null;
            scope.dsn = null;
            function_extract.f.env(env).call(stack, scope.config.getObject(), 1);
            scope.host =
                    ZVal.assign(
                            ZVal.isset(scope.host)
                                    ? "host=" + toStringR(scope.host, env) + ";"
                                    : "");
            scope.dsn =
                    ZVal.assign(
                            "pgsql:"
                                    + toStringR(scope.host, env)
                                    + "dbname="
                                    + toStringR(scope.database, env));
            if (arrayActionR(ArrayAction.ISSET, scope.config, env, "port")) {
                scope.dsn =
                        toStringR(scope.dsn, env)
                                + toStringR(";port=" + toStringR(scope.port, env), env);
            }

            throw new IncludeEventException(
                    ZVal.assign(this.addSslOptions(env, scope.dsn, scope.config.getObject())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dsn")
    @ConvertedParameter(index = 1, name = "config", typeHint = "array")
    protected Object addSslOptions(RuntimeEnv env, Object... args) {
        Object dsn = assignParameter(args, 0, false);
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object option = null;
        for (ZPair zpairResult253 :
                ZVal.getIterable(
                        ZVal.arrayFromList("sslmode", "sslcert", "sslkey", "sslrootcert"),
                        env,
                        true)) {
            option = ZVal.assign(zpairResult253.getValue());
            if (arrayActionR(ArrayAction.ISSET, config, env, option)) {
                dsn =
                        toStringR(dsn, env)
                                + toStringR(
                                        ";"
                                                + toStringR(option, env)
                                                + "="
                                                + toStringR(config.arrayGet(env, option), env),
                                        env);
            }
        }

        return ZVal.assign(dsn);
    }

    public static final Object CONST_class = "Illuminate\\Database\\Connectors\\PostgresConnector";

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
                    .setName("Illuminate\\Database\\Connectors\\PostgresConnector")
                    .setLookup(
                            PostgresConnector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("options", "options")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Connectors/PostgresConnector.php")
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

    private static class Scope89 implements UpdateRuntimeScopeInterface {

        Object database;
        Object port;
        Object host;
        Object _thisVarAlias;
        ReferenceContainer config;
        Object dsn;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("database", this.database);
            stack.setVariable("port", this.port);
            stack.setVariable("host", this.host);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("config", this.config);
            stack.setVariable("dsn", this.dsn);
        }

        public void updateScope(RuntimeStack stack) {

            this.database = stack.getVariable("database");
            this.port = stack.getVariable("port");
            this.host = stack.getVariable("host");
            this._thisVarAlias = stack.getVariable("this");
            this.config = ZVal.getStackReference(stack.getVariable("config"));
            this.dsn = stack.getVariable("dsn");
        }
    }
}
