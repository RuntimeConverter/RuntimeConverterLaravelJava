package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.namespaces.Grammars.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.functions.array_get;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.namespaces.Grammars.classes.Grammar;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Schema/Grammars/SQLiteGrammar.php

*/

public class SQLiteGrammar extends Grammar {

    public Object modifiers = ZVal.arrayFromList("Nullable", "Default", "Increment");

    public Object serials =
            ZVal.arrayFromList(
                    "bigInteger", "integer", "mediumInteger", "smallInteger", "tinyInteger");

    public SQLiteGrammar(RuntimeEnv env, Object... args) {
        super(env);
    }

    public SQLiteGrammar(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object compileTableExists(RuntimeEnv env, Object... args) {
        return "select * from sqlite_master where type = 'table' and name = ?";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    public Object compileColumnListing(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        return ZVal.assign(
                "pragma table_info("
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "wrap",
                                        SQLiteGrammar.class,
                                        function_str_replace
                                                .f
                                                .env(env)
                                                .call(".", "__", table)
                                                .value()),
                                env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "command", typeHint = "Illuminate\\Support\\Fluent")
    public Object compileCreate(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s table %s (%s%s%s)",
                                toObjectR(blueprint)
                                                .accessProp(this, env)
                                                .name("temporary")
                                                .getBool()
                                        ? "create temporary"
                                        : "create",
                                env.callMethod(this, "wrapTable", SQLiteGrammar.class, blueprint),
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                ", ",
                                                env.callMethod(
                                                        this,
                                                        "getColumns",
                                                        SQLiteGrammar.class,
                                                        blueprint))
                                        .value(),
                                toStringR(this.addForeignKeys(env, blueprint), env),
                                toStringR(this.addPrimaryKeys(env, blueprint), env))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    protected Object addForeignKeys(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema/Grammars")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Schema/Grammars/SQLiteGrammar.php");
        Object blueprint = assignParameter(args, 0, false);
        Object foreigns = null;
        foreigns =
                env.callMethod(
                        this, "getCommandsByName", SQLiteGrammar.class, blueprint, "foreign");
        return ZVal.assign(
                env.callMethod(
                        collect.f.env(env).call(foreigns).value(),
                        "reduce",
                        SQLiteGrammar.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database\\Schema\\Grammars",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "sql")
                            @ConvertedParameter(index = 1, name = "foreign")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object sql = assignParameter(args, 0, false);
                                Object foreign = assignParameter(args, 1, false);
                                sql =
                                        toStringR(sql, env)
                                                + toStringR(
                                                        SQLiteGrammar.this.getForeignKey(
                                                                env, foreign),
                                                        env);
                                if (!function_is_null
                                        .f
                                        .env(env)
                                        .call(
                                                toObjectR(foreign)
                                                        .accessProp(this, env)
                                                        .name("onDelete")
                                                        .value())
                                        .getBool()) {
                                    sql =
                                            toStringR(sql, env)
                                                    + toStringR(
                                                            " on delete "
                                                                    + toStringR(
                                                                            toObjectR(foreign)
                                                                                    .accessProp(
                                                                                            this,
                                                                                            env)
                                                                                    .name(
                                                                                            "onDelete")
                                                                                    .value(),
                                                                            env),
                                                            env);
                                }

                                if (!function_is_null
                                        .f
                                        .env(env)
                                        .call(
                                                toObjectR(foreign)
                                                        .accessProp(this, env)
                                                        .name("onUpdate")
                                                        .value())
                                        .getBool()) {
                                    sql =
                                            toStringR(sql, env)
                                                    + toStringR(
                                                            " on update "
                                                                    + toStringR(
                                                                            toObjectR(foreign)
                                                                                    .accessProp(
                                                                                            this,
                                                                                            env)
                                                                                    .name(
                                                                                            "onUpdate")
                                                                                    .value(),
                                                                            env),
                                                            env);
                                }

                                return ZVal.assign(sql);
                            }
                        },
                        ""));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "foreign")
    protected Object getForeignKey(RuntimeEnv env, Object... args) {
        Object foreign = assignParameter(args, 0, false);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                ", foreign key(%s) references %s(%s)",
                                env.callMethod(
                                        this,
                                        "columnize",
                                        SQLiteGrammar.class,
                                        toObjectR(foreign)
                                                .accessProp(this, env)
                                                .name("columns")
                                                .value()),
                                env.callMethod(
                                        this,
                                        "wrapTable",
                                        SQLiteGrammar.class,
                                        toObjectR(foreign)
                                                .accessProp(this, env)
                                                .name("on")
                                                .value()),
                                env.callMethod(
                                        this,
                                        "columnize",
                                        SQLiteGrammar.class,
                                        rToArrayCast(
                                                toObjectR(foreign)
                                                        .accessProp(this, env)
                                                        .name("references")
                                                        .value())))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    protected Object addPrimaryKeys(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object primary = null;
        if (!function_is_null
                .f
                .env(env)
                .call(
                        primary =
                                env.callMethod(
                                        this,
                                        "getCommandByName",
                                        SQLiteGrammar.class,
                                        blueprint,
                                        "primary"))
                .getBool()) {
            return ZVal.assign(
                    ", primary key ("
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "columnize",
                                            SQLiteGrammar.class,
                                            toObjectR(primary)
                                                    .accessProp(this, env)
                                                    .name("columns")
                                                    .value()),
                                    env)
                            + ")");
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "command", typeHint = "Illuminate\\Support\\Fluent")
    public Object compileAdd(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema/Grammars")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Schema/Grammars/SQLiteGrammar.php");
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        Object columns = null;
        columns =
                env.callMethod(
                        this,
                        "prefixArray",
                        SQLiteGrammar.class,
                        "add column",
                        env.callMethod(this, "getColumns", SQLiteGrammar.class, blueprint));
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(columns).value(),
                                "map",
                                SQLiteGrammar.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Schema\\Grammars",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "column")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object column = assignParameter(args, 0, false);
                                        Object blueprint = null;
                                        blueprint =
                                                this.contextReferences.getCapturedValue(
                                                        "blueprint");
                                        return ZVal.assign(
                                                "alter table "
                                                        + toStringR(
                                                                env.callMethod(
                                                                        _closureThisVar,
                                                                        "wrapTable",
                                                                        SQLiteGrammar.class,
                                                                        blueprint),
                                                                env)
                                                        + " "
                                                        + toStringR(column, env));
                                    }
                                }.use("blueprint", blueprint)),
                        "all",
                        SQLiteGrammar.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "command", typeHint = "Illuminate\\Support\\Fluent")
    public Object compileUnique(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "create unique index %s on %s (%s)",
                                env.callMethod(
                                        this,
                                        "wrap",
                                        SQLiteGrammar.class,
                                        toObjectR(command)
                                                .accessProp(this, env)
                                                .name("index")
                                                .value()),
                                env.callMethod(this, "wrapTable", SQLiteGrammar.class, blueprint),
                                env.callMethod(
                                        this,
                                        "columnize",
                                        SQLiteGrammar.class,
                                        toObjectR(command)
                                                .accessProp(this, env)
                                                .name("columns")
                                                .value()))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "command", typeHint = "Illuminate\\Support\\Fluent")
    public Object compileIndex(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "create index %s on %s (%s)",
                                env.callMethod(
                                        this,
                                        "wrap",
                                        SQLiteGrammar.class,
                                        toObjectR(command)
                                                .accessProp(this, env)
                                                .name("index")
                                                .value()),
                                env.callMethod(this, "wrapTable", SQLiteGrammar.class, blueprint),
                                env.callMethod(
                                        this,
                                        "columnize",
                                        SQLiteGrammar.class,
                                        toObjectR(command)
                                                .accessProp(this, env)
                                                .name("columns")
                                                .value()))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "command", typeHint = "Illuminate\\Support\\Fluent")
    public Object compileSpatialIndex(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        throw ZVal.getException(
                env,
                new RuntimeException(
                        env, "The database driver in use does not support spatial indexes."));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "command", typeHint = "Illuminate\\Support\\Fluent")
    public Object compileForeign(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "command", typeHint = "Illuminate\\Support\\Fluent")
    public Object compileDrop(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        return ZVal.assign(
                "drop table "
                        + toStringR(
                                env.callMethod(this, "wrapTable", SQLiteGrammar.class, blueprint),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "command", typeHint = "Illuminate\\Support\\Fluent")
    public Object compileDropIfExists(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        return ZVal.assign(
                "drop table if exists "
                        + toStringR(
                                env.callMethod(this, "wrapTable", SQLiteGrammar.class, blueprint),
                                env));
    }

    @ConvertedMethod
    public Object compileDropAllTables(RuntimeEnv env, Object... args) {
        return "delete from sqlite_master where type in ('table', 'index', 'trigger')";
    }

    @ConvertedMethod
    public Object compileDropAllViews(RuntimeEnv env, Object... args) {
        return "delete from sqlite_master where type in ('view')";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "command", typeHint = "Illuminate\\Support\\Fluent")
    @ConvertedParameter(
        index = 2,
        name = "connection",
        typeHint = "Illuminate\\Database\\Connection"
    )
    public Object compileDropColumn(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        Object connection = assignParameter(args, 2, false);
        Object schema = null;
        Object tableDiff = null;
        Object name = null;
        tableDiff =
                env.callMethod(
                        this,
                        "getDoctrineTableDiff",
                        SQLiteGrammar.class,
                        blueprint,
                        schema =
                                env.callMethod(
                                        connection,
                                        "getDoctrineSchemaManager",
                                        SQLiteGrammar.class));
        for (ZPair zpairResult369 :
                ZVal.getIterable(
                        toObjectR(command).accessProp(this, env).name("columns").value(),
                        env,
                        true)) {
            name = ZVal.assign(zpairResult369.getValue());
            new ReferenceClassProperty(tableDiff, "removedColumns", env)
                    .arrayAccess(env, name)
                    .set(
                            env.callMethod(
                                    connection,
                                    "getDoctrineColumn",
                                    SQLiteGrammar.class,
                                    toStringR(
                                                    env.callMethod(
                                                            this,
                                                            "getTablePrefix",
                                                            SQLiteGrammar.class),
                                                    env)
                                            + toStringR(
                                                    env.callMethod(
                                                            blueprint,
                                                            "getTable",
                                                            SQLiteGrammar.class),
                                                    env),
                                    name));
        }

        return ZVal.assign(
                rToArrayCast(
                        env.callMethod(
                                env.callMethod(schema, "getDatabasePlatform", SQLiteGrammar.class),
                                "getAlterTableSQL",
                                SQLiteGrammar.class,
                                tableDiff)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "command", typeHint = "Illuminate\\Support\\Fluent")
    public Object compileDropUnique(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        Object index = null;
        index =
                env.callMethod(
                        this,
                        "wrap",
                        SQLiteGrammar.class,
                        toObjectR(command).accessProp(this, env).name("index").value());
        return ZVal.assign("drop index " + toStringR(index, env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "command", typeHint = "Illuminate\\Support\\Fluent")
    public Object compileDropIndex(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        Object index = null;
        index =
                env.callMethod(
                        this,
                        "wrap",
                        SQLiteGrammar.class,
                        toObjectR(command).accessProp(this, env).name("index").value());
        return ZVal.assign("drop index " + toStringR(index, env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "command", typeHint = "Illuminate\\Support\\Fluent")
    public Object compileDropSpatialIndex(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        throw ZVal.getException(
                env,
                new RuntimeException(
                        env, "The database driver in use does not support spatial indexes."));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "command", typeHint = "Illuminate\\Support\\Fluent")
    public Object compileRename(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        Object from = null;
        from = env.callMethod(this, "wrapTable", SQLiteGrammar.class, blueprint);
        return ZVal.assign(
                toStringR("alter table " + toStringR(from, env) + " rename to ", env)
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "wrapTable",
                                        SQLiteGrammar.class,
                                        toObjectR(command)
                                                .accessProp(this, env)
                                                .name("to")
                                                .value()),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "command", typeHint = "Illuminate\\Support\\Fluent")
    @ConvertedParameter(
        index = 2,
        name = "connection",
        typeHint = "Illuminate\\Database\\Connection"
    )
    public Object compileRenameIndex(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        Object connection = assignParameter(args, 2, false);
        Object schemaManager = null;
        Object indexes = null;
        Object index = null;
        Object newIndex = null;
        Object platform = null;
        schemaManager = env.callMethod(connection, "getDoctrineSchemaManager", SQLiteGrammar.class);
        indexes =
                env.callMethod(
                        schemaManager,
                        "listTableIndexes",
                        SQLiteGrammar.class,
                        toStringR(env.callMethod(this, "getTablePrefix", SQLiteGrammar.class), env)
                                + toStringR(
                                        env.callMethod(blueprint, "getTable", SQLiteGrammar.class),
                                        env));
        index =
                array_get
                        .f
                        .env(env)
                        .call(
                                indexes,
                                toObjectR(command).accessProp(this, env).name("from").value())
                        .value();
        if (!ZVal.isTrue(index)) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "Index ["
                                    + toStringR(
                                            toObjectR(command)
                                                    .accessProp(this, env)
                                                    .name("from")
                                                    .value(),
                                            env)
                                    + "] does not exist."));
        }

        newIndex =
                env.createNew(
                        ZVal.resolveClassAlias(env, "Index"),
                        toObjectR(command).accessProp(this, env).name("to").value(),
                        env.callMethod(index, "getColumns", SQLiteGrammar.class),
                        env.callMethod(index, "isUnique", SQLiteGrammar.class),
                        env.callMethod(index, "isPrimary", SQLiteGrammar.class),
                        env.callMethod(index, "getFlags", SQLiteGrammar.class),
                        env.callMethod(index, "getOptions", SQLiteGrammar.class));
        platform = env.callMethod(schemaManager, "getDatabasePlatform", SQLiteGrammar.class);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                env.callMethod(
                                        platform,
                                        "getDropIndexSQL",
                                        SQLiteGrammar.class,
                                        toObjectR(command)
                                                .accessProp(this, env)
                                                .name("from")
                                                .value(),
                                        toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "getTablePrefix",
                                                                SQLiteGrammar.class),
                                                        env)
                                                + toStringR(
                                                        env.callMethod(
                                                                blueprint,
                                                                "getTable",
                                                                SQLiteGrammar.class),
                                                        env))),
                        new ZPair(
                                1,
                                env.callMethod(
                                        platform,
                                        "getCreateIndexSQL",
                                        SQLiteGrammar.class,
                                        newIndex,
                                        toStringR(
                                                        env.callMethod(
                                                                this,
                                                                "getTablePrefix",
                                                                SQLiteGrammar.class),
                                                        env)
                                                + toStringR(
                                                        env.callMethod(
                                                                blueprint,
                                                                "getTable",
                                                                SQLiteGrammar.class),
                                                        env)))));
    }

    @ConvertedMethod
    public Object compileEnableForeignKeyConstraints(RuntimeEnv env, Object... args) {
        return "PRAGMA foreign_keys = ON;";
    }

    @ConvertedMethod
    public Object compileDisableForeignKeyConstraints(RuntimeEnv env, Object... args) {
        return "PRAGMA foreign_keys = OFF;";
    }

    @ConvertedMethod
    public Object compileEnableWriteableSchema(RuntimeEnv env, Object... args) {
        return "PRAGMA writable_schema = 1;";
    }

    @ConvertedMethod
    public Object compileDisableWriteableSchema(RuntimeEnv env, Object... args) {
        return "PRAGMA writable_schema = 0;";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeChar(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "varchar";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeString(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "varchar";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeText(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "text";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeMediumText(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "text";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeLongText(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "text";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeInteger(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "integer";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeBigInteger(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "integer";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeMediumInteger(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "integer";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeTinyInteger(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "integer";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeSmallInteger(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "integer";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeFloat(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "float";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeDouble(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "float";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeDecimal(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "numeric";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeBoolean(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "tinyint(1)";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeEnum(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "varchar check (\"%s\" in (%s))",
                                toObjectR(column).accessProp(this, env).name("name").value(),
                                env.callMethod(
                                        this,
                                        "quoteString",
                                        SQLiteGrammar.class,
                                        toObjectR(column)
                                                .accessProp(this, env)
                                                .name("allowed")
                                                .value()))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeJson(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "text";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeJsonb(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "text";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeDate(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "date";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeDateTime(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "datetime";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeDateTimeTz(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.typeDateTime(env, column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeTime(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "time";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeTimeTz(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.typeTime(env, column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeTimestamp(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(
                toObjectR(column).accessProp(this, env).name("useCurrent").getBool()
                        ? "datetime default CURRENT_TIMESTAMP"
                        : "datetime");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeTimestampTz(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.typeTimestamp(env, column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeYear(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.typeInteger(env, column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeBinary(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "blob";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeUuid(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "varchar";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeIpAddress(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "varchar";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeMacAddress(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "varchar";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    public Object typeGeometry(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "geometry";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    public Object typePoint(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "point";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    public Object typeLineString(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "linestring";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    public Object typePolygon(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "polygon";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    public Object typeGeometryCollection(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "geometrycollection";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    public Object typeMultiPoint(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "multipoint";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    public Object typeMultiLineString(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "multilinestring";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    public Object typeMultiPolygon(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "multipolygon";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object modifyNullable(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object column = assignParameter(args, 1, false);
        return ZVal.assign(
                toObjectR(column).accessProp(this, env).name("nullable").getBool()
                        ? " null"
                        : " not null");
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object modifyDefault(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object column = assignParameter(args, 1, false);
        if (!function_is_null
                .f
                .env(env)
                .call(toObjectR(column).accessProp(this, env).name("default").value())
                .getBool()) {
            return ZVal.assign(
                    " default "
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "getDefaultValue",
                                            SQLiteGrammar.class,
                                            toObjectR(column)
                                                    .accessProp(this, env)
                                                    .name("default")
                                                    .value()),
                                    env));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object modifyIncrement(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object column = assignParameter(args, 1, false);
        if (ZVal.toBool(
                        function_in_array
                                .f
                                .env(env)
                                .call(
                                        toObjectR(column)
                                                .accessProp(this, env)
                                                .name("type")
                                                .value(),
                                        this.serials)
                                .value())
                && ZVal.toBool(
                        toObjectR(column).accessProp(this, env).name("autoIncrement").value())) {
            return " primary key autoincrement";
        }

        return null;
    }

    public static final Object CONST_class =
            "Illuminate\\Database\\Schema\\Grammars\\SQLiteGrammar";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Grammar.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Schema\\Grammars\\SQLiteGrammar")
                    .setLookup(
                            SQLiteGrammar.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "fluentCommands", "modifiers", "serials", "tablePrefix", "transactions")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Schema/Grammars/SQLiteGrammar.php")
                    .addExtendsClass("Illuminate\\Database\\Schema\\Grammars\\Grammar")
                    .addExtendsClass("Illuminate\\Database\\Grammar")
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
