package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Container.classes.Container;
import com.runtimeconverter.runtime.arrays.RuntimeIterable;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Arrayable;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.ReadOnlyReferenceContainer;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.functions.collect;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.ModelNotFoundException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Pagination.classes.Paginator;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.Relation;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.RelationNotFoundException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Pagination.classes.LengthAwarePaginator;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff_key;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.Scope;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.classes.Expression;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_num_args;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Eloquent/Builder.php

*/

public class Builder extends RuntimeClassBase {

    public Object query = null;

    public Object model = null;

    public Object eagerLoad = ZVal.newArray();

    public Object localMacros = ZVal.newArray();

    public Object onDelete = null;

    public Object passthru =
            ZVal.arrayFromList(
                    "insert",
                    "insertGetId",
                    "getBindings",
                    "toSql",
                    "exists",
                    "doesntExist",
                    "count",
                    "min",
                    "max",
                    "avg",
                    "average",
                    "sum",
                    "getConnection");

    public Object scopes = ZVal.newArray();

    public Object removedScopes = ZVal.newArray();

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
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        this.query = query;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object make(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        return ZVal.assign(this.newModelInstance(env, attributes));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "identifier")
    @ConvertedParameter(index = 1, name = "scope")
    public Object withGlobalScope(RuntimeEnv env, Object... args) {
        Object identifier = assignParameter(args, 0, false);
        Object scope = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "scopes", env).arrayAccess(env, identifier).set(scope);
        if (function_method_exists.f.env(env).call(scope, "extend").getBool()) {
            env.callMethod(scope, "extend", Builder.class, this);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "scope")
    public Object withoutGlobalScope(RuntimeEnv env, Object... args) {
        Object scope = assignParameter(args, 0, false);
        if (!function_is_string.f.env(env).call(scope).getBool()) {
            scope = function_get_class.f.env(env).call(scope).value();
        }

        arrayActionR(
                ArrayAction.UNSET, new ReferenceClassProperty(this, "scopes", env), env, scope);
        new ReferenceClassProperty(this, "removedScopes", env).arrayAppend(env).set(scope);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "scopes",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object withoutGlobalScopes(RuntimeEnv env, Object... args) {
        Object scopes = assignParameter(args, 0, true);
        if (null == scopes) {
            scopes = ZVal.getNull();
        }
        Object scope = null;
        if (function_is_array.f.env(env).call(scopes).getBool()) {
            for (ZPair zpairResult257 : ZVal.getIterable(scopes, env, true)) {
                scope = ZVal.assign(zpairResult257.getValue());
                this.withoutGlobalScope(env, scope);
            }

        } else {
            this.scopes = ZVal.newArray();
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object removedScopes(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.removedScopes);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object whereKey(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        if (ZVal.toBool(function_is_array.f.env(env).call(id).value())
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                id,
                                Arrayable.class,
                                "Illuminate\\Contracts\\Support\\Arrayable"))) {
            env.callMethod(
                    this.query,
                    "whereIn",
                    Builder.class,
                    env.callMethod(this.model, "getQualifiedKeyName", Builder.class),
                    id);
            return ZVal.assign(this);
        }

        return ZVal.assign(
                this.where(
                        env,
                        env.callMethod(this.model, "getQualifiedKeyName", Builder.class),
                        "=",
                        id));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object whereKeyNot(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        if (ZVal.toBool(function_is_array.f.env(env).call(id).value())
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                id,
                                Arrayable.class,
                                "Illuminate\\Contracts\\Support\\Arrayable"))) {
            env.callMethod(
                    this.query,
                    "whereNotIn",
                    Builder.class,
                    env.callMethod(this.model, "getQualifiedKeyName", Builder.class),
                    id);
            return ZVal.assign(this);
        }

        return ZVal.assign(
                this.where(
                        env,
                        env.callMethod(this.model, "getQualifiedKeyName", Builder.class),
                        "!=",
                        id));
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
        Object column = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, true);
        if (null == operator) {
            operator = ZVal.getNull();
        }
        Object value = assignParameter(args, 2, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object _pBoolean = assignParameter(args, 3, true);
        if (null == _pBoolean) {
            _pBoolean = "and";
        }
        Object query = null;
        if (ZVal.isTrue(ZVal.checkInstanceType(column, Closure.class, "Closure"))) {
            env.callFunctionDynamic(
                    column,
                    new RuntimeArgsWithReferences(),
                    query = env.callMethod(this.model, "newModelQuery", Builder.class));
            env.callMethod(
                    this.query,
                    "addNestedWhereQuery",
                    Builder.class,
                    env.callMethod(query, "getQuery", Builder.class),
                    _pBoolean);

        } else {
            env.callMethod(
                    this.query,
                    "where",
                    Builder.class,
                    PackedVaradicArgs.unpack(
                            new PackedVaradicArgs(
                                    function_func_get_args
                                            .f
                                            .env(env)
                                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                            .call()
                                            .value())));
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
        Object runtimeTempArrayResult20 = null;
        ZVal.list(
                runtimeTempArrayResult20 =
                        env.callMethod(
                                this.query,
                                "prepareValueAndOperator",
                                Builder.class,
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
                (value = listGet(runtimeTempArrayResult20, 0, env)),
                (operator = listGet(runtimeTempArrayResult20, 1, env)));
        return ZVal.assign(this.where(env, column, operator, value, "or"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items", typeHint = "array")
    public Object hydrate(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Builder.php");
        Object items = assignParameter(args, 0, false);
        Object instance = null;
        instance = this.newModelInstance(env);
        return ZVal.assign(
                env.callMethod(
                        instance,
                        "newCollection",
                        Builder.class,
                        function_array_map
                                .f
                                .env(env)
                                .call(
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Database\\Eloquent",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "item")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object item = assignParameter(args, 0, false);
                                                Object instance = null;
                                                instance =
                                                        this.contextReferences.getCapturedValue(
                                                                "instance");
                                                return ZVal.assign(
                                                        env.callMethod(
                                                                instance,
                                                                "newFromBuilder",
                                                                Builder.class,
                                                                item));
                                            }
                                        }.use("instance", instance),
                                        items)
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "bindings", defaultValue = "", defaultValueType = "array")
    public Object fromQuery(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object bindings = assignParameter(args, 1, true);
        if (null == bindings) {
            bindings = ZVal.newArray();
        }
        return ZVal.assign(
                this.hydrate(
                        env,
                        env.callMethod(
                                env.callMethod(this.query, "getConnection", Builder.class),
                                "select",
                                Builder.class,
                                query,
                                bindings)));
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
        if (ZVal.toBool(function_is_array.f.env(env).call(id).value())
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                id,
                                Arrayable.class,
                                "Illuminate\\Contracts\\Support\\Arrayable"))) {
            return ZVal.assign(this.findMany(env, id, columns));
        }

        return ZVal.assign(env.callMethod(this.whereKey(env, id), "first", Builder.class, columns));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ids")
    @ConvertedParameter(
        index = 1,
        name = "columns",
        defaultValue = "ZVal.arrayFromList(\"*\")",
        defaultValueType = "array"
    )
    public Object findMany(RuntimeEnv env, Object... args) {
        Object ids = assignParameter(args, 0, false);
        Object columns = assignParameter(args, 1, true);
        if (null == columns) {
            columns = ZVal.arrayFromList("*");
        }
        if (ZVal.isEmpty(ids)) {
            return ZVal.assign(env.callMethod(this.model, "newCollection", Builder.class));
        }

        return ZVal.assign(env.callMethod(this.whereKey(env, ids), "get", Builder.class, columns));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(
        index = 1,
        name = "columns",
        defaultValue = "ZVal.arrayFromList(\"*\")",
        defaultValueType = "array"
    )
    public Object findOrFail(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        Object columns = assignParameter(args, 1, true);
        if (null == columns) {
            columns = ZVal.arrayFromList("*");
        }
        Object result = null;
        result = this.find(env, id, columns);
        if (function_is_array.f.env(env).call(id).getBool()) {
            if (ZVal.strictEqualityCheck(
                    function_count.f.env(env).call(result).value(),
                    "===",
                    function_count
                            .f
                            .env(env)
                            .call(function_array_unique.f.env(env).call(id).value())
                            .value())) {
                return ZVal.assign(result);
            }

        } else if (!function_is_null.f.env(env).call(result).getBool()) {
            return ZVal.assign(result);
        }

        throw ZVal.getException(
                env,
                env.callMethod(
                        new ModelNotFoundException(env),
                        "setModel",
                        Builder.class,
                        function_get_class.f.env(env).call(this.model).value(),
                        id));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(
        index = 1,
        name = "columns",
        defaultValue = "ZVal.arrayFromList(\"*\")",
        defaultValueType = "array"
    )
    public Object findOrNew(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        Object columns = assignParameter(args, 1, true);
        if (null == columns) {
            columns = ZVal.arrayFromList("*");
        }
        Object model = null;
        if (!function_is_null.f.env(env).call(model = this.find(env, id, columns)).getBool()) {
            return ZVal.assign(model);
        }

        return ZVal.assign(this.newModelInstance(env));
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
    public Object firstOrNew(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, true);
        if (null == values) {
            values = ZVal.newArray();
        }
        Object instance = null;
        if (!function_is_null
                .f
                .env(env)
                .call(
                        instance =
                                env.callMethod(this.where(env, attributes), "first", Builder.class))
                .getBool()) {
            return ZVal.assign(instance);
        }

        return ZVal.assign(this.newModelInstance(env, ZVal.add(attributes, values)));
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
    public Object firstOrCreate(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Builder.php");
        Object attributes = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, true);
        if (null == values) {
            values = ZVal.newArray();
        }
        Object instance = null;
        if (!function_is_null
                .f
                .env(env)
                .call(
                        instance =
                                env.callMethod(this.where(env, attributes), "first", Builder.class))
                .getBool()) {
            return ZVal.assign(instance);
        }

        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                this.newModelInstance(env, ZVal.add(attributes, values)),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Eloquent",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "instance")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object instance = assignParameter(args, 0, false);
                                        env.callMethod(instance, "save", Builder.class);
                                        return null;
                                    }
                                })
                        .value());
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
    public Object updateOrCreate(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Builder.php");
        Object attributes = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, true);
        if (null == values) {
            values = ZVal.newArray();
        }
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                this.firstOrNew(env, attributes),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Eloquent",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "instance")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object instance = assignParameter(args, 0, false);
                                        Object values = null;
                                        values = this.contextReferences.getCapturedValue("values");
                                        env.callMethod(
                                                env.callMethod(
                                                        instance, "fill", Builder.class, values),
                                                "save",
                                                Builder.class);
                                        return null;
                                    }
                                }.use("values", values))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "columns",
        defaultValue = "ZVal.arrayFromList(\"*\")",
        defaultValueType = "array"
    )
    public Object firstOrFail(RuntimeEnv env, Object... args) {
        Object columns = assignParameter(args, 0, true);
        if (null == columns) {
            columns = ZVal.arrayFromList("*");
        }
        Object model = null;
        if (!function_is_null.f.env(env).call(model = this.first(env, columns)).getBool()) {
            return ZVal.assign(model);
        }

        throw ZVal.getException(
                env,
                env.callMethod(
                        new ModelNotFoundException(env),
                        "setModel",
                        Builder.class,
                        function_get_class.f.env(env).call(this.model).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "columns",
        defaultValue = "ZVal.arrayFromList(\"*\")",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 1,
        name = "callback",
        typeHint = "Closure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object firstOr(RuntimeEnv env, Object... args) {
        Object columns = assignParameter(args, 0, true);
        if (null == columns) {
            columns = ZVal.arrayFromList("*");
        }
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object model = null;
        if (ZVal.isTrue(ZVal.checkInstanceType(columns, Closure.class, "Closure"))) {
            callback = ZVal.assign(columns);
            columns = ZVal.arrayFromList("*");
        }

        if (!function_is_null.f.env(env).call(model = this.first(env, columns)).getBool()) {
            return ZVal.assign(model);
        }

        return ZVal.assign(
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(callback)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object value(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object result = null;
        if (ZVal.isTrue(result = this.first(env, ZVal.newArray(new ZPair(0, column))))) {
            return ZVal.assign(toObjectR(result).accessProp(this, env).name(column).value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "columns",
        defaultValue = "ZVal.arrayFromList(\"*\")",
        defaultValueType = "array"
    )
    public Object get(RuntimeEnv env, Object... args) {
        Object columns = assignParameter(args, 0, true);
        if (null == columns) {
            columns = ZVal.arrayFromList("*");
        }
        Object models = null;
        Object builder = null;
        builder = this.applyScopes(env);
        if (ZVal.isGreaterThan(
                function_count
                        .f
                        .env(env)
                        .call(models = env.callMethod(builder, "getModels", Builder.class, columns))
                        .value(),
                '>',
                0)) {
            models = env.callMethod(builder, "eagerLoadRelations", Builder.class, models);
        }

        return ZVal.assign(
                env.callMethod(
                        env.callMethod(builder, "getModel", Builder.class),
                        "newCollection",
                        Builder.class,
                        models));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "columns",
        defaultValue = "ZVal.arrayFromList(\"*\")",
        defaultValueType = "array"
    )
    public Object getModels(RuntimeEnv env, Object... args) {
        Object columns = assignParameter(args, 0, true);
        if (null == columns) {
            columns = ZVal.arrayFromList("*");
        }
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this.model,
                                "hydrate",
                                Builder.class,
                                env.callMethod(
                                        env.callMethod(this.query, "get", Builder.class, columns),
                                        "all",
                                        Builder.class)),
                        "all",
                        Builder.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models", typeHint = "array")
    public Object eagerLoadRelations(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, false);
        Object name = null;
        Object constraints = null;
        for (ZPair zpairResult258 : ZVal.getIterable(this.eagerLoad, env, false)) {
            name = ZVal.assign(zpairResult258.getKey());
            constraints = ZVal.assign(zpairResult258.getValue());
            if (ZVal.strictEqualityCheck(
                    function_strpos.f.env(env).call(name, ".").value(), "===", false)) {
                models = this.eagerLoadRelation(env, models, name, constraints);
            }
        }

        return ZVal.assign(models);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models", typeHint = "array")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(index = 2, name = "constraints", typeHint = "Closure")
    protected Object eagerLoadRelation(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object models = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object constraints = assignParameter(args, 2, false);
        ReferenceContainer relation = new BasicReferenceContainer(null);
        relation.setObject(this.getRelation(env, name));
        env.callMethod(relation.getObject(), "addEagerConstraints", Builder.class, models);
        env.callFunctionDynamic(
                constraints,
                new RuntimeArgsWithReferences().add(0, relation),
                relation.getObject());
        return ZVal.assign(
                env.callMethod(
                        relation.getObject(),
                        rLastRefArgs =
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                handleReturnReference(
                                                        env.callMethod(
                                                                relation.getObject(),
                                                                "initRelation",
                                                                Builder.class,
                                                                models,
                                                                name)))
                                        .add(
                                                1,
                                                handleReturnReference(
                                                        env.callMethod(
                                                                relation.getObject(),
                                                                "getEager",
                                                                Builder.class))),
                        "match",
                        Builder.class,
                        rLastRefArgs.get(0),
                        rLastRefArgs.get(1),
                        name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getRelation(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Builder.php");
        Object name = assignParameter(args, 0, false);
        Object nested = null;
        Object relation = null;
        relation =
                Relation.runtimeStaticObject.noConstraints(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database\\Eloquent",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object e = null;
                                Object name = null;
                                name = this.contextReferences.getCapturedValue("name");
                                try {
                                    return ZVal.assign(
                                            env.callMethod(
                                                    Builder.this.getModel(env),
                                                    toStringR(name, env),
                                                    Builder.class));
                                } catch (ConvertedException convertedException25) {
                                    if (convertedException25.instanceOf(
                                            BadMethodCallException.class,
                                            "BadMethodCallException")) {
                                        e = convertedException25.getObject();
                                        throw ZVal.getException(
                                                env,
                                                RelationNotFoundException.runtimeStaticObject.make(
                                                        env, Builder.this.getModel(env), name));
                                    } else {
                                        throw convertedException25;
                                    }
                                }
                            }
                        }.use("name", name));
        nested = this.relationsNestedUnder(env, name);
        if (ZVal.isGreaterThan(function_count.f.env(env).call(nested).value(), '>', 0)) {
            env.callMethod(
                    env.callMethod(relation, "getQuery", Builder.class),
                    "with",
                    Builder.class,
                    nested);
        }

        return ZVal.assign(relation);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relation")
    protected Object relationsNestedUnder(RuntimeEnv env, Object... args) {
        Object relation = assignParameter(args, 0, false);
        Object name = null;
        ReferenceContainer nested = new BasicReferenceContainer(null);
        Object constraints = null;
        nested.setObject(ZVal.newArray());
        for (ZPair zpairResult259 : ZVal.getIterable(this.eagerLoad, env, false)) {
            name = ZVal.assign(zpairResult259.getKey());
            constraints = ZVal.assign(zpairResult259.getValue());
            if (ZVal.isTrue(this.isNestedUnder(env, relation, name))) {
                nested.arrayAccess(
                                env,
                                function_substr
                                        .f
                                        .env(env)
                                        .call(
                                                name,
                                                function_strlen
                                                        .f
                                                        .env(env)
                                                        .call(toStringR(relation, env) + ".")
                                                        .value())
                                        .value())
                        .set(constraints);
            }
        }

        return ZVal.assign(nested.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relation")
    @ConvertedParameter(index = 1, name = "name")
    protected Object isNestedUnder(RuntimeEnv env, Object... args) {
        Object relation = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.toBool(Str.runtimeStaticObject.contains(env, name, "."))
                        && ZVal.toBool(
                                Str.runtimeStaticObject.startsWith(
                                        env, name, toStringR(relation, env) + ".")));
    }

    @ConvertedMethod
    public Object cursor(RuntimeEnv env, Object... args) {
        RuntimeIterable runtimeConverterYieldVariable = new RuntimeIterable(env);
        Object record = null;
        for (ZPair zpairResult260 :
                ZVal.getIterable(
                        env.callMethod(
                                toObjectR(this.applyScopes(env))
                                        .accessProp(this, env)
                                        .name("query")
                                        .value(),
                                "cursor",
                                Builder.class),
                        env,
                        true)) {
            record = ZVal.assign(zpairResult260.getValue());
            runtimeConverterYieldVariable.add(
                    env.callMethod(this.model, "newFromBuilder", Builder.class, record));
        }

        return runtimeConverterYieldVariable;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "callable")
    @ConvertedParameter(
        index = 2,
        name = "column",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
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
            column = ZVal.getNull();
        }
        Object alias = assignParameter(args, 3, true);
        if (null == alias) {
            alias = ZVal.getNull();
        }
        Object countResults = null;
        Object clone = null;
        Object lastId = null;
        ReferenceContainer results = new BasicReferenceContainer(null);
        column =
                ZVal.assign(
                        function_is_null.f.env(env).call(column).getBool()
                                ? env.callMethod(this.getModel(env), "getKeyName", Builder.class)
                                : column);
        alias = ZVal.assign(function_is_null.f.env(env).call(alias).getBool() ? column : alias);
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
        if (ZVal.toBool(
                        ZVal.isEmpty(
                                toObjectR(this.query).accessProp(this, env).name("orders").value()))
                && ZVal.toBool(
                        ZVal.isEmpty(
                                toObjectR(this.query)
                                        .accessProp(this, env)
                                        .name("unionOrders")
                                        .value()))) {
            env.callMethod(
                    this,
                    "orderBy",
                    Builder.class,
                    env.callMethod(this.model, "getQualifiedKeyName", Builder.class),
                    "asc");
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
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Builder.php");
        Object column = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        Object results = null;
        results = env.callMethod(this.toBase(env), "pluck", Builder.class, column, key);
        if (ZVal.toBool(
                        ZVal.toBool(
                                        !ZVal.isTrue(
                                                env.callMethod(
                                                        this.model,
                                                        "hasGetMutator",
                                                        Builder.class,
                                                        column)))
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                env.callMethod(
                                                        this.model,
                                                        "hasCast",
                                                        Builder.class,
                                                        column))))
                && ZVal.toBool(
                        !function_in_array
                                .f
                                .env(env)
                                .call(column, env.callMethod(this.model, "getDates", Builder.class))
                                .getBool())) {
            return ZVal.assign(results);
        }

        return ZVal.assign(
                env.callMethod(
                        results,
                        "map",
                        Builder.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database\\Eloquent",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "value")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object value = assignParameter(args, 0, false);
                                Object column = null;
                                column = this.contextReferences.getCapturedValue("column");
                                return ZVal.assign(
                                        toObjectR(
                                                        env.callMethod(
                                                                Builder.this.model,
                                                                "newFromBuilder",
                                                                Builder.class,
                                                                ZVal.newArray(
                                                                        new ZPair(column, value))))
                                                .accessProp(this, env)
                                                .name(column)
                                                .value());
                            }
                        }.use("column", column)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "perPage",
        defaultValue = "NULL",
        defaultValueType = "constant"
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
            perPage = ZVal.getNull();
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
        perPage =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = perPage)
                                ? ternaryExpressionTemp
                                : env.callMethod(this.model, "getPerPage", Builder.class));
        results =
                ZVal.assign(
                        ZVal.isTrue(
                                        total =
                                                env.callMethod(
                                                        this.toBase(env),
                                                        "getCountForPagination",
                                                        Builder.class))
                                ? env.callMethod(
                                        env.callMethod(
                                                this, "forPage", Builder.class, page, perPage),
                                        "get",
                                        Builder.class,
                                        columns)
                                : env.callMethod(this.model, "newCollection", Builder.class));
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
        defaultValue = "NULL",
        defaultValueType = "constant"
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
            perPage = ZVal.getNull();
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
        perPage =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = perPage)
                                ? ternaryExpressionTemp
                                : env.callMethod(this.model, "getPerPage", Builder.class));
        env.callMethod(
                env.callMethod(
                        this,
                        "skip",
                        Builder.class,
                        ZVal.multiply(ZVal.subtract(page, 1), perPage)),
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
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object create(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Builder.php");
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                this.newModelInstance(env, attributes),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Eloquent",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "instance")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object instance = assignParameter(args, 0, false);
                                        env.callMethod(instance, "save", Builder.class);
                                        return null;
                                    }
                                })
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    public Object forceCreate(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Builder.php");
        Object attributes = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this.model,
                        "unguarded",
                        Builder.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database\\Eloquent",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object attributes = null;
                                attributes = this.contextReferences.getCapturedValue("attributes");
                                return ZVal.assign(
                                        env.callMethod(
                                                Builder.this.newModelInstance(env),
                                                "create",
                                                Builder.class,
                                                attributes));
                            }
                        }.use("attributes", attributes)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values", typeHint = "array")
    public Object update(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this.toBase(env),
                        "update",
                        Builder.class,
                        this.addUpdatedAtColumn(env, values)));
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
        return ZVal.assign(
                env.callMethod(
                        this.toBase(env),
                        "increment",
                        Builder.class,
                        column,
                        amount,
                        this.addUpdatedAtColumn(env, extra)));
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
        return ZVal.assign(
                env.callMethod(
                        this.toBase(env),
                        "decrement",
                        Builder.class,
                        column,
                        amount,
                        this.addUpdatedAtColumn(env, extra)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values", typeHint = "array")
    protected Object addUpdatedAtColumn(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        if (!ZVal.isTrue(env.callMethod(this.model, "usesTimestamps", Builder.class))) {
            return ZVal.assign(values);
        }

        return ZVal.assign(
                Arr.runtimeStaticObject.add(
                        env,
                        values,
                        env.callMethod(this.model, "getUpdatedAtColumn", Builder.class),
                        env.callMethod(this.model, "freshTimestampString", Builder.class)));
    }

    @ConvertedMethod
    public Object delete(RuntimeEnv env, Object... args) {
        if (ZVal.isset(this.onDelete)) {
            return ZVal.assign(
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(this.onDelete, this)
                            .value());
        }

        return ZVal.assign(env.callMethod(this.toBase(env), "delete", Builder.class));
    }

    @ConvertedMethod
    public Object forceDelete(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.query, "delete", Builder.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    public Object onDelete(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        this.onDelete = callback;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "scopes", typeHint = "array")
    public Object scopes(RuntimeEnv env, Object... args) {
        Object scopes = assignParameter(args, 0, false);
        Object scope = null;
        Object builder = null;
        Object runtimeTempArrayResult21 = null;
        Object parameters = null;
        builder = ZVal.assign(this);
        for (ZPair zpairResult261 : ZVal.getIterable(scopes, env, false)) {
            scope = ZVal.assign(zpairResult261.getKey());
            parameters = ZVal.assign(zpairResult261.getValue());
            if (function_is_int.f.env(env).call(scope).getBool()) {
                ZVal.list(
                        runtimeTempArrayResult21 =
                                ZVal.newArray(
                                        new ZPair(0, parameters), new ZPair(1, ZVal.newArray())),
                        (scope = listGet(runtimeTempArrayResult21, 0, env)),
                        (parameters = listGet(runtimeTempArrayResult21, 1, env)));
            }

            builder =
                    env.callMethod(
                            builder,
                            "callScope",
                            Builder.class,
                            ZVal.newArray(
                                    new ZPair(0, this.model),
                                    new ZPair(
                                            1,
                                            "scope"
                                                    + toStringR(
                                                            NamespaceGlobal.ucfirst
                                                                    .env(env)
                                                                    .call(scope)
                                                                    .value(),
                                                            env))),
                            rToArrayCast(parameters));
        }

        return ZVal.assign(builder);
    }

    @ConvertedMethod
    public Object applyScopes(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Builder.php");
        int runtimeConverterContinueCount;
        Object identifier = null;
        Object scope = null;
        Object builder = null;
        if (!ZVal.isTrue(this.scopes)) {
            return ZVal.assign(this);
        }

        builder = ZVal.assign(((RuntimeClassInterface) this).phpClone(env));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult262 : ZVal.getIterable(this.scopes, env, false)) {
            identifier = ZVal.assign(zpairResult262.getKey());
            scope = ZVal.assign(zpairResult262.getValue());
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(builder, "scopes", env),
                    env,
                    identifier)) {
                continue;
            }

            env.callMethod(
                    builder,
                    "callScope",
                    Builder.class,
                    new Closure(
                            env,
                            runtimeConverterFunctionClassConstants,
                            "Illuminate\\Database\\Eloquent",
                            this) {
                        @Override
                        @ConvertedMethod
                        @ConvertedParameter(
                            index = 0,
                            name = "builder",
                            typeHint = "Illuminate\\Database\\Eloquent\\Builder"
                        )
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            Object _closureThisVar = this.getClosureThisVar();
                            ReferenceContainer builder =
                                    new BasicReferenceContainer(assignParameter(args, 0, false));
                            Object scope = null;
                            scope = this.contextReferences.getCapturedValue("scope");
                            if (ZVal.isTrue(
                                    ZVal.checkInstanceType(scope, Closure.class, "Closure"))) {
                                env.callFunctionDynamic(
                                        scope,
                                        new RuntimeArgsWithReferences().add(0, builder),
                                        builder.getObject());
                            }

                            if (ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            scope,
                                            Scope.class,
                                            "Illuminate\\Database\\Eloquent\\Scope"))) {
                                env.callMethod(
                                        scope,
                                        "apply",
                                        Builder.class,
                                        builder.getObject(),
                                        Builder.this.getModel(env));
                            }

                            return null;
                        }
                    }.use("scope", scope));
        }

        return ZVal.assign(builder);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "scope", typeHint = "callable")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object callScope(RuntimeEnv env, Object... args) {
        Object scope = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        Object result = null;
        Object query = null;
        Object originalWhereCount = null;
        Object ternaryExpressionTemp = null;
        function_array_unshift.f.env(env).call(parameters, this);
        query = this.getQuery(env);
        originalWhereCount =
                ZVal.assign(
                        function_is_null
                                        .f
                                        .env(env)
                                        .call(
                                                toObjectR(query)
                                                        .accessProp(this, env)
                                                        .name("wheres")
                                                        .value())
                                        .getBool()
                                ? 0
                                : function_count
                                        .f
                                        .env(env)
                                        .call(
                                                toObjectR(query)
                                                        .accessProp(this, env)
                                                        .name("wheres")
                                                        .value())
                                        .value());
        result =
                ZVal.assign(
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                env.callFunctionDynamic(
                                                                scope,
                                                                new RuntimeArgsWithReferences(),
                                                                PackedVaradicArgs.unpack(
                                                                        new PackedVaradicArgs(
                                                                                function_array_values
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                parameters)
                                                                                        .value())))
                                                        .value())
                                ? ternaryExpressionTemp
                                : this);
        if (ZVal.isGreaterThan(
                function_count
                        .f
                        .env(env)
                        .call(
                                rToArrayCast(
                                        toObjectR(query)
                                                .accessProp(this, env)
                                                .name("wheres")
                                                .value()))
                        .value(),
                '>',
                originalWhereCount)) {
            this.addNewWheresWithinGroup(env, query, originalWhereCount);
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "originalWhereCount")
    protected Object addNewWheresWithinGroup(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object originalWhereCount = assignParameter(args, 1, false);
        Object allWheres = null;
        allWheres = ZVal.assign(toObjectR(query).accessProp(this, env).name("wheres").value());
        toObjectR(query).accessProp(this, env).name("wheres").set(ZVal.newArray());
        this.groupWhereSliceForScope(
                env,
                query,
                function_array_slice.f.env(env).call(allWheres, 0, originalWhereCount).value());
        this.groupWhereSliceForScope(
                env,
                query,
                function_array_slice.f.env(env).call(allWheres, originalWhereCount).value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "whereSlice")
    protected Object groupWhereSliceForScope(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object whereSlice = assignParameter(args, 1, false);
        Object whereBooleans = null;
        whereBooleans =
                env.callMethod(
                        collect.f.env(env).call(whereSlice).value(),
                        "pluck",
                        Builder.class,
                        "boolean");
        if (ZVal.isTrue(
                env.callMethod(
                        whereBooleans,
                        new RuntimeArgsWithReferences(),
                        "contains",
                        Builder.class,
                        "or"))) {
            new ReferenceClassProperty(query, "wheres", env)
                    .arrayAppend(env)
                    .set(
                            this.createNestedWhere(
                                    env,
                                    whereSlice,
                                    env.callMethod(whereBooleans, "first", Builder.class)));

        } else {
            toObjectR(query)
                    .accessProp(this, env)
                    .name("wheres")
                    .set(
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(
                                            toObjectR(query)
                                                    .accessProp(this, env)
                                                    .name("wheres")
                                                    .value(),
                                            whereSlice)
                                    .value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "whereSlice")
    @ConvertedParameter(index = 1, name = "boolean")
    protected Object createNestedWhere(RuntimeEnv env, Object... args) {
        Object whereSlice = assignParameter(args, 0, false);
        Object _pBoolean = assignParameter(args, 1, true);
        if (null == _pBoolean) {
            _pBoolean = "and";
        }
        Object whereGroup = null;
        whereGroup = env.callMethod(this.getQuery(env), "forNestedWhere", Builder.class);
        toObjectR(whereGroup).accessProp(this, env).name("wheres").set(whereSlice);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("type", "Nested"),
                        new ZPair("query", whereGroup),
                        new ZPair("boolean", _pBoolean)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relations")
    public Object with(RuntimeEnv env, Object... args) {
        Object relations = assignParameter(args, 0, false);
        Object eagerLoad = null;
        eagerLoad =
                this.parseWithRelations(
                        env,
                        function_is_string.f.env(env).call(relations).getBool()
                                ? function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value()
                                : relations);
        this.eagerLoad = function_array_merge.f.env(env).call(this.eagerLoad, eagerLoad).value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relations")
    public Object without(RuntimeEnv env, Object... args) {
        Object relations = assignParameter(args, 0, false);
        this.eagerLoad =
                function_array_diff_key
                        .f
                        .env(env)
                        .call(
                                this.eagerLoad,
                                function_array_flip
                                        .f
                                        .env(env)
                                        .call(
                                                function_is_string
                                                                .f
                                                                .env(env)
                                                                .call(relations)
                                                                .getBool()
                                                        ? function_func_get_args
                                                                .f
                                                                .env(env)
                                                                .addReferenceArgs(
                                                                        new RuntimeArgsWithInfo(
                                                                                args, this))
                                                                .call()
                                                                .value()
                                                        : relations)
                                        .value())
                        .value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "attributes",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object newModelInstance(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.model, "newInstance", Builder.class, attributes),
                        "setConnection",
                        Builder.class,
                        env.callMethod(
                                env.callMethod(this.query, "getConnection", Builder.class),
                                "getName",
                                Builder.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relations", typeHint = "array")
    protected Object parseWithRelations(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Builder.php");
        Object relations = assignParameter(args, 0, false);
        Object name = null;
        ReferenceContainer results = new BasicReferenceContainer(null);
        Object constraints = null;
        Object runtimeTempArrayResult22 = null;
        results.setObject(ZVal.newArray());
        for (ZPair zpairResult263 : ZVal.getIterable(relations, env, false)) {
            name = ZVal.assign(zpairResult263.getKey());
            constraints = ZVal.assign(zpairResult263.getValue());
            if (function_is_numeric.f.env(env).call(name).getBool()) {
                name = ZVal.assign(constraints);
                ZVal.list(
                        runtimeTempArrayResult22 =
                                ZVal.isTrue(Str.runtimeStaticObject.contains(env, name, ":"))
                                        ? this.createSelectWithConstraint(env, name)
                                        : ZVal.newArray(
                                                new ZPair(0, name),
                                                new ZPair(
                                                        1,
                                                        new Closure(
                                                                env,
                                                                runtimeConverterFunctionClassConstants,
                                                                "Illuminate\\Database\\Eloquent",
                                                                this) {
                                                            @Override
                                                            @ConvertedMethod
                                                            public Object run(
                                                                    RuntimeEnv env,
                                                                    Object thisvar,
                                                                    PassByReferenceArgs
                                                                            runtimePassByReferenceArgs,
                                                                    Object... args) {
                                                                return null;
                                                            }
                                                        })),
                        (name = listGet(runtimeTempArrayResult22, 0, env)),
                        (constraints = listGet(runtimeTempArrayResult22, 1, env)));
            }

            results.setObject(this.addNestedWiths(env, name, results.getObject()));
            results.arrayAccess(env, name).set(constraints);
        }

        return ZVal.assign(results.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object createSelectWithConstraint(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Builder.php");
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                handleReturnReference(
                                                function_explode.f.env(env).call(":", name).value())
                                        .arrayGet(env, 0)),
                        new ZPair(
                                1,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Eloquent",
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
                                        Object name = null;
                                        name = this.contextReferences.getCapturedValue("name");
                                        env.callMethod(
                                                query,
                                                "select",
                                                Builder.class,
                                                function_explode
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                ",",
                                                                handleReturnReference(
                                                                                function_explode
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                ":",
                                                                                                name)
                                                                                        .value())
                                                                        .arrayGet(env, 1))
                                                        .value());
                                        return null;
                                    }
                                }.use("name", name))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "results")
    protected Object addNestedWiths(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Builder.php");
        Object name = assignParameter(args, 0, false);
        ReferenceContainer results = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object last = null;
        Object segment = null;
        ReferenceContainer progress = new BasicReferenceContainer(null);
        progress.setObject(ZVal.newArray());
        for (ZPair zpairResult264 :
                ZVal.getIterable(function_explode.f.env(env).call(".", name).value(), env, true)) {
            segment = ZVal.assign(zpairResult264.getValue());
            progress.arrayAppend(env).set(segment);
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    results,
                    env,
                    last =
                            NamespaceGlobal.implode
                                    .env(env)
                                    .call(".", progress.getObject())
                                    .value())) {
                results.arrayAccess(env, last)
                        .set(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Eloquent",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        return null;
                                    }
                                });
            }
        }

        return ZVal.assign(results.getObject());
    }

    @ConvertedMethod
    public Object getQuery(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.query);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    public Object setQuery(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        this.query = query;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object toBase(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.applyScopes(env), "getQuery", Builder.class));
    }

    @ConvertedMethod
    public Object getEagerLoads(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.eagerLoad);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "eagerLoad", typeHint = "array")
    public Object setEagerLoads(RuntimeEnv env, Object... args) {
        Object eagerLoad = assignParameter(args, 0, false);
        this.eagerLoad = eagerLoad;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getModel(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.model);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "model",
        typeHint = "Illuminate\\Database\\Eloquent\\Model"
    )
    public Object setModel(RuntimeEnv env, Object... args) {
        Object model = assignParameter(args, 0, false);
        this.model = model;
        env.callMethod(
                this.query,
                "from",
                Builder.class,
                env.callMethod(model, "getTable", Builder.class));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object qualifyColumn(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.model, "qualifyColumn", Builder.class, column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getMacro(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(Arr.runtimeStaticObject.get(env, this.localMacros, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        Object scope = null;
        if (ZVal.strictEqualityCheck(method, "===", "macro")) {
            new ReferenceClassProperty(this, "localMacros", env)
                    .arrayAccess(env, parameters.arrayGet(env, 0))
                    .set(parameters.arrayGet(env, 1));
            return null;
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "localMacros", env),
                env,
                method)) {
            function_array_unshift.f.env(env).call(parameters.getObject(), this);
            return ZVal.assign(
                    env.callFunctionDynamic(
                                    new ReferenceClassProperty(this, "localMacros", env)
                                            .arrayGet(env, method),
                                    new RuntimeArgsWithReferences(),
                                    PackedVaradicArgs.unpack(
                                            new PackedVaradicArgs(parameters.getObject())))
                            .value());
        }

        if (arrayActionR(
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
                                .Eloquent
                                .classes
                                .Builder
                                .RequestStaticProperties
                                .class,
                        "macros"),
                env,
                method)) {
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
                                                    .Eloquent
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
                                        env.callMethod(
                                                env.getRequestStaticPropertiesReference(
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
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "macros")
                                                        .arrayGet(env, method),
                                                "bindTo",
                                                Builder.class,
                                                this,
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class")),
                                        parameters.getObject())
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
                                                            .Eloquent
                                                            .classes
                                                            .Builder
                                                            .RequestStaticProperties
                                                            .class,
                                                    "macros")
                                            .arrayGet(env, method),
                                    parameters.getObject())
                            .value());
        }

        if (function_method_exists
                .f
                .env(env)
                .call(
                        this.model,
                        scope =
                                "scope"
                                        + toStringR(
                                                NamespaceGlobal.ucfirst
                                                        .env(env)
                                                        .call(method)
                                                        .value(),
                                                env))
                .getBool()) {
            return ZVal.assign(
                    this.callScope(
                            env,
                            ZVal.newArray(new ZPair(0, this.model), new ZPair(1, scope)),
                            parameters.getObject()));
        }

        if (function_in_array.f.env(env).call(method, this.passthru).getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            this.toBase(env),
                            new RuntimeArgsWithReferences(),
                            toStringR(method, env),
                            Builder.class,
                            PackedVaradicArgs.unpack(
                                    new PackedVaradicArgs(parameters.getObject()))));
        }

        env.callMethod(
                this.query,
                new RuntimeArgsWithReferences(),
                toStringR(method, env),
                Builder.class,
                PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters.getObject())));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        this.query = ((RuntimeClassInterface) this.query).phpClone(env);
        return null;
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
                            env.callMethod(this, "forPage", Builder.class, page.getObject(), count),
                            "get",
                            Builder.class));
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
                                for (ZPair zpairResult2282 :
                                        ZVal.getIterable(results, env, false)) {
                                    key.setObject(ZVal.assign(zpairResult2282.getKey()));
                                    value.setObject(ZVal.assign(zpairResult2282.getValue()));
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
                        env.callMethod(
                                env.callMethod(this, "take", Builder.class, 1),
                                "get",
                                Builder.class,
                                columns),
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
        Scope83 scope = new Scope83();
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
        Scope84 scope = new Scope84();
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

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relation")
    @ConvertedParameter(index = 1, name = "operator")
    @ConvertedParameter(index = 2, name = "count", defaultValue = "1", defaultValueType = "number")
    @ConvertedParameter(index = 3, name = "boolean")
    @ConvertedParameter(
        index = 4,
        name = "callback",
        typeHint = "Closure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object has(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object relation = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, true);
        if (null == operator) {
            operator = ">=";
        }
        Object count = assignParameter(args, 2, true);
        if (null == count) {
            count = 1;
        }
        Object _pBoolean = assignParameter(args, 3, true);
        if (null == _pBoolean) {
            _pBoolean = "and";
        }
        Object callback = assignParameter(args, 4, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object method = null;
        Object hasQuery = null;
        if (ZVal.strictNotEqualityCheck(
                function_strpos.f.env(env).call(relation, ".").value(), "!==", false)) {
            return ZVal.assign(this.hasNested(env, relation, operator, count, _pBoolean, callback));
        }

        relation = this.getRelationWithoutConstraints(env, relation);
        method =
                ZVal.assign(
                        ZVal.isTrue(this.canUseExistsForExistenceCheck(env, operator, count))
                                ? "getRelationExistenceQuery"
                                : "getRelationExistenceCountQuery");
        hasQuery =
                env.callMethod(
                        relation,
                        rLastRefArgs =
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                handleReturnReference(
                                                        env.callMethod(
                                                                env.callMethod(
                                                                        relation,
                                                                        "getRelated",
                                                                        Builder.class),
                                                                "newQuery",
                                                                Builder.class)))
                                        .add(1, new ReadOnlyReferenceContainer(this)),
                        toStringR(method, env),
                        Builder.class,
                        rLastRefArgs.get(0),
                        this);
        if (ZVal.isTrue(callback)) {
            env.callMethod(hasQuery, "callScope", Builder.class, callback);
        }

        return ZVal.assign(this.addHasWhere(env, hasQuery, relation, operator, count, _pBoolean));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relations")
    @ConvertedParameter(index = 1, name = "operator")
    @ConvertedParameter(index = 2, name = "count", defaultValue = "1", defaultValueType = "number")
    @ConvertedParameter(index = 3, name = "boolean")
    @ConvertedParameter(
        index = 4,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object hasNested(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Concerns/QueriesRelationships.php");
        ReferenceContainer relations = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object operator = assignParameter(args, 1, true);
        if (null == operator) {
            operator = ">=";
        }
        Object count = assignParameter(args, 2, true);
        if (null == count) {
            count = 1;
        }
        Object _pBoolean = assignParameter(args, 3, true);
        if (null == _pBoolean) {
            _pBoolean = "and";
        }
        Object callback = assignParameter(args, 4, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        ReferenceContainer closure = new BasicReferenceContainer(null);
        relations.setObject(function_explode.f.env(env).call(".", relations.getObject()).value());
        closure.setObject(
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Database\\Eloquent\\Concerns",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "q")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object q = assignParameter(args, 0, false);
                        Object count = null;
                        Object callback = null;
                        ReferenceContainer relations = new BasicReferenceContainer(null);
                        ReferenceContainer closure = new BasicReferenceContainer(null);
                        Object operator = null;
                        count = this.contextReferences.getCapturedValue("count");
                        callback = this.contextReferences.getCapturedValue("callback");
                        relations = this.contextReferences.getReferenceContainer("relations");
                        closure = this.contextReferences.getReferenceContainer("closure");
                        operator = this.contextReferences.getCapturedValue("operator");
                        ZVal.ternaryExpression(
                                ZVal.isGreaterThan(
                                                function_count
                                                        .f
                                                        .env(env)
                                                        .call(relations.getObject())
                                                        .value(),
                                                '>',
                                                1)
                                        ? env.callMethod(
                                                q,
                                                "whereHas",
                                                Builder.class,
                                                function_array_shift
                                                        .f
                                                        .env(env)
                                                        .call(relations.getObject())
                                                        .value(),
                                                closure.getObject())
                                        : env.callMethod(
                                                q,
                                                "has",
                                                Builder.class,
                                                function_array_shift
                                                        .f
                                                        .env(env)
                                                        .call(relations.getObject())
                                                        .value(),
                                                operator,
                                                count,
                                                "and",
                                                callback));
                        return null;
                    }
                }.useRef("relations", relations)
                        .useRef("closure", closure)
                        .use("count", count)
                        .use("callback", callback)
                        .use("operator", operator));
        return ZVal.assign(
                this.has(
                        env,
                        function_array_shift.f.env(env).call(relations.getObject()).value(),
                        ">=",
                        1,
                        _pBoolean,
                        closure.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relation")
    @ConvertedParameter(index = 1, name = "operator")
    @ConvertedParameter(index = 2, name = "count", defaultValue = "1", defaultValueType = "number")
    public Object orHas(RuntimeEnv env, Object... args) {
        Object relation = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, true);
        if (null == operator) {
            operator = ">=";
        }
        Object count = assignParameter(args, 2, true);
        if (null == count) {
            count = 1;
        }
        return ZVal.assign(this.has(env, relation, operator, count, "or"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relation")
    @ConvertedParameter(index = 1, name = "boolean")
    @ConvertedParameter(
        index = 2,
        name = "callback",
        typeHint = "Closure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object doesntHave(RuntimeEnv env, Object... args) {
        Object relation = assignParameter(args, 0, false);
        Object _pBoolean = assignParameter(args, 1, true);
        if (null == _pBoolean) {
            _pBoolean = "and";
        }
        Object callback = assignParameter(args, 2, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        return ZVal.assign(this.has(env, relation, "<", 1, _pBoolean, callback));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relation")
    public Object orDoesntHave(RuntimeEnv env, Object... args) {
        Object relation = assignParameter(args, 0, false);
        return ZVal.assign(this.doesntHave(env, relation, "or"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relation")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        typeHint = "Closure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "operator")
    @ConvertedParameter(index = 3, name = "count", defaultValue = "1", defaultValueType = "number")
    public Object whereHas(RuntimeEnv env, Object... args) {
        Object relation = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object operator = assignParameter(args, 2, true);
        if (null == operator) {
            operator = ">=";
        }
        Object count = assignParameter(args, 3, true);
        if (null == count) {
            count = 1;
        }
        return ZVal.assign(this.has(env, relation, operator, count, "and", callback));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relation")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        typeHint = "Closure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "operator")
    @ConvertedParameter(index = 3, name = "count", defaultValue = "1", defaultValueType = "number")
    public Object orWhereHas(RuntimeEnv env, Object... args) {
        Object relation = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object operator = assignParameter(args, 2, true);
        if (null == operator) {
            operator = ">=";
        }
        Object count = assignParameter(args, 3, true);
        if (null == count) {
            count = 1;
        }
        return ZVal.assign(this.has(env, relation, operator, count, "or", callback));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relation")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        typeHint = "Closure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object whereDoesntHave(RuntimeEnv env, Object... args) {
        Object relation = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        return ZVal.assign(this.doesntHave(env, relation, "and", callback));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relation")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        typeHint = "Closure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object orWhereDoesntHave(RuntimeEnv env, Object... args) {
        Object relation = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        return ZVal.assign(this.doesntHave(env, relation, "or", callback));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relations")
    public Object withCount(RuntimeEnv env, Object... args) {
        Object relations = assignParameter(args, 0, false);
        Object runtimeTempArrayResult228 = null;
        Object query = null;
        Object name = null;
        Object column = null;
        Object alias = null;
        Object ternaryExpressionTemp = null;
        Object constraints = null;
        ReferenceContainer segments = new BasicReferenceContainer(null);
        Object relation = null;
        if (ZVal.isEmpty(relations)) {
            return ZVal.assign(this);
        }

        if (function_is_null
                .f
                .env(env)
                .call(toObjectR(this.query).accessProp(this, env).name("columns").value())
                .getBool()) {
            env.callMethod(
                    this.query,
                    "select",
                    Builder.class,
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    toStringR(
                                                    toObjectR(this.query)
                                                            .accessProp(this, env)
                                                            .name("from")
                                                            .value(),
                                                    env)
                                            + ".*")));
        }

        relations =
                ZVal.assign(
                        function_is_array.f.env(env).call(relations).getBool()
                                ? relations
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value());
        for (ZPair zpairResult2283 :
                ZVal.getIterable(this.parseWithRelations(env, relations), env, false)) {
            name = ZVal.assign(zpairResult2283.getKey());
            constraints = ZVal.assign(zpairResult2283.getValue());
            segments.setObject(function_explode.f.env(env).call(" ", name).value());
            alias = null;
            if (ZVal.toBool(
                            ZVal.equalityCheck(
                                    function_count.f.env(env).call(segments.getObject()).value(),
                                    3))
                    && ZVal.toBool(
                            ZVal.equalityCheck(
                                    Str.runtimeStaticObject.lower(env, segments.arrayGet(env, 1)),
                                    "as"))) {
                ZVal.list(
                        runtimeTempArrayResult228 =
                                ZVal.newArray(
                                        new ZPair(0, segments.arrayGet(env, 0)),
                                        new ZPair(1, segments.arrayGet(env, 2))),
                        (name = listGet(runtimeTempArrayResult228, 0, env)),
                        (alias = listGet(runtimeTempArrayResult228, 1, env)));
            }

            relation = this.getRelationWithoutConstraints(env, name);
            query =
                    env.callMethod(
                            relation,
                            "getRelationExistenceCountQuery",
                            Builder.class,
                            env.callMethod(
                                    env.callMethod(relation, "getRelated", Builder.class),
                                    "newQuery",
                                    Builder.class),
                            this);
            env.callMethod(query, "callScope", Builder.class, constraints);
            query =
                    env.callMethod(
                            env.callMethod(
                                    query,
                                    "mergeConstraintsFrom",
                                    Builder.class,
                                    env.callMethod(relation, "getQuery", Builder.class)),
                            "toBase",
                            Builder.class);
            if (ZVal.isGreaterThan(
                    function_count
                            .f
                            .env(env)
                            .call(toObjectR(query).accessProp(this, env).name("columns").value())
                            .value(),
                    '>',
                    1)) {
                toObjectR(query)
                        .accessProp(this, env)
                        .name("columns")
                        .set(
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                new ReferenceClassProperty(query, "columns", env)
                                                        .arrayGet(env, 0))));
            }

            column =
                    ZVal.assign(
                            ZVal.isDefined(ternaryExpressionTemp = alias)
                                    ? ternaryExpressionTemp
                                    : Str.runtimeStaticObject.snake(
                                            env, toStringR(name, env) + "_count"));
            env.callMethod(this, "selectSub", Builder.class, query, column);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "hasQuery",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    @ConvertedParameter(
        index = 1,
        name = "relation",
        typeHint = "Illuminate\\Database\\Eloquent\\Relations\\Relation"
    )
    @ConvertedParameter(index = 2, name = "operator")
    @ConvertedParameter(index = 3, name = "count")
    @ConvertedParameter(index = 4, name = "boolean")
    protected Object addHasWhere(RuntimeEnv env, Object... args) {
        Object hasQuery = assignParameter(args, 0, false);
        Object relation = assignParameter(args, 1, false);
        Object operator = assignParameter(args, 2, false);
        Object count = assignParameter(args, 3, false);
        Object _pBoolean = assignParameter(args, 4, false);
        env.callMethod(
                hasQuery,
                "mergeConstraintsFrom",
                Builder.class,
                env.callMethod(relation, "getQuery", Builder.class));
        return ZVal.assign(
                ZVal.isTrue(this.canUseExistsForExistenceCheck(env, operator, count))
                        ? env.callMethod(
                                this,
                                "addWhereExistsQuery",
                                Builder.class,
                                env.callMethod(hasQuery, "toBase", Builder.class),
                                _pBoolean,
                                ZVal.toBool(ZVal.strictEqualityCheck(operator, "===", "<"))
                                        && ZVal.toBool(ZVal.strictEqualityCheck(count, "===", 1)))
                        : this.addWhereCountQuery(
                                env,
                                env.callMethod(hasQuery, "toBase", Builder.class),
                                operator,
                                count,
                                _pBoolean));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "from",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    public Object mergeConstraintsFrom(RuntimeEnv env, Object... args) {
        Object from = assignParameter(args, 0, false);
        Object whereBindings = null;
        Object ternaryExpressionTemp = null;
        whereBindings =
                ZVal.assign(
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                handleReturnReference(
                                                                env.callMethod(
                                                                        env.callMethod(
                                                                                from,
                                                                                "getQuery",
                                                                                Builder.class),
                                                                        "getRawBindings",
                                                                        Builder.class))
                                                        .arrayGet(env, "where"))
                                ? ternaryExpressionTemp
                                : ZVal.newArray());
        return ZVal.assign(
                env.callMethod(
                        this.withoutGlobalScopes(
                                env, env.callMethod(from, "removedScopes", Builder.class)),
                        "mergeWheres",
                        Builder.class,
                        toObjectR(env.callMethod(from, "getQuery", Builder.class))
                                .accessProp(this, env)
                                .name("wheres")
                                .value(),
                        whereBindings));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "operator")
    @ConvertedParameter(index = 2, name = "count", defaultValue = "1", defaultValueType = "number")
    @ConvertedParameter(index = 3, name = "boolean")
    protected Object addWhereCountQuery(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, true);
        if (null == operator) {
            operator = ">=";
        }
        Object count = assignParameter(args, 2, true);
        if (null == count) {
            count = 1;
        }
        Object _pBoolean = assignParameter(args, 3, true);
        if (null == _pBoolean) {
            _pBoolean = "and";
        }
        env.callMethod(
                this.query,
                "addBinding",
                Builder.class,
                env.callMethod(query, "getBindings", Builder.class),
                "where");
        return ZVal.assign(
                this.where(
                        env,
                        new Expression(
                                env,
                                "("
                                        + toStringR(
                                                env.callMethod(query, "toSql", Builder.class), env)
                                        + ")"),
                        operator,
                        function_is_numeric.f.env(env).call(count).getBool()
                                ? new Expression(env, count)
                                : count,
                        _pBoolean));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relation")
    protected Object getRelationWithoutConstraints(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Concerns/QueriesRelationships.php");
        Object relation = assignParameter(args, 0, false);
        return ZVal.assign(
                Relation.runtimeStaticObject.noConstraints(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database\\Eloquent\\Concerns",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object relation = null;
                                relation = this.contextReferences.getCapturedValue("relation");
                                return ZVal.assign(
                                        env.callMethod(
                                                Builder.this.getModel(env),
                                                toStringR(relation, env),
                                                Builder.class));
                            }
                        }.use("relation", relation)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "operator")
    @ConvertedParameter(index = 1, name = "count")
    protected Object canUseExistsForExistenceCheck(RuntimeEnv env, Object... args) {
        Object operator = assignParameter(args, 0, false);
        Object count = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(ZVal.strictEqualityCheck(operator, "===", ">="))
                                        || ZVal.toBool(
                                                ZVal.strictEqualityCheck(operator, "===", "<")))
                        && ZVal.toBool(ZVal.strictEqualityCheck(count, "===", 1)));
    }

    public static final Object CONST_class = "Illuminate\\Database\\Eloquent\\Builder";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method")
        @ConvertedParameter(index = 1, name = "parameters")
        public Object __callStatic(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            ReferenceContainer parameters =
                    new BasicReferenceContainer(assignParameter(args, 1, false));
            if (ZVal.strictEqualityCheck(method, "===", "macro")) {
                env.getRequestStaticPropertiesReference(
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
                                        .RequestStaticProperties
                                        .class,
                                "macros")
                        .arrayAccess(env, parameters.arrayGet(env, 0))
                        .set(parameters.arrayGet(env, 1));
                return null;
            }

            if (!arrayActionR(
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
                                    .Eloquent
                                    .classes
                                    .Builder
                                    .RequestStaticProperties
                                    .class,
                            "macros"),
                    env,
                    method)) {
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
                                                    .Eloquent
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
                                                                        .Eloquent
                                                                        .classes
                                                                        .Builder
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "macros")
                                                        .arrayGet(env, method),
                                                ZVal.getNull(),
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class")),
                                        parameters.getObject())
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
                                                            .Eloquent
                                                            .classes
                                                            .Builder
                                                            .RequestStaticProperties
                                                            .class,
                                                    "macros")
                                            .arrayGet(env, method),
                                    parameters.getObject())
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object macros = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Eloquent\\Builder")
                    .setLookup(
                            Builder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "eagerLoad",
                            "localMacros",
                            "model",
                            "onDelete",
                            "passthru",
                            "query",
                            "removedScopes",
                            "scopes")
                    .setStaticPropertyNames("macros")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Eloquent/Builder.php")
                    .addTrait("Illuminate\\Database\\Concerns\\BuildsQueries")
                    .addTrait("Illuminate\\Database\\Eloquent\\Concerns\\QueriesRelationships")
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

    private static class Scope83 implements UpdateRuntimeScopeInterface {

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

    private static class Scope84 implements UpdateRuntimeScopeInterface {

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
}
