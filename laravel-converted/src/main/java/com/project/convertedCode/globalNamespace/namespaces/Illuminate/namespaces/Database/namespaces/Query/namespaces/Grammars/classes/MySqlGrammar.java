package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.namespaces.Grammars.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_stripos;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.classes.JsonExpression;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.namespaces.Grammars.classes.Grammar;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/MySqlGrammar.php

*/

public class MySqlGrammar extends Grammar {

    public MySqlGrammar(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.operators = ZVal.arrayFromList("sounds like");
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
    }

    public MySqlGrammar(NoConstructor n) {
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
                    "("
                            + toStringR(sql, env)
                            + ") "
                            + toStringR(
                                    env.callMethod(
                                            this, "compileUnions", MySqlGrammar.class, query),
                                    env);
        }

        return ZVal.assign(sql);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "value")
    protected Object compileJsonContains(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(
                "json_contains("
                        + toStringR(env.callMethod(this, "wrap", MySqlGrammar.class, column), env)
                        + ", "
                        + toStringR(value, env)
                        + ")");
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
                        + "("
                        + toStringR(
                                env.callMethod(
                                        union.arrayGet(env, "query"), "toSql", MySqlGrammar.class),
                                env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "seed")
    public Object compileRandom(RuntimeEnv env, Object... args) {
        Object seed = assignParameter(args, 0, false);
        return ZVal.assign("RAND(" + toStringR(seed, env) + ")");
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
            return ZVal.assign(ZVal.isTrue(value) ? "for update" : "lock in share mode");
        }

        return ZVal.assign(value);
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
        Object joins = null;
        Object columns = null;
        Object where = null;
        Object table = null;
        Object sql = null;
        table =
                env.callMethod(
                        this,
                        "wrapTable",
                        MySqlGrammar.class,
                        toObjectR(query).accessProp(this, env).name("from").value());
        columns = this.compileUpdateColumns(env, values);
        joins = "";
        if (ZVal.isset(toObjectR(query).accessProp(this, env).name("joins").value())) {
            joins =
                    " "
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "compileJoins",
                                            MySqlGrammar.class,
                                            query,
                                            toObjectR(query)
                                                    .accessProp(this, env)
                                                    .name("joins")
                                                    .value()),
                                    env);
        }

        where = env.callMethod(this, "compileWheres", MySqlGrammar.class, query);
        sql =
                function_rtrim
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
                        .value();
        if (!ZVal.isEmpty(toObjectR(query).accessProp(this, env).name("orders").value())) {
            sql =
                    toStringR(sql, env)
                            + " "
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "compileOrders",
                                            MySqlGrammar.class,
                                            query,
                                            toObjectR(query)
                                                    .accessProp(this, env)
                                                    .name("orders")
                                                    .value()),
                                    env);
        }

        if (ZVal.isset(toObjectR(query).accessProp(this, env).name("limit").value())) {
            sql =
                    toStringR(sql, env)
                            + " "
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "compileLimit",
                                            MySqlGrammar.class,
                                            query,
                                            toObjectR(query)
                                                    .accessProp(this, env)
                                                    .name("limit")
                                                    .value()),
                                    env);
        }

        return ZVal.assign(function_rtrim.f.env(env).call(sql).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values")
    protected Object compileUpdateColumns(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/MySqlGrammar.php");
        Object values = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(values).value(),
                                "map",
                                MySqlGrammar.class,
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
                                        if (ZVal.isTrue(
                                                env.callMethod(
                                                        _closureThisVar,
                                                        "isJsonSelector",
                                                        MySqlGrammar.class,
                                                        key))) {
                                            return ZVal.assign(
                                                    MySqlGrammar.this.compileJsonUpdateColumn(
                                                            env,
                                                            key,
                                                            new JsonExpression(env, value)));
                                        }

                                        return ZVal.assign(
                                                toStringR(
                                                                env.callMethod(
                                                                        _closureThisVar,
                                                                        "wrap",
                                                                        MySqlGrammar.class,
                                                                        key),
                                                                env)
                                                        + " = "
                                                        + toStringR(
                                                                env.callMethod(
                                                                        _closureThisVar,
                                                                        "parameter",
                                                                        MySqlGrammar.class,
                                                                        value),
                                                                env));
                                    }
                                }),
                        "implode",
                        MySqlGrammar.class,
                        ", "));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "value",
        typeHint = "Illuminate\\Database\\Query\\JsonExpression"
    )
    protected Object compileJsonUpdateColumn(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object path = null;
        Object field = null;
        Object accessor = null;
        path = function_explode.f.env(env).call("->", key).value();
        field = this.wrapValue(env, function_array_shift.f.env(env).call(path).value());
        accessor =
                "'$.\""
                        + toStringR(
                                NamespaceGlobal.implode.env(env).call("\".\"", path).value(), env)
                        + "\"'";
        return ZVal.assign(
                toStringR(field, env)
                        + " = json_set("
                        + toStringR(field, env)
                        + ", "
                        + toStringR(accessor, env)
                        + ", "
                        + toStringR(env.callMethod(value, "getValue", MySqlGrammar.class), env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bindings", typeHint = "array")
    @ConvertedParameter(index = 1, name = "values", typeHint = "array")
    public Object prepareBindingsForUpdate(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/MySqlGrammar.php");
        Object bindings = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        values =
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(values).value(),
                                "reject",
                                MySqlGrammar.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Query\\Grammars",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "value")
                                    @ConvertedParameter(index = 1, name = "column")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object value = assignParameter(args, 0, false);
                                        Object column = assignParameter(args, 1, false);
                                        return ZVal.assign(
                                                ZVal.toBool(
                                                                env.callMethod(
                                                                        _closureThisVar,
                                                                        "isJsonSelector",
                                                                        MySqlGrammar.class,
                                                                        column))
                                                        && ZVal.toBool(
                                                                function_in_array
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                NamespaceGlobal
                                                                                        .gettype
                                                                                        .env(env)
                                                                                        .call(value)
                                                                                        .value(),
                                                                                ZVal.arrayFromList(
                                                                                        "boolean",
                                                                                        "integer",
                                                                                        "double"))
                                                                        .value()));
                                    }
                                }),
                        "all",
                        MySqlGrammar.class);
        return ZVal.assign(super.prepareBindingsForUpdate(env, bindings, values));
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
        table =
                env.callMethod(
                        this,
                        "wrapTable",
                        MySqlGrammar.class,
                        toObjectR(query).accessProp(this, env).name("from").value());
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
                                ? env.callMethod(this, "compileWheres", MySqlGrammar.class, query)
                                : "");
        return ZVal.assign(
                ZVal.isset(toObjectR(query).accessProp(this, env).name("joins").value())
                        ? this.compileDeleteWithJoins(env, query, table, where)
                        : this.compileDeleteWithoutJoins(env, query, table, where));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bindings", typeHint = "array")
    public Object prepareBindingsForDelete(RuntimeEnv env, Object... args) {
        ReferenceContainer bindings = new BasicReferenceContainer(assignParameter(args, 0, false));
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
                                                Arr.runtimeStaticObject.flatten(env, cleanBindings))
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "table")
    @ConvertedParameter(index = 2, name = "where")
    protected Object compileDeleteWithoutJoins(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object table = assignParameter(args, 1, false);
        Object where = assignParameter(args, 2, false);
        Object sql = null;
        sql =
                function_trim
                        .f
                        .env(env)
                        .call("delete from " + toStringR(table, env) + " " + toStringR(where, env))
                        .value();
        if (!ZVal.isEmpty(toObjectR(query).accessProp(this, env).name("orders").value())) {
            sql =
                    toStringR(sql, env)
                            + " "
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "compileOrders",
                                            MySqlGrammar.class,
                                            query,
                                            toObjectR(query)
                                                    .accessProp(this, env)
                                                    .name("orders")
                                                    .value()),
                                    env);
        }

        if (ZVal.isset(toObjectR(query).accessProp(this, env).name("limit").value())) {
            sql =
                    toStringR(sql, env)
                            + " "
                            + toStringR(
                                    env.callMethod(
                                            this,
                                            "compileLimit",
                                            MySqlGrammar.class,
                                            query,
                                            toObjectR(query)
                                                    .accessProp(this, env)
                                                    .name("limit")
                                                    .value()),
                                    env);
        }

        return ZVal.assign(sql);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
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
                                        MySqlGrammar.class,
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
    @ConvertedParameter(index = 0, name = "value")
    protected Object wrapValue(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.strictEqualityCheck(value, "===", "*")
                        ? value
                        : "`"
                                + toStringR(
                                        function_str_replace
                                                .f
                                                .env(env)
                                                .call("`", "``", value)
                                                .value(),
                                        env)
                                + "`");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object wrapJsonSelector(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/MySqlGrammar.php");
        Object value = assignParameter(args, 0, false);
        Object path = null;
        Object field = null;
        path = function_explode.f.env(env).call("->", value).value();
        field =
                env.callMethod(
                        this,
                        "wrapSegments",
                        MySqlGrammar.class,
                        function_explode
                                .f
                                .env(env)
                                .call(".", function_array_shift.f.env(env).call(path).value())
                                .value());
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s->'$.%s'",
                                field,
                                env.callMethod(
                                        env.callMethod(
                                                collect.f.env(env).call(path).value(),
                                                "map",
                                                MySqlGrammar.class,
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Illuminate\\Database\\Query\\Grammars",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "part")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object part =
                                                                assignParameter(args, 0, false);
                                                        return ZVal.assign(
                                                                "\"" + toStringR(part, env) + "\"");
                                                    }
                                                }),
                                        "implode",
                                        MySqlGrammar.class,
                                        "."))
                        .value());
    }

    public static final Object CONST_class = "Illuminate\\Database\\Query\\Grammars\\MySqlGrammar";

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
                    .setName("Illuminate\\Database\\Query\\Grammars\\MySqlGrammar")
                    .setLookup(
                            MySqlGrammar.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "operators",
                            "operators",
                            "selectComponents",
                            "selectComponents",
                            "tablePrefix")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Query/Grammars/MySqlGrammar.php")
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
