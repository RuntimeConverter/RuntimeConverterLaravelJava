package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_change_key_case;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Container.classes.Container;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Arrayable;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.ReadOnlyReferenceContainer;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.functions.last;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Collection;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.functions.collect;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_stripos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_ksort;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Pagination.classes.Paginator;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Pagination.classes.LengthAwarePaginator;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge_recursive;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.classes.Expression;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_num_args;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_float;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.classes.JoinClause;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php

*/

public class Builder extends RuntimeClassBase {

    public Object connection = null;

    public Object grammar = null;

    public Object processor = null;

    public Object bindings =
            ZVal.newArray(
                    new ZPair("select", ZVal.newArray()),
                    new ZPair("from", ZVal.newArray()),
                    new ZPair("join", ZVal.newArray()),
                    new ZPair("where", ZVal.newArray()),
                    new ZPair("having", ZVal.newArray()),
                    new ZPair("order", ZVal.newArray()),
                    new ZPair("union", ZVal.newArray()));

    public Object aggregate = null;

    public Object columns = null;

    public Object distinct = false;

    public Object from = null;

    public Object joins = null;

    public Object wheres = ZVal.newArray();

    public Object groups = null;

    public Object havings = null;

    public Object orders = null;

    public Object limit = null;

    public Object offset = null;

    public Object unions = null;

    public Object unionLimit = null;

    public Object unionOffset = null;

    public Object unionOrders = null;

    public Object lock = null;

    public Object operators =
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
                                "<=>",
                                "like",
                                "like binary",
                                "not like",
                                "ilike",
                                "&",
                                "|",
                                "^",
                                "<<",
                                ">>",
                                "rlike",
                                "regexp",
                                "not regexp",
                                "~",
                                "~*",
                                "!~",
                                "!~*",
                                "similar to",
                                "not similar to",
                                "not ilike",
                                "~~*",
                                "!~~*");
                    });

    public Object useWritePdo = false;

    public Builder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Builder.class) {
            this.__construct(env, args);
        }
    }

    public Builder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "connection",
        typeHint = "Illuminate\\Database\\ConnectionInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "grammar",
        typeHint = "Illuminate\\Database\\Query\\Grammars\\Grammar",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "processor",
        typeHint = "Illuminate\\Database\\Query\\Processors\\Processor",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        Object grammar = assignParameter(args, 1, true);
        if (null == grammar) {
            grammar = ZVal.getNull();
        }
        Object processor = assignParameter(args, 2, true);
        if (null == processor) {
            processor = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.connection = connection;
        this.grammar =
                ZVal.isTrue(ternaryExpressionTemp = grammar)
                        ? ternaryExpressionTemp
                        : env.callMethod(connection, "getQueryGrammar", Builder.class);
        this.processor =
                ZVal.isTrue(ternaryExpressionTemp = processor)
                        ? ternaryExpressionTemp
                        : env.callMethod(connection, "getPostProcessor", Builder.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "columns",
        defaultValue = "ZVal.arrayFromList(\"*\")",
        defaultValueType = "array"
    )
    public Object select(RuntimeEnv env, Object... args) {
        Object columns = assignParameter(args, 0, true);
        if (null == columns) {
            columns = ZVal.arrayFromList("*");
        }
        this.columns =
                function_is_array.f.env(env).call(columns).getBool()
                        ? columns
                        : function_func_get_args
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call()
                                .value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "as")
    public Object selectSub(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object as = assignParameter(args, 1, false);
        Object bindings = null;
        Object runtimeTempArrayResult31 = null;
        ZVal.list(
                runtimeTempArrayResult31 = this.createSub(env, query),
                (query = listGet(runtimeTempArrayResult31, 0, env)),
                (bindings = listGet(runtimeTempArrayResult31, 1, env)));
        return ZVal.assign(
                this.selectRaw(
                        env,
                        "("
                                + toStringR(query, env)
                                + ") as "
                                + toStringR(
                                        env.callMethod(this.grammar, "wrap", Builder.class, as),
                                        env),
                        bindings));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    @ConvertedParameter(
        index = 1,
        name = "bindings",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object selectRaw(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        Object bindings = assignParameter(args, 1, true);
        if (null == bindings) {
            bindings = ZVal.newArray();
        }
        this.addSelect(env, new Expression(env, expression));
        if (ZVal.isTrue(bindings)) {
            this.addBinding(env, bindings, "select");
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "as")
    public Object fromSub(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object as = assignParameter(args, 1, false);
        Object bindings = null;
        Object runtimeTempArrayResult32 = null;
        ZVal.list(
                runtimeTempArrayResult32 = this.createSub(env, query),
                (query = listGet(runtimeTempArrayResult32, 0, env)),
                (bindings = listGet(runtimeTempArrayResult32, 1, env)));
        return ZVal.assign(
                this.fromRaw(
                        env,
                        "("
                                + toStringR(query, env)
                                + ") as "
                                + toStringR(
                                        env.callMethod(this.grammar, "wrap", Builder.class, as),
                                        env),
                        bindings));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    @ConvertedParameter(index = 1, name = "bindings", defaultValue = "", defaultValueType = "array")
    public Object fromRaw(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        Object bindings = assignParameter(args, 1, true);
        if (null == bindings) {
            bindings = ZVal.newArray();
        }
        this.from = new Expression(env, expression);
        this.addBinding(env, bindings, "from");
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    protected Object createSub(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object callback = null;
        if (ZVal.isTrue(ZVal.checkInstanceType(query, Closure.class, "Closure"))) {
            callback = ZVal.assign(query);
            env.callFunctionDynamic(
                    callback, new RuntimeArgsWithReferences(), query = this.forSubQuery(env));
        }

        return ZVal.assign(this.parseSub(env, query));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    protected Object parseSub(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                query,
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Illuminate
                                        .namespaces
                                        .Database
                                        .namespaces
                                        .Query
                                        .classes
                                        .Builder
                                        .class,
                                "Illuminate\\Database\\Query\\Builder"))
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                query,
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Illuminate
                                        .namespaces
                                        .Database
                                        .namespaces
                                        .Eloquent
                                        .classes
                                        .Builder
                                        .class,
                                "Illuminate\\Database\\Eloquent\\Builder"))) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, env.callMethod(query, "toSql", Builder.class)),
                            new ZPair(1, env.callMethod(query, "getBindings", Builder.class))));

        } else if (function_is_string.f.env(env).call(query).getBool()) {
            return ZVal.assign(ZVal.newArray(new ZPair(0, query), new ZPair(1, ZVal.newArray())));

        } else {
            throw ZVal.getException(env, new InvalidArgumentException(env));
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object addSelect(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        column =
                ZVal.assign(
                        function_is_array.f.env(env).call(column).getBool()
                                ? column
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value());
        this.columns =
                function_array_merge.f.env(env).call(rToArrayCast(this.columns), column).value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object distinct(RuntimeEnv env, Object... args) {
        this.distinct = true;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    public Object from(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        this.from = table;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    @ConvertedParameter(index = 1, name = "first")
    @ConvertedParameter(
        index = 2,
        name = "operator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "second",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 4, name = "type")
    @ConvertedParameter(
        index = 5,
        name = "where",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object join(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        ReferenceContainer first = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer operator = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == operator.getObject()) {
            operator.setObject(ZVal.getNull());
        }
        ReferenceContainer second = new BasicReferenceContainer(assignParameter(args, 3, true));
        if (null == second.getObject()) {
            second.setObject(ZVal.getNull());
        }
        Object type = assignParameter(args, 4, true);
        if (null == type) {
            type = "inner";
        }
        Object where = assignParameter(args, 5, true);
        if (null == where) {
            where = false;
        }
        Object method = null;
        Object join = null;
        join = new JoinClause(env, this, type, table);
        if (ZVal.isTrue(ZVal.checkInstanceType(first.getObject(), Closure.class, "Closure"))) {
            function_call_user_func
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                    .call(first.getObject(), join);
            new ReferenceClassProperty(this, "joins", env).arrayAppend(env).set(join);
            this.addBinding(env, env.callMethod(join, "getBindings", Builder.class), "join");

        } else {
            method = ZVal.assign(ZVal.isTrue(where) ? "where" : "on");
            new ReferenceClassProperty(this, "joins", env)
                    .arrayAppend(env)
                    .set(
                            env.callMethod(
                                    join,
                                    new RuntimeArgsWithReferences()
                                            .add(0, first)
                                            .add(1, operator)
                                            .add(2, second),
                                    toStringR(method, env),
                                    Builder.class,
                                    first.getObject(),
                                    operator.getObject(),
                                    second.getObject()));
            this.addBinding(env, env.callMethod(join, "getBindings", Builder.class), "join");
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    @ConvertedParameter(index = 1, name = "first")
    @ConvertedParameter(index = 2, name = "operator")
    @ConvertedParameter(index = 3, name = "second")
    @ConvertedParameter(index = 4, name = "type")
    public Object joinWhere(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object first = assignParameter(args, 1, false);
        Object operator = assignParameter(args, 2, false);
        Object second = assignParameter(args, 3, false);
        Object type = assignParameter(args, 4, true);
        if (null == type) {
            type = "inner";
        }
        return ZVal.assign(this.join(env, table, first, operator, second, type, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "as")
    @ConvertedParameter(index = 2, name = "first")
    @ConvertedParameter(
        index = 3,
        name = "operator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "second",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 5, name = "type")
    @ConvertedParameter(
        index = 6,
        name = "where",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object joinSub(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object as = assignParameter(args, 1, false);
        Object first = assignParameter(args, 2, false);
        Object operator = assignParameter(args, 3, true);
        if (null == operator) {
            operator = ZVal.getNull();
        }
        Object second = assignParameter(args, 4, true);
        if (null == second) {
            second = ZVal.getNull();
        }
        Object type = assignParameter(args, 5, true);
        if (null == type) {
            type = "inner";
        }
        Object where = assignParameter(args, 6, true);
        if (null == where) {
            where = false;
        }
        Object expression = null;
        Object bindings = null;
        Object runtimeTempArrayResult33 = null;
        ZVal.list(
                runtimeTempArrayResult33 = this.createSub(env, query),
                (query = listGet(runtimeTempArrayResult33, 0, env)),
                (bindings = listGet(runtimeTempArrayResult33, 1, env)));
        expression =
                "("
                        + toStringR(query, env)
                        + ") as "
                        + toStringR(env.callMethod(this.grammar, "wrap", Builder.class, as), env);
        this.addBinding(env, bindings, "join");
        return ZVal.assign(
                this.join(
                        env,
                        new Expression(env, expression),
                        first,
                        operator,
                        second,
                        type,
                        where));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    @ConvertedParameter(index = 1, name = "first")
    @ConvertedParameter(
        index = 2,
        name = "operator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "second",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object leftJoin(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object first = assignParameter(args, 1, false);
        Object operator = assignParameter(args, 2, true);
        if (null == operator) {
            operator = ZVal.getNull();
        }
        Object second = assignParameter(args, 3, true);
        if (null == second) {
            second = ZVal.getNull();
        }
        return ZVal.assign(this.join(env, table, first, operator, second, "left"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    @ConvertedParameter(index = 1, name = "first")
    @ConvertedParameter(index = 2, name = "operator")
    @ConvertedParameter(index = 3, name = "second")
    public Object leftJoinWhere(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object first = assignParameter(args, 1, false);
        Object operator = assignParameter(args, 2, false);
        Object second = assignParameter(args, 3, false);
        return ZVal.assign(this.joinWhere(env, table, first, operator, second, "left"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "as")
    @ConvertedParameter(index = 2, name = "first")
    @ConvertedParameter(
        index = 3,
        name = "operator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "second",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object leftJoinSub(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object as = assignParameter(args, 1, false);
        Object first = assignParameter(args, 2, false);
        Object operator = assignParameter(args, 3, true);
        if (null == operator) {
            operator = ZVal.getNull();
        }
        Object second = assignParameter(args, 4, true);
        if (null == second) {
            second = ZVal.getNull();
        }
        return ZVal.assign(this.joinSub(env, query, as, first, operator, second, "left"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    @ConvertedParameter(index = 1, name = "first")
    @ConvertedParameter(
        index = 2,
        name = "operator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "second",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object rightJoin(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object first = assignParameter(args, 1, false);
        Object operator = assignParameter(args, 2, true);
        if (null == operator) {
            operator = ZVal.getNull();
        }
        Object second = assignParameter(args, 3, true);
        if (null == second) {
            second = ZVal.getNull();
        }
        return ZVal.assign(this.join(env, table, first, operator, second, "right"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    @ConvertedParameter(index = 1, name = "first")
    @ConvertedParameter(index = 2, name = "operator")
    @ConvertedParameter(index = 3, name = "second")
    public Object rightJoinWhere(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object first = assignParameter(args, 1, false);
        Object operator = assignParameter(args, 2, false);
        Object second = assignParameter(args, 3, false);
        return ZVal.assign(this.joinWhere(env, table, first, operator, second, "right"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "as")
    @ConvertedParameter(index = 2, name = "first")
    @ConvertedParameter(
        index = 3,
        name = "operator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "second",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object rightJoinSub(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object as = assignParameter(args, 1, false);
        Object first = assignParameter(args, 2, false);
        Object operator = assignParameter(args, 3, true);
        if (null == operator) {
            operator = ZVal.getNull();
        }
        Object second = assignParameter(args, 4, true);
        if (null == second) {
            second = ZVal.getNull();
        }
        return ZVal.assign(this.joinSub(env, query, as, first, operator, second, "right"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    @ConvertedParameter(
        index = 1,
        name = "first",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "operator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "second",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object crossJoin(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object first = assignParameter(args, 1, true);
        if (null == first) {
            first = ZVal.getNull();
        }
        Object operator = assignParameter(args, 2, true);
        if (null == operator) {
            operator = ZVal.getNull();
        }
        Object second = assignParameter(args, 3, true);
        if (null == second) {
            second = ZVal.getNull();
        }
        if (ZVal.isTrue(first)) {
            return ZVal.assign(this.join(env, table, first, operator, second, "cross"));
        }

        new ReferenceClassProperty(this, "joins", env)
                .arrayAppend(env)
                .set(new JoinClause(env, this, "cross", table));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "wheres")
    @ConvertedParameter(index = 1, name = "bindings")
    public Object mergeWheres(RuntimeEnv env, Object... args) {
        Object wheres = assignParameter(args, 0, false);
        Object bindings = assignParameter(args, 1, false);
        this.wheres =
                function_array_merge.f.env(env).call(this.wheres, rToArrayCast(wheres)).value();
        new ReferenceClassProperty(this, "bindings", env)
                .arrayAccess(env, "where")
                .set(
                        function_array_values
                                .f
                                .env(env)
                                .call(
                                        function_array_merge
                                                .f
                                                .env(env)
                                                .call(
                                                        new ReferenceClassProperty(
                                                                        this, "bindings", env)
                                                                .arrayGet(env, "where"),
                                                        rToArrayCast(bindings))
                                                .value())
                                .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "operator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "boolean")
    public Object where(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope93 scope = new Scope93();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
            scope.column = assignParameter(args, 0, false);
            scope.operator = assignParameter(args, 1, true);
            if (null == scope.operator) {
                scope.operator = ZVal.getNull();
            }
            scope.value = assignParameter(args, 2, true);
            if (null == scope.value) {
                scope.value = ZVal.getNull();
            }
            scope._pBoolean = assignParameter(args, 3, true);
            if (null == scope._pBoolean) {
                scope._pBoolean = "and";
            }
            scope.runtimeTempArrayResult35 = null;
            scope.type = null;
            scope.runtimeTempArrayResult34 = null;
            if (function_is_array.f.env(env).call(scope.column).getBool()) {
                throw new IncludeEventException(
                        ZVal.assign(this.addArrayOfWheres(env, scope.column, scope._pBoolean)));
            }

            ZVal.list(
                    scope.runtimeTempArrayResult34 =
                            this.prepareValueAndOperator(
                                    env,
                                    scope.value,
                                    scope.operator,
                                    ZVal.strictEqualityCheck(
                                            function_func_num_args
                                                    .f
                                                    .env(env)
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithInfo(args, this))
                                                    .call()
                                                    .value(),
                                            "===",
                                            2)),
                    (scope.value = listGet(scope.runtimeTempArrayResult34, 0, env)),
                    (scope.operator = listGet(scope.runtimeTempArrayResult34, 1, env)));
            if (ZVal.isTrue(ZVal.checkInstanceType(scope.column, Closure.class, "Closure"))) {
                throw new IncludeEventException(
                        ZVal.assign(this.whereNested(env, scope.column, scope._pBoolean)));
            }

            if (ZVal.isTrue(this.invalidOperator(env, scope.operator))) {
                ZVal.list(
                        scope.runtimeTempArrayResult35 =
                                ZVal.newArray(new ZPair(0, scope.operator), new ZPair(1, "=")),
                        (scope.value = listGet(scope.runtimeTempArrayResult35, 0, env)),
                        (scope.operator = listGet(scope.runtimeTempArrayResult35, 1, env)));
            }

            if (ZVal.isTrue(ZVal.checkInstanceType(scope.value, Closure.class, "Closure"))) {
                throw new IncludeEventException(
                        ZVal.assign(
                                this.whereSub(
                                        env,
                                        scope.column,
                                        scope.operator,
                                        scope.value,
                                        scope._pBoolean)));
            }

            if (function_is_null.f.env(env).call(scope.value).getBool()) {
                throw new IncludeEventException(
                        ZVal.assign(
                                this.whereNull(
                                        env,
                                        scope.column,
                                        scope._pBoolean,
                                        ZVal.strictNotEqualityCheck(scope.operator, "!==", "="))));
            }

            if (ZVal.toBool(Str.runtimeStaticObject.contains(env, scope.column, "->"))
                    && ZVal.toBool(function_is_bool.f.env(env).call(scope.value).value())) {
                scope.value = new Expression(env, ZVal.isTrue(scope.value) ? "true" : "false");
            }

            scope.type = "Basic";
            new ReferenceClassProperty(scope._thisVarAlias, "wheres", env)
                    .arrayAppend(env)
                    .set(
                            function_compact
                                    .f
                                    .env(env)
                                    .call(stack, "type", "column", "operator", "value", "boolean")
                                    .value());
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            scope.value,
                            Expression.class,
                            "Illuminate\\Database\\Query\\Expression"))) {
                this.addBinding(env, scope.value, "where");
            }

            throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "boolean")
    @ConvertedParameter(index = 2, name = "method")
    protected Object addArrayOfWheres(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
        Object column = assignParameter(args, 0, false);
        Object _pBoolean = assignParameter(args, 1, false);
        Object method = assignParameter(args, 2, true);
        if (null == method) {
            method = "where";
        }
        return ZVal.assign(
                this.whereNested(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database\\Query",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "query")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object query = assignParameter(args, 0, false);
                                ReferenceContainer _pBoolean = new BasicReferenceContainer(null);
                                Object method = null;
                                Object column = null;
                                ReferenceContainer value = new BasicReferenceContainer(null);
                                ReferenceContainer key = new BasicReferenceContainer(null);
                                _pBoolean = this.contextReferences.getReferenceContainer("boolean");
                                method = this.contextReferences.getCapturedValue("method");
                                column = this.contextReferences.getCapturedValue("column");
                                for (ZPair zpairResult341 : ZVal.getIterable(column, env, false)) {
                                    key.setObject(ZVal.assign(zpairResult341.getKey()));
                                    value.setObject(ZVal.assign(zpairResult341.getValue()));
                                    if (ZVal.toBool(
                                                    function_is_numeric
                                                            .f
                                                            .env(env)
                                                            .call(key.getObject())
                                                            .value())
                                            && ZVal.toBool(
                                                    function_is_array
                                                            .f
                                                            .env(env)
                                                            .call(value.getObject())
                                                            .value())) {
                                        env.callMethod(
                                                query,
                                                new RuntimeArgsWithReferences(),
                                                toStringR(method, env),
                                                Builder.class,
                                                PackedVaradicArgs.unpack(
                                                        new PackedVaradicArgs(
                                                                function_array_values
                                                                        .f
                                                                        .env(env)
                                                                        .call(value.getObject())
                                                                        .value())));

                                    } else {
                                        env.callMethod(
                                                query,
                                                new RuntimeArgsWithReferences()
                                                        .add(0, key)
                                                        .add(2, value)
                                                        .add(3, _pBoolean),
                                                toStringR(method, env),
                                                Builder.class,
                                                key.getObject(),
                                                "=",
                                                value.getObject(),
                                                _pBoolean.getObject());
                                    }
                                }

                                return null;
                            }
                        }.use("boolean", _pBoolean).use("method", method).use("column", column),
                        _pBoolean));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(index = 1, name = "operator")
    @ConvertedParameter(
        index = 2,
        name = "useDefault",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object prepareValueAndOperator(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, false);
        Object useDefault = assignParameter(args, 2, true);
        if (null == useDefault) {
            useDefault = false;
        }
        if (ZVal.isTrue(useDefault)) {
            return ZVal.assign(ZVal.newArray(new ZPair(0, operator), new ZPair(1, "=")));

        } else if (ZVal.isTrue(this.invalidOperatorAndValue(env, operator, value))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(env, "Illegal operator and value combination."));
        }

        return ZVal.assign(ZVal.newArray(new ZPair(0, value), new ZPair(1, operator)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "operator")
    @ConvertedParameter(index = 1, name = "value")
    protected Object invalidOperatorAndValue(RuntimeEnv env, Object... args) {
        Object operator = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(function_is_null.f.env(env).call(value).value())
                                        && ZVal.toBool(
                                                function_in_array
                                                        .f
                                                        .env(env)
                                                        .call(operator, this.operators)
                                                        .value()))
                        && ZVal.toBool(
                                !function_in_array
                                        .f
                                        .env(env)
                                        .call(operator, ZVal.arrayFromList("=", "<>", "!="))
                                        .getBool()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "operator")
    protected Object invalidOperator(RuntimeEnv env, Object... args) {
        Object operator = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                !function_in_array
                                        .f
                                        .env(env)
                                        .call(
                                                NamespaceGlobal.strtolower
                                                        .env(env)
                                                        .call(operator)
                                                        .value(),
                                                this.operators,
                                                true)
                                        .getBool())
                        && ZVal.toBool(
                                !function_in_array
                                        .f
                                        .env(env)
                                        .call(
                                                NamespaceGlobal.strtolower
                                                        .env(env)
                                                        .call(operator)
                                                        .value(),
                                                env.callMethod(
                                                        this.grammar,
                                                        "getOperators",
                                                        Builder.class),
                                                true)
                                        .getBool()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "operator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object orWhere(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, true);
        if (null == operator) {
            operator = ZVal.getNull();
        }
        Object value = assignParameter(args, 2, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object runtimeTempArrayResult36 = null;
        ZVal.list(
                runtimeTempArrayResult36 =
                        this.prepareValueAndOperator(
                                env,
                                value,
                                operator,
                                ZVal.strictEqualityCheck(
                                        function_func_num_args
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithInfo(args, this))
                                                .call()
                                                .value(),
                                        "===",
                                        2)),
                (value = listGet(runtimeTempArrayResult36, 0, env)),
                (operator = listGet(runtimeTempArrayResult36, 1, env)));
        return ZVal.assign(this.where(env, column, operator, value, "or"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "first")
    @ConvertedParameter(
        index = 1,
        name = "operator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "second",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "boolean")
    public Object whereColumn(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope94 scope = new Scope94();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
            scope.first = assignParameter(args, 0, false);
            scope.operator = assignParameter(args, 1, true);
            if (null == scope.operator) {
                scope.operator = ZVal.getNull();
            }
            scope.second = assignParameter(args, 2, true);
            if (null == scope.second) {
                scope.second = ZVal.getNull();
            }
            scope._pBoolean = assignParameter(args, 3, true);
            if (null == scope._pBoolean) {
                scope._pBoolean = "and";
            }
            scope.runtimeTempArrayResult37 = null;
            scope.type = null;
            if (function_is_array.f.env(env).call(scope.first).getBool()) {
                throw new IncludeEventException(
                        ZVal.assign(
                                this.addArrayOfWheres(
                                        env, scope.first, scope._pBoolean, "whereColumn")));
            }

            if (ZVal.isTrue(this.invalidOperator(env, scope.operator))) {
                ZVal.list(
                        scope.runtimeTempArrayResult37 =
                                ZVal.newArray(new ZPair(0, scope.operator), new ZPair(1, "=")),
                        (scope.second = listGet(scope.runtimeTempArrayResult37, 0, env)),
                        (scope.operator = listGet(scope.runtimeTempArrayResult37, 1, env)));
            }

            scope.type = "Column";
            new ReferenceClassProperty(scope._thisVarAlias, "wheres", env)
                    .arrayAppend(env)
                    .set(
                            function_compact
                                    .f
                                    .env(env)
                                    .call(stack, "type", "first", "operator", "second", "boolean")
                                    .value());
            throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "first")
    @ConvertedParameter(
        index = 1,
        name = "operator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "second",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object orWhereColumn(RuntimeEnv env, Object... args) {
        Object first = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, true);
        if (null == operator) {
            operator = ZVal.getNull();
        }
        Object second = assignParameter(args, 2, true);
        if (null == second) {
            second = ZVal.getNull();
        }
        return ZVal.assign(this.whereColumn(env, first, operator, second, "or"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sql")
    @ConvertedParameter(index = 1, name = "bindings", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(index = 2, name = "boolean")
    public Object whereRaw(RuntimeEnv env, Object... args) {
        Object sql = assignParameter(args, 0, false);
        Object bindings = assignParameter(args, 1, true);
        if (null == bindings) {
            bindings = ZVal.newArray();
        }
        Object _pBoolean = assignParameter(args, 2, true);
        if (null == _pBoolean) {
            _pBoolean = "and";
        }
        new ReferenceClassProperty(this, "wheres", env)
                .arrayAppend(env)
                .set(
                        ZVal.newArray(
                                new ZPair("type", "raw"),
                                new ZPair("sql", sql),
                                new ZPair("boolean", _pBoolean)));
        this.addBinding(env, rToArrayCast(bindings), "where");
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sql")
    @ConvertedParameter(index = 1, name = "bindings", defaultValue = "", defaultValueType = "array")
    public Object orWhereRaw(RuntimeEnv env, Object... args) {
        Object sql = assignParameter(args, 0, false);
        Object bindings = assignParameter(args, 1, true);
        if (null == bindings) {
            bindings = ZVal.newArray();
        }
        return ZVal.assign(this.whereRaw(env, sql, bindings, "or"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "values")
    @ConvertedParameter(index = 2, name = "boolean")
    @ConvertedParameter(
        index = 3,
        name = "not",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object whereIn(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope95 scope = new Scope95();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
            scope.column = assignParameter(args, 0, false);
            scope.values = assignParameter(args, 1, false);
            scope._pBoolean = assignParameter(args, 2, true);
            if (null == scope._pBoolean) {
                scope._pBoolean = "and";
            }
            scope.not = assignParameter(args, 3, true);
            if (null == scope.not) {
                scope.not = false;
            }
            scope.type = null;
            scope.value = null;
            scope.type = ZVal.assign(ZVal.isTrue(scope.not) ? "NotIn" : "In");
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            scope.values,
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Database
                                    .namespaces
                                    .Eloquent
                                    .classes
                                    .Builder
                                    .class,
                            "Illuminate\\Database\\Eloquent\\Builder"))) {
                scope.values = env.callMethod(scope.values, "getQuery", Builder.class);
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            scope.values,
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Database
                                    .namespaces
                                    .Query
                                    .classes
                                    .Builder
                                    .class,
                            "Illuminate\\Database\\Query\\Builder"))) {
                throw new IncludeEventException(
                        ZVal.assign(
                                this.whereInExistingQuery(
                                        env,
                                        scope.column,
                                        scope.values,
                                        scope._pBoolean,
                                        scope.not)));
            }

            if (ZVal.isTrue(ZVal.checkInstanceType(scope.values, Closure.class, "Closure"))) {
                throw new IncludeEventException(
                        ZVal.assign(
                                this.whereInSub(
                                        env,
                                        scope.column,
                                        scope.values,
                                        scope._pBoolean,
                                        scope.not)));
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            scope.values,
                            Arrayable.class,
                            "Illuminate\\Contracts\\Support\\Arrayable"))) {
                scope.values = env.callMethod(scope.values, "toArray", Builder.class);
            }

            new ReferenceClassProperty(scope._thisVarAlias, "wheres", env)
                    .arrayAppend(env)
                    .set(
                            function_compact
                                    .f
                                    .env(env)
                                    .call(stack, "type", "column", "values", "boolean")
                                    .value());
            for (ZPair zpairResult342 : ZVal.getIterable(scope.values, env, true)) {
                scope.value = ZVal.assign(zpairResult342.getValue());
                if (!ZVal.isTrue(
                        ZVal.checkInstanceType(
                                scope.value,
                                Expression.class,
                                "Illuminate\\Database\\Query\\Expression"))) {
                    this.addBinding(env, scope.value, "where");
                }
            }

            throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "values")
    public Object orWhereIn(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        return ZVal.assign(this.whereIn(env, column, values, "or"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "values")
    @ConvertedParameter(index = 2, name = "boolean")
    public Object whereNotIn(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        Object _pBoolean = assignParameter(args, 2, true);
        if (null == _pBoolean) {
            _pBoolean = "and";
        }
        return ZVal.assign(this.whereIn(env, column, values, _pBoolean, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "values")
    public Object orWhereNotIn(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        return ZVal.assign(this.whereNotIn(env, column, values, "or"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    @ConvertedParameter(index = 2, name = "boolean")
    @ConvertedParameter(index = 3, name = "not")
    protected Object whereInSub(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope96 scope = new Scope96();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
            scope.column = assignParameter(args, 0, false);
            scope.callback = assignParameter(args, 1, false);
            scope._pBoolean = assignParameter(args, 2, false);
            scope.not = assignParameter(args, 3, false);
            scope.query = null;
            scope.type = null;
            scope.type = ZVal.assign(ZVal.isTrue(scope.not) ? "NotInSub" : "InSub");
            function_call_user_func
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                    .call(scope.callback, scope.query = this.forSubQuery(env));
            new ReferenceClassProperty(scope._thisVarAlias, "wheres", env)
                    .arrayAppend(env)
                    .set(
                            function_compact
                                    .f
                                    .env(env)
                                    .call(stack, "type", "column", "query", "boolean")
                                    .value());
            this.addBinding(
                    env, env.callMethod(scope.query, "getBindings", Builder.class), "where");
            throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "query")
    @ConvertedParameter(index = 2, name = "boolean")
    @ConvertedParameter(index = 3, name = "not")
    protected Object whereInExistingQuery(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope97 scope = new Scope97();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
            scope.column = assignParameter(args, 0, false);
            scope.query = assignParameter(args, 1, false);
            scope._pBoolean = assignParameter(args, 2, false);
            scope.not = assignParameter(args, 3, false);
            scope.type = null;
            scope.type = ZVal.assign(ZVal.isTrue(scope.not) ? "NotInSub" : "InSub");
            new ReferenceClassProperty(scope._thisVarAlias, "wheres", env)
                    .arrayAppend(env)
                    .set(
                            function_compact
                                    .f
                                    .env(env)
                                    .call(stack, "type", "column", "query", "boolean")
                                    .value());
            this.addBinding(
                    env, env.callMethod(scope.query, "getBindings", Builder.class), "where");
            throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "boolean")
    @ConvertedParameter(
        index = 2,
        name = "not",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object whereNull(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope98 scope = new Scope98();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
            scope.column = assignParameter(args, 0, false);
            scope._pBoolean = assignParameter(args, 1, true);
            if (null == scope._pBoolean) {
                scope._pBoolean = "and";
            }
            scope.not = assignParameter(args, 2, true);
            if (null == scope.not) {
                scope.not = false;
            }
            scope.type = null;
            scope.type = ZVal.assign(ZVal.isTrue(scope.not) ? "NotNull" : "Null");
            new ReferenceClassProperty(scope._thisVarAlias, "wheres", env)
                    .arrayAppend(env)
                    .set(
                            function_compact
                                    .f
                                    .env(env)
                                    .call(stack, "type", "column", "boolean")
                                    .value());
            throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object orWhereNull(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.whereNull(env, column, "or"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "boolean")
    public Object whereNotNull(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object _pBoolean = assignParameter(args, 1, true);
        if (null == _pBoolean) {
            _pBoolean = "and";
        }
        return ZVal.assign(this.whereNull(env, column, _pBoolean, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "values", typeHint = "array")
    @ConvertedParameter(index = 2, name = "boolean")
    @ConvertedParameter(
        index = 3,
        name = "not",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object whereBetween(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope99 scope = new Scope99();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
            scope.column = assignParameter(args, 0, false);
            scope.values = assignParameter(args, 1, false);
            scope._pBoolean = assignParameter(args, 2, true);
            if (null == scope._pBoolean) {
                scope._pBoolean = "and";
            }
            scope.not = assignParameter(args, 3, true);
            if (null == scope.not) {
                scope.not = false;
            }
            scope.type = null;
            scope.type = "between";
            new ReferenceClassProperty(scope._thisVarAlias, "wheres", env)
                    .arrayAppend(env)
                    .set(
                            function_compact
                                    .f
                                    .env(env)
                                    .call(stack, "type", "column", "values", "boolean", "not")
                                    .value());
            this.addBinding(env, this.cleanBindings(env, scope.values), "where");
            throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "values", typeHint = "array")
    public Object orWhereBetween(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        return ZVal.assign(this.whereBetween(env, column, values, "or"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "values", typeHint = "array")
    @ConvertedParameter(index = 2, name = "boolean")
    public Object whereNotBetween(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        Object _pBoolean = assignParameter(args, 2, true);
        if (null == _pBoolean) {
            _pBoolean = "and";
        }
        return ZVal.assign(this.whereBetween(env, column, values, _pBoolean, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "values", typeHint = "array")
    public Object orWhereNotBetween(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        return ZVal.assign(this.whereNotBetween(env, column, values, "or"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object orWhereNotNull(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.whereNotNull(env, column, "or"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "operator")
    @ConvertedParameter(
        index = 2,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "boolean")
    public Object whereDate(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object _pBoolean = assignParameter(args, 3, true);
        if (null == _pBoolean) {
            _pBoolean = "and";
        }
        Object runtimeTempArrayResult38 = null;
        ZVal.list(
                runtimeTempArrayResult38 =
                        this.prepareValueAndOperator(
                                env,
                                value,
                                operator,
                                ZVal.strictEqualityCheck(
                                        function_func_num_args
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithInfo(args, this))
                                                .call()
                                                .value(),
                                        "===",
                                        2)),
                (value = listGet(runtimeTempArrayResult38, 0, env)),
                (operator = listGet(runtimeTempArrayResult38, 1, env)));
        return ZVal.assign(this.addDateBasedWhere(env, "Date", column, operator, value, _pBoolean));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "operator")
    @ConvertedParameter(
        index = 2,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object orWhereDate(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object runtimeTempArrayResult39 = null;
        ZVal.list(
                runtimeTempArrayResult39 =
                        this.prepareValueAndOperator(
                                env,
                                value,
                                operator,
                                ZVal.strictEqualityCheck(
                                        function_func_num_args
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithInfo(args, this))
                                                .call()
                                                .value(),
                                        "===",
                                        2)),
                (value = listGet(runtimeTempArrayResult39, 0, env)),
                (operator = listGet(runtimeTempArrayResult39, 1, env)));
        return ZVal.assign(this.whereDate(env, column, operator, value, "or"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "operator")
    @ConvertedParameter(
        index = 2,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "boolean")
    public Object whereTime(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object _pBoolean = assignParameter(args, 3, true);
        if (null == _pBoolean) {
            _pBoolean = "and";
        }
        Object runtimeTempArrayResult40 = null;
        ZVal.list(
                runtimeTempArrayResult40 =
                        this.prepareValueAndOperator(
                                env,
                                value,
                                operator,
                                ZVal.strictEqualityCheck(
                                        function_func_num_args
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithInfo(args, this))
                                                .call()
                                                .value(),
                                        "===",
                                        2)),
                (value = listGet(runtimeTempArrayResult40, 0, env)),
                (operator = listGet(runtimeTempArrayResult40, 1, env)));
        return ZVal.assign(this.addDateBasedWhere(env, "Time", column, operator, value, _pBoolean));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "operator")
    @ConvertedParameter(
        index = 2,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object orWhereTime(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object runtimeTempArrayResult41 = null;
        ZVal.list(
                runtimeTempArrayResult41 =
                        this.prepareValueAndOperator(
                                env,
                                value,
                                operator,
                                ZVal.strictEqualityCheck(
                                        function_func_num_args
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithInfo(args, this))
                                                .call()
                                                .value(),
                                        "===",
                                        2)),
                (value = listGet(runtimeTempArrayResult41, 0, env)),
                (operator = listGet(runtimeTempArrayResult41, 1, env)));
        return ZVal.assign(this.whereTime(env, column, operator, value, "or"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "operator")
    @ConvertedParameter(
        index = 2,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "boolean")
    public Object whereDay(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object _pBoolean = assignParameter(args, 3, true);
        if (null == _pBoolean) {
            _pBoolean = "and";
        }
        Object runtimeTempArrayResult42 = null;
        ZVal.list(
                runtimeTempArrayResult42 =
                        this.prepareValueAndOperator(
                                env,
                                value,
                                operator,
                                ZVal.strictEqualityCheck(
                                        function_func_num_args
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithInfo(args, this))
                                                .call()
                                                .value(),
                                        "===",
                                        2)),
                (value = listGet(runtimeTempArrayResult42, 0, env)),
                (operator = listGet(runtimeTempArrayResult42, 1, env)));
        return ZVal.assign(this.addDateBasedWhere(env, "Day", column, operator, value, _pBoolean));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "operator")
    @ConvertedParameter(
        index = 2,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object orWhereDay(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object runtimeTempArrayResult43 = null;
        ZVal.list(
                runtimeTempArrayResult43 =
                        this.prepareValueAndOperator(
                                env,
                                value,
                                operator,
                                ZVal.strictEqualityCheck(
                                        function_func_num_args
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithInfo(args, this))
                                                .call()
                                                .value(),
                                        "===",
                                        2)),
                (value = listGet(runtimeTempArrayResult43, 0, env)),
                (operator = listGet(runtimeTempArrayResult43, 1, env)));
        return ZVal.assign(this.addDateBasedWhere(env, "Day", column, operator, value, "or"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "operator")
    @ConvertedParameter(
        index = 2,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "boolean")
    public Object whereMonth(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object _pBoolean = assignParameter(args, 3, true);
        if (null == _pBoolean) {
            _pBoolean = "and";
        }
        Object runtimeTempArrayResult44 = null;
        ZVal.list(
                runtimeTempArrayResult44 =
                        this.prepareValueAndOperator(
                                env,
                                value,
                                operator,
                                ZVal.strictEqualityCheck(
                                        function_func_num_args
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithInfo(args, this))
                                                .call()
                                                .value(),
                                        "===",
                                        2)),
                (value = listGet(runtimeTempArrayResult44, 0, env)),
                (operator = listGet(runtimeTempArrayResult44, 1, env)));
        return ZVal.assign(
                this.addDateBasedWhere(env, "Month", column, operator, value, _pBoolean));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "operator")
    @ConvertedParameter(
        index = 2,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object orWhereMonth(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object runtimeTempArrayResult45 = null;
        ZVal.list(
                runtimeTempArrayResult45 =
                        this.prepareValueAndOperator(
                                env,
                                value,
                                operator,
                                ZVal.strictEqualityCheck(
                                        function_func_num_args
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithInfo(args, this))
                                                .call()
                                                .value(),
                                        "===",
                                        2)),
                (value = listGet(runtimeTempArrayResult45, 0, env)),
                (operator = listGet(runtimeTempArrayResult45, 1, env)));
        return ZVal.assign(this.addDateBasedWhere(env, "Month", column, operator, value, "or"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "operator")
    @ConvertedParameter(
        index = 2,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "boolean")
    public Object whereYear(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object _pBoolean = assignParameter(args, 3, true);
        if (null == _pBoolean) {
            _pBoolean = "and";
        }
        Object runtimeTempArrayResult46 = null;
        ZVal.list(
                runtimeTempArrayResult46 =
                        this.prepareValueAndOperator(
                                env,
                                value,
                                operator,
                                ZVal.strictEqualityCheck(
                                        function_func_num_args
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithInfo(args, this))
                                                .call()
                                                .value(),
                                        "===",
                                        2)),
                (value = listGet(runtimeTempArrayResult46, 0, env)),
                (operator = listGet(runtimeTempArrayResult46, 1, env)));
        return ZVal.assign(this.addDateBasedWhere(env, "Year", column, operator, value, _pBoolean));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "operator")
    @ConvertedParameter(
        index = 2,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object orWhereYear(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object runtimeTempArrayResult47 = null;
        ZVal.list(
                runtimeTempArrayResult47 =
                        this.prepareValueAndOperator(
                                env,
                                value,
                                operator,
                                ZVal.strictEqualityCheck(
                                        function_func_num_args
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithInfo(args, this))
                                                .call()
                                                .value(),
                                        "===",
                                        2)),
                (value = listGet(runtimeTempArrayResult47, 0, env)),
                (operator = listGet(runtimeTempArrayResult47, 1, env)));
        return ZVal.assign(this.addDateBasedWhere(env, "Year", column, operator, value, "or"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(index = 1, name = "column")
    @ConvertedParameter(index = 2, name = "operator")
    @ConvertedParameter(index = 3, name = "value")
    @ConvertedParameter(index = 4, name = "boolean")
    protected Object addDateBasedWhere(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope100 scope = new Scope100();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
            scope.type = assignParameter(args, 0, false);
            scope.column = assignParameter(args, 1, false);
            scope.operator = assignParameter(args, 2, false);
            scope.value = assignParameter(args, 3, false);
            scope._pBoolean = assignParameter(args, 4, true);
            if (null == scope._pBoolean) {
                scope._pBoolean = "and";
            }
            new ReferenceClassProperty(scope._thisVarAlias, "wheres", env)
                    .arrayAppend(env)
                    .set(
                            function_compact
                                    .f
                                    .env(env)
                                    .call(stack, "column", "type", "boolean", "operator", "value")
                                    .value());
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            scope.value,
                            Expression.class,
                            "Illuminate\\Database\\Query\\Expression"))) {
                this.addBinding(env, scope.value, "where");
            }

            throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    @ConvertedParameter(index = 1, name = "boolean")
    public Object whereNested(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object _pBoolean = assignParameter(args, 1, true);
        if (null == _pBoolean) {
            _pBoolean = "and";
        }
        Object query = null;
        function_call_user_func
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                .call(callback, query = this.forNestedWhere(env));
        return ZVal.assign(this.addNestedWhereQuery(env, query, _pBoolean));
    }

    @ConvertedMethod
    public Object forNestedWhere(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.newQuery(env), "from", Builder.class, this.from));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "boolean")
    public Object addNestedWhereQuery(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope101 scope = new Scope101();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
            scope.query = assignParameter(args, 0, false);
            scope._pBoolean = assignParameter(args, 1, true);
            if (null == scope._pBoolean) {
                scope._pBoolean = "and";
            }
            scope.type = null;
            if (function_count
                    .f
                    .env(env)
                    .call(toObjectR(scope.query).accessProp(this, env).name("wheres").value())
                    .getBool()) {
                scope.type = "Nested";
                new ReferenceClassProperty(scope._thisVarAlias, "wheres", env)
                        .arrayAppend(env)
                        .set(
                                function_compact
                                        .f
                                        .env(env)
                                        .call(stack, "type", "query", "boolean")
                                        .value());
                this.addBinding(
                        env,
                        handleReturnReference(
                                        env.callMethod(
                                                scope.query, "getRawBindings", Builder.class))
                                .arrayGet(env, "where"),
                        "where");
            }

            throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "operator")
    @ConvertedParameter(index = 2, name = "callback", typeHint = "Closure")
    @ConvertedParameter(index = 3, name = "boolean")
    protected Object whereSub(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope102 scope = new Scope102();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
            scope.column = assignParameter(args, 0, false);
            scope.operator = assignParameter(args, 1, false);
            scope.callback = assignParameter(args, 2, false);
            scope._pBoolean = assignParameter(args, 3, false);
            scope.query = null;
            scope.type = null;
            scope.type = "Sub";
            function_call_user_func
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                    .call(scope.callback, scope.query = this.forSubQuery(env));
            new ReferenceClassProperty(scope._thisVarAlias, "wheres", env)
                    .arrayAppend(env)
                    .set(
                            function_compact
                                    .f
                                    .env(env)
                                    .call(stack, "type", "column", "operator", "query", "boolean")
                                    .value());
            this.addBinding(
                    env, env.callMethod(scope.query, "getBindings", Builder.class), "where");
            throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    @ConvertedParameter(index = 1, name = "boolean")
    @ConvertedParameter(
        index = 2,
        name = "not",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object whereExists(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object _pBoolean = assignParameter(args, 1, true);
        if (null == _pBoolean) {
            _pBoolean = "and";
        }
        Object not = assignParameter(args, 2, true);
        if (null == not) {
            not = false;
        }
        Object query = null;
        query = this.forSubQuery(env);
        function_call_user_func
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                .call(callback, query);
        return ZVal.assign(this.addWhereExistsQuery(env, query, _pBoolean, not));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    @ConvertedParameter(
        index = 1,
        name = "not",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object orWhereExists(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object not = assignParameter(args, 1, true);
        if (null == not) {
            not = false;
        }
        return ZVal.assign(this.whereExists(env, callback, "or", not));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    @ConvertedParameter(index = 1, name = "boolean")
    public Object whereNotExists(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object _pBoolean = assignParameter(args, 1, true);
        if (null == _pBoolean) {
            _pBoolean = "and";
        }
        return ZVal.assign(this.whereExists(env, callback, _pBoolean, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    public Object orWhereNotExists(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        return ZVal.assign(this.orWhereExists(env, callback, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query", typeHint = "self")
    @ConvertedParameter(index = 1, name = "boolean")
    @ConvertedParameter(
        index = 2,
        name = "not",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object addWhereExistsQuery(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope103 scope = new Scope103();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
            scope.query = assignParameter(args, 0, false);
            scope._pBoolean = assignParameter(args, 1, true);
            if (null == scope._pBoolean) {
                scope._pBoolean = "and";
            }
            scope.not = assignParameter(args, 2, true);
            if (null == scope.not) {
                scope.not = false;
            }
            scope.type = null;
            scope.type = ZVal.assign(ZVal.isTrue(scope.not) ? "NotExists" : "Exists");
            new ReferenceClassProperty(scope._thisVarAlias, "wheres", env)
                    .arrayAppend(env)
                    .set(
                            function_compact
                                    .f
                                    .env(env)
                                    .call(stack, "type", "operator", "query", "boolean")
                                    .value());
            this.addBinding(
                    env, env.callMethod(scope.query, "getBindings", Builder.class), "where");
            throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "columns")
    @ConvertedParameter(index = 1, name = "operator")
    @ConvertedParameter(index = 2, name = "values")
    @ConvertedParameter(index = 3, name = "boolean")
    public Object whereRowValues(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope104 scope = new Scope104();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
            scope.columns = assignParameter(args, 0, false);
            scope.operator = assignParameter(args, 1, false);
            scope.values = assignParameter(args, 2, false);
            scope._pBoolean = assignParameter(args, 3, true);
            if (null == scope._pBoolean) {
                scope._pBoolean = "and";
            }
            scope.type = null;
            if (ZVal.strictNotEqualityCheck(
                    function_count.f.env(env).call(scope.columns).value(),
                    "!==",
                    function_count.f.env(env).call(scope.values).value())) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env, "The number of columns must match the number of values"));
            }

            scope.type = "RowValues";
            new ReferenceClassProperty(scope._thisVarAlias, "wheres", env)
                    .arrayAppend(env)
                    .set(
                            function_compact
                                    .f
                                    .env(env)
                                    .call(stack, "type", "columns", "operator", "values", "boolean")
                                    .value());
            this.addBinding(env, scope.values);
            throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "columns")
    @ConvertedParameter(index = 1, name = "operator")
    @ConvertedParameter(index = 2, name = "values")
    public Object orWhereRowValues(RuntimeEnv env, Object... args) {
        Object columns = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, false);
        Object values = assignParameter(args, 2, false);
        return ZVal.assign(this.whereRowValues(env, columns, operator, values, "or"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "boolean")
    @ConvertedParameter(
        index = 3,
        name = "not",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object whereJsonContains(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope105 scope = new Scope105();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
            scope.column = assignParameter(args, 0, false);
            scope.value = assignParameter(args, 1, false);
            scope._pBoolean = assignParameter(args, 2, true);
            if (null == scope._pBoolean) {
                scope._pBoolean = "and";
            }
            scope.not = assignParameter(args, 3, true);
            if (null == scope.not) {
                scope.not = false;
            }
            scope.type = null;
            scope.type = "JsonContains";
            new ReferenceClassProperty(scope._thisVarAlias, "wheres", env)
                    .arrayAppend(env)
                    .set(
                            function_compact
                                    .f
                                    .env(env)
                                    .call(stack, "type", "column", "value", "boolean", "not")
                                    .value());
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            scope.value,
                            Expression.class,
                            "Illuminate\\Database\\Query\\Expression"))) {
                this.addBinding(
                        env,
                        env.callMethod(
                                this.grammar,
                                "prepareBindingForJsonContains",
                                Builder.class,
                                scope.value));
            }

            throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "value")
    public Object orWhereJsonContains(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(this.whereJsonContains(env, column, value, "or"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "boolean")
    public Object whereJsonDoesntContain(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object _pBoolean = assignParameter(args, 2, true);
        if (null == _pBoolean) {
            _pBoolean = "and";
        }
        return ZVal.assign(this.whereJsonContains(env, column, value, _pBoolean, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "value")
    public Object orWhereJsonDoesntContain(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(this.whereJsonDoesntContain(env, column, value, "or"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object dynamicWhere(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        Object connector = null;
        Object segment = null;
        ReferenceContainer index = new BasicReferenceContainer(null);
        Object finder = null;
        Object segments = null;
        finder = function_substr.f.env(env).call(method, 5).value();
        segments =
                NamespaceGlobal.preg_split
                        .env(env)
                        .call("/(And|Or)(?=[A-Z])/", finder, -1, 2)
                        .value();
        connector = "and";
        index.setObject(0);
        for (ZPair zpairResult343 : ZVal.getIterable(segments, env, true)) {
            segment = ZVal.assign(zpairResult343.getValue());
            if (ZVal.toBool(ZVal.strictNotEqualityCheck(segment, "!==", "And"))
                    && ZVal.toBool(ZVal.strictNotEqualityCheck(segment, "!==", "Or"))) {
                this.addDynamic(env, segment, connector, parameters, index.getObject());
                index.setObject(ZVal.increment(index.getObject()));

            } else {
                connector = ZVal.assign(segment);
            }
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "segment")
    @ConvertedParameter(index = 1, name = "connector")
    @ConvertedParameter(index = 2, name = "parameters")
    @ConvertedParameter(index = 3, name = "index")
    protected Object addDynamic(RuntimeEnv env, Object... args) {
        Object segment = assignParameter(args, 0, false);
        Object connector = assignParameter(args, 1, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 2, false));
        Object index = assignParameter(args, 3, false);
        Object bool = null;
        bool = NamespaceGlobal.strtolower.env(env).call(connector).value();
        this.where(
                env,
                Str.runtimeStaticObject.snake(env, segment),
                "=",
                parameters.arrayGet(env, index),
                bool);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "groups")
    public Object groupBy(RuntimeEnv env, Object... args) {
        Object groups = assignParameterVarArgs(args, 0);
        Object group = null;
        for (ZPair zpairResult344 : ZVal.getIterable(groups, env, true)) {
            group = ZVal.assign(zpairResult344.getValue());
            this.groups =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    rToArrayCast(this.groups),
                                    Arr.runtimeStaticObject.wrap(env, group))
                            .value();
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "operator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "boolean")
    public Object having(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope106 scope = new Scope106();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
            scope.column = assignParameter(args, 0, false);
            scope.operator = assignParameter(args, 1, true);
            if (null == scope.operator) {
                scope.operator = ZVal.getNull();
            }
            scope.value = assignParameter(args, 2, true);
            if (null == scope.value) {
                scope.value = ZVal.getNull();
            }
            scope._pBoolean = assignParameter(args, 3, true);
            if (null == scope._pBoolean) {
                scope._pBoolean = "and";
            }
            scope.runtimeTempArrayResult49 = null;
            scope.runtimeTempArrayResult48 = null;
            scope.type = null;
            scope.type = "Basic";
            ZVal.list(
                    scope.runtimeTempArrayResult48 =
                            this.prepareValueAndOperator(
                                    env,
                                    scope.value,
                                    scope.operator,
                                    ZVal.strictEqualityCheck(
                                            function_func_num_args
                                                    .f
                                                    .env(env)
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithInfo(args, this))
                                                    .call()
                                                    .value(),
                                            "===",
                                            2)),
                    (scope.value = listGet(scope.runtimeTempArrayResult48, 0, env)),
                    (scope.operator = listGet(scope.runtimeTempArrayResult48, 1, env)));
            if (ZVal.isTrue(this.invalidOperator(env, scope.operator))) {
                ZVal.list(
                        scope.runtimeTempArrayResult49 =
                                ZVal.newArray(new ZPair(0, scope.operator), new ZPair(1, "=")),
                        (scope.value = listGet(scope.runtimeTempArrayResult49, 0, env)),
                        (scope.operator = listGet(scope.runtimeTempArrayResult49, 1, env)));
            }

            new ReferenceClassProperty(scope._thisVarAlias, "havings", env)
                    .arrayAppend(env)
                    .set(
                            function_compact
                                    .f
                                    .env(env)
                                    .call(stack, "type", "column", "operator", "value", "boolean")
                                    .value());
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            scope.value,
                            Expression.class,
                            "Illuminate\\Database\\Query\\Expression"))) {
                this.addBinding(env, scope.value, "having");
            }

            throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "operator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object orHaving(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, true);
        if (null == operator) {
            operator = ZVal.getNull();
        }
        Object value = assignParameter(args, 2, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object runtimeTempArrayResult50 = null;
        ZVal.list(
                runtimeTempArrayResult50 =
                        this.prepareValueAndOperator(
                                env,
                                value,
                                operator,
                                ZVal.strictEqualityCheck(
                                        function_func_num_args
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithInfo(args, this))
                                                .call()
                                                .value(),
                                        "===",
                                        2)),
                (value = listGet(runtimeTempArrayResult50, 0, env)),
                (operator = listGet(runtimeTempArrayResult50, 1, env)));
        return ZVal.assign(this.having(env, column, operator, value, "or"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sql")
    @ConvertedParameter(
        index = 1,
        name = "bindings",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 2, name = "boolean")
    public Object havingRaw(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope107 scope = new Scope107();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
            scope.sql = assignParameter(args, 0, false);
            scope.bindings = assignParameter(args, 1, true);
            if (null == scope.bindings) {
                scope.bindings = ZVal.newArray();
            }
            scope._pBoolean = assignParameter(args, 2, true);
            if (null == scope._pBoolean) {
                scope._pBoolean = "and";
            }
            scope.type = null;
            scope.type = "Raw";
            new ReferenceClassProperty(scope._thisVarAlias, "havings", env)
                    .arrayAppend(env)
                    .set(function_compact.f.env(env).call(stack, "type", "sql", "boolean").value());
            this.addBinding(env, scope.bindings, "having");
            throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sql")
    @ConvertedParameter(
        index = 1,
        name = "bindings",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object orHavingRaw(RuntimeEnv env, Object... args) {
        Object sql = assignParameter(args, 0, false);
        Object bindings = assignParameter(args, 1, true);
        if (null == bindings) {
            bindings = ZVal.newArray();
        }
        return ZVal.assign(this.havingRaw(env, sql, bindings, "or"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "direction")
    public Object orderBy(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object direction = assignParameter(args, 1, true);
        if (null == direction) {
            direction = "asc";
        }
        new ReferenceClassProperty(this, ZVal.isTrue(this.unions) ? "unionOrders" : "orders", env)
                .arrayAppend(env)
                .set(
                        ZVal.newArray(
                                new ZPair("column", column),
                                new ZPair(
                                        "direction",
                                        ZVal.equalityCheck(
                                                        NamespaceGlobal.strtolower
                                                                .env(env)
                                                                .call(direction)
                                                                .value(),
                                                        "asc")
                                                ? "asc"
                                                : "desc")));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object orderByDesc(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.orderBy(env, column, "desc"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object latest(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, true);
        if (null == column) {
            column = "created_at";
        }
        return ZVal.assign(this.orderBy(env, column, "desc"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object oldest(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, true);
        if (null == column) {
            column = "created_at";
        }
        return ZVal.assign(this.orderBy(env, column, "asc"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "seed")
    public Object inRandomOrder(RuntimeEnv env, Object... args) {
        Object seed = assignParameter(args, 0, true);
        if (null == seed) {
            seed = "";
        }
        return ZVal.assign(
                this.orderByRaw(
                        env, env.callMethod(this.grammar, "compileRandom", Builder.class, seed)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sql")
    @ConvertedParameter(index = 1, name = "bindings", defaultValue = "", defaultValueType = "array")
    public Object orderByRaw(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope108 scope = new Scope108();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
            scope.sql = assignParameter(args, 0, false);
            scope.bindings = assignParameter(args, 1, true);
            if (null == scope.bindings) {
                scope.bindings = ZVal.newArray();
            }
            scope.type = null;
            scope.type = "Raw";
            new ReferenceClassProperty(
                            scope._thisVarAlias,
                            ZVal.isTrue(this.unions) ? "unionOrders" : "orders",
                            env)
                    .arrayAppend(env)
                    .set(function_compact.f.env(env).call(stack, "type", "sql").value());
            this.addBinding(env, scope.bindings, "order");
            throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object skip(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(this.offset(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object offset(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object property = null;
        property = ZVal.assign(ZVal.isTrue(this.unions) ? "unionOffset" : "offset");
        toObjectR(this)
                .accessProp(this, env)
                .name(property)
                .set(NamespaceGlobal.max.env(env).call(0, value).value());
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object take(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(this.limit(env, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object limit(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object property = null;
        property = ZVal.assign(ZVal.isTrue(this.unions) ? "unionLimit" : "limit");
        if (ZVal.isGreaterThanOrEqualTo(value, ">=", 0)) {
            toObjectR(this).accessProp(this, env).name(property).set(value);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "page")
    @ConvertedParameter(
        index = 1,
        name = "perPage",
        defaultValue = "15",
        defaultValueType = "number"
    )
    public Object forPage(RuntimeEnv env, Object... args) {
        Object page = assignParameter(args, 0, false);
        Object perPage = assignParameter(args, 1, true);
        if (null == perPage) {
            perPage = 15;
        }
        return ZVal.assign(
                env.callMethod(
                        this.skip(env, ZVal.multiply(ZVal.subtract(page, 1), perPage)),
                        "take",
                        Builder.class,
                        perPage));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "perPage",
        defaultValue = "15",
        defaultValueType = "number"
    )
    @ConvertedParameter(index = 1, name = "lastId", defaultValue = "0", defaultValueType = "number")
    @ConvertedParameter(index = 2, name = "column")
    public Object forPageAfterId(RuntimeEnv env, Object... args) {
        Object perPage = assignParameter(args, 0, true);
        if (null == perPage) {
            perPage = 15;
        }
        Object lastId = assignParameter(args, 1, true);
        if (null == lastId) {
            lastId = 0;
        }
        Object column = assignParameter(args, 2, true);
        if (null == column) {
            column = "id";
        }
        this.orders = this.removeExistingOrdersFor(env, column);
        if (!function_is_null.f.env(env).call(lastId).getBool()) {
            this.where(env, column, ">", lastId);
        }

        return ZVal.assign(
                env.callMethod(this.orderBy(env, column, "asc"), "take", Builder.class, perPage));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    protected Object removeExistingOrdersFor(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        Collection.runtimeStaticObject.make(env, this.orders),
                                        "reject",
                                        Builder.class,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Database\\Query",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "order")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                ReferenceContainer order =
                                                        new BasicReferenceContainer(
                                                                assignParameter(args, 0, false));
                                                Object column = null;
                                                column =
                                                        this.contextReferences.getCapturedValue(
                                                                "column");
                                                return ZVal.assign(
                                                        arrayActionR(
                                                                        ArrayAction.ISSET,
                                                                        order,
                                                                        env,
                                                                        "column")
                                                                ? ZVal.strictEqualityCheck(
                                                                        order.arrayGet(
                                                                                env, "column"),
                                                                        "===",
                                                                        column)
                                                                : false);
                                            }
                                        }.use("column", column)),
                                "values",
                                Builder.class),
                        "all",
                        Builder.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(
        index = 1,
        name = "all",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object union(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope109 scope = new Scope109();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
            scope.query = assignParameter(args, 0, false);
            scope.all = assignParameter(args, 1, true);
            if (null == scope.all) {
                scope.all = false;
            }
            if (ZVal.isTrue(ZVal.checkInstanceType(scope.query, Closure.class, "Closure"))) {
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(scope.query, scope.query = this.newQuery(env));
            }

            new ReferenceClassProperty(scope._thisVarAlias, "unions", env)
                    .arrayAppend(env)
                    .set(function_compact.f.env(env).call(stack, "query", "all").value());
            this.addBinding(
                    env, env.callMethod(scope.query, "getBindings", Builder.class), "union");
            throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    public Object unionAll(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        return ZVal.assign(this.union(env, query, true));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "value",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object lock(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = true;
        }
        this.lock = value;
        if (!function_is_null.f.env(env).call(this.lock).getBool()) {
            this.useWritePdo(env);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object lockForUpdate(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.lock(env, true));
    }

    @ConvertedMethod
    public Object sharedLock(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.lock(env, false));
    }

    @ConvertedMethod
    public Object toSql(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.grammar, "compileSelect", Builder.class, this));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(
        index = 1,
        name = "columns",
        defaultValue = "ZVal.arrayFromList(\"*\")",
        defaultValueType = "array"
    )
    public Object find(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        Object columns = assignParameter(args, 1, true);
        if (null == columns) {
            columns = ZVal.arrayFromList("*");
        }
        return ZVal.assign(
                env.callMethod(this.where(env, "id", "=", id), "first", Builder.class, columns));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object value(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object result = null;
        result = ZVal.assign(rToArrayCast(this.first(env, ZVal.newArray(new ZPair(0, column)))));
        return ZVal.assign(
                ZVal.isGreaterThan(function_count.f.env(env).call(result).value(), '>', 0)
                        ? function_reset.f.env(env).call(result).value()
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "columns",
        defaultValue = "ZVal.arrayFromList(\"*\")",
        defaultValueType = "array"
    )
    public Object get(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
        Object columns = assignParameter(args, 0, true);
        if (null == columns) {
            columns = ZVal.arrayFromList("*");
        }
        return ZVal.assign(
                collect.f
                        .env(env)
                        .call(
                                this.onceWithColumns(
                                        env,
                                        columns,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Database\\Query",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object _closureThisVar = this.getClosureThisVar();
                                                return ZVal.assign(
                                                        env.callMethod(
                                                                Builder.this.processor,
                                                                "processSelect",
                                                                Builder.class,
                                                                _closureThisVar,
                                                                Builder.this.runSelect(env)));
                                            }
                                        }))
                        .value());
    }

    @ConvertedMethod
    protected Object runSelect(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.connection,
                        "select",
                        Builder.class,
                        this.toSql(env),
                        this.getBindings(env),
                        !ZVal.isTrue(this.useWritePdo)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "perPage",
        defaultValue = "15",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 1,
        name = "columns",
        defaultValue = "ZVal.arrayFromList(\"*\")",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 2, name = "pageName")
    @ConvertedParameter(
        index = 3,
        name = "page",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object paginate(RuntimeEnv env, Object... args) {
        Object perPage = assignParameter(args, 0, true);
        if (null == perPage) {
            perPage = 15;
        }
        Object columns = assignParameter(args, 1, true);
        if (null == columns) {
            columns = ZVal.arrayFromList("*");
        }
        Object pageName = assignParameter(args, 2, true);
        if (null == pageName) {
            pageName = "page";
        }
        Object page = assignParameter(args, 3, true);
        if (null == page) {
            page = ZVal.getNull();
        }
        Object total = null;
        Object ternaryExpressionTemp = null;
        Object results = null;
        page =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = page)
                                ? ternaryExpressionTemp
                                : Paginator.runtimeStaticObject.resolveCurrentPage(env, pageName));
        total = this.getCountForPagination(env, columns);
        results =
                ZVal.assign(
                        ZVal.isTrue(total)
                                ? env.callMethod(
                                        this.forPage(env, page, perPage),
                                        "get",
                                        Builder.class,
                                        columns)
                                : collect.f.env(env).call().value());
        return ZVal.assign(
                this.paginator(
                        env,
                        results,
                        total,
                        perPage,
                        page,
                        ZVal.newArray(
                                new ZPair(
                                        "path",
                                        Paginator.runtimeStaticObject.resolveCurrentPath(env)),
                                new ZPair("pageName", pageName))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "perPage",
        defaultValue = "15",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 1,
        name = "columns",
        defaultValue = "ZVal.arrayFromList(\"*\")",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 2, name = "pageName")
    @ConvertedParameter(
        index = 3,
        name = "page",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object simplePaginate(RuntimeEnv env, Object... args) {
        Object perPage = assignParameter(args, 0, true);
        if (null == perPage) {
            perPage = 15;
        }
        Object columns = assignParameter(args, 1, true);
        if (null == columns) {
            columns = ZVal.arrayFromList("*");
        }
        Object pageName = assignParameter(args, 2, true);
        if (null == pageName) {
            pageName = "page";
        }
        Object page = assignParameter(args, 3, true);
        if (null == page) {
            page = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        page =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = page)
                                ? ternaryExpressionTemp
                                : Paginator.runtimeStaticObject.resolveCurrentPage(env, pageName));
        env.callMethod(
                this.skip(env, ZVal.multiply(ZVal.subtract(page, 1), perPage)),
                "take",
                Builder.class,
                ZVal.add(perPage, 1));
        return ZVal.assign(
                this.simplePaginator(
                        env,
                        this.get(env, columns),
                        perPage,
                        page,
                        ZVal.newArray(
                                new ZPair(
                                        "path",
                                        Paginator.runtimeStaticObject.resolveCurrentPath(env)),
                                new ZPair("pageName", pageName))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "columns",
        defaultValue = "ZVal.arrayFromList(\"*\")",
        defaultValueType = "array"
    )
    public Object getCountForPagination(RuntimeEnv env, Object... args) {
        Object columns = assignParameter(args, 0, true);
        if (null == columns) {
            columns = ZVal.arrayFromList("*");
        }
        ReferenceContainer results = new BasicReferenceContainer(null);
        results.setObject(this.runPaginationCountQuery(env, columns));
        if (ZVal.isset(this.groups)) {
            return ZVal.assign(function_count.f.env(env).call(results.getObject()).value());

        } else if (!arrayActionR(ArrayAction.ISSET, results, env, 0)) {
            return 0;

        } else if (function_is_object.f.env(env).call(results.arrayGet(env, 0)).getBool()) {
            return ZVal.assign(
                    ZVal.toLong(
                            toObjectR(results.arrayGet(env, 0))
                                    .accessProp(this, env)
                                    .name("aggregate")
                                    .value()));
        }

        return ZVal.assign(
                ZVal.toLong(
                        handleReturnReference(
                                        function_array_change_key_case
                                                .f
                                                .env(env)
                                                .call(rToArrayCast(results.arrayGet(env, 0)))
                                                .value())
                                .arrayGet(env, "aggregate")));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "columns",
        defaultValue = "ZVal.arrayFromList(\"*\")",
        defaultValueType = "array"
    )
    protected Object runPaginationCountQuery(RuntimeEnv env, Object... args) {
        Object columns = assignParameter(args, 0, true);
        if (null == columns) {
            columns = ZVal.arrayFromList("*");
        }
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                this.cloneWithout(
                                                        env,
                                                        ZVal.arrayFromList(
                                                                "columns", "orders", "limit",
                                                                "offset")),
                                                "cloneWithoutBindings",
                                                Builder.class,
                                                ZVal.arrayFromList("select", "order")),
                                        "setAggregate",
                                        Builder.class,
                                        "count",
                                        this.withoutSelectAliases(env, columns)),
                                "get",
                                Builder.class),
                        "all",
                        Builder.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "columns", typeHint = "array")
    protected Object withoutSelectAliases(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
        Object columns = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Query",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "column")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object column = assignParameter(args, 0, false);
                                        Object aliasPosition = null;
                                        return ZVal.assign(
                                                ZVal.toBool(
                                                                        function_is_string
                                                                                .f
                                                                                .env(env)
                                                                                .call(column)
                                                                                .value())
                                                                && ZVal.toBool(
                                                                        ZVal.strictNotEqualityCheck(
                                                                                aliasPosition =
                                                                                        function_stripos
                                                                                                .f
                                                                                                .env(
                                                                                                        env)
                                                                                                .call(
                                                                                                        column,
                                                                                                        " as ")
                                                                                                .value(),
                                                                                "!==",
                                                                                false))
                                                        ? function_substr
                                                                .f
                                                                .env(env)
                                                                .call(column, 0, aliasPosition)
                                                                .value()
                                                        : column);
                                    }
                                },
                                columns)
                        .value());
    }

    @ConvertedMethod
    public Object cursor(RuntimeEnv env, Object... args) {
        if (function_is_null.f.env(env).call(this.columns).getBool()) {
            this.columns = ZVal.arrayFromList("*");
        }

        return ZVal.assign(
                env.callMethod(
                        this.connection,
                        "cursor",
                        Builder.class,
                        this.toSql(env),
                        this.getBindings(env),
                        !ZVal.isTrue(this.useWritePdo)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "callable")
    @ConvertedParameter(index = 2, name = "column")
    @ConvertedParameter(
        index = 3,
        name = "alias",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object chunkById(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object count = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        Object column = assignParameter(args, 2, true);
        if (null == column) {
            column = "id";
        }
        Object alias = assignParameter(args, 3, true);
        if (null == alias) {
            alias = ZVal.getNull();
        }
        Object countResults = null;
        Object clone = null;
        Object lastId = null;
        Object ternaryExpressionTemp = null;
        ReferenceContainer results = new BasicReferenceContainer(null);
        alias =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = alias)
                                ? ternaryExpressionTemp
                                : column);
        lastId = ZVal.getNull();
        runtimeConverterBreakCount = 0;
        do {
            clone = ZVal.assign(((RuntimeClassInterface) this).phpClone(env));
            results.setObject(
                    env.callMethod(
                            env.callMethod(
                                    clone, "forPageAfterId", Builder.class, count, lastId, column),
                            "get",
                            Builder.class));
            countResults = env.callMethod(results.getObject(), "count", Builder.class);
            if (ZVal.equalityCheck(countResults, 0)) {
                break;
            }

            if (ZVal.strictEqualityCheck(
                    env.callFunctionDynamic(
                                    callback,
                                    new RuntimeArgsWithReferences().add(0, results),
                                    results.getObject())
                            .value(),
                    "===",
                    false)) {
                return ZVal.assign(false);
            }

            lastId =
                    ZVal.assign(
                            toObjectR(env.callMethod(results.getObject(), "last", Builder.class))
                                    .accessProp(this, env)
                                    .name(alias)
                                    .value());
            results.setObject(null);

        } while (ZVal.equalityCheck(countResults, count));

        return ZVal.assign(true);
    }

    @ConvertedMethod
    protected Object enforceOrderBy(RuntimeEnv env, Object... args) {
        if (ZVal.toBool(ZVal.isEmpty(this.orders)) && ZVal.toBool(ZVal.isEmpty(this.unionOrders))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env, "You must specify an orderBy clause when using this function."));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object pluck(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
        Object column = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        ReferenceContainer queryResult = new BasicReferenceContainer(null);
        queryResult.setObject(
                this.onceWithColumns(
                        env,
                        function_is_null.f.env(env).call(key).getBool()
                                ? ZVal.newArray(new ZPair(0, column))
                                : ZVal.newArray(new ZPair(0, column), new ZPair(1, key)),
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database\\Query",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                return ZVal.assign(
                                        env.callMethod(
                                                Builder.this.processor,
                                                "processSelect",
                                                Builder.class,
                                                _closureThisVar,
                                                Builder.this.runSelect(env)));
                            }
                        }));
        if (ZVal.isEmpty(queryResult.getObject())) {
            return ZVal.assign(collect.f.env(env).call().value());
        }

        column = this.stripTableForPluck(env, column);
        key = this.stripTableForPluck(env, key);
        return ZVal.assign(
                function_is_array.f.env(env).call(queryResult.arrayGet(env, 0)).getBool()
                        ? this.pluckFromArrayColumn(env, queryResult.getObject(), column, key)
                        : this.pluckFromObjectColumn(env, queryResult.getObject(), column, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    protected Object stripTableForPluck(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(
                function_is_null.f.env(env).call(column).getBool()
                        ? column
                        : last.f
                                .env(env)
                                .call(
                                        NamespaceGlobal.preg_split
                                                .env(env)
                                                .call("~\\.| ~", column)
                                                .value())
                                .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queryResult")
    @ConvertedParameter(index = 1, name = "column")
    @ConvertedParameter(index = 2, name = "key")
    protected Object pluckFromObjectColumn(RuntimeEnv env, Object... args) {
        Object queryResult = assignParameter(args, 0, false);
        Object column = assignParameter(args, 1, false);
        Object key = assignParameter(args, 2, false);
        Object row = null;
        ReferenceContainer results = new BasicReferenceContainer(null);
        results.setObject(ZVal.newArray());
        if (function_is_null.f.env(env).call(key).getBool()) {
            for (ZPair zpairResult345 : ZVal.getIterable(queryResult, env, true)) {
                row = ZVal.assign(zpairResult345.getValue());
                results.arrayAppend(env)
                        .set(toObjectR(row).accessProp(this, env).name(column).value());
            }

        } else {
            for (ZPair zpairResult346 : ZVal.getIterable(queryResult, env, true)) {
                row = ZVal.assign(zpairResult346.getValue());
                results.arrayAccess(env, toObjectR(row).accessProp(this, env).name(key).value())
                        .set(toObjectR(row).accessProp(this, env).name(column).value());
            }
        }

        return ZVal.assign(collect.f.env(env).call(results.getObject()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queryResult")
    @ConvertedParameter(index = 1, name = "column")
    @ConvertedParameter(index = 2, name = "key")
    protected Object pluckFromArrayColumn(RuntimeEnv env, Object... args) {
        Object queryResult = assignParameter(args, 0, false);
        Object column = assignParameter(args, 1, false);
        Object key = assignParameter(args, 2, false);
        ReferenceContainer row = new BasicReferenceContainer(null);
        ReferenceContainer results = new BasicReferenceContainer(null);
        results.setObject(ZVal.newArray());
        if (function_is_null.f.env(env).call(key).getBool()) {
            for (ZPair zpairResult347 : ZVal.getIterable(queryResult, env, true)) {
                row.setObject(ZVal.assign(zpairResult347.getValue()));
                results.arrayAppend(env).set(row.arrayGet(env, column));
            }

        } else {
            for (ZPair zpairResult348 : ZVal.getIterable(queryResult, env, true)) {
                row.setObject(ZVal.assign(zpairResult348.getValue()));
                results.arrayAccess(env, row.arrayGet(env, key)).set(row.arrayGet(env, column));
            }
        }

        return ZVal.assign(collect.f.env(env).call(results.getObject()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "glue")
    public Object implode(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object glue = assignParameter(args, 1, true);
        if (null == glue) {
            glue = "";
        }
        return ZVal.assign(env.callMethod(this.pluck(env, column), "implode", Builder.class, glue));
    }

    @ConvertedMethod
    public Object exists(RuntimeEnv env, Object... args) {
        ReferenceContainer results = new BasicReferenceContainer(null);
        results.setObject(
                env.callMethod(
                        this.connection,
                        "select",
                        Builder.class,
                        env.callMethod(this.grammar, "compileExists", Builder.class, this),
                        this.getBindings(env),
                        !ZVal.isTrue(this.useWritePdo)));
        if (arrayActionR(ArrayAction.ISSET, results, env, 0)) {
            results.setObject(ZVal.assign(rToArrayCast(results.arrayGet(env, 0))));
            return ZVal.assign(ZVal.toBool(results.arrayGet(env, "exists")));
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object doesntExist(RuntimeEnv env, Object... args) {
        return ZVal.assign(!ZVal.isTrue(this.exists(env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "columns")
    public Object count(RuntimeEnv env, Object... args) {
        Object columns = assignParameter(args, 0, true);
        if (null == columns) {
            columns = "*";
        }
        return ZVal.assign(
                ZVal.toLong(
                        this.aggregate(env, "count", Arr.runtimeStaticObject.wrap(env, columns))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object min(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.aggregate(env, "min", ZVal.newArray(new ZPair(0, column))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object max(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.aggregate(env, "max", ZVal.newArray(new ZPair(0, column))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object sum(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object result = null;
        Object ternaryExpressionTemp = null;
        result = this.aggregate(env, "sum", ZVal.newArray(new ZPair(0, column)));
        return ZVal.assign(ZVal.isTrue(ternaryExpressionTemp = result) ? ternaryExpressionTemp : 0);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object avg(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.aggregate(env, "avg", ZVal.newArray(new ZPair(0, column))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object average(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.avg(env, column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "function")
    @ConvertedParameter(
        index = 1,
        name = "columns",
        defaultValue = "ZVal.arrayFromList(\"*\")",
        defaultValueType = "array"
    )
    public Object aggregate(RuntimeEnv env, Object... args) {
        Object function = assignParameter(args, 0, false);
        Object columns = assignParameter(args, 1, true);
        if (null == columns) {
            columns = ZVal.arrayFromList("*");
        }
        ReferenceContainer results = new BasicReferenceContainer(null);
        results.setObject(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        this.cloneWithout(env, ZVal.arrayFromList("columns")),
                                        "cloneWithoutBindings",
                                        Builder.class,
                                        ZVal.arrayFromList("select")),
                                "setAggregate",
                                Builder.class,
                                function,
                                columns),
                        "get",
                        Builder.class,
                        columns));
        if (!ZVal.isTrue(env.callMethod(results.getObject(), "isEmpty", Builder.class))) {
            return ZVal.assign(
                    handleReturnReference(
                                    function_array_change_key_case
                                            .f
                                            .env(env)
                                            .call(rToArrayCast(results.arrayGet(env, 0)))
                                            .value())
                            .arrayGet(env, "aggregate"));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "function")
    @ConvertedParameter(
        index = 1,
        name = "columns",
        defaultValue = "ZVal.arrayFromList(\"*\")",
        defaultValueType = "array"
    )
    public Object numericAggregate(RuntimeEnv env, Object... args) {
        Object function = assignParameter(args, 0, false);
        Object columns = assignParameter(args, 1, true);
        if (null == columns) {
            columns = ZVal.arrayFromList("*");
        }
        Object result = null;
        result = this.aggregate(env, function, columns);
        if (!ZVal.isTrue(result)) {
            return 0;
        }

        if (ZVal.toBool(function_is_int.f.env(env).call(result).value())
                || ZVal.toBool(function_is_float.f.env(env).call(result).value())) {
            return ZVal.assign(result);
        }

        return ZVal.assign(
                ZVal.strictEqualityCheck(
                                function_strpos
                                        .f
                                        .env(env)
                                        .call(toStringR(result, env), ".")
                                        .value(),
                                "===",
                                false)
                        ? ZVal.toLong(result)
                        : ZVal.toDouble(result));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "function")
    @ConvertedParameter(index = 1, name = "columns")
    protected Object setAggregate(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope110 scope = new Scope110();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
            scope.function = assignParameter(args, 0, false);
            scope.columns = assignParameter(args, 1, false);
            this.aggregate = function_compact.f.env(env).call(stack, "function", "columns").value();
            if (ZVal.isEmpty(this.groups)) {
                this.orders = ZVal.getNull();
                new ReferenceClassProperty(scope._thisVarAlias, "bindings", env)
                        .arrayAccess(env, "order")
                        .set(ZVal.newArray());
            }

            throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "columns")
    @ConvertedParameter(index = 1, name = "callback")
    protected Object onceWithColumns(RuntimeEnv env, Object... args) {
        Object columns = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        Object result = null;
        Object original = null;
        original = ZVal.assign(this.columns);
        if (function_is_null.f.env(env).call(original).getBool()) {
            this.columns = columns;
        }

        result = env.callFunctionDynamic(callback, new RuntimeArgsWithReferences()).value();
        this.columns = original;
        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values", typeHint = "array")
    public Object insert(RuntimeEnv env, Object... args) {
        ReferenceContainer values = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object value = null;
        Object key = null;
        if (ZVal.isEmpty(values.getObject())) {
            return ZVal.assign(true);
        }

        if (!function_is_array
                .f
                .env(env)
                .call(function_reset.f.env(env).call(values.getObject()).value())
                .getBool()) {
            values.setObject(ZVal.newArray(new ZPair(0, values.getObject())));

        } else {
            for (ZPair zpairResult349 : ZVal.getIterable(values.getObject(), env, false)) {
                key = ZVal.assign(zpairResult349.getKey());
                value = ZVal.assign(zpairResult349.getValue());
                function_ksort.f.env(env).call(value);
                values.arrayAccess(env, key).set(value);
            }
        }

        return ZVal.assign(
                env.callMethod(
                        this.connection,
                        "insert",
                        Builder.class,
                        env.callMethod(
                                this.grammar,
                                "compileInsert",
                                Builder.class,
                                this,
                                values.getObject()),
                        this.cleanBindings(
                                env, Arr.runtimeStaticObject.flatten(env, values.getObject(), 1))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "sequence",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object insertGetId(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        Object sequence = assignParameter(args, 1, true);
        if (null == sequence) {
            sequence = ZVal.getNull();
        }
        Object sql = null;
        sql =
                env.callMethod(
                        this.grammar, "compileInsertGetId", Builder.class, this, values, sequence);
        values = this.cleanBindings(env, values);
        return ZVal.assign(
                env.callMethod(
                        this.processor,
                        "processInsertGetId",
                        Builder.class,
                        this,
                        sql,
                        values,
                        sequence));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values", typeHint = "array")
    public Object update(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        Object sql = null;
        sql = env.callMethod(this.grammar, "compileUpdate", Builder.class, this, values);
        return ZVal.assign(
                env.callMethod(
                        this.connection,
                        "update",
                        Builder.class,
                        sql,
                        this.cleanBindings(
                                env,
                                env.callMethod(
                                        this.grammar,
                                        "prepareBindingsForUpdate",
                                        Builder.class,
                                        this.bindings,
                                        values))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "values",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object updateOrInsert(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, true);
        if (null == values) {
            values = ZVal.newArray();
        }
        if (!ZVal.isTrue(env.callMethod(this.where(env, attributes), "exists", Builder.class))) {
            return ZVal.assign(
                    this.insert(
                            env, function_array_merge.f.env(env).call(attributes, values).value()));
        }

        return ZVal.assign(
                ZVal.toBool(env.callMethod(this.take(env, 1), "update", Builder.class, values)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "amount", defaultValue = "1", defaultValueType = "number")
    @ConvertedParameter(
        index = 2,
        name = "extra",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object increment(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object amount = assignParameter(args, 1, true);
        if (null == amount) {
            amount = 1;
        }
        Object extra = assignParameter(args, 2, true);
        if (null == extra) {
            extra = ZVal.newArray();
        }
        Object columns = null;
        Object wrapped = null;
        if (!function_is_numeric.f.env(env).call(amount).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Non-numeric value passed to increment method."));
        }

        wrapped = env.callMethod(this.grammar, "wrap", Builder.class, column);
        columns =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(
                                                column,
                                                this.raw(
                                                        env,
                                                        toStringR(wrapped, env)
                                                                + " + "
                                                                + toStringR(amount, env)))),
                                extra)
                        .value();
        return ZVal.assign(this.update(env, columns));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "amount", defaultValue = "1", defaultValueType = "number")
    @ConvertedParameter(
        index = 2,
        name = "extra",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object decrement(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object amount = assignParameter(args, 1, true);
        if (null == amount) {
            amount = 1;
        }
        Object extra = assignParameter(args, 2, true);
        if (null == extra) {
            extra = ZVal.newArray();
        }
        Object columns = null;
        Object wrapped = null;
        if (!function_is_numeric.f.env(env).call(amount).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Non-numeric value passed to decrement method."));
        }

        wrapped = env.callMethod(this.grammar, "wrap", Builder.class, column);
        columns =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(
                                                column,
                                                this.raw(
                                                        env,
                                                        toStringR(wrapped, env)
                                                                + " - "
                                                                + toStringR(amount, env)))),
                                extra)
                        .value();
        return ZVal.assign(this.update(env, columns));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "id",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object delete(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, true);
        if (null == id) {
            id = ZVal.getNull();
        }
        if (!function_is_null.f.env(env).call(id).getBool()) {
            this.where(env, toStringR(this.from, env) + ".id", "=", id);
        }

        return ZVal.assign(
                env.callMethod(
                        this.connection,
                        "delete",
                        Builder.class,
                        env.callMethod(this.grammar, "compileDelete", Builder.class, this),
                        this.cleanBindings(
                                env,
                                env.callMethod(
                                        this.grammar,
                                        "prepareBindingsForDelete",
                                        Builder.class,
                                        this.bindings))));
    }

    @ConvertedMethod
    public Object truncate(RuntimeEnv env, Object... args) {
        Object bindings = null;
        Object sql = null;
        for (ZPair zpairResult350 :
                ZVal.getIterable(
                        env.callMethod(this.grammar, "compileTruncate", Builder.class, this),
                        env,
                        false)) {
            sql = ZVal.assign(zpairResult350.getKey());
            bindings = ZVal.assign(zpairResult350.getValue());
            env.callMethod(this.connection, "statement", Builder.class, sql, bindings);
        }

        return null;
    }

    @ConvertedMethod
    public Object newQuery(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this, this.connection, this.grammar, this.processor));
    }

    @ConvertedMethod
    protected Object forSubQuery(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.newQuery(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object raw(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.connection, "raw", Builder.class, value));
    }

    @ConvertedMethod
    public Object getBindings(RuntimeEnv env, Object... args) {
        return ZVal.assign(Arr.runtimeStaticObject.flatten(env, this.bindings));
    }

    @ConvertedMethod
    public Object getRawBindings(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.bindings);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bindings", typeHint = "array")
    @ConvertedParameter(index = 1, name = "type")
    public Object setBindings(RuntimeEnv env, Object... args) {
        Object bindings = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = "where";
        }
        if (!function_array_key_exists.f.env(env).call(type, this.bindings).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Invalid binding type: " + toStringR(type, env) + "."));
        }

        new ReferenceClassProperty(this, "bindings", env).arrayAccess(env, type).set(bindings);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(index = 1, name = "type")
    public Object addBinding(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = "where";
        }
        if (!function_array_key_exists.f.env(env).call(type, this.bindings).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Invalid binding type: " + toStringR(type, env) + "."));
        }

        if (function_is_array.f.env(env).call(value).getBool()) {
            new ReferenceClassProperty(this, "bindings", env)
                    .arrayAccess(env, type)
                    .set(
                            function_array_values
                                    .f
                                    .env(env)
                                    .call(
                                            function_array_merge
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            new ReferenceClassProperty(
                                                                            this, "bindings", env)
                                                                    .arrayGet(env, type),
                                                            value)
                                                    .value())
                                    .value());

        } else {
            new ReferenceClassProperty(this, "bindings", env).arrayAppend(env, type).set(value);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query", typeHint = "self")
    public Object mergeBindings(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        this.bindings =
                function_array_merge_recursive
                        .f
                        .env(env)
                        .call(
                                this.bindings,
                                toObjectR(query).accessProp(this, env).name("bindings").value())
                        .value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bindings", typeHint = "array")
    protected Object cleanBindings(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
        Object bindings = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_values
                        .f
                        .env(env)
                        .call(
                                function_array_filter
                                        .f
                                        .env(env)
                                        .call(
                                                bindings,
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Illuminate\\Database\\Query",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "binding")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object binding =
                                                                assignParameter(args, 0, false);
                                                        return ZVal.assign(
                                                                !ZVal.isTrue(
                                                                        ZVal.checkInstanceType(
                                                                                binding,
                                                                                Expression.class,
                                                                                "Illuminate\\Database\\Query\\Expression")));
                                                    }
                                                })
                                        .value())
                        .value());
    }

    @ConvertedMethod
    public Object getConnection(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.connection);
    }

    @ConvertedMethod
    public Object getProcessor(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.processor);
    }

    @ConvertedMethod
    public Object getGrammar(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.grammar);
    }

    @ConvertedMethod
    public Object useWritePdo(RuntimeEnv env, Object... args) {
        this.useWritePdo = true;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "properties", typeHint = "array")
    public Object cloneWithout(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
        Object properties = assignParameter(args, 0, false);
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                ((RuntimeClassInterface) this).phpClone(env),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Query",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "clone")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object clone = assignParameter(args, 0, false);
                                        Object property = null;
                                        Object properties = null;
                                        properties =
                                                this.contextReferences.getCapturedValue(
                                                        "properties");
                                        for (ZPair zpairResult351 :
                                                ZVal.getIterable(properties, env, true)) {
                                            property = ZVal.assign(zpairResult351.getValue());
                                            toObjectR(clone)
                                                    .accessProp(this, env)
                                                    .name(property)
                                                    .set(ZVal.getNull());
                                        }

                                        return null;
                                    }
                                }.use("properties", properties))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "except", typeHint = "array")
    public Object cloneWithoutBindings(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Query")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php");
        Object except = assignParameter(args, 0, false);
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                ((RuntimeClassInterface) this).phpClone(env),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Query",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "clone")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object clone = assignParameter(args, 0, false);
                                        Object except = null;
                                        Object type = null;
                                        except = this.contextReferences.getCapturedValue("except");
                                        for (ZPair zpairResult352 :
                                                ZVal.getIterable(except, env, true)) {
                                            type = ZVal.assign(zpairResult352.getValue());
                                            new ReferenceClassProperty(clone, "bindings", env)
                                                    .arrayAccess(env, type)
                                                    .set(ZVal.newArray());
                                        }

                                        return null;
                                    }
                                }.use("except", except))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object parameters = assignParameter(args, 1, false);
        if (ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Builder.class)
                        .method("hasMacro")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, method))
                        .call(method.getObject())
                        .value())) {
            return ZVal.assign(
                    env.callMethod(
                            this, "macroCall", Builder.class, method.getObject(), parameters));
        }

        if (ZVal.isTrue(Str.runtimeStaticObject.startsWith(env, method.getObject(), "where"))) {
            return ZVal.assign(this.dynamicWhere(env, method.getObject(), parameters));
        }

        throw ZVal.getException(
                env,
                new BadMethodCallException(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Method %s::%s does not exist.",
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "class"),
                                        method.getObject())
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "callable")
    public Object chunk(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object count = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        Object countResults = null;
        ReferenceContainer page = new BasicReferenceContainer(null);
        ReferenceContainer results = new BasicReferenceContainer(null);
        this.enforceOrderBy(env);
        page.setObject(1);
        runtimeConverterBreakCount = 0;
        do {
            results.setObject(
                    env.callMethod(
                            this.forPage(env, page.getObject(), count), "get", Builder.class));
            countResults = env.callMethod(results.getObject(), "count", Builder.class);
            if (ZVal.equalityCheck(countResults, 0)) {
                break;
            }

            if (ZVal.strictEqualityCheck(
                    env.callFunctionDynamic(
                                    callback,
                                    new RuntimeArgsWithReferences().add(0, results).add(1, page),
                                    results.getObject(),
                                    page.getObject())
                            .value(),
                    "===",
                    false)) {
                return ZVal.assign(false);
            }

            results.setObject(null);
            page.setObject(ZVal.increment(page.getObject()));

        } while (ZVal.equalityCheck(countResults, count));

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    @ConvertedParameter(
        index = 1,
        name = "count",
        defaultValue = "1000",
        defaultValueType = "number"
    )
    public Object each(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Concerns/BuildsQueries.php");
        Object callback = assignParameter(args, 0, false);
        Object count = assignParameter(args, 1, true);
        if (null == count) {
            count = 1000;
        }
        return ZVal.assign(
                this.chunk(
                        env,
                        count,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database\\Concerns",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "results")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object results = assignParameter(args, 0, false);
                                Object callback = null;
                                ReferenceContainer value = new BasicReferenceContainer(null);
                                ReferenceContainer key = new BasicReferenceContainer(null);
                                callback = this.contextReferences.getCapturedValue("callback");
                                for (ZPair zpairResult2305 :
                                        ZVal.getIterable(results, env, false)) {
                                    key.setObject(ZVal.assign(zpairResult2305.getKey()));
                                    value.setObject(ZVal.assign(zpairResult2305.getValue()));
                                    if (ZVal.strictEqualityCheck(
                                            env.callFunctionDynamic(
                                                            callback,
                                                            new RuntimeArgsWithReferences()
                                                                    .add(0, value)
                                                                    .add(1, key),
                                                            value.getObject(),
                                                            key.getObject())
                                                    .value(),
                                            "===",
                                            false)) {
                                        return ZVal.assign(false);
                                    }
                                }

                                return null;
                            }
                        }.use("callback", callback)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "columns",
        defaultValue = "ZVal.arrayFromList(\"*\")",
        defaultValueType = "array"
    )
    public Object first(RuntimeEnv env, Object... args) {
        Object columns = assignParameter(args, 0, true);
        if (null == columns) {
            columns = ZVal.arrayFromList("*");
        }
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.take(env, 1), "get", Builder.class, columns),
                        "first",
                        Builder.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(index = 1, name = "callback")
    @ConvertedParameter(
        index = 2,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object when(RuntimeEnv env, Object... args) {
        ReferenceContainer value = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object callback = assignParameter(args, 1, false);
        Object _pDefault = assignParameter(args, 2, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        if (ZVal.isTrue(value.getObject())) {
            return ZVal.assign(
                    ZVal.isTrue(
                                    ternaryExpressionTemp =
                                            env.callFunctionDynamic(
                                                            callback,
                                                            new RuntimeArgsWithReferences()
                                                                    .add(
                                                                            0,
                                                                            new ReadOnlyReferenceContainer(
                                                                                    this))
                                                                    .add(1, value),
                                                            this,
                                                            value.getObject())
                                                    .value())
                            ? ternaryExpressionTemp
                            : this);

        } else if (ZVal.isTrue(_pDefault)) {
            return ZVal.assign(
                    ZVal.isTrue(
                                    ternaryExpressionTemp =
                                            env.callFunctionDynamic(
                                                            _pDefault,
                                                            new RuntimeArgsWithReferences()
                                                                    .add(
                                                                            0,
                                                                            new ReadOnlyReferenceContainer(
                                                                                    this))
                                                                    .add(1, value),
                                                            this,
                                                            value.getObject())
                                                    .value())
                            ? ternaryExpressionTemp
                            : this);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object tap(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        return ZVal.assign(this.when(env, true, callback));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(index = 1, name = "callback")
    @ConvertedParameter(
        index = 2,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object unless(RuntimeEnv env, Object... args) {
        ReferenceContainer value = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object callback = assignParameter(args, 1, false);
        Object _pDefault = assignParameter(args, 2, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        if (!ZVal.isTrue(value.getObject())) {
            return ZVal.assign(
                    ZVal.isTrue(
                                    ternaryExpressionTemp =
                                            env.callFunctionDynamic(
                                                            callback,
                                                            new RuntimeArgsWithReferences()
                                                                    .add(
                                                                            0,
                                                                            new ReadOnlyReferenceContainer(
                                                                                    this))
                                                                    .add(1, value),
                                                            this,
                                                            value.getObject())
                                                    .value())
                            ? ternaryExpressionTemp
                            : this);

        } else if (ZVal.isTrue(_pDefault)) {
            return ZVal.assign(
                    ZVal.isTrue(
                                    ternaryExpressionTemp =
                                            env.callFunctionDynamic(
                                                            _pDefault,
                                                            new RuntimeArgsWithReferences()
                                                                    .add(
                                                                            0,
                                                                            new ReadOnlyReferenceContainer(
                                                                                    this))
                                                                    .add(1, value),
                                                            this,
                                                            value.getObject())
                                                    .value())
                            ? ternaryExpressionTemp
                            : this);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items")
    @ConvertedParameter(index = 1, name = "total")
    @ConvertedParameter(index = 2, name = "perPage")
    @ConvertedParameter(index = 3, name = "currentPage")
    @ConvertedParameter(index = 4, name = "options")
    protected Object paginator(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope85 scope = new Scope85();
        stack.pushScope(scope);
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Concerns")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Concerns/BuildsQueries.php");
            scope.items = assignParameter(args, 0, false);
            scope.total = assignParameter(args, 1, false);
            scope.perPage = assignParameter(args, 2, false);
            scope.currentPage = assignParameter(args, 3, false);
            scope.options = assignParameter(args, 4, false);
            throw new IncludeEventException(
                    ZVal.assign(
                            env.callMethod(
                                    Container.runtimeStaticObject.getInstance(env),
                                    "makeWith",
                                    Builder.class,
                                    LengthAwarePaginator.CONST_class,
                                    function_compact
                                            .f
                                            .env(env)
                                            .call(
                                                    stack,
                                                    "items",
                                                    "total",
                                                    "perPage",
                                                    "currentPage",
                                                    "options")
                                            .value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items")
    @ConvertedParameter(index = 1, name = "perPage")
    @ConvertedParameter(index = 2, name = "currentPage")
    @ConvertedParameter(index = 3, name = "options")
    protected Object simplePaginator(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope86 scope = new Scope86();
        stack.pushScope(scope);
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Concerns")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Concerns/BuildsQueries.php");
            scope.items = assignParameter(args, 0, false);
            scope.perPage = assignParameter(args, 1, false);
            scope.currentPage = assignParameter(args, 2, false);
            scope.options = assignParameter(args, 3, false);
            throw new IncludeEventException(
                    ZVal.assign(
                            env.callMethod(
                                    Container.runtimeStaticObject.getInstance(env),
                                    "makeWith",
                                    Builder.class,
                                    Paginator.CONST_class,
                                    function_compact
                                            .f
                                            .env(env)
                                            .call(
                                                    stack,
                                                    "items",
                                                    "perPage",
                                                    "currentPage",
                                                    "options")
                                            .value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    public static final Object CONST_class = "Illuminate\\Database\\Query\\Builder";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(index = 1, name = "macro")
        public Object macro(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            Object macro = assignParameter(args, 1, false);
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Database
                                    .namespaces
                                    .Query
                                    .classes
                                    .Builder
                                    .RequestStaticProperties
                                    .class,
                            "macros")
                    .arrayAccess(env, name)
                    .set(macro);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "mixin")
        public Object mixin(RuntimeEnv env, Object... args) {
            Object mixin = assignParameter(args, 0, false);
            Object method = null;
            Object methods = null;
            methods =
                    env.callMethod(
                            new ReflectionClass(env, mixin),
                            "getMethods",
                            Builder.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2306 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2306.getValue());
                env.callMethod(method, "setAccessible", Builder.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Builder.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", Builder.class, mixin))
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object hasMacro(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            return ZVal.assign(
                    arrayActionR(
                            ArrayAction.ISSET,
                            env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Database
                                            .namespaces
                                            .Query
                                            .classes
                                            .Builder
                                            .RequestStaticProperties
                                            .class,
                                    "macros"),
                            env,
                            name));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method")
        @ConvertedParameter(index = 1, name = "parameters")
        public Object __callStatic(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            Object parameters = assignParameter(args, 1, false);
            if (!ZVal.isTrue(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Builder.class)
                            .method("hasMacro")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(method)
                            .value())) {
                throw ZVal.getException(
                        env,
                        new BadMethodCallException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Method %s::%s does not exist.",
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class"),
                                                method)
                                        .value()));
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Database
                                                    .namespaces
                                                    .Query
                                                    .classes
                                                    .Builder
                                                    .RequestStaticProperties
                                                    .class,
                                            "macros")
                                    .arrayGet(env, method),
                            Closure.class,
                            "Closure"))) {
                return ZVal.assign(
                        function_call_user_func_array
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(
                                        Closure.runtimeStaticObject.bind(
                                                env,
                                                env.getRequestStaticPropertiesReference(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Illuminate
                                                                        .namespaces
                                                                        .Database
                                                                        .namespaces
                                                                        .Query
                                                                        .classes
                                                                        .Builder
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "macros")
                                                        .arrayGet(env, method),
                                                ZVal.getNull(),
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class")),
                                        parameters)
                                .value());
            }

            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Illuminate
                                                            .namespaces
                                                            .Database
                                                            .namespaces
                                                            .Query
                                                            .classes
                                                            .Builder
                                                            .RequestStaticProperties
                                                            .class,
                                                    "macros")
                                            .arrayGet(env, method),
                                    parameters)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object macros = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Query\\Builder")
                    .setLookup(
                            Builder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aggregate",
                            "bindings",
                            "columns",
                            "connection",
                            "distinct",
                            "from",
                            "grammar",
                            "groups",
                            "havings",
                            "joins",
                            "limit",
                            "lock",
                            "offset",
                            "operators",
                            "orders",
                            "processor",
                            "unionLimit",
                            "unionOffset",
                            "unionOrders",
                            "unions",
                            "useWritePdo",
                            "wheres")
                    .setStaticPropertyNames("macros")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Query/Builder.php")
                    .addTrait("Illuminate\\Database\\Concerns\\BuildsQueries")
                    .addTrait("Illuminate\\Support\\Traits\\Macroable")
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

    private static class Scope85 implements UpdateRuntimeScopeInterface {

        Object total;
        Object perPage;
        Object options;
        Object currentPage;
        Object items;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("total", this.total);
            stack.setVariable("perPage", this.perPage);
            stack.setVariable("options", this.options);
            stack.setVariable("currentPage", this.currentPage);
            stack.setVariable("items", this.items);
        }

        public void updateScope(RuntimeStack stack) {

            this.total = stack.getVariable("total");
            this.perPage = stack.getVariable("perPage");
            this.options = stack.getVariable("options");
            this.currentPage = stack.getVariable("currentPage");
            this.items = stack.getVariable("items");
        }
    }

    private static class Scope86 implements UpdateRuntimeScopeInterface {

        Object perPage;
        Object options;
        Object currentPage;
        Object items;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("perPage", this.perPage);
            stack.setVariable("options", this.options);
            stack.setVariable("currentPage", this.currentPage);
            stack.setVariable("items", this.items);
        }

        public void updateScope(RuntimeStack stack) {

            this.perPage = stack.getVariable("perPage");
            this.options = stack.getVariable("options");
            this.currentPage = stack.getVariable("currentPage");
            this.items = stack.getVariable("items");
        }
    }

    private static class Scope93 implements UpdateRuntimeScopeInterface {

        Object _pBoolean;
        Object _thisVarAlias;
        Object column;
        Object runtimeTempArrayResult35;
        Object type;
        Object value;
        Object operator;
        Object runtimeTempArrayResult34;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("boolean", this._pBoolean);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
            stack.setVariable("runtimeTempArrayResult35", this.runtimeTempArrayResult35);
            stack.setVariable("type", this.type);
            stack.setVariable("value", this.value);
            stack.setVariable("operator", this.operator);
            stack.setVariable("runtimeTempArrayResult34", this.runtimeTempArrayResult34);
        }

        public void updateScope(RuntimeStack stack) {

            this._pBoolean = stack.getVariable("boolean");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
            this.runtimeTempArrayResult35 = stack.getVariable("runtimeTempArrayResult35");
            this.type = stack.getVariable("type");
            this.value = stack.getVariable("value");
            this.operator = stack.getVariable("operator");
            this.runtimeTempArrayResult34 = stack.getVariable("runtimeTempArrayResult34");
        }
    }

    private static class Scope94 implements UpdateRuntimeScopeInterface {

        Object _pBoolean;
        Object _thisVarAlias;
        Object runtimeTempArrayResult37;
        Object type;
        Object first;
        Object operator;
        Object second;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("boolean", this._pBoolean);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("runtimeTempArrayResult37", this.runtimeTempArrayResult37);
            stack.setVariable("type", this.type);
            stack.setVariable("first", this.first);
            stack.setVariable("operator", this.operator);
            stack.setVariable("second", this.second);
        }

        public void updateScope(RuntimeStack stack) {

            this._pBoolean = stack.getVariable("boolean");
            this._thisVarAlias = stack.getVariable("this");
            this.runtimeTempArrayResult37 = stack.getVariable("runtimeTempArrayResult37");
            this.type = stack.getVariable("type");
            this.first = stack.getVariable("first");
            this.operator = stack.getVariable("operator");
            this.second = stack.getVariable("second");
        }
    }

    private static class Scope95 implements UpdateRuntimeScopeInterface {

        Object not;
        Object _pBoolean;
        Object values;
        Object _thisVarAlias;
        Object column;
        Object type;
        Object value;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("not", this.not);
            stack.setVariable("boolean", this._pBoolean);
            stack.setVariable("values", this.values);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
            stack.setVariable("type", this.type);
            stack.setVariable("value", this.value);
        }

        public void updateScope(RuntimeStack stack) {

            this.not = stack.getVariable("not");
            this._pBoolean = stack.getVariable("boolean");
            this.values = stack.getVariable("values");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
            this.type = stack.getVariable("type");
            this.value = stack.getVariable("value");
        }
    }

    private static class Scope96 implements UpdateRuntimeScopeInterface {

        Object not;
        Object _pBoolean;
        Object query;
        Object _thisVarAlias;
        Object column;
        Object callback;
        Object type;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("not", this.not);
            stack.setVariable("boolean", this._pBoolean);
            stack.setVariable("query", this.query);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
            stack.setVariable("callback", this.callback);
            stack.setVariable("type", this.type);
        }

        public void updateScope(RuntimeStack stack) {

            this.not = stack.getVariable("not");
            this._pBoolean = stack.getVariable("boolean");
            this.query = stack.getVariable("query");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
            this.callback = stack.getVariable("callback");
            this.type = stack.getVariable("type");
        }
    }

    private static class Scope97 implements UpdateRuntimeScopeInterface {

        Object not;
        Object _pBoolean;
        Object query;
        Object _thisVarAlias;
        Object column;
        Object type;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("not", this.not);
            stack.setVariable("boolean", this._pBoolean);
            stack.setVariable("query", this.query);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
            stack.setVariable("type", this.type);
        }

        public void updateScope(RuntimeStack stack) {

            this.not = stack.getVariable("not");
            this._pBoolean = stack.getVariable("boolean");
            this.query = stack.getVariable("query");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
            this.type = stack.getVariable("type");
        }
    }

    private static class Scope98 implements UpdateRuntimeScopeInterface {

        Object not;
        Object _pBoolean;
        Object _thisVarAlias;
        Object column;
        Object type;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("not", this.not);
            stack.setVariable("boolean", this._pBoolean);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
            stack.setVariable("type", this.type);
        }

        public void updateScope(RuntimeStack stack) {

            this.not = stack.getVariable("not");
            this._pBoolean = stack.getVariable("boolean");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
            this.type = stack.getVariable("type");
        }
    }

    private static class Scope99 implements UpdateRuntimeScopeInterface {

        Object not;
        Object _pBoolean;
        Object values;
        Object _thisVarAlias;
        Object column;
        Object type;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("not", this.not);
            stack.setVariable("boolean", this._pBoolean);
            stack.setVariable("values", this.values);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
            stack.setVariable("type", this.type);
        }

        public void updateScope(RuntimeStack stack) {

            this.not = stack.getVariable("not");
            this._pBoolean = stack.getVariable("boolean");
            this.values = stack.getVariable("values");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
            this.type = stack.getVariable("type");
        }
    }

    private static class Scope100 implements UpdateRuntimeScopeInterface {

        Object _pBoolean;
        Object _thisVarAlias;
        Object column;
        Object type;
        Object value;
        Object operator;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("boolean", this._pBoolean);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
            stack.setVariable("type", this.type);
            stack.setVariable("value", this.value);
            stack.setVariable("operator", this.operator);
        }

        public void updateScope(RuntimeStack stack) {

            this._pBoolean = stack.getVariable("boolean");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
            this.type = stack.getVariable("type");
            this.value = stack.getVariable("value");
            this.operator = stack.getVariable("operator");
        }
    }

    private static class Scope101 implements UpdateRuntimeScopeInterface {

        Object _pBoolean;
        Object query;
        Object _thisVarAlias;
        Object type;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("boolean", this._pBoolean);
            stack.setVariable("query", this.query);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("type", this.type);
        }

        public void updateScope(RuntimeStack stack) {

            this._pBoolean = stack.getVariable("boolean");
            this.query = stack.getVariable("query");
            this._thisVarAlias = stack.getVariable("this");
            this.type = stack.getVariable("type");
        }
    }

    private static class Scope102 implements UpdateRuntimeScopeInterface {

        Object _pBoolean;
        Object query;
        Object _thisVarAlias;
        Object column;
        Object callback;
        Object type;
        Object operator;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("boolean", this._pBoolean);
            stack.setVariable("query", this.query);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
            stack.setVariable("callback", this.callback);
            stack.setVariable("type", this.type);
            stack.setVariable("operator", this.operator);
        }

        public void updateScope(RuntimeStack stack) {

            this._pBoolean = stack.getVariable("boolean");
            this.query = stack.getVariable("query");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
            this.callback = stack.getVariable("callback");
            this.type = stack.getVariable("type");
            this.operator = stack.getVariable("operator");
        }
    }

    private static class Scope103 implements UpdateRuntimeScopeInterface {

        Object not;
        Object _pBoolean;
        Object query;
        Object _thisVarAlias;
        Object type;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("not", this.not);
            stack.setVariable("boolean", this._pBoolean);
            stack.setVariable("query", this.query);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("type", this.type);
        }

        public void updateScope(RuntimeStack stack) {

            this.not = stack.getVariable("not");
            this._pBoolean = stack.getVariable("boolean");
            this.query = stack.getVariable("query");
            this._thisVarAlias = stack.getVariable("this");
            this.type = stack.getVariable("type");
        }
    }

    private static class Scope104 implements UpdateRuntimeScopeInterface {

        Object _pBoolean;
        Object columns;
        Object values;
        Object _thisVarAlias;
        Object type;
        Object operator;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("boolean", this._pBoolean);
            stack.setVariable("columns", this.columns);
            stack.setVariable("values", this.values);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("type", this.type);
            stack.setVariable("operator", this.operator);
        }

        public void updateScope(RuntimeStack stack) {

            this._pBoolean = stack.getVariable("boolean");
            this.columns = stack.getVariable("columns");
            this.values = stack.getVariable("values");
            this._thisVarAlias = stack.getVariable("this");
            this.type = stack.getVariable("type");
            this.operator = stack.getVariable("operator");
        }
    }

    private static class Scope105 implements UpdateRuntimeScopeInterface {

        Object not;
        Object _pBoolean;
        Object _thisVarAlias;
        Object column;
        Object type;
        Object value;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("not", this.not);
            stack.setVariable("boolean", this._pBoolean);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
            stack.setVariable("type", this.type);
            stack.setVariable("value", this.value);
        }

        public void updateScope(RuntimeStack stack) {

            this.not = stack.getVariable("not");
            this._pBoolean = stack.getVariable("boolean");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
            this.type = stack.getVariable("type");
            this.value = stack.getVariable("value");
        }
    }

    private static class Scope106 implements UpdateRuntimeScopeInterface {

        Object _pBoolean;
        Object _thisVarAlias;
        Object column;
        Object runtimeTempArrayResult49;
        Object runtimeTempArrayResult48;
        Object type;
        Object value;
        Object operator;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("boolean", this._pBoolean);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
            stack.setVariable("runtimeTempArrayResult49", this.runtimeTempArrayResult49);
            stack.setVariable("runtimeTempArrayResult48", this.runtimeTempArrayResult48);
            stack.setVariable("type", this.type);
            stack.setVariable("value", this.value);
            stack.setVariable("operator", this.operator);
        }

        public void updateScope(RuntimeStack stack) {

            this._pBoolean = stack.getVariable("boolean");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
            this.runtimeTempArrayResult49 = stack.getVariable("runtimeTempArrayResult49");
            this.runtimeTempArrayResult48 = stack.getVariable("runtimeTempArrayResult48");
            this.type = stack.getVariable("type");
            this.value = stack.getVariable("value");
            this.operator = stack.getVariable("operator");
        }
    }

    private static class Scope107 implements UpdateRuntimeScopeInterface {

        Object _pBoolean;
        Object bindings;
        Object _thisVarAlias;
        Object type;
        Object sql;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("boolean", this._pBoolean);
            stack.setVariable("bindings", this.bindings);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("type", this.type);
            stack.setVariable("sql", this.sql);
        }

        public void updateScope(RuntimeStack stack) {

            this._pBoolean = stack.getVariable("boolean");
            this.bindings = stack.getVariable("bindings");
            this._thisVarAlias = stack.getVariable("this");
            this.type = stack.getVariable("type");
            this.sql = stack.getVariable("sql");
        }
    }

    private static class Scope108 implements UpdateRuntimeScopeInterface {

        Object bindings;
        Object _thisVarAlias;
        Object type;
        Object sql;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("bindings", this.bindings);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("type", this.type);
            stack.setVariable("sql", this.sql);
        }

        public void updateScope(RuntimeStack stack) {

            this.bindings = stack.getVariable("bindings");
            this._thisVarAlias = stack.getVariable("this");
            this.type = stack.getVariable("type");
            this.sql = stack.getVariable("sql");
        }
    }

    private static class Scope109 implements UpdateRuntimeScopeInterface {

        Object all;
        Object query;
        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("all", this.all);
            stack.setVariable("query", this.query);
            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this.all = stack.getVariable("all");
            this.query = stack.getVariable("query");
            this._thisVarAlias = stack.getVariable("this");
        }
    }

    private static class Scope110 implements UpdateRuntimeScopeInterface {

        Object columns;
        Object function;
        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("columns", this.columns);
            stack.setVariable("function", this.function);
            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this.columns = stack.getVariable("columns");
            this.function = stack.getVariable("function");
            this._thisVarAlias = stack.getVariable("this");
        }
    }
}
