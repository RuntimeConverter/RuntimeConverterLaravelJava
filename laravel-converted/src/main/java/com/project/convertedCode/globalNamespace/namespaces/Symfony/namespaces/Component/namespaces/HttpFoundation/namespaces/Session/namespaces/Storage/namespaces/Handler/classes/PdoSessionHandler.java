package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeClasses.pdo.PDO;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.pdo.PDOException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.DomainException;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.namespaces.Handler.classes.AbstractSessionHandler;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/Session/Storage/Handler/PdoSessionHandler.php

*/

public class PdoSessionHandler extends AbstractSessionHandler {

    public Object pdo = null;

    public Object dsn = false;

    public Object driver = null;

    public Object table = "sessions";

    public Object idCol = "sess_id";

    public Object dataCol = "sess_data";

    public Object lifetimeCol = "sess_lifetime";

    public Object timeCol = "sess_time";

    public Object username = "";

    public Object password = "";

    public Object connectionOptions = ZVal.newArray();

    public Object lockMode = CONST_LOCK_TRANSACTIONAL;

    public Object unlockStatements = ZVal.newArray();

    public Object sessionExpired = false;

    public Object inTransaction = false;

    public Object gcCalled = false;

    public PdoSessionHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PdoSessionHandler.class) {
            this.__construct(env, args);
        }
    }

    public PdoSessionHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "pdoOrDsn",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object pdoOrDsn = assignParameter(args, 0, true);
        if (null == pdoOrDsn) {
            pdoOrDsn = ZVal.getNull();
        }
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        if (ZVal.isTrue(ZVal.checkInstanceType(pdoOrDsn, PDO.class, "PDO"))) {
            if (ZVal.strictNotEqualityCheck(
                    2,
                    "!==",
                    env.callMethod(pdoOrDsn, "getAttribute", PdoSessionHandler.class, 3))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "\"%s\" requires PDO error mode attribute be set to throw Exceptions (i.e. $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION))",
                                                "PdoSessionHandler")
                                        .value()));
            }

            this.pdo = pdoOrDsn;
            this.driver = env.callMethod(this.pdo, "getAttribute", PdoSessionHandler.class, 16);

        } else if (ZVal.toBool(function_is_string.f.env(env).call(pdoOrDsn).value())
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                false,
                                "!==",
                                function_strpos.f.env(env).call(pdoOrDsn, "://").value()))) {
            this.dsn = this.buildDsnFromUrl(env, pdoOrDsn);

        } else {
            this.dsn = pdoOrDsn;
        }

        this.table =
                arrayActionR(ArrayAction.ISSET, options, env, "db_table")
                        ? options.arrayGet(env, "db_table")
                        : this.table;
        this.idCol =
                arrayActionR(ArrayAction.ISSET, options, env, "db_id_col")
                        ? options.arrayGet(env, "db_id_col")
                        : this.idCol;
        this.dataCol =
                arrayActionR(ArrayAction.ISSET, options, env, "db_data_col")
                        ? options.arrayGet(env, "db_data_col")
                        : this.dataCol;
        this.lifetimeCol =
                arrayActionR(ArrayAction.ISSET, options, env, "db_lifetime_col")
                        ? options.arrayGet(env, "db_lifetime_col")
                        : this.lifetimeCol;
        this.timeCol =
                arrayActionR(ArrayAction.ISSET, options, env, "db_time_col")
                        ? options.arrayGet(env, "db_time_col")
                        : this.timeCol;
        this.username =
                arrayActionR(ArrayAction.ISSET, options, env, "db_username")
                        ? options.arrayGet(env, "db_username")
                        : this.username;
        this.password =
                arrayActionR(ArrayAction.ISSET, options, env, "db_password")
                        ? options.arrayGet(env, "db_password")
                        : this.password;
        this.connectionOptions =
                arrayActionR(ArrayAction.ISSET, options, env, "db_connection_options")
                        ? options.arrayGet(env, "db_connection_options")
                        : this.connectionOptions;
        this.lockMode =
                arrayActionR(ArrayAction.ISSET, options, env, "lock_mode")
                        ? options.arrayGet(env, "lock_mode")
                        : this.lockMode;
        return null;
    }

    @ConvertedMethod
    public Object createTable(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object e = null;
        Object sql = null;
        this.getConnection(env);
        SwitchEnumType120 switchVariable120 =
                ZVal.getEnum(
                        this.driver,
                        SwitchEnumType120.DEFAULT_CASE,
                        SwitchEnumType120.STRING_mysql,
                        "mysql",
                        SwitchEnumType120.STRING_sqlite,
                        "sqlite",
                        SwitchEnumType120.STRING_pgsql,
                        "pgsql",
                        SwitchEnumType120.STRING_oci,
                        "oci",
                        SwitchEnumType120.STRING_sqlsrv,
                        "sqlsrv");
        switch (switchVariable120) {
            case STRING_mysql:
                sql =
                        ZVal.assign(
                                "CREATE TABLE "
                                        + toStringR(this.table, env)
                                        + " ("
                                        + toStringR(this.idCol, env)
                                        + " VARBINARY(128) NOT NULL PRIMARY KEY, "
                                        + toStringR(this.dataCol, env)
                                        + " BLOB NOT NULL, "
                                        + toStringR(this.lifetimeCol, env)
                                        + " MEDIUMINT NOT NULL, "
                                        + toStringR(this.timeCol, env)
                                        + " INTEGER UNSIGNED NOT NULL) COLLATE utf8_bin, ENGINE = InnoDB");
                break;
            case STRING_sqlite:
                sql =
                        ZVal.assign(
                                "CREATE TABLE "
                                        + toStringR(this.table, env)
                                        + " ("
                                        + toStringR(this.idCol, env)
                                        + " TEXT NOT NULL PRIMARY KEY, "
                                        + toStringR(this.dataCol, env)
                                        + " BLOB NOT NULL, "
                                        + toStringR(this.lifetimeCol, env)
                                        + " INTEGER NOT NULL, "
                                        + toStringR(this.timeCol, env)
                                        + " INTEGER NOT NULL)");
                break;
            case STRING_pgsql:
                sql =
                        ZVal.assign(
                                "CREATE TABLE "
                                        + toStringR(this.table, env)
                                        + " ("
                                        + toStringR(this.idCol, env)
                                        + " VARCHAR(128) NOT NULL PRIMARY KEY, "
                                        + toStringR(this.dataCol, env)
                                        + " BYTEA NOT NULL, "
                                        + toStringR(this.lifetimeCol, env)
                                        + " INTEGER NOT NULL, "
                                        + toStringR(this.timeCol, env)
                                        + " INTEGER NOT NULL)");
                break;
            case STRING_oci:
                sql =
                        ZVal.assign(
                                "CREATE TABLE "
                                        + toStringR(this.table, env)
                                        + " ("
                                        + toStringR(this.idCol, env)
                                        + " VARCHAR2(128) NOT NULL PRIMARY KEY, "
                                        + toStringR(this.dataCol, env)
                                        + " BLOB NOT NULL, "
                                        + toStringR(this.lifetimeCol, env)
                                        + " INTEGER NOT NULL, "
                                        + toStringR(this.timeCol, env)
                                        + " INTEGER NOT NULL)");
                break;
            case STRING_sqlsrv:
                sql =
                        ZVal.assign(
                                "CREATE TABLE "
                                        + toStringR(this.table, env)
                                        + " ("
                                        + toStringR(this.idCol, env)
                                        + " VARCHAR(128) NOT NULL PRIMARY KEY, "
                                        + toStringR(this.dataCol, env)
                                        + " VARBINARY(MAX) NOT NULL, "
                                        + toStringR(this.lifetimeCol, env)
                                        + " INTEGER NOT NULL, "
                                        + toStringR(this.timeCol, env)
                                        + " INTEGER NOT NULL)");
                break;
            case DEFAULT_CASE:
                throw ZVal.getException(
                        env,
                        new DomainException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Creating the session table is currently not implemented for PDO driver \"%s\".",
                                                this.driver)
                                        .value()));
        }
        ;
        try {
            env.callMethod(this.pdo, "exec", PdoSessionHandler.class, sql);
        } catch (ConvertedException convertedException260) {
            if (convertedException260.instanceOf(PDOException.class, "PDOException")) {
                e = convertedException260.getObject();
                this.rollback(env);
                throw ZVal.getException(env, e);
            } else {
                throw convertedException260;
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object isSessionExpired(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.sessionExpired);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "savePath")
    @ConvertedParameter(index = 1, name = "sessionName")
    public Object open(RuntimeEnv env, Object... args) {
        Object savePath = assignParameter(args, 0, false);
        Object sessionName = assignParameter(args, 1, false);
        Object ternaryExpressionTemp = null;
        this.sessionExpired = false;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.pdo)) {
            this.connect(
                    env,
                    ZVal.isTrue(ternaryExpressionTemp = this.dsn)
                            ? ternaryExpressionTemp
                            : savePath);
        }

        return ZVal.assign(super.open(env, savePath, sessionName));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    public Object read(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object e = null;
        try {
            return ZVal.assign(super.read(env, sessionId));
        } catch (ConvertedException convertedException261) {
            if (convertedException261.instanceOf(PDOException.class, "PDOException")) {
                e = convertedException261.getObject();
                this.rollback(env);
                throw ZVal.getException(env, e);
            } else {
                throw convertedException261;
            }
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "maxlifetime")
    public Object gc(RuntimeEnv env, Object... args) {
        Object maxlifetime = assignParameter(args, 0, false);
        this.gcCalled = true;
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    protected Object doDestroy(RuntimeEnv env, Object... args) {
        ReferenceContainer sessionId = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object e = null;
        Object stmt = null;
        Object sql = null;
        sql =
                ZVal.assign(
                        "DELETE FROM "
                                + toStringR(this.table, env)
                                + " WHERE "
                                + toStringR(this.idCol, env)
                                + " = :id");
        try {
            stmt = env.callMethod(this.pdo, "prepare", PdoSessionHandler.class, sql);
            env.callMethod(
                    stmt,
                    new RuntimeArgsWithReferences().add(1, sessionId),
                    "bindParam",
                    PdoSessionHandler.class,
                    ":id",
                    sessionId.getObject(),
                    2);
            env.callMethod(stmt, "execute", PdoSessionHandler.class);
        } catch (ConvertedException convertedException262) {
            if (convertedException262.instanceOf(PDOException.class, "PDOException")) {
                e = convertedException262.getObject();
                this.rollback(env);
                throw ZVal.getException(env, e);
            } else {
                throw convertedException262;
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    @ConvertedParameter(index = 1, name = "data")
    protected Object doWrite(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        Object maxlifetime = null;
        Object e = null;
        Object insertStmt = null;
        Object mergeStmt = null;
        Object updateStmt = null;
        maxlifetime =
                ZVal.assign(
                        ZVal.toLong(
                                function_ini_get
                                        .f
                                        .env(env)
                                        .call("session.gc_maxlifetime")
                                        .value()));
        try {
            mergeStmt = this.getMergeStatement(env, sessionId, data, maxlifetime);
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", mergeStmt)) {
                env.callMethod(mergeStmt, "execute", PdoSessionHandler.class);
                return ZVal.assign(true);
            }

            updateStmt = this.getUpdateStatement(env, sessionId, data, maxlifetime);
            env.callMethod(updateStmt, "execute", PdoSessionHandler.class);
            if (!ZVal.isTrue(env.callMethod(updateStmt, "rowCount", PdoSessionHandler.class))) {
                try {
                    insertStmt = this.getInsertStatement(env, sessionId, data, maxlifetime);
                    env.callMethod(insertStmt, "execute", PdoSessionHandler.class);
                } catch (ConvertedException convertedException263) {
                    if (convertedException263.instanceOf(PDOException.class, "PDOException")) {
                        e = convertedException263.getObject();
                        if (ZVal.strictEqualityCheck(
                                0,
                                "===",
                                function_strpos
                                        .f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        e, "getCode", PdoSessionHandler.class),
                                                "23")
                                        .value())) {
                            env.callMethod(updateStmt, "execute", PdoSessionHandler.class);

                        } else {
                            throw ZVal.getException(env, e);
                        }

                    } else {
                        throw convertedException263;
                    }
                }
            }

        } catch (ConvertedException convertedException264) {
            if (convertedException264.instanceOf(PDOException.class, "PDOException")) {
                e = convertedException264.getObject();
                this.rollback(env);
                throw ZVal.getException(env, e);
            } else {
                throw convertedException264;
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    @ConvertedParameter(index = 1, name = "data")
    public Object updateTimestamp(RuntimeEnv env, Object... args) {
        ReferenceContainer sessionId = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object data = assignParameter(args, 1, false);
        ReferenceContainer maxlifetime = new BasicReferenceContainer(null);
        Object e = null;
        Object updateStmt = null;
        maxlifetime.setObject(
                ZVal.assign(
                        ZVal.toLong(
                                function_ini_get
                                        .f
                                        .env(env)
                                        .call("session.gc_maxlifetime")
                                        .value())));
        try {
            updateStmt =
                    env.callMethod(
                            this.pdo,
                            "prepare",
                            PdoSessionHandler.class,
                            "UPDATE "
                                    + toStringR(this.table, env)
                                    + " SET "
                                    + toStringR(this.lifetimeCol, env)
                                    + " = :lifetime, "
                                    + toStringR(this.timeCol, env)
                                    + " = :time WHERE "
                                    + toStringR(this.idCol, env)
                                    + " = :id");
            env.callMethod(
                    updateStmt,
                    new RuntimeArgsWithReferences().add(1, sessionId),
                    "bindParam",
                    PdoSessionHandler.class,
                    ":id",
                    sessionId.getObject(),
                    2);
            env.callMethod(
                    updateStmt,
                    new RuntimeArgsWithReferences().add(1, maxlifetime),
                    "bindParam",
                    PdoSessionHandler.class,
                    ":lifetime",
                    maxlifetime.getObject(),
                    1);
            env.callMethod(
                    updateStmt,
                    "bindValue",
                    PdoSessionHandler.class,
                    ":time",
                    NamespaceGlobal.time.env(env).call().value(),
                    1);
            env.callMethod(updateStmt, "execute", PdoSessionHandler.class);
        } catch (ConvertedException convertedException265) {
            if (convertedException265.instanceOf(PDOException.class, "PDOException")) {
                e = convertedException265.getObject();
                this.rollback(env);
                throw ZVal.getException(env, e);
            } else {
                throw convertedException265;
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        Object unlockStmt = null;
        Object stmt = null;
        Object sql = null;
        this.commit(env);
        while (ZVal.isTrue(
                unlockStmt = function_array_shift.f.env(env).call(this.unlockStatements).value())) {
            env.callMethod(unlockStmt, "execute", PdoSessionHandler.class);
        }

        if (ZVal.isTrue(this.gcCalled)) {
            this.gcCalled = false;
            if (ZVal.strictEqualityCheck("mysql", "===", this.driver)) {
                sql =
                        ZVal.assign(
                                "DELETE FROM "
                                        + toStringR(this.table, env)
                                        + " WHERE "
                                        + toStringR(this.lifetimeCol, env)
                                        + " + "
                                        + toStringR(this.timeCol, env)
                                        + " < :time");

            } else {
                sql =
                        ZVal.assign(
                                "DELETE FROM "
                                        + toStringR(this.table, env)
                                        + " WHERE "
                                        + toStringR(this.lifetimeCol, env)
                                        + " < :time - "
                                        + toStringR(this.timeCol, env));
            }

            stmt = env.callMethod(this.pdo, "prepare", PdoSessionHandler.class, sql);
            env.callMethod(
                    stmt,
                    "bindValue",
                    PdoSessionHandler.class,
                    ":time",
                    NamespaceGlobal.time.env(env).call().value(),
                    1);
            env.callMethod(stmt, "execute", PdoSessionHandler.class);
        }

        if (ZVal.strictNotEqualityCheck(false, "!==", this.dsn)) {
            this.pdo = ZVal.getNull();
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dsn")
    private Object connect(RuntimeEnv env, Object... args) {
        Object dsn = assignParameter(args, 0, false);
        this.pdo = new PDO(env, dsn, this.username, this.password, this.connectionOptions);
        env.callMethod(this.pdo, "setAttribute", PdoSessionHandler.class, 3, 2);
        this.driver = env.callMethod(this.pdo, "getAttribute", PdoSessionHandler.class, 16);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dsnOrUrl")
    private Object buildDsnFromUrl(RuntimeEnv env, Object... args) {
        Object dsnOrUrl = assignParameter(args, 0, false);
        Object driver = null;
        Object dbName = null;
        ReferenceContainer driverAliasMap = new BasicReferenceContainer(null);
        ReferenceContainer params = new BasicReferenceContainer(null);
        Object url = null;
        Object dsn = null;
        url =
                function_preg_replace
                        .f
                        .env(env)
                        .call("#^((?:pdo_)?sqlite3?):///#", "$1://localhost/", dsnOrUrl)
                        .value();
        params.setObject(NamespaceGlobal.parse_url.env(env).call(url).value());
        if (ZVal.strictEqualityCheck(false, "===", params.getObject())) {
            return ZVal.assign(dsnOrUrl);
        }

        params.setObject(
                function_array_map.f.env(env).call("rawurldecode", params.getObject()).value());
        if (arrayActionR(ArrayAction.ISSET, params, env, "user")) {
            this.username = params.arrayGet(env, "user");
        }

        if (arrayActionR(ArrayAction.ISSET, params, env, "pass")) {
            this.password = params.arrayGet(env, "pass");
        }

        if (!arrayActionR(ArrayAction.ISSET, params, env, "scheme")) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "URLs without scheme are not supported to configure the PdoSessionHandler"));
        }

        driverAliasMap.setObject(
                ZVal.newArray(
                        new ZPair("mssql", "sqlsrv"),
                        new ZPair("mysql2", "mysql"),
                        new ZPair("postgres", "pgsql"),
                        new ZPair("postgresql", "pgsql"),
                        new ZPair("sqlite3", "sqlite")));
        driver =
                ZVal.assign(
                        arrayActionR(
                                        ArrayAction.ISSET,
                                        driverAliasMap,
                                        env,
                                        params.arrayGet(env, "scheme"))
                                ? driverAliasMap.arrayGet(env, params.arrayGet(env, "scheme"))
                                : params.arrayGet(env, "scheme"));
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                0, "===", function_strpos.f.env(env).call(driver, "pdo_").value()))
                || ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                0,
                                "===",
                                function_strpos.f.env(env).call(driver, "pdo-").value()))) {
            driver = function_substr.f.env(env).call(driver, 4).value();
        }

        SwitchEnumType121 switchVariable121 =
                ZVal.getEnum(
                        driver,
                        SwitchEnumType121.DEFAULT_CASE,
                        SwitchEnumType121.STRING_mysql,
                        "mysql",
                        SwitchEnumType121.STRING_pgsql,
                        "pgsql",
                        SwitchEnumType121.STRING_sqlite,
                        "sqlite",
                        SwitchEnumType121.STRING_sqlsrv,
                        "sqlsrv");
        switch (switchVariable121) {
            case STRING_mysql:
            case STRING_pgsql:
                dsn = toStringR(driver, env) + ":";
                if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, params, env, "host"))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        "", "!==", params.arrayGet(env, "host")))) {
                    dsn =
                            toStringR(dsn, env)
                                    + "host="
                                    + toStringR(params.arrayGet(env, "host"), env)
                                    + ";";
                }

                if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, params, env, "port"))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        "", "!==", params.arrayGet(env, "port")))) {
                    dsn =
                            toStringR(dsn, env)
                                    + "port="
                                    + toStringR(params.arrayGet(env, "port"), env)
                                    + ";";
                }

                if (arrayActionR(ArrayAction.ISSET, params, env, "path")) {
                    dbName =
                            function_substr
                                    .f
                                    .env(env)
                                    .call(params.arrayGet(env, "path"), 1)
                                    .value();
                    dsn = toStringR(dsn, env) + "dbname=" + toStringR(dbName, env) + ";";
                }

                return ZVal.assign(dsn);
            case STRING_sqlite:
                return ZVal.assign(
                        "sqlite:"
                                + toStringR(
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(params.arrayGet(env, "path"), 1)
                                                .value(),
                                        env));
            case STRING_sqlsrv:
                dsn = "sqlsrv:server=";
                if (arrayActionR(ArrayAction.ISSET, params, env, "host")) {
                    dsn = toStringR(dsn, env) + toStringR(params.arrayGet(env, "host"), env);
                }

                if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, params, env, "port"))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        "", "!==", params.arrayGet(env, "port")))) {
                    dsn = toStringR(dsn, env) + "," + toStringR(params.arrayGet(env, "port"), env);
                }

                if (arrayActionR(ArrayAction.ISSET, params, env, "path")) {
                    dbName =
                            function_substr
                                    .f
                                    .env(env)
                                    .call(params.arrayGet(env, "path"), 1)
                                    .value();
                    dsn = toStringR(dsn, env) + ";Database=" + toStringR(dbName, env);
                }

                return ZVal.assign(dsn);
            case DEFAULT_CASE:
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "The scheme \"%s\" is not supported by the PdoSessionHandler URL configuration. Pass a PDO DSN directly.",
                                                params.arrayGet(env, "scheme"))
                                        .value()));
        }
        ;
        return null;
    }

    @ConvertedMethod
    private Object beginTransaction(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.inTransaction)) {
            if (ZVal.strictEqualityCheck("sqlite", "===", this.driver)) {
                env.callMethod(
                        this.pdo, "exec", PdoSessionHandler.class, "BEGIN IMMEDIATE TRANSACTION");

            } else {
                if (ZVal.strictEqualityCheck("mysql", "===", this.driver)) {
                    env.callMethod(
                            this.pdo,
                            "exec",
                            PdoSessionHandler.class,
                            "SET TRANSACTION ISOLATION LEVEL READ COMMITTED");
                }

                env.callMethod(this.pdo, "beginTransaction", PdoSessionHandler.class);
            }

            this.inTransaction = true;
        }

        return null;
    }

    @ConvertedMethod
    private Object commit(RuntimeEnv env, Object... args) {
        Object e = null;
        if (ZVal.isTrue(this.inTransaction)) {
            try {
                if (ZVal.strictEqualityCheck("sqlite", "===", this.driver)) {
                    env.callMethod(this.pdo, "exec", PdoSessionHandler.class, "COMMIT");

                } else {
                    env.callMethod(this.pdo, "commit", PdoSessionHandler.class);
                }

                this.inTransaction = false;
            } catch (ConvertedException convertedException266) {
                if (convertedException266.instanceOf(PDOException.class, "PDOException")) {
                    e = convertedException266.getObject();
                    this.rollback(env);
                    throw ZVal.getException(env, e);
                } else {
                    throw convertedException266;
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    private Object rollback(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.inTransaction)) {
            if (ZVal.strictEqualityCheck("sqlite", "===", this.driver)) {
                env.callMethod(this.pdo, "exec", PdoSessionHandler.class, "ROLLBACK");

            } else {
                env.callMethod(this.pdo, "rollBack", PdoSessionHandler.class);
            }

            this.inTransaction = false;
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    protected Object doRead(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer sessionId = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object e = null;
        Object insertStmt = null;
        ReferenceContainer sessionRows = new BasicReferenceContainer(null);
        Object selectSql = null;
        Object selectStmt = null;
        if (ZVal.strictEqualityCheck(CONST_LOCK_ADVISORY, "===", this.lockMode)) {
            new ReferenceClassProperty(this, "unlockStatements", env)
                    .arrayAppend(env)
                    .set(this.doAdvisoryLock(env, sessionId.getObject()));
        }

        selectSql = this.getSelectSql(env);
        selectStmt = env.callMethod(this.pdo, "prepare", PdoSessionHandler.class, selectSql);
        env.callMethod(
                selectStmt,
                new RuntimeArgsWithReferences().add(1, sessionId),
                "bindParam",
                PdoSessionHandler.class,
                ":id",
                sessionId.getObject(),
                2);
        insertStmt = ZVal.getNull();
        runtimeConverterContinueCount = 0;
        do {
            env.callMethod(selectStmt, "execute", PdoSessionHandler.class);
            sessionRows.setObject(
                    env.callMethod(selectStmt, "fetchAll", PdoSessionHandler.class, 3));
            if (ZVal.isTrue(sessionRows.getObject())) {
                if (ZVal.isLessThan(
                        ZVal.add(sessionRows.arrayGet(env, 0, 1), sessionRows.arrayGet(env, 0, 2)),
                        '<',
                        NamespaceGlobal.time.env(env).call().value())) {
                    this.sessionExpired = true;
                    return "";
                }

                return ZVal.assign(
                        function_is_resource
                                        .f
                                        .env(env)
                                        .call(sessionRows.arrayGet(env, 0, 0))
                                        .getBool()
                                ? NamespaceGlobal.stream_get_contents
                                        .env(env)
                                        .call(sessionRows.arrayGet(env, 0, 0))
                                        .value()
                                : sessionRows.arrayGet(env, 0, 0));
            }

            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", insertStmt)) {
                this.rollback(env);
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                "Failed to read session: INSERT reported a duplicate id but next SELECT did not return any data."));
            }

            if (ZVal.toBool(
                            ZVal.toBool(
                                            !function_ini_get
                                                    .f
                                                    .env(env)
                                                    .call("session.use_strict_mode")
                                                    .getBool())
                                    && ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    CONST_LOCK_TRANSACTIONAL,
                                                    "===",
                                                    this.lockMode)))
                    && ZVal.toBool(ZVal.strictNotEqualityCheck("sqlite", "!==", this.driver))) {
                try {
                    insertStmt = this.getInsertStatement(env, sessionId.getObject(), "", 0);
                    env.callMethod(insertStmt, "execute", PdoSessionHandler.class);
                } catch (ConvertedException convertedException267) {
                    if (convertedException267.instanceOf(PDOException.class, "PDOException")) {
                        e = convertedException267.getObject();
                        if (ZVal.strictEqualityCheck(
                                0,
                                "===",
                                function_strpos
                                        .f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        e, "getCode", PdoSessionHandler.class),
                                                "23")
                                        .value())) {
                            this.rollback(env);
                            this.beginTransaction(env);
                            continue;
                        }

                        throw ZVal.getException(env, e);
                    } else {
                        throw convertedException267;
                    }
                }
            }

            return "";

        } while (ZVal.isTrue(true));

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId", typeHint = "string")
    private Object doAdvisoryLock(RuntimeEnv env, Object... args) {
        Object sessionId = assignParameter(args, 0, false);
        Object lockId = null;
        Object sessionBigInt = null;
        Object releaseStmt = null;
        Object sessionInt1 = null;
        Object sessionInt2 = null;
        Object stmt = null;
        SwitchEnumType122 switchVariable122 =
                ZVal.getEnum(
                        this.driver,
                        SwitchEnumType122.DEFAULT_CASE,
                        SwitchEnumType122.STRING_mysql,
                        "mysql",
                        SwitchEnumType122.STRING_pgsql,
                        "pgsql",
                        SwitchEnumType122.STRING_sqlite,
                        "sqlite");
        switch (switchVariable122) {
            case STRING_mysql:
                lockId = function_substr.f.env(env).call(sessionId, 0, 64).value();
                stmt =
                        env.callMethod(
                                this.pdo,
                                "prepare",
                                PdoSessionHandler.class,
                                "SELECT GET_LOCK(:key, 50)");
                env.callMethod(stmt, "bindValue", PdoSessionHandler.class, ":key", lockId, 2);
                env.callMethod(stmt, "execute", PdoSessionHandler.class);
                releaseStmt =
                        env.callMethod(
                                this.pdo,
                                "prepare",
                                PdoSessionHandler.class,
                                "DO RELEASE_LOCK(:key)");
                env.callMethod(
                        releaseStmt, "bindValue", PdoSessionHandler.class, ":key", lockId, 2);
                return ZVal.assign(releaseStmt);
            case STRING_pgsql:
                if (ZVal.strictEqualityCheck(4, "===", 8)) {
                    sessionInt1 = this.convertStringToInt(env, sessionId);
                    sessionInt2 =
                            this.convertStringToInt(
                                    env, function_substr.f.env(env).call(sessionId, 4, 4).value());
                    stmt =
                            env.callMethod(
                                    this.pdo,
                                    "prepare",
                                    PdoSessionHandler.class,
                                    "SELECT pg_advisory_lock(:key1, :key2)");
                    env.callMethod(
                            stmt, "bindValue", PdoSessionHandler.class, ":key1", sessionInt1, 1);
                    env.callMethod(
                            stmt, "bindValue", PdoSessionHandler.class, ":key2", sessionInt2, 1);
                    env.callMethod(stmt, "execute", PdoSessionHandler.class);
                    releaseStmt =
                            env.callMethod(
                                    this.pdo,
                                    "prepare",
                                    PdoSessionHandler.class,
                                    "SELECT pg_advisory_unlock(:key1, :key2)");
                    env.callMethod(
                            releaseStmt,
                            "bindValue",
                            PdoSessionHandler.class,
                            ":key1",
                            sessionInt1,
                            1);
                    env.callMethod(
                            releaseStmt,
                            "bindValue",
                            PdoSessionHandler.class,
                            ":key2",
                            sessionInt2,
                            1);

                } else {
                    sessionBigInt = this.convertStringToInt(env, sessionId);
                    stmt =
                            env.callMethod(
                                    this.pdo,
                                    "prepare",
                                    PdoSessionHandler.class,
                                    "SELECT pg_advisory_lock(:key)");
                    env.callMethod(
                            stmt, "bindValue", PdoSessionHandler.class, ":key", sessionBigInt, 1);
                    env.callMethod(stmt, "execute", PdoSessionHandler.class);
                    releaseStmt =
                            env.callMethod(
                                    this.pdo,
                                    "prepare",
                                    PdoSessionHandler.class,
                                    "SELECT pg_advisory_unlock(:key)");
                    env.callMethod(
                            releaseStmt,
                            "bindValue",
                            PdoSessionHandler.class,
                            ":key",
                            sessionBigInt,
                            1);
                }

                return ZVal.assign(releaseStmt);
            case STRING_sqlite:
                throw ZVal.getException(
                        env, new DomainException(env, "SQLite does not support advisory locks."));
            case DEFAULT_CASE:
                throw ZVal.getException(
                        env,
                        new DomainException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Advisory locks are currently not implemented for PDO driver \"%s\".",
                                                this.driver)
                                        .value()));
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string", typeHint = "string")
    private Object convertStringToInt(RuntimeEnv env, Object... args) {
        ReferenceContainer string = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object int2 = null;
        Object int1 = null;
        if (ZVal.strictEqualityCheck(4, "===", 8)) {
            return ZVal.assign(
                    ZVal.add(
                            ZVal.add(
                                    ZVal.add(
                                            ZVal.toLong(
                                                            NamespaceGlobal.ord
                                                                    .env(env)
                                                                    .call(string.arrayGet(env, 3))
                                                                    .value())
                                                    << ZVal.toLong(24),
                                            ZVal.toLong(
                                                            NamespaceGlobal.ord
                                                                    .env(env)
                                                                    .call(string.arrayGet(env, 2))
                                                                    .value())
                                                    << ZVal.toLong(16)),
                                    ZVal.toLong(
                                                    NamespaceGlobal.ord
                                                            .env(env)
                                                            .call(string.arrayGet(env, 1))
                                                            .value())
                                            << ZVal.toLong(8)),
                            NamespaceGlobal.ord.env(env).call(string.arrayGet(env, 0)).value()));
        }

        int1 =
                ZVal.add(
                        ZVal.add(
                                ZVal.add(
                                        ZVal.toLong(
                                                        NamespaceGlobal.ord
                                                                .env(env)
                                                                .call(string.arrayGet(env, 7))
                                                                .value())
                                                << ZVal.toLong(24),
                                        ZVal.toLong(
                                                        NamespaceGlobal.ord
                                                                .env(env)
                                                                .call(string.arrayGet(env, 6))
                                                                .value())
                                                << ZVal.toLong(16)),
                                ZVal.toLong(
                                                NamespaceGlobal.ord
                                                        .env(env)
                                                        .call(string.arrayGet(env, 5))
                                                        .value())
                                        << ZVal.toLong(8)),
                        NamespaceGlobal.ord.env(env).call(string.arrayGet(env, 4)).value());
        int2 =
                ZVal.add(
                        ZVal.add(
                                ZVal.add(
                                        ZVal.toLong(
                                                        NamespaceGlobal.ord
                                                                .env(env)
                                                                .call(string.arrayGet(env, 3))
                                                                .value())
                                                << ZVal.toLong(24),
                                        ZVal.toLong(
                                                        NamespaceGlobal.ord
                                                                .env(env)
                                                                .call(string.arrayGet(env, 2))
                                                                .value())
                                                << ZVal.toLong(16)),
                                ZVal.toLong(
                                                NamespaceGlobal.ord
                                                        .env(env)
                                                        .call(string.arrayGet(env, 1))
                                                        .value())
                                        << ZVal.toLong(8)),
                        NamespaceGlobal.ord.env(env).call(string.arrayGet(env, 0)).value());
        return ZVal.assign(ZVal.add(int2, ZVal.toLong(int1) << ZVal.toLong(32)));
    }

    @ConvertedMethod
    private Object getSelectSql(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        if (ZVal.strictEqualityCheck(CONST_LOCK_TRANSACTIONAL, "===", this.lockMode)) {
            this.beginTransaction(env);
            SwitchEnumType123 switchVariable123 =
                    ZVal.getEnum(
                            this.driver,
                            SwitchEnumType123.DEFAULT_CASE,
                            SwitchEnumType123.STRING_mysql,
                            "mysql",
                            SwitchEnumType123.STRING_oci,
                            "oci",
                            SwitchEnumType123.STRING_pgsql,
                            "pgsql",
                            SwitchEnumType123.STRING_sqlsrv,
                            "sqlsrv",
                            SwitchEnumType123.STRING_sqlite,
                            "sqlite");
            switch (switchVariable123) {
                case STRING_mysql:
                case STRING_oci:
                case STRING_pgsql:
                    return ZVal.assign(
                            "SELECT "
                                    + toStringR(this.dataCol, env)
                                    + ", "
                                    + toStringR(this.lifetimeCol, env)
                                    + ", "
                                    + toStringR(this.timeCol, env)
                                    + " FROM "
                                    + toStringR(this.table, env)
                                    + " WHERE "
                                    + toStringR(this.idCol, env)
                                    + " = :id FOR UPDATE");
                case STRING_sqlsrv:
                    return ZVal.assign(
                            "SELECT "
                                    + toStringR(this.dataCol, env)
                                    + ", "
                                    + toStringR(this.lifetimeCol, env)
                                    + ", "
                                    + toStringR(this.timeCol, env)
                                    + " FROM "
                                    + toStringR(this.table, env)
                                    + " WITH (UPDLOCK, ROWLOCK) WHERE "
                                    + toStringR(this.idCol, env)
                                    + " = :id");
                case STRING_sqlite:
                    break;
                case DEFAULT_CASE:
                    throw ZVal.getException(
                            env,
                            new DomainException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Transactional locks are currently not implemented for PDO driver \"%s\".",
                                                    this.driver)
                                            .value()));
            }
            ;
        }

        return ZVal.assign(
                "SELECT "
                        + toStringR(this.dataCol, env)
                        + ", "
                        + toStringR(this.lifetimeCol, env)
                        + ", "
                        + toStringR(this.timeCol, env)
                        + " FROM "
                        + toStringR(this.table, env)
                        + " WHERE "
                        + toStringR(this.idCol, env)
                        + " = :id");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    @ConvertedParameter(index = 1, name = "sessionData")
    @ConvertedParameter(index = 2, name = "maxlifetime")
    private Object getInsertStatement(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer sessionId = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object sessionData = assignParameter(args, 1, false);
        ReferenceContainer maxlifetime =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        ReferenceContainer data = new BasicReferenceContainer(null);
        Object stmt = null;
        Object sql = null;
        SwitchEnumType124 switchVariable124 =
                ZVal.getEnum(
                        this.driver,
                        SwitchEnumType124.DEFAULT_CASE,
                        SwitchEnumType124.STRING_oci,
                        "oci");
        switch (switchVariable124) {
            case STRING_oci:
                data.setObject(function_fopen.f.env(env).call("php://memory", "r+").value());
                function_fwrite.f.env(env).call(data.getObject(), sessionData);
                NamespaceGlobal.rewind.env(env).call(data.getObject());
                sql =
                        ZVal.assign(
                                "INSERT INTO "
                                        + toStringR(this.table, env)
                                        + " ("
                                        + toStringR(this.idCol, env)
                                        + ", "
                                        + toStringR(this.dataCol, env)
                                        + ", "
                                        + toStringR(this.lifetimeCol, env)
                                        + ", "
                                        + toStringR(this.timeCol, env)
                                        + ") VALUES (:id, EMPTY_BLOB(), :lifetime, :time) RETURNING "
                                        + toStringR(this.dataCol, env)
                                        + " into :data");
                break;
            case DEFAULT_CASE:
                data.setObject(ZVal.assign(sessionData));
                sql =
                        ZVal.assign(
                                "INSERT INTO "
                                        + toStringR(this.table, env)
                                        + " ("
                                        + toStringR(this.idCol, env)
                                        + ", "
                                        + toStringR(this.dataCol, env)
                                        + ", "
                                        + toStringR(this.lifetimeCol, env)
                                        + ", "
                                        + toStringR(this.timeCol, env)
                                        + ") VALUES (:id, :data, :lifetime, :time)");
                break;
        }
        ;
        stmt = env.callMethod(this.pdo, "prepare", PdoSessionHandler.class, sql);
        env.callMethod(
                stmt,
                new RuntimeArgsWithReferences().add(1, sessionId),
                "bindParam",
                PdoSessionHandler.class,
                ":id",
                sessionId.getObject(),
                2);
        env.callMethod(
                stmt,
                new RuntimeArgsWithReferences().add(1, data),
                "bindParam",
                PdoSessionHandler.class,
                ":data",
                data.getObject(),
                3);
        env.callMethod(
                stmt,
                new RuntimeArgsWithReferences().add(1, maxlifetime),
                "bindParam",
                PdoSessionHandler.class,
                ":lifetime",
                maxlifetime.getObject(),
                1);
        env.callMethod(
                stmt,
                "bindValue",
                PdoSessionHandler.class,
                ":time",
                NamespaceGlobal.time.env(env).call().value(),
                1);
        return ZVal.assign(stmt);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId")
    @ConvertedParameter(index = 1, name = "sessionData")
    @ConvertedParameter(index = 2, name = "maxlifetime")
    private Object getUpdateStatement(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer sessionId = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object sessionData = assignParameter(args, 1, false);
        ReferenceContainer maxlifetime =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        ReferenceContainer data = new BasicReferenceContainer(null);
        Object stmt = null;
        Object sql = null;
        SwitchEnumType125 switchVariable125 =
                ZVal.getEnum(
                        this.driver,
                        SwitchEnumType125.DEFAULT_CASE,
                        SwitchEnumType125.STRING_oci,
                        "oci");
        switch (switchVariable125) {
            case STRING_oci:
                data.setObject(function_fopen.f.env(env).call("php://memory", "r+").value());
                function_fwrite.f.env(env).call(data.getObject(), sessionData);
                NamespaceGlobal.rewind.env(env).call(data.getObject());
                sql =
                        ZVal.assign(
                                "UPDATE "
                                        + toStringR(this.table, env)
                                        + " SET "
                                        + toStringR(this.dataCol, env)
                                        + " = EMPTY_BLOB(), "
                                        + toStringR(this.lifetimeCol, env)
                                        + " = :lifetime, "
                                        + toStringR(this.timeCol, env)
                                        + " = :time WHERE "
                                        + toStringR(this.idCol, env)
                                        + " = :id RETURNING "
                                        + toStringR(this.dataCol, env)
                                        + " into :data");
                break;
            case DEFAULT_CASE:
                data.setObject(ZVal.assign(sessionData));
                sql =
                        ZVal.assign(
                                "UPDATE "
                                        + toStringR(this.table, env)
                                        + " SET "
                                        + toStringR(this.dataCol, env)
                                        + " = :data, "
                                        + toStringR(this.lifetimeCol, env)
                                        + " = :lifetime, "
                                        + toStringR(this.timeCol, env)
                                        + " = :time WHERE "
                                        + toStringR(this.idCol, env)
                                        + " = :id");
                break;
        }
        ;
        stmt = env.callMethod(this.pdo, "prepare", PdoSessionHandler.class, sql);
        env.callMethod(
                stmt,
                new RuntimeArgsWithReferences().add(1, sessionId),
                "bindParam",
                PdoSessionHandler.class,
                ":id",
                sessionId.getObject(),
                2);
        env.callMethod(
                stmt,
                new RuntimeArgsWithReferences().add(1, data),
                "bindParam",
                PdoSessionHandler.class,
                ":data",
                data.getObject(),
                3);
        env.callMethod(
                stmt,
                new RuntimeArgsWithReferences().add(1, maxlifetime),
                "bindParam",
                PdoSessionHandler.class,
                ":lifetime",
                maxlifetime.getObject(),
                1);
        env.callMethod(
                stmt,
                "bindValue",
                PdoSessionHandler.class,
                ":time",
                NamespaceGlobal.time.env(env).call().value(),
                1);
        return ZVal.assign(stmt);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sessionId", typeHint = "string")
    @ConvertedParameter(index = 1, name = "data", typeHint = "string")
    @ConvertedParameter(index = 2, name = "maxlifetime", typeHint = "int")
    private Object getMergeStatement(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer sessionId = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer data = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer maxlifetime =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        Object mergeStmt = null;
        Object mergeSql = null;
        SwitchEnumType126 switchVariable126 =
                ZVal.getEnum(
                        true,
                        SwitchEnumType126.DEFAULT_CASE,
                        SwitchEnumType126.MINUS_STRING_mysql,
                        ZVal.strictEqualityCheck("mysql", "===", this.driver),
                        SwitchEnumType126.MINUS_MINUS_STRING_sqlsrv,
                        ZVal.toBool(ZVal.strictEqualityCheck("sqlsrv", "===", this.driver))
                                && ZVal.toBool(
                                        NamespaceGlobal.version_compare
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                this.pdo,
                                                                "getAttribute",
                                                                PdoSessionHandler.class,
                                                                4),
                                                        "10",
                                                        ">=")
                                                .value()),
                        SwitchEnumType126.MINUS_STRING_sqlite,
                        ZVal.strictEqualityCheck("sqlite", "===", this.driver),
                        SwitchEnumType126.MINUS_MINUS_STRING_pgsql,
                        ZVal.toBool(ZVal.strictEqualityCheck("pgsql", "===", this.driver))
                                && ZVal.toBool(
                                        NamespaceGlobal.version_compare
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                this.pdo,
                                                                "getAttribute",
                                                                PdoSessionHandler.class,
                                                                4),
                                                        "9.5",
                                                        ">=")
                                                .value()));
        switch (switchVariable126) {
            case MINUS_STRING_mysql:
                mergeSql =
                        toStringR(
                                        "INSERT INTO "
                                                + toStringR(this.table, env)
                                                + " ("
                                                + toStringR(this.idCol, env)
                                                + ", "
                                                + toStringR(this.dataCol, env)
                                                + ", "
                                                + toStringR(this.lifetimeCol, env)
                                                + ", "
                                                + toStringR(this.timeCol, env)
                                                + ") VALUES (:id, :data, :lifetime, :time) ",
                                        env)
                                + toStringR(
                                        "ON DUPLICATE KEY UPDATE "
                                                + toStringR(this.dataCol, env)
                                                + " = VALUES("
                                                + toStringR(this.dataCol, env)
                                                + "), "
                                                + toStringR(this.lifetimeCol, env)
                                                + " = VALUES("
                                                + toStringR(this.lifetimeCol, env)
                                                + "), "
                                                + toStringR(this.timeCol, env)
                                                + " = VALUES("
                                                + toStringR(this.timeCol, env)
                                                + ")",
                                        env);
                break;
            case MINUS_MINUS_STRING_sqlsrv:
                mergeSql =
                        toStringR(
                                        "MERGE INTO "
                                                + toStringR(this.table, env)
                                                + " WITH (HOLDLOCK) USING (SELECT 1 AS dummy) AS src ON ("
                                                + toStringR(this.idCol, env)
                                                + " = ?) ",
                                        env)
                                + toStringR(
                                        "WHEN NOT MATCHED THEN INSERT ("
                                                + toStringR(this.idCol, env)
                                                + ", "
                                                + toStringR(this.dataCol, env)
                                                + ", "
                                                + toStringR(this.lifetimeCol, env)
                                                + ", "
                                                + toStringR(this.timeCol, env)
                                                + ") VALUES (?, ?, ?, ?) ",
                                        env)
                                + toStringR(
                                        "WHEN MATCHED THEN UPDATE SET "
                                                + toStringR(this.dataCol, env)
                                                + " = ?, "
                                                + toStringR(this.lifetimeCol, env)
                                                + " = ?, "
                                                + toStringR(this.timeCol, env)
                                                + " = ?;",
                                        env);
                break;
            case MINUS_STRING_sqlite:
                mergeSql =
                        ZVal.assign(
                                "INSERT OR REPLACE INTO "
                                        + toStringR(this.table, env)
                                        + " ("
                                        + toStringR(this.idCol, env)
                                        + ", "
                                        + toStringR(this.dataCol, env)
                                        + ", "
                                        + toStringR(this.lifetimeCol, env)
                                        + ", "
                                        + toStringR(this.timeCol, env)
                                        + ") VALUES (:id, :data, :lifetime, :time)");
                break;
            case MINUS_MINUS_STRING_pgsql:
                mergeSql =
                        toStringR(
                                        "INSERT INTO "
                                                + toStringR(this.table, env)
                                                + " ("
                                                + toStringR(this.idCol, env)
                                                + ", "
                                                + toStringR(this.dataCol, env)
                                                + ", "
                                                + toStringR(this.lifetimeCol, env)
                                                + ", "
                                                + toStringR(this.timeCol, env)
                                                + ") VALUES (:id, :data, :lifetime, :time) ",
                                        env)
                                + toStringR(
                                        "ON CONFLICT ("
                                                + toStringR(this.idCol, env)
                                                + ") DO UPDATE SET ("
                                                + toStringR(this.dataCol, env)
                                                + ", "
                                                + toStringR(this.lifetimeCol, env)
                                                + ", "
                                                + toStringR(this.timeCol, env)
                                                + ") = (EXCLUDED."
                                                + toStringR(this.dataCol, env)
                                                + ", EXCLUDED."
                                                + toStringR(this.lifetimeCol, env)
                                                + ", EXCLUDED."
                                                + toStringR(this.timeCol, env)
                                                + ")",
                                        env);
                break;
            case DEFAULT_CASE:
                return ZVal.assign(ZVal.getNull());
        }
        ;
        mergeStmt = env.callMethod(this.pdo, "prepare", PdoSessionHandler.class, mergeSql);
        if (ZVal.strictEqualityCheck("sqlsrv", "===", this.driver)) {
            env.callMethod(
                    mergeStmt,
                    new RuntimeArgsWithReferences().add(1, sessionId),
                    "bindParam",
                    PdoSessionHandler.class,
                    1,
                    sessionId.getObject(),
                    2);
            env.callMethod(
                    mergeStmt,
                    new RuntimeArgsWithReferences().add(1, sessionId),
                    "bindParam",
                    PdoSessionHandler.class,
                    2,
                    sessionId.getObject(),
                    2);
            env.callMethod(
                    mergeStmt,
                    new RuntimeArgsWithReferences().add(1, data),
                    "bindParam",
                    PdoSessionHandler.class,
                    3,
                    data.getObject(),
                    3);
            env.callMethod(
                    mergeStmt,
                    new RuntimeArgsWithReferences().add(1, maxlifetime),
                    "bindParam",
                    PdoSessionHandler.class,
                    4,
                    maxlifetime.getObject(),
                    1);
            env.callMethod(
                    mergeStmt,
                    "bindValue",
                    PdoSessionHandler.class,
                    5,
                    NamespaceGlobal.time.env(env).call().value(),
                    1);
            env.callMethod(
                    mergeStmt,
                    new RuntimeArgsWithReferences().add(1, data),
                    "bindParam",
                    PdoSessionHandler.class,
                    6,
                    data.getObject(),
                    3);
            env.callMethod(
                    mergeStmt,
                    new RuntimeArgsWithReferences().add(1, maxlifetime),
                    "bindParam",
                    PdoSessionHandler.class,
                    7,
                    maxlifetime.getObject(),
                    1);
            env.callMethod(
                    mergeStmt,
                    "bindValue",
                    PdoSessionHandler.class,
                    8,
                    NamespaceGlobal.time.env(env).call().value(),
                    1);

        } else {
            env.callMethod(
                    mergeStmt,
                    new RuntimeArgsWithReferences().add(1, sessionId),
                    "bindParam",
                    PdoSessionHandler.class,
                    ":id",
                    sessionId.getObject(),
                    2);
            env.callMethod(
                    mergeStmt,
                    new RuntimeArgsWithReferences().add(1, data),
                    "bindParam",
                    PdoSessionHandler.class,
                    ":data",
                    data.getObject(),
                    3);
            env.callMethod(
                    mergeStmt,
                    new RuntimeArgsWithReferences().add(1, maxlifetime),
                    "bindParam",
                    PdoSessionHandler.class,
                    ":lifetime",
                    maxlifetime.getObject(),
                    1);
            env.callMethod(
                    mergeStmt,
                    "bindValue",
                    PdoSessionHandler.class,
                    ":time",
                    NamespaceGlobal.time.env(env).call().value(),
                    1);
        }

        return ZVal.assign(mergeStmt);
    }

    @ConvertedMethod
    protected Object getConnection(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.pdo)) {
            this.connect(
                    env,
                    ZVal.isTrue(ternaryExpressionTemp = this.dsn)
                            ? ternaryExpressionTemp
                            : function_ini_get.f.env(env).call("session.save_path").value());
        }

        return ZVal.assign(this.pdo);
    }

    public static final Object CONST_LOCK_NONE = 0;

    public static final Object CONST_LOCK_ADVISORY = 1;

    public static final Object CONST_LOCK_TRANSACTIONAL = 2;

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Handler\\PdoSessionHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractSessionHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Handler\\PdoSessionHandler")
                    .setLookup(
                            PdoSessionHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "connectionOptions",
                            "dataCol",
                            "driver",
                            "dsn",
                            "gcCalled",
                            "idCol",
                            "igbinaryEmptyData",
                            "inTransaction",
                            "lifetimeCol",
                            "lockMode",
                            "newSessionId",
                            "password",
                            "pdo",
                            "prefetchData",
                            "prefetchId",
                            "sessionExpired",
                            "sessionName",
                            "table",
                            "timeCol",
                            "unlockStatements",
                            "username")
                    .setFilename(
                            "vendor/symfony/http-foundation/Session/Storage/Handler/PdoSessionHandler.php")
                    .addInterface("SessionHandlerInterface")
                    .addInterface("SessionUpdateTimestampHandlerInterface")
                    .addExtendsClass(
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Handler\\AbstractSessionHandler")
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

    private enum SwitchEnumType120 {
        STRING_mysql,
        STRING_sqlite,
        STRING_pgsql,
        STRING_oci,
        STRING_sqlsrv,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType121 {
        STRING_mysql,
        STRING_pgsql,
        STRING_sqlite,
        STRING_sqlsrv,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType122 {
        STRING_mysql,
        STRING_pgsql,
        STRING_sqlite,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType123 {
        STRING_mysql,
        STRING_oci,
        STRING_pgsql,
        STRING_sqlsrv,
        STRING_sqlite,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType124 {
        STRING_oci,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType125 {
        STRING_oci,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType126 {
        MINUS_STRING_mysql,
        MINUS_MINUS_STRING_sqlsrv,
        MINUS_STRING_sqlite,
        MINUS_MINUS_STRING_pgsql,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
