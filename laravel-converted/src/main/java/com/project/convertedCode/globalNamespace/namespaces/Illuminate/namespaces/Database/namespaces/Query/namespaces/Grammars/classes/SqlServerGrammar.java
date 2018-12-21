package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.namespaces.Grammars.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_stripos;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.namespaces.Grammars.classes.Grammar;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/SqlServerGrammar.php

*/

public class SqlServerGrammar extends Grammar {

    public SqlServerGrammar(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.operators =
                ZVal.arrayFromList(
                        "=",
                        "<",
                        ">",
                        "<=",
                        ">=",
                        "!<",
                        "!>",
                        "<>",
                        "!=",
                        "like",
                        "not like",
                        "ilike",
                        "&",
                        "&=",
                        "|",
                        "|=",
                        "^",
                        "^=");
    }

    public SqlServerGrammar(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    public Object compileSelect(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        if (!toObjectR(query).accessProp(this, env).name("offset").getBool()) {
            return ZVal.assign(super.compileSelect(env, query));
        }

        if (function_is_null
                .f
                .env(env)
                .call(toObjectR(query).accessProp(this, env).name("columns").value())
                .getBool()) {
            toObjectR(query).accessProp(this, env).name("columns").set(ZVal.arrayFromList("*"));
        }

        return ZVal.assign(
                this.compileAnsiOffset(
                        env,
                        query,
                        env.callMethod(this, "compileComponents", SqlServerGrammar.class, query)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "columns")
    protected Object compileColumns(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object columns = assignParameter(args, 1, false);
        Object select = null;
        if (!function_is_null
                .f
                .env(env)
                .call(toObjectR(query).accessProp(this, env).name("aggregate").value())
                .getBool()) {
            return null;
        }

        select =
                ZVal.assign(
                        toObjectR(query).accessProp(this, env).name("distinct").getBool()
                                ? "select distinct "
                                : "select ");
        if (ZVal.toBool(
                        ZVal.isGreaterThan(
                                toObjectR(query).accessProp(this, env).name("limit").value(),
                                '>',
                                0))
                && ZVal.toBool(
                        ZVal.isLessThanOrEqualTo(
                                toObjectR(query).accessProp(this, env).name("offset").value(),
                                "<=",
                                0))) {
            select =
                    toStringR(select, env)
                            + "top "
                            + toStringR(
                                    toObjectR(query).accessProp(this, env).name("limit").value(),
                                    env)
                            + " ";
        }

        return ZVal.assign(
                toStringR(select, env)
                        + toStringR(
                                env.callMethod(this, "columnize", SqlServerGrammar.class, columns),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "table")
    protected Object compileFrom(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object table = assignParameter(args, 1, false);
        Object from = null;
        from = super.compileFrom(env, query, table);
        if (function_is_string
                .f
                .env(env)
                .call(toObjectR(query).accessProp(this, env).name("lock").value())
                .getBool()) {
            return ZVal.assign(
                    toStringR(from, env)
                            + " "
                            + toStringR(
                                    toObjectR(query).accessProp(this, env).name("lock").value(),
                                    env));
        }

        if (!function_is_null
                .f
                .env(env)
                .call(toObjectR(query).accessProp(this, env).name("lock").value())
                .getBool()) {
            return ZVal.assign(
                    toStringR(from, env)
                            + " with(rowlock,"
                            + toStringR(
                                    toObjectR(query).accessProp(this, env).name("lock").getBool()
                                            ? "updlock,"
                                            : "",
                                    env)
                            + "holdlock)");
        }

        return ZVal.assign(from);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "where")
    protected Object whereDate(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        ReferenceContainer where = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object value = null;
        value =
                env.callMethod(
                        this, "parameter", SqlServerGrammar.class, where.arrayGet(env, "value"));
        return ZVal.assign(
                "cast("
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "wrap",
                                        SqlServerGrammar.class,
                                        where.arrayGet(env, "column")),
                                env)
                        + " as date) "
                        + toStringR(where.arrayGet(env, "operator"), env)
                        + " "
                        + toStringR(value, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "value")
    protected Object compileJsonContains(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object path = null;
        Object field = null;
        ReferenceContainer parts = new BasicReferenceContainer(null);
        parts.setObject(function_explode.f.env(env).call("->", column, 2).value());
        field = env.callMethod(this, "wrap", SqlServerGrammar.class, parts.arrayGet(env, 0));
        path =
                ZVal.assign(
                        ZVal.isGreaterThan(
                                        function_count.f.env(env).call(parts.getObject()).value(),
                                        '>',
                                        1)
                                ? ", "
                                        + toStringR(
                                                this.wrapJsonPath(env, parts.arrayGet(env, 1)), env)
                                : "");
        return ZVal.assign(
                toStringR(value, env)
                        + " in (select [value] from openjson("
                        + toStringR(field, env)
                        + toStringR(path, env)
                        + "))");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "binding")
    public Object prepareBindingForJsonContains(RuntimeEnv env, Object... args) {
        Object binding = assignParameter(args, 0, false);
        return ZVal.assign(
                function_is_bool.f.env(env).call(binding).getBool()
                        ? NamespaceGlobal.json_encode.env(env).call(binding).value()
                        : binding);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "components")
    protected Object compileAnsiOffset(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        ReferenceContainer components =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        Object sql = null;
        if (arrayActionR(ArrayAction.EMPTY, components, env, "orders")) {
            components.arrayAccess(env, "orders").set("order by (select 0)");
        }

        components
                .arrayAccess(env, "columns")
                .set(
                        toStringR(components.arrayGet(env, "columns"), env)
                                + toStringR(
                                        this.compileOver(env, components.arrayGet(env, "orders")),
                                        env));
        arrayActionR(ArrayAction.UNSET, components, env, "orders");
        sql = env.callMethod(this, "concatenate", SqlServerGrammar.class, components.getObject());
        return ZVal.assign(this.compileTableExpression(env, sql, query));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "orderings")
    protected Object compileOver(RuntimeEnv env, Object... args) {
        Object orderings = assignParameter(args, 0, false);
        return ZVal.assign(", row_number() over (" + toStringR(orderings, env) + ") as row_num");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sql")
    @ConvertedParameter(index = 1, name = "query")
    protected Object compileTableExpression(RuntimeEnv env, Object... args) {
        Object sql = assignParameter(args, 0, false);
        Object query = assignParameter(args, 1, false);
        Object constraint = null;
        constraint = this.compileRowConstraint(env, query);
        return ZVal.assign(
                "select * from ("
                        + toStringR(sql, env)
                        + ") as temp_table where row_num "
                        + toStringR(constraint, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    protected Object compileRowConstraint(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object start = null;
        Object finish = null;
        start = ZVal.add(toObjectR(query).accessProp(this, env).name("offset").value(), 1);
        if (ZVal.isGreaterThan(
                toObjectR(query).accessProp(this, env).name("limit").value(), '>', 0)) {
            finish =
                    ZVal.add(
                            toObjectR(query).accessProp(this, env).name("offset").value(),
                            toObjectR(query).accessProp(this, env).name("limit").value());
            return ZVal.assign(
                    "between " + toStringR(start, env) + " and " + toStringR(finish, env));
        }

        return ZVal.assign(">= " + toStringR(start, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "seed")
    public Object compileRandom(RuntimeEnv env, Object... args) {
        Object seed = assignParameter(args, 0, false);
        return "NEWID()";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "limit")
    protected Object compileLimit(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object limit = assignParameter(args, 1, false);
        return "";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "offset")
    protected Object compileOffset(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object offset = assignParameter(args, 1, false);
        return "";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "value")
    protected Object compileLock(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return "";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    public Object compileExists(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object existsQuery = null;
        existsQuery = ZVal.assign(((RuntimeClassInterface) query).phpClone(env));
        toObjectR(existsQuery).accessProp(this, env).name("columns").set(ZVal.newArray());
        return ZVal.assign(
                this.compileSelect(
                        env,
                        env.callMethod(
                                env.callMethod(
                                        existsQuery,
                                        "selectRaw",
                                        SqlServerGrammar.class,
                                        "1 [exists]"),
                                "limit",
                                SqlServerGrammar.class,
                                1)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    public Object compileDelete(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object where = null;
        Object table = null;
        table = this.wrapTable(env, toObjectR(query).accessProp(this, env).name("from").value());
        where =
                ZVal.assign(
                        function_is_array
                                        .f
                                        .env(env)
                                        .call(
                                                toObjectR(query)
                                                        .accessProp(this, env)
                                                        .name("wheres")
                                                        .value())
                                        .getBool()
                                ? env.callMethod(
                                        this, "compileWheres", SqlServerGrammar.class, query)
                                : "");
        return ZVal.assign(
                ZVal.isset(toObjectR(query).accessProp(this, env).name("joins").value())
                        ? this.compileDeleteWithJoins(env, query, table, where)
                        : function_trim
                                .f
                                .env(env)
                                .call(
                                        "delete from "
                                                + toStringR(table, env)
                                                + " "
                                                + toStringR(where, env))
                                .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "table")
    @ConvertedParameter(index = 2, name = "where")
    protected Object compileDeleteWithJoins(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object table = assignParameter(args, 1, false);
        Object where = assignParameter(args, 2, false);
        Object joins = null;
        Object alias = null;
        joins =
                " "
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "compileJoins",
                                        SqlServerGrammar.class,
                                        query,
                                        toObjectR(query)
                                                .accessProp(this, env)
                                                .name("joins")
                                                .value()),
                                env);
        alias =
                ZVal.assign(
                        ZVal.strictNotEqualityCheck(
                                        function_stripos.f.env(env).call(table, " as ").value(),
                                        "!==",
                                        false)
                                ? handleReturnReference(
                                                function_explode
                                                        .f
                                                        .env(env)
                                                        .call(" as ", table)
                                                        .value())
                                        .arrayGet(env, 1)
                                : table);
        return ZVal.assign(
                function_trim
                        .f
                        .env(env)
                        .call(
                                "delete "
                                        + toStringR(alias, env)
                                        + " from "
                                        + toStringR(table, env)
                                        + toStringR(joins, env)
                                        + " "
                                        + toStringR(where, env))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    public Object compileTruncate(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "truncate table "
                                        + toStringR(
                                                this.wrapTable(
                                                        env,
                                                        toObjectR(query)
                                                                .accessProp(this, env)
                                                                .name("from")
                                                                .value()),
                                                env),
                                ZVal.newArray())));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "values")
    public Object compileUpdate(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/SqlServerGrammar.php");
        Object query = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        Object joins = null;
        Object runtimeTempArrayResult51 = null;
        Object columns = null;
        Object alias = null;
        Object where = null;
        Object table = null;
        ZVal.list(
                runtimeTempArrayResult51 =
                        this.parseUpdateTable(
                                env, toObjectR(query).accessProp(this, env).name("from").value()),
                (table = listGet(runtimeTempArrayResult51, 0, env)),
                (alias = listGet(runtimeTempArrayResult51, 1, env)));
        columns =
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(values).value(),
                                "map",
                                SqlServerGrammar.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Query\\Grammars",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "value")
                                    @ConvertedParameter(index = 1, name = "key")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object value = assignParameter(args, 0, false);
                                        Object key = assignParameter(args, 1, false);
                                        return ZVal.assign(
                                                toStringR(
                                                                env.callMethod(
                                                                        _closureThisVar,
                                                                        "wrap",
                                                                        SqlServerGrammar.class,
                                                                        key),
                                                                env)
                                                        + " = "
                                                        + toStringR(
                                                                env.callMethod(
                                                                        _closureThisVar,
                                                                        "parameter",
                                                                        SqlServerGrammar.class,
                                                                        value),
                                                                env));
                                    }
                                }),
                        "implode",
                        SqlServerGrammar.class,
                        ", ");
        joins = "";
        if (ZVal.isset(toObjectR(query).accessProp(this, env).name("joins").value())) {
            joins =
                    " "
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "compileJoins",
                                            SqlServerGrammar.class,
                                            query,
                                            toObjectR(query)
                                                    .accessProp(this, env)
                                                    .name("joins")
                                                    .value()),
                                    env);
        }

        where = env.callMethod(this, "compileWheres", SqlServerGrammar.class, query);
        if (!ZVal.isEmpty(joins)) {
            return ZVal.assign(
                    function_trim
                            .f
                            .env(env)
                            .call(
                                    "update "
                                            + toStringR(alias, env)
                                            + " set "
                                            + toStringR(columns, env)
                                            + " from "
                                            + toStringR(table, env)
                                            + toStringR(joins, env)
                                            + " "
                                            + toStringR(where, env))
                            .value());
        }

        return ZVal.assign(
                function_trim
                        .f
                        .env(env)
                        .call(
                                "update "
                                        + toStringR(table, env)
                                        + toStringR(joins, env)
                                        + " set "
                                        + toStringR(columns, env)
                                        + " "
                                        + toStringR(where, env))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    protected Object parseUpdateTable(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object alias = null;
        table = ZVal.assign(alias = this.wrapTable(env, table));
        if (ZVal.strictNotEqualityCheck(
                function_stripos.f.env(env).call(table, "] as [").value(), "!==", false)) {
            alias =
                    "["
                            + toStringR(
                                    handleReturnReference(
                                                    function_explode
                                                            .f
                                                            .env(env)
                                                            .call("] as [", table)
                                                            .value())
                                            .arrayGet(env, 1),
                                    env);
        }

        return ZVal.assign(ZVal.newArray(new ZPair(0, table), new ZPair(1, alias)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bindings", typeHint = "array")
    @ConvertedParameter(index = 1, name = "values", typeHint = "array")
    public Object prepareBindingsForUpdate(RuntimeEnv env, Object... args) {
        ReferenceContainer bindings = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object values = assignParameter(args, 1, false);
        Object bindingsWithoutJoin = null;
        bindingsWithoutJoin = Arr.runtimeStaticObject.except(env, bindings.getObject(), "join");
        return ZVal.assign(
                function_array_values
                        .f
                        .env(env)
                        .call(
                                function_array_merge
                                        .f
                                        .env(env)
                                        .call(
                                                values,
                                                bindings.arrayGet(env, "join"),
                                                Arr.runtimeStaticObject.flatten(
                                                        env, bindingsWithoutJoin))
                                        .value())
                        .value());
    }

    @ConvertedMethod
    public Object supportsSavepoints(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object compileSavepoint(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign("SAVE TRANSACTION " + toStringR(name, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object compileSavepointRollBack(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign("ROLLBACK TRANSACTION " + toStringR(name, env));
    }

    @ConvertedMethod
    public Object getDateFormat(RuntimeEnv env, Object... args) {
        return "Y-m-d H:i:s.v";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object wrapValue(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.strictEqualityCheck(value, "===", "*")
                        ? value
                        : "["
                                + toStringR(
                                        function_str_replace
                                                .f
                                                .env(env)
                                                .call("]", "]]", value)
                                                .value(),
                                        env)
                                + "]");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object wrapJsonSelector(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object field = null;
        ReferenceContainer parts = new BasicReferenceContainer(null);
        parts.setObject(function_explode.f.env(env).call("->", value, 2).value());
        field =
                env.callMethod(
                        this,
                        "wrapSegments",
                        SqlServerGrammar.class,
                        function_explode
                                .f
                                .env(env)
                                .call(
                                        ".",
                                        function_array_shift
                                                .f
                                                .env(env)
                                                .call(parts.getObject())
                                                .value())
                                .value());
        return ZVal.assign(
                "json_value("
                        + toStringR(field, env)
                        + ", "
                        + toStringR(this.wrapJsonPath(env, parts.arrayGet(env, 0)), env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object wrapJsonPath(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                "'$.\""
                        + toStringR(
                                function_str_replace.f.env(env).call("->", "\".\"", value).value(),
                                env)
                        + "\"'");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    public Object wrapTable(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        return ZVal.assign(this.wrapTableValuedFunction(env, super.wrapTable(env, table)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    protected Object wrapTableValuedFunction(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        ReferenceContainer matches = new BasicReferenceContainer(null);
        if (ZVal.strictEqualityCheck(
                function_preg_match
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                        .call("/^(.+?)(\\(.*?\\))]$/", table, matches.getObject())
                        .value(),
                "===",
                1)) {
            table =
                    toStringR(matches.arrayGet(env, 1), env)
                            + "]"
                            + toStringR(matches.arrayGet(env, 2), env);
        }

        return ZVal.assign(table);
    }

    public static final Object CONST_class =
            "Illuminate\\Database\\Query\\Grammars\\SqlServerGrammar";

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
                    .setName("Illuminate\\Database\\Query\\Grammars\\SqlServerGrammar")
                    .setLookup(
                            SqlServerGrammar.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("operators", "operators", "selectComponents", "tablePrefix")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/SqlServerGrammar.php")
                    .addExtendsClass("Illuminate\\Database\\Query\\Grammars\\Grammar")
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
