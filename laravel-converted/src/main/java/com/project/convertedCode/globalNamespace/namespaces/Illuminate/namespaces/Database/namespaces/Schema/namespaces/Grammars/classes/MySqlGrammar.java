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
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
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

 vendor/laravel/framework/src/Illuminate/Database/Schema/Grammars/MySqlGrammar.php

*/

public class MySqlGrammar extends Grammar {

    public Object modifiers =
            ZVal.arrayFromList(
                    "Unsigned",
                    "VirtualAs",
                    "StoredAs",
                    "Charset",
                    "Collate",
                    "Nullable",
                    "Default",
                    "Increment",
                    "Comment",
                    "After",
                    "First",
                    "Srid");

    public Object serials =
            ZVal.arrayFromList(
                    "bigInteger", "integer", "mediumInteger", "smallInteger", "tinyInteger");

    public MySqlGrammar(RuntimeEnv env, Object... args) {
        super(env);
    }

    public MySqlGrammar(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object compileTableExists(RuntimeEnv env, Object... args) {
        return "select * from information_schema.tables where table_schema = ? and table_name = ?";
    }

    @ConvertedMethod
    public Object compileColumnListing(RuntimeEnv env, Object... args) {
        return "select column_name as `column_name` from information_schema.columns where table_schema = ? and table_name = ?";
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
    public Object compileCreate(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        Object connection = assignParameter(args, 2, false);
        Object sql = null;
        sql = this.compileCreateTable(env, blueprint, command, connection);
        sql = this.compileCreateEncoding(env, sql, connection, blueprint);
        return ZVal.assign(this.compileCreateEngine(env, sql, connection, blueprint));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "blueprint")
    @ConvertedParameter(index = 1, name = "command")
    @ConvertedParameter(index = 2, name = "connection")
    protected Object compileCreateTable(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        Object connection = assignParameter(args, 2, false);
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
                                env.callMethod(this, "wrapTable", MySqlGrammar.class, blueprint),
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                ", ",
                                                env.callMethod(
                                                        this,
                                                        "getColumns",
                                                        MySqlGrammar.class,
                                                        blueprint))
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sql")
    @ConvertedParameter(
        index = 1,
        name = "connection",
        typeHint = "Illuminate\\Database\\Connection"
    )
    @ConvertedParameter(
        index = 2,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    protected Object compileCreateEncoding(RuntimeEnv env, Object... args) {
        Object sql = assignParameter(args, 0, false);
        Object connection = assignParameter(args, 1, false);
        Object blueprint = assignParameter(args, 2, false);
        Object charset = null;
        Object collation = null;
        if (ZVal.isset(toObjectR(blueprint).accessProp(this, env).name("charset").value())) {
            sql =
                    toStringR(sql, env)
                            + " default character set "
                            + toStringR(
                                    toObjectR(blueprint)
                                            .accessProp(this, env)
                                            .name("charset")
                                            .value(),
                                    env);

        } else if (!function_is_null
                .f
                .env(env)
                .call(
                        charset =
                                env.callMethod(
                                        connection, "getConfig", MySqlGrammar.class, "charset"))
                .getBool()) {
            sql = toStringR(sql, env) + " default character set " + toStringR(charset, env);
        }

        if (ZVal.isset(toObjectR(blueprint).accessProp(this, env).name("collation").value())) {
            sql =
                    toStringR(sql, env)
                            + toStringR(
                                    " collate '"
                                            + toStringR(
                                                    toObjectR(blueprint)
                                                            .accessProp(this, env)
                                                            .name("collation")
                                                            .value(),
                                                    env)
                                            + "'",
                                    env);

        } else if (!function_is_null
                .f
                .env(env)
                .call(
                        collation =
                                env.callMethod(
                                        connection, "getConfig", MySqlGrammar.class, "collation"))
                .getBool()) {
            sql =
                    toStringR(sql, env)
                            + toStringR(" collate '" + toStringR(collation, env) + "'", env);
        }

        return ZVal.assign(sql);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sql")
    @ConvertedParameter(
        index = 1,
        name = "connection",
        typeHint = "Illuminate\\Database\\Connection"
    )
    @ConvertedParameter(
        index = 2,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    protected Object compileCreateEngine(RuntimeEnv env, Object... args) {
        Object sql = assignParameter(args, 0, false);
        Object connection = assignParameter(args, 1, false);
        Object blueprint = assignParameter(args, 2, false);
        Object engine = null;
        if (ZVal.isset(toObjectR(blueprint).accessProp(this, env).name("engine").value())) {
            return ZVal.assign(
                    toStringR(sql, env)
                            + " engine = "
                            + toStringR(
                                    toObjectR(blueprint)
                                            .accessProp(this, env)
                                            .name("engine")
                                            .value(),
                                    env));

        } else if (!function_is_null
                .f
                .env(env)
                .call(
                        engine =
                                env.callMethod(
                                        connection, "getConfig", MySqlGrammar.class, "engine"))
                .getBool()) {
            return ZVal.assign(toStringR(sql, env) + " engine = " + toStringR(engine, env));
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
    public Object compileAdd(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        Object columns = null;
        columns =
                env.callMethod(
                        this,
                        "prefixArray",
                        MySqlGrammar.class,
                        "add",
                        env.callMethod(this, "getColumns", MySqlGrammar.class, blueprint));
        return ZVal.assign(
                "alter table "
                        + toStringR(
                                env.callMethod(this, "wrapTable", MySqlGrammar.class, blueprint),
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
    public Object compilePrimary(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        env.callMethod(command, "name", MySqlGrammar.class, ZVal.getNull());
        return ZVal.assign(this.compileKey(env, blueprint, command, "primary key"));
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
        return ZVal.assign(this.compileKey(env, blueprint, command, "unique"));
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
        return ZVal.assign(this.compileKey(env, blueprint, command, "index"));
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
        return ZVal.assign(this.compileKey(env, blueprint, command, "spatial index"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "command", typeHint = "Illuminate\\Support\\Fluent")
    @ConvertedParameter(index = 2, name = "type")
    protected Object compileKey(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        Object type = assignParameter(args, 2, false);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "alter table %s add %s %s%s(%s)",
                                env.callMethod(this, "wrapTable", MySqlGrammar.class, blueprint),
                                type,
                                env.callMethod(
                                        this,
                                        "wrap",
                                        MySqlGrammar.class,
                                        toObjectR(command)
                                                .accessProp(this, env)
                                                .name("index")
                                                .value()),
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
                                        MySqlGrammar.class,
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
    public Object compileDrop(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        return ZVal.assign(
                "drop table "
                        + toStringR(
                                env.callMethod(this, "wrapTable", MySqlGrammar.class, blueprint),
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
                                env.callMethod(this, "wrapTable", MySqlGrammar.class, blueprint),
                                env));
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
                        MySqlGrammar.class,
                        "drop",
                        env.callMethod(
                                this,
                                "wrapArray",
                                MySqlGrammar.class,
                                toObjectR(command).accessProp(this, env).name("columns").value()));
        return ZVal.assign(
                "alter table "
                        + toStringR(
                                env.callMethod(this, "wrapTable", MySqlGrammar.class, blueprint),
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
        return ZVal.assign(
                "alter table "
                        + toStringR(
                                env.callMethod(this, "wrapTable", MySqlGrammar.class, blueprint),
                                env)
                        + " drop primary key");
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
                        MySqlGrammar.class,
                        toObjectR(command).accessProp(this, env).name("index").value());
        return ZVal.assign(
                "alter table "
                        + toStringR(
                                env.callMethod(this, "wrapTable", MySqlGrammar.class, blueprint),
                                env)
                        + " drop index "
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
        Object index = null;
        index =
                env.callMethod(
                        this,
                        "wrap",
                        MySqlGrammar.class,
                        toObjectR(command).accessProp(this, env).name("index").value());
        return ZVal.assign(
                "alter table "
                        + toStringR(
                                env.callMethod(this, "wrapTable", MySqlGrammar.class, blueprint),
                                env)
                        + " drop index "
                        + toStringR(index, env));
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
                        MySqlGrammar.class,
                        toObjectR(command).accessProp(this, env).name("index").value());
        return ZVal.assign(
                "alter table "
                        + toStringR(
                                env.callMethod(this, "wrapTable", MySqlGrammar.class, blueprint),
                                env)
                        + " drop foreign key "
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
        from = env.callMethod(this, "wrapTable", MySqlGrammar.class, blueprint);
        return ZVal.assign(
                toStringR("rename table " + toStringR(from, env) + " to ", env)
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "wrapTable",
                                        MySqlGrammar.class,
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
                                "alter table %s rename index %s to %s",
                                env.callMethod(this, "wrapTable", MySqlGrammar.class, blueprint),
                                env.callMethod(
                                        this,
                                        "wrap",
                                        MySqlGrammar.class,
                                        toObjectR(command)
                                                .accessProp(this, env)
                                                .name("from")
                                                .value()),
                                env.callMethod(
                                        this,
                                        "wrap",
                                        MySqlGrammar.class,
                                        toObjectR(command)
                                                .accessProp(this, env)
                                                .name("to")
                                                .value()))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tables")
    public Object compileDropAllTables(RuntimeEnv env, Object... args) {
        Object tables = assignParameter(args, 0, false);
        return ZVal.assign(
                "drop table "
                        + toStringR(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                ",",
                                                env.callMethod(
                                                        this,
                                                        "wrapArray",
                                                        MySqlGrammar.class,
                                                        tables))
                                        .value(),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "views")
    public Object compileDropAllViews(RuntimeEnv env, Object... args) {
        Object views = assignParameter(args, 0, false);
        return ZVal.assign(
                "drop view "
                        + toStringR(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                ",",
                                                env.callMethod(
                                                        this,
                                                        "wrapArray",
                                                        MySqlGrammar.class,
                                                        views))
                                        .value(),
                                env));
    }

    @ConvertedMethod
    public Object compileGetAllTables(RuntimeEnv env, Object... args) {
        return "SHOW FULL TABLES WHERE table_type = 'BASE TABLE'";
    }

    @ConvertedMethod
    public Object compileGetAllViews(RuntimeEnv env, Object... args) {
        return "SHOW FULL TABLES WHERE table_type = 'VIEW'";
    }

    @ConvertedMethod
    public Object compileEnableForeignKeyConstraints(RuntimeEnv env, Object... args) {
        return "SET FOREIGN_KEY_CHECKS=1;";
    }

    @ConvertedMethod
    public Object compileDisableForeignKeyConstraints(RuntimeEnv env, Object... args) {
        return "SET FOREIGN_KEY_CHECKS=0;";
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
        return "mediumtext";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeLongText(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "longtext";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeBigInteger(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "bigint";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeInteger(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "int";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeMediumInteger(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "mediumint";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeTinyInteger(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "tinyint";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeSmallInteger(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "smallint";
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
        if (ZVal.toBool(toObjectR(column).accessProp(this, env).name("total").value())
                && ZVal.toBool(toObjectR(column).accessProp(this, env).name("places").value())) {
            return ZVal.assign(
                    "double("
                            + toStringR(
                                    toObjectR(column).accessProp(this, env).name("total").value(),
                                    env)
                            + ", "
                            + toStringR(
                                    toObjectR(column).accessProp(this, env).name("places").value(),
                                    env)
                            + ")");
        }

        return "double";
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
                                "enum(%s)",
                                env.callMethod(
                                        this,
                                        "quoteString",
                                        MySqlGrammar.class,
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
        return "json";
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
                toObjectR(column).accessProp(this, env).name("precision").getBool()
                        ? "datetime("
                                + toStringR(
                                        toObjectR(column)
                                                .accessProp(this, env)
                                                .name("precision")
                                                .value(),
                                        env)
                                + ")"
                        : "datetime");
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
        return ZVal.assign(
                toObjectR(column).accessProp(this, env).name("precision").getBool()
                        ? "time("
                                + toStringR(
                                        toObjectR(column)
                                                .accessProp(this, env)
                                                .name("precision")
                                                .value(),
                                        env)
                                + ")"
                        : "time");
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
        Object columnType = null;
        columnType =
                ZVal.assign(
                        toObjectR(column).accessProp(this, env).name("precision").getBool()
                                ? "timestamp("
                                        + toStringR(
                                                toObjectR(column)
                                                        .accessProp(this, env)
                                                        .name("precision")
                                                        .value(),
                                                env)
                                        + ")"
                                : "timestamp");
        return ZVal.assign(
                toObjectR(column).accessProp(this, env).name("useCurrent").getBool()
                        ? toStringR(columnType, env) + " default CURRENT_TIMESTAMP"
                        : columnType);
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
        return "year";
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
        return "char(36)";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeIpAddress(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "varchar(45)";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeMacAddress(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "varchar(17)";
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
    protected Object modifyVirtualAs(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object column = assignParameter(args, 1, false);
        if (!function_is_null
                .f
                .env(env)
                .call(toObjectR(column).accessProp(this, env).name("virtualAs").value())
                .getBool()) {
            return ZVal.assign(
                    " as ("
                            + toStringR(
                                    toObjectR(column)
                                            .accessProp(this, env)
                                            .name("virtualAs")
                                            .value(),
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
    @ConvertedParameter(index = 1, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object modifyStoredAs(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object column = assignParameter(args, 1, false);
        if (!function_is_null
                .f
                .env(env)
                .call(toObjectR(column).accessProp(this, env).name("storedAs").value())
                .getBool()) {
            return ZVal.assign(
                    " as ("
                            + toStringR(
                                    toObjectR(column)
                                            .accessProp(this, env)
                                            .name("storedAs")
                                            .value(),
                                    env)
                            + ") stored");
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
    protected Object modifyUnsigned(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object column = assignParameter(args, 1, false);
        if (toObjectR(column).accessProp(this, env).name("unsigned").getBool()) {
            return " unsigned";
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
    protected Object modifyCharset(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object column = assignParameter(args, 1, false);
        if (!function_is_null
                .f
                .env(env)
                .call(toObjectR(column).accessProp(this, env).name("charset").value())
                .getBool()) {
            return ZVal.assign(
                    " character set "
                            + toStringR(
                                    toObjectR(column).accessProp(this, env).name("charset").value(),
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
    protected Object modifyCollate(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object column = assignParameter(args, 1, false);
        if (!function_is_null
                .f
                .env(env)
                .call(toObjectR(column).accessProp(this, env).name("collation").value())
                .getBool()) {
            return ZVal.assign(
                    " collate '"
                            + toStringR(
                                    toObjectR(column)
                                            .accessProp(this, env)
                                            .name("collation")
                                            .value(),
                                    env)
                            + "'");
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
    protected Object modifyNullable(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object column = assignParameter(args, 1, false);
        if (ZVal.toBool(
                        function_is_null
                                .f
                                .env(env)
                                .call(
                                        toObjectR(column)
                                                .accessProp(this, env)
                                                .name("virtualAs")
                                                .value())
                                .value())
                && ZVal.toBool(
                        function_is_null
                                .f
                                .env(env)
                                .call(
                                        toObjectR(column)
                                                .accessProp(this, env)
                                                .name("storedAs")
                                                .value())
                                .value())) {
            return ZVal.assign(
                    toObjectR(column).accessProp(this, env).name("nullable").getBool()
                            ? " null"
                            : " not null");
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
                                            MySqlGrammar.class,
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
            return " auto_increment primary key";
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
    protected Object modifyFirst(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object column = assignParameter(args, 1, false);
        if (!function_is_null
                .f
                .env(env)
                .call(toObjectR(column).accessProp(this, env).name("first").value())
                .getBool()) {
            return " first";
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
    protected Object modifyAfter(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object column = assignParameter(args, 1, false);
        if (!function_is_null
                .f
                .env(env)
                .call(toObjectR(column).accessProp(this, env).name("after").value())
                .getBool()) {
            return ZVal.assign(
                    " after "
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "wrap",
                                            MySqlGrammar.class,
                                            toObjectR(column)
                                                    .accessProp(this, env)
                                                    .name("after")
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
    protected Object modifyComment(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object column = assignParameter(args, 1, false);
        if (!function_is_null
                .f
                .env(env)
                .call(toObjectR(column).accessProp(this, env).name("comment").value())
                .getBool()) {
            return ZVal.assign(
                    " comment '"
                            + toStringR(
                                    NamespaceGlobal.addslashes
                                            .env(env)
                                            .call(
                                                    toObjectR(column)
                                                            .accessProp(this, env)
                                                            .name("comment")
                                                            .value())
                                            .value(),
                                    env)
                            + "'");
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
    protected Object modifySrid(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object column = assignParameter(args, 1, false);
        if (ZVal.toBool(
                        ZVal.toBool(
                                        !function_is_null
                                                .f
                                                .env(env)
                                                .call(
                                                        toObjectR(column)
                                                                .accessProp(this, env)
                                                                .name("srid")
                                                                .value())
                                                .getBool())
                                && ZVal.toBool(
                                        function_is_int
                                                .f
                                                .env(env)
                                                .call(
                                                        toObjectR(column)
                                                                .accessProp(this, env)
                                                                .name("srid")
                                                                .value())
                                                .value()))
                && ZVal.toBool(
                        ZVal.isGreaterThan(
                                toObjectR(column).accessProp(this, env).name("srid").value(),
                                '>',
                                0))) {
            return ZVal.assign(
                    " srid "
                            + toStringR(
                                    toObjectR(column).accessProp(this, env).name("srid").value(),
                                    env));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object wrapValue(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (ZVal.strictNotEqualityCheck(value, "!==", "*")) {
            return ZVal.assign(
                    "`"
                            + toStringR(
                                    function_str_replace.f.env(env).call("`", "``", value).value(),
                                    env)
                            + "`");
        }

        return ZVal.assign(value);
    }

    public static final Object CONST_class = "Illuminate\\Database\\Schema\\Grammars\\MySqlGrammar";

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
                    .setName("Illuminate\\Database\\Schema\\Grammars\\MySqlGrammar")
                    .setLookup(
                            MySqlGrammar.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "fluentCommands", "modifiers", "serials", "tablePrefix", "transactions")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Schema/Grammars/MySqlGrammar.php")
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
