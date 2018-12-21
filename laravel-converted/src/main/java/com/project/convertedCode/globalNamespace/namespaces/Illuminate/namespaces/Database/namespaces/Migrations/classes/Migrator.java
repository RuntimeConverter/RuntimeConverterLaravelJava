package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Migrations.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Collection;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Migrations/Migrator.php

*/

public class Migrator extends RuntimeClassBase {

    public Object repository = null;

    public Object files = null;

    public Object resolver = null;

    public Object connection = null;

    public Object notes = ZVal.newArray();

    public Object paths = ZVal.newArray();

    public Migrator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Migrator.class) {
            this.__construct(env, args);
        }
    }

    public Migrator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "repository",
        typeHint = "Illuminate\\Database\\Migrations\\MigrationRepositoryInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "resolver",
        typeHint = "Illuminate\\Database\\ConnectionResolverInterface"
    )
    @ConvertedParameter(index = 2, name = "files", typeHint = "Illuminate\\Filesystem\\Filesystem")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object repository = assignParameter(args, 0, false);
        Object resolver = assignParameter(args, 1, false);
        Object files = assignParameter(args, 2, false);
        this.files = files;
        this.resolver = resolver;
        this.repository = repository;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "paths", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object run(RuntimeEnv env, Object... args) {
        Object paths = assignParameter(args, 0, true);
        if (null == paths) {
            paths = ZVal.newArray();
        }
        Object options = assignParameter(args, 1, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object migrations = null;
        Object files = null;
        this.notes = ZVal.newArray();
        files = this.getMigrationFiles(env, paths);
        this.requireFiles(
                env,
                migrations =
                        this.pendingMigrations(
                                env,
                                files,
                                env.callMethod(this.repository, "getRan", Migrator.class)));
        this.runPending(env, migrations, options);
        return ZVal.assign(migrations);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files")
    @ConvertedParameter(index = 1, name = "ran")
    protected Object pendingMigrations(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Migrations")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Migrations/Migrator.php");
        Object files = assignParameter(args, 0, false);
        Object ran = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        Collection.runtimeStaticObject.make(env, files),
                                        "reject",
                                        Migrator.class,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Database\\Migrations",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "file")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object _closureThisVar = this.getClosureThisVar();
                                                Object file = assignParameter(args, 0, false);
                                                Object ran = null;
                                                ran =
                                                        this.contextReferences.getCapturedValue(
                                                                "ran");
                                                return ZVal.assign(
                                                        function_in_array
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        Migrator.this
                                                                                .getMigrationName(
                                                                                        env, file),
                                                                        ran)
                                                                .value());
                                            }
                                        }.use("ran", ran)),
                                "values",
                                Migrator.class),
                        "all",
                        Migrator.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "migrations", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object runPending(RuntimeEnv env, Object... args) {
        Object migrations = assignParameter(args, 0, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object file = null;
        ReferenceContainer batch = new BasicReferenceContainer(null);
        Object ternaryExpressionTemp = null;
        Object step = null;
        Object pretend = null;
        if (ZVal.strictEqualityCheck(
                function_count.f.env(env).call(migrations).value(), "===", 0)) {
            this.note(env, "<info>Nothing to migrate.</info>");
            return null;
        }

        batch.setObject(env.callMethod(this.repository, "getNextBatchNumber", Migrator.class));
        pretend =
                ZVal.assign(
                        ZVal.isDefined(ternaryExpressionTemp = options.arrayGet(env, "pretend"))
                                ? ternaryExpressionTemp
                                : false);
        step =
                ZVal.assign(
                        ZVal.isDefined(ternaryExpressionTemp = options.arrayGet(env, "step"))
                                ? ternaryExpressionTemp
                                : false);
        for (ZPair zpairResult336 : ZVal.getIterable(migrations, env, true)) {
            file = ZVal.assign(zpairResult336.getValue());
            this.runUp(env, file, batch.getObject(), pretend);
            if (ZVal.isTrue(step)) {
                batch.setObject(ZVal.increment(batch.getObject()));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(index = 1, name = "batch")
    @ConvertedParameter(index = 2, name = "pretend")
    protected Object runUp(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object batch = assignParameter(args, 1, false);
        Object pretend = assignParameter(args, 2, false);
        Object migration = null;
        Object name = null;
        migration = this.resolve(env, name = this.getMigrationName(env, file));
        if (ZVal.isTrue(pretend)) {
            return ZVal.assign(this.pretendToRun(env, migration, "up"));
        }

        this.note(env, "<comment>Migrating:</comment> " + toStringR(name, env));
        this.runMigration(env, migration, "up");
        env.callMethod(this.repository, "log", Migrator.class, name, batch);
        this.note(env, "<info>Migrated:</info>  " + toStringR(name, env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "paths", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object rollback(RuntimeEnv env, Object... args) {
        Object paths = assignParameter(args, 0, true);
        if (null == paths) {
            paths = ZVal.newArray();
        }
        Object options = assignParameter(args, 1, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object migrations = null;
        this.notes = ZVal.newArray();
        migrations = this.getMigrationsForRollback(env, options);
        if (ZVal.strictEqualityCheck(
                function_count.f.env(env).call(migrations).value(), "===", 0)) {
            this.note(env, "<info>Nothing to rollback.</info>");
            return ZVal.assign(ZVal.newArray());
        }

        return ZVal.assign(this.rollbackMigrations(env, migrations, paths, options));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", typeHint = "array")
    protected Object getMigrationsForRollback(RuntimeEnv env, Object... args) {
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        Object steps = null;
        if (ZVal.isGreaterThan(
                steps =
                        ZVal.assign(
                                ZVal.isDefined(
                                                ternaryExpressionTemp =
                                                        options.arrayGet(env, "step"))
                                        ? ternaryExpressionTemp
                                        : 0),
                '>',
                0)) {
            return ZVal.assign(
                    env.callMethod(this.repository, "getMigrations", Migrator.class, steps));

        } else {
            return ZVal.assign(env.callMethod(this.repository, "getLast", Migrator.class));
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "migrations", typeHint = "array")
    @ConvertedParameter(index = 1, name = "paths")
    @ConvertedParameter(index = 2, name = "options", typeHint = "array")
    protected Object rollbackMigrations(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object migrations = assignParameter(args, 0, false);
        Object paths = assignParameter(args, 1, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 2, false));
        Object file = null;
        Object migration = null;
        ReferenceContainer rolledBack = new BasicReferenceContainer(null);
        Object files = null;
        Object ternaryExpressionTemp = null;
        rolledBack.setObject(ZVal.newArray());
        this.requireFiles(env, files = this.getMigrationFiles(env, paths));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult337 : ZVal.getIterable(migrations, env, true)) {
            migration = ZVal.assign(zpairResult337.getValue());
            migration = ZVal.assign(toObjectR(migration));
            if (!ZVal.isTrue(
                    file =
                            Arr.runtimeStaticObject.get(
                                    env,
                                    files,
                                    toObjectR(migration)
                                            .accessProp(this, env)
                                            .name("migration")
                                            .value()))) {
                this.note(
                        env,
                        "<fg=red>Migration not found:</> "
                                + toStringR(
                                        toObjectR(migration)
                                                .accessProp(this, env)
                                                .name("migration")
                                                .value(),
                                        env));
                continue;
            }

            rolledBack.arrayAppend(env).set(file);
            this.runDown(
                    env,
                    file,
                    migration,
                    ZVal.isDefined(ternaryExpressionTemp = options.arrayGet(env, "pretend"))
                            ? ternaryExpressionTemp
                            : false);
        }

        return ZVal.assign(rolledBack.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "paths", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 1,
        name = "pretend",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object reset(RuntimeEnv env, Object... args) {
        Object paths = assignParameter(args, 0, true);
        if (null == paths) {
            paths = ZVal.newArray();
        }
        Object pretend = assignParameter(args, 1, true);
        if (null == pretend) {
            pretend = false;
        }
        Object migrations = null;
        this.notes = ZVal.newArray();
        migrations =
                function_array_reverse
                        .f
                        .env(env)
                        .call(env.callMethod(this.repository, "getRan", Migrator.class))
                        .value();
        if (ZVal.strictEqualityCheck(
                function_count.f.env(env).call(migrations).value(), "===", 0)) {
            this.note(env, "<info>Nothing to rollback.</info>");
            return ZVal.assign(ZVal.newArray());
        }

        return ZVal.assign(this.resetMigrations(env, migrations, paths, pretend));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "migrations", typeHint = "array")
    @ConvertedParameter(index = 1, name = "paths", typeHint = "array")
    @ConvertedParameter(
        index = 2,
        name = "pretend",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object resetMigrations(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope92 scope = new Scope92();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Migrations")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Migrations/Migrator.php");
            scope.migrations = assignParameter(args, 0, false);
            scope.paths = assignParameter(args, 1, false);
            scope.pretend = assignParameter(args, 2, true);
            if (null == scope.pretend) {
                scope.pretend = false;
            }
            scope.migrations =
                    env.callMethod(
                            env.callMethod(
                                    collect.f.env(env).call(scope.migrations).value(),
                                    "map",
                                    Migrator.class,
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Illuminate\\Database\\Migrations",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "m")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object m = assignParameter(args, 0, false);
                                            return ZVal.assign(
                                                    toObjectR(
                                                            ZVal.newArray(
                                                                    new ZPair("migration", m))));
                                        }
                                    }),
                            "all",
                            Migrator.class);
            throw new IncludeEventException(
                    ZVal.assign(
                            this.rollbackMigrations(
                                    env,
                                    scope.migrations,
                                    scope.paths,
                                    function_compact.f.env(env).call(stack, "pretend").value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(index = 1, name = "migration")
    @ConvertedParameter(index = 2, name = "pretend")
    protected Object runDown(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object migration = assignParameter(args, 1, false);
        Object pretend = assignParameter(args, 2, false);
        Object instance = null;
        Object name = null;
        instance = this.resolve(env, name = this.getMigrationName(env, file));
        this.note(env, "<comment>Rolling back:</comment> " + toStringR(name, env));
        if (ZVal.isTrue(pretend)) {
            return ZVal.assign(this.pretendToRun(env, instance, "down"));
        }

        this.runMigration(env, instance, "down");
        env.callMethod(this.repository, "delete", Migrator.class, migration);
        this.note(env, "<info>Rolled back:</info>  " + toStringR(name, env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "migration")
    @ConvertedParameter(index = 1, name = "method")
    protected Object runMigration(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Migrations")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Migrations/Migrator.php");
        Object migration = assignParameter(args, 0, false);
        Object method = assignParameter(args, 1, false);
        Object callback = null;
        Object connection = null;
        connection =
                this.resolveConnection(
                        env, env.callMethod(migration, "getConnection", Migrator.class));
        callback =
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Database\\Migrations",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object method = null;
                        Object migration = null;
                        method = this.contextReferences.getCapturedValue("method");
                        migration = this.contextReferences.getCapturedValue("migration");
                        if (function_method_exists.f.env(env).call(migration, method).getBool()) {
                            env.callMethod(migration, toStringR(method, env), Migrator.class);
                        }

                        return null;
                    }
                }.use("method", method).use("migration", migration);
        ZVal.ternaryExpression(
                ZVal.toBool(
                                        env.callMethod(
                                                this.getSchemaGrammar(env, connection),
                                                "supportsSchemaTransactions",
                                                Migrator.class))
                                && ZVal.toBool(
                                        toObjectR(migration)
                                                .accessProp(this, env)
                                                .name("withinTransaction")
                                                .value())
                        ? env.callMethod(connection, "transaction", Migrator.class, callback)
                        : env.callFunctionDynamic(callback, new RuntimeArgsWithReferences())
                                .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "migration")
    @ConvertedParameter(index = 1, name = "method")
    protected Object pretendToRun(RuntimeEnv env, Object... args) {
        Object migration = assignParameter(args, 0, false);
        Object method = assignParameter(args, 1, false);
        ReferenceContainer query = new BasicReferenceContainer(null);
        Object name = null;
        for (ZPair zpairResult338 :
                ZVal.getIterable(this.getQueries(env, migration, method), env, true)) {
            query.setObject(ZVal.assign(zpairResult338.getValue()));
            name = function_get_class.f.env(env).call(migration).value();
            this.note(
                    env,
                    "<info>"
                            + toStringR(name, env)
                            + ":</info> "
                            + toStringR(query.arrayGet(env, "query"), env));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "migration")
    @ConvertedParameter(index = 1, name = "method")
    protected Object getQueries(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Migrations")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Migrations/Migrator.php");
        Object migration = assignParameter(args, 0, false);
        Object method = assignParameter(args, 1, false);
        Object db = null;
        db =
                this.resolveConnection(
                        env, env.callMethod(migration, "getConnection", Migrator.class));
        return ZVal.assign(
                env.callMethod(
                        db,
                        "pretend",
                        Migrator.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database\\Migrations",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object method = null;
                                Object migration = null;
                                method = this.contextReferences.getCapturedValue("method");
                                migration = this.contextReferences.getCapturedValue("migration");
                                if (function_method_exists
                                        .f
                                        .env(env)
                                        .call(migration, method)
                                        .getBool()) {
                                    env.callMethod(
                                            migration, toStringR(method, env), Migrator.class);
                                }

                                return null;
                            }
                        }.use("method", method).use("migration", migration)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    public Object resolve(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object _pClass = null;
        _pClass =
                Str.runtimeStaticObject.studly(
                        env,
                        NamespaceGlobal.implode
                                .env(env)
                                .call(
                                        "_",
                                        function_array_slice
                                                .f
                                                .env(env)
                                                .call(
                                                        function_explode
                                                                .f
                                                                .env(env)
                                                                .call("_", file)
                                                                .value(),
                                                        4)
                                                .value())
                                .value());
        return ZVal.assign(env.createNew(_pClass));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "paths")
    public Object getMigrationFiles(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Migrations")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Migrations/Migrator.php");
        Object paths = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                env.callMethod(
                                                        env.callMethod(
                                                                Collection.runtimeStaticObject.make(
                                                                        env, paths),
                                                                "flatMap",
                                                                Migrator.class,
                                                                new Closure(
                                                                        env,
                                                                        runtimeConverterFunctionClassConstants,
                                                                        "Illuminate\\Database\\Migrations",
                                                                        this) {
                                                                    @Override
                                                                    @ConvertedMethod
                                                                    @ConvertedParameter(
                                                                        index = 0,
                                                                        name = "path"
                                                                    )
                                                                    public Object run(
                                                                            RuntimeEnv env,
                                                                            Object thisvar,
                                                                            PassByReferenceArgs
                                                                                    runtimePassByReferenceArgs,
                                                                            Object... args) {
                                                                        Object _closureThisVar =
                                                                                this
                                                                                        .getClosureThisVar();
                                                                        Object path =
                                                                                assignParameter(
                                                                                        args, 0,
                                                                                        false);
                                                                        return ZVal.assign(
                                                                                env.callMethod(
                                                                                        Migrator
                                                                                                .this
                                                                                                .files,
                                                                                        "glob",
                                                                                        Migrator
                                                                                                .class,
                                                                                        toStringR(
                                                                                                        path,
                                                                                                        env)
                                                                                                + "/*_*.php"));
                                                                    }
                                                                }),
                                                        "filter",
                                                        Migrator.class),
                                                "sortBy",
                                                Migrator.class,
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Illuminate\\Database\\Migrations",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "file")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object _closureThisVar =
                                                                this.getClosureThisVar();
                                                        Object file =
                                                                assignParameter(args, 0, false);
                                                        return ZVal.assign(
                                                                Migrator.this.getMigrationName(
                                                                        env, file));
                                                    }
                                                }),
                                        "values",
                                        Migrator.class),
                                "keyBy",
                                Migrator.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Migrations",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "file")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object file = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                Migrator.this.getMigrationName(env, file));
                                    }
                                }),
                        "all",
                        Migrator.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files", typeHint = "array")
    public Object requireFiles(RuntimeEnv env, Object... args) {
        Object files = assignParameter(args, 0, false);
        Object file = null;
        for (ZPair zpairResult339 : ZVal.getIterable(files, env, true)) {
            file = ZVal.assign(zpairResult339.getValue());
            env.callMethod(this.files, "requireOnce", Migrator.class, file);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getMigrationName(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(".php", "", NamespaceGlobal.basename.env(env).call(path).value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object path(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        this.paths =
                function_array_unique
                        .f
                        .env(env)
                        .call(
                                function_array_merge
                                        .f
                                        .env(env)
                                        .call(this.paths, ZVal.newArray(new ZPair(0, path)))
                                        .value())
                        .value();
        return null;
    }

    @ConvertedMethod
    public Object paths(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.paths);
    }

    @ConvertedMethod
    public Object getConnection(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.connection);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setConnection(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (!function_is_null.f.env(env).call(name).getBool()) {
            env.callMethod(this.resolver, "setDefaultConnection", Migrator.class, name);
        }

        env.callMethod(this.repository, "setSource", Migrator.class, name);
        this.connection = name;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    public Object resolveConnection(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                env.callMethod(
                        this.resolver,
                        "connection",
                        Migrator.class,
                        ZVal.isTrue(ternaryExpressionTemp = connection)
                                ? ternaryExpressionTemp
                                : this.connection));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    protected Object getSchemaGrammar(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        Object grammar = null;
        if (function_is_null
                .f
                .env(env)
                .call(grammar = env.callMethod(connection, "getSchemaGrammar", Migrator.class))
                .getBool()) {
            env.callMethod(connection, "useDefaultSchemaGrammar", Migrator.class);
            grammar = env.callMethod(connection, "getSchemaGrammar", Migrator.class);
        }

        return ZVal.assign(grammar);
    }

    @ConvertedMethod
    public Object getRepository(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.repository);
    }

    @ConvertedMethod
    public Object repositoryExists(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.repository, "repositoryExists", Migrator.class));
    }

    @ConvertedMethod
    public Object getFilesystem(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.files);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    protected Object note(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "notes", env).arrayAppend(env).set(message);
        return null;
    }

    @ConvertedMethod
    public Object getNotes(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.notes);
    }

    public static final Object CONST_class = "Illuminate\\Database\\Migrations\\Migrator";

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
                    .setName("Illuminate\\Database\\Migrations\\Migrator")
                    .setLookup(
                            Migrator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "connection", "files", "notes", "paths", "repository", "resolver")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Migrations/Migrator.php")
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

    private static class Scope92 implements UpdateRuntimeScopeInterface {

        Object migrations;
        Object paths;
        Object _thisVarAlias;
        Object pretend;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("migrations", this.migrations);
            stack.setVariable("paths", this.paths);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("pretend", this.pretend);
        }

        public void updateScope(RuntimeStack stack) {

            this.migrations = stack.getVariable("migrations");
            this.paths = stack.getVariable("paths");
            this._thisVarAlias = stack.getVariable("this");
            this.pretend = stack.getVariable("pretend");
        }
    }
}
