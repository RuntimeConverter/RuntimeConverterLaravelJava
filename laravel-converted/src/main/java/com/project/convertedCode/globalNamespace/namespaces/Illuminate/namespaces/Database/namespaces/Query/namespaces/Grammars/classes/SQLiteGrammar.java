package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.namespaces.Grammars.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.namespaces.Grammars.classes.Grammar;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/SQLiteGrammar.php

*/

public class SQLiteGrammar extends Grammar {

    public SQLiteGrammar(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.selectComponents =
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
                        "lock");
        this.operators =
                ZVal.arrayFromList(
                        "=",
                        "<",
                        ">",
                        "<=",
                        ">=",
                        "<>",
                        "!=",
                        "like",
                        "not like",
                        "ilike",
                        "&",
                        "|",
                        "<<",
                        ">>");
    }

    public SQLiteGrammar(NoConstructor n) {
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
        Object sql = null;
        sql = super.compileSelect(env, query);
        if (toObjectR(query).accessProp(this, env).name("unions").getBool()) {
            sql =
                    "select * from ("
                            + toStringR(sql, env)
                            + ") "
                            + toStringR(
                                    env.callMethod(
                                            this, "compileUnions", SQLiteGrammar.class, query),
                                    env);
        }

        return ZVal.assign(sql);
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
                        + "select * from ("
                        + toStringR(
                                env.callMethod(
                                        union.arrayGet(env, "query"), "toSql", SQLiteGrammar.class),
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
    protected Object whereDate(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object where = assignParameter(args, 1, false);
        return ZVal.assign(this.dateBasedWhere(env, "%Y-%m-%d", query, where));
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
        return ZVal.assign(this.dateBasedWhere(env, "%d", query, where));
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
        return ZVal.assign(this.dateBasedWhere(env, "%m", query, where));
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
        return ZVal.assign(this.dateBasedWhere(env, "%Y", query, where));
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
        return ZVal.assign(this.dateBasedWhere(env, "%H:%M:%S", query, where));
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
                        this, "parameter", SQLiteGrammar.class, where.arrayGet(env, "value"));
        return ZVal.assign(
                "strftime('"
                        + toStringR(type, env)
                        + "', "
                        + toStringR(
                                env.callMethod(
                                        this,
                                        "wrap",
                                        SQLiteGrammar.class,
                                        where.arrayGet(env, "column")),
                                env)
                        + ") "
                        + toStringR(where.arrayGet(env, "operator"), env)
                        + " cast("
                        + toStringR(value, env)
                        + " as text)");
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
        Object names = null;
        ReferenceContainer columns = new BasicReferenceContainer(null);
        Object column = null;
        Object table = null;
        table =
                env.callMethod(
                        this,
                        "wrapTable",
                        SQLiteGrammar.class,
                        toObjectR(query).accessProp(this, env).name("from").value());
        if (!function_is_array
                .f
                .env(env)
                .call(function_reset.f.env(env).call(values).value())
                .getBool()) {
            values = ZVal.newArray(new ZPair(0, values));
        }

        if (ZVal.strictEqualityCheck(function_count.f.env(env).call(values).value(), "===", 1)) {
            return ZVal.assign(
                    ZVal.isEmpty(function_reset.f.env(env).call(values).value())
                            ? "insert into " + toStringR(table, env) + " default values"
                            : super.compileInsert(
                                    env, query, function_reset.f.env(env).call(values).value()));
        }

        names =
                env.callMethod(
                        this,
                        "columnize",
                        SQLiteGrammar.class,
                        function_array_keys
                                .f
                                .env(env)
                                .call(function_reset.f.env(env).call(values).value())
                                .value());
        columns.setObject(ZVal.newArray());
        for (ZPair zpairResult357 :
                ZVal.getIterable(
                        function_array_keys
                                .f
                                .env(env)
                                .call(function_reset.f.env(env).call(values).value())
                                .value(),
                        env,
                        true)) {
            column = ZVal.assign(zpairResult357.getValue());
            columns.arrayAppend(env)
                    .set(
                            "? as "
                                    + toStringR(
                                            env.callMethod(
                                                    this, "wrap", SQLiteGrammar.class, column),
                                            env));
        }

        columns.setObject(
                NamespaceGlobal.array_fill
                        .env(env)
                        .call(
                                0,
                                function_count.f.env(env).call(values).value(),
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(", ", columns.getObject())
                                        .value())
                        .value());
        return ZVal.assign(
                toStringR(
                                "insert into "
                                        + toStringR(table, env)
                                        + " ("
                                        + toStringR(names, env)
                                        + ") select ",
                                env)
                        + toStringR(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(" union all select ", columns.getObject())
                                        .value(),
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
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/SQLiteGrammar.php");
        Object query = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        Object columns = null;
        Object selectSql = null;
        Object table = null;
        table =
                env.callMethod(
                        this,
                        "wrapTable",
                        SQLiteGrammar.class,
                        toObjectR(query).accessProp(this, env).name("from").value());
        columns =
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(values).value(),
                                "map",
                                SQLiteGrammar.class,
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
                                        Object query = null;
                                        query = this.contextReferences.getCapturedValue("query");
                                        return ZVal.assign(
                                                toStringR(
                                                                env.callMethod(
                                                                        _closureThisVar,
                                                                        "wrap",
                                                                        SQLiteGrammar.class,
                                                                        Str.runtimeStaticObject
                                                                                .after(
                                                                                        env,
                                                                                        key,
                                                                                        toStringR(
                                                                                                        toObjectR(
                                                                                                                        query)
                                                                                                                .accessProp(
                                                                                                                        this,
                                                                                                                        env)
                                                                                                                .name(
                                                                                                                        "from")
                                                                                                                .value(),
                                                                                                        env)
                                                                                                + ".")),
                                                                env)
                                                        + " = "
                                                        + toStringR(
                                                                env.callMethod(
                                                                        _closureThisVar,
                                                                        "parameter",
                                                                        SQLiteGrammar.class,
                                                                        value),
                                                                env));
                                    }
                                }.use("query", query)),
                        "implode",
                        SQLiteGrammar.class,
                        ", ");
        if (ZVal.toBool(ZVal.isset(toObjectR(query).accessProp(this, env).name("joins").value()))
                || ZVal.toBool(
                        ZVal.isset(toObjectR(query).accessProp(this, env).name("limit").value()))) {
            selectSql =
                    super.compileSelect(
                            env,
                            env.callMethod(
                                    query,
                                    "select",
                                    SQLiteGrammar.class,
                                    toStringR(
                                                    toObjectR(query)
                                                            .accessProp(this, env)
                                                            .name("from")
                                                            .value(),
                                                    env)
                                            + ".rowid"));
            return ZVal.assign(
                    "update "
                            + toStringR(table, env)
                            + " set "
                            + toStringR(columns, env)
                            + " where "
                            + toStringR(
                                    env.callMethod(this, "wrap", SQLiteGrammar.class, "rowid"), env)
                            + " in ("
                            + toStringR(selectSql, env)
                            + ")");
        }

        return ZVal.assign(
                function_trim
                        .f
                        .env(env)
                        .call(
                                "update "
                                        + toStringR(table, env)
                                        + " set "
                                        + toStringR(columns, env)
                                        + " "
                                        + toStringR(
                                                env.callMethod(
                                                        this,
                                                        "compileWheres",
                                                        SQLiteGrammar.class,
                                                        query),
                                                env))
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
                        env, bindings.getObject(), ZVal.arrayFromList("select", "join"));
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
        Object selectSql = null;
        if (ZVal.toBool(ZVal.isset(toObjectR(query).accessProp(this, env).name("joins").value()))
                || ZVal.toBool(
                        ZVal.isset(toObjectR(query).accessProp(this, env).name("limit").value()))) {
            selectSql =
                    super.compileSelect(
                            env,
                            env.callMethod(
                                    query,
                                    "select",
                                    SQLiteGrammar.class,
                                    toStringR(
                                                    toObjectR(query)
                                                            .accessProp(this, env)
                                                            .name("from")
                                                            .value(),
                                                    env)
                                            + ".rowid"));
            return ZVal.assign(
                    "delete from "
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "wrapTable",
                                            SQLiteGrammar.class,
                                            toObjectR(query)
                                                    .accessProp(this, env)
                                                    .name("from")
                                                    .value()),
                                    env)
                            + " where "
                            + toStringR(
                                    env.callMethod(this, "wrap", SQLiteGrammar.class, "rowid"), env)
                            + " in ("
                            + toStringR(selectSql, env)
                            + ")");
        }

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
                                ? env.callMethod(this, "compileWheres", SQLiteGrammar.class, query)
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
                                                        SQLiteGrammar.class,
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
        ReferenceContainer bindings = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object cleanBindings = null;
        cleanBindings =
                Arr.runtimeStaticObject.except(
                        env, bindings.getObject(), ZVal.arrayFromList("select", "join"));
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
    public Object compileTruncate(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "delete from sqlite_sequence where name = ?",
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                toObjectR(query)
                                                        .accessProp(this, env)
                                                        .name("from")
                                                        .value()))),
                        new ZPair(
                                "delete from "
                                        + toStringR(
                                                env.callMethod(
                                                        this,
                                                        "wrapTable",
                                                        SQLiteGrammar.class,
                                                        toObjectR(query)
                                                                .accessProp(this, env)
                                                                .name("from")
                                                                .value()),
                                                env),
                                ZVal.newArray())));
    }

    public static final Object CONST_class = "Illuminate\\Database\\Query\\Grammars\\SQLiteGrammar";

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
                    .setName("Illuminate\\Database\\Query\\Grammars\\SQLiteGrammar")
                    .setLookup(
                            SQLiteGrammar.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "operators",
                            "operators",
                            "selectComponents",
                            "selectComponents",
                            "tablePrefix")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/SQLiteGrammar.php")
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
