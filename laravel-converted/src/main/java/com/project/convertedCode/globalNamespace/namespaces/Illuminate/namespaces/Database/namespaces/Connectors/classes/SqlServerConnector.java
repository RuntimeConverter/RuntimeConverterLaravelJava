package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Connectors.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Connectors.classes.Connector;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeClasses.pdo.PDO;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Connectors.classes.ConnectorInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Connectors/SqlServerConnector.php

*/

public class SqlServerConnector extends Connector implements ConnectorInterface {

    public SqlServerConnector(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.options =
                ZVal.newArray(
                        new ZPair(8, 0), new ZPair(3, 2), new ZPair(11, 0), new ZPair(17, false));
    }

    public SqlServerConnector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    public Object connect(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        Object options = null;
        options = env.callMethod(this, "getOptions", SqlServerConnector.class, config);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "createConnection",
                        SqlServerConnector.class,
                        this.getDsn(env, config),
                        config,
                        options));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object getDsn(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        if (function_in_array.f.env(env).call("dblib", this.getAvailableDrivers(env)).getBool()) {
            return ZVal.assign(this.getDblibDsn(env, config));

        } else if (ZVal.isTrue(this.prefersOdbc(env, config))) {
            return ZVal.assign(this.getOdbcDsn(env, config));
        }

        return ZVal.assign(this.getSqlSrvDsn(env, config));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object prefersOdbc(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.toBool(
                                function_in_array
                                        .f
                                        .env(env)
                                        .call("odbc", this.getAvailableDrivers(env))
                                        .value())
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        ZVal.isDefined(
                                                        ternaryExpressionTemp =
                                                                config.arrayGet(env, "odbc"))
                                                ? ternaryExpressionTemp
                                                : ZVal.getNull(),
                                        "===",
                                        true)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object getDblibDsn(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                this.buildConnectString(
                        env,
                        "dblib",
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        ZVal.newArray(
                                                new ZPair(
                                                        "host",
                                                        this.buildHostString(
                                                                env, config.getObject(), ":")),
                                                new ZPair(
                                                        "dbname",
                                                        config.arrayGet(env, "database"))),
                                        Arr.runtimeStaticObject.only(
                                                env,
                                                config.getObject(),
                                                ZVal.arrayFromList(
                                                        "appname", "charset", "version")))
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object getOdbcDsn(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                arrayActionR(ArrayAction.ISSET, config, env, "odbc_datasource_name")
                        ? "odbc:" + toStringR(config.arrayGet(env, "odbc_datasource_name"), env)
                        : "");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object getSqlSrvDsn(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer arguments = new BasicReferenceContainer(null);
        arguments.setObject(
                ZVal.newArray(
                        new ZPair("Server", this.buildHostString(env, config.getObject(), ","))));
        if (arrayActionR(ArrayAction.ISSET, config, env, "database")) {
            arguments.arrayAccess(env, "Database").set(config.arrayGet(env, "database"));
        }

        if (arrayActionR(ArrayAction.ISSET, config, env, "readonly")) {
            arguments.arrayAccess(env, "ApplicationIntent").set("ReadOnly");
        }

        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, config, env, "pooling"))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(config.arrayGet(env, "pooling"), "===", false))) {
            arguments.arrayAccess(env, "ConnectionPooling").set("0");
        }

        if (arrayActionR(ArrayAction.ISSET, config, env, "appname")) {
            arguments.arrayAccess(env, "APP").set(config.arrayGet(env, "appname"));
        }

        if (arrayActionR(ArrayAction.ISSET, config, env, "encrypt")) {
            arguments.arrayAccess(env, "Encrypt").set(config.arrayGet(env, "encrypt"));
        }

        if (arrayActionR(ArrayAction.ISSET, config, env, "trust_server_certificate")) {
            arguments
                    .arrayAccess(env, "TrustServerCertificate")
                    .set(config.arrayGet(env, "trust_server_certificate"));
        }

        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, config, env, "multiple_active_result_sets"))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                config.arrayGet(env, "multiple_active_result_sets"),
                                "===",
                                false))) {
            arguments.arrayAccess(env, "MultipleActiveResultSets").set("false");
        }

        if (arrayActionR(ArrayAction.ISSET, config, env, "transaction_isolation")) {
            arguments
                    .arrayAccess(env, "TransactionIsolation")
                    .set(config.arrayGet(env, "transaction_isolation"));
        }

        if (arrayActionR(ArrayAction.ISSET, config, env, "multi_subnet_failover")) {
            arguments
                    .arrayAccess(env, "MultiSubnetFailover")
                    .set(config.arrayGet(env, "multi_subnet_failover"));
        }

        return ZVal.assign(this.buildConnectString(env, "sqlsrv", arguments.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "driver")
    @ConvertedParameter(index = 1, name = "arguments", typeHint = "array")
    protected Object buildConnectString(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Connectors")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Connectors/SqlServerConnector.php");
        Object driver = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, false);
        return ZVal.assign(
                toStringR(driver, env)
                        + ":"
                        + toStringR(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                ";",
                                                function_array_map
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                new Closure(
                                                                        env,
                                                                        runtimeConverterFunctionClassConstants,
                                                                        "Illuminate\\Database\\Connectors",
                                                                        this) {
                                                                    @Override
                                                                    @ConvertedMethod
                                                                    @ConvertedParameter(
                                                                        index = 0,
                                                                        name = "key"
                                                                    )
                                                                    public Object run(
                                                                            RuntimeEnv env,
                                                                            Object thisvar,
                                                                            PassByReferenceArgs
                                                                                    runtimePassByReferenceArgs,
                                                                            Object... args) {
                                                                        Object key =
                                                                                assignParameter(
                                                                                        args, 0,
                                                                                        false);
                                                                        ReferenceContainer
                                                                                arguments =
                                                                                        new BasicReferenceContainer(
                                                                                                null);
                                                                        arguments =
                                                                                this
                                                                                        .contextReferences
                                                                                        .getReferenceContainer(
                                                                                                "arguments");
                                                                        return ZVal.assign(
                                                                                function_sprintf
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                "%s=%s",
                                                                                                key,
                                                                                                arguments
                                                                                                        .arrayGet(
                                                                                                                env,
                                                                                                                key))
                                                                                        .value());
                                                                    }
                                                                }.use("arguments", arguments),
                                                                function_array_keys
                                                                        .f
                                                                        .env(env)
                                                                        .call(arguments)
                                                                        .value())
                                                        .value())
                                        .value(),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    @ConvertedParameter(index = 1, name = "separator")
    protected Object buildHostString(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object separator = assignParameter(args, 1, false);
        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, config, env, "port"))
                && ZVal.toBool(!arrayActionR(ArrayAction.EMPTY, config, env, "port"))) {
            return ZVal.assign(
                    toStringR(config.arrayGet(env, "host"), env)
                            + toStringR(separator, env)
                            + toStringR(config.arrayGet(env, "port"), env));

        } else {
            return ZVal.assign(config.arrayGet(env, "host"));
        }
    }

    @ConvertedMethod
    protected Object getAvailableDrivers(RuntimeEnv env, Object... args) {
        return ZVal.assign(PDO.runtimeStaticObject.getAvailableDrivers(env));
    }

    public static final Object CONST_class = "Illuminate\\Database\\Connectors\\SqlServerConnector";

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
                    .setName("Illuminate\\Database\\Connectors\\SqlServerConnector")
                    .setLookup(
                            SqlServerConnector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("options", "options")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Connectors/SqlServerConnector.php")
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
}
