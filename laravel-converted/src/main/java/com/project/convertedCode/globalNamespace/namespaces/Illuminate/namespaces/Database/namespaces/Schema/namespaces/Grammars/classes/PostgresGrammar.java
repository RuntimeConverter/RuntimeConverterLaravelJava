package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.namespaces.Grammars.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.namespaces.Grammars.classes.Grammar;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Schema/Grammars/PostgresGrammar.php

*/

public class PostgresGrammar extends Grammar {

    public Object modifiers = ZVal.arrayFromList("Increment", "Nullable", "Default");

    public Object serials =
            ZVal.arrayFromList(
                    "bigInteger", "integer", "mediumInteger", "smallInteger", "tinyInteger");

    public PostgresGrammar(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.transactions = true;
        this.fluentCommands = ZVal.arrayFromList("Comment");
    }

    public PostgresGrammar(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object compileTableExists(RuntimeEnv env, Object... args) {
        return "select * from information_schema.tables where table_schema = ? and table_name = ?";
    }

    @ConvertedMethod
    public Object compileColumnListing(RuntimeEnv env, Object... args) {
        return "select column_name from information_schema.columns where table_schema = ? and table_name = ?";
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
                                "%s table %s (%s)",
                                toObjectR(blueprint)
                                                .accessProp(this, env)
                                                .name("temporary")
                                                .getBool()
                                        ? "create temporary"
                                        : "create",
                                env.callMethod(this, "wrapTable", PostgresGrammar.class, blueprint),
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                ", ",
                                                env.callMethod(
                                                        this,
                                                        "getColumns",
                                                        PostgresGrammar.class,
                                                        blueprint))
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "command", typeHint = "Illuminate\\Support\\Fluent")
    public Object compileAdd(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "alter table %s %s",
                                env.callMethod(this, "wrapTable", PostgresGrammar.class, blueprint),
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                ", ",
                                                env.callMethod(
                                                        this,
                                                        "prefixArray",
                                                        PostgresGrammar.class,
                                                        "add column",
                                                        env.callMethod(
                                                                this,
                                                                "getColumns",
                                                                PostgresGrammar.class,
                                                                blueprint)))
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "command", typeHint = "Illuminate\\Support\\Fluent")
    public Object compilePrimary(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        Object columns = null;
        columns =
                env.callMethod(
                        this,
                        "columnize",
                        PostgresGrammar.class,
                        toObjectR(command).accessProp(this, env).name("columns").value());
        return ZVal.assign(
                "alter table "
                        + toStringR(
                                env.callMethod(this, "wrapTable", PostgresGrammar.class, blueprint),
                                env)
                        + toStringR(" add primary key (" + toStringR(columns, env) + ")", env));
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
                                "alter table %s add constraint %s unique (%s)",
                                env.callMethod(this, "wrapTable", PostgresGrammar.class, blueprint),
                                env.callMethod(
                                        this,
                                        "wrap",
                                        PostgresGrammar.class,
                                        toObjectR(command)
                                                .accessProp(this, env)
                                                .name("index")
                                                .value()),
                                env.callMethod(
                                        this,
                                        "columnize",
                                        PostgresGrammar.class,
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
                                "create index %s on %s%s (%s)",
                                env.callMethod(
                                        this,
                                        "wrap",
                                        PostgresGrammar.class,
                                        toObjectR(command)
                                                .accessProp(this, env)
                                                .name("index")
                                                .value()),
                                env.callMethod(this, "wrapTable", PostgresGrammar.class, blueprint),
                                toObjectR(command).accessProp(this, env).name("algorithm").getBool()
                                        ? " using "
                                                + toStringR(
                                                        toObjectR(command)
                                                                .accessProp(this, env)
                                                                .name("algorithm")
                                                                .value(),
                                                        env)
                                        : "",
                                env.callMethod(
                                        this,
                                        "columnize",
                                        PostgresGrammar.class,
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
        toObjectR(command).accessProp(this, env).name("algorithm").set("gist");
        return ZVal.assign(this.compileIndex(env, blueprint, command));
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
        Object sql = null;
        sql = super.compileForeign(env, blueprint, command);
        if (!function_is_null
                .f
                .env(env)
                .call(toObjectR(command).accessProp(this, env).name("deferrable").value())
                .getBool()) {
            sql =
                    toStringR(sql, env)
                            + toStringR(
                                    toObjectR(command)
                                                    .accessProp(this, env)
                                                    .name("deferrable")
                                                    .getBool()
                                            ? " deferrable"
                                            : " not deferrable",
                                    env);
        }

        if (ZVal.toBool(toObjectR(command).accessProp(this, env).name("deferrable").value())
                && ZVal.toBool(
                        !function_is_null
                                .f
                                .env(env)
                                .call(
                                        toObjectR(command)
                                                .accessProp(this, env)
                                                .name("initiallyImmediate")
                                                .value())
                                .getBool())) {
            sql =
                    toStringR(sql, env)
                            + toStringR(
                                    toObjectR(command)
                                                    .accessProp(this, env)
                                                    .name("initiallyImmediate")
                                                    .getBool()
                                            ? " initially immediate"
                                            : " initially deferred",
                                    env);
        }

        return ZVal.assign(sql);
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
                                env.callMethod(this, "wrapTable", PostgresGrammar.class, blueprint),
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
                                env.callMethod(this, "wrapTable", PostgresGrammar.class, blueprint),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tables")
    public Object compileDropAllTables(RuntimeEnv env, Object... args) {
        Object tables = assignParameter(args, 0, false);
        return ZVal.assign(
                "drop table \""
                        + toStringR(
                                NamespaceGlobal.implode.env(env).call("\",\"", tables).value(), env)
                        + "\" cascade");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "views")
    public Object compileDropAllViews(RuntimeEnv env, Object... args) {
        Object views = assignParameter(args, 0, false);
        return ZVal.assign(
                "drop view \""
                        + toStringR(
                                NamespaceGlobal.implode.env(env).call("\",\"", views).value(), env)
                        + "\" cascade");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "schema")
    public Object compileGetAllTables(RuntimeEnv env, Object... args) {
        Object schema = assignParameter(args, 0, false);
        return ZVal.assign(
                "select tablename from pg_catalog.pg_tables where schemaname = '"
                        + toStringR(schema, env)
                        + "'");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "schema")
    public Object compileGetAllViews(RuntimeEnv env, Object... args) {
        Object schema = assignParameter(args, 0, false);
        return ZVal.assign(
                "select viewname from pg_catalog.pg_views where schemaname = '"
                        + toStringR(schema, env)
                        + "'");
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "command", typeHint = "Illuminate\\Support\\Fluent")
    public Object compileDropColumn(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        Object columns = null;
        columns =
                env.callMethod(
                        this,
                        "prefixArray",
                        PostgresGrammar.class,
                        "drop column",
                        env.callMethod(
                                this,
                                "wrapArray",
                                PostgresGrammar.class,
                                toObjectR(command).accessProp(this, env).name("columns").value()));
        return ZVal.assign(
                "alter table "
                        + toStringR(
                                env.callMethod(this, "wrapTable", PostgresGrammar.class, blueprint),
                                env)
                        + " "
                        + toStringR(
                                NamespaceGlobal.implode.env(env).call(", ", columns).value(), env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "command", typeHint = "Illuminate\\Support\\Fluent")
    public Object compileDropPrimary(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        Object index = null;
        index =
                env.callMethod(
                        this,
                        "wrap",
                        PostgresGrammar.class,
                        toStringR(env.callMethod(blueprint, "getTable", PostgresGrammar.class), env)
                                + "_pkey");
        return ZVal.assign(
                "alter table "
                        + toStringR(
                                env.callMethod(this, "wrapTable", PostgresGrammar.class, blueprint),
                                env)
                        + toStringR(" drop constraint " + toStringR(index, env), env));
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
                        PostgresGrammar.class,
                        toObjectR(command).accessProp(this, env).name("index").value());
        return ZVal.assign(
                "alter table "
                        + toStringR(
                                env.callMethod(this, "wrapTable", PostgresGrammar.class, blueprint),
                                env)
                        + " drop constraint "
                        + toStringR(index, env));
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
        return ZVal.assign(
                "drop index "
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "wrap",
                                        PostgresGrammar.class,
                                        toObjectR(command)
                                                .accessProp(this, env)
                                                .name("index")
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
    public Object compileDropSpatialIndex(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        return ZVal.assign(this.compileDropIndex(env, blueprint, command));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "command", typeHint = "Illuminate\\Support\\Fluent")
    public Object compileDropForeign(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        Object index = null;
        index =
                env.callMethod(
                        this,
                        "wrap",
                        PostgresGrammar.class,
                        toObjectR(command).accessProp(this, env).name("index").value());
        return ZVal.assign(
                "alter table "
                        + toStringR(
                                env.callMethod(this, "wrapTable", PostgresGrammar.class, blueprint),
                                env)
                        + " drop constraint "
                        + toStringR(index, env));
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
        from = env.callMethod(this, "wrapTable", PostgresGrammar.class, blueprint);
        return ZVal.assign(
                toStringR("alter table " + toStringR(from, env) + " rename to ", env)
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "wrapTable",
                                        PostgresGrammar.class,
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
    public Object compileRenameIndex(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "alter index %s rename to %s",
                                env.callMethod(
                                        this,
                                        "wrap",
                                        PostgresGrammar.class,
                                        toObjectR(command)
                                                .accessProp(this, env)
                                                .name("from")
                                                .value()),
                                env.callMethod(
                                        this,
                                        "wrap",
                                        PostgresGrammar.class,
                                        toObjectR(command)
                                                .accessProp(this, env)
                                                .name("to")
                                                .value()))
                        .value());
    }

    @ConvertedMethod
    public Object compileEnableForeignKeyConstraints(RuntimeEnv env, Object... args) {
        return "SET CONSTRAINTS ALL IMMEDIATE;";
    }

    @ConvertedMethod
    public Object compileDisableForeignKeyConstraints(RuntimeEnv env, Object... args) {
        return "SET CONSTRAINTS ALL DEFERRED;";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "command", typeHint = "Illuminate\\Support\\Fluent")
    public Object compileComment(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "comment on column %s.%s is %s",
                                env.callMethod(this, "wrapTable", PostgresGrammar.class, blueprint),
                                env.callMethod(
                                        this,
                                        "wrap",
                                        PostgresGrammar.class,
                                        toObjectR(command)
                                                .accessProp(this, env)
                                                .name("column")
                                                .getObject()
                                                .accessProp(this, env)
                                                .name("name")
                                                .value()),
                                "'"
                                        + toStringR(
                                                function_str_replace
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "'",
                                                                "''",
                                                                toObjectR(command)
                                                                        .accessProp(this, env)
                                                                        .name("value")
                                                                        .value())
                                                        .value(),
                                                env)
                                        + "'")
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeChar(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(
                "char("
                        + toStringR(
                                toObjectR(column).accessProp(this, env).name("length").value(), env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeString(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(
                "varchar("
                        + toStringR(
                                toObjectR(column).accessProp(this, env).name("length").value(), env)
                        + ")");
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
        return ZVal.assign(
                toObjectR(column).accessProp(this, env).name("autoIncrement").getBool()
                        ? "serial"
                        : "integer");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeBigInteger(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(
                toObjectR(column).accessProp(this, env).name("autoIncrement").getBool()
                        ? "bigserial"
                        : "bigint");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeMediumInteger(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(
                toObjectR(column).accessProp(this, env).name("autoIncrement").getBool()
                        ? "serial"
                        : "integer");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeTinyInteger(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(
                toObjectR(column).accessProp(this, env).name("autoIncrement").getBool()
                        ? "smallserial"
                        : "smallint");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeSmallInteger(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(
                toObjectR(column).accessProp(this, env).name("autoIncrement").getBool()
                        ? "smallserial"
                        : "smallint");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeFloat(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.typeDouble(env, column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeDouble(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "double precision";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeReal(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "real";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeDecimal(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(
                "decimal("
                        + toStringR(
                                toObjectR(column).accessProp(this, env).name("total").value(), env)
                        + ", "
                        + toStringR(
                                toObjectR(column).accessProp(this, env).name("places").value(), env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeBoolean(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "boolean";
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
                                "varchar(255) check (\"%s\" in (%s))",
                                toObjectR(column).accessProp(this, env).name("name").value(),
                                env.callMethod(
                                        this,
                                        "quoteString",
                                        PostgresGrammar.class,
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
        return "json";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeJsonb(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "jsonb";
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
        return ZVal.assign(
                "timestamp("
                        + toStringR(
                                toObjectR(column).accessProp(this, env).name("precision").value(),
                                env)
                        + ") without time zone");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeDateTimeTz(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(
                "timestamp("
                        + toStringR(
                                toObjectR(column).accessProp(this, env).name("precision").value(),
                                env)
                        + ") with time zone");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeTime(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(
                "time("
                        + toStringR(
                                toObjectR(column).accessProp(this, env).name("precision").value(),
                                env)
                        + ") without time zone");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeTimeTz(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(
                "time("
                        + toStringR(
                                toObjectR(column).accessProp(this, env).name("precision").value(),
                                env)
                        + ") with time zone");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeTimestamp(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object columnType = null;
        columnType =
                ZVal.assign(
                        "timestamp("
                                + toStringR(
                                        toObjectR(column)
                                                .accessProp(this, env)
                                                .name("precision")
                                                .value(),
                                        env)
                                + ") without time zone");
        return ZVal.assign(
                toObjectR(column).accessProp(this, env).name("useCurrent").getBool()
                        ? toStringR(columnType, env) + " default CURRENT_TIMESTAMP"
                        : columnType);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeTimestampTz(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object columnType = null;
        columnType =
                ZVal.assign(
                        "timestamp("
                                + toStringR(
                                        toObjectR(column)
                                                .accessProp(this, env)
                                                .name("precision")
                                                .value(),
                                        env)
                                + ") with time zone");
        return ZVal.assign(
                toObjectR(column).accessProp(this, env).name("useCurrent").getBool()
                        ? toStringR(columnType, env) + " default CURRENT_TIMESTAMP"
                        : columnType);
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
        return "bytea";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeUuid(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "uuid";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeIpAddress(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "inet";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeMacAddress(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "macaddr";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeGeometry(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        throw ZVal.getException(
                env,
                new RuntimeException(
                        env,
                        "The database driver in use does not support the Geometry spatial column type."));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typePoint(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.formatPostGisType(env, "point"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeLineString(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.formatPostGisType(env, "linestring"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typePolygon(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.formatPostGisType(env, "polygon"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeGeometryCollection(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.formatPostGisType(env, "geometrycollection"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeMultiPoint(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.formatPostGisType(env, "multipoint"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    public Object typeMultiLineString(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.formatPostGisType(env, "multilinestring"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeMultiPolygon(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.formatPostGisType(env, "multipolygon"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type", typeHint = "string")
    private Object formatPostGisType(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        return ZVal.assign("geography(" + toStringR(type, env) + ", 4326)");
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
                                            PostgresGrammar.class,
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
            return " primary key";
        }

        return null;
    }

    public static final Object CONST_class =
            "Illuminate\\Database\\Schema\\Grammars\\PostgresGrammar";

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
                    .setName("Illuminate\\Database\\Schema\\Grammars\\PostgresGrammar")
                    .setLookup(
                            PostgresGrammar.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "fluentCommands",
                            "fluentCommands",
                            "modifiers",
                            "serials",
                            "tablePrefix",
                            "transactions",
                            "transactions")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Schema/Grammars/PostgresGrammar.php")
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
