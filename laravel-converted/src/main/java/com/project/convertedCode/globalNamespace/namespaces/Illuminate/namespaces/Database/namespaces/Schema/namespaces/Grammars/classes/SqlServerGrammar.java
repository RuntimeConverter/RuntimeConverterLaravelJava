package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.namespaces.Grammars.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.classes.Blueprint;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.namespaces.Grammars.classes.Grammar;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
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

 vendor/laravel/framework/src/Illuminate/Database/Schema/Grammars/SqlServerGrammar.php

*/

public class SqlServerGrammar extends Grammar {

    public Object modifiers = ZVal.arrayFromList("Increment", "Collate", "Nullable", "Default");

    public Object serials =
            ZVal.arrayFromList(
                    "tinyInteger", "smallInteger", "mediumInteger", "integer", "bigInteger");

    public SqlServerGrammar(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.transactions = true;
    }

    public SqlServerGrammar(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object compileTableExists(RuntimeEnv env, Object... args) {
        return "select * from sysobjects where type = 'U' and name = ?";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    public Object compileColumnListing(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        return ZVal.assign(
                "select col.name from sys.columns as col\n                join sys.objects as obj on col.object_id = obj.object_id\n                where obj.type = 'U' and obj.name = '"
                        + toStringR(table, env)
                        + "'");
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
        Object columns = null;
        columns =
                NamespaceGlobal.implode
                        .env(env)
                        .call(
                                ", ",
                                env.callMethod(
                                        this, "getColumns", SqlServerGrammar.class, blueprint))
                        .value();
        return ZVal.assign(
                "create table "
                        + toStringR(this.wrapTable(env, blueprint), env)
                        + toStringR(" (" + toStringR(columns, env) + ")", env));
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
                                "alter table %s add %s",
                                this.wrapTable(env, blueprint),
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                ", ",
                                                env.callMethod(
                                                        this,
                                                        "getColumns",
                                                        SqlServerGrammar.class,
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
    public Object compilePrimary(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "alter table %s add constraint %s primary key (%s)",
                                this.wrapTable(env, blueprint),
                                env.callMethod(
                                        this,
                                        "wrap",
                                        SqlServerGrammar.class,
                                        toObjectR(command)
                                                .accessProp(this, env)
                                                .name("index")
                                                .value()),
                                env.callMethod(
                                        this,
                                        "columnize",
                                        SqlServerGrammar.class,
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
                                        SqlServerGrammar.class,
                                        toObjectR(command)
                                                .accessProp(this, env)
                                                .name("index")
                                                .value()),
                                this.wrapTable(env, blueprint),
                                env.callMethod(
                                        this,
                                        "columnize",
                                        SqlServerGrammar.class,
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
                                        SqlServerGrammar.class,
                                        toObjectR(command)
                                                .accessProp(this, env)
                                                .name("index")
                                                .value()),
                                this.wrapTable(env, blueprint),
                                env.callMethod(
                                        this,
                                        "columnize",
                                        SqlServerGrammar.class,
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
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "create spatial index %s on %s (%s)",
                                env.callMethod(
                                        this,
                                        "wrap",
                                        SqlServerGrammar.class,
                                        toObjectR(command)
                                                .accessProp(this, env)
                                                .name("index")
                                                .value()),
                                this.wrapTable(env, blueprint),
                                env.callMethod(
                                        this,
                                        "columnize",
                                        SqlServerGrammar.class,
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
        return ZVal.assign("drop table " + toStringR(this.wrapTable(env, blueprint), env));
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
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "if exists (select * from INFORMATION_SCHEMA.TABLES where TABLE_NAME = %s) drop table %s",
                                "'"
                                        + toStringR(
                                                function_str_replace
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "'",
                                                                "''",
                                                                toStringR(
                                                                                env.callMethod(
                                                                                        this,
                                                                                        "getTablePrefix",
                                                                                        SqlServerGrammar
                                                                                                .class),
                                                                                env)
                                                                        + toStringR(
                                                                                env.callMethod(
                                                                                        blueprint,
                                                                                        "getTable",
                                                                                        SqlServerGrammar
                                                                                                .class),
                                                                                env))
                                                        .value(),
                                                env)
                                        + "'",
                                this.wrapTable(env, blueprint))
                        .value());
    }

    @ConvertedMethod
    public Object compileDropAllTables(RuntimeEnv env, Object... args) {
        return "EXEC sp_msforeachtable 'DROP TABLE ?'";
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
                        "wrapArray",
                        SqlServerGrammar.class,
                        toObjectR(command).accessProp(this, env).name("columns").value());
        return ZVal.assign(
                "alter table "
                        + toStringR(this.wrapTable(env, blueprint), env)
                        + " drop column "
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
                        SqlServerGrammar.class,
                        toObjectR(command).accessProp(this, env).name("index").value());
        return ZVal.assign(
                "alter table "
                        + toStringR(this.wrapTable(env, blueprint), env)
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
    public Object compileDropUnique(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        Object index = null;
        index =
                env.callMethod(
                        this,
                        "wrap",
                        SqlServerGrammar.class,
                        toObjectR(command).accessProp(this, env).name("index").value());
        return ZVal.assign(
                "drop index "
                        + toStringR(index, env)
                        + " on "
                        + toStringR(this.wrapTable(env, blueprint), env));
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
                        SqlServerGrammar.class,
                        toObjectR(command).accessProp(this, env).name("index").value());
        return ZVal.assign(
                "drop index "
                        + toStringR(index, env)
                        + " on "
                        + toStringR(this.wrapTable(env, blueprint), env));
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
                        SqlServerGrammar.class,
                        toObjectR(command).accessProp(this, env).name("index").value());
        return ZVal.assign(
                "alter table "
                        + toStringR(this.wrapTable(env, blueprint), env)
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
        from = this.wrapTable(env, blueprint);
        return ZVal.assign(
                toStringR("sp_rename " + toStringR(from, env) + ", ", env)
                        + toStringR(
                                this.wrapTable(
                                        env,
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
                                "sp_rename N'%s', %s, N'INDEX'",
                                env.callMethod(
                                        this,
                                        "wrap",
                                        SqlServerGrammar.class,
                                        toStringR(
                                                        env.callMethod(
                                                                blueprint,
                                                                "getTable",
                                                                SqlServerGrammar.class),
                                                        env)
                                                + "."
                                                + toStringR(
                                                        toObjectR(command)
                                                                .accessProp(this, env)
                                                                .name("from")
                                                                .value(),
                                                        env)),
                                env.callMethod(
                                        this,
                                        "wrap",
                                        SqlServerGrammar.class,
                                        toObjectR(command)
                                                .accessProp(this, env)
                                                .name("to")
                                                .value()))
                        .value());
    }

    @ConvertedMethod
    public Object compileEnableForeignKeyConstraints(RuntimeEnv env, Object... args) {
        return "EXEC sp_msforeachtable @command1=\"print '?'\", @command2=\"ALTER TABLE ? WITH CHECK CHECK CONSTRAINT all\";";
    }

    @ConvertedMethod
    public Object compileDisableForeignKeyConstraints(RuntimeEnv env, Object... args) {
        return "EXEC sp_msforeachtable \"ALTER TABLE ? NOCHECK CONSTRAINT all\";";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeChar(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(
                "nchar("
                        + toStringR(
                                toObjectR(column).accessProp(this, env).name("length").value(), env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeString(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(
                "nvarchar("
                        + toStringR(
                                toObjectR(column).accessProp(this, env).name("length").value(), env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeText(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "nvarchar(max)";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeMediumText(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "nvarchar(max)";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeLongText(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "nvarchar(max)";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeInteger(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "int";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeBigInteger(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "bigint";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeMediumInteger(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "int";
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
        return "bit";
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
                                "nvarchar(255) check (\"%s\" in (%s))",
                                toObjectR(column).accessProp(this, env).name("name").value(),
                                env.callMethod(
                                        this,
                                        "quoteString",
                                        SqlServerGrammar.class,
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
        return "nvarchar(max)";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeJsonb(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "nvarchar(max)";
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
                        ? "datetime2("
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
        return ZVal.assign(
                toObjectR(column).accessProp(this, env).name("precision").getBool()
                        ? "datetimeoffset("
                                + toStringR(
                                        toObjectR(column)
                                                .accessProp(this, env)
                                                .name("precision")
                                                .value(),
                                        env)
                                + ")"
                        : "datetimeoffset");
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
                                ? "datetime2("
                                        + toStringR(
                                                toObjectR(column)
                                                        .accessProp(this, env)
                                                        .name("precision")
                                                        .value(),
                                                env)
                                        + ")"
                                : "datetime");
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
        if (toObjectR(column).accessProp(this, env).name("useCurrent").getBool()) {
            columnType =
                    ZVal.assign(
                            toObjectR(column).accessProp(this, env).name("precision").getBool()
                                    ? "datetimeoffset("
                                            + toStringR(
                                                    toObjectR(column)
                                                            .accessProp(this, env)
                                                            .name("precision")
                                                            .value(),
                                                    env)
                                            + ")"
                                    : "datetimeoffset");
            return ZVal.assign(toStringR(columnType, env) + " default CURRENT_TIMESTAMP");
        }

        return ZVal.assign(
                "datetimeoffset("
                        + toStringR(
                                toObjectR(column).accessProp(this, env).name("precision").value(),
                                env)
                        + ")");
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
        return "varbinary(max)";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeUuid(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "uniqueidentifier";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeIpAddress(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "nvarchar(45)";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object typeMacAddress(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "nvarchar(17)";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    public Object typeGeometry(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "geography";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    public Object typePoint(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "geography";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    public Object typeLineString(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "geography";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    public Object typePolygon(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "geography";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    public Object typeGeometryCollection(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "geography";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    public Object typeMultiPoint(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "geography";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    public Object typeMultiLineString(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "geography";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    public Object typeMultiPolygon(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return "geography";
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
                    " collate "
                            + toStringR(
                                    toObjectR(column)
                                            .accessProp(this, env)
                                            .name("collation")
                                            .value(),
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
                                            SqlServerGrammar.class,
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
            return " identity primary key";
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    public Object wrapTable(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                table, Blueprint.class, "Illuminate\\Database\\Schema\\Blueprint"))
                && ZVal.toBool(toObjectR(table).accessProp(this, env).name("temporary").value())) {
            env.callMethod(this, "setTablePrefix", SqlServerGrammar.class, "#");
        }

        return ZVal.assign(super.wrapTable(env, table));
    }

    public static final Object CONST_class =
            "Illuminate\\Database\\Schema\\Grammars\\SqlServerGrammar";

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
                    .setName("Illuminate\\Database\\Schema\\Grammars\\SqlServerGrammar")
                    .setLookup(
                            SqlServerGrammar.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "fluentCommands",
                            "modifiers",
                            "serials",
                            "tablePrefix",
                            "transactions",
                            "transactions")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Schema/Grammars/SqlServerGrammar.php")
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
