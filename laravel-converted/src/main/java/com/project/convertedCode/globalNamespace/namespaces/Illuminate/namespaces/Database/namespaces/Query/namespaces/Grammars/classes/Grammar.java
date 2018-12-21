package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.namespaces.Grammars.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_stripos;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.functions.collect;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.classes.JoinClause;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/Grammar.php

*/

public class Grammar
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Database
                .classes
                .Grammar {

    public Object operators = ZVal.newArray();

    public Object selectComponents =
            ZVal.arrayFromList(
                    "aggregate",
                    "columns",
                    "from",
                    "joins",
                    "wheres",
                    "groups",
                    "havings",
                    "orders",
                    "limit",
                    "offset",
                    "unions",
                    "lock");

    public Grammar(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Grammar(NoConstructor n) {
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
        Object original = null;
        Object sql = null;
        original = ZVal.assign(toObjectR(query).accessProp(this, env).name("columns").value());
        if (function_is_null
                .f
                .env(env)
                .call(toObjectR(query).accessProp(this, env).name("columns").value())
                .getBool()) {
            toObjectR(query).accessProp(this, env).name("columns").set(ZVal.arrayFromList("*"));
        }

        sql =
                function_trim
                        .f
                        .env(env)
                        .call(this.concatenate(env, this.compileComponents(env, query)))
                        .value();
        toObjectR(query).accessProp(this, env).name("columns").set(original);
        return ZVal.assign(sql);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    protected Object compileComponents(RuntimeEnv env, Object... args) {
        ReferenceContainer query = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object component = null;
        Object method = null;
        ReferenceContainer sql = new BasicReferenceContainer(null);
        sql.setObject(ZVal.newArray());
        for (ZPair zpairResult353 : ZVal.getIterable(this.selectComponents, env, true)) {
            component = ZVal.assign(zpairResult353.getValue());
            if (!function_is_null
                    .f
                    .env(env)
                    .call(
                            toObjectR(query.getObject())
                                    .accessProp(this, env)
                                    .name(component)
                                    .value())
                    .getBool()) {
                method =
                        "compile"
                                + toStringR(
                                        NamespaceGlobal.ucfirst.env(env).call(component).value(),
                                        env);
                sql.arrayAccess(env, component)
                        .set(
                                env.callMethod(
                                        this,
                                        new RuntimeArgsWithReferences()
                                                .add(0, query)
                                                .add(
                                                        1,
                                                        new ReferenceClassProperty(
                                                                query.getObject(), component, env)),
                                        toStringR(method, env),
                                        Grammar.class,
                                        query.getObject(),
                                        toObjectR(query.getObject())
                                                .accessProp(this, env)
                                                .name(component)
                                                .value()));
            }
        }

        return ZVal.assign(sql.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "aggregate")
    protected Object compileAggregate(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        ReferenceContainer aggregate = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object column = null;
        column =
                env.callMethod(
                        this, "columnize", Grammar.class, aggregate.arrayGet(env, "columns"));
        if (ZVal.toBool(toObjectR(query).accessProp(this, env).name("distinct").value())
                && ZVal.toBool(ZVal.strictNotEqualityCheck(column, "!==", "*"))) {
            column = "distinct " + toStringR(column, env);
        }

        return ZVal.assign(
                "select "
                        + toStringR(aggregate.arrayGet(env, "function"), env)
                        + "("
                        + toStringR(column, env)
                        + ") as aggregate");
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
        return ZVal.assign(
                toStringR(select, env)
                        + toStringR(
                                env.callMethod(this, "columnize", Grammar.class, columns), env));
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
        return ZVal.assign(
                "from " + toStringR(env.callMethod(this, "wrapTable", Grammar.class, table), env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "joins")
    protected Object compileJoins(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/Grammar.php");
        Object query = assignParameter(args, 0, false);
        Object joins = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(joins).value(),
                                "map",
                                Grammar.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Query\\Grammars",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "join")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object join = assignParameter(args, 0, false);
                                        Object nestedJoins = null;
                                        Object query = null;
                                        Object table = null;
                                        query = this.contextReferences.getCapturedValue("query");
                                        table =
                                                env.callMethod(
                                                        _closureThisVar,
                                                        "wrapTable",
                                                        Grammar.class,
                                                        toObjectR(join)
                                                                .accessProp(this, env)
                                                                .name("table")
                                                                .value());
                                        nestedJoins =
                                                ZVal.assign(
                                                        function_is_null
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                toObjectR(join)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "joins")
                                                                                        .value())
                                                                        .getBool()
                                                                ? ""
                                                                : " "
                                                                        + toStringR(
                                                                                Grammar.this
                                                                                        .compileJoins(
                                                                                                env,
                                                                                                query,
                                                                                                toObjectR(
                                                                                                                join)
                                                                                                        .accessProp(
                                                                                                                this,
                                                                                                                env)
                                                                                                        .name(
                                                                                                                "joins")
                                                                                                        .value()),
                                                                                env));
                                        return ZVal.assign(
                                                function_trim
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                toStringR(
                                                                                toObjectR(join)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "type")
                                                                                        .value(),
                                                                                env)
                                                                        + " join "
                                                                        + toStringR(table, env)
                                                                        + toStringR(
                                                                                nestedJoins, env)
                                                                        + " "
                                                                        + toStringR(
                                                                                Grammar.this
                                                                                        .compileWheres(
                                                                                                env,
                                                                                                join),
                                                                                env))
                                                        .value());
                                    }
                                }.use("query", query)),
                        "implode",
                        Grammar.class,
                        " "));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    protected Object compileWheres(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object sql = null;
        if (function_is_null
                .f
                .env(env)
                .call(toObjectR(query).accessProp(this, env).name("wheres").value())
                .getBool()) {
            return "";
        }

        if (ZVal.isGreaterThan(
                function_count.f.env(env).call(sql = this.compileWheresToArray(env, query)).value(),
                '>',
                0)) {
            return ZVal.assign(this.concatenateWhereClauses(env, query, sql));
        }

        return "";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    protected Object compileWheresToArray(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/Grammar.php");
        Object query = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                collect.f
                                        .env(env)
                                        .call(
                                                toObjectR(query)
                                                        .accessProp(this, env)
                                                        .name("wheres")
                                                        .value())
                                        .value(),
                                "map",
                                Grammar.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Query\\Grammars",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "where")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        ReferenceContainer where =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        ReferenceContainer query =
                                                new BasicReferenceContainer(null);
                                        query =
                                                this.contextReferences.getReferenceContainer(
                                                        "query");
                                        return ZVal.assign(
                                                toStringR(where.arrayGet(env, "boolean"), env)
                                                        + " "
                                                        + toStringR(
                                                                env.callMethod(
                                                                        _closureThisVar,
                                                                        new RuntimeArgsWithReferences()
                                                                                .add(0, query)
                                                                                .add(1, where),
                                                                        toStringR(
                                                                                "where"
                                                                                        + toStringR(
                                                                                                where
                                                                                                        .arrayGet(
                                                                                                                env,
                                                                                                                "type"),
                                                                                                env),
                                                                                env),
                                                                        Grammar.class,
                                                                        query.getObject(),
                                                                        where.getObject()),
                                                                env));
                                    }
                                }.use("query", query)),
                        "all",
                        Grammar.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "sql")
    protected Object concatenateWhereClauses(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object sql = assignParameter(args, 1, false);
        Object conjunction = null;
        conjunction =
                ZVal.assign(
                        ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                query,
                                                JoinClause.class,
                                                "Illuminate\\Database\\Query\\JoinClause"))
                                ? "on"
                                : "where");
        return ZVal.assign(
                toStringR(conjunction, env)
                        + " "
                        + toStringR(
                                this.removeLeadingBoolean(
                                        env,
                                        NamespaceGlobal.implode.env(env).call(" ", sql).value()),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "where")
    protected Object whereRaw(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        ReferenceContainer where = new BasicReferenceContainer(assignParameter(args, 1, false));
        return ZVal.assign(where.arrayGet(env, "sql"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "where")
    protected Object whereBasic(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        ReferenceContainer where = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object value = null;
        value = env.callMethod(this, "parameter", Grammar.class, where.arrayGet(env, "value"));
        return ZVal.assign(
                toStringR(this.wrap(env, where.arrayGet(env, "column")), env)
                        + " "
                        + toStringR(where.arrayGet(env, "operator"), env)
                        + " "
                        + toStringR(value, env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "where")
    protected Object whereIn(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        ReferenceContainer where = new BasicReferenceContainer(assignParameter(args, 1, false));
        if (!arrayActionR(ArrayAction.EMPTY, where, env, "values")) {
            return ZVal.assign(
                    toStringR(this.wrap(env, where.arrayGet(env, "column")), env)
                            + " in ("
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "parameterize",
                                            Grammar.class,
                                            where.arrayGet(env, "values")),
                                    env)
                            + ")");
        }

        return "0 = 1";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "where")
    protected Object whereNotIn(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        ReferenceContainer where = new BasicReferenceContainer(assignParameter(args, 1, false));
        if (!arrayActionR(ArrayAction.EMPTY, where, env, "values")) {
            return ZVal.assign(
                    toStringR(this.wrap(env, where.arrayGet(env, "column")), env)
                            + " not in ("
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "parameterize",
                                            Grammar.class,
                                            where.arrayGet(env, "values")),
                                    env)
                            + ")");
        }

        return "1 = 1";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "where")
    protected Object whereInSub(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        ReferenceContainer where = new BasicReferenceContainer(assignParameter(args, 1, false));
        return ZVal.assign(
                toStringR(this.wrap(env, where.arrayGet(env, "column")), env)
                        + " in ("
                        + toStringR(this.compileSelect(env, where.arrayGet(env, "query")), env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "where")
    protected Object whereNotInSub(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        ReferenceContainer where = new BasicReferenceContainer(assignParameter(args, 1, false));
        return ZVal.assign(
                toStringR(this.wrap(env, where.arrayGet(env, "column")), env)
                        + " not in ("
                        + toStringR(this.compileSelect(env, where.arrayGet(env, "query")), env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "where")
    protected Object whereNull(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        ReferenceContainer where = new BasicReferenceContainer(assignParameter(args, 1, false));
        return ZVal.assign(
                toStringR(this.wrap(env, where.arrayGet(env, "column")), env) + " is null");
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "where")
    protected Object whereNotNull(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        ReferenceContainer where = new BasicReferenceContainer(assignParameter(args, 1, false));
        return ZVal.assign(
                toStringR(this.wrap(env, where.arrayGet(env, "column")), env) + " is not null");
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "where")
    protected Object whereBetween(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        ReferenceContainer where = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object min = null;
        Object max = null;
        Object between = null;
        between = ZVal.assign(ZVal.isTrue(where.arrayGet(env, "not")) ? "not between" : "between");
        min =
                env.callMethod(
                        this,
                        "parameter",
                        Grammar.class,
                        function_reset.f.env(env).call(where.arrayGet(env, "values")).value());
        max =
                env.callMethod(
                        this,
                        "parameter",
                        Grammar.class,
                        function_end.f.env(env).call(where.arrayGet(env, "values")).value());
        return ZVal.assign(
                toStringR(this.wrap(env, where.arrayGet(env, "column")), env)
                        + " "
                        + toStringR(between, env)
                        + " "
                        + toStringR(min, env)
                        + " and "
                        + toStringR(max, env));
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
        Object where = assignParameter(args, 1, false);
        return ZVal.assign(this.dateBasedWhere(env, "date", query, where));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "where")
    protected Object whereTime(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object where = assignParameter(args, 1, false);
        return ZVal.assign(this.dateBasedWhere(env, "time", query, where));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "where")
    protected Object whereDay(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object where = assignParameter(args, 1, false);
        return ZVal.assign(this.dateBasedWhere(env, "day", query, where));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "where")
    protected Object whereMonth(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object where = assignParameter(args, 1, false);
        return ZVal.assign(this.dateBasedWhere(env, "month", query, where));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "where")
    protected Object whereYear(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object where = assignParameter(args, 1, false);
        return ZVal.assign(this.dateBasedWhere(env, "year", query, where));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(
        index = 1,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 2, name = "where")
    protected Object dateBasedWhere(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object query = assignParameter(args, 1, false);
        ReferenceContainer where = new BasicReferenceContainer(assignParameter(args, 2, false));
        Object value = null;
        value = env.callMethod(this, "parameter", Grammar.class, where.arrayGet(env, "value"));
        return ZVal.assign(
                toStringR(type, env)
                        + "("
                        + toStringR(this.wrap(env, where.arrayGet(env, "column")), env)
                        + ") "
                        + toStringR(where.arrayGet(env, "operator"), env)
                        + " "
                        + toStringR(value, env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "where")
    protected Object whereColumn(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        ReferenceContainer where = new BasicReferenceContainer(assignParameter(args, 1, false));
        return ZVal.assign(
                toStringR(this.wrap(env, where.arrayGet(env, "first")), env)
                        + " "
                        + toStringR(where.arrayGet(env, "operator"), env)
                        + " "
                        + toStringR(this.wrap(env, where.arrayGet(env, "second")), env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "where")
    protected Object whereNested(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        ReferenceContainer where = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object offset = null;
        offset =
                ZVal.assign(
                        ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                query,
                                                JoinClause.class,
                                                "Illuminate\\Database\\Query\\JoinClause"))
                                ? 3
                                : 6);
        return ZVal.assign(
                "("
                        + toStringR(
                                function_substr
                                        .f
                                        .env(env)
                                        .call(
                                                this.compileWheres(
                                                        env, where.arrayGet(env, "query")),
                                                offset)
                                        .value(),
                                env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "where")
    protected Object whereSub(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        ReferenceContainer where = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object select = null;
        select = this.compileSelect(env, where.arrayGet(env, "query"));
        return ZVal.assign(
                toStringR(this.wrap(env, where.arrayGet(env, "column")), env)
                        + " "
                        + toStringR(where.arrayGet(env, "operator"), env)
                        + toStringR(" (" + toStringR(select, env) + ")", env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "where")
    protected Object whereExists(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        ReferenceContainer where = new BasicReferenceContainer(assignParameter(args, 1, false));
        return ZVal.assign(
                "exists ("
                        + toStringR(this.compileSelect(env, where.arrayGet(env, "query")), env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "where")
    protected Object whereNotExists(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        ReferenceContainer where = new BasicReferenceContainer(assignParameter(args, 1, false));
        return ZVal.assign(
                "not exists ("
                        + toStringR(this.compileSelect(env, where.arrayGet(env, "query")), env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "where")
    protected Object whereRowValues(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        ReferenceContainer where = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object values = null;
        values = env.callMethod(this, "parameterize", Grammar.class, where.arrayGet(env, "values"));
        return ZVal.assign(
                "("
                        + toStringR(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(", ", where.arrayGet(env, "columns"))
                                        .value(),
                                env)
                        + ") "
                        + toStringR(where.arrayGet(env, "operator"), env)
                        + " ("
                        + toStringR(values, env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "where")
    protected Object whereJsonContains(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        ReferenceContainer where = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object not = null;
        not = ZVal.assign(ZVal.isTrue(where.arrayGet(env, "not")) ? "not " : "");
        return ZVal.assign(
                toStringR(not, env)
                        + toStringR(
                                this.compileJsonContains(
                                        env,
                                        where.arrayGet(env, "column"),
                                        env.callMethod(
                                                this,
                                                "parameter",
                                                Grammar.class,
                                                where.arrayGet(env, "value"))),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "value")
    protected Object compileJsonContains(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        throw ZVal.getException(
                env,
                new RuntimeException(
                        env, "This database engine does not support JSON contains operations."));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "binding")
    public Object prepareBindingForJsonContains(RuntimeEnv env, Object... args) {
        Object binding = assignParameter(args, 0, false);
        return ZVal.assign(NamespaceGlobal.json_encode.env(env).call(binding).value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "groups")
    protected Object compileGroups(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object groups = assignParameter(args, 1, false);
        return ZVal.assign(
                "group by "
                        + toStringR(env.callMethod(this, "columnize", Grammar.class, groups), env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "havings")
    protected Object compileHavings(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object havings = assignParameter(args, 1, false);
        Object sql = null;
        sql =
                NamespaceGlobal.implode
                        .env(env)
                        .call(
                                " ",
                                function_array_map
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.newArray(
                                                        new ZPair(0, this),
                                                        new ZPair(1, "compileHaving")),
                                                havings)
                                        .value())
                        .value();
        return ZVal.assign("having " + toStringR(this.removeLeadingBoolean(env, sql), env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "having", typeHint = "array")
    protected Object compileHaving(RuntimeEnv env, Object... args) {
        ReferenceContainer having = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.strictEqualityCheck(having.arrayGet(env, "type"), "===", "Raw")) {
            return ZVal.assign(
                    toStringR(having.arrayGet(env, "boolean"), env)
                            + " "
                            + toStringR(having.arrayGet(env, "sql"), env));
        }

        return ZVal.assign(this.compileBasicHaving(env, having.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "having")
    protected Object compileBasicHaving(RuntimeEnv env, Object... args) {
        ReferenceContainer having = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object parameter = null;
        Object column = null;
        column = this.wrap(env, having.arrayGet(env, "column"));
        parameter = env.callMethod(this, "parameter", Grammar.class, having.arrayGet(env, "value"));
        return ZVal.assign(
                toStringR(having.arrayGet(env, "boolean"), env)
                        + " "
                        + toStringR(column, env)
                        + " "
                        + toStringR(having.arrayGet(env, "operator"), env)
                        + " "
                        + toStringR(parameter, env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "orders")
    protected Object compileOrders(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object orders = assignParameter(args, 1, false);
        if (!ZVal.isEmpty(orders)) {
            return ZVal.assign(
                    "order by "
                            + toStringR(
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call(
                                                    ", ",
                                                    this.compileOrdersToArray(env, query, orders))
                                            .value(),
                                    env));
        }

        return "";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "orders")
    protected Object compileOrdersToArray(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/Grammar.php");
        Object query = assignParameter(args, 0, false);
        Object orders = assignParameter(args, 1, false);
        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Query\\Grammars",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "order")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        ReferenceContainer order =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        return ZVal.assign(
                                                !arrayActionR(ArrayAction.ISSET, order, env, "sql")
                                                        ? toStringR(
                                                                        Grammar.this.wrap(
                                                                                env,
                                                                                order.arrayGet(
                                                                                        env,
                                                                                        "column")),
                                                                        env)
                                                                + " "
                                                                + toStringR(
                                                                        order.arrayGet(
                                                                                env, "direction"),
                                                                        env)
                                                        : order.arrayGet(env, "sql"));
                                    }
                                },
                                orders)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "seed")
    public Object compileRandom(RuntimeEnv env, Object... args) {
        Object seed = assignParameter(args, 0, false);
        return "RANDOM()";
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
        return ZVal.assign("limit " + toStringR(ZVal.toLong(limit), env));
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
        return ZVal.assign("offset " + toStringR(ZVal.toLong(offset), env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    protected Object compileUnions(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object union = null;
        Object sql = null;
        sql = "";
        for (ZPair zpairResult354 :
                ZVal.getIterable(
                        toObjectR(query).accessProp(this, env).name("unions").value(), env, true)) {
            union = ZVal.assign(zpairResult354.getValue());
            sql = toStringR(sql, env) + toStringR(this.compileUnion(env, union), env);
        }

        if (!ZVal.isEmpty(toObjectR(query).accessProp(this, env).name("unionOrders").value())) {
            sql =
                    toStringR(sql, env)
                            + " "
                            + toStringR(
                                    this.compileOrders(
                                            env,
                                            query,
                                            toObjectR(query)
                                                    .accessProp(this, env)
                                                    .name("unionOrders")
                                                    .value()),
                                    env);
        }

        if (ZVal.isset(toObjectR(query).accessProp(this, env).name("unionLimit").value())) {
            sql =
                    toStringR(sql, env)
                            + " "
                            + toStringR(
                                    this.compileLimit(
                                            env,
                                            query,
                                            toObjectR(query)
                                                    .accessProp(this, env)
                                                    .name("unionLimit")
                                                    .value()),
                                    env);
        }

        if (ZVal.isset(toObjectR(query).accessProp(this, env).name("unionOffset").value())) {
            sql =
                    toStringR(sql, env)
                            + " "
                            + toStringR(
                                    this.compileOffset(
                                            env,
                                            query,
                                            toObjectR(query)
                                                    .accessProp(this, env)
                                                    .name("unionOffset")
                                                    .value()),
                                    env);
        }

        return ZVal.assign(function_ltrim.f.env(env).call(sql).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "union", typeHint = "array")
    protected Object compileUnion(RuntimeEnv env, Object... args) {
        ReferenceContainer union = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object conjunction = null;
        conjunction =
                ZVal.assign(ZVal.isTrue(union.arrayGet(env, "all")) ? " union all " : " union ");
        return ZVal.assign(
                toStringR(conjunction, env)
                        + toStringR(
                                env.callMethod(
                                        union.arrayGet(env, "query"), "toSql", Grammar.class),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    public Object compileExists(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object select = null;
        select = this.compileSelect(env, query);
        return ZVal.assign(
                "select exists("
                        + toStringR(select, env)
                        + ") as "
                        + toStringR(this.wrap(env, "exists"), env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "values", typeHint = "array")
    public Object compileInsert(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/Grammar.php");
        Object query = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        Object columns = null;
        Object parameters = null;
        Object table = null;
        table =
                env.callMethod(
                        this,
                        "wrapTable",
                        Grammar.class,
                        toObjectR(query).accessProp(this, env).name("from").value());
        if (!function_is_array
                .f
                .env(env)
                .call(function_reset.f.env(env).call(values).value())
                .getBool()) {
            values = ZVal.newArray(new ZPair(0, values));
        }

        columns =
                env.callMethod(
                        this,
                        "columnize",
                        Grammar.class,
                        function_array_keys
                                .f
                                .env(env)
                                .call(function_reset.f.env(env).call(values).value())
                                .value());
        parameters =
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(values).value(),
                                "map",
                                Grammar.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Query\\Grammars",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "record")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object record = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                "("
                                                        + toStringR(
                                                                env.callMethod(
                                                                        _closureThisVar,
                                                                        "parameterize",
                                                                        Grammar.class,
                                                                        record),
                                                                env)
                                                        + ")");
                                    }
                                }),
                        "implode",
                        Grammar.class,
                        ", ");
        return ZVal.assign(
                "insert into "
                        + toStringR(table, env)
                        + " ("
                        + toStringR(columns, env)
                        + ") values "
                        + toStringR(parameters, env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "values")
    @ConvertedParameter(index = 2, name = "sequence")
    public Object compileInsertGetId(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        Object sequence = assignParameter(args, 2, false);
        return ZVal.assign(this.compileInsert(env, query, values));
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
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/Grammar.php");
        Object query = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        Object joins = null;
        Object wheres = null;
        Object columns = null;
        Object table = null;
        table =
                env.callMethod(
                        this,
                        "wrapTable",
                        Grammar.class,
                        toObjectR(query).accessProp(this, env).name("from").value());
        columns =
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(values).value(),
                                "map",
                                Grammar.class,
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
                                                toStringR(Grammar.this.wrap(env, key), env)
                                                        + " = "
                                                        + toStringR(
                                                                env.callMethod(
                                                                        _closureThisVar,
                                                                        "parameter",
                                                                        Grammar.class,
                                                                        value),
                                                                env));
                                    }
                                }),
                        "implode",
                        Grammar.class,
                        ", ");
        joins = "";
        if (ZVal.isset(toObjectR(query).accessProp(this, env).name("joins").value())) {
            joins =
                    " "
                            + toStringR(
                                    this.compileJoins(
                                            env,
                                            query,
                                            toObjectR(query)
                                                    .accessProp(this, env)
                                                    .name("joins")
                                                    .value()),
                                    env);
        }

        wheres = this.compileWheres(env, query);
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
                                        + toStringR(wheres, env))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bindings", typeHint = "array")
    @ConvertedParameter(index = 1, name = "values", typeHint = "array")
    public Object prepareBindingsForUpdate(RuntimeEnv env, Object... args) {
        ReferenceContainer bindings = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object values = assignParameter(args, 1, false);
        Object cleanBindings = null;
        cleanBindings =
                Arr.runtimeStaticObject.except(
                        env, bindings.getObject(), ZVal.arrayFromList("join", "select"));
        return ZVal.assign(
                function_array_values
                        .f
                        .env(env)
                        .call(
                                function_array_merge
                                        .f
                                        .env(env)
                                        .call(
                                                bindings.arrayGet(env, "join"),
                                                values,
                                                Arr.runtimeStaticObject.flatten(env, cleanBindings))
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    public Object compileDelete(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object wheres = null;
        wheres =
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
                                ? this.compileWheres(env, query)
                                : "");
        return ZVal.assign(
                function_trim
                        .f
                        .env(env)
                        .call(
                                "delete from "
                                        + toStringR(
                                                env.callMethod(
                                                        this,
                                                        "wrapTable",
                                                        Grammar.class,
                                                        toObjectR(query)
                                                                .accessProp(this, env)
                                                                .name("from")
                                                                .value()),
                                                env)
                                        + " "
                                        + toStringR(wheres, env))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bindings", typeHint = "array")
    public Object prepareBindingsForDelete(RuntimeEnv env, Object... args) {
        Object bindings = assignParameter(args, 0, false);
        return ZVal.assign(Arr.runtimeStaticObject.flatten(env, bindings));
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
                                "truncate "
                                        + toStringR(
                                                env.callMethod(
                                                        this,
                                                        "wrapTable",
                                                        Grammar.class,
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
    @ConvertedParameter(index = 1, name = "value")
    protected Object compileLock(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(function_is_string.f.env(env).call(value).getBool() ? value : "");
    }

    @ConvertedMethod
    public Object supportsSavepoints(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object compileSavepoint(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign("SAVEPOINT " + toStringR(name, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object compileSavepointRollBack(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign("ROLLBACK TO SAVEPOINT " + toStringR(name, env));
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
        if (ZVal.isTrue(env.callMethod(this, "isExpression", Grammar.class, value))) {
            return ZVal.assign(env.callMethod(this, "getValue", Grammar.class, value));
        }

        if (ZVal.strictNotEqualityCheck(
                function_stripos.f.env(env).call(value, " as ").value(), "!==", false)) {
            return ZVal.assign(
                    env.callMethod(this, "wrapAliasedValue", Grammar.class, value, prefixAlias));
        }

        if (ZVal.isTrue(this.isJsonSelector(env, value))) {
            return ZVal.assign(this.wrapJsonSelector(env, value));
        }

        return ZVal.assign(
                env.callMethod(
                        this,
                        "wrapSegments",
                        Grammar.class,
                        function_explode.f.env(env).call(".", value).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object wrapJsonSelector(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        throw ZVal.getException(
                env,
                new RuntimeException(
                        env, "This database engine does not support JSON operations."));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object isJsonSelector(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(Str.runtimeStaticObject.contains(env, value, "->"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "segments")
    protected Object concatenate(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/Grammar.php");
        Object segments = assignParameter(args, 0, false);
        return ZVal.assign(
                NamespaceGlobal.implode
                        .env(env)
                        .call(
                                " ",
                                function_array_filter
                                        .f
                                        .env(env)
                                        .call(
                                                segments,
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Illuminate\\Database\\Query\\Grammars",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "value")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object value =
                                                                assignParameter(args, 0, false);
                                                        return ZVal.assign(
                                                                ZVal.strictNotEqualityCheck(
                                                                        toStringR(value, env),
                                                                        "!==",
                                                                        ""));
                                                    }
                                                })
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object removeLeadingBoolean(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                function_preg_replace.f.env(env).call("/and |or /i", "", value, 1).value());
    }

    @ConvertedMethod
    public Object getOperators(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.operators);
    }

    public static final Object CONST_class = "Illuminate\\Database\\Query\\Grammars\\Grammar";

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
                    .setName("Illuminate\\Database\\Query\\Grammars\\Grammar")
                    .setLookup(
                            Grammar.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("operators", "selectComponents", "tablePrefix")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/Grammar.php")
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
