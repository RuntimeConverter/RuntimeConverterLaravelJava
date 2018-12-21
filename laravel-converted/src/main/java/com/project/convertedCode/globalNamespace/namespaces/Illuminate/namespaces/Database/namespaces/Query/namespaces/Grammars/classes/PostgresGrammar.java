package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.namespaces.Grammars.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
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
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.namespaces.Grammars.classes.Grammar;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/PostgresGrammar.php

*/

public class PostgresGrammar extends Grammar {

    public PostgresGrammar(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.operators =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "=",
                                    "<",
                                    ">",
                                    "<=",
                                    ">=",
                                    "<>",
                                    "!=",
                                    "like",
                                    "not like",
                                    "between",
                                    "ilike",
                                    "not ilike",
                                    "~",
                                    "&",
                                    "|",
                                    "#",
                                    "<<",
                                    ">>",
                                    "<<=",
                                    ">>=",
                                    "&&",
                                    "@>",
                                    "<@",
                                    "?",
                                    "?|",
                                    "?&",
                                    "||",
                                    "-",
                                    "-",
                                    "#-",
                                    "is distinct from",
                                    "is not distinct from");
                        });
    }

    public PostgresGrammar(NoConstructor n) {
        super(n);
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
                        this, "parameter", PostgresGrammar.class, where.arrayGet(env, "value"));
        return ZVal.assign(
                toStringR(
                                env.callMethod(
                                        this,
                                        "wrap",
                                        PostgresGrammar.class,
                                        where.arrayGet(env, "column")),
                                env)
                        + "::date "
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
    protected Object whereTime(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        ReferenceContainer where = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object value = null;
        value =
                env.callMethod(
                        this, "parameter", PostgresGrammar.class, where.arrayGet(env, "value"));
        return ZVal.assign(
                toStringR(
                                env.callMethod(
                                        this,
                                        "wrap",
                                        PostgresGrammar.class,
                                        where.arrayGet(env, "column")),
                                env)
                        + "::time "
                        + toStringR(where.arrayGet(env, "operator"), env)
                        + " "
                        + toStringR(value, env));
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
        value =
                env.callMethod(
                        this, "parameter", PostgresGrammar.class, where.arrayGet(env, "value"));
        return ZVal.assign(
                "extract("
                        + toStringR(type, env)
                        + " from "
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "wrap",
                                        PostgresGrammar.class,
                                        where.arrayGet(env, "column")),
                                env)
                        + ") "
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
        column =
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                "->>",
                                "->",
                                env.callMethod(this, "wrap", PostgresGrammar.class, column))
                        .value();
        return ZVal.assign("(" + toStringR(column, env) + ")::jsonb @> " + toStringR(value, env));
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
        if (!function_is_string.f.env(env).call(value).getBool()) {
            return ZVal.assign(ZVal.isTrue(value) ? "for update" : "for share");
        }

        return ZVal.assign(value);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "values", typeHint = "array")
    public Object compileInsert(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        Object table = null;
        table =
                env.callMethod(
                        this,
                        "wrapTable",
                        PostgresGrammar.class,
                        toObjectR(query).accessProp(this, env).name("from").value());
        return ZVal.assign(
                ZVal.isEmpty(values)
                        ? "insert into " + toStringR(table, env) + " DEFAULT VALUES"
                        : super.compileInsert(env, query, values));
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
        if (function_is_null.f.env(env).call(sequence).getBool()) {
            sequence = "id";
        }

        return ZVal.assign(
                toStringR(this.compileInsert(env, query, values), env)
                        + " returning "
                        + toStringR(
                                env.callMethod(this, "wrap", PostgresGrammar.class, sequence),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "values")
    public Object compileUpdate(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        Object columns = null;
        Object from = null;
        Object where = null;
        Object table = null;
        table =
                env.callMethod(
                        this,
                        "wrapTable",
                        PostgresGrammar.class,
                        toObjectR(query).accessProp(this, env).name("from").value());
        columns = this.compileUpdateColumns(env, values);
        from = this.compileUpdateFrom(env, query);
        where = this.compileUpdateWheres(env, query);
        return ZVal.assign(
                function_trim
                        .f
                        .env(env)
                        .call(
                                "update "
                                        + toStringR(table, env)
                                        + " set "
                                        + toStringR(columns, env)
                                        + toStringR(from, env)
                                        + " "
                                        + toStringR(where, env))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values")
    protected Object compileUpdateColumns(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/PostgresGrammar.php");
        Object values = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(values).value(),
                                "map",
                                PostgresGrammar.class,
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
                                                                        PostgresGrammar.class,
                                                                        key),
                                                                env)
                                                        + " = "
                                                        + toStringR(
                                                                env.callMethod(
                                                                        _closureThisVar,
                                                                        "parameter",
                                                                        PostgresGrammar.class,
                                                                        value),
                                                                env));
                                    }
                                }),
                        "implode",
                        PostgresGrammar.class,
                        ", "));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    protected Object compileUpdateFrom(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/PostgresGrammar.php");
        Object query = assignParameter(args, 0, false);
        Object froms = null;
        if (!ZVal.isset(toObjectR(query).accessProp(this, env).name("joins").value())) {
            return "";
        }

        froms =
                env.callMethod(
                        env.callMethod(
                                collect.f
                                        .env(env)
                                        .call(
                                                toObjectR(query)
                                                        .accessProp(this, env)
                                                        .name("joins")
                                                        .value())
                                        .value(),
                                "map",
                                PostgresGrammar.class,
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
                                        return ZVal.assign(
                                                env.callMethod(
                                                        _closureThisVar,
                                                        "wrapTable",
                                                        PostgresGrammar.class,
                                                        toObjectR(join)
                                                                .accessProp(this, env)
                                                                .name("table")
                                                                .value()));
                                    }
                                }),
                        "all",
                        PostgresGrammar.class);
        if (ZVal.isGreaterThan(function_count.f.env(env).call(froms).value(), '>', 0)) {
            return ZVal.assign(
                    " from "
                            + toStringR(
                                    NamespaceGlobal.implode.env(env).call(", ", froms).value(),
                                    env));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    protected Object compileUpdateWheres(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object joinWheres = null;
        Object baseWheres = null;
        baseWheres = env.callMethod(this, "compileWheres", PostgresGrammar.class, query);
        if (!ZVal.isset(toObjectR(query).accessProp(this, env).name("joins").value())) {
            return ZVal.assign(baseWheres);
        }

        joinWheres = this.compileUpdateJoinWheres(env, query);
        if (ZVal.equalityCheck(function_trim.f.env(env).call(baseWheres).value(), "")) {
            return ZVal.assign(
                    "where "
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "removeLeadingBoolean",
                                            PostgresGrammar.class,
                                            joinWheres),
                                    env));
        }

        return ZVal.assign(toStringR(baseWheres, env) + " " + toStringR(joinWheres, env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    protected Object compileUpdateJoinWheres(RuntimeEnv env, Object... args) {
        ReferenceContainer query = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object method = null;
        ReferenceContainer joinWheres = new BasicReferenceContainer(null);
        ReferenceContainer where = new BasicReferenceContainer(null);
        Object join = null;
        joinWheres.setObject(ZVal.newArray());
        for (ZPair zpairResult355 :
                ZVal.getIterable(
                        toObjectR(query.getObject()).accessProp(this, env).name("joins").value(),
                        env,
                        true)) {
            join = ZVal.assign(zpairResult355.getValue());
            for (ZPair zpairResult356 :
                    ZVal.getIterable(
                            toObjectR(join).accessProp(this, env).name("wheres").value(),
                            env,
                            true)) {
                where.setObject(ZVal.assign(zpairResult356.getValue()));
                method = ZVal.assign("where" + toStringR(where.arrayGet(env, "type"), env));
                joinWheres
                        .arrayAppend(env)
                        .set(
                                toStringR(where.arrayGet(env, "boolean"), env)
                                        + " "
                                        + toStringR(
                                                env.callMethod(
                                                        this,
                                                        new RuntimeArgsWithReferences()
                                                                .add(0, query)
                                                                .add(1, where),
                                                        toStringR(method, env),
                                                        PostgresGrammar.class,
                                                        query.getObject(),
                                                        where.getObject()),
                                                env));
            }
        }

        return ZVal.assign(
                NamespaceGlobal.implode.env(env).call(" ", joinWheres.getObject()).value());
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
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    public Object compileDelete(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object table = null;
        table =
                env.callMethod(
                        this,
                        "wrapTable",
                        PostgresGrammar.class,
                        toObjectR(query).accessProp(this, env).name("from").value());
        return ZVal.assign(
                ZVal.isset(toObjectR(query).accessProp(this, env).name("joins").value())
                        ? this.compileDeleteWithJoins(env, query, table)
                        : super.compileDelete(env, query));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "table")
    protected Object compileDeleteWithJoins(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/PostgresGrammar.php");
        Object query = assignParameter(args, 0, false);
        Object table = assignParameter(args, 1, false);
        Object using = null;
        Object where = null;
        using =
                " USING "
                        + toStringR(
                                env.callMethod(
                                        env.callMethod(
                                                collect.f
                                                        .env(env)
                                                        .call(
                                                                toObjectR(query)
                                                                        .accessProp(this, env)
                                                                        .name("joins")
                                                                        .value())
                                                        .value(),
                                                "map",
                                                PostgresGrammar.class,
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
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object _closureThisVar =
                                                                this.getClosureThisVar();
                                                        Object join =
                                                                assignParameter(args, 0, false);
                                                        return ZVal.assign(
                                                                env.callMethod(
                                                                        _closureThisVar,
                                                                        "wrapTable",
                                                                        PostgresGrammar.class,
                                                                        toObjectR(join)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("table")
                                                                                .value()));
                                                    }
                                                }),
                                        "implode",
                                        PostgresGrammar.class,
                                        ", "),
                                env);
        where =
                ZVal.assign(
                        ZVal.isGreaterThan(
                                        function_count
                                                .f
                                                .env(env)
                                                .call(
                                                        toObjectR(query)
                                                                .accessProp(this, env)
                                                                .name("wheres")
                                                                .value())
                                                .value(),
                                        '>',
                                        0)
                                ? " " + toStringR(this.compileUpdateWheres(env, query), env)
                                : "");
        return ZVal.assign(
                function_trim
                        .f
                        .env(env)
                        .call(
                                "delete from "
                                        + toStringR(table, env)
                                        + toStringR(using, env)
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
                                "truncate "
                                        + toStringR(
                                                env.callMethod(
                                                        this,
                                                        "wrapTable",
                                                        PostgresGrammar.class,
                                                        toObjectR(query)
                                                                .accessProp(this, env)
                                                                .name("from")
                                                                .value()),
                                                env)
                                        + " restart identity",
                                ZVal.newArray())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object wrapJsonSelector(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object path = null;
        Object field = null;
        Object wrappedPath = null;
        Object attribute = null;
        path = function_explode.f.env(env).call("->", value).value();
        field =
                env.callMethod(
                        this,
                        "wrapSegments",
                        PostgresGrammar.class,
                        function_explode
                                .f
                                .env(env)
                                .call(".", function_array_shift.f.env(env).call(path).value())
                                .value());
        wrappedPath = this.wrapJsonPathAttributes(env, path);
        attribute = function_array_pop.f.env(env).call(wrappedPath).value();
        if (!ZVal.isEmpty(wrappedPath)) {
            return ZVal.assign(
                    toStringR(field, env)
                            + "->"
                            + toStringR(
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call("->", wrappedPath)
                                            .value(),
                                    env)
                            + "->>"
                            + toStringR(attribute, env));
        }

        return ZVal.assign(toStringR(field, env) + "->>" + toStringR(attribute, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    protected Object wrapJsonPathAttributes(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/PostgresGrammar.php");
        Object path = assignParameter(args, 0, false);
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
                                    @ConvertedParameter(index = 0, name = "attribute")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object attribute = assignParameter(args, 0, false);
                                        return ZVal.assign("'" + toStringR(attribute, env) + "'");
                                    }
                                },
                                path)
                        .value());
    }

    public static final Object CONST_class =
            "Illuminate\\Database\\Query\\Grammars\\PostgresGrammar";

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
                    .setName("Illuminate\\Database\\Query\\Grammars\\PostgresGrammar")
                    .setLookup(
                            PostgresGrammar.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("operators", "operators", "selectComponents", "tablePrefix")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/PostgresGrammar.php")
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
