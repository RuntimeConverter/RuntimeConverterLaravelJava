package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Events.classes.TransactionRolledBack;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.arrays.RuntimeIterable;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Events.classes.TransactionBeginning;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.date.function_microtime;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.runtimeconverter.runtime.references.ReadOnlyReferenceContainer;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Events.classes.StatementPrepared;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.namespaces.Processors.classes.Processor;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeClasses.pdo.PDO;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Events.classes.QueryExecuted;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.math.function_round;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.namespaces.Grammars.classes.Grammar;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes.ConnectionInterface;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Events.classes.TransactionCommitted;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes.QueryException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.classes.Expression;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Connection.php

*/

public class Connection extends RuntimeClassBase implements ConnectionInterface {

    public Object pdo = null;

    public Object readPdo = null;

    public Object database = null;

    public Object tablePrefix = "";

    public Object config = ZVal.newArray();

    public Object reconnector = null;

    public Object queryGrammar = null;

    public Object schemaGrammar = null;

    public Object postProcessor = null;

    public Object events = null;

    public Object fetchMode = 5;

    public Object transactions = 0;

    public Object recordsModified = false;

    public Object queryLog = ZVal.newArray();

    public Object loggingQueries = false;

    public Object pretending = false;

    public Object doctrineConnection = null;

    public Connection(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Connection.class) {
            this.__construct(env, args);
        }
    }

    public Connection(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pdo")
    @ConvertedParameter(index = 1, name = "database")
    @ConvertedParameter(index = 2, name = "tablePrefix")
    @ConvertedParameter(
        index = 3,
        name = "config",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object pdo = assignParameter(args, 0, false);
        Object database = assignParameter(args, 1, true);
        if (null == database) {
            database = "";
        }
        Object tablePrefix = assignParameter(args, 2, true);
        if (null == tablePrefix) {
            tablePrefix = "";
        }
        Object config = assignParameter(args, 3, true);
        if (null == config) {
            config = ZVal.newArray();
        }
        this.pdo = pdo;
        this.database = database;
        this.tablePrefix = tablePrefix;
        this.config = config;
        this.useDefaultQueryGrammar(env);
        this.useDefaultPostProcessor(env);
        return null;
    }

    @ConvertedMethod
    public Object useDefaultQueryGrammar(RuntimeEnv env, Object... args) {
        this.queryGrammar = this.getDefaultQueryGrammar(env);
        return null;
    }

    @ConvertedMethod
    protected Object getDefaultQueryGrammar(RuntimeEnv env, Object... args) {
        return ZVal.assign(new Grammar(env));
    }

    @ConvertedMethod
    public Object useDefaultSchemaGrammar(RuntimeEnv env, Object... args) {
        this.schemaGrammar = this.getDefaultSchemaGrammar(env);
        return null;
    }

    @ConvertedMethod
    protected Object getDefaultSchemaGrammar(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    public Object useDefaultPostProcessor(RuntimeEnv env, Object... args) {
        this.postProcessor = this.getDefaultPostProcessor(env);
        return null;
    }

    @ConvertedMethod
    protected Object getDefaultPostProcessor(RuntimeEnv env, Object... args) {
        return ZVal.assign(new Processor(env));
    }

    @ConvertedMethod
    public Object getSchemaBuilder(RuntimeEnv env, Object... args) {
        if (function_is_null.f.env(env).call(this.schemaGrammar).getBool()) {
            this.useDefaultSchemaGrammar(env);
        }

        return ZVal.assign(
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Database
                        .namespaces
                        .Schema
                        .classes
                        .Builder(env, this));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    public Object table(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.query(env), "from", Connection.class, table));
    }

    @ConvertedMethod
    public Object query(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Database
                        .namespaces
                        .Query
                        .classes
                        .Builder(env, this, this.getQueryGrammar(env), this.getPostProcessor(env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "bindings", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "useReadPdo",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object selectOne(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object bindings = assignParameter(args, 1, true);
        if (null == bindings) {
            bindings = ZVal.newArray();
        }
        Object useReadPdo = assignParameter(args, 2, true);
        if (null == useReadPdo) {
            useReadPdo = true;
        }
        Object records = null;
        records = this.select(env, query, bindings, useReadPdo);
        return ZVal.assign(function_array_shift.f.env(env).call(records).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "bindings", defaultValue = "", defaultValueType = "array")
    public Object selectFromWriteConnection(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object bindings = assignParameter(args, 1, true);
        if (null == bindings) {
            bindings = ZVal.newArray();
        }
        return ZVal.assign(this.select(env, query, bindings, false));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "bindings", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "useReadPdo",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object select(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Connection.php");
        Object query = assignParameter(args, 0, false);
        Object bindings = assignParameter(args, 1, true);
        if (null == bindings) {
            bindings = ZVal.newArray();
        }
        Object useReadPdo = assignParameter(args, 2, true);
        if (null == useReadPdo) {
            useReadPdo = true;
        }
        return ZVal.assign(
                this.run(
                        env,
                        query,
                        bindings,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "query")
                            @ConvertedParameter(index = 1, name = "bindings")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object query = assignParameter(args, 0, false);
                                Object bindings = assignParameter(args, 1, false);
                                Object statement = null;
                                Object useReadPdo = null;
                                useReadPdo = this.contextReferences.getCapturedValue("useReadPdo");
                                if (ZVal.isTrue(Connection.this.pretending(env))) {
                                    return ZVal.assign(ZVal.newArray());
                                }

                                statement =
                                        Connection.this.prepared(
                                                env,
                                                env.callMethod(
                                                        Connection.this.getPdoForSelect(
                                                                env, useReadPdo),
                                                        "prepare",
                                                        Connection.class,
                                                        query));
                                Connection.this.bindValues(
                                        env,
                                        statement,
                                        Connection.this.prepareBindings(env, bindings));
                                env.callMethod(statement, "execute", Connection.class);
                                return ZVal.assign(
                                        env.callMethod(statement, "fetchAll", Connection.class));
                            }
                        }.use("useReadPdo", useReadPdo)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "bindings", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "useReadPdo",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object cursor(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Connection.php");
        RuntimeIterable runtimeConverterYieldVariable = new RuntimeIterable(env);
        Object query = assignParameter(args, 0, false);
        Object bindings = assignParameter(args, 1, true);
        if (null == bindings) {
            bindings = ZVal.newArray();
        }
        Object useReadPdo = assignParameter(args, 2, true);
        if (null == useReadPdo) {
            useReadPdo = true;
        }
        Object record = null;
        Object statement = null;
        statement =
                this.run(
                        env,
                        query,
                        bindings,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "query")
                            @ConvertedParameter(index = 1, name = "bindings")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object query = assignParameter(args, 0, false);
                                Object bindings = assignParameter(args, 1, false);
                                Object statement = null;
                                Object useReadPdo = null;
                                useReadPdo = this.contextReferences.getCapturedValue("useReadPdo");
                                if (ZVal.isTrue(Connection.this.pretending(env))) {
                                    return ZVal.assign(ZVal.newArray());
                                }

                                statement =
                                        Connection.this.prepared(
                                                env,
                                                env.callMethod(
                                                        Connection.this.getPdoForSelect(
                                                                env, useReadPdo),
                                                        "prepare",
                                                        Connection.class,
                                                        query));
                                Connection.this.bindValues(
                                        env,
                                        statement,
                                        Connection.this.prepareBindings(env, bindings));
                                env.callMethod(statement, "execute", Connection.class);
                                return ZVal.assign(statement);
                            }
                        }.use("useReadPdo", useReadPdo));
        while (ZVal.isTrue(record = env.callMethod(statement, "fetch", Connection.class))) {
            runtimeConverterYieldVariable.add(record);
        }

        return runtimeConverterYieldVariable;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "statement", typeHint = "PDOStatement")
    protected Object prepared(RuntimeEnv env, Object... args) {
        Object statement = assignParameter(args, 0, false);
        env.callMethod(statement, "setFetchMode", Connection.class, this.fetchMode);
        this.event(env, new StatementPrepared(env, this, statement));
        return ZVal.assign(statement);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "useReadPdo",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    protected Object getPdoForSelect(RuntimeEnv env, Object... args) {
        Object useReadPdo = assignParameter(args, 0, true);
        if (null == useReadPdo) {
            useReadPdo = true;
        }
        return ZVal.assign(ZVal.isTrue(useReadPdo) ? this.getReadPdo(env) : this.getPdo(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "bindings", defaultValue = "", defaultValueType = "array")
    public Object insert(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object bindings = assignParameter(args, 1, true);
        if (null == bindings) {
            bindings = ZVal.newArray();
        }
        return ZVal.assign(this.statement(env, query, bindings));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "bindings", defaultValue = "", defaultValueType = "array")
    public Object update(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object bindings = assignParameter(args, 1, true);
        if (null == bindings) {
            bindings = ZVal.newArray();
        }
        return ZVal.assign(this.affectingStatement(env, query, bindings));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "bindings", defaultValue = "", defaultValueType = "array")
    public Object delete(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object bindings = assignParameter(args, 1, true);
        if (null == bindings) {
            bindings = ZVal.newArray();
        }
        return ZVal.assign(this.affectingStatement(env, query, bindings));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "bindings", defaultValue = "", defaultValueType = "array")
    public Object statement(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Connection.php");
        Object query = assignParameter(args, 0, false);
        Object bindings = assignParameter(args, 1, true);
        if (null == bindings) {
            bindings = ZVal.newArray();
        }
        return ZVal.assign(
                this.run(
                        env,
                        query,
                        bindings,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "query")
                            @ConvertedParameter(index = 1, name = "bindings")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object query = assignParameter(args, 0, false);
                                Object bindings = assignParameter(args, 1, false);
                                Object statement = null;
                                if (ZVal.isTrue(Connection.this.pretending(env))) {
                                    return ZVal.assign(true);
                                }

                                statement =
                                        env.callMethod(
                                                Connection.this.getPdo(env),
                                                "prepare",
                                                Connection.class,
                                                query);
                                Connection.this.bindValues(
                                        env,
                                        statement,
                                        Connection.this.prepareBindings(env, bindings));
                                Connection.this.recordsHaveBeenModified(env);
                                return ZVal.assign(
                                        env.callMethod(statement, "execute", Connection.class));
                            }
                        }));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "bindings", defaultValue = "", defaultValueType = "array")
    public Object affectingStatement(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Connection.php");
        Object query = assignParameter(args, 0, false);
        Object bindings = assignParameter(args, 1, true);
        if (null == bindings) {
            bindings = ZVal.newArray();
        }
        return ZVal.assign(
                this.run(
                        env,
                        query,
                        bindings,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "query")
                            @ConvertedParameter(index = 1, name = "bindings")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object query = assignParameter(args, 0, false);
                                Object bindings = assignParameter(args, 1, false);
                                Object statement = null;
                                Object count = null;
                                if (ZVal.isTrue(Connection.this.pretending(env))) {
                                    return 0;
                                }

                                statement =
                                        env.callMethod(
                                                Connection.this.getPdo(env),
                                                "prepare",
                                                Connection.class,
                                                query);
                                Connection.this.bindValues(
                                        env,
                                        statement,
                                        Connection.this.prepareBindings(env, bindings));
                                env.callMethod(statement, "execute", Connection.class);
                                Connection.this.recordsHaveBeenModified(
                                        env,
                                        ZVal.isGreaterThan(
                                                count =
                                                        env.callMethod(
                                                                statement,
                                                                "rowCount",
                                                                Connection.class),
                                                '>',
                                                0));
                                return ZVal.assign(count);
                            }
                        }));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    public Object unprepared(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Connection.php");
        Object query = assignParameter(args, 0, false);
        return ZVal.assign(
                this.run(
                        env,
                        query,
                        ZVal.newArray(),
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "query")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object query = assignParameter(args, 0, false);
                                Object change = null;
                                if (ZVal.isTrue(Connection.this.pretending(env))) {
                                    return ZVal.assign(true);
                                }

                                Connection.this.recordsHaveBeenModified(
                                        env,
                                        change =
                                                ZVal.strictNotEqualityCheck(
                                                        env.callMethod(
                                                                Connection.this.getPdo(env),
                                                                "exec",
                                                                Connection.class,
                                                                query),
                                                        "!==",
                                                        false));
                                return ZVal.assign(change);
                            }
                        }));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    public Object pretend(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Connection.php");
        Object callback = assignParameter(args, 0, false);
        return ZVal.assign(
                this.withFreshQueryLog(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object callback = null;
                                callback = this.contextReferences.getCapturedValue("callback");
                                Connection.this.pretending = true;
                                env.callFunctionDynamic(
                                        callback,
                                        new RuntimeArgsWithReferences()
                                                .add(0, new ReadOnlyReferenceContainer(this)),
                                        _closureThisVar);
                                Connection.this.pretending = false;
                                return ZVal.assign(Connection.this.queryLog);
                            }
                        }.use("callback", callback)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    protected Object withFreshQueryLog(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object result = null;
        Object loggingQueries = null;
        loggingQueries = ZVal.assign(this.loggingQueries);
        this.enableQueryLog(env);
        this.queryLog = ZVal.newArray();
        result = env.callFunctionDynamic(callback, new RuntimeArgsWithReferences()).value();
        this.loggingQueries = loggingQueries;
        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "statement")
    @ConvertedParameter(index = 1, name = "bindings")
    public Object bindValues(RuntimeEnv env, Object... args) {
        Object statement = assignParameter(args, 0, false);
        Object bindings = assignParameter(args, 1, false);
        Object value = null;
        Object key = null;
        for (ZPair zpairResult249 : ZVal.getIterable(bindings, env, false)) {
            key = ZVal.assign(zpairResult249.getKey());
            value = ZVal.assign(zpairResult249.getValue());
            env.callMethod(
                    statement,
                    "bindValue",
                    Connection.class,
                    function_is_string.f.env(env).call(key).getBool() ? key : ZVal.add(key, 1),
                    value,
                    function_is_int.f.env(env).call(value).getBool() ? 1 : 2);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bindings", typeHint = "array")
    public Object prepareBindings(RuntimeEnv env, Object... args) {
        ReferenceContainer bindings = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object grammar = null;
        Object value = null;
        Object key = null;
        grammar = this.getQueryGrammar(env);
        for (ZPair zpairResult250 : ZVal.getIterable(bindings.getObject(), env, false)) {
            key = ZVal.assign(zpairResult250.getKey());
            value = ZVal.assign(zpairResult250.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(value, DateTimeInterface.class, "DateTimeInterface"))) {
                bindings.arrayAccess(env, key)
                        .set(
                                env.callMethod(
                                        value,
                                        "format",
                                        Connection.class,
                                        env.callMethod(
                                                grammar, "getDateFormat", Connection.class)));

            } else if (function_is_bool.f.env(env).call(value).getBool()) {
                bindings.arrayAccess(env, key).set(ZVal.toLong(value));
            }
        }

        return ZVal.assign(bindings.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "bindings")
    @ConvertedParameter(index = 2, name = "callback", typeHint = "Closure")
    protected Object run(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object bindings = assignParameter(args, 1, false);
        Object callback = assignParameter(args, 2, false);
        Object result = null;
        Object e = null;
        Object start = null;
        this.reconnectIfMissingConnection(env);
        start = function_microtime.f.env(env).call(true).value();
        try {
            result = this.runQueryCallback(env, query, bindings, callback);
        } catch (ConvertedException convertedException19) {
            if (convertedException19.instanceOf(
                    QueryException.class, "Illuminate\\Database\\QueryException")) {
                e = convertedException19.getObject();
                result = this.handleQueryException(env, e, query, bindings, callback);
            } else {
                throw convertedException19;
            }
        }

        this.logQuery(env, query, bindings, this.getElapsedTime(env, start));
        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "bindings")
    @ConvertedParameter(index = 2, name = "callback", typeHint = "Closure")
    protected Object runQueryCallback(RuntimeEnv env, Object... args) {
        ReferenceContainer query = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer bindings = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object callback = assignParameter(args, 2, false);
        Object result = null;
        Object e = null;
        try {
            result =
                    env.callFunctionDynamic(
                                    callback,
                                    new RuntimeArgsWithReferences().add(0, query).add(1, bindings),
                                    query.getObject(),
                                    bindings.getObject())
                            .value();
        } catch (ConvertedException convertedException20) {
            if (convertedException20.instanceOf(PHPException.class, "Exception")) {
                e = convertedException20.getObject();
                throw ZVal.getException(
                        env,
                        new QueryException(
                                env,
                                query.getObject(),
                                this.prepareBindings(env, bindings.getObject()),
                                e));
            } else {
                throw convertedException20;
            }
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "bindings")
    @ConvertedParameter(
        index = 2,
        name = "time",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object logQuery(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope87 scope = new Scope87();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Connection.php");
            scope.query = assignParameter(args, 0, false);
            scope.bindings = assignParameter(args, 1, false);
            scope.time = assignParameter(args, 2, true);
            if (null == scope.time) {
                scope.time = ZVal.getNull();
            }
            this.event(
                    env,
                    new QueryExecuted(
                            env, scope.query, scope.bindings, scope.time, scope._thisVarAlias));
            if (ZVal.isTrue(this.loggingQueries)) {
                new ReferenceClassProperty(scope._thisVarAlias, "queryLog", env)
                        .arrayAppend(env)
                        .set(
                                function_compact
                                        .f
                                        .env(env)
                                        .call(stack, "query", "bindings", "time")
                                        .value());
            }

            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "start")
    protected Object getElapsedTime(RuntimeEnv env, Object... args) {
        Object start = assignParameter(args, 0, false);
        return ZVal.assign(
                function_round
                        .f
                        .env(env)
                        .call(
                                ZVal.multiply(
                                        ZVal.subtract(
                                                function_microtime.f.env(env).call(true).value(),
                                                start),
                                        1000),
                                2)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e")
    @ConvertedParameter(index = 1, name = "query")
    @ConvertedParameter(index = 2, name = "bindings")
    @ConvertedParameter(index = 3, name = "callback", typeHint = "Closure")
    protected Object handleQueryException(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object query = assignParameter(args, 1, false);
        Object bindings = assignParameter(args, 2, false);
        Object callback = assignParameter(args, 3, false);
        if (ZVal.isGreaterThanOrEqualTo(this.transactions, ">=", 1)) {
            throw ZVal.getException(env, e);
        }

        return ZVal.assign(
                this.tryAgainIfCausedByLostConnection(env, e, query, bindings, callback));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Illuminate\\Database\\QueryException")
    @ConvertedParameter(index = 1, name = "query")
    @ConvertedParameter(index = 2, name = "bindings")
    @ConvertedParameter(index = 3, name = "callback", typeHint = "Closure")
    protected Object tryAgainIfCausedByLostConnection(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object query = assignParameter(args, 1, false);
        Object bindings = assignParameter(args, 2, false);
        Object callback = assignParameter(args, 3, false);
        if (ZVal.isTrue(
                this.causedByLostConnection(
                        env, env.callMethod(e, "getPrevious", Connection.class)))) {
            this.reconnect(env);
            return ZVal.assign(this.runQueryCallback(env, query, bindings, callback));
        }

        throw ZVal.getException(env, e);
    }

    @ConvertedMethod
    public Object reconnect(RuntimeEnv env, Object... args) {
        if (function_is_callable.f.env(env).call(this.reconnector).getBool()) {
            return ZVal.assign(
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(this.reconnector, this)
                            .value());
        }

        throw ZVal.getException(
                env, new LogicException(env, "Lost connection and no reconnector available."));
    }

    @ConvertedMethod
    protected Object reconnectIfMissingConnection(RuntimeEnv env, Object... args) {
        if (function_is_null.f.env(env).call(this.pdo).getBool()) {
            this.reconnect(env);
        }

        return null;
    }

    @ConvertedMethod
    public Object disconnect(RuntimeEnv env, Object... args) {
        env.callMethod(
                this.setPdo(env, ZVal.getNull()), "setReadPdo", Connection.class, ZVal.getNull());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    public Object listen(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        if (ZVal.isset(this.events)) {
            env.callMethod(
                    this.events, "listen", Connection.class, QueryExecuted.CONST_class, callback);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    protected Object fireConnectionEvent(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        if (!ZVal.isset(this.events)) {
            return null;
        }

        switch (toStringR(event)) {
            case "beganTransaction":
                return ZVal.assign(
                        env.callMethod(
                                this.events,
                                "dispatch",
                                Connection.class,
                                new TransactionBeginning(env, this)));
            case "committed":
                return ZVal.assign(
                        env.callMethod(
                                this.events,
                                "dispatch",
                                Connection.class,
                                new TransactionCommitted(env, this)));
            case "rollingBack":
                return ZVal.assign(
                        env.callMethod(
                                this.events,
                                "dispatch",
                                Connection.class,
                                new TransactionRolledBack(env, this)));
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    protected Object event(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        if (ZVal.isset(this.events)) {
            env.callMethod(this.events, "dispatch", Connection.class, event);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object raw(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(new Expression(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "value",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object recordsHaveBeenModified(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = true;
        }
        if (!ZVal.isTrue(this.recordsModified)) {
            this.recordsModified = value;
        }

        return null;
    }

    @ConvertedMethod
    public Object isDoctrineAvailable(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_class_exists.f.env(env).call("Doctrine\\DBAL\\Connection").value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    @ConvertedParameter(index = 1, name = "column")
    public Object getDoctrineColumn(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object column = assignParameter(args, 1, false);
        Object schema = null;
        schema = this.getDoctrineSchemaManager(env);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(schema, "listTableDetails", Connection.class, table),
                        "getColumn",
                        Connection.class,
                        column));
    }

    @ConvertedMethod
    public Object getDoctrineSchemaManager(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this, "getDoctrineDriver", Connection.class),
                        "getSchemaManager",
                        Connection.class,
                        this.getDoctrineConnection(env)));
    }

    @ConvertedMethod
    public Object getDoctrineConnection(RuntimeEnv env, Object... args) {
        Object driver = null;
        if (function_is_null.f.env(env).call(this.doctrineConnection).getBool()) {
            driver = env.callMethod(this, "getDoctrineDriver", Connection.class);
            this.doctrineConnection =
                    env.createNew(
                            ZVal.resolveClassAlias(env, "DoctrineConnection"),
                            ZVal.newArray(
                                    new ZPair("pdo", this.getPdo(env)),
                                    new ZPair("dbname", this.getConfig(env, "database")),
                                    new ZPair(
                                            "driver",
                                            env.callMethod(driver, "getName", Connection.class))),
                            driver);
        }

        return ZVal.assign(this.doctrineConnection);
    }

    @ConvertedMethod
    public Object getPdo(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(ZVal.checkInstanceType(this.pdo, Closure.class, "Closure"))) {
            return ZVal.assign(
                    this.pdo =
                            function_call_user_func
                                    .f
                                    .env(env)
                                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                    .call(this.pdo)
                                    .value());
        }

        return ZVal.assign(this.pdo);
    }

    @ConvertedMethod
    public Object getReadPdo(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        if (ZVal.isGreaterThan(this.transactions, '>', 0)) {
            return ZVal.assign(this.getPdo(env));
        }

        if (ZVal.toBool(this.recordsModified) && ZVal.toBool(this.getConfig(env, "sticky"))) {
            return ZVal.assign(this.getPdo(env));
        }

        if (ZVal.isTrue(ZVal.checkInstanceType(this.readPdo, Closure.class, "Closure"))) {
            return ZVal.assign(
                    this.readPdo =
                            function_call_user_func
                                    .f
                                    .env(env)
                                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                    .call(this.readPdo)
                                    .value());
        }

        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = this.readPdo)
                        ? ternaryExpressionTemp
                        : this.getPdo(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pdo")
    public Object setPdo(RuntimeEnv env, Object... args) {
        Object pdo = assignParameter(args, 0, false);
        this.transactions = 0;
        this.pdo = pdo;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pdo")
    public Object setReadPdo(RuntimeEnv env, Object... args) {
        Object pdo = assignParameter(args, 0, false);
        this.readPdo = pdo;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reconnector", typeHint = "callable")
    public Object setReconnector(RuntimeEnv env, Object... args) {
        Object reconnector = assignParameter(args, 0, false);
        this.reconnector = reconnector;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getConfig(env, "name"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "option",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getConfig(RuntimeEnv env, Object... args) {
        Object option = assignParameter(args, 0, true);
        if (null == option) {
            option = ZVal.getNull();
        }
        return ZVal.assign(Arr.runtimeStaticObject.get(env, this.config, option));
    }

    @ConvertedMethod
    public Object getDriverName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getConfig(env, "driver"));
    }

    @ConvertedMethod
    public Object getQueryGrammar(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.queryGrammar);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "grammar",
        typeHint = "Illuminate\\Database\\Query\\Grammars\\Grammar"
    )
    public Object setQueryGrammar(RuntimeEnv env, Object... args) {
        Object grammar = assignParameter(args, 0, false);
        this.queryGrammar = grammar;
        return null;
    }

    @ConvertedMethod
    public Object getSchemaGrammar(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.schemaGrammar);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "grammar",
        typeHint = "Illuminate\\Database\\Schema\\Grammars\\Grammar"
    )
    public Object setSchemaGrammar(RuntimeEnv env, Object... args) {
        Object grammar = assignParameter(args, 0, false);
        this.schemaGrammar = grammar;
        return null;
    }

    @ConvertedMethod
    public Object getPostProcessor(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.postProcessor);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "processor",
        typeHint = "Illuminate\\Database\\Query\\Processors\\Processor"
    )
    public Object setPostProcessor(RuntimeEnv env, Object... args) {
        Object processor = assignParameter(args, 0, false);
        this.postProcessor = processor;
        return null;
    }

    @ConvertedMethod
    public Object getEventDispatcher(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.events);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "events",
        typeHint = "Illuminate\\Contracts\\Events\\Dispatcher"
    )
    public Object setEventDispatcher(RuntimeEnv env, Object... args) {
        Object events = assignParameter(args, 0, false);
        this.events = events;
        return null;
    }

    @ConvertedMethod
    public Object unsetEventDispatcher(RuntimeEnv env, Object... args) {
        this.events = ZVal.getNull();
        return null;
    }

    @ConvertedMethod
    public Object pretending(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictEqualityCheck(this.pretending, "===", true));
    }

    @ConvertedMethod
    public Object getQueryLog(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.queryLog);
    }

    @ConvertedMethod
    public Object flushQueryLog(RuntimeEnv env, Object... args) {
        this.queryLog = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    public Object enableQueryLog(RuntimeEnv env, Object... args) {
        this.loggingQueries = true;
        return null;
    }

    @ConvertedMethod
    public Object disableQueryLog(RuntimeEnv env, Object... args) {
        this.loggingQueries = false;
        return null;
    }

    @ConvertedMethod
    public Object logging(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.loggingQueries);
    }

    @ConvertedMethod
    public Object getDatabaseName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.database);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "database")
    public Object setDatabaseName(RuntimeEnv env, Object... args) {
        Object database = assignParameter(args, 0, false);
        this.database = database;
        return null;
    }

    @ConvertedMethod
    public Object getTablePrefix(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.tablePrefix);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    public Object setTablePrefix(RuntimeEnv env, Object... args) {
        Object prefix = assignParameter(args, 0, false);
        this.tablePrefix = prefix;
        env.callMethod(this.getQueryGrammar(env), "setTablePrefix", Connection.class, prefix);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "grammar", typeHint = "Illuminate\\Database\\Grammar")
    public Object withTablePrefix(RuntimeEnv env, Object... args) {
        Object grammar = assignParameter(args, 0, false);
        env.callMethod(grammar, "setTablePrefix", Connection.class, this.tablePrefix);
        return ZVal.assign(grammar);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    protected Object causedByDeadlock(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object message = null;
        message = env.callMethod(e, "getMessage", Connection.class);
        return ZVal.assign(
                Str.runtimeStaticObject.contains(
                        env,
                        message,
                        ZVal.arrayFromList(
                                "Deadlock found when trying to get lock",
                                "deadlock detected",
                                "The database file is locked",
                                "database is locked",
                                "database table is locked",
                                "A table in the database is locked",
                                "has been chosen as the deadlock victim",
                                "Lock wait timeout exceeded; try restarting transaction",
                                "WSREP detected deadlock/conflict and aborted the transaction. Try restarting the transaction")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Throwable")
    protected Object causedByLostConnection(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object message = null;
        message = env.callMethod(e, "getMessage", Connection.class);
        return ZVal.assign(
                Str.runtimeStaticObject.contains(
                        env,
                        message,
                        ZVal.arrayFromList(
                                "server has gone away",
                                "no connection to the server",
                                "Lost connection",
                                "is dead or not enabled",
                                "Error while sending",
                                "decryption failed or bad record mac",
                                "server closed the connection unexpectedly",
                                "SSL connection has been closed unexpectedly",
                                "Error writing data to the connection",
                                "Resource deadlock avoided",
                                "Transaction() on null",
                                "child connection forced to terminate due to client_idle_limit",
                                "query_wait_timeout",
                                "reset by peer",
                                "Physical connection is not usable",
                                "TCP Provider: Error code 0x68")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    @ConvertedParameter(
        index = 1,
        name = "attempts",
        defaultValue = "1",
        defaultValueType = "number"
    )
    public Object transaction(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Concerns/ManagesTransactions.php");
        Object callback = assignParameter(args, 0, false);
        Object attempts = assignParameter(args, 1, true);
        if (null == attempts) {
            attempts = 1;
        }
        Object e = null;
        ReferenceContainer currentAttempt = new BasicReferenceContainer(null);
        for (currentAttempt.setObject(1);
                ZVal.isLessThanOrEqualTo(currentAttempt.getObject(), "<=", attempts);
                currentAttempt.setObject(ZVal.increment(currentAttempt.getObject()))) {
            this.beginTransaction(env);
            try {
                return ZVal.assign(
                        tap.f
                                .env(env)
                                .call(
                                        env.callFunctionDynamic(
                                                        callback,
                                                        new RuntimeArgsWithReferences()
                                                                .add(
                                                                        0,
                                                                        new ReadOnlyReferenceContainer(
                                                                                this)),
                                                        this)
                                                .value(),
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Database\\Concerns",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "result")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object _closureThisVar = this.getClosureThisVar();
                                                Object result = assignParameter(args, 0, false);
                                                Connection.this.commit(env);
                                                return null;
                                            }
                                        })
                                .value());
            } catch (ConvertedException convertedException21) {
                if (convertedException21.instanceOf(PHPException.class, "Exception")) {
                    e = convertedException21.getObject();
                    this.handleTransactionException(env, e, currentAttempt.getObject(), attempts);
                } else if (convertedException21.instanceOf(Throwable.class, "Throwable")) {
                    e = convertedException21.getObject();
                    this.rollBack(env);
                    throw ZVal.getException(env, e);
                } else {
                    throw convertedException21;
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e")
    @ConvertedParameter(index = 1, name = "currentAttempt")
    @ConvertedParameter(index = 2, name = "maxAttempts")
    protected Object handleTransactionException(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object currentAttempt = assignParameter(args, 1, false);
        Object maxAttempts = assignParameter(args, 2, false);
        if (ZVal.toBool(this.causedByDeadlock(env, e))
                && ZVal.toBool(ZVal.isGreaterThan(this.transactions, '>', 1))) {
            this.transactions = ZVal.decrement(this.transactions);
            throw ZVal.getException(env, e);
        }

        this.rollBack(env);
        if (ZVal.toBool(this.causedByDeadlock(env, e))
                && ZVal.toBool(ZVal.isLessThan(currentAttempt, '<', maxAttempts))) {
            return null;
        }

        throw ZVal.getException(env, e);
    }

    @ConvertedMethod
    public Object beginTransaction(RuntimeEnv env, Object... args) {
        this.createTransaction(env);
        this.transactions = ZVal.increment(this.transactions);
        this.fireConnectionEvent(env, "beganTransaction");
        return null;
    }

    @ConvertedMethod
    protected Object createTransaction(RuntimeEnv env, Object... args) {
        Object e = null;
        if (ZVal.equalityCheck(this.transactions, 0)) {
            try {
                env.callMethod(this.getPdo(env), "beginTransaction", Connection.class);
            } catch (ConvertedException convertedException22) {
                if (convertedException22.instanceOf(PHPException.class, "Exception")) {
                    e = convertedException22.getObject();
                    this.handleBeginTransactionException(env, e);
                } else {
                    throw convertedException22;
                }
            }

        } else if (ZVal.toBool(ZVal.isGreaterThanOrEqualTo(this.transactions, ">=", 1))
                && ZVal.toBool(
                        env.callMethod(
                                this.queryGrammar, "supportsSavepoints", Connection.class))) {
            this.createSavepoint(env);
        }

        return null;
    }

    @ConvertedMethod
    protected Object createSavepoint(RuntimeEnv env, Object... args) {
        env.callMethod(
                this.getPdo(env),
                "exec",
                Connection.class,
                env.callMethod(
                        this.queryGrammar,
                        "compileSavepoint",
                        Connection.class,
                        "trans" + toStringR(ZVal.add(this.transactions, 1), env)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e")
    protected Object handleBeginTransactionException(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.causedByLostConnection(env, e))) {
            this.reconnect(env);
            env.callMethod(this.pdo, "beginTransaction", Connection.class);

        } else {
            throw ZVal.getException(env, e);
        }

        return null;
    }

    @ConvertedMethod
    public Object commit(RuntimeEnv env, Object... args) {
        if (ZVal.equalityCheck(this.transactions, 1)) {
            env.callMethod(this.getPdo(env), "commit", Connection.class);
        }

        this.transactions =
                NamespaceGlobal.max.env(env).call(0, ZVal.subtract(this.transactions, 1)).value();
        this.fireConnectionEvent(env, "committed");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "toLevel",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object rollBack(RuntimeEnv env, Object... args) {
        Object toLevel = assignParameter(args, 0, true);
        if (null == toLevel) {
            toLevel = ZVal.getNull();
        }
        toLevel =
                ZVal.assign(
                        function_is_null.f.env(env).call(toLevel).getBool()
                                ? ZVal.subtract(this.transactions, 1)
                                : toLevel);
        if (ZVal.toBool(ZVal.isLessThan(toLevel, '<', 0))
                || ZVal.toBool(ZVal.isGreaterThanOrEqualTo(toLevel, ">=", this.transactions))) {
            return null;
        }

        this.performRollBack(env, toLevel);
        this.transactions = toLevel;
        this.fireConnectionEvent(env, "rollingBack");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "toLevel")
    protected Object performRollBack(RuntimeEnv env, Object... args) {
        Object toLevel = assignParameter(args, 0, false);
        if (ZVal.equalityCheck(toLevel, 0)) {
            env.callMethod(this.getPdo(env), "rollBack", Connection.class);

        } else if (ZVal.isTrue(
                env.callMethod(this.queryGrammar, "supportsSavepoints", Connection.class))) {
            env.callMethod(
                    this.getPdo(env),
                    "exec",
                    Connection.class,
                    env.callMethod(
                            this.queryGrammar,
                            "compileSavepointRollBack",
                            Connection.class,
                            "trans" + toStringR(ZVal.add(toLevel, 1), env)));
        }

        return null;
    }

    @ConvertedMethod
    public Object transactionLevel(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.transactions);
    }

    public static final Object CONST_class = "Illuminate\\Database\\Connection";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "driver")
        @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
        public Object resolverFor(RuntimeEnv env, Object... args) {
            Object driver = assignParameter(args, 0, false);
            Object callback = assignParameter(args, 1, false);
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Database
                                    .classes
                                    .Connection
                                    .RequestStaticProperties
                                    .class,
                            "resolvers")
                    .arrayAccess(env, driver)
                    .set(callback);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "driver")
        public Object getResolver(RuntimeEnv env, Object... args) {
            Object driver = assignParameter(args, 0, false);
            Object ternaryExpressionTemp = null;
            return ZVal.assign(
                    ZVal.isDefined(
                                    ternaryExpressionTemp =
                                            env.getRequestStaticPropertiesReference(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Illuminate
                                                                    .namespaces
                                                                    .Database
                                                                    .classes
                                                                    .Connection
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "resolvers")
                                                    .arrayGet(env, driver))
                            ? ternaryExpressionTemp
                            : ZVal.getNull());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object resolvers = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Connection")
                    .setLookup(
                            Connection.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "config",
                            "database",
                            "doctrineConnection",
                            "events",
                            "fetchMode",
                            "loggingQueries",
                            "pdo",
                            "postProcessor",
                            "pretending",
                            "queryGrammar",
                            "queryLog",
                            "readPdo",
                            "reconnector",
                            "recordsModified",
                            "schemaGrammar",
                            "tablePrefix",
                            "transactions")
                    .setStaticPropertyNames("resolvers")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Database/Connection.php")
                    .addInterface("Illuminate\\Database\\ConnectionInterface")
                    .addTrait("Illuminate\\Database\\DetectsDeadlocks")
                    .addTrait("Illuminate\\Database\\DetectsLostConnections")
                    .addTrait("Illuminate\\Database\\Concerns\\ManagesTransactions")
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

    private static class Scope87 implements UpdateRuntimeScopeInterface {

        Object query;
        Object bindings;
        Object _thisVarAlias;
        Object time;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("query", this.query);
            stack.setVariable("bindings", this.bindings);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("time", this.time);
        }

        public void updateScope(RuntimeStack stack) {

            this.query = stack.getVariable("query");
            this.bindings = stack.getVariable("bindings");
            this._thisVarAlias = stack.getVariable("this");
            this.time = stack.getVariable("time");
        }
    }
}
