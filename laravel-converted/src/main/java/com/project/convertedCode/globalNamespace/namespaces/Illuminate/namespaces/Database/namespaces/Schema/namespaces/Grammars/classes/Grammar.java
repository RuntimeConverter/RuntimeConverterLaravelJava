package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.namespaces.Grammars.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.namespaces.Grammars.classes.RenameColumn;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.classes.Blueprint;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Fluent;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.namespaces.Grammars.classes.ChangeColumn;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.classes.Expression;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Schema/Grammars/Grammar.php

*/

public abstract class Grammar
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Database
                .classes
                .Grammar {

    public Object transactions = false;

    public Object fluentCommands = ZVal.newArray();

    public Grammar(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Grammar(NoConstructor n) {
        super(n);
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
    public Object compileRenameColumn(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        Object connection = assignParameter(args, 2, false);
        return ZVal.assign(
                RenameColumn.runtimeStaticObject.compile(
                        env, this, blueprint, command, connection));
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
    public Object compileChange(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        Object connection = assignParameter(args, 2, false);
        return ZVal.assign(
                ChangeColumn.runtimeStaticObject.compile(
                        env, this, blueprint, command, connection));
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
        sql =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "alter table %s add constraint %s ",
                                this.wrapTable(env, blueprint),
                                this.wrap(
                                        env,
                                        toObjectR(command)
                                                .accessProp(this, env)
                                                .name("index")
                                                .value()))
                        .value();
        sql =
                toStringR(sql, env)
                        + toStringR(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "foreign key (%s) references %s (%s)",
                                                env.callMethod(
                                                        this,
                                                        "columnize",
                                                        Grammar.class,
                                                        toObjectR(command)
                                                                .accessProp(this, env)
                                                                .name("columns")
                                                                .value()),
                                                this.wrapTable(
                                                        env,
                                                        toObjectR(command)
                                                                .accessProp(this, env)
                                                                .name("on")
                                                                .value()),
                                                env.callMethod(
                                                        this,
                                                        "columnize",
                                                        Grammar.class,
                                                        rToArrayCast(
                                                                toObjectR(command)
                                                                        .accessProp(this, env)
                                                                        .name("references")
                                                                        .value())))
                                        .value(),
                                env);
        if (!function_is_null
                .f
                .env(env)
                .call(toObjectR(command).accessProp(this, env).name("onDelete").value())
                .getBool()) {
            sql =
                    toStringR(sql, env)
                            + toStringR(
                                    " on delete "
                                            + toStringR(
                                                    toObjectR(command)
                                                            .accessProp(this, env)
                                                            .name("onDelete")
                                                            .value(),
                                                    env),
                                    env);
        }

        if (!function_is_null
                .f
                .env(env)
                .call(toObjectR(command).accessProp(this, env).name("onUpdate").value())
                .getBool()) {
            sql =
                    toStringR(sql, env)
                            + toStringR(
                                    " on update "
                                            + toStringR(
                                                    toObjectR(command)
                                                            .accessProp(this, env)
                                                            .name("onUpdate")
                                                            .value(),
                                                    env),
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
    protected Object getColumns(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        ReferenceContainer columns = new BasicReferenceContainer(null);
        Object column = null;
        Object sql = null;
        columns.setObject(ZVal.newArray());
        for (ZPair zpairResult367 :
                ZVal.getIterable(
                        env.callMethod(blueprint, "getAddedColumns", Grammar.class), env, true)) {
            column = ZVal.assign(zpairResult367.getValue());
            sql =
                    toStringR(this.wrap(env, column), env)
                            + " "
                            + toStringR(this.getType(env, column), env);
            columns.arrayAppend(env).set(this.addModifiers(env, sql, blueprint, column));
        }

        return ZVal.assign(columns.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object getType(RuntimeEnv env, Object... args) {
        ReferenceContainer column = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, column),
                        "type"
                                + toStringR(
                                        NamespaceGlobal.ucfirst
                                                .env(env)
                                                .call(
                                                        toObjectR(column.getObject())
                                                                .accessProp(this, env)
                                                                .name("type")
                                                                .value())
                                                .value(),
                                        env),
                        Grammar.class,
                        column.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sql")
    @ConvertedParameter(
        index = 1,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 2, name = "column", typeHint = "Illuminate\\Support\\Fluent")
    protected Object addModifiers(RuntimeEnv env, Object... args) {
        Object sql = assignParameter(args, 0, false);
        ReferenceContainer blueprint = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer column = new BasicReferenceContainer(assignParameter(args, 2, false));
        Object method = null;
        Object modifier = null;
        for (ZPair zpairResult368 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("modifiers").value(),
                        env,
                        true)) {
            modifier = ZVal.assign(zpairResult368.getValue());
            if (function_method_exists
                    .f
                    .env(env)
                    .call(this, method = ZVal.assign("modify" + toStringR(modifier, env)))
                    .getBool()) {
                sql =
                        toStringR(sql, env)
                                + toStringR(
                                        env.callMethod(
                                                this,
                                                new RuntimeArgsWithReferences()
                                                        .add(0, blueprint)
                                                        .add(1, column),
                                                toStringR(method, env),
                                                Grammar.class,
                                                blueprint.getObject(),
                                                column.getObject()),
                                        env);
            }
        }

        return ZVal.assign(sql);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "name")
    protected Object getCommandByName(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object commands = null;
        commands = this.getCommandsByName(env, blueprint, name);
        if (ZVal.isGreaterThan(function_count.f.env(env).call(commands).value(), '>', 0)) {
            return ZVal.assign(function_reset.f.env(env).call(commands).value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(index = 1, name = "name")
    protected Object getCommandsByName(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema/Grammars")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Schema/Grammars/Grammar.php");
        Object blueprint = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        return ZVal.assign(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                env.callMethod(blueprint, "getCommands", Grammar.class),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Schema\\Grammars",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "value")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object value = assignParameter(args, 0, false);
                                        Object name = null;
                                        name = this.contextReferences.getCapturedValue("name");
                                        return ZVal.assign(
                                                ZVal.equalityCheck(
                                                        toObjectR(value)
                                                                .accessProp(this, env)
                                                                .name("name")
                                                                .value(),
                                                        name));
                                    }
                                }.use("name", name))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    @ConvertedParameter(index = 1, name = "values", typeHint = "array")
    public Object prefixArray(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema/Grammars")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Schema/Grammars/Grammar.php");
        Object prefix = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Schema\\Grammars",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "value")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object value = assignParameter(args, 0, false);
                                        Object prefix = null;
                                        prefix = this.contextReferences.getCapturedValue("prefix");
                                        return ZVal.assign(
                                                toStringR(prefix, env)
                                                        + " "
                                                        + toStringR(value, env));
                                    }
                                }.use("prefix", prefix),
                                values)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    public Object wrapTable(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        return ZVal.assign(
                super.wrapTable(
                        env,
                        ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                table,
                                                Blueprint.class,
                                                "Illuminate\\Database\\Schema\\Blueprint"))
                                ? env.callMethod(table, "getTable", Grammar.class)
                                : table));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "prefixAlias",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object wrap(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object prefixAlias = assignParameter(args, 1, true);
        if (null == prefixAlias) {
            prefixAlias = false;
        }
        return ZVal.assign(
                super.wrap(
                        env,
                        ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                value, Fluent.class, "Illuminate\\Support\\Fluent"))
                                ? toObjectR(value).accessProp(this, env).name("name").value()
                                : value,
                        prefixAlias));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object getDefaultValue(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        value, Expression.class, "Illuminate\\Database\\Query\\Expression"))) {
            return ZVal.assign(value);
        }

        return ZVal.assign(
                function_is_bool.f.env(env).call(value).getBool()
                        ? "'" + toStringR(ZVal.toLong(value), env) + "'"
                        : "'" + toStringR(toStringR(value, env), env) + "'");
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    @ConvertedParameter(
        index = 1,
        name = "schema",
        typeHint = "Doctrine\\DBAL\\Schema\\AbstractSchemaManager"
    )
    public Object getDoctrineTableDiff(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema/Grammars")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Schema/Grammars/Grammar.php");
        Object blueprint = assignParameter(args, 0, false);
        Object schema = assignParameter(args, 1, false);
        Object table = null;
        table =
                toStringR(env.callMethod(this, "getTablePrefix", Grammar.class), env)
                        + toStringR(env.callMethod(blueprint, "getTable", Grammar.class), env);
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                env.createNew(ZVal.resolveClassAlias(env, "TableDiff"), table),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Schema\\Grammars",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "tableDiff")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object tableDiff = assignParameter(args, 0, false);
                                        Object schema = null;
                                        Object table = null;
                                        schema = this.contextReferences.getCapturedValue("schema");
                                        table = this.contextReferences.getCapturedValue("table");
                                        toObjectR(tableDiff)
                                                .accessProp(this, env)
                                                .name("fromTable")
                                                .set(
                                                        env.callMethod(
                                                                schema,
                                                                "listTableDetails",
                                                                Grammar.class,
                                                                table));
                                        return null;
                                    }
                                }.use("schema", schema).use("table", table))
                        .value());
    }

    @ConvertedMethod
    public Object getFluentCommands(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.fluentCommands);
    }

    @ConvertedMethod
    public Object supportsSchemaTransactions(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.transactions);
    }

    public static final Object CONST_class = "Illuminate\\Database\\Schema\\Grammars\\Grammar";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Illuminate
                    .namespaces
                    .Database
                    .classes
                    .Grammar
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Schema\\Grammars\\Grammar")
                    .setLookup(
                            Grammar.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("fluentCommands", "tablePrefix", "transactions")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Schema/Grammars/Grammar.php")
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
